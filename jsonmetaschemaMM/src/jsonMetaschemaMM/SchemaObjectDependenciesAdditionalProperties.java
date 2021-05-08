/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Object Dependencies Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getKey <em>Key</em>}</li>
 *   <li>{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaObjectDependenciesAdditionalProperties()
 * @model
 * @generated
 */
public interface SchemaObjectDependenciesAdditionalProperties extends SchemaObjectDependenciesProperties {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaObjectDependenciesAdditionalProperties_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getKey <em>Key</em>}' attribute.
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
	 * @see #setAdditionalProperties(SchemaObjectDependenciesAdditionalPropertiesAnyOf)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaObjectDependenciesAdditionalProperties_AdditionalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SchemaObjectDependenciesAdditionalPropertiesAnyOf getAdditionalProperties();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(SchemaObjectDependenciesAdditionalPropertiesAnyOf value);

} // SchemaObjectDependenciesAdditionalProperties
