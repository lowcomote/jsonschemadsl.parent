package tests;

//import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.junit.jupiter.api.Test;
//import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import jku.se.complexity.Complexity;
import jku.se.complexity.EcoreElementsCount;
import jku.se.complexity.Metrics;

public class TestComplexity {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	public void testCalculateComplexity() {
		ResourceSet reset = new ResourceSetImpl();
		//reset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		Resource resource = reset.getResource(URI.createURI("platform:/plugin/tests/resources/githubwf.jschema"), true);
		EObject root = resource.getContents().get(0);
		Complexity complexity = new Complexity();
		EcoreElementsCount ecoreElementsCount = new EcoreElementsCount();
	
		Metrics metrics = complexity.countMetrics( root);
		ecoreElementsCount.calculateCompexity(metrics);
		
		System.out.println("EClasses :"+ecoreElementsCount.getClassesCount());
		System.out.println("EFeatures :"+ecoreElementsCount.getFeaturesCount());
		System.out.println("EOperations :"+ecoreElementsCount.getOperationsCount());
		
		ResourceSet ecoreReset = new ResourceSetImpl();
		Resource ecoreResource = ecoreReset.getResource(URI.createURI("platform:/plugin/tests/resources/githubwfOpt.ecore"), true);
		EObject ecoreRoot = ecoreResource.getContents().get(0);
		
		//System.out.println("List :"+ecoreRoot.eContents().get(0).eContents().size());
		
		TreeIterator<EObject> ecoreRootIterator = ecoreRoot.eAllContents();
		Integer eClassesNumber=0;
		Integer eFeaturesNumber=0;
		Integer eOperationsNumber=0;
		while (ecoreRootIterator.hasNext()) {
			EObject element = ecoreRootIterator.next();
			if (EClass.class.isInstance(element)) {
				eClassesNumber++;
			}
			if (EStructuralFeature.class.isInstance(element)) {
				eFeaturesNumber++;
			}
			if (EOperation.class.isInstance(element)) {
				eOperationsNumber++;
			}
		}
		System.out.println("eClassesNumber :"+eClassesNumber);
		System.out.println("eFeaturesNumber :"+eFeaturesNumber);
		System.out.println("eOperationsNumber :"+eOperationsNumber);
		
		assertTrue("EClasses number wrong", eClassesNumber==ecoreElementsCount.getClassesCount());
		assertTrue("EFeatures number wrong", eFeaturesNumber==ecoreElementsCount.getFeaturesCount());
		assertTrue("EOperations number wrong", eOperationsNumber==ecoreElementsCount.getOperationsCount());
		
	}
}
