/**
 */
package jsongrammarmm.jsongrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsongrammarmm.jsongrammar.JsonGrammar#getDetailedGrammar <em>Detailed Grammar</em>}</li>
 *   <li>{@link jsongrammarmm.jsongrammar.JsonGrammar#getNsURI <em>Ns URI</em>}</li>
 * </ul>
 *
 * @see jsongrammarmm.jsongrammar.JsongrammarPackage#getJsonGrammar()
 * @model
 * @generated
 */
public interface JsonGrammar extends EObject {
	/**
	 * Returns the value of the '<em><b>Detailed Grammar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Grammar</em>' containment reference.
	 * @see #setDetailedGrammar(DetailedGrammar)
	 * @see jsongrammarmm.jsongrammar.JsongrammarPackage#getJsonGrammar_DetailedGrammar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DetailedGrammar getDetailedGrammar();

	/**
	 * Sets the value of the '{@link jsongrammarmm.jsongrammar.JsonGrammar#getDetailedGrammar <em>Detailed Grammar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Grammar</em>' containment reference.
	 * @see #getDetailedGrammar()
	 * @generated
	 */
	void setDetailedGrammar(DetailedGrammar value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see jsongrammarmm.jsongrammar.JsongrammarPackage#getJsonGrammar_NsURI()
	 * @model
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link jsongrammarmm.jsongrammar.JsonGrammar#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

} // JsonGrammar
