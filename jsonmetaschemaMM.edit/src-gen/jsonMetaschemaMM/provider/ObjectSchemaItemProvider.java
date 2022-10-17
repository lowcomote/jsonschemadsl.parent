/**
 */
package jsonMetaschemaMM.provider;


import java.util.Collection;
import java.util.List;

import jsonMetaschemaMM.JsonMetaschemaMMFactory;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.ObjectSchema;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jsonMetaschemaMM.ObjectSchema} object.
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

			addAdditionalItemsPropertyDescriptor(object);
			addItemsPropertyDescriptor(object);
			addAdditionalPropertiesPropertyDescriptor(object);
			addContainsPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addDefinitionsPropertyDescriptor(object);
			addPatternPropertiesPropertyDescriptor(object);
			addDependenciesPropertyDescriptor(object);
			addPropertyNamesPropertyDescriptor(object);
			addIfPropertyDescriptor(object);
			addThenPropertyDescriptor(object);
			addElsePropertyDescriptor(object);
			addAllOfPropertyDescriptor(object);
			addAnyOfPropertyDescriptor(object);
			addOneOfPropertyDescriptor(object);
			addNotPropertyDescriptor(object);
			addRefPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addEnumPropertyDescriptor(object);
			addSchemaObjectAdditionalPropertiesPropertyDescriptor(object);
			addMultipleOfPropertyDescriptor(object);
			addMinPropertiesPropertyDescriptor(object);
			addMaxPropertiesPropertyDescriptor(object);
			addConstPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Additional Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_additionalItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_additionalItems_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ADDITIONAL_ITEMS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_items_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_items_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ITEMS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additional Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_additionalProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_additionalProperties_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ADDITIONAL_PROPERTIES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_contains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_contains_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__CONTAINS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_properties_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__PROPERTIES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Definitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_definitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_definitions_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__DEFINITIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_patternProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_patternProperties_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__PATTERN_PROPERTIES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_dependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_dependencies_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__DEPENDENCIES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_propertyNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_propertyNames_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__PROPERTY_NAMES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the If feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_if_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_if_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__IF,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Then feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_then_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_then_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__THEN,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Else feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_else_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_else_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ELSE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_allOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_allOf_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ALL_OF,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Any Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnyOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_anyOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_anyOf_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ANY_OF,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the One Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOneOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_oneOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_oneOf_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ONE_OF,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Not feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_not_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_not_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__NOT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_ref_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__REF,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_type_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_enum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_enum_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__ENUM,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema Object Additional Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaObjectAdditionalPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_schemaObjectAdditionalProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_schemaObjectAdditionalProperties_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__SCHEMA_OBJECT_ADDITIONAL_PROPERTIES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiple Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_multipleOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_multipleOf_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__MULTIPLE_OF,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_minProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_minProperties_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__MIN_PROPERTIES,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_maxProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_maxProperties_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__MAX_PROPERTIES,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectSchema_const_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectSchema_const_feature", "_UI_ObjectSchema_type"),
				 JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__CONST,
				 false,
				 false,
				 false,
				 null,
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

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMaximumSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createWriteOnlySchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createCommentSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createEnumSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createUniqueItemsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createAnyOfSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createTitleSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createItemsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createDefaultSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createThenSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMinLengthSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createDefinitionsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMinItemsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createOneOfSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMaxPropertiesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMinimumSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMaxItemsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createFormatSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createReadOnlySchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createTypeSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createAdditionalPropertiesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createElseSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createIdSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createConstSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createDependenciesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createRequiredSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createDescriptionSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMinPropertiesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createPatternPropertiesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createAdditionalItemsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createExamplesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createIfSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createAllOfSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createContentEncodingSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMultipleOfSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createPatternSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createContainsSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createNotSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createExclusiveMaximumSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createMaxLengthSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createRefSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createContentMediaTypeSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createExclusiveMinimumSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createSchemaSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createPropertiesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createPropertyNamesSchemaDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA__KEYWORD_DEFINITION,
				 JsonMetaschemaMMFactory.eINSTANCE.createSchemaObjectAdditionalProperties()));
	}

}
