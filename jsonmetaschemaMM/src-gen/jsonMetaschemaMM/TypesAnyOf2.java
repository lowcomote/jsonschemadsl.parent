/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Any Of2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.TypesAnyOf2#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypesAnyOf2()
 * @model
 * @generated
 */
public interface TypesAnyOf2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link jsonMetaschemaMM.SimpleTypes}.
	 * The literals are from the enumeration {@link jsonMetaschemaMM.SimpleTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see jsonMetaschemaMM.SimpleTypes
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypesAnyOf2_Items()
	 * @model required="true"
	 * @generated
	 */
	EList<SimpleTypes> getItems();

} // TypesAnyOf2
