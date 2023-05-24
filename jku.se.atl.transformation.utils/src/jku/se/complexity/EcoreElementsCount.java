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
		setClassesCount(
				metrics.getNoS() + 2* metrics.getNoO() + metrics.getNoMT() +
				metrics.getNoA() + metrics.getNoAP() + metrics.getNoSPPP() + metrics.getNoT() + metrics.getNoAI() );
	}
	
	public void calculateOperations(Metrics metrics) {
		setOperationsCount( 2 * metrics.getNoAP() + metrics.getNoP() + 4 * metrics.getNoSPPP() );
	}
	
	public void calculateFeatures(Metrics metrics) {
		setFeaturesCount( metrics.getNoS() + metrics.getNoA() + 2 * metrics.getNoAP() +
				metrics.getNoP() + metrics.getNoSPP() + 2 * metrics.getNoSPPP() + metrics.getNoTF() + metrics.getNoAI()); 
	}
	
	public void calculateCompexity(Metrics metrics) {
		calculateClasses(metrics);
		calculateFeatures(metrics);
		calculateOperations(metrics);
	}
}
