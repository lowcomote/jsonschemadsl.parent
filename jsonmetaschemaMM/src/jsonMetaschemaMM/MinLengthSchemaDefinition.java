/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Length Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.MinLengthSchemaDefinition#getMinLength <em>Min Length</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinLengthSchemaDefinition()
 * @model
 * @generated
 */
public interface MinLengthSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' containment reference.
	 * @see #setMinLength(NonNegativeIntegerDefault0)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinLengthSchemaDefinition_MinLength()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNegativeIntegerDefault0 getMinLength();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.MinLengthSchemaDefinition#getMinLength <em>Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' containment reference.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(NonNegativeIntegerDefault0 value);

} // MinLengthSchemaDefinition
