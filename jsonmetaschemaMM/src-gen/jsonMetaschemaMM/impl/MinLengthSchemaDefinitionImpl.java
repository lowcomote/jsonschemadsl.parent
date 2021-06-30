/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.MinLengthSchemaDefinition;
import jsonMetaschemaMM.NonNegativeIntegerDefault0;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Length Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.MinLengthSchemaDefinitionImpl#getMinLength <em>Min Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinLengthSchemaDefinitionImpl extends KeywordDefinitionImpl implements MinLengthSchemaDefinition {
	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerDefault0 minLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinLengthSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.MIN_LENGTH_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonNegativeIntegerDefault0 getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinLength(NonNegativeIntegerDefault0 newMinLength, NotificationChain msgs) {
		NonNegativeIntegerDefault0 oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH, oldMinLength, newMinLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(NonNegativeIntegerDefault0 newMinLength) {
		if (newMinLength != minLength) {
			NotificationChain msgs = null;
			if (minLength != null)
				msgs = ((InternalEObject)minLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH, null, msgs);
			if (newMinLength != null)
				msgs = ((InternalEObject)newMinLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH, null, msgs);
			msgs = basicSetMinLength(newMinLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH, newMinLength, newMinLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH:
				return basicSetMinLength(null, msgs);
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
			case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH:
				return getMinLength();
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
			case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH:
				setMinLength((NonNegativeIntegerDefault0)newValue);
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
			case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH:
				setMinLength((NonNegativeIntegerDefault0)null);
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
			case JsonMetaschemaMMPackage.MIN_LENGTH_SCHEMA_DEFINITION__MIN_LENGTH:
				return minLength != null;
		}
		return super.eIsSet(featureID);
	}

} //MinLengthSchemaDefinitionImpl
