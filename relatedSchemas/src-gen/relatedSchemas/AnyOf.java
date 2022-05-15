/**
 */
package relatedSchemas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.AnyOf#getAnyOfs <em>Any Ofs</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getAnyOf()
 * @model
 * @generated
 */
public interface AnyOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Any Ofs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Ofs</em>' containment reference list.
	 * @see relatedSchemas.RelatedSchemasPackage#getAnyOf_AnyOfs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EClass> getAnyOfs();

} // AnyOf
