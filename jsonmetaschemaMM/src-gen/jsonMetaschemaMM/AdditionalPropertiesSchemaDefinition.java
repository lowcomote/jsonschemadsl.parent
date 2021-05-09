/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getAdditionalPropertiesSchemaDefinition()
 * @model
 * @generated
 */
public interface AdditionalPropertiesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(Schema)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getAdditionalPropertiesSchemaDefinition_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getAdditionalProperties();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(Schema value);

} // AdditionalPropertiesSchemaDefinition
