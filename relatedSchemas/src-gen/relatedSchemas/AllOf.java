/**
 */
package relatedSchemas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.AllOf#getAllOfs <em>All Ofs</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getAllOf()
 * @model
 * @generated
 */
public interface AllOf extends EObject {
	/**
	 * Returns the value of the '<em><b>All Ofs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Ofs</em>' reference list.
	 * @see relatedSchemas.RelatedSchemasPackage#getAllOf_AllOfs()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getAllOfs();

} // AllOf
