package at.jku.bise.oclgenerator;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
 

public class OclWriter {
	
	private  final static String OCL_EXTENSION = "-opt.ocl";
//	private  final static String OCL_EXTENSION = "Ale.ocl";
	
//	public static void create(String fileName) throws IOException {
	public static void create(URI uri) throws IOException {
		
		String fileName = buildFileName(uri);
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+OCL_EXTENSION));
	    writer.write("-- OCL contraints for "+fileName);
	    writer.newLine();
	    writer.close();
	    
	}
	
//	public static void append(String fileName, CharSequence csq) throws IOException {
	public static void append(URI uri, CharSequence csq) throws IOException {	
		String fileName = buildFileName(uri);
		FileWriter fw = new FileWriter(fileName+OCL_EXTENSION, true);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.append(csq);
		writer.newLine();
	    writer.close();
	}
	
	private static String buildFileName (URI uri) {
		String fileName = "";
		if (uri.isFile()){
			fileName= uri.path();
		}else if (uri.isPlatform()) {
			fileName= ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getLocationURI().getPath();
		}else if(uri.isPlatformPlugin()) {
			//TODO manage this case
		}else if (uri.isPlatformResource()) {
			//TODO manage this case
		}
		return fileName;
		
	}
	
	

}
