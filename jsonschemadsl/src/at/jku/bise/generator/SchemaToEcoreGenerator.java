package at.jku.bise.generator;

import java.io.IOException;


import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;

import jsonschemadsl2ecore.trafo.files.JsonSchema2Ecore;

public class SchemaToEcoreGenerator {
	
	private String inputModel;
	private String outputModel;
	
	public SchemaToEcoreGenerator(String inputModel, String outputModel) {
		super();
		this.inputModel = inputModel;
		this.outputModel = outputModel;
	}

	public void generateJsonSchema() {
		try {
			JsonSchema2Ecore jSchemaTrafo = new JsonSchema2Ecore();
			jSchemaTrafo.loadModels(inputModel);
			jSchemaTrafo.doJsonSchema2Ecore(new NullProgressMonitor());
			jSchemaTrafo.saveModels(outputModel);
		}  catch (IOException | ATLCoreException e1) {
			e1.printStackTrace();
		}
		
	}

}