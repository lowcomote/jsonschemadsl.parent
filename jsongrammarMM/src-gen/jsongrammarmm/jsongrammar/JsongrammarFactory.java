/**
 */
package jsongrammarmm.jsongrammar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jsongrammarmm.jsongrammar.JsongrammarPackage
 * @generated
 */
public interface JsongrammarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsongrammarFactory eINSTANCE = jsongrammarmm.jsongrammar.impl.JsongrammarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Detailed Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detailed Grammar</em>'.
	 * @generated
	 */
	DetailedGrammar createDetailedGrammar();

	/**
	 * Returns a new object of class '<em>Json Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Grammar</em>'.
	 * @generated
	 */
	JsonGrammar createJsonGrammar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JsongrammarPackage getJsongrammarPackage();

} //JsongrammarFactory
