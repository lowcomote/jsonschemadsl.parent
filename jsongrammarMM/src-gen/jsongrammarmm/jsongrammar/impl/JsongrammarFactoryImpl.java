/**
 */
package jsongrammarmm.jsongrammar.impl;

import jsongrammarmm.jsongrammar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsongrammarFactoryImpl extends EFactoryImpl implements JsongrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JsongrammarFactory init() {
		try {
			JsongrammarFactory theJsongrammarFactory = (JsongrammarFactory) EPackage.Registry.INSTANCE
					.getEFactory(JsongrammarPackage.eNS_URI);
			if (theJsongrammarFactory != null) {
				return theJsongrammarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JsongrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsongrammarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case JsongrammarPackage.DETAILED_GRAMMAR:
			return createDetailedGrammar();
		case JsongrammarPackage.JSON_GRAMMAR:
			return createJsonGrammar();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedGrammar createDetailedGrammar() {
		DetailedGrammarImpl detailedGrammar = new DetailedGrammarImpl();
		return detailedGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonGrammar createJsonGrammar() {
		JsonGrammarImpl jsonGrammar = new JsonGrammarImpl();
		return jsonGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsongrammarPackage getJsongrammarPackage() {
		return (JsongrammarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JsongrammarPackage getPackage() {
		return JsongrammarPackage.eINSTANCE;
	}

} //JsongrammarFactoryImpl
