/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.BooleanSchema#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getBooleanSchema()
 * @model
 * @generated
 */
public interface BooleanSchema extends Schema {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getBooleanSchema_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.BooleanSchema#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" jsonPointerUnique="false" jsonPointerMany="true" currentIndexUnique="false" currentIndexRequired="true" currentIndexOrdered="false"
	 * @generated
	 */
	Schema findSchemaByJsonPointer(EList<String> jsonPointer, int currentIndex);

} // BooleanSchema
