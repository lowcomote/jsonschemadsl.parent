/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.SchemaArray#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaArray()
 * @model
 * @generated
 */
public interface SchemaArray extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchemaArray_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Schema> getItems();

} // SchemaArray
