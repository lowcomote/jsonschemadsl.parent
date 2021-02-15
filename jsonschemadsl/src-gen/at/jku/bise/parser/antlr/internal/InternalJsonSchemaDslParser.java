package at.jku.bise.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.bise.services.JsonSchemaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonSchemaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_JSON_NUMBER", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'\"maximum\"'", "':'", "'\"writeOnly\"'", "'\"$comment\"'", "'['", "']'", "'\"uniqueItems\"'", "'\"anyOf\"'", "'\"title\"'", "'\"items\"'", "'\"default\"'", "'\"then\"'", "'\"minLength\"'", "'\"definitions\"'", "'\"minItems\"'", "'\"oneOf\"'", "'\"maxProperties\"'", "'\"minimum\"'", "'\"maxItems\"'", "'\"format\"'", "'\"readOnly\"'", "'\"type\"'", "'\"additionalProperties\"'", "'\"else\"'", "'\"$id\"'", "'\"const\"'", "'\"required\"'", "'\"description\"'", "'\"minProperties\"'", "'\"patternProperties\"'", "'\"additionalItems\"'", "'\"examples\"'", "'\"if\"'", "'\"allOf\"'", "'\"contentEncoding\"'", "'\"multipleOf\"'", "'\"pattern\"'", "'\"contains\"'", "'\"not\"'", "'\"exclusiveMaximum\"'", "'\"maxLength\"'", "'\"$ref\"'", "'\"contentMediaType\"'", "'\"exclusiveMinimum\"'", "'\"$schema\"'", "'\"properties\"'", "'\"propertyNames\"'", "'true'", "'false'", "'null'", "'-'", "'\"dependencies\"'", "'\"enum\"'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"string\"'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int RULE_JSON_NUMBER=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJsonSchemaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonSchemaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonSchemaDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonSchemaDsl.g"; }



     	private JsonSchemaDslGrammarAccess grammarAccess;

        public InternalJsonSchemaDslParser(TokenStream input, JsonSchemaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JsonSchema";
       	}

       	@Override
       	protected JsonSchemaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJsonSchema"
    // InternalJsonSchemaDsl.g:65:1: entryRuleJsonSchema returns [EObject current=null] : iv_ruleJsonSchema= ruleJsonSchema EOF ;
    public final EObject entryRuleJsonSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonSchema = null;


        try {
            // InternalJsonSchemaDsl.g:65:51: (iv_ruleJsonSchema= ruleJsonSchema EOF )
            // InternalJsonSchemaDsl.g:66:2: iv_ruleJsonSchema= ruleJsonSchema EOF
            {
             newCompositeNode(grammarAccess.getJsonSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonSchema=ruleJsonSchema();

            state._fsp--;

             current =iv_ruleJsonSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonSchema"


    // $ANTLR start "ruleJsonSchema"
    // InternalJsonSchemaDsl.g:72:1: ruleJsonSchema returns [EObject current=null] : ( () ( (lv_schema_1_0= ruleSchema ) )? ) ;
    public final EObject ruleJsonSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_schema_1_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:78:2: ( ( () ( (lv_schema_1_0= ruleSchema ) )? ) )
            // InternalJsonSchemaDsl.g:79:2: ( () ( (lv_schema_1_0= ruleSchema ) )? )
            {
            // InternalJsonSchemaDsl.g:79:2: ( () ( (lv_schema_1_0= ruleSchema ) )? )
            // InternalJsonSchemaDsl.g:80:3: () ( (lv_schema_1_0= ruleSchema ) )?
            {
            // InternalJsonSchemaDsl.g:80:3: ()
            // InternalJsonSchemaDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonSchemaAccess().getJsonSchemaAction_0(),
            					current);
            			

            }

            // InternalJsonSchemaDsl.g:87:3: ( (lv_schema_1_0= ruleSchema ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12||(LA1_0>=62 && LA1_0<=63)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJsonSchemaDsl.g:88:4: (lv_schema_1_0= ruleSchema )
                    {
                    // InternalJsonSchemaDsl.g:88:4: (lv_schema_1_0= ruleSchema )
                    // InternalJsonSchemaDsl.g:89:5: lv_schema_1_0= ruleSchema
                    {

                    					newCompositeNode(grammarAccess.getJsonSchemaAccess().getSchemaSchemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_schema_1_0=ruleSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJsonSchemaRule());
                    					}
                    					set(
                    						current,
                    						"schema",
                    						lv_schema_1_0,
                    						"at.jku.bise.JsonSchemaDsl.Schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonSchema"


    // $ANTLR start "entryRuleSchema"
    // InternalJsonSchemaDsl.g:110:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalJsonSchemaDsl.g:110:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalJsonSchemaDsl.g:111:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalJsonSchemaDsl.g:117:1: ruleSchema returns [EObject current=null] : (this_ObjectSchema_0= ruleObjectSchema | this_BooleanSchema_1= ruleBooleanSchema ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectSchema_0 = null;

        EObject this_BooleanSchema_1 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:123:2: ( (this_ObjectSchema_0= ruleObjectSchema | this_BooleanSchema_1= ruleBooleanSchema ) )
            // InternalJsonSchemaDsl.g:124:2: (this_ObjectSchema_0= ruleObjectSchema | this_BooleanSchema_1= ruleBooleanSchema )
            {
            // InternalJsonSchemaDsl.g:124:2: (this_ObjectSchema_0= ruleObjectSchema | this_BooleanSchema_1= ruleBooleanSchema )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=62 && LA2_0<=63)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJsonSchemaDsl.g:125:3: this_ObjectSchema_0= ruleObjectSchema
                    {

                    			newCompositeNode(grammarAccess.getSchemaAccess().getObjectSchemaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectSchema_0=ruleObjectSchema();

                    state._fsp--;


                    			current = this_ObjectSchema_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:134:3: this_BooleanSchema_1= ruleBooleanSchema
                    {

                    			newCompositeNode(grammarAccess.getSchemaAccess().getBooleanSchemaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanSchema_1=ruleBooleanSchema();

                    state._fsp--;


                    			current = this_BooleanSchema_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleKeywordDefinition"
    // InternalJsonSchemaDsl.g:146:1: entryRuleKeywordDefinition returns [EObject current=null] : iv_ruleKeywordDefinition= ruleKeywordDefinition EOF ;
    public final EObject entryRuleKeywordDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeywordDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:146:58: (iv_ruleKeywordDefinition= ruleKeywordDefinition EOF )
            // InternalJsonSchemaDsl.g:147:2: iv_ruleKeywordDefinition= ruleKeywordDefinition EOF
            {
             newCompositeNode(grammarAccess.getKeywordDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeywordDefinition=ruleKeywordDefinition();

            state._fsp--;

             current =iv_ruleKeywordDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeywordDefinition"


    // $ANTLR start "ruleKeywordDefinition"
    // InternalJsonSchemaDsl.g:153:1: ruleKeywordDefinition returns [EObject current=null] : (this_IdSchemaDefinition_0= ruleIdSchemaDefinition | this_SchemaSchemaDefinition_1= ruleSchemaSchemaDefinition | this_RefSchemaDefinition_2= ruleRefSchemaDefinition | this_CommentSchemaDefinition_3= ruleCommentSchemaDefinition | this_TitleSchemaDefinition_4= ruleTitleSchemaDefinition | this_DescriptionSchemaDefinition_5= ruleDescriptionSchemaDefinition | this_DefaultSchemaDefinition_6= ruleDefaultSchemaDefinition | this_ReadOnlySchemaDefinition_7= ruleReadOnlySchemaDefinition | this_WriteOnlySchemaDefinition_8= ruleWriteOnlySchemaDefinition | this_ExamplesSchemaDefinition_9= ruleExamplesSchemaDefinition | this_MultipleOfSchemaDefinition_10= ruleMultipleOfSchemaDefinition | this_MaximumSchemaDefinition_11= ruleMaximumSchemaDefinition | this_ExclusiveMaximumSchemaDefinition_12= ruleExclusiveMaximumSchemaDefinition | this_MinimumSchemaDefinition_13= ruleMinimumSchemaDefinition | this_ExclusiveMinimumSchemaDefinition_14= ruleExclusiveMinimumSchemaDefinition | this_MaxLengthSchemaDefinition_15= ruleMaxLengthSchemaDefinition | this_MinLengthSchemaDefinition_16= ruleMinLengthSchemaDefinition | this_PatternSchemaDefinition_17= rulePatternSchemaDefinition | this_AdditionalItemsSchemaDefinition_18= ruleAdditionalItemsSchemaDefinition | this_ItemsSchemaDefinition_19= ruleItemsSchemaDefinition | this_MaxItemsSchemaDefinition_20= ruleMaxItemsSchemaDefinition | this_MinItemsSchemaDefinition_21= ruleMinItemsSchemaDefinition | this_UniqueItemsSchemaDefinition_22= ruleUniqueItemsSchemaDefinition | this_ContainsSchemaDefinition_23= ruleContainsSchemaDefinition | this_MaxPropertiesSchemaDefinition_24= ruleMaxPropertiesSchemaDefinition | this_MinPropertiesSchemaDefinition_25= ruleMinPropertiesSchemaDefinition | this_RequiredSchemaDefinition_26= ruleRequiredSchemaDefinition | this_AdditionalPropertiesSchemaDefinition_27= ruleAdditionalPropertiesSchemaDefinition | this_DefinitionsSchemaDefinition_28= ruleDefinitionsSchemaDefinition | this_PropertiesSchemaDefinition_29= rulePropertiesSchemaDefinition | this_PatternPropertiesSchemaDefinition_30= rulePatternPropertiesSchemaDefinition | this_PropertyNamesSchemaDefinition_31= rulePropertyNamesSchemaDefinition | this_ConstSchemaDefinition_32= ruleConstSchemaDefinition | this_EnumSchemaDefinition_33= ruleEnumSchemaDefinition | this_TypeSchemaDefinition_34= ruleTypeSchemaDefinition | this_FormatSchemaDefinition_35= ruleFormatSchemaDefinition | this_ContentMediaTypeSchemaDefinition_36= ruleContentMediaTypeSchemaDefinition | this_ContentEncodingSchemaDefinition_37= ruleContentEncodingSchemaDefinition | this_IfSchemaDefinition_38= ruleIfSchemaDefinition | this_ThenSchemaDefinition_39= ruleThenSchemaDefinition | this_ElseSchemaDefinition_40= ruleElseSchemaDefinition | this_AllOfSchemaDefinition_41= ruleAllOfSchemaDefinition | this_AnyOfSchemaDefinition_42= ruleAnyOfSchemaDefinition | this_OneOfSchemaDefinition_43= ruleOneOfSchemaDefinition | this_NotSchemaDefinition_44= ruleNotSchemaDefinition | this_KeyValuePair_45= ruleKeyValuePair ) ;
    public final EObject ruleKeywordDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_IdSchemaDefinition_0 = null;

        EObject this_SchemaSchemaDefinition_1 = null;

        EObject this_RefSchemaDefinition_2 = null;

        EObject this_CommentSchemaDefinition_3 = null;

        EObject this_TitleSchemaDefinition_4 = null;

        EObject this_DescriptionSchemaDefinition_5 = null;

        EObject this_DefaultSchemaDefinition_6 = null;

        EObject this_ReadOnlySchemaDefinition_7 = null;

        EObject this_WriteOnlySchemaDefinition_8 = null;

        EObject this_ExamplesSchemaDefinition_9 = null;

        EObject this_MultipleOfSchemaDefinition_10 = null;

        EObject this_MaximumSchemaDefinition_11 = null;

        EObject this_ExclusiveMaximumSchemaDefinition_12 = null;

        EObject this_MinimumSchemaDefinition_13 = null;

        EObject this_ExclusiveMinimumSchemaDefinition_14 = null;

        EObject this_MaxLengthSchemaDefinition_15 = null;

        EObject this_MinLengthSchemaDefinition_16 = null;

        EObject this_PatternSchemaDefinition_17 = null;

        EObject this_AdditionalItemsSchemaDefinition_18 = null;

        EObject this_ItemsSchemaDefinition_19 = null;

        EObject this_MaxItemsSchemaDefinition_20 = null;

        EObject this_MinItemsSchemaDefinition_21 = null;

        EObject this_UniqueItemsSchemaDefinition_22 = null;

        EObject this_ContainsSchemaDefinition_23 = null;

        EObject this_MaxPropertiesSchemaDefinition_24 = null;

        EObject this_MinPropertiesSchemaDefinition_25 = null;

        EObject this_RequiredSchemaDefinition_26 = null;

        EObject this_AdditionalPropertiesSchemaDefinition_27 = null;

        EObject this_DefinitionsSchemaDefinition_28 = null;

        EObject this_PropertiesSchemaDefinition_29 = null;

        EObject this_PatternPropertiesSchemaDefinition_30 = null;

        EObject this_PropertyNamesSchemaDefinition_31 = null;

        EObject this_ConstSchemaDefinition_32 = null;

        EObject this_EnumSchemaDefinition_33 = null;

        EObject this_TypeSchemaDefinition_34 = null;

        EObject this_FormatSchemaDefinition_35 = null;

        EObject this_ContentMediaTypeSchemaDefinition_36 = null;

        EObject this_ContentEncodingSchemaDefinition_37 = null;

        EObject this_IfSchemaDefinition_38 = null;

        EObject this_ThenSchemaDefinition_39 = null;

        EObject this_ElseSchemaDefinition_40 = null;

        EObject this_AllOfSchemaDefinition_41 = null;

        EObject this_AnyOfSchemaDefinition_42 = null;

        EObject this_OneOfSchemaDefinition_43 = null;

        EObject this_NotSchemaDefinition_44 = null;

        EObject this_KeyValuePair_45 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:159:2: ( (this_IdSchemaDefinition_0= ruleIdSchemaDefinition | this_SchemaSchemaDefinition_1= ruleSchemaSchemaDefinition | this_RefSchemaDefinition_2= ruleRefSchemaDefinition | this_CommentSchemaDefinition_3= ruleCommentSchemaDefinition | this_TitleSchemaDefinition_4= ruleTitleSchemaDefinition | this_DescriptionSchemaDefinition_5= ruleDescriptionSchemaDefinition | this_DefaultSchemaDefinition_6= ruleDefaultSchemaDefinition | this_ReadOnlySchemaDefinition_7= ruleReadOnlySchemaDefinition | this_WriteOnlySchemaDefinition_8= ruleWriteOnlySchemaDefinition | this_ExamplesSchemaDefinition_9= ruleExamplesSchemaDefinition | this_MultipleOfSchemaDefinition_10= ruleMultipleOfSchemaDefinition | this_MaximumSchemaDefinition_11= ruleMaximumSchemaDefinition | this_ExclusiveMaximumSchemaDefinition_12= ruleExclusiveMaximumSchemaDefinition | this_MinimumSchemaDefinition_13= ruleMinimumSchemaDefinition | this_ExclusiveMinimumSchemaDefinition_14= ruleExclusiveMinimumSchemaDefinition | this_MaxLengthSchemaDefinition_15= ruleMaxLengthSchemaDefinition | this_MinLengthSchemaDefinition_16= ruleMinLengthSchemaDefinition | this_PatternSchemaDefinition_17= rulePatternSchemaDefinition | this_AdditionalItemsSchemaDefinition_18= ruleAdditionalItemsSchemaDefinition | this_ItemsSchemaDefinition_19= ruleItemsSchemaDefinition | this_MaxItemsSchemaDefinition_20= ruleMaxItemsSchemaDefinition | this_MinItemsSchemaDefinition_21= ruleMinItemsSchemaDefinition | this_UniqueItemsSchemaDefinition_22= ruleUniqueItemsSchemaDefinition | this_ContainsSchemaDefinition_23= ruleContainsSchemaDefinition | this_MaxPropertiesSchemaDefinition_24= ruleMaxPropertiesSchemaDefinition | this_MinPropertiesSchemaDefinition_25= ruleMinPropertiesSchemaDefinition | this_RequiredSchemaDefinition_26= ruleRequiredSchemaDefinition | this_AdditionalPropertiesSchemaDefinition_27= ruleAdditionalPropertiesSchemaDefinition | this_DefinitionsSchemaDefinition_28= ruleDefinitionsSchemaDefinition | this_PropertiesSchemaDefinition_29= rulePropertiesSchemaDefinition | this_PatternPropertiesSchemaDefinition_30= rulePatternPropertiesSchemaDefinition | this_PropertyNamesSchemaDefinition_31= rulePropertyNamesSchemaDefinition | this_ConstSchemaDefinition_32= ruleConstSchemaDefinition | this_EnumSchemaDefinition_33= ruleEnumSchemaDefinition | this_TypeSchemaDefinition_34= ruleTypeSchemaDefinition | this_FormatSchemaDefinition_35= ruleFormatSchemaDefinition | this_ContentMediaTypeSchemaDefinition_36= ruleContentMediaTypeSchemaDefinition | this_ContentEncodingSchemaDefinition_37= ruleContentEncodingSchemaDefinition | this_IfSchemaDefinition_38= ruleIfSchemaDefinition | this_ThenSchemaDefinition_39= ruleThenSchemaDefinition | this_ElseSchemaDefinition_40= ruleElseSchemaDefinition | this_AllOfSchemaDefinition_41= ruleAllOfSchemaDefinition | this_AnyOfSchemaDefinition_42= ruleAnyOfSchemaDefinition | this_OneOfSchemaDefinition_43= ruleOneOfSchemaDefinition | this_NotSchemaDefinition_44= ruleNotSchemaDefinition | this_KeyValuePair_45= ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:160:2: (this_IdSchemaDefinition_0= ruleIdSchemaDefinition | this_SchemaSchemaDefinition_1= ruleSchemaSchemaDefinition | this_RefSchemaDefinition_2= ruleRefSchemaDefinition | this_CommentSchemaDefinition_3= ruleCommentSchemaDefinition | this_TitleSchemaDefinition_4= ruleTitleSchemaDefinition | this_DescriptionSchemaDefinition_5= ruleDescriptionSchemaDefinition | this_DefaultSchemaDefinition_6= ruleDefaultSchemaDefinition | this_ReadOnlySchemaDefinition_7= ruleReadOnlySchemaDefinition | this_WriteOnlySchemaDefinition_8= ruleWriteOnlySchemaDefinition | this_ExamplesSchemaDefinition_9= ruleExamplesSchemaDefinition | this_MultipleOfSchemaDefinition_10= ruleMultipleOfSchemaDefinition | this_MaximumSchemaDefinition_11= ruleMaximumSchemaDefinition | this_ExclusiveMaximumSchemaDefinition_12= ruleExclusiveMaximumSchemaDefinition | this_MinimumSchemaDefinition_13= ruleMinimumSchemaDefinition | this_ExclusiveMinimumSchemaDefinition_14= ruleExclusiveMinimumSchemaDefinition | this_MaxLengthSchemaDefinition_15= ruleMaxLengthSchemaDefinition | this_MinLengthSchemaDefinition_16= ruleMinLengthSchemaDefinition | this_PatternSchemaDefinition_17= rulePatternSchemaDefinition | this_AdditionalItemsSchemaDefinition_18= ruleAdditionalItemsSchemaDefinition | this_ItemsSchemaDefinition_19= ruleItemsSchemaDefinition | this_MaxItemsSchemaDefinition_20= ruleMaxItemsSchemaDefinition | this_MinItemsSchemaDefinition_21= ruleMinItemsSchemaDefinition | this_UniqueItemsSchemaDefinition_22= ruleUniqueItemsSchemaDefinition | this_ContainsSchemaDefinition_23= ruleContainsSchemaDefinition | this_MaxPropertiesSchemaDefinition_24= ruleMaxPropertiesSchemaDefinition | this_MinPropertiesSchemaDefinition_25= ruleMinPropertiesSchemaDefinition | this_RequiredSchemaDefinition_26= ruleRequiredSchemaDefinition | this_AdditionalPropertiesSchemaDefinition_27= ruleAdditionalPropertiesSchemaDefinition | this_DefinitionsSchemaDefinition_28= ruleDefinitionsSchemaDefinition | this_PropertiesSchemaDefinition_29= rulePropertiesSchemaDefinition | this_PatternPropertiesSchemaDefinition_30= rulePatternPropertiesSchemaDefinition | this_PropertyNamesSchemaDefinition_31= rulePropertyNamesSchemaDefinition | this_ConstSchemaDefinition_32= ruleConstSchemaDefinition | this_EnumSchemaDefinition_33= ruleEnumSchemaDefinition | this_TypeSchemaDefinition_34= ruleTypeSchemaDefinition | this_FormatSchemaDefinition_35= ruleFormatSchemaDefinition | this_ContentMediaTypeSchemaDefinition_36= ruleContentMediaTypeSchemaDefinition | this_ContentEncodingSchemaDefinition_37= ruleContentEncodingSchemaDefinition | this_IfSchemaDefinition_38= ruleIfSchemaDefinition | this_ThenSchemaDefinition_39= ruleThenSchemaDefinition | this_ElseSchemaDefinition_40= ruleElseSchemaDefinition | this_AllOfSchemaDefinition_41= ruleAllOfSchemaDefinition | this_AnyOfSchemaDefinition_42= ruleAnyOfSchemaDefinition | this_OneOfSchemaDefinition_43= ruleOneOfSchemaDefinition | this_NotSchemaDefinition_44= ruleNotSchemaDefinition | this_KeyValuePair_45= ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:160:2: (this_IdSchemaDefinition_0= ruleIdSchemaDefinition | this_SchemaSchemaDefinition_1= ruleSchemaSchemaDefinition | this_RefSchemaDefinition_2= ruleRefSchemaDefinition | this_CommentSchemaDefinition_3= ruleCommentSchemaDefinition | this_TitleSchemaDefinition_4= ruleTitleSchemaDefinition | this_DescriptionSchemaDefinition_5= ruleDescriptionSchemaDefinition | this_DefaultSchemaDefinition_6= ruleDefaultSchemaDefinition | this_ReadOnlySchemaDefinition_7= ruleReadOnlySchemaDefinition | this_WriteOnlySchemaDefinition_8= ruleWriteOnlySchemaDefinition | this_ExamplesSchemaDefinition_9= ruleExamplesSchemaDefinition | this_MultipleOfSchemaDefinition_10= ruleMultipleOfSchemaDefinition | this_MaximumSchemaDefinition_11= ruleMaximumSchemaDefinition | this_ExclusiveMaximumSchemaDefinition_12= ruleExclusiveMaximumSchemaDefinition | this_MinimumSchemaDefinition_13= ruleMinimumSchemaDefinition | this_ExclusiveMinimumSchemaDefinition_14= ruleExclusiveMinimumSchemaDefinition | this_MaxLengthSchemaDefinition_15= ruleMaxLengthSchemaDefinition | this_MinLengthSchemaDefinition_16= ruleMinLengthSchemaDefinition | this_PatternSchemaDefinition_17= rulePatternSchemaDefinition | this_AdditionalItemsSchemaDefinition_18= ruleAdditionalItemsSchemaDefinition | this_ItemsSchemaDefinition_19= ruleItemsSchemaDefinition | this_MaxItemsSchemaDefinition_20= ruleMaxItemsSchemaDefinition | this_MinItemsSchemaDefinition_21= ruleMinItemsSchemaDefinition | this_UniqueItemsSchemaDefinition_22= ruleUniqueItemsSchemaDefinition | this_ContainsSchemaDefinition_23= ruleContainsSchemaDefinition | this_MaxPropertiesSchemaDefinition_24= ruleMaxPropertiesSchemaDefinition | this_MinPropertiesSchemaDefinition_25= ruleMinPropertiesSchemaDefinition | this_RequiredSchemaDefinition_26= ruleRequiredSchemaDefinition | this_AdditionalPropertiesSchemaDefinition_27= ruleAdditionalPropertiesSchemaDefinition | this_DefinitionsSchemaDefinition_28= ruleDefinitionsSchemaDefinition | this_PropertiesSchemaDefinition_29= rulePropertiesSchemaDefinition | this_PatternPropertiesSchemaDefinition_30= rulePatternPropertiesSchemaDefinition | this_PropertyNamesSchemaDefinition_31= rulePropertyNamesSchemaDefinition | this_ConstSchemaDefinition_32= ruleConstSchemaDefinition | this_EnumSchemaDefinition_33= ruleEnumSchemaDefinition | this_TypeSchemaDefinition_34= ruleTypeSchemaDefinition | this_FormatSchemaDefinition_35= ruleFormatSchemaDefinition | this_ContentMediaTypeSchemaDefinition_36= ruleContentMediaTypeSchemaDefinition | this_ContentEncodingSchemaDefinition_37= ruleContentEncodingSchemaDefinition | this_IfSchemaDefinition_38= ruleIfSchemaDefinition | this_ThenSchemaDefinition_39= ruleThenSchemaDefinition | this_ElseSchemaDefinition_40= ruleElseSchemaDefinition | this_AllOfSchemaDefinition_41= ruleAllOfSchemaDefinition | this_AnyOfSchemaDefinition_42= ruleAnyOfSchemaDefinition | this_OneOfSchemaDefinition_43= ruleOneOfSchemaDefinition | this_NotSchemaDefinition_44= ruleNotSchemaDefinition | this_KeyValuePair_45= ruleKeyValuePair )
            int alt3=46;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 59:
                {
                alt3=2;
                }
                break;
            case 56:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            case 42:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            case 35:
                {
                alt3=8;
                }
                break;
            case 17:
                {
                alt3=9;
                }
                break;
            case 46:
                {
                alt3=10;
                }
                break;
            case 50:
                {
                alt3=11;
                }
                break;
            case 15:
                {
                alt3=12;
                }
                break;
            case 54:
                {
                alt3=13;
                }
                break;
            case 32:
                {
                alt3=14;
                }
                break;
            case 58:
                {
                alt3=15;
                }
                break;
            case 55:
                {
                alt3=16;
                }
                break;
            case 27:
                {
                alt3=17;
                }
                break;
            case 51:
                {
                alt3=18;
                }
                break;
            case 45:
                {
                alt3=19;
                }
                break;
            case 24:
                {
                alt3=20;
                }
                break;
            case 33:
                {
                alt3=21;
                }
                break;
            case 29:
                {
                alt3=22;
                }
                break;
            case 21:
                {
                alt3=23;
                }
                break;
            case 52:
                {
                alt3=24;
                }
                break;
            case 31:
                {
                alt3=25;
                }
                break;
            case 43:
                {
                alt3=26;
                }
                break;
            case 41:
                {
                alt3=27;
                }
                break;
            case 37:
                {
                alt3=28;
                }
                break;
            case 28:
                {
                alt3=29;
                }
                break;
            case 60:
                {
                alt3=30;
                }
                break;
            case 44:
                {
                alt3=31;
                }
                break;
            case 61:
                {
                alt3=32;
                }
                break;
            case 40:
                {
                alt3=33;
                }
                break;
            case 19:
                {
                alt3=34;
                }
                break;
            case 36:
                {
                alt3=35;
                }
                break;
            case 34:
                {
                alt3=36;
                }
                break;
            case 57:
                {
                alt3=37;
                }
                break;
            case 49:
                {
                alt3=38;
                }
                break;
            case 47:
                {
                alt3=39;
                }
                break;
            case 26:
                {
                alt3=40;
                }
                break;
            case 38:
                {
                alt3=41;
                }
                break;
            case 48:
                {
                alt3=42;
                }
                break;
            case 22:
                {
                alt3=43;
                }
                break;
            case 30:
                {
                alt3=44;
                }
                break;
            case 53:
                {
                alt3=45;
                }
                break;
            case RULE_STRING:
                {
                alt3=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJsonSchemaDsl.g:161:3: this_IdSchemaDefinition_0= ruleIdSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getIdSchemaDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdSchemaDefinition_0=ruleIdSchemaDefinition();

                    state._fsp--;


                    			current = this_IdSchemaDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:170:3: this_SchemaSchemaDefinition_1= ruleSchemaSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getSchemaSchemaDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SchemaSchemaDefinition_1=ruleSchemaSchemaDefinition();

                    state._fsp--;


                    			current = this_SchemaSchemaDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:179:3: this_RefSchemaDefinition_2= ruleRefSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getRefSchemaDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefSchemaDefinition_2=ruleRefSchemaDefinition();

                    state._fsp--;


                    			current = this_RefSchemaDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:188:3: this_CommentSchemaDefinition_3= ruleCommentSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getCommentSchemaDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommentSchemaDefinition_3=ruleCommentSchemaDefinition();

                    state._fsp--;


                    			current = this_CommentSchemaDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:197:3: this_TitleSchemaDefinition_4= ruleTitleSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getTitleSchemaDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TitleSchemaDefinition_4=ruleTitleSchemaDefinition();

                    state._fsp--;


                    			current = this_TitleSchemaDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:206:3: this_DescriptionSchemaDefinition_5= ruleDescriptionSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getDescriptionSchemaDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DescriptionSchemaDefinition_5=ruleDescriptionSchemaDefinition();

                    state._fsp--;


                    			current = this_DescriptionSchemaDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:215:3: this_DefaultSchemaDefinition_6= ruleDefaultSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getDefaultSchemaDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultSchemaDefinition_6=ruleDefaultSchemaDefinition();

                    state._fsp--;


                    			current = this_DefaultSchemaDefinition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJsonSchemaDsl.g:224:3: this_ReadOnlySchemaDefinition_7= ruleReadOnlySchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getReadOnlySchemaDefinitionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReadOnlySchemaDefinition_7=ruleReadOnlySchemaDefinition();

                    state._fsp--;


                    			current = this_ReadOnlySchemaDefinition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJsonSchemaDsl.g:233:3: this_WriteOnlySchemaDefinition_8= ruleWriteOnlySchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getWriteOnlySchemaDefinitionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteOnlySchemaDefinition_8=ruleWriteOnlySchemaDefinition();

                    state._fsp--;


                    			current = this_WriteOnlySchemaDefinition_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJsonSchemaDsl.g:242:3: this_ExamplesSchemaDefinition_9= ruleExamplesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getExamplesSchemaDefinitionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExamplesSchemaDefinition_9=ruleExamplesSchemaDefinition();

                    state._fsp--;


                    			current = this_ExamplesSchemaDefinition_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJsonSchemaDsl.g:251:3: this_MultipleOfSchemaDefinition_10= ruleMultipleOfSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMultipleOfSchemaDefinitionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleOfSchemaDefinition_10=ruleMultipleOfSchemaDefinition();

                    state._fsp--;


                    			current = this_MultipleOfSchemaDefinition_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJsonSchemaDsl.g:260:3: this_MaximumSchemaDefinition_11= ruleMaximumSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMaximumSchemaDefinitionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaximumSchemaDefinition_11=ruleMaximumSchemaDefinition();

                    state._fsp--;


                    			current = this_MaximumSchemaDefinition_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJsonSchemaDsl.g:269:3: this_ExclusiveMaximumSchemaDefinition_12= ruleExclusiveMaximumSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getExclusiveMaximumSchemaDefinitionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExclusiveMaximumSchemaDefinition_12=ruleExclusiveMaximumSchemaDefinition();

                    state._fsp--;


                    			current = this_ExclusiveMaximumSchemaDefinition_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalJsonSchemaDsl.g:278:3: this_MinimumSchemaDefinition_13= ruleMinimumSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMinimumSchemaDefinitionParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinimumSchemaDefinition_13=ruleMinimumSchemaDefinition();

                    state._fsp--;


                    			current = this_MinimumSchemaDefinition_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalJsonSchemaDsl.g:287:3: this_ExclusiveMinimumSchemaDefinition_14= ruleExclusiveMinimumSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getExclusiveMinimumSchemaDefinitionParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExclusiveMinimumSchemaDefinition_14=ruleExclusiveMinimumSchemaDefinition();

                    state._fsp--;


                    			current = this_ExclusiveMinimumSchemaDefinition_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalJsonSchemaDsl.g:296:3: this_MaxLengthSchemaDefinition_15= ruleMaxLengthSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMaxLengthSchemaDefinitionParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxLengthSchemaDefinition_15=ruleMaxLengthSchemaDefinition();

                    state._fsp--;


                    			current = this_MaxLengthSchemaDefinition_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalJsonSchemaDsl.g:305:3: this_MinLengthSchemaDefinition_16= ruleMinLengthSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMinLengthSchemaDefinitionParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinLengthSchemaDefinition_16=ruleMinLengthSchemaDefinition();

                    state._fsp--;


                    			current = this_MinLengthSchemaDefinition_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalJsonSchemaDsl.g:314:3: this_PatternSchemaDefinition_17= rulePatternSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getPatternSchemaDefinitionParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternSchemaDefinition_17=rulePatternSchemaDefinition();

                    state._fsp--;


                    			current = this_PatternSchemaDefinition_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalJsonSchemaDsl.g:323:3: this_AdditionalItemsSchemaDefinition_18= ruleAdditionalItemsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getAdditionalItemsSchemaDefinitionParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdditionalItemsSchemaDefinition_18=ruleAdditionalItemsSchemaDefinition();

                    state._fsp--;


                    			current = this_AdditionalItemsSchemaDefinition_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalJsonSchemaDsl.g:332:3: this_ItemsSchemaDefinition_19= ruleItemsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getItemsSchemaDefinitionParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemsSchemaDefinition_19=ruleItemsSchemaDefinition();

                    state._fsp--;


                    			current = this_ItemsSchemaDefinition_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalJsonSchemaDsl.g:341:3: this_MaxItemsSchemaDefinition_20= ruleMaxItemsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMaxItemsSchemaDefinitionParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxItemsSchemaDefinition_20=ruleMaxItemsSchemaDefinition();

                    state._fsp--;


                    			current = this_MaxItemsSchemaDefinition_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalJsonSchemaDsl.g:350:3: this_MinItemsSchemaDefinition_21= ruleMinItemsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMinItemsSchemaDefinitionParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinItemsSchemaDefinition_21=ruleMinItemsSchemaDefinition();

                    state._fsp--;


                    			current = this_MinItemsSchemaDefinition_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalJsonSchemaDsl.g:359:3: this_UniqueItemsSchemaDefinition_22= ruleUniqueItemsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getUniqueItemsSchemaDefinitionParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_UniqueItemsSchemaDefinition_22=ruleUniqueItemsSchemaDefinition();

                    state._fsp--;


                    			current = this_UniqueItemsSchemaDefinition_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalJsonSchemaDsl.g:368:3: this_ContainsSchemaDefinition_23= ruleContainsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getContainsSchemaDefinitionParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainsSchemaDefinition_23=ruleContainsSchemaDefinition();

                    state._fsp--;


                    			current = this_ContainsSchemaDefinition_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalJsonSchemaDsl.g:377:3: this_MaxPropertiesSchemaDefinition_24= ruleMaxPropertiesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMaxPropertiesSchemaDefinitionParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxPropertiesSchemaDefinition_24=ruleMaxPropertiesSchemaDefinition();

                    state._fsp--;


                    			current = this_MaxPropertiesSchemaDefinition_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalJsonSchemaDsl.g:386:3: this_MinPropertiesSchemaDefinition_25= ruleMinPropertiesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getMinPropertiesSchemaDefinitionParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinPropertiesSchemaDefinition_25=ruleMinPropertiesSchemaDefinition();

                    state._fsp--;


                    			current = this_MinPropertiesSchemaDefinition_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalJsonSchemaDsl.g:395:3: this_RequiredSchemaDefinition_26= ruleRequiredSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getRequiredSchemaDefinitionParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequiredSchemaDefinition_26=ruleRequiredSchemaDefinition();

                    state._fsp--;


                    			current = this_RequiredSchemaDefinition_26;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 28 :
                    // InternalJsonSchemaDsl.g:404:3: this_AdditionalPropertiesSchemaDefinition_27= ruleAdditionalPropertiesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getAdditionalPropertiesSchemaDefinitionParserRuleCall_27());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdditionalPropertiesSchemaDefinition_27=ruleAdditionalPropertiesSchemaDefinition();

                    state._fsp--;


                    			current = this_AdditionalPropertiesSchemaDefinition_27;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 29 :
                    // InternalJsonSchemaDsl.g:413:3: this_DefinitionsSchemaDefinition_28= ruleDefinitionsSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getDefinitionsSchemaDefinitionParserRuleCall_28());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinitionsSchemaDefinition_28=ruleDefinitionsSchemaDefinition();

                    state._fsp--;


                    			current = this_DefinitionsSchemaDefinition_28;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 30 :
                    // InternalJsonSchemaDsl.g:422:3: this_PropertiesSchemaDefinition_29= rulePropertiesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getPropertiesSchemaDefinitionParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertiesSchemaDefinition_29=rulePropertiesSchemaDefinition();

                    state._fsp--;


                    			current = this_PropertiesSchemaDefinition_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 31 :
                    // InternalJsonSchemaDsl.g:431:3: this_PatternPropertiesSchemaDefinition_30= rulePatternPropertiesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getPatternPropertiesSchemaDefinitionParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternPropertiesSchemaDefinition_30=rulePatternPropertiesSchemaDefinition();

                    state._fsp--;


                    			current = this_PatternPropertiesSchemaDefinition_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 32 :
                    // InternalJsonSchemaDsl.g:440:3: this_PropertyNamesSchemaDefinition_31= rulePropertyNamesSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getPropertyNamesSchemaDefinitionParserRuleCall_31());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyNamesSchemaDefinition_31=rulePropertyNamesSchemaDefinition();

                    state._fsp--;


                    			current = this_PropertyNamesSchemaDefinition_31;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 33 :
                    // InternalJsonSchemaDsl.g:449:3: this_ConstSchemaDefinition_32= ruleConstSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getConstSchemaDefinitionParserRuleCall_32());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstSchemaDefinition_32=ruleConstSchemaDefinition();

                    state._fsp--;


                    			current = this_ConstSchemaDefinition_32;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 34 :
                    // InternalJsonSchemaDsl.g:458:3: this_EnumSchemaDefinition_33= ruleEnumSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getEnumSchemaDefinitionParserRuleCall_33());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumSchemaDefinition_33=ruleEnumSchemaDefinition();

                    state._fsp--;


                    			current = this_EnumSchemaDefinition_33;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 35 :
                    // InternalJsonSchemaDsl.g:467:3: this_TypeSchemaDefinition_34= ruleTypeSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getTypeSchemaDefinitionParserRuleCall_34());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSchemaDefinition_34=ruleTypeSchemaDefinition();

                    state._fsp--;


                    			current = this_TypeSchemaDefinition_34;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 36 :
                    // InternalJsonSchemaDsl.g:476:3: this_FormatSchemaDefinition_35= ruleFormatSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getFormatSchemaDefinitionParserRuleCall_35());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormatSchemaDefinition_35=ruleFormatSchemaDefinition();

                    state._fsp--;


                    			current = this_FormatSchemaDefinition_35;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 37 :
                    // InternalJsonSchemaDsl.g:485:3: this_ContentMediaTypeSchemaDefinition_36= ruleContentMediaTypeSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getContentMediaTypeSchemaDefinitionParserRuleCall_36());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentMediaTypeSchemaDefinition_36=ruleContentMediaTypeSchemaDefinition();

                    state._fsp--;


                    			current = this_ContentMediaTypeSchemaDefinition_36;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 38 :
                    // InternalJsonSchemaDsl.g:494:3: this_ContentEncodingSchemaDefinition_37= ruleContentEncodingSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getContentEncodingSchemaDefinitionParserRuleCall_37());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentEncodingSchemaDefinition_37=ruleContentEncodingSchemaDefinition();

                    state._fsp--;


                    			current = this_ContentEncodingSchemaDefinition_37;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 39 :
                    // InternalJsonSchemaDsl.g:503:3: this_IfSchemaDefinition_38= ruleIfSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getIfSchemaDefinitionParserRuleCall_38());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfSchemaDefinition_38=ruleIfSchemaDefinition();

                    state._fsp--;


                    			current = this_IfSchemaDefinition_38;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 40 :
                    // InternalJsonSchemaDsl.g:512:3: this_ThenSchemaDefinition_39= ruleThenSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getThenSchemaDefinitionParserRuleCall_39());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThenSchemaDefinition_39=ruleThenSchemaDefinition();

                    state._fsp--;


                    			current = this_ThenSchemaDefinition_39;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 41 :
                    // InternalJsonSchemaDsl.g:521:3: this_ElseSchemaDefinition_40= ruleElseSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getElseSchemaDefinitionParserRuleCall_40());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElseSchemaDefinition_40=ruleElseSchemaDefinition();

                    state._fsp--;


                    			current = this_ElseSchemaDefinition_40;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 42 :
                    // InternalJsonSchemaDsl.g:530:3: this_AllOfSchemaDefinition_41= ruleAllOfSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getAllOfSchemaDefinitionParserRuleCall_41());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllOfSchemaDefinition_41=ruleAllOfSchemaDefinition();

                    state._fsp--;


                    			current = this_AllOfSchemaDefinition_41;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 43 :
                    // InternalJsonSchemaDsl.g:539:3: this_AnyOfSchemaDefinition_42= ruleAnyOfSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getAnyOfSchemaDefinitionParserRuleCall_42());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyOfSchemaDefinition_42=ruleAnyOfSchemaDefinition();

                    state._fsp--;


                    			current = this_AnyOfSchemaDefinition_42;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 44 :
                    // InternalJsonSchemaDsl.g:548:3: this_OneOfSchemaDefinition_43= ruleOneOfSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getOneOfSchemaDefinitionParserRuleCall_43());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneOfSchemaDefinition_43=ruleOneOfSchemaDefinition();

                    state._fsp--;


                    			current = this_OneOfSchemaDefinition_43;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 45 :
                    // InternalJsonSchemaDsl.g:557:3: this_NotSchemaDefinition_44= ruleNotSchemaDefinition
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getNotSchemaDefinitionParserRuleCall_44());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotSchemaDefinition_44=ruleNotSchemaDefinition();

                    state._fsp--;


                    			current = this_NotSchemaDefinition_44;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 46 :
                    // InternalJsonSchemaDsl.g:566:3: this_KeyValuePair_45= ruleKeyValuePair
                    {

                    			newCompositeNode(grammarAccess.getKeywordDefinitionAccess().getKeyValuePairParserRuleCall_45());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyValuePair_45=ruleKeyValuePair();

                    state._fsp--;


                    			current = this_KeyValuePair_45;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeywordDefinition"


    // $ANTLR start "entryRuleValue"
    // InternalJsonSchemaDsl.g:578:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalJsonSchemaDsl.g:578:46: (iv_ruleValue= ruleValue EOF )
            // InternalJsonSchemaDsl.g:579:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJsonSchemaDsl.g:585:1: ruleValue returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_StringValue_3 = null;

        EObject this_ObjectValue_4 = null;

        EObject this_NumberValue_5 = null;

        EObject this_ArrayValue_6 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:591:2: ( (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue ) )
            // InternalJsonSchemaDsl.g:592:2: (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue )
            {
            // InternalJsonSchemaDsl.g:592:2: (this_IntegerValue_0= ruleIntegerValue | this_BooleanValue_1= ruleBooleanValue | this_NullValue_2= ruleNullValue | this_StringValue_3= ruleStringValue | this_ObjectValue_4= ruleObjectValue | this_NumberValue_5= ruleNumberValue | this_ArrayValue_6= ruleArrayValue )
            int alt4=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 65:
                {
                alt4=1;
                }
                break;
            case 62:
            case 63:
                {
                alt4=2;
                }
                break;
            case 64:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
            case 15:
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 66:
            case 67:
                {
                alt4=4;
                }
                break;
            case 12:
                {
                alt4=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJsonSchemaDsl.g:593:3: this_IntegerValue_0= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_0=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:602:3: this_BooleanValue_1= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:611:3: this_NullValue_2= ruleNullValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;


                    			current = this_NullValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:620:3: this_StringValue_3= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:629:3: this_ObjectValue_4= ruleObjectValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_4=ruleObjectValue();

                    state._fsp--;


                    			current = this_ObjectValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:638:3: this_NumberValue_5= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_5=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:647:3: this_ArrayValue_6= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_6=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleObjectSchema"
    // InternalJsonSchemaDsl.g:659:1: entryRuleObjectSchema returns [EObject current=null] : iv_ruleObjectSchema= ruleObjectSchema EOF ;
    public final EObject entryRuleObjectSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSchema = null;


        try {
            // InternalJsonSchemaDsl.g:659:53: (iv_ruleObjectSchema= ruleObjectSchema EOF )
            // InternalJsonSchemaDsl.g:660:2: iv_ruleObjectSchema= ruleObjectSchema EOF
            {
             newCompositeNode(grammarAccess.getObjectSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectSchema=ruleObjectSchema();

            state._fsp--;

             current =iv_ruleObjectSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectSchema"


    // $ANTLR start "ruleObjectSchema"
    // InternalJsonSchemaDsl.g:666:1: ruleObjectSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleObjectSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keywordDefinition_2_0 = null;

        EObject lv_keywordDefinition_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:672:2: ( ( () otherlv_1= '{' ( ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonSchemaDsl.g:673:2: ( () otherlv_1= '{' ( ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonSchemaDsl.g:673:2: ( () otherlv_1= '{' ( ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )* )? otherlv_5= '}' )
            // InternalJsonSchemaDsl.g:674:3: () otherlv_1= '{' ( ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonSchemaDsl.g:674:3: ()
            // InternalJsonSchemaDsl.g:675:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectSchemaAccess().getObjectSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:685:3: ( ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING||LA6_0==15||(LA6_0>=17 && LA6_0<=19)||(LA6_0>=21 && LA6_0<=61)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonSchemaDsl.g:686:4: ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) ) (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:686:4: ( (lv_keywordDefinition_2_0= ruleKeywordDefinition ) )
                    // InternalJsonSchemaDsl.g:687:5: (lv_keywordDefinition_2_0= ruleKeywordDefinition )
                    {
                    // InternalJsonSchemaDsl.g:687:5: (lv_keywordDefinition_2_0= ruleKeywordDefinition )
                    // InternalJsonSchemaDsl.g:688:6: lv_keywordDefinition_2_0= ruleKeywordDefinition
                    {

                    						newCompositeNode(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionKeywordDefinitionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keywordDefinition_2_0=ruleKeywordDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectSchemaRule());
                    						}
                    						add(
                    							current,
                    							"keywordDefinition",
                    							lv_keywordDefinition_2_0,
                    							"at.jku.bise.JsonSchemaDsl.KeywordDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:705:4: (otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:706:5: otherlv_3= ',' ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectSchemaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:710:5: ( (lv_keywordDefinition_4_0= ruleKeywordDefinition ) )
                    	    // InternalJsonSchemaDsl.g:711:6: (lv_keywordDefinition_4_0= ruleKeywordDefinition )
                    	    {
                    	    // InternalJsonSchemaDsl.g:711:6: (lv_keywordDefinition_4_0= ruleKeywordDefinition )
                    	    // InternalJsonSchemaDsl.g:712:7: lv_keywordDefinition_4_0= ruleKeywordDefinition
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionKeywordDefinitionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keywordDefinition_4_0=ruleKeywordDefinition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectSchemaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keywordDefinition",
                    	    								lv_keywordDefinition_4_0,
                    	    								"at.jku.bise.JsonSchemaDsl.KeywordDefinition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectSchemaAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectSchema"


    // $ANTLR start "entryRuleBooleanSchema"
    // InternalJsonSchemaDsl.g:739:1: entryRuleBooleanSchema returns [EObject current=null] : iv_ruleBooleanSchema= ruleBooleanSchema EOF ;
    public final EObject entryRuleBooleanSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSchema = null;


        try {
            // InternalJsonSchemaDsl.g:739:54: (iv_ruleBooleanSchema= ruleBooleanSchema EOF )
            // InternalJsonSchemaDsl.g:740:2: iv_ruleBooleanSchema= ruleBooleanSchema EOF
            {
             newCompositeNode(grammarAccess.getBooleanSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSchema=ruleBooleanSchema();

            state._fsp--;

             current =iv_ruleBooleanSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSchema"


    // $ANTLR start "ruleBooleanSchema"
    // InternalJsonSchemaDsl.g:746:1: ruleBooleanSchema returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanSchema() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:752:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalJsonSchemaDsl.g:753:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalJsonSchemaDsl.g:753:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:754:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:754:3: (lv_value_0_0= ruleEBoolean )
            // InternalJsonSchemaDsl.g:755:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanSchemaAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanSchemaRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.EBoolean");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanSchema"


    // $ANTLR start "entryRuleMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:775:1: entryRuleMaximumSchemaDefinition returns [EObject current=null] : iv_ruleMaximumSchemaDefinition= ruleMaximumSchemaDefinition EOF ;
    public final EObject entryRuleMaximumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:775:64: (iv_ruleMaximumSchemaDefinition= ruleMaximumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:776:2: iv_ruleMaximumSchemaDefinition= ruleMaximumSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMaximumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaximumSchemaDefinition=ruleMaximumSchemaDefinition();

            state._fsp--;

             current =iv_ruleMaximumSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximumSchemaDefinition"


    // $ANTLR start "ruleMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:782:1: ruleMaximumSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleMaximumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_maximum_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:788:2: ( (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:789:2: (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:789:2: (otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:790:3: otherlv_0= '\"maximum\"' otherlv_1= ':' ( (lv_maximum_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMaximumSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:798:3: ( (lv_maximum_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:799:4: (lv_maximum_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:799:4: (lv_maximum_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:800:5: lv_maximum_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_maximum_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaximumSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"maximum",
            						lv_maximum_2_0,
            						"at.jku.bise.JsonSchemaDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximumSchemaDefinition"


    // $ANTLR start "entryRuleWriteOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:821:1: entryRuleWriteOnlySchemaDefinition returns [EObject current=null] : iv_ruleWriteOnlySchemaDefinition= ruleWriteOnlySchemaDefinition EOF ;
    public final EObject entryRuleWriteOnlySchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteOnlySchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:821:66: (iv_ruleWriteOnlySchemaDefinition= ruleWriteOnlySchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:822:2: iv_ruleWriteOnlySchemaDefinition= ruleWriteOnlySchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getWriteOnlySchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteOnlySchemaDefinition=ruleWriteOnlySchemaDefinition();

            state._fsp--;

             current =iv_ruleWriteOnlySchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteOnlySchemaDefinition"


    // $ANTLR start "ruleWriteOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:828:1: ruleWriteOnlySchemaDefinition returns [EObject current=null] : (otherlv_0= '\"writeOnly\"' otherlv_1= ':' ( (lv_writeOnly_2_0= ruleEBoolean ) ) ) ;
    public final EObject ruleWriteOnlySchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_writeOnly_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:834:2: ( (otherlv_0= '\"writeOnly\"' otherlv_1= ':' ( (lv_writeOnly_2_0= ruleEBoolean ) ) ) )
            // InternalJsonSchemaDsl.g:835:2: (otherlv_0= '\"writeOnly\"' otherlv_1= ':' ( (lv_writeOnly_2_0= ruleEBoolean ) ) )
            {
            // InternalJsonSchemaDsl.g:835:2: (otherlv_0= '\"writeOnly\"' otherlv_1= ':' ( (lv_writeOnly_2_0= ruleEBoolean ) ) )
            // InternalJsonSchemaDsl.g:836:3: otherlv_0= '\"writeOnly\"' otherlv_1= ':' ( (lv_writeOnly_2_0= ruleEBoolean ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteOnlySchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:844:3: ( (lv_writeOnly_2_0= ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:845:4: (lv_writeOnly_2_0= ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:845:4: (lv_writeOnly_2_0= ruleEBoolean )
            // InternalJsonSchemaDsl.g:846:5: lv_writeOnly_2_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyEBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_writeOnly_2_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWriteOnlySchemaDefinitionRule());
            					}
            					set(
            						current,
            						"writeOnly",
            						lv_writeOnly_2_0,
            						"at.jku.bise.JsonSchemaDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteOnlySchemaDefinition"


    // $ANTLR start "entryRuleCommentSchemaDefinition"
    // InternalJsonSchemaDsl.g:867:1: entryRuleCommentSchemaDefinition returns [EObject current=null] : iv_ruleCommentSchemaDefinition= ruleCommentSchemaDefinition EOF ;
    public final EObject entryRuleCommentSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:867:64: (iv_ruleCommentSchemaDefinition= ruleCommentSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:868:2: iv_ruleCommentSchemaDefinition= ruleCommentSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getCommentSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentSchemaDefinition=ruleCommentSchemaDefinition();

            state._fsp--;

             current =iv_ruleCommentSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentSchemaDefinition"


    // $ANTLR start "ruleCommentSchemaDefinition"
    // InternalJsonSchemaDsl.g:874:1: ruleCommentSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"$comment\"' otherlv_1= ':' ( (lv_comment_2_0= ruleEString ) ) ) ;
    public final EObject ruleCommentSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_comment_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:880:2: ( (otherlv_0= '\"$comment\"' otherlv_1= ':' ( (lv_comment_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:881:2: (otherlv_0= '\"$comment\"' otherlv_1= ':' ( (lv_comment_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:881:2: (otherlv_0= '\"$comment\"' otherlv_1= ':' ( (lv_comment_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:882:3: otherlv_0= '\"$comment\"' otherlv_1= ':' ( (lv_comment_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentSchemaDefinitionAccess().getCommentKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:890:3: ( (lv_comment_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:891:4: (lv_comment_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:891:4: (lv_comment_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:892:5: lv_comment_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentSchemaDefinitionAccess().getCommentEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_comment_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentSchemaDefinition"


    // $ANTLR start "entryRuleEnumSchemaDefinition"
    // InternalJsonSchemaDsl.g:913:1: entryRuleEnumSchemaDefinition returns [EObject current=null] : iv_ruleEnumSchemaDefinition= ruleEnumSchemaDefinition EOF ;
    public final EObject entryRuleEnumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:913:61: (iv_ruleEnumSchemaDefinition= ruleEnumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:914:2: iv_ruleEnumSchemaDefinition= ruleEnumSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumSchemaDefinition=ruleEnumSchemaDefinition();

            state._fsp--;

             current =iv_ruleEnumSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumSchemaDefinition"


    // $ANTLR start "ruleEnumSchemaDefinition"
    // InternalJsonSchemaDsl.g:920:1: ruleEnumSchemaDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleJsonDocument ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEnumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:926:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleJsonDocument ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) ) )* otherlv_4= ']' ) )
            // InternalJsonSchemaDsl.g:927:2: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonDocument ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) ) )* otherlv_4= ']' )
            {
            // InternalJsonSchemaDsl.g:927:2: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonDocument ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) ) )* otherlv_4= ']' )
            // InternalJsonSchemaDsl.g:928:3: otherlv_0= '[' ( (lv_items_1_0= ruleJsonDocument ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumSchemaDefinitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonSchemaDsl.g:932:3: ( (lv_items_1_0= ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:933:4: (lv_items_1_0= ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:933:4: (lv_items_1_0= ruleJsonDocument )
            // InternalJsonSchemaDsl.g:934:5: lv_items_1_0= ruleJsonDocument
            {

            					newCompositeNode(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_items_1_0=ruleJsonDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumSchemaDefinitionRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_1_0,
            						"at.jku.bise.JsonSchemaDsl.JsonDocument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonSchemaDsl.g:951:3: (otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:952:4: otherlv_2= ',' ( (lv_items_3_0= ruleJsonDocument ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumSchemaDefinitionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonSchemaDsl.g:956:4: ( (lv_items_3_0= ruleJsonDocument ) )
            	    // InternalJsonSchemaDsl.g:957:5: (lv_items_3_0= ruleJsonDocument )
            	    {
            	    // InternalJsonSchemaDsl.g:957:5: (lv_items_3_0= ruleJsonDocument )
            	    // InternalJsonSchemaDsl.g:958:6: lv_items_3_0= ruleJsonDocument
            	    {

            	    						newCompositeNode(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_items_3_0=ruleJsonDocument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumSchemaDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_3_0,
            	    							"at.jku.bise.JsonSchemaDsl.JsonDocument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumSchemaDefinitionAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumSchemaDefinition"


    // $ANTLR start "entryRuleUniqueItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:984:1: entryRuleUniqueItemsSchemaDefinition returns [EObject current=null] : iv_ruleUniqueItemsSchemaDefinition= ruleUniqueItemsSchemaDefinition EOF ;
    public final EObject entryRuleUniqueItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueItemsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:984:68: (iv_ruleUniqueItemsSchemaDefinition= ruleUniqueItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:985:2: iv_ruleUniqueItemsSchemaDefinition= ruleUniqueItemsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getUniqueItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniqueItemsSchemaDefinition=ruleUniqueItemsSchemaDefinition();

            state._fsp--;

             current =iv_ruleUniqueItemsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniqueItemsSchemaDefinition"


    // $ANTLR start "ruleUniqueItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:991:1: ruleUniqueItemsSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"uniqueItems\"' otherlv_1= ':' ( (lv_uniqueItems_2_0= ruleEBoolean ) ) ) ;
    public final EObject ruleUniqueItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uniqueItems_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:997:2: ( (otherlv_0= '\"uniqueItems\"' otherlv_1= ':' ( (lv_uniqueItems_2_0= ruleEBoolean ) ) ) )
            // InternalJsonSchemaDsl.g:998:2: (otherlv_0= '\"uniqueItems\"' otherlv_1= ':' ( (lv_uniqueItems_2_0= ruleEBoolean ) ) )
            {
            // InternalJsonSchemaDsl.g:998:2: (otherlv_0= '\"uniqueItems\"' otherlv_1= ':' ( (lv_uniqueItems_2_0= ruleEBoolean ) ) )
            // InternalJsonSchemaDsl.g:999:3: otherlv_0= '\"uniqueItems\"' otherlv_1= ':' ( (lv_uniqueItems_2_0= ruleEBoolean ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUniqueItemsSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1007:3: ( (lv_uniqueItems_2_0= ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:1008:4: (lv_uniqueItems_2_0= ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:1008:4: (lv_uniqueItems_2_0= ruleEBoolean )
            // InternalJsonSchemaDsl.g:1009:5: lv_uniqueItems_2_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsEBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_uniqueItems_2_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniqueItemsSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"uniqueItems",
            						lv_uniqueItems_2_0,
            						"at.jku.bise.JsonSchemaDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniqueItemsSchemaDefinition"


    // $ANTLR start "entryRuleAnyOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1030:1: entryRuleAnyOfSchemaDefinition returns [EObject current=null] : iv_ruleAnyOfSchemaDefinition= ruleAnyOfSchemaDefinition EOF ;
    public final EObject entryRuleAnyOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyOfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1030:62: (iv_ruleAnyOfSchemaDefinition= ruleAnyOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1031:2: iv_ruleAnyOfSchemaDefinition= ruleAnyOfSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getAnyOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyOfSchemaDefinition=ruleAnyOfSchemaDefinition();

            state._fsp--;

             current =iv_ruleAnyOfSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyOfSchemaDefinition"


    // $ANTLR start "ruleAnyOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1037:1: ruleAnyOfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"anyOf\"' otherlv_1= ':' ( (lv_anyOf_2_0= ruleSchemaArray ) ) ) ;
    public final EObject ruleAnyOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_anyOf_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1043:2: ( (otherlv_0= '\"anyOf\"' otherlv_1= ':' ( (lv_anyOf_2_0= ruleSchemaArray ) ) ) )
            // InternalJsonSchemaDsl.g:1044:2: (otherlv_0= '\"anyOf\"' otherlv_1= ':' ( (lv_anyOf_2_0= ruleSchemaArray ) ) )
            {
            // InternalJsonSchemaDsl.g:1044:2: (otherlv_0= '\"anyOf\"' otherlv_1= ':' ( (lv_anyOf_2_0= ruleSchemaArray ) ) )
            // InternalJsonSchemaDsl.g:1045:3: otherlv_0= '\"anyOf\"' otherlv_1= ':' ( (lv_anyOf_2_0= ruleSchemaArray ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAnyOfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1053:3: ( (lv_anyOf_2_0= ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:1054:4: (lv_anyOf_2_0= ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:1054:4: (lv_anyOf_2_0= ruleSchemaArray )
            // InternalJsonSchemaDsl.g:1055:5: lv_anyOf_2_0= ruleSchemaArray
            {

            					newCompositeNode(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfSchemaArrayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_anyOf_2_0=ruleSchemaArray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnyOfSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"anyOf",
            						lv_anyOf_2_0,
            						"at.jku.bise.JsonSchemaDsl.SchemaArray");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyOfSchemaDefinition"


    // $ANTLR start "entryRuleTitleSchemaDefinition"
    // InternalJsonSchemaDsl.g:1076:1: entryRuleTitleSchemaDefinition returns [EObject current=null] : iv_ruleTitleSchemaDefinition= ruleTitleSchemaDefinition EOF ;
    public final EObject entryRuleTitleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1076:62: (iv_ruleTitleSchemaDefinition= ruleTitleSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1077:2: iv_ruleTitleSchemaDefinition= ruleTitleSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getTitleSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitleSchemaDefinition=ruleTitleSchemaDefinition();

            state._fsp--;

             current =iv_ruleTitleSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitleSchemaDefinition"


    // $ANTLR start "ruleTitleSchemaDefinition"
    // InternalJsonSchemaDsl.g:1083:1: ruleTitleSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"title\"' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) ) ;
    public final EObject ruleTitleSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1089:2: ( (otherlv_0= '\"title\"' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:1090:2: (otherlv_0= '\"title\"' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:1090:2: (otherlv_0= '\"title\"' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:1091:3: otherlv_0= '\"title\"' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleSchemaDefinitionAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1099:3: ( (lv_title_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:1100:4: (lv_title_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:1100:4: (lv_title_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:1101:5: lv_title_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTitleSchemaDefinitionAccess().getTitleEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_title_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitleSchemaDefinition"


    // $ANTLR start "entryRuleItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1122:1: entryRuleItemsSchemaDefinition returns [EObject current=null] : iv_ruleItemsSchemaDefinition= ruleItemsSchemaDefinition EOF ;
    public final EObject entryRuleItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1122:62: (iv_ruleItemsSchemaDefinition= ruleItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1123:2: iv_ruleItemsSchemaDefinition= ruleItemsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemsSchemaDefinition=ruleItemsSchemaDefinition();

            state._fsp--;

             current =iv_ruleItemsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemsSchemaDefinition"


    // $ANTLR start "ruleItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1129:1: ruleItemsSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"items\"' otherlv_2= ':' ( (lv_itemsAnyOf1_3_0= ruleSchema ) )? ( (lv_itemsAnyOf2_4_0= ruleSchemaArray ) )? ) ;
    public final EObject ruleItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_itemsAnyOf1_3_0 = null;

        EObject lv_itemsAnyOf2_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1135:2: ( ( () otherlv_1= '\"items\"' otherlv_2= ':' ( (lv_itemsAnyOf1_3_0= ruleSchema ) )? ( (lv_itemsAnyOf2_4_0= ruleSchemaArray ) )? ) )
            // InternalJsonSchemaDsl.g:1136:2: ( () otherlv_1= '\"items\"' otherlv_2= ':' ( (lv_itemsAnyOf1_3_0= ruleSchema ) )? ( (lv_itemsAnyOf2_4_0= ruleSchemaArray ) )? )
            {
            // InternalJsonSchemaDsl.g:1136:2: ( () otherlv_1= '\"items\"' otherlv_2= ':' ( (lv_itemsAnyOf1_3_0= ruleSchema ) )? ( (lv_itemsAnyOf2_4_0= ruleSchemaArray ) )? )
            // InternalJsonSchemaDsl.g:1137:3: () otherlv_1= '\"items\"' otherlv_2= ':' ( (lv_itemsAnyOf1_3_0= ruleSchema ) )? ( (lv_itemsAnyOf2_4_0= ruleSchemaArray ) )?
            {
            // InternalJsonSchemaDsl.g:1137:3: ()
            // InternalJsonSchemaDsl.g:1138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getItemsSchemaDefinitionAccess().getItemsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getItemsSchemaDefinitionAccess().getColonKeyword_2());
            		
            // InternalJsonSchemaDsl.g:1152:3: ( (lv_itemsAnyOf1_3_0= ruleSchema ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12||(LA8_0>=62 && LA8_0<=63)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1153:4: (lv_itemsAnyOf1_3_0= ruleSchema )
                    {
                    // InternalJsonSchemaDsl.g:1153:4: (lv_itemsAnyOf1_3_0= ruleSchema )
                    // InternalJsonSchemaDsl.g:1154:5: lv_itemsAnyOf1_3_0= ruleSchema
                    {

                    					newCompositeNode(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1SchemaParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_itemsAnyOf1_3_0=ruleSchema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getItemsSchemaDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"itemsAnyOf1",
                    						lv_itemsAnyOf1_3_0,
                    						"at.jku.bise.JsonSchemaDsl.Schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJsonSchemaDsl.g:1171:3: ( (lv_itemsAnyOf2_4_0= ruleSchemaArray ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1172:4: (lv_itemsAnyOf2_4_0= ruleSchemaArray )
                    {
                    // InternalJsonSchemaDsl.g:1172:4: (lv_itemsAnyOf2_4_0= ruleSchemaArray )
                    // InternalJsonSchemaDsl.g:1173:5: lv_itemsAnyOf2_4_0= ruleSchemaArray
                    {

                    					newCompositeNode(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2SchemaArrayParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_itemsAnyOf2_4_0=ruleSchemaArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getItemsSchemaDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"itemsAnyOf2",
                    						lv_itemsAnyOf2_4_0,
                    						"at.jku.bise.JsonSchemaDsl.SchemaArray");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemsSchemaDefinition"


    // $ANTLR start "entryRuleDefaultSchemaDefinition"
    // InternalJsonSchemaDsl.g:1194:1: entryRuleDefaultSchemaDefinition returns [EObject current=null] : iv_ruleDefaultSchemaDefinition= ruleDefaultSchemaDefinition EOF ;
    public final EObject entryRuleDefaultSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1194:64: (iv_ruleDefaultSchemaDefinition= ruleDefaultSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1195:2: iv_ruleDefaultSchemaDefinition= ruleDefaultSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefaultSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultSchemaDefinition=ruleDefaultSchemaDefinition();

            state._fsp--;

             current =iv_ruleDefaultSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultSchemaDefinition"


    // $ANTLR start "ruleDefaultSchemaDefinition"
    // InternalJsonSchemaDsl.g:1201:1: ruleDefaultSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"default\"' otherlv_1= ':' ( (lv_default_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleDefaultSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_default_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1207:2: ( (otherlv_0= '\"default\"' otherlv_1= ':' ( (lv_default_2_0= ruleJsonDocument ) ) ) )
            // InternalJsonSchemaDsl.g:1208:2: (otherlv_0= '\"default\"' otherlv_1= ':' ( (lv_default_2_0= ruleJsonDocument ) ) )
            {
            // InternalJsonSchemaDsl.g:1208:2: (otherlv_0= '\"default\"' otherlv_1= ':' ( (lv_default_2_0= ruleJsonDocument ) ) )
            // InternalJsonSchemaDsl.g:1209:3: otherlv_0= '\"default\"' otherlv_1= ':' ( (lv_default_2_0= ruleJsonDocument ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1217:3: ( (lv_default_2_0= ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:1218:4: (lv_default_2_0= ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:1218:4: (lv_default_2_0= ruleJsonDocument )
            // InternalJsonSchemaDsl.g:1219:5: lv_default_2_0= ruleJsonDocument
            {

            					newCompositeNode(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultJsonDocumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_default_2_0=ruleJsonDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"default",
            						lv_default_2_0,
            						"at.jku.bise.JsonSchemaDsl.JsonDocument");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultSchemaDefinition"


    // $ANTLR start "entryRuleThenSchemaDefinition"
    // InternalJsonSchemaDsl.g:1240:1: entryRuleThenSchemaDefinition returns [EObject current=null] : iv_ruleThenSchemaDefinition= ruleThenSchemaDefinition EOF ;
    public final EObject entryRuleThenSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1240:61: (iv_ruleThenSchemaDefinition= ruleThenSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1241:2: iv_ruleThenSchemaDefinition= ruleThenSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getThenSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThenSchemaDefinition=ruleThenSchemaDefinition();

            state._fsp--;

             current =iv_ruleThenSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThenSchemaDefinition"


    // $ANTLR start "ruleThenSchemaDefinition"
    // InternalJsonSchemaDsl.g:1247:1: ruleThenSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"then\"' otherlv_1= ':' ( (lv_then_2_0= ruleSchema ) ) ) ;
    public final EObject ruleThenSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_then_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1253:2: ( (otherlv_0= '\"then\"' otherlv_1= ':' ( (lv_then_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:1254:2: (otherlv_0= '\"then\"' otherlv_1= ':' ( (lv_then_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:1254:2: (otherlv_0= '\"then\"' otherlv_1= ':' ( (lv_then_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:1255:3: otherlv_0= '\"then\"' otherlv_1= ':' ( (lv_then_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getThenSchemaDefinitionAccess().getThenKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getThenSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1263:3: ( (lv_then_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:1264:4: (lv_then_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:1264:4: (lv_then_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:1265:5: lv_then_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getThenSchemaDefinitionAccess().getThenSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_then_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThenSchemaDefinition"


    // $ANTLR start "entryRuleMinLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:1286:1: entryRuleMinLengthSchemaDefinition returns [EObject current=null] : iv_ruleMinLengthSchemaDefinition= ruleMinLengthSchemaDefinition EOF ;
    public final EObject entryRuleMinLengthSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinLengthSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1286:66: (iv_ruleMinLengthSchemaDefinition= ruleMinLengthSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1287:2: iv_ruleMinLengthSchemaDefinition= ruleMinLengthSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMinLengthSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinLengthSchemaDefinition=ruleMinLengthSchemaDefinition();

            state._fsp--;

             current =iv_ruleMinLengthSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinLengthSchemaDefinition"


    // $ANTLR start "ruleMinLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:1293:1: ruleMinLengthSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"minLength\"' otherlv_1= ':' ( (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 ) ) ) ;
    public final EObject ruleMinLengthSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_minLength_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1299:2: ( (otherlv_0= '\"minLength\"' otherlv_1= ':' ( (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 ) ) ) )
            // InternalJsonSchemaDsl.g:1300:2: (otherlv_0= '\"minLength\"' otherlv_1= ':' ( (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 ) ) )
            {
            // InternalJsonSchemaDsl.g:1300:2: (otherlv_0= '\"minLength\"' otherlv_1= ':' ( (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 ) ) )
            // InternalJsonSchemaDsl.g:1301:3: otherlv_0= '\"minLength\"' otherlv_1= ':' ( (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMinLengthSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1309:3: ( (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:1310:4: (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:1310:4: (lv_minLength_2_0= ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:1311:5: lv_minLength_2_0= ruleNonNegativeIntegerDefault0
            {

            					newCompositeNode(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthNonNegativeIntegerDefault0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_minLength_2_0=ruleNonNegativeIntegerDefault0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinLengthSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"minLength",
            						lv_minLength_2_0,
            						"at.jku.bise.JsonSchemaDsl.NonNegativeIntegerDefault0");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinLengthSchemaDefinition"


    // $ANTLR start "entryRuleDefinitionsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1332:1: entryRuleDefinitionsSchemaDefinition returns [EObject current=null] : iv_ruleDefinitionsSchemaDefinition= ruleDefinitionsSchemaDefinition EOF ;
    public final EObject entryRuleDefinitionsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1332:68: (iv_ruleDefinitionsSchemaDefinition= ruleDefinitionsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1333:2: iv_ruleDefinitionsSchemaDefinition= ruleDefinitionsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionsSchemaDefinition=ruleDefinitionsSchemaDefinition();

            state._fsp--;

             current =iv_ruleDefinitionsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionsSchemaDefinition"


    // $ANTLR start "ruleDefinitionsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1339:1: ruleDefinitionsSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"definitions\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleDefinitionsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_keySchemaPairs_4_0 = null;

        EObject lv_keySchemaPairs_6_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1345:2: ( ( () otherlv_1= '\"definitions\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) )
            // InternalJsonSchemaDsl.g:1346:2: ( () otherlv_1= '\"definitions\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            {
            // InternalJsonSchemaDsl.g:1346:2: ( () otherlv_1= '\"definitions\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            // InternalJsonSchemaDsl.g:1347:3: () otherlv_1= '\"definitions\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}'
            {
            // InternalJsonSchemaDsl.g:1347:3: ()
            // InternalJsonSchemaDsl.g:1348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionsSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:1366:3: ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||LA11_0==15||(LA11_0>=17 && LA11_0<=18)||(LA11_0>=21 && LA11_0<=61)||(LA11_0>=66 && LA11_0<=67)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1367:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:1367:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) )
                    // InternalJsonSchemaDsl.g:1368:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    {
                    // InternalJsonSchemaDsl.g:1368:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    // InternalJsonSchemaDsl.g:1369:6: lv_keySchemaPairs_4_0= ruleKeySchemaPair
                    {

                    						newCompositeNode(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keySchemaPairs_4_0=ruleKeySchemaPair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionsSchemaDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"keySchemaPairs",
                    							lv_keySchemaPairs_4_0,
                    							"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:1386:4: (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:1387:5: otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDefinitionsSchemaDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:1391:5: ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    // InternalJsonSchemaDsl.g:1392:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    {
                    	    // InternalJsonSchemaDsl.g:1392:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    // InternalJsonSchemaDsl.g:1393:7: lv_keySchemaPairs_6_0= ruleKeySchemaPair
                    	    {

                    	    							newCompositeNode(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keySchemaPairs_6_0=ruleKeySchemaPair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDefinitionsSchemaDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keySchemaPairs",
                    	    								lv_keySchemaPairs_6_0,
                    	    								"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDefinitionsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionsSchemaDefinition"


    // $ANTLR start "entryRuleMinItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1420:1: entryRuleMinItemsSchemaDefinition returns [EObject current=null] : iv_ruleMinItemsSchemaDefinition= ruleMinItemsSchemaDefinition EOF ;
    public final EObject entryRuleMinItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinItemsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1420:65: (iv_ruleMinItemsSchemaDefinition= ruleMinItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1421:2: iv_ruleMinItemsSchemaDefinition= ruleMinItemsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMinItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinItemsSchemaDefinition=ruleMinItemsSchemaDefinition();

            state._fsp--;

             current =iv_ruleMinItemsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinItemsSchemaDefinition"


    // $ANTLR start "ruleMinItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1427:1: ruleMinItemsSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"minItems\"' otherlv_1= ':' ( (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 ) ) ) ;
    public final EObject ruleMinItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_minItems_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1433:2: ( (otherlv_0= '\"minItems\"' otherlv_1= ':' ( (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 ) ) ) )
            // InternalJsonSchemaDsl.g:1434:2: (otherlv_0= '\"minItems\"' otherlv_1= ':' ( (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 ) ) )
            {
            // InternalJsonSchemaDsl.g:1434:2: (otherlv_0= '\"minItems\"' otherlv_1= ':' ( (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 ) ) )
            // InternalJsonSchemaDsl.g:1435:3: otherlv_0= '\"minItems\"' otherlv_1= ':' ( (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMinItemsSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1443:3: ( (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:1444:4: (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:1444:4: (lv_minItems_2_0= ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:1445:5: lv_minItems_2_0= ruleNonNegativeIntegerDefault0
            {

            					newCompositeNode(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsNonNegativeIntegerDefault0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_minItems_2_0=ruleNonNegativeIntegerDefault0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinItemsSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"minItems",
            						lv_minItems_2_0,
            						"at.jku.bise.JsonSchemaDsl.NonNegativeIntegerDefault0");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinItemsSchemaDefinition"


    // $ANTLR start "entryRuleOneOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1466:1: entryRuleOneOfSchemaDefinition returns [EObject current=null] : iv_ruleOneOfSchemaDefinition= ruleOneOfSchemaDefinition EOF ;
    public final EObject entryRuleOneOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1466:62: (iv_ruleOneOfSchemaDefinition= ruleOneOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1467:2: iv_ruleOneOfSchemaDefinition= ruleOneOfSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getOneOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneOfSchemaDefinition=ruleOneOfSchemaDefinition();

            state._fsp--;

             current =iv_ruleOneOfSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneOfSchemaDefinition"


    // $ANTLR start "ruleOneOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1473:1: ruleOneOfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"oneOf\"' otherlv_1= ':' ( (lv_oneOf_2_0= ruleSchemaArray ) ) ) ;
    public final EObject ruleOneOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oneOf_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1479:2: ( (otherlv_0= '\"oneOf\"' otherlv_1= ':' ( (lv_oneOf_2_0= ruleSchemaArray ) ) ) )
            // InternalJsonSchemaDsl.g:1480:2: (otherlv_0= '\"oneOf\"' otherlv_1= ':' ( (lv_oneOf_2_0= ruleSchemaArray ) ) )
            {
            // InternalJsonSchemaDsl.g:1480:2: (otherlv_0= '\"oneOf\"' otherlv_1= ':' ( (lv_oneOf_2_0= ruleSchemaArray ) ) )
            // InternalJsonSchemaDsl.g:1481:3: otherlv_0= '\"oneOf\"' otherlv_1= ':' ( (lv_oneOf_2_0= ruleSchemaArray ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOneOfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1489:3: ( (lv_oneOf_2_0= ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:1490:4: (lv_oneOf_2_0= ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:1490:4: (lv_oneOf_2_0= ruleSchemaArray )
            // InternalJsonSchemaDsl.g:1491:5: lv_oneOf_2_0= ruleSchemaArray
            {

            					newCompositeNode(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfSchemaArrayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_oneOf_2_0=ruleSchemaArray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneOfSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"oneOf",
            						lv_oneOf_2_0,
            						"at.jku.bise.JsonSchemaDsl.SchemaArray");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneOfSchemaDefinition"


    // $ANTLR start "entryRuleMaxPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1512:1: entryRuleMaxPropertiesSchemaDefinition returns [EObject current=null] : iv_ruleMaxPropertiesSchemaDefinition= ruleMaxPropertiesSchemaDefinition EOF ;
    public final EObject entryRuleMaxPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxPropertiesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1512:70: (iv_ruleMaxPropertiesSchemaDefinition= ruleMaxPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1513:2: iv_ruleMaxPropertiesSchemaDefinition= ruleMaxPropertiesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMaxPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxPropertiesSchemaDefinition=ruleMaxPropertiesSchemaDefinition();

            state._fsp--;

             current =iv_ruleMaxPropertiesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxPropertiesSchemaDefinition"


    // $ANTLR start "ruleMaxPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1519:1: ruleMaxPropertiesSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"maxProperties\"' otherlv_1= ':' ( (lv_maxProperties_2_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleMaxPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_maxProperties_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1525:2: ( (otherlv_0= '\"maxProperties\"' otherlv_1= ':' ( (lv_maxProperties_2_0= ruleNonNegativeInteger ) ) ) )
            // InternalJsonSchemaDsl.g:1526:2: (otherlv_0= '\"maxProperties\"' otherlv_1= ':' ( (lv_maxProperties_2_0= ruleNonNegativeInteger ) ) )
            {
            // InternalJsonSchemaDsl.g:1526:2: (otherlv_0= '\"maxProperties\"' otherlv_1= ':' ( (lv_maxProperties_2_0= ruleNonNegativeInteger ) ) )
            // InternalJsonSchemaDsl.g:1527:3: otherlv_0= '\"maxProperties\"' otherlv_1= ':' ( (lv_maxProperties_2_0= ruleNonNegativeInteger ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1535:3: ( (lv_maxProperties_2_0= ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:1536:4: (lv_maxProperties_2_0= ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:1536:4: (lv_maxProperties_2_0= ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:1537:5: lv_maxProperties_2_0= ruleNonNegativeInteger
            {

            					newCompositeNode(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesNonNegativeIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_maxProperties_2_0=ruleNonNegativeInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxPropertiesSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"maxProperties",
            						lv_maxProperties_2_0,
            						"at.jku.bise.JsonSchemaDsl.NonNegativeInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxPropertiesSchemaDefinition"


    // $ANTLR start "entryRuleMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:1558:1: entryRuleMinimumSchemaDefinition returns [EObject current=null] : iv_ruleMinimumSchemaDefinition= ruleMinimumSchemaDefinition EOF ;
    public final EObject entryRuleMinimumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1558:64: (iv_ruleMinimumSchemaDefinition= ruleMinimumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1559:2: iv_ruleMinimumSchemaDefinition= ruleMinimumSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMinimumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinimumSchemaDefinition=ruleMinimumSchemaDefinition();

            state._fsp--;

             current =iv_ruleMinimumSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimumSchemaDefinition"


    // $ANTLR start "ruleMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:1565:1: ruleMinimumSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleMinimumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_minimum_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1571:2: ( (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:1572:2: (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:1572:2: (otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:1573:3: otherlv_0= '\"minimum\"' otherlv_1= ':' ( (lv_minimum_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMinimumSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1581:3: ( (lv_minimum_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:1582:4: (lv_minimum_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:1582:4: (lv_minimum_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:1583:5: lv_minimum_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_minimum_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinimumSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"minimum",
            						lv_minimum_2_0,
            						"at.jku.bise.JsonSchemaDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimumSchemaDefinition"


    // $ANTLR start "entryRuleMaxItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1604:1: entryRuleMaxItemsSchemaDefinition returns [EObject current=null] : iv_ruleMaxItemsSchemaDefinition= ruleMaxItemsSchemaDefinition EOF ;
    public final EObject entryRuleMaxItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxItemsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1604:65: (iv_ruleMaxItemsSchemaDefinition= ruleMaxItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1605:2: iv_ruleMaxItemsSchemaDefinition= ruleMaxItemsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMaxItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxItemsSchemaDefinition=ruleMaxItemsSchemaDefinition();

            state._fsp--;

             current =iv_ruleMaxItemsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxItemsSchemaDefinition"


    // $ANTLR start "ruleMaxItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1611:1: ruleMaxItemsSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"maxItems\"' otherlv_1= ':' ( (lv_maxItems_2_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleMaxItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_maxItems_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1617:2: ( (otherlv_0= '\"maxItems\"' otherlv_1= ':' ( (lv_maxItems_2_0= ruleNonNegativeInteger ) ) ) )
            // InternalJsonSchemaDsl.g:1618:2: (otherlv_0= '\"maxItems\"' otherlv_1= ':' ( (lv_maxItems_2_0= ruleNonNegativeInteger ) ) )
            {
            // InternalJsonSchemaDsl.g:1618:2: (otherlv_0= '\"maxItems\"' otherlv_1= ':' ( (lv_maxItems_2_0= ruleNonNegativeInteger ) ) )
            // InternalJsonSchemaDsl.g:1619:3: otherlv_0= '\"maxItems\"' otherlv_1= ':' ( (lv_maxItems_2_0= ruleNonNegativeInteger ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxItemsSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1627:3: ( (lv_maxItems_2_0= ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:1628:4: (lv_maxItems_2_0= ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:1628:4: (lv_maxItems_2_0= ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:1629:5: lv_maxItems_2_0= ruleNonNegativeInteger
            {

            					newCompositeNode(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsNonNegativeIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_maxItems_2_0=ruleNonNegativeInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxItemsSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"maxItems",
            						lv_maxItems_2_0,
            						"at.jku.bise.JsonSchemaDsl.NonNegativeInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxItemsSchemaDefinition"


    // $ANTLR start "entryRuleFormatSchemaDefinition"
    // InternalJsonSchemaDsl.g:1650:1: entryRuleFormatSchemaDefinition returns [EObject current=null] : iv_ruleFormatSchemaDefinition= ruleFormatSchemaDefinition EOF ;
    public final EObject entryRuleFormatSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1650:63: (iv_ruleFormatSchemaDefinition= ruleFormatSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1651:2: iv_ruleFormatSchemaDefinition= ruleFormatSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getFormatSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormatSchemaDefinition=ruleFormatSchemaDefinition();

            state._fsp--;

             current =iv_ruleFormatSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormatSchemaDefinition"


    // $ANTLR start "ruleFormatSchemaDefinition"
    // InternalJsonSchemaDsl.g:1657:1: ruleFormatSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"format\"' otherlv_1= ':' ( (lv_format_2_0= ruleEString ) ) ) ;
    public final EObject ruleFormatSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_format_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1663:2: ( (otherlv_0= '\"format\"' otherlv_1= ':' ( (lv_format_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:1664:2: (otherlv_0= '\"format\"' otherlv_1= ':' ( (lv_format_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:1664:2: (otherlv_0= '\"format\"' otherlv_1= ':' ( (lv_format_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:1665:3: otherlv_0= '\"format\"' otherlv_1= ':' ( (lv_format_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatSchemaDefinitionAccess().getFormatKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1673:3: ( (lv_format_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:1674:4: (lv_format_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:1674:4: (lv_format_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:1675:5: lv_format_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormatSchemaDefinitionAccess().getFormatEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_format_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormatSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"format",
            						lv_format_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormatSchemaDefinition"


    // $ANTLR start "entryRuleReadOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:1696:1: entryRuleReadOnlySchemaDefinition returns [EObject current=null] : iv_ruleReadOnlySchemaDefinition= ruleReadOnlySchemaDefinition EOF ;
    public final EObject entryRuleReadOnlySchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadOnlySchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1696:65: (iv_ruleReadOnlySchemaDefinition= ruleReadOnlySchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1697:2: iv_ruleReadOnlySchemaDefinition= ruleReadOnlySchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getReadOnlySchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadOnlySchemaDefinition=ruleReadOnlySchemaDefinition();

            state._fsp--;

             current =iv_ruleReadOnlySchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadOnlySchemaDefinition"


    // $ANTLR start "ruleReadOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:1703:1: ruleReadOnlySchemaDefinition returns [EObject current=null] : (otherlv_0= '\"readOnly\"' otherlv_1= ':' ( (lv_readOnly_2_0= ruleEBoolean ) ) ) ;
    public final EObject ruleReadOnlySchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_readOnly_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1709:2: ( (otherlv_0= '\"readOnly\"' otherlv_1= ':' ( (lv_readOnly_2_0= ruleEBoolean ) ) ) )
            // InternalJsonSchemaDsl.g:1710:2: (otherlv_0= '\"readOnly\"' otherlv_1= ':' ( (lv_readOnly_2_0= ruleEBoolean ) ) )
            {
            // InternalJsonSchemaDsl.g:1710:2: (otherlv_0= '\"readOnly\"' otherlv_1= ':' ( (lv_readOnly_2_0= ruleEBoolean ) ) )
            // InternalJsonSchemaDsl.g:1711:3: otherlv_0= '\"readOnly\"' otherlv_1= ':' ( (lv_readOnly_2_0= ruleEBoolean ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getReadOnlySchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1719:3: ( (lv_readOnly_2_0= ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:1720:4: (lv_readOnly_2_0= ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:1720:4: (lv_readOnly_2_0= ruleEBoolean )
            // InternalJsonSchemaDsl.g:1721:5: lv_readOnly_2_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyEBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_readOnly_2_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadOnlySchemaDefinitionRule());
            					}
            					set(
            						current,
            						"readOnly",
            						lv_readOnly_2_0,
            						"at.jku.bise.JsonSchemaDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadOnlySchemaDefinition"


    // $ANTLR start "entryRuleTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:1742:1: entryRuleTypeSchemaDefinition returns [EObject current=null] : iv_ruleTypeSchemaDefinition= ruleTypeSchemaDefinition EOF ;
    public final EObject entryRuleTypeSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1742:61: (iv_ruleTypeSchemaDefinition= ruleTypeSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1743:2: iv_ruleTypeSchemaDefinition= ruleTypeSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSchemaDefinition=ruleTypeSchemaDefinition();

            state._fsp--;

             current =iv_ruleTypeSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSchemaDefinition"


    // $ANTLR start "ruleTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:1749:1: ruleTypeSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"type\"' otherlv_2= ':' ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )? ( (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 ) )? ) ;
    public final EObject ruleTypeSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_typeAnyOf1_3_0 = null;

        EObject lv_typesAnyOf2_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1755:2: ( ( () otherlv_1= '\"type\"' otherlv_2= ':' ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )? ( (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 ) )? ) )
            // InternalJsonSchemaDsl.g:1756:2: ( () otherlv_1= '\"type\"' otherlv_2= ':' ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )? ( (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 ) )? )
            {
            // InternalJsonSchemaDsl.g:1756:2: ( () otherlv_1= '\"type\"' otherlv_2= ':' ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )? ( (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 ) )? )
            // InternalJsonSchemaDsl.g:1757:3: () otherlv_1= '\"type\"' otherlv_2= ':' ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )? ( (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 ) )?
            {
            // InternalJsonSchemaDsl.g:1757:3: ()
            // InternalJsonSchemaDsl.g:1758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeSchemaDefinitionAccess().getTypeSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeSchemaDefinitionAccess().getTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeSchemaDefinitionAccess().getColonKeyword_2());
            		
            // InternalJsonSchemaDsl.g:1772:3: ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=68 && LA12_0<=74)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1773:4: (lv_typeAnyOf1_3_0= ruleSimpleTypes )
                    {
                    // InternalJsonSchemaDsl.g:1773:4: (lv_typeAnyOf1_3_0= ruleSimpleTypes )
                    // InternalJsonSchemaDsl.g:1774:5: lv_typeAnyOf1_3_0= ruleSimpleTypes
                    {

                    					newCompositeNode(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1SimpleTypesEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_typeAnyOf1_3_0=ruleSimpleTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeSchemaDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"typeAnyOf1",
                    						lv_typeAnyOf1_3_0,
                    						"at.jku.bise.JsonSchemaDsl.SimpleTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJsonSchemaDsl.g:1791:3: ( (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1792:4: (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 )
                    {
                    // InternalJsonSchemaDsl.g:1792:4: (lv_typesAnyOf2_4_0= ruleTypesAnyOf2 )
                    // InternalJsonSchemaDsl.g:1793:5: lv_typesAnyOf2_4_0= ruleTypesAnyOf2
                    {

                    					newCompositeNode(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2TypesAnyOf2ParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typesAnyOf2_4_0=ruleTypesAnyOf2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeSchemaDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"typesAnyOf2",
                    						lv_typesAnyOf2_4_0,
                    						"at.jku.bise.JsonSchemaDsl.TypesAnyOf2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSchemaDefinition"


    // $ANTLR start "entryRuleAdditionalPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1814:1: entryRuleAdditionalPropertiesSchemaDefinition returns [EObject current=null] : iv_ruleAdditionalPropertiesSchemaDefinition= ruleAdditionalPropertiesSchemaDefinition EOF ;
    public final EObject entryRuleAdditionalPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalPropertiesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1814:77: (iv_ruleAdditionalPropertiesSchemaDefinition= ruleAdditionalPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1815:2: iv_ruleAdditionalPropertiesSchemaDefinition= ruleAdditionalPropertiesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getAdditionalPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalPropertiesSchemaDefinition=ruleAdditionalPropertiesSchemaDefinition();

            state._fsp--;

             current =iv_ruleAdditionalPropertiesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalPropertiesSchemaDefinition"


    // $ANTLR start "ruleAdditionalPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1821:1: ruleAdditionalPropertiesSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"additionalProperties\"' otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleSchema ) ) ) ;
    public final EObject ruleAdditionalPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1827:2: ( (otherlv_0= '\"additionalProperties\"' otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:1828:2: (otherlv_0= '\"additionalProperties\"' otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:1828:2: (otherlv_0= '\"additionalProperties\"' otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:1829:3: otherlv_0= '\"additionalProperties\"' otherlv_1= ':' ( (lv_additionalProperties_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1837:3: ( (lv_additionalProperties_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:1838:4: (lv_additionalProperties_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:1838:4: (lv_additionalProperties_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:1839:5: lv_additionalProperties_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalPropertiesSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"additionalProperties",
            						lv_additionalProperties_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalPropertiesSchemaDefinition"


    // $ANTLR start "entryRuleElseSchemaDefinition"
    // InternalJsonSchemaDsl.g:1860:1: entryRuleElseSchemaDefinition returns [EObject current=null] : iv_ruleElseSchemaDefinition= ruleElseSchemaDefinition EOF ;
    public final EObject entryRuleElseSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1860:61: (iv_ruleElseSchemaDefinition= ruleElseSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1861:2: iv_ruleElseSchemaDefinition= ruleElseSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getElseSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseSchemaDefinition=ruleElseSchemaDefinition();

            state._fsp--;

             current =iv_ruleElseSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseSchemaDefinition"


    // $ANTLR start "ruleElseSchemaDefinition"
    // InternalJsonSchemaDsl.g:1867:1: ruleElseSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"else\"' otherlv_1= ':' ( (lv_else_2_0= ruleSchema ) ) ) ;
    public final EObject ruleElseSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1873:2: ( (otherlv_0= '\"else\"' otherlv_1= ':' ( (lv_else_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:1874:2: (otherlv_0= '\"else\"' otherlv_1= ':' ( (lv_else_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:1874:2: (otherlv_0= '\"else\"' otherlv_1= ':' ( (lv_else_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:1875:3: otherlv_0= '\"else\"' otherlv_1= ':' ( (lv_else_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getElseSchemaDefinitionAccess().getElseKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getElseSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1883:3: ( (lv_else_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:1884:4: (lv_else_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:1884:4: (lv_else_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:1885:5: lv_else_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getElseSchemaDefinitionAccess().getElseSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_else_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"else",
            						lv_else_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseSchemaDefinition"


    // $ANTLR start "entryRuleIdSchemaDefinition"
    // InternalJsonSchemaDsl.g:1906:1: entryRuleIdSchemaDefinition returns [EObject current=null] : iv_ruleIdSchemaDefinition= ruleIdSchemaDefinition EOF ;
    public final EObject entryRuleIdSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1906:59: (iv_ruleIdSchemaDefinition= ruleIdSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1907:2: iv_ruleIdSchemaDefinition= ruleIdSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getIdSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdSchemaDefinition=ruleIdSchemaDefinition();

            state._fsp--;

             current =iv_ruleIdSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdSchemaDefinition"


    // $ANTLR start "ruleIdSchemaDefinition"
    // InternalJsonSchemaDsl.g:1913:1: ruleIdSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"$id\"' otherlv_1= ':' ( (lv_id_2_0= ruleEString ) ) ) ;
    public final EObject ruleIdSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1919:2: ( (otherlv_0= '\"$id\"' otherlv_1= ':' ( (lv_id_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:1920:2: (otherlv_0= '\"$id\"' otherlv_1= ':' ( (lv_id_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:1920:2: (otherlv_0= '\"$id\"' otherlv_1= ':' ( (lv_id_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:1921:3: otherlv_0= '\"$id\"' otherlv_1= ':' ( (lv_id_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIdSchemaDefinitionAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIdSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1929:3: ( (lv_id_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:1930:4: (lv_id_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:1930:4: (lv_id_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:1931:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIdSchemaDefinitionAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdSchemaDefinition"


    // $ANTLR start "entryRuleConstSchemaDefinition"
    // InternalJsonSchemaDsl.g:1952:1: entryRuleConstSchemaDefinition returns [EObject current=null] : iv_ruleConstSchemaDefinition= ruleConstSchemaDefinition EOF ;
    public final EObject entryRuleConstSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1952:62: (iv_ruleConstSchemaDefinition= ruleConstSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1953:2: iv_ruleConstSchemaDefinition= ruleConstSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstSchemaDefinition=ruleConstSchemaDefinition();

            state._fsp--;

             current =iv_ruleConstSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstSchemaDefinition"


    // $ANTLR start "ruleConstSchemaDefinition"
    // InternalJsonSchemaDsl.g:1959:1: ruleConstSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"const\"' otherlv_1= ':' ( (lv_const_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleConstSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:1965:2: ( (otherlv_0= '\"const\"' otherlv_1= ':' ( (lv_const_2_0= ruleJsonDocument ) ) ) )
            // InternalJsonSchemaDsl.g:1966:2: (otherlv_0= '\"const\"' otherlv_1= ':' ( (lv_const_2_0= ruleJsonDocument ) ) )
            {
            // InternalJsonSchemaDsl.g:1966:2: (otherlv_0= '\"const\"' otherlv_1= ':' ( (lv_const_2_0= ruleJsonDocument ) ) )
            // InternalJsonSchemaDsl.g:1967:3: otherlv_0= '\"const\"' otherlv_1= ':' ( (lv_const_2_0= ruleJsonDocument ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstSchemaDefinitionAccess().getConstKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConstSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:1975:3: ( (lv_const_2_0= ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:1976:4: (lv_const_2_0= ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:1976:4: (lv_const_2_0= ruleJsonDocument )
            // InternalJsonSchemaDsl.g:1977:5: lv_const_2_0= ruleJsonDocument
            {

            					newCompositeNode(grammarAccess.getConstSchemaDefinitionAccess().getConstJsonDocumentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleJsonDocument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"const",
            						lv_const_2_0,
            						"at.jku.bise.JsonSchemaDsl.JsonDocument");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstSchemaDefinition"


    // $ANTLR start "entryRuleRequiredSchemaDefinition"
    // InternalJsonSchemaDsl.g:1998:1: entryRuleRequiredSchemaDefinition returns [EObject current=null] : iv_ruleRequiredSchemaDefinition= ruleRequiredSchemaDefinition EOF ;
    public final EObject entryRuleRequiredSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:1998:65: (iv_ruleRequiredSchemaDefinition= ruleRequiredSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1999:2: iv_ruleRequiredSchemaDefinition= ruleRequiredSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getRequiredSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredSchemaDefinition=ruleRequiredSchemaDefinition();

            state._fsp--;

             current =iv_ruleRequiredSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredSchemaDefinition"


    // $ANTLR start "ruleRequiredSchemaDefinition"
    // InternalJsonSchemaDsl.g:2005:1: ruleRequiredSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"required\"' otherlv_1= ':' ( (lv_required_2_0= ruleStringArray ) ) ) ;
    public final EObject ruleRequiredSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_required_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2011:2: ( (otherlv_0= '\"required\"' otherlv_1= ':' ( (lv_required_2_0= ruleStringArray ) ) ) )
            // InternalJsonSchemaDsl.g:2012:2: (otherlv_0= '\"required\"' otherlv_1= ':' ( (lv_required_2_0= ruleStringArray ) ) )
            {
            // InternalJsonSchemaDsl.g:2012:2: (otherlv_0= '\"required\"' otherlv_1= ':' ( (lv_required_2_0= ruleStringArray ) ) )
            // InternalJsonSchemaDsl.g:2013:3: otherlv_0= '\"required\"' otherlv_1= ':' ( (lv_required_2_0= ruleStringArray ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2021:3: ( (lv_required_2_0= ruleStringArray ) )
            // InternalJsonSchemaDsl.g:2022:4: (lv_required_2_0= ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:2022:4: (lv_required_2_0= ruleStringArray )
            // InternalJsonSchemaDsl.g:2023:5: lv_required_2_0= ruleStringArray
            {

            					newCompositeNode(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredStringArrayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_required_2_0=ruleStringArray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"required",
            						lv_required_2_0,
            						"at.jku.bise.JsonSchemaDsl.StringArray");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredSchemaDefinition"


    // $ANTLR start "entryRuleDescriptionSchemaDefinition"
    // InternalJsonSchemaDsl.g:2044:1: entryRuleDescriptionSchemaDefinition returns [EObject current=null] : iv_ruleDescriptionSchemaDefinition= ruleDescriptionSchemaDefinition EOF ;
    public final EObject entryRuleDescriptionSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2044:68: (iv_ruleDescriptionSchemaDefinition= ruleDescriptionSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2045:2: iv_ruleDescriptionSchemaDefinition= ruleDescriptionSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getDescriptionSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionSchemaDefinition=ruleDescriptionSchemaDefinition();

            state._fsp--;

             current =iv_ruleDescriptionSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionSchemaDefinition"


    // $ANTLR start "ruleDescriptionSchemaDefinition"
    // InternalJsonSchemaDsl.g:2051:1: ruleDescriptionSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"description\"' otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleDescriptionSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2057:2: ( (otherlv_0= '\"description\"' otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2058:2: (otherlv_0= '\"description\"' otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2058:2: (otherlv_0= '\"description\"' otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2059:3: otherlv_0= '\"description\"' otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2067:3: ( (lv_description_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2068:4: (lv_description_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2068:4: (lv_description_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2069:5: lv_description_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptionSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionSchemaDefinition"


    // $ANTLR start "entryRuleMinPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:2090:1: entryRuleMinPropertiesSchemaDefinition returns [EObject current=null] : iv_ruleMinPropertiesSchemaDefinition= ruleMinPropertiesSchemaDefinition EOF ;
    public final EObject entryRuleMinPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinPropertiesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2090:70: (iv_ruleMinPropertiesSchemaDefinition= ruleMinPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2091:2: iv_ruleMinPropertiesSchemaDefinition= ruleMinPropertiesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMinPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinPropertiesSchemaDefinition=ruleMinPropertiesSchemaDefinition();

            state._fsp--;

             current =iv_ruleMinPropertiesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinPropertiesSchemaDefinition"


    // $ANTLR start "ruleMinPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:2097:1: ruleMinPropertiesSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"minProperties\"' otherlv_1= ':' ( (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 ) ) ) ;
    public final EObject ruleMinPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_minProperties_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2103:2: ( (otherlv_0= '\"minProperties\"' otherlv_1= ':' ( (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 ) ) ) )
            // InternalJsonSchemaDsl.g:2104:2: (otherlv_0= '\"minProperties\"' otherlv_1= ':' ( (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 ) ) )
            {
            // InternalJsonSchemaDsl.g:2104:2: (otherlv_0= '\"minProperties\"' otherlv_1= ':' ( (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 ) ) )
            // InternalJsonSchemaDsl.g:2105:3: otherlv_0= '\"minProperties\"' otherlv_1= ':' ( (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMinPropertiesSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2113:3: ( (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:2114:4: (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:2114:4: (lv_minProperties_2_0= ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:2115:5: lv_minProperties_2_0= ruleNonNegativeIntegerDefault0
            {

            					newCompositeNode(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesNonNegativeIntegerDefault0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_minProperties_2_0=ruleNonNegativeIntegerDefault0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinPropertiesSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"minProperties",
            						lv_minProperties_2_0,
            						"at.jku.bise.JsonSchemaDsl.NonNegativeIntegerDefault0");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinPropertiesSchemaDefinition"


    // $ANTLR start "entryRulePatternPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:2136:1: entryRulePatternPropertiesSchemaDefinition returns [EObject current=null] : iv_rulePatternPropertiesSchemaDefinition= rulePatternPropertiesSchemaDefinition EOF ;
    public final EObject entryRulePatternPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternPropertiesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2136:74: (iv_rulePatternPropertiesSchemaDefinition= rulePatternPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2137:2: iv_rulePatternPropertiesSchemaDefinition= rulePatternPropertiesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getPatternPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternPropertiesSchemaDefinition=rulePatternPropertiesSchemaDefinition();

            state._fsp--;

             current =iv_rulePatternPropertiesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternPropertiesSchemaDefinition"


    // $ANTLR start "rulePatternPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:2143:1: rulePatternPropertiesSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"patternProperties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) ;
    public final EObject rulePatternPropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_keySchemaPairs_4_0 = null;

        EObject lv_keySchemaPairs_6_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2149:2: ( ( () otherlv_1= '\"patternProperties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) )
            // InternalJsonSchemaDsl.g:2150:2: ( () otherlv_1= '\"patternProperties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            {
            // InternalJsonSchemaDsl.g:2150:2: ( () otherlv_1= '\"patternProperties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            // InternalJsonSchemaDsl.g:2151:3: () otherlv_1= '\"patternProperties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}'
            {
            // InternalJsonSchemaDsl.g:2151:3: ()
            // InternalJsonSchemaDsl.g:2152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:2170:3: ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||LA15_0==15||(LA15_0>=17 && LA15_0<=18)||(LA15_0>=21 && LA15_0<=61)||(LA15_0>=66 && LA15_0<=67)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2171:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:2171:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) )
                    // InternalJsonSchemaDsl.g:2172:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    {
                    // InternalJsonSchemaDsl.g:2172:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    // InternalJsonSchemaDsl.g:2173:6: lv_keySchemaPairs_4_0= ruleKeySchemaPair
                    {

                    						newCompositeNode(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keySchemaPairs_4_0=ruleKeySchemaPair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternPropertiesSchemaDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"keySchemaPairs",
                    							lv_keySchemaPairs_4_0,
                    							"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:2190:4: (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:2191:5: otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:2195:5: ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    // InternalJsonSchemaDsl.g:2196:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    {
                    	    // InternalJsonSchemaDsl.g:2196:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    // InternalJsonSchemaDsl.g:2197:7: lv_keySchemaPairs_6_0= ruleKeySchemaPair
                    	    {

                    	    							newCompositeNode(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keySchemaPairs_6_0=ruleKeySchemaPair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPatternPropertiesSchemaDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keySchemaPairs",
                    	    								lv_keySchemaPairs_6_0,
                    	    								"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternPropertiesSchemaDefinition"


    // $ANTLR start "entryRuleAdditionalItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:2224:1: entryRuleAdditionalItemsSchemaDefinition returns [EObject current=null] : iv_ruleAdditionalItemsSchemaDefinition= ruleAdditionalItemsSchemaDefinition EOF ;
    public final EObject entryRuleAdditionalItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalItemsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2224:72: (iv_ruleAdditionalItemsSchemaDefinition= ruleAdditionalItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2225:2: iv_ruleAdditionalItemsSchemaDefinition= ruleAdditionalItemsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getAdditionalItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalItemsSchemaDefinition=ruleAdditionalItemsSchemaDefinition();

            state._fsp--;

             current =iv_ruleAdditionalItemsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalItemsSchemaDefinition"


    // $ANTLR start "ruleAdditionalItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:2231:1: ruleAdditionalItemsSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"additionalItems\"' otherlv_1= ':' ( (lv_additionalItems_2_0= ruleSchema ) ) ) ;
    public final EObject ruleAdditionalItemsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_additionalItems_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2237:2: ( (otherlv_0= '\"additionalItems\"' otherlv_1= ':' ( (lv_additionalItems_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2238:2: (otherlv_0= '\"additionalItems\"' otherlv_1= ':' ( (lv_additionalItems_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2238:2: (otherlv_0= '\"additionalItems\"' otherlv_1= ':' ( (lv_additionalItems_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2239:3: otherlv_0= '\"additionalItems\"' otherlv_1= ':' ( (lv_additionalItems_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2247:3: ( (lv_additionalItems_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2248:4: (lv_additionalItems_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2248:4: (lv_additionalItems_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2249:5: lv_additionalItems_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_additionalItems_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalItemsSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"additionalItems",
            						lv_additionalItems_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalItemsSchemaDefinition"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalJsonSchemaDsl.g:2270:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalJsonSchemaDsl.g:2270:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalJsonSchemaDsl.g:2271:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;

             current =iv_ruleKeyValuePair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalJsonSchemaDsl.g:2277:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2283:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalJsonSchemaDsl.g:2284:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalJsonSchemaDsl.g:2284:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalJsonSchemaDsl.g:2285:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalJsonSchemaDsl.g:2285:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalJsonSchemaDsl.g:2286:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalJsonSchemaDsl.g:2286:4: (lv_key_0_0= RULE_STRING )
            // InternalJsonSchemaDsl.g:2287:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValuePairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.JsonSchemaDsl.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2307:3: ( (lv_value_2_0= ruleValue ) )
            // InternalJsonSchemaDsl.g:2308:4: (lv_value_2_0= ruleValue )
            {
            // InternalJsonSchemaDsl.g:2308:4: (lv_value_2_0= ruleValue )
            // InternalJsonSchemaDsl.g:2309:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"at.jku.bise.JsonSchemaDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleExamplesSchemaDefinition"
    // InternalJsonSchemaDsl.g:2330:1: entryRuleExamplesSchemaDefinition returns [EObject current=null] : iv_ruleExamplesSchemaDefinition= ruleExamplesSchemaDefinition EOF ;
    public final EObject entryRuleExamplesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamplesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2330:65: (iv_ruleExamplesSchemaDefinition= ruleExamplesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2331:2: iv_ruleExamplesSchemaDefinition= ruleExamplesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getExamplesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamplesSchemaDefinition=ruleExamplesSchemaDefinition();

            state._fsp--;

             current =iv_ruleExamplesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamplesSchemaDefinition"


    // $ANTLR start "ruleExamplesSchemaDefinition"
    // InternalJsonSchemaDsl.g:2337:1: ruleExamplesSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleExamplesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_examples_4_0 = null;

        EObject lv_examples_6_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2343:2: ( ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' ) )
            // InternalJsonSchemaDsl.g:2344:2: ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' )
            {
            // InternalJsonSchemaDsl.g:2344:2: ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' )
            // InternalJsonSchemaDsl.g:2345:3: () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']'
            {
            // InternalJsonSchemaDsl.g:2345:3: ()
            // InternalJsonSchemaDsl.g:2346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getExamplesSchemaDefinitionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:2364:3: ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||LA17_0==12||LA17_0==15||(LA17_0>=17 && LA17_0<=19)||(LA17_0>=21 && LA17_0<=67)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2365:4: ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:2365:4: ( (lv_examples_4_0= ruleJsonDocument ) )
                    // InternalJsonSchemaDsl.g:2366:5: (lv_examples_4_0= ruleJsonDocument )
                    {
                    // InternalJsonSchemaDsl.g:2366:5: (lv_examples_4_0= ruleJsonDocument )
                    // InternalJsonSchemaDsl.g:2367:6: lv_examples_4_0= ruleJsonDocument
                    {

                    						newCompositeNode(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_examples_4_0=ruleJsonDocument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExamplesSchemaDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"examples",
                    							lv_examples_4_0,
                    							"at.jku.bise.JsonSchemaDsl.JsonDocument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:2384:4: (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:2385:5: otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExamplesSchemaDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:2389:5: ( (lv_examples_6_0= ruleJsonDocument ) )
                    	    // InternalJsonSchemaDsl.g:2390:6: (lv_examples_6_0= ruleJsonDocument )
                    	    {
                    	    // InternalJsonSchemaDsl.g:2390:6: (lv_examples_6_0= ruleJsonDocument )
                    	    // InternalJsonSchemaDsl.g:2391:7: lv_examples_6_0= ruleJsonDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_examples_6_0=ruleJsonDocument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExamplesSchemaDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"examples",
                    	    								lv_examples_6_0,
                    	    								"at.jku.bise.JsonSchemaDsl.JsonDocument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExamplesSchemaDefinitionAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamplesSchemaDefinition"


    // $ANTLR start "entryRuleIfSchemaDefinition"
    // InternalJsonSchemaDsl.g:2418:1: entryRuleIfSchemaDefinition returns [EObject current=null] : iv_ruleIfSchemaDefinition= ruleIfSchemaDefinition EOF ;
    public final EObject entryRuleIfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2418:59: (iv_ruleIfSchemaDefinition= ruleIfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2419:2: iv_ruleIfSchemaDefinition= ruleIfSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getIfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfSchemaDefinition=ruleIfSchemaDefinition();

            state._fsp--;

             current =iv_ruleIfSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfSchemaDefinition"


    // $ANTLR start "ruleIfSchemaDefinition"
    // InternalJsonSchemaDsl.g:2425:1: ruleIfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) ) ;
    public final EObject ruleIfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_if_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2431:2: ( (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2432:2: (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2432:2: (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2433:3: otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfSchemaDefinitionAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2441:3: ( (lv_if_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2442:4: (lv_if_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2442:4: (lv_if_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2443:5: lv_if_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getIfSchemaDefinitionAccess().getIfSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_if_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"if",
            						lv_if_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfSchemaDefinition"


    // $ANTLR start "entryRuleAllOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:2464:1: entryRuleAllOfSchemaDefinition returns [EObject current=null] : iv_ruleAllOfSchemaDefinition= ruleAllOfSchemaDefinition EOF ;
    public final EObject entryRuleAllOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllOfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2464:62: (iv_ruleAllOfSchemaDefinition= ruleAllOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2465:2: iv_ruleAllOfSchemaDefinition= ruleAllOfSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getAllOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllOfSchemaDefinition=ruleAllOfSchemaDefinition();

            state._fsp--;

             current =iv_ruleAllOfSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllOfSchemaDefinition"


    // $ANTLR start "ruleAllOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:2471:1: ruleAllOfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) ) ;
    public final EObject ruleAllOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_allOf_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2477:2: ( (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) ) )
            // InternalJsonSchemaDsl.g:2478:2: (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) )
            {
            // InternalJsonSchemaDsl.g:2478:2: (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) )
            // InternalJsonSchemaDsl.g:2479:3: otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAllOfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2487:3: ( (lv_allOf_2_0= ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:2488:4: (lv_allOf_2_0= ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:2488:4: (lv_allOf_2_0= ruleSchemaArray )
            // InternalJsonSchemaDsl.g:2489:5: lv_allOf_2_0= ruleSchemaArray
            {

            					newCompositeNode(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfSchemaArrayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_allOf_2_0=ruleSchemaArray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllOfSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"allOf",
            						lv_allOf_2_0,
            						"at.jku.bise.JsonSchemaDsl.SchemaArray");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllOfSchemaDefinition"


    // $ANTLR start "entryRuleContentEncodingSchemaDefinition"
    // InternalJsonSchemaDsl.g:2510:1: entryRuleContentEncodingSchemaDefinition returns [EObject current=null] : iv_ruleContentEncodingSchemaDefinition= ruleContentEncodingSchemaDefinition EOF ;
    public final EObject entryRuleContentEncodingSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentEncodingSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2510:72: (iv_ruleContentEncodingSchemaDefinition= ruleContentEncodingSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2511:2: iv_ruleContentEncodingSchemaDefinition= ruleContentEncodingSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getContentEncodingSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentEncodingSchemaDefinition=ruleContentEncodingSchemaDefinition();

            state._fsp--;

             current =iv_ruleContentEncodingSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentEncodingSchemaDefinition"


    // $ANTLR start "ruleContentEncodingSchemaDefinition"
    // InternalJsonSchemaDsl.g:2517:1: ruleContentEncodingSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) ) ;
    public final EObject ruleContentEncodingSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contentEncoding_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2523:2: ( (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2524:2: (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2524:2: (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2525:3: otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getContentEncodingSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2533:3: ( (lv_contentEncoding_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2534:4: (lv_contentEncoding_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2534:4: (lv_contentEncoding_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2535:5: lv_contentEncoding_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_contentEncoding_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentEncodingSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"contentEncoding",
            						lv_contentEncoding_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentEncodingSchemaDefinition"


    // $ANTLR start "entryRuleMultipleOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:2556:1: entryRuleMultipleOfSchemaDefinition returns [EObject current=null] : iv_ruleMultipleOfSchemaDefinition= ruleMultipleOfSchemaDefinition EOF ;
    public final EObject entryRuleMultipleOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleOfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2556:67: (iv_ruleMultipleOfSchemaDefinition= ruleMultipleOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2557:2: iv_ruleMultipleOfSchemaDefinition= ruleMultipleOfSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMultipleOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleOfSchemaDefinition=ruleMultipleOfSchemaDefinition();

            state._fsp--;

             current =iv_ruleMultipleOfSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleOfSchemaDefinition"


    // $ANTLR start "ruleMultipleOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:2563:1: ruleMultipleOfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleMultipleOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_multipleOf_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2569:2: ( (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:2570:2: (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:2570:2: (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:2571:3: otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleOfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2579:3: ( (lv_multipleOf_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:2580:4: (lv_multipleOf_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:2580:4: (lv_multipleOf_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:2581:5: lv_multipleOf_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_multipleOf_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultipleOfSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"multipleOf",
            						lv_multipleOf_2_0,
            						"at.jku.bise.JsonSchemaDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleOfSchemaDefinition"


    // $ANTLR start "entryRulePatternSchemaDefinition"
    // InternalJsonSchemaDsl.g:2602:1: entryRulePatternSchemaDefinition returns [EObject current=null] : iv_rulePatternSchemaDefinition= rulePatternSchemaDefinition EOF ;
    public final EObject entryRulePatternSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2602:64: (iv_rulePatternSchemaDefinition= rulePatternSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2603:2: iv_rulePatternSchemaDefinition= rulePatternSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getPatternSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternSchemaDefinition=rulePatternSchemaDefinition();

            state._fsp--;

             current =iv_rulePatternSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternSchemaDefinition"


    // $ANTLR start "rulePatternSchemaDefinition"
    // InternalJsonSchemaDsl.g:2609:1: rulePatternSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) ) ;
    public final EObject rulePatternSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2615:2: ( (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2616:2: (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2616:2: (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2617:3: otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternSchemaDefinitionAccess().getPatternKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2625:3: ( (lv_pattern_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2626:4: (lv_pattern_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2626:4: (lv_pattern_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2627:5: lv_pattern_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternSchemaDefinitionAccess().getPatternEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pattern_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternSchemaDefinition"


    // $ANTLR start "entryRuleContainsSchemaDefinition"
    // InternalJsonSchemaDsl.g:2648:1: entryRuleContainsSchemaDefinition returns [EObject current=null] : iv_ruleContainsSchemaDefinition= ruleContainsSchemaDefinition EOF ;
    public final EObject entryRuleContainsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2648:65: (iv_ruleContainsSchemaDefinition= ruleContainsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2649:2: iv_ruleContainsSchemaDefinition= ruleContainsSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getContainsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainsSchemaDefinition=ruleContainsSchemaDefinition();

            state._fsp--;

             current =iv_ruleContainsSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainsSchemaDefinition"


    // $ANTLR start "ruleContainsSchemaDefinition"
    // InternalJsonSchemaDsl.g:2655:1: ruleContainsSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) ) ;
    public final EObject ruleContainsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_contains_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2661:2: ( (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2662:2: (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2662:2: (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2663:3: otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsSchemaDefinitionAccess().getContainsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2671:3: ( (lv_contains_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2672:4: (lv_contains_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2672:4: (lv_contains_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2673:5: lv_contains_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getContainsSchemaDefinitionAccess().getContainsSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_contains_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"contains",
            						lv_contains_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainsSchemaDefinition"


    // $ANTLR start "entryRuleNotSchemaDefinition"
    // InternalJsonSchemaDsl.g:2694:1: entryRuleNotSchemaDefinition returns [EObject current=null] : iv_ruleNotSchemaDefinition= ruleNotSchemaDefinition EOF ;
    public final EObject entryRuleNotSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2694:60: (iv_ruleNotSchemaDefinition= ruleNotSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2695:2: iv_ruleNotSchemaDefinition= ruleNotSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getNotSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotSchemaDefinition=ruleNotSchemaDefinition();

            state._fsp--;

             current =iv_ruleNotSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotSchemaDefinition"


    // $ANTLR start "ruleNotSchemaDefinition"
    // InternalJsonSchemaDsl.g:2701:1: ruleNotSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) ) ;
    public final EObject ruleNotSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_not_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2707:2: ( (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2708:2: (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2708:2: (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2709:3: otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNotSchemaDefinitionAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNotSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2717:3: ( (lv_not_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2718:4: (lv_not_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2718:4: (lv_not_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2719:5: lv_not_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getNotSchemaDefinitionAccess().getNotSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_not_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"not",
            						lv_not_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotSchemaDefinition"


    // $ANTLR start "entryRuleExclusiveMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:2740:1: entryRuleExclusiveMaximumSchemaDefinition returns [EObject current=null] : iv_ruleExclusiveMaximumSchemaDefinition= ruleExclusiveMaximumSchemaDefinition EOF ;
    public final EObject entryRuleExclusiveMaximumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveMaximumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2740:73: (iv_ruleExclusiveMaximumSchemaDefinition= ruleExclusiveMaximumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2741:2: iv_ruleExclusiveMaximumSchemaDefinition= ruleExclusiveMaximumSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getExclusiveMaximumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveMaximumSchemaDefinition=ruleExclusiveMaximumSchemaDefinition();

            state._fsp--;

             current =iv_ruleExclusiveMaximumSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveMaximumSchemaDefinition"


    // $ANTLR start "ruleExclusiveMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:2747:1: ruleExclusiveMaximumSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleExclusiveMaximumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_exclusiveMaximum_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2753:2: ( (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:2754:2: (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:2754:2: (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:2755:3: otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2763:3: ( (lv_exclusiveMaximum_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:2764:4: (lv_exclusiveMaximum_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:2764:4: (lv_exclusiveMaximum_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:2765:5: lv_exclusiveMaximum_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exclusiveMaximum_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExclusiveMaximumSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"exclusiveMaximum",
            						lv_exclusiveMaximum_2_0,
            						"at.jku.bise.JsonSchemaDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusiveMaximumSchemaDefinition"


    // $ANTLR start "entryRuleMaxLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:2786:1: entryRuleMaxLengthSchemaDefinition returns [EObject current=null] : iv_ruleMaxLengthSchemaDefinition= ruleMaxLengthSchemaDefinition EOF ;
    public final EObject entryRuleMaxLengthSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLengthSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2786:66: (iv_ruleMaxLengthSchemaDefinition= ruleMaxLengthSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2787:2: iv_ruleMaxLengthSchemaDefinition= ruleMaxLengthSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getMaxLengthSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxLengthSchemaDefinition=ruleMaxLengthSchemaDefinition();

            state._fsp--;

             current =iv_ruleMaxLengthSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxLengthSchemaDefinition"


    // $ANTLR start "ruleMaxLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:2793:1: ruleMaxLengthSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleMaxLengthSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_maxLength_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2799:2: ( (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) ) )
            // InternalJsonSchemaDsl.g:2800:2: (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) )
            {
            // InternalJsonSchemaDsl.g:2800:2: (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) )
            // InternalJsonSchemaDsl.g:2801:3: otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxLengthSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2809:3: ( (lv_maxLength_2_0= ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:2810:4: (lv_maxLength_2_0= ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:2810:4: (lv_maxLength_2_0= ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:2811:5: lv_maxLength_2_0= ruleNonNegativeInteger
            {

            					newCompositeNode(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthNonNegativeIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_maxLength_2_0=ruleNonNegativeInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxLengthSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"maxLength",
            						lv_maxLength_2_0,
            						"at.jku.bise.JsonSchemaDsl.NonNegativeInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxLengthSchemaDefinition"


    // $ANTLR start "entryRuleRefSchemaDefinition"
    // InternalJsonSchemaDsl.g:2832:1: entryRuleRefSchemaDefinition returns [EObject current=null] : iv_ruleRefSchemaDefinition= ruleRefSchemaDefinition EOF ;
    public final EObject entryRuleRefSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2832:60: (iv_ruleRefSchemaDefinition= ruleRefSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2833:2: iv_ruleRefSchemaDefinition= ruleRefSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getRefSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefSchemaDefinition=ruleRefSchemaDefinition();

            state._fsp--;

             current =iv_ruleRefSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefSchemaDefinition"


    // $ANTLR start "ruleRefSchemaDefinition"
    // InternalJsonSchemaDsl.g:2839:1: ruleRefSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) ) ;
    public final EObject ruleRefSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2845:2: ( (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2846:2: (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2846:2: (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2847:3: otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRefSchemaDefinitionAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRefSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2855:3: ( (lv_ref_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2856:4: (lv_ref_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2856:4: (lv_ref_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2857:5: lv_ref_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRefSchemaDefinitionAccess().getRefEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefSchemaDefinition"


    // $ANTLR start "entryRuleContentMediaTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:2878:1: entryRuleContentMediaTypeSchemaDefinition returns [EObject current=null] : iv_ruleContentMediaTypeSchemaDefinition= ruleContentMediaTypeSchemaDefinition EOF ;
    public final EObject entryRuleContentMediaTypeSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentMediaTypeSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2878:73: (iv_ruleContentMediaTypeSchemaDefinition= ruleContentMediaTypeSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2879:2: iv_ruleContentMediaTypeSchemaDefinition= ruleContentMediaTypeSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getContentMediaTypeSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentMediaTypeSchemaDefinition=ruleContentMediaTypeSchemaDefinition();

            state._fsp--;

             current =iv_ruleContentMediaTypeSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentMediaTypeSchemaDefinition"


    // $ANTLR start "ruleContentMediaTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:2885:1: ruleContentMediaTypeSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) ) ;
    public final EObject ruleContentMediaTypeSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contentMediaType_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2891:2: ( (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2892:2: (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2892:2: (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2893:3: otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2901:3: ( (lv_contentMediaType_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2902:4: (lv_contentMediaType_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2902:4: (lv_contentMediaType_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2903:5: lv_contentMediaType_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_contentMediaType_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentMediaTypeSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"contentMediaType",
            						lv_contentMediaType_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentMediaTypeSchemaDefinition"


    // $ANTLR start "entryRuleExclusiveMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:2924:1: entryRuleExclusiveMinimumSchemaDefinition returns [EObject current=null] : iv_ruleExclusiveMinimumSchemaDefinition= ruleExclusiveMinimumSchemaDefinition EOF ;
    public final EObject entryRuleExclusiveMinimumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveMinimumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2924:73: (iv_ruleExclusiveMinimumSchemaDefinition= ruleExclusiveMinimumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2925:2: iv_ruleExclusiveMinimumSchemaDefinition= ruleExclusiveMinimumSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getExclusiveMinimumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveMinimumSchemaDefinition=ruleExclusiveMinimumSchemaDefinition();

            state._fsp--;

             current =iv_ruleExclusiveMinimumSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveMinimumSchemaDefinition"


    // $ANTLR start "ruleExclusiveMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:2931:1: ruleExclusiveMinimumSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleExclusiveMinimumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_exclusiveMinimum_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2937:2: ( (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:2938:2: (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:2938:2: (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:2939:3: otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2947:3: ( (lv_exclusiveMinimum_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:2948:4: (lv_exclusiveMinimum_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:2948:4: (lv_exclusiveMinimum_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:2949:5: lv_exclusiveMinimum_2_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumEDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exclusiveMinimum_2_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExclusiveMinimumSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"exclusiveMinimum",
            						lv_exclusiveMinimum_2_0,
            						"at.jku.bise.JsonSchemaDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusiveMinimumSchemaDefinition"


    // $ANTLR start "entryRuleSchemaSchemaDefinition"
    // InternalJsonSchemaDsl.g:2970:1: entryRuleSchemaSchemaDefinition returns [EObject current=null] : iv_ruleSchemaSchemaDefinition= ruleSchemaSchemaDefinition EOF ;
    public final EObject entryRuleSchemaSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2970:63: (iv_ruleSchemaSchemaDefinition= ruleSchemaSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2971:2: iv_ruleSchemaSchemaDefinition= ruleSchemaSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getSchemaSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaSchemaDefinition=ruleSchemaSchemaDefinition();

            state._fsp--;

             current =iv_ruleSchemaSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaSchemaDefinition"


    // $ANTLR start "ruleSchemaSchemaDefinition"
    // InternalJsonSchemaDsl.g:2977:1: ruleSchemaSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) ) ;
    public final EObject ruleSchemaSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_schema_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2983:2: ( (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2984:2: (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2984:2: (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2985:3: otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2993:3: ( (lv_schema_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2994:4: (lv_schema_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2994:4: (lv_schema_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2995:5: lv_schema_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_schema_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"schema",
            						lv_schema_2_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaSchemaDefinition"


    // $ANTLR start "entryRulePropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:3016:1: entryRulePropertiesSchemaDefinition returns [EObject current=null] : iv_rulePropertiesSchemaDefinition= rulePropertiesSchemaDefinition EOF ;
    public final EObject entryRulePropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:3016:67: (iv_rulePropertiesSchemaDefinition= rulePropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:3017:2: iv_rulePropertiesSchemaDefinition= rulePropertiesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertiesSchemaDefinition=rulePropertiesSchemaDefinition();

            state._fsp--;

             current =iv_rulePropertiesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertiesSchemaDefinition"


    // $ANTLR start "rulePropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:3023:1: rulePropertiesSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) ;
    public final EObject rulePropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_keySchemaPairs_4_0 = null;

        EObject lv_keySchemaPairs_6_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3029:2: ( ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) )
            // InternalJsonSchemaDsl.g:3030:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            {
            // InternalJsonSchemaDsl.g:3030:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            // InternalJsonSchemaDsl.g:3031:3: () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}'
            {
            // InternalJsonSchemaDsl.g:3031:3: ()
            // InternalJsonSchemaDsl.g:3032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertiesSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:3050:3: ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING||LA19_0==15||(LA19_0>=17 && LA19_0<=18)||(LA19_0>=21 && LA19_0<=61)||(LA19_0>=66 && LA19_0<=67)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3051:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:3051:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) )
                    // InternalJsonSchemaDsl.g:3052:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    {
                    // InternalJsonSchemaDsl.g:3052:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    // InternalJsonSchemaDsl.g:3053:6: lv_keySchemaPairs_4_0= ruleKeySchemaPair
                    {

                    						newCompositeNode(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keySchemaPairs_4_0=ruleKeySchemaPair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertiesSchemaDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"keySchemaPairs",
                    							lv_keySchemaPairs_4_0,
                    							"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:3070:4: (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:3071:5: otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:3075:5: ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    // InternalJsonSchemaDsl.g:3076:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    {
                    	    // InternalJsonSchemaDsl.g:3076:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    // InternalJsonSchemaDsl.g:3077:7: lv_keySchemaPairs_6_0= ruleKeySchemaPair
                    	    {

                    	    							newCompositeNode(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keySchemaPairs_6_0=ruleKeySchemaPair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPropertiesSchemaDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keySchemaPairs",
                    	    								lv_keySchemaPairs_6_0,
                    	    								"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertiesSchemaDefinition"


    // $ANTLR start "entryRulePropertyNamesSchemaDefinition"
    // InternalJsonSchemaDsl.g:3104:1: entryRulePropertyNamesSchemaDefinition returns [EObject current=null] : iv_rulePropertyNamesSchemaDefinition= rulePropertyNamesSchemaDefinition EOF ;
    public final EObject entryRulePropertyNamesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyNamesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:3104:70: (iv_rulePropertyNamesSchemaDefinition= rulePropertyNamesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:3105:2: iv_rulePropertyNamesSchemaDefinition= rulePropertyNamesSchemaDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyNamesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyNamesSchemaDefinition=rulePropertyNamesSchemaDefinition();

            state._fsp--;

             current =iv_rulePropertyNamesSchemaDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyNamesSchemaDefinition"


    // $ANTLR start "rulePropertyNamesSchemaDefinition"
    // InternalJsonSchemaDsl.g:3111:1: rulePropertyNamesSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) ) ;
    public final EObject rulePropertyNamesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_propertyNames_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3117:2: ( (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:3118:2: (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:3118:2: (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:3119:3: otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyNamesSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3127:3: ( (lv_propertyNames_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:3128:4: (lv_propertyNames_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:3128:4: (lv_propertyNames_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:3129:5: lv_propertyNames_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_propertyNames_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyNamesSchemaDefinitionRule());
            					}
            					set(
            						current,
            						"propertyNames",
            						lv_propertyNames_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyNamesSchemaDefinition"


    // $ANTLR start "entryRuleEDouble"
    // InternalJsonSchemaDsl.g:3150:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalJsonSchemaDsl.g:3150:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalJsonSchemaDsl.g:3151:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalJsonSchemaDsl.g:3157:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_JSON_NUMBER_0= RULE_JSON_NUMBER ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_JSON_NUMBER_0=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3163:2: (this_JSON_NUMBER_0= RULE_JSON_NUMBER )
            // InternalJsonSchemaDsl.g:3164:2: this_JSON_NUMBER_0= RULE_JSON_NUMBER
            {
            this_JSON_NUMBER_0=(Token)match(input,RULE_JSON_NUMBER,FOLLOW_2); 

            		current.merge(this_JSON_NUMBER_0);
            	

            		newLeafNode(this_JSON_NUMBER_0, grammarAccess.getEDoubleAccess().getJSON_NUMBERTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalJsonSchemaDsl.g:3174:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalJsonSchemaDsl.g:3174:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalJsonSchemaDsl.g:3175:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalJsonSchemaDsl.g:3181:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3187:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalJsonSchemaDsl.g:3188:2: (kw= 'true' | kw= 'false' )
            {
            // InternalJsonSchemaDsl.g:3188:2: (kw= 'true' | kw= 'false' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            else if ( (LA20_0==63) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3189:3: kw= 'true'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:3195:3: kw= 'false'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalJsonSchemaDsl.g:3204:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJsonSchemaDsl.g:3204:47: (iv_ruleEString= ruleEString EOF )
            // InternalJsonSchemaDsl.g:3205:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJsonSchemaDsl.g:3211:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3217:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalJsonSchemaDsl.g:3218:2: this_VALID_STRING_0= ruleVALID_STRING
            {

            		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VALID_STRING_0=ruleVALID_STRING();

            state._fsp--;


            		current.merge(this_VALID_STRING_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalJsonSchemaDsl.g:3231:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalJsonSchemaDsl.g:3231:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalJsonSchemaDsl.g:3232:2: iv_ruleJsonDocument= ruleJsonDocument EOF
            {
             newCompositeNode(grammarAccess.getJsonDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonDocument=ruleJsonDocument();

            state._fsp--;

             current =iv_ruleJsonDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonDocument"


    // $ANTLR start "ruleJsonDocument"
    // InternalJsonSchemaDsl.g:3238:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3244:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalJsonSchemaDsl.g:3245:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalJsonSchemaDsl.g:3245:2: ( (lv_value_0_0= ruleValue ) )
            // InternalJsonSchemaDsl.g:3246:3: (lv_value_0_0= ruleValue )
            {
            // InternalJsonSchemaDsl.g:3246:3: (lv_value_0_0= ruleValue )
            // InternalJsonSchemaDsl.g:3247:4: lv_value_0_0= ruleValue
            {

            				newCompositeNode(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJsonDocumentRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.Value");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalJsonSchemaDsl.g:3267:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalJsonSchemaDsl.g:3267:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalJsonSchemaDsl.g:3268:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalJsonSchemaDsl.g:3274:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3280:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalJsonSchemaDsl.g:3281:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalJsonSchemaDsl.g:3281:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalJsonSchemaDsl.g:3282:3: (lv_value_0_0= ruleEInt )
            {
            // InternalJsonSchemaDsl.g:3282:3: (lv_value_0_0= ruleEInt )
            // InternalJsonSchemaDsl.g:3283:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalJsonSchemaDsl.g:3303:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalJsonSchemaDsl.g:3303:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalJsonSchemaDsl.g:3304:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalJsonSchemaDsl.g:3310:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3316:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalJsonSchemaDsl.g:3317:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalJsonSchemaDsl.g:3317:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:3318:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:3318:3: (lv_value_0_0= ruleEBoolean )
            // InternalJsonSchemaDsl.g:3319:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.EBoolean");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalJsonSchemaDsl.g:3339:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalJsonSchemaDsl.g:3339:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalJsonSchemaDsl.g:3340:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalJsonSchemaDsl.g:3346:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3352:2: ( ( () otherlv_1= 'null' ) )
            // InternalJsonSchemaDsl.g:3353:2: ( () otherlv_1= 'null' )
            {
            // InternalJsonSchemaDsl.g:3353:2: ( () otherlv_1= 'null' )
            // InternalJsonSchemaDsl.g:3354:3: () otherlv_1= 'null'
            {
            // InternalJsonSchemaDsl.g:3354:3: ()
            // InternalJsonSchemaDsl.g:3355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullValueAccess().getNullValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalJsonSchemaDsl.g:3369:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJsonSchemaDsl.g:3369:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJsonSchemaDsl.g:3370:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalJsonSchemaDsl.g:3376:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleVALID_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3382:2: ( ( (lv_value_0_0= ruleVALID_STRING ) ) )
            // InternalJsonSchemaDsl.g:3383:2: ( (lv_value_0_0= ruleVALID_STRING ) )
            {
            // InternalJsonSchemaDsl.g:3383:2: ( (lv_value_0_0= ruleVALID_STRING ) )
            // InternalJsonSchemaDsl.g:3384:3: (lv_value_0_0= ruleVALID_STRING )
            {
            // InternalJsonSchemaDsl.g:3384:3: (lv_value_0_0= ruleVALID_STRING )
            // InternalJsonSchemaDsl.g:3385:4: lv_value_0_0= ruleVALID_STRING
            {

            				newCompositeNode(grammarAccess.getStringValueAccess().getValueVALID_STRINGParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleVALID_STRING();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.VALID_STRING");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalJsonSchemaDsl.g:3405:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalJsonSchemaDsl.g:3405:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalJsonSchemaDsl.g:3406:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
             newCompositeNode(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;

             current =iv_ruleObjectValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalJsonSchemaDsl.g:3412:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3418:2: ( ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonSchemaDsl.g:3419:2: ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonSchemaDsl.g:3419:2: ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' )
            // InternalJsonSchemaDsl.g:3420:3: () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonSchemaDsl.g:3420:3: ()
            // InternalJsonSchemaDsl.g:3421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3431:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3432:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:3432:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalJsonSchemaDsl.g:3433:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalJsonSchemaDsl.g:3433:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalJsonSchemaDsl.g:3434:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {

                    						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    						}
                    						add(
                    							current,
                    							"keyvaluepair",
                    							lv_keyvaluepair_2_0,
                    							"at.jku.bise.JsonSchemaDsl.KeyValuePair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:3451:4: (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:3452:5: otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:3456:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalJsonSchemaDsl.g:3457:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalJsonSchemaDsl.g:3457:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalJsonSchemaDsl.g:3458:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keyvaluepair",
                    	    								lv_keyvaluepair_4_0,
                    	    								"at.jku.bise.JsonSchemaDsl.KeyValuePair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalJsonSchemaDsl.g:3485:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalJsonSchemaDsl.g:3485:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalJsonSchemaDsl.g:3486:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalJsonSchemaDsl.g:3492:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3498:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:3499:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalJsonSchemaDsl.g:3499:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:3500:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:3500:3: (lv_value_0_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:3501:4: lv_value_0_0= ruleEDouble
            {

            				newCompositeNode(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.EDouble");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalJsonSchemaDsl.g:3521:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalJsonSchemaDsl.g:3521:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalJsonSchemaDsl.g:3522:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalJsonSchemaDsl.g:3528:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3534:2: ( ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonSchemaDsl.g:3535:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonSchemaDsl.g:3535:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            // InternalJsonSchemaDsl.g:3536:3: () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonSchemaDsl.g:3536:3: ()
            // InternalJsonSchemaDsl.g:3537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3547:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_INT)||LA24_0==12||LA24_0==15||(LA24_0>=17 && LA24_0<=19)||(LA24_0>=21 && LA24_0<=67)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3548:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:3548:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalJsonSchemaDsl.g:3549:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalJsonSchemaDsl.g:3549:5: (lv_value_2_0= ruleValue )
                    // InternalJsonSchemaDsl.g:3550:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"at.jku.bise.JsonSchemaDsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:3567:4: (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:3568:5: otherlv_3= ',' ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:3572:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalJsonSchemaDsl.g:3573:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalJsonSchemaDsl.g:3573:6: (lv_value_4_0= ruleValue )
                    	    // InternalJsonSchemaDsl.g:3574:7: lv_value_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"at.jku.bise.JsonSchemaDsl.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleEInt"
    // InternalJsonSchemaDsl.g:3601:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJsonSchemaDsl.g:3601:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJsonSchemaDsl.g:3602:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalJsonSchemaDsl.g:3608:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3614:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJsonSchemaDsl.g:3615:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJsonSchemaDsl.g:3615:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJsonSchemaDsl.g:3616:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJsonSchemaDsl.g:3616:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3617:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSchemaArray"
    // InternalJsonSchemaDsl.g:3634:1: entryRuleSchemaArray returns [EObject current=null] : iv_ruleSchemaArray= ruleSchemaArray EOF ;
    public final EObject entryRuleSchemaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaArray = null;


        try {
            // InternalJsonSchemaDsl.g:3634:52: (iv_ruleSchemaArray= ruleSchemaArray EOF )
            // InternalJsonSchemaDsl.g:3635:2: iv_ruleSchemaArray= ruleSchemaArray EOF
            {
             newCompositeNode(grammarAccess.getSchemaArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaArray=ruleSchemaArray();

            state._fsp--;

             current =iv_ruleSchemaArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaArray"


    // $ANTLR start "ruleSchemaArray"
    // InternalJsonSchemaDsl.g:3641:1: ruleSchemaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSchemaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3647:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' ) )
            // InternalJsonSchemaDsl.g:3648:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' )
            {
            // InternalJsonSchemaDsl.g:3648:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' )
            // InternalJsonSchemaDsl.g:3649:3: otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonSchemaDsl.g:3653:3: ( (lv_items_1_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:3654:4: (lv_items_1_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:3654:4: (lv_items_1_0= ruleSchema )
            // InternalJsonSchemaDsl.g:3655:5: lv_items_1_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_items_1_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaArrayRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_1_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonSchemaDsl.g:3672:3: (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3673:4: otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSchemaArrayAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonSchemaDsl.g:3677:4: ( (lv_items_3_0= ruleSchema ) )
            	    // InternalJsonSchemaDsl.g:3678:5: (lv_items_3_0= ruleSchema )
            	    {
            	    // InternalJsonSchemaDsl.g:3678:5: (lv_items_3_0= ruleSchema )
            	    // InternalJsonSchemaDsl.g:3679:6: lv_items_3_0= ruleSchema
            	    {

            	    						newCompositeNode(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_items_3_0=ruleSchema();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSchemaArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_3_0,
            	    							"at.jku.bise.JsonSchemaDsl.Schema");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSchemaArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaArray"


    // $ANTLR start "entryRuleNonNegativeIntegerDefault0"
    // InternalJsonSchemaDsl.g:3705:1: entryRuleNonNegativeIntegerDefault0 returns [EObject current=null] : iv_ruleNonNegativeIntegerDefault0= ruleNonNegativeIntegerDefault0 EOF ;
    public final EObject entryRuleNonNegativeIntegerDefault0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonNegativeIntegerDefault0 = null;


        try {
            // InternalJsonSchemaDsl.g:3705:67: (iv_ruleNonNegativeIntegerDefault0= ruleNonNegativeIntegerDefault0 EOF )
            // InternalJsonSchemaDsl.g:3706:2: iv_ruleNonNegativeIntegerDefault0= ruleNonNegativeIntegerDefault0 EOF
            {
             newCompositeNode(grammarAccess.getNonNegativeIntegerDefault0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonNegativeIntegerDefault0=ruleNonNegativeIntegerDefault0();

            state._fsp--;

             current =iv_ruleNonNegativeIntegerDefault0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeIntegerDefault0"


    // $ANTLR start "ruleNonNegativeIntegerDefault0"
    // InternalJsonSchemaDsl.g:3712:1: ruleNonNegativeIntegerDefault0 returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNonNegativeIntegerDefault0() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3718:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalJsonSchemaDsl.g:3719:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalJsonSchemaDsl.g:3719:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalJsonSchemaDsl.g:3720:3: (lv_value_0_0= ruleEInt )
            {
            // InternalJsonSchemaDsl.g:3720:3: (lv_value_0_0= ruleEInt )
            // InternalJsonSchemaDsl.g:3721:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getNonNegativeIntegerDefault0Access().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNonNegativeIntegerDefault0Rule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeIntegerDefault0"


    // $ANTLR start "entryRuleKeySchemaPair"
    // InternalJsonSchemaDsl.g:3741:1: entryRuleKeySchemaPair returns [EObject current=null] : iv_ruleKeySchemaPair= ruleKeySchemaPair EOF ;
    public final EObject entryRuleKeySchemaPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeySchemaPair = null;


        try {
            // InternalJsonSchemaDsl.g:3741:54: (iv_ruleKeySchemaPair= ruleKeySchemaPair EOF )
            // InternalJsonSchemaDsl.g:3742:2: iv_ruleKeySchemaPair= ruleKeySchemaPair EOF
            {
             newCompositeNode(grammarAccess.getKeySchemaPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeySchemaPair=ruleKeySchemaPair();

            state._fsp--;

             current =iv_ruleKeySchemaPair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeySchemaPair"


    // $ANTLR start "ruleKeySchemaPair"
    // InternalJsonSchemaDsl.g:3748:1: ruleKeySchemaPair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) ) ;
    public final EObject ruleKeySchemaPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3754:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:3755:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:3755:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:3756:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) )
            {
            // InternalJsonSchemaDsl.g:3756:3: ( (lv_key_0_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:3757:4: (lv_key_0_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:3757:4: (lv_key_0_0= ruleEString )
            // InternalJsonSchemaDsl.g:3758:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeySchemaPairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeySchemaPairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getKeySchemaPairAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3779:3: ( (lv_value_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:3780:4: (lv_value_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:3780:4: (lv_value_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:3781:5: lv_value_2_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getKeySchemaPairAccess().getValueSchemaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeySchemaPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"at.jku.bise.JsonSchemaDsl.Schema");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeySchemaPair"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalJsonSchemaDsl.g:3802:1: entryRuleNonNegativeInteger returns [EObject current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final EObject entryRuleNonNegativeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonNegativeInteger = null;


        try {
            // InternalJsonSchemaDsl.g:3802:59: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalJsonSchemaDsl.g:3803:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
            {
             newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonNegativeInteger=ruleNonNegativeInteger();

            state._fsp--;

             current =iv_ruleNonNegativeInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalJsonSchemaDsl.g:3809:1: ruleNonNegativeInteger returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNonNegativeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3815:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalJsonSchemaDsl.g:3816:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalJsonSchemaDsl.g:3816:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalJsonSchemaDsl.g:3817:3: (lv_value_0_0= ruleEInt )
            {
            // InternalJsonSchemaDsl.g:3817:3: (lv_value_0_0= ruleEInt )
            // InternalJsonSchemaDsl.g:3818:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getNonNegativeIntegerAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNonNegativeIntegerRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleTypesAnyOf2"
    // InternalJsonSchemaDsl.g:3838:1: entryRuleTypesAnyOf2 returns [EObject current=null] : iv_ruleTypesAnyOf2= ruleTypesAnyOf2 EOF ;
    public final EObject entryRuleTypesAnyOf2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypesAnyOf2 = null;


        try {
            // InternalJsonSchemaDsl.g:3838:52: (iv_ruleTypesAnyOf2= ruleTypesAnyOf2 EOF )
            // InternalJsonSchemaDsl.g:3839:2: iv_ruleTypesAnyOf2= ruleTypesAnyOf2 EOF
            {
             newCompositeNode(grammarAccess.getTypesAnyOf2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypesAnyOf2=ruleTypesAnyOf2();

            state._fsp--;

             current =iv_ruleTypesAnyOf2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypesAnyOf2"


    // $ANTLR start "ruleTypesAnyOf2"
    // InternalJsonSchemaDsl.g:3845:1: ruleTypesAnyOf2 returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTypesAnyOf2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_items_1_0 = null;

        Enumerator lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3851:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' ) )
            // InternalJsonSchemaDsl.g:3852:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' )
            {
            // InternalJsonSchemaDsl.g:3852:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' )
            // InternalJsonSchemaDsl.g:3853:3: otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTypesAnyOf2Access().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonSchemaDsl.g:3857:3: ( (lv_items_1_0= ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:3858:4: (lv_items_1_0= ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:3858:4: (lv_items_1_0= ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:3859:5: lv_items_1_0= ruleSimpleTypes
            {

            					newCompositeNode(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_items_1_0=ruleSimpleTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypesAnyOf2Rule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_1_0,
            						"at.jku.bise.JsonSchemaDsl.SimpleTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonSchemaDsl.g:3876:3: (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3877:4: otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypesAnyOf2Access().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonSchemaDsl.g:3881:4: ( (lv_items_3_0= ruleSimpleTypes ) )
            	    // InternalJsonSchemaDsl.g:3882:5: (lv_items_3_0= ruleSimpleTypes )
            	    {
            	    // InternalJsonSchemaDsl.g:3882:5: (lv_items_3_0= ruleSimpleTypes )
            	    // InternalJsonSchemaDsl.g:3883:6: lv_items_3_0= ruleSimpleTypes
            	    {

            	    						newCompositeNode(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_items_3_0=ruleSimpleTypes();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypesAnyOf2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_3_0,
            	    							"at.jku.bise.JsonSchemaDsl.SimpleTypes");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypesAnyOf2Access().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypesAnyOf2"


    // $ANTLR start "entryRuleDependenciesAnyOf"
    // InternalJsonSchemaDsl.g:3909:1: entryRuleDependenciesAnyOf returns [EObject current=null] : iv_ruleDependenciesAnyOf= ruleDependenciesAnyOf EOF ;
    public final EObject entryRuleDependenciesAnyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenciesAnyOf = null;


        try {
            // InternalJsonSchemaDsl.g:3909:58: (iv_ruleDependenciesAnyOf= ruleDependenciesAnyOf EOF )
            // InternalJsonSchemaDsl.g:3910:2: iv_ruleDependenciesAnyOf= ruleDependenciesAnyOf EOF
            {
             newCompositeNode(grammarAccess.getDependenciesAnyOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependenciesAnyOf=ruleDependenciesAnyOf();

            state._fsp--;

             current =iv_ruleDependenciesAnyOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependenciesAnyOf"


    // $ANTLR start "ruleDependenciesAnyOf"
    // InternalJsonSchemaDsl.g:3916:1: ruleDependenciesAnyOf returns [EObject current=null] : ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? ) ;
    public final EObject ruleDependenciesAnyOf() throws RecognitionException {
        EObject current = null;

        EObject lv_dependenciesAnyOf2_1_0 = null;

        EObject lv_dependenciesAnyOf1_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3922:2: ( ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? ) )
            // InternalJsonSchemaDsl.g:3923:2: ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? )
            {
            // InternalJsonSchemaDsl.g:3923:2: ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? )
            // InternalJsonSchemaDsl.g:3924:3: () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )?
            {
            // InternalJsonSchemaDsl.g:3924:3: ()
            // InternalJsonSchemaDsl.g:3925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOfAction_0(),
            					current);
            			

            }

            // InternalJsonSchemaDsl.g:3931:3: ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3932:4: (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair )
                    {
                    // InternalJsonSchemaDsl.g:3932:4: (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair )
                    // InternalJsonSchemaDsl.g:3933:5: lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair
                    {

                    					newCompositeNode(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2KeyStringArrayPairParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_dependenciesAnyOf2_1_0=ruleKeyStringArrayPair();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDependenciesAnyOfRule());
                    					}
                    					set(
                    						current,
                    						"dependenciesAnyOf2",
                    						lv_dependenciesAnyOf2_1_0,
                    						"at.jku.bise.JsonSchemaDsl.KeyStringArrayPair");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJsonSchemaDsl.g:3950:3: ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING||LA29_0==15||(LA29_0>=17 && LA29_0<=18)||(LA29_0>=21 && LA29_0<=61)||(LA29_0>=66 && LA29_0<=67)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3951:4: (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair )
                    {
                    // InternalJsonSchemaDsl.g:3951:4: (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair )
                    // InternalJsonSchemaDsl.g:3952:5: lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair
                    {

                    					newCompositeNode(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1KeySchemaPairParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dependenciesAnyOf1_2_0=ruleKeySchemaPair();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDependenciesAnyOfRule());
                    					}
                    					set(
                    						current,
                    						"dependenciesAnyOf1",
                    						lv_dependenciesAnyOf1_2_0,
                    						"at.jku.bise.JsonSchemaDsl.KeySchemaPair");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependenciesAnyOf"


    // $ANTLR start "entryRuleKeyStringArrayPair"
    // InternalJsonSchemaDsl.g:3973:1: entryRuleKeyStringArrayPair returns [EObject current=null] : iv_ruleKeyStringArrayPair= ruleKeyStringArrayPair EOF ;
    public final EObject entryRuleKeyStringArrayPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringArrayPair = null;


        try {
            // InternalJsonSchemaDsl.g:3973:59: (iv_ruleKeyStringArrayPair= ruleKeyStringArrayPair EOF )
            // InternalJsonSchemaDsl.g:3974:2: iv_ruleKeyStringArrayPair= ruleKeyStringArrayPair EOF
            {
             newCompositeNode(grammarAccess.getKeyStringArrayPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyStringArrayPair=ruleKeyStringArrayPair();

            state._fsp--;

             current =iv_ruleKeyStringArrayPair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringArrayPair"


    // $ANTLR start "ruleKeyStringArrayPair"
    // InternalJsonSchemaDsl.g:3980:1: ruleKeyStringArrayPair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) ) ;
    public final EObject ruleKeyStringArrayPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3986:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) ) )
            // InternalJsonSchemaDsl.g:3987:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) )
            {
            // InternalJsonSchemaDsl.g:3987:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) )
            // InternalJsonSchemaDsl.g:3988:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) )
            {
            // InternalJsonSchemaDsl.g:3988:3: ( (lv_key_0_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:3989:4: (lv_key_0_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:3989:4: (lv_key_0_0= ruleEString )
            // InternalJsonSchemaDsl.g:3990:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyStringArrayPairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyStringArrayPairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyStringArrayPairAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:4011:3: ( (lv_value_2_0= ruleStringArray ) )
            // InternalJsonSchemaDsl.g:4012:4: (lv_value_2_0= ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:4012:4: (lv_value_2_0= ruleStringArray )
            // InternalJsonSchemaDsl.g:4013:5: lv_value_2_0= ruleStringArray
            {

            					newCompositeNode(grammarAccess.getKeyStringArrayPairAccess().getValueStringArrayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleStringArray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyStringArrayPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"at.jku.bise.JsonSchemaDsl.StringArray");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringArrayPair"


    // $ANTLR start "entryRuleStringArray"
    // InternalJsonSchemaDsl.g:4034:1: entryRuleStringArray returns [EObject current=null] : iv_ruleStringArray= ruleStringArray EOF ;
    public final EObject entryRuleStringArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArray = null;


        try {
            // InternalJsonSchemaDsl.g:4034:52: (iv_ruleStringArray= ruleStringArray EOF )
            // InternalJsonSchemaDsl.g:4035:2: iv_ruleStringArray= ruleStringArray EOF
            {
             newCompositeNode(grammarAccess.getStringArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringArray=ruleStringArray();

            state._fsp--;

             current =iv_ruleStringArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringArray"


    // $ANTLR start "ruleStringArray"
    // InternalJsonSchemaDsl.g:4041:1: ruleStringArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleStringArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:4047:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonSchemaDsl.g:4048:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonSchemaDsl.g:4048:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' )
            // InternalJsonSchemaDsl.g:4049:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonSchemaDsl.g:4049:3: ()
            // InternalJsonSchemaDsl.g:4050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:4060:3: ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING||LA31_0==15||(LA31_0>=17 && LA31_0<=18)||(LA31_0>=21 && LA31_0<=61)||(LA31_0>=66 && LA31_0<=67)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4061:4: ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:4061:4: ( (lv_values_2_0= ruleEString ) )
                    // InternalJsonSchemaDsl.g:4062:5: (lv_values_2_0= ruleEString )
                    {
                    // InternalJsonSchemaDsl.g:4062:5: (lv_values_2_0= ruleEString )
                    // InternalJsonSchemaDsl.g:4063:6: lv_values_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_values_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringArrayRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"at.jku.bise.JsonSchemaDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonSchemaDsl.g:4080:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==13) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:4081:5: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStringArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:4085:5: ( (lv_values_4_0= ruleEString ) )
                    	    // InternalJsonSchemaDsl.g:4086:6: (lv_values_4_0= ruleEString )
                    	    {
                    	    // InternalJsonSchemaDsl.g:4086:6: (lv_values_4_0= ruleEString )
                    	    // InternalJsonSchemaDsl.g:4087:7: lv_values_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_values_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"at.jku.bise.JsonSchemaDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringArray"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalJsonSchemaDsl.g:4114:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalJsonSchemaDsl.g:4114:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalJsonSchemaDsl.g:4115:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
            {
             newCompositeNode(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_STRING=ruleVALID_STRING();

            state._fsp--;

             current =iv_ruleVALID_STRING.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalJsonSchemaDsl.g:4121:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:4127:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalJsonSchemaDsl.g:4128:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalJsonSchemaDsl.g:4128:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==15||(LA32_0>=17 && LA32_0<=18)||(LA32_0>=21 && LA32_0<=61)||(LA32_0>=66 && LA32_0<=67)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4129:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:4137:3: this_KEYWORD_1= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalJsonSchemaDsl.g:4151:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalJsonSchemaDsl.g:4151:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalJsonSchemaDsl.g:4152:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalJsonSchemaDsl.g:4158:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"$id\"' | kw= '\"$schema\"' | kw= '\"$ref\"' | kw= '\"$comment\"' | kw= '\"title\"' | kw= '\"description\"' | kw= '\"default\"' | kw= '\"readOnly\"' | kw= '\"writeOnly\"' | kw= '\"examples\"' | kw= '\"multipleOf\"' | kw= '\"maximum\"' | kw= '\"exclusiveMaximum\"' | kw= '\"minimum\"' | kw= '\"exclusiveMinimum\"' | kw= '\"maxLength\"' | kw= '\"minLength\"' | kw= '\"pattern\"' | kw= '\"additionalItems\"' | kw= '\"items\"' | kw= '\"maxItems\"' | kw= '\"minItems\"' | kw= '\"uniqueItems\"' | kw= '\"contains\"' | kw= '\"maxProperties\"' | kw= '\"minProperties\"' | kw= '\"required\"' | kw= '\"additionalProperties\"' | kw= '\"definitions\"' | kw= '\"properties\"' | kw= '\"patternProperties\"' | kw= '\"dependencies\"' | kw= '\"propertyNames\"' | kw= '\"const\"' | kw= '\"enum\"' | kw= '\"type\"' | kw= '\"format\"' | kw= '\"contentMediaType\"' | kw= '\"contentEncoding\"' | kw= '\"if\"' | kw= '\"then\"' | kw= '\"else\"' | kw= '\"allOf\"' | kw= '\"anyOf\"' | kw= '\"oneOf\"' | kw= '\"not\"' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:4164:2: ( (kw= '\"$id\"' | kw= '\"$schema\"' | kw= '\"$ref\"' | kw= '\"$comment\"' | kw= '\"title\"' | kw= '\"description\"' | kw= '\"default\"' | kw= '\"readOnly\"' | kw= '\"writeOnly\"' | kw= '\"examples\"' | kw= '\"multipleOf\"' | kw= '\"maximum\"' | kw= '\"exclusiveMaximum\"' | kw= '\"minimum\"' | kw= '\"exclusiveMinimum\"' | kw= '\"maxLength\"' | kw= '\"minLength\"' | kw= '\"pattern\"' | kw= '\"additionalItems\"' | kw= '\"items\"' | kw= '\"maxItems\"' | kw= '\"minItems\"' | kw= '\"uniqueItems\"' | kw= '\"contains\"' | kw= '\"maxProperties\"' | kw= '\"minProperties\"' | kw= '\"required\"' | kw= '\"additionalProperties\"' | kw= '\"definitions\"' | kw= '\"properties\"' | kw= '\"patternProperties\"' | kw= '\"dependencies\"' | kw= '\"propertyNames\"' | kw= '\"const\"' | kw= '\"enum\"' | kw= '\"type\"' | kw= '\"format\"' | kw= '\"contentMediaType\"' | kw= '\"contentEncoding\"' | kw= '\"if\"' | kw= '\"then\"' | kw= '\"else\"' | kw= '\"allOf\"' | kw= '\"anyOf\"' | kw= '\"oneOf\"' | kw= '\"not\"' ) )
            // InternalJsonSchemaDsl.g:4165:2: (kw= '\"$id\"' | kw= '\"$schema\"' | kw= '\"$ref\"' | kw= '\"$comment\"' | kw= '\"title\"' | kw= '\"description\"' | kw= '\"default\"' | kw= '\"readOnly\"' | kw= '\"writeOnly\"' | kw= '\"examples\"' | kw= '\"multipleOf\"' | kw= '\"maximum\"' | kw= '\"exclusiveMaximum\"' | kw= '\"minimum\"' | kw= '\"exclusiveMinimum\"' | kw= '\"maxLength\"' | kw= '\"minLength\"' | kw= '\"pattern\"' | kw= '\"additionalItems\"' | kw= '\"items\"' | kw= '\"maxItems\"' | kw= '\"minItems\"' | kw= '\"uniqueItems\"' | kw= '\"contains\"' | kw= '\"maxProperties\"' | kw= '\"minProperties\"' | kw= '\"required\"' | kw= '\"additionalProperties\"' | kw= '\"definitions\"' | kw= '\"properties\"' | kw= '\"patternProperties\"' | kw= '\"dependencies\"' | kw= '\"propertyNames\"' | kw= '\"const\"' | kw= '\"enum\"' | kw= '\"type\"' | kw= '\"format\"' | kw= '\"contentMediaType\"' | kw= '\"contentEncoding\"' | kw= '\"if\"' | kw= '\"then\"' | kw= '\"else\"' | kw= '\"allOf\"' | kw= '\"anyOf\"' | kw= '\"oneOf\"' | kw= '\"not\"' )
            {
            // InternalJsonSchemaDsl.g:4165:2: (kw= '\"$id\"' | kw= '\"$schema\"' | kw= '\"$ref\"' | kw= '\"$comment\"' | kw= '\"title\"' | kw= '\"description\"' | kw= '\"default\"' | kw= '\"readOnly\"' | kw= '\"writeOnly\"' | kw= '\"examples\"' | kw= '\"multipleOf\"' | kw= '\"maximum\"' | kw= '\"exclusiveMaximum\"' | kw= '\"minimum\"' | kw= '\"exclusiveMinimum\"' | kw= '\"maxLength\"' | kw= '\"minLength\"' | kw= '\"pattern\"' | kw= '\"additionalItems\"' | kw= '\"items\"' | kw= '\"maxItems\"' | kw= '\"minItems\"' | kw= '\"uniqueItems\"' | kw= '\"contains\"' | kw= '\"maxProperties\"' | kw= '\"minProperties\"' | kw= '\"required\"' | kw= '\"additionalProperties\"' | kw= '\"definitions\"' | kw= '\"properties\"' | kw= '\"patternProperties\"' | kw= '\"dependencies\"' | kw= '\"propertyNames\"' | kw= '\"const\"' | kw= '\"enum\"' | kw= '\"type\"' | kw= '\"format\"' | kw= '\"contentMediaType\"' | kw= '\"contentEncoding\"' | kw= '\"if\"' | kw= '\"then\"' | kw= '\"else\"' | kw= '\"allOf\"' | kw= '\"anyOf\"' | kw= '\"oneOf\"' | kw= '\"not\"' )
            int alt33=46;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 59:
                {
                alt33=2;
                }
                break;
            case 56:
                {
                alt33=3;
                }
                break;
            case 18:
                {
                alt33=4;
                }
                break;
            case 23:
                {
                alt33=5;
                }
                break;
            case 42:
                {
                alt33=6;
                }
                break;
            case 25:
                {
                alt33=7;
                }
                break;
            case 35:
                {
                alt33=8;
                }
                break;
            case 17:
                {
                alt33=9;
                }
                break;
            case 46:
                {
                alt33=10;
                }
                break;
            case 50:
                {
                alt33=11;
                }
                break;
            case 15:
                {
                alt33=12;
                }
                break;
            case 54:
                {
                alt33=13;
                }
                break;
            case 32:
                {
                alt33=14;
                }
                break;
            case 58:
                {
                alt33=15;
                }
                break;
            case 55:
                {
                alt33=16;
                }
                break;
            case 27:
                {
                alt33=17;
                }
                break;
            case 51:
                {
                alt33=18;
                }
                break;
            case 45:
                {
                alt33=19;
                }
                break;
            case 24:
                {
                alt33=20;
                }
                break;
            case 33:
                {
                alt33=21;
                }
                break;
            case 29:
                {
                alt33=22;
                }
                break;
            case 21:
                {
                alt33=23;
                }
                break;
            case 52:
                {
                alt33=24;
                }
                break;
            case 31:
                {
                alt33=25;
                }
                break;
            case 43:
                {
                alt33=26;
                }
                break;
            case 41:
                {
                alt33=27;
                }
                break;
            case 37:
                {
                alt33=28;
                }
                break;
            case 28:
                {
                alt33=29;
                }
                break;
            case 60:
                {
                alt33=30;
                }
                break;
            case 44:
                {
                alt33=31;
                }
                break;
            case 66:
                {
                alt33=32;
                }
                break;
            case 61:
                {
                alt33=33;
                }
                break;
            case 40:
                {
                alt33=34;
                }
                break;
            case 67:
                {
                alt33=35;
                }
                break;
            case 36:
                {
                alt33=36;
                }
                break;
            case 34:
                {
                alt33=37;
                }
                break;
            case 57:
                {
                alt33=38;
                }
                break;
            case 49:
                {
                alt33=39;
                }
                break;
            case 47:
                {
                alt33=40;
                }
                break;
            case 26:
                {
                alt33=41;
                }
                break;
            case 38:
                {
                alt33=42;
                }
                break;
            case 48:
                {
                alt33=43;
                }
                break;
            case 22:
                {
                alt33=44;
                }
                break;
            case 30:
                {
                alt33=45;
                }
                break;
            case 53:
                {
                alt33=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4166:3: kw= '\"$id\"'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIdKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:4172:3: kw= '\"$schema\"'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemaKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:4178:3: kw= '\"$ref\"'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRefKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:4184:3: kw= '\"$comment\"'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCommentKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:4190:3: kw= '\"title\"'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:4196:3: kw= '\"description\"'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:4202:3: kw= '\"default\"'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDefaultKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalJsonSchemaDsl.g:4208:3: kw= '\"readOnly\"'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getReadOnlyKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalJsonSchemaDsl.g:4214:3: kw= '\"writeOnly\"'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWriteOnlyKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalJsonSchemaDsl.g:4220:3: kw= '\"examples\"'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExamplesKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalJsonSchemaDsl.g:4226:3: kw= '\"multipleOf\"'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMultipleOfKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalJsonSchemaDsl.g:4232:3: kw= '\"maximum\"'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaximumKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalJsonSchemaDsl.g:4238:3: kw= '\"exclusiveMaximum\"'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExclusiveMaximumKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalJsonSchemaDsl.g:4244:3: kw= '\"minimum\"'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinimumKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalJsonSchemaDsl.g:4250:3: kw= '\"exclusiveMinimum\"'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExclusiveMinimumKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalJsonSchemaDsl.g:4256:3: kw= '\"maxLength\"'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalJsonSchemaDsl.g:4262:3: kw= '\"minLength\"'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalJsonSchemaDsl.g:4268:3: kw= '\"pattern\"'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalJsonSchemaDsl.g:4274:3: kw= '\"additionalItems\"'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAdditionalItemsKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalJsonSchemaDsl.g:4280:3: kw= '\"items\"'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getItemsKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalJsonSchemaDsl.g:4286:3: kw= '\"maxItems\"'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxItemsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalJsonSchemaDsl.g:4292:3: kw= '\"minItems\"'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinItemsKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalJsonSchemaDsl.g:4298:3: kw= '\"uniqueItems\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUniqueItemsKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalJsonSchemaDsl.g:4304:3: kw= '\"contains\"'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContainsKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalJsonSchemaDsl.g:4310:3: kw= '\"maxProperties\"'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxPropertiesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalJsonSchemaDsl.g:4316:3: kw= '\"minProperties\"'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinPropertiesKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalJsonSchemaDsl.g:4322:3: kw= '\"required\"'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalJsonSchemaDsl.g:4328:3: kw= '\"additionalProperties\"'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAdditionalPropertiesKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalJsonSchemaDsl.g:4334:3: kw= '\"definitions\"'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDefinitionsKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalJsonSchemaDsl.g:4340:3: kw= '\"properties\"'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPropertiesKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalJsonSchemaDsl.g:4346:3: kw= '\"patternProperties\"'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternPropertiesKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalJsonSchemaDsl.g:4352:3: kw= '\"dependencies\"'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependenciesKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalJsonSchemaDsl.g:4358:3: kw= '\"propertyNames\"'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPropertyNamesKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalJsonSchemaDsl.g:4364:3: kw= '\"const\"'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalJsonSchemaDsl.g:4370:3: kw= '\"enum\"'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalJsonSchemaDsl.g:4376:3: kw= '\"type\"'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalJsonSchemaDsl.g:4382:3: kw= '\"format\"'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFormatKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalJsonSchemaDsl.g:4388:3: kw= '\"contentMediaType\"'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContentMediaTypeKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalJsonSchemaDsl.g:4394:3: kw= '\"contentEncoding\"'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContentEncodingKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalJsonSchemaDsl.g:4400:3: kw= '\"if\"'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIfKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalJsonSchemaDsl.g:4406:3: kw= '\"then\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getThenKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalJsonSchemaDsl.g:4412:3: kw= '\"else\"'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getElseKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalJsonSchemaDsl.g:4418:3: kw= '\"allOf\"'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAllOfKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalJsonSchemaDsl.g:4424:3: kw= '\"anyOf\"'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnyOfKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalJsonSchemaDsl.g:4430:3: kw= '\"oneOf\"'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOneOfKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalJsonSchemaDsl.g:4436:3: kw= '\"not\"'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNotKeyword_45());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleSimpleTypes"
    // InternalJsonSchemaDsl.g:4445:1: ruleSimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) ) ;
    public final Enumerator ruleSimpleTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:4451:2: ( ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) ) )
            // InternalJsonSchemaDsl.g:4452:2: ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) )
            {
            // InternalJsonSchemaDsl.g:4452:2: ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) )
            int alt34=7;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt34=1;
                }
                break;
            case 69:
                {
                alt34=2;
                }
                break;
            case 70:
                {
                alt34=3;
                }
                break;
            case 71:
                {
                alt34=4;
                }
                break;
            case 72:
                {
                alt34=5;
                }
                break;
            case 73:
                {
                alt34=6;
                }
                break;
            case 74:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4453:3: (enumLiteral_0= '\"array\"' )
                    {
                    // InternalJsonSchemaDsl.g:4453:3: (enumLiteral_0= '\"array\"' )
                    // InternalJsonSchemaDsl.g:4454:4: enumLiteral_0= '\"array\"'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:4461:3: (enumLiteral_1= '\"boolean\"' )
                    {
                    // InternalJsonSchemaDsl.g:4461:3: (enumLiteral_1= '\"boolean\"' )
                    // InternalJsonSchemaDsl.g:4462:4: enumLiteral_1= '\"boolean\"'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:4469:3: (enumLiteral_2= '\"integer\"' )
                    {
                    // InternalJsonSchemaDsl.g:4469:3: (enumLiteral_2= '\"integer\"' )
                    // InternalJsonSchemaDsl.g:4470:4: enumLiteral_2= '\"integer\"'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:4477:3: (enumLiteral_3= '\"null\"' )
                    {
                    // InternalJsonSchemaDsl.g:4477:3: (enumLiteral_3= '\"null\"' )
                    // InternalJsonSchemaDsl.g:4478:4: enumLiteral_3= '\"null\"'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:4485:3: (enumLiteral_4= '\"number\"' )
                    {
                    // InternalJsonSchemaDsl.g:4485:3: (enumLiteral_4= '\"number\"' )
                    // InternalJsonSchemaDsl.g:4486:4: enumLiteral_4= '\"number\"'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:4493:3: (enumLiteral_5= '\"object\"' )
                    {
                    // InternalJsonSchemaDsl.g:4493:3: (enumLiteral_5= '\"object\"' )
                    // InternalJsonSchemaDsl.g:4494:4: enumLiteral_5= '\"object\"'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:4501:3: (enumLiteral_6= '\"string\"' )
                    {
                    // InternalJsonSchemaDsl.g:4501:3: (enumLiteral_6= '\"string\"' )
                    // InternalJsonSchemaDsl.g:4502:4: enumLiteral_6= '\"string\"'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypes"

    // Delegated rules


    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\1\60\62\uffff";
    static final String dfa_3s = "\1\4\57\20\1\uffff\1\14\1\uffff";
    static final String dfa_4s = "\1\103\57\20\1\uffff\1\77\1\uffff";
    static final String dfa_5s = "\60\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\63\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\15\1\uffff\1\12\1\5\2\uffff\1\30\1\55\1\6\1\25\1\10\1\52\1\22\1\36\1\27\1\56\1\32\1\17\1\26\1\46\1\11\1\45\1\35\1\53\1\2\1\43\1\34\1\7\1\33\1\40\1\24\1\13\1\51\1\54\1\50\1\14\1\23\1\31\1\57\1\16\1\21\1\4\1\47\1\20\1\3\1\37\1\42\4\uffff\1\41\1\44",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "\1\61",
            "",
            "\1\60\6\uffff\1\62\52\uffff\2\60",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3931:3: ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3FFFFFFFFFEEC010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x3FFFFFFFFFEE8010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x3FFFFFFFFFE68010L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xFFFFFFFFFFEE9070L,0x000000000000000FL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xC000000000081002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xC000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x3FFFFFFFFFE6C010L,0x000000000000000CL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080002L,0x00000000000007F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFFFFFFFFFFFE9070L,0x000000000000000FL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x3FFFFFFFFFE68012L,0x000000000000000CL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x3FFFFFFFFFF68010L,0x000000000000000CL});

}