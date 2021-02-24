/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypeAnyOf1 <em>Type Any Of1</em>}</li>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypesAnyOf2 <em>Types Any Of2</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeSchemaDefinition()
 * @model
 * @generated
 */
public interface TypeSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Type Any Of1</b></em>' attribute.
	 * The default value is <code>"\"array\""</code>.
	 * The literals are from the enumeration {@link jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Any Of1</em>' attribute.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes
	 * @see #setTypeAnyOf1(SimpleTypes)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeSchemaDefinition_TypeAnyOf1()
	 * @model default="\"array\""
	 * @generated
	 */
	SimpleTypes getTypeAnyOf1();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypeAnyOf1 <em>Type Any Of1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Any Of1</em>' attribute.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.SimpleTypes
	 * @see #getTypeAnyOf1()
	 * @generated
	 */
	void setTypeAnyOf1(SimpleTypes value);

	/**
	 * Returns the value of the '<em><b>Types Any Of2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Any Of2</em>' containment reference.
	 * @see #setTypesAnyOf2(TypesAnyOf2)
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getTypeSchemaDefinition_TypesAnyOf2()
	 * @model containment="true"
	 * @generated
	 */
	TypesAnyOf2 getTypesAnyOf2();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.jsonMetaschemaMM.TypeSchemaDefinition#getTypesAnyOf2 <em>Types Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types Any Of2</em>' containment reference.
	 * @see #getTypesAnyOf2()
	 * @generated
	 */
	void setTypesAnyOf2(TypesAnyOf2 value);

} // TypeSchemaDefinition
