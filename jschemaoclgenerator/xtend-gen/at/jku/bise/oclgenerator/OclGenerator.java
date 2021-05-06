package at.jku.bise.oclgenerator;

import at.jku.bise.oclgenerator.OclWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class OclGenerator {
  public static void createOcl(final URI fileName, final String importContent, final String packageName) {
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
  
  public static void appendMinimumConstraint(final URI fileName, final String contextClass, final String inv, final Double minimum) {
    try {
      OclWriter.append(fileName, OclGenerator.generateMinimumConstraint(contextClass, inv, minimum));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence generateMinimumConstraint(final String contextClass, final String inv, final Double minimum) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("context ");
    _builder.append(contextClass, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inv ");
    _builder.append(inv, "\t");
    _builder.append("(\'The value of ");
    _builder.append(contextClass, "\t");
    _builder.append(" must be greater or equal than ");
    _builder.append(minimum, "\t");
    _builder.append("\'):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if testInteger >= ");
    _builder.append(minimum, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("then true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else null");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("endif");
    _builder.newLine();
    return _builder;
  }
  
  public static void appendRequiredInPropertiesConstraint(final URI fileName, final String contextClass, final String inv, final String requiredProperty, final String requiredClassType, final String propertyName) {
    try {
      OclWriter.append(fileName, OclGenerator.generateRequiredInPropertiesConstraint(contextClass, inv, requiredProperty, requiredClassType, propertyName));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static CharSequence generateRequiredInPropertiesConstraint(final String contextClass, final String inv, final String requiredProperty, final String requiredClassType, final String propertyName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("context ");
    _builder.append(contextClass, "\t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("inv ");
    _builder.append(inv, "\t");
    _builder.append(requiredProperty, "\t");
    _builder.append(" (\'");
    _builder.append(contextClass, "\t");
    _builder.append(" require the property ");
    _builder.append(requiredProperty, "\t");
    _builder.append("\'):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if  ");
    _builder.append(propertyName, "\t");
    _builder.append("->select(p|p.oclType()=");
    _builder.append(requiredClassType, "\t");
    _builder.append(")->size()>0");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("then true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else null");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("endif");
    _builder.newLine();
    return _builder;
  }
  
  public static void endPackage(final URI fileName) {
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
}
