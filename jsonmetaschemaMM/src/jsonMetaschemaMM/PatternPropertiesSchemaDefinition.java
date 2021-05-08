/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.PatternPropertiesSchemaDefinition#getKeySchemaPairs <em>Key Schema Pairs</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getPatternPropertiesSchemaDefinition()
 * @model
 * @generated
 */
public interface PatternPropertiesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Key Schema Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.KeySchemaPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Schema Pairs</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getPatternPropertiesSchemaDefinition_KeySchemaPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeySchemaPair> getKeySchemaPairs();

} // PatternPropertiesSchemaDefinition
