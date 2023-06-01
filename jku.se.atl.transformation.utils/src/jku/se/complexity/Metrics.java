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
	
	
	private Integer NoEnum=0;
	
	private Integer NoConst=0;
	
	private Integer NoRef=0;
	
	
	
	private Integer numNoFalseSchemas =0;
	
	private Integer numScalarTypes =0;
	
	private Integer numObjectTypes =0;
	
	private Integer numArrayTypes =0;
	
	private Integer numTuples =0;
	
	private Integer numDefaultAdditionalProperties =0;
		
	private Integer numDefaultItems =0;
	
	private Integer numDefaultAdditionalItems =0;
	
	private Integer numMultiTypes=0;

	private Integer numTypesInMultyTypes=0;
	
	private Integer numExplicitAdditionalProperties=0;
	
	private Integer numNoFalseSchemasInProperties=0;
	
	private Integer numNoFalseSchemasInPatternProperties=0;
	
	private Integer numTuplesFields=0;
	
	private Integer numExplicitAdditionalItems=0;
	
	private Integer numPattern=0;
	
	
	
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

	public Integer getNoEnum() {
		return NoEnum;
	}

	public void setNoEnum(Integer noEnum) {
		NoEnum = noEnum;
	}

	public Integer addNoEnum(Integer noEnum) {
		setNoEnum(getNoEnum() + noEnum);
		return getNoEnum();
	}
	
	public Integer getNoConst() {
		return NoConst;
	}

	public void setNoConst(Integer noConst) {
		NoConst = noConst;
	}
	
	public Integer addNoConst(Integer noConst) {
		setNoConst(getNoConst() + noConst);
		return getNoConst();
	}

	public Integer getNoRef() {
		return NoRef;
	}

	public void setNoRef(Integer noRef) {
		NoRef = noRef;
	}
	
	public Integer addNoRef(Integer noRef) {
		setNoRef(getNoRef() + noRef);
		return getNoRef() ;
	}
	
	
	

	public Integer getNumNoFalseSchemas() {
		return numNoFalseSchemas;
	}

	public void setNumNoFalseSchemas(Integer numNoFalseSchemas) {
		this.numNoFalseSchemas = numNoFalseSchemas;
	}
	
	public Integer addNumNoFalseSchemas(Integer numNoFalseSchemas) {
		setNumNoFalseSchemas(getNumNoFalseSchemas() + numNoFalseSchemas);
		return getNumNoFalseSchemas();
	}

	public Integer getNumScalarTypes() {
		return numScalarTypes;
	}

	public void setNumScalarTypes(Integer numScalarTypes) {
		this.numScalarTypes = numScalarTypes;
	}
	
	public Integer addNumScalarTypes(Integer numScalarTypes) {
		setNumScalarTypes(getNumScalarTypes() + numScalarTypes);
		return  getNumScalarTypes();
	}

	public Integer getNumObjectTypes() {
		return numObjectTypes;
	}

	public void setNumObjectTypes(Integer numObjectTypes) {
		this.numObjectTypes = numObjectTypes;
	}
	
	public Integer addNumObjectTypes(Integer numObjectTypes) {
		setNumObjectTypes( getNumObjectTypes() + numObjectTypes);
		return getNumObjectTypes();
	}

	public Integer getNumArrayTypes() {
		return numArrayTypes;
	}

	public void setNumArrayTypes(Integer numArrayTypes) {
		this.numArrayTypes = numArrayTypes;
	}
	
	public Integer addNumArrayTypes(Integer numArrayTypes) {
		setNumArrayTypes(getNumArrayTypes() + numArrayTypes);
		return getNumArrayTypes();
	}

	public Integer getNumTuples() {
		return numTuples;
	}

	public void setNumTuples(Integer numTuples) {
		this.numTuples = numTuples;
	}
	
	public Integer addNumTuples(Integer numTuples) {
		setNumTuples(getNumTuples() + numTuples);
		return getNumTuples();
	}

	public Integer getNumDefaultAdditionalProperties() {
		return numDefaultAdditionalProperties;
	}

	public void setNumDefaultAdditionalProperties(Integer numDefaultAdditionalProperties) {
		this.numDefaultAdditionalProperties = numDefaultAdditionalProperties;
	}
	
	public Integer addNumDefaultAdditionalProperties(Integer numDefaultAdditionalProperties) {
		setNumDefaultAdditionalProperties(getNumDefaultAdditionalProperties() + numDefaultAdditionalProperties);
		return getNumDefaultAdditionalProperties();
	}

	public Integer getNumDefaultItems() {
		return numDefaultItems;
	}

	public void setNumDefaultItems(Integer numDefaultItems) {
		this.numDefaultItems = numDefaultItems;
	}
	
	public Integer addNumDefaultItems(Integer numDefaultItems) {
		setNumDefaultItems(getNumDefaultItems() + numDefaultItems);
		return getNumDefaultItems();
	}

	public Integer getNumDefaultAdditionalItems() {
		return numDefaultAdditionalItems;
	}

	public void setNumDefaultAdditionalItems(Integer numDefaultAdditionalItems) {
		this.numDefaultAdditionalItems = numDefaultAdditionalItems;
	}
	
	public Integer addNumDefaultAdditionalItems(Integer numDefaultAdditionalItems) {
		setNumDefaultAdditionalItems(getNumDefaultAdditionalItems() + numDefaultAdditionalItems);
		return getNumDefaultAdditionalItems();
	}

	public Integer getNumMultiTypes() {
		return numMultiTypes;
	}

	public void setNumMultiTypes(Integer numMultiTypes) {
		this.numMultiTypes = numMultiTypes;
	}
	
	public Integer addNumMultiTypes(Integer numMultiTypes) {
		setNumMultiTypes(getNumMultiTypes() + numMultiTypes);
		return getNumMultiTypes();
	}

	
	
	public Integer getNumTypesInMultyTypes() {
		return numTypesInMultyTypes;
	}

	public void setNumTypesInMultyTypes(Integer numTypesInMultyTypes) {
		this.numTypesInMultyTypes = numTypesInMultyTypes;
	}

	public Integer addNumTypesInMultyTypes(Integer numTypesInMultyTypes) {
		setNumTypesInMultyTypes(getNumTypesInMultyTypes() + numTypesInMultyTypes);
		return getNumTypesInMultyTypes();
	}

	public Integer getNumExplicitAdditionalProperties() {
		return numExplicitAdditionalProperties;
	}

	public void setNumExplicitAdditionalProperties(Integer numExplicitAdditionalProperties) {
		this.numExplicitAdditionalProperties = numExplicitAdditionalProperties;
	}
	
	public Integer addNumExplicitAdditionalProperties(Integer numExplicitAdditionalProperties) {
		setNumExplicitAdditionalProperties(getNumExplicitAdditionalProperties() + numExplicitAdditionalProperties);
		return getNumExplicitAdditionalProperties();
	}

	public Integer getNumNoFalseSchemasInProperties() {
		return numNoFalseSchemasInProperties;
	}

	public void setNumNoFalseSchemasInProperties(Integer numNoFalseSchemasInProperties) {
		this.numNoFalseSchemasInProperties = numNoFalseSchemasInProperties;
	}
	
	public Integer addNumNoFalseSchemasInProperties(Integer numNoFalseSchemasInProperties) {
		setNumNoFalseSchemasInProperties(getNumNoFalseSchemasInProperties() + numNoFalseSchemasInProperties);
		return getNumNoFalseSchemasInProperties();
	}

	public Integer getNumNoFalseSchemasInPatternProperties() {
		return numNoFalseSchemasInPatternProperties;
	}

	public void setNumNoFalseSchemasInPatternProperties(Integer numNoFalseSchemasInPatternProperties) {
		this.numNoFalseSchemasInPatternProperties = numNoFalseSchemasInPatternProperties;
	}
	
	
	public Integer addNumNoFalseSchemasInPatternProperties(Integer numNoFalseSchemasInPatternProperties) {
		setNumNoFalseSchemasInPatternProperties(getNumNoFalseSchemasInPatternProperties() + numNoFalseSchemasInPatternProperties);
		return getNumNoFalseSchemasInPatternProperties();
	}

	public Integer getNumTuplesFields() {
		return numTuplesFields;
	}

	public void setNumTuplesFields(Integer numTuplesFields) {
		this.numTuplesFields = numTuplesFields;
	}
	
	public Integer addNumTuplesFields(Integer numTuplesFields) {
		setNumTuplesFields( getNumTuplesFields() + numTuplesFields);
		return  getNumTuplesFields();
	}

	public Integer getNumExplicitAdditionalItems() {
		return numExplicitAdditionalItems;
	}

	public void setNumExplicitAdditionalItems(Integer numExplicitAdditionalItems) {
		this.numExplicitAdditionalItems = numExplicitAdditionalItems;
	}
	
	public Integer addNumExplicitAdditionalItems(Integer numExplicitAdditionalItems) {
		setNumExplicitAdditionalItems(getNumExplicitAdditionalItems()+ numExplicitAdditionalItems) ;
		return getNumExplicitAdditionalItems();
	}

	public Integer getNumPattern() {
		return numPattern;
	}

	public void setNumPattern(Integer numPattern) {
		this.numPattern = numPattern;
	}
	
	public Integer addNumPattern(Integer numPattern) {
		setNumPattern(getNumPattern() + numPattern);
		return getNumPattern();
	}
	
	
	
	
	
}
