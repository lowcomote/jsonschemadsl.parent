package xtextgenerator.wizard;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.JUnitVersion;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtext.wizard.AbstractFile;
import org.eclipse.xtext.xtext.wizard.BuildSystem;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.eclipse.xtext.xtext.wizard.ExternalDependency;
import org.eclipse.xtext.xtext.wizard.GradleBuildFile;
import org.eclipse.xtext.xtext.wizard.IdeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor;
import org.eclipse.xtext.xtext.wizard.Outlet;
import org.eclipse.xtext.xtext.wizard.PlainTextFile;
import org.eclipse.xtext.xtext.wizard.PomFile;
import org.eclipse.xtext.xtext.wizard.ProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.RuntimeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.RuntimeTestProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.SourceLayout;
import org.eclipse.xtext.xtext.wizard.TestProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.TestedProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.UiProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WebProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.WizardConfiguration;
import org.eclipse.xtext.xtext.wizard.ecore2xtext.Ecore2XtextGrammarCreator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;

import xtextgenerator.wizard.Ecore2XtextJSONGrammarCreator;

public class RuntimeProjectDescriptorJSON_JAVAOld extends RuntimeProjectDescriptor {
	
//	private final Ecore2XtextJSONGrammarCreatorJava grammarCreator = new Ecore2XtextJSONGrammarCreatorJava();
//	private final Ecore2XtextJSONGrammarCreator grammarCreator = new Ecore2XtextJSONGrammarCreator();
	
	public RuntimeProjectDescriptorJSON_JAVAOld(WizardConfiguration config) {
		super(config);		
	}
	
//	@Override
//	public CharSequence grammar() {
//		CharSequence grammar = null;
//		if (this.isFromExistingEcoreModels())
//			grammar = grammarCreator.grammar(this.getConfig());
//		else
//			defaultGrammar();
//		return grammar;
//	}
//	
////	@Override
////	public Iterable getFiles() {
//		return super.getFiles();
//	}
	
	private CharSequence defaultGrammar() {
	    StringConcatenation _builder = new StringConcatenation();
	    _builder.append("grammar ");
	    String _name = this.getConfig().getLanguage().getName();
	    _builder.append(_name);
	    _builder.append(" with org.eclipse.xtext.common.Terminals");
	    _builder.newLineIfNotEmpty();
	    _builder.newLine();
	    _builder.append("generate ");
	    String _firstLower = StringExtensions.toFirstLower(this.getConfig().getLanguage().getSimpleName());
	    _builder.append(_firstLower);
	    _builder.append(" \"");
	    String _nsURI = this.getConfig().getLanguage().getNsURI();
	    _builder.append(_nsURI);
	    _builder.append("\"");
	    _builder.newLineIfNotEmpty();
	    _builder.newLine();
	    _builder.append("Model:");
	    _builder.newLine();
	    _builder.append("\t");
	    _builder.append("greetings+=Greeting*;");
	    _builder.newLine();
	    _builder.append("\t");
	    _builder.newLine();
	    _builder.append("Greeting:");
	    _builder.newLine();
	    _builder.append("\t");
	    _builder.append("\'Hello\' name=ID \'!\';");
	    _builder.newLine();
	    return _builder;
	  }
	  

}
