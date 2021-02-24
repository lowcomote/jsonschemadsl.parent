/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.DependenciesAnyOf;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair;
import jsonMetaschemaMM.jsonMetaschemaMM.KeyStringArrayPair;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependencies Any Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DependenciesAnyOfImpl#getDependenciesAnyOf2 <em>Dependencies Any Of2</em>}</li>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.DependenciesAnyOfImpl#getDependenciesAnyOf1 <em>Dependencies Any Of1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependenciesAnyOfImpl extends MinimalEObjectImpl.Container implements DependenciesAnyOf {
	/**
	 * The cached value of the '{@link #getDependenciesAnyOf2() <em>Dependencies Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenciesAnyOf2()
	 * @generated
	 * @ordered
	 */
	protected KeyStringArrayPair dependenciesAnyOf2;

	/**
	 * The cached value of the '{@link #getDependenciesAnyOf1() <em>Dependencies Any Of1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenciesAnyOf1()
	 * @generated
	 * @ordered
	 */
	protected KeySchemaPair dependenciesAnyOf1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesAnyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.DEPENDENCIES_ANY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyStringArrayPair getDependenciesAnyOf2() {
		return dependenciesAnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependenciesAnyOf2(KeyStringArrayPair newDependenciesAnyOf2,
			NotificationChain msgs) {
		KeyStringArrayPair oldDependenciesAnyOf2 = dependenciesAnyOf2;
		dependenciesAnyOf2 = newDependenciesAnyOf2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2, oldDependenciesAnyOf2,
					newDependenciesAnyOf2);
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
	public void setDependenciesAnyOf2(KeyStringArrayPair newDependenciesAnyOf2) {
		if (newDependenciesAnyOf2 != dependenciesAnyOf2) {
			NotificationChain msgs = null;
			if (dependenciesAnyOf2 != null)
				msgs = ((InternalEObject) dependenciesAnyOf2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2,
						null, msgs);
			if (newDependenciesAnyOf2 != null)
				msgs = ((InternalEObject) newDependenciesAnyOf2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2,
						null, msgs);
			msgs = basicSetDependenciesAnyOf2(newDependenciesAnyOf2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2, newDependenciesAnyOf2,
					newDependenciesAnyOf2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeySchemaPair getDependenciesAnyOf1() {
		return dependenciesAnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependenciesAnyOf1(KeySchemaPair newDependenciesAnyOf1, NotificationChain msgs) {
		KeySchemaPair oldDependenciesAnyOf1 = dependenciesAnyOf1;
		dependenciesAnyOf1 = newDependenciesAnyOf1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1, oldDependenciesAnyOf1,
					newDependenciesAnyOf1);
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
	public void setDependenciesAnyOf1(KeySchemaPair newDependenciesAnyOf1) {
		if (newDependenciesAnyOf1 != dependenciesAnyOf1) {
			NotificationChain msgs = null;
			if (dependenciesAnyOf1 != null)
				msgs = ((InternalEObject) dependenciesAnyOf1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1,
						null, msgs);
			if (newDependenciesAnyOf1 != null)
				msgs = ((InternalEObject) newDependenciesAnyOf1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1,
						null, msgs);
			msgs = basicSetDependenciesAnyOf1(newDependenciesAnyOf1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1, newDependenciesAnyOf1,
					newDependenciesAnyOf1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2:
			return basicSetDependenciesAnyOf2(null, msgs);
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1:
			return basicSetDependenciesAnyOf1(null, msgs);
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
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2:
			return getDependenciesAnyOf2();
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1:
			return getDependenciesAnyOf1();
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
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2:
			setDependenciesAnyOf2((KeyStringArrayPair) newValue);
			return;
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1:
			setDependenciesAnyOf1((KeySchemaPair) newValue);
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
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2:
			setDependenciesAnyOf2((KeyStringArrayPair) null);
			return;
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1:
			setDependenciesAnyOf1((KeySchemaPair) null);
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
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF2:
			return dependenciesAnyOf2 != null;
		case JsonMetaschemaMMPackage.DEPENDENCIES_ANY_OF__DEPENDENCIES_ANY_OF1:
			return dependenciesAnyOf1 != null;
		}
		return super.eIsSet(featureID);
	}

} //DependenciesAnyOfImpl
