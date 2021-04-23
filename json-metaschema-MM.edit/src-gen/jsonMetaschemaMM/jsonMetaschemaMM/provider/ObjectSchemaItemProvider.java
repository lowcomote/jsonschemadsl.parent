/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.provider;

import java.util.Collection;
import java.util.List;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMFactory;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jsonMetaschemaMM.jsonMetaschemaMM.ObjectSchema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectSchemaItemProvider extends SchemaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSchemaItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION);
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
	 * This returns ObjectSchema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectSchema"));
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
		return getString("_UI_ObjectSchema_type");
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

		switch (notification.getFeatureID(ObjectSchema.class)) {
		case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
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

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMaximumSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createWriteOnlySchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createCommentSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createEnumSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createUniqueItemsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createAnyOfSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createTitleSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createItemsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createDefaultSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createThenSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMinLengthSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createDefinitionsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMinItemsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createOneOfSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMaxPropertiesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMinimumSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMaxItemsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createFormatSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createReadOnlySchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createTypeSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createAdditionalPropertiesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createElseSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createIdSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createConstSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createDependenciesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createRequiredSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createDescriptionSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMinPropertiesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createPatternPropertiesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createAdditionalItemsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createExamplesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createIfSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createAllOfSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createContentEncodingSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMultipleOfSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createPatternSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createContainsSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createNotSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createExclusiveMaximumSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createMaxLengthSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createRefSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createContentMediaTypeSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createExclusiveMinimumSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createSchemaSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createPropertiesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createPropertyNamesSchemaDefinition()));

		newChildDescriptors.add(createChildParameter(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				JsonMetaschemaMMFactory.eINSTANCE.createSchemaObjectAdditionalProperties()));
	}

}
