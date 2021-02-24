/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.AnyOfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Of Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AnyOfSchemaDefinitionImpl#getAnyOf <em>Any Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyOfSchemaDefinitionImpl extends KeywordDefinitionImpl implements AnyOfSchemaDefinition {
	/**
	 * The cached value of the '{@link #getAnyOf() <em>Any Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOf()
	 * @generated
	 * @ordered
	 */
	protected SchemaArray anyOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyOfSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.ANY_OF_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaArray getAnyOf() {
		return anyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyOf(SchemaArray newAnyOf, NotificationChain msgs) {
		SchemaArray oldAnyOf = anyOf;
		anyOf = newAnyOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF, oldAnyOf, newAnyOf);
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
	public void setAnyOf(SchemaArray newAnyOf) {
		if (newAnyOf != anyOf) {
			NotificationChain msgs = null;
			if (anyOf != null)
				msgs = ((InternalEObject) anyOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF, null, msgs);
			if (newAnyOf != null)
				msgs = ((InternalEObject) newAnyOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF, null, msgs);
			msgs = basicSetAnyOf(newAnyOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF, newAnyOf, newAnyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF:
			return basicSetAnyOf(null, msgs);
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
		case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF:
			return getAnyOf();
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
		case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF:
			setAnyOf((SchemaArray) newValue);
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
		case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF:
			setAnyOf((SchemaArray) null);
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
		case JsonMetaschemaMMPackage.ANY_OF_SCHEMA_DEFINITION__ANY_OF:
			return anyOf != null;
		}
		return super.eIsSet(featureID);
	}

} //AnyOfSchemaDefinitionImpl
