/**
 */
package relatedSchemas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import relatedSchemas.AllOf;
import relatedSchemas.AnyOf;
import relatedSchemas.ConstEnum;
import relatedSchemas.Contains;
import relatedSchemas.Dependencies;
import relatedSchemas.EnclosingSchema;
import relatedSchemas.IfThenElse;
import relatedSchemas.Not;
import relatedSchemas.OneOf;
import relatedSchemas.RelatedSchemasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enclosing Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getEnclosingSchema <em>Enclosing Schema</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getAnyOf <em>Any Of</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getOneOf <em>One Of</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getNot <em>Not</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getIfThenElse <em>If Then Else</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link relatedSchemas.impl.EnclosingSchemaImpl#getConstEnum <em>Const Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnclosingSchemaImpl extends MinimalEObjectImpl.Container implements EnclosingSchema {
	/**
	 * The cached value of the '{@link #getEnclosingSchema() <em>Enclosing Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingSchema()
	 * @generated
	 * @ordered
	 */
	protected EClass enclosingSchema;

	/**
	 * The cached value of the '{@link #getAnyOf() <em>Any Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOf()
	 * @generated
	 * @ordered
	 */
	protected AnyOf anyOf;

	/**
	 * The cached value of the '{@link #getAllOf() <em>All Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf()
	 * @generated
	 * @ordered
	 */
	protected AllOf allOf;

	/**
	 * The cached value of the '{@link #getOneOf() <em>One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf()
	 * @generated
	 * @ordered
	 */
	protected OneOf oneOf;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected Not not;

	/**
	 * The cached value of the '{@link #getIfThenElse() <em>If Then Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfThenElse()
	 * @generated
	 * @ordered
	 */
	protected IfThenElse ifThenElse;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected Dependencies dependencies;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected Contains contains;

	/**
	 * The cached value of the '{@link #getConstEnum() <em>Const Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstEnum()
	 * @generated
	 * @ordered
	 */
	protected ConstEnum constEnum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnclosingSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelatedSchemasPackage.Literals.ENCLOSING_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnclosingSchema() {
		if (enclosingSchema != null && enclosingSchema.eIsProxy()) {
			InternalEObject oldEnclosingSchema = (InternalEObject) enclosingSchema;
			enclosingSchema = (EClass) eResolveProxy(oldEnclosingSchema);
			if (enclosingSchema != oldEnclosingSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RelatedSchemasPackage.ENCLOSING_SCHEMA__ENCLOSING_SCHEMA, oldEnclosingSchema,
							enclosingSchema));
			}
		}
		return enclosingSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEnclosingSchema() {
		return enclosingSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingSchema(EClass newEnclosingSchema) {
		EClass oldEnclosingSchema = enclosingSchema;
		enclosingSchema = newEnclosingSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__ENCLOSING_SCHEMA, oldEnclosingSchema, enclosingSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyOf getAnyOf() {
		return anyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyOf(AnyOf newAnyOf, NotificationChain msgs) {
		AnyOf oldAnyOf = anyOf;
		anyOf = newAnyOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF, oldAnyOf, newAnyOf);
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
	public void setAnyOf(AnyOf newAnyOf) {
		if (newAnyOf != anyOf) {
			NotificationChain msgs = null;
			if (anyOf != null)
				msgs = ((InternalEObject) anyOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF, null, msgs);
			if (newAnyOf != null)
				msgs = ((InternalEObject) newAnyOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF, null, msgs);
			msgs = basicSetAnyOf(newAnyOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF,
					newAnyOf, newAnyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllOf getAllOf() {
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllOf(AllOf newAllOf, NotificationChain msgs) {
		AllOf oldAllOf = allOf;
		allOf = newAllOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF, oldAllOf, newAllOf);
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
	public void setAllOf(AllOf newAllOf) {
		if (newAllOf != allOf) {
			NotificationChain msgs = null;
			if (allOf != null)
				msgs = ((InternalEObject) allOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF, null, msgs);
			if (newAllOf != null)
				msgs = ((InternalEObject) newAllOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF, null, msgs);
			msgs = basicSetAllOf(newAllOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF,
					newAllOf, newAllOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOf getOneOf() {
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneOf(OneOf newOneOf, NotificationChain msgs) {
		OneOf oldOneOf = oneOf;
		oneOf = newOneOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF, oldOneOf, newOneOf);
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
	public void setOneOf(OneOf newOneOf) {
		if (newOneOf != oneOf) {
			NotificationChain msgs = null;
			if (oneOf != null)
				msgs = ((InternalEObject) oneOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF, null, msgs);
			if (newOneOf != null)
				msgs = ((InternalEObject) newOneOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF, null, msgs);
			msgs = basicSetOneOf(newOneOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF,
					newOneOf, newOneOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not getNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNot(Not newNot, NotificationChain msgs) {
		Not oldNot = not;
		not = newNot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT, oldNot, newNot);
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
	public void setNot(Not newNot) {
		if (newNot != not) {
			NotificationChain msgs = null;
			if (not != null)
				msgs = ((InternalEObject) not).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT, null, msgs);
			if (newNot != null)
				msgs = ((InternalEObject) newNot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT, null, msgs);
			msgs = basicSetNot(newNot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT, newNot,
					newNot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElse getIfThenElse() {
		return ifThenElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfThenElse(IfThenElse newIfThenElse, NotificationChain msgs) {
		IfThenElse oldIfThenElse = ifThenElse;
		ifThenElse = newIfThenElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE, oldIfThenElse, newIfThenElse);
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
	public void setIfThenElse(IfThenElse newIfThenElse) {
		if (newIfThenElse != ifThenElse) {
			NotificationChain msgs = null;
			if (ifThenElse != null)
				msgs = ((InternalEObject) ifThenElse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE, null, msgs);
			if (newIfThenElse != null)
				msgs = ((InternalEObject) newIfThenElse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE, null, msgs);
			msgs = basicSetIfThenElse(newIfThenElse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE,
					newIfThenElse, newIfThenElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependencies getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(Dependencies newDependencies, NotificationChain msgs) {
		Dependencies oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES, oldDependencies, newDependencies);
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
	public void setDependencies(Dependencies newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject) dependencies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject) newDependencies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES,
					newDependencies, newDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains getContains() {
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContains(Contains newContains, NotificationChain msgs) {
		Contains oldContains = contains;
		contains = newContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS, oldContains, newContains);
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
	public void setContains(Contains newContains) {
		if (newContains != contains) {
			NotificationChain msgs = null;
			if (contains != null)
				msgs = ((InternalEObject) contains).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS, null, msgs);
			if (newContains != null)
				msgs = ((InternalEObject) newContains).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS, null, msgs);
			msgs = basicSetContains(newContains, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS,
					newContains, newContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstEnum getConstEnum() {
		return constEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstEnum(ConstEnum newConstEnum, NotificationChain msgs) {
		ConstEnum oldConstEnum = constEnum;
		constEnum = newConstEnum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM, oldConstEnum, newConstEnum);
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
	public void setConstEnum(ConstEnum newConstEnum) {
		if (newConstEnum != constEnum) {
			NotificationChain msgs = null;
			if (constEnum != null)
				msgs = ((InternalEObject) constEnum).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM, null, msgs);
			if (newConstEnum != null)
				msgs = ((InternalEObject) newConstEnum).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM, null, msgs);
			msgs = basicSetConstEnum(newConstEnum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM,
					newConstEnum, newConstEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF:
			return basicSetAnyOf(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF:
			return basicSetAllOf(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF:
			return basicSetOneOf(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT:
			return basicSetNot(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE:
			return basicSetIfThenElse(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES:
			return basicSetDependencies(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS:
			return basicSetContains(null, msgs);
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM:
			return basicSetConstEnum(null, msgs);
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
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ENCLOSING_SCHEMA:
			if (resolve)
				return getEnclosingSchema();
			return basicGetEnclosingSchema();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF:
			return getAnyOf();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF:
			return getAllOf();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF:
			return getOneOf();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT:
			return getNot();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE:
			return getIfThenElse();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES:
			return getDependencies();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS:
			return getContains();
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM:
			return getConstEnum();
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
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ENCLOSING_SCHEMA:
			setEnclosingSchema((EClass) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF:
			setAnyOf((AnyOf) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF:
			setAllOf((AllOf) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF:
			setOneOf((OneOf) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT:
			setNot((Not) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE:
			setIfThenElse((IfThenElse) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES:
			setDependencies((Dependencies) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS:
			setContains((Contains) newValue);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM:
			setConstEnum((ConstEnum) newValue);
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
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ENCLOSING_SCHEMA:
			setEnclosingSchema((EClass) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF:
			setAnyOf((AnyOf) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF:
			setAllOf((AllOf) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF:
			setOneOf((OneOf) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT:
			setNot((Not) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE:
			setIfThenElse((IfThenElse) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES:
			setDependencies((Dependencies) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS:
			setContains((Contains) null);
			return;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM:
			setConstEnum((ConstEnum) null);
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
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ENCLOSING_SCHEMA:
			return enclosingSchema != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ANY_OF:
			return anyOf != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ALL_OF:
			return allOf != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__ONE_OF:
			return oneOf != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__NOT:
			return not != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__IF_THEN_ELSE:
			return ifThenElse != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__DEPENDENCIES:
			return dependencies != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONTAINS:
			return contains != null;
		case RelatedSchemasPackage.ENCLOSING_SCHEMA__CONST_ENUM:
			return constEnum != null;
		}
		return super.eIsSet(featureID);
	}

} //EnclosingSchemaImpl
