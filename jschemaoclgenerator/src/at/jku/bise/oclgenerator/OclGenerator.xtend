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
	def static appendMinimumConstraint (URI fileName, String contextClass, String inv, Double minimum){
		OclWriter.append(fileName, generateMinimumConstraint( contextClass, inv, minimum))
	}
	
	def static generateMinimumConstraint(String contextClass, String inv, Double minimum)'''
			context «contextClass»
		
			inv «inv»('The value of Shipyard2RootTestInteger must be greater or equal than «minimum»'):
			if testInteger >= «minimum»
			then true
			else null
			endif
	'''
	
//	def static appendRequiredInPropertiesConstraint (String fileName, String contextClass, String inv, String requiredProperty, String requiredClassType){
	def static appendRequiredInPropertiesConstraint (URI fileName, String contextClass, String inv, String requiredProperty, String requiredClassType){
		OclWriter.append(fileName, generateRequiredInPropertiesConstraint( contextClass, inv, requiredProperty, requiredClassType))
	}
	
	def static generateRequiredInPropertiesConstraint(String contextClass, String inv, String requiredProperty, String requiredClassType)'''
			context «contextClass» 
		
			inv «inv»«requiredProperty»:
			if  properties->select(p|p.oclType()=«requiredClassType»)->size()>0
			then true
			else null
			endif
	'''
	
//	def static endPackage (String fileName){
	def static endPackage (URI fileName){
		OclWriter.append(fileName, endPackage())
	}
	
	def static endPackage()'''
		endpackage
	'''
}
