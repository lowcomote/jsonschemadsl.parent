package at.jku.bise.ide.syntaxcoloring;

import at.jku.bise.services.JsonSchemaDslGrammarAccess;
import javax.inject.Inject;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class JSONSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  @Inject
  JsonSchemaDslGrammarAccess grammar;
  
  @Override
  protected boolean highlightElement(final EObject object, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _matched = false;
    if (object instanceof KeySchemaPair) {
      _matched=true;
      this.highlightFeature(acceptor, object, JsonMetaschemaMMPackage.eINSTANCE.getKeySchemaPair_Key(), HighlightingStyles.DEFAULT_ID);
      return false;
    }
    return false;
  }
}
