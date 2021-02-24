/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition#getMinItems <em>Min Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinItemsSchemaDefinition()
 * @model
 * @generated
 */
public interface MinItemsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' containment reference.
	 * @see #setMinItems(NonNegativeIntegerDefault0)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinItemsSchemaDefinition_MinItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNegativeIntegerDefault0 getMinItems();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition#getMinItems <em>Min Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' containment reference.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(NonNegativeIntegerDefault0 value);

} // MinItemsSchemaDefinition
