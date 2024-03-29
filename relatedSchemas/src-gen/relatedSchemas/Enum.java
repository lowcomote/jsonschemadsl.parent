/**
 */
package relatedSchemas;

import jsonMM.JsonDocument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.Enum#getEnum <em>Enum</em>}</li>
 *   <li>{@link relatedSchemas.Enum#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference list.
	 * The list contents are of type {@link jsonMM.JsonDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference list.
	 * @see relatedSchemas.RelatedSchemasPackage#getEnum_Enum()
	 * @model required="true"
	 * @generated
	 */
	EList<JsonDocument> getEnum();

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnum_PropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link relatedSchemas.Enum#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // Enum
