package xtextgenerator.wizard

import org.eclipse.xtext.xtext.wizard.RuntimeProjectDescriptor
import org.eclipse.xtext.xtext.wizard.WizardConfiguration
import org.eclipse.emf.ecore.EClass
import jsongrammarmm.jsongrammar.JsonGrammar
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import jsongrammarmm.jsongrammar.DetailedGrammar
import relatedSchemas.RelatedSchemas
import relatedSchemas.EnclosingSchema
import org.eclipse.xtext.xtext.wizard.Outlet
import org.eclipse.xtext.xtext.wizard.PlainTextFile
import org.eclipse.xtext.xtext.wizard.SourceLayout
import org.eclipse.xtext.util.JUnitVersion
import org.eclipse.xtext.util.Strings
import java.util.ArrayList
import java.util.List
import java.util.HashMap
import java.util.Map
import java.util.ArrayDeque
import xtextgenerator.ui.utils.Ecore2XtextJSONExtensions

class RuntimeProjectDescriptorJSON extends RuntimeProjectDescriptor{
	
//	final Ecore2XtextJSONGrammarCreator grammarCreator = new Ecore2XtextJSONGrammarCreator();
	DetailedGrammar detailedJsonGrammar = null;
	RelatedSchemas relatedSchemas = null;
	List<EClass> subRootElementClasses = new ArrayList<EClass>()
	Map<EClass, List<EnclosingSchema>> rootElementEnclosingSchemaMap = new HashMap<EClass, List<EnclosingSchema>>();
	
	new(WizardConfiguration config) {
		super(config);
	}
	
	def setDetailedGrammar(){
		val XtextJsonGrammarProjectInfo xtextJsonGrammarProject = config as XtextJsonGrammarProjectInfo;
		this.detailedJsonGrammar = loadJsonGrammar(xtextJsonGrammarProject.jsonGrammarFile,
				config.ecore2Xtext.rootElementClass.eResource.resourceSet
		).detailedGrammar;
	}
	
	def setRelatedSchemas(){
		val XtextJsonGrammarProjectInfo xtextJsonGrammarProject = config as XtextJsonGrammarProjectInfo;
		this.relatedSchemas = loadRelatedSchemas(xtextJsonGrammarProject.relatedSchemasFile, config.ecore2Xtext.rootElementClass.eResource.resourceSet);
	}
	
	def RelatedSchemas getRelatedSchemas(){
		return this.relatedSchemas;
	}
	
	def getRootElementEnclosingSchemaMap(){
		return this.rootElementEnclosingSchemaMap
	}
	
	override grammar() {
//		if (fromExistingEcoreModels)
//			grammarCreator.grammar(config)
//		else
//			defaultGrammar
//		val Ecore2XtextJSONGrammarCreator grammarCreator = new Ecore2XtextJSONGrammarCreator(this.detailedJsonGrammar);
		val Ecore2XtextJSONGrammarCreator grammarCreator = newGrammarCreator;
		if (this.isFromExistingEcoreModels()){
			val String languageName = this.config.language.name
			val EClass rootElementClass = this.config.ecore2Xtext.rootElementClass
			mapRootToEnclosingSchema(rootElementClass)
//			grammarCreator.grammar(this.getConfig(), rootElementClass, languageName)
			grammarCreator.grammar(this.getConfig(),  languageName)
		}else{
			defaultGrammar
		}
	}
	
	def Ecore2XtextJSONGrammarCreator getNewGrammarCreator(){
		new Ecore2XtextJSONGrammarCreator(this.detailedJsonGrammar)
	}
	
	override getFiles() {
		val mainRootElementClass = this.config.ecore2Xtext.rootElementClass
		findSubRootElementClasses
		var allFiles = newArrayList
		allFiles +=  super.files
		allFiles  += subGrammarFiles
		this.config.ecore2Xtext.setRootElementClass(mainRootElementClass)
		return allFiles
	}
	
	
	
	private def findSubRootElementClasses(){
		subRootElementClasses.removeAll(subRootElementClasses) 
		for (EnclosingSchema enclosingSchema : relatedSchemas.enclosingschemas){
			if(enclosingSchema.anyOf !== null){
				for (EClass rootElementClass : enclosingSchema.anyOf.anyOfs){
					subRootElementClasses.add(rootElementClass)
				}
			}
			if(enclosingSchema.allOf !== null){
				for (EClass rootElementClass : enclosingSchema.allOf.allOfs){
					subRootElementClasses.add(rootElementClass)
				}
			}
			if(enclosingSchema.oneOf !== null){
				for (EClass rootElementClass : enclosingSchema.oneOf.oneOfs){
					subRootElementClasses.add(rootElementClass)
				}
			}
			if(enclosingSchema.not !== null){
				val EClass rootElementClass = enclosingSchema.not.not
				subRootElementClasses.add(rootElementClass)
			}
			if(enclosingSchema.ifThenElse !== null){
				if (enclosingSchema.ifThenElse.getIf !==null){
					val EClass rootElementClass = enclosingSchema.ifThenElse.getIf
					subRootElementClasses.add(rootElementClass)
				}
				if (enclosingSchema.ifThenElse.getThen !==null){
					val EClass rootElementClass = enclosingSchema.ifThenElse.getThen
					subRootElementClasses.add(rootElementClass)
				}
				if (enclosingSchema.ifThenElse.getElse !==null){
					val EClass rootElementClass = enclosingSchema.ifThenElse.getElse
					subRootElementClasses.add(rootElementClass)
				}
				 
			}
			if(enclosingSchema.dependency !== null){
				val EClass rootElementClass = enclosingSchema.dependency.dependency
				subRootElementClasses.add(rootElementClass)
			}
			if(enclosingSchema.contains !== null){
				val EClass rootElementClass = enclosingSchema.contains.contains
				subRootElementClasses.add(rootElementClass)
			}
		}
	}
	
	private def mapRootToEnclosingSchema(EClass rootElementClass){
		if(!rootElementEnclosingSchemaMap.containsKey(rootElementClass)){
			val List<EClass> processedEClasses = new ArrayList<EClass>()
			val List<EnclosingSchema> enclosingSchemas = findClosureEnclosingSchema(rootElementClass, processedEClasses)
			val EnclosingSchema rootAsEnclosingSchema = relatedSchemas.enclosingschemas.findFirst[enclosingschema|enclosingschema.enclosingSchema===rootElementClass]
			if(rootAsEnclosingSchema!==null){
				enclosingSchemas.add(rootAsEnclosingSchema)
			}
			rootElementEnclosingSchemaMap.put(rootElementClass,enclosingSchemas)
			
		}
	}
	
	private def List<EnclosingSchema> findClosureEnclosingSchema(EClass containingEClass, List<EClass> processedEClasses){
		if(!processedEClasses.contains(containingEClass)){
			processedEClasses.add(containingEClass);
			val List<EClass> containedEClasses = containingEClass.EReferences.filter[r|r.containment].map[EType as EClass].toList
			val List<EClass> containedSubClasses = new ArrayList<EClass>();
			for (EClass containedEClass : containedEClasses){
				containedSubClasses.addAll(Ecore2XtextJSONExtensions.subClasses(containedEClass).toList)
			}
			containedEClasses.addAll(containedSubClasses);
			val List<EnclosingSchema> enclosingSchemas = relatedSchemas.enclosingschemas.filter[enclosingschema|containedEClasses.contains(enclosingschema.enclosingSchema)].toList
			for (EClass containedEClass : containedEClasses){
				enclosingSchemas.addAll(findClosureEnclosingSchema(containedEClass, processedEClasses))
			}
			return enclosingSchemas
		}else{
			return new ArrayList<EnclosingSchema>();
		}
		
	}
	
	private def getSubGrammarFiles(){
		
		var allGrammarFiles = newArrayList
		for (EClass rootElementClass : subRootElementClasses){
			allGrammarFiles +=  createSubGrammarFile( rootElementClass)
		}
		return allGrammarFiles
	}
	
//	private def getSubGrammarFiles(){
//		var allGrammarFiles = newArrayList
//		for (EnclosingSchema enclosingSchema : relatedSchemas.enclosingschemas){
//			if(enclosingSchema.anyOf !== null){
//				for (EClass rootElementClass : enclosingSchema.anyOf.anyOfs){
//					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//				}
//			}
//			if(enclosingSchema.allOf !== null){
//				for (EClass rootElementClass : enclosingSchema.allOf.allOfs){
//					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//				}
//			}
//			if(enclosingSchema.oneOf !== null){
//				for (EClass rootElementClass : enclosingSchema.oneOf.oneOfs){
//					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//				}
//			}
//			if(enclosingSchema.not !== null){
//				val EClass rootElementClass = enclosingSchema.not.not
//				allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//			}
//			if(enclosingSchema.ifThenElse !== null){
//				if (enclosingSchema.ifThenElse.getIf !==null){
//					val EClass rootElementClass = enclosingSchema.ifThenElse.getIf
//					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//				}
//				if (enclosingSchema.ifThenElse.getThen !==null){
//					val EClass rootElementClass = enclosingSchema.ifThenElse.getThen
//					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//				}
//				if (enclosingSchema.ifThenElse.getElse !==null){
//					val EClass rootElementClass = enclosingSchema.ifThenElse.getElse
//					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//				}
//				 
//			}
//			if(enclosingSchema.dependency !== null){
//				val EClass rootElementClass = enclosingSchema.dependency.dependency
//				allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//			}
//			if(enclosingSchema.contains !== null){
//				val EClass rootElementClass = enclosingSchema.contains.contains
//				allGrammarFiles +=  createSubGrammarFile( rootElementClass)
//			}
//		}
//		return allGrammarFiles
//	}
	
	private def PlainTextFile createSubGrammarFile(EClass rootElementClass){
//		val String languageName = this.config.language.name+"."+rootElementClass.name
		mapRootToEnclosingSchema(rootElementClass)
		val String languageName = getLanguageName(rootElementClass)
		this.config.ecore2Xtext.setRootElementClass(rootElementClass)
//		val charSequenceGrammar = newGrammarCreator.grammar(this.getConfig(), rootElementClass, languageName)
		val charSequenceGrammar = newGrammarCreator.grammar(this.getConfig(), languageName)
		file(Outlet.MAIN_JAVA, buildSubGrammarFilePath(rootElementClass.name), charSequenceGrammar)
	}
	
	def String getLanguageName(EClass rootElementClass){
//		this.config.language.name+"."+rootElementClass.name
		val String mainLanguageName=this.config.language.name
		mainLanguageName.substring(0, mainLanguageName.lastIndexOf(".") )+"."+rootElementClass.name
	}
	
	def static String  getExtension(EClass rootElementClass){
		rootElementClass.name.toLowerCase
	}
	
	private def String buildSubGrammarFilePath(String languageName) {
		return '''«config.language.basePackagePath»/«languageName».xtext'''
	}
	
	def JsonGrammar loadJsonGrammar(IFile jsonGrammarFile, ResourceSet reset) {
		val Resource resource = reset.getResource(URI.createPlatformResourceURI(jsonGrammarFile.getFullPath().toString(), true), true);
		if (resource.getContents().get(0) instanceof JsonGrammar) {
			return resource.getContents().get(0) as JsonGrammar;
		} else
			throw new IllegalArgumentException("Expecting JsonGrammar type of object");
	 }
	 
	def RelatedSchemas loadRelatedSchemas(IFile relatedSchemasFile, ResourceSet reset) {
		val Resource resource = reset.getResource(URI.createPlatformResourceURI(relatedSchemasFile.getFullPath().toString(), true), true);
		if (resource.getContents().get(0) instanceof RelatedSchemas) {
			return resource.getContents().get(0) as RelatedSchemas;
		} else
			throw new IllegalArgumentException("Expecting JsonGrammar type of object");
	}
	
	override workflow() {
		''' 
			module «(config.language.basePackagePath+"/Generate"+config.language.simpleName).replaceAll("/", ".")»
			
			import org.eclipse.xtext.xtext.generator.*
			import org.eclipse.xtext.xtext.generator.model.project.*
			
			var rootPath = ".."
			
			Workflow {
				
				component = XtextGenerator {
					configuration = {
						project = StandardProjectConfig {
							baseName = "«name»"
							rootPath = rootPath
							«IF testProject.enabled»
								runtimeTest = {
									enabled = true
								}
							«ENDIF»
							«IF config.ideProject.enabled 
								&& !#[config.webProject, config.uiProject].exists[enabled]»
								genericIde = {
									enabled = true
								}
							«ENDIF»
							«IF config.uiProject.enabled»
								eclipsePlugin = {
									enabled = true
								}
							«ENDIF»
							«IF config.uiProject.testProject.enabled»
								eclipsePluginTest = {
									enabled = true
								}
							«ENDIF»
							«IF config.webProject.enabled»
								web = {
									enabled = true
								}
							«ENDIF»
							«IF config.sourceLayout == SourceLayout.MAVEN»
								mavenLayout = true
							«ENDIF»
							«IF isEclipsePluginProject»
								createEclipseMetaData = true
							«ENDIF»
						}
						code = {
							encoding = "«config.encoding»"
							lineDelimiter = "«Strings.convertToJavaString(config.lineDelimiter)»"
							fileHeader = "/*\n * generated by Xtext \${version}\n */"
							preferXtendStubs = false
						}
					}
					«workflowLanguage(config.language.name, config.language.fileExtensions.toString)»
					«FOR rootElementClass : subRootElementClasses»
						«workflowLanguage(rootElementClass.languageName, rootElementClass.extension)»				 
					«ENDFOR»
«««					language = StandardLanguage {
«««						name = "«config.language.name»"
«««						fileExtensions = "«config.language.fileExtensions»"
«««						«IF !config.ecore2Xtext.EPackageInfos.empty»
«««							«FOR genmodelURI : config.ecore2Xtext.EPackageInfos.map[genmodelURI.toString].toSet»
«««								referencedResource = "«genmodelURI»"
«««							«ENDFOR»
«««						«ENDIF»
«««						«IF fromExistingEcoreModels»
«««							
«««							fragment = ecore2xtext.Ecore2XtextValueConverterServiceFragment2 auto-inject {}
«««
«««							formatter = {
«««								generateStub = true
«««								generateXtendStub = true
«««							}
«««						«ENDIF»
«««
«««						serializer = {
«««							generateStub = false
«««						}
«««						validator = {
«««							// composedCheck = "org.eclipse.xtext.validation.NamesAreUniqueValidator"
«««							// Generates checks for @Deprecated grammar annotations, an IssueProvider and a corresponding PropertyPage
«««							generateDeprecationValidation = true
«««						}
«««						generator = {
«««							generateXtendStub = true
«««						}
«««						«IF config.junitVersion == JUnitVersion.JUNIT_5»
«««							junitSupport = {
«««								junitVersion = "5"
«««							}
«««						«ENDIF»
«««					}
				}
			}
		'''
	} 
	
	def workflowLanguage(String languageName, String fileExtensions){
		'''
			language = StandardLanguage {
				name = "«languageName»"
				fileExtensions = "«fileExtensions»"
				«IF !config.ecore2Xtext.EPackageInfos.empty»
					«FOR genmodelURI : config.ecore2Xtext.EPackageInfos.map[genmodelURI.toString].toSet»
						referencedResource = "«genmodelURI»"
					«ENDFOR»
				«ENDIF»
				«IF fromExistingEcoreModels»
					
					fragment = ecore2xtext.Ecore2XtextValueConverterServiceFragment2 auto-inject {}

					formatter = {
						generateStub = true
						generateXtendStub = true
					}
				«ENDIF»

				serializer = {
					generateStub = false
				}
				validator = {
					// composedCheck = "org.eclipse.xtext.validation.NamesAreUniqueValidator"
					// Generates checks for @Deprecated grammar annotations, an IssueProvider and a corresponding PropertyPage
					generateDeprecationValidation = true
				}
				parserGenerator={
					combinedGrammar=false
					//debugGrammar=true
				}
				generator = {
					generateXtendStub = true
				}
				«IF config.junitVersion == JUnitVersion.JUNIT_5»
					junitSupport = {
						junitVersion = "5"
					}
				«ENDIF»
			}
		
		'''
		
	}
	
	private def defaultGrammar() '''
		grammar «config.language.name» with org.eclipse.xtext.common.Terminals
		
		generate «config.language.simpleName.toFirstLower» "«config.language.nsURI»"
		
		Model:
			greetings+=Greeting*;
			
		Greeting:
			'Hello' name=ID '!';
	'''
}