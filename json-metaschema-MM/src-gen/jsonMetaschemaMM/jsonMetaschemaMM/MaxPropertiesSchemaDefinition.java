/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition#getMaxProperties <em>Max Properties</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaxPropertiesSchemaDefinition()
 * @model
 * @generated
 */
public interface MaxPropertiesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Properties</em>' containment reference.
	 * @see #setMaxProperties(NonNegativeInteger)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getMaxPropertiesSchemaDefinition_MaxProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonNegativeInteger getMaxProperties();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.MaxPropertiesSchemaDefinition#getMaxProperties <em>Max Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Properties</em>' containment reference.
	 * @see #getMaxProperties()
	 * @generated
	 */
	void setMaxProperties(NonNegativeInteger value);

} // MaxPropertiesSchemaDefinition
