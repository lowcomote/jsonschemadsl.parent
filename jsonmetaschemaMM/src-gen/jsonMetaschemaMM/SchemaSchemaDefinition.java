/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.SchemaSchemaDefinition#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaSchemaDefinition()
 * @model
 * @generated
 */
public interface SchemaSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaSchemaDefinition_Schema()
	 * @model required="true"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.SchemaSchemaDefinition#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isFormatUri();

} // SchemaSchemaDefinition
