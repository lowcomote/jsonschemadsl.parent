package at.jku.bise.oclgenerator;

import at.jku.bise.oclgenerator.OclWriter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class OclGenerator {
  public static void createOcl(final String fileName, final String importContent, final String packageName) {
    try {
      OclWriter.create(fileName);
      OclWriter.append(fileName, OclGenerator.initializeOcl(importContent, packageName));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence initializeOcl(final String importContent, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import \'");
    _builder.append(importContent);
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static void endPackage(final String fileName) {
    try {
      OclWriter.append(fileName, OclGenerator.endPackage());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence endPackage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("endpackage");
    _builder.newLine();
    return _builder;
  }
  
  public static void appendMinimumConstraint(final String fileName, final String contextClass, final Double minimum) {
    try {
      OclWriter.append(fileName, OclGenerator.generateMinimumConstraint(contextClass, minimum));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence generateMinimumConstraint(final String contextClass, final Double minimum) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("context ");
    _builder.append(contextClass);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("inv ");
    _builder.append(contextClass);
    _builder.append("Minimum(\'The value of Shipyard2RootTestInteger must be greater or equal than ");
    _builder.append(minimum);
    _builder.append("\'):");
    _builder.newLineIfNotEmpty();
    _builder.append("if testInteger >= ");
    _builder.append(minimum);
    _builder.newLineIfNotEmpty();
    _builder.append("then true");
    _builder.newLine();
    _builder.append("else null");
    _builder.newLine();
    _builder.append("endif");
    _builder.newLine();
    return _builder;
  }
}
