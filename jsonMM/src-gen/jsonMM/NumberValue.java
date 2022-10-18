/**
 */
package jsonMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMM.NumberValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMM.JsonMMPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see jsonMM.JsonMMPackage#getNumberValue_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link jsonMM.NumberValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

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

} // NumberValue
