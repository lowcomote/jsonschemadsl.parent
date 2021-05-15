/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.MaxPropertiesSchemaDefinition;
import jsonMetaschemaMM.NonNegativeInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.MaxPropertiesSchemaDefinitionImpl#getMaxProperties <em>Max Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxPropertiesSchemaDefinitionImpl extends KeywordDefinitionImpl implements MaxPropertiesSchemaDefinition {
	/**
	 * The cached value of the '{@link #getMaxProperties() <em>Max Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger maxProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxPropertiesSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.MAX_PROPERTIES_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getMaxProperties() {
		return maxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxProperties(NonNegativeInteger newMaxProperties, NotificationChain msgs) {
		NonNegativeInteger oldMaxProperties = maxProperties;
		maxProperties = newMaxProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES, oldMaxProperties, newMaxProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxProperties(NonNegativeInteger newMaxProperties) {
		if (newMaxProperties != maxProperties) {
			NotificationChain msgs = null;
			if (maxProperties != null)
				msgs = ((InternalEObject)maxProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES, null, msgs);
			if (newMaxProperties != null)
				msgs = ((InternalEObject)newMaxProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES, null, msgs);
			msgs = basicSetMaxProperties(newMaxProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES, newMaxProperties, newMaxProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES:
				return basicSetMaxProperties(null, msgs);
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
			case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES:
				return getMaxProperties();
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
			case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES:
				setMaxProperties((NonNegativeInteger)newValue);
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
			case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES:
				setMaxProperties((NonNegativeInteger)null);
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
			case JsonMetaschemaMMPackage.MAX_PROPERTIES_SCHEMA_DEFINITION__MAX_PROPERTIES:
				return maxProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //MaxPropertiesSchemaDefinitionImpl
