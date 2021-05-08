/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.UniqueItemsSchemaDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.UniqueItemsSchemaDefinitionImpl#isUniqueItems <em>Unique Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueItemsSchemaDefinitionImpl extends KeywordDefinitionImpl implements UniqueItemsSchemaDefinition {
	/**
	 * The default value of the '{@link #isUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueItems = UNIQUE_ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueItemsSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.UNIQUE_ITEMS_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueItems() {
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueItems(boolean newUniqueItems) {
		boolean oldUniqueItems = uniqueItems;
		uniqueItems = newUniqueItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS:
				return isUniqueItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.UNIQUE_ITEMS_SCHEMA_DEFINITION__UNIQUE_ITEMS:
				return uniqueItems != UNIQUE_ITEMS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uniqueItems: ");
		result.append(uniqueItems);
		result.append(')');
		return result.toString();
	}

} //UniqueItemsSchemaDefinitionImpl
