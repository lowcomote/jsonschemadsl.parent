/**
 */
package jsonMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jsonMM.JsonMMPackage;
import jsonMM.KeyValuePair;
import jsonMM.ObjectValue;

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
 *   <li>{@link jsonMM.impl.ObjectValueImpl#getKeyvaluepair <em>Keyvaluepair</em>}</li>
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
		return JsonMMPackage.Literals.OBJECT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValuePair> getKeyvaluepair() {
		if (keyvaluepair == null) {
			keyvaluepair = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this,
					JsonMMPackage.OBJECT_VALUE__KEYVALUEPAIR);
		}
		return keyvaluepair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (this.getKeyvaluepair().size() != ((ObjectValue) obj).getKeyvaluepair().size())
			return false;
		java.util.Collection<KeyValuePair> copyKeyvaluepair = new java.util.ArrayList<KeyValuePair>(
				this.getKeyvaluepair());
		for (KeyValuePair keyValuePair : ((ObjectValue) obj).getKeyvaluepair()) {
			copyKeyvaluepair.remove(keyValuePair);
		}
		return copyKeyvaluepair.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
			return ((InternalEList<?>) getKeyvaluepair()).basicRemove(otherEnd, msgs);
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
		case JsonMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
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
		case JsonMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
			getKeyvaluepair().clear();
			getKeyvaluepair().addAll((Collection<? extends KeyValuePair>) newValue);
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
		case JsonMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
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
		case JsonMMPackage.OBJECT_VALUE__KEYVALUEPAIR:
			return keyvaluepair != null && !keyvaluepair.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case JsonMMPackage.OBJECT_VALUE___EQUALS__OBJECT:
			return equals(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ObjectValueImpl
