/**
 */
package relatedSchemas.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import relatedSchemas.util.RelatedSchemasAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelatedSchemasItemProviderAdapterFactory extends RelatedSchemasAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSchemasItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.RelatedSchemas} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedSchemasItemProvider relatedSchemasItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.RelatedSchemas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelatedSchemasAdapter() {
		if (relatedSchemasItemProvider == null) {
			relatedSchemasItemProvider = new RelatedSchemasItemProvider(this);
		}

		return relatedSchemasItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.AnyOf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyOfItemProvider anyOfItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.AnyOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnyOfAdapter() {
		if (anyOfItemProvider == null) {
			anyOfItemProvider = new AnyOfItemProvider(this);
		}

		return anyOfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.EnclosingSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnclosingSchemaItemProvider enclosingSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.EnclosingSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnclosingSchemaAdapter() {
		if (enclosingSchemaItemProvider == null) {
			enclosingSchemaItemProvider = new EnclosingSchemaItemProvider(this);
		}

		return enclosingSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.AllOf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllOfItemProvider allOfItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.AllOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllOfAdapter() {
		if (allOfItemProvider == null) {
			allOfItemProvider = new AllOfItemProvider(this);
		}

		return allOfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.OneOf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneOfItemProvider oneOfItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.OneOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOneOfAdapter() {
		if (oneOfItemProvider == null) {
			oneOfItemProvider = new OneOfItemProvider(this);
		}

		return oneOfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.IfThenElse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseItemProvider ifThenElseItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfThenElseAdapter() {
		if (ifThenElseItemProvider == null) {
			ifThenElseItemProvider = new IfThenElseItemProvider(this);
		}

		return ifThenElseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.Dependencies} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesItemProvider dependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.Dependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependenciesAdapter() {
		if (dependenciesItemProvider == null) {
			dependenciesItemProvider = new DependenciesItemProvider(this);
		}

		return dependenciesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.Contains} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsItemProvider containsItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.Contains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainsAdapter() {
		if (containsItemProvider == null) {
			containsItemProvider = new ContainsItemProvider(this);
		}

		return containsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.Enum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumItemProvider enumItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumAdapter() {
		if (enumItemProvider == null) {
			enumItemProvider = new EnumItemProvider(this);
		}

		return enumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link relatedSchemas.Const} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstItemProvider constItemProvider;

	/**
	 * This creates an adapter for a {@link relatedSchemas.Const}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstAdapter() {
		if (constItemProvider == null) {
			constItemProvider = new ConstItemProvider(this);
		}

		return constItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (relatedSchemasItemProvider != null)
			relatedSchemasItemProvider.dispose();
		if (anyOfItemProvider != null)
			anyOfItemProvider.dispose();
		if (enclosingSchemaItemProvider != null)
			enclosingSchemaItemProvider.dispose();
		if (allOfItemProvider != null)
			allOfItemProvider.dispose();
		if (oneOfItemProvider != null)
			oneOfItemProvider.dispose();
		if (notItemProvider != null)
			notItemProvider.dispose();
		if (ifThenElseItemProvider != null)
			ifThenElseItemProvider.dispose();
		if (dependenciesItemProvider != null)
			dependenciesItemProvider.dispose();
		if (containsItemProvider != null)
			containsItemProvider.dispose();
		if (dependencyItemProvider != null)
			dependencyItemProvider.dispose();
		if (enumItemProvider != null)
			enumItemProvider.dispose();
		if (constItemProvider != null)
			constItemProvider.dispose();
	}

}
