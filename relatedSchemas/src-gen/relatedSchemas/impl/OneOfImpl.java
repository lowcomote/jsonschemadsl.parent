/**
 */
package relatedSchemas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import relatedSchemas.OneOf;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.OneOfImpl#getOneOfs <em>One Ofs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneOfImpl extends MinimalEObjectImpl.Container implements OneOf {
	/**
	 * The cached value of the '{@link #getOneOfs() <em>One Ofs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> oneOfs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.ONE_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getOneOfs() {
		if (oneOfs == null) {
			oneOfs = new EObjectContainmentEList<EClass>(EClass.class, this, RelatedSchemasPackage.ONE_OF__ONE_OFS);
		}
		return oneOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RelatedSchemasPackage.ONE_OF__ONE_OFS:
			return ((InternalEList<?>) getOneOfs()).basicRemove(otherEnd, msgs);
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
		case RelatedSchemasPackage.ONE_OF__ONE_OFS:
			return getOneOfs();
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
		case RelatedSchemasPackage.ONE_OF__ONE_OFS:
			getOneOfs().clear();
			getOneOfs().addAll((Collection<? extends EClass>) newValue);
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
		case RelatedSchemasPackage.ONE_OF__ONE_OFS:
			getOneOfs().clear();
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
		case RelatedSchemasPackage.ONE_OF__ONE_OFS:
			return oneOfs != null && !oneOfs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OneOfImpl
