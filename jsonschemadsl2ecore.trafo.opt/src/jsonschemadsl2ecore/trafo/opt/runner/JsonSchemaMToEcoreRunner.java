package jsonschemadsl2ecore.trafo.opt.runner;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import jsonschemadsl2ecore.trafo.opt.Activator;
import jsonschemadsl2ecore.trafo.opt.utils.JsonSchemaToEcoreUtils;

public class JsonSchemaMToEcoreRunner implements IApplication{

//	public final static String JSON_SCHEMA_MODEL_NAME = "shipyardV4";
//	public final static String JSON_SCHEMA_MODEL_NAME = "testRef";
//	public final static String JSON_SCHEMA_MODEL_NAME = "shipyard2";
//	public final static String JSON_SCHEMA_MODEL_NAME = "shipyardLike";
//	public final static String JSON_SCHEMA_MODEL_NAME = "shipyard";
//	public final static String JSON_SCHEMA_MODEL_NAME = "test64";
	public final static String JSON_SCHEMA_MODEL_NAME = "testcurrentimplementation";
	public final static String JSONSCHEMA_MODEL_EXTENSION = "jschema";
	public final static String JSONSCHEMA_MODEL = "input/" + JSON_SCHEMA_MODEL_NAME + "." + JSONSCHEMA_MODEL_EXTENSION;
	public final static String OUTPUT_MODEL = "output";
	public final static String ECORE_MODEL = JSON_SCHEMA_MODEL_NAME + ".ecore";
	public final static String JSON_GRAMMAR_MODEL = JSON_SCHEMA_MODEL_NAME + "-grammar.jsongrammar";
	public final static String RELATED_SCHEMAS_MODEL = JSON_SCHEMA_MODEL_NAME + ".relatedSchemas";
	public final static String TRACE_MODEL = JSON_SCHEMA_MODEL_NAME + "-trace-model.xmi";
	
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		JsonSchemaToEcoreUtils.performTrafoEMFTVMJsonSchemaToEcore(
				getModelFile(JSONSCHEMA_MODEL),
				getOutputModelFile(ECORE_MODEL), 
				getOutputModelFile(JSON_GRAMMAR_MODEL), 
				getOutputModelFile(RELATED_SCHEMAS_MODEL),
				TRACE_MODEL);		
		return null;
	}
	
	public String getModelFile(String resourceUri) {
		try {
			URL urlFile = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource(resourceUri));
			return urlFile.toString();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public String getOutputModelFile(String resoureURI) {
		try {
			URL featureFile = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource(OUTPUT_MODEL));
			return featureFile.toString() + resoureURI;			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public String getTraceModelFile(String resoureURI) {
		try {
			URL featureFile = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource(OUTPUT_MODEL));
			return featureFile.toString() + resoureURI;			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	@Override
	public void stop() {
		// Do nothing		
	}

}
