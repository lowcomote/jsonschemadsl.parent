/**
 */
package jsonMetaschemaMM;

import jsonMM.JsonDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.DefaultSchemaDefinition#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getDefaultSchemaDefinition()
 * @model
 * @generated
 */
public interface DefaultSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(JsonDocument)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getDefaultSchemaDefinition_Default()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonDocument getDefault();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.DefaultSchemaDefinition#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(JsonDocument value);

} // DefaultSchemaDefinition
