/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaObjectDependenciesAdditionalPropertiesAnyOf2;
import jsonMetaschemaMM.jsonMetaschemaMM.StringArray;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Object Dependencies Additional Properties Any Of2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl#getAnyOf2 <em>Any Of2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl
		extends SchemaObjectDependenciesAdditionalPropertiesAnyOfImpl
		implements SchemaObjectDependenciesAdditionalPropertiesAnyOf2 {
	/**
	 * The cached value of the '{@link #getAnyOf2() <em>Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOf2()
	 * @generated
	 * @ordered
	 */
	protected StringArray anyOf2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringArray getAnyOf2() {
		return anyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyOf2(StringArray newAnyOf2, NotificationChain msgs) {
		StringArray oldAnyOf2 = anyOf2;
		anyOf2 = newAnyOf2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2,
					oldAnyOf2, newAnyOf2);
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
	public void setAnyOf2(StringArray newAnyOf2) {
		if (newAnyOf2 != anyOf2) {
			NotificationChain msgs = null;
			if (anyOf2 != null)
				msgs = ((InternalEObject) anyOf2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2,
						null, msgs);
			if (newAnyOf2 != null)
				msgs = ((InternalEObject) newAnyOf2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2,
						null, msgs);
			msgs = basicSetAnyOf2(newAnyOf2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2,
					newAnyOf2, newAnyOf2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2:
			return basicSetAnyOf2(null, msgs);
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2:
			return getAnyOf2();
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2:
			setAnyOf2((StringArray) newValue);
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2:
			setAnyOf2((StringArray) null);
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
		case JsonMetaschemaMMPackage.SCHEMA_OBJECT_DEPENDENCIES_ADDITIONAL_PROPERTIES_ANY_OF2__ANY_OF2:
			return anyOf2 != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaObjectDependenciesAdditionalPropertiesAnyOf2Impl
