/**
 */
package jsonMM.impl;

import jsonMM.ArrayValue;
import jsonMM.BooleanValue;
import jsonMM.JsonDocument;
import jsonMM.JsonMMFactory;
import jsonMM.JsonMMPackage;
import jsonMM.KeyValuePair;
import jsonMM.NullEnum;
import jsonMM.NullValue;
import jsonMM.NumberValue;
import jsonMM.ObjectValue;
import jsonMM.StringValue;
import jsonMM.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonMMPackageImpl extends EPackageImpl implements JsonMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nullEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jsonMM.JsonMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JsonMMPackageImpl() {
		super(eNS_URI, JsonMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JsonMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JsonMMPackage init() {
		if (isInited)
			return (JsonMMPackage) EPackage.Registry.INSTANCE.getEPackage(JsonMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJsonMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JsonMMPackageImpl theJsonMMPackage = registeredJsonMMPackage instanceof JsonMMPackageImpl
				? (JsonMMPackageImpl) registeredJsonMMPackage
				: new JsonMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJsonMMPackage.createPackageContents();

		// Initialize created meta-data
		theJsonMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJsonMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JsonMMPackage.eNS_URI, theJsonMMPackage);
		return theJsonMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringValue__Equals__Object() {
		return stringValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Value() {
		return (EReference) arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayValue__Equals__Object() {
		return arrayValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValue() {
		return nullValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullValue_Value() {
		return (EAttribute) nullValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNullValue__Equals__Object() {
		return nullValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberValue_Value() {
		return (EAttribute) numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumberValue__Equals__Object() {
		return numberValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonDocument() {
		return jsonDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonDocument_Value() {
		return (EReference) jsonDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJsonDocument__Equals__Object() {
		return jsonDocumentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectValue() {
		return objectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectValue_Keyvaluepair() {
		return (EReference) objectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectValue__Equals__Object() {
		return objectValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute) booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooleanValue__Equals__Object() {
		return booleanValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__Equals__Object() {
		return valueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValuePair_Key() {
		return (EAttribute) keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValuePair_Value() {
		return (EReference) keyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyValuePair__Equals__Object() {
		return keyValuePairEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNullEnum() {
		return nullEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonMMFactory getJsonMMFactory() {
		return (JsonMMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);
		createEOperation(stringValueEClass, STRING_VALUE___EQUALS__OBJECT);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__VALUE);
		createEOperation(arrayValueEClass, ARRAY_VALUE___EQUALS__OBJECT);

		nullValueEClass = createEClass(NULL_VALUE);
		createEAttribute(nullValueEClass, NULL_VALUE__VALUE);
		createEOperation(nullValueEClass, NULL_VALUE___EQUALS__OBJECT);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__VALUE);
		createEOperation(numberValueEClass, NUMBER_VALUE___EQUALS__OBJECT);

		jsonDocumentEClass = createEClass(JSON_DOCUMENT);
		createEReference(jsonDocumentEClass, JSON_DOCUMENT__VALUE);
		createEOperation(jsonDocumentEClass, JSON_DOCUMENT___EQUALS__OBJECT);

		objectValueEClass = createEClass(OBJECT_VALUE);
		createEReference(objectValueEClass, OBJECT_VALUE__KEYVALUEPAIR);
		createEOperation(objectValueEClass, OBJECT_VALUE___EQUALS__OBJECT);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);
		createEOperation(booleanValueEClass, BOOLEAN_VALUE___EQUALS__OBJECT);

		valueEClass = createEClass(VALUE);
		createEOperation(valueEClass, VALUE___EQUALS__OBJECT);

		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEReference(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);
		createEOperation(keyValuePairEClass, KEY_VALUE_PAIR___EQUALS__OBJECT);

		// Create enums
		nullEnumEEnum = createEEnum(NULL_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stringValueEClass.getESuperTypes().add(this.getValue());
		arrayValueEClass.getESuperTypes().add(this.getValue());
		nullValueEClass.getESuperTypes().add(this.getValue());
		numberValueEClass.getESuperTypes().add(this.getValue());
		objectValueEClass.getESuperTypes().add(this.getValue());
		booleanValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getStringValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1,
				!IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Value(), this.getValue(), null, "value", null, 0, -1, ArrayValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArrayValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullValue_Value(), this.getNullEnum(), "value", null, 1, 1, NullValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNullValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, NumberValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNumberValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(jsonDocumentEClass, JsonDocument.class, "JsonDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonDocument_Value(), this.getValue(), null, "value", null, 1, 1, JsonDocument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getJsonDocument__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(objectValueEClass, ObjectValue.class, "ObjectValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectValue_Keyvaluepair(), this.getKeyValuePair(), null, "keyvaluepair", null, 0, -1,
				ObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getObjectValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBooleanValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getValue__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 1, 1, KeyValuePair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValuePair_Value(), this.getValue(), null, "value", null, 1, 1, KeyValuePair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getKeyValuePair__Equals__Object(), ecorePackage.getEBoolean(), "equals", 1, 1, !IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 1, 1, !IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nullEnumEEnum, NullEnum.class, "NullEnum");
		addEEnumLiteral(nullEnumEEnum, NullEnum.NULL);

		// Create resource
		createResource(eNS_URI);
	}

} //JsonMMPackageImpl
