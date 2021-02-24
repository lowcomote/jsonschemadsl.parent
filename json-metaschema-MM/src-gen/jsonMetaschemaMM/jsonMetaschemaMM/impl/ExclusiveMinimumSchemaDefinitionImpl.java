/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.ExclusiveMinimumSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Minimum Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ExclusiveMinimumSchemaDefinitionImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExclusiveMinimumSchemaDefinitionImpl extends KeywordDefinitionImpl
		implements ExclusiveMinimumSchemaDefinition {
	/**
	 * The default value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double EXCLUSIVE_MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected double exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveMinimumSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMinimum(double newExclusiveMinimum) {
		double oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM, oldExclusiveMinimum,
					exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM:
			return getExclusiveMinimum();
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
		case JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM:
			setExclusiveMinimum((Double) newValue);
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
		case JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM:
			setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
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
		case JsonMetaschemaMMPackage.EXCLUSIVE_MINIMUM_SCHEMA_DEFINITION__EXCLUSIVE_MINIMUM:
			return exclusiveMinimum != EXCLUSIVE_MINIMUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(')');
		return result.toString();
	}

} //ExclusiveMinimumSchemaDefinitionImpl
