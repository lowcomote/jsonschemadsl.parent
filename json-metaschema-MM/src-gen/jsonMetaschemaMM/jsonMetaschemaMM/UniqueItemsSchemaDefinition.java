/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition#isUniqueItems <em>Unique Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getUniqueItemsSchemaDefinition()
 * @model
 * @generated
 */
public interface UniqueItemsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Items</em>' attribute.
	 * @see #setUniqueItems(boolean)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getUniqueItemsSchemaDefinition_UniqueItems()
	 * @model required="true"
	 * @generated
	 */
	boolean isUniqueItems();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.UniqueItemsSchemaDefinition#isUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #isUniqueItems()
	 * @generated
	 */
	void setUniqueItems(boolean value);

} // UniqueItemsSchemaDefinition
