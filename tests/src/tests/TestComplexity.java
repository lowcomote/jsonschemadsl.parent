package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;

import jku.se.complexity.Complexity;
import jku.se.complexity.EcoreElementsCount;
import jku.se.complexity.Metrics;

class TestComplexity {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	void testCalculateComplexity() {
		ResourceSet reset = new ResourceSetImpl();
		Resource resource = reset.getResource(URI.createURI("platform:/plugin/complexitytest/examples/githubwf.jschema"), true);
		EObject root = resource.getContents().get(0);
		Complexity complexity = new Complexity();
		EcoreElementsCount ecoreElementsCount = new EcoreElementsCount();
	
		Metrics metrics = complexity.countMetrics( root);
		ecoreElementsCount.calculateCompexity(metrics);
		
		System.out.println("EClasses :"+ecoreElementsCount.getClassesCount());
		System.out.println("EFeatures :"+ecoreElementsCount.getFeaturesCount());
		System.out.println("EOperationss :"+ecoreElementsCount.getOperationsCount());
	}
}
