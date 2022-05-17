/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.IfThenElse#getIf <em>If</em>}</li>
 *   <li>{@link relatedSchemas.IfThenElse#getThen <em>Then</em>}</li>
 *   <li>{@link relatedSchemas.IfThenElse#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends EObject {
	/**
	 * Returns the value of the '<em><b>If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' reference.
	 * @see #setIf(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getIfThenElse_If()
	 * @model
	 * @generated
	 */
	EClass getIf();

	/**
	 * Sets the value of the '{@link relatedSchemas.IfThenElse#getIf <em>If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(EClass value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getIfThenElse_Then()
	 * @model
	 * @generated
	 */
	EClass getThen();

	/**
	 * Sets the value of the '{@link relatedSchemas.IfThenElse#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(EClass value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getIfThenElse_Else()
	 * @model
	 * @generated
	 */
	EClass getElse();

	/**
	 * Sets the value of the '{@link relatedSchemas.IfThenElse#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(EClass value);

} // IfThenElse
