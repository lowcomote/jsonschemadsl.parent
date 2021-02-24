/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Of Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition#getAllOf <em>All Of</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getAllOfSchemaDefinition()
 * @model
 * @generated
 */
public interface AllOfSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>All Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' containment reference.
	 * @see #setAllOf(SchemaArray)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getAllOfSchemaDefinition_AllOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchemaArray getAllOf();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition#getAllOf <em>All Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Of</em>' containment reference.
	 * @see #getAllOf()
	 * @generated
	 */
	void setAllOf(SchemaArray value);

} // AllOfSchemaDefinition
