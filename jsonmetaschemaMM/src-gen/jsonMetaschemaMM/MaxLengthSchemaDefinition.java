/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Length Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.MaxLengthSchemaDefinition#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaxLengthSchemaDefinition()
 * @model
 * @generated
 */
public interface MaxLengthSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(NonNegativeInteger)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaxLengthSchemaDefinition_MaxLength()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNegativeInteger getMaxLength();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.MaxLengthSchemaDefinition#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(NonNegativeInteger value);

} // MaxLengthSchemaDefinition
