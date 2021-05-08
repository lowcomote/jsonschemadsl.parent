/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.MinimumSchemaDefinition#getMinimum <em>Minimum</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinimumSchemaDefinition()
 * @model
 * @generated
 */
public interface MinimumSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinimumSchemaDefinition_Minimum()
	 * @model required="true"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.MinimumSchemaDefinition#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

} // MinimumSchemaDefinition
