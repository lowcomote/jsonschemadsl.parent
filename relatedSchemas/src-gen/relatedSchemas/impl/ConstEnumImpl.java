/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import relatedSchemas.Const;
import relatedSchemas.ConstEnum;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.ConstEnumImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link relatedSchemas.impl.ConstEnumImpl#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstEnumImpl extends MinimalEObjectImpl.Container implements ConstEnum {
	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected relatedSchemas.Enum enum_;

	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected Const const_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.CONST_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public relatedSchemas.Enum getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnum(relatedSchemas.Enum newEnum, NotificationChain msgs) {
		relatedSchemas.Enum oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.CONST_ENUM__ENUM, oldEnum, newEnum);
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
	public void setEnum(relatedSchemas.Enum newEnum) {
		if (newEnum != enum_) {
			NotificationChain msgs = null;
			if (enum_ != null)
				msgs = ((InternalEObject) enum_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.CONST_ENUM__ENUM, null, msgs);
			if (newEnum != null)
				msgs = ((InternalEObject) newEnum).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.CONST_ENUM__ENUM, null, msgs);
			msgs = basicSetEnum(newEnum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.CONST_ENUM__ENUM, newEnum,
					newEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Const getConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConst(Const newConst, NotificationChain msgs) {
		Const oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.CONST_ENUM__CONST, oldConst, newConst);
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
	public void setConst(Const newConst) {
		if (newConst != const_) {
			NotificationChain msgs = null;
			if (const_ != null)
				msgs = ((InternalEObject) const_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.CONST_ENUM__CONST, null, msgs);
			if (newConst != null)
				msgs = ((InternalEObject) newConst).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.CONST_ENUM__CONST, null, msgs);
			msgs = basicSetConst(newConst, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.CONST_ENUM__CONST, newConst,
					newConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RelatedSchemasPackage.CONST_ENUM__ENUM:
			return basicSetEnum(null, msgs);
		case RelatedSchemasPackage.CONST_ENUM__CONST:
			return basicSetConst(null, msgs);
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
		case RelatedSchemasPackage.CONST_ENUM__ENUM:
			return getEnum();
		case RelatedSchemasPackage.CONST_ENUM__CONST:
			return getConst();
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
		case RelatedSchemasPackage.CONST_ENUM__ENUM:
			setEnum((relatedSchemas.Enum) newValue);
			return;
		case RelatedSchemasPackage.CONST_ENUM__CONST:
			setConst((Const) newValue);
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
		case RelatedSchemasPackage.CONST_ENUM__ENUM:
			setEnum((relatedSchemas.Enum) null);
			return;
		case RelatedSchemasPackage.CONST_ENUM__CONST:
			setConst((Const) null);
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
		case RelatedSchemasPackage.CONST_ENUM__ENUM:
			return enum_ != null;
		case RelatedSchemasPackage.CONST_ENUM__CONST:
			return const_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstEnumImpl
