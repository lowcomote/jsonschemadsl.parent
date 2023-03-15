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

import relatedSchemas.EnclosingSchema;
import relatedSchemas.RelatedSchemas;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Schemas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.RelatedSchemasImpl#getEnclosingschemas <em>Enclosingschemas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedSchemasImpl extends MinimalEObjectImpl.Container implements RelatedSchemas {
	/**
	 * The cached value of the '{@link #getEnclosingschemas() <em>Enclosingschemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingschemas()
	 * @generated
	 * @ordered
	 */
	protected EList<EnclosingSchema> enclosingschemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedSchemasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.RELATED_SCHEMAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnclosingSchema> getEnclosingschemas() {
		if (enclosingschemas == null) {
			enclosingschemas = new EObjectContainmentEList<EnclosingSchema>(EnclosingSchema.class, this,
					RelatedSchemasPackage.RELATED_SCHEMAS__ENCLOSINGSCHEMAS);
		}
		return enclosingschemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RelatedSchemasPackage.RELATED_SCHEMAS__ENCLOSINGSCHEMAS:
			return ((InternalEList<?>) getEnclosingschemas()).basicRemove(otherEnd, msgs);
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
		case RelatedSchemasPackage.RELATED_SCHEMAS__ENCLOSINGSCHEMAS:
			return getEnclosingschemas();
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
		case RelatedSchemasPackage.RELATED_SCHEMAS__ENCLOSINGSCHEMAS:
			getEnclosingschemas().clear();
			getEnclosingschemas().addAll((Collection<? extends EnclosingSchema>) newValue);
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
		case RelatedSchemasPackage.RELATED_SCHEMAS__ENCLOSINGSCHEMAS:
			getEnclosingschemas().clear();
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
		case RelatedSchemasPackage.RELATED_SCHEMAS__ENCLOSINGSCHEMAS:
			return enclosingschemas != null && !enclosingschemas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelatedSchemasImpl
