/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMFactory
 * @model kind="package"
 * @generated
 */
public interface JsonMetaschemaMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jsonMetaschemaMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at.jku.bise/jsonMetaschemaMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jsonMetaschemaMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsonMetaschemaMMPackage eINSTANCE = jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 27;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectSchemaImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getObjectSchema()
	 * @generated
	 */
	int OBJECT_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Keyword Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__KEYWORD_DEFINITION = SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_OPERATION_COUNT = SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.KeywordDefinitionImpl <em>Keyword Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.KeywordDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getKeywordDefinition()
	 * @generated
	 */
	int KEYWORD_DEFINITION = 48;

	/**
	 * The number of structural features of the '<em>Keyword Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Keyword Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaximumSchemaDefinitionImpl <em>Maximum Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaximumSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaximumSchemaDefinition()
	 * @generated
	 */
	int MAXIMUM_SCHEMA_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_SCHEMA_DEFINITION__MAXIMUM = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maximum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Maximum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 62;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.IntegerValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.WriteOnlySchemaDefinitionImpl <em>Write Only Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.WriteOnlySchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getWriteOnlySchemaDefinition()
	 * @generated
	 */
	int WRITE_ONLY_SCHEMA_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ONLY_SCHEMA_DEFINITION__WRITE_ONLY = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Write Only Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ONLY_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Write Only Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ONLY_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.CommentSchemaDefinitionImpl <em>Comment Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.CommentSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getCommentSchemaDefinition()
	 * @generated
	 */
	int COMMENT_SCHEMA_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_SCHEMA_DEFINITION__COMMENT = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.EnumSchemaDefinitionImpl <em>Enum Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.EnumSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getEnumSchemaDefinition()
	 * @generated
	 */
	int ENUM_SCHEMA_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_SCHEMA_DEFINITION__ITEMS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.UniqueItemsSchemaDefinitionImpl <em>Unique Items Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.UniqueItemsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getUniqueItemsSchemaDefinition()
	 * @generated
	 */
	int UNIQUE_ITEMS_SCHEMA_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ITEMS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unique Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ITEMS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AnyOfSchemaDefinitionImpl <em>Any Of Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AnyOfSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAnyOfSchemaDefinition()
	 * @generated
	 */
	int ANY_OF_SCHEMA_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Any Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_SCHEMA_DEFINITION__ANY_OF = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Any Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.StringArrayImpl <em>String Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.StringArrayImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 8;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY__VALUES = 0;

	/**
	 * The number of structural features of the '<em>String Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.TitleSchemaDefinitionImpl <em>Title Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.TitleSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getTitleSchemaDefinition()
	 * @generated
	 */
	int TITLE_SCHEMA_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_SCHEMA_DEFINITION__TITLE = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Title Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ItemsSchemaDefinitionImpl <em>Items Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ItemsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getItemsSchemaDefinition()
	 * @generated
	 */
	int ITEMS_SCHEMA_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Items Any Of1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1 = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items Any Of2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2 = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DefaultSchemaDefinitionImpl <em>Default Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DefaultSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDefaultSchemaDefinition()
	 * @generated
	 */
	int DEFAULT_SCHEMA_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SCHEMA_DEFINITION__DEFAULT = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ThenSchemaDefinitionImpl <em>Then Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ThenSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getThenSchemaDefinition()
	 * @generated
	 */
	int THEN_SCHEMA_DEFINITION = 12;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_SCHEMA_DEFINITION__THEN = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Then Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Then Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinLengthSchemaDefinitionImpl <em>Min Length Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinLengthSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinLengthSchemaDefinition()
	 * @generated
	 */
	int MIN_LENGTH_SCHEMA_DEFINITION = 13;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Length Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Length Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DefinitionsSchemaDefinitionImpl <em>Definitions Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DefinitionsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDefinitionsSchemaDefinition()
	 * @generated
	 */
	int DEFINITIONS_SCHEMA_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Key Schema Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definitions Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Definitions Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinItemsSchemaDefinitionImpl <em>Min Items Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinItemsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinItemsSchemaDefinition()
	 * @generated
	 */
	int MIN_ITEMS_SCHEMA_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ITEMS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ITEMS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.OneOfSchemaDefinitionImpl <em>One Of Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.OneOfSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getOneOfSchemaDefinition()
	 * @generated
	 */
	int ONE_OF_SCHEMA_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_SCHEMA_DEFINITION__ONE_OF = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>One Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>One Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaArrayImpl <em>Schema Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaArrayImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaArray()
	 * @generated
	 */
	int SCHEMA_ARRAY = 18;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ARRAY__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Schema Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ARRAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schema Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ARRAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxPropertiesSchemaDefinitionImpl <em>Max Properties Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxPropertiesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaxPropertiesSchemaDefinition()
	 * @generated
	 */
	int MAX_PROPERTIES_SCHEMA_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Max Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_PROPERTIES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_PROPERTIES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NullValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 20;

	/**
	 * The number of structural features of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinimumSchemaDefinitionImpl <em>Minimum Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinimumSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinimumSchemaDefinition()
	 * @generated
	 */
	int MINIMUM_SCHEMA_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_SCHEMA_DEFINITION__MINIMUM = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Minimum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.StringValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonDocumentImpl <em>Json Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonDocumentImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getJsonDocument()
	 * @generated
	 */
	int JSON_DOCUMENT = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DOCUMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Json Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Json Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxItemsSchemaDefinitionImpl <em>Max Items Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxItemsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaxItemsSchemaDefinition()
	 * @generated
	 */
	int MAX_ITEMS_SCHEMA_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITEMS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITEMS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.FormatSchemaDefinitionImpl <em>Format Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.FormatSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getFormatSchemaDefinition()
	 * @generated
	 */
	int FORMAT_SCHEMA_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SCHEMA_DEFINITION__FORMAT = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Format Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Format Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ReadOnlySchemaDefinitionImpl <em>Read Only Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ReadOnlySchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getReadOnlySchemaDefinition()
	 * @generated
	 */
	int READ_ONLY_SCHEMA_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ONLY_SCHEMA_DEFINITION__READ_ONLY = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Only Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ONLY_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read Only Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ONLY_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectValueImpl <em>Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getObjectValue()
	 * @generated
	 */
	int OBJECT_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Keyvaluepair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE__KEYVALUEPAIR = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.TypeSchemaDefinitionImpl <em>Type Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.TypeSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getTypeSchemaDefinition()
	 * @generated
	 */
	int TYPE_SCHEMA_DEFINITION = 29;

	/**
	 * The feature id for the '<em><b>Type Any Of1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1 = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types Any Of2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2 = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalPropertiesSchemaDefinitionImpl <em>Additional Properties Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalPropertiesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAdditionalPropertiesSchemaDefinition()
	 * @generated
	 */
	int ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION = 30;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additional Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Additional Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ElseSchemaDefinitionImpl <em>Else Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ElseSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getElseSchemaDefinition()
	 * @generated
	 */
	int ELSE_SCHEMA_DEFINITION = 31;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_SCHEMA_DEFINITION__ELSE = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Else Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Else Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.IdSchemaDefinitionImpl <em>Id Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.IdSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getIdSchemaDefinition()
	 * @generated
	 */
	int ID_SCHEMA_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHEMA_DEFINITION__ID = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Id Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Id Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ConstSchemaDefinitionImpl <em>Const Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ConstSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getConstSchemaDefinition()
	 * @generated
	 */
	int CONST_SCHEMA_DEFINITION = 33;

	/**
	 * The feature id for the '<em><b>Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_SCHEMA_DEFINITION__CONST = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Const Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DependenciesSchemaDefinitionImpl <em>Dependencies Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DependenciesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDependenciesSchemaDefinition()
	 * @generated
	 */
	int DEPENDENCIES_SCHEMA_DEFINITION = 34;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_SCHEMA_DEFINITION__PROPERTIES = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependencies Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dependencies Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NumberValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.RequiredSchemaDefinitionImpl <em>Required Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.RequiredSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getRequiredSchemaDefinition()
	 * @generated
	 */
	int REQUIRED_SCHEMA_DEFINITION = 36;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEMA_DEFINITION__REQUIRED = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DescriptionSchemaDefinitionImpl <em>Description Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DescriptionSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDescriptionSchemaDefinition()
	 * @generated
	 */
	int DESCRIPTION_SCHEMA_DEFINITION = 37;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_SCHEMA_DEFINITION__DESCRIPTION = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Description Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinPropertiesSchemaDefinitionImpl <em>Min Properties Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinPropertiesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinPropertiesSchemaDefinition()
	 * @generated
	 */
	int MIN_PROPERTIES_SCHEMA_DEFINITION = 38;

	/**
	 * The feature id for the '<em><b>Min Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PROPERTIES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_PROPERTIES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternPropertiesSchemaDefinitionImpl <em>Pattern Properties Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternPropertiesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPatternPropertiesSchemaDefinition()
	 * @generated
	 */
	int PATTERN_PROPERTIES_SCHEMA_DEFINITION = 39;

	/**
	 * The feature id for the '<em><b>Key Schema Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROPERTIES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_PROPERTIES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalItemsSchemaDefinitionImpl <em>Additional Items Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalItemsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAdditionalItemsSchemaDefinition()
	 * @generated
	 */
	int ADDITIONAL_ITEMS_SCHEMA_DEFINITION = 40;

	/**
	 * The feature id for the '<em><b>Additional Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additional Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ITEMS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Additional Items Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_ITEMS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.KeyValuePairImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 41;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExamplesSchemaDefinitionImpl <em>Examples Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ExamplesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getExamplesSchemaDefinition()
	 * @generated
	 */
	int EXAMPLES_SCHEMA_DEFINITION = 42;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_SCHEMA_DEFINITION__EXAMPLES = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Examples Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Examples Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.IfSchemaDefinitionImpl <em>If Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.IfSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getIfSchemaDefinition()
	 * @generated
	 */
	int IF_SCHEMA_DEFINITION = 43;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SCHEMA_DEFINITION__IF = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>If Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AllOfSchemaDefinitionImpl <em>All Of Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AllOfSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAllOfSchemaDefinition()
	 * @generated
	 */
	int ALL_OF_SCHEMA_DEFINITION = 44;

	/**
	 * The feature id for the '<em><b>All Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_SCHEMA_DEFINITION__ALL_OF = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentEncodingSchemaDefinitionImpl <em>Content Encoding Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentEncodingSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getContentEncodingSchemaDefinition()
	 * @generated
	 */
	int CONTENT_ENCODING_SCHEMA_DEFINITION = 45;

	/**
	 * The feature id for the '<em><b>Content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Encoding Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ENCODING_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Encoding Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ENCODING_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MultipleOfSchemaDefinitionImpl <em>Multiple Of Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MultipleOfSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMultipleOfSchemaDefinition()
	 * @generated
	 */
	int MULTIPLE_OF_SCHEMA_DEFINITION = 46;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OF_SCHEMA_DEFINITION__MULTIPLE_OF = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OF_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple Of Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OF_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternSchemaDefinitionImpl <em>Pattern Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPatternSchemaDefinition()
	 * @generated
	 */
	int PATTERN_SCHEMA_DEFINITION = 47;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCHEMA_DEFINITION__PATTERN = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pattern Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContainsSchemaDefinitionImpl <em>Contains Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ContainsSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getContainsSchemaDefinition()
	 * @generated
	 */
	int CONTAINS_SCHEMA_DEFINITION = 49;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_SCHEMA_DEFINITION__CONTAINS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NotSchemaDefinitionImpl <em>Not Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NotSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNotSchemaDefinition()
	 * @generated
	 */
	int NOT_SCHEMA_DEFINITION = 50;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SCHEMA_DEFINITION__NOT = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMaximumSchemaDefinitionImpl <em>Exclusive Maximum Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMaximumSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getExclusiveMaximumSchemaDefinition()
	 * @generated
	 */
	int EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION = 51;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MAXIMUM = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive Maximum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exclusive Maximum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxLengthSchemaDefinitionImpl <em>Max Length Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxLengthSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaxLengthSchemaDefinition()
	 * @generated
	 */
	int MAX_LENGTH_SCHEMA_DEFINITION = 52;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Length Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Length Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.RefSchemaDefinitionImpl <em>Ref Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.RefSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getRefSchemaDefinition()
	 * @generated
	 */
	int REF_SCHEMA_DEFINITION = 53;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SCHEMA_DEFINITION__REF = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonSchemaImpl <em>Json Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonSchemaImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getJsonSchema()
	 * @generated
	 */
	int JSON_SCHEMA = 54;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA__SCHEMA = 0;

	/**
	 * The number of structural features of the '<em>Json Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Json Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.KeySchemaPairImpl <em>Key Schema Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.KeySchemaPairImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getKeySchemaPair()
	 * @generated
	 */
	int KEY_SCHEMA_PAIR = 55;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SCHEMA_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SCHEMA_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Schema Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SCHEMA_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Schema Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_SCHEMA_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentMediaTypeSchemaDefinitionImpl <em>Content Media Type Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentMediaTypeSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getContentMediaTypeSchemaDefinition()
	 * @generated
	 */
	int CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION = 56;

	/**
	 * The feature id for the '<em><b>Content Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Media Type Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Media Type Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMinimumSchemaDefinitionImpl <em>Exclusive Minimum Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMinimumSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getExclusiveMinimumSchemaDefinition()
	 * @generated
	 */
	int EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION = 57;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive Minimum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exclusive Minimum Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaSchemaDefinitionImpl <em>Schema Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaSchemaDefinition()
	 * @generated
	 */
	int SCHEMA_SCHEMA_DEFINITION = 58;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SCHEMA_DEFINITION__SCHEMA = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schema Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schema Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertiesSchemaDefinitionImpl <em>Properties Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertiesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPropertiesSchemaDefinition()
	 * @generated
	 */
	int PROPERTIES_SCHEMA_DEFINITION = 59;

	/**
	 * The feature id for the '<em><b>Key Schema Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Properties Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertyNamesSchemaDefinitionImpl <em>Property Names Schema Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertyNamesSchemaDefinitionImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPropertyNamesSchemaDefinition()
	 * @generated
	 */
	int PROPERTY_NAMES_SCHEMA_DEFINITION = 60;

	/**
	 * The feature id for the '<em><b>Property Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Names Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAMES_SCHEMA_DEFINITION_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Names Schema Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAMES_SCHEMA_DEFINITION_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ArrayValueImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.TypesAnyOf2Impl <em>Types Any Of2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.TypesAnyOf2Impl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getTypesAnyOf2()
	 * @generated
	 */
	int TYPES_ANY_OF2 = 63;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ANY_OF2__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Types Any Of2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ANY_OF2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Types Any Of2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_ANY_OF2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanSchemaImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getBooleanSchema()
	 * @generated
	 */
	int BOOLEAN_SCHEMA = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__VALUE = SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_OPERATION_COUNT = SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerImpl <em>Non Negative Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNonNegativeInteger()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Non Negative Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Non Negative Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerDefault0Impl <em>Non Negative Integer Default0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerDefault0Impl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNonNegativeIntegerDefault0()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_DEFAULT0 = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_DEFAULT0__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Non Negative Integer Default0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_DEFAULT0_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Non Negative Integer Default0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_DEFAULT0_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectAdditionalPropertiesImpl <em>Schema Object Additional Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectAdditionalPropertiesImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectAdditionalProperties()
	 * @generated
	 */
	int SCHEMA_OBJECT_ADDITIONAL_PROPERTIES = 67;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_ADDITIONAL_PROPERTIES__KEY = KEYWORD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = KEYWORD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema Object Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_ADDITIONAL_PROPERTIES_FEATURE_COUNT = KEYWORD_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schema Object Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_ADDITIONAL_PROPERTIES_OPERATION_COUNT = KEYWORD_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesPropertiesImpl <em>Schema Object Dependencies Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesPropertiesImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesProperties()
	 * @generated
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES = 68;

	/**
	 * The number of structural features of the '<em>Schema Object Dependencies Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schema Object Dependencies Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesImpl <em>Schema Object Dependencies Additional Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalProperties()
	 * @generated
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES = 69;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__KEY = SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES_FEATURE_COUNT
			+ 1;

	/**
	 * The number of structural features of the '<em>Schema Object Dependencies Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_FEATURE_COUNT = SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Schema Object Dependencies Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_OPERATION_COUNT = SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOfImpl <em>Schema Object Dependencies Additional Properties Any Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOfImpl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalPropertiesAnyOf()
	 * @generated
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF = 72;

	/**
	 * The number of structural features of the '<em>Schema Object Dependencies Additional Properties Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schema Object Dependencies Additional Properties Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl <em>Schema Object Dependencies Additional Properties Any Of1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalPropertiesAnyOf1()
	 * @generated
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1 = 70;

	/**
	 * The feature id for the '<em><b>Any Of1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1 = SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Schema Object Dependencies Additional Properties Any Of1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1_FEATURE_COUNT = SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_FEATURE_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Schema Object Dependencies Additional Properties Any Of1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1_OPERATION_COUNT = SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl <em>Schema Object Dependencies Additional Properties Any Of2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalPropertiesAnyOf2()
	 * @generated
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2 = 71;

	/**
	 * The feature id for the '<em><b>Any Of2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2 = SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Schema Object Dependencies Additional Properties Any Of2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2_FEATURE_COUNT = SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_FEATURE_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Schema Object Dependencies Additional Properties Any Of2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2_OPERATION_COUNT = SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes <em>Simple Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSimpleTypes()
	 * @generated
	 */
	int SIMPLE_TYPES = 73;

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Schema</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema
	 * @generated
	 */
	EClass getObjectSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema#getKeywordDefinition <em>Keyword Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyword Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema#getKeywordDefinition()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EReference getObjectSchema_KeywordDefinition();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaximumSchemaDefinition <em>Maximum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximum Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaximumSchemaDefinition
	 * @generated
	 */
	EClass getMaximumSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaximumSchemaDefinition#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaximumSchemaDefinition#getMaximum()
	 * @see #getMaximumSchemaDefinition()
	 * @generated
	 */
	EAttribute getMaximumSchemaDefinition_Maximum();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.WriteOnlySchemaDefinition <em>Write Only Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Only Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.WriteOnlySchemaDefinition
	 * @generated
	 */
	EClass getWriteOnlySchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.WriteOnlySchemaDefinition#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.WriteOnlySchemaDefinition#isWriteOnly()
	 * @see #getWriteOnlySchemaDefinition()
	 * @generated
	 */
	EAttribute getWriteOnlySchemaDefinition_WriteOnly();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.CommentSchemaDefinition <em>Comment Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.CommentSchemaDefinition
	 * @generated
	 */
	EClass getCommentSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.CommentSchemaDefinition#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.CommentSchemaDefinition#getComment()
	 * @see #getCommentSchemaDefinition()
	 * @generated
	 */
	EAttribute getCommentSchemaDefinition_Comment();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.EnumSchemaDefinition <em>Enum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.EnumSchemaDefinition
	 * @generated
	 */
	EClass getEnumSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.EnumSchemaDefinition#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.EnumSchemaDefinition#getItems()
	 * @see #getEnumSchemaDefinition()
	 * @generated
	 */
	EReference getEnumSchemaDefinition_Items();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition <em>Unique Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Items Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition
	 * @generated
	 */
	EClass getUniqueItemsSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition#isUniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition#isUniqueItems()
	 * @see #getUniqueItemsSchemaDefinition()
	 * @generated
	 */
	EAttribute getUniqueItemsSchemaDefinition_UniqueItems();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.AnyOfSchemaDefinition <em>Any Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Of Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AnyOfSchemaDefinition
	 * @generated
	 */
	EClass getAnyOfSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.AnyOfSchemaDefinition#getAnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Of</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AnyOfSchemaDefinition#getAnyOf()
	 * @see #getAnyOfSchemaDefinition()
	 * @generated
	 */
	EReference getAnyOfSchemaDefinition_AnyOf();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.StringArray <em>String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Array</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.StringArray
	 * @generated
	 */
	EClass getStringArray();

	/**
	 * Returns the meta object for the attribute list '{@link jsonMetaschemaMM.jsonMetaschemaMM.StringArray#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.StringArray#getValues()
	 * @see #getStringArray()
	 * @generated
	 */
	EAttribute getStringArray_Values();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.TitleSchemaDefinition <em>Title Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TitleSchemaDefinition
	 * @generated
	 */
	EClass getTitleSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.TitleSchemaDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TitleSchemaDefinition#getTitle()
	 * @see #getTitleSchemaDefinition()
	 * @generated
	 */
	EAttribute getTitleSchemaDefinition_Title();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition <em>Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Items Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition
	 * @generated
	 */
	EClass getItemsSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf1 <em>Items Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items Any Of1</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf1()
	 * @see #getItemsSchemaDefinition()
	 * @generated
	 */
	EReference getItemsSchemaDefinition_ItemsAnyOf1();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf2 <em>Items Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items Any Of2</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf2()
	 * @see #getItemsSchemaDefinition()
	 * @generated
	 */
	EReference getItemsSchemaDefinition_ItemsAnyOf2();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.DefaultSchemaDefinition <em>Default Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DefaultSchemaDefinition
	 * @generated
	 */
	EClass getDefaultSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.DefaultSchemaDefinition#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DefaultSchemaDefinition#getDefault()
	 * @see #getDefaultSchemaDefinition()
	 * @generated
	 */
	EReference getDefaultSchemaDefinition_Default();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ThenSchemaDefinition <em>Then Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ThenSchemaDefinition
	 * @generated
	 */
	EClass getThenSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.ThenSchemaDefinition#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ThenSchemaDefinition#getThen()
	 * @see #getThenSchemaDefinition()
	 * @generated
	 */
	EReference getThenSchemaDefinition_Then();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinLengthSchemaDefinition <em>Min Length Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinLengthSchemaDefinition
	 * @generated
	 */
	EClass getMinLengthSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinLengthSchemaDefinition#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Length</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinLengthSchemaDefinition#getMinLength()
	 * @see #getMinLengthSchemaDefinition()
	 * @generated
	 */
	EReference getMinLengthSchemaDefinition_MinLength();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.DefinitionsSchemaDefinition <em>Definitions Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DefinitionsSchemaDefinition
	 * @generated
	 */
	EClass getDefinitionsSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.DefinitionsSchemaDefinition#getKeySchemaPairs <em>Key Schema Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Schema Pairs</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DefinitionsSchemaDefinition#getKeySchemaPairs()
	 * @see #getDefinitionsSchemaDefinition()
	 * @generated
	 */
	EReference getDefinitionsSchemaDefinition_KeySchemaPairs();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition <em>Min Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Items Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition
	 * @generated
	 */
	EClass getMinItemsSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition#getMinItems()
	 * @see #getMinItemsSchemaDefinition()
	 * @generated
	 */
	EReference getMinItemsSchemaDefinition_MinItems();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition <em>One Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Of Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition
	 * @generated
	 */
	EClass getOneOfSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One Of</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition#getOneOf()
	 * @see #getOneOfSchemaDefinition()
	 * @generated
	 */
	EReference getOneOfSchemaDefinition_OneOf();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray <em>Schema Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Array</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray
	 * @generated
	 */
	EClass getSchemaArray();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray#getItems()
	 * @see #getSchemaArray()
	 * @generated
	 */
	EReference getSchemaArray_Items();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition <em>Max Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Properties Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition
	 * @generated
	 */
	EClass getMaxPropertiesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition#getMaxProperties <em>Max Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition#getMaxProperties()
	 * @see #getMaxPropertiesSchemaDefinition()
	 * @generated
	 */
	EReference getMaxPropertiesSchemaDefinition_MaxProperties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NullValue
	 * @generated
	 */
	EClass getNullValue();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinimumSchemaDefinition <em>Minimum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinimumSchemaDefinition
	 * @generated
	 */
	EClass getMinimumSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinimumSchemaDefinition#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinimumSchemaDefinition#getMinimum()
	 * @see #getMinimumSchemaDefinition()
	 * @generated
	 */
	EAttribute getMinimumSchemaDefinition_Minimum();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.JsonDocument <em>Json Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Document</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonDocument
	 * @generated
	 */
	EClass getJsonDocument();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.JsonDocument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonDocument#getValue()
	 * @see #getJsonDocument()
	 * @generated
	 */
	EReference getJsonDocument_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition <em>Max Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Items Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition
	 * @generated
	 */
	EClass getMaxItemsSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition#getMaxItems()
	 * @see #getMaxItemsSchemaDefinition()
	 * @generated
	 */
	EReference getMaxItemsSchemaDefinition_MaxItems();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.FormatSchemaDefinition <em>Format Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.FormatSchemaDefinition
	 * @generated
	 */
	EClass getFormatSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.FormatSchemaDefinition#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.FormatSchemaDefinition#getFormat()
	 * @see #getFormatSchemaDefinition()
	 * @generated
	 */
	EAttribute getFormatSchemaDefinition_Format();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ReadOnlySchemaDefinition <em>Read Only Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Only Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ReadOnlySchemaDefinition
	 * @generated
	 */
	EClass getReadOnlySchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.ReadOnlySchemaDefinition#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ReadOnlySchemaDefinition#isReadOnly()
	 * @see #getReadOnlySchemaDefinition()
	 * @generated
	 */
	EAttribute getReadOnlySchemaDefinition_ReadOnly();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ObjectValue
	 * @generated
	 */
	EClass getObjectValue();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.ObjectValue#getKeyvaluepair <em>Keyvaluepair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyvaluepair</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ObjectValue#getKeyvaluepair()
	 * @see #getObjectValue()
	 * @generated
	 */
	EReference getObjectValue_Keyvaluepair();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition <em>Type Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition
	 * @generated
	 */
	EClass getTypeSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypeAnyOf1 <em>Type Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Any Of1</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypeAnyOf1()
	 * @see #getTypeSchemaDefinition()
	 * @generated
	 */
	EAttribute getTypeSchemaDefinition_TypeAnyOf1();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypesAnyOf2 <em>Types Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types Any Of2</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypesAnyOf2()
	 * @see #getTypeSchemaDefinition()
	 * @generated
	 */
	EReference getTypeSchemaDefinition_TypesAnyOf2();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition <em>Additional Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Properties Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition
	 * @generated
	 */
	EClass getAdditionalPropertiesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition#getAdditionalProperties()
	 * @see #getAdditionalPropertiesSchemaDefinition()
	 * @generated
	 */
	EReference getAdditionalPropertiesSchemaDefinition_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ElseSchemaDefinition <em>Else Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ElseSchemaDefinition
	 * @generated
	 */
	EClass getElseSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.ElseSchemaDefinition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ElseSchemaDefinition#getElse()
	 * @see #getElseSchemaDefinition()
	 * @generated
	 */
	EReference getElseSchemaDefinition_Else();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.IdSchemaDefinition <em>Id Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.IdSchemaDefinition
	 * @generated
	 */
	EClass getIdSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.IdSchemaDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.IdSchemaDefinition#getId()
	 * @see #getIdSchemaDefinition()
	 * @generated
	 */
	EAttribute getIdSchemaDefinition_Id();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition <em>Const Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition
	 * @generated
	 */
	EClass getConstSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition#getConst()
	 * @see #getConstSchemaDefinition()
	 * @generated
	 */
	EReference getConstSchemaDefinition_Const();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesSchemaDefinition <em>Dependencies Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DependenciesSchemaDefinition
	 * @generated
	 */
	EClass getDependenciesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesSchemaDefinition#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DependenciesSchemaDefinition#getProperties()
	 * @see #getDependenciesSchemaDefinition()
	 * @generated
	 */
	EReference getDependenciesSchemaDefinition_Properties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.NumberValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NumberValue#getValue()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.RequiredSchemaDefinition <em>Required Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.RequiredSchemaDefinition
	 * @generated
	 */
	EClass getRequiredSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.RequiredSchemaDefinition#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.RequiredSchemaDefinition#getRequired()
	 * @see #getRequiredSchemaDefinition()
	 * @generated
	 */
	EReference getRequiredSchemaDefinition_Required();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.DescriptionSchemaDefinition <em>Description Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DescriptionSchemaDefinition
	 * @generated
	 */
	EClass getDescriptionSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.DescriptionSchemaDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.DescriptionSchemaDefinition#getDescription()
	 * @see #getDescriptionSchemaDefinition()
	 * @generated
	 */
	EAttribute getDescriptionSchemaDefinition_Description();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinPropertiesSchemaDefinition <em>Min Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Properties Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinPropertiesSchemaDefinition
	 * @generated
	 */
	EClass getMinPropertiesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinPropertiesSchemaDefinition#getMinProperties <em>Min Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MinPropertiesSchemaDefinition#getMinProperties()
	 * @see #getMinPropertiesSchemaDefinition()
	 * @generated
	 */
	EReference getMinPropertiesSchemaDefinition_MinProperties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.PatternPropertiesSchemaDefinition <em>Pattern Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Properties Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PatternPropertiesSchemaDefinition
	 * @generated
	 */
	EClass getPatternPropertiesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.PatternPropertiesSchemaDefinition#getKeySchemaPairs <em>Key Schema Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Schema Pairs</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PatternPropertiesSchemaDefinition#getKeySchemaPairs()
	 * @see #getPatternPropertiesSchemaDefinition()
	 * @generated
	 */
	EReference getPatternPropertiesSchemaDefinition_KeySchemaPairs();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.AdditionalItemsSchemaDefinition <em>Additional Items Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Items Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AdditionalItemsSchemaDefinition
	 * @generated
	 */
	EClass getAdditionalItemsSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.AdditionalItemsSchemaDefinition#getAdditionalItems <em>Additional Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AdditionalItemsSchemaDefinition#getAdditionalItems()
	 * @see #getAdditionalItemsSchemaDefinition()
	 * @generated
	 */
	EReference getAdditionalItemsSchemaDefinition_AdditionalItems();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EReference getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ExamplesSchemaDefinition <em>Examples Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examples Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ExamplesSchemaDefinition
	 * @generated
	 */
	EClass getExamplesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.ExamplesSchemaDefinition#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ExamplesSchemaDefinition#getExamples()
	 * @see #getExamplesSchemaDefinition()
	 * @generated
	 */
	EReference getExamplesSchemaDefinition_Examples();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.IfSchemaDefinition <em>If Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.IfSchemaDefinition
	 * @generated
	 */
	EClass getIfSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.IfSchemaDefinition#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.IfSchemaDefinition#getIf()
	 * @see #getIfSchemaDefinition()
	 * @generated
	 */
	EReference getIfSchemaDefinition_If();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition <em>All Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Of Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition
	 * @generated
	 */
	EClass getAllOfSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition#getAllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Of</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition#getAllOf()
	 * @see #getAllOfSchemaDefinition()
	 * @generated
	 */
	EReference getAllOfSchemaDefinition_AllOf();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ContentEncodingSchemaDefinition <em>Content Encoding Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Encoding Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ContentEncodingSchemaDefinition
	 * @generated
	 */
	EClass getContentEncodingSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.ContentEncodingSchemaDefinition#getContentEncoding <em>Content Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Encoding</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ContentEncodingSchemaDefinition#getContentEncoding()
	 * @see #getContentEncodingSchemaDefinition()
	 * @generated
	 */
	EAttribute getContentEncodingSchemaDefinition_ContentEncoding();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MultipleOfSchemaDefinition <em>Multiple Of Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Of Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MultipleOfSchemaDefinition
	 * @generated
	 */
	EClass getMultipleOfSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.MultipleOfSchemaDefinition#getMultipleOf <em>Multiple Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Of</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MultipleOfSchemaDefinition#getMultipleOf()
	 * @see #getMultipleOfSchemaDefinition()
	 * @generated
	 */
	EAttribute getMultipleOfSchemaDefinition_MultipleOf();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.PatternSchemaDefinition <em>Pattern Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PatternSchemaDefinition
	 * @generated
	 */
	EClass getPatternSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.PatternSchemaDefinition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PatternSchemaDefinition#getPattern()
	 * @see #getPatternSchemaDefinition()
	 * @generated
	 */
	EAttribute getPatternSchemaDefinition_Pattern();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeywordDefinition <em>Keyword Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeywordDefinition
	 * @generated
	 */
	EClass getKeywordDefinition();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ContainsSchemaDefinition <em>Contains Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ContainsSchemaDefinition
	 * @generated
	 */
	EClass getContainsSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.ContainsSchemaDefinition#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ContainsSchemaDefinition#getContains()
	 * @see #getContainsSchemaDefinition()
	 * @generated
	 */
	EReference getContainsSchemaDefinition_Contains();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.NotSchemaDefinition <em>Not Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NotSchemaDefinition
	 * @generated
	 */
	EClass getNotSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.NotSchemaDefinition#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NotSchemaDefinition#getNot()
	 * @see #getNotSchemaDefinition()
	 * @generated
	 */
	EReference getNotSchemaDefinition_Not();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition <em>Exclusive Maximum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Maximum Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition
	 * @generated
	 */
	EClass getExclusiveMaximumSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMaximumSchemaDefinition#getExclusiveMaximum()
	 * @see #getExclusiveMaximumSchemaDefinition()
	 * @generated
	 */
	EAttribute getExclusiveMaximumSchemaDefinition_ExclusiveMaximum();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxLengthSchemaDefinition <em>Max Length Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaxLengthSchemaDefinition
	 * @generated
	 */
	EClass getMaxLengthSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxLengthSchemaDefinition#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Length</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.MaxLengthSchemaDefinition#getMaxLength()
	 * @see #getMaxLengthSchemaDefinition()
	 * @generated
	 */
	EReference getMaxLengthSchemaDefinition_MaxLength();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.RefSchemaDefinition <em>Ref Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.RefSchemaDefinition
	 * @generated
	 */
	EClass getRefSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.RefSchemaDefinition#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.RefSchemaDefinition#getRef()
	 * @see #getRefSchemaDefinition()
	 * @generated
	 */
	EAttribute getRefSchemaDefinition_Ref();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.JsonSchema <em>Json Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Schema</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonSchema
	 * @generated
	 */
	EClass getJsonSchema();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.JsonSchema#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonSchema#getSchema()
	 * @see #getJsonSchema()
	 * @generated
	 */
	EReference getJsonSchema_Schema();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair <em>Key Schema Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Schema Pair</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair
	 * @generated
	 */
	EClass getKeySchemaPair();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair#getKey()
	 * @see #getKeySchemaPair()
	 * @generated
	 */
	EAttribute getKeySchemaPair_Key();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair#getValue()
	 * @see #getKeySchemaPair()
	 * @generated
	 */
	EReference getKeySchemaPair_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ContentMediaTypeSchemaDefinition <em>Content Media Type Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Media Type Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ContentMediaTypeSchemaDefinition
	 * @generated
	 */
	EClass getContentMediaTypeSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.ContentMediaTypeSchemaDefinition#getContentMediaType <em>Content Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Media Type</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ContentMediaTypeSchemaDefinition#getContentMediaType()
	 * @see #getContentMediaTypeSchemaDefinition()
	 * @generated
	 */
	EAttribute getContentMediaTypeSchemaDefinition_ContentMediaType();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition <em>Exclusive Minimum Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Minimum Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition
	 * @generated
	 */
	EClass getExclusiveMinimumSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition#getExclusiveMinimum()
	 * @see #getExclusiveMinimumSchemaDefinition()
	 * @generated
	 */
	EAttribute getExclusiveMinimumSchemaDefinition_ExclusiveMinimum();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaSchemaDefinition <em>Schema Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaSchemaDefinition
	 * @generated
	 */
	EClass getSchemaSchemaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaSchemaDefinition#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaSchemaDefinition#getSchema()
	 * @see #getSchemaSchemaDefinition()
	 * @generated
	 */
	EAttribute getSchemaSchemaDefinition_Schema();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.PropertiesSchemaDefinition <em>Properties Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PropertiesSchemaDefinition
	 * @generated
	 */
	EClass getPropertiesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.PropertiesSchemaDefinition#getKeySchemaPairs <em>Key Schema Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Schema Pairs</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PropertiesSchemaDefinition#getKeySchemaPairs()
	 * @see #getPropertiesSchemaDefinition()
	 * @generated
	 */
	EReference getPropertiesSchemaDefinition_KeySchemaPairs();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition <em>Property Names Schema Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Names Schema Definition</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition
	 * @generated
	 */
	EClass getPropertyNamesSchemaDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition#getPropertyNames <em>Property Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Names</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition#getPropertyNames()
	 * @see #getPropertyNamesSchemaDefinition()
	 * @generated
	 */
	EReference getPropertyNamesSchemaDefinition_PropertyNames();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link jsonMetaschemaMM.jsonMetaschemaMM.ArrayValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.ArrayValue#getValue()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypesAnyOf2 <em>Types Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Any Of2</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TypesAnyOf2
	 * @generated
	 */
	EClass getTypesAnyOf2();

	/**
	 * Returns the meta object for the attribute list '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypesAnyOf2#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.TypesAnyOf2#getItems()
	 * @see #getTypesAnyOf2()
	 * @generated
	 */
	EAttribute getTypesAnyOf2_Items();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Schema</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.BooleanSchema
	 * @generated
	 */
	EClass getBooleanSchema();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.BooleanSchema#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.BooleanSchema#isValue()
	 * @see #getBooleanSchema()
	 * @generated
	 */
	EAttribute getBooleanSchema_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger <em>Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Negative Integer</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger
	 * @generated
	 */
	EClass getNonNegativeInteger();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger#getValue()
	 * @see #getNonNegativeInteger()
	 * @generated
	 */
	EAttribute getNonNegativeInteger_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0 <em>Non Negative Integer Default0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Negative Integer Default0</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0
	 * @generated
	 */
	EClass getNonNegativeIntegerDefault0();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0#getValue()
	 * @see #getNonNegativeIntegerDefault0()
	 * @generated
	 */
	EAttribute getNonNegativeIntegerDefault0_Value();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties <em>Schema Object Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Object Additional Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties
	 * @generated
	 */
	EClass getSchemaObjectAdditionalProperties();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getKey()
	 * @see #getSchemaObjectAdditionalProperties()
	 * @generated
	 */
	EAttribute getSchemaObjectAdditionalProperties_Key();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getAdditionalProperties()
	 * @see #getSchemaObjectAdditionalProperties()
	 * @generated
	 */
	EReference getSchemaObjectAdditionalProperties_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesProperties <em>Schema Object Dependencies Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Object Dependencies Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesProperties
	 * @generated
	 */
	EClass getSchemaObjectDependenciesProperties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties <em>Schema Object Dependencies Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Object Dependencies Additional Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties
	 * @generated
	 */
	EClass getSchemaObjectDependenciesAdditionalProperties();

	/**
	 * Returns the meta object for the attribute '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getKey()
	 * @see #getSchemaObjectDependenciesAdditionalProperties()
	 * @generated
	 */
	EAttribute getSchemaObjectDependenciesAdditionalProperties_Key();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Properties</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getAdditionalProperties()
	 * @see #getSchemaObjectDependenciesAdditionalProperties()
	 * @generated
	 */
	EReference getSchemaObjectDependenciesAdditionalProperties_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1 <em>Schema Object Dependencies Additional Properties Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Object Dependencies Additional Properties Any Of1</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1
	 * @generated
	 */
	EClass getSchemaObjectDependenciesAdditionalPropertiesAnyOf1();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1#getAnyOf1 <em>Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Of1</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1#getAnyOf1()
	 * @see #getSchemaObjectDependenciesAdditionalPropertiesAnyOf1()
	 * @generated
	 */
	EReference getSchemaObjectDependenciesAdditionalPropertiesAnyOf1_AnyOf1();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2 <em>Schema Object Dependencies Additional Properties Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Object Dependencies Additional Properties Any Of2</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2
	 * @generated
	 */
	EClass getSchemaObjectDependenciesAdditionalPropertiesAnyOf2();

	/**
	 * Returns the meta object for the containment reference '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2#getAnyOf2 <em>Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Of2</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2#getAnyOf2()
	 * @see #getSchemaObjectDependenciesAdditionalPropertiesAnyOf2()
	 * @generated
	 */
	EReference getSchemaObjectDependenciesAdditionalPropertiesAnyOf2_AnyOf2();

	/**
	 * Returns the meta object for class '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf <em>Schema Object Dependencies Additional Properties Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Object Dependencies Additional Properties Any Of</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf
	 * @generated
	 */
	EClass getSchemaObjectDependenciesAdditionalPropertiesAnyOf();

	/**
	 * Returns the meta object for enum '{@link jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes <em>Simple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Types</em>'.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes
	 * @generated
	 */
	EEnum getSimpleTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JsonMetaschemaMMFactory getJsonMetaschemaMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectSchemaImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getObjectSchema()
		 * @generated
		 */
		EClass OBJECT_SCHEMA = eINSTANCE.getObjectSchema();

		/**
		 * The meta object literal for the '<em><b>Keyword Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SCHEMA__KEYWORD_DEFINITION = eINSTANCE.getObjectSchema_KeywordDefinition();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaximumSchemaDefinitionImpl <em>Maximum Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaximumSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaximumSchemaDefinition()
		 * @generated
		 */
		EClass MAXIMUM_SCHEMA_DEFINITION = eINSTANCE.getMaximumSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAXIMUM_SCHEMA_DEFINITION__MAXIMUM = eINSTANCE.getMaximumSchemaDefinition_Maximum();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.IntegerValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.WriteOnlySchemaDefinitionImpl <em>Write Only Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.WriteOnlySchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getWriteOnlySchemaDefinition()
		 * @generated
		 */
		EClass WRITE_ONLY_SCHEMA_DEFINITION = eINSTANCE.getWriteOnlySchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITE_ONLY_SCHEMA_DEFINITION__WRITE_ONLY = eINSTANCE.getWriteOnlySchemaDefinition_WriteOnly();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.CommentSchemaDefinitionImpl <em>Comment Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.CommentSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getCommentSchemaDefinition()
		 * @generated
		 */
		EClass COMMENT_SCHEMA_DEFINITION = eINSTANCE.getCommentSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_SCHEMA_DEFINITION__COMMENT = eINSTANCE.getCommentSchemaDefinition_Comment();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.EnumSchemaDefinitionImpl <em>Enum Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.EnumSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getEnumSchemaDefinition()
		 * @generated
		 */
		EClass ENUM_SCHEMA_DEFINITION = eINSTANCE.getEnumSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_SCHEMA_DEFINITION__ITEMS = eINSTANCE.getEnumSchemaDefinition_Items();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.UniqueItemsSchemaDefinitionImpl <em>Unique Items Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.UniqueItemsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getUniqueItemsSchemaDefinition()
		 * @generated
		 */
		EClass UNIQUE_ITEMS_SCHEMA_DEFINITION = eINSTANCE.getUniqueItemsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Unique Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS = eINSTANCE
				.getUniqueItemsSchemaDefinition_UniqueItems();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AnyOfSchemaDefinitionImpl <em>Any Of Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AnyOfSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAnyOfSchemaDefinition()
		 * @generated
		 */
		EClass ANY_OF_SCHEMA_DEFINITION = eINSTANCE.getAnyOfSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Any Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OF_SCHEMA_DEFINITION__ANY_OF = eINSTANCE.getAnyOfSchemaDefinition_AnyOf();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.StringArrayImpl <em>String Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.StringArrayImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getStringArray()
		 * @generated
		 */
		EClass STRING_ARRAY = eINSTANCE.getStringArray();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ARRAY__VALUES = eINSTANCE.getStringArray_Values();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.TitleSchemaDefinitionImpl <em>Title Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.TitleSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getTitleSchemaDefinition()
		 * @generated
		 */
		EClass TITLE_SCHEMA_DEFINITION = eINSTANCE.getTitleSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_SCHEMA_DEFINITION__TITLE = eINSTANCE.getTitleSchemaDefinition_Title();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ItemsSchemaDefinitionImpl <em>Items Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ItemsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getItemsSchemaDefinition()
		 * @generated
		 */
		EClass ITEMS_SCHEMA_DEFINITION = eINSTANCE.getItemsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Items Any Of1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1 = eINSTANCE.getItemsSchemaDefinition_ItemsAnyOf1();

		/**
		 * The meta object literal for the '<em><b>Items Any Of2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2 = eINSTANCE.getItemsSchemaDefinition_ItemsAnyOf2();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DefaultSchemaDefinitionImpl <em>Default Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DefaultSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDefaultSchemaDefinition()
		 * @generated
		 */
		EClass DEFAULT_SCHEMA_DEFINITION = eINSTANCE.getDefaultSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_SCHEMA_DEFINITION__DEFAULT = eINSTANCE.getDefaultSchemaDefinition_Default();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ThenSchemaDefinitionImpl <em>Then Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ThenSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getThenSchemaDefinition()
		 * @generated
		 */
		EClass THEN_SCHEMA_DEFINITION = eINSTANCE.getThenSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEN_SCHEMA_DEFINITION__THEN = eINSTANCE.getThenSchemaDefinition_Then();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinLengthSchemaDefinitionImpl <em>Min Length Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinLengthSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinLengthSchemaDefinition()
		 * @generated
		 */
		EClass MIN_LENGTH_SCHEMA_DEFINITION = eINSTANCE.getMinLengthSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH = eINSTANCE.getMinLengthSchemaDefinition_MinLength();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DefinitionsSchemaDefinitionImpl <em>Definitions Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DefinitionsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDefinitionsSchemaDefinition()
		 * @generated
		 */
		EClass DEFINITIONS_SCHEMA_DEFINITION = eINSTANCE.getDefinitionsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Key Schema Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS = eINSTANCE
				.getDefinitionsSchemaDefinition_KeySchemaPairs();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinItemsSchemaDefinitionImpl <em>Min Items Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinItemsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinItemsSchemaDefinition()
		 * @generated
		 */
		EClass MIN_ITEMS_SCHEMA_DEFINITION = eINSTANCE.getMinItemsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS = eINSTANCE.getMinItemsSchemaDefinition_MinItems();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.OneOfSchemaDefinitionImpl <em>One Of Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.OneOfSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getOneOfSchemaDefinition()
		 * @generated
		 */
		EClass ONE_OF_SCHEMA_DEFINITION = eINSTANCE.getOneOfSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF_SCHEMA_DEFINITION__ONE_OF = eINSTANCE.getOneOfSchemaDefinition_OneOf();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaArrayImpl <em>Schema Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaArrayImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaArray()
		 * @generated
		 */
		EClass SCHEMA_ARRAY = eINSTANCE.getSchemaArray();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ARRAY__ITEMS = eINSTANCE.getSchemaArray_Items();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxPropertiesSchemaDefinitionImpl <em>Max Properties Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxPropertiesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaxPropertiesSchemaDefinition()
		 * @generated
		 */
		EClass MAX_PROPERTIES_SCHEMA_DEFINITION = eINSTANCE.getMaxPropertiesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Max Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES = eINSTANCE
				.getMaxPropertiesSchemaDefinition_MaxProperties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NullValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinimumSchemaDefinitionImpl <em>Minimum Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinimumSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinimumSchemaDefinition()
		 * @generated
		 */
		EClass MINIMUM_SCHEMA_DEFINITION = eINSTANCE.getMinimumSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUM_SCHEMA_DEFINITION__MINIMUM = eINSTANCE.getMinimumSchemaDefinition_Minimum();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.StringValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonDocumentImpl <em>Json Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonDocumentImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getJsonDocument()
		 * @generated
		 */
		EClass JSON_DOCUMENT = eINSTANCE.getJsonDocument();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_DOCUMENT__VALUE = eINSTANCE.getJsonDocument_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxItemsSchemaDefinitionImpl <em>Max Items Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxItemsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaxItemsSchemaDefinition()
		 * @generated
		 */
		EClass MAX_ITEMS_SCHEMA_DEFINITION = eINSTANCE.getMaxItemsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS = eINSTANCE.getMaxItemsSchemaDefinition_MaxItems();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.FormatSchemaDefinitionImpl <em>Format Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.FormatSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getFormatSchemaDefinition()
		 * @generated
		 */
		EClass FORMAT_SCHEMA_DEFINITION = eINSTANCE.getFormatSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT_SCHEMA_DEFINITION__FORMAT = eINSTANCE.getFormatSchemaDefinition_Format();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ReadOnlySchemaDefinitionImpl <em>Read Only Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ReadOnlySchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getReadOnlySchemaDefinition()
		 * @generated
		 */
		EClass READ_ONLY_SCHEMA_DEFINITION = eINSTANCE.getReadOnlySchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_ONLY_SCHEMA_DEFINITION__READ_ONLY = eINSTANCE.getReadOnlySchemaDefinition_ReadOnly();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectValueImpl <em>Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ObjectValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getObjectValue()
		 * @generated
		 */
		EClass OBJECT_VALUE = eINSTANCE.getObjectValue();

		/**
		 * The meta object literal for the '<em><b>Keyvaluepair</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VALUE__KEYVALUEPAIR = eINSTANCE.getObjectValue_Keyvaluepair();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.TypeSchemaDefinitionImpl <em>Type Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.TypeSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getTypeSchemaDefinition()
		 * @generated
		 */
		EClass TYPE_SCHEMA_DEFINITION = eINSTANCE.getTypeSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Any Of1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1 = eINSTANCE.getTypeSchemaDefinition_TypeAnyOf1();

		/**
		 * The meta object literal for the '<em><b>Types Any Of2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2 = eINSTANCE.getTypeSchemaDefinition_TypesAnyOf2();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalPropertiesSchemaDefinitionImpl <em>Additional Properties Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalPropertiesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAdditionalPropertiesSchemaDefinition()
		 * @generated
		 */
		EClass ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION = eINSTANCE.getAdditionalPropertiesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES = eINSTANCE
				.getAdditionalPropertiesSchemaDefinition_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ElseSchemaDefinitionImpl <em>Else Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ElseSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getElseSchemaDefinition()
		 * @generated
		 */
		EClass ELSE_SCHEMA_DEFINITION = eINSTANCE.getElseSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_SCHEMA_DEFINITION__ELSE = eINSTANCE.getElseSchemaDefinition_Else();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.IdSchemaDefinitionImpl <em>Id Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.IdSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getIdSchemaDefinition()
		 * @generated
		 */
		EClass ID_SCHEMA_DEFINITION = eINSTANCE.getIdSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_SCHEMA_DEFINITION__ID = eINSTANCE.getIdSchemaDefinition_Id();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ConstSchemaDefinitionImpl <em>Const Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ConstSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getConstSchemaDefinition()
		 * @generated
		 */
		EClass CONST_SCHEMA_DEFINITION = eINSTANCE.getConstSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONST_SCHEMA_DEFINITION__CONST = eINSTANCE.getConstSchemaDefinition_Const();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DependenciesSchemaDefinitionImpl <em>Dependencies Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DependenciesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDependenciesSchemaDefinition()
		 * @generated
		 */
		EClass DEPENDENCIES_SCHEMA_DEFINITION = eINSTANCE.getDependenciesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES_SCHEMA_DEFINITION__PROPERTIES = eINSTANCE.getDependenciesSchemaDefinition_Properties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NumberValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.RequiredSchemaDefinitionImpl <em>Required Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.RequiredSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getRequiredSchemaDefinition()
		 * @generated
		 */
		EClass REQUIRED_SCHEMA_DEFINITION = eINSTANCE.getRequiredSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_SCHEMA_DEFINITION__REQUIRED = eINSTANCE.getRequiredSchemaDefinition_Required();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DescriptionSchemaDefinitionImpl <em>Description Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.DescriptionSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getDescriptionSchemaDefinition()
		 * @generated
		 */
		EClass DESCRIPTION_SCHEMA_DEFINITION = eINSTANCE.getDescriptionSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_SCHEMA_DEFINITION__DESCRIPTION = eINSTANCE.getDescriptionSchemaDefinition_Description();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinPropertiesSchemaDefinitionImpl <em>Min Properties Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MinPropertiesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMinPropertiesSchemaDefinition()
		 * @generated
		 */
		EClass MIN_PROPERTIES_SCHEMA_DEFINITION = eINSTANCE.getMinPropertiesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Min Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES = eINSTANCE
				.getMinPropertiesSchemaDefinition_MinProperties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternPropertiesSchemaDefinitionImpl <em>Pattern Properties Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternPropertiesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPatternPropertiesSchemaDefinition()
		 * @generated
		 */
		EClass PATTERN_PROPERTIES_SCHEMA_DEFINITION = eINSTANCE.getPatternPropertiesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Key Schema Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS = eINSTANCE
				.getPatternPropertiesSchemaDefinition_KeySchemaPairs();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalItemsSchemaDefinitionImpl <em>Additional Items Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalItemsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAdditionalItemsSchemaDefinition()
		 * @generated
		 */
		EClass ADDITIONAL_ITEMS_SCHEMA_DEFINITION = eINSTANCE.getAdditionalItemsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Additional Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS = eINSTANCE
				.getAdditionalItemsSchemaDefinition_AdditionalItems();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.KeyValuePairImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExamplesSchemaDefinitionImpl <em>Examples Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ExamplesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getExamplesSchemaDefinition()
		 * @generated
		 */
		EClass EXAMPLES_SCHEMA_DEFINITION = eINSTANCE.getExamplesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLES_SCHEMA_DEFINITION__EXAMPLES = eINSTANCE.getExamplesSchemaDefinition_Examples();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.IfSchemaDefinitionImpl <em>If Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.IfSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getIfSchemaDefinition()
		 * @generated
		 */
		EClass IF_SCHEMA_DEFINITION = eINSTANCE.getIfSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_SCHEMA_DEFINITION__IF = eINSTANCE.getIfSchemaDefinition_If();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AllOfSchemaDefinitionImpl <em>All Of Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.AllOfSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getAllOfSchemaDefinition()
		 * @generated
		 */
		EClass ALL_OF_SCHEMA_DEFINITION = eINSTANCE.getAllOfSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>All Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_OF_SCHEMA_DEFINITION__ALL_OF = eINSTANCE.getAllOfSchemaDefinition_AllOf();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentEncodingSchemaDefinitionImpl <em>Content Encoding Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentEncodingSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getContentEncodingSchemaDefinition()
		 * @generated
		 */
		EClass CONTENT_ENCODING_SCHEMA_DEFINITION = eINSTANCE.getContentEncodingSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Content Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING = eINSTANCE
				.getContentEncodingSchemaDefinition_ContentEncoding();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MultipleOfSchemaDefinitionImpl <em>Multiple Of Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MultipleOfSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMultipleOfSchemaDefinition()
		 * @generated
		 */
		EClass MULTIPLE_OF_SCHEMA_DEFINITION = eINSTANCE.getMultipleOfSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Multiple Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_OF_SCHEMA_DEFINITION__MULTIPLE_OF = eINSTANCE.getMultipleOfSchemaDefinition_MultipleOf();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternSchemaDefinitionImpl <em>Pattern Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PatternSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPatternSchemaDefinition()
		 * @generated
		 */
		EClass PATTERN_SCHEMA_DEFINITION = eINSTANCE.getPatternSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_SCHEMA_DEFINITION__PATTERN = eINSTANCE.getPatternSchemaDefinition_Pattern();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.KeywordDefinitionImpl <em>Keyword Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.KeywordDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getKeywordDefinition()
		 * @generated
		 */
		EClass KEYWORD_DEFINITION = eINSTANCE.getKeywordDefinition();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContainsSchemaDefinitionImpl <em>Contains Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ContainsSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getContainsSchemaDefinition()
		 * @generated
		 */
		EClass CONTAINS_SCHEMA_DEFINITION = eINSTANCE.getContainsSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS_SCHEMA_DEFINITION__CONTAINS = eINSTANCE.getContainsSchemaDefinition_Contains();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NotSchemaDefinitionImpl <em>Not Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NotSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNotSchemaDefinition()
		 * @generated
		 */
		EClass NOT_SCHEMA_DEFINITION = eINSTANCE.getNotSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_SCHEMA_DEFINITION__NOT = eINSTANCE.getNotSchemaDefinition_Not();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMaximumSchemaDefinitionImpl <em>Exclusive Maximum Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMaximumSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getExclusiveMaximumSchemaDefinition()
		 * @generated
		 */
		EClass EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION = eINSTANCE.getExclusiveMaximumSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Exclusive Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUSIVE_MAXIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MAXIMUM = eINSTANCE
				.getExclusiveMaximumSchemaDefinition_ExclusiveMaximum();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxLengthSchemaDefinitionImpl <em>Max Length Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxLengthSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getMaxLengthSchemaDefinition()
		 * @generated
		 */
		EClass MAX_LENGTH_SCHEMA_DEFINITION = eINSTANCE.getMaxLengthSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH = eINSTANCE.getMaxLengthSchemaDefinition_MaxLength();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.RefSchemaDefinitionImpl <em>Ref Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.RefSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getRefSchemaDefinition()
		 * @generated
		 */
		EClass REF_SCHEMA_DEFINITION = eINSTANCE.getRefSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_SCHEMA_DEFINITION__REF = eINSTANCE.getRefSchemaDefinition_Ref();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonSchemaImpl <em>Json Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonSchemaImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getJsonSchema()
		 * @generated
		 */
		EClass JSON_SCHEMA = eINSTANCE.getJsonSchema();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_SCHEMA__SCHEMA = eINSTANCE.getJsonSchema_Schema();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.KeySchemaPairImpl <em>Key Schema Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.KeySchemaPairImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getKeySchemaPair()
		 * @generated
		 */
		EClass KEY_SCHEMA_PAIR = eINSTANCE.getKeySchemaPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_SCHEMA_PAIR__KEY = eINSTANCE.getKeySchemaPair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_SCHEMA_PAIR__VALUE = eINSTANCE.getKeySchemaPair_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentMediaTypeSchemaDefinitionImpl <em>Content Media Type Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentMediaTypeSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getContentMediaTypeSchemaDefinition()
		 * @generated
		 */
		EClass CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION = eINSTANCE.getContentMediaTypeSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Content Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE = eINSTANCE
				.getContentMediaTypeSchemaDefinition_ContentMediaType();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMinimumSchemaDefinitionImpl <em>Exclusive Minimum Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMinimumSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getExclusiveMinimumSchemaDefinition()
		 * @generated
		 */
		EClass EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION = eINSTANCE.getExclusiveMinimumSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Exclusive Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM = eINSTANCE
				.getExclusiveMinimumSchemaDefinition_ExclusiveMinimum();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaSchemaDefinitionImpl <em>Schema Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaSchemaDefinition()
		 * @generated
		 */
		EClass SCHEMA_SCHEMA_DEFINITION = eINSTANCE.getSchemaSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_SCHEMA_DEFINITION__SCHEMA = eINSTANCE.getSchemaSchemaDefinition_Schema();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertiesSchemaDefinitionImpl <em>Properties Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertiesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPropertiesSchemaDefinition()
		 * @generated
		 */
		EClass PROPERTIES_SCHEMA_DEFINITION = eINSTANCE.getPropertiesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Key Schema Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS = eINSTANCE
				.getPropertiesSchemaDefinition_KeySchemaPairs();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertyNamesSchemaDefinitionImpl <em>Property Names Schema Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertyNamesSchemaDefinitionImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getPropertyNamesSchemaDefinition()
		 * @generated
		 */
		EClass PROPERTY_NAMES_SCHEMA_DEFINITION = eINSTANCE.getPropertyNamesSchemaDefinition();

		/**
		 * The meta object literal for the '<em><b>Property Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES = eINSTANCE
				.getPropertyNamesSchemaDefinition_PropertyNames();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ArrayValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__VALUE = eINSTANCE.getArrayValue_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.ValueImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.TypesAnyOf2Impl <em>Types Any Of2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.TypesAnyOf2Impl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getTypesAnyOf2()
		 * @generated
		 */
		EClass TYPES_ANY_OF2 = eINSTANCE.getTypesAnyOf2();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_ANY_OF2__ITEMS = eINSTANCE.getTypesAnyOf2_Items();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.BooleanSchemaImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getBooleanSchema()
		 * @generated
		 */
		EClass BOOLEAN_SCHEMA = eINSTANCE.getBooleanSchema();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_SCHEMA__VALUE = eINSTANCE.getBooleanSchema_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerImpl <em>Non Negative Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNonNegativeInteger()
		 * @generated
		 */
		EClass NON_NEGATIVE_INTEGER = eINSTANCE.getNonNegativeInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_NEGATIVE_INTEGER__VALUE = eINSTANCE.getNonNegativeInteger_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerDefault0Impl <em>Non Negative Integer Default0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.NonNegativeIntegerDefault0Impl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getNonNegativeIntegerDefault0()
		 * @generated
		 */
		EClass NON_NEGATIVE_INTEGER_DEFAULT0 = eINSTANCE.getNonNegativeIntegerDefault0();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_NEGATIVE_INTEGER_DEFAULT0__VALUE = eINSTANCE.getNonNegativeIntegerDefault0_Value();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectAdditionalPropertiesImpl <em>Schema Object Additional Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectAdditionalPropertiesImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectAdditionalProperties()
		 * @generated
		 */
		EClass SCHEMA_OBJECT_ADDITIONAL_PROPERTIES = eINSTANCE.getSchemaObjectAdditionalProperties();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_OBJECT_ADDITIONAL_PROPERTIES__KEY = eINSTANCE.getSchemaObjectAdditionalProperties_Key();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_OBJECT_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = eINSTANCE
				.getSchemaObjectAdditionalProperties_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesPropertiesImpl <em>Schema Object Dependencies Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesPropertiesImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesProperties()
		 * @generated
		 */
		EClass SCHEMA_OBJECT_DEPENDENCIES_PROPERTIES = eINSTANCE.getSchemaObjectDependenciesProperties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesImpl <em>Schema Object Dependencies Additional Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalProperties()
		 * @generated
		 */
		EClass SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES = eINSTANCE
				.getSchemaObjectDependenciesAdditionalProperties();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__KEY = eINSTANCE
				.getSchemaObjectDependenciesAdditionalProperties_Key();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = eINSTANCE
				.getSchemaObjectDependenciesAdditionalProperties_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl <em>Schema Object Dependencies Additional Properties Any Of1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalPropertiesAnyOf1()
		 * @generated
		 */
		EClass SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1 = eINSTANCE
				.getSchemaObjectDependenciesAdditionalPropertiesAnyOf1();

		/**
		 * The meta object literal for the '<em><b>Any Of1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1 = eINSTANCE
				.getSchemaObjectDependenciesAdditionalPropertiesAnyOf1_AnyOf1();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl <em>Schema Object Dependencies Additional Properties Any Of2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalPropertiesAnyOf2()
		 * @generated
		 */
		EClass SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2 = eINSTANCE
				.getSchemaObjectDependenciesAdditionalPropertiesAnyOf2();

		/**
		 * The meta object literal for the '<em><b>Any Of2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2 = eINSTANCE
				.getSchemaObjectDependenciesAdditionalPropertiesAnyOf2_AnyOf2();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOfImpl <em>Schema Object Dependencies Additional Properties Any Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOfImpl
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSchemaObjectDependenciesAdditionalPropertiesAnyOf()
		 * @generated
		 */
		EClass SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF = eINSTANCE
				.getSchemaObjectDependenciesAdditionalPropertiesAnyOf();

		/**
		 * The meta object literal for the '{@link jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes <em>Simple Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes
		 * @see jsonMetaschemaMM.jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl#getSimpleTypes()
		 * @generated
		 */
		EEnum SIMPLE_TYPES = eINSTANCE.getSimpleTypes();

	}

} //JsonMetaschemaMMPackage
