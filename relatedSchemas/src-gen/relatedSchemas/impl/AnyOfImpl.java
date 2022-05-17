/**
 */
package relatedSchemas.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import relatedSchemas.AnyOf;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.AnyOfImpl#getAnyOfs <em>Any Ofs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyOfImpl extends MinimalEObjectImpl.Container implements AnyOf {
	/**
	 * The cached value of the '{@link #getAnyOfs() <em>Any Ofs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> anyOfs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.ANY_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getAnyOfs() {
		if (anyOfs == null) {
			anyOfs = new EObjectResolvingEList<EClass>(EClass.class, this, RelatedSchemasPackage.ANY_OF__ANY_OFS);
		}
		return anyOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RelatedSchemasPackage.ANY_OF__ANY_OFS:
			return getAnyOfs();
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
		case RelatedSchemasPackage.ANY_OF__ANY_OFS:
			getAnyOfs().clear();
			getAnyOfs().addAll((Collection<? extends EClass>) newValue);
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
		case RelatedSchemasPackage.ANY_OF__ANY_OFS:
			getAnyOfs().clear();
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
		case RelatedSchemasPackage.ANY_OF__ANY_OFS:
			return anyOfs != null && !anyOfs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnyOfImpl
