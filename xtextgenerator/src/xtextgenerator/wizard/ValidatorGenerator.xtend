package xtextgenerator.wizard

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException
import java.util.Set
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.EClass
import relatedSchemas.AllOf
import relatedSchemas.AnyOf
import relatedSchemas.Const
import relatedSchemas.Dependency
import relatedSchemas.EnclosingSchema
import relatedSchemas.Enum
import relatedSchemas.IfThenElse
import relatedSchemas.Not
import relatedSchemas.OneOf
import java.util.List
import xtextgenerator.ui.utils.Ecore2XtextJSONExtensions
import java.util.HashSet
import java.util.Map.Entry
import java.util.Map
import java.util.HashMap
import jku.se.atl.transformation.utils.Utils
import org.eclipse.emf.ecore.EPackage

class ValidatorGenerator {
	
//	def static void create(String fileName, String classPackage, String className, String modelPackage, String oclPath, List<EnclosingSchema> enclosingSchemas, boolean isMainRootElementClass, IFile relatedSchemasFile) throws IOException {
	def static void create(EClass rootElementEclass, String fileName, String classPackage, String className, String modelPackage, String oclPath, Set<EnclosingSchema> enclosingSchemas, boolean isMainRootElementClass, IFile relatedSchemasFile, String grammarAccessFQN, String fileExtension) throws IOException {		
		
		val BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    writer.write(generate ( rootElementEclass, classPackage,  className,  modelPackage,  oclPath,  enclosingSchemas,  isMainRootElementClass, relatedSchemasFile, grammarAccessFQN, fileExtension ));
	    writer.close();
	    
	}
	
//	def private static String  generate (String classPackage, String className, String modelPackage, String oclPath, List<EnclosingSchema> enclosingSchemas, boolean isMainRootElementClass, IFile relatedSchemasFile){
	def private static String  generate (EClass rootElementEclass, String classPackage, String className, String modelPackage, String oclPath, Set<EnclosingSchema> enclosingSchemas, boolean isMainRootElementClass, IFile relatedSchemasFile, String grammarAccessFQN, String fileExtension){
		val Set<EClass> patternPropertiesEClasses = findClosurePatternProperties( rootElementEclass)
		val Map<EClass,Set<EClass>> propertiesMatchingPatternPropertiesMap = findPropertiesMatchingPatternProperties( rootElementEclass)
		var  String grammarExtension=fileExtension
		if(!isMainRootElementClass){
			grammarExtension=RuntimeProjectDescriptorJSON.getExtension(rootElementEclass)
		}
		
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
			import java.util.ArrayList;
			import org.eclipse.xtext.resource.XtextResource;
			import org.eclipse.xtext.validation.IResourceValidator;
			import org.eclipse.xtext.validation.Issue;
			import org.eclipse.xtext.util.CancelIndicator;

			import relatedSchemas.RelatedSchemas;
			import relatedSchemas.EnclosingSchema;
			import jsonMM.JsonDocument;
			import org.eclipse.emf.converter.util.ConverterUtil;
			
			import jku.se.atl.transformation.utils.Utils;
			import org.eclipse.xtext.resource.XtextResource;
			import org.eclipse.xtext.resource.XtextResourceSet;
			import org.eclipse.xtext.ParserRule;
			import java.lang.reflect.Method;
			import com.google.inject.Inject;
			import org.eclipse.emf.ecore.EClass;
			import org.eclipse.xtext.nodemodel.ICompositeNode;
			
			import org.eclipse.emf.ecore.EObject;
			
			public class «className» extends Abstract«className» {
				
				@Inject «grammarAccessFQN» grammarAccess;	
				
				private List<EObject> processedPatternProperties = new ArrayList<EObject>();
			«IF isMainRootElementClass»				
			
				«generateOclRegister(modelPackage, oclPath)»
			«ENDIF»	
			«IF enclosingSchemas!==null»
				«FOR enclosingSchema : enclosingSchemas»
					«IF  enclosingSchema.allOf!==null»
					
						«generateAllOfValidation(enclosingSchema.enclosingSchema,enclosingSchema.allOf)»
					«ENDIF»	
					«IF  enclosingSchema.anyOf!==null»
					
						«generateAnyOfValidation(enclosingSchema.enclosingSchema,enclosingSchema.anyOf)»
					«ENDIF»	
					«IF  enclosingSchema.oneOf!==null»
					
						«generateOneOfValidation(enclosingSchema.enclosingSchema,enclosingSchema.oneOf)»
					«ENDIF»	
					«IF  enclosingSchema.not!==null»
					
						«generateNotValidation(enclosingSchema.enclosingSchema,enclosingSchema.not)»
					«ENDIF»
					«IF  enclosingSchema.ifThenElse!==null»
					
						«generateIfThenElseValidation(enclosingSchema.enclosingSchema,enclosingSchema.ifThenElse)»
					«ENDIF»
					«IF  enclosingSchema.dependencies!==null»
						«FOR dependency :enclosingSchema.dependencies.dependencies»
						
							«generateDependenciesValidation(enclosingSchema.enclosingSchema, dependency)»
						«ENDFOR»
					«ENDIF»
					«IF enclosingSchema.constEnum!==null»
						«IF enclosingSchema.constEnum.enum!==null»
						
							«generateEnumValidation(enclosingSchema.enclosingSchema, enclosingSchema.constEnum.enum, relatedSchemasFile)»
						«ENDIF»
						«IF enclosingSchema.constEnum.const!==null»
						
							«generateConstValidation(enclosingSchema.enclosingSchema, enclosingSchema.constEnum.const, relatedSchemasFile)»
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			«ENDIF»
			«FOR patternProperties: patternPropertiesEClasses»
			
				«generatePatternPropertiesValidation( rootElementEclass,  patternProperties,  modelPackage,  isMainRootElementClass, grammarAccessFQN,  fileExtension)»
			«ENDFOR»
			«FOR propertyMatchingPatternProperties: propertiesMatchingPatternPropertiesMap.entrySet»
			
				«generatePropertiesValidation( rootElementEclass,  propertyMatchingPatternProperties,  modelPackage,  isMainRootElementClass, grammarAccessFQN,  grammarExtension)»
			«ENDFOR»
			
				«generateIndependentValidator(grammarAccessFQN, grammarExtension)»
			
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
//		val String enclosingClassType = (enclosingClass.eContainer as ENamedElement).name+"."+enclosingClass.name
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void allOfValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
				«FOR EClass allOfEClass :allOf.allOfs»
					InputStream in«allOf.allOfs.indexOf(allOfEClass)» = new ByteArrayInputStream(enclosingEClassText.getBytes());
					ResourceSet reset«allOf.allOfs.indexOf(allOfEClass)» = new ResourceSetImpl();
					Resource resource«allOf.allOfs.indexOf(allOfEClass)» = reset«allOf.allOfs.indexOf(allOfEClass)».createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(allOfEClass)»"));
					try {
						resource«allOf.allOfs.indexOf(allOfEClass)».load(in«allOf.allOfs.indexOf(allOfEClass)», reset«allOf.allOfs.indexOf(allOfEClass)».getLoadOptions());
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
	
	def private static generateAnyOfValidation(EClass enclosingClass, AnyOf anyOf){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void anyOfValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
				boolean validSchemaFound = false;
				«FOR EClass anyOfEClass :anyOf.anyOfs»
					if(!validSchemaFound){
						InputStream in«anyOf.anyOfs.indexOf(anyOfEClass)» = new ByteArrayInputStream(enclosingEClassText.getBytes());
						ResourceSet reset«anyOf.anyOfs.indexOf(anyOfEClass)» = new ResourceSetImpl();
						Resource resource«anyOf.anyOfs.indexOf(anyOfEClass)» = reset«anyOf.anyOfs.indexOf(anyOfEClass)».createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(anyOfEClass)»"));
						try {
							resource«anyOf.anyOfs.indexOf(anyOfEClass)».load(in«anyOf.anyOfs.indexOf(anyOfEClass)», reset«anyOf.anyOfs.indexOf(anyOfEClass)».getLoadOptions());
						} catch (IOException e) {
							e.printStackTrace();
						}
						if(resource«anyOf.anyOfs.indexOf(anyOfEClass)».getErrors().isEmpty()) {
							XtextResource xtextResource = (XtextResource)resource«anyOf.anyOfs.indexOf(anyOfEClass)»;
							IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
							List<Issue> issues = resourceValidator.validate(resource«anyOf.anyOfs.indexOf(anyOfEClass)», CheckMode.ALL, CancelIndicator.NullImpl);
							if(issues.isEmpty()){
								validSchemaFound=true;
							}	
							
						}
					}
				«ENDFOR»
				if(!validSchemaFound){
					error("No valid schema found in the AnyOf «enclosingClass.name»", null);
				}	
			}
		'''
	}
	
	def private static generateOneOfValidation(EClass enclosingClass, OneOf oneOf){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void oneOfValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
				int validSchemasCount = 0;
				«FOR EClass oneOfEClass :oneOf.oneOfs»
					InputStream in«oneOf.oneOfs.indexOf(oneOfEClass)» = new ByteArrayInputStream(enclosingEClassText.getBytes());
					ResourceSet reset«oneOf.oneOfs.indexOf(oneOfEClass)» = new ResourceSetImpl();
					Resource resource«oneOf.oneOfs.indexOf(oneOfEClass)» = reset«oneOf.oneOfs.indexOf(oneOfEClass)».createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(oneOfEClass)»"));
					try {
						resource«oneOf.oneOfs.indexOf(oneOfEClass)».load(in«oneOf.oneOfs.indexOf(oneOfEClass)», reset«oneOf.oneOfs.indexOf(oneOfEClass)».getLoadOptions());
					} catch (IOException e) {
						e.printStackTrace();
					}
					if(resource«oneOf.oneOfs.indexOf(oneOfEClass)».getErrors().isEmpty()) {
						XtextResource xtextResource = (XtextResource)resource«oneOf.oneOfs.indexOf(oneOfEClass)»;
						IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
						List<Issue> issues = resourceValidator.validate(resource«oneOf.oneOfs.indexOf(oneOfEClass)», CheckMode.ALL, CancelIndicator.NullImpl);
						if(issues.isEmpty()){
							validSchemasCount++;
						}	
						
					}
				«ENDFOR»
				if(validSchemasCount==0){
					error("No valid schema found in the OneOf «enclosingClass.name»", null);
				}else if(validSchemasCount>1){
					error("Found "+validSchemasCount+" valid schemas in the OneOf «enclosingClass.name»", null);
				}	
			}
		'''
	}
	
	def private static generateNotValidation(EClass enclosingClass, Not not){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void notValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
				InputStream in = new ByteArrayInputStream(enclosingEClassText.getBytes());
				ResourceSet reset = new ResourceSetImpl();
				Resource resource = reset.createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(not.not)»"));
				boolean isValid=false;
				try {
					resource.load(in, reset.getLoadOptions());
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(resource.getErrors().isEmpty()) {
					XtextResource xtextResource = (XtextResource)resource;
					IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
					List<Issue> issues = resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
					if(issues.isEmpty()){
						isValid=true;
					}	
					
				}
				 
				if(isValid){
					error("The Not «enclosingClass.name» schema must not be valid", null);
				}	
			}
		'''
	}
	
	def private static generateIfThenElseValidation(EClass enclosingClass, IfThenElse ifThenElse){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void ifThenElseValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				«IF ifThenElse.^if !==null»
					String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
					InputStream inIf = new ByteArrayInputStream(enclosingEClassText.getBytes());
					ResourceSet resetIf = new ResourceSetImpl();
					Resource resourceIf = resetIf.createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(ifThenElse.^if)»"));
					boolean isIfSchemaValid = false;
					try {
						resourceIf.load(inIf, resetIf.getLoadOptions());
					} catch (IOException e) {
						e.printStackTrace();
					}
					if(resourceIf.getErrors().isEmpty()) {
						XtextResource xtextResource = (XtextResource)resourceIf;
						IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
						List<Issue> issues = resourceValidator.validate(resourceIf, CheckMode.ALL, CancelIndicator.NullImpl);
						if(issues.isEmpty()){
							isIfSchemaValid=true;
						}	
						
					}
					if(isIfSchemaValid){
						«IF ifThenElse.then!==null»
							boolean isThenValid = false;
							InputStream inThen = new ByteArrayInputStream(enclosingEClassText.getBytes());
							ResourceSet resetThen = new ResourceSetImpl();
							Resource resourceThen = resetThen.createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(ifThenElse.then)»"));
							try {
								resourceThen.load(inThen, resetThen.getLoadOptions());
							} catch (IOException e) {
								e.printStackTrace();
							}
							if(resourceThen.getErrors().isEmpty()) {
								XtextResource xtextResource = (XtextResource)resourceThen;
								IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
								List<Issue> issues = resourceValidator.validate(resourceThen, CheckMode.ALL, CancelIndicator.NullImpl);
								if(issues.isEmpty()){
									isThenValid=true;
								}	
								
							}
							if(!isThenValid){
								error("The IF «enclosingClass.name» Schema is valid but the THEN «enclosingClass.name» is not valid", null);
							}
						«ENDIF»
					}else{
						«IF ifThenElse.^else!==null»
							boolean isElseValid = false;
							InputStream inElse = new ByteArrayInputStream(enclosingEClassText.getBytes());
							ResourceSet resetElse = new ResourceSetImpl();
							Resource resourceElse = resetElse.createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(ifThenElse.^else)»"));
							try {
								resourceElse.load(inElse, resetElse.getLoadOptions());
							} catch (IOException e) {
								e.printStackTrace();
							}
							if(resourceElse.getErrors().isEmpty()) {
								XtextResource xtextResource = (XtextResource)resourceElse;
								IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
								List<Issue> issues = resourceValidator.validate(resourceElse, CheckMode.ALL, CancelIndicator.NullImpl);
								if(issues.isEmpty()){
									isElseValid=true;
								}	
								
							}
							if(!isElseValid){
								error("The IF «enclosingClass.name» Schema is not valid and the ELSE «enclosingClass.name» either", null);
							}
						«ENDIF»
					}
				«ENDIF»
			}
		'''
	}
	
	
	def private static generateDependenciesValidation(EClass enclosingClass, Dependency dependency){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void dependenciesValidation«enclosingClass.name»«dependency.property»(«enclosingClassType» enclosingEClass){
				if(enclosingEClass.get("«dependency.property»")!=null){
					String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
					InputStream in = new ByteArrayInputStream(enclosingEClassText.getBytes());
					ResourceSet reset = new ResourceSetImpl();
					Resource resource = reset.createResource(URI.createURI("platform:/dummy.«RuntimeProjectDescriptorJSON.getExtension(dependency.dependency)»"));
					try {
						resource.load(in, reset.getLoadOptions());
					} catch (IOException e) {
						e.printStackTrace();
					}
					for (Diagnostic diagnostic : resource.getErrors()) {
						error(diagnostic.getMessage(), null);
					}				
					if(resource.getErrors().isEmpty()) {
						XtextResource xtextResource = (XtextResource)resource;
						IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
						List<Issue> issues = resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
						for(Issue issue :issues) {
							error(issue.getMessage(), null);
						}
					}
				}	
			}
		'''
	}
	
	def private static generateEnumValidation(EClass enclosingClass, Enum enumer,  IFile relatedSchemasFile){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void enumValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				ResourceSet reset  = ConverterUtil.createResourceSet();
				Resource resource = reset.getResource(URI.createPlatformResourceURI("«relatedSchemasFile.getFullPath().toString()»", true), true);
				
				if (! (resource.getContents().get(0) instanceof RelatedSchemas)) {
					throw new IllegalArgumentException("Expecting RelatedSchema type of object");
					
				}  
				RelatedSchemas relatedSchemas = (RelatedSchemas )resource.getContents().get(0);
				EnclosingSchema enclosingSchema = relatedSchemas.getEnclosingschemas().stream().filter(es -> es.getEnclosingSchema().getName().equals("«enclosingClass.name»")).findFirst().get();
				List<JsonDocument> enumJsonDocuments=enclosingSchema.getConstEnum().getEnum().getEnum();
				JsonDocument enumJson = enclosingEClass.get«Character.toUpperCase(enumer.propertyName.charAt(0))»«enumer.propertyName.substring(1)»();
				
				if (enumJsonDocuments.stream().filter(json ->json.semanticEquals(enumJson)).findAny().orElse(null) == null){	
					error("Element "+enumJson.toString()+" not included in the enumeration", null);
				}
			}
		'''
	}
	
	def private static generateConstValidation(EClass enclosingClass, Const const,  IFile relatedSchemasFile){
		val String enclosingClassType = (enclosingClass.EPackage).name+"."+enclosingClass.name
		'''
			@Check
			public void constValidation«enclosingClass.name»(«enclosingClassType» enclosingEClass){
				ResourceSet reset  = ConverterUtil.createResourceSet();
				Resource resource = reset.getResource(URI.createPlatformResourceURI("«relatedSchemasFile.getFullPath().toString()»", true), true);
				
				if (! (resource.getContents().get(0) instanceof RelatedSchemas)) {
					throw new IllegalArgumentException("Expecting RelatedSchema type of object");
					
				}  
				RelatedSchemas relatedSchemas = (RelatedSchemas )resource.getContents().get(0);
				EnclosingSchema enclosingSchema = relatedSchemas.getEnclosingschemas().stream().filter(es -> es.getEnclosingSchema().getName().equals("«enclosingClass.name»")).findFirst().get();
				JsonDocument constJsonDocument=enclosingSchema.getConstEnum().getConst().getConst();
				JsonDocument inputJsonDocument = enclosingEClass.get«Character.toUpperCase(const.propertyName.charAt(0))»«const.propertyName.substring(1)»();
				
				if(!constJsonDocument.semanticEquals(inputJsonDocument) ){
					error("Element "+inputJsonDocument.toString()+" is not "+constJsonDocument.toString(), null);
				}
			}
		'''
	}
	
	def private static generatePatternPropertiesValidation(EClass rootElementEclass, EClass patternProperties, String modelPackage, boolean isMainRootElementClass,  String grammarAccessFQN, String fileExtension){
		val String patternPropertiesType = (patternProperties.EPackage).name+"."+patternProperties.name
		var  String grammarExtension=fileExtension
		if(!isMainRootElementClass){
			grammarExtension=RuntimeProjectDescriptorJSON.getExtension(rootElementEclass)
		}
		
		'''
			@Check
			public void validate«patternProperties.name»(«patternPropertiesType» patternProperties){
				if(this.processedPatternProperties.contains(patternProperties)) return;
				«modelPackage» ePackage = «modelPackage».eINSTANCE;
				EClass underValidationEClass = (EClass) ePackage.getEClassifier("«patternProperties.name»");
				List<EClass> matchingSiblings = Utils.findMatchingPatternPropertiesSiblings(underValidationEClass, patternProperties.getKey(), ePackage);
				
				if(!matchingSiblings.isEmpty()){
					ICompositeNode patternPropertiesINode =NodeModelUtils.getNode(patternProperties);
					String patternPropertiesText = NodeModelUtils.getTokenText(patternPropertiesINode);
					InputStream inputStream = new ByteArrayInputStream(patternPropertiesText.getBytes());
					
					for(EClass matchingPatternProperties : matchingSiblings){
						
						try {
							Method getRule = «grammarAccessFQN».class.getDeclaredMethod("get"+matchingPatternProperties.getName()+"Rule");
							ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
							List<Issue> issues = new ArrayList<Issue>();
							List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
							Thread validationThread = new Thread(new Runnable() {
								@Override
							    public void run() {
							    	try {
										URI uri=URI.createURI("platform:/dummy.«grammarExtension»");
										XtextResourceSet reset = new XtextResourceSet();
										XtextResource xtextResource = (XtextResource) reset.createResource(uri);
										xtextResource.setEntryPoint(parserRule);
										xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
										diagnostics.addAll(xtextResource.getErrors());
										if(xtextResource.getErrors().isEmpty()) {
											processedPatternProperties.add(xtextResource.getContents().get(0));
											IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
											issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
										}
									} catch (IOException e) {
										e.printStackTrace();
									}	
								}
							}); 		
							validationThread.start();
							validationThread.join();
							for (Diagnostic diagnostic : diagnostics) {
								error(diagnostic.getMessage(), null);
							}
							for(Issue issue :issues) {
								error(issue.getMessage(), null);
							}
						}catch (Exception e) {
							e.printStackTrace();
						} 
						
					}
				}	
			}
		'''
	}

	
	
	
	
	def private static generatePropertiesValidation(EClass rootElementEclass, Entry<EClass, Set<EClass>> propertyMatchingPatternProperties, String modelPackage, boolean isMainRootElementClass,  String grammarAccessFQN, String grammarExtension){
		
		
		val EClass properties = propertyMatchingPatternProperties.key
		val String propertiesType = (properties.EPackage).name+"."+properties.name
//		var  String grammarExtension=fileExtension
//		if(!isMainRootElementClass){
//			grammarExtension=RuntimeProjectDescriptorJSON.getExtension(rootElementEclass)
//		}
		val Set<EClass> matchingSiblings = propertyMatchingPatternProperties.value
		
		'''
			@Check
			public void validate«properties.name»(«propertiesType» properties){
«««				«modelPackage» ePackage = «modelPackage».eINSTANCE;
«««				EClass underValidationEClass =  properties.eClass();
«««				String keyword = underValidationEClass.getEStructuralFeatures().stream().filter(sf->sf.getEAnnotation("Keyword")!=null).findFirst().get().getEAnnotation("Keyword").getDetails().get("Keyword");
«««				List<EClass> matchingSiblings = Utils.findMatchingPatternPropertiesSiblings(underValidationEClass, keyword, ePackage);
				
«««				if(!matchingSiblings.isEmpty()){
				ICompositeNode propertiesINode =NodeModelUtils.getNode(properties);
				String propertiesText = NodeModelUtils.getTokenText(propertiesINode);
				InputStream inputStream = new ByteArrayInputStream(propertiesText.getBytes());
				
				«FOR matchingPatternProperties: matchingSiblings»
				independentValidation("«matchingPatternProperties.name»", processedPatternProperties, inputStream);
				«ENDFOR»
«««				for(EClass matchingPatternProperties : matchingSiblings){
«««					try {
«««						Method getRule = «grammarAccessFQN».class.getDeclaredMethod("get"+matchingPatternProperties.getName()+"Rule");
«««						ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
«««						List<Issue> issues = new ArrayList<Issue>();
«««						List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
«««						Thread validationThread = new Thread(new Runnable() {
«««							@Override
«««						    public void run() {
«««						    	try {
«««									URI uri=URI.createURI("platform:/dummy.«grammarExtension»");
«««									XtextResourceSet reset = new XtextResourceSet();
«««									XtextResource xtextResource = (XtextResource) reset.createResource(uri);
«««									xtextResource.setEntryPoint(parserRule);
«««									xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
«««									diagnostics.addAll(xtextResource.getErrors());
«««									if(xtextResource.getErrors().isEmpty()) {
«««										/**we add the processed pattern properties on purspose. No need to propagate the validation 
«««										 * because all the matches are going to be processed in this loop
«««										 */
«««										processedPatternProperties.add(xtextResource.getContents().get(0));
«««										IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
«««										issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
«««									}
«««								} catch (IOException e) {
«««									e.printStackTrace();
«««								}	
«««							}
«««						}); 		
«««						validationThread.start();
«««						validationThread.join();
«««						for (Diagnostic diagnostic : diagnostics) {
«««							error(diagnostic.getMessage(), null);
«««						}
«««						for(Issue issue :issues) {
«««							error(issue.getMessage(), null);
«««						}
«««					}catch (Exception e) {
«««						e.printStackTrace();
«««					} 
«««					
«««				}
«««				}	
			}
		'''
	}
	
	def private static generateIndependentValidator(String grammarAccessFQN, String grammarExtension){
		
		'''
			private void independentValidation(String eClassName, List<EObject> processedListName, InputStream inputStream){
				try {
					Method getRule = «grammarAccessFQN».class.getDeclaredMethod("get"+eClassName+"Rule");
					ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
					List<Issue> issues = new ArrayList<Issue>();
					List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
					Thread validationThread = new Thread(new Runnable() {
						@Override
					    public void run() {
					    	try {
								URI uri=URI.createURI("platform:/dummy.«grammarExtension»");
								XtextResourceSet reset = new XtextResourceSet();
								XtextResource xtextResource = (XtextResource) reset.createResource(uri);
								xtextResource.setEntryPoint(parserRule);
								xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
								diagnostics.addAll(xtextResource.getErrors());
								if(xtextResource.getErrors().isEmpty()) {
									/**we add the processed pattern properties on purspose. No need to propagate the validation 
									 * because all the matches are going to be processed in this loop
									 */
									if(processedListName!=null){
										processedListName.add(xtextResource.getContents().get(0));
									}	
									IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
									issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
								}
							} catch (IOException e) {
								e.printStackTrace();
							}	
						}
					}); 		
					validationThread.start();
					validationThread.join();
					for (Diagnostic diagnostic : diagnostics) {
						error(diagnostic.getMessage(), null);
					}
					for(Issue issue :issues) {
						error(issue.getMessage(), null);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		'''
	}
	
	
	

	def private static Map<EClass,Set<EClass>> findPropertiesMatchingPatternProperties(EClass rootElementEclass){
		val Set<EClass> processedEClasses =new HashSet<EClass>();
		val Set<EClass> closure = findClosure(rootElementEclass,   processedEClasses)
		/** 
		 * select aClasses that have a structural feature that has annnotation Keyword
		 */
		val Set<EClass> properties = closure.filter[c|c.EStructuralFeatures.exists[sf|sf.EAnnotations.exists[a|a.source==='Keyword']]].toSet	
		var Map<EClass,Set<EClass>> propertiesMatchingPatternProperties = new HashMap<EClass,Set<EClass>>()
		for(property:properties){
			//String keyword = underValidationEClass.getEStructuralFeatures().stream().filter(sf->sf.getEAnnotation("Keyword")!=null).findFirst().get().getEAnnotation("Keyword").getDetails().get("Keyword");
			val keyword = property.EStructuralFeatures.findFirst[sf|sf.getEAnnotation("Keyword")!==null].getEAnnotation("Keyword").details.get("Keyword")
			val List<EClass> matchingPatternPropertiesSiblings =Utils.findMatchingPatternPropertiesSiblings(property, keyword, property.eContainer() as EPackage)
			if(!matchingPatternPropertiesSiblings.isEmpty){
				propertiesMatchingPatternProperties.put(property, new HashSet<EClass>(matchingPatternPropertiesSiblings))
			}
		}
		
		propertiesMatchingPatternProperties
	}
	
	def private static Set<EClass> findClosurePatternProperties(EClass rootElementEclass){
		val Set<EClass> processedEClasses =new HashSet<EClass>();
		val Set<EClass> closure = findClosure(rootElementEclass,   processedEClasses)
		val Set<EClass> patternProperties = closure.filter[c|c.EAnnotations.exists[a|a.source==='PatternProperties']].toSet
		patternProperties
	}
	
	def private static Set<EClass> findClosure(EClass containingEClass, Set<EClass> processedEClasses){
		if(!processedEClasses.contains(containingEClass)){
			processedEClasses.add(containingEClass);
			val Set<EClass> containedEClasses = containingEClass.EReferences.filter[r|r.containment].map[EType as EClass].toSet
			val Set<EClass> containedSubClasses = new HashSet<EClass>();
			for (EClass containedEClass : containedEClasses){
				containedSubClasses.addAll(Ecore2XtextJSONExtensions.subClasses(containedEClass).toList)
			}
			containedEClasses.addAll(containedSubClasses);
			var Set<EClass> closure = new HashSet<EClass>();
			for (EClass containedEClass : containedEClasses){
				closure.addAll(findClosure(containedEClass, processedEClasses))
			}
			containedEClasses.addAll(closure)
			containedEClasses.add(containingEClass)
			return containedEClasses
			
		}else{
			return new HashSet<EClass>();
		}
	}
	
	
}
