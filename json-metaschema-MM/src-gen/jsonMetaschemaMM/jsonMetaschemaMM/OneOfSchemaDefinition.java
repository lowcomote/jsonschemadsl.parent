/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Of Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition#getOneOf <em>One Of</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getOneOfSchemaDefinition()
 * @model
 * @generated
 */
public interface OneOfSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' containment reference.
	 * @see #setOneOf(SchemaArray)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getOneOfSchemaDefinition_OneOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchemaArray getOneOf();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.OneOfSchemaDefinition#getOneOf <em>One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Of</em>' containment reference.
	 * @see #getOneOf()
	 * @generated
	 */
	void setOneOf(SchemaArray value);

} // OneOfSchemaDefinition
