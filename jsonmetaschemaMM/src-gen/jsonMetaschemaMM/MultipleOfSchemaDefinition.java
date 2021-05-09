/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Of Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.MultipleOfSchemaDefinition#getMultipleOf <em>Multiple Of</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMultipleOfSchemaDefinition()
 * @model
 * @generated
 */
public interface MultipleOfSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(double)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMultipleOfSchemaDefinition_MultipleOf()
	 * @model required="true"
	 * @generated
	 */
	double getMultipleOf();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.MultipleOfSchemaDefinition#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(double value);

} // MultipleOfSchemaDefinition
