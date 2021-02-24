/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.AllOfSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.jsonMetaschemaMM.SchemaArray;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Of Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.AllOfSchemaDefinitionImpl#getAllOf <em>All Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllOfSchemaDefinitionImpl extends KeywordDefinitionImpl implements AllOfSchemaDefinition {
	/**
	 * The cached value of the '{@link #getAllOf() <em>All Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf()
	 * @generated
	 * @ordered
	 */
	protected SchemaArray allOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllOfSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.ALL_OF_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaArray getAllOf() {
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllOf(SchemaArray newAllOf, NotificationChain msgs) {
		SchemaArray oldAllOf = allOf;
		allOf = newAllOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF, oldAllOf, newAllOf);
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
	public void setAllOf(SchemaArray newAllOf) {
		if (newAllOf != allOf) {
			NotificationChain msgs = null;
			if (allOf != null)
				msgs = ((InternalEObject) allOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF, null, msgs);
			if (newAllOf != null)
				msgs = ((InternalEObject) newAllOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF, null, msgs);
			msgs = basicSetAllOf(newAllOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF, newAllOf, newAllOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF:
			return basicSetAllOf(null, msgs);
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
		case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF:
			return getAllOf();
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
		case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF:
			setAllOf((SchemaArray) newValue);
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
		case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF:
			setAllOf((SchemaArray) null);
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
		case JsonMetaschemaMMPackage.ALL_OF_SCHEMA_DEFINITION__ALL_OF:
			return allOf != null;
		}
		return super.eIsSet(featureID);
	}

} //AllOfSchemaDefinitionImpl
