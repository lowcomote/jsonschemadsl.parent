/**
 */
package jsongrammarmm.jsongrammar.provider;

import java.util.Collection;
import java.util.List;

import jsongrammarmm.jsongrammar.JsongrammarPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * This is the item provider adapter for a {@link jsongrammarmm.jsongrammar.DetailedGrammar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailedGrammarItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedGrammarItemProvider(AdapterFactory adapterFactory) {
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

			addKeywordsPropertyDescriptor(object);
			addCurlyBracesReferencesPropertyDescriptor(object);
			addBracketsReferencesPropertyDescriptor(object);
			addKeyValuePropertyDescriptor(object);
			addCurlyBracesEClassPropertyDescriptor(object);
			addBracketsEClassPropertyDescriptor(object);
			addRootEClassPropertyDescriptor(object);
			addTuplesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Keywords feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeywordsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DetailedGrammar_keywords_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_keywords_feature",
								"_UI_DetailedGrammar_type"),
						JsongrammarPackage.Literals.DETAILED_GRAMMAR__KEYWORDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Curly Braces References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurlyBracesReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DetailedGrammar_curlyBracesReferences_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DetailedGrammar_curlyBracesReferences_feature", "_UI_DetailedGrammar_type"),
						JsongrammarPackage.Literals.DETAILED_GRAMMAR__CURLY_BRACES_REFERENCES, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Brackets References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBracketsReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DetailedGrammar_bracketsReferences_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_bracketsReferences_feature",
						"_UI_DetailedGrammar_type"),
				JsongrammarPackage.Literals.DETAILED_GRAMMAR__BRACKETS_REFERENCES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Key Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DetailedGrammar_keyValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_keyValue_feature",
								"_UI_DetailedGrammar_type"),
						JsongrammarPackage.Literals.DETAILED_GRAMMAR__KEY_VALUE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Curly Braces EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurlyBracesEClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DetailedGrammar_curlyBracesEClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_curlyBracesEClass_feature",
						"_UI_DetailedGrammar_type"),
				JsongrammarPackage.Literals.DETAILED_GRAMMAR__CURLY_BRACES_ECLASS, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Brackets EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBracketsEClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DetailedGrammar_bracketsEClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_bracketsEClass_feature",
						"_UI_DetailedGrammar_type"),
				JsongrammarPackage.Literals.DETAILED_GRAMMAR__BRACKETS_ECLASS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Root EClass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootEClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DetailedGrammar_rootEClass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_rootEClass_feature",
								"_UI_DetailedGrammar_type"),
						JsongrammarPackage.Literals.DETAILED_GRAMMAR__ROOT_ECLASS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Tuples feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTuplesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DetailedGrammar_tuples_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DetailedGrammar_tuples_feature",
								"_UI_DetailedGrammar_type"),
						JsongrammarPackage.Literals.DETAILED_GRAMMAR__TUPLES, true, false, true, null, null, null));
	}

	/**
	 * This returns DetailedGrammar.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DetailedGrammar"));
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
		return getString("_UI_DetailedGrammar_type");
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JsongrammarEditPlugin.INSTANCE;
	}

}
