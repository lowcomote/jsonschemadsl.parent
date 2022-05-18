package xtextgenerator.wizard;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectInfo;
import org.eclipse.xtext.xtext.wizard.ProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.RuntimeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.TestProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.TestedProjectDescriptor;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class XtextJsonGrammarProjectInfo extends XtextProjectInfo {
	
	private final RuntimeProjectDescriptorJSON runtimeProjectJsonGrammar = new RuntimeProjectDescriptorJSON(this);
	private IFile jsonGrammarFile = null;
	private IFile relatedSchemasFile = null;
	
	@Override
	public Set<ProjectDescriptor> getEnabledProjects() {
		Iterable<ProjectDescriptor> productionProjects = Iterables.filter(
				Lists.newArrayList(getParentProject(), runtimeProjectJsonGrammar/*getRuntimeProject()*/, getIdeProject(),
						getUiProject(), getWebProject(), getTargetPlatformProject(), getSdkProject(), getP2Project()),
				ProjectDescriptor::isEnabled);
		Iterable<TestProjectDescriptor> testProjects = Iterables
				.filter(Iterables.transform(
						Iterables.filter(productionProjects, TestedProjectDescriptor.class),
						TestedProjectDescriptor::getTestProject), it -> it.isEnabled() && it.isSeparate());
		return ImmutableSet.copyOf(Iterables.concat(productionProjects, testProjects));
	}	
	
	public void setJsonGrammarFile(IFile jsonGrammarFile) {
		this.jsonGrammarFile = jsonGrammarFile;
	}
	
	public IFile getJsonGrammarFile() {
		return this.jsonGrammarFile;
	}
	
	
	
	
	public IFile getRelatedSchemasFile() {
		return relatedSchemasFile;
	}

	public void setRelatedSchemasFile(IFile relatedSchemasFile) {
		this.relatedSchemasFile = relatedSchemasFile;
	}

	@Override
	public boolean needsTychoBuild() {
		return needsMavenBuild() && getRuntimeProject().isEclipsePluginProject();
	}
	
	@Override
	public RuntimeProjectDescriptor getRuntimeProject() {
		return this.runtimeProjectJsonGrammar;
	}
}
