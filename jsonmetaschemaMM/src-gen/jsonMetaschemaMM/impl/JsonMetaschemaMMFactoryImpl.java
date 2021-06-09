/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonMetaschemaMMFactoryImpl extends EFactoryImpl implements JsonMetaschemaMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JsonMetaschemaMMFactory init() {
		try {
			JsonMetaschemaMMFactory theJsonMetaschemaMMFactory = (JsonMetaschemaMMFactory)EPackage.Registry.INSTANCE.getEFactory(JsonMetaschemaMMPackage.eNS_URI);
			if (theJsonMetaschemaMMFactory != null) {
				return theJsonMetaschemaMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JsonMetaschemaMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonMetaschemaMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA: return createObjectSchema();
			case JsonMetaschemaMMPackage.MAXIMUM_SCHEMA_DEFINITION: return createMaximumSchemaDefinition();
			case JsonMetaschemaMMPackage.INTEGER_VALUE: return createIntegerValue();
			case JsonMetaschemaMMPackage.WRITE_ONLY_SCHEMA_DEFINITION: return createWriteOnlySchemaDefinition();
			case JsonMetaschemaMMPackage.COMMENT_SCHEMA_DEFINITION: return createCommentSchemaDefinition();
			case JsonMetaschemaMMPackage.ENUM_SCHEMA_DEFINITION: return createEnumSchemaDefinition();
			case JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION: return createUniqueItemsSchemaDefinition();
			case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION: return createAnyOfSchemaDefinition();
			case JsonMetaschemaMMPackage.STRING_ARRAY: return createStringArray();
			case JsonMetaschemaMMPackage.TITLE_SCHEMA_DEFINITION: return createTitleSchemaDefinition();
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION: return createItemsSchemaDefinition();
			case JsonMetaschemaMMPackage.DEFAULT_SCHEMA_DEFINITION: return createDefaultSchemaDefinition();
			case JsonMetaschemaMMPackage.THEN_SCHEMA_DEFINITION: return createThenSchemaDefinition();
			case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION: return createMinLengthSchemaDefinition();
			case JsonMetaschemaMMPackage.DEFINITIONS_SCHEMA_DEFINITION: return createDefinitionsSchemaDefinition();
			case JsonMetaschemaMMPackage.BOOLEAN_VALUE: return createBooleanValue();
			case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION: return createMinItemsSchemaDefinition();
			case JsonMetaschemaMMPackage.ONE_OF_SCHEMA_DEFINITION: return createOneOfSchemaDefinition();
			case JsonMetaschemaMMPackage.SCHEMA_ARRAY: return createSchemaArray();
			case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION: return createMaxPropertiesSchemaDefinition();
			case JsonMetaschemaMMPackage.NULL_VALUE: return createNullValue();
			case JsonMetaschemaMMPackage.MINIMUM_SCHEMA_DEFINITION: return createMinimumSchemaDefinition();
			case JsonMetaschemaMMPackage.STRING_VALUE: return createStringValue();
			case JsonMetaschemaMMPackage.JSON_DOCUMENT: return createJsonDocument();
			case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION: return createMaxItemsSchemaDefinition();
			case JsonMetaschemaMMPackage.FORMAT_SCHEMA_DEFINITION: return createFormatSchemaDefinition();
			case JsonMetaschemaMMPackage.READ_ONLY_SCHEMA_DEFINITION: return createReadOnlySchemaDefinition();
			case JsonMetaschemaMMPackage.OBJECT_VALUE: return createObjectValue();
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION: return createTypeSchemaDefinition();
			case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION: return createAdditionalPropertiesSchemaDefinition();
			case JsonMetaschemaMMPackage.ELSE_SCHEMA_DEFINITION: return createElseSchemaDefinition();
			case JsonMetaschemaMMPackage.ID_SCHEMA_DEFINITION: return createIdSchemaDefinition();
			case JsonMetaschemaMMPackage.CONST_SCHEMA_DEFINITION: return createConstSchemaDefinition();
			case JsonMetaschemaMMPackage.DEPENDENCIES_SCHEMA_DEFINITION: return createDependenciesSchemaDefinition();
			case JsonMetaschemaMMPackage.NUMBER_VALUE: return createNumberValue();
			case JsonMetaschemaMMPackage.REQUIRED_SCHEMA_DEFINITION: return createRequiredSchemaDefinition();
			case JsonMetaschemaMMPackage.DESCRIPTION_SCHEMA_DEFINITION: return createDescriptionSchemaDefinition();
			case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION: return createMinPropertiesSchemaDefinition();
			case JsonMetaschemaMMPackage.PATTERN_PROPERTIES_SCHEMA_DEFINITION: return createPatternPropertiesSchemaDefinition();
			case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION: return createAdditionalItemsSchemaDefinition();
			case JsonMetaschemaMMPackage.KEY_VALUE_PAIR: return createKeyValuePair();
			case JsonMetaschemaMMPackage.EXAMPLES_SCHEMA_DEFINITION: return createExamplesSchemaDefinition();
			case JsonMetaschemaMMPackage.IF_SCHEMA_DEFINITION: return createIfSchemaDefinition();
			case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION: return createAllOfSchemaDefinition();
			case JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION: return createContentEncodingSchemaDefinition();
			case JsonMetaschemaMMPackage.MULTIPLE_OF_SCHEMA_DEFINITION: return createMultipleOfSchemaDefinition();
			case JsonMetaschemaMMPackage.PATTERN_SCHEMA_DEFINITION: return createPatternSchemaDefinition();
			case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION: return createContainsSchemaDefinition();
			case JsonMetaschemaMMPackage.NOT_SCHEMA_DEFINITION: return createNotSchemaDefinition();
			case JsonMetaschemaMMPackage.EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION: return createExclusiveMaximumSchemaDefinition();
			case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION: return createMaxLengthSchemaDefinition();
			case JsonMetaschemaMMPackage.REF_SCHEMA_DEFINITION: return createRefSchemaDefinition();
			case JsonMetaschemaMMPackage.JSON_SCHEMA: return createJsonSchema();
			case JsonMetaschemaMMPackage.KEY_SCHEMA_PAIR: return createKeySchemaPair();
			case JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION: return createContentMediaTypeSchemaDefinition();
			case JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION: return createExclusiveMinimumSchemaDefinition();
			case JsonMetaschemaMMPackage.SCHEMA_SCHEMA_DEFINITION: return createSchemaSchemaDefinition();
			case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION: return createPropertiesSchemaDefinition();
			case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION: return createPropertyNamesSchemaDefinition();
			case JsonMetaschemaMMPackage.ARRAY_VALUE: return createArrayValue();
			case JsonMetaschemaMMPackage.TYPES_ANY_OF2: return createTypesAnyOf2();
			case JsonMetaschemaMMPackage.BOOLEAN_SCHEMA: return createBooleanSchema();
			case JsonMetaschemaMMPackage.NON_NEGATIVE_INTEGER: return createNonNegativeInteger();
			case JsonMetaschemaMMPackage.NON_NEGATIVE_INTEGER_DEFAULT0: return createNonNegativeIntegerDefault0();
			case JsonMetaschemaMMPackage.SCHEMA_OBJECT_ADDITIONAL_PROPERTIES: return createSchemaObjectAdditionalProperties();
			case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES: return createSchemaObjectDependenciesAdditionalProperties();
			case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1: return createSchemaObjectDependenciesAdditionalPropertiesAnyOf1();
			case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2: return createSchemaObjectDependenciesAdditionalPropertiesAnyOf2();
			case JsonMetaschemaMMPackage.ITEMS_ANY_OF1: return createItemsAnyOf1();
			case JsonMetaschemaMMPackage.ITEMS_ANY_OF2: return createItemsAnyOf2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JsonMetaschemaMMPackage.SIMPLE_TYPES:
				return createSimpleTypesFromString(eDataType, initialValue);
			case JsonMetaschemaMMPackage.NULL_ENUM:
				return createNullEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JsonMetaschemaMMPackage.SIMPLE_TYPES:
				return convertSimpleTypesToString(eDataType, instanceValue);
			case JsonMetaschemaMMPackage.NULL_ENUM:
				return convertNullEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectSchema createObjectSchema() {
		ObjectSchemaImpl objectSchema = new ObjectSchemaImpl();
		return objectSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaximumSchemaDefinition createMaximumSchemaDefinition() {
		MaximumSchemaDefinitionImpl maximumSchemaDefinition = new MaximumSchemaDefinitionImpl();
		return maximumSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WriteOnlySchemaDefinition createWriteOnlySchemaDefinition() {
		WriteOnlySchemaDefinitionImpl writeOnlySchemaDefinition = new WriteOnlySchemaDefinitionImpl();
		return writeOnlySchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentSchemaDefinition createCommentSchemaDefinition() {
		CommentSchemaDefinitionImpl commentSchemaDefinition = new CommentSchemaDefinitionImpl();
		return commentSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumSchemaDefinition createEnumSchemaDefinition() {
		EnumSchemaDefinitionImpl enumSchemaDefinition = new EnumSchemaDefinitionImpl();
		return enumSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniqueItemsSchemaDefinition createUniqueItemsSchemaDefinition() {
		UniqueItemsSchemaDefinitionImpl uniqueItemsSchemaDefinition = new UniqueItemsSchemaDefinitionImpl();
		return uniqueItemsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyOfSchemaDefinition createAnyOfSchemaDefinition() {
		AnyOfSchemaDefinitionImpl anyOfSchemaDefinition = new AnyOfSchemaDefinitionImpl();
		return anyOfSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArray createStringArray() {
		StringArrayImpl stringArray = new StringArrayImpl();
		return stringArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleSchemaDefinition createTitleSchemaDefinition() {
		TitleSchemaDefinitionImpl titleSchemaDefinition = new TitleSchemaDefinitionImpl();
		return titleSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemsSchemaDefinition createItemsSchemaDefinition() {
		ItemsSchemaDefinitionImpl itemsSchemaDefinition = new ItemsSchemaDefinitionImpl();
		return itemsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultSchemaDefinition createDefaultSchemaDefinition() {
		DefaultSchemaDefinitionImpl defaultSchemaDefinition = new DefaultSchemaDefinitionImpl();
		return defaultSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThenSchemaDefinition createThenSchemaDefinition() {
		ThenSchemaDefinitionImpl thenSchemaDefinition = new ThenSchemaDefinitionImpl();
		return thenSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinLengthSchemaDefinition createMinLengthSchemaDefinition() {
		MinLengthSchemaDefinitionImpl minLengthSchemaDefinition = new MinLengthSchemaDefinitionImpl();
		return minLengthSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionsSchemaDefinition createDefinitionsSchemaDefinition() {
		DefinitionsSchemaDefinitionImpl definitionsSchemaDefinition = new DefinitionsSchemaDefinitionImpl();
		return definitionsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinItemsSchemaDefinition createMinItemsSchemaDefinition() {
		MinItemsSchemaDefinitionImpl minItemsSchemaDefinition = new MinItemsSchemaDefinitionImpl();
		return minItemsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneOfSchemaDefinition createOneOfSchemaDefinition() {
		OneOfSchemaDefinitionImpl oneOfSchemaDefinition = new OneOfSchemaDefinitionImpl();
		return oneOfSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaArray createSchemaArray() {
		SchemaArrayImpl schemaArray = new SchemaArrayImpl();
		return schemaArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxPropertiesSchemaDefinition createMaxPropertiesSchemaDefinition() {
		MaxPropertiesSchemaDefinitionImpl maxPropertiesSchemaDefinition = new MaxPropertiesSchemaDefinitionImpl();
		return maxPropertiesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue createNullValue() {
		NullValueImpl nullValue = new NullValueImpl();
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinimumSchemaDefinition createMinimumSchemaDefinition() {
		MinimumSchemaDefinitionImpl minimumSchemaDefinition = new MinimumSchemaDefinitionImpl();
		return minimumSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDocument createJsonDocument() {
		JsonDocumentImpl jsonDocument = new JsonDocumentImpl();
		return jsonDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxItemsSchemaDefinition createMaxItemsSchemaDefinition() {
		MaxItemsSchemaDefinitionImpl maxItemsSchemaDefinition = new MaxItemsSchemaDefinitionImpl();
		return maxItemsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormatSchemaDefinition createFormatSchemaDefinition() {
		FormatSchemaDefinitionImpl formatSchemaDefinition = new FormatSchemaDefinitionImpl();
		return formatSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReadOnlySchemaDefinition createReadOnlySchemaDefinition() {
		ReadOnlySchemaDefinitionImpl readOnlySchemaDefinition = new ReadOnlySchemaDefinitionImpl();
		return readOnlySchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectValue createObjectValue() {
		ObjectValueImpl objectValue = new ObjectValueImpl();
		return objectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeSchemaDefinition createTypeSchemaDefinition() {
		TypeSchemaDefinitionImpl typeSchemaDefinition = new TypeSchemaDefinitionImpl();
		return typeSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalPropertiesSchemaDefinition createAdditionalPropertiesSchemaDefinition() {
		AdditionalPropertiesSchemaDefinitionImpl additionalPropertiesSchemaDefinition = new AdditionalPropertiesSchemaDefinitionImpl();
		return additionalPropertiesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseSchemaDefinition createElseSchemaDefinition() {
		ElseSchemaDefinitionImpl elseSchemaDefinition = new ElseSchemaDefinitionImpl();
		return elseSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdSchemaDefinition createIdSchemaDefinition() {
		IdSchemaDefinitionImpl idSchemaDefinition = new IdSchemaDefinitionImpl();
		return idSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstSchemaDefinition createConstSchemaDefinition() {
		ConstSchemaDefinitionImpl constSchemaDefinition = new ConstSchemaDefinitionImpl();
		return constSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesSchemaDefinition createDependenciesSchemaDefinition() {
		DependenciesSchemaDefinitionImpl dependenciesSchemaDefinition = new DependenciesSchemaDefinitionImpl();
		return dependenciesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredSchemaDefinition createRequiredSchemaDefinition() {
		RequiredSchemaDefinitionImpl requiredSchemaDefinition = new RequiredSchemaDefinitionImpl();
		return requiredSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionSchemaDefinition createDescriptionSchemaDefinition() {
		DescriptionSchemaDefinitionImpl descriptionSchemaDefinition = new DescriptionSchemaDefinitionImpl();
		return descriptionSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinPropertiesSchemaDefinition createMinPropertiesSchemaDefinition() {
		MinPropertiesSchemaDefinitionImpl minPropertiesSchemaDefinition = new MinPropertiesSchemaDefinitionImpl();
		return minPropertiesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternPropertiesSchemaDefinition createPatternPropertiesSchemaDefinition() {
		PatternPropertiesSchemaDefinitionImpl patternPropertiesSchemaDefinition = new PatternPropertiesSchemaDefinitionImpl();
		return patternPropertiesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalItemsSchemaDefinition createAdditionalItemsSchemaDefinition() {
		AdditionalItemsSchemaDefinitionImpl additionalItemsSchemaDefinition = new AdditionalItemsSchemaDefinitionImpl();
		return additionalItemsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExamplesSchemaDefinition createExamplesSchemaDefinition() {
		ExamplesSchemaDefinitionImpl examplesSchemaDefinition = new ExamplesSchemaDefinitionImpl();
		return examplesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfSchemaDefinition createIfSchemaDefinition() {
		IfSchemaDefinitionImpl ifSchemaDefinition = new IfSchemaDefinitionImpl();
		return ifSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllOfSchemaDefinition createAllOfSchemaDefinition() {
		AllOfSchemaDefinitionImpl allOfSchemaDefinition = new AllOfSchemaDefinitionImpl();
		return allOfSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentEncodingSchemaDefinition createContentEncodingSchemaDefinition() {
		ContentEncodingSchemaDefinitionImpl contentEncodingSchemaDefinition = new ContentEncodingSchemaDefinitionImpl();
		return contentEncodingSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultipleOfSchemaDefinition createMultipleOfSchemaDefinition() {
		MultipleOfSchemaDefinitionImpl multipleOfSchemaDefinition = new MultipleOfSchemaDefinitionImpl();
		return multipleOfSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternSchemaDefinition createPatternSchemaDefinition() {
		PatternSchemaDefinitionImpl patternSchemaDefinition = new PatternSchemaDefinitionImpl();
		return patternSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainsSchemaDefinition createContainsSchemaDefinition() {
		ContainsSchemaDefinitionImpl containsSchemaDefinition = new ContainsSchemaDefinitionImpl();
		return containsSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotSchemaDefinition createNotSchemaDefinition() {
		NotSchemaDefinitionImpl notSchemaDefinition = new NotSchemaDefinitionImpl();
		return notSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusiveMaximumSchemaDefinition createExclusiveMaximumSchemaDefinition() {
		ExclusiveMaximumSchemaDefinitionImpl exclusiveMaximumSchemaDefinition = new ExclusiveMaximumSchemaDefinitionImpl();
		return exclusiveMaximumSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaxLengthSchemaDefinition createMaxLengthSchemaDefinition() {
		MaxLengthSchemaDefinitionImpl maxLengthSchemaDefinition = new MaxLengthSchemaDefinitionImpl();
		return maxLengthSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefSchemaDefinition createRefSchemaDefinition() {
		RefSchemaDefinitionImpl refSchemaDefinition = new RefSchemaDefinitionImpl();
		return refSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonSchema createJsonSchema() {
		JsonSchemaImpl jsonSchema = new JsonSchemaImpl();
		return jsonSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeySchemaPair createKeySchemaPair() {
		KeySchemaPairImpl keySchemaPair = new KeySchemaPairImpl();
		return keySchemaPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentMediaTypeSchemaDefinition createContentMediaTypeSchemaDefinition() {
		ContentMediaTypeSchemaDefinitionImpl contentMediaTypeSchemaDefinition = new ContentMediaTypeSchemaDefinitionImpl();
		return contentMediaTypeSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusiveMinimumSchemaDefinition createExclusiveMinimumSchemaDefinition() {
		ExclusiveMinimumSchemaDefinitionImpl exclusiveMinimumSchemaDefinition = new ExclusiveMinimumSchemaDefinitionImpl();
		return exclusiveMinimumSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaSchemaDefinition createSchemaSchemaDefinition() {
		SchemaSchemaDefinitionImpl schemaSchemaDefinition = new SchemaSchemaDefinitionImpl();
		return schemaSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesSchemaDefinition createPropertiesSchemaDefinition() {
		PropertiesSchemaDefinitionImpl propertiesSchemaDefinition = new PropertiesSchemaDefinitionImpl();
		return propertiesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNamesSchemaDefinition createPropertyNamesSchemaDefinition() {
		PropertyNamesSchemaDefinitionImpl propertyNamesSchemaDefinition = new PropertyNamesSchemaDefinitionImpl();
		return propertyNamesSchemaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesAnyOf2 createTypesAnyOf2() {
		TypesAnyOf2Impl typesAnyOf2 = new TypesAnyOf2Impl();
		return typesAnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanSchema createBooleanSchema() {
		BooleanSchemaImpl booleanSchema = new BooleanSchemaImpl();
		return booleanSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonNegativeInteger createNonNegativeInteger() {
		NonNegativeIntegerImpl nonNegativeInteger = new NonNegativeIntegerImpl();
		return nonNegativeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonNegativeIntegerDefault0 createNonNegativeIntegerDefault0() {
		NonNegativeIntegerDefault0Impl nonNegativeIntegerDefault0 = new NonNegativeIntegerDefault0Impl();
		return nonNegativeIntegerDefault0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaObjectAdditionalProperties createSchemaObjectAdditionalProperties() {
		SchemaObjectAdditionalPropertiesImpl schemaObjectAdditionalProperties = new SchemaObjectAdditionalPropertiesImpl();
		return schemaObjectAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaObjectDependenciesAdditionalProperties createSchemaObjectDependenciesAdditionalProperties() {
		SchemaObjectDependenciesAdditionalPropertiesImpl schemaObjectDependenciesAdditionalProperties = new SchemaObjectDependenciesAdditionalPropertiesImpl();
		return schemaObjectDependenciesAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaObjectDependenciesAdditionalPropertiesAnyOf1 createSchemaObjectDependenciesAdditionalPropertiesAnyOf1() {
		SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl schemaObjectDependenciesAdditionalPropertiesAnyOf1 = new SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl();
		return schemaObjectDependenciesAdditionalPropertiesAnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaObjectDependenciesAdditionalPropertiesAnyOf2 createSchemaObjectDependenciesAdditionalPropertiesAnyOf2() {
		SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl schemaObjectDependenciesAdditionalPropertiesAnyOf2 = new SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl();
		return schemaObjectDependenciesAdditionalPropertiesAnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemsAnyOf1 createItemsAnyOf1() {
		ItemsAnyOf1Impl itemsAnyOf1 = new ItemsAnyOf1Impl();
		return itemsAnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemsAnyOf2 createItemsAnyOf2() {
		ItemsAnyOf2Impl itemsAnyOf2 = new ItemsAnyOf2Impl();
		return itemsAnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypes createSimpleTypesFromString(EDataType eDataType, String initialValue) {
		SimpleTypes result = SimpleTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimpleTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullEnum createNullEnumFromString(EDataType eDataType, String initialValue) {
		NullEnum result = NullEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonMetaschemaMMPackage getJsonMetaschemaMMPackage() {
		return (JsonMetaschemaMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JsonMetaschemaMMPackage getPackage() {
		return JsonMetaschemaMMPackage.eINSTANCE;
	}

} //JsonMetaschemaMMFactoryImpl
