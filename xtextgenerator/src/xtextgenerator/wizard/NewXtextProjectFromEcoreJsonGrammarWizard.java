package xtextgenerator.wizard;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.util.IJdtHelper;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipse.xtext.util.JavaVersion;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xtext.ui.Activator;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Messages;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectCreator;
import org.eclipse.xtext.xtext.wizard.BuildSystem;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor.FileExtensions;
import org.eclipse.xtext.xtext.wizard.ProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.ProjectLayout;
import org.eclipse.xtext.xtext.wizard.RuntimeProjectDescriptor;
import org.eclipse.xtext.xtext.wizard.TestedProjectDescriptor;
import org.osgi.framework.BundleException;

import com.google.inject.Inject;

import relatedSchemas.EnclosingSchema;
import relatedSchemas.RelatedSchemas;
import xtextgenerator.utils.ManifestChanger;
import xtextgenerator.wizard.OclValidatorGenerator;




//public class NewXtextProjectFromEcoreJsonGrammarWizard extends NewXtextProjectWizard {
public class NewXtextProjectFromEcoreJsonGrammarWizard extends XtextNewProjectWizard {
		
	public static final String JSON_GRAMMAR_CREATION_PAGE_NAME ="Selection Custom JSON Grammar Specification";
	public static final String RELATED_SCHEMAS_CREATION_PAGE_NAME ="Selection Related Schemas model";
	public static final String E_PACKAGE_CREATION_PAGE_NAME = "ePackageSelectionPage";
	public static final String MAIN_PAGE ="mainPage";
	public static final String ADVANCED_PAGE = "advancedPage";
	public static final String OCL_PAGE_NAME ="Selection OCL File";
	public static final String GENERATE = "Generate";
	public static final String DOT_PARENT =".parent";
	public static final String LAUNCH_FOLDER=".launch";
	public static final String SPACE_OPEN_PARETHESIS= " (";
	public static final String LANGUAGE_INFRASTRUCTURE = ") Language Infrastructure";
	public static final String LAUNCH_EXTENSION ="launch";
	public static final String OCL_BUNDLE = "org.eclipse.ocl.xtext.completeocl";
	public static final String JSONASSERT_BUNDLE= "wrapped.org.skyscreamer.jsonassert";
	public static final String JSON_BUNDLE="org.json";
	public static final String RELATED_SCHEMAS_BUNDLE="relatedSchemas";
	public static final String EMF_CONVERTES_BUNDLE="org.eclipse.emf.converter";
	
	public static final String SOURCE_FOLDER="src";
	public static final String VALIDATION_FOLDER="validation";
	public static final String VALIDATOR_CLASS_SUFFIX="Validator";
	
	private final IJdtHelper jdtHelper;
	
//	private WizardSelectImportedEPackagePage ePackageSelectionPage  = null;
	private WizardNewJSonGrammarCreationPage grammarSelectionPage = null;
	private WizardRelatedSchemasPage wizardRelatedSchemasPage = null;
	private WizardJsonGrammarSelectImportedEPackagePage ePackageSelectionPage  = null;
	private WizardOclCreationPage oclSelectionPage= null;
	private WizardJsonGrammarNewXtextProjectCreationPage mainPage = null;
	private AdvancedJsonGrammarNewProjectPage advancedPage = null;

	private RuntimeProjectDescriptorJSON runtimeProjectDescriptorJSON = null;
	/**
	 * Constructs a new wizard
	 */
	@Inject
	public NewXtextProjectFromEcoreJsonGrammarWizard(XtextProjectCreator creator, IJdtHelper jdtHelper) {
		super(creator);
		this.jdtHelper = jdtHelper;
		setWindowTitle(Messages.NewXtextProjectFromEcoreWizard_WindowTitle);
		setDefaultPageImageDescriptor(Activator.getImageDescriptor("icons/wizban/newxprj_wiz.gif")); //$NON-NLS-1$
	}

	@Override
	public void addPages() {
//		ePackageSelectionPage = new WizardSelectImportedEPackagePage("ePackageSelectionPage", selection, jdtHelper);
//		grammarSelectionPage = new WizardNewJSonGrammarCreationPage(JSON_GRAMMAR_CREATION_PAGE_NAME, selection, jdtHelper);
//		addPage(grammarSelectionPage);
		addGrammarSelectionPage();
		addRelatedSchemasSelectionPage();
//		addPage(ePackageSelectionPage); //$NON-NLS-1$	
		addEPackageSelectionPage();
		addOclSelectionPage();
//		super.addPages();
		addMainPage();
		addAdvancedPage();
	}

	@Override
	protected IProjectInfo getProjectInfo() {
//		XtextJsonGrammarProjectInfo projectInfo = (XtextJsonGrammarProjectInfo) super.getProjectInfo();
		XtextJsonGrammarProjectInfo projectInfo = (XtextJsonGrammarProjectInfo) createXtextJsonGrammarProjectInfo();
		projectInfo.setJsonGrammarFile(this.grammarSelectionPage.getJsonGrammarFile());
		projectInfo.setRelatedSchemasFile(this.wizardRelatedSchemasPage.getRelatedSchemasFile());
		
//		RuntimeProjectDescriptor runtimeProjectDescriptor = projectInfo.getRuntimeProject();
		// Cast to RuntimeProjectDescriptorJSON and set detailedJsonGrammar and relatedSchemas
		RuntimeProjectDescriptorJSON runtimeProjectDescriptor = (RuntimeProjectDescriptorJSON) projectInfo.getRuntimeProject();
		this.runtimeProjectDescriptorJSON = runtimeProjectDescriptor;
		
		
		runtimeProjectDescriptor.setWithPluginXml(false);
		Ecore2XtextConfiguration ecore2Xtext = projectInfo.getEcore2Xtext();
		ecore2Xtext.getEPackageInfos().addAll(ePackageSelectionPage.getEPackageInfos());
		ecore2Xtext.setRootElementClass(ePackageSelectionPage.getRootElementClass());
		ecore2Xtext.setDefaultEPackageInfo(ePackageSelectionPage.getDefaultEPackageInfo());
		
		runtimeProjectDescriptor.setDetailedGrammar();
		runtimeProjectDescriptor.setRelatedSchemas();
		
		return projectInfo;
	}
	
	private IProjectInfo createXtextJsonGrammarProjectInfo() {
//		XtextProjectInfo projectInfo = createProjectInfo();
		XtextJsonGrammarProjectInfo projectInfo = new XtextJsonGrammarProjectInfo();
		LanguageDescriptor language = projectInfo.getLanguage();
		language.setFileExtensions(FileExtensions.fromString(mainPage.getFileExtensions()));
		language.setName(mainPage.getLanguageName());
		projectInfo.setBaseName(mainPage.getProjectName());
		projectInfo.setWorkingSets(Arrays.asList(mainPage.getSelectedWorkingSets()));
		projectInfo.setRootLocation(mainPage.getLocationPath().toString());
		Charset encoding = null;
		try {
			encoding = Charset.forName(ResourcesPlugin.getWorkspace().getRoot().getDefaultCharset());
		}
		catch (final CoreException e) {
			encoding = Charset.defaultCharset();
		}
		projectInfo.setEncoding(encoding);
		String lineDelimiter = InstanceScope.INSTANCE.getNode("org.eclipse.core.runtime").get("line.separator", Strings.newLine());
		projectInfo.setLineDelimiter(lineDelimiter);
		projectInfo.setWorkbench(getWorkbench());
		JavaVersion selectedBree = mainPage.getJavaVersion();
		// Use old default for wizard as fall back, when something goes wrong
		if (selectedBree != null) {
			projectInfo.setJavaVersion(selectedBree);
		}

		BuildSystem buildSystem = advancedPage.getPreferredBuildSystem();
		projectInfo.setPreferredBuildSystem(buildSystem);
		projectInfo.setSourceLayout(advancedPage.getSourceLayout());
		
		projectInfo.getUiProject().setEnabled(advancedPage.isCreateUiProject());
		if (buildSystem != BuildSystem.NONE) {
			projectInfo.setProjectLayout(ProjectLayout.HIERARCHICAL);
		}
		projectInfo.getIdeProject().setEnabled(advancedPage.isCreateIdeProject());
		projectInfo.getWebProject().setEnabled(advancedPage.isCreateWebProject());
		projectInfo.getSdkProject().setEnabled(advancedPage.isCreateSdkProject());
		projectInfo.getP2Project().setEnabled(advancedPage.isCreateP2Project());
		projectInfo.setLanguageServer(advancedPage.getLanguageServer());
		projectInfo.setJunitVersion(advancedPage.getSelectedJUnitVersion());
		
		if (advancedPage.isCreateTestProject()) {
			for (ProjectDescriptor project : projectInfo.getEnabledProjects()) {
				if (project instanceof TestedProjectDescriptor) {
					((TestedProjectDescriptor) project).getTestProject().setEnabled(true);
				}
			}
		}
		return projectInfo;
	}
	
//	@Override
//	protected XtextProjectInfo createProjectInfo() {
//		return new XtextJsonGrammarProjectInfo();
//	}
//	
	public void addGrammarSelectionPage() {
		if(grammarSelectionPage==null) {
			grammarSelectionPage = new WizardNewJSonGrammarCreationPage(JSON_GRAMMAR_CREATION_PAGE_NAME, selection, jdtHelper);
			addPage(grammarSelectionPage);
		}
	}
	
	public void addRelatedSchemasSelectionPage() {
		if(wizardRelatedSchemasPage==null) {
			wizardRelatedSchemasPage = new WizardRelatedSchemasPage(RELATED_SCHEMAS_CREATION_PAGE_NAME, selection, jdtHelper);
			addPage(wizardRelatedSchemasPage);
		}
	}
	
	public void addEPackageSelectionPage() {
		if(ePackageSelectionPage==null) {
//			ePackageSelectionPage = new WizardSelectImportedEPackagePage(E_PACKAGE_CREATION_PAGE_NAME, selection, jdtHelper);  
			ePackageSelectionPage = new WizardJsonGrammarSelectImportedEPackagePage(E_PACKAGE_CREATION_PAGE_NAME, selection, jdtHelper);  
			addPage(ePackageSelectionPage);
		}
	}
	
	
	
	public void addOclSelectionPage() {
		if(oclSelectionPage==null) {
			oclSelectionPage = new WizardOclCreationPage(OCL_PAGE_NAME, selection, jdtHelper);
			addPage(oclSelectionPage);
		}
	}
	
	public void addMainPage() {
//		WizardNewXtextProjectCreationPage mainPage = getMainPage();
		WizardJsonGrammarNewXtextProjectCreationPage mainPage = getMainPage();
		if(mainPage==null) {
//			mainPage = new WizardNewXtextProjectCreationPage(MAIN_PAGE, this.selection); //$NON-NLS-1$
			this.mainPage = new WizardJsonGrammarNewXtextProjectCreationPage(MAIN_PAGE, this.selection); //$NON-NLS-1$
			addPage(this.mainPage);
		}
	}
	
	public void addAdvancedPage() {
		AdvancedJsonGrammarNewProjectPage advancedPage = getAdvancedPage();
		if(advancedPage==null) {
			this.advancedPage = new AdvancedJsonGrammarNewProjectPage(ADVANCED_PAGE);
			addPage(this.advancedPage);
		}
	}

	public WizardNewJSonGrammarCreationPage getGrammarSelectionPage() {
		return grammarSelectionPage;
	}
	
//	public WizardSelectImportedEPackagePage getePackageSelectionPage() {
	public WizardJsonGrammarSelectImportedEPackagePage getePackageSelectionPage() {
		return ePackageSelectionPage;
	}
	
	public void setJsonGrammarFile(IFile jsonGrammarFile) {
		addGrammarSelectionPage();
		grammarSelectionPage.setJsonGrammarFile(jsonGrammarFile);
	}
	
	public void setRelatedSchemasFile(IFile relatedSchemasFile) {
		addRelatedSchemasSelectionPage();
		wizardRelatedSchemasPage.setRelatedSchemasFile(relatedSchemasFile);
	}
	
	public void setGenModelSelection(URI genModelURI) {
//		List<EPackageInfo> ePackageInfos = Lists.newArrayList();
		addEPackageSelectionPage();
		Collection<EPackageInfo> ePackageInfos = ePackageSelectionPage.getEPackageInfos();
		EPackageChooserExtended ePackageChooser = new EPackageChooserExtended(getShell(), jdtHelper);
		ePackageInfos.addAll(ePackageChooser.createEPackageInfosFromGenModel(genModelURI));
	}
	
	public void setOclFile(IFile oclFile) {
		addOclSelectionPage();
		oclSelectionPage.setOclFile(oclFile);
	}
	
	public void setSetRootClass(EClass rootEClass) {
		ePackageSelectionPage.setSetRootClass( rootEClass);
	}
	
//	public WizardNewXtextProjectCreationPage getMainPage() {
//		return (WizardNewXtextProjectCreationPage) getPage(MAIN_PAGE);
//	}
	
	public WizardJsonGrammarNewXtextProjectCreationPage getMainPage() {
//		return (WizardJsonGrammarNewXtextProjectCreationPage) getPage(MAIN_PAGE);
		return this.mainPage;
	}
	
//	WizardJsonGrammarNewXtextProjectCreationPage
	public AdvancedJsonGrammarNewProjectPage getAdvancedPage() {
//		return (AdvancedJsonGrammarNewProjectPage) getPage(ADVANCED_PAGE);
		return this.advancedPage;
	}
	
	public void setInitialProjectName(String name) {
		getMainPage().setInitialProjectName(name);
	}
	
	public void setInitialLanguageNameField(String initialLanguageNameField) {
		getMainPage().setInitialLanguageNameField(initialLanguageNameField);
	}
	
	public void setInitialExtensionsField(String initialExtensionsField) {
		getMainPage().setInitialExtensionsField(initialExtensionsField);
	}
	
	public String getProjectName() {
		return this.mainPage.getProjectName();
	}
	
	public String getLanguageName() {
		return this.mainPage.getLanguageName();
	}
	 
	@Override
	public boolean performFinish() {
		boolean result = super.performFinish();
		
		if(result) {
			result = addPluginDependency();
		}
		if(result) {
//			result =generateOclValidator();
			result =generateAllValidators();
		}
		if(result) {
			result = launchGenerateMwe2();
		}
		return result;
	}	
	
	
	private boolean  launchGenerateMwe2() {
		try {
			String projectName = getProjectName();
			String languageName =getLanguageName();
			String languageFromLastDot = languageName.substring(languageName.lastIndexOf(".")+1);
			IPath mwe2Path = new Path("/"); 
			mwe2Path = mwe2Path.append(projectName+DOT_PARENT).append(projectName).append(LAUNCH_FOLDER);
			
			mwe2Path= mwe2Path.append(GENERATE+" "+languageFromLastDot+SPACE_OPEN_PARETHESIS+mainPage.getFileExtensions()+LANGUAGE_INFRASTRUCTURE);
			mwe2Path= mwe2Path.addFileExtension(LAUNCH_EXTENSION);
			IWorkspace workspace= ResourcesPlugin.getWorkspace();  
			IFile launchFile = workspace.getRoot().getFile(mwe2Path); 
			try {
				launchFile.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				e.printStackTrace();
				return false;
			}
			IFileLaunchConfiguration launchConfiguration = new IFileLaunchConfiguration(launchFile); //workspace.getRoot().getFile(((IPath)new Path("//")).append(mwe2Path))
			DebugUITools.launch(launchConfiguration, ILaunchManager.RUN_MODE, false);
//			DebugUIPlugin.launchInForeground(launchConfiguration, ILaunchManager.RUN_MODE);
//			launchConfiguration.launch(ILaunchManager.RUN_MODE, null);
			 
		} catch (RuntimeException e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	/**
	 * Add org.eclipse.ocl.xtext.completeocl dependency to the Manifest.MF
	 * https://www.eclipse.org/forums/index.php/t/109193/
	 * https://rtist.hcldoc.com/help/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fapi%2Forg%2Feclipse%2Fosgi%2Futil%2FManifestElement.html
	 * @return
	 */
	private boolean  addPluginDependency() {
		try {
			IPath manifestIPath = ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectName()).getLocation().append("META-INF").append("MANIFEST");
			manifestIPath=manifestIPath.addFileExtension("MF");
		
			ManifestChanger manifestChanger = new ManifestChanger(manifestIPath.toString());
//			String oclVersion= Platform.getBundle("org.eclipse.ocl.xtext.completeocl").getVersion().toString();
			manifestChanger.addPluginDependency(OCL_BUNDLE);
			manifestChanger.addPluginDependency(RELATED_SCHEMAS_BUNDLE);
			manifestChanger.addPluginDependency(EMF_CONVERTES_BUNDLE);
			
			manifestChanger.addPluginDependency(JSONASSERT_BUNDLE);
			manifestChanger.addPluginDependency(JSON_BUNDLE);;
			manifestChanger.writeManifest();
//			InputStream in = new FileInputStream(manifestIPath.toString());
//			Manifest manifest = new Manifest(in);//manifest.getMainAttributes().get("Require-Bundle"); Attributes.Name.
			
			return true;
		} catch (BundleException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	private boolean generateOclValidator() {
		try {
			String projectName = getProjectName();
			String languageToLastDot = getLanguageToLastDot();
			String languageFromLastDot = getLanguageFromLastDot();
//			IPath validationFilePath = new Path("/"); 
			IPath validationFilePath = ResourcesPlugin.getWorkspace().getRoot().getLocation(); 
			validationFilePath = validationFilePath.append(projectName+DOT_PARENT).append(projectName).append(SOURCE_FOLDER);
			
			String classPackage = languageToLastDot+"."+VALIDATION_FOLDER;
			String className = languageFromLastDot+VALIDATOR_CLASS_SUFFIX;
			
			String[] classPackageSplit = classPackage.split("\\.");
			for (String split :classPackageSplit) {
				validationFilePath = validationFilePath.append(split);
			}
			File validationDirectory =validationFilePath.toFile();
			if(!validationDirectory.exists()) {
				validationDirectory.mkdir();
				
			}
			validationFilePath = validationFilePath.append(className).addFileExtension("java");
			
			String fileName = validationFilePath.toString(); 
			
			String modelPackage = this.ePackageSelectionPage.getEPackageInfos().iterator().next().getEPackageJavaFQN();
			String oclPath = this.oclSelectionPage.getOclFile().getFullPath().toString();
			
			OclValidatorGenerator.create(fileName, classPackage, className, modelPackage, oclPath);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	private boolean generateAllValidators() {
		
		String projectName = getProjectName();
		String languageToLastDot = getLanguageToLastDot();
		RelatedSchemas relatedSchemas =runtimeProjectDescriptorJSON.getRelatedSchemas();
		EClass mainRootElementClass = ePackageSelectionPage.getRootElementClass();
		IPath validationFolderPath = ResourcesPlugin.getWorkspace().getRoot().getLocation()
				.append(projectName+DOT_PARENT).append(projectName).append(SOURCE_FOLDER); 
		String classPackage = languageToLastDot+"."+VALIDATION_FOLDER;
		String[] classPackageSplit = classPackage.split("\\.");
		for (String split :classPackageSplit) {
			validationFolderPath = validationFolderPath.append(split);
		}
		File validationDirectory =validationFolderPath.toFile();
		if(!validationDirectory.exists()) {
			validationDirectory.mkdir();
		}
		String modelPackage = this.ePackageSelectionPage.getEPackageInfos().iterator().next().getEPackageJavaFQN();
		String oclPath = this.oclSelectionPage.getOclFile().getFullPath().toString();
//		boolean isMainRootElementClassProcessed = false;
		
//		for (EnclosingSchema enclosingSchema : relatedSchemas.getEnclosingschemas()) {
		for (EClass rootElementEclass : runtimeProjectDescriptorJSON.getRootElementEnclosingSchemaMap().keySet()) {
			boolean isMainRootElementClass = rootElementEclass == mainRootElementClass;
			String className;
			String fileName;
			if(isMainRootElementClass) {
//				isMainRootElementClassProcessed = true;
				String languageFromLastDot = getLanguageFromLastDot();
				className = languageFromLastDot+VALIDATOR_CLASS_SUFFIX;
			}else {
				className = rootElementEclass.getName()+VALIDATOR_CLASS_SUFFIX;
			}
			IPath validationFilePath = validationFolderPath.append(className).addFileExtension("java");
			fileName = validationFilePath.toString(); 
			try {
				ValidatorGenerator.create(fileName, classPackage, className, modelPackage, oclPath, runtimeProjectDescriptorJSON.getRootElementEnclosingSchemaMap().get(rootElementEclass), isMainRootElementClass,wizardRelatedSchemasPage.getRelatedSchemasFile());
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
//		if(!isMainRootElementClassProcessed) {
//			String languageFromLastDot = getLanguageFromLastDot();
//			String className = languageFromLastDot+VALIDATOR_CLASS_SUFFIX;
//			IPath validationFilePath = validationFolderPath.append(className).addFileExtension("java");
//			String fileName = validationFilePath.toString(); 
//			try {
//				ValidatorGenerator.create(fileName, classPackage, className, modelPackage, oclPath, null, true);
//			} catch (IOException e) {
//				e.printStackTrace();
//				return false;
//			}
//		}
		return true;
	}

	private String getLanguageToLastDot(){
		String languageName =getLanguageName();
		String languageToLastDot = languageName.substring(0,languageName.lastIndexOf("."));
		return languageToLastDot;
	}
	private String getLanguageFromLastDot(){
		String languageName =getLanguageName();
		String languageFromLastDot = languageName.substring(languageName.lastIndexOf(".")+1);
		return languageFromLastDot;
	}
}
