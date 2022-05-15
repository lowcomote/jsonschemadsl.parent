/**
 */
package relatedSchemas.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import relatedSchemas.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see relatedSchemas.RelatedSchemasPackage
 * @generated
 */
public class RelatedSchemasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelatedSchemasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSchemasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RelatedSchemasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedSchemasSwitch<Adapter> modelSwitch = new RelatedSchemasSwitch<Adapter>() {
		@Override
		public Adapter caseRelatedSchemas(RelatedSchemas object) {
			return createRelatedSchemasAdapter();
		}

		@Override
		public Adapter caseAnyOf(AnyOf object) {
			return createAnyOfAdapter();
		}

		@Override
		public Adapter caseEnclosingSchema(EnclosingSchema object) {
			return createEnclosingSchemaAdapter();
		}

		@Override
		public Adapter caseAllOf(AllOf object) {
			return createAllOfAdapter();
		}

		@Override
		public Adapter caseOneOf(OneOf object) {
			return createOneOfAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseIfThenElse(IfThenElse object) {
			return createIfThenElseAdapter();
		}

		@Override
		public Adapter caseDependency(Dependency object) {
			return createDependencyAdapter();
		}

		@Override
		public Adapter caseContains(Contains object) {
			return createContainsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.RelatedSchemas <em>Related Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.RelatedSchemas
	 * @generated
	 */
	public Adapter createRelatedSchemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.AnyOf <em>Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.AnyOf
	 * @generated
	 */
	public Adapter createAnyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.EnclosingSchema <em>Enclosing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.EnclosingSchema
	 * @generated
	 */
	public Adapter createEnclosingSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.AllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.AllOf
	 * @generated
	 */
	public Adapter createAllOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.OneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.OneOf
	 * @generated
	 */
	public Adapter createOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.IfThenElse
	 * @generated
	 */
	public Adapter createIfThenElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relatedSchemas.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relatedSchemas.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RelatedSchemasAdapterFactory
