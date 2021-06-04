/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.JsonSchema#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getJsonSchema()
 * @model
 * @generated
 */
public interface JsonSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getJsonSchema_Schema()
	 * @model containment="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link jsonMetaschemaMM.JsonSchema#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" jsonPointerUnique="false" jsonPointerMany="true"
	 * @generated
	 */
	Schema findSchemaByJsonPointer(EList<String> jsonPointer);

} // JsonSchema
