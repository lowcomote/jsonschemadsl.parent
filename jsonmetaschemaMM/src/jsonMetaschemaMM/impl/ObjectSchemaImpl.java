/**
 */
package jsonMetaschemaMM.impl;

import java.util.Collection;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.KeywordDefinition;
import jsonMetaschemaMM.ObjectSchema;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.ObjectSchemaImpl#getKeywordDefinition <em>Keyword Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectSchemaImpl extends SchemaImpl implements ObjectSchema {
	/**
	 * The cached value of the '{@link #getKeywordDefinition() <em>Keyword Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<KeywordDefinition> keywordDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.OBJECT_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordDefinition> getKeywordDefinition() {
		if (keywordDefinition == null) {
			keywordDefinition = new EObjectContainmentEList<KeywordDefinition>(KeywordDefinition.class, this, JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION);
		}
		return keywordDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				return ((InternalEList<?>)getKeywordDefinition()).basicRemove(otherEnd, msgs);
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				return getKeywordDefinition();
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				getKeywordDefinition().clear();
				getKeywordDefinition().addAll((Collection<? extends KeywordDefinition>)newValue);
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				getKeywordDefinition().clear();
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
			case JsonMetaschemaMMPackage.OBJECT_SCHEMA__KEYWORD_DEFINITION:
				return keywordDefinition != null && !keywordDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectSchemaImpl
