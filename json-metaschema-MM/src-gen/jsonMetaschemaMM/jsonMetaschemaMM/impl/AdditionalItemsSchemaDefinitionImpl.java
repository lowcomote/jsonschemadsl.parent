/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.AdditionalItemsSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalItemsSchemaDefinitionImpl#getAdditionalItems <em>Additional Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalItemsSchemaDefinitionImpl extends KeywordDefinitionImpl
		implements AdditionalItemsSchemaDefinition {
	/**
	 * The cached value of the '{@link #getAdditionalItems() <em>Additional Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalItems()
	 * @generated
	 * @ordered
	 */
	protected Schema additionalItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalItemsSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.ADDITIONAL_ITEMS_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getAdditionalItems() {
		return additionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalItems(Schema newAdditionalItems, NotificationChain msgs) {
		Schema oldAdditionalItems = additionalItems;
		additionalItems = newAdditionalItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS, oldAdditionalItems,
					newAdditionalItems);
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
	public void setAdditionalItems(Schema newAdditionalItems) {
		if (newAdditionalItems != additionalItems) {
			NotificationChain msgs = null;
			if (additionalItems != null)
				msgs = ((InternalEObject) additionalItems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS,
						null, msgs);
			if (newAdditionalItems != null)
				msgs = ((InternalEObject) newAdditionalItems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS,
						null, msgs);
			msgs = basicSetAdditionalItems(newAdditionalItems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS, newAdditionalItems,
					newAdditionalItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS:
			return basicSetAdditionalItems(null, msgs);
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
		case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS:
			return getAdditionalItems();
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
		case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS:
			setAdditionalItems((Schema) newValue);
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
		case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS:
			setAdditionalItems((Schema) null);
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
		case JsonMetaschemaMMPackage.ADDITIONAL_ITEMS_SCHEMA_DEFINITION__ADDITIONAL_ITEMS:
			return additionalItems != null;
		}
		return super.eIsSet(featureID);
	}

} //AdditionalItemsSchemaDefinitionImpl
