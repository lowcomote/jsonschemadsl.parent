/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.CommentSchemaDefinition#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getCommentSchemaDefinition()
 * @model
 * @generated
 */
public interface CommentSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getCommentSchemaDefinition_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.CommentSchemaDefinition#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // CommentSchemaDefinition
