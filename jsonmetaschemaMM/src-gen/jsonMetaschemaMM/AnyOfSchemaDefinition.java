/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Of Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.AnyOfSchemaDefinition#getAnyOf <em>Any Of</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getAnyOfSchemaDefinition()
 * @model
 * @generated
 */
public interface AnyOfSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Any Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Of</em>' containment reference.
	 * @see #setAnyOf(SchemaArray)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getAnyOfSchemaDefinition_AnyOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchemaArray getAnyOf();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.AnyOfSchemaDefinition#getAnyOf <em>Any Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Of</em>' containment reference.
	 * @see #getAnyOf()
	 * @generated
	 */
	void setAnyOf(SchemaArray value);

} // AnyOfSchemaDefinition
