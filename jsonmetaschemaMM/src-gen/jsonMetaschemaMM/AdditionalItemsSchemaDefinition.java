/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.AdditionalItemsSchemaDefinition#getAdditionalItems <em>Additional Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getAdditionalItemsSchemaDefinition()
 * @model
 * @generated
 */
public interface AdditionalItemsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Additional Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Items</em>' containment reference.
	 * @see #setAdditionalItems(Schema)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getAdditionalItemsSchemaDefinition_AdditionalItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getAdditionalItems();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.AdditionalItemsSchemaDefinition#getAdditionalItems <em>Additional Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Items</em>' containment reference.
	 * @see #getAdditionalItems()
	 * @generated
	 */
	void setAdditionalItems(Schema value);

} // AdditionalItemsSchemaDefinition
