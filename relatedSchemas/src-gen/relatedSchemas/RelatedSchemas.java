/**
 */
package relatedSchemas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Schemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.RelatedSchemas#getEnclosingschemas <em>Enclosingschemas</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getRelatedSchemas()
 * @model
 * @generated
 */
public interface RelatedSchemas extends EObject {
	/**
	 * Returns the value of the '<em><b>Enclosingschemas</b></em>' containment reference list.
	 * The list contents are of type {@link relatedSchemas.EnclosingSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosingschemas</em>' containment reference list.
	 * @see relatedSchemas.RelatedSchemasPackage#getRelatedSchemas_Enclosingschemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnclosingSchema> getEnclosingschemas();

} // RelatedSchemas
