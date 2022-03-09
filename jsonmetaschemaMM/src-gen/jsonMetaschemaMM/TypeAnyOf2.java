/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Any Of2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.TypeAnyOf2#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeAnyOf2()
 * @model
 * @generated
 */
public interface TypeAnyOf2 extends TypeAnyOf {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link jsonMetaschemaMM.SimpleTypes}.
	 * The literals are from the enumeration {@link jsonMetaschemaMM.SimpleTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see jsonMetaschemaMM.SimpleTypes
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeAnyOf2_Items()
	 * @model required="true"
	 * @generated
	 */
	EList<SimpleTypes> getItems();

} // TypeAnyOf2
