package at.jku.bise.oclgenerator

import org.eclipse.emf.common.util.URI

class OclGenerator {

//	def static createOcl (String fileName, String importContent, String packageName){
	def static createOcl (URI fileName, String importContent, String packageName){
		OclWriter.create(fileName)
		OclWriter.append(fileName, initializeOcl(importContent, packageName))
	}
	
	def static initializeOcl(String importContent, String packageName)'''
		import '«importContent»'
		
		package «packageName»
	'''
	
//	def static appendMinimumConstraint (String fileName, String contextClass, String inv, Double minimum){
	def static appendMinimumConstraint (URI fileName, String packageName, String contextClass, String inv, Double minimum, String propertyName){
		OclWriter.append(fileName, generateMinimumConstraint(packageName, contextClass, inv, minimum, propertyName))
	}
	
	def static generateMinimumConstraint(String packageName, String contextClass, String inv, Double minimum, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «inv»('The value of «contextClass» must be greater or equal than «minimum»'):
			if «propertyName.underscoreIfNecessary» >= «minimum»
			then true
			else null
			endif
	'''
	
//	def static appendRequiredInPropertiesConstraint (String fileName, String contextClass, String inv, String requiredProperty, String requiredClassType){
	def static appendRequiredInPropertiesConstraint (URI fileName, String packageName, String contextClass, String inv, String requiredProperty, String requiredClassType, String propertyName){
		OclWriter.append(fileName, generateRequiredInPropertiesConstraint(packageName, contextClass, inv, requiredProperty, requiredClassType, propertyName))
	}
	/**
	 * e.g, if  self.test15Root->select(p|p.oclIsKindOf(test15::Test15RootProp1))->size()>0
	 */
	def static generateRequiredInPropertiesConstraint(String packageName, String contextClass, String inv, String requiredProperty, String requiredClassType, String propertyName)'''
			context «packageName»::«contextClass» 
		
			inv «inv»«requiredProperty» ('«contextClass» requires the property «requiredProperty»'):
«««			if  self.«propertyName.underscoreIfNecessary»->select(p|p.oclType()=«packageName»::«requiredClassType»)->size()>0
			if  self.«propertyName.underscoreIfNecessary»->select(p|p.oclIsKindOf(«packageName»::«requiredClassType»))->size()>0
			then true
			else null
			endif
	'''
	
	
	def static appendRegexInPatternPropertiesConstraint(URI fileName, String packageName, String contextClass,  String inv, String regex, String propertyName){
		OclWriter.append(fileName, generateRegexInPatternPropertiesConstraint(packageName, contextClass, inv, regex,  propertyName))
	}
	
	
	def static generateRegexInPatternPropertiesConstraint(String packageName, String contextClass, String inv, String regex, String propertyName)'''
			context «packageName»::«contextClass» 
		
			inv «inv»Regex ('the key must match the regular expression «regex»'):
			if  «propertyName».matches('«regex»')
			then true
			else null
			endif
	'''



	def static endPackage (URI fileName){
		OclWriter.append(fileName, endPackage())
	}
	
	def static endPackage()'''
		endpackage
	'''
	
	def static isIllegalSyntax(String str){
		newArrayList('Sequence').contains(str)
	}
	
	def static underscoreIfNecessary(String str){
		if(isIllegalSyntax(str)) '_' + str else str;
	}
	
	
}
