/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getKeywordDefinition <em>Keyword Definition</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getAdditionalItems <em>Additional Items</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getItems <em>Items</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getAdditionalProperties <em>Additional Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getContains <em>Contains</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getProperties <em>Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getPatternProperties <em>Pattern Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getPropertyNames <em>Property Names</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getIf <em>If</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getThen <em>Then</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getElse <em>Else</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getAllOf <em>All Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getAnyOf <em>Any Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getOneOf <em>One Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getNot <em>Not</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getRef <em>Ref</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getType <em>Type</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getEnum <em>Enum</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getSchemaObjectAdditionalProperties <em>Schema Object Additional Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema()
 * @model
 * @generated
 */
public interface ObjectSchema extends Schema {
	/**
	 * Returns the value of the '<em><b>Keyword Definition</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.KeywordDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Definition</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_KeywordDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeywordDefinition> getKeywordDefinition();

	/**
	 * Returns the value of the '<em><b>Additional Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Items</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_AdditionalItems()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	AdditionalItemsSchemaDefinition getAdditionalItems();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Items()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ItemsSchemaDefinition getItems();

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_AdditionalProperties()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	AdditionalPropertiesSchemaDefinition getAdditionalProperties();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Contains()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ContainsSchemaDefinition getContains();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Properties()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	PropertiesSchemaDefinition getProperties();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Definitions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	DefinitionsSchemaDefinition getDefinitions();

	/**
	 * Returns the value of the '<em><b>Pattern Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_PatternProperties()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	PatternPropertiesSchemaDefinition getPatternProperties();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Dependencies()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	DependenciesSchemaDefinition getDependencies();

	/**
	 * Returns the value of the '<em><b>Property Names</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Names</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_PropertyNames()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	PropertyNamesSchemaDefinition getPropertyNames();

	/**
	 * Returns the value of the '<em><b>If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_If()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	IfSchemaDefinition getIf();

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Then()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ThenSchemaDefinition getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Else()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ElseSchemaDefinition getElse();

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_AllOf()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	AllOfSchemaDefinition getAllOf();

	/**
	 * Returns the value of the '<em><b>Any Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Of</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_AnyOf()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	AnyOfSchemaDefinition getAnyOf();

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_OneOf()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	OneOfSchemaDefinition getOneOf();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Not()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NotSchemaDefinition getNot();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Ref()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	RefSchemaDefinition getRef();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Type()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	TypeSchemaDefinition getType();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Enum()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EnumSchemaDefinition getEnum();

	/**
	 * Returns the value of the '<em><b>Schema Object Additional Properties</b></em>' reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.SchemaObjectAdditionalProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Object Additional Properties</em>' reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_SchemaObjectAdditionalProperties()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<SchemaObjectAdditionalProperties> getSchemaObjectAdditionalProperties();

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_MultipleOf()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true"
	 * @generated
	 */
	MultipleOfSchemaDefinition getMultipleOf();

	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Properties</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_MinProperties()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true"
	 * @generated
	 */
	MinPropertiesSchemaDefinition getMinProperties();

	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Properties</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_MaxProperties()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true"
	 * @generated
	 */
	MaxPropertiesSchemaDefinition getMaxProperties();

	/**
	 * Returns the value of the '<em><b>Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' reference.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_Const()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ConstSchemaDefinition getConst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyUnique="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	Schema findSchemaByKey(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" jsonPointerUnique="false" jsonPointerMany="true" currentIndexUnique="false" currentIndexRequired="true" currentIndexOrdered="false"
	 * @generated
	 */
	Schema findSchemaByJsonPointer(EList<String> jsonPointer, int currentIndex);

} // ObjectSchema
