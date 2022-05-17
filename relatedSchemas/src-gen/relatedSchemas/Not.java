/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.Not#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' reference.
	 * @see #setNot(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getNot_Not()
	 * @model required="true"
	 * @generated
	 */
	EClass getNot();

	/**
	 * Sets the value of the '{@link relatedSchemas.Not#getNot <em>Not</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(EClass value);

} // Not
