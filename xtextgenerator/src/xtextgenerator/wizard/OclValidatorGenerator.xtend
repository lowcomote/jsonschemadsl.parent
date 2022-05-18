package xtextgenerator.wizard

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

class OclValidatorGenerator {
	
	def static void create(String fileName, String classPackage, String className, String modelPackage, String oclPath) throws IOException {
		
		val BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    writer.write(generate ( classPackage,  className,  modelPackage,  oclPath));
	    writer.close();
	    
	}
	
	def private static String  generate (String classPackage, String className, String modelPackage, String oclPath){
		'''
			package «classPackage»;
			
			import org.eclipse.emf.common.util.URI;
			import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
			import org.eclipse.xtext.validation.EValidatorRegistrar;
			
			public class «className» extends Abstract«className» {
				
				public void register(EValidatorRegistrar registrar) {
					super.register(registrar); 
					«modelPackage» ePackage = «modelPackage».eINSTANCE;
					URI basicOclURI = URI.createPlatformPluginURI("«oclPath»", true);
					registrar.register(ePackage, new CompleteOCLEObjectValidator(ePackage, basicOclURI));
				}
			}
		'''
		
	}
	
}
