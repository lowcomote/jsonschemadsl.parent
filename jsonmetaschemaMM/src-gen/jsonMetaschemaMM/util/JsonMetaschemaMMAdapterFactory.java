/**
 */
package jsonMetaschemaMM.util;

import jsonMetaschemaMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage
 * @generated
 */
public class JsonMetaschemaMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JsonMetaschemaMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonMetaschemaMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JsonMetaschemaMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonMetaschemaMMSwitch<Adapter> modelSwitch =
		new JsonMetaschemaMMSwitch<Adapter>() {
			@Override
			public Adapter caseObjectSchema(ObjectSchema object) {
				return createObjectSchemaAdapter();
			}
			@Override
			public Adapter caseMaximumSchemaDefinition(MaximumSchemaDefinition object) {
				return createMaximumSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseWriteOnlySchemaDefinition(WriteOnlySchemaDefinition object) {
				return createWriteOnlySchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseCommentSchemaDefinition(CommentSchemaDefinition object) {
				return createCommentSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumSchemaDefinition(EnumSchemaDefinition object) {
				return createEnumSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseUniqueItemsSchemaDefinition(UniqueItemsSchemaDefinition object) {
				return createUniqueItemsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseAnyOfSchemaDefinition(AnyOfSchemaDefinition object) {
				return createAnyOfSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseStringArray(StringArray object) {
				return createStringArrayAdapter();
			}
			@Override
			public Adapter caseTitleSchemaDefinition(TitleSchemaDefinition object) {
				return createTitleSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseItemsSchemaDefinition(ItemsSchemaDefinition object) {
				return createItemsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseDefaultSchemaDefinition(DefaultSchemaDefinition object) {
				return createDefaultSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseThenSchemaDefinition(ThenSchemaDefinition object) {
				return createThenSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseMinLengthSchemaDefinition(MinLengthSchemaDefinition object) {
				return createMinLengthSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseDefinitionsSchemaDefinition(DefinitionsSchemaDefinition object) {
				return createDefinitionsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseMinItemsSchemaDefinition(MinItemsSchemaDefinition object) {
				return createMinItemsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseOneOfSchemaDefinition(OneOfSchemaDefinition object) {
				return createOneOfSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseSchemaArray(SchemaArray object) {
				return createSchemaArrayAdapter();
			}
			@Override
			public Adapter caseMaxPropertiesSchemaDefinition(MaxPropertiesSchemaDefinition object) {
				return createMaxPropertiesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseNullValue(NullValue object) {
				return createNullValueAdapter();
			}
			@Override
			public Adapter caseMinimumSchemaDefinition(MinimumSchemaDefinition object) {
				return createMinimumSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseJsonDocument(JsonDocument object) {
				return createJsonDocumentAdapter();
			}
			@Override
			public Adapter caseMaxItemsSchemaDefinition(MaxItemsSchemaDefinition object) {
				return createMaxItemsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseFormatSchemaDefinition(FormatSchemaDefinition object) {
				return createFormatSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseReadOnlySchemaDefinition(ReadOnlySchemaDefinition object) {
				return createReadOnlySchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseObjectValue(ObjectValue object) {
				return createObjectValueAdapter();
			}
			@Override
			public Adapter caseTypeSchemaDefinition(TypeSchemaDefinition object) {
				return createTypeSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseAdditionalPropertiesSchemaDefinition(AdditionalPropertiesSchemaDefinition object) {
				return createAdditionalPropertiesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseElseSchemaDefinition(ElseSchemaDefinition object) {
				return createElseSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseIdSchemaDefinition(IdSchemaDefinition object) {
				return createIdSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseConstSchemaDefinition(ConstSchemaDefinition object) {
				return createConstSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseDependenciesSchemaDefinition(DependenciesSchemaDefinition object) {
				return createDependenciesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseNumberValue(NumberValue object) {
				return createNumberValueAdapter();
			}
			@Override
			public Adapter caseRequiredSchemaDefinition(RequiredSchemaDefinition object) {
				return createRequiredSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseDescriptionSchemaDefinition(DescriptionSchemaDefinition object) {
				return createDescriptionSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseMinPropertiesSchemaDefinition(MinPropertiesSchemaDefinition object) {
				return createMinPropertiesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter casePatternPropertiesSchemaDefinition(PatternPropertiesSchemaDefinition object) {
				return createPatternPropertiesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseAdditionalItemsSchemaDefinition(AdditionalItemsSchemaDefinition object) {
				return createAdditionalItemsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseKeyValuePair(KeyValuePair object) {
				return createKeyValuePairAdapter();
			}
			@Override
			public Adapter caseExamplesSchemaDefinition(ExamplesSchemaDefinition object) {
				return createExamplesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseIfSchemaDefinition(IfSchemaDefinition object) {
				return createIfSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseAllOfSchemaDefinition(AllOfSchemaDefinition object) {
				return createAllOfSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseContentEncodingSchemaDefinition(ContentEncodingSchemaDefinition object) {
				return createContentEncodingSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseMultipleOfSchemaDefinition(MultipleOfSchemaDefinition object) {
				return createMultipleOfSchemaDefinitionAdapter();
			}
			@Override
			public Adapter casePatternSchemaDefinition(PatternSchemaDefinition object) {
				return createPatternSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseKeywordDefinition(KeywordDefinition object) {
				return createKeywordDefinitionAdapter();
			}
			@Override
			public Adapter caseContainsSchemaDefinition(ContainsSchemaDefinition object) {
				return createContainsSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseNotSchemaDefinition(NotSchemaDefinition object) {
				return createNotSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseExclusiveMaximumSchemaDefinition(ExclusiveMaximumSchemaDefinition object) {
				return createExclusiveMaximumSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseMaxLengthSchemaDefinition(MaxLengthSchemaDefinition object) {
				return createMaxLengthSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseRefSchemaDefinition(RefSchemaDefinition object) {
				return createRefSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseJsonSchema(JsonSchema object) {
				return createJsonSchemaAdapter();
			}
			@Override
			public Adapter caseKeySchemaPair(KeySchemaPair object) {
				return createKeySchemaPairAdapter();
			}
			@Override
			public Adapter caseContentMediaTypeSchemaDefinition(ContentMediaTypeSchemaDefinition object) {
				return createContentMediaTypeSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseExclusiveMinimumSchemaDefinition(ExclusiveMinimumSchemaDefinition object) {
				return createExclusiveMinimumSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseSchemaSchemaDefinition(SchemaSchemaDefinition object) {
				return createSchemaSchemaDefinitionAdapter();
			}
			@Override
			public Adapter casePropertiesSchemaDefinition(PropertiesSchemaDefinition object) {
				return createPropertiesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyNamesSchemaDefinition(PropertyNamesSchemaDefinition object) {
				return createPropertyNamesSchemaDefinitionAdapter();
			}
			@Override
			public Adapter caseArrayValue(ArrayValue object) {
				return createArrayValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseTypesAnyOf2(TypesAnyOf2 object) {
				return createTypesAnyOf2Adapter();
			}
			@Override
			public Adapter caseBooleanSchema(BooleanSchema object) {
				return createBooleanSchemaAdapter();
			}
			@Override
			public Adapter caseNonNegativeInteger(NonNegativeInteger object) {
				return createNonNegativeIntegerAdapter();
			}
			@Override
			public Adapter caseNonNegativeIntegerDefault0(NonNegativeIntegerDefault0 object) {
				return createNonNegativeIntegerDefault0Adapter();
			}
			@Override
			public Adapter caseSchemaObjectAdditionalProperties(SchemaObjectAdditionalProperties object) {
				return createSchemaObjectAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseSchemaObjectDependenciesProperties(SchemaObjectDependenciesProperties object) {
				return createSchemaObjectDependenciesPropertiesAdapter();
			}
			@Override
			public Adapter caseSchemaObjectDependenciesAdditionalProperties(SchemaObjectDependenciesAdditionalProperties object) {
				return createSchemaObjectDependenciesAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseSchemaObjectDependenciesAdditionalPropertiesAnyOf1(SchemaObjectDependenciesAdditionalPropertiesAnyOf1 object) {
				return createSchemaObjectDependenciesAdditionalPropertiesAnyOf1Adapter();
			}
			@Override
			public Adapter caseSchemaObjectDependenciesAdditionalPropertiesAnyOf2(SchemaObjectDependenciesAdditionalPropertiesAnyOf2 object) {
				return createSchemaObjectDependenciesAdditionalPropertiesAnyOf2Adapter();
			}
			@Override
			public Adapter caseSchemaObjectDependenciesAdditionalPropertiesAnyOf(SchemaObjectDependenciesAdditionalPropertiesAnyOf object) {
				return createSchemaObjectDependenciesAdditionalPropertiesAnyOfAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ObjectSchema
	 * @generated
	 */
	public Adapter createObjectSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MaximumSchemaDefinition <em>Maximum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MaximumSchemaDefinition
	 * @generated
	 */
	public Adapter createMaximumSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.WriteOnlySchemaDefinition <em>Write Only Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.WriteOnlySchemaDefinition
	 * @generated
	 */
	public Adapter createWriteOnlySchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.CommentSchemaDefinition <em>Comment Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.CommentSchemaDefinition
	 * @generated
	 */
	public Adapter createCommentSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.EnumSchemaDefinition <em>Enum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.EnumSchemaDefinition
	 * @generated
	 */
	public Adapter createEnumSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.UniqueItemsSchemaDefinition <em>Unique Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.UniqueItemsSchemaDefinition
	 * @generated
	 */
	public Adapter createUniqueItemsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.AnyOfSchemaDefinition <em>Any Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.AnyOfSchemaDefinition
	 * @generated
	 */
	public Adapter createAnyOfSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.StringArray <em>String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.StringArray
	 * @generated
	 */
	public Adapter createStringArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.TitleSchemaDefinition <em>Title Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.TitleSchemaDefinition
	 * @generated
	 */
	public Adapter createTitleSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ItemsSchemaDefinition <em>Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ItemsSchemaDefinition
	 * @generated
	 */
	public Adapter createItemsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.DefaultSchemaDefinition <em>Default Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.DefaultSchemaDefinition
	 * @generated
	 */
	public Adapter createDefaultSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ThenSchemaDefinition <em>Then Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ThenSchemaDefinition
	 * @generated
	 */
	public Adapter createThenSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MinLengthSchemaDefinition <em>Min Length Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MinLengthSchemaDefinition
	 * @generated
	 */
	public Adapter createMinLengthSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.DefinitionsSchemaDefinition <em>Definitions Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.DefinitionsSchemaDefinition
	 * @generated
	 */
	public Adapter createDefinitionsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MinItemsSchemaDefinition <em>Min Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MinItemsSchemaDefinition
	 * @generated
	 */
	public Adapter createMinItemsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.OneOfSchemaDefinition <em>One Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.OneOfSchemaDefinition
	 * @generated
	 */
	public Adapter createOneOfSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaArray <em>Schema Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaArray
	 * @generated
	 */
	public Adapter createSchemaArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MaxPropertiesSchemaDefinition <em>Max Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MaxPropertiesSchemaDefinition
	 * @generated
	 */
	public Adapter createMaxPropertiesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.NullValue
	 * @generated
	 */
	public Adapter createNullValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MinimumSchemaDefinition <em>Minimum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MinimumSchemaDefinition
	 * @generated
	 */
	public Adapter createMinimumSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.JsonDocument <em>Json Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.JsonDocument
	 * @generated
	 */
	public Adapter createJsonDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MaxItemsSchemaDefinition <em>Max Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MaxItemsSchemaDefinition
	 * @generated
	 */
	public Adapter createMaxItemsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.FormatSchemaDefinition <em>Format Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.FormatSchemaDefinition
	 * @generated
	 */
	public Adapter createFormatSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ReadOnlySchemaDefinition <em>Read Only Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ReadOnlySchemaDefinition
	 * @generated
	 */
	public Adapter createReadOnlySchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ObjectValue
	 * @generated
	 */
	public Adapter createObjectValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.TypeSchemaDefinition <em>Type Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.TypeSchemaDefinition
	 * @generated
	 */
	public Adapter createTypeSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition <em>Additional Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition
	 * @generated
	 */
	public Adapter createAdditionalPropertiesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ElseSchemaDefinition <em>Else Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ElseSchemaDefinition
	 * @generated
	 */
	public Adapter createElseSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.IdSchemaDefinition <em>Id Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.IdSchemaDefinition
	 * @generated
	 */
	public Adapter createIdSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ConstSchemaDefinition <em>Const Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ConstSchemaDefinition
	 * @generated
	 */
	public Adapter createConstSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.DependenciesSchemaDefinition <em>Dependencies Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.DependenciesSchemaDefinition
	 * @generated
	 */
	public Adapter createDependenciesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.NumberValue
	 * @generated
	 */
	public Adapter createNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.RequiredSchemaDefinition <em>Required Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.RequiredSchemaDefinition
	 * @generated
	 */
	public Adapter createRequiredSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.DescriptionSchemaDefinition <em>Description Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.DescriptionSchemaDefinition
	 * @generated
	 */
	public Adapter createDescriptionSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MinPropertiesSchemaDefinition <em>Min Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MinPropertiesSchemaDefinition
	 * @generated
	 */
	public Adapter createMinPropertiesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.PatternPropertiesSchemaDefinition <em>Pattern Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.PatternPropertiesSchemaDefinition
	 * @generated
	 */
	public Adapter createPatternPropertiesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.AdditionalItemsSchemaDefinition <em>Additional Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.AdditionalItemsSchemaDefinition
	 * @generated
	 */
	public Adapter createAdditionalItemsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.KeyValuePair
	 * @generated
	 */
	public Adapter createKeyValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ExamplesSchemaDefinition <em>Examples Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ExamplesSchemaDefinition
	 * @generated
	 */
	public Adapter createExamplesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.IfSchemaDefinition <em>If Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.IfSchemaDefinition
	 * @generated
	 */
	public Adapter createIfSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.AllOfSchemaDefinition <em>All Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.AllOfSchemaDefinition
	 * @generated
	 */
	public Adapter createAllOfSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ContentEncodingSchemaDefinition <em>Content Encoding Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ContentEncodingSchemaDefinition
	 * @generated
	 */
	public Adapter createContentEncodingSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MultipleOfSchemaDefinition <em>Multiple Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MultipleOfSchemaDefinition
	 * @generated
	 */
	public Adapter createMultipleOfSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.PatternSchemaDefinition <em>Pattern Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.PatternSchemaDefinition
	 * @generated
	 */
	public Adapter createPatternSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.KeywordDefinition <em>Keyword Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.KeywordDefinition
	 * @generated
	 */
	public Adapter createKeywordDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ContainsSchemaDefinition <em>Contains Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ContainsSchemaDefinition
	 * @generated
	 */
	public Adapter createContainsSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.NotSchemaDefinition <em>Not Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.NotSchemaDefinition
	 * @generated
	 */
	public Adapter createNotSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition <em>Exclusive Maximum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition
	 * @generated
	 */
	public Adapter createExclusiveMaximumSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.MaxLengthSchemaDefinition <em>Max Length Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.MaxLengthSchemaDefinition
	 * @generated
	 */
	public Adapter createMaxLengthSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.RefSchemaDefinition <em>Ref Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.RefSchemaDefinition
	 * @generated
	 */
	public Adapter createRefSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.JsonSchema <em>Json Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.JsonSchema
	 * @generated
	 */
	public Adapter createJsonSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.KeySchemaPair <em>Key Schema Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.KeySchemaPair
	 * @generated
	 */
	public Adapter createKeySchemaPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ContentMediaTypeSchemaDefinition <em>Content Media Type Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ContentMediaTypeSchemaDefinition
	 * @generated
	 */
	public Adapter createContentMediaTypeSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition <em>Exclusive Minimum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition
	 * @generated
	 */
	public Adapter createExclusiveMinimumSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaSchemaDefinition <em>Schema Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaSchemaDefinition
	 * @generated
	 */
	public Adapter createSchemaSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.PropertiesSchemaDefinition <em>Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.PropertiesSchemaDefinition
	 * @generated
	 */
	public Adapter createPropertiesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.PropertyNamesSchemaDefinition <em>Property Names Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.PropertyNamesSchemaDefinition
	 * @generated
	 */
	public Adapter createPropertyNamesSchemaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.TypesAnyOf2 <em>Types Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.TypesAnyOf2
	 * @generated
	 */
	public Adapter createTypesAnyOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.BooleanSchema
	 * @generated
	 */
	public Adapter createBooleanSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.NonNegativeInteger <em>Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.NonNegativeInteger
	 * @generated
	 */
	public Adapter createNonNegativeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.NonNegativeIntegerDefault0 <em>Non Negative Integer Default0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.NonNegativeIntegerDefault0
	 * @generated
	 */
	public Adapter createNonNegativeIntegerDefault0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaObjectAdditionalProperties <em>Schema Object Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaObjectAdditionalProperties
	 * @generated
	 */
	public Adapter createSchemaObjectAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaObjectDependenciesProperties <em>Schema Object Dependencies Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaObjectDependenciesProperties
	 * @generated
	 */
	public Adapter createSchemaObjectDependenciesPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties <em>Schema Object Dependencies Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties
	 * @generated
	 */
	public Adapter createSchemaObjectDependenciesAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1 <em>Schema Object Dependencies Additional Properties Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1
	 * @generated
	 */
	public Adapter createSchemaObjectDependenciesAdditionalPropertiesAnyOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2 <em>Schema Object Dependencies Additional Properties Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2
	 * @generated
	 */
	public Adapter createSchemaObjectDependenciesAdditionalPropertiesAnyOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf <em>Schema Object Dependencies Additional Properties Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf
	 * @generated
	 */
	public Adapter createSchemaObjectDependenciesAdditionalPropertiesAnyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JsonMetaschemaMMAdapterFactory
