/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclosing Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.EnclosingSchema#getEnclosingSchema <em>Enclosing Schema</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getAnyOf <em>Any Of</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getAllOf <em>All Of</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getOneOf <em>One Of</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getNot <em>Not</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getIfThenElse <em>If Then Else</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getDependency <em>Dependency</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema()
 * @model
 * @generated
 */
public interface EnclosingSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Enclosing Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Schema</em>' containment reference.
	 * @see #setEnclosingSchema(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_EnclosingSchema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EClass getEnclosingSchema();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getEnclosingSchema <em>Enclosing Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Schema</em>' containment reference.
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	void setEnclosingSchema(EClass value);

	/**
	 * Returns the value of the '<em><b>Any Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Of</em>' containment reference.
	 * @see #setAnyOf(AnyOf)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_AnyOf()
	 * @model containment="true"
	 * @generated
	 */
	AnyOf getAnyOf();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getAnyOf <em>Any Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Of</em>' containment reference.
	 * @see #getAnyOf()
	 * @generated
	 */
	void setAnyOf(AnyOf value);

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' containment reference.
	 * @see #setAllOf(AllOf)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_AllOf()
	 * @model containment="true"
	 * @generated
	 */
	AllOf getAllOf();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getAllOf <em>All Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Of</em>' containment reference.
	 * @see #getAllOf()
	 * @generated
	 */
	void setAllOf(AllOf value);

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' containment reference.
	 * @see #setOneOf(OneOf)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_OneOf()
	 * @model containment="true"
	 * @generated
	 */
	OneOf getOneOf();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getOneOf <em>One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Of</em>' containment reference.
	 * @see #getOneOf()
	 * @generated
	 */
	void setOneOf(OneOf value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Not)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_Not()
	 * @model containment="true"
	 * @generated
	 */
	Not getNot();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Not value);

	/**
	 * Returns the value of the '<em><b>If Then Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Then Else</em>' containment reference.
	 * @see #setIfThenElse(IfThenElse)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_IfThenElse()
	 * @model containment="true"
	 * @generated
	 */
	IfThenElse getIfThenElse();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getIfThenElse <em>If Then Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Then Else</em>' containment reference.
	 * @see #getIfThenElse()
	 * @generated
	 */
	void setIfThenElse(IfThenElse value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference.
	 * @see #setDependency(Dependency)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getDependency <em>Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' containment reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Contains)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_Contains()
	 * @model containment="true"
	 * @generated
	 */
	Contains getContains();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Contains value);

} // EnclosingSchema
