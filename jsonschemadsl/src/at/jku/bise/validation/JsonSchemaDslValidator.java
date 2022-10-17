/*
 * generated by Xtext 2.23.0
 */
package at.jku.bise.validation;

import java.util.ArrayList;
import java.util.List;
 

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import com.google.common.base.Function;

import jsonMM.JsonDocument;
import jsonMM.KeyValuePair;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.KeySchemaPair;
import jsonMetaschemaMM.PatternPropertiesSchemaDefinition;
import jsonMetaschemaMM.Activator;
import jsonMetaschemaMM.EnumSchemaDefinition;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class JsonSchemaDslValidator extends AbstractJsonSchemaDslValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					JsonSchemaDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	//JsonMetaschemaMMPackage
	
	@Override
	public void register(EValidatorRegistrar registrar) {
		super.register(registrar);
		JsonMetaschemaMMPackage ePackage = JsonMetaschemaMMPackage.eINSTANCE;
	        
//	        OCL ocl0 = OCL.newInstance();
//	        URI oclURI = URI.createPlatformResourceURI(
	        
//	        URI basicOclURI = URI.createPlatformPluginURI("/json-metaschema-MM/model/ocl/fullvalidation.ocl", true);	
//	        URI basicOclURI = URI.createPlatformPluginURI("/jsonmetaschemaMM/model/ocl/fullvalidation.ocl", true);

	        
//	        URI basicOclURI = URI.createPlatformPluginURI("/jsonmetaschemaMM/model/ocl/fullvalidation.ocl", true);
	        
	        
//	        URI basicOclURI = URI.createURI(Activator.getDefault().getBundle().getResource("/jsonmetaschemaMM/model/ocl/fullvalidation.ocl").toString());
	        
	        
		URI basicOclURI = URI.createURI(Activator.getDefault().getBundle().getResource("model/ocl/fullvalidation.ocl").toString());
		registrar.register(ePackage, new CompleteOCLEObjectValidator(ePackage, basicOclURI));
	        
	        
//	        new CompleteOCLEObjectValidator(ePackage, oclURI,ocl0.getEnvironmentFactory()));
	        
	        
	        
	}
	 
	@Check
	public void patternsValidator(PatternPropertiesSchemaDefinition patternPropertiesSchemaDefinition){
		List<String> invalidPatterns = new ArrayList<String>();
		for (KeySchemaPair keySchemaPair : patternPropertiesSchemaDefinition.getKeySchemaPairs()) {
			try{
				java.util.regex.Pattern.compile(keySchemaPair.getKey());
			}catch (java.util.regex.PatternSyntaxException e){
				 invalidPatterns.add(keySchemaPair.getKey());
			}
		}
		if(!invalidPatterns.isEmpty()) {
			for (String invalidPattern: invalidPatterns) {
				error("The pattern "+invalidPattern+" is not a valida regular expression", null);
			}
		}
	}
	 
	@Check
	public void enumValidator(EnumSchemaDefinition enumSchemaDefinition){
	int index=0;
		try {
			for(JsonDocument jsonDocument : enumSchemaDefinition.getItems()) {
				for (int j=index+1; j<enumSchemaDefinition.getItems().size(); j++ ) {
					if(equalJsonDocuments(jsonDocument, enumSchemaDefinition.getItems().get(j))) {
						error("The Json in position "+index+" and "+j+" are equal", null);
					}
				}
				index++;
			}
		} catch (JSONException e) {
			e.printStackTrace();
			error("Error parsing a Json of the enumeration", null);
		}
	}
	
	
	public boolean equalJsonDocuments(JsonDocument jsonDocument1, JsonDocument jsonDocument2) throws JSONException{
		return jsonDocument1.equals(jsonDocument2);
		 
	}
	 
	 
	private boolean areEqualJsonDocuments(JsonDocument jsonDocument1, JsonDocument jsonDocument2) throws JSONException{
		String stringJsonDocument1 = NodeModelUtils.getTokenText(NodeModelUtils.getNode(jsonDocument1));
		String stringJsonDocument2 = NodeModelUtils.getTokenText(NodeModelUtils.getNode(jsonDocument2));
 			 
		JSONCompareResult result = JSONCompare.compareJSON(stringJsonDocument1, stringJsonDocument2, JSONCompareMode.NON_EXTENSIBLE);
		return result.passed();
//		 JSONAssert.assertEquals(stringJsonDocument1, stringJsonDocument2, JSONCompareMode.NON_EXTENSIBLE);
		 
	}
	
	
	 
	private boolean areEqualJsonDocumentsEmfCompare(JsonDocument jsonDocument1, JsonDocument jsonDocument2) throws JSONException{
		/**
		 * https://www.eclipse.org/emf/compare/documentation/latest/developer/developer-guide.html#Changing_the_FeatureFilter
		 */
		IDiffProcessor diffProcessor = new DiffBuilder();
		IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
//						@Override
//						protected boolean isIgnoredReference(Match match, EReference reference) {
////							return reference == EcorePackage.Literals.ENAMED_ELEMENT__NAME ||
////									super.isIgnoredReference(match, reference);
//							return super.isIgnoredReference(match, reference);
//						}

					@Override
					public boolean checkForOrderingChanges(EStructuralFeature feature) {
						return false;
					}
				};
			}
		};
		
		Function<EObject, String> keyFunction = new Function<EObject, String>() {
			public String apply(EObject input) {
				if (input instanceof KeyValuePair) {
					return ((KeyValuePair)input).getKey();
				}
				// a null return here tells the match engine to fall back to the other matchers
				return null;
			}
		};
		
		IEObjectMatcher fallBackMatcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
//		IEObjectMatcher customIDMatcher = new IdentifierEObjectMatcher(fallBackMatcher, keyFunction);
//		IEObjectMatcher customIDMatcher = new ProximityEObjectMatcher(fallBackMatcher, keyFunction);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory.Registry registry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
//		final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(customIDMatcher, comparisonFactory);
//		final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
		final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(fallBackMatcher, comparisonFactory);
		matchEngineFactory.setRanking(20); 
		registry.add(matchEngineFactory);
		
		IComparisonScope scope = new DefaultComparisonScope(jsonDocument1, jsonDocument2, null);
//		 Comparison comparison = EMFCompare.builder().build().compare(scope);
//		Comparison comparison = EMFCompare.builder().setDiffEngine(diffEngine).build().compare(scope);
		Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).setDiffEngine(diffEngine).build().compare(scope);
		boolean isEqual = true;
		for(Diff diff : comparison.getDifferences()) {
			 if(diff.getKind()!=DifferenceKind.MOVE) {
				 isEqual = false;
			 }
		}
		 return isEqual;
//		 return comparison.getDifferences().size()==0;
 			 
		 
//		 JSONAssert.assertEquals(stringJsonDocument1, stringJsonDocument2, JSONCompareMode.NON_EXTENSIBLE);
		 
	 }
}
