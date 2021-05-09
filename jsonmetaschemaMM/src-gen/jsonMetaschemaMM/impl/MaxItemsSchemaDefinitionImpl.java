/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.MaxItemsSchemaDefinition;
import jsonMetaschemaMM.NonNegativeInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.MaxItemsSchemaDefinitionImpl#getMaxItems <em>Max Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxItemsSchemaDefinitionImpl extends KeywordDefinitionImpl implements MaxItemsSchemaDefinition {
	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger maxItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxItemsSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.MAX_ITEMS_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxItems(NonNegativeInteger newMaxItems, NotificationChain msgs) {
		NonNegativeInteger oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS, oldMaxItems, newMaxItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(NonNegativeInteger newMaxItems) {
		if (newMaxItems != maxItems) {
			NotificationChain msgs = null;
			if (maxItems != null)
				msgs = ((InternalEObject)maxItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS, null, msgs);
			if (newMaxItems != null)
				msgs = ((InternalEObject)newMaxItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS, null, msgs);
			msgs = basicSetMaxItems(newMaxItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS, newMaxItems, newMaxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS:
				return basicSetMaxItems(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS:
				return getMaxItems();
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
			case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS:
				setMaxItems((NonNegativeInteger)newValue);
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
			case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS:
				setMaxItems((NonNegativeInteger)null);
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
			case JsonMetaschemaMMPackage.MAX_ITEMS_SCHEMA_DEFINITION__MAX_ITEMS:
				return maxItems != null;
		}
		return super.eIsSet(featureID);
	}

} //MaxItemsSchemaDefinitionImpl
