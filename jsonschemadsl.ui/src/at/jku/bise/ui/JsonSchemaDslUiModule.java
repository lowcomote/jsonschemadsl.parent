/*
 * generated by Xtext 2.23.0
 */
package at.jku.bise.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.jku.bise.ide.syntaxcoloring.JSONSemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class JsonSchemaDslUiModule extends AbstractJsonSchemaDslUiModule {

	public JsonSchemaDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return JSONSemanticHighlightingCalculator.class;
	}
}
