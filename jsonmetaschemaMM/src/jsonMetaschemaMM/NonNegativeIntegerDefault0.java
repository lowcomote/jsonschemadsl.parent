/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Negative Integer Default0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.NonNegativeIntegerDefault0#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getNonNegativeIntegerDefault0()
 * @model
 * @generated
 */
public interface NonNegativeIntegerDefault0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getNonNegativeIntegerDefault0_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.NonNegativeIntegerDefault0#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // NonNegativeIntegerDefault0
