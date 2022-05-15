/**
 */
package jsonMetaschemaMM.provider;


import java.util.Collection;
import java.util.List;

import jsonMetaschemaMM.JsonMetaschemaMMFactory;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jsonMetaschemaMM.SchemaObjectDependenciesAdditionalProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaObjectDependenciesAdditionalPropertiesItemProvider extends SchemaObjectDependenciesPropertiesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaObjectDependenciesAdditionalPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaObjectDependenciesAdditionalProperties_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaObjectDependenciesAdditionalProperties_key_feature", "_UI_SchemaObjectDependenciesAdditionalProperties_type"),
				 JsonMetaschemaMMPackage.Literals.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(JsonMetaschemaMMPackage.Literals.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES);
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
	 * This returns SchemaObjectDependenciesAdditionalProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SchemaObjectDependenciesAdditionalProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SchemaObjectDependenciesAdditionalProperties)object).getKey();
		return label == null || label.length() == 0 ?
			getString("_UI_SchemaObjectDependenciesAdditionalProperties_type") :
			getString("_UI_SchemaObjectDependenciesAdditionalProperties_type") + " " + label;
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

		switch (notification.getFeatureID(SchemaObjectDependenciesAdditionalProperties.class)) {
			case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
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

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES,
				 JsonMetaschemaMMFactory.eINSTANCE.createSchemaObjectDependenciesAdditionalPropertiesAnyOf1()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES,
				 JsonMetaschemaMMFactory.eINSTANCE.createSchemaObjectDependenciesAdditionalPropertiesAnyOf2()));
	}

}
