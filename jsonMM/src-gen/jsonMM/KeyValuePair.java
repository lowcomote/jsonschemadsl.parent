/**
 */
package jsonMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMM.KeyValuePair#getKey <em>Key</em>}</li>
 *   <li>{@link jsonMM.KeyValuePair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMM.JsonMMPackage#getKeyValuePair()
 * @model
 * @generated
 */
public interface KeyValuePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see jsonMM.JsonMMPackage#getKeyValuePair_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link jsonMM.KeyValuePair#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see jsonMM.JsonMMPackage#getKeyValuePair_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link jsonMM.KeyValuePair#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" objUnique="false" objRequired="true" objOrdered="false"
	 * @generated
	 */
	boolean semanticEquals(Object obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String toString();

} // KeyValuePair
