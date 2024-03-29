package xtextgenerator.wizard

import org.eclipse.xtext.xtext.wizard.WizardConfiguration
import org.eclipse.emf.ecore.EClassifier
//import static extension org.eclipse.xtext.xtext.wizard.ecore2xtext.Ecore2XtextExtensions.*
import static extension org.eclipse.xtext.xtext.wizard.ecore2xtext.UniqueNameUtil.*
import org.eclipse.emf.ecore.EClass
import java.util.List
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EDataType
import jsongrammarmm.jsongrammar.DetailedGrammar
import jsongrammarmm.jsongrammar.JsonGrammar
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.resources.IFile
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.BaseInternalContentAssistParser.IFollowElementFactory
import java.util.ArrayList
import org.eclipse.emf.ecore.EAnnotation
import java.util.Set
import java.util.HashSet
import static extension xtextgenerator.ui.utils.Ecore2XtextJSONExtensions.*
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration

class Ecore2XtextJSONGrammarCreator {
	
	DetailedGrammar detailedJsonGrammar = null;
	Set<String> keywords = new HashSet<String>();
	
	new(DetailedGrammar detailedJsonGrammar) {
		this.detailedJsonGrammar =  detailedJsonGrammar
	}
	
	
	
	def grammar(WizardConfiguration config, String languageName) {
		val Ecore2XtextConfiguration ecore2Xtext = config.ecore2Xtext
		val EClass rootElementClass = config.ecore2Xtext.rootElementClass
//		val it = config.ecore2Xtext
//		val XtextJsonGrammarProjectInfo xtextJsonGrammarProject = config as XtextJsonGrammarProjectInfo;
//		this.detailedJsonGrammar = loadJsonGrammar(xtextJsonGrammarProject.jsonGrammarFile,
//				config.ecore2Xtext.rootElementClass.eResource.resourceSet
//		).detailedGrammar;
		ecore2Xtext.defaultEPackageInfo.clearUniqueNames
		'''
			// automatically generated by Xtext JSON Grammar
			grammar «languageName» with org.eclipse.xtext.common.Terminals
			
			«FOR it: ecore2Xtext.allReferencedEPackages»
				import "«nsURI»" «IF uniqueName !== null && uniqueName != ""»as «uniqueName»«ENDIF»
			«ENDFOR»
			
			«rootElementClass.rules»
			«FOR it:ecore2Xtext.allDispatcherRuleClasses.but(rootElementClass)»
				
				«subClassDispatcherRule»
			«ENDFOR»
			«FOR it:ecore2Xtext.allConcreteRuleClassifiers.but(rootElementClass)»
				
				«rule(it)»
			«ENDFOR»
			
			«overwriteINT»
			
			«writeVALID_STRING»
			
			«overwriteSTRING()»
			
			«writeTerminalE_INT»
			
			«writeKeywords»
			
			«writeTerminalE_DOUBLE»
			
		'''
	}
	
	def <T extends EClassifier> List<T> but(Iterable<T> classes, EClassifier it) {
		val retVal = classes.toList
		retVal.remove(it)
		return retVal
	}
	 
	def subClassDispatcherRule(EClass it) {
		'''
			«IF needsDispatcherRule»
				«uniqueName» returns «fqn»:
					«subClassAlternatives»;
			«ENDIF»
		'''
	}
	/**
	 * TODO work here with subclasses(eClazz) to have a list oredered as (1)Properties, (2) PatternProperties, (3) AdditionalProperties 
	 */
	def subClassAlternatives(EClass eClazz) {
		var list = newArrayList(eClazz)+subClasses(eClazz);
		list = orderedSubClasses(list);
		list=list.filter([c|needsConcreteRule(c)]);
		list.map([
			if(needsSyntacticPredicate){
				"=>" + concreteRuleName
			}else{
				concreteRuleName
			}
		]).join(" | ")
		

	}
	
	def needsSyntacticPredicate(EClass eClazz){
//		isAdditionalProperty(eClazz) || isPatternProperty(eClazz) || isIntegerInArrayOfTypes(eClazz)
		/**
		 * We put a syntactic predicate to number in array of types since also integer are mapped as Double
		 */
		isAdditionalProperty(eClazz) || isPatternProperty(eClazz) || isNumberInArrayOfTypes(eClazz) 
	}
	
	/**
	 * An Integer in an Array Of Types could generate an ambiguous grammar if there is also a Number 
	 */
	private def isIntegerInArrayOfTypes(EClass eClazz){
		eClazz.EAnnotations.exists[annotation | annotation.details.get("ArrayOfTypes").equals("integer")]
	}
	
	/**
	 * A  Number in an Array Of Types could generate an ambiguous grammar if there is also an Integer 
	 * because both are transformed to a Double, because for example 2.0 is a valid integer in JSON Schema
	 */
	def isNumberInArrayOfTypes(EClass eClazz){
//		eClazz.EAnnotations.exists[annotation | annotation.details.get("ArrayOfTypes").equals("number")]
		eClazz.EAnnotations.exists[annotation | annotation.details.get("ArrayOfTypes")!==null && annotation.details.get("ArrayOfTypes").equals("number")]
	}
	
	def isAdditionalProperty(EClass eClazz){
		eClazz.EAnnotations.exists[annotation | annotation.details.containsKey('AdditionalProperties')]
	}
	def isPatternProperty(EClass eClazz){
		eClazz.EAnnotations.exists[annotation | annotation.details.containsKey('PatternProperties')]
	}
	
	/**
	 * if the EClass is is the concrete type of an array of types schema in a PatternProperties
	 */
//	def isArrayOfTypesInPatternProperties(EClass eClazz){
//		var boolean synpred = false
//		
//		val boolean isArrayOfType = eClazz.EAnnotations.exists[annotation | annotation.source==='ArrayOfTypes'] 
//		
//		if(isArrayOfType){		
//			val Iterable<EClass> patternpropertiesIterable = eClazz.getEPackage.getEClassifiers.filter(EClass)
//				.filter(c|c.EAnnotations.exists[annotation | annotation.source==='PatternProperties'])
//		
//			if(!patternpropertiesIterable.empty){
//				synpred = patternpropertiesIterable.exists[c|c.EReferences.exists[r|r.EReferenceType.abstract && eClazz.ESuperTypes.contains(r.EReferenceType)]]
//			}
//		
//		}
//		return  synpred;
//		
//		
////		eClazz.EAnnotations.exists[annotation | annotation.source==='ArrayOfTypes'] && 
////		!eClazz.getEPackage.getEClassifiers.filter(EClass)
////		.filter(c|c.EAnnotations.exists[annotation | annotation.source==='PatternProperties'])
////		.filter(c|c.EReferences.exists[r|r.EReferenceType.abstract && eClazz.ESuperTypes.contains(eClazz)]).empty;
//
//	}
	
	def orderedSubClasses(Iterable<EClass> alternativeEClasses){
		var propertiesEClasses = new ArrayList<EClass>();
		var patternPropertiesEClasses = new ArrayList<EClass>();
		var EClass additionalPropertiesEClass =null;
		var EClass numberInArrayEClass =null;
		var orderedSubClasses = new ArrayList<EClass>();
		for (eClass : alternativeEClasses){
			var boolean isNumnberInArrayPatternOrAdditionalProperty = false;
			if(!isNumnberInArrayPatternOrAdditionalProperty){
				if(isAdditionalProperty(eClass)){
					isNumnberInArrayPatternOrAdditionalProperty=true;
					additionalPropertiesEClass=eClass;
				}else if (isPatternProperty(eClass)){
					isNumnberInArrayPatternOrAdditionalProperty=true;
					patternPropertiesEClasses.add(eClass);
				}else if(isNumberInArrayOfTypes(eClass)){
					isNumnberInArrayPatternOrAdditionalProperty=true;
					numberInArrayEClass=eClass;
				}

			}
			if(!isNumnberInArrayPatternOrAdditionalProperty){
				propertiesEClasses.add(eClass);
			}
		}
		if(numberInArrayEClass !== null){
			orderedSubClasses.add(numberInArrayEClass);
		}
		orderedSubClasses.addAll(propertiesEClasses);
		orderedSubClasses.addAll(patternPropertiesEClasses);
		if(additionalPropertiesEClass !== null){
			orderedSubClasses.add(additionalPropertiesEClass);
		}
		orderedSubClasses
	}
	
	def assigment(EStructuralFeature it) {
		'''	
			«assignmentKeywordJSON(it)»«IF it instanceof EReference»«it.openParenthesis»«ENDIF»«IF(!required)»(«ENDIF»«IF many»«IF containment»«ELSE»'(' «ENDIF»«ENDIF»«name.quoteIfNeccesary»«assignmentOperator»«assignedTerminal»«IF many» ( "," «name.quoteIfNeccesary»«assignmentOperator»«assignedTerminal»)* «IF containment»«ELSE»')' «ENDIF»«ENDIF»«IF (!required)»)?«ENDIF»«IF it instanceof EReference»«it.closeParenthesis»«ENDIF»
			«IF it instanceof EAttribute»
				«IF it.isKeyValue»
					«"'"»:«"'"»
				«ENDIF»
			«ENDIF»
		'''
	}
	
	def assignedTerminal(EStructuralFeature it) {
		switch(it) {
			EAttribute:
				/**
				 * changed by Alessandro 16/10/2022
				 * it.assignedJSONRuleCall
				 */ 
				 it.assignedJSONRuleCall
//				if(it.assignedJSONRuleCall==="EString") "VALID_STRING"
//				else it.assignedJSONRuleCall
				
			EReference:
				if(containment)
					it.EReferenceType.uniqueName
				else
					'''[«it.EReferenceType.fqn»|EString]'''
			default:
				''''''
		}
	}

// I thinkthat we do not need the prefix..
//	def assignmentOperator(EStructuralFeature it) {
//		'''«IF many»+=«ELSEIF isBoolean(EType) && prefixBooleanFeature»?=«ELSE»=«ENDIF»'''
//	}
	
	def assignmentOperator(EStructuralFeature it) {
		'''«IF many»+=«ELSE»=«ENDIF»'''
	}

	def rules(EClassifier it) {
		if (it !== null && it.needsConcreteRule) {
			rule(it)
		}
	}
	
//	def orderByKeyValue(Iterable<EStructuralFeature> it){
	/**
	 * To make sure that if there is a feature named 'key', it comes first
	 */
	def orderByKeyValue(EClassifier eClassifier){
		val it = eClassifier as EClass 
		var orderByKeyValue = new ArrayList<EStructuralFeature>()
		orderByKeyValue.addAll(prefixFeatures.filter[eStructuralFeature| eStructuralFeature.name.equals('key')]);
		orderByKeyValue.addAll(prefixFeatures.filter[eStructuralFeature|!eStructuralFeature.name.equals('key')]);
		orderByKeyValue
	}
	
	
	
	
	def rule(EClassifier it) {
		switch(it) {
			EClass :
				'''
				//EClass «it.name»
				«it.concreteRuleName» returns «fqn»:
					«IF (it.onlyOptionalFeatures)»
						{«fqn»}
					«ENDIF»
					«FOR strF: it.orderByKeyValue /*it.prefixFeatures*/ »  
						«strF.assigment»
					«ENDFOR»
					«openParenthesis»
					«idAssignmentJSON(it)»«IF (!it.inlinedFeatures.empty)»
							«FOR attr: it.allAttributes»
								«attr.assigment»
							«ENDFOR»
							«FOR ref: it.allCrossReferences»
								«ref.assigment»
							«ENDFOR»
							«IF this.detailedJsonGrammar.tuples.contains(it)»
«««							we treat here the case of Tuple this.detailedJsonGrammar
								«writeTupleItem(it.allContainmentReferences.toList,0)»								
							«ELSE»
								«FOR conti: it.allContainmentReferences»
									«conti.assigment»
								«ENDFOR»
							«ENDIF»
«««							«FOR conti: it.allContainmentReferences»
«««								«conti.assigment»
«««							«ENDFOR»
					«closeParenthesis»«ENDIF»;
			'''
			EEnum:
				'''enum «name.quoteIfNeccesary» returns «fqn»:
				«it.ELiterals.map([name+" = '"+name+"'"]).join(' | ')»;'''
			EDataType:
				if (it.serializable) {
				'''
						«uniqueName» returns «fqn»:
							«it.jsonDataTypeRuleBody»;
					'''
				}
			
			default:	
				throw new IllegalStateException("No rule template for "+it)
		}
	}	
	
	private def  writeTupleItem (List<EReference> containments, int index){
		if(index<containments.size){
			val currentItem = containments.get(index)
			'''
			(«IF index>0»","«ENDIF»«currentItem.name.quoteIfNeccesary»«currentItem.assignmentOperator»«currentItem.assignedTerminal»«IF currentItem.many» ( "," «currentItem.name.quoteIfNeccesary»«currentItem.assignmentOperator»«currentItem.assignedTerminal»)*  «ENDIF» «writeTupleItem(containments,index+1)»)?
			'''
		}
	}
	def static String jsonDataTypeRuleBody(EDataType it) {
		switch (name) {
			case 'EString': 'VALID_STRING'
			case 'EDouble': 'E_INT | E_DOUBLE'
			case 'EInt': 'E_INT'
			case 'EDoubleObject': 'E_INT | E_DOUBLE'
			case 'EIntegerObject': 'E_INT'
			default : it.dataTypeRuleBody
		};
	}
	
	def jsonSeparator(EStructuralFeature it) {
		'''«"'"»:«"'"»'''		
	}
	
	def isKeyword(EStructuralFeature it) {
		this.detailedJsonGrammar.keywords.contains(it) === true;
	}
	
	def isKeyValue(EAttribute it) {
		this.detailedJsonGrammar.keyValue.contains(it) === true;
	}
	
	def assignmentKeywordJSON(EStructuralFeature it) {
		if (it.isKeyword) {
			this.keywords.add(it.getEAnnotation('Keyword').details.get('Keyword'));
			
			''' 
				//Keywords
				'"«it.getEAnnotation('Keyword').details.get('Keyword')»"' «jsonSeparator»
			'''
		} else if (it instanceof EReference) {
			'''
				//EReference is not a keyword
			'''
		} else if (it instanceof EAttribute) {
			if (it.isKeyValue)
				'''
					//KeyValue
				'''
		} else
			"'" + name + "' "
	}
	
	//Original implementation idAssigment
	def idAssignmentJSON(EClass it) {
		println(it.toString);
		val idAttr = idAttribute
		if(idAttr!==null) {
			'''
				//Keyword´s Name
				«assigment(idAttr)»
			'''
		}
	}	
	
	def closeParenthesis(EClass it) {
		if (needBraces) {
			'''«"'"»}«"'"»'''
		}
		else if (needBrackets)
			'''«"'"»]«"'"»'''	
			
	}
	
	def openParenthesis(EClass it) {
		if (needBraces) {
			'''«"'"»{«"'"»'''
		}
		else if (needBrackets)
			'''«"'"»[«"'"»'''			
	}
	
	def needBrackets(EClass it) {
		this.detailedJsonGrammar.bracketsEClass.contains(it) === true;
	}
	
	def boolean needBraces(EClass it) {		
		this.detailedJsonGrammar.curlyBracesEClass.contains(it) === true;
	}
	
	def openParenthesis(EReference it) {
		if (needBrackets) {
			'''«"'"»[«"'"»'''
		}
		else if (needCurlyBraces)
			'''«"'"»{«"'"»'''			
	}	
	
	def closeParenthesis(EReference it) {
		if (needBrackets) {
			'''«"'"»]«"'"»'''
		}
		else if (needCurlyBraces)
			'''«"'"»}«"'"»'''			
	}
	
	def needBrackets(EReference it) {
		this.detailedJsonGrammar.bracketsReferences.contains(it) === true;
	}
	
	def needCurlyBraces(EReference it) {
		this.detailedJsonGrammar.curlyBracesReferences.contains(it) === true;
	}
	

	 
	def overwriteINT(){
		'''
			/**
			 * In JSON the first digit of an integer can not be 0, unless it is 0 itself.
			 */
			@Override 
			terminal INT returns ecore::EInt: 
				('0' |  (('1'..'9') ('0'..'9')*))
			;
		'''
	} 	 
	
	def writeVALID_STRING(){
		'''
			VALID_STRING: STRING  «IF !this.keywords.isEmpty()»| KEYWORD «ENDIF»;
			
		'''
	}
	
	def overwriteSTRING(){
		'''
			/**
			 * In JSON the single quote for String is not admitted
			 */
			@Override 
«««			terminal STRING returns ecore::EString:
			terminal STRING:
				'"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"'
			;	
			
		'''
	}
	
	def writeTerminalE_INT(){
		'''
			terminal E_INT :
				'-'? INT;
			
		'''
	}
	
	def writeKeywords(){
		if(!this.keywords.isEmpty()){
			'''
				KEYWORD: «FOR it: this.keywords SEPARATOR ' | '» 
									'"«it»"' 
							«ENDFOR»
				;
				
			'''
		}else{''}
	}
	
	def writeTerminalE_DOUBLE(){
		'''
			terminal E_DOUBLE :
				'-'? INT ('.' INT+)? (('E'|'e') ('+'|'-')? INT)?
			;
			
		'''
	}
}
