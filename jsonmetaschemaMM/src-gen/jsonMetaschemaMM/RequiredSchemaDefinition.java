/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.RequiredSchemaDefinition#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getRequiredSchemaDefinition()
 * @model
 * @generated
 */
public interface RequiredSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(StringArray)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getRequiredSchemaDefinition_Required()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringArray getRequired();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.RequiredSchemaDefinition#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(StringArray value);

} // RequiredSchemaDefinition
