/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Media Type Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ContentMediaTypeSchemaDefinition#getContentMediaType <em>Content Media Type</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getContentMediaTypeSchemaDefinition()
 * @model
 * @generated
 */
public interface ContentMediaTypeSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Content Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Media Type</em>' attribute.
	 * @see #setContentMediaType(String)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getContentMediaTypeSchemaDefinition_ContentMediaType()
	 * @model required="true"
	 * @generated
	 */
	String getContentMediaType();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.ContentMediaTypeSchemaDefinition#getContentMediaType <em>Content Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Media Type</em>' attribute.
	 * @see #getContentMediaType()
	 * @generated
	 */
	void setContentMediaType(String value);

} // ContentMediaTypeSchemaDefinition
