package xtextgenerator.wizard

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import relatedSchemas.AllOf
import org.eclipse.emf.ecore.EClass
import relatedSchemas.EnclosingSchema
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.ENamedElement
import java.util.List

class ValidatorGenerator {
	
	def static void create(String fileName, String classPackage, String className, String modelPackage, String oclPath, List<EnclosingSchema> enclosingSchemas, boolean isMainRootElementClass) throws IOException {
		
		val BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    writer.write(generate ( classPackage,  className,  modelPackage,  oclPath,  enclosingSchemas,  isMainRootElementClass));
	    writer.close();
	    
	}
	
	def private static String  generate (String classPackage, String className, String modelPackage, String oclPath, List<EnclosingSchema> enclosingSchemas, boolean isMainRootElementClass){
		'''
			package «classPackage»;
			
			import org.eclipse.emf.common.util.URI;
			import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
			import org.eclipse.xtext.validation.EValidatorRegistrar;
			import org.eclipse.xtext.validation.Check;
			import org.eclipse.xtext.validation.CheckMode;
			import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
			import org.eclipse.emf.ecore.resource.ResourceSet;
			import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
			import org.eclipse.emf.ecore.resource.Resource;
			import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
			import java.io.ByteArrayInputStream;
			import java.io.IOException;
			import java.io.InputStream;
			import java.util.List;
			import org.eclipse.xtext.resource.XtextResource;
			import org.eclipse.xtext.validation.IResourceValidator;
			import org.eclipse.xtext.validation.Issue;
			import org.eclipse.xtext.util.CancelIndicator;
			
			public class «className» extends Abstract«className» {
			«IF isMainRootElementClass»				
			
				«generateOclRegister(modelPackage, oclPath)»
			«ENDIF»	
			«IF enclosingSchemas!==null»
				«FOR enclosingSchema : enclosingSchemas»
					«IF  enclosingSchema.allOf!==null»
					
						«generateAllOfValidation(enclosingSchema.enclosingSchema,enclosingSchema.allOf)»
					«ENDIF»	
				«ENDFOR»
			«ENDIF»
			}
		'''
	}
	
	def private static generateOclRegister(String modelPackage, String oclPath){
		'''		
			public void register(EValidatorRegistrar registrar) {
				super.register(registrar); 
				«modelPackage» ePackage = «modelPackage».eINSTANCE;
				URI basicOclURI = URI.createPlatformPluginURI("«oclPath»", true);
				registrar.register(ePackage, new CompleteOCLEObjectValidator(ePackage, basicOclURI));
			}
		'''
	}
	
	def private static generateAllOfValidation(EClass enclosingClass, AllOf allOf){
		val String enclosingClassType = (enclosingClass.eContainer as ENamedElement).name+"."+enclosingClass.name
		'''
			@Check
			public void allOfValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
				InputStream in = new ByteArrayInputStream(enclosingEClassText.getBytes());
				ResourceSet reset = new ResourceSetImpl();
				«FOR EClass allOfEClass :allOf.allOfs»
					Resource resource«allOf.allOfs.indexOf(allOfEClass)» = reset.createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(allOfEClass)»"));
					try {
						resource«allOf.allOfs.indexOf(allOfEClass)».load(in, reset.getLoadOptions());
					} catch (IOException e) {
						e.printStackTrace();
					}
					for (Diagnostic diagnostic : resource«allOf.allOfs.indexOf(allOfEClass)».getErrors()) {
						error(diagnostic.getMessage(), null);
					}
					if(resource«allOf.allOfs.indexOf(allOfEClass)».getErrors().isEmpty()) {
						XtextResource xtextResource = (XtextResource)resource«allOf.allOfs.indexOf(allOfEClass)»;
						IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
						List<Issue> issues = resourceValidator.validate(resource«allOf.allOfs.indexOf(allOfEClass)», CheckMode.ALL, CancelIndicator.NullImpl);
						for(Issue issue :issues) {
							error(issue.getMessage(), null);
						}
					}
				«ENDFOR»
			}
		'''
	}
	
	
	
}
