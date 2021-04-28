/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.AdditionalItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.AnyOfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ArrayValue;
import jsonMetaschemaMM.jsonMetaschemaMM.BooleanSchema;
import jsonMetaschemaMM.jsonMetaschemaMM.BooleanValue;
import jsonMetaschemaMM.jsonMetaschemaMM.CommentSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ContainsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ContentEncodingSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ContentMediaTypeSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.DefaultSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.DefinitionsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.DependenciesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.DescriptionSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ElseSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.EnumSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ExamplesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.FormatSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.IdSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.IfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.IntegerValue;
import jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonDocument;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMFactory;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonSchema;
import jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair;
import jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair;
import jsonMetaschemaMM.jsonMetaschemaMM.KeywordDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MaxLengthSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MaximumSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MinLengthSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MinPropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MinimumSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.MultipleOfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger;
import jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0;
import jsonMetaschemaMM.jsonMetaschemaMM.NotSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.NullEnum;
import jsonMetaschemaMM.jsonMetaschemaMM.NullValue;
import jsonMetaschemaMM.jsonMetaschemaMM.NumberValue;
import jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema;
import jsonMetaschemaMM.jsonMetaschemaMM.ObjectValue;
import jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.PatternPropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.PatternSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.PropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.ReadOnlySchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.RefSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.RequiredSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.Schema;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesProperties;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes;
import jsonMetaschemaMM.jsonMetaschemaMM.StringArray;
import jsonMetaschemaMM.jsonMetaschemaMM.StringValue;
import jsonMetaschemaMM.jsonMetaschemaMM.ThenSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.TitleSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.TypesAnyOf2;
import jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.Value;
import jsonMetaschemaMM.jsonMetaschemaMM.WriteOnlySchemaDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonMetaschemaMMPackageImpl extends EPackageImpl implements JsonMetaschemaMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeOnlySchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueItemsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyOfSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minLengthSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minItemsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneOfSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxPropertiesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxItemsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readOnlySchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalPropertiesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minPropertiesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternPropertiesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalItemsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examplesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allOfSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEncodingSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleOfSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveMaximumSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxLengthSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keySchemaPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentMediaTypeSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveMinimumSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyNamesSchemaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesAnyOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeIntegerDefault0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaObjectAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaObjectDependenciesPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaObjectDependenciesAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaObjectDependenciesAdditionalPropertiesAnyOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nullEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JsonMetaschemaMMPackageImpl() {
		super(eNS_URI, JsonMetaschemaMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JsonMetaschemaMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JsonMetaschemaMMPackage init() {
		if (isInited)
			return (JsonMetaschemaMMPackage) EPackage.Registry.INSTANCE.getEPackage(JsonMetaschemaMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJsonMetaschemaMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JsonMetaschemaMMPackageImpl theJsonMetaschemaMMPackage = registeredJsonMetaschemaMMPackage instanceof JsonMetaschemaMMPackageImpl
				? (JsonMetaschemaMMPackageImpl) registeredJsonMetaschemaMMPackage
				: new JsonMetaschemaMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJsonMetaschemaMMPackage.createPackageContents();

		// Initialize created meta-data
		theJsonMetaschemaMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJsonMetaschemaMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JsonMetaschemaMMPackage.eNS_URI, theJsonMetaschemaMMPackage);
		return theJsonMetaschemaMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSchema() {
		return objectSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSchema_KeywordDefinition() {
		return (EReference) objectSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximumSchemaDefinition() {
		return maximumSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaximumSchemaDefinition_Maximum() {
		return (EAttribute) maximumSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute) integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteOnlySchemaDefinition() {
		return writeOnlySchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteOnlySchemaDefinition_WriteOnly() {
		return (EAttribute) writeOnlySchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentSchemaDefinition() {
		return commentSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentSchemaDefinition_Comment() {
		return (EAttribute) commentSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumSchemaDefinition() {
		return enumSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumSchemaDefinition_Items() {
		return (EReference) enumSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueItemsSchemaDefinition() {
		return uniqueItemsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniqueItemsSchemaDefinition_UniqueItems() {
		return (EAttribute) uniqueItemsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyOfSchemaDefinition() {
		return anyOfSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyOfSchemaDefinition_AnyOf() {
		return (EReference) anyOfSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringArray() {
		return stringArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringArray_Values() {
		return (EAttribute) stringArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleSchemaDefinition() {
		return titleSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleSchemaDefinition_Title() {
		return (EAttribute) titleSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemsSchemaDefinition() {
		return itemsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemsSchemaDefinition_ItemsAnyOf1() {
		return (EReference) itemsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemsSchemaDefinition_ItemsAnyOf2() {
		return (EReference) itemsSchemaDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultSchemaDefinition() {
		return defaultSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultSchemaDefinition_Default() {
		return (EReference) defaultSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThenSchemaDefinition() {
		return thenSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThenSchemaDefinition_Then() {
		return (EReference) thenSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinLengthSchemaDefinition() {
		return minLengthSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinLengthSchemaDefinition_MinLength() {
		return (EReference) minLengthSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsSchemaDefinition() {
		return definitionsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsSchemaDefinition_KeySchemaPairs() {
		return (EReference) definitionsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute) booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinItemsSchemaDefinition() {
		return minItemsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinItemsSchemaDefinition_MinItems() {
		return (EReference) minItemsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneOfSchemaDefinition() {
		return oneOfSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOfSchemaDefinition_OneOf() {
		return (EReference) oneOfSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaArray() {
		return schemaArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaArray_Items() {
		return (EReference) schemaArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxPropertiesSchemaDefinition() {
		return maxPropertiesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaxPropertiesSchemaDefinition_MaxProperties() {
		return (EReference) maxPropertiesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValue() {
		return nullValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullValue_Value() {
		return (EAttribute) nullValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimumSchemaDefinition() {
		return minimumSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinimumSchemaDefinition_Minimum() {
		return (EAttribute) minimumSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonDocument() {
		return jsonDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonDocument_Value() {
		return (EReference) jsonDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxItemsSchemaDefinition() {
		return maxItemsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaxItemsSchemaDefinition_MaxItems() {
		return (EReference) maxItemsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormatSchemaDefinition() {
		return formatSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormatSchemaDefinition_Format() {
		return (EAttribute) formatSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadOnlySchemaDefinition() {
		return readOnlySchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadOnlySchemaDefinition_ReadOnly() {
		return (EAttribute) readOnlySchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectValue() {
		return objectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectValue_Keyvaluepair() {
		return (EReference) objectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSchemaDefinition() {
		return typeSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSchemaDefinition_TypeAnyOf1() {
		return (EAttribute) typeSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSchemaDefinition_TypesAnyOf2() {
		return (EReference) typeSchemaDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalPropertiesSchemaDefinition() {
		return additionalPropertiesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalPropertiesSchemaDefinition_AdditionalProperties() {
		return (EReference) additionalPropertiesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseSchemaDefinition() {
		return elseSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseSchemaDefinition_Else() {
		return (EReference) elseSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdSchemaDefinition() {
		return idSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdSchemaDefinition_Id() {
		return (EAttribute) idSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstSchemaDefinition() {
		return constSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstSchemaDefinition_Const() {
		return (EReference) constSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependenciesSchemaDefinition() {
		return dependenciesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependenciesSchemaDefinition_Properties() {
		return (EReference) dependenciesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberValue_Value() {
		return (EAttribute) numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredSchemaDefinition() {
		return requiredSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredSchemaDefinition_Required() {
		return (EReference) requiredSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionSchemaDefinition() {
		return descriptionSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionSchemaDefinition_Description() {
		return (EAttribute) descriptionSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinPropertiesSchemaDefinition() {
		return minPropertiesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinPropertiesSchemaDefinition_MinProperties() {
		return (EReference) minPropertiesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternPropertiesSchemaDefinition() {
		return patternPropertiesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternPropertiesSchemaDefinition_KeySchemaPairs() {
		return (EReference) patternPropertiesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalItemsSchemaDefinition() {
		return additionalItemsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalItemsSchemaDefinition_AdditionalItems() {
		return (EReference) additionalItemsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Key() {
		return (EAttribute) keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValuePair_Value() {
		return (EReference) keyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExamplesSchemaDefinition() {
		return examplesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExamplesSchemaDefinition_Examples() {
		return (EReference) examplesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfSchemaDefinition() {
		return ifSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfSchemaDefinition_If() {
		return (EReference) ifSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllOfSchemaDefinition() {
		return allOfSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllOfSchemaDefinition_AllOf() {
		return (EReference) allOfSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentEncodingSchemaDefinition() {
		return contentEncodingSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentEncodingSchemaDefinition_ContentEncoding() {
		return (EAttribute) contentEncodingSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleOfSchemaDefinition() {
		return multipleOfSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleOfSchemaDefinition_MultipleOf() {
		return (EAttribute) multipleOfSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternSchemaDefinition() {
		return patternSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternSchemaDefinition_Pattern() {
		return (EAttribute) patternSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordDefinition() {
		return keywordDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsSchemaDefinition() {
		return containsSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainsSchemaDefinition_Contains() {
		return (EReference) containsSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotSchemaDefinition() {
		return notSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotSchemaDefinition_Not() {
		return (EReference) notSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveMaximumSchemaDefinition() {
		return exclusiveMaximumSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExclusiveMaximumSchemaDefinition_ExclusiveMaximum() {
		return (EAttribute) exclusiveMaximumSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxLengthSchemaDefinition() {
		return maxLengthSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaxLengthSchemaDefinition_MaxLength() {
		return (EReference) maxLengthSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSchemaDefinition() {
		return refSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefSchemaDefinition_Ref() {
		return (EAttribute) refSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonSchema() {
		return jsonSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonSchema_Schema() {
		return (EReference) jsonSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeySchemaPair() {
		return keySchemaPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeySchemaPair_Key() {
		return (EAttribute) keySchemaPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeySchemaPair_Value() {
		return (EReference) keySchemaPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentMediaTypeSchemaDefinition() {
		return contentMediaTypeSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentMediaTypeSchemaDefinition_ContentMediaType() {
		return (EAttribute) contentMediaTypeSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveMinimumSchemaDefinition() {
		return exclusiveMinimumSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExclusiveMinimumSchemaDefinition_ExclusiveMinimum() {
		return (EAttribute) exclusiveMinimumSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaSchemaDefinition() {
		return schemaSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaSchemaDefinition_Schema() {
		return (EAttribute) schemaSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesSchemaDefinition() {
		return propertiesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesSchemaDefinition_KeySchemaPairs() {
		return (EReference) propertiesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyNamesSchemaDefinition() {
		return propertyNamesSchemaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyNamesSchemaDefinition_PropertyNames() {
		return (EReference) propertyNamesSchemaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Value() {
		return (EReference) arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesAnyOf2() {
		return typesAnyOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypesAnyOf2_Items() {
		return (EAttribute) typesAnyOf2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanSchema() {
		return booleanSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanSchema_Value() {
		return (EAttribute) booleanSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeInteger() {
		return nonNegativeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_Value() {
		return (EAttribute) nonNegativeIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeIntegerDefault0() {
		return nonNegativeIntegerDefault0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerDefault0_Value() {
		return (EAttribute) nonNegativeIntegerDefault0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaObjectAdditionalProperties() {
		return schemaObjectAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaObjectAdditionalProperties_Key() {
		return (EAttribute) schemaObjectAdditionalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaObjectAdditionalProperties_AdditionalProperties() {
		return (EReference) schemaObjectAdditionalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaObjectDependenciesProperties() {
		return schemaObjectDependenciesPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaObjectDependenciesAdditionalProperties() {
		return schemaObjectDependenciesAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaObjectDependenciesAdditionalProperties_Key() {
		return (EAttribute) schemaObjectDependenciesAdditionalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaObjectDependenciesAdditionalProperties_AdditionalProperties() {
		return (EReference) schemaObjectDependenciesAdditionalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaObjectDependenciesAdditionalPropertiesAnyOf1() {
		return schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaObjectDependenciesAdditionalPropertiesAnyOf1_AnyOf1() {
		return (EReference) schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaObjectDependenciesAdditionalPropertiesAnyOf2() {
		return schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaObjectDependenciesAdditionalPropertiesAnyOf2_AnyOf2() {
		return (EReference) schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaObjectDependenciesAdditionalPropertiesAnyOf() {
		return schemaObjectDependenciesAdditionalPropertiesAnyOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleTypes() {
		return simpleTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNullEnum() {
		return nullEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonMetaschemaMMFactory getJsonMetaschemaMMFactory() {
		return (JsonMetaschemaMMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		objectSchemaEClass = createEClass(OBJECT_SCHEMA);
		createEReference(objectSchemaEClass, OBJECT_SCHEMA__KEYWORD_DEFINITION);

		maximumSchemaDefinitionEClass = createEClass(MAXIMUM_SCHEMA_DEFINITION);
		createEAttribute(maximumSchemaDefinitionEClass, MAXIMUM_SCHEMA_DEFINITION__MAXIMUM);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		writeOnlySchemaDefinitionEClass = createEClass(WRITE_ONLY_SCHEMA_DEFINITION);
		createEAttribute(writeOnlySchemaDefinitionEClass, WRITE_ONLY_SCHEMA_DEFINITION__WRITE_ONLY);

		commentSchemaDefinitionEClass = createEClass(COMMENT_SCHEMA_DEFINITION);
		createEAttribute(commentSchemaDefinitionEClass, COMMENT_SCHEMA_DEFINITION__COMMENT);

		enumSchemaDefinitionEClass = createEClass(ENUM_SCHEMA_DEFINITION);
		createEReference(enumSchemaDefinitionEClass, ENUM_SCHEMA_DEFINITION__ITEMS);

		uniqueItemsSchemaDefinitionEClass = createEClass(UNIQUE_ITEMS_SCHEMA_DEFINITION);
		createEAttribute(uniqueItemsSchemaDefinitionEClass, UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS);

		anyOfSchemaDefinitionEClass = createEClass(ANY_OF_SCHEMA_DEFINITION);
		createEReference(anyOfSchemaDefinitionEClass, ANY_OF_SCHEMA_DEFINITION__ANY_OF);

		stringArrayEClass = createEClass(STRING_ARRAY);
		createEAttribute(stringArrayEClass, STRING_ARRAY__VALUES);

		titleSchemaDefinitionEClass = createEClass(TITLE_SCHEMA_DEFINITION);
		createEAttribute(titleSchemaDefinitionEClass, TITLE_SCHEMA_DEFINITION__TITLE);

		itemsSchemaDefinitionEClass = createEClass(ITEMS_SCHEMA_DEFINITION);
		createEReference(itemsSchemaDefinitionEClass, ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1);
		createEReference(itemsSchemaDefinitionEClass, ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2);

		defaultSchemaDefinitionEClass = createEClass(DEFAULT_SCHEMA_DEFINITION);
		createEReference(defaultSchemaDefinitionEClass, DEFAULT_SCHEMA_DEFINITION__DEFAULT);

		thenSchemaDefinitionEClass = createEClass(THEN_SCHEMA_DEFINITION);
		createEReference(thenSchemaDefinitionEClass, THEN_SCHEMA_DEFINITION__THEN);

		minLengthSchemaDefinitionEClass = createEClass(MIN_LENGTH_SCHEMA_DEFINITION);
		createEReference(minLengthSchemaDefinitionEClass, MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH);

		definitionsSchemaDefinitionEClass = createEClass(DEFINITIONS_SCHEMA_DEFINITION);
		createEReference(definitionsSchemaDefinitionEClass, DEFINITIONS_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		minItemsSchemaDefinitionEClass = createEClass(MIN_ITEMS_SCHEMA_DEFINITION);
		createEReference(minItemsSchemaDefinitionEClass, MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS);

		oneOfSchemaDefinitionEClass = createEClass(ONE_OF_SCHEMA_DEFINITION);
		createEReference(oneOfSchemaDefinitionEClass, ONE_OF_SCHEMA_DEFINITION__ONE_OF);

		schemaArrayEClass = createEClass(SCHEMA_ARRAY);
		createEReference(schemaArrayEClass, SCHEMA_ARRAY__ITEMS);

		maxPropertiesSchemaDefinitionEClass = createEClass(MAX_PROPERTIES_SCHEMA_DEFINITION);
		createEReference(maxPropertiesSchemaDefinitionEClass, MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES);

		nullValueEClass = createEClass(NULL_VALUE);
		createEAttribute(nullValueEClass, NULL_VALUE__VALUE);

		minimumSchemaDefinitionEClass = createEClass(MINIMUM_SCHEMA_DEFINITION);
		createEAttribute(minimumSchemaDefinitionEClass, MINIMUM_SCHEMA_DEFINITION__MINIMUM);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		jsonDocumentEClass = createEClass(JSON_DOCUMENT);
		createEReference(jsonDocumentEClass, JSON_DOCUMENT__VALUE);

		maxItemsSchemaDefinitionEClass = createEClass(MAX_ITEMS_SCHEMA_DEFINITION);
		createEReference(maxItemsSchemaDefinitionEClass, MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS);

		formatSchemaDefinitionEClass = createEClass(FORMAT_SCHEMA_DEFINITION);
		createEAttribute(formatSchemaDefinitionEClass, FORMAT_SCHEMA_DEFINITION__FORMAT);

		readOnlySchemaDefinitionEClass = createEClass(READ_ONLY_SCHEMA_DEFINITION);
		createEAttribute(readOnlySchemaDefinitionEClass, READ_ONLY_SCHEMA_DEFINITION__READ_ONLY);

		schemaEClass = createEClass(SCHEMA);

		objectValueEClass = createEClass(OBJECT_VALUE);
		createEReference(objectValueEClass, OBJECT_VALUE__KEYVALUEPAIR);

		typeSchemaDefinitionEClass = createEClass(TYPE_SCHEMA_DEFINITION);
		createEAttribute(typeSchemaDefinitionEClass, TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1);
		createEReference(typeSchemaDefinitionEClass, TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2);

		additionalPropertiesSchemaDefinitionEClass = createEClass(ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION);
		createEReference(additionalPropertiesSchemaDefinitionEClass,
				ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES);

		elseSchemaDefinitionEClass = createEClass(ELSE_SCHEMA_DEFINITION);
		createEReference(elseSchemaDefinitionEClass, ELSE_SCHEMA_DEFINITION__ELSE);

		idSchemaDefinitionEClass = createEClass(ID_SCHEMA_DEFINITION);
		createEAttribute(idSchemaDefinitionEClass, ID_SCHEMA_DEFINITION__ID);

		constSchemaDefinitionEClass = createEClass(CONST_SCHEMA_DEFINITION);
		createEReference(constSchemaDefinitionEClass, CONST_SCHEMA_DEFINITION__CONST);

		dependenciesSchemaDefinitionEClass = createEClass(DEPENDENCIES_SCHEMA_DEFINITION);
		createEReference(dependenciesSchemaDefinitionEClass, DEPENDENCIES_SCHEMA_DEFINITION__PROPERTIES);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__VALUE);

		requiredSchemaDefinitionEClass = createEClass(REQUIRED_SCHEMA_DEFINITION);
		createEReference(requiredSchemaDefinitionEClass, REQUIRED_SCHEMA_DEFINITION__REQUIRED);

		descriptionSchemaDefinitionEClass = createEClass(DESCRIPTION_SCHEMA_DEFINITION);
		createEAttribute(descriptionSchemaDefinitionEClass, DESCRIPTION_SCHEMA_DEFINITION__DESCRIPTION);

		minPropertiesSchemaDefinitionEClass = createEClass(MIN_PROPERTIES_SCHEMA_DEFINITION);
		createEReference(minPropertiesSchemaDefinitionEClass, MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES);

		patternPropertiesSchemaDefinitionEClass = createEClass(PATTERN_PROPERTIES_SCHEMA_DEFINITION);
		createEReference(patternPropertiesSchemaDefinitionEClass,
				PATTERN_PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS);

		additionalItemsSchemaDefinitionEClass = createEClass(ADDITIONAL_ITEMS_SCHEMA_DEFINITION);
		createEReference(additionalItemsSchemaDefinitionEClass, ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS);

		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEReference(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

		examplesSchemaDefinitionEClass = createEClass(EXAMPLES_SCHEMA_DEFINITION);
		createEReference(examplesSchemaDefinitionEClass, EXAMPLES_SCHEMA_DEFINITION__EXAMPLES);

		ifSchemaDefinitionEClass = createEClass(IF_SCHEMA_DEFINITION);
		createEReference(ifSchemaDefinitionEClass, IF_SCHEMA_DEFINITION__IF);

		allOfSchemaDefinitionEClass = createEClass(ALL_OF_SCHEMA_DEFINITION);
		createEReference(allOfSchemaDefinitionEClass, ALL_OF_SCHEMA_DEFINITION__ALL_OF);

		contentEncodingSchemaDefinitionEClass = createEClass(CONTENT_ENCODING_SCHEMA_DEFINITION);
		createEAttribute(contentEncodingSchemaDefinitionEClass, CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING);

		multipleOfSchemaDefinitionEClass = createEClass(MULTIPLE_OF_SCHEMA_DEFINITION);
		createEAttribute(multipleOfSchemaDefinitionEClass, MULTIPLE_OF_SCHEMA_DEFINITION__MULTIPLE_OF);

		patternSchemaDefinitionEClass = createEClass(PATTERN_SCHEMA_DEFINITION);
		createEAttribute(patternSchemaDefinitionEClass, PATTERN_SCHEMA_DEFINITION__PATTERN);

		keywordDefinitionEClass = createEClass(KEYWORD_DEFINITION);

		containsSchemaDefinitionEClass = createEClass(CONTAINS_SCHEMA_DEFINITION);
		createEReference(containsSchemaDefinitionEClass, CONTAINS_SCHEMA_DEFINITION__CONTAINS);

		notSchemaDefinitionEClass = createEClass(NOT_SCHEMA_DEFINITION);
		createEReference(notSchemaDefinitionEClass, NOT_SCHEMA_DEFINITION__NOT);

		exclusiveMaximumSchemaDefinitionEClass = createEClass(EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION);
		createEAttribute(exclusiveMaximumSchemaDefinitionEClass,
				EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MAXIMUM);

		maxLengthSchemaDefinitionEClass = createEClass(MAX_LENGTH_SCHEMA_DEFINITION);
		createEReference(maxLengthSchemaDefinitionEClass, MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH);

		refSchemaDefinitionEClass = createEClass(REF_SCHEMA_DEFINITION);
		createEAttribute(refSchemaDefinitionEClass, REF_SCHEMA_DEFINITION__REF);

		jsonSchemaEClass = createEClass(JSON_SCHEMA);
		createEReference(jsonSchemaEClass, JSON_SCHEMA__SCHEMA);

		keySchemaPairEClass = createEClass(KEY_SCHEMA_PAIR);
		createEAttribute(keySchemaPairEClass, KEY_SCHEMA_PAIR__KEY);
		createEReference(keySchemaPairEClass, KEY_SCHEMA_PAIR__VALUE);

		contentMediaTypeSchemaDefinitionEClass = createEClass(CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION);
		createEAttribute(contentMediaTypeSchemaDefinitionEClass,
				CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE);

		exclusiveMinimumSchemaDefinitionEClass = createEClass(EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION);
		createEAttribute(exclusiveMinimumSchemaDefinitionEClass,
				EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM);

		schemaSchemaDefinitionEClass = createEClass(SCHEMA_SCHEMA_DEFINITION);
		createEAttribute(schemaSchemaDefinitionEClass, SCHEMA_SCHEMA_DEFINITION__SCHEMA);

		propertiesSchemaDefinitionEClass = createEClass(PROPERTIES_SCHEMA_DEFINITION);
		createEReference(propertiesSchemaDefinitionEClass, PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS);

		propertyNamesSchemaDefinitionEClass = createEClass(PROPERTY_NAMES_SCHEMA_DEFINITION);
		createEReference(propertyNamesSchemaDefinitionEClass, PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__VALUE);

		valueEClass = createEClass(VALUE);

		typesAnyOf2EClass = createEClass(TYPES_ANY_OF2);
		createEAttribute(typesAnyOf2EClass, TYPES_ANY_OF2__ITEMS);

		booleanSchemaEClass = createEClass(BOOLEAN_SCHEMA);
		createEAttribute(booleanSchemaEClass, BOOLEAN_SCHEMA__VALUE);

		nonNegativeIntegerEClass = createEClass(NON_NEGATIVE_INTEGER);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__VALUE);

		nonNegativeIntegerDefault0EClass = createEClass(NON_NEGATIVE_INTEGER_DEFAULT0);
		createEAttribute(nonNegativeIntegerDefault0EClass, NON_NEGATIVE_INTEGER_DEFAULT0__VALUE);

		schemaObjectAdditionalPropertiesEClass = createEClass(SCHEMA_OBJECT_ADDITIONAL_PROPERTIES);
		createEAttribute(schemaObjectAdditionalPropertiesEClass, SCHEMA_OBJECT_ADDITIONAL_PROPERTIES__KEY);
		createEReference(schemaObjectAdditionalPropertiesEClass,
				SCHEMA_OBJECT_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES);

		schemaObjectDependenciesPropertiesEClass = createEClass(SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES);

		schemaObjectDependenciesAdditionalPropertiesEClass = createEClass(
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES);
		createEAttribute(schemaObjectDependenciesAdditionalPropertiesEClass,
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__KEY);
		createEReference(schemaObjectDependenciesAdditionalPropertiesEClass,
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES);

		schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass = createEClass(
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1);
		createEReference(schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass,
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1);

		schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass = createEClass(
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2);
		createEReference(schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass,
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2);

		schemaObjectDependenciesAdditionalPropertiesAnyOfEClass = createEClass(
				SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF);

		// Create enums
		simpleTypesEEnum = createEEnum(SIMPLE_TYPES);
		nullEnumEEnum = createEEnum(NULL_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objectSchemaEClass.getESuperTypes().add(this.getSchema());
		maximumSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		integerValueEClass.getESuperTypes().add(this.getValue());
		writeOnlySchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		commentSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		enumSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		uniqueItemsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		anyOfSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		titleSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		itemsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		defaultSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		thenSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		minLengthSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		definitionsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		minItemsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		oneOfSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		maxPropertiesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		nullValueEClass.getESuperTypes().add(this.getValue());
		minimumSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		stringValueEClass.getESuperTypes().add(this.getValue());
		maxItemsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		formatSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		readOnlySchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		objectValueEClass.getESuperTypes().add(this.getValue());
		typeSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		additionalPropertiesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		elseSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		idSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		constSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		dependenciesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		numberValueEClass.getESuperTypes().add(this.getValue());
		requiredSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		descriptionSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		minPropertiesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		patternPropertiesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		additionalItemsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		examplesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		ifSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		allOfSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		contentEncodingSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		multipleOfSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		patternSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		containsSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		notSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		exclusiveMaximumSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		maxLengthSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		refSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		contentMediaTypeSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		exclusiveMinimumSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		schemaSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		propertiesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		propertyNamesSchemaDefinitionEClass.getESuperTypes().add(this.getKeywordDefinition());
		arrayValueEClass.getESuperTypes().add(this.getValue());
		booleanSchemaEClass.getESuperTypes().add(this.getSchema());
		schemaObjectAdditionalPropertiesEClass.getESuperTypes().add(this.getKeywordDefinition());
		schemaObjectDependenciesAdditionalPropertiesEClass.getESuperTypes()
				.add(this.getSchemaObjectDependenciesProperties());
		schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass.getESuperTypes()
				.add(this.getSchemaObjectDependenciesAdditionalPropertiesAnyOf());
		schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass.getESuperTypes()
				.add(this.getSchemaObjectDependenciesAdditionalPropertiesAnyOf());

		// Initialize classes, features, and operations; add parameters
		initEClass(objectSchemaEClass, ObjectSchema.class, "ObjectSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSchema_KeywordDefinition(), this.getKeywordDefinition(), null, "keywordDefinition",
				null, 0, -1, ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximumSchemaDefinitionEClass, MaximumSchemaDefinition.class, "MaximumSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaximumSchemaDefinition_Maximum(), ecorePackage.getEDouble(), "maximum", null, 1, 1,
				MaximumSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeOnlySchemaDefinitionEClass, WriteOnlySchemaDefinition.class, "WriteOnlySchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWriteOnlySchemaDefinition_WriteOnly(), ecorePackage.getEBoolean(), "writeOnly", null, 1, 1,
				WriteOnlySchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentSchemaDefinitionEClass, CommentSchemaDefinition.class, "CommentSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentSchemaDefinition_Comment(), ecorePackage.getEString(), "comment", null, 1, 1,
				CommentSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumSchemaDefinitionEClass, EnumSchemaDefinition.class, "EnumSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumSchemaDefinition_Items(), this.getJsonDocument(), null, "items", null, 1, -1,
				EnumSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueItemsSchemaDefinitionEClass, UniqueItemsSchemaDefinition.class, "UniqueItemsSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueItemsSchemaDefinition_UniqueItems(), ecorePackage.getEBoolean(), "uniqueItems", null, 1,
				1, UniqueItemsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyOfSchemaDefinitionEClass, AnyOfSchemaDefinition.class, "AnyOfSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnyOfSchemaDefinition_AnyOf(), this.getSchemaArray(), null, "anyOf", null, 1, 1,
				AnyOfSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringArrayEClass, StringArray.class, "StringArray", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringArray_Values(), ecorePackage.getEString(), "values", null, 0, -1, StringArray.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleSchemaDefinitionEClass, TitleSchemaDefinition.class, "TitleSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleSchemaDefinition_Title(), ecorePackage.getEString(), "title", null, 1, 1,
				TitleSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemsSchemaDefinitionEClass, ItemsSchemaDefinition.class, "ItemsSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemsSchemaDefinition_ItemsAnyOf1(), this.getSchema(), null, "itemsAnyOf1", null, 0, 1,
				ItemsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemsSchemaDefinition_ItemsAnyOf2(), this.getSchemaArray(), null, "itemsAnyOf2", null, 0, 1,
				ItemsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultSchemaDefinitionEClass, DefaultSchemaDefinition.class, "DefaultSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultSchemaDefinition_Default(), this.getJsonDocument(), null, "default", null, 1, 1,
				DefaultSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thenSchemaDefinitionEClass, ThenSchemaDefinition.class, "ThenSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThenSchemaDefinition_Then(), this.getSchema(), null, "then", null, 1, 1,
				ThenSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minLengthSchemaDefinitionEClass, MinLengthSchemaDefinition.class, "MinLengthSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinLengthSchemaDefinition_MinLength(), this.getNonNegativeIntegerDefault0(), null,
				"minLength", null, 1, 1, MinLengthSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionsSchemaDefinitionEClass, DefinitionsSchemaDefinition.class, "DefinitionsSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionsSchemaDefinition_KeySchemaPairs(), this.getKeySchemaPair(), null, "keySchemaPairs",
				null, 0, -1, DefinitionsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minItemsSchemaDefinitionEClass, MinItemsSchemaDefinition.class, "MinItemsSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinItemsSchemaDefinition_MinItems(), this.getNonNegativeIntegerDefault0(), null, "minItems",
				null, 1, 1, MinItemsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneOfSchemaDefinitionEClass, OneOfSchemaDefinition.class, "OneOfSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneOfSchemaDefinition_OneOf(), this.getSchemaArray(), null, "oneOf", null, 1, 1,
				OneOfSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaArrayEClass, SchemaArray.class, "SchemaArray", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaArray_Items(), this.getSchema(), null, "items", null, 1, -1, SchemaArray.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxPropertiesSchemaDefinitionEClass, MaxPropertiesSchemaDefinition.class,
				"MaxPropertiesSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaxPropertiesSchemaDefinition_MaxProperties(), this.getNonNegativeInteger(), null,
				"maxProperties", null, 1, 1, MaxPropertiesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullValue_Value(), this.getNullEnum(), "value", null, 1, 1, NullValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimumSchemaDefinitionEClass, MinimumSchemaDefinition.class, "MinimumSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinimumSchemaDefinition_Minimum(), ecorePackage.getEDouble(), "minimum", null, 1, 1,
				MinimumSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonDocumentEClass, JsonDocument.class, "JsonDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonDocument_Value(), this.getValue(), null, "value", null, 1, 1, JsonDocument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxItemsSchemaDefinitionEClass, MaxItemsSchemaDefinition.class, "MaxItemsSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaxItemsSchemaDefinition_MaxItems(), this.getNonNegativeInteger(), null, "maxItems", null, 1,
				1, MaxItemsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatSchemaDefinitionEClass, FormatSchemaDefinition.class, "FormatSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatSchemaDefinition_Format(), ecorePackage.getEString(), "format", null, 1, 1,
				FormatSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readOnlySchemaDefinitionEClass, ReadOnlySchemaDefinition.class, "ReadOnlySchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadOnlySchemaDefinition_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 1, 1,
				ReadOnlySchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectValueEClass, ObjectValue.class, "ObjectValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectValue_Keyvaluepair(), this.getKeyValuePair(), null, "keyvaluepair", null, 0, -1,
				ObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeSchemaDefinitionEClass, TypeSchemaDefinition.class, "TypeSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeSchemaDefinition_TypeAnyOf1(), this.getSimpleTypes(), "typeAnyOf1", "\"array\"", 0, 1,
				TypeSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeSchemaDefinition_TypesAnyOf2(), this.getTypesAnyOf2(), null, "typesAnyOf2", null, 0, 1,
				TypeSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalPropertiesSchemaDefinitionEClass, AdditionalPropertiesSchemaDefinition.class,
				"AdditionalPropertiesSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalPropertiesSchemaDefinition_AdditionalProperties(), this.getSchema(), null,
				"additionalProperties", null, 1, 1, AdditionalPropertiesSchemaDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(elseSchemaDefinitionEClass, ElseSchemaDefinition.class, "ElseSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseSchemaDefinition_Else(), this.getSchema(), null, "else", null, 1, 1,
				ElseSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idSchemaDefinitionEClass, IdSchemaDefinition.class, "IdSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdSchemaDefinition_Id(), ecorePackage.getEString(), "id", null, 1, 1,
				IdSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(constSchemaDefinitionEClass, ConstSchemaDefinition.class, "ConstSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstSchemaDefinition_Const(), this.getJsonDocument(), null, "const", null, 1, 1,
				ConstSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenciesSchemaDefinitionEClass, DependenciesSchemaDefinition.class,
				"DependenciesSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependenciesSchemaDefinition_Properties(), this.getSchemaObjectDependenciesProperties(), null,
				"properties", null, 0, -1, DependenciesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, NumberValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredSchemaDefinitionEClass, RequiredSchemaDefinition.class, "RequiredSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredSchemaDefinition_Required(), this.getStringArray(), null, "required", null, 1, 1,
				RequiredSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionSchemaDefinitionEClass, DescriptionSchemaDefinition.class, "DescriptionSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionSchemaDefinition_Description(), ecorePackage.getEString(), "description", null, 1,
				1, DescriptionSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minPropertiesSchemaDefinitionEClass, MinPropertiesSchemaDefinition.class,
				"MinPropertiesSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinPropertiesSchemaDefinition_MinProperties(), this.getNonNegativeIntegerDefault0(), null,
				"minProperties", null, 1, 1, MinPropertiesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternPropertiesSchemaDefinitionEClass, PatternPropertiesSchemaDefinition.class,
				"PatternPropertiesSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternPropertiesSchemaDefinition_KeySchemaPairs(), this.getKeySchemaPair(), null,
				"keySchemaPairs", null, 0, -1, PatternPropertiesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalItemsSchemaDefinitionEClass, AdditionalItemsSchemaDefinition.class,
				"AdditionalItemsSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalItemsSchemaDefinition_AdditionalItems(), this.getSchema(), null, "additionalItems",
				null, 1, 1, AdditionalItemsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValuePair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValuePair_Value(), this.getValue(), null, "value", null, 1, 1, KeyValuePair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examplesSchemaDefinitionEClass, ExamplesSchemaDefinition.class, "ExamplesSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExamplesSchemaDefinition_Examples(), this.getJsonDocument(), null, "examples", null, 0, -1,
				ExamplesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifSchemaDefinitionEClass, IfSchemaDefinition.class, "IfSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfSchemaDefinition_If(), this.getSchema(), null, "if", null, 1, 1, IfSchemaDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allOfSchemaDefinitionEClass, AllOfSchemaDefinition.class, "AllOfSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllOfSchemaDefinition_AllOf(), this.getSchemaArray(), null, "allOf", null, 1, 1,
				AllOfSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEncodingSchemaDefinitionEClass, ContentEncodingSchemaDefinition.class,
				"ContentEncodingSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentEncodingSchemaDefinition_ContentEncoding(), ecorePackage.getEString(),
				"contentEncoding", null, 1, 1, ContentEncodingSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleOfSchemaDefinitionEClass, MultipleOfSchemaDefinition.class, "MultipleOfSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleOfSchemaDefinition_MultipleOf(), ecorePackage.getEDouble(), "multipleOf", null, 1, 1,
				MultipleOfSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternSchemaDefinitionEClass, PatternSchemaDefinition.class, "PatternSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternSchemaDefinition_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1,
				PatternSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordDefinitionEClass, KeywordDefinition.class, "KeywordDefinition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsSchemaDefinitionEClass, ContainsSchemaDefinition.class, "ContainsSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainsSchemaDefinition_Contains(), this.getSchema(), null, "contains", null, 1, 1,
				ContainsSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notSchemaDefinitionEClass, NotSchemaDefinition.class, "NotSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotSchemaDefinition_Not(), this.getSchema(), null, "not", null, 1, 1,
				NotSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveMaximumSchemaDefinitionEClass, ExclusiveMaximumSchemaDefinition.class,
				"ExclusiveMaximumSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExclusiveMaximumSchemaDefinition_ExclusiveMaximum(), ecorePackage.getEDouble(),
				"exclusiveMaximum", null, 1, 1, ExclusiveMaximumSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxLengthSchemaDefinitionEClass, MaxLengthSchemaDefinition.class, "MaxLengthSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaxLengthSchemaDefinition_MaxLength(), this.getNonNegativeInteger(), null, "maxLength", null,
				1, 1, MaxLengthSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refSchemaDefinitionEClass, RefSchemaDefinition.class, "RefSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefSchemaDefinition_Ref(), ecorePackage.getEString(), "ref", null, 1, 1,
				RefSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonSchemaEClass, JsonSchema.class, "JsonSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonSchema_Schema(), this.getSchema(), null, "schema", null, 0, 1, JsonSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keySchemaPairEClass, KeySchemaPair.class, "KeySchemaPair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeySchemaPair_Key(), ecorePackage.getEString(), "key", null, 1, 1, KeySchemaPair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeySchemaPair_Value(), this.getSchema(), null, "value", null, 1, 1, KeySchemaPair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentMediaTypeSchemaDefinitionEClass, ContentMediaTypeSchemaDefinition.class,
				"ContentMediaTypeSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentMediaTypeSchemaDefinition_ContentMediaType(), ecorePackage.getEString(),
				"contentMediaType", null, 1, 1, ContentMediaTypeSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exclusiveMinimumSchemaDefinitionEClass, ExclusiveMinimumSchemaDefinition.class,
				"ExclusiveMinimumSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExclusiveMinimumSchemaDefinition_ExclusiveMinimum(), ecorePackage.getEDouble(),
				"exclusiveMinimum", null, 1, 1, ExclusiveMinimumSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaSchemaDefinitionEClass, SchemaSchemaDefinition.class, "SchemaSchemaDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaSchemaDefinition_Schema(), ecorePackage.getEString(), "schema", null, 1, 1,
				SchemaSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesSchemaDefinitionEClass, PropertiesSchemaDefinition.class, "PropertiesSchemaDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertiesSchemaDefinition_KeySchemaPairs(), this.getKeySchemaPair(), null, "keySchemaPairs",
				null, 0, -1, PropertiesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyNamesSchemaDefinitionEClass, PropertyNamesSchemaDefinition.class,
				"PropertyNamesSchemaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyNamesSchemaDefinition_PropertyNames(), this.getSchema(), null, "propertyNames", null,
				1, 1, PropertyNamesSchemaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Value(), this.getValue(), null, "value", null, 0, -1, ArrayValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typesAnyOf2EClass, TypesAnyOf2.class, "TypesAnyOf2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypesAnyOf2_Items(), this.getSimpleTypes(), "items", null, 1, -1, TypesAnyOf2.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanSchemaEClass, BooleanSchema.class, "BooleanSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanSchema_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonNegativeIntegerEClass, NonNegativeInteger.class, "NonNegativeInteger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonNegativeInteger_Value(), ecorePackage.getEInt(), "value", null, 1, 1,
				NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nonNegativeIntegerDefault0EClass, NonNegativeIntegerDefault0.class, "NonNegativeIntegerDefault0",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonNegativeIntegerDefault0_Value(), ecorePackage.getEInt(), "value", "0", 1, 1,
				NonNegativeIntegerDefault0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaObjectAdditionalPropertiesEClass, SchemaObjectAdditionalProperties.class,
				"SchemaObjectAdditionalProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaObjectAdditionalProperties_Key(), ecorePackage.getEString(), "key", null, 1, 1,
				SchemaObjectAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaObjectAdditionalProperties_AdditionalProperties(), this.getSchema(), null,
				"additionalProperties", null, 1, 1, SchemaObjectAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaObjectDependenciesPropertiesEClass, SchemaObjectDependenciesProperties.class,
				"SchemaObjectDependenciesProperties", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemaObjectDependenciesAdditionalPropertiesEClass,
				SchemaObjectDependenciesAdditionalProperties.class, "SchemaObjectDependenciesAdditionalProperties",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaObjectDependenciesAdditionalProperties_Key(), ecorePackage.getEString(), "key", null, 1,
				1, SchemaObjectDependenciesAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaObjectDependenciesAdditionalProperties_AdditionalProperties(),
				this.getSchemaObjectDependenciesAdditionalPropertiesAnyOf(), null, "additionalProperties", null, 1, 1,
				SchemaObjectDependenciesAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaObjectDependenciesAdditionalPropertiesAnyOf1EClass,
				SchemaObjectDependenciesAdditionalPropertiesAnyOf1.class,
				"SchemaObjectDependenciesAdditionalPropertiesAnyOf1", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaObjectDependenciesAdditionalPropertiesAnyOf1_AnyOf1(), this.getSchema(), null, "anyOf1",
				null, 1, 1, SchemaObjectDependenciesAdditionalPropertiesAnyOf1.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaObjectDependenciesAdditionalPropertiesAnyOf2EClass,
				SchemaObjectDependenciesAdditionalPropertiesAnyOf2.class,
				"SchemaObjectDependenciesAdditionalPropertiesAnyOf2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaObjectDependenciesAdditionalPropertiesAnyOf2_AnyOf2(), this.getStringArray(), null,
				"anyOf2", null, 1, 1, SchemaObjectDependenciesAdditionalPropertiesAnyOf2.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(schemaObjectDependenciesAdditionalPropertiesAnyOfEClass,
				SchemaObjectDependenciesAdditionalPropertiesAnyOf.class,
				"SchemaObjectDependenciesAdditionalPropertiesAnyOf", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(simpleTypesEEnum, SimpleTypes.class, "SimpleTypes");
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.ARRAY);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.BOOLEAN);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.INTEGER);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.NULL);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.NUMBER);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.OBJECT);
		addEEnumLiteral(simpleTypesEEnum, SimpleTypes.STRING);

		initEEnum(nullEnumEEnum, NullEnum.class, "NullEnum");
		addEEnumLiteral(nullEnumEEnum, NullEnum.NULL);

		// Create resource
		createResource(eNS_URI);
	}

} //JsonMetaschemaMMPackageImpl
