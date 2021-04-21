/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.Schema;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Object Dependencies Additional Properties Any Of1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl#getAnyOf1 <em>Any Of1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl
		extends SchemaObjectDependenciesAdditionalPropertiesAnyOfImpl
		implements SchemaObjectDependenciesAdditionalPropertiesAnyOf1 {
	/**
	 * The cached value of the '{@link #getAnyOf1() <em>Any Of1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOf1()
	 * @generated
	 * @ordered
	 */
	protected Schema anyOf1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getAnyOf1() {
		return anyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyOf1(Schema newAnyOf1, NotificationChain msgs) {
		Schema oldAnyOf1 = anyOf1;
		anyOf1 = newAnyOf1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1,
					oldAnyOf1, newAnyOf1);
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
	public void setAnyOf1(Schema newAnyOf1) {
		if (newAnyOf1 != anyOf1) {
			NotificationChain msgs = null;
			if (anyOf1 != null)
				msgs = ((InternalEObject) anyOf1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1,
						null, msgs);
			if (newAnyOf1 != null)
				msgs = ((InternalEObject) newAnyOf1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1,
						null, msgs);
			msgs = basicSetAnyOf1(newAnyOf1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1,
					newAnyOf1, newAnyOf1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1:
			return basicSetAnyOf1(null, msgs);
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1:
			return getAnyOf1();
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1:
			setAnyOf1((Schema) newValue);
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1:
			setAnyOf1((Schema) null);
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF1__ANY_OF1:
			return anyOf1 != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaObjectDependenciesAdditionalPropertiesAnyOf1Impl
