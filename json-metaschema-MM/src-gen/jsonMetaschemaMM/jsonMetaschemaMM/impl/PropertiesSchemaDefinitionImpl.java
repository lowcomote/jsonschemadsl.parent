/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import java.util.Collection;

import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.KeySchemaPair;
import jsonMetaschemaMM.jsonMetaschemaMM.PropertiesSchemaDefinition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.PropertiesSchemaDefinitionImpl#getKeySchemaPairs <em>Key Schema Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesSchemaDefinitionImpl extends KeywordDefinitionImpl implements PropertiesSchemaDefinition {
	/**
	 * The cached value of the '{@link #getKeySchemaPairs() <em>Key Schema Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySchemaPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeySchemaPair> keySchemaPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.PROPERTIES_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeySchemaPair> getKeySchemaPairs() {
		if (keySchemaPairs == null) {
			keySchemaPairs = new EObjectContainmentEList<KeySchemaPair>(KeySchemaPair.class, this,
					JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS);
		}
		return keySchemaPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS:
			return ((InternalEList<?>) getKeySchemaPairs()).basicRemove(otherEnd, msgs);
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
		case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS:
			return getKeySchemaPairs();
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
		case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS:
			getKeySchemaPairs().clear();
			getKeySchemaPairs().addAll((Collection<? extends KeySchemaPair>) newValue);
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
		case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS:
			getKeySchemaPairs().clear();
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
		case JsonMetaschemaMMPackage.PROPERTIES_SCHEMA_DEFINITION__KEY_SCHEMA_PAIRS:
			return keySchemaPairs != null && !keySchemaPairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertiesSchemaDefinitionImpl
