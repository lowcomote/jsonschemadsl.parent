/**
 */
package relatedSchemas;

import jsonMM.JsonDocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.Const#getConst <em>Const</em>}</li>
 *   <li>{@link relatedSchemas.Const#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getConst()
 * @model
 * @generated
 */
public interface Const extends EObject {
	/**
	 * Returns the value of the '<em><b>Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' reference.
	 * @see #setConst(JsonDocument)
	 * @see relatedSchemas.RelatedSchemasPackage#getConst_Const()
	 * @model required="true"
	 * @generated
	 */
	JsonDocument getConst();

	/**
	 * Sets the value of the '{@link relatedSchemas.Const#getConst <em>Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(JsonDocument value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see relatedSchemas.RelatedSchemasPackage#getConst_PropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link relatedSchemas.Const#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // Const
