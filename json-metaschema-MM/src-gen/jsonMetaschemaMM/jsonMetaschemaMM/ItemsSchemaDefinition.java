/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf1 <em>Items Any Of1</em>}</li>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf2 <em>Items Any Of2</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getItemsSchemaDefinition()
 * @model
 * @generated
 */
public interface ItemsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Items Any Of1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items Any Of1</em>' containment reference.
	 * @see #setItemsAnyOf1(Schema)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getItemsSchemaDefinition_ItemsAnyOf1()
	 * @model containment="true"
	 * @generated
	 */
	Schema getItemsAnyOf1();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf1 <em>Items Any Of1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items Any Of1</em>' containment reference.
	 * @see #getItemsAnyOf1()
	 * @generated
	 */
	void setItemsAnyOf1(Schema value);

	/**
	 * Returns the value of the '<em><b>Items Any Of2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items Any Of2</em>' containment reference.
	 * @see #setItemsAnyOf2(SchemaArray)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getItemsSchemaDefinition_ItemsAnyOf2()
	 * @model containment="true"
	 * @generated
	 */
	SchemaArray getItemsAnyOf2();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.ItemsSchemaDefinition#getItemsAnyOf2 <em>Items Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items Any Of2</em>' containment reference.
	 * @see #getItemsAnyOf2()
	 * @generated
	 */
	void setItemsAnyOf2(SchemaArray value);

} // ItemsSchemaDefinition
