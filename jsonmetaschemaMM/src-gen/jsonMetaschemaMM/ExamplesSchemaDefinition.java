/**
 */
package jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.ExamplesSchemaDefinition#getExamples <em>Examples</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getExamplesSchemaDefinition()
 * @model
 * @generated
 */
public interface ExamplesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.JsonDocument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getExamplesSchemaDefinition_Examples()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsonDocument> getExamples();

} // ExamplesSchemaDefinition
