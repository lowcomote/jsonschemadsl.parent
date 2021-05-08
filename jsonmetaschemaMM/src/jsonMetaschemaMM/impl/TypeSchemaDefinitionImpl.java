/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.SimpleTypes;
import jsonMetaschemaMM.TypeSchemaDefinition;
import jsonMetaschemaMM.TypesAnyOf2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.TypeSchemaDefinitionImpl#getTypeAnyOf1 <em>Type Any Of1</em>}</li>
 *   <li>{@link jsonMetaschemaMM.impl.TypeSchemaDefinitionImpl#getTypesAnyOf2 <em>Types Any Of2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeSchemaDefinitionImpl extends KeywordDefinitionImpl implements TypeSchemaDefinition {
	/**
	 * The default value of the '{@link #getTypeAnyOf1() <em>Type Any Of1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAnyOf1()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleTypes TYPE_ANY_OF1_EDEFAULT = SimpleTypes.ARRAY;

	/**
	 * The cached value of the '{@link #getTypeAnyOf1() <em>Type Any Of1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAnyOf1()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypes typeAnyOf1 = TYPE_ANY_OF1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypesAnyOf2() <em>Types Any Of2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesAnyOf2()
	 * @generated
	 * @ordered
	 */
	protected TypesAnyOf2 typesAnyOf2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.TYPE_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypes getTypeAnyOf1() {
		return typeAnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAnyOf1(SimpleTypes newTypeAnyOf1) {
		SimpleTypes oldTypeAnyOf1 = typeAnyOf1;
		typeAnyOf1 = newTypeAnyOf1 == null ? TYPE_ANY_OF1_EDEFAULT : newTypeAnyOf1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1, oldTypeAnyOf1, typeAnyOf1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAnyOf2 getTypesAnyOf2() {
		return typesAnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypesAnyOf2(TypesAnyOf2 newTypesAnyOf2, NotificationChain msgs) {
		TypesAnyOf2 oldTypesAnyOf2 = typesAnyOf2;
		typesAnyOf2 = newTypesAnyOf2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2, oldTypesAnyOf2, newTypesAnyOf2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypesAnyOf2(TypesAnyOf2 newTypesAnyOf2) {
		if (newTypesAnyOf2 != typesAnyOf2) {
			NotificationChain msgs = null;
			if (typesAnyOf2 != null)
				msgs = ((InternalEObject)typesAnyOf2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2, null, msgs);
			if (newTypesAnyOf2 != null)
				msgs = ((InternalEObject)newTypesAnyOf2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2, null, msgs);
			msgs = basicSetTypesAnyOf2(newTypesAnyOf2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2, newTypesAnyOf2, newTypesAnyOf2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2:
				return basicSetTypesAnyOf2(null, msgs);
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
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1:
				return getTypeAnyOf1();
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2:
				return getTypesAnyOf2();
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
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1:
				setTypeAnyOf1((SimpleTypes)newValue);
				return;
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2:
				setTypesAnyOf2((TypesAnyOf2)newValue);
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
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1:
				setTypeAnyOf1(TYPE_ANY_OF1_EDEFAULT);
				return;
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2:
				setTypesAnyOf2((TypesAnyOf2)null);
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
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPE_ANY_OF1:
				return typeAnyOf1 != TYPE_ANY_OF1_EDEFAULT;
			case JsonMetaschemaMMPackage.TYPE_SCHEMA_DEFINITION__TYPES_ANY_OF2:
				return typesAnyOf2 != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (typeAnyOf1: ");
		result.append(typeAnyOf1);
		result.append(')');
		return result.toString();
	}

} //TypeSchemaDefinitionImpl
