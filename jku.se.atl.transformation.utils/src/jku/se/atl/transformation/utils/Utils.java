package jku.se.atl.transformation.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public class Utils {
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String getIdentifier(String str) {
//		String regex = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
		/**
		 * The regex for Java would be: regex = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$"
		 * even if $ is valid for a Java identifier it is not for ecore
		 */
		String regex = "^([a-zA-Z_][a-zA-Z\\d_]*)$";
		if(str.matches(regex)) {
			return str;
		}
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	        if ((str.charAt(i)!="$".charAt(0))&& (
	        		(i == 0 && Character.isJavaIdentifierStart(str.charAt(i))) || 
	        		(i > 0 && Character.isJavaIdentifierPart(str.charAt(i)))))
	            sb.append(str.charAt(i));
	        else
	            sb.append("_").append((int)str.charAt(i));
	    }
	    return sb.toString();
	}
	
	public static boolean lookingAt(String pattern, String key) {
   		Pattern p = Pattern.compile(pattern);
   		Matcher m = p.matcher(key);
   		boolean b = m.lookingAt();
   		return b;
   	}
	
	public static boolean find(String pattern, String key) {
   		Pattern p = Pattern.compile(pattern);
   		Matcher m = p.matcher(key);
   		boolean b = m.find();
   		return b;
   	}
	
	public static String escapeJava(String pattern) {
   		return StringEscapeUtils.escapeJava(pattern);
   	}
	
	public static List<EClass> findMatchingPatternPropertiesSiblings(EClass patternProperties, String key, EPackage ePackage) {
		List<EClass> siblings =ePackage.getEClassifiers().stream()
			.filter(eClass -> eClass  instanceof EClass)
			.filter(eClass -> ((EClass)eClass).getEAllSuperTypes().contains(patternProperties.getEAllSuperTypes().get(0)))
			.filter(eClass -> eClass.getName()!=patternProperties.getName())
			.filter(eClass -> eClass.getEAnnotation("PatternProperties")!=null)
			.filter(eClass ->  find(eClass.getEAnnotation("PatternProperties").getDetails().get("pattern"),key))
			.map(EClass.class::cast ).collect(java.util.stream.Collectors.toList());
		return siblings;
	}
}
