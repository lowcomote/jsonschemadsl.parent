/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getConstSchemaDefinition()
 * @model
 * @generated
 */
public interface ConstSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' containment reference.
	 * @see #setConst(JsonDocument)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getConstSchemaDefinition_Const()
	 * @model containment="true"
	 * @generated
	 */
	JsonDocument getConst();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.ConstSchemaDefinition#getConst <em>Const</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' containment reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(JsonDocument value);

} // ConstSchemaDefinition
