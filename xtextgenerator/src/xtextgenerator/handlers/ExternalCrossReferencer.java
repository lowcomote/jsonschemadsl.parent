package xtextgenerator.handlers;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ExternalCrossReferencer extends EcoreUtil.ExternalCrossReferencer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ExternalCrossReferencer(ResourceSet resourceSet) {
		super(resourceSet);
	}
	
	@Override
    public Map<EObject, Collection<EStructuralFeature.Setting>> findExternalCrossReferences()
    {
      return super.findExternalCrossReferences();
    }

}
