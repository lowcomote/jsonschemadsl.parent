/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getNot() <em>Not</em>}' reference.
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
		if (not != null && not.eIsProxy()) {
			InternalEObject oldNot = (InternalEObject) not;
			not = (EClass) eResolveProxy(oldNot);
			if (not != oldNot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelatedSchemasPackage.NOT__NOT, oldNot,
							not));
			}
		}
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(EClass newNot) {
		EClass oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.NOT__NOT, oldNot, not));
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
			if (resolve)
				return getNot();
			return basicGetNot();
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
