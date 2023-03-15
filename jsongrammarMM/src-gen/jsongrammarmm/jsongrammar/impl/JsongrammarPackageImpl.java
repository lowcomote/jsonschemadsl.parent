/**
 */
package jsongrammarmm.jsongrammar.impl;

import jsongrammarmm.jsongrammar.DetailedGrammar;
import jsongrammarmm.jsongrammar.JsonGrammar;
import jsongrammarmm.jsongrammar.JsongrammarFactory;
import jsongrammarmm.jsongrammar.JsongrammarPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsongrammarPackageImpl extends EPackageImpl implements JsongrammarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailedGrammarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonGrammarEClass = null;

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
	 * @see jsongrammarmm.jsongrammar.JsongrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JsongrammarPackageImpl() {
		super(eNS_URI, JsongrammarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JsongrammarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JsongrammarPackage init() {
		if (isInited)
			return (JsongrammarPackage) EPackage.Registry.INSTANCE.getEPackage(JsongrammarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJsongrammarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JsongrammarPackageImpl theJsongrammarPackage = registeredJsongrammarPackage instanceof JsongrammarPackageImpl
				? (JsongrammarPackageImpl) registeredJsongrammarPackage
				: new JsongrammarPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJsongrammarPackage.createPackageContents();

		// Initialize created meta-data
		theJsongrammarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJsongrammarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JsongrammarPackage.eNS_URI, theJsongrammarPackage);
		return theJsongrammarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailedGrammar() {
		return detailedGrammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_Keywords() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_CurlyBracesReferences() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_BracketsReferences() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_KeyValue() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_CurlyBracesEClass() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_BracketsEClass() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_RootEClass() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetailedGrammar_Tuples() {
		return (EReference) detailedGrammarEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonGrammar() {
		return jsonGrammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonGrammar_DetailedGrammar() {
		return (EReference) jsonGrammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonGrammar_NsURI() {
		return (EAttribute) jsonGrammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsongrammarFactory getJsongrammarFactory() {
		return (JsongrammarFactory) getEFactoryInstance();
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
		detailedGrammarEClass = createEClass(DETAILED_GRAMMAR);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__KEYWORDS);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__CURLY_BRACES_REFERENCES);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__BRACKETS_REFERENCES);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__KEY_VALUE);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__CURLY_BRACES_ECLASS);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__BRACKETS_ECLASS);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__ROOT_ECLASS);
		createEReference(detailedGrammarEClass, DETAILED_GRAMMAR__TUPLES);

		jsonGrammarEClass = createEClass(JSON_GRAMMAR);
		createEReference(jsonGrammarEClass, JSON_GRAMMAR__DETAILED_GRAMMAR);
		createEAttribute(jsonGrammarEClass, JSON_GRAMMAR__NS_URI);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(detailedGrammarEClass, DetailedGrammar.class, "DetailedGrammar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetailedGrammar_Keywords(), ecorePackage.getEStructuralFeature(), null, "keywords", null, 0,
				-1, DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_CurlyBracesReferences(), ecorePackage.getEReference(), null,
				"curlyBracesReferences", null, 0, -1, DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_BracketsReferences(), ecorePackage.getEReference(), null,
				"bracketsReferences", null, 0, -1, DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_KeyValue(), ecorePackage.getEAttribute(), null, "keyValue", null, 0, -1,
				DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_CurlyBracesEClass(), ecorePackage.getEClass(), null, "curlyBracesEClass",
				null, 0, -1, DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_BracketsEClass(), ecorePackage.getEClass(), null, "bracketsEClass", null, 0,
				-1, DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_RootEClass(), ecorePackage.getEClass(), null, "rootEClass", null, 1, 1,
				DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetailedGrammar_Tuples(), ecorePackage.getEClass(), null, "tuples", null, 0, -1,
				DetailedGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonGrammarEClass, JsonGrammar.class, "JsonGrammar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonGrammar_DetailedGrammar(), this.getDetailedGrammar(), null, "detailedGrammar", null, 1, 1,
				JsonGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJsonGrammar_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, JsonGrammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JsongrammarPackageImpl
