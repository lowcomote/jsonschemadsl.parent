/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ObjectSchema#getKeywordDefinition <em>Keyword Definition</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema()
 * @model
 * @generated
 */
public interface ObjectSchema extends Schema {
	/**
	 * Returns the value of the '<em><b>Keyword Definition</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.KeywordDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Definition</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getObjectSchema_KeywordDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeywordDefinition> getKeywordDefinition();

} // ObjectSchema
