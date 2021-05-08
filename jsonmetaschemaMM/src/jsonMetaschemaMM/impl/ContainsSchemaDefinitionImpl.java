/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.ContainsSchemaDefinition;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.ContainsSchemaDefinitionImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainsSchemaDefinitionImpl extends KeywordDefinitionImpl implements ContainsSchemaDefinition {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected Schema contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.CONTAINS_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(Schema newContains, NotificationChain msgs) {
		Schema oldContains = contains;
		contains = newContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS, oldContains, newContains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContains(Schema newContains) {
		if (newContains != contains) {
			NotificationChain msgs = null;
			if (contains != null)
				msgs = ((InternalEObject)contains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS, null, msgs);
			if (newContains != null)
				msgs = ((InternalEObject)newContains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS, null, msgs);
			msgs = basicSetContains(newContains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS, newContains, newContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS:
				return basicSetContains(null, msgs);
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
			case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS:
				return getContains();
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
			case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS:
				setContains((Schema)newValue);
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
			case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS:
				setContains((Schema)null);
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
			case JsonMetaschemaMMPackage.CONTAINS_SCHEMA_DEFINITION__CONTAINS:
				return contains != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainsSchemaDefinitionImpl
