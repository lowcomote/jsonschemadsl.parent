package at.jku.bise.ide.syntaxcoloring

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.emf.ecore.EObject
import javax.inject.Inject
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.util.CancelIndicator
import at.jku.bise.services.JsonSchemaDslGrammarAccess
import jsonMetaschemaMM.JsonMetaschemaMMPackage
import jsonMetaschemaMM.KeySchemaPair
import jsonMetaschemaMM.StringArray
import org.eclipse.xtext.resource.XtextResource
import java.util.Iterator
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.TerminalRule
import org.eclipse.xtext.RuleCall

class JSONSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	
	@Inject package JsonSchemaDslGrammarAccess grammar
	
	override protected highlightElement(EObject object, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		switch(object) {
			KeySchemaPair: {	
				highlightFeature(acceptor, object, JsonMetaschemaMMPackage.eINSTANCE.keySchemaPair_Key, HighlightingStyles.DEFAULT_ID)				
				return false;
			}
			//TODO String Array I think that we need to change the meta-model
			//StringArray:{
			//	println(object.toString)
			//	highlightFeature(acceptor, object, JsonMetaschemaMMPackage.eINSTANCE.stringArray_Values, HighlightingStyles.STRING_ID)
			//	return false;
			//}
			default: {				
				return false;
			}			
		}	
	}	
	//TODO a ver si funciona!	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		var Iterator<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable().iterator();
		while(allNodes.hasNext()) {
			var INode node = allNodes.next
			println("object" + node.grammarElement)
			if (node.grammarElement instanceof TerminalRule) {
				var TerminalRule tRule = node.grammarElement as TerminalRule;				
				println("object" + tRule.name)
			}		 
			if 	(node.grammarElement instanceof RuleCall) {
				var RuleCall tRuleCall = node.grammarElement as RuleCall;				
				println("object" + tRuleCall.arguments)
			}
		}
		super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
	}
	
}