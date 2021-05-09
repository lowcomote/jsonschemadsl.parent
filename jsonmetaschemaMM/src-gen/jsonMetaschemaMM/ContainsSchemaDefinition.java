/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ContainsSchemaDefinition#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getContainsSchemaDefinition()
 * @model
 * @generated
 */
public interface ContainsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Schema)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getContainsSchemaDefinition_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getContains();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.ContainsSchemaDefinition#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Schema value);

} // ContainsSchemaDefinition
