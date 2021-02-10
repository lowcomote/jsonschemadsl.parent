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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSON_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'\"maximum\"'", "':'", "'\"writeOnly\"'", "'\"$comment\"'", "'['", "']'", "'\"uniqueItems\"'", "'\"anyOf\"'", "'\"title\"'", "'\"items\"'", "'\"default\"'", "'\"then\"'", "'\"minLength\"'", "'\"definitions\"'", "'\"minItems\"'", "'\"oneOf\"'", "'\"maxProperties\"'", "'\"minimum\"'", "'\"maxItems\"'", "'\"format\"'", "'\"readOnly\"'", "'\"type\"'", "'\"additionalProperties\"'", "'\"else\"'", "'\"$id\"'", "'\"const\"'", "'\"required\"'", "'\"description\"'", "'\"minProperties\"'", "'\"patternProperties\"'", "'\"additionalItems\"'", "'\"examples\"'", "'\"if\"'", "'\"allOf\"'", "'\"contentEncoding\"'", "'\"multipleOf\"'", "'\"pattern\"'", "'\"contains\"'", "'\"not\"'", "'\"exclusiveMaximum\"'", "'\"maxLength\"'", "'\"$ref\"'", "'\"contentMediaType\"'", "'\"exclusiveMinimum\"'", "'\"$schema\"'", "'\"properties\"'", "'\"propertyNames\"'", "'true'", "'false'", "'null'", "'-'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"string\"'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int RULE_JSON_NUMBER=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

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
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumSchemaDefinitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonSchemaDsl.g:932:3: ( (lv_items_1_0= ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:933:4: (lv_items_1_0= ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:933:4: (lv_items_1_0= ruleJsonDocument )
            // InternalJsonSchemaDsl.g:934:5: lv_items_1_0= ruleJsonDocument
            {

            					newCompositeNode(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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
            	    otherlv_2=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumSchemaDefinitionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonSchemaDsl.g:956:4: ( (lv_items_3_0= ruleJsonDocument ) )
            	    // InternalJsonSchemaDsl.g:957:5: (lv_items_3_0= ruleJsonDocument )
            	    {
            	    // InternalJsonSchemaDsl.g:957:5: (lv_items_3_0= ruleJsonDocument )
            	    // InternalJsonSchemaDsl.g:958:6: lv_items_3_0= ruleJsonDocument
            	    {

            	    						newCompositeNode(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

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
            		
            otherlv_2=(Token)match(input,16,FOLLOW_12); 

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
                    				
                    pushFollow(FOLLOW_13);
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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

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
            		
            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionsSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:1366:3: ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
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
                    	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

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
            		
            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeSchemaDefinitionAccess().getColonKeyword_2());
            		
            // InternalJsonSchemaDsl.g:1772:3: ( (lv_typeAnyOf1_3_0= ruleSimpleTypes ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=66 && LA12_0<=72)) ) {
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
                    				
                    pushFollow(FOLLOW_13);
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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_9); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

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
            		
            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:2170:3: ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
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
                    	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

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
    // InternalJsonSchemaDsl.g:2277:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2283:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalJsonSchemaDsl.g:2284:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalJsonSchemaDsl.g:2284:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalJsonSchemaDsl.g:2285:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalJsonSchemaDsl.g:2285:3: ( (lv_key_0_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2286:4: (lv_key_0_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2286:4: (lv_key_0_0= ruleEString )
            // InternalJsonSchemaDsl.g:2287:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"at.jku.bise.JsonSchemaDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2308:3: ( (lv_value_2_0= ruleValue ) )
            // InternalJsonSchemaDsl.g:2309:4: (lv_value_2_0= ruleValue )
            {
            // InternalJsonSchemaDsl.g:2309:4: (lv_value_2_0= ruleValue )
            // InternalJsonSchemaDsl.g:2310:5: lv_value_2_0= ruleValue
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
    // InternalJsonSchemaDsl.g:2331:1: entryRuleExamplesSchemaDefinition returns [EObject current=null] : iv_ruleExamplesSchemaDefinition= ruleExamplesSchemaDefinition EOF ;
    public final EObject entryRuleExamplesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamplesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2331:65: (iv_ruleExamplesSchemaDefinition= ruleExamplesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2332:2: iv_ruleExamplesSchemaDefinition= ruleExamplesSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2338:1: ruleExamplesSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' ) ;
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
            // InternalJsonSchemaDsl.g:2344:2: ( ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' ) )
            // InternalJsonSchemaDsl.g:2345:2: ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' )
            {
            // InternalJsonSchemaDsl.g:2345:2: ( () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']' )
            // InternalJsonSchemaDsl.g:2346:3: () otherlv_1= '\"examples\"' otherlv_2= ':' otherlv_3= '[' ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )? otherlv_7= ']'
            {
            // InternalJsonSchemaDsl.g:2346:3: ()
            // InternalJsonSchemaDsl.g:2347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getExamplesSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getExamplesSchemaDefinitionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:2365:3: ( ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_JSON_NUMBER && LA17_0<=RULE_INT)||LA17_0==12||LA17_0==19||(LA17_0>=62 && LA17_0<=65)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2366:4: ( (lv_examples_4_0= ruleJsonDocument ) ) (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:2366:4: ( (lv_examples_4_0= ruleJsonDocument ) )
                    // InternalJsonSchemaDsl.g:2367:5: (lv_examples_4_0= ruleJsonDocument )
                    {
                    // InternalJsonSchemaDsl.g:2367:5: (lv_examples_4_0= ruleJsonDocument )
                    // InternalJsonSchemaDsl.g:2368:6: lv_examples_4_0= ruleJsonDocument
                    {

                    						newCompositeNode(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalJsonSchemaDsl.g:2385:4: (otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:2386:5: otherlv_5= ',' ( (lv_examples_6_0= ruleJsonDocument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExamplesSchemaDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:2390:5: ( (lv_examples_6_0= ruleJsonDocument ) )
                    	    // InternalJsonSchemaDsl.g:2391:6: (lv_examples_6_0= ruleJsonDocument )
                    	    {
                    	    // InternalJsonSchemaDsl.g:2391:6: (lv_examples_6_0= ruleJsonDocument )
                    	    // InternalJsonSchemaDsl.g:2392:7: lv_examples_6_0= ruleJsonDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
    // InternalJsonSchemaDsl.g:2419:1: entryRuleIfSchemaDefinition returns [EObject current=null] : iv_ruleIfSchemaDefinition= ruleIfSchemaDefinition EOF ;
    public final EObject entryRuleIfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2419:59: (iv_ruleIfSchemaDefinition= ruleIfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2420:2: iv_ruleIfSchemaDefinition= ruleIfSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2426:1: ruleIfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) ) ;
    public final EObject ruleIfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_if_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2432:2: ( (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2433:2: (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2433:2: (otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2434:3: otherlv_0= '\"if\"' otherlv_1= ':' ( (lv_if_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfSchemaDefinitionAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2442:3: ( (lv_if_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2443:4: (lv_if_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2443:4: (lv_if_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2444:5: lv_if_2_0= ruleSchema
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
    // InternalJsonSchemaDsl.g:2465:1: entryRuleAllOfSchemaDefinition returns [EObject current=null] : iv_ruleAllOfSchemaDefinition= ruleAllOfSchemaDefinition EOF ;
    public final EObject entryRuleAllOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllOfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2465:62: (iv_ruleAllOfSchemaDefinition= ruleAllOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2466:2: iv_ruleAllOfSchemaDefinition= ruleAllOfSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2472:1: ruleAllOfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) ) ;
    public final EObject ruleAllOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_allOf_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2478:2: ( (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) ) )
            // InternalJsonSchemaDsl.g:2479:2: (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) )
            {
            // InternalJsonSchemaDsl.g:2479:2: (otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) ) )
            // InternalJsonSchemaDsl.g:2480:3: otherlv_0= '\"allOf\"' otherlv_1= ':' ( (lv_allOf_2_0= ruleSchemaArray ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAllOfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2488:3: ( (lv_allOf_2_0= ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:2489:4: (lv_allOf_2_0= ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:2489:4: (lv_allOf_2_0= ruleSchemaArray )
            // InternalJsonSchemaDsl.g:2490:5: lv_allOf_2_0= ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:2511:1: entryRuleContentEncodingSchemaDefinition returns [EObject current=null] : iv_ruleContentEncodingSchemaDefinition= ruleContentEncodingSchemaDefinition EOF ;
    public final EObject entryRuleContentEncodingSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentEncodingSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2511:72: (iv_ruleContentEncodingSchemaDefinition= ruleContentEncodingSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2512:2: iv_ruleContentEncodingSchemaDefinition= ruleContentEncodingSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2518:1: ruleContentEncodingSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) ) ;
    public final EObject ruleContentEncodingSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contentEncoding_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2524:2: ( (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2525:2: (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2525:2: (otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2526:3: otherlv_0= '\"contentEncoding\"' otherlv_1= ':' ( (lv_contentEncoding_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getContentEncodingSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2534:3: ( (lv_contentEncoding_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2535:4: (lv_contentEncoding_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2535:4: (lv_contentEncoding_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2536:5: lv_contentEncoding_2_0= ruleEString
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
    // InternalJsonSchemaDsl.g:2557:1: entryRuleMultipleOfSchemaDefinition returns [EObject current=null] : iv_ruleMultipleOfSchemaDefinition= ruleMultipleOfSchemaDefinition EOF ;
    public final EObject entryRuleMultipleOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleOfSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2557:67: (iv_ruleMultipleOfSchemaDefinition= ruleMultipleOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2558:2: iv_ruleMultipleOfSchemaDefinition= ruleMultipleOfSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2564:1: ruleMultipleOfSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleMultipleOfSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_multipleOf_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2570:2: ( (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:2571:2: (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:2571:2: (otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:2572:3: otherlv_0= '\"multipleOf\"' otherlv_1= ':' ( (lv_multipleOf_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleOfSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2580:3: ( (lv_multipleOf_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:2581:4: (lv_multipleOf_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:2581:4: (lv_multipleOf_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:2582:5: lv_multipleOf_2_0= ruleEDouble
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
    // InternalJsonSchemaDsl.g:2603:1: entryRulePatternSchemaDefinition returns [EObject current=null] : iv_rulePatternSchemaDefinition= rulePatternSchemaDefinition EOF ;
    public final EObject entryRulePatternSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2603:64: (iv_rulePatternSchemaDefinition= rulePatternSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2604:2: iv_rulePatternSchemaDefinition= rulePatternSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2610:1: rulePatternSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) ) ;
    public final EObject rulePatternSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_pattern_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2616:2: ( (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2617:2: (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2617:2: (otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2618:3: otherlv_0= '\"pattern\"' otherlv_1= ':' ( (lv_pattern_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternSchemaDefinitionAccess().getPatternKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2626:3: ( (lv_pattern_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2627:4: (lv_pattern_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2627:4: (lv_pattern_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2628:5: lv_pattern_2_0= ruleEString
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
    // InternalJsonSchemaDsl.g:2649:1: entryRuleContainsSchemaDefinition returns [EObject current=null] : iv_ruleContainsSchemaDefinition= ruleContainsSchemaDefinition EOF ;
    public final EObject entryRuleContainsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainsSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2649:65: (iv_ruleContainsSchemaDefinition= ruleContainsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2650:2: iv_ruleContainsSchemaDefinition= ruleContainsSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2656:1: ruleContainsSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) ) ;
    public final EObject ruleContainsSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_contains_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2662:2: ( (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2663:2: (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2663:2: (otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2664:3: otherlv_0= '\"contains\"' otherlv_1= ':' ( (lv_contains_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsSchemaDefinitionAccess().getContainsKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2672:3: ( (lv_contains_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2673:4: (lv_contains_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2673:4: (lv_contains_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2674:5: lv_contains_2_0= ruleSchema
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
    // InternalJsonSchemaDsl.g:2695:1: entryRuleNotSchemaDefinition returns [EObject current=null] : iv_ruleNotSchemaDefinition= ruleNotSchemaDefinition EOF ;
    public final EObject entryRuleNotSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2695:60: (iv_ruleNotSchemaDefinition= ruleNotSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2696:2: iv_ruleNotSchemaDefinition= ruleNotSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2702:1: ruleNotSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) ) ;
    public final EObject ruleNotSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_not_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2708:2: ( (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:2709:2: (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:2709:2: (otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:2710:3: otherlv_0= '\"not\"' otherlv_1= ':' ( (lv_not_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNotSchemaDefinitionAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNotSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2718:3: ( (lv_not_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:2719:4: (lv_not_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:2719:4: (lv_not_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:2720:5: lv_not_2_0= ruleSchema
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
    // InternalJsonSchemaDsl.g:2741:1: entryRuleExclusiveMaximumSchemaDefinition returns [EObject current=null] : iv_ruleExclusiveMaximumSchemaDefinition= ruleExclusiveMaximumSchemaDefinition EOF ;
    public final EObject entryRuleExclusiveMaximumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveMaximumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2741:73: (iv_ruleExclusiveMaximumSchemaDefinition= ruleExclusiveMaximumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2742:2: iv_ruleExclusiveMaximumSchemaDefinition= ruleExclusiveMaximumSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2748:1: ruleExclusiveMaximumSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleExclusiveMaximumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_exclusiveMaximum_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2754:2: ( (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:2755:2: (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:2755:2: (otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:2756:3: otherlv_0= '\"exclusiveMaximum\"' otherlv_1= ':' ( (lv_exclusiveMaximum_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2764:3: ( (lv_exclusiveMaximum_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:2765:4: (lv_exclusiveMaximum_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:2765:4: (lv_exclusiveMaximum_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:2766:5: lv_exclusiveMaximum_2_0= ruleEDouble
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
    // InternalJsonSchemaDsl.g:2787:1: entryRuleMaxLengthSchemaDefinition returns [EObject current=null] : iv_ruleMaxLengthSchemaDefinition= ruleMaxLengthSchemaDefinition EOF ;
    public final EObject entryRuleMaxLengthSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLengthSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2787:66: (iv_ruleMaxLengthSchemaDefinition= ruleMaxLengthSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2788:2: iv_ruleMaxLengthSchemaDefinition= ruleMaxLengthSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2794:1: ruleMaxLengthSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) ) ;
    public final EObject ruleMaxLengthSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_maxLength_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2800:2: ( (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) ) )
            // InternalJsonSchemaDsl.g:2801:2: (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) )
            {
            // InternalJsonSchemaDsl.g:2801:2: (otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) ) )
            // InternalJsonSchemaDsl.g:2802:3: otherlv_0= '\"maxLength\"' otherlv_1= ':' ( (lv_maxLength_2_0= ruleNonNegativeInteger ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxLengthSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2810:3: ( (lv_maxLength_2_0= ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:2811:4: (lv_maxLength_2_0= ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:2811:4: (lv_maxLength_2_0= ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:2812:5: lv_maxLength_2_0= ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:2833:1: entryRuleRefSchemaDefinition returns [EObject current=null] : iv_ruleRefSchemaDefinition= ruleRefSchemaDefinition EOF ;
    public final EObject entryRuleRefSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2833:60: (iv_ruleRefSchemaDefinition= ruleRefSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2834:2: iv_ruleRefSchemaDefinition= ruleRefSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2840:1: ruleRefSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) ) ;
    public final EObject ruleRefSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2846:2: ( (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2847:2: (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2847:2: (otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2848:3: otherlv_0= '\"$ref\"' otherlv_1= ':' ( (lv_ref_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRefSchemaDefinitionAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRefSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2856:3: ( (lv_ref_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2857:4: (lv_ref_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2857:4: (lv_ref_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2858:5: lv_ref_2_0= ruleEString
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
    // InternalJsonSchemaDsl.g:2879:1: entryRuleContentMediaTypeSchemaDefinition returns [EObject current=null] : iv_ruleContentMediaTypeSchemaDefinition= ruleContentMediaTypeSchemaDefinition EOF ;
    public final EObject entryRuleContentMediaTypeSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentMediaTypeSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2879:73: (iv_ruleContentMediaTypeSchemaDefinition= ruleContentMediaTypeSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2880:2: iv_ruleContentMediaTypeSchemaDefinition= ruleContentMediaTypeSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2886:1: ruleContentMediaTypeSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) ) ;
    public final EObject ruleContentMediaTypeSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contentMediaType_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2892:2: ( (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2893:2: (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2893:2: (otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2894:3: otherlv_0= '\"contentMediaType\"' otherlv_1= ':' ( (lv_contentMediaType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2902:3: ( (lv_contentMediaType_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2903:4: (lv_contentMediaType_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2903:4: (lv_contentMediaType_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2904:5: lv_contentMediaType_2_0= ruleEString
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
    // InternalJsonSchemaDsl.g:2925:1: entryRuleExclusiveMinimumSchemaDefinition returns [EObject current=null] : iv_ruleExclusiveMinimumSchemaDefinition= ruleExclusiveMinimumSchemaDefinition EOF ;
    public final EObject entryRuleExclusiveMinimumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveMinimumSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2925:73: (iv_ruleExclusiveMinimumSchemaDefinition= ruleExclusiveMinimumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2926:2: iv_ruleExclusiveMinimumSchemaDefinition= ruleExclusiveMinimumSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2932:1: ruleExclusiveMinimumSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) ) ;
    public final EObject ruleExclusiveMinimumSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_exclusiveMinimum_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2938:2: ( (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) ) )
            // InternalJsonSchemaDsl.g:2939:2: (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) )
            {
            // InternalJsonSchemaDsl.g:2939:2: (otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:2940:3: otherlv_0= '\"exclusiveMinimum\"' otherlv_1= ':' ( (lv_exclusiveMinimum_2_0= ruleEDouble ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2948:3: ( (lv_exclusiveMinimum_2_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:2949:4: (lv_exclusiveMinimum_2_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:2949:4: (lv_exclusiveMinimum_2_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:2950:5: lv_exclusiveMinimum_2_0= ruleEDouble
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
    // InternalJsonSchemaDsl.g:2971:1: entryRuleSchemaSchemaDefinition returns [EObject current=null] : iv_ruleSchemaSchemaDefinition= ruleSchemaSchemaDefinition EOF ;
    public final EObject entryRuleSchemaSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:2971:63: (iv_ruleSchemaSchemaDefinition= ruleSchemaSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:2972:2: iv_ruleSchemaSchemaDefinition= ruleSchemaSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:2978:1: ruleSchemaSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) ) ;
    public final EObject ruleSchemaSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_schema_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:2984:2: ( (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) ) )
            // InternalJsonSchemaDsl.g:2985:2: (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) )
            {
            // InternalJsonSchemaDsl.g:2985:2: (otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) ) )
            // InternalJsonSchemaDsl.g:2986:3: otherlv_0= '\"$schema\"' otherlv_1= ':' ( (lv_schema_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:2994:3: ( (lv_schema_2_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:2995:4: (lv_schema_2_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:2995:4: (lv_schema_2_0= ruleEString )
            // InternalJsonSchemaDsl.g:2996:5: lv_schema_2_0= ruleEString
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
    // InternalJsonSchemaDsl.g:3017:1: entryRulePropertiesSchemaDefinition returns [EObject current=null] : iv_rulePropertiesSchemaDefinition= rulePropertiesSchemaDefinition EOF ;
    public final EObject entryRulePropertiesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertiesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:3017:67: (iv_rulePropertiesSchemaDefinition= rulePropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:3018:2: iv_rulePropertiesSchemaDefinition= rulePropertiesSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:3024:1: rulePropertiesSchemaDefinition returns [EObject current=null] : ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) ;
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
            // InternalJsonSchemaDsl.g:3030:2: ( ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' ) )
            // InternalJsonSchemaDsl.g:3031:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            {
            // InternalJsonSchemaDsl.g:3031:2: ( () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}' )
            // InternalJsonSchemaDsl.g:3032:3: () otherlv_1= '\"properties\"' otherlv_2= ':' otherlv_3= '{' ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )? otherlv_7= '}'
            {
            // InternalJsonSchemaDsl.g:3032:3: ()
            // InternalJsonSchemaDsl.g:3033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesSchemaDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertiesSchemaDefinitionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJsonSchemaDsl.g:3051:3: ( ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3052:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) ) (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:3052:4: ( (lv_keySchemaPairs_4_0= ruleKeySchemaPair ) )
                    // InternalJsonSchemaDsl.g:3053:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    {
                    // InternalJsonSchemaDsl.g:3053:5: (lv_keySchemaPairs_4_0= ruleKeySchemaPair )
                    // InternalJsonSchemaDsl.g:3054:6: lv_keySchemaPairs_4_0= ruleKeySchemaPair
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

                    // InternalJsonSchemaDsl.g:3071:4: (otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:3072:5: otherlv_5= ',' ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:3076:5: ( (lv_keySchemaPairs_6_0= ruleKeySchemaPair ) )
                    	    // InternalJsonSchemaDsl.g:3077:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    {
                    	    // InternalJsonSchemaDsl.g:3077:6: (lv_keySchemaPairs_6_0= ruleKeySchemaPair )
                    	    // InternalJsonSchemaDsl.g:3078:7: lv_keySchemaPairs_6_0= ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:3105:1: entryRulePropertyNamesSchemaDefinition returns [EObject current=null] : iv_rulePropertyNamesSchemaDefinition= rulePropertyNamesSchemaDefinition EOF ;
    public final EObject entryRulePropertyNamesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyNamesSchemaDefinition = null;


        try {
            // InternalJsonSchemaDsl.g:3105:70: (iv_rulePropertyNamesSchemaDefinition= rulePropertyNamesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:3106:2: iv_rulePropertyNamesSchemaDefinition= rulePropertyNamesSchemaDefinition EOF
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
    // InternalJsonSchemaDsl.g:3112:1: rulePropertyNamesSchemaDefinition returns [EObject current=null] : (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) ) ;
    public final EObject rulePropertyNamesSchemaDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_propertyNames_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3118:2: ( (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:3119:2: (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:3119:2: (otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:3120:3: otherlv_0= '\"propertyNames\"' otherlv_1= ':' ( (lv_propertyNames_2_0= ruleSchema ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyNamesSchemaDefinitionAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3128:3: ( (lv_propertyNames_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:3129:4: (lv_propertyNames_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:3129:4: (lv_propertyNames_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:3130:5: lv_propertyNames_2_0= ruleSchema
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
    // InternalJsonSchemaDsl.g:3151:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalJsonSchemaDsl.g:3151:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalJsonSchemaDsl.g:3152:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalJsonSchemaDsl.g:3158:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_JSON_NUMBER_0= RULE_JSON_NUMBER ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_JSON_NUMBER_0=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3164:2: (this_JSON_NUMBER_0= RULE_JSON_NUMBER )
            // InternalJsonSchemaDsl.g:3165:2: this_JSON_NUMBER_0= RULE_JSON_NUMBER
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
    // InternalJsonSchemaDsl.g:3175:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalJsonSchemaDsl.g:3175:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalJsonSchemaDsl.g:3176:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalJsonSchemaDsl.g:3182:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3188:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalJsonSchemaDsl.g:3189:2: (kw= 'true' | kw= 'false' )
            {
            // InternalJsonSchemaDsl.g:3189:2: (kw= 'true' | kw= 'false' )
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
                    // InternalJsonSchemaDsl.g:3190:3: kw= 'true'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:3196:3: kw= 'false'
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
    // InternalJsonSchemaDsl.g:3205:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJsonSchemaDsl.g:3205:47: (iv_ruleEString= ruleEString EOF )
            // InternalJsonSchemaDsl.g:3206:2: iv_ruleEString= ruleEString EOF
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
    // InternalJsonSchemaDsl.g:3212:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3218:2: (this_STRING_0= RULE_STRING )
            // InternalJsonSchemaDsl.g:3219:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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
    // InternalJsonSchemaDsl.g:3229:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalJsonSchemaDsl.g:3229:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalJsonSchemaDsl.g:3230:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalJsonSchemaDsl.g:3236:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3242:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalJsonSchemaDsl.g:3243:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalJsonSchemaDsl.g:3243:2: ( (lv_value_0_0= ruleValue ) )
            // InternalJsonSchemaDsl.g:3244:3: (lv_value_0_0= ruleValue )
            {
            // InternalJsonSchemaDsl.g:3244:3: (lv_value_0_0= ruleValue )
            // InternalJsonSchemaDsl.g:3245:4: lv_value_0_0= ruleValue
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
    // InternalJsonSchemaDsl.g:3265:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalJsonSchemaDsl.g:3265:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalJsonSchemaDsl.g:3266:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalJsonSchemaDsl.g:3272:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3278:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalJsonSchemaDsl.g:3279:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalJsonSchemaDsl.g:3279:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalJsonSchemaDsl.g:3280:3: (lv_value_0_0= ruleEInt )
            {
            // InternalJsonSchemaDsl.g:3280:3: (lv_value_0_0= ruleEInt )
            // InternalJsonSchemaDsl.g:3281:4: lv_value_0_0= ruleEInt
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
    // InternalJsonSchemaDsl.g:3301:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalJsonSchemaDsl.g:3301:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalJsonSchemaDsl.g:3302:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalJsonSchemaDsl.g:3308:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3314:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalJsonSchemaDsl.g:3315:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalJsonSchemaDsl.g:3315:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:3316:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:3316:3: (lv_value_0_0= ruleEBoolean )
            // InternalJsonSchemaDsl.g:3317:4: lv_value_0_0= ruleEBoolean
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
    // InternalJsonSchemaDsl.g:3337:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalJsonSchemaDsl.g:3337:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalJsonSchemaDsl.g:3338:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalJsonSchemaDsl.g:3344:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3350:2: ( ( () otherlv_1= 'null' ) )
            // InternalJsonSchemaDsl.g:3351:2: ( () otherlv_1= 'null' )
            {
            // InternalJsonSchemaDsl.g:3351:2: ( () otherlv_1= 'null' )
            // InternalJsonSchemaDsl.g:3352:3: () otherlv_1= 'null'
            {
            // InternalJsonSchemaDsl.g:3352:3: ()
            // InternalJsonSchemaDsl.g:3353:4: 
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
    // InternalJsonSchemaDsl.g:3367:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJsonSchemaDsl.g:3367:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJsonSchemaDsl.g:3368:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalJsonSchemaDsl.g:3374:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3380:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJsonSchemaDsl.g:3381:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJsonSchemaDsl.g:3381:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJsonSchemaDsl.g:3382:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJsonSchemaDsl.g:3382:3: (lv_value_0_0= RULE_STRING )
            // InternalJsonSchemaDsl.g:3383:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"at.jku.bise.JsonSchemaDsl.STRING");
            			

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
    // InternalJsonSchemaDsl.g:3402:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalJsonSchemaDsl.g:3402:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalJsonSchemaDsl.g:3403:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalJsonSchemaDsl.g:3409:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3415:2: ( ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' ) )
            // InternalJsonSchemaDsl.g:3416:2: ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // InternalJsonSchemaDsl.g:3416:2: ( () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}' )
            // InternalJsonSchemaDsl.g:3417:3: () otherlv_1= '{' ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= '}'
            {
            // InternalJsonSchemaDsl.g:3417:3: ()
            // InternalJsonSchemaDsl.g:3418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3428:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3429:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:3429:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalJsonSchemaDsl.g:3430:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalJsonSchemaDsl.g:3430:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalJsonSchemaDsl.g:3431:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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

                    // InternalJsonSchemaDsl.g:3448:4: (otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:3449:5: otherlv_3= ',' ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:3453:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalJsonSchemaDsl.g:3454:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalJsonSchemaDsl.g:3454:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalJsonSchemaDsl.g:3455:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
    // InternalJsonSchemaDsl.g:3482:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalJsonSchemaDsl.g:3482:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalJsonSchemaDsl.g:3483:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalJsonSchemaDsl.g:3489:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3495:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalJsonSchemaDsl.g:3496:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalJsonSchemaDsl.g:3496:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalJsonSchemaDsl.g:3497:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:3497:3: (lv_value_0_0= ruleEDouble )
            // InternalJsonSchemaDsl.g:3498:4: lv_value_0_0= ruleEDouble
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
    // InternalJsonSchemaDsl.g:3518:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalJsonSchemaDsl.g:3518:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalJsonSchemaDsl.g:3519:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalJsonSchemaDsl.g:3525:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3531:2: ( ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonSchemaDsl.g:3532:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonSchemaDsl.g:3532:2: ( () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']' )
            // InternalJsonSchemaDsl.g:3533:3: () otherlv_1= '[' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonSchemaDsl.g:3533:3: ()
            // InternalJsonSchemaDsl.g:3534:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3544:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_JSON_NUMBER && LA24_0<=RULE_INT)||LA24_0==12||LA24_0==19||(LA24_0>=62 && LA24_0<=65)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3545:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:3545:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalJsonSchemaDsl.g:3546:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalJsonSchemaDsl.g:3546:5: (lv_value_2_0= ruleValue )
                    // InternalJsonSchemaDsl.g:3547:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalJsonSchemaDsl.g:3564:4: (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:3565:5: otherlv_3= ',' ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:3569:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalJsonSchemaDsl.g:3570:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalJsonSchemaDsl.g:3570:6: (lv_value_4_0= ruleValue )
                    	    // InternalJsonSchemaDsl.g:3571:7: lv_value_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
    // InternalJsonSchemaDsl.g:3598:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJsonSchemaDsl.g:3598:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJsonSchemaDsl.g:3599:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJsonSchemaDsl.g:3605:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3611:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJsonSchemaDsl.g:3612:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJsonSchemaDsl.g:3612:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJsonSchemaDsl.g:3613:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJsonSchemaDsl.g:3613:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3614:4: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_19); 

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
    // InternalJsonSchemaDsl.g:3631:1: entryRuleSchemaArray returns [EObject current=null] : iv_ruleSchemaArray= ruleSchemaArray EOF ;
    public final EObject entryRuleSchemaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaArray = null;


        try {
            // InternalJsonSchemaDsl.g:3631:52: (iv_ruleSchemaArray= ruleSchemaArray EOF )
            // InternalJsonSchemaDsl.g:3632:2: iv_ruleSchemaArray= ruleSchemaArray EOF
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
    // InternalJsonSchemaDsl.g:3638:1: ruleSchemaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSchemaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3644:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' ) )
            // InternalJsonSchemaDsl.g:3645:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' )
            {
            // InternalJsonSchemaDsl.g:3645:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']' )
            // InternalJsonSchemaDsl.g:3646:3: otherlv_0= '[' ( (lv_items_1_0= ruleSchema ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonSchemaDsl.g:3650:3: ( (lv_items_1_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:3651:4: (lv_items_1_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:3651:4: (lv_items_1_0= ruleSchema )
            // InternalJsonSchemaDsl.g:3652:5: lv_items_1_0= ruleSchema
            {

            					newCompositeNode(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalJsonSchemaDsl.g:3669:3: (otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3670:4: otherlv_2= ',' ( (lv_items_3_0= ruleSchema ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSchemaArrayAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonSchemaDsl.g:3674:4: ( (lv_items_3_0= ruleSchema ) )
            	    // InternalJsonSchemaDsl.g:3675:5: (lv_items_3_0= ruleSchema )
            	    {
            	    // InternalJsonSchemaDsl.g:3675:5: (lv_items_3_0= ruleSchema )
            	    // InternalJsonSchemaDsl.g:3676:6: lv_items_3_0= ruleSchema
            	    {

            	    						newCompositeNode(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalJsonSchemaDsl.g:3702:1: entryRuleNonNegativeIntegerDefault0 returns [EObject current=null] : iv_ruleNonNegativeIntegerDefault0= ruleNonNegativeIntegerDefault0 EOF ;
    public final EObject entryRuleNonNegativeIntegerDefault0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonNegativeIntegerDefault0 = null;


        try {
            // InternalJsonSchemaDsl.g:3702:67: (iv_ruleNonNegativeIntegerDefault0= ruleNonNegativeIntegerDefault0 EOF )
            // InternalJsonSchemaDsl.g:3703:2: iv_ruleNonNegativeIntegerDefault0= ruleNonNegativeIntegerDefault0 EOF
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
    // InternalJsonSchemaDsl.g:3709:1: ruleNonNegativeIntegerDefault0 returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNonNegativeIntegerDefault0() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3715:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalJsonSchemaDsl.g:3716:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalJsonSchemaDsl.g:3716:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalJsonSchemaDsl.g:3717:3: (lv_value_0_0= ruleEInt )
            {
            // InternalJsonSchemaDsl.g:3717:3: (lv_value_0_0= ruleEInt )
            // InternalJsonSchemaDsl.g:3718:4: lv_value_0_0= ruleEInt
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
    // InternalJsonSchemaDsl.g:3738:1: entryRuleKeySchemaPair returns [EObject current=null] : iv_ruleKeySchemaPair= ruleKeySchemaPair EOF ;
    public final EObject entryRuleKeySchemaPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeySchemaPair = null;


        try {
            // InternalJsonSchemaDsl.g:3738:54: (iv_ruleKeySchemaPair= ruleKeySchemaPair EOF )
            // InternalJsonSchemaDsl.g:3739:2: iv_ruleKeySchemaPair= ruleKeySchemaPair EOF
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
    // InternalJsonSchemaDsl.g:3745:1: ruleKeySchemaPair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) ) ;
    public final EObject ruleKeySchemaPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3751:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) ) )
            // InternalJsonSchemaDsl.g:3752:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) )
            {
            // InternalJsonSchemaDsl.g:3752:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) ) )
            // InternalJsonSchemaDsl.g:3753:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSchema ) )
            {
            // InternalJsonSchemaDsl.g:3753:3: ( (lv_key_0_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:3754:4: (lv_key_0_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:3754:4: (lv_key_0_0= ruleEString )
            // InternalJsonSchemaDsl.g:3755:5: lv_key_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getKeySchemaPairAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:3776:3: ( (lv_value_2_0= ruleSchema ) )
            // InternalJsonSchemaDsl.g:3777:4: (lv_value_2_0= ruleSchema )
            {
            // InternalJsonSchemaDsl.g:3777:4: (lv_value_2_0= ruleSchema )
            // InternalJsonSchemaDsl.g:3778:5: lv_value_2_0= ruleSchema
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
    // InternalJsonSchemaDsl.g:3799:1: entryRuleNonNegativeInteger returns [EObject current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final EObject entryRuleNonNegativeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonNegativeInteger = null;


        try {
            // InternalJsonSchemaDsl.g:3799:59: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalJsonSchemaDsl.g:3800:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
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
    // InternalJsonSchemaDsl.g:3806:1: ruleNonNegativeInteger returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNonNegativeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3812:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalJsonSchemaDsl.g:3813:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalJsonSchemaDsl.g:3813:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalJsonSchemaDsl.g:3814:3: (lv_value_0_0= ruleEInt )
            {
            // InternalJsonSchemaDsl.g:3814:3: (lv_value_0_0= ruleEInt )
            // InternalJsonSchemaDsl.g:3815:4: lv_value_0_0= ruleEInt
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
    // InternalJsonSchemaDsl.g:3835:1: entryRuleTypesAnyOf2 returns [EObject current=null] : iv_ruleTypesAnyOf2= ruleTypesAnyOf2 EOF ;
    public final EObject entryRuleTypesAnyOf2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypesAnyOf2 = null;


        try {
            // InternalJsonSchemaDsl.g:3835:52: (iv_ruleTypesAnyOf2= ruleTypesAnyOf2 EOF )
            // InternalJsonSchemaDsl.g:3836:2: iv_ruleTypesAnyOf2= ruleTypesAnyOf2 EOF
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
    // InternalJsonSchemaDsl.g:3842:1: ruleTypesAnyOf2 returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTypesAnyOf2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_items_1_0 = null;

        Enumerator lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3848:2: ( (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' ) )
            // InternalJsonSchemaDsl.g:3849:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' )
            {
            // InternalJsonSchemaDsl.g:3849:2: (otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']' )
            // InternalJsonSchemaDsl.g:3850:3: otherlv_0= '[' ( (lv_items_1_0= ruleSimpleTypes ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTypesAnyOf2Access().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonSchemaDsl.g:3854:3: ( (lv_items_1_0= ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:3855:4: (lv_items_1_0= ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:3855:4: (lv_items_1_0= ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:3856:5: lv_items_1_0= ruleSimpleTypes
            {

            					newCompositeNode(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalJsonSchemaDsl.g:3873:3: (otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3874:4: otherlv_2= ',' ( (lv_items_3_0= ruleSimpleTypes ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTypesAnyOf2Access().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonSchemaDsl.g:3878:4: ( (lv_items_3_0= ruleSimpleTypes ) )
            	    // InternalJsonSchemaDsl.g:3879:5: (lv_items_3_0= ruleSimpleTypes )
            	    {
            	    // InternalJsonSchemaDsl.g:3879:5: (lv_items_3_0= ruleSimpleTypes )
            	    // InternalJsonSchemaDsl.g:3880:6: lv_items_3_0= ruleSimpleTypes
            	    {

            	    						newCompositeNode(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalJsonSchemaDsl.g:3906:1: entryRuleDependenciesAnyOf returns [EObject current=null] : iv_ruleDependenciesAnyOf= ruleDependenciesAnyOf EOF ;
    public final EObject entryRuleDependenciesAnyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependenciesAnyOf = null;


        try {
            // InternalJsonSchemaDsl.g:3906:58: (iv_ruleDependenciesAnyOf= ruleDependenciesAnyOf EOF )
            // InternalJsonSchemaDsl.g:3907:2: iv_ruleDependenciesAnyOf= ruleDependenciesAnyOf EOF
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
    // InternalJsonSchemaDsl.g:3913:1: ruleDependenciesAnyOf returns [EObject current=null] : ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? ) ;
    public final EObject ruleDependenciesAnyOf() throws RecognitionException {
        EObject current = null;

        EObject lv_dependenciesAnyOf2_1_0 = null;

        EObject lv_dependenciesAnyOf1_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3919:2: ( ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? ) )
            // InternalJsonSchemaDsl.g:3920:2: ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? )
            {
            // InternalJsonSchemaDsl.g:3920:2: ( () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )? )
            // InternalJsonSchemaDsl.g:3921:3: () ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )? ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )?
            {
            // InternalJsonSchemaDsl.g:3921:3: ()
            // InternalJsonSchemaDsl.g:3922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOfAction_0(),
            					current);
            			

            }

            // InternalJsonSchemaDsl.g:3928:3: ( (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==16) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==19) ) {
                        alt28=1;
                    }
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3929:4: (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair )
                    {
                    // InternalJsonSchemaDsl.g:3929:4: (lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair )
                    // InternalJsonSchemaDsl.g:3930:5: lv_dependenciesAnyOf2_1_0= ruleKeyStringArrayPair
                    {

                    					newCompositeNode(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2KeyStringArrayPairParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_21);
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

            // InternalJsonSchemaDsl.g:3947:3: ( (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3948:4: (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair )
                    {
                    // InternalJsonSchemaDsl.g:3948:4: (lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair )
                    // InternalJsonSchemaDsl.g:3949:5: lv_dependenciesAnyOf1_2_0= ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:3970:1: entryRuleKeyStringArrayPair returns [EObject current=null] : iv_ruleKeyStringArrayPair= ruleKeyStringArrayPair EOF ;
    public final EObject entryRuleKeyStringArrayPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringArrayPair = null;


        try {
            // InternalJsonSchemaDsl.g:3970:59: (iv_ruleKeyStringArrayPair= ruleKeyStringArrayPair EOF )
            // InternalJsonSchemaDsl.g:3971:2: iv_ruleKeyStringArrayPair= ruleKeyStringArrayPair EOF
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
    // InternalJsonSchemaDsl.g:3977:1: ruleKeyStringArrayPair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) ) ;
    public final EObject ruleKeyStringArrayPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:3983:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) ) )
            // InternalJsonSchemaDsl.g:3984:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) )
            {
            // InternalJsonSchemaDsl.g:3984:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) ) )
            // InternalJsonSchemaDsl.g:3985:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_value_2_0= ruleStringArray ) )
            {
            // InternalJsonSchemaDsl.g:3985:3: ( (lv_key_0_0= ruleEString ) )
            // InternalJsonSchemaDsl.g:3986:4: (lv_key_0_0= ruleEString )
            {
            // InternalJsonSchemaDsl.g:3986:4: (lv_key_0_0= ruleEString )
            // InternalJsonSchemaDsl.g:3987:5: lv_key_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyStringArrayPairAccess().getColonKeyword_1());
            		
            // InternalJsonSchemaDsl.g:4008:3: ( (lv_value_2_0= ruleStringArray ) )
            // InternalJsonSchemaDsl.g:4009:4: (lv_value_2_0= ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:4009:4: (lv_value_2_0= ruleStringArray )
            // InternalJsonSchemaDsl.g:4010:5: lv_value_2_0= ruleStringArray
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
    // InternalJsonSchemaDsl.g:4031:1: entryRuleStringArray returns [EObject current=null] : iv_ruleStringArray= ruleStringArray EOF ;
    public final EObject entryRuleStringArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArray = null;


        try {
            // InternalJsonSchemaDsl.g:4031:52: (iv_ruleStringArray= ruleStringArray EOF )
            // InternalJsonSchemaDsl.g:4032:2: iv_ruleStringArray= ruleStringArray EOF
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
    // InternalJsonSchemaDsl.g:4038:1: ruleStringArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleStringArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonSchemaDsl.g:4044:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonSchemaDsl.g:4045:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonSchemaDsl.g:4045:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']' )
            // InternalJsonSchemaDsl.g:4046:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonSchemaDsl.g:4046:3: ()
            // InternalJsonSchemaDsl.g:4047:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJsonSchemaDsl.g:4057:3: ( ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4058:4: ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
                    {
                    // InternalJsonSchemaDsl.g:4058:4: ( (lv_values_2_0= ruleEString ) )
                    // InternalJsonSchemaDsl.g:4059:5: (lv_values_2_0= ruleEString )
                    {
                    // InternalJsonSchemaDsl.g:4059:5: (lv_values_2_0= ruleEString )
                    // InternalJsonSchemaDsl.g:4060:6: lv_values_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalJsonSchemaDsl.g:4077:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==13) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalJsonSchemaDsl.g:4078:5: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStringArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonSchemaDsl.g:4082:5: ( (lv_values_4_0= ruleEString ) )
                    	    // InternalJsonSchemaDsl.g:4083:6: (lv_values_4_0= ruleEString )
                    	    {
                    	    // InternalJsonSchemaDsl.g:4083:6: (lv_values_4_0= ruleEString )
                    	    // InternalJsonSchemaDsl.g:4084:7: lv_values_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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


    // $ANTLR start "ruleSimpleTypes"
    // InternalJsonSchemaDsl.g:4111:1: ruleSimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) ) ;
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
            // InternalJsonSchemaDsl.g:4117:2: ( ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) ) )
            // InternalJsonSchemaDsl.g:4118:2: ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) )
            {
            // InternalJsonSchemaDsl.g:4118:2: ( (enumLiteral_0= '\"array\"' ) | (enumLiteral_1= '\"boolean\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"null\"' ) | (enumLiteral_4= '\"number\"' ) | (enumLiteral_5= '\"object\"' ) | (enumLiteral_6= '\"string\"' ) )
            int alt32=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt32=1;
                }
                break;
            case 67:
                {
                alt32=2;
                }
                break;
            case 68:
                {
                alt32=3;
                }
                break;
            case 69:
                {
                alt32=4;
                }
                break;
            case 70:
                {
                alt32=5;
                }
                break;
            case 71:
                {
                alt32=6;
                }
                break;
            case 72:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4119:3: (enumLiteral_0= '\"array\"' )
                    {
                    // InternalJsonSchemaDsl.g:4119:3: (enumLiteral_0= '\"array\"' )
                    // InternalJsonSchemaDsl.g:4120:4: enumLiteral_0= '\"array\"'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:4127:3: (enumLiteral_1= '\"boolean\"' )
                    {
                    // InternalJsonSchemaDsl.g:4127:3: (enumLiteral_1= '\"boolean\"' )
                    // InternalJsonSchemaDsl.g:4128:4: enumLiteral_1= '\"boolean\"'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:4135:3: (enumLiteral_2= '\"integer\"' )
                    {
                    // InternalJsonSchemaDsl.g:4135:3: (enumLiteral_2= '\"integer\"' )
                    // InternalJsonSchemaDsl.g:4136:4: enumLiteral_2= '\"integer\"'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:4143:3: (enumLiteral_3= '\"null\"' )
                    {
                    // InternalJsonSchemaDsl.g:4143:3: (enumLiteral_3= '\"null\"' )
                    // InternalJsonSchemaDsl.g:4144:4: enumLiteral_3= '\"null\"'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:4151:3: (enumLiteral_4= '\"number\"' )
                    {
                    // InternalJsonSchemaDsl.g:4151:3: (enumLiteral_4= '\"number\"' )
                    // InternalJsonSchemaDsl.g:4152:4: enumLiteral_4= '\"number\"'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:4159:3: (enumLiteral_5= '\"object\"' )
                    {
                    // InternalJsonSchemaDsl.g:4159:3: (enumLiteral_5= '\"object\"' )
                    // InternalJsonSchemaDsl.g:4160:4: enumLiteral_5= '\"object\"'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:4167:3: (enumLiteral_6= '\"string\"' )
                    {
                    // InternalJsonSchemaDsl.g:4167:3: (enumLiteral_6= '\"string\"' )
                    // InternalJsonSchemaDsl.g:4168:4: enumLiteral_6= '\"string\"'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3FFFFFFFFFEEC020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x3FFFFFFFFFEE8020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xC000000000081070L,0x0000000000000003L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xC000000000081002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xC000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L,0x00000000000001FCL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xC000000000181070L,0x0000000000000003L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FCL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x3FFFFFFFFFEE8022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x3FFFFFFFFFFE8020L});

}