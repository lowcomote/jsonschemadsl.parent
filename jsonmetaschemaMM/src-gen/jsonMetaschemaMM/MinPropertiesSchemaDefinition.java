/**
 */
package jsonMetaschemaMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.MinPropertiesSchemaDefinition#getMinProperties <em>Min Properties</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinPropertiesSchemaDefinition()
 * @model
 * @generated
 */
public interface MinPropertiesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Properties</em>' containment reference.
	 * @see #setMinProperties(NonNegativeIntegerDefault0)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getMinPropertiesSchemaDefinition_MinProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNegativeIntegerDefault0 getMinProperties();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.MinPropertiesSchemaDefinition#getMinProperties <em>Min Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Properties</em>' containment reference.
	 * @see #getMinProperties()
	 * @generated
	 */
	void setMinProperties(NonNegativeIntegerDefault0 value);

} // MinPropertiesSchemaDefinition
