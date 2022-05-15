/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import relatedSchemas.Not;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.NotImpl#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotImpl extends MinimalEObjectImpl.Container implements Not {
	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected EClass not;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(EClass newNot, NotificationChain msgs) {
		EClass oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.NOT__NOT, oldNot, newNot);
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
	public void setNot(EClass newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject) not).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.NOT__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject) newNot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.NOT__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.NOT__NOT, newNot, newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RelatedSchemasPackage.NOT__NOT:
			return basicSetNot(null, msgs);
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
		case RelatedSchemasPackage.NOT__NOT:
			return getNot();
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
		case RelatedSchemasPackage.NOT__NOT:
			setNot((EClass) newValue);
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
		case RelatedSchemasPackage.NOT__NOT:
			setNot((EClass) null);
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
		case RelatedSchemasPackage.NOT__NOT:
			return not != null;
		}
		return super.eIsSet(featureID);
	}

} //NotImpl
