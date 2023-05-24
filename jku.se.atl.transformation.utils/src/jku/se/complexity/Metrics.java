package jku.se.complexity;

public class Metrics {
	/**
	 * Number of Scalars defined with the keyword "type" (i.e., integer, number, string, boolean, and null ). This metric only counts the
	 *	scalars declared at the root level, or directly nested under the keyword "properties"
	 */
	private Integer NoS=0;
	
	/**
	 * Number of Objects type i.e., "type":"object".
	 */
	private Integer NoO=0;
	
	/**
	 * Number of Multi-T ype, e.g., "type":["object", "string"]
	 */
	private Integer NoMT=0;
	
	/**
	 * Number of Arrays that are not a Tuple (e.g., "type": "array", "items":{"type": "string"}).
	 */
	private Integer NoA=0;
	
	/**
	 * Number of declared Tuples
	 */
	private Integer NoT=0;
	
	/**
	 * N umber of Tuple Fields. 
	 */
	private Integer NoTF=0;
	
	/**
	 *  Number of times Additional Properties (i.e., the keyword "additionalProperties") is defined as true, i.e., the default value
	 *	or any other type of schema not equal to false. This means that not defined key-value pairs properties are allowed.
	 */
	private Integer NoAP=0;
	
	/**
	 * Number of key-schema Pairs defined within Properties.
	 */
	private Integer NoSPP=0;
	
	/**
	 * Number of key-schema pairs defined within Pattern Properties (i.e., "patternProperties")
	 */
	private Integer NoSPPP=0; 
	
	/**
	 * Number of Properties (i.e, occurrences of "properties").
	 */
	private Integer NoP=0; 
	
	/**
	 * Number of times Additional Items ("additionalItems") maybe a true boolean schema i.e., the default value, or any other type of
	 *	schema not equal to false. This means that values not present in a tuple are allowed
	 */
	private Integer NoAI=0;

	public Integer getNoS() {
		return NoS;
	}

	public void setNoS(Integer noS) {
		NoS = noS;
	}
	
	public Integer addNoS(Integer noS) {
		setNoS(getNoS()+ noS); 
		return getNoS();
	}

	public Integer getNoO() {
		return NoO;
	}

	public void setNoO(Integer noO) {
		NoO = noO;
	}
	
	
	public Integer addNoO(Integer noO) {
		 setNoO(getNoO()+noO);
		 return getNoO();
	}

	public Integer getNoMT() {
		return NoMT;
	}

	public void setNoMT(Integer noMT) {
		NoMT = noMT;
	}
	
	public Integer addNoMT(Integer noMT) {
		setNoMT(getNoMT()+noMT);
		return getNoMT();
	}

	public Integer getNoA() {
		return NoA;
	}

	public void setNoA(Integer noA) {
		NoA = noA;
	}
	
	public Integer addNoA(Integer noA) {
		setNoA(getNoA() + noA);
		return getNoA();
	}

	public Integer getNoT() {
		return NoT;
	}

	public void setNoT(Integer noT) {
		NoT = noT;
	}

	public Integer addNoT(Integer noT) {
		setNoT( getNoT()+ noT);
		return  getNoT();
	}
	
	public Integer getNoTF() {
		return NoTF;
	}

	public void setNoTF(Integer noTF) {
		NoTF = noTF;
	}
	
	public Integer addNoTF(Integer noTF) {
		setNoTF(getNoTF() + noTF);
		return getNoTF();
	}

	public Integer getNoAI() {
		return NoAI;
	}

	public void setNoAI(Integer noAI) {
		NoAI = noAI;
	}
	
	
	public Integer addNoAI(Integer noAI) {
		setNoAI(getNoAI() + noAI);
		return getNoAI();
	}

	public Integer getNoAP() {
		return NoAP;
	}

	public void setNoAP(Integer noAP) {
		NoAP = noAP;
	}
	
	public Integer addNoAP(Integer noAP) {
		setNoAP(getNoAP() + noAP);
		return getNoAP();
	}

	public Integer getNoP() {
		return NoP;
	}

	public void setNoP(Integer noP) {
		NoP = noP;
	}
	
	public Integer addNoP(Integer noP) {
		setNoP(getNoP() + noP);
		return getNoP();
	}

	public Integer getNoSPP() {
		return NoSPP;
	}

	public void setNoSPP(Integer noSPP) {
		NoSPP = noSPP;
	}
	
	public Integer addNoSPP(Integer noSPP) {
		setNoSPP(getNoSPP() + noSPP);
		return getNoSPP();
	}

	public Integer getNoSPPP() {
		return NoSPPP;
	}

	public void setNoSPPP(Integer noSPPP) {
		NoSPPP = noSPPP;
	}
	
	public Integer addNoSPPP(Integer noSPPP) {
		setNoSPPP(getNoSPPP() + noSPPP);
		return getNoSPPP();
	}
	
	
	
	
	
	
}
