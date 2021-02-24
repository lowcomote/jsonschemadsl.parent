/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.MaxLengthSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.NonNegativeInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Length Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.MaxLengthSchemaDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxLengthSchemaDefinitionImpl extends KeywordDefinitionImpl implements MaxLengthSchemaDefinition {
	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger maxLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxLengthSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.MAX_LENGTH_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(NonNegativeInteger newMaxLength, NotificationChain msgs) {
		NonNegativeInteger oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH, oldMaxLength, newMaxLength);
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
	public void setMaxLength(NonNegativeInteger newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject) maxLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH, null,
						msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject) newMaxLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH, null,
						msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH:
			return basicSetMaxLength(null, msgs);
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
		case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH:
			return getMaxLength();
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
		case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH:
			setMaxLength((NonNegativeInteger) newValue);
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
		case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH:
			setMaxLength((NonNegativeInteger) null);
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
		case JsonMetaschemaMMPackage.MAX_LENGTH_SCHEMA_DEFINITION__MAX_LENGTH:
			return maxLength != null;
		}
		return super.eIsSet(featureID);
	}

} //MaxLengthSchemaDefinitionImpl
