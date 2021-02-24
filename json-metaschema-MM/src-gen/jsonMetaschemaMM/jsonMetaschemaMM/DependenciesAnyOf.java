/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies Any Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesAnyOf#getDependenciesAnyOf2 <em>Dependencies Any Of2</em>}</li>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesAnyOf#getDependenciesAnyOf1 <em>Dependencies Any Of1</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesAnyOf()
 * @model
 * @generated
 */
public interface DependenciesAnyOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependencies Any Of2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Any Of2</em>' containment reference.
	 * @see #setDependenciesAnyOf2(KeyStringArrayPair)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesAnyOf_DependenciesAnyOf2()
	 * @model containment="true"
	 * @generated
	 */
	KeyStringArrayPair getDependenciesAnyOf2();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesAnyOf#getDependenciesAnyOf2 <em>Dependencies Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Any Of2</em>' containment reference.
	 * @see #getDependenciesAnyOf2()
	 * @generated
	 */
	void setDependenciesAnyOf2(KeyStringArrayPair value);

	/**
	 * Returns the value of the '<em><b>Dependencies Any Of1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Any Of1</em>' containment reference.
	 * @see #setDependenciesAnyOf1(KeySchemaPair)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesAnyOf_DependenciesAnyOf1()
	 * @model containment="true"
	 * @generated
	 */
	KeySchemaPair getDependenciesAnyOf1();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesAnyOf#getDependenciesAnyOf1 <em>Dependencies Any Of1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Any Of1</em>' containment reference.
	 * @see #getDependenciesAnyOf1()
	 * @generated
	 */
	void setDependenciesAnyOf1(KeySchemaPair value);

} // DependenciesAnyOf
