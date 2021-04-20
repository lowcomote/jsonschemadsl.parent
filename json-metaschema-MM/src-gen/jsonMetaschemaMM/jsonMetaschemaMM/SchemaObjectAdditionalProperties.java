/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Object Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getKey <em>Key</em>}</li>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaObjectAdditionalProperties()
 * @model
 * @generated
 */
public interface SchemaObjectAdditionalProperties extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaObjectAdditionalProperties_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(Schema)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaObjectAdditionalProperties_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getAdditionalProperties();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(Schema value);

} // SchemaObjectAdditionalProperties
