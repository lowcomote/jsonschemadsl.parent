/**
 */
package jsonMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMM.NullValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMM.JsonMMPackage#getNullValue()
 * @model
 * @generated
 */
public interface NullValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link jsonMM.NullEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see jsonMM.NullEnum
	 * @see #setValue(NullEnum)
	 * @see jsonMM.JsonMMPackage#getNullValue_Value()
	 * @model required="true"
	 * @generated
	 */
	NullEnum getValue();

	/**
	 * Sets the value of the '{@link jsonMM.NullValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see jsonMM.NullEnum
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NullEnum value);

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

} // NullValue
