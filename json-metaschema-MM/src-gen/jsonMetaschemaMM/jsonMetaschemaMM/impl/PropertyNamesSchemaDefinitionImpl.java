/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.PropertyNamesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Names Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertyNamesSchemaDefinitionImpl#getPropertyNames <em>Property Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyNamesSchemaDefinitionImpl extends KeywordDefinitionImpl implements PropertyNamesSchemaDefinition {
	/**
	 * The cached value of the '{@link #getPropertyNames() <em>Property Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyNames()
	 * @generated
	 * @ordered
	 */
	protected Schema propertyNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyNamesSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.PROPERTY_NAMES_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getPropertyNames() {
		return propertyNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyNames(Schema newPropertyNames, NotificationChain msgs) {
		Schema oldPropertyNames = propertyNames;
		propertyNames = newPropertyNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES, oldPropertyNames,
					newPropertyNames);
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
	public void setPropertyNames(Schema newPropertyNames) {
		if (newPropertyNames != propertyNames) {
			NotificationChain msgs = null;
			if (propertyNames != null)
				msgs = ((InternalEObject) propertyNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES, null, msgs);
			if (newPropertyNames != null)
				msgs = ((InternalEObject) newPropertyNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES, null, msgs);
			msgs = basicSetPropertyNames(newPropertyNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES, newPropertyNames,
					newPropertyNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES:
			return basicSetPropertyNames(null, msgs);
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
		case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES:
			return getPropertyNames();
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
		case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES:
			setPropertyNames((Schema) newValue);
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
		case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES:
			setPropertyNames((Schema) null);
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
		case JsonMetaschemaMMPackage.PROPERTY_NAMES_SCHEMA_DEFINITION__PROPERTY_NAMES:
			return propertyNames != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyNamesSchemaDefinitionImpl
