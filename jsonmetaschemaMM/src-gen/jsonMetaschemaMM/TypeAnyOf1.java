/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Any Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.TypeAnyOf1#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeAnyOf1()
 * @model
 * @generated
 */
public interface TypeAnyOf1 extends TypeAnyOf {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jsonMetaschemaMM.SimpleTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jsonMetaschemaMM.SimpleTypes
	 * @see #setType(SimpleTypes)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeAnyOf1_Type()
	 * @model required="true"
	 * @generated
	 */
	SimpleTypes getType();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.TypeAnyOf1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jsonMetaschemaMM.SimpleTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleTypes value);

} // TypeAnyOf1
