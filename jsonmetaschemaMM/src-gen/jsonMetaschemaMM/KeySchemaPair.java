/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Schema Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.KeySchemaPair#getKey <em>Key</em>}</li>
 *   <li>{@link jsonMetaschemaMM.KeySchemaPair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getKeySchemaPair()
 * @model
 * @generated
 */
public interface KeySchemaPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getKeySchemaPair_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.KeySchemaPair#getKey <em>Key</em>}' attribute.
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
	 * @see #setValue(Schema)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getKeySchemaPair_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getValue();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.KeySchemaPair#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Schema value);

} // KeySchemaPair
