/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesSchemaDefinition#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesSchemaDefinition()
 * @model
 * @generated
 */
public interface DependenciesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.jsonMetaschemaMM.DependenciesAnyOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesSchemaDefinition_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependenciesAnyOf> getDependencies();

} // DependenciesSchemaDefinition
