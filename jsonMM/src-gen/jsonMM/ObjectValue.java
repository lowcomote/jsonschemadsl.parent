/**
 */
package jsonMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMM.ObjectValue#getKeyvaluepair <em>Keyvaluepair</em>}</li>
 * </ul>
 *
 * @see jsonMM.JsonMMPackage#getObjectValue()
 * @model
 * @generated
 */
public interface ObjectValue extends Value {
	/**
	 * Returns the value of the '<em><b>Keyvaluepair</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMM.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyvaluepair</em>' containment reference list.
	 * @see jsonMM.JsonMMPackage#getObjectValue_Keyvaluepair()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<KeyValuePair> getKeyvaluepair();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" objUnique="false" objRequired="true" objOrdered="false"
	 * @generated
	 */
	boolean equals(Object obj);

} // ObjectValue
