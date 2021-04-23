package jku.se.atl.transformation.utils;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

public class ATLExecutorEMFTVM {
	
	private ExecEnv env;
	private ResourceSet reset;
	private EList<Resource> listOfResources;
	
	private TimingData td;
	
	public static enum ModelKind {
		IN, OUT, INOUT, TRACE
	}
	
	public static String TRACE_NAME = "trace";
	
	public ATLExecutorEMFTVM() {
		this(new TimingData());
	}

	public ATLExecutorEMFTVM(TimingData td) {
		this.td = td;
		this.env = EmftvmFactory.eINSTANCE.createExecEnv();
		this.reset = new ResourceSetImpl();
		this.listOfResources = new BasicEList<Resource>();
	}
	
	public Metamodel loadMetaModels(String metaModelName, String uri) {
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(this.reset.getResource(URI.createURI(uri), true));
		env.registerMetaModel(metaModelName, metaModel);
		return metaModel;
	}
	
	public Model loadModels(String modelName, String uri, ModelKind modelKind) {
		Model model = EmftvmFactory.eINSTANCE.createModel();
		registerModels(modelName, model, modelKind, uri);
		if (modelKind == ModelKind.INOUT ||  modelKind == ModelKind.OUT || modelKind == ModelKind.TRACE)
			this.listOfResources.add(model.getResource());
		return model;
	}
	
	public Model loadTraceModel(String uri) {
		return this.loadModels(TRACE_NAME, uri, ModelKind.TRACE);
	}
	
	private void registerModels(String modelName, Model model, ModelKind modelKind, String uri) {
		switch (modelKind) {
		case IN:	
			model.setResource(this.reset.getResource(URI.createURI(uri), true));
			env.registerInputModel(modelName, model);
			break;
		case OUT:
			model.setResource(this.reset.createResource(URI.createURI(uri)));
			env.registerOutputModel(modelName, model);
			break;
		case TRACE:
			model.setResource(this.reset.createResource(URI.createURI(uri)));
			env.registerInOutModel(modelName, model);
			break;
		case INOUT:
			//Test if the resource exist
			if(reset.getURIConverter().exists(URI.createURI(uri), Collections.EMPTY_MAP) == true) 
				model.setResource(this.reset.getResource(URI.createURI(uri), true));
			else
				model.setResource(this.reset.createResource(URI.createURI(uri)));
			env.registerInOutModel(modelName, model);
			break;
		default:
			throw new IllegalArgumentException("It not supported this type of Model Kind: " + modelKind);
		}
	}
	
	public void runModule(String moduleUri, String moduleName) {
		ModuleResolver mr = new DefaultModuleResolver(moduleUri, new ResourceSetImpl());
		this.env.loadModule(mr, moduleName);
		run(mr);
	}
	
	private void run(ModuleResolver mr) {
		env.run(td);
		td.finish();
		saveModels();		
	}

	private void saveModels() {
		for (Resource resource : this.listOfResources) {
			try {
				resource.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	public ResourceSet getResourceSet() {
		return this.reset;
	}
	
}
