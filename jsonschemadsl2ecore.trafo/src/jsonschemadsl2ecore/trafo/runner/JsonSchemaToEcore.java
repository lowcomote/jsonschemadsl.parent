package jsonschemadsl2ecore.trafo.runner;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import jsonschemadsl2ecore.trafo.Activator;
import jsonschemadsl2ecore.trafo.files.JsonSchema2Ecore;

public class JsonSchemaToEcore implements IApplication {
	
	public final static String JSON_SCHEMA_MODEL = "input/simple.jschema";
	public final static String ECORE_MM = "output/simple.jschema.ecore";

	public Object start(IApplicationContext context) throws Exception {
		JsonSchema2Ecore transformToEcore = new JsonSchema2Ecore();
	
		
		
		transformToEcore.loadModels(getModelFile(JSON_SCHEMA_MODEL));
		transformToEcore.doJsonSchema2Ecore(new NullProgressMonitor());
		transformToEcore.saveModels(getModelFile(ECORE_MM));		
		return null;
	}

	public void stop() {
		// Do nothing
	}
	
	public String getModelFile(String resourceUri) {
		try {
			URL featureFile = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource(resourceUri));
			return featureFile.toString();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}
}
