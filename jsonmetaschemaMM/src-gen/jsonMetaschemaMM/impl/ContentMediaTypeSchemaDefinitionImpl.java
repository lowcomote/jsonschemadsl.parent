/**
 */
package jsonMetaschemaMM.impl;

import jsonMetaschemaMM.ContentMediaTypeSchemaDefinition;
import jsonMetaschemaMM.JsonMetaschemaMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Media Type Schema Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jsonMetaschemaMM.impl.ContentMediaTypeSchemaDefinitionImpl#getContentMediaType <em>Content Media Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentMediaTypeSchemaDefinitionImpl extends KeywordDefinitionImpl implements ContentMediaTypeSchemaDefinition {
	/**
	 * The default value of the '{@link #getContentMediaType() <em>Content Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentMediaType() <em>Content Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMediaType()
	 * @generated
	 * @ordered
	 */
	protected String contentMediaType = CONTENT_MEDIA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentMediaTypeSchemaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonMetaschemaMMPackage.Literals.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentMediaType() {
		return contentMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentMediaType(String newContentMediaType) {
		String oldContentMediaType = contentMediaType;
		contentMediaType = newContentMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE, oldContentMediaType, contentMediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE:
				return getContentMediaType();
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
			case JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE:
				setContentMediaType((String)newValue);
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
			case JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE:
				setContentMediaType(CONTENT_MEDIA_TYPE_EDEFAULT);
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
			case JsonMetaschemaMMPackage.CONTENT_MEDIA_TYPE_SCHEMA_DEFINITION__CONTENT_MEDIA_TYPE:
				return CONTENT_MEDIA_TYPE_EDEFAULT == null ? contentMediaType != null : !CONTENT_MEDIA_TYPE_EDEFAULT.equals(contentMediaType);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (contentMediaType: ");
		result.append(contentMediaType);
		result.append(')');
		return result.toString();
	}

} //ContentMediaTypeSchemaDefinitionImpl
