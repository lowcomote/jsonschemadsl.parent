package jku.se.complexity;

public class EcoreElementsCount {

	
	private Integer operationsCount =0;
	private Integer featuresCount=0;
	private Integer classesCount =0;
	
	
	
	public Integer getOperationsCount() {
		return operationsCount;
	}
	public void setOperationsCount(Integer operationsCount) {
		this.operationsCount = operationsCount;
	}
	public Integer getFeaturesCount() {
		return featuresCount;
	}
	public void setFeaturesCount(Integer featuresCount) {
		this.featuresCount = featuresCount;
	}
	public Integer getClassesCount() {
		return classesCount;
	}
	public void setClassesCount(Integer classesCount) {
		this.classesCount = classesCount;
	}
	
	public void calculateClasses(Metrics metrics) {
		//setClassesCount(metrics.getNoS() + 2* metrics.getNoO() + metrics.getNoMT() + metrics.getNoA() + metrics.getNoAP() + metrics.getNoSPPP() + metrics.getNoT() + metrics.getNoAI() + metrics.getNoEnum() + metrics.getNoConst() + metrics.getNoRef());
		setClassesCount(
				metrics.getNumNoFalseSchemas()+ 
				metrics.getNumObjectTypes()+
				metrics.getNumTuples()+
				metrics.getNumDefaultAdditionalProperties()+
				metrics.getNumDefaultItems()+
				metrics.getNumDefaultAdditionalItems()+ 
				metrics.getNumMultiTypes()+
				metrics.getNumTypesInMultyTypes()
			);
	}
	
	public void calculateOperations(Metrics metrics) {
		//setOperationsCount( 2 * metrics.getNoAP() + metrics.getNoP() + 4 * metrics.getNoSPPP() );
		setOperationsCount( 
				2 * (metrics.getNumExplicitAdditionalProperties() + metrics.getNumDefaultAdditionalProperties()) +
				metrics.getNumObjectTypes() + 
				metrics.getNumTuples()+
				(4 * metrics.getNumNoFalseSchemasInPatternProperties() )+
				metrics.getNumPattern()
			);
	}
	
	public void calculateFeatures(Metrics metrics) {
//		setFeaturesCount( metrics.getNoS() + metrics.getNoA() + 2 * metrics.getNoAP() +
//				metrics.getNoP() + metrics.getNoSPP() + 2 * metrics.getNoSPPP() + metrics.getNoTF() + metrics.getNoAI()); 
		setFeaturesCount(
				metrics.getNumNoFalseSchemas()+  
//				metrics.getNumObjectTypes()+
				metrics.getNumNoFalseSchemasInPatternProperties()+ // keys
				metrics.getNumNoFalseSchemasInProperties()+ // derived features
				metrics.getNumExplicitAdditionalProperties()+ // keys
				(2*metrics.getNumDefaultAdditionalProperties())+ // key and reference to JSON Document
//				metrics.getNumArrayTypes()+
				metrics.getNumDefaultItems()+
				metrics.getNumTuplesFields()+ // containment from tuple class to schemas in items
				metrics.getNumExplicitAdditionalItems()+ // containment from Tuple class to AdditionalItems Class
				(2*metrics.getNumDefaultAdditionalItems())+
//				metrics.getNumMultiTypes()+
				metrics.getNumTypesInMultyTypes()
			);
	}
	
	public void calculateCompexity(Metrics metrics) {
		calculateClasses(metrics);
		calculateFeatures(metrics);
		calculateOperations(metrics);
	}
}
