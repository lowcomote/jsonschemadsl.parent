/**
 */
package jsonMetaschemaMM.jsonMetaschemaMM.impl;

import jsonMetaschemaMM.jsonMetaschemaMM.ContentEncodingSchemaDefinition;
import jsonMetaschemaMM.jsonMetaschemaMM.JsonMetaschemaMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Encoding Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.jsonMetaschemaMM.impl.ContentEncodingSchemaDefinitionImpl#getContentEncoding <em>Content Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentEncodingSchemaDefinitionImpl extends KeywordDefinitionImpl
		implements ContentEncodingSchemaDefinition {
	/**
	 * The default value of the '{@link #getContentEncoding() <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentEncoding() <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentEncoding()
	 * @generated
	 * @ordered
	 */
	protected String contentEncoding = CONTENT_ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentEncodingSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.CONTENT_ENCODING_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentEncoding() {
		return contentEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentEncoding(String newContentEncoding) {
		String oldContentEncoding = contentEncoding;
		contentEncoding = newContentEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING, oldContentEncoding,
					contentEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING:
			return getContentEncoding();
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
		case JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING:
			setContentEncoding((String) newValue);
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
		case JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING:
			setContentEncoding(CONTENT_ENCODING_EDEFAULT);
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
		case JsonMetaschemaMMPackage.CONTENT_ENCODING_SCHEMA_DEFINITION__CONTENT_ENCODING:
			return CONTENT_ENCODING_EDEFAULT == null ? contentEncoding != null
					: !CONTENT_ENCODING_EDEFAULT.equals(contentEncoding);
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
		result.append(" (contentEncoding: ");
		result.append(contentEncoding);
		result.append(')');
		return result.toString();
	}

} //ContentEncodingSchemaDefinitionImpl
