package xtextgenerator.wizard;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.util.IJdtHelper;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.EPackageChooser;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;

public class EPackageChooserExtended extends EPackageChooser{

	public EPackageChooserExtended(Shell shell, IJdtHelper jdtHelper) {
		super(shell, jdtHelper);
	}
	@Override
	protected List<EPackageInfo> createEPackageInfosFromGenModel(URI genModelURI){
		return super.createEPackageInfosFromGenModel(genModelURI);
	}

}
