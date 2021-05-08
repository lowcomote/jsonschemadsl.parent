/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Only Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ReadOnlySchemaDefinition#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getReadOnlySchemaDefinition()
 * @model
 * @generated
 */
public interface ReadOnlySchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getReadOnlySchemaDefinition_ReadOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.ReadOnlySchemaDefinition#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

} // ReadOnlySchemaDefinition
