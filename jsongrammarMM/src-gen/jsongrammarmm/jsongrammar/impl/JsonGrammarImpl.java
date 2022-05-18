/**
 */
package jsongrammarmm.jsongrammar.impl;

import jsongrammarmm.jsongrammar.DetailedGrammar;
import jsongrammarmm.jsongrammar.JsonGrammar;
import jsongrammarmm.jsongrammar.JsongrammarPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsongrammarmm.jsongrammar.impl.JsonGrammarImpl#getDetailedGrammar <em>Detailed Grammar</em>}</li>
 *   <li>{@link jsongrammarmm.jsongrammar.impl.JsonGrammarImpl#getNsURI <em>Ns URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonGrammarImpl extends MinimalEObjectImpl.Container implements JsonGrammar {
	/**
	 * The cached value of the '{@link #getDetailedGrammar() <em>Detailed Grammar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedGrammar()
	 * @generated
	 * @ordered
	 */
	protected DetailedGrammar detailedGrammar;

	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonGrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsongrammarPackage.Literals.JSON_GRAMMAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedGrammar getDetailedGrammar() {
		return detailedGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailedGrammar(DetailedGrammar newDetailedGrammar, NotificationChain msgs) {
		DetailedGrammar oldDetailedGrammar = detailedGrammar;
		detailedGrammar = newDetailedGrammar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR, oldDetailedGrammar, newDetailedGrammar);
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
	public void setDetailedGrammar(DetailedGrammar newDetailedGrammar) {
		if (newDetailedGrammar != detailedGrammar) {
			NotificationChain msgs = null;
			if (detailedGrammar != null)
				msgs = ((InternalEObject) detailedGrammar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR, null, msgs);
			if (newDetailedGrammar != null)
				msgs = ((InternalEObject) newDetailedGrammar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR, null, msgs);
			msgs = basicSetDetailedGrammar(newDetailedGrammar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR,
					newDetailedGrammar, newDetailedGrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURI(String newNsURI) {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsongrammarPackage.JSON_GRAMMAR__NS_URI, oldNsURI,
					nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR:
			return basicSetDetailedGrammar(null, msgs);
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
		case JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR:
			return getDetailedGrammar();
		case JsongrammarPackage.JSON_GRAMMAR__NS_URI:
			return getNsURI();
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
		case JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR:
			setDetailedGrammar((DetailedGrammar) newValue);
			return;
		case JsongrammarPackage.JSON_GRAMMAR__NS_URI:
			setNsURI((String) newValue);
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
		case JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR:
			setDetailedGrammar((DetailedGrammar) null);
			return;
		case JsongrammarPackage.JSON_GRAMMAR__NS_URI:
			setNsURI(NS_URI_EDEFAULT);
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
		case JsongrammarPackage.JSON_GRAMMAR__DETAILED_GRAMMAR:
			return detailedGrammar != null;
		case JsongrammarPackage.JSON_GRAMMAR__NS_URI:
			return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nsURI: ");
		result.append(nsURI);
		result.append(')');
		return result.toString();
	}

} //JsonGrammarImpl
