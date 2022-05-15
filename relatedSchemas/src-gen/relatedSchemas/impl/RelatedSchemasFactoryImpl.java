/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import relatedSchemas.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelatedSchemasFactoryImpl extends EFactoryImpl implements RelatedSchemasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelatedSchemasFactory init() {
		try {
			RelatedSchemasFactory theRelatedSchemasFactory = (RelatedSchemasFactory) EPackage.Registry.INSTANCE
					.getEFactory(RelatedSchemasPackage.eNS_URI);
			if (theRelatedSchemasFactory != null) {
				return theRelatedSchemasFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelatedSchemasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSchemasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RelatedSchemasPackage.RELATED_SCHEMAS:
			return createRelatedSchemas();
		case RelatedSchemasPackage.ANY_OF:
			return createAnyOf();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA:
			return createEnclosingSchema();
		case RelatedSchemasPackage.ALL_OF:
			return createAllOf();
		case RelatedSchemasPackage.ONE_OF:
			return createOneOf();
		case RelatedSchemasPackage.NOT:
			return createNot();
		case RelatedSchemasPackage.IF_THEN_ELSE:
			return createIfThenElse();
		case RelatedSchemasPackage.DEPENDENCY:
			return createDependency();
		case RelatedSchemasPackage.CONTAINS:
			return createContains();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSchemas createRelatedSchemas() {
		RelatedSchemasImpl relatedSchemas = new RelatedSchemasImpl();
		return relatedSchemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyOf createAnyOf() {
		AnyOfImpl anyOf = new AnyOfImpl();
		return anyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosingSchema createEnclosingSchema() {
		EnclosingSchemaImpl enclosingSchema = new EnclosingSchemaImpl();
		return enclosingSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllOf createAllOf() {
		AllOfImpl allOf = new AllOfImpl();
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOf createOneOf() {
		OneOfImpl oneOf = new OneOfImpl();
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElse createIfThenElse() {
		IfThenElseImpl ifThenElse = new IfThenElseImpl();
		return ifThenElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSchemasPackage getRelatedSchemasPackage() {
		return (RelatedSchemasPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelatedSchemasPackage getPackage() {
		return RelatedSchemasPackage.eINSTANCE;
	}

} //RelatedSchemasFactoryImpl
