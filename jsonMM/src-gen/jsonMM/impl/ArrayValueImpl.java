/**
 */
package jsonMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jsonMM.ArrayValue;
import jsonMM.JsonMMPackage;
import jsonMM.Value;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMM.impl.ArrayValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayValueImpl extends ValueImpl implements ArrayValue {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMMPackage.Literals.ARRAY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Value>(Value.class, this, JsonMMPackage.ARRAY_VALUE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean semanticEquals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (this.getValue().size() != ((ArrayValue) obj).getValue().size())
			return false;

		for (int i = 0; i < this.getValue().size(); i++) {
			if (!this.getValue().get(i).semanticEquals(((ArrayValue) obj).getValue().get(i))) {
				return false;
			}
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		String result = "[";
		if (value != null) {
			for (int i = 0; i < value.size(); i++) {
				result = result.concat(value.get(i).toString());
				if (i < value.size() - 1) {
					result = result.concat(",");
				}
			}
		}
		result = result.concat("]");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMMPackage.ARRAY_VALUE__VALUE:
			return ((InternalEList<?>) getValue()).basicRemove(otherEnd, msgs);
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
		case JsonMMPackage.ARRAY_VALUE__VALUE:
			return getValue();
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
		case JsonMMPackage.ARRAY_VALUE__VALUE:
			getValue().clear();
			getValue().addAll((Collection<? extends Value>) newValue);
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
		case JsonMMPackage.ARRAY_VALUE__VALUE:
			getValue().clear();
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
		case JsonMMPackage.ARRAY_VALUE__VALUE:
			return value != null && !value.isEmpty();
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
		case JsonMMPackage.ARRAY_VALUE___SEMANTIC_EQUALS__OBJECT:
			return semanticEquals(arguments.get(0));
		case JsonMMPackage.ARRAY_VALUE___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArrayValueImpl
