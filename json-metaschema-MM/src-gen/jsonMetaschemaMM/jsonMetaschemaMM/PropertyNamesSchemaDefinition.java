/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Names Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition#getPropertyNames <em>Property Names</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getPropertyNamesSchemaDefinition()
 * @model
 * @generated
 */
public interface PropertyNamesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Property Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Names</em>' containment reference.
	 * @see #setPropertyNames(Schema)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getPropertyNamesSchemaDefinition_PropertyNames()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getPropertyNames();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition#getPropertyNames <em>Property Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Names</em>' containment reference.
	 * @see #getPropertyNames()
	 * @generated
	 */
	void setPropertyNames(Schema value);

} // PropertyNamesSchemaDefinition
