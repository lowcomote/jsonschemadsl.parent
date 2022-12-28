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
import relatedSchemas.Dependency
import java.util.Set
import java.util.HashSet
import org.eclipse.xtext.xtext.wizard.BuildSystem

class RuntimeProjectDescriptorJSON extends RuntimeProjectDescriptor{
	
//	final Ecore2XtextJSONGrammarCreator grammarCreator = new Ecore2XtextJSONGrammarCreator();
	DetailedGrammar detailedJsonGrammar = null;
	RelatedSchemas relatedSchemas = null;
	List<EClass> subRootElementClasses = new ArrayList<EClass>()
//	Map<EClass, List<EnclosingSchema>> rootElementEnclosingSchemaMap = new HashMap<EClass, List<EnclosingSchema>>();
	Map<EClass, Set<EnclosingSchema>> rootElementEnclosingSchemaMap = new HashMap<EClass, Set<EnclosingSchema>>();
	
//	List<EClass> constEnumClasses = new ArrayList<EClass>()
	
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
		val Ecore2XtextJSONGrammarCreator grammarCreator = newGrammarCreator;
		if (this.isFromExistingEcoreModels()){
			val String languageName = this.config.language.name
			val EClass rootElementClass = this.config.ecore2Xtext.rootElementClass
			mapRootToEnclosingSchema(rootElementClass)
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
//		findConstEnumClasses
		var allFiles = newArrayList
//		allFiles +=  super.files
		allFiles +=  filesOriginal
		allFiles  += subGrammarFiles
		this.config.ecore2Xtext.setRootElementClass(mainRootElementClass)
		return allFiles
	}
	
	/**
	 * This file is compied to override workflowLaunchConfigFile
	 */
	private def getFilesOriginal() {
		val files = newArrayList
		files += super.files
		files += grammarFile
		files += file(Outlet.MAIN_JAVA, workflowFilePath, workflow)
		files += workflowLaunchConfigFile
		if (config.runtimeProject.isEclipsePluginProject) {
			files += launchConfigFile
		}
		if (isPlainMavenBuild) {
			files += file(Outlet.ROOT, "jar-with-ecore-model.xml", jarDescriptor)
		}
		return files
	}
	
	private def isPlainMavenBuild() {
		config.needsMavenBuild && !isEclipsePluginProject
	}
	
	def private getWorkflowLaunchConfigFile() {
		file(Outlet.ROOT, '''.launch/Generate «config.language.simpleName» («config.language.fileExtensions.head») Language Infrastructure.launch'''.toString, workflowLaunchConfig)
	}
	
	 
	
				
	def private workflowLaunchConfig() {
		var projectsToRefresh = newArrayList
		
		projectsToRefresh += config.enabledProjects
		if (config.runtimeProject.testProject.enabled)
			projectsToRefresh += config.runtimeProject.testProject
		if (config.uiProject.testProject.enabled)
			projectsToRefresh += config.uiProject.testProject
		
		val refreshAttr = '''${working_set:&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;&#10;&lt;resources&gt;&#10;«FOR it: projectsToRefresh»&lt;item path=&quot;/«name»&quot; type=&quot;4&quot;/&gt;&#10;«ENDFOR»;&lt;/resources&gt;}'''

		'''
			<?xml version="1.0" encoding="UTF-8" standalone="no"?>
			«IF config.runtimeProject.isEclipsePluginProject»
			<launchConfiguration type="org.eclipse.emf.mwe2.launch.Mwe2LaunchConfigurationType">
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_PATHS">
			<listEntry value="/«config.runtimeProject.name»"/>
			</listAttribute>
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_TYPES">
			<listEntry value="4"/>
			</listAttribute>
			<listAttribute key="org.eclipse.debug.ui.favoriteGroups">
			<listEntry value="org.eclipse.debug.ui.launchGroup.debug"/>
			<listEntry value="org.eclipse.debug.ui.launchGroup.run"/>
			</listAttribute>
			<stringAttribute key="org.eclipse.debug.core.ATTR_REFRESH_SCOPE" value="«refreshAttr»"/>
			<stringAttribute key="org.eclipse.jdt.launching.MAIN_TYPE" value="org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="«(config.language.basePackagePath+"/Generate"+config.language.simpleName).replaceAll("/", ".")»"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="«config.runtimeProject.name»"/>
«««			<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xmx512m"/>
			<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xmx4096m"/>
			</launchConfiguration>
			«ELSEIF config.preferredBuildSystem == BuildSystem.MAVEN»
			<launchConfiguration type="org.eclipse.m2e.Maven2LaunchConfigurationType">
			<booleanAttribute key="M2_DEBUG_OUTPUT" value="false"/>
			<stringAttribute key="M2_GOALS" value="clean generate-sources"/>
			<booleanAttribute key="M2_NON_RECURSIVE" value="false"/>
			<booleanAttribute key="M2_OFFLINE" value="false"/>
			<stringAttribute key="M2_PROFILES" value=""/>
			<listAttribute key="M2_PROPERTIES"/>
			<stringAttribute key="M2_RUNTIME" value="EMBEDDED"/>
			<booleanAttribute key="M2_SKIP_TESTS" value="false"/>
			<intAttribute key="M2_THREADS" value="1"/>
			<booleanAttribute key="M2_UPDATE_SNAPSHOTS" value="false"/>
			<stringAttribute key="M2_USER_SETTINGS" value=""/>
			<booleanAttribute key="M2_WORKSPACE_RESOLUTION" value="true"/>
			<stringAttribute key="org.eclipse.debug.core.ATTR_REFRESH_SCOPE" value="«refreshAttr»"/>
			<booleanAttribute key="org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD" value="true"/>
			<stringAttribute key="org.eclipse.jdt.launching.WORKING_DIRECTORY" value="${workspace_loc:/«config.runtimeProject.name»}"/>
			</launchConfiguration>
			«ELSEIF config.preferredBuildSystem == BuildSystem.GRADLE»
			<launchConfiguration type="org.eclipse.buildship.core.launch.runconfiguration">
			<listAttribute key="arguments"/>
			<stringAttribute key="gradle_distribution" value="GRADLE_DISTRIBUTION(WRAPPER)"/>
			<listAttribute key="jvm_arguments"/>
			<booleanAttribute key="show_console_view" value="true"/>
			<booleanAttribute key="show_execution_view" value="true"/>
			<listAttribute key="tasks">
			<listEntry value="build"/>
			</listAttribute>
			<stringAttribute key="org.eclipse.debug.core.ATTR_REFRESH_SCOPE" value="«refreshAttr»"/>
			<booleanAttribute key="org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD" value="true"/>
			<stringAttribute key="org.eclipse.jdt.launching.WORKING_DIRECTORY" value="${workspace_loc:/«config.runtimeProject.name»}"/>
			</launchConfiguration>
			«ENDIF»
		'''
	}
	
	
	def private getLaunchConfigFile() {
		file(Outlet.ROOT, ".launch/Launch Runtime Eclipse.launch", launchConfig)
	}
	
	def private launchConfig() {
		'''
			<?xml version="1.0" encoding="UTF-8" standalone="no"?>
			<launchConfiguration type="org.eclipse.pde.ui.RuntimeWorkbench">
			<booleanAttribute key="append.args" value="true"/>
			<booleanAttribute key="askclear" value="true"/>
			<booleanAttribute key="automaticAdd" value="true"/>
			<booleanAttribute key="automaticValidate" value="false"/>
			<stringAttribute key="bad_container_name" value="/«config.runtimeProject.name»/.launch/"/>
			<stringAttribute key="bootstrap" value=""/>
			<stringAttribute key="checked" value="[NONE]"/>
			<booleanAttribute key="clearConfig" value="true"/>
			<booleanAttribute key="clearws" value="false"/>
			<booleanAttribute key="clearwslog" value="false"/>
			<stringAttribute key="configLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/Launch Runtime Eclipse"/>
			<booleanAttribute key="default" value="true"/>
			<booleanAttribute key="includeOptional" value="true"/>
			<stringAttribute key="location" value="${workspace_loc}/../runtime-EclipseXtext"/>
			<listAttribute key="org.eclipse.debug.ui.favoriteGroups">
			<listEntry value="org.eclipse.debug.ui.launchGroup.debug"/>
			<listEntry value="org.eclipse.debug.ui.launchGroup.run"/>
			</listAttribute>
			<stringAttribute key="org.eclipse.jdt.launching.JRE_CONTAINER" value="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl}"/>
			<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
			<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xms40m -Xmx512m"/>
			<stringAttribute key="pde.version" value="3.3"/>
			<stringAttribute key="product" value="org.eclipse.platform.ide"/>
			<booleanAttribute key="show_selected_only" value="false"/>
			<stringAttribute key="templateConfig" value="${target_home}/configuration/config.ini"/>
			<booleanAttribute key="tracing" value="false"/>
			<booleanAttribute key="useDefaultConfig" value="true"/>
			<booleanAttribute key="useDefaultConfigArea" value="true"/>
			<booleanAttribute key="useProduct" value="true"/>
			<booleanAttribute key="usefeatures" value="false"/>
			</launchConfiguration>
		'''
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
			if(enclosingSchema.dependencies !== null){
				for(Dependency dependency:enclosingSchema.dependencies.dependencies){
					val EClass rootElementClass =dependency.dependency
					subRootElementClasses.add(rootElementClass)
				}
			}
			if(enclosingSchema.contains !== null){
				val EClass rootElementClass = enclosingSchema.contains.contains
				subRootElementClasses.add(rootElementClass)
			}
		}
	}
	
	
	private def findConstEnumClasses(){
//		constEnumClasses.removeAll(constEnumClasses) 
		for (EnclosingSchema enclosingSchema : relatedSchemas.enclosingschemas){
			
			/**
			 * Enum TODO
			 */
			 if(enclosingSchema.constEnum !== null){
				val EClass rootElementClass = enclosingSchema.enclosingSchema
				mapRootToEnclosingSchema(rootElementClass)
//				mapRootToEnclosingSchema(EcoreUtil.getRootContainer(rootElementClass) as EClass)
				
//				constEnumClasses.add(rootElementClass)
			}
		}
	}
	
	private def mapRootToEnclosingSchema(EClass rootElementClass){
		if(!rootElementEnclosingSchemaMap.containsKey(rootElementClass)){
			val List<EClass> processedEClasses = new ArrayList<EClass>()
//			val List<EnclosingSchema> enclosingSchemas = findClosureEnclosingSchema(rootElementClass, processedEClasses)
			val Set<EnclosingSchema> enclosingSchemas = findClosureEnclosingSchema(rootElementClass, processedEClasses)
			val EnclosingSchema rootAsEnclosingSchema = relatedSchemas.enclosingschemas.findFirst[enclosingschema|enclosingschema.enclosingSchema===rootElementClass]
			if(rootAsEnclosingSchema!==null){
				enclosingSchemas.add(rootAsEnclosingSchema)
			}
			rootElementEnclosingSchemaMap.put(rootElementClass,enclosingSchemas)
			
		}
	}
	
//	private def List<EnclosingSchema> findClosureEnclosingSchema(EClass containingEClass, List<EClass> processedEClasses){
		private def Set<EnclosingSchema> findClosureEnclosingSchema(EClass containingEClass, List<EClass> processedEClasses){
		if(!processedEClasses.contains(containingEClass)){
			processedEClasses.add(containingEClass);
			val List<EClass> containedEClasses = containingEClass.EReferences.filter[r|r.containment].map[EType as EClass].toList
			val List<EClass> containedSubClasses = new ArrayList<EClass>();
			for (EClass containedEClass : containedEClasses){
				containedSubClasses.addAll(Ecore2XtextJSONExtensions.subClasses(containedEClass).toList)
			}
			containedEClasses.addAll(containedSubClasses);
//			val List<EnclosingSchema> enclosingSchemas = relatedSchemas.enclosingschemas.filter[enclosingschema|containedEClasses.contains(enclosingschema.enclosingSchema)].toList
			val Set<EnclosingSchema> enclosingSchemas = relatedSchemas.enclosingschemas.filter[enclosingschema|containedEClasses.contains(enclosingschema.enclosingSchema)].toSet
			for (EClass containedEClass : containedEClasses){
				enclosingSchemas.addAll(findClosureEnclosingSchema(containedEClass, processedEClasses))
			}
			return enclosingSchemas
		}else{
//			return new ArrayList<EnclosingSchema>();
			return new HashSet<EnclosingSchema>();
		}
		
	}
	
	private def getSubGrammarFiles(){
		
		var allGrammarFiles = newArrayList
		for (EClass rootElementClass : subRootElementClasses){
			allGrammarFiles +=  createSubGrammarFile( rootElementClass)
		}
		return allGrammarFiles
	}
	

	
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
			throw new IllegalArgumentException("Expecting RelatedSchema type of object");
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
		val XtextJsonGrammarProjectInfo xtextJsonGrammarProject = config as XtextJsonGrammarProjectInfo;
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
«««				parserGenerator={
«««				parserGenerator=«NewXtextProjectFromEcoreJsonGrammarWizard.PARSER_GENERATOR_PACKAGE».«NewXtextProjectFromEcoreJsonGrammarWizard.PARSER_GENERATOR_CLASS_NAME»{
				parserGenerator=jku.se.parser.antlr.SemanticPredicateXtextAntlrGeneratorFragment2{
«««					ePackageName = "test86.Test86Package" 
					ePackageName = "«config.ecore2Xtext.EPackageInfos.iterator().next().getEPackageJavaFQN()»"
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