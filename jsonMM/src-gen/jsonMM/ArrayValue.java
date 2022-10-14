/**
 */
package jsonMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMM.ArrayValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jsonMM.JsonMMPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMM.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see jsonMM.JsonMMPackage#getArrayValue_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Value> getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" objUnique="false" objRequired="true" objOrdered="false"
	 * @generated
	 */
	boolean equals(Object obj);

} // ArrayValue
