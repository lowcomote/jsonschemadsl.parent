package at.jku.bise.ide.syntaxcoloring;

import at.jku.bise.services.JsonSchemaDslGrammarAccess;
import java.util.Iterator;
import javax.inject.Inject;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.NamedArgument;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
  
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    Iterator<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable().iterator();
    while (allNodes.hasNext()) {
      {
        INode node = allNodes.next();
        EObject _grammarElement = node.getGrammarElement();
        String _plus = ("object" + _grammarElement);
        InputOutput.<String>println(_plus);
        EObject _grammarElement_1 = node.getGrammarElement();
        if ((_grammarElement_1 instanceof TerminalRule)) {
          EObject _grammarElement_2 = node.getGrammarElement();
          TerminalRule tRule = ((TerminalRule) _grammarElement_2);
          String _name = tRule.getName();
          String _plus_1 = ("object" + _name);
          InputOutput.<String>println(_plus_1);
        }
        EObject _grammarElement_3 = node.getGrammarElement();
        if ((_grammarElement_3 instanceof RuleCall)) {
          EObject _grammarElement_4 = node.getGrammarElement();
          RuleCall tRuleCall = ((RuleCall) _grammarElement_4);
          EList<NamedArgument> _arguments = tRuleCall.getArguments();
          String _plus_2 = ("object" + _arguments);
          InputOutput.<String>println(_plus_2);
        }
      }
    }
    super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
  }
}
