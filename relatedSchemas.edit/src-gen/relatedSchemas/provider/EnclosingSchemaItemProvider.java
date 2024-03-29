/**
 */
package relatedSchemas.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import relatedSchemas.EnclosingSchema;
import relatedSchemas.RelatedSchemasFactory;
import relatedSchemas.RelatedSchemasPackage;

/**
 * This is the item provider adapter for a {@link relatedSchemas.EnclosingSchema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnclosingSchemaItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosingSchemaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__ANY_OF);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__ALL_OF);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__ONE_OF);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__NOT);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__IF_THEN_ELSE);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__DEPENDENCIES);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__CONTAINS);
			childrenFeatures.add(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__CONST_ENUM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EnclosingSchema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnclosingSchema"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EnclosingSchema_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EnclosingSchema.class)) {
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS:
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__ANY_OF,
				RelatedSchemasFactory.eINSTANCE.createAnyOf()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__ALL_OF,
				RelatedSchemasFactory.eINSTANCE.createAllOf()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__ONE_OF,
				RelatedSchemasFactory.eINSTANCE.createOneOf()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__NOT,
				RelatedSchemasFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__IF_THEN_ELSE,
				RelatedSchemasFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__DEPENDENCIES,
				RelatedSchemasFactory.eINSTANCE.createDependencies()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__CONTAINS,
				RelatedSchemasFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA__CONST_ENUM,
				RelatedSchemasFactory.eINSTANCE.createConstEnum()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RelatedSchemasEditPlugin.INSTANCE;
	}

}
