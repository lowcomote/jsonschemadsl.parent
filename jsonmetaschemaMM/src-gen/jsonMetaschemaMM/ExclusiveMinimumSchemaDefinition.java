/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Minimum Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getExclusiveMinimumSchemaDefinition()
 * @model
 * @generated
 */
public interface ExclusiveMinimumSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(double)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getExclusiveMinimumSchemaDefinition_ExclusiveMinimum()
	 * @model required="true"
	 * @generated
	 */
	double getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(double value);

} // ExclusiveMinimumSchemaDefinition
