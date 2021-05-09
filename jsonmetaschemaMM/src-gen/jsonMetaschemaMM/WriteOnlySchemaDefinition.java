/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Only Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.WriteOnlySchemaDefinition#isWriteOnly <em>Write Only</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getWriteOnlySchemaDefinition()
 * @model
 * @generated
 */
public interface WriteOnlySchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(boolean)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getWriteOnlySchemaDefinition_WriteOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.WriteOnlySchemaDefinition#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

} // WriteOnlySchemaDefinition
