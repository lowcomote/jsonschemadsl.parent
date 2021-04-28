/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.NullValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getNullValue()
 * @model
 * @generated
 */
public interface NullValue extends Value {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link jsonMetaschemaMM.jsonMetaschemaMM.NullEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NullEnum
	 * @see #setValue(NullEnum)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getNullValue_Value()
	 * @model required="true"
	 * @generated
	 */
	NullEnum getValue();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.NullValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.NullEnum
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NullEnum value);
} // NullValue
