/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import relatedSchemas.IfThenElse;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.IfThenElseImpl#getIf <em>If</em>}</li>
 *   <li>{@link relatedSchemas.impl.IfThenElseImpl#getThen <em>Then</em>}</li>
 *   <li>{@link relatedSchemas.impl.IfThenElseImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfThenElseImpl extends MinimalEObjectImpl.Container implements IfThenElse {
	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EClass if_;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EClass then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EClass else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		if (if_ != null && if_.eIsProxy()) {
			InternalEObject oldIf = (InternalEObject) if_;
			if_ = (EClass) eResolveProxy(oldIf);
			if (if_ != oldIf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelatedSchemasPackage.IF_THEN_ELSE__IF,
							oldIf, if_));
			}
		}
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(EClass newIf) {
		EClass oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.IF_THEN_ELSE__IF, oldIf, if_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThen() {
		if (then != null && then.eIsProxy()) {
			InternalEObject oldThen = (InternalEObject) then;
			then = (EClass) eResolveProxy(oldThen);
			if (then != oldThen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelatedSchemasPackage.IF_THEN_ELSE__THEN,
							oldThen, then));
			}
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(EClass newThen) {
		EClass oldThen = then;
		then = newThen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.IF_THEN_ELSE__THEN, oldThen,
					then));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElse() {
		if (else_ != null && else_.eIsProxy()) {
			InternalEObject oldElse = (InternalEObject) else_;
			else_ = (EClass) eResolveProxy(oldElse);
			if (else_ != oldElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelatedSchemasPackage.IF_THEN_ELSE__ELSE,
							oldElse, else_));
			}
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(EClass newElse) {
		EClass oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.IF_THEN_ELSE__ELSE, oldElse,
					else_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RelatedSchemasPackage.IF_THEN_ELSE__IF:
			if (resolve)
				return getIf();
			return basicGetIf();
		case RelatedSchemasPackage.IF_THEN_ELSE__THEN:
			if (resolve)
				return getThen();
			return basicGetThen();
		case RelatedSchemasPackage.IF_THEN_ELSE__ELSE:
			if (resolve)
				return getElse();
			return basicGetElse();
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
		case RelatedSchemasPackage.IF_THEN_ELSE__IF:
			setIf((EClass) newValue);
			return;
		case RelatedSchemasPackage.IF_THEN_ELSE__THEN:
			setThen((EClass) newValue);
			return;
		case RelatedSchemasPackage.IF_THEN_ELSE__ELSE:
			setElse((EClass) newValue);
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
		case RelatedSchemasPackage.IF_THEN_ELSE__IF:
			setIf((EClass) null);
			return;
		case RelatedSchemasPackage.IF_THEN_ELSE__THEN:
			setThen((EClass) null);
			return;
		case RelatedSchemasPackage.IF_THEN_ELSE__ELSE:
			setElse((EClass) null);
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
		case RelatedSchemasPackage.IF_THEN_ELSE__IF:
			return if_ != null;
		case RelatedSchemasPackage.IF_THEN_ELSE__THEN:
			return then != null;
		case RelatedSchemasPackage.IF_THEN_ELSE__ELSE:
			return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfThenElseImpl
