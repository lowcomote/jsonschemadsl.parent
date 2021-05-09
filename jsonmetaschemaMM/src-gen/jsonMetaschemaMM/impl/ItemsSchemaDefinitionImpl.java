/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.ItemsSchemaDefinition;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.Schema;
import jsonMetaschemaMM.SchemaArray;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Items Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.ItemsSchemaDefinitionImpl#getItemsAnyOf1 <em>Items Any Of1</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.ItemsSchemaDefinitionImpl#getItemsAnyOf2 <em>Items Any Of2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemsSchemaDefinitionImpl extends KeywordDefinitionImpl implements ItemsSchemaDefinition {
	/**
	 * The cached value of the '{@link #getItemsAnyOf1() <em>Items Any Of1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsAnyOf1()
	 * @generated
	 * @ordered
	 */
	protected Schema itemsAnyOf1;

	/**
	 * The cached value of the '{@link #getItemsAnyOf2() <em>Items Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsAnyOf2()
	 * @generated
	 * @ordered
	 */
	protected SchemaArray itemsAnyOf2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemsSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.ITEMS_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getItemsAnyOf1() {
		return itemsAnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemsAnyOf1(Schema newItemsAnyOf1, NotificationChain msgs) {
		Schema oldItemsAnyOf1 = itemsAnyOf1;
		itemsAnyOf1 = newItemsAnyOf1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1, oldItemsAnyOf1, newItemsAnyOf1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemsAnyOf1(Schema newItemsAnyOf1) {
		if (newItemsAnyOf1 != itemsAnyOf1) {
			NotificationChain msgs = null;
			if (itemsAnyOf1 != null)
				msgs = ((InternalEObject)itemsAnyOf1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1, null, msgs);
			if (newItemsAnyOf1 != null)
				msgs = ((InternalEObject)newItemsAnyOf1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1, null, msgs);
			msgs = basicSetItemsAnyOf1(newItemsAnyOf1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1, newItemsAnyOf1, newItemsAnyOf1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaArray getItemsAnyOf2() {
		return itemsAnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemsAnyOf2(SchemaArray newItemsAnyOf2, NotificationChain msgs) {
		SchemaArray oldItemsAnyOf2 = itemsAnyOf2;
		itemsAnyOf2 = newItemsAnyOf2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2, oldItemsAnyOf2, newItemsAnyOf2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemsAnyOf2(SchemaArray newItemsAnyOf2) {
		if (newItemsAnyOf2 != itemsAnyOf2) {
			NotificationChain msgs = null;
			if (itemsAnyOf2 != null)
				msgs = ((InternalEObject)itemsAnyOf2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2, null, msgs);
			if (newItemsAnyOf2 != null)
				msgs = ((InternalEObject)newItemsAnyOf2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2, null, msgs);
			msgs = basicSetItemsAnyOf2(newItemsAnyOf2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2, newItemsAnyOf2, newItemsAnyOf2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1:
				return basicSetItemsAnyOf1(null, msgs);
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2:
				return basicSetItemsAnyOf2(null, msgs);
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
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1:
				return getItemsAnyOf1();
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2:
				return getItemsAnyOf2();
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
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1:
				setItemsAnyOf1((Schema)newValue);
				return;
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2:
				setItemsAnyOf2((SchemaArray)newValue);
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
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1:
				setItemsAnyOf1((Schema)null);
				return;
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2:
				setItemsAnyOf2((SchemaArray)null);
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
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF1:
				return itemsAnyOf1 != null;
			case JsonMetaschemaMMPackage.ITEMS_SCHEMA_DEFINITION__ITEMS_ANY_OF2:
				return itemsAnyOf2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemsSchemaDefinitionImpl
