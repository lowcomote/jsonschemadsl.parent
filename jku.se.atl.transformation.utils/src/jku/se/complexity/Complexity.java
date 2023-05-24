package jku.se.complexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import jsonMetaschemaMM.AdditionalItemsSchemaDefinition;
import jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition;
import jsonMetaschemaMM.BooleanSchema;
import jsonMetaschemaMM.ItemsAnyOf2;
import jsonMetaschemaMM.ItemsSchemaDefinition;
import jsonMetaschemaMM.ObjectSchema;
import jsonMetaschemaMM.PatternPropertiesSchemaDefinition;
import jsonMetaschemaMM.PropertiesSchemaDefinition;
import jsonMetaschemaMM.TypeAnyOf1;
import jsonMetaschemaMM.TypeAnyOf2;
import jsonMetaschemaMM.TypeSchemaDefinition;

public class Complexity {
	/**
	 * getResource().getContents().get(0)

ResourceSet reset = new ResourceSetImpl();

Resource res = reset.getResource(..)

(uri, true)

  



	 * @param schemaInputStream
	 * @return
	 */
	public static final List<String> SCALARS  = new ArrayList<String>(Arrays.asList(new String[]{"boolean", "integer", "null", "number", "string"}));
	
	public static final String OBJECT ="object";
	
	public static final String ARRAY ="array";
	
//	public  static void main(String[] args) {
//		Scanner obj = new Scanner (System.in);
//		System.out.println("Enter json schema name:");
//		//String jschemaName=obj.nextLine();
//		final File jschemaFile = new File("src/jku/se/complexity/examples/githubwf.jschema");
//	    try {
//			//final InputStream inputStream = new FileInputStream(jschemaFile);
//			//new ByteArrayInputStream(FileUtils.readFileToByteArray(file))
//	    	final InputStream inputStream = new ByteArrayInputStream(FileUtils.readFileToByteArray(jschemaFile));
//			Complexity complexity = new Complexity();
//			EcoreElementsCount ecoreElementsCount = complexity.calculateCompexity(inputStream);
//			System.out.println("EClasses :"+ecoreElementsCount.getClassesCount());
//			System.out.println("EFeatures :"+ecoreElementsCount.getFeaturesCount());
//			System.out.println("EOperationss :"+ecoreElementsCount.getOperationsCount());
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public EcoreElementsCount calculateCompexity(InputStream schemaInputStream) throws Exception{
//		EcoreElementsCount ecoreElementsCount = new EcoreElementsCount();
//		ResourceSet reset = new ResourceSetImpl();
//		Resource resource = reset.createResource(URI.createURI("platform:/dummy.jschema"));
//		 
//		resource.load(schemaInputStream,reset.getLoadOptions());
//		EObject root = resource.getContents().get(0);
//		Metrics metrics = countMetrics( root);
//		ecoreElementsCount.calculateCompexity(metrics);
//		 
//		return ecoreElementsCount;
//	}
	
	
	public Metrics countMetrics(EObject root) {
		Metrics metrics = new Metrics();
		TreeIterator<EObject> iterator = root.eAllContents();
		while (iterator.hasNext()) {
			EObject element = iterator.next();
			EClass eClass = element.eClass();
			if (eClass.getName().equals("TypeSchemaDefinition")) {
				TypeSchemaDefinition typeSchemaDefinition = (TypeSchemaDefinition) element;
				metrics.addNoS(countNoSForType( typeSchemaDefinition));
				countMetricsForObject(typeSchemaDefinition,  metrics);
				if (isSimpleType(typeSchemaDefinition)) {metrics.addNoMT(1);} 
				countMetricsForArray( typeSchemaDefinition,  metrics);
			}
		}	
		return metrics;
		
	}
	
	
	private Integer countNoSForType(TypeSchemaDefinition typeSchemaDefinition) {
		Integer NoS =0;
		if (isTypeSchemaDefinitionInRoot(typeSchemaDefinition) || isTypeSchemaDefinitionInPropertiesOrDefinition(typeSchemaDefinition)) {
			NoS = countScalar(typeSchemaDefinition);
		}
		return NoS;
	}
	
	private boolean isTypeSchemaDefinitionInRoot(TypeSchemaDefinition typeSchemaDefinition) {
		return typeSchemaDefinition.eContainer().eContainer().eClass().getName().equals("JsonSchema");
	}
	
	private boolean isTypeSchemaDefinitionInPropertiesOrDefinition(TypeSchemaDefinition typeSchemaDefinition) {
		//  PropertiesSchemaDefinition //DefinitionsSchemaDefinition
		boolean result =false;
		EClass PotentialKeySchemaPair = typeSchemaDefinition.eContainer().eContainer().eClass();
		if(PotentialKeySchemaPair.getName().equals("KeySchemaPair")) {
			String keySchemaPairContainerName =PotentialKeySchemaPair.eContainer().eClass().getName();
			result = keySchemaPairContainerName.equals("PropertiesSchemaDefinition") || keySchemaPairContainerName.equals("PropertiesSchemaDefinition");
		}
		return result;
		//return typeSchemaDefinition.eContainer().eContainer().eClass().getName().equals("KeySchemaPair");
	}
	
	private Integer countScalar(TypeSchemaDefinition typeSchemaDefinition) {
		Integer countScalar = 0;
		if(isSimpleType(typeSchemaDefinition)) {
			if (SCALARS.contains(((TypeAnyOf1)typeSchemaDefinition.getAnyOf()).getType().getLiteral())) {
				countScalar = 1;
			}
		}else {
			Long countScalarLong = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().filter(item->SCALARS.contains(item.getLiteral())).count();
//			List<String> simpleTypesLiterals = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().map(item->item.getLiteral()).collect(Collectors.toList());
//			return !Collections.disjoint(SCALARS, simpleTypesLiterals);
			countScalar=countScalarLong.intValue();
		}
		return countScalar;
	}
	
	private Integer countMetricsForObject(TypeSchemaDefinition typeSchemaDefinition, Metrics metrics) {
		Integer countObject = 0;
		if(isSimpleType(typeSchemaDefinition)) {
			if (((TypeAnyOf1)typeSchemaDefinition.getAnyOf()).getType().getLiteral().equals(OBJECT)) {
				countObject=1;
			}
		}else {
			Long countObjectLong = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().filter(item->item.getLiteral().equals(OBJECT)).count();
			countObject=countObjectLong.intValue();
		}
		if(countObject>0) {
			metrics.addNoO(countObject);
			countInternalMetricsForObject(typeSchemaDefinition, metrics);
		}
		return countObject;
	}
	
	private void countInternalMetricsForObject(TypeSchemaDefinition typeSchemaDefinition, Metrics metrics) {
		ObjectSchema objectschema =(ObjectSchema) typeSchemaDefinition.eContainer();
		List<EObject> keywordDefinitions =  objectschema.eContents();
		/**
		 * AdditionalProperties
		 */
		AdditionalPropertiesSchemaDefinition additionalPropertiesSchemaDefinition = (AdditionalPropertiesSchemaDefinition) keywordDefinitions.stream().filter(keyword->AdditionalPropertiesSchemaDefinition.class.isInstance(keyword)).findAny().orElseGet(null);
		if(additionalPropertiesSchemaDefinition==null // additionalProperties : true by default
				|| ObjectSchema.class.isInstance(additionalPropertiesSchemaDefinition.getAdditionalProperties()) // is not a boolean schema
				|| (BooleanSchema.class.isInstance(additionalPropertiesSchemaDefinition.getAdditionalProperties())  && ((BooleanSchema)additionalPropertiesSchemaDefinition.getAdditionalProperties()).isValue()) 
		) {
			metrics.addNoAP(1);
		}	
		/**
		 * Properties
		 */
		PropertiesSchemaDefinition propertiesSchemaDefinition = (PropertiesSchemaDefinition) keywordDefinitions.stream().filter(keyword->PropertiesSchemaDefinition.class.isInstance(keyword)).findAny().orElseGet(null);
		if(propertiesSchemaDefinition!=null) {
			metrics.addNoP(1);
			metrics.addNoSPP(propertiesSchemaDefinition.getKeySchemaPairs().size());
		}
		/**
		 * Pattern Properties
		 */
		PatternPropertiesSchemaDefinition patternPropertiesSchemaDefinition = (PatternPropertiesSchemaDefinition) keywordDefinitions.stream().filter(keyword->PatternPropertiesSchemaDefinition.class.isInstance(keyword)).findAny().orElseGet(null);
		if(patternPropertiesSchemaDefinition!=null) {
			metrics.addNoSPPP(patternPropertiesSchemaDefinition.getKeySchemaPairs().size());
		}
	}
	
	private void countMetricsForArray(TypeSchemaDefinition typeSchemaDefinition, Metrics metrics) {
		if(isArray(typeSchemaDefinition)) {
			ObjectSchema objectschema = (ObjectSchema) typeSchemaDefinition.eContainer();
			List<EObject> keywordDefinitions =  objectschema.eContents();
			ItemsSchemaDefinition itemsSchemaDefinition =(ItemsSchemaDefinition) keywordDefinitions.stream().filter(keyword -> ItemsSchemaDefinition.class.isInstance(keyword)).findAny().orElseGet(null);
			if(itemsSchemaDefinition==null || ! isItemsTuple(itemsSchemaDefinition)) {
				metrics.addNoA(1);
			}else {
				metrics.addNoT(1);
				metrics.addNoTF(((ItemsAnyOf2) itemsSchemaDefinition.getAnyOf()).getAnyOf2().getItems().size());
				AdditionalItemsSchemaDefinition additionalItemsSchemaDefinition = (AdditionalItemsSchemaDefinition) keywordDefinitions.stream().filter(keyword->AdditionalItemsSchemaDefinition.class.isInstance(keyword)).findAny().orElseGet(null);
				if(additionalItemsSchemaDefinition==null // additionalItems : true by default
						|| ObjectSchema.class.isInstance(additionalItemsSchemaDefinition.getAdditionalItems()) // is not a boolean schema
						|| (BooleanSchema.class.isInstance(additionalItemsSchemaDefinition.getAdditionalItems())  && ((BooleanSchema)additionalItemsSchemaDefinition.getAdditionalItems()).isValue()) 
				) {
					metrics.addNoAI(1);
				}		
			}
		}
		
	}
	
	private boolean isArray(TypeSchemaDefinition typeSchemaDefinition) {
		boolean isArray = false;
		if(isSimpleType(typeSchemaDefinition)) {
			isArray =((TypeAnyOf1)typeSchemaDefinition.getAnyOf()).getType().getLiteral().equals(ARRAY);
		}else {
			Long countArrayLong = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().filter(item->item.getLiteral().equals(ARRAY)).count();
			isArray=countArrayLong>0;
		}
		return isArray;
	}
	
	
	private boolean isSimpleType(TypeSchemaDefinition typeSchemaDefinition) {
		return typeSchemaDefinition.getAnyOf().eClass().getName().equals("TypeAnyOf1");
	}
	
	private boolean isItemsTuple(ItemsSchemaDefinition itemsSchemaDefinition) {
		return itemsSchemaDefinition.getAnyOf().eClass().getName().equals("ItemsAnyOf2");
	}
	
//	private boolean isScalar(SimpleTypes simpleType) {
//		//{"array", "boolean", "integer", "null", "number", "object", "string"} 
//		//List scalars  = new ArrayList<String>(Arrays.asList(new String[]{"boolean", "integer", "null", "number", "string"}));
//		return SCALARS.contains(simpleType.getLiteral());
//	}
}
