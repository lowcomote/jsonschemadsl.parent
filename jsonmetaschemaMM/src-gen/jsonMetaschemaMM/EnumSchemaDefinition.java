/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.EnumSchemaDefinition#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getEnumSchemaDefinition()
 * @model
 * @generated
 */
public interface EnumSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.JsonDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getEnumSchemaDefinition_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JsonDocument> getItems();

} // EnumSchemaDefinition
