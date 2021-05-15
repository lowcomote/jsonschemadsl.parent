/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maximum Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.MaximumSchemaDefinition#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaximumSchemaDefinition()
 * @model
 * @generated
 */
public interface MaximumSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaximumSchemaDefinition_Maximum()
	 * @model required="true"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.MaximumSchemaDefinition#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

} // MaximumSchemaDefinition
