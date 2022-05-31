/**
 */
package relatedSchemas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see relatedSchemas.RelatedSchemasFactory
 * @model kind="package"
 * @generated
 */
public interface RelatedSchemasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relatedSchemas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at.jku.bise/relatedSchemas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relatedSchemas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelatedSchemasPackage eINSTANCE = relatedSchemas.impl.RelatedSchemasPackageImpl.init();

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.RelatedSchemasImpl <em>Related Schemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.RelatedSchemasImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getRelatedSchemas()
	 * @generated
	 */
	int RELATED_SCHEMAS = 0;

	/**
	 * The feature id for the '<em><b>Enclosingschemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SCHEMAS__ENCLOSINGSCHEMAS = 0;

	/**
	 * The number of structural features of the '<em>Related Schemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SCHEMAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Related Schemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_SCHEMAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.AnyOfImpl <em>Any Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.AnyOfImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getAnyOf()
	 * @generated
	 */
	int ANY_OF = 1;

	/**
	 * The feature id for the '<em><b>Any Ofs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF__ANY_OFS = 0;

	/**
	 * The number of structural features of the '<em>Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.EnclosingSchemaImpl <em>Enclosing Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.EnclosingSchemaImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getEnclosingSchema()
	 * @generated
	 */
	int ENCLOSING_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Enclosing Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__ENCLOSING_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Any Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__ANY_OF = 1;

	/**
	 * The feature id for the '<em><b>All Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__ALL_OF = 2;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__ONE_OF = 3;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__NOT = 4;

	/**
	 * The feature id for the '<em><b>If Then Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__IF_THEN_ELSE = 5;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__DEPENDENCIES = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA__CONTAINS = 7;

	/**
	 * The number of structural features of the '<em>Enclosing Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Enclosing Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.AllOfImpl <em>All Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.AllOfImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getAllOf()
	 * @generated
	 */
	int ALL_OF = 3;

	/**
	 * The feature id for the '<em><b>All Ofs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF__ALL_OFS = 0;

	/**
	 * The number of structural features of the '<em>All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.OneOfImpl <em>One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.OneOfImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getOneOf()
	 * @generated
	 */
	int ONE_OF = 4;

	/**
	 * The feature id for the '<em><b>One Ofs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__ONE_OFS = 0;

	/**
	 * The number of structural features of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.NotImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 5;

	/**
	 * The feature id for the '<em><b>Not</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NOT = 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.IfThenElseImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 6;

	/**
	 * The feature id for the '<em><b>If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__IF = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__THEN = 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ELSE = 2;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.DependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.DependenciesImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getDependencies()
	 * @generated
	 */
	int DEPENDENCIES = 7;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES__DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.ContainsImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 8;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relatedSchemas.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relatedSchemas.impl.DependencyImpl
	 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link relatedSchemas.RelatedSchemas <em>Related Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Schemas</em>'.
	 * @see relatedSchemas.RelatedSchemas
	 * @generated
	 */
	EClass getRelatedSchemas();

	/**
	 * Returns the meta object for the containment reference list '{@link relatedSchemas.RelatedSchemas#getEnclosingschemas <em>Enclosingschemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enclosingschemas</em>'.
	 * @see relatedSchemas.RelatedSchemas#getEnclosingschemas()
	 * @see #getRelatedSchemas()
	 * @generated
	 */
	EReference getRelatedSchemas_Enclosingschemas();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.AnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Of</em>'.
	 * @see relatedSchemas.AnyOf
	 * @generated
	 */
	EClass getAnyOf();

	/**
	 * Returns the meta object for the reference list '{@link relatedSchemas.AnyOf#getAnyOfs <em>Any Ofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Any Ofs</em>'.
	 * @see relatedSchemas.AnyOf#getAnyOfs()
	 * @see #getAnyOf()
	 * @generated
	 */
	EReference getAnyOf_AnyOfs();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.EnclosingSchema <em>Enclosing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enclosing Schema</em>'.
	 * @see relatedSchemas.EnclosingSchema
	 * @generated
	 */
	EClass getEnclosingSchema();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.EnclosingSchema#getEnclosingSchema <em>Enclosing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enclosing Schema</em>'.
	 * @see relatedSchemas.EnclosingSchema#getEnclosingSchema()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_EnclosingSchema();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getAnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Of</em>'.
	 * @see relatedSchemas.EnclosingSchema#getAnyOf()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_AnyOf();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getAllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Of</em>'.
	 * @see relatedSchemas.EnclosingSchema#getAllOf()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_AllOf();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>One Of</em>'.
	 * @see relatedSchemas.EnclosingSchema#getOneOf()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_OneOf();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see relatedSchemas.EnclosingSchema#getNot()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_Not();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getIfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Then Else</em>'.
	 * @see relatedSchemas.EnclosingSchema#getIfThenElse()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_IfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see relatedSchemas.EnclosingSchema#getDependencies()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_Dependencies();

	/**
	 * Returns the meta object for the containment reference '{@link relatedSchemas.EnclosingSchema#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see relatedSchemas.EnclosingSchema#getContains()
	 * @see #getEnclosingSchema()
	 * @generated
	 */
	EReference getEnclosingSchema_Contains();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.AllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Of</em>'.
	 * @see relatedSchemas.AllOf
	 * @generated
	 */
	EClass getAllOf();

	/**
	 * Returns the meta object for the reference list '{@link relatedSchemas.AllOf#getAllOfs <em>All Ofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Ofs</em>'.
	 * @see relatedSchemas.AllOf#getAllOfs()
	 * @see #getAllOf()
	 * @generated
	 */
	EReference getAllOf_AllOfs();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.OneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Of</em>'.
	 * @see relatedSchemas.OneOf
	 * @generated
	 */
	EClass getOneOf();

	/**
	 * Returns the meta object for the reference list '{@link relatedSchemas.OneOf#getOneOfs <em>One Ofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Ofs</em>'.
	 * @see relatedSchemas.OneOf#getOneOfs()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_OneOfs();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see relatedSchemas.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.Not#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not</em>'.
	 * @see relatedSchemas.Not#getNot()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Not();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see relatedSchemas.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.IfThenElse#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If</em>'.
	 * @see relatedSchemas.IfThenElse#getIf()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_If();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.IfThenElse#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then</em>'.
	 * @see relatedSchemas.IfThenElse#getThen()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Then();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.IfThenElse#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see relatedSchemas.IfThenElse#getElse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Else();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see relatedSchemas.Dependencies
	 * @generated
	 */
	EClass getDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link relatedSchemas.Dependencies#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see relatedSchemas.Dependencies#getDependencies()
	 * @see #getDependencies()
	 * @generated
	 */
	EReference getDependencies_Dependencies();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see relatedSchemas.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.Contains#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contains</em>'.
	 * @see relatedSchemas.Contains#getContains()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Contains();

	/**
	 * Returns the meta object for class '{@link relatedSchemas.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see relatedSchemas.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link relatedSchemas.Dependency#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency</em>'.
	 * @see relatedSchemas.Dependency#getDependency()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link relatedSchemas.Dependency#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see relatedSchemas.Dependency#getProperty()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelatedSchemasFactory getRelatedSchemasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.RelatedSchemasImpl <em>Related Schemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.RelatedSchemasImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getRelatedSchemas()
		 * @generated
		 */
		EClass RELATED_SCHEMAS = eINSTANCE.getRelatedSchemas();

		/**
		 * The meta object literal for the '<em><b>Enclosingschemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_SCHEMAS__ENCLOSINGSCHEMAS = eINSTANCE.getRelatedSchemas_Enclosingschemas();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.AnyOfImpl <em>Any Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.AnyOfImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getAnyOf()
		 * @generated
		 */
		EClass ANY_OF = eINSTANCE.getAnyOf();

		/**
		 * The meta object literal for the '<em><b>Any Ofs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_OF__ANY_OFS = eINSTANCE.getAnyOf_AnyOfs();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.EnclosingSchemaImpl <em>Enclosing Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.EnclosingSchemaImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getEnclosingSchema()
		 * @generated
		 */
		EClass ENCLOSING_SCHEMA = eINSTANCE.getEnclosingSchema();

		/**
		 * The meta object literal for the '<em><b>Enclosing Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__ENCLOSING_SCHEMA = eINSTANCE.getEnclosingSchema_EnclosingSchema();

		/**
		 * The meta object literal for the '<em><b>Any Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__ANY_OF = eINSTANCE.getEnclosingSchema_AnyOf();

		/**
		 * The meta object literal for the '<em><b>All Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__ALL_OF = eINSTANCE.getEnclosingSchema_AllOf();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__ONE_OF = eINSTANCE.getEnclosingSchema_OneOf();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__NOT = eINSTANCE.getEnclosingSchema_Not();

		/**
		 * The meta object literal for the '<em><b>If Then Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__IF_THEN_ELSE = eINSTANCE.getEnclosingSchema_IfThenElse();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__DEPENDENCIES = eINSTANCE.getEnclosingSchema_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_SCHEMA__CONTAINS = eINSTANCE.getEnclosingSchema_Contains();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.AllOfImpl <em>All Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.AllOfImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getAllOf()
		 * @generated
		 */
		EClass ALL_OF = eINSTANCE.getAllOf();

		/**
		 * The meta object literal for the '<em><b>All Ofs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_OF__ALL_OFS = eINSTANCE.getAllOf_AllOfs();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.OneOfImpl <em>One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.OneOfImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getOneOf()
		 * @generated
		 */
		EClass ONE_OF = eINSTANCE.getOneOf();

		/**
		 * The meta object literal for the '<em><b>One Ofs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__ONE_OFS = eINSTANCE.getOneOf_OneOfs();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.NotImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__NOT = eINSTANCE.getNot_Not();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.IfThenElseImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getIfThenElse()
		 * @generated
		 */
		EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__IF = eINSTANCE.getIfThenElse_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.DependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.DependenciesImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getDependencies()
		 * @generated
		 */
		EClass DEPENDENCIES = eINSTANCE.getDependencies();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES__DEPENDENCIES = eINSTANCE.getDependencies_Dependencies();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.ContainsImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__CONTAINS = eINSTANCE.getContains_Contains();

		/**
		 * The meta object literal for the '{@link relatedSchemas.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relatedSchemas.impl.DependencyImpl
		 * @see relatedSchemas.impl.RelatedSchemasPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__DEPENDENCY = eINSTANCE.getDependency_Dependency();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__PROPERTY = eINSTANCE.getDependency_Property();

	}

} //RelatedSchemasPackage
