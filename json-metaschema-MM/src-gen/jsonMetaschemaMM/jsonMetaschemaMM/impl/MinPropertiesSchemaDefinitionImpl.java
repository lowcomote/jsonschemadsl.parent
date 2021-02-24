/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.MinPropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeIntegerDefault0;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MinPropertiesSchemaDefinitionImpl#getMinProperties <em>Min Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinPropertiesSchemaDefinitionImpl extends KeywordDefinitionImpl implements MinPropertiesSchemaDefinition {
	/**
	 * The cached value of the '{@link #getMinProperties() <em>Min Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerDefault0 minProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinPropertiesSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.MIN_PROPERTIES_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerDefault0 getMinProperties() {
		return minProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinProperties(NonNegativeIntegerDefault0 newMinProperties,
			NotificationChain msgs) {
		NonNegativeIntegerDefault0 oldMinProperties = minProperties;
		minProperties = newMinProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES, oldMinProperties,
					newMinProperties);
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
	public void setMinProperties(NonNegativeIntegerDefault0 newMinProperties) {
		if (newMinProperties != minProperties) {
			NotificationChain msgs = null;
			if (minProperties != null)
				msgs = ((InternalEObject) minProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES, null, msgs);
			if (newMinProperties != null)
				msgs = ((InternalEObject) newMinProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES, null, msgs);
			msgs = basicSetMinProperties(newMinProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES, newMinProperties,
					newMinProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES:
			return basicSetMinProperties(null, msgs);
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
		case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES:
			return getMinProperties();
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
		case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES:
			setMinProperties((NonNegativeIntegerDefault0) newValue);
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
		case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES:
			setMinProperties((NonNegativeIntegerDefault0) null);
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
		case JsonMetaschemaMMPackage.MIN_PROPERTIES_SCHEMA_DEFINITION__MIN_PROPERTIES:
			return minProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //MinPropertiesSchemaDefinitionImpl
