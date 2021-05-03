package at.jku.bise.oclgenerator;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OclWriter {
	
//	private  final static String OCL_EXTENSION = ".ocl";
	private  final static String OCL_EXTENSION = "Ale.ocl";
	
	public static void create(String fileName) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+OCL_EXTENSION));
	    writer.write("-- OCL contraints for "+fileName);
	    writer.newLine();
	    writer.close();
	    
	}
	
	public static void append(String fileName, CharSequence csq) throws IOException {
		FileWriter fw = new FileWriter(fileName+OCL_EXTENSION, true);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.append(csq);
		writer.newLine();
	    writer.close();
	}
	
	

}
