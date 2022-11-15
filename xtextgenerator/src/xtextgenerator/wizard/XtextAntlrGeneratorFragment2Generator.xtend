package xtextgenerator.wizard

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

class XtextAntlrGeneratorFragment2Generator {
	
	def static void create(String fileName, String parserGeneratorPackage, String className, String ePackage ) throws IOException {
		
		val BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    writer.write(generate ( parserGeneratorPackage, className, ePackage));
	    writer.close();
	}
	
	
	
	def private static String generate(String parserGeneratorPackage, String className, String ePackage ) 
	'''
		package «parserGeneratorPackage»
		
		import com.google.inject.Inject
		import java.io.BufferedReader
		import java.io.File
		import java.io.FileReader
		import java.io.FileWriter
		import java.util.List
		import java.util.regex.Matcher
		import java.util.regex.Pattern
		import org.eclipse.emf.ecore.EClass
		import org.eclipse.emf.ecore.EClassifier
		import org.eclipse.emf.ecore.EPackage
		import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess
		import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrGrammar
		import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming
		import org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
		import «ePackage»
		//import org.eclipse.xtext.xtext.generator.util.BooleanGeneratorOption
		
		
		class «className» extends XtextAntlrGeneratorFragment2{
			
			@Inject extension GrammarNaming naming
			
			//val combinedGrammar = new BooleanGeneratorOption
			
			EPackage ePackage  = «ePackage».eINSTANCE;
			
			protected override generateProductionGrammar() {
				super.generateProductionGrammar();
				val fsa = projectConfig.runtime.srcGen;
				overrideJavaInternalParser(grammar.parserGrammar, fsa)
			}
			
			def private overrideJavaInternalParser(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
				val String newInternalParserText =newInternalParserText( parserGrammar, fsa);
				val FileWriter writer = new FileWriter(javaInternalParserFullName(parserGrammar, fsa));
				writer.write(newInternalParserText);
				writer.close();
			}
			
			def private String newInternalParserText(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
				val String oldInternalParserText=oldInternalParserText(grammar.parserGrammar, fsa);
				var String newInternalParserText=oldInternalParserText+"";
				
				var String javaParserName = parserGrammar.grammarFileName.substring(0,parserGrammar.grammarFileName.length-2);
				var int lastIndex = javaParserName.lastIndexOf("/")
				javaParserName=javaParserName.substring(lastIndex+1);
				val List<EClassifier> patterPropertiesEClasses =getPatterPropertiesEClasses();
				for (EClassifier patterPropertiesEClass :patterPropertiesEClasses){
					val String fragmentRegex = buildFragmentRegex(javaParserName, patterPropertiesEClass.name)
					var Pattern pattern = Pattern.compile(fragmentRegex, Pattern.MULTILINE);
					var Matcher matcher = pattern.matcher(newInternalParserText)
					matcher.find();
					System.out.println(matcher.start()+","+matcher.end())
					val String predicateStringIndex= matcher.group(1);
					System.out.println(patterPropertiesEClass.name+","+predicateStringIndex)
					
					val String booleanSynpredRegex = buildBooleanSynpredRegex( predicateStringIndex,  javaParserName)
					val String semanticPredicate =buildSemanticPredicate(patterPropertiesEClass)
					val String newBooleanSynpred = buildNewBooleanSynpred( booleanSynpredRegex,  semanticPredicate)
					newInternalParserText=newInternalParserText.replaceAll(booleanSynpredRegex, newBooleanSynpred)
					
				}
				return newInternalParserText;
			}
			
			def private String buildNewBooleanSynpred(String booleanSynpredRegex, String semanticPredicate){
				"booleanSynpredRegex"+"\r\n\t"+"semanticPredicate"
			}
			
			def private String buildSemanticPredicate(EClassifier patterPropertiesEClass){
				val String pattern= patterPropertiesEClass.getEAnnotation("PatternProperties").details.get('pattern')
				"if (!jku.se.atl.transformation.utils.Utils.lookingAt(\""+pattern+"\", input.LT(1).getText().substring(1,input.LT(1).getText().length() - 1)))  return false;"
			}
			
			def private buildFragmentRegex(String javaParserName, String patternPropertiesName){
				"public final void synpred(\\d+)_"+javaParserName+"_fragment\\(\\).*$(\n|\r|\r\n)^.*rule("+patternPropertiesName+")"
			}
			
			def private String buildBooleanSynpredRegex(String predicateStringIndex, String javaParserName){
				"public final boolean synpred"+predicateStringIndex+"_"+javaParserName+"\\(\\) \\{"
			}
			
			def private String oldInternalParserText(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
				var String oldInternalParserText="";
				val String javaInternalParserFullName =javaInternalParserFullName(parserGrammar, fsa)
				val File file = new File(javaInternalParserFullName);
				val BufferedReader reader = new BufferedReader(new FileReader(file));
				var String line = "";
				
				while((line = reader.readLine()) != null)  {
		             oldInternalParserText += line + "\r\n";
				}
				reader.close();
				return oldInternalParserText;
			}
			
			def private String javaInternalParserFullName(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
				val String javaParserFile = parserGrammar.grammarFileName.substring(0,parserGrammar.grammarFileName.length-1)+"java";
				val String javaInternalParserFullName =fsa.path+"//"+javaParserFile;
				return javaInternalParserFullName;
			}
			
			def private List<EClassifier> getPatterPropertiesEClasses(){
				val List<EClassifier> patterPropertiesEClasses = ePackage.getEClassifiers()
					.filter[eClassifier | eClassifier instanceof EClass]
					.filter[eClass|eClass.getEAnnotation('PatternProperties')!==null].toList;
					
				return patterPropertiesEClasses;
			}
		}
	'''
}