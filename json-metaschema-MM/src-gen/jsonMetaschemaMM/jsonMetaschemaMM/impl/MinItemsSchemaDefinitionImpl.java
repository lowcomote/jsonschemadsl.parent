/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.MinItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinItemsSchemaDefinitionImpl#getMinItems <em>Min Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinItemsSchemaDefinitionImpl extends KeywordDefinitionImpl implements MinItemsSchemaDefinition {
	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerDefault0 minItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinItemsSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.MIN_ITEMS_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerDefault0 getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinItems(NonNegativeIntegerDefault0 newMinItems, NotificationChain msgs) {
		NonNegativeIntegerDefault0 oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS, oldMinItems, newMinItems);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(NonNegativeIntegerDefault0 newMinItems) {
		if (newMinItems != minItems) {
			NotificationChain msgs = null;
			if (minItems != null)
				msgs = ((InternalEObject) minItems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS, null,
						msgs);
			if (newMinItems != null)
				msgs = ((InternalEObject) newMinItems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS, null,
						msgs);
			msgs = basicSetMinItems(newMinItems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS, newMinItems, newMinItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS:
			return basicSetMinItems(null, msgs);
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
		case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS:
			return getMinItems();
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
		case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS:
			setMinItems((NonNegativeIntegerDefault0) newValue);
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
		case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS:
			setMinItems((NonNegativeIntegerDefault0) null);
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
		case JsonMetaschemaMMPackage.MIN_ITEMS_SCHEMA_DEFINITION__MIN_ITEMS:
			return minItems != null;
		}
		return super.eIsSet(featureID);
	}

} //MinItemsSchemaDefinitionImpl
