/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.util;

import jsonMetaschemaMM.jsonMetaschemaMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage
 * @generated
 */
public class JsonMetaschemaMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JsonMetaschemaMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonMetaschemaMMSwitch() {
		if (modelPackage == null) {
			modelPackage = JsonMetaschemaMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case JsonMetaschemaMMPackage.OBJECT_SCHEMA: {
			ObjectSchema objectSchema = (ObjectSchema) theEObject;
			T result = caseObjectSchema(objectSchema);
			if (result == null)
				result = caseSchema(objectSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MAXIMUM_SCHEMA_DEFINITION: {
			MaximumSchemaDefinition maximumSchemaDefinition = (MaximumSchemaDefinition) theEObject;
			T result = caseMaximumSchemaDefinition(maximumSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(maximumSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.INTEGER_VALUE: {
			IntegerValue integerValue = (IntegerValue) theEObject;
			T result = caseIntegerValue(integerValue);
			if (result == null)
				result = caseValue(integerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.WRITE_ONLY_SCHEMA_DEFINITION: {
			WriteOnlySchemaDefinition writeOnlySchemaDefinition = (WriteOnlySchemaDefinition) theEObject;
			T result = caseWriteOnlySchemaDefinition(writeOnlySchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(writeOnlySchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.COMMENT_SCHEMA_DEFINITION: {
			CommentSchemaDefinition commentSchemaDefinition = (CommentSchemaDefinition) theEObject;
			T result = caseCommentSchemaDefinition(commentSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(commentSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ENUM_SCHEMA_DEFINITION: {
			EnumSchemaDefinition enumSchemaDefinition = (EnumSchemaDefinition) theEObject;
			T result = caseEnumSchemaDefinition(enumSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(enumSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION: {
			UniqueItemsSchemaDefinition uniqueItemsSchemaDefinition = (UniqueItemsSchemaDefinition) theEObject;
			T result = caseUniqueItemsSchemaDefinition(uniqueItemsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(uniqueItemsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION: {
			AnyOfSchemaDefinition anyOfSchemaDefinition = (AnyOfSchemaDefinition) theEObject;
			T result = caseAnyOfSchemaDefinition(anyOfSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(anyOfSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.STRING_ARRAY: {
			StringArray stringArray = (StringArray) theEObject;
			T result = caseStringArray(stringArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.TITLE_SCHEMA_DEFINITION: {
			TitleSchemaDefinition titleSchemaDefinition = (TitleSchemaDefinition) theEObject;
			T result = caseTitleSchemaDefinition(titleSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(titleSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION: {
			ItemsSchemaDefinition itemsSchemaDefinition = (ItemsSchemaDefinition) theEObject;
			T result = caseItemsSchemaDefinition(itemsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(itemsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.DEFAULT_SCHEMA_DEFINITION: {
			DefaultSchemaDefinition defaultSchemaDefinition = (DefaultSchemaDefinition) theEObject;
			T result = caseDefaultSchemaDefinition(defaultSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(defaultSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.THEN_SCHEMA_DEFINITION: {
			ThenSchemaDefinition thenSchemaDefinition = (ThenSchemaDefinition) theEObject;
			T result = caseThenSchemaDefinition(thenSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(thenSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION: {
			MinLengthSchemaDefinition minLengthSchemaDefinition = (MinLengthSchemaDefinition) theEObject;
			T result = caseMinLengthSchemaDefinition(minLengthSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(minLengthSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.DEFINITIONS_SCHEMA_DEFINITION: {
			DefinitionsSchemaDefinition definitionsSchemaDefinition = (DefinitionsSchemaDefinition) theEObject;
			T result = caseDefinitionsSchemaDefinition(definitionsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(definitionsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.BOOLEAN_VALUE: {
			BooleanValue booleanValue = (BooleanValue) theEObject;
			T result = caseBooleanValue(booleanValue);
			if (result == null)
				result = caseValue(booleanValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION: {
			MinItemsSchemaDefinition minItemsSchemaDefinition = (MinItemsSchemaDefinition) theEObject;
			T result = caseMinItemsSchemaDefinition(minItemsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(minItemsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ONE_OF_SCHEMA_DEFINITION: {
			OneOfSchemaDefinition oneOfSchemaDefinition = (OneOfSchemaDefinition) theEObject;
			T result = caseOneOfSchemaDefinition(oneOfSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(oneOfSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_ARRAY: {
			SchemaArray schemaArray = (SchemaArray) theEObject;
			T result = caseSchemaArray(schemaArray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION: {
			MaxPropertiesSchemaDefinition maxPropertiesSchemaDefinition = (MaxPropertiesSchemaDefinition) theEObject;
			T result = caseMaxPropertiesSchemaDefinition(maxPropertiesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(maxPropertiesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.NULL_VALUE: {
			NullValue nullValue = (NullValue) theEObject;
			T result = caseNullValue(nullValue);
			if (result == null)
				result = caseValue(nullValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MINIMUM_SCHEMA_DEFINITION: {
			MinimumSchemaDefinition minimumSchemaDefinition = (MinimumSchemaDefinition) theEObject;
			T result = caseMinimumSchemaDefinition(minimumSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(minimumSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.STRING_VALUE: {
			StringValue stringValue = (StringValue) theEObject;
			T result = caseStringValue(stringValue);
			if (result == null)
				result = caseValue(stringValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.JSON_DOCUMENT: {
			JsonDocument jsonDocument = (JsonDocument) theEObject;
			T result = caseJsonDocument(jsonDocument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION: {
			MaxItemsSchemaDefinition maxItemsSchemaDefinition = (MaxItemsSchemaDefinition) theEObject;
			T result = caseMaxItemsSchemaDefinition(maxItemsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(maxItemsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.FORMAT_SCHEMA_DEFINITION: {
			FormatSchemaDefinition formatSchemaDefinition = (FormatSchemaDefinition) theEObject;
			T result = caseFormatSchemaDefinition(formatSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(formatSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.READ_ONLY_SCHEMA_DEFINITION: {
			ReadOnlySchemaDefinition readOnlySchemaDefinition = (ReadOnlySchemaDefinition) theEObject;
			T result = caseReadOnlySchemaDefinition(readOnlySchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(readOnlySchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA: {
			Schema schema = (Schema) theEObject;
			T result = caseSchema(schema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.OBJECT_VALUE: {
			ObjectValue objectValue = (ObjectValue) theEObject;
			T result = caseObjectValue(objectValue);
			if (result == null)
				result = caseValue(objectValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION: {
			TypeSchemaDefinition typeSchemaDefinition = (TypeSchemaDefinition) theEObject;
			T result = caseTypeSchemaDefinition(typeSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(typeSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION: {
			AdditionalPropertiesSchemaDefinition additionalPropertiesSchemaDefinition = (AdditionalPropertiesSchemaDefinition) theEObject;
			T result = caseAdditionalPropertiesSchemaDefinition(additionalPropertiesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(additionalPropertiesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ELSE_SCHEMA_DEFINITION: {
			ElseSchemaDefinition elseSchemaDefinition = (ElseSchemaDefinition) theEObject;
			T result = caseElseSchemaDefinition(elseSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(elseSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ID_SCHEMA_DEFINITION: {
			IdSchemaDefinition idSchemaDefinition = (IdSchemaDefinition) theEObject;
			T result = caseIdSchemaDefinition(idSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(idSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.CONST_SCHEMA_DEFINITION: {
			ConstSchemaDefinition constSchemaDefinition = (ConstSchemaDefinition) theEObject;
			T result = caseConstSchemaDefinition(constSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(constSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.DEPENDENCIES_SCHEMA_DEFINITION: {
			DependenciesSchemaDefinition dependenciesSchemaDefinition = (DependenciesSchemaDefinition) theEObject;
			T result = caseDependenciesSchemaDefinition(dependenciesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(dependenciesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.NUMBER_VALUE: {
			NumberValue numberValue = (NumberValue) theEObject;
			T result = caseNumberValue(numberValue);
			if (result == null)
				result = caseValue(numberValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.REQUIRED_SCHEMA_DEFINITION: {
			RequiredSchemaDefinition requiredSchemaDefinition = (RequiredSchemaDefinition) theEObject;
			T result = caseRequiredSchemaDefinition(requiredSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(requiredSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.DESCRIPTION_SCHEMA_DEFINITION: {
			DescriptionSchemaDefinition descriptionSchemaDefinition = (DescriptionSchemaDefinition) theEObject;
			T result = caseDescriptionSchemaDefinition(descriptionSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(descriptionSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION: {
			MinPropertiesSchemaDefinition minPropertiesSchemaDefinition = (MinPropertiesSchemaDefinition) theEObject;
			T result = caseMinPropertiesSchemaDefinition(minPropertiesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(minPropertiesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.PATTERN_PROPERTIES_SCHEMA_DEFINITION: {
			PatternPropertiesSchemaDefinition patternPropertiesSchemaDefinition = (PatternPropertiesSchemaDefinition) theEObject;
			T result = casePatternPropertiesSchemaDefinition(patternPropertiesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(patternPropertiesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION: {
			AdditionalItemsSchemaDefinition additionalItemsSchemaDefinition = (AdditionalItemsSchemaDefinition) theEObject;
			T result = caseAdditionalItemsSchemaDefinition(additionalItemsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(additionalItemsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.KEY_VALUE_PAIR: {
			KeyValuePair keyValuePair = (KeyValuePair) theEObject;
			T result = caseKeyValuePair(keyValuePair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.EXAMPLES_SCHEMA_DEFINITION: {
			ExamplesSchemaDefinition examplesSchemaDefinition = (ExamplesSchemaDefinition) theEObject;
			T result = caseExamplesSchemaDefinition(examplesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(examplesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.IF_SCHEMA_DEFINITION: {
			IfSchemaDefinition ifSchemaDefinition = (IfSchemaDefinition) theEObject;
			T result = caseIfSchemaDefinition(ifSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(ifSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION: {
			AllOfSchemaDefinition allOfSchemaDefinition = (AllOfSchemaDefinition) theEObject;
			T result = caseAllOfSchemaDefinition(allOfSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(allOfSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION: {
			ContentEncodingSchemaDefinition contentEncodingSchemaDefinition = (ContentEncodingSchemaDefinition) theEObject;
			T result = caseContentEncodingSchemaDefinition(contentEncodingSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(contentEncodingSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MULTIPLE_OF_SCHEMA_DEFINITION: {
			MultipleOfSchemaDefinition multipleOfSchemaDefinition = (MultipleOfSchemaDefinition) theEObject;
			T result = caseMultipleOfSchemaDefinition(multipleOfSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(multipleOfSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.PATTERN_SCHEMA_DEFINITION: {
			PatternSchemaDefinition patternSchemaDefinition = (PatternSchemaDefinition) theEObject;
			T result = casePatternSchemaDefinition(patternSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(patternSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.KEYWORD_DEFINITION: {
			KeywordDefinition keywordDefinition = (KeywordDefinition) theEObject;
			T result = caseKeywordDefinition(keywordDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION: {
			ContainsSchemaDefinition containsSchemaDefinition = (ContainsSchemaDefinition) theEObject;
			T result = caseContainsSchemaDefinition(containsSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(containsSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.NOT_SCHEMA_DEFINITION: {
			NotSchemaDefinition notSchemaDefinition = (NotSchemaDefinition) theEObject;
			T result = caseNotSchemaDefinition(notSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(notSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION: {
			ExclusiveMaximumSchemaDefinition exclusiveMaximumSchemaDefinition = (ExclusiveMaximumSchemaDefinition) theEObject;
			T result = caseExclusiveMaximumSchemaDefinition(exclusiveMaximumSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(exclusiveMaximumSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION: {
			MaxLengthSchemaDefinition maxLengthSchemaDefinition = (MaxLengthSchemaDefinition) theEObject;
			T result = caseMaxLengthSchemaDefinition(maxLengthSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(maxLengthSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.REF_SCHEMA_DEFINITION: {
			RefSchemaDefinition refSchemaDefinition = (RefSchemaDefinition) theEObject;
			T result = caseRefSchemaDefinition(refSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(refSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.JSON_SCHEMA: {
			JsonSchema jsonSchema = (JsonSchema) theEObject;
			T result = caseJsonSchema(jsonSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.KEY_SCHEMA_PAIR: {
			KeySchemaPair keySchemaPair = (KeySchemaPair) theEObject;
			T result = caseKeySchemaPair(keySchemaPair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION: {
			ContentMediaTypeSchemaDefinition contentMediaTypeSchemaDefinition = (ContentMediaTypeSchemaDefinition) theEObject;
			T result = caseContentMediaTypeSchemaDefinition(contentMediaTypeSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(contentMediaTypeSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION: {
			ExclusiveMinimumSchemaDefinition exclusiveMinimumSchemaDefinition = (ExclusiveMinimumSchemaDefinition) theEObject;
			T result = caseExclusiveMinimumSchemaDefinition(exclusiveMinimumSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(exclusiveMinimumSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_SCHEMA_DEFINITION: {
			SchemaSchemaDefinition schemaSchemaDefinition = (SchemaSchemaDefinition) theEObject;
			T result = caseSchemaSchemaDefinition(schemaSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(schemaSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION: {
			PropertiesSchemaDefinition propertiesSchemaDefinition = (PropertiesSchemaDefinition) theEObject;
			T result = casePropertiesSchemaDefinition(propertiesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(propertiesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION: {
			PropertyNamesSchemaDefinition propertyNamesSchemaDefinition = (PropertyNamesSchemaDefinition) theEObject;
			T result = casePropertyNamesSchemaDefinition(propertyNamesSchemaDefinition);
			if (result == null)
				result = caseKeywordDefinition(propertyNamesSchemaDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.ARRAY_VALUE: {
			ArrayValue arrayValue = (ArrayValue) theEObject;
			T result = caseArrayValue(arrayValue);
			if (result == null)
				result = caseValue(arrayValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.TYPES_ANY_OF2: {
			TypesAnyOf2 typesAnyOf2 = (TypesAnyOf2) theEObject;
			T result = caseTypesAnyOf2(typesAnyOf2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.BOOLEAN_SCHEMA: {
			BooleanSchema booleanSchema = (BooleanSchema) theEObject;
			T result = caseBooleanSchema(booleanSchema);
			if (result == null)
				result = caseSchema(booleanSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.NON_NEGATIVE_INTEGER: {
			NonNegativeInteger nonNegativeInteger = (NonNegativeInteger) theEObject;
			T result = caseNonNegativeInteger(nonNegativeInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.NON_NEGATIVE_INTEGER_DEFAULT0: {
			NonNegativeIntegerDefault0 nonNegativeIntegerDefault0 = (NonNegativeIntegerDefault0) theEObject;
			T result = caseNonNegativeIntegerDefault0(nonNegativeIntegerDefault0);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_ADDITIONAL_PROPERTIES: {
			SchemaObjectAdditionalProperties schemaObjectAdditionalProperties = (SchemaObjectAdditionalProperties) theEObject;
			T result = caseSchemaObjectAdditionalProperties(schemaObjectAdditionalProperties);
			if (result == null)
				result = caseKeywordDefinition(schemaObjectAdditionalProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES: {
			SchemaObjectDependenciesProperties schemaObjectDependenciesProperties = (SchemaObjectDependenciesProperties) theEObject;
			T result = caseSchemaObjectDependenciesProperties(schemaObjectDependenciesProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES: {
			SchemaObjectDependenciesAdditionalProperties schemaObjectDependenciesAdditionalProperties = (SchemaObjectDependenciesAdditionalProperties) theEObject;
			T result = caseSchemaObjectDependenciesAdditionalProperties(schemaObjectDependenciesAdditionalProperties);
			if (result == null)
				result = caseSchemaObjectDependenciesProperties(schemaObjectDependenciesAdditionalProperties);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1: {
			SchemaObjectDependenciesAdditionalPropertiesAnyOf1 schemaObjectDependenciesAdditionalPropertiesAnyOf1 = (SchemaObjectDependenciesAdditionalPropertiesAnyOf1) theEObject;
			T result = caseSchemaObjectDependenciesAdditionalPropertiesAnyOf1(
					schemaObjectDependenciesAdditionalPropertiesAnyOf1);
			if (result == null)
				result = caseSchemaObjectDependenciesAdditionalPropertiesAnyOf(
						schemaObjectDependenciesAdditionalPropertiesAnyOf1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2: {
			SchemaObjectDependenciesAdditionalPropertiesAnyOf2 schemaObjectDependenciesAdditionalPropertiesAnyOf2 = (SchemaObjectDependenciesAdditionalPropertiesAnyOf2) theEObject;
			T result = caseSchemaObjectDependenciesAdditionalPropertiesAnyOf2(
					schemaObjectDependenciesAdditionalPropertiesAnyOf2);
			if (result == null)
				result = caseSchemaObjectDependenciesAdditionalPropertiesAnyOf(
						schemaObjectDependenciesAdditionalPropertiesAnyOf2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF: {
			SchemaObjectDependenciesAdditionalPropertiesAnyOf schemaObjectDependenciesAdditionalPropertiesAnyOf = (SchemaObjectDependenciesAdditionalPropertiesAnyOf) theEObject;
			T result = caseSchemaObjectDependenciesAdditionalPropertiesAnyOf(
					schemaObjectDependenciesAdditionalPropertiesAnyOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSchema(ObjectSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumSchemaDefinition(MaximumSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Only Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Only Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteOnlySchemaDefinition(WriteOnlySchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentSchemaDefinition(CommentSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumSchemaDefinition(EnumSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Items Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Items Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueItemsSchemaDefinition(UniqueItemsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Of Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Of Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyOfSchemaDefinition(AnyOfSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringArray(StringArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleSchemaDefinition(TitleSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Items Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Items Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemsSchemaDefinition(ItemsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultSchemaDefinition(DefaultSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThenSchemaDefinition(ThenSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Length Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Length Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinLengthSchemaDefinition(MinLengthSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsSchemaDefinition(DefinitionsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Items Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Items Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinItemsSchemaDefinition(MinItemsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Of Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Of Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneOfSchemaDefinition(OneOfSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaArray(SchemaArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Properties Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Properties Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxPropertiesSchemaDefinition(MaxPropertiesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullValue(NullValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimumSchemaDefinition(MinimumSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonDocument(JsonDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Items Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Items Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxItemsSchemaDefinition(MaxItemsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Format Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Format Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormatSchemaDefinition(FormatSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Only Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Only Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadOnlySchemaDefinition(ReadOnlySchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectValue(ObjectValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSchemaDefinition(TypeSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Properties Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Properties Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalPropertiesSchemaDefinition(AdditionalPropertiesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseSchemaDefinition(ElseSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdSchemaDefinition(IdSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstSchemaDefinition(ConstSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenciesSchemaDefinition(DependenciesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberValue(NumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredSchemaDefinition(RequiredSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionSchemaDefinition(DescriptionSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Properties Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Properties Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinPropertiesSchemaDefinition(MinPropertiesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Properties Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Properties Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternPropertiesSchemaDefinition(PatternPropertiesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Items Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Items Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalItemsSchemaDefinition(AdditionalItemsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValuePair(KeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Examples Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Examples Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExamplesSchemaDefinition(ExamplesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfSchemaDefinition(IfSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Of Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Of Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllOfSchemaDefinition(AllOfSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Encoding Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Encoding Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentEncodingSchemaDefinition(ContentEncodingSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Of Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Of Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleOfSchemaDefinition(MultipleOfSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternSchemaDefinition(PatternSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordDefinition(KeywordDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainsSchemaDefinition(ContainsSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotSchemaDefinition(NotSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Maximum Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Maximum Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveMaximumSchemaDefinition(ExclusiveMaximumSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Length Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Length Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxLengthSchemaDefinition(MaxLengthSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSchemaDefinition(RefSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonSchema(JsonSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Schema Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Schema Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeySchemaPair(KeySchemaPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Media Type Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Media Type Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentMediaTypeSchemaDefinition(ContentMediaTypeSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Minimum Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Minimum Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveMinimumSchemaDefinition(ExclusiveMinimumSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaSchemaDefinition(SchemaSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesSchemaDefinition(PropertiesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Names Schema Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Names Schema Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyNamesSchemaDefinition(PropertyNamesSchemaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Any Of2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Any Of2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesAnyOf2(TypesAnyOf2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanSchema(BooleanSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeInteger(NonNegativeInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Integer Default0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Integer Default0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeIntegerDefault0(NonNegativeIntegerDefault0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Object Additional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Object Additional Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaObjectAdditionalProperties(SchemaObjectAdditionalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Object Dependencies Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Object Dependencies Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaObjectDependenciesProperties(SchemaObjectDependenciesProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaObjectDependenciesAdditionalProperties(SchemaObjectDependenciesAdditionalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties Any Of1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties Any Of1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaObjectDependenciesAdditionalPropertiesAnyOf1(
			SchemaObjectDependenciesAdditionalPropertiesAnyOf1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties Any Of2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties Any Of2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaObjectDependenciesAdditionalPropertiesAnyOf2(
			SchemaObjectDependenciesAdditionalPropertiesAnyOf2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties Any Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Object Dependencies Additional Properties Any Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaObjectDependenciesAdditionalPropertiesAnyOf(
			SchemaObjectDependenciesAdditionalPropertiesAnyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JsonMetaschemaMMSwitch
