/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Encoding Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ContentEncodingSchemaDefinition#getContentEncoding <em>Content Encoding</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getContentEncodingSchemaDefinition()
 * @model
 * @generated
 */
public interface ContentEncodingSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Encoding</em>' attribute.
	 * @see #setContentEncoding(String)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getContentEncodingSchemaDefinition_ContentEncoding()
	 * @model required="true"
	 * @generated
	 */
	String getContentEncoding();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.ContentEncodingSchemaDefinition#getContentEncoding <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Encoding</em>' attribute.
	 * @see #getContentEncoding()
	 * @generated
	 */
	void setContentEncoding(String value);

} // ContentEncodingSchemaDefinition
