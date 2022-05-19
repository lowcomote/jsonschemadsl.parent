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

class RuntimeProjectDescriptorJSON extends RuntimeProjectDescriptor{
	
//	final Ecore2XtextJSONGrammarCreator grammarCreator = new Ecore2XtextJSONGrammarCreator();
	DetailedGrammar detailedJsonGrammar = null;
	RelatedSchemas relatedSchemas = null;
	
	
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
		var allFiles = newArrayList
		allFiles +=  super.files
		allFiles  += subGrammarFiles
		return allFiles
	}
	
	private def getSubGrammarFiles(){
		var allGrammarFiles = newArrayList
		for (EnclosingSchema enclosingSchema : relatedSchemas.enclosingschemas){
			if(enclosingSchema.anyOf !== null){
				for (EClass rootElementClass : enclosingSchema.anyOf.anyOfs){
					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
				}
			}
			if(enclosingSchema.allOf !== null){
				for (EClass rootElementClass : enclosingSchema.allOf.allOfs){
					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
				}
			}
			if(enclosingSchema.oneOf !== null){
				for (EClass rootElementClass : enclosingSchema.oneOf.oneOfs){
					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
				}
			}
			if(enclosingSchema.not !== null){
				val EClass rootElementClass = enclosingSchema.not.not
				allGrammarFiles +=  createSubGrammarFile( rootElementClass)
			}
			if(enclosingSchema.ifThenElse !== null){
				if (enclosingSchema.ifThenElse.getIf !==null){
					val EClass rootElementClass = enclosingSchema.ifThenElse.getIf
					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
				}
				if (enclosingSchema.ifThenElse.getThen !==null){
					val EClass rootElementClass = enclosingSchema.ifThenElse.getThen
					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
				}
				if (enclosingSchema.ifThenElse.getElse !==null){
					val EClass rootElementClass = enclosingSchema.ifThenElse.getElse
					allGrammarFiles +=  createSubGrammarFile( rootElementClass)
				}
				 
			}
			if(enclosingSchema.dependency !== null){
				val EClass rootElementClass = enclosingSchema.dependency.dependency
				allGrammarFiles +=  createSubGrammarFile( rootElementClass)
			}
			if(enclosingSchema.contains !== null){
				val EClass rootElementClass = enclosingSchema.contains.contains
				allGrammarFiles +=  createSubGrammarFile( rootElementClass)
			}
		}
		return allGrammarFiles
	}
	
	private def PlainTextFile createSubGrammarFile(EClass rootElementClass){
		val String languageName = this.config.language.name+"."+rootElementClass.name
		this.config.ecore2Xtext.setRootElementClass(rootElementClass)
//		val charSequenceGrammar = newGrammarCreator.grammar(this.getConfig(), rootElementClass, languageName)
		val charSequenceGrammar = newGrammarCreator.grammar(this.getConfig(), languageName)
		file(Outlet.MAIN_JAVA, buildSubGrammarFilePath(rootElementClass.name), charSequenceGrammar)
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
	
	private def defaultGrammar() '''
		grammar «config.language.name» with org.eclipse.xtext.common.Terminals
		
		generate «config.language.simpleName.toFirstLower» "«config.language.nsURI»"
		
		Model:
			greetings+=Greeting*;
			
		Greeting:
			'Hello' name=ID '!';
	'''
}