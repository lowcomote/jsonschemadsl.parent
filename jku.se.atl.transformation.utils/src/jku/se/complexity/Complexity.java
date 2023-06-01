package jku.se.complexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import jsonMetaschemaMM.AdditionalItemsSchemaDefinition;
import jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition;
import jsonMetaschemaMM.BooleanSchema;
import jsonMetaschemaMM.DefinitionsSchemaDefinition;
import jsonMetaschemaMM.ItemsAnyOf2;
import jsonMetaschemaMM.ItemsSchemaDefinition;
import jsonMetaschemaMM.JsonSchema;
import jsonMetaschemaMM.KeySchemaPair;
import jsonMetaschemaMM.ObjectSchema;
import jsonMetaschemaMM.PatternPropertiesSchemaDefinition;
import jsonMetaschemaMM.PatternSchemaDefinition;
import jsonMetaschemaMM.PropertiesSchemaDefinition;
import jsonMetaschemaMM.Schema;
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
	
	public static final String STRING ="string";
	
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
	
	public void collectElementMetrics(Metrics metrics, EObject element) {
		/**
		 * is No  faLSE Schema ??
		 */
//		if(ObjectSchema.class.isInstance(element) || 
//				(BooleanSchema.class.isInstance(element) && ((BooleanSchema)element).isValue())) {
//			metrics.addNumNoFalseSchemas(1);
//		}
		if(isNotFalse(element) ) {
			metrics.addNumNoFalseSchemas(1);
		}
//		if(ObjectSchema.class.isInstance(element) && !containsConstEnumRef( (ObjectSchema) element)){
		if(ObjectSchema.class.isInstance(element) ){

			
			
			ObjectSchema objectSchema = (ObjectSchema)element;
			metrics.addNumNoFalseSchemasInPatternProperties(countPatternPropertiesSize(objectSchema));
//			if(containsTypeObject(objectSchema)) {
//				metrics.addNumNoFalseSchemasInProperties(countPropertiesSize(objectSchema));
//				metrics.addNumNoFalseSchemasInPatternProperties(countPatternPropertiesSize(objectSchema));
//				
//			}
			if(!containsConstEnumRef( objectSchema)){
				if(containsTypeObject(objectSchema)) {
					metrics.addNumObjectTypes(1);
					if(objectSchema.getAdditionalProperties()==null) {
						metrics.addNumDefaultAdditionalProperties(1);
					}else if(isNotFalse(objectSchema.getAdditionalProperties().getAdditionalProperties())) {
						metrics.addNumExplicitAdditionalProperties(1);
					}
					metrics.addNumNoFalseSchemasInProperties(countPropertiesSize(objectSchema));
//					metrics.addNumNoFalseSchemasInPatternProperties(countPatternPropertiesSize(objectSchema));
					
					
				}
				if(containsTypeArray(objectSchema)) {
					metrics.addNumArrayTypes(1);
					if(objectSchema.getItems()==null) {
						metrics.addNumDefaultItems(1);
					}else if(isItemsTuple(objectSchema.getItems())) {
						metrics.addNumTuples(1);	
						if(objectSchema.getAdditionalItems()==null) {
							metrics.addNumDefaultAdditionalItems(1);
						}else if(isNotFalse(objectSchema.getAdditionalItems().getAdditionalItems())) {
							metrics.addNumExplicitAdditionalItems(1);
						}
						metrics.addNumTuplesFields(countTupleFields(objectSchema));
					}
				}
				if(isMultiType(objectSchema)) {
					metrics.addNumMultiTypes(1);
					metrics.addNumTypesInMultyTypes(getTypesInMultyTypes(objectSchema));
				}
				if(containsType(objectSchema,STRING) &&
						objectSchema.getKeywordDefinition().stream()
						.filter(keyword->PatternSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null)!=null) {
					metrics.addNumPattern(1);
				}
			}
		}
	}
	
	private boolean isNotFalse(EObject schema) {
		return ObjectSchema.class.isInstance(schema) || 
				(BooleanSchema.class.isInstance(schema) && ((BooleanSchema)schema).isValue());
		
	}
	
	public Metrics countMetrics(EObject root) {
		Metrics metrics = new Metrics();
		TreeIterator<EObject> iterator = root.eAllContents();
		Integer defaultType=0;
		Integer defaultScalar=0;
		Integer defaultScalarNotInRootInPropertiesInDefinitions =0;
		Integer objectSchemasN =0;
		Integer schemasN =0;
		Integer elements =0;
		Integer additionalPropertiesFalseInDefaultType=0;
		Integer defaultAdditionalProperties=0;
		Integer defaultItems=0;
		Integer refAndProperties =0;
		while (iterator.hasNext()) {
			EObject element = iterator.next();
			elements++;
			collectElementMetrics(metrics,  element);
			if(Schema.class.isInstance(element)){
				schemasN++;
			}
			if(ObjectSchema.class.isInstance(element)){
				objectSchemasN++;
				ObjectSchema objectSchema = (ObjectSchema)element;
				if(objectSchema.getRef()!=null && objectSchema.getProperties()!=null) {
					refAndProperties++;
				}
				//secrets
//				if(KeySchemaPair.class.isInstance(objectSchema.eContainer()) && ((KeySchemaPair)objectSchema.eContainer()).getKey().equals("secrets")) {
//					System.out.println("pull_request_target ");
//				}
				//&& isObjectSchemaInRootInPropertiesInDefinitions(objectSchema)
				if(containsRef(objectSchema) ){
					if(isObjectSchemaInRootInPropertiesInDefinitions(objectSchema)) {
						metrics.addNoRef(1);
					}
				}else if(containsEnum(objectSchema) || containsConst(objectSchema)){// There can be both
					if(containsEnum(objectSchema)){
						metrics.addNoEnum(1);
					}
					if(containsConst(objectSchema)){
						metrics.addNoConst(1);
					}
					
				}else {// No ref enum or const
					//List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
					//TypeSchemaDefinition typeSchemaDefinition = (TypeSchemaDefinition) keywordDefinitions.stream().filter(keyword->TypeSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null);
					TypeSchemaDefinition typeSchemaDefinition = objectSchema.getType();
					if(typeSchemaDefinition == null) {
						defaultType++;
						if(objectSchema.getAdditionalProperties()==null) {
							defaultAdditionalProperties++;
						}
						if(objectSchema.getItems()==null) {
							defaultItems++;
						}
						if(objectSchema.getAdditionalProperties()!=null && BooleanSchema.class.isInstance(objectSchema.getAdditionalProperties().getAdditionalProperties()) && !((BooleanSchema)objectSchema.getAdditionalProperties().getAdditionalProperties()).isValue()) {
							additionalPropertiesFalseInDefaultType++;
						}
							
						metrics.addNoMT(1);
						if(isObjectSchemaInRootInPropertiesInDefinitions(objectSchema)) {
							metrics.addNoS(5);
							defaultScalar= defaultScalar+5;
						}else {
							defaultScalarNotInRootInPropertiesInDefinitions= defaultScalarNotInRootInPropertiesInDefinitions+5;
						}
						metrics.addNoO(1);
						countInternalMetricsForObject(objectSchema, metrics);
						countInternalMetricsForArray(objectSchema, metrics);
					}else {
						metrics.addNoS(countNoSForType( typeSchemaDefinition));
						if (!isSimpleType(typeSchemaDefinition)) {metrics.addNoMT(1);} 
						Integer countObject= countMetricsForObject(objectSchema, typeSchemaDefinition,  metrics);
						if(countObject>0 && objectSchema.getAdditionalProperties()==null) {
							defaultAdditionalProperties++;
						}
						if(isArray(typeSchemaDefinition) && objectSchema.getItems()==null){
							defaultItems++;
						}
						countMetricsForArray(objectSchema, typeSchemaDefinition,  metrics);
					}
				}
				
			}
		}	
		
		System.out.println("elements =" +elements);
		System.out.println("objectSchemasN =" +objectSchemasN);
		System.out.println("schemasN =" +schemasN);
		
		System.out.println("default type =" +defaultType);
		System.out.println("defaultScalar=" +defaultScalar);
		System.out.println("defaultScalarNotInRootInPropertiesInDefinitions=" +defaultScalarNotInRootInPropertiesInDefinitions);
		System.out.println("additionalPropertiesFalseInDefaultType=" +additionalPropertiesFalseInDefaultType);
		
		System.out.println("defaultAdditionalProperties=" +defaultAdditionalProperties);
		System.out.println("defaultItems=" +defaultItems);
		
		
		System.out.println("metrics.getNumNoFalseSchemas()=" +metrics.getNumNoFalseSchemas());
		System.out.println("metrics.getNumObjectTypes()=" +metrics.getNumObjectTypes());
		System.out.println("metrics.getNumDefaultAdditionalProperties()=" +metrics.getNumDefaultAdditionalProperties());
		System.out.println("metrics.getNumArrayTypes();=" +metrics.getNumArrayTypes());
		System.out.println("metrics.getNumDefaultItems();=" +metrics.getNumDefaultItems());
		System.out.println("metrics.getNumTuples();=" +metrics.getNumTuples());
		System.out.println("metrics.getNumDefaultAdditionalItems();=" +metrics.getNumDefaultAdditionalItems());
		System.out.println("metrics.getNumMultiTypes();=" +metrics.getNumMultiTypes());
		System.out.println("metrics.getTypesInMultyTypes();=" +metrics.getNumTypesInMultyTypes());
		System.out.println("refAndProperties=" +refAndProperties);
		
		 
		
		
		return metrics;
		
	}
	
	
	
	private Integer countNoSForType(TypeSchemaDefinition typeSchemaDefinition) {
		Integer NoS =0;
//		if (isTypeSchemaDefinitionInRoot(typeSchemaDefinition) || isTypeSchemaDefinitionInPropertiesOrDefinition(typeSchemaDefinition)) {
//			NoS = countScalar(typeSchemaDefinition);
//		}
		ObjectSchema objectSchema = (ObjectSchema) typeSchemaDefinition.eContainer();
		if(isObjectSchemaInRootInPropertiesInDefinitions(objectSchema)) {
			NoS = countScalar(typeSchemaDefinition);
		}else {
//			System.out.println("no count Scalar"+countScalar(typeSchemaDefinition));
		}
		return NoS;
	}
	
	private boolean containsConst(ObjectSchema objectSchema) {
//		List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
//		return keywordDefinitions.stream().filter(keyword->ConstSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null) != null ;
		return objectSchema.getConst()!=null;
	}
	
	private boolean containsEnum(ObjectSchema objectSchema) {
//		List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
//		return keywordDefinitions.stream().filter(keyword->EnumSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null) != null;
		return objectSchema.getEnum()!=null;
	}
	
	private boolean containsRef(ObjectSchema objectSchema) {
//		List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
//		return keywordDefinitions.stream().filter(keyword->RefSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null) != null 	;
		return objectSchema.getRef()!=null;
	}
	
	private boolean containsConstEnumRef(ObjectSchema objectSchema) {
//		List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
//		return keywordDefinitions.stream().filter(keyword->EnumSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null) != null ||
//				keywordDefinitions.stream().filter(keyword->ConstSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null) != null ||
//						keywordDefinitions.stream().filter(keyword->RefSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null) != null 	;
		return containsConst(objectSchema)||containsEnum( objectSchema)||containsRef( objectSchema);
	}
	
	private boolean isObjectSchemaInRootInPropertiesInDefinitions(ObjectSchema objectSchema) {
		EObject objectSchemaContainer = objectSchema.eContainer();
		return JsonSchema.class.isInstance(objectSchemaContainer)||
				(
						KeySchemaPair.class.isInstance(objectSchemaContainer) &&
						(
								PropertiesSchemaDefinition.class.isInstance(objectSchemaContainer.eContainer())||
								DefinitionsSchemaDefinition.class.isInstance(objectSchemaContainer.eContainer())
						)
				);	
	}
	
	private boolean isTypeSchemaDefinitionInRoot(TypeSchemaDefinition typeSchemaDefinition) {
		//return typeSchemaDefinition.eContainer().eContainer().eClass().getName().equals("JsonSchema");
		return JsonSchema.class.isInstance(typeSchemaDefinition.eContainer().eContainer());
	}
	
	private boolean isTypeSchemaDefinitionInPropertiesOrDefinition(TypeSchemaDefinition typeSchemaDefinition) {
		//  PropertiesSchemaDefinition //DefinitionsSchemaDefinition
		boolean result =false;
		EObject potentialKeySchemaPair = typeSchemaDefinition.eContainer().eContainer();
		//EClass PotentialKeySchemaPair = typeSchemaDefinition.eContainer().eContainer().eClass();
		//if(PotentialKeySchemaPair.getName().equals("KeySchemaPair")) {
		if(KeySchemaPair.class.isInstance(potentialKeySchemaPair) ) {
			EObject keySchemaPairContainer = potentialKeySchemaPair.eContainer();
//			String keySchemaPairContainerName =PotentialKeySchemaPair.eContainer().eClass().getName();
//			result = keySchemaPairContainerName.equals("PropertiesSchemaDefinition") || keySchemaPairContainerName.equals("PropertiesSchemaDefinition");
			result = PropertiesSchemaDefinition.class.isInstance(keySchemaPairContainer) || DefinitionsSchemaDefinition.class.isInstance(keySchemaPairContainer);
		
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
	
	
	private boolean containsTypeObject(ObjectSchema objectSchema) {
		boolean containsTypeObject =false;
		TypeSchemaDefinition typeSchemaDefinition = objectSchema.getType();
		if (typeSchemaDefinition==null) {
			containsTypeObject=true;
		}else if(isSimpleType(typeSchemaDefinition)) {
			if (((TypeAnyOf1)typeSchemaDefinition.getAnyOf()).getType().getLiteral().equals(OBJECT)) {
				containsTypeObject=true;
			}
		}else {
			Long countObjectLong = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().filter(item->item.getLiteral().equals(OBJECT)).count();
			containsTypeObject = countObjectLong>0;
		}
		return containsTypeObject;
	}
	
	private boolean containsType(ObjectSchema objectSchema, String type) {
		boolean containsType=false;
		TypeSchemaDefinition typeSchemaDefinition = objectSchema.getType();
		if (typeSchemaDefinition==null) {
			containsType=true;
		}else if(isSimpleType(typeSchemaDefinition)) {
			if (((TypeAnyOf1)typeSchemaDefinition.getAnyOf()).getType().getLiteral().equals(type)) {
				containsType=true;
			}
		}else {
			Long count = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().filter(item->item.getLiteral().equals(type)).count();
			containsType = count>0;
		}
		return containsType;		
				
	}
	
	private boolean containsTypeArray(ObjectSchema objectSchema) {
		boolean containsTypeArray =false;
		TypeSchemaDefinition typeSchemaDefinition = objectSchema.getType();
		if (typeSchemaDefinition==null) {
			containsTypeArray=true;
		}else if(isSimpleType(typeSchemaDefinition)) {
			if (((TypeAnyOf1)typeSchemaDefinition.getAnyOf()).getType().getLiteral().equals(ARRAY)) {
				containsTypeArray=true;
			}
		}else {
			Long countArrayLong = ((TypeAnyOf2)typeSchemaDefinition.getAnyOf()).getItems().stream().filter(item->item.getLiteral().equals(ARRAY)).count();
			containsTypeArray = countArrayLong>0;
		}
		return containsTypeArray;
	}
	private Integer countMetricsForObject(ObjectSchema objectSchema, TypeSchemaDefinition typeSchemaDefinition, Metrics metrics) {
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
			//ObjectSchema objectschema =(ObjectSchema) typeSchemaDefinition.eContainer();
			if(!containsConstEnumRef(objectSchema)) {
				countInternalMetricsForObject(objectSchema, metrics);
				metrics.addNoO(countObject);
			}
		}
		return countObject;
	}
	
	private Integer countPropertiesSize(ObjectSchema objectSchema) {
		Integer propertiesSize =0;
		PropertiesSchemaDefinition propertiesSchemaDefinition = objectSchema.getProperties();
		if(propertiesSchemaDefinition!=null) {
			Long count =propertiesSchemaDefinition.getKeySchemaPairs().stream().filter(keySchemaPair->isNotFalse(keySchemaPair.getValue())).count();
			propertiesSize=count.intValue();
		}
		return propertiesSize;
	}
	
	private Integer countPatternPropertiesSize(ObjectSchema objectSchema) {
		Integer patternPropertiesSize =0;
		PatternPropertiesSchemaDefinition patternPropertiesSchemaDefinition = objectSchema.getPatternProperties();
		if(patternPropertiesSchemaDefinition!=null) {
			Long count =patternPropertiesSchemaDefinition.getKeySchemaPairs().stream().filter(keySchemaPair->isNotFalse(keySchemaPair.getValue())).count();
			patternPropertiesSize=count.intValue();
		}
		return patternPropertiesSize;
	}
	
	private void countInternalMetricsForObject(ObjectSchema objectSchema, Metrics metrics) {
		//ObjectSchema objectschema =(ObjectSchema) typeSchemaDefinition.eContainer();
//		List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
		/**
		 * AdditionalProperties
		 */
//		AdditionalPropertiesSchemaDefinition additionalPropertiesSchemaDefinition = (AdditionalPropertiesSchemaDefinition) keywordDefinitions.stream().filter(keyword->AdditionalPropertiesSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null);
		AdditionalPropertiesSchemaDefinition additionalPropertiesSchemaDefinition = objectSchema.getAdditionalProperties();
		if(additionalPropertiesSchemaDefinition==null // additionalProperties : true by default
				|| ObjectSchema.class.isInstance(additionalPropertiesSchemaDefinition.getAdditionalProperties()) // is not a boolean schema
				|| (BooleanSchema.class.isInstance(additionalPropertiesSchemaDefinition.getAdditionalProperties())  && ((BooleanSchema)additionalPropertiesSchemaDefinition.getAdditionalProperties()).isValue()) 
		) {
			metrics.addNoAP(1);
		}	
		/**
		 * Properties
		 */
//		PropertiesSchemaDefinition propertiesSchemaDefinition = (PropertiesSchemaDefinition) keywordDefinitions.stream().filter(keyword->PropertiesSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null);
		PropertiesSchemaDefinition propertiesSchemaDefinition = objectSchema.getProperties();
		if(propertiesSchemaDefinition!=null) {
			metrics.addNoP(1);
			metrics.addNoSPP(propertiesSchemaDefinition.getKeySchemaPairs().size());
		}
		/**
		 * Pattern Properties
		 */
		
//		PatternPropertiesSchemaDefinition patternPropertiesSchemaDefinition = (PatternPropertiesSchemaDefinition) keywordDefinitions.stream().filter(keyword->PatternPropertiesSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null);
		PatternPropertiesSchemaDefinition patternPropertiesSchemaDefinition = objectSchema.getPatternProperties();
		if(patternPropertiesSchemaDefinition!=null) {
			metrics.addNoSPPP(patternPropertiesSchemaDefinition.getKeySchemaPairs().size());
		}
	}
	
	private void countMetricsForArray(ObjectSchema objectSchema, TypeSchemaDefinition typeSchemaDefinition, Metrics metrics) {
		if(isArray(typeSchemaDefinition)) {
			//ObjectSchema objectSchema = (ObjectSchema) typeSchemaDefinition.eContainer();
			countInternalMetricsForArray( objectSchema,  metrics);
		}
	}
	
	private Integer countTupleFields(ObjectSchema objectSchema) {
		Integer tupleFields =0;
		ItemsSchemaDefinition itemsSchemaDefinition = objectSchema.getItems();
		if(isItemsTuple(itemsSchemaDefinition)) {
			tupleFields=((ItemsAnyOf2) itemsSchemaDefinition.getAnyOf()).getAnyOf2().getItems().size();
		}
		return tupleFields;
	}
	private void countInternalMetricsForArray(ObjectSchema objectSchema, Metrics metrics) {
//		List<KeywordDefinition> keywordDefinitions =  objectSchema.getKeywordDefinition();
//		ItemsSchemaDefinition itemsSchemaDefinition =(ItemsSchemaDefinition) keywordDefinitions.stream().filter(keyword -> ItemsSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null);
		ItemsSchemaDefinition itemsSchemaDefinition = objectSchema.getItems();
		if(itemsSchemaDefinition==null || ! isItemsTuple(itemsSchemaDefinition)) {
			metrics.addNoA(1);
		}else { // It is a tuple objectSchema.getKeywordDefinition().size()
			metrics.addNoT(1);
			metrics.addNoTF(((ItemsAnyOf2) itemsSchemaDefinition.getAnyOf()).getAnyOf2().getItems().size());
//			AdditionalItemsSchemaDefinition additionalItemsSchemaDefinition = (AdditionalItemsSchemaDefinition) keywordDefinitions.stream().filter(keyword->AdditionalItemsSchemaDefinition.class.isInstance(keyword)).findAny().orElse(null);
			AdditionalItemsSchemaDefinition additionalItemsSchemaDefinition = objectSchema.getAdditionalItems();
			if(additionalItemsSchemaDefinition==null // additionalItems : true by default
					|| ObjectSchema.class.isInstance(additionalItemsSchemaDefinition.getAdditionalItems()) // is not a boolean schema
					|| (BooleanSchema.class.isInstance(additionalItemsSchemaDefinition.getAdditionalItems())  && ((BooleanSchema)additionalItemsSchemaDefinition.getAdditionalItems()).isValue()) 
			) {
				metrics.addNoAI(1);
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
		//return typeSchemaDefinition.getAnyOf().eClass().getName().equals("TypeAnyOf1");
		return TypeAnyOf1.class.isInstance(typeSchemaDefinition.getAnyOf());
	}
	
	private boolean isMultiType(ObjectSchema objectSchema) {
		//return typeSchemaDefinition.getAnyOf().eClass().getName().equals("TypeAnyOf1");
		TypeSchemaDefinition typeSchemaDefinition =objectSchema.getType();
		return typeSchemaDefinition==null || TypeAnyOf2.class.isInstance(typeSchemaDefinition.getAnyOf());
	}
	
	
	private Integer getTypesInMultyTypes(ObjectSchema objectSchema) {
		Integer typesInMultyTypes=0;
		if(isMultiType(objectSchema)) {
			if(objectSchema.getType()==null) {
				typesInMultyTypes =7;
			}else {
				typesInMultyTypes= ((TypeAnyOf2)objectSchema.getType().getAnyOf()).getItems().size();
			}
		}
		return typesInMultyTypes;
	}
	
	private boolean isTypeObjectInMultyType(ObjectSchema objectSchema) {
		boolean objectsInMultyType =false;
		if(isMultiType(objectSchema)) {
			if(objectSchema.getType()==null) {
				objectsInMultyType =true;
			}else {
				objectsInMultyType= ((TypeAnyOf2)objectSchema.getType().getAnyOf()).getItems().stream().filter(item->item.getLiteral().equals(OBJECT)).count()>0;
			}
		}
		return objectsInMultyType;
	}
	
	private boolean isItemsTuple(ItemsSchemaDefinition itemsSchemaDefinition) {
		//return ItemsAnyOf2.class.isInstance(itemsSchemaDefinition.getAnyOf());
		return itemsSchemaDefinition!=null && ItemsAnyOf2.class.isInstance(itemsSchemaDefinition.getAnyOf());
		//return itemsSchemaDefinition.getAnyOf().eClass().getName().equals("ItemsAnyOf2");
	}
	
//	private boolean isScalar(SimpleTypes simpleType) {
//		//{"array", "boolean", "integer", "null", "number", "object", "string"} 
//		//List scalars  = new ArrayList<String>(Arrays.asList(new String[]{"boolean", "integer", "null", "number", "string"}));
//		return SCALARS.contains(simpleType.getLiteral());
//	}
}
