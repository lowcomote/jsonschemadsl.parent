/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getSchema()
 * @model abstract="true"
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" jsonPointerUnique="false" jsonPointerMany="true" currentIndexUnique="false" currentIndexRequired="true" currentIndexOrdered="false"
	 * @generated
	 */
	Schema findSchemaByJsonPointer(EList<String> jsonPointer, int currentIndex);

} // Schema
