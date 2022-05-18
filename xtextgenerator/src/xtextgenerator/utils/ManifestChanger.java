package xtextgenerator.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;
/**
 * https://www.eclipse.org/forums/index.php/t/109193/
 * @author aless
 *
 */
public class ManifestChanger {
	
	public static final String REQUIRE_BUNDLE_HEADER = "Require-Bundle";
	
	private Manifest manifest;
	private String fileName;
	
	public ManifestChanger(String fileName) throws IOException {
		super();
		this.fileName= fileName;
		loadManifest(fileName);
	}
	
	
	private void loadManifest(String fileName) throws IOException {
		InputStream in = new FileInputStream(fileName);
		this.manifest=new Manifest(in);
		in.close();
	}
	
	public void writeManifest() throws IOException {
		FileOutputStream out = new FileOutputStream(this.fileName);
		this.manifest.write(out);
		out.close();
	}
	
	public void addPluginDependency(String plugin) throws BundleException{
		
		assert (plugin != null);
		if(plugin == null)
			return;

		Attributes mainAttrs = this.manifest.getMainAttributes();
		String requireBundleString = mainAttrs.getValue(REQUIRE_BUNDLE_HEADER);
		String newRequireBundleString = requireBundleString+","+plugin;
		this.manifest.getMainAttributes().putValue(REQUIRE_BUNDLE_HEADER, newRequireBundleString);
		
		
	}
	
	public void addPluginDependency(String plugin, String version, boolean reexport, boolean overwrite) throws BundleException{
		String requireBundleHeader = "Require-Bundle";
		String bundleVersionAttr = "bundle-version";
		String rexportDirective = "visibility";

		assert (plugin != null);
		if(plugin == null)
			return;
		if(version == null){
			version = "1.0.0";
		}

		boolean foundHeader = false;
		boolean hasValuesForPlugin = false;
		StringBuilder strBuilder = new StringBuilder();

		Attributes mainAttrs = this.manifest.getMainAttributes();
		for (Object entryName : mainAttrs.keySet()){
			String values;
			String header;
			
			//Get the values safely
			if(entryName instanceof String) {
				header = (String) entryName;
				values = mainAttrs.getValue(header);
			}else if(entryName instanceof Attributes.Name){
				header = (String) ((Attributes.Name) entryName).toString();
				values = mainAttrs.getValue((Attributes.Name) entryName);
			}else {
				throw new BundleException("Unknown Main Attribute Key type: " + entryName.getClass() + " (" + entryName + ")");
			}

			//loop to the next header if we don't find ours
			if(!requireBundleHeader.equals(header))
				continue;

			//found it
			foundHeader = true;

			//process the components of the value for this element see ManifestElement javadocs for spec
			if(values != null){
				ManifestElement[] elements = ManifestElement.parseHeader(header, values);
				for (int i = 0; i < elements.length; i++) {
					ManifestElement manifestElement = elements[i];
					Enumeration<?> keys = manifestElement.getKeys();
					Enumeration<?> directiveKeys = manifestElement.getDirectiveKeys();
					StringBuilder valueComponents = new StringBuilder();
					boolean lastElement = i >= elements.length-1;
					boolean firstElement = i == 0;
					boolean elementIsRequiredPlugin = false;

					for (int j = 0; j < manifestElement.getValueComponents().length; j++) {
						String pureValue = manifestElement.getValueComponents()[j];
						if(plugin.equalsIgnoreCase(pureValue)) { 
							hasValuesForPlugin = true;
							elementIsRequiredPlugin = true;
							//if its already in the header element components and we are not overwriting quit now
							if(!overwrite)
								return;
						}
						//ALWAYS WRITE THE LAST ; -> if we don't have any keys or directives now - we will have
						//if this is not the required element we will just write the line in one go using manifestElement.getValue()
						valueComponents.append(pureValue + ";");
					}

					if(!elementIsRequiredPlugin) {
						//we haven't got a component THIS TIME which is equal to the component we are looking to change
						//so just write out the whole of this component without editing it, and carry on looking
						strBuilder.append((firstElement?"":" ") + manifestElement.getValue() + (lastElement ? "" : ",\n"));
						continue;
					} else {
						//write out the value components found so far - we may wish to edit bits of it
						strBuilder.append((firstElement?"":" ") + valueComponents);
					}
					boolean foundVersionAttr = false;
					if(keys != null) {
						while (keys.hasMoreElements()){
							String key = (String) keys.nextElement();
							String value = manifestElement.getAttribute(key);
							if(bundleVersionAttr.equalsIgnoreCase(key)){
								//always write the last ; if we are editing the values - we will be writing the export directive
								strBuilder.append(key + "=\"" + version + "\";");
								foundVersionAttr = true;
							}else{
								//always write the last ; if we are editing the values - we will be writing the export directive
								strBuilder.append(key + "=\"" + value + "\";");
							}
						}
					}
					if(!foundVersionAttr){
						//always write the last ; if we are editing the values - we will be writing the export directive
						strBuilder.append(bundleVersionAttr + "=" + version + ";");
					}
					boolean foundDirective = false;
					if(directiveKeys != null){
						while (directiveKeys.hasMoreElements()) {
							String key = (String) directiveKeys.nextElement();
							boolean lastDirective = !directiveKeys.hasMoreElements();
							if(rexportDirective.equalsIgnoreCase(key)) {
								foundDirective = true;
								strBuilder.append(key + ":=");
								String dirValues[] = manifestElement.getDirectives(key);
								for (int j = 0; j < dirValues.length; j++){
									String string = dirValues[j];
									boolean lastDirectiveValue = j >= dirValues.length-1;
									if("reexport".equalsIgnoreCase(string) && !reexport){
										string = "private";
									} else if("private".equalsIgnoreCase(string) && reexport){
										string = "reexport";
									}
									strBuilder.append(string + (lastDirectiveValue?"":","));
								}
							} else {
								strBuilder.append(key + ":=" + manifestElement.getDirective(key));
							}
							if(!lastDirective){
								strBuilder.append(";");
							}
						}
					}
					if(!foundDirective){
						strBuilder.append(rexportDirective + ":=" + (reexport?"rexport":"private"));
					}
					if(!lastElement) {
						strBuilder.append(",\n");
					}
				}
			}
			break;
		}
		if(!foundHeader){
			//Add a new one
			this.manifest.getMainAttributes().putValue(requireBundleHeader, plugin + ";"
				+ bundleVersionAttr + "=" + version + ";" + rexportDirective + ":=" +
				(reexport?"rexport":"private"));
		} else if(overwrite){
			//found it and wish to edit it...
			if(hasValuesForPlugin){
				//we have already edited the values for the plugin we wish to add
				this.manifest.getMainAttributes().putValue(requireBundleHeader, strBuilder.toString());
			} else {
				//There are no values for the plugin we wish to add.
				//...create a fresh entry
				String existingValues = strBuilder.toString();
				boolean areExistingValues = existingValues.trim().length() != 0;
				String newValue = plugin + ";" + bundleVersionAttr + "=" + version +
						";" + rexportDirective + ":=" + (reexport?"rexport":"private");
				newValue = (areExistingValues)?(existingValues+",\n"+newValue):newValue;
				this.manifest.getMainAttributes().putValue(requireBundleHeader, newValue);
			}
		}
	}

}
