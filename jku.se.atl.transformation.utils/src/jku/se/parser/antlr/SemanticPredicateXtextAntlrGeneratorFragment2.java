package jku.se.parser.antlr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrGrammar;
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming;
import org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2;

import com.google.common.collect.Lists;
import com.google.inject.Inject;


public class SemanticPredicateXtextAntlrGeneratorFragment2 extends XtextAntlrGeneratorFragment2{
	@Inject  GrammarNaming naming;
	
	private EPackage ePackage  ;
	
	public void setEPackageName(String ePackageName){
		try {
			Class clazz = Class.forName(ePackageName);
			Field eInstanceField = clazz.getField("eINSTANCE");
			this.ePackage  = (EPackage)eInstanceField.get(clazz);
//			System.out.println(this.ePackage);
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
//	@Override
//	public String[] getAntlrParams() {
////		var params = Lists.newArrayList(antlrParams)
//		// setting the default conversion timeout to 100secs.
//		// There seem to be no practical situations where the NFA conversion would hang,
//		// so Terence suggested here [1] to remove the option all together
//		// [1] - http://antlr.1301665.n2.nabble.com/Xconversiontimeout-td5294411.html
////		if (!params.contains("-Xconversiontimeout")) {
////			params.add(0, "-Xconversiontimeout")
////			params.add(1, "100000")
////		}
//		List<String> paramsList = Lists.newArrayList(super.getAntlrParams());
//		if(!paramsList.contains("-Xmaxinlinedfastates")) {
//			paramsList.add(0,"-Xmaxinlinedfastates");
//			paramsList.add(1,"10");
//		}
//		return  paramsList.toArray(new String[0]);
//	}
	
	@Override
	protected void  generateProductionGrammar() {
		super.generateProductionGrammar();
		IXtextGeneratorFileSystemAccess fsa = getProjectConfig().getRuntime().getSrcGen();
		overrideJavaInternalParser(naming.getParserGrammar(getGrammar()), fsa);
	}
	
	private void overrideJavaInternalParser(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
		try {
			String newInternalParserText =newInternalParserText( parserGrammar, fsa);
			FileWriter writer = new FileWriter(javaInternalParserFullName(parserGrammar, fsa));
			writer.write(newInternalParserText);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private String newInternalParserText(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
		String oldInternalParserText=oldInternalParserText(parserGrammar, fsa);
		String newInternalParserText=oldInternalParserText+"";
		
		String javaParserName = parserGrammar.getGrammarFileName().substring(0,parserGrammar.getGrammarFileName().length()-2);
		int lastIndex = javaParserName.lastIndexOf("/");
		javaParserName=javaParserName.substring(lastIndex+1);
		List<EClassifier> patterPropertiesEClasses =getPatterPropertiesEClasses();
		for (EClassifier patterPropertiesEClass :patterPropertiesEClasses){
			String fragmentRegex = buildFragmentRegex(javaParserName, patterPropertiesEClass.getName());
			Pattern pattern = Pattern.compile(fragmentRegex, Pattern.MULTILINE);
			Matcher matcher = pattern.matcher(newInternalParserText);
			boolean matchFound = matcher.find();
			if(matchFound) {
//				System.out.println(matcher.start()+","+matcher.end());
				String predicateStringIndex= matcher.group(1);
//				System.out.println(patterPropertiesEClass.getName()+","+predicateStringIndex);
				
				String booleanSynpredRegex = buildBooleanSynpredRegex( predicateStringIndex,  javaParserName);
				String semanticPredicate =buildSemanticPredicate(patterPropertiesEClass);
				String newBooleanSynpred = buildNewBooleanSynpred( booleanSynpredRegex,  semanticPredicate);
				newInternalParserText=newInternalParserText.replaceAll(booleanSynpredRegex, newBooleanSynpred);
//				newInternalParserText=newInternalParserText.replaceAll(booleanSynpredRegex, Matcher.quoteReplacement(newBooleanSynpred));
			}
			
		}
		return newInternalParserText;
	}
	
	private String buildNewBooleanSynpred(String booleanSynpredRegex, String semanticPredicate){
//		return booleanSynpredRegex+"\r\n\t\t"+semanticPredicate;
		return booleanSynpredRegex+"\r\n\t\t"+Matcher.quoteReplacement(semanticPredicate);
	}
	
	private String buildSemanticPredicate(EClassifier patterPropertiesEClass){
		String pattern= patterPropertiesEClass.getEAnnotation("PatternProperties").getDetails().get("pattern");
//		return "if (!jku.se.atl.transformation.utils.Utils.lookingAt(\""+pattern+"\", input.LT(1).getText().substring(1,input.LT(1).getText().length() - 1)))  return false;";
		return "if (!jku.se.atl.transformation.utils.Utils.find(\""+pattern+"\", input.LT(1).getText().substring(1,input.LT(1).getText().length() - 1)))  return false;";
	}
	
	private String buildFragmentRegex(String javaParserName, String patternPropertiesName){
//		return "public final void synpred(\\d+)_"+javaParserName+"_fragment\\(\\).*$(\n|\r|\r\n)^.*rule("+patternPropertiesName+")";
		return "public final void synpred(\\d+)_"+javaParserName+"_fragment\\(\\).*$(\n|\r|\r\n)^.*rule("+patternPropertiesName+")\\s";
	}
	
	private String buildBooleanSynpredRegex(String predicateStringIndex, String javaParserName){
		return "public final boolean synpred"+predicateStringIndex+"_"+javaParserName+"\\(\\) \\{";
	}
	
	private String oldInternalParserText(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
		try {
			String oldInternalParserText="";
			String javaInternalParserFullName =javaInternalParserFullName(parserGrammar, fsa);
			File file = new File(javaInternalParserFullName);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			
			while((line = reader.readLine()) != null)  {
			     oldInternalParserText += line + "\r\n";
			}
			reader.close();
			return oldInternalParserText;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	private String javaInternalParserFullName(AntlrGrammar parserGrammar,IXtextGeneratorFileSystemAccess fsa){
		String javaParserFile = parserGrammar.getGrammarFileName().substring(0,parserGrammar.getGrammarFileName().length()-1)+"java";
		String javaInternalParserFullName =fsa.getPath()+"//"+javaParserFile;
		return javaInternalParserFullName;
	}
	
	/**
	 * 
	 * @return the EClasses that have the PatternProperties annotation 
	 */
	private List<EClassifier> getPatterPropertiesEClasses(){
		List<EClassifier> patterPropertiesEClasses = ePackage.getEClassifiers().stream()
			.filter(eClassifier -> eClassifier instanceof EClass)
			.filter(eClass -> eClass.getEAnnotation("PatternProperties")!=null).collect(Collectors.toList());
			
		return patterPropertiesEClasses;
	}
}
