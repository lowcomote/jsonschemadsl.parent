/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.IfSchemaDefinition#getIf <em>If</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getIfSchemaDefinition()
 * @model
 * @generated
 */
public interface IfSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Schema)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getIfSchemaDefinition_If()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getIf();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.IfSchemaDefinition#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Schema value);

} // IfSchemaDefinition
