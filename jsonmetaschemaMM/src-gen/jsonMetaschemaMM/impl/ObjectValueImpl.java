/**
 */
package jsonMetaschemaMM.impl;

import java.util.Collection;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.KeyValuePair;
import jsonMetaschemaMM.ObjectValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectValueImpl#getKeyvaluepair <em>Keyvaluepair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectValueImpl extends ValueImpl implements ObjectValue {
	/**
	 * The cached value of the '{@link #getKeyvaluepair() <em>Keyvaluepair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyvaluepair()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> keyvaluepair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.OBJECT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValuePair> getKeyvaluepair() {
		if (keyvaluepair == null) {
			keyvaluepair = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, JsonMetaschemaMMPackage.OBJECT_VALUE__KEYVALUEPAIR);
		}
		return keyvaluepair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
				return ((InternalEList<?>)getKeyvaluepair()).basicRemove(otherEnd, msgs);
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
			case JsonMetaschemaMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
				return getKeyvaluepair();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
				getKeyvaluepair().clear();
				getKeyvaluepair().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case JsonMetaschemaMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
				getKeyvaluepair().clear();
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
			case JsonMetaschemaMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
				return keyvaluepair != null && !keyvaluepair.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectValueImpl
