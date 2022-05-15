/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.Contains#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getContains()
 * @model
 * @generated
 */
public interface Contains extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getContains_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EClass getContains();

	/**
	 * Sets the value of the '{@link relatedSchemas.Contains#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(EClass value);

} // Contains
