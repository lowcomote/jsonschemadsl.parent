/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.TypeSchemaDefinition#getAnyOf <em>Any Of</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeSchemaDefinition()
 * @model
 * @generated
 */
public interface TypeSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Any Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Of</em>' containment reference.
	 * @see #setAnyOf(TypeAnyOf)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeSchemaDefinition_AnyOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeAnyOf getAnyOf();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.TypeSchemaDefinition#getAnyOf <em>Any Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Of</em>' containment reference.
	 * @see #getAnyOf()
	 * @generated
	 */
	void setAnyOf(TypeAnyOf value);

} // TypeSchemaDefinition
