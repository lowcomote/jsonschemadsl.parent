/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.Dependency#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference.
	 * @see #setDependency(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getDependency_Dependency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Sets the value of the '{@link relatedSchemas.Dependency#getDependency <em>Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' containment reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(EClass value);

} // Dependency
