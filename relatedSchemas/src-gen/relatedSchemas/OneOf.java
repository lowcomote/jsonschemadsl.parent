/**
 */
package relatedSchemas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.OneOf#getOneOfs <em>One Ofs</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getOneOf()
 * @model
 * @generated
 */
public interface OneOf extends EObject {
	/**
	 * Returns the value of the '<em><b>One Ofs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Ofs</em>' containment reference list.
	 * @see relatedSchemas.RelatedSchemasPackage#getOneOf_OneOfs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EClass> getOneOfs();

} // OneOf
