package xtextgenerator.ui;

import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import xtextgenerator.Activator;


public class XtextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Activator.PLUGIN_ID);
	}

	@Override
	protected Injector getInjector() {
		Activator activator = Activator.getDefault();
		return activator != null ? activator.getInjector(Activator.ORG_ECLIPSE_XTEXT_XTEXT) : null;
	}

}
