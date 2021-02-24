/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.AdditionalPropertiesSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AdditionalPropertiesSchemaDefinitionImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalPropertiesSchemaDefinitionImpl extends KeywordDefinitionImpl
		implements AdditionalPropertiesSchemaDefinition {
	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected Schema additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalPropertiesSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalProperties(Schema newAdditionalProperties, NotificationChain msgs) {
		Schema oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES,
					oldAdditionalProperties, newAdditionalProperties);
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
	public void setAdditionalProperties(Schema newAdditionalProperties) {
		if (newAdditionalProperties != additionalProperties) {
			NotificationChain msgs = null;
			if (additionalProperties != null)
				msgs = ((InternalEObject) additionalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES, null,
						msgs);
			if (newAdditionalProperties != null)
				msgs = ((InternalEObject) newAdditionalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES, null,
						msgs);
			msgs = basicSetAdditionalProperties(newAdditionalProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES,
					newAdditionalProperties, newAdditionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES:
			return basicSetAdditionalProperties(null, msgs);
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
		case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES:
			return getAdditionalProperties();
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
		case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES:
			setAdditionalProperties((Schema) newValue);
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
		case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES:
			setAdditionalProperties((Schema) null);
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
		case JsonMetaschemaMMPackage.ADDITIONAL_PROPERTIES_SCHEMA_DEFINITION__ADDITIONAL_PROPERTIES:
			return additionalProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //AdditionalPropertiesSchemaDefinitionImpl
