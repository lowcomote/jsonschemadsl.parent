package at.jku.bise.oclgenerator

class OclGenerator {

	def static createOcl (String fileName, String importContent, String packageName){
		OclWriter.create(fileName)
		OclWriter.append(fileName, initializeOcl(importContent, packageName))
	}
	
	def static initializeOcl(String importContent, String packageName)'''
		import '«importContent»'
		
		package «packageName»
	'''
	
	def static endPackage (String fileName){
		OclWriter.append(fileName, endPackage())
	}
	
	def static endPackage()'''
		endpackage
	'''
	
	def static appendMinimumConstraint (String fileName, String contextClass, Double minimum){
		OclWriter.append(fileName, generateMinimumConstraint( contextClass,  minimum))
	}
	
	def static generateMinimumConstraint(String contextClass, Double minimum)'''
		context «contextClass»
		
		inv «contextClass»Minimum('The value of Shipyard2RootTestInteger must be greater or equal than «minimum»'):
		if testInteger >= «minimum»
		then true
		else null
		endif
	'''
}
