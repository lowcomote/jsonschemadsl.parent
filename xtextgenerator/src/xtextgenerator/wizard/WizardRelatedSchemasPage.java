package xtextgenerator.wizard;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.xtext.ui.util.IJdtHelper;

import com.google.common.collect.Iterables;

public class WizardRelatedSchemasPage extends WizardPage{

	private IFile relatedSchemasFile;
	
	

	private TableViewer importedEPackagesViewer;
	
	private final IJdtHelper jdtHelper;

	public WizardRelatedSchemasPage(String pageName, IStructuredSelection selection, IJdtHelper jdtHelper) {
		super(pageName);
		this.jdtHelper = jdtHelper;
		this.relatedSchemasFile = null;
		setTitle("Some Title");
		setDescription("Some Description");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		Label label = new Label(composite, SWT.NONE);
		label.setText("Messages.WizardSelectImportedEPackagePage_ListTitle");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));
		importedEPackagesViewer = new TableViewer(composite, SWT.BORDER);
		importedEPackagesViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		importedEPackagesViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return Iterables.toArray(Arrays.asList(relatedSchemasFile), IFile.class);
			}
		});
		importedEPackagesViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof IFile) {
					return ((IFile) element).getName();							
				}
				return element.toString();
			}
		});		
		//Add Customize JSON Grammar
		Button addButton = new Button(composite, SWT.PUSH);
		addButton.setText("Add Related Schemas");
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, false, false, 1, 1));
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceSelectionDialog dialog = new ResourceSelectionDialog 
						(getShell(), ResourcesPlugin.getWorkspace().getRoot(),
						"Select file");
				dialog.setTitle("Select *.jsongrammar, *.xmi");
				int returnCode = dialog.open();
				if (returnCode == 0 && dialog.getResult().length == 1) {
					Object fileResult = dialog.getResult()[0];
					if (fileResult instanceof IFile) {
						relatedSchemasFile = (IFile) fileResult;
						updateUI();
					}
				}
			}
		});
		
		//Delete Customize JSON Grammar
		Button removeButton = new Button(composite, SWT.PUSH);
		removeButton.setText("Delete");
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = importedEPackagesViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					for (Iterator<?> i = ((IStructuredSelection) selection).iterator(); i.hasNext();) {
						relatedSchemasFile = null;
					}
				}
				updateUI();
			}
		});
		updateUI(); // added by Alessandro to make it work with jschema selection, so the the jsongrammar file can be filled before the dialog creation
		setControl(composite);		
//		setPageComplete(false); // added by Alessandro
	}
	
	private void updateUI() {
		importedEPackagesViewer.setInput(this.relatedSchemasFile);
		importedEPackagesViewer.refresh();
		validatePage();
	}
	
	private void validatePage() {
		setPageComplete(this.relatedSchemasFile != null);
	}
	
	public IFile getRelatedSchemasFile() {
		return this.relatedSchemasFile;
	}
	
	public void setRelatedSchemasFile(IFile relatedSchemasFile) {
		this.relatedSchemasFile = relatedSchemasFile;
//		updateUI();
	}
}
