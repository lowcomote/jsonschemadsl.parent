package at.jku.bise.ide.syntaxcoloring

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.emf.ecore.EObject
import javax.inject.Inject
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.util.CancelIndicator
import at.jku.bise.services.JsonSchemaDslGrammarAccess
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage
import jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair
import jsonMetaschemaMM.jsonMetaschemaMM.StringArray

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
}