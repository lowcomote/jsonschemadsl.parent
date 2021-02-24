/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition#getMaxItems <em>Max Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaxItemsSchemaDefinition()
 * @model
 * @generated
 */
public interface MaxItemsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' containment reference.
	 * @see #setMaxItems(NonNegativeInteger)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaxItemsSchemaDefinition_MaxItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNegativeInteger getMaxItems();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxItemsSchemaDefinition#getMaxItems <em>Max Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' containment reference.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(NonNegativeInteger value);

} // MaxItemsSchemaDefinition
