/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.ConstEnum#getEnum <em>Enum</em>}</li>
 *   <li>{@link relatedSchemas.ConstEnum#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getConstEnum()
 * @model
 * @generated
 */
public interface ConstEnum extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference.
	 * @see #setEnum(relatedSchemas.Enum)
	 * @see relatedSchemas.RelatedSchemasPackage#getConstEnum_Enum()
	 * @model containment="true"
	 * @generated
	 */
	relatedSchemas.Enum getEnum();

	/**
	 * Sets the value of the '{@link relatedSchemas.ConstEnum#getEnum <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' containment reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(relatedSchemas.Enum value);

	/**
	 * Returns the value of the '<em><b>Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' containment reference.
	 * @see #setConst(Const)
	 * @see relatedSchemas.RelatedSchemasPackage#getConstEnum_Const()
	 * @model containment="true"
	 * @generated
	 */
	Const getConst();

	/**
	 * Sets the value of the '{@link relatedSchemas.ConstEnum#getConst <em>Const</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' containment reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(Const value);

} // ConstEnum
