package jku.se.atl.transformation.utils;

public class Utils {
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String getIdentifier(String str) {
		String regex = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
		if(str.matches(regex)) {
			return str;
		}
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	        if ((i == 0 && Character.isJavaIdentifierStart(str.charAt(i))) || (i > 0 && Character.isJavaIdentifierPart(str.charAt(i))))
	            sb.append(str.charAt(i));
	        else
	            sb.append((int)str.charAt(i));
	    }
	    return sb.toString();
	}
}
