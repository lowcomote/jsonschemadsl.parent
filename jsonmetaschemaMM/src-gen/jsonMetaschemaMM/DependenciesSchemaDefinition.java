/**
 */
package jsonMetaschemaMM;

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
 *   <li>{@link jsonMetaschemaMM.DependenciesSchemaDefinition#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesSchemaDefinition()
 * @model
 * @generated
 */
public interface DependenciesSchemaDefinition extends KeywordDefinition {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link jsonMetaschemaMM.SchemaObjectDependenciesProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see jsonMetaschemaMM.JsonMetaschemaMMPackage#getDependenciesSchemaDefinition_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchemaObjectDependenciesProperties> getProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" ordered="false" keyUnique="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	Schema findSchemaByKey(String key);

} // DependenciesSchemaDefinition
