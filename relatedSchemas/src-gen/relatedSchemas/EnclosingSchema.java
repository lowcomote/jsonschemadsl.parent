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
 *   <li>{@link relatedSchemas.EnclosingSchema#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getContains <em>Contains</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getEnum <em>Enum</em>}</li>
 *   <li>{@link relatedSchemas.EnclosingSchema#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema()
 * @model
 * @generated
 */
public interface EnclosingSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Enclosing Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Schema</em>' reference.
	 * @see #setEnclosingSchema(EClass)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_EnclosingSchema()
	 * @model required="true"
	 * @generated
	 */
	EClass getEnclosingSchema();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getEnclosingSchema <em>Enclosing Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Schema</em>' reference.
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
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(Dependencies)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	Dependencies getDependencies();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(Dependencies value);

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

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference.
	 * @see #setEnum(relatedSchemas.Enum)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_Enum()
	 * @model containment="true"
	 * @generated
	 */
	relatedSchemas.Enum getEnum();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getEnum <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' containment reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(relatedSchemas.Enum value);

	/**
	 * Returns the value of the '<em><b>Const</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' containment reference.
	 * @see #setConst(Const)
	 * @see relatedSchemas.RelatedSchemasPackage#getEnclosingSchema_Const()
	 * @model containment="true"
	 * @generated
	 */
	Const getConst();

	/**
	 * Sets the value of the '{@link relatedSchemas.EnclosingSchema#getConst <em>Const</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' containment reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(Const value);

} // EnclosingSchema
