/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.DefinitionsSchemaDefinition#getKeySchemaPairs <em>Key Schema Pairs</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getDefinitionsSchemaDefinition()
 * @model
 * @generated
 */
public interface DefinitionsSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Key Schema Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.KeySchemaPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Schema Pairs</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getDefinitionsSchemaDefinition_KeySchemaPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeySchemaPair> getKeySchemaPairs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyUnique="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	Schema findSchemaByKey(String key);

} // DefinitionsSchemaDefinition
