package at.jku.bise.oclgenerator

import org.eclipse.emf.common.util.URI
import java.util.List

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
	def static appendMinimumConstraint (URI fileName, String packageName, String contextClass,  Double minimum, String propertyName){
		OclWriter.append(fileName, generateMinimumConstraint(packageName, contextClass,  minimum, propertyName))
	}
	
	def static generateMinimumConstraint(String packageName, String contextClass,  Double minimum, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»Minimum ('The value of «contextClass» must be greater or equal than «minimum»'):
			if «propertyName.underscoreIfNecessary» >= «minimum»
			then true
			else null
			endif
	'''
	
	def static appendExclusiveMinimumConstraint (URI fileName, String packageName, String contextClass, Double exclusiveMinimum, String propertyName){
		OclWriter.append(fileName, generateExclusiveMinimumConstraint(packageName, contextClass,  exclusiveMinimum, propertyName))
	}
	
	def static generateExclusiveMinimumConstraint(String packageName, String contextClass,  Double exclusiveMinimum, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»ExclusiveMinimum('The value of «contextClass» must be greater than «exclusiveMinimum»'):
			if «propertyName.underscoreIfNecessary» > «exclusiveMinimum»
			then true
			else null
			endif
	'''
	
	def static appendMaximumConstraint (URI fileName, String packageName, String contextClass,  Double maximum, String propertyName){
		OclWriter.append(fileName, generateMaximumConstraint(packageName, contextClass,  maximum, propertyName))
	}
	
	def static generateMaximumConstraint(String packageName, String contextClass,  Double maximum, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»Maximum('The value of «contextClass» must be lower or equal than «maximum»'):
			if «propertyName.underscoreIfNecessary» <= «maximum»
			then true
			else null
			endif
	'''
	
	
	def static appendExclusiveMaximumConstraint (URI fileName, String packageName, String contextClass, Double exclusiveMaximum, String propertyName){
		OclWriter.append(fileName, generateExclusiveMaximumConstraint(packageName, contextClass,  exclusiveMaximum, propertyName))
	}
	
	
	def static generateExclusiveMaximumConstraint(String packageName, String contextClass, Double exclusiveMaximum, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»ExclusiveMaximum('The value of «contextClass» must be lower than «exclusiveMaximum»'):
			if «propertyName.underscoreIfNecessary» < «exclusiveMaximum»
			then true
			else null
			endif
	'''
	
	def static appendMultipleOfConstraint (URI fileName, String packageName, String contextClass, Double multipleOf, String propertyName){
		OclWriter.append(fileName, generateMultipleOfConstraint(packageName, contextClass,  multipleOf, propertyName))
	}
	

	
	def static generateMultipleOfConstraint(String packageName, String contextClass, Double multipleOf, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»MultipleOf('The value of «contextClass» must be multiple of «multipleOf»'):
			if «propertyName.underscoreIfNecessary» - ((«propertyName.underscoreIfNecessary» / «multipleOf»).floor() *  «multipleOf»)=0
			then true
			else null
			endif
	'''
	def static appendMinLengthConstraint (URI fileName, String packageName, String contextClass,  Double minLength, String propertyName){
		OclWriter.append(fileName, generateMinLengthConstraint(packageName, contextClass,  minLength, propertyName))
	}
	
	def static generateMinLengthConstraint(String packageName, String contextClass, Double minLength, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»MinLength('The length of «contextClass» must be lower than «minLength»'):
			if «propertyName.underscoreIfNecessary».size() >= «minLength»
			then true
			else null
			endif
	'''
	
	def static appendMaxLengthConstraint (URI fileName, String packageName, String contextClass, Double maxLength, String propertyName){
		OclWriter.append(fileName, generateMaxLengthConstraint(packageName, contextClass, maxLength, propertyName))
	}
	
	def static generateMaxLengthConstraint(String packageName, String contextClass, Double maxLength, String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»MaxLength('The length of «contextClass» must be lower than «maxLength»'):
			if «propertyName.underscoreIfNecessary».size() <= «maxLength»
			then true
			else null
			endif
	'''

	def static appendPatternConstraint (URI fileName, String packageName, String contextClass, String regex){
		OclWriter.append(fileName, generatePatternConstraint(packageName, contextClass, regex))
	}
	
	def static generatePatternConstraint(String packageName, String contextClass, String regex)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»Pattern('The value of «contextClass» must match the regular expression «regex»'):
			if self.regexMatch()
			then true
			else null
			endif
	'''
	
	def static appendMaxProperties0Constraint (URI fileName, String packageName, String contextClass,   String propertyName){
		OclWriter.append(fileName, generateMaxProperties0Constraint(packageName, contextClass,  propertyName))
	}
	
	def static generateMaxProperties0Constraint(String packageName, String contextClass,  String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»MaxProperties0('No properties are allowed for  «contextClass»'):
			if  «propertyName.underscoreIfNecessary»->isEmpty()
			then true
			else null
			endif
	'''

	
	def static appendIntegerConstraint(URI fileName, String packageName, String contextClass,  String propertyName){
		OclWriter.append(fileName, generateIntegerConstraint(packageName, contextClass, propertyName))
	}
	

	def static generateIntegerConstraint(String packageName, String contextClass,  String propertyName)'''
			context «packageName»::«contextClass»
		
			inv «contextClass»IsInteger('The value of «contextClass».«propertyName» must be integer'):
			if «propertyName.underscoreIfNecessary».floor() = «propertyName.underscoreIfNecessary»
			then true
			else null
			endif
	'''
	
	def static appendRequiredInPropertiesConstraint (URI fileName, String packageName, String contextClass, String inv, String requiredProperty){
		OclWriter.append(fileName, generateRequiredInPropertiesConstraint(packageName, contextClass, inv, requiredProperty))
	}
	
	def static generateRequiredInPropertiesConstraint(String packageName, String contextClass, String inv, String requiredProperty)'''
			context «packageName»::«contextClass» 
		
			inv «inv»«requiredProperty» ('«contextClass» requires the property «requiredProperty»'):
			if  not self.get('«requiredProperty»').oclIsUndefined()
			then true
			else null
			endif
	'''
	
	def static appendDependenciesArray (URI fileName, String packageName, String contextClass, String inv, String property, List<String> values){
		OclWriter.append(fileName, generateDependenciesArray(packageName, contextClass, inv, property, values))
	}
	
	def static generateDependenciesArray(String packageName, String contextClass, String inv, String property, List<String> values)'''
		«FOR value : values»
			context «packageName»::«contextClass» 
		
			inv «inv»«property»«value» ('«contextClass» requires that if property «property» is present, also the property «value» must exist'):
			if  not self.get('«property»').oclIsUndefined()
			then 
				if not self.get('«value»').oclIsUndefined() then true
				else null
				endif				
			else true
			endif
			
		«ENDFOR»
		
	'''
	
//	def static appendRequiredInPropertiesConstraint_old (URI fileName, String packageName, String contextClass, String inv, String requiredProperty, String requiredClassType, String propertyName){
//		OclWriter.append(fileName, generateRequiredInPropertiesConstraint_old(packageName, contextClass, inv, requiredProperty, requiredClassType, propertyName))
//	}
//	
//	/**
//	 * e.g, if  self.test15Root->select(p|p.oclIsKindOf(test15::Test15RootProp1))->size()>0
//	 */
//	def static generateRequiredInPropertiesConstraint_old(String packageName, String contextClass, String inv, String requiredProperty, String requiredClassType, String propertyName)'''
//			context «packageName»::«contextClass» 
//		
//			inv «inv»«requiredProperty» ('«contextClass» requires the property «requiredProperty»'):
//			if  self.«propertyName.underscoreIfNecessary»->select(p|p.oclIsKindOf(«packageName»::«requiredClassType»))->size()>0
//			then true
//			else null
//			endif
//	'''
	
	def static appendRegexInPatternPropertiesConstraint(URI fileName, String packageName, String contextClass,  String inv, String regex, String propertyName){
		OclWriter.append(fileName, generateRegexInPatternPropertiesConstraint(packageName, contextClass, inv, regex,  propertyName))
	}
	
	/**
	 * It uses find(). 
	 * No need to pass the regex. the method to validate the key against the regex is generated in the contextClass
	 * 
	 */
	def static generateRegexInPatternPropertiesConstraint(String packageName, String contextClass, String inv, String regex, String propertyName)'''
			context «packageName»::«contextClass» 
		
			inv «inv»Regex ('the key must match the regular expression «regex»'):
«««			if  «propertyName».matches('«regex»')
			if  self.find()
			then true
			else null
			endif
	'''
	
	def static appendValidatorOnProperties(URI fileName, String packageName, String contextClass, String inv) {
		OclWriter.append(fileName,generateValidatorOnProperties( packageName,  contextClass,  inv))
	}
	
	def static generateValidatorOnProperties(String packageName, String contextClass, String inv)'''
			context «packageName»::«contextClass» 
		
			inv «inv»ValidatorOnProperties (' key can not be equals to a defined property'):
			if  self.validateKeyOnDefinedProperties().oclIsUndefined()
			then true
			else null
			endif
	'''
	
	
	def static appendValidatorOnPatternProperties(URI fileName, String packageName, String contextClass, String inv) {
		OclWriter.append(fileName,generateValidatorOnPatternProperties( packageName,  contextClass,  inv))
	}
	
	def static generateValidatorOnPatternProperties(String packageName, String contextClass, String inv)'''
			context «packageName»::«contextClass» 
		
			inv «inv»ValidatorOnPatternProperties (' key can not match the patterns of the defined pattern properties'):
			if  self.validateKeyOnDefinedPatternProperties().oclIsUndefined()
			then true
			else null
			endif
	'''

	def static appendValidatorBooleanSchemaFalse(URI fileName, String packageName, String contextClass) {
		OclWriter.append(fileName,generateValidatorBooleanSchemaFalse( packageName,  contextClass))
	}

	def static generateValidatorBooleanSchemaFalse(String packageName, String contextClass)'''
			context «packageName»::«contextClass» 
		
			inv «contextClass»BooleanSchemaFalse ('Invalid value because the boolean schema is false'):
			null
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
