/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EClass if_;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EClass then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
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
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(EClass newIf, NotificationChain msgs) {
		EClass oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.IF_THEN_ELSE__IF, oldIf, newIf);
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
	public void setIf(EClass newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.IF_THEN_ELSE__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.IF_THEN_ELSE__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.IF_THEN_ELSE__IF, newIf,
					newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(EClass newThen, NotificationChain msgs) {
		EClass oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.IF_THEN_ELSE__THEN, oldThen, newThen);
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
	public void setThen(EClass newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject) then).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.IF_THEN_ELSE__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject) newThen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.IF_THEN_ELSE__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.IF_THEN_ELSE__THEN, newThen,
					newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(EClass newElse, NotificationChain msgs) {
		EClass oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.IF_THEN_ELSE__ELSE, oldElse, newElse);
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
	public void setElse(EClass newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject) else_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.IF_THEN_ELSE__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject) newElse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.IF_THEN_ELSE__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.IF_THEN_ELSE__ELSE, newElse,
					newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RelatedSchemasPackage.IF_THEN_ELSE__IF:
			return basicSetIf(null, msgs);
		case RelatedSchemasPackage.IF_THEN_ELSE__THEN:
			return basicSetThen(null, msgs);
		case RelatedSchemasPackage.IF_THEN_ELSE__ELSE:
			return basicSetElse(null, msgs);
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
		case RelatedSchemasPackage.IF_THEN_ELSE__IF:
			return getIf();
		case RelatedSchemasPackage.IF_THEN_ELSE__THEN:
			return getThen();
		case RelatedSchemasPackage.IF_THEN_ELSE__ELSE:
			return getElse();
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
