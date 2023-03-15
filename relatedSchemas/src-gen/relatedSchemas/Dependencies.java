/**
 */
package relatedSchemas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.Dependencies#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getDependencies()
 * @model
 * @generated
 */
public interface Dependencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link relatedSchemas.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see relatedSchemas.RelatedSchemasPackage#getDependencies_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

} // Dependencies
