package at.jku.bise.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.jku.bise.services.JsonSchemaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonSchemaDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSON_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"string\"'", "'{'", "'}'", "','", "'\"maximum\"'", "':'", "'\"writeOnly\"'", "'\"$comment\"'", "'['", "']'", "'\"uniqueItems\"'", "'\"anyOf\"'", "'\"title\"'", "'ItemsSchemaDefinition'", "'itemsAnyOf1'", "'itemsAnyOf2'", "'\"default\"'", "'\"then\"'", "'\"minLength\"'", "'\"definitions\"'", "'\"minItems\"'", "'\"oneOf\"'", "'\"maxProperties\"'", "'\"minimum\"'", "'\"maxItems\"'", "'\"format\"'", "'\"readOnly\"'", "'\"type\"'", "'\"additionalProperties\"'", "'\"else\"'", "'\"$id\"'", "'\"const\"'", "'\"required\"'", "'\"description\"'", "'\"minProperties\"'", "'\"patternProperties\"'", "'\"additionalItems\"'", "'\"examples\"'", "'\"if\"'", "'\"allOf\"'", "'\"contentEncoding\"'", "'\"multipleOf\"'", "'\"pattern\"'", "'\"contains\"'", "'\"not\"'", "'\"exclusiveMaximum\"'", "'\"maxLength\"'", "'\"$ref\"'", "'\"contentMediaType\"'", "'\"exclusiveMinimum\"'", "'\"$schema\"'", "'\"properties\"'", "'\"propertyNames\"'", "'null'", "'-'"
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

    	public void setGrammarAccess(JsonSchemaDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleJsonSchema"
    // InternalJsonSchemaDsl.g:53:1: entryRuleJsonSchema : ruleJsonSchema EOF ;
    public final void entryRuleJsonSchema() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:54:1: ( ruleJsonSchema EOF )
            // InternalJsonSchemaDsl.g:55:1: ruleJsonSchema EOF
            {
             before(grammarAccess.getJsonSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonSchema();

            state._fsp--;

             after(grammarAccess.getJsonSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonSchema"


    // $ANTLR start "ruleJsonSchema"
    // InternalJsonSchemaDsl.g:62:1: ruleJsonSchema : ( ( rule__JsonSchema__Group__0 ) ) ;
    public final void ruleJsonSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:66:2: ( ( ( rule__JsonSchema__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:67:2: ( ( rule__JsonSchema__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:67:2: ( ( rule__JsonSchema__Group__0 ) )
            // InternalJsonSchemaDsl.g:68:3: ( rule__JsonSchema__Group__0 )
            {
             before(grammarAccess.getJsonSchemaAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:69:3: ( rule__JsonSchema__Group__0 )
            // InternalJsonSchemaDsl.g:69:4: rule__JsonSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonSchema"


    // $ANTLR start "entryRuleSchema"
    // InternalJsonSchemaDsl.g:78:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:79:1: ( ruleSchema EOF )
            // InternalJsonSchemaDsl.g:80:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalJsonSchemaDsl.g:87:1: ruleSchema : ( ( rule__Schema__Alternatives ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:91:2: ( ( ( rule__Schema__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:92:2: ( ( rule__Schema__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:92:2: ( ( rule__Schema__Alternatives ) )
            // InternalJsonSchemaDsl.g:93:3: ( rule__Schema__Alternatives )
            {
             before(grammarAccess.getSchemaAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:94:3: ( rule__Schema__Alternatives )
            // InternalJsonSchemaDsl.g:94:4: rule__Schema__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleKeywordDefinition"
    // InternalJsonSchemaDsl.g:103:1: entryRuleKeywordDefinition : ruleKeywordDefinition EOF ;
    public final void entryRuleKeywordDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:104:1: ( ruleKeywordDefinition EOF )
            // InternalJsonSchemaDsl.g:105:1: ruleKeywordDefinition EOF
            {
             before(grammarAccess.getKeywordDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleKeywordDefinition();

            state._fsp--;

             after(grammarAccess.getKeywordDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeywordDefinition"


    // $ANTLR start "ruleKeywordDefinition"
    // InternalJsonSchemaDsl.g:112:1: ruleKeywordDefinition : ( ( rule__KeywordDefinition__Alternatives ) ) ;
    public final void ruleKeywordDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:116:2: ( ( ( rule__KeywordDefinition__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:117:2: ( ( rule__KeywordDefinition__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:117:2: ( ( rule__KeywordDefinition__Alternatives ) )
            // InternalJsonSchemaDsl.g:118:3: ( rule__KeywordDefinition__Alternatives )
            {
             before(grammarAccess.getKeywordDefinitionAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:119:3: ( rule__KeywordDefinition__Alternatives )
            // InternalJsonSchemaDsl.g:119:4: rule__KeywordDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KeywordDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeywordDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeywordDefinition"


    // $ANTLR start "entryRuleValue"
    // InternalJsonSchemaDsl.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:129:1: ( ruleValue EOF )
            // InternalJsonSchemaDsl.g:130:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJsonSchemaDsl.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalJsonSchemaDsl.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:144:3: ( rule__Value__Alternatives )
            // InternalJsonSchemaDsl.g:144:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleObjectSchema"
    // InternalJsonSchemaDsl.g:153:1: entryRuleObjectSchema : ruleObjectSchema EOF ;
    public final void entryRuleObjectSchema() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:154:1: ( ruleObjectSchema EOF )
            // InternalJsonSchemaDsl.g:155:1: ruleObjectSchema EOF
            {
             before(grammarAccess.getObjectSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectSchema();

            state._fsp--;

             after(grammarAccess.getObjectSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectSchema"


    // $ANTLR start "ruleObjectSchema"
    // InternalJsonSchemaDsl.g:162:1: ruleObjectSchema : ( ( rule__ObjectSchema__Group__0 ) ) ;
    public final void ruleObjectSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:166:2: ( ( ( rule__ObjectSchema__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:167:2: ( ( rule__ObjectSchema__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:167:2: ( ( rule__ObjectSchema__Group__0 ) )
            // InternalJsonSchemaDsl.g:168:3: ( rule__ObjectSchema__Group__0 )
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:169:3: ( rule__ObjectSchema__Group__0 )
            // InternalJsonSchemaDsl.g:169:4: rule__ObjectSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectSchema"


    // $ANTLR start "entryRuleBooleanSchema"
    // InternalJsonSchemaDsl.g:178:1: entryRuleBooleanSchema : ruleBooleanSchema EOF ;
    public final void entryRuleBooleanSchema() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:179:1: ( ruleBooleanSchema EOF )
            // InternalJsonSchemaDsl.g:180:1: ruleBooleanSchema EOF
            {
             before(grammarAccess.getBooleanSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanSchema();

            state._fsp--;

             after(grammarAccess.getBooleanSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanSchema"


    // $ANTLR start "ruleBooleanSchema"
    // InternalJsonSchemaDsl.g:187:1: ruleBooleanSchema : ( ( rule__BooleanSchema__ValueAssignment ) ) ;
    public final void ruleBooleanSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:191:2: ( ( ( rule__BooleanSchema__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:192:2: ( ( rule__BooleanSchema__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:192:2: ( ( rule__BooleanSchema__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:193:3: ( rule__BooleanSchema__ValueAssignment )
            {
             before(grammarAccess.getBooleanSchemaAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:194:3: ( rule__BooleanSchema__ValueAssignment )
            // InternalJsonSchemaDsl.g:194:4: rule__BooleanSchema__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanSchema__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanSchemaAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanSchema"


    // $ANTLR start "entryRuleMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:203:1: entryRuleMaximumSchemaDefinition : ruleMaximumSchemaDefinition EOF ;
    public final void entryRuleMaximumSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:204:1: ( ruleMaximumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:205:1: ruleMaximumSchemaDefinition EOF
            {
             before(grammarAccess.getMaximumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMaximumSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMaximumSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaximumSchemaDefinition"


    // $ANTLR start "ruleMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:212:1: ruleMaximumSchemaDefinition : ( ( rule__MaximumSchemaDefinition__Group__0 ) ) ;
    public final void ruleMaximumSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:216:2: ( ( ( rule__MaximumSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:217:2: ( ( rule__MaximumSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:217:2: ( ( rule__MaximumSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:218:3: ( rule__MaximumSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:219:3: ( rule__MaximumSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:219:4: rule__MaximumSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaximumSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaximumSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaximumSchemaDefinition"


    // $ANTLR start "entryRuleWriteOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:228:1: entryRuleWriteOnlySchemaDefinition : ruleWriteOnlySchemaDefinition EOF ;
    public final void entryRuleWriteOnlySchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:229:1: ( ruleWriteOnlySchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:230:1: ruleWriteOnlySchemaDefinition EOF
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWriteOnlySchemaDefinition();

            state._fsp--;

             after(grammarAccess.getWriteOnlySchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWriteOnlySchemaDefinition"


    // $ANTLR start "ruleWriteOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:237:1: ruleWriteOnlySchemaDefinition : ( ( rule__WriteOnlySchemaDefinition__Group__0 ) ) ;
    public final void ruleWriteOnlySchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:241:2: ( ( ( rule__WriteOnlySchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:242:2: ( ( rule__WriteOnlySchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:242:2: ( ( rule__WriteOnlySchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:243:3: ( rule__WriteOnlySchemaDefinition__Group__0 )
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:244:3: ( rule__WriteOnlySchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:244:4: rule__WriteOnlySchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WriteOnlySchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWriteOnlySchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWriteOnlySchemaDefinition"


    // $ANTLR start "entryRuleCommentSchemaDefinition"
    // InternalJsonSchemaDsl.g:253:1: entryRuleCommentSchemaDefinition : ruleCommentSchemaDefinition EOF ;
    public final void entryRuleCommentSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:254:1: ( ruleCommentSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:255:1: ruleCommentSchemaDefinition EOF
            {
             before(grammarAccess.getCommentSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getCommentSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentSchemaDefinition"


    // $ANTLR start "ruleCommentSchemaDefinition"
    // InternalJsonSchemaDsl.g:262:1: ruleCommentSchemaDefinition : ( ( rule__CommentSchemaDefinition__Group__0 ) ) ;
    public final void ruleCommentSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:266:2: ( ( ( rule__CommentSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:267:2: ( ( rule__CommentSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:267:2: ( ( rule__CommentSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:268:3: ( rule__CommentSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:269:3: ( rule__CommentSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:269:4: rule__CommentSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommentSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentSchemaDefinition"


    // $ANTLR start "entryRuleEnumSchemaDefinition"
    // InternalJsonSchemaDsl.g:278:1: entryRuleEnumSchemaDefinition : ruleEnumSchemaDefinition EOF ;
    public final void entryRuleEnumSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:279:1: ( ruleEnumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:280:1: ruleEnumSchemaDefinition EOF
            {
             before(grammarAccess.getEnumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getEnumSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumSchemaDefinition"


    // $ANTLR start "ruleEnumSchemaDefinition"
    // InternalJsonSchemaDsl.g:287:1: ruleEnumSchemaDefinition : ( ( rule__EnumSchemaDefinition__Group__0 ) ) ;
    public final void ruleEnumSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:291:2: ( ( ( rule__EnumSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:292:2: ( ( rule__EnumSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:292:2: ( ( rule__EnumSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:293:3: ( rule__EnumSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:294:3: ( rule__EnumSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:294:4: rule__EnumSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumSchemaDefinition"


    // $ANTLR start "entryRuleUniqueItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:303:1: entryRuleUniqueItemsSchemaDefinition : ruleUniqueItemsSchemaDefinition EOF ;
    public final void entryRuleUniqueItemsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:304:1: ( ruleUniqueItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:305:1: ruleUniqueItemsSchemaDefinition EOF
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleUniqueItemsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getUniqueItemsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUniqueItemsSchemaDefinition"


    // $ANTLR start "ruleUniqueItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:312:1: ruleUniqueItemsSchemaDefinition : ( ( rule__UniqueItemsSchemaDefinition__Group__0 ) ) ;
    public final void ruleUniqueItemsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:316:2: ( ( ( rule__UniqueItemsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:317:2: ( ( rule__UniqueItemsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:317:2: ( ( rule__UniqueItemsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:318:3: ( rule__UniqueItemsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:319:3: ( rule__UniqueItemsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:319:4: rule__UniqueItemsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniqueItemsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniqueItemsSchemaDefinition"


    // $ANTLR start "entryRuleAnyOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:328:1: entryRuleAnyOfSchemaDefinition : ruleAnyOfSchemaDefinition EOF ;
    public final void entryRuleAnyOfSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:329:1: ( ruleAnyOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:330:1: ruleAnyOfSchemaDefinition EOF
            {
             before(grammarAccess.getAnyOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyOfSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getAnyOfSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyOfSchemaDefinition"


    // $ANTLR start "ruleAnyOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:337:1: ruleAnyOfSchemaDefinition : ( ( rule__AnyOfSchemaDefinition__Group__0 ) ) ;
    public final void ruleAnyOfSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:341:2: ( ( ( rule__AnyOfSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:342:2: ( ( rule__AnyOfSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:342:2: ( ( rule__AnyOfSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:343:3: ( rule__AnyOfSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:344:3: ( rule__AnyOfSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:344:4: rule__AnyOfSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnyOfSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyOfSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyOfSchemaDefinition"


    // $ANTLR start "entryRuleTitleSchemaDefinition"
    // InternalJsonSchemaDsl.g:353:1: entryRuleTitleSchemaDefinition : ruleTitleSchemaDefinition EOF ;
    public final void entryRuleTitleSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:354:1: ( ruleTitleSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:355:1: ruleTitleSchemaDefinition EOF
            {
             before(grammarAccess.getTitleSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTitleSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getTitleSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitleSchemaDefinition"


    // $ANTLR start "ruleTitleSchemaDefinition"
    // InternalJsonSchemaDsl.g:362:1: ruleTitleSchemaDefinition : ( ( rule__TitleSchemaDefinition__Group__0 ) ) ;
    public final void ruleTitleSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:366:2: ( ( ( rule__TitleSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:367:2: ( ( rule__TitleSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:367:2: ( ( rule__TitleSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:368:3: ( rule__TitleSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:369:3: ( rule__TitleSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:369:4: rule__TitleSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TitleSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitleSchemaDefinition"


    // $ANTLR start "entryRuleItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:378:1: entryRuleItemsSchemaDefinition : ruleItemsSchemaDefinition EOF ;
    public final void entryRuleItemsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:379:1: ( ruleItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:380:1: ruleItemsSchemaDefinition EOF
            {
             before(grammarAccess.getItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleItemsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getItemsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemsSchemaDefinition"


    // $ANTLR start "ruleItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:387:1: ruleItemsSchemaDefinition : ( ( rule__ItemsSchemaDefinition__Group__0 ) ) ;
    public final void ruleItemsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:391:2: ( ( ( rule__ItemsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:392:2: ( ( rule__ItemsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:392:2: ( ( rule__ItemsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:393:3: ( rule__ItemsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:394:3: ( rule__ItemsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:394:4: rule__ItemsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemsSchemaDefinition"


    // $ANTLR start "entryRuleDefaultSchemaDefinition"
    // InternalJsonSchemaDsl.g:403:1: entryRuleDefaultSchemaDefinition : ruleDefaultSchemaDefinition EOF ;
    public final void entryRuleDefaultSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:404:1: ( ruleDefaultSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:405:1: ruleDefaultSchemaDefinition EOF
            {
             before(grammarAccess.getDefaultSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getDefaultSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultSchemaDefinition"


    // $ANTLR start "ruleDefaultSchemaDefinition"
    // InternalJsonSchemaDsl.g:412:1: ruleDefaultSchemaDefinition : ( ( rule__DefaultSchemaDefinition__Group__0 ) ) ;
    public final void ruleDefaultSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:416:2: ( ( ( rule__DefaultSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:417:2: ( ( rule__DefaultSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:417:2: ( ( rule__DefaultSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:418:3: ( rule__DefaultSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:419:3: ( rule__DefaultSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:419:4: rule__DefaultSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultSchemaDefinition"


    // $ANTLR start "entryRuleThenSchemaDefinition"
    // InternalJsonSchemaDsl.g:428:1: entryRuleThenSchemaDefinition : ruleThenSchemaDefinition EOF ;
    public final void entryRuleThenSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:429:1: ( ruleThenSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:430:1: ruleThenSchemaDefinition EOF
            {
             before(grammarAccess.getThenSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleThenSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getThenSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThenSchemaDefinition"


    // $ANTLR start "ruleThenSchemaDefinition"
    // InternalJsonSchemaDsl.g:437:1: ruleThenSchemaDefinition : ( ( rule__ThenSchemaDefinition__Group__0 ) ) ;
    public final void ruleThenSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:441:2: ( ( ( rule__ThenSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:442:2: ( ( rule__ThenSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:442:2: ( ( rule__ThenSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:443:3: ( rule__ThenSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:444:3: ( rule__ThenSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:444:4: rule__ThenSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThenSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThenSchemaDefinition"


    // $ANTLR start "entryRuleMinLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:453:1: entryRuleMinLengthSchemaDefinition : ruleMinLengthSchemaDefinition EOF ;
    public final void entryRuleMinLengthSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:454:1: ( ruleMinLengthSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:455:1: ruleMinLengthSchemaDefinition EOF
            {
             before(grammarAccess.getMinLengthSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMinLengthSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMinLengthSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinLengthSchemaDefinition"


    // $ANTLR start "ruleMinLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:462:1: ruleMinLengthSchemaDefinition : ( ( rule__MinLengthSchemaDefinition__Group__0 ) ) ;
    public final void ruleMinLengthSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:466:2: ( ( ( rule__MinLengthSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:467:2: ( ( rule__MinLengthSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:467:2: ( ( rule__MinLengthSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:468:3: ( rule__MinLengthSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:469:3: ( rule__MinLengthSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:469:4: rule__MinLengthSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinLengthSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinLengthSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinLengthSchemaDefinition"


    // $ANTLR start "entryRuleDefinitionsSchemaDefinition"
    // InternalJsonSchemaDsl.g:478:1: entryRuleDefinitionsSchemaDefinition : ruleDefinitionsSchemaDefinition EOF ;
    public final void entryRuleDefinitionsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:479:1: ( ruleDefinitionsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:480:1: ruleDefinitionsSchemaDefinition EOF
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinitionsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinitionsSchemaDefinition"


    // $ANTLR start "ruleDefinitionsSchemaDefinition"
    // InternalJsonSchemaDsl.g:487:1: ruleDefinitionsSchemaDefinition : ( ( rule__DefinitionsSchemaDefinition__Group__0 ) ) ;
    public final void ruleDefinitionsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:491:2: ( ( ( rule__DefinitionsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:492:2: ( ( rule__DefinitionsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:492:2: ( ( rule__DefinitionsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:493:3: ( rule__DefinitionsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:494:3: ( rule__DefinitionsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:494:4: rule__DefinitionsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinitionsSchemaDefinition"


    // $ANTLR start "entryRuleMinItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:503:1: entryRuleMinItemsSchemaDefinition : ruleMinItemsSchemaDefinition EOF ;
    public final void entryRuleMinItemsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:504:1: ( ruleMinItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:505:1: ruleMinItemsSchemaDefinition EOF
            {
             before(grammarAccess.getMinItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMinItemsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMinItemsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinItemsSchemaDefinition"


    // $ANTLR start "ruleMinItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:512:1: ruleMinItemsSchemaDefinition : ( ( rule__MinItemsSchemaDefinition__Group__0 ) ) ;
    public final void ruleMinItemsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:516:2: ( ( ( rule__MinItemsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:517:2: ( ( rule__MinItemsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:517:2: ( ( rule__MinItemsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:518:3: ( rule__MinItemsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:519:3: ( rule__MinItemsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:519:4: rule__MinItemsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinItemsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinItemsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinItemsSchemaDefinition"


    // $ANTLR start "entryRuleOneOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:528:1: entryRuleOneOfSchemaDefinition : ruleOneOfSchemaDefinition EOF ;
    public final void entryRuleOneOfSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:529:1: ( ruleOneOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:530:1: ruleOneOfSchemaDefinition EOF
            {
             before(grammarAccess.getOneOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleOneOfSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getOneOfSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOneOfSchemaDefinition"


    // $ANTLR start "ruleOneOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:537:1: ruleOneOfSchemaDefinition : ( ( rule__OneOfSchemaDefinition__Group__0 ) ) ;
    public final void ruleOneOfSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:541:2: ( ( ( rule__OneOfSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:542:2: ( ( rule__OneOfSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:542:2: ( ( rule__OneOfSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:543:3: ( rule__OneOfSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:544:3: ( rule__OneOfSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:544:4: rule__OneOfSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneOfSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneOfSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOneOfSchemaDefinition"


    // $ANTLR start "entryRuleMaxPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:553:1: entryRuleMaxPropertiesSchemaDefinition : ruleMaxPropertiesSchemaDefinition EOF ;
    public final void entryRuleMaxPropertiesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:554:1: ( ruleMaxPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:555:1: ruleMaxPropertiesSchemaDefinition EOF
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxPropertiesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMaxPropertiesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxPropertiesSchemaDefinition"


    // $ANTLR start "ruleMaxPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:562:1: ruleMaxPropertiesSchemaDefinition : ( ( rule__MaxPropertiesSchemaDefinition__Group__0 ) ) ;
    public final void ruleMaxPropertiesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:566:2: ( ( ( rule__MaxPropertiesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:567:2: ( ( rule__MaxPropertiesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:567:2: ( ( rule__MaxPropertiesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:568:3: ( rule__MaxPropertiesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:569:3: ( rule__MaxPropertiesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:569:4: rule__MaxPropertiesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxPropertiesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxPropertiesSchemaDefinition"


    // $ANTLR start "entryRuleMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:578:1: entryRuleMinimumSchemaDefinition : ruleMinimumSchemaDefinition EOF ;
    public final void entryRuleMinimumSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:579:1: ( ruleMinimumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:580:1: ruleMinimumSchemaDefinition EOF
            {
             before(grammarAccess.getMinimumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMinimumSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMinimumSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinimumSchemaDefinition"


    // $ANTLR start "ruleMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:587:1: ruleMinimumSchemaDefinition : ( ( rule__MinimumSchemaDefinition__Group__0 ) ) ;
    public final void ruleMinimumSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:591:2: ( ( ( rule__MinimumSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:592:2: ( ( rule__MinimumSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:592:2: ( ( rule__MinimumSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:593:3: ( rule__MinimumSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:594:3: ( rule__MinimumSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:594:4: rule__MinimumSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinimumSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinimumSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinimumSchemaDefinition"


    // $ANTLR start "entryRuleMaxItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:603:1: entryRuleMaxItemsSchemaDefinition : ruleMaxItemsSchemaDefinition EOF ;
    public final void entryRuleMaxItemsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:604:1: ( ruleMaxItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:605:1: ruleMaxItemsSchemaDefinition EOF
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxItemsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMaxItemsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxItemsSchemaDefinition"


    // $ANTLR start "ruleMaxItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:612:1: ruleMaxItemsSchemaDefinition : ( ( rule__MaxItemsSchemaDefinition__Group__0 ) ) ;
    public final void ruleMaxItemsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:616:2: ( ( ( rule__MaxItemsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:617:2: ( ( rule__MaxItemsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:617:2: ( ( rule__MaxItemsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:618:3: ( rule__MaxItemsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:619:3: ( rule__MaxItemsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:619:4: rule__MaxItemsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxItemsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxItemsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxItemsSchemaDefinition"


    // $ANTLR start "entryRuleFormatSchemaDefinition"
    // InternalJsonSchemaDsl.g:628:1: entryRuleFormatSchemaDefinition : ruleFormatSchemaDefinition EOF ;
    public final void entryRuleFormatSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:629:1: ( ruleFormatSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:630:1: ruleFormatSchemaDefinition EOF
            {
             before(grammarAccess.getFormatSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFormatSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getFormatSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormatSchemaDefinition"


    // $ANTLR start "ruleFormatSchemaDefinition"
    // InternalJsonSchemaDsl.g:637:1: ruleFormatSchemaDefinition : ( ( rule__FormatSchemaDefinition__Group__0 ) ) ;
    public final void ruleFormatSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:641:2: ( ( ( rule__FormatSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:642:2: ( ( rule__FormatSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:642:2: ( ( rule__FormatSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:643:3: ( rule__FormatSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:644:3: ( rule__FormatSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:644:4: rule__FormatSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormatSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormatSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatSchemaDefinition"


    // $ANTLR start "entryRuleReadOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:653:1: entryRuleReadOnlySchemaDefinition : ruleReadOnlySchemaDefinition EOF ;
    public final void entryRuleReadOnlySchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:654:1: ( ruleReadOnlySchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:655:1: ruleReadOnlySchemaDefinition EOF
            {
             before(grammarAccess.getReadOnlySchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleReadOnlySchemaDefinition();

            state._fsp--;

             after(grammarAccess.getReadOnlySchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadOnlySchemaDefinition"


    // $ANTLR start "ruleReadOnlySchemaDefinition"
    // InternalJsonSchemaDsl.g:662:1: ruleReadOnlySchemaDefinition : ( ( rule__ReadOnlySchemaDefinition__Group__0 ) ) ;
    public final void ruleReadOnlySchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:666:2: ( ( ( rule__ReadOnlySchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:667:2: ( ( rule__ReadOnlySchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:667:2: ( ( rule__ReadOnlySchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:668:3: ( rule__ReadOnlySchemaDefinition__Group__0 )
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:669:3: ( rule__ReadOnlySchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:669:4: rule__ReadOnlySchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlySchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlySchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadOnlySchemaDefinition"


    // $ANTLR start "entryRuleTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:678:1: entryRuleTypeSchemaDefinition : ruleTypeSchemaDefinition EOF ;
    public final void entryRuleTypeSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:679:1: ( ruleTypeSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:680:1: ruleTypeSchemaDefinition EOF
            {
             before(grammarAccess.getTypeSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getTypeSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeSchemaDefinition"


    // $ANTLR start "ruleTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:687:1: ruleTypeSchemaDefinition : ( ( rule__TypeSchemaDefinition__Group__0 ) ) ;
    public final void ruleTypeSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:691:2: ( ( ( rule__TypeSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:692:2: ( ( rule__TypeSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:692:2: ( ( rule__TypeSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:693:3: ( rule__TypeSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:694:3: ( rule__TypeSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:694:4: rule__TypeSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSchemaDefinition"


    // $ANTLR start "entryRuleAdditionalPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:703:1: entryRuleAdditionalPropertiesSchemaDefinition : ruleAdditionalPropertiesSchemaDefinition EOF ;
    public final void entryRuleAdditionalPropertiesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:704:1: ( ruleAdditionalPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:705:1: ruleAdditionalPropertiesSchemaDefinition EOF
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalPropertiesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getAdditionalPropertiesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionalPropertiesSchemaDefinition"


    // $ANTLR start "ruleAdditionalPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:712:1: ruleAdditionalPropertiesSchemaDefinition : ( ( rule__AdditionalPropertiesSchemaDefinition__Group__0 ) ) ;
    public final void ruleAdditionalPropertiesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:716:2: ( ( ( rule__AdditionalPropertiesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:717:2: ( ( rule__AdditionalPropertiesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:717:2: ( ( rule__AdditionalPropertiesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:718:3: ( rule__AdditionalPropertiesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:719:3: ( rule__AdditionalPropertiesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:719:4: rule__AdditionalPropertiesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalPropertiesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalPropertiesSchemaDefinition"


    // $ANTLR start "entryRuleElseSchemaDefinition"
    // InternalJsonSchemaDsl.g:728:1: entryRuleElseSchemaDefinition : ruleElseSchemaDefinition EOF ;
    public final void entryRuleElseSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:729:1: ( ruleElseSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:730:1: ruleElseSchemaDefinition EOF
            {
             before(grammarAccess.getElseSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleElseSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getElseSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElseSchemaDefinition"


    // $ANTLR start "ruleElseSchemaDefinition"
    // InternalJsonSchemaDsl.g:737:1: ruleElseSchemaDefinition : ( ( rule__ElseSchemaDefinition__Group__0 ) ) ;
    public final void ruleElseSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:741:2: ( ( ( rule__ElseSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:742:2: ( ( rule__ElseSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:742:2: ( ( rule__ElseSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:743:3: ( rule__ElseSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:744:3: ( rule__ElseSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:744:4: rule__ElseSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseSchemaDefinition"


    // $ANTLR start "entryRuleIdSchemaDefinition"
    // InternalJsonSchemaDsl.g:753:1: entryRuleIdSchemaDefinition : ruleIdSchemaDefinition EOF ;
    public final void entryRuleIdSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:754:1: ( ruleIdSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:755:1: ruleIdSchemaDefinition EOF
            {
             before(grammarAccess.getIdSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleIdSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getIdSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdSchemaDefinition"


    // $ANTLR start "ruleIdSchemaDefinition"
    // InternalJsonSchemaDsl.g:762:1: ruleIdSchemaDefinition : ( ( rule__IdSchemaDefinition__Group__0 ) ) ;
    public final void ruleIdSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:766:2: ( ( ( rule__IdSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:767:2: ( ( rule__IdSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:767:2: ( ( rule__IdSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:768:3: ( rule__IdSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:769:3: ( rule__IdSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:769:4: rule__IdSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdSchemaDefinition"


    // $ANTLR start "entryRuleConstSchemaDefinition"
    // InternalJsonSchemaDsl.g:778:1: entryRuleConstSchemaDefinition : ruleConstSchemaDefinition EOF ;
    public final void entryRuleConstSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:779:1: ( ruleConstSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:780:1: ruleConstSchemaDefinition EOF
            {
             before(grammarAccess.getConstSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleConstSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getConstSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstSchemaDefinition"


    // $ANTLR start "ruleConstSchemaDefinition"
    // InternalJsonSchemaDsl.g:787:1: ruleConstSchemaDefinition : ( ( rule__ConstSchemaDefinition__Group__0 ) ) ;
    public final void ruleConstSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:791:2: ( ( ( rule__ConstSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:792:2: ( ( rule__ConstSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:792:2: ( ( rule__ConstSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:793:3: ( rule__ConstSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:794:3: ( rule__ConstSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:794:4: rule__ConstSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstSchemaDefinition"


    // $ANTLR start "entryRuleRequiredSchemaDefinition"
    // InternalJsonSchemaDsl.g:803:1: entryRuleRequiredSchemaDefinition : ruleRequiredSchemaDefinition EOF ;
    public final void entryRuleRequiredSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:804:1: ( ruleRequiredSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:805:1: ruleRequiredSchemaDefinition EOF
            {
             before(grammarAccess.getRequiredSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getRequiredSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredSchemaDefinition"


    // $ANTLR start "ruleRequiredSchemaDefinition"
    // InternalJsonSchemaDsl.g:812:1: ruleRequiredSchemaDefinition : ( ( rule__RequiredSchemaDefinition__Group__0 ) ) ;
    public final void ruleRequiredSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:816:2: ( ( ( rule__RequiredSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:817:2: ( ( rule__RequiredSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:817:2: ( ( rule__RequiredSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:818:3: ( rule__RequiredSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:819:3: ( rule__RequiredSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:819:4: rule__RequiredSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredSchemaDefinition"


    // $ANTLR start "entryRuleDescriptionSchemaDefinition"
    // InternalJsonSchemaDsl.g:828:1: entryRuleDescriptionSchemaDefinition : ruleDescriptionSchemaDefinition EOF ;
    public final void entryRuleDescriptionSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:829:1: ( ruleDescriptionSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:830:1: ruleDescriptionSchemaDefinition EOF
            {
             before(grammarAccess.getDescriptionSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescriptionSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getDescriptionSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescriptionSchemaDefinition"


    // $ANTLR start "ruleDescriptionSchemaDefinition"
    // InternalJsonSchemaDsl.g:837:1: ruleDescriptionSchemaDefinition : ( ( rule__DescriptionSchemaDefinition__Group__0 ) ) ;
    public final void ruleDescriptionSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:841:2: ( ( ( rule__DescriptionSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:842:2: ( ( rule__DescriptionSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:842:2: ( ( rule__DescriptionSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:843:3: ( rule__DescriptionSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:844:3: ( rule__DescriptionSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:844:4: rule__DescriptionSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionSchemaDefinition"


    // $ANTLR start "entryRuleMinPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:853:1: entryRuleMinPropertiesSchemaDefinition : ruleMinPropertiesSchemaDefinition EOF ;
    public final void entryRuleMinPropertiesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:854:1: ( ruleMinPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:855:1: ruleMinPropertiesSchemaDefinition EOF
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMinPropertiesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMinPropertiesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinPropertiesSchemaDefinition"


    // $ANTLR start "ruleMinPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:862:1: ruleMinPropertiesSchemaDefinition : ( ( rule__MinPropertiesSchemaDefinition__Group__0 ) ) ;
    public final void ruleMinPropertiesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:866:2: ( ( ( rule__MinPropertiesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:867:2: ( ( rule__MinPropertiesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:867:2: ( ( rule__MinPropertiesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:868:3: ( rule__MinPropertiesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:869:3: ( rule__MinPropertiesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:869:4: rule__MinPropertiesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinPropertiesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinPropertiesSchemaDefinition"


    // $ANTLR start "entryRulePatternPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:878:1: entryRulePatternPropertiesSchemaDefinition : rulePatternPropertiesSchemaDefinition EOF ;
    public final void entryRulePatternPropertiesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:879:1: ( rulePatternPropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:880:1: rulePatternPropertiesSchemaDefinition EOF
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePatternPropertiesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getPatternPropertiesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternPropertiesSchemaDefinition"


    // $ANTLR start "rulePatternPropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:887:1: rulePatternPropertiesSchemaDefinition : ( ( rule__PatternPropertiesSchemaDefinition__Group__0 ) ) ;
    public final void rulePatternPropertiesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:891:2: ( ( ( rule__PatternPropertiesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:892:2: ( ( rule__PatternPropertiesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:892:2: ( ( rule__PatternPropertiesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:893:3: ( rule__PatternPropertiesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:894:3: ( rule__PatternPropertiesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:894:4: rule__PatternPropertiesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternPropertiesSchemaDefinition"


    // $ANTLR start "entryRuleAdditionalItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:903:1: entryRuleAdditionalItemsSchemaDefinition : ruleAdditionalItemsSchemaDefinition EOF ;
    public final void entryRuleAdditionalItemsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:904:1: ( ruleAdditionalItemsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:905:1: ruleAdditionalItemsSchemaDefinition EOF
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalItemsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getAdditionalItemsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionalItemsSchemaDefinition"


    // $ANTLR start "ruleAdditionalItemsSchemaDefinition"
    // InternalJsonSchemaDsl.g:912:1: ruleAdditionalItemsSchemaDefinition : ( ( rule__AdditionalItemsSchemaDefinition__Group__0 ) ) ;
    public final void ruleAdditionalItemsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:916:2: ( ( ( rule__AdditionalItemsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:917:2: ( ( rule__AdditionalItemsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:917:2: ( ( rule__AdditionalItemsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:918:3: ( rule__AdditionalItemsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:919:3: ( rule__AdditionalItemsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:919:4: rule__AdditionalItemsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalItemsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalItemsSchemaDefinition"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalJsonSchemaDsl.g:928:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:929:1: ( ruleKeyValuePair EOF )
            // InternalJsonSchemaDsl.g:930:1: ruleKeyValuePair EOF
            {
             before(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyValuePair();

            state._fsp--;

             after(grammarAccess.getKeyValuePairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalJsonSchemaDsl.g:937:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:941:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:942:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:942:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalJsonSchemaDsl.g:943:3: ( rule__KeyValuePair__Group__0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:944:3: ( rule__KeyValuePair__Group__0 )
            // InternalJsonSchemaDsl.g:944:4: rule__KeyValuePair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValuePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleExamplesSchemaDefinition"
    // InternalJsonSchemaDsl.g:953:1: entryRuleExamplesSchemaDefinition : ruleExamplesSchemaDefinition EOF ;
    public final void entryRuleExamplesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:954:1: ( ruleExamplesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:955:1: ruleExamplesSchemaDefinition EOF
            {
             before(grammarAccess.getExamplesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleExamplesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getExamplesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamplesSchemaDefinition"


    // $ANTLR start "ruleExamplesSchemaDefinition"
    // InternalJsonSchemaDsl.g:962:1: ruleExamplesSchemaDefinition : ( ( rule__ExamplesSchemaDefinition__Group__0 ) ) ;
    public final void ruleExamplesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:966:2: ( ( ( rule__ExamplesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:967:2: ( ( rule__ExamplesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:967:2: ( ( rule__ExamplesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:968:3: ( rule__ExamplesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:969:3: ( rule__ExamplesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:969:4: rule__ExamplesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamplesSchemaDefinition"


    // $ANTLR start "entryRuleIfSchemaDefinition"
    // InternalJsonSchemaDsl.g:978:1: entryRuleIfSchemaDefinition : ruleIfSchemaDefinition EOF ;
    public final void entryRuleIfSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:979:1: ( ruleIfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:980:1: ruleIfSchemaDefinition EOF
            {
             before(grammarAccess.getIfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleIfSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getIfSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfSchemaDefinition"


    // $ANTLR start "ruleIfSchemaDefinition"
    // InternalJsonSchemaDsl.g:987:1: ruleIfSchemaDefinition : ( ( rule__IfSchemaDefinition__Group__0 ) ) ;
    public final void ruleIfSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:991:2: ( ( ( rule__IfSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:992:2: ( ( rule__IfSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:992:2: ( ( rule__IfSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:993:3: ( rule__IfSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:994:3: ( rule__IfSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:994:4: rule__IfSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfSchemaDefinition"


    // $ANTLR start "entryRuleAllOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1003:1: entryRuleAllOfSchemaDefinition : ruleAllOfSchemaDefinition EOF ;
    public final void entryRuleAllOfSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1004:1: ( ruleAllOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1005:1: ruleAllOfSchemaDefinition EOF
            {
             before(grammarAccess.getAllOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAllOfSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getAllOfSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllOfSchemaDefinition"


    // $ANTLR start "ruleAllOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1012:1: ruleAllOfSchemaDefinition : ( ( rule__AllOfSchemaDefinition__Group__0 ) ) ;
    public final void ruleAllOfSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1016:2: ( ( ( rule__AllOfSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1017:2: ( ( rule__AllOfSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1017:2: ( ( rule__AllOfSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1018:3: ( rule__AllOfSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1019:3: ( rule__AllOfSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1019:4: rule__AllOfSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllOfSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllOfSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllOfSchemaDefinition"


    // $ANTLR start "entryRuleContentEncodingSchemaDefinition"
    // InternalJsonSchemaDsl.g:1028:1: entryRuleContentEncodingSchemaDefinition : ruleContentEncodingSchemaDefinition EOF ;
    public final void entryRuleContentEncodingSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1029:1: ( ruleContentEncodingSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1030:1: ruleContentEncodingSchemaDefinition EOF
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleContentEncodingSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getContentEncodingSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentEncodingSchemaDefinition"


    // $ANTLR start "ruleContentEncodingSchemaDefinition"
    // InternalJsonSchemaDsl.g:1037:1: ruleContentEncodingSchemaDefinition : ( ( rule__ContentEncodingSchemaDefinition__Group__0 ) ) ;
    public final void ruleContentEncodingSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1041:2: ( ( ( rule__ContentEncodingSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1042:2: ( ( rule__ContentEncodingSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1042:2: ( ( rule__ContentEncodingSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1043:3: ( rule__ContentEncodingSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1044:3: ( rule__ContentEncodingSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1044:4: rule__ContentEncodingSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentEncodingSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentEncodingSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentEncodingSchemaDefinition"


    // $ANTLR start "entryRuleMultipleOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1053:1: entryRuleMultipleOfSchemaDefinition : ruleMultipleOfSchemaDefinition EOF ;
    public final void entryRuleMultipleOfSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1054:1: ( ruleMultipleOfSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1055:1: ruleMultipleOfSchemaDefinition EOF
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleOfSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMultipleOfSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleOfSchemaDefinition"


    // $ANTLR start "ruleMultipleOfSchemaDefinition"
    // InternalJsonSchemaDsl.g:1062:1: ruleMultipleOfSchemaDefinition : ( ( rule__MultipleOfSchemaDefinition__Group__0 ) ) ;
    public final void ruleMultipleOfSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1066:2: ( ( ( rule__MultipleOfSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1067:2: ( ( rule__MultipleOfSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1067:2: ( ( rule__MultipleOfSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1068:3: ( rule__MultipleOfSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1069:3: ( rule__MultipleOfSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1069:4: rule__MultipleOfSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleOfSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleOfSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleOfSchemaDefinition"


    // $ANTLR start "entryRulePatternSchemaDefinition"
    // InternalJsonSchemaDsl.g:1078:1: entryRulePatternSchemaDefinition : rulePatternSchemaDefinition EOF ;
    public final void entryRulePatternSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1079:1: ( rulePatternSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1080:1: rulePatternSchemaDefinition EOF
            {
             before(grammarAccess.getPatternSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePatternSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getPatternSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatternSchemaDefinition"


    // $ANTLR start "rulePatternSchemaDefinition"
    // InternalJsonSchemaDsl.g:1087:1: rulePatternSchemaDefinition : ( ( rule__PatternSchemaDefinition__Group__0 ) ) ;
    public final void rulePatternSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1091:2: ( ( ( rule__PatternSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1092:2: ( ( rule__PatternSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1092:2: ( ( rule__PatternSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1093:3: ( rule__PatternSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1094:3: ( rule__PatternSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1094:4: rule__PatternSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternSchemaDefinition"


    // $ANTLR start "entryRuleContainsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1103:1: entryRuleContainsSchemaDefinition : ruleContainsSchemaDefinition EOF ;
    public final void entryRuleContainsSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1104:1: ( ruleContainsSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1105:1: ruleContainsSchemaDefinition EOF
            {
             before(grammarAccess.getContainsSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleContainsSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getContainsSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainsSchemaDefinition"


    // $ANTLR start "ruleContainsSchemaDefinition"
    // InternalJsonSchemaDsl.g:1112:1: ruleContainsSchemaDefinition : ( ( rule__ContainsSchemaDefinition__Group__0 ) ) ;
    public final void ruleContainsSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1116:2: ( ( ( rule__ContainsSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1117:2: ( ( rule__ContainsSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1117:2: ( ( rule__ContainsSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1118:3: ( rule__ContainsSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1119:3: ( rule__ContainsSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1119:4: rule__ContainsSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainsSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainsSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainsSchemaDefinition"


    // $ANTLR start "entryRuleNotSchemaDefinition"
    // InternalJsonSchemaDsl.g:1128:1: entryRuleNotSchemaDefinition : ruleNotSchemaDefinition EOF ;
    public final void entryRuleNotSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1129:1: ( ruleNotSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1130:1: ruleNotSchemaDefinition EOF
            {
             before(grammarAccess.getNotSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getNotSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotSchemaDefinition"


    // $ANTLR start "ruleNotSchemaDefinition"
    // InternalJsonSchemaDsl.g:1137:1: ruleNotSchemaDefinition : ( ( rule__NotSchemaDefinition__Group__0 ) ) ;
    public final void ruleNotSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1141:2: ( ( ( rule__NotSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1142:2: ( ( rule__NotSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1142:2: ( ( rule__NotSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1143:3: ( rule__NotSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1144:3: ( rule__NotSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1144:4: rule__NotSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotSchemaDefinition"


    // $ANTLR start "entryRuleExclusiveMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:1153:1: entryRuleExclusiveMaximumSchemaDefinition : ruleExclusiveMaximumSchemaDefinition EOF ;
    public final void entryRuleExclusiveMaximumSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1154:1: ( ruleExclusiveMaximumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1155:1: ruleExclusiveMaximumSchemaDefinition EOF
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleExclusiveMaximumSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getExclusiveMaximumSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExclusiveMaximumSchemaDefinition"


    // $ANTLR start "ruleExclusiveMaximumSchemaDefinition"
    // InternalJsonSchemaDsl.g:1162:1: ruleExclusiveMaximumSchemaDefinition : ( ( rule__ExclusiveMaximumSchemaDefinition__Group__0 ) ) ;
    public final void ruleExclusiveMaximumSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1166:2: ( ( ( rule__ExclusiveMaximumSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1167:2: ( ( rule__ExclusiveMaximumSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1167:2: ( ( rule__ExclusiveMaximumSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1168:3: ( rule__ExclusiveMaximumSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1169:3: ( rule__ExclusiveMaximumSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1169:4: rule__ExclusiveMaximumSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximumSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExclusiveMaximumSchemaDefinition"


    // $ANTLR start "entryRuleMaxLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:1178:1: entryRuleMaxLengthSchemaDefinition : ruleMaxLengthSchemaDefinition EOF ;
    public final void entryRuleMaxLengthSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1179:1: ( ruleMaxLengthSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1180:1: ruleMaxLengthSchemaDefinition EOF
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxLengthSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getMaxLengthSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxLengthSchemaDefinition"


    // $ANTLR start "ruleMaxLengthSchemaDefinition"
    // InternalJsonSchemaDsl.g:1187:1: ruleMaxLengthSchemaDefinition : ( ( rule__MaxLengthSchemaDefinition__Group__0 ) ) ;
    public final void ruleMaxLengthSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1191:2: ( ( ( rule__MaxLengthSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1192:2: ( ( rule__MaxLengthSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1192:2: ( ( rule__MaxLengthSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1193:3: ( rule__MaxLengthSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1194:3: ( rule__MaxLengthSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1194:4: rule__MaxLengthSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxLengthSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxLengthSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxLengthSchemaDefinition"


    // $ANTLR start "entryRuleRefSchemaDefinition"
    // InternalJsonSchemaDsl.g:1203:1: entryRuleRefSchemaDefinition : ruleRefSchemaDefinition EOF ;
    public final void entryRuleRefSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1204:1: ( ruleRefSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1205:1: ruleRefSchemaDefinition EOF
            {
             before(grammarAccess.getRefSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRefSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getRefSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefSchemaDefinition"


    // $ANTLR start "ruleRefSchemaDefinition"
    // InternalJsonSchemaDsl.g:1212:1: ruleRefSchemaDefinition : ( ( rule__RefSchemaDefinition__Group__0 ) ) ;
    public final void ruleRefSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1216:2: ( ( ( rule__RefSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1217:2: ( ( rule__RefSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1217:2: ( ( rule__RefSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1218:3: ( rule__RefSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1219:3: ( rule__RefSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1219:4: rule__RefSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefSchemaDefinition"


    // $ANTLR start "entryRuleContentMediaTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:1228:1: entryRuleContentMediaTypeSchemaDefinition : ruleContentMediaTypeSchemaDefinition EOF ;
    public final void entryRuleContentMediaTypeSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1229:1: ( ruleContentMediaTypeSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1230:1: ruleContentMediaTypeSchemaDefinition EOF
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleContentMediaTypeSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getContentMediaTypeSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContentMediaTypeSchemaDefinition"


    // $ANTLR start "ruleContentMediaTypeSchemaDefinition"
    // InternalJsonSchemaDsl.g:1237:1: ruleContentMediaTypeSchemaDefinition : ( ( rule__ContentMediaTypeSchemaDefinition__Group__0 ) ) ;
    public final void ruleContentMediaTypeSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1241:2: ( ( ( rule__ContentMediaTypeSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1242:2: ( ( rule__ContentMediaTypeSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1242:2: ( ( rule__ContentMediaTypeSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1243:3: ( rule__ContentMediaTypeSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1244:3: ( rule__ContentMediaTypeSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1244:4: rule__ContentMediaTypeSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentMediaTypeSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentMediaTypeSchemaDefinition"


    // $ANTLR start "entryRuleExclusiveMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:1253:1: entryRuleExclusiveMinimumSchemaDefinition : ruleExclusiveMinimumSchemaDefinition EOF ;
    public final void entryRuleExclusiveMinimumSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1254:1: ( ruleExclusiveMinimumSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1255:1: ruleExclusiveMinimumSchemaDefinition EOF
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleExclusiveMinimumSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getExclusiveMinimumSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExclusiveMinimumSchemaDefinition"


    // $ANTLR start "ruleExclusiveMinimumSchemaDefinition"
    // InternalJsonSchemaDsl.g:1262:1: ruleExclusiveMinimumSchemaDefinition : ( ( rule__ExclusiveMinimumSchemaDefinition__Group__0 ) ) ;
    public final void ruleExclusiveMinimumSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1266:2: ( ( ( rule__ExclusiveMinimumSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1267:2: ( ( rule__ExclusiveMinimumSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1267:2: ( ( rule__ExclusiveMinimumSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1268:3: ( rule__ExclusiveMinimumSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1269:3: ( rule__ExclusiveMinimumSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1269:4: rule__ExclusiveMinimumSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimumSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExclusiveMinimumSchemaDefinition"


    // $ANTLR start "entryRuleSchemaSchemaDefinition"
    // InternalJsonSchemaDsl.g:1278:1: entryRuleSchemaSchemaDefinition : ruleSchemaSchemaDefinition EOF ;
    public final void entryRuleSchemaSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1279:1: ( ruleSchemaSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1280:1: ruleSchemaSchemaDefinition EOF
            {
             before(grammarAccess.getSchemaSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSchemaSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getSchemaSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemaSchemaDefinition"


    // $ANTLR start "ruleSchemaSchemaDefinition"
    // InternalJsonSchemaDsl.g:1287:1: ruleSchemaSchemaDefinition : ( ( rule__SchemaSchemaDefinition__Group__0 ) ) ;
    public final void ruleSchemaSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1291:2: ( ( ( rule__SchemaSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1292:2: ( ( rule__SchemaSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1292:2: ( ( rule__SchemaSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1293:3: ( rule__SchemaSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1294:3: ( rule__SchemaSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1294:4: rule__SchemaSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SchemaSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaSchemaDefinition"


    // $ANTLR start "entryRulePropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1303:1: entryRulePropertiesSchemaDefinition : rulePropertiesSchemaDefinition EOF ;
    public final void entryRulePropertiesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1304:1: ( rulePropertiesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1305:1: rulePropertiesSchemaDefinition EOF
            {
             before(grammarAccess.getPropertiesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertiesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getPropertiesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertiesSchemaDefinition"


    // $ANTLR start "rulePropertiesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1312:1: rulePropertiesSchemaDefinition : ( ( rule__PropertiesSchemaDefinition__Group__0 ) ) ;
    public final void rulePropertiesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1316:2: ( ( ( rule__PropertiesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1317:2: ( ( rule__PropertiesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1317:2: ( ( rule__PropertiesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1318:3: ( rule__PropertiesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1319:3: ( rule__PropertiesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1319:4: rule__PropertiesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertiesSchemaDefinition"


    // $ANTLR start "entryRulePropertyNamesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1328:1: entryRulePropertyNamesSchemaDefinition : rulePropertyNamesSchemaDefinition EOF ;
    public final void entryRulePropertyNamesSchemaDefinition() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1329:1: ( rulePropertyNamesSchemaDefinition EOF )
            // InternalJsonSchemaDsl.g:1330:1: rulePropertyNamesSchemaDefinition EOF
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyNamesSchemaDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyNamesSchemaDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyNamesSchemaDefinition"


    // $ANTLR start "rulePropertyNamesSchemaDefinition"
    // InternalJsonSchemaDsl.g:1337:1: rulePropertyNamesSchemaDefinition : ( ( rule__PropertyNamesSchemaDefinition__Group__0 ) ) ;
    public final void rulePropertyNamesSchemaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1341:2: ( ( ( rule__PropertyNamesSchemaDefinition__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1342:2: ( ( rule__PropertyNamesSchemaDefinition__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1342:2: ( ( rule__PropertyNamesSchemaDefinition__Group__0 ) )
            // InternalJsonSchemaDsl.g:1343:3: ( rule__PropertyNamesSchemaDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1344:3: ( rule__PropertyNamesSchemaDefinition__Group__0 )
            // InternalJsonSchemaDsl.g:1344:4: rule__PropertyNamesSchemaDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyNamesSchemaDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyNamesSchemaDefinition"


    // $ANTLR start "entryRuleEDouble"
    // InternalJsonSchemaDsl.g:1353:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1354:1: ( ruleEDouble EOF )
            // InternalJsonSchemaDsl.g:1355:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalJsonSchemaDsl.g:1362:1: ruleEDouble : ( RULE_JSON_NUMBER ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1366:2: ( ( RULE_JSON_NUMBER ) )
            // InternalJsonSchemaDsl.g:1367:2: ( RULE_JSON_NUMBER )
            {
            // InternalJsonSchemaDsl.g:1367:2: ( RULE_JSON_NUMBER )
            // InternalJsonSchemaDsl.g:1368:3: RULE_JSON_NUMBER
            {
             before(grammarAccess.getEDoubleAccess().getJSON_NUMBERTerminalRuleCall()); 
            match(input,RULE_JSON_NUMBER,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getJSON_NUMBERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEBoolean"
    // InternalJsonSchemaDsl.g:1378:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1379:1: ( ruleEBoolean EOF )
            // InternalJsonSchemaDsl.g:1380:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalJsonSchemaDsl.g:1387:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1391:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:1392:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:1392:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalJsonSchemaDsl.g:1393:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:1394:3: ( rule__EBoolean__Alternatives )
            // InternalJsonSchemaDsl.g:1394:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalJsonSchemaDsl.g:1403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1404:1: ( ruleEString EOF )
            // InternalJsonSchemaDsl.g:1405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJsonSchemaDsl.g:1412:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1416:2: ( ( RULE_STRING ) )
            // InternalJsonSchemaDsl.g:1417:2: ( RULE_STRING )
            {
            // InternalJsonSchemaDsl.g:1417:2: ( RULE_STRING )
            // InternalJsonSchemaDsl.g:1418:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalJsonSchemaDsl.g:1428:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1429:1: ( ruleJsonDocument EOF )
            // InternalJsonSchemaDsl.g:1430:1: ruleJsonDocument EOF
            {
             before(grammarAccess.getJsonDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getJsonDocumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonDocument"


    // $ANTLR start "ruleJsonDocument"
    // InternalJsonSchemaDsl.g:1437:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1441:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1442:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1442:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1443:3: ( rule__JsonDocument__ValueAssignment )
            {
             before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1444:3: ( rule__JsonDocument__ValueAssignment )
            // InternalJsonSchemaDsl.g:1444:4: rule__JsonDocument__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonDocument__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalJsonSchemaDsl.g:1453:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1454:1: ( ruleIntegerValue EOF )
            // InternalJsonSchemaDsl.g:1455:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalJsonSchemaDsl.g:1462:1: ruleIntegerValue : ( ( rule__IntegerValue__ValueAssignment ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1466:2: ( ( ( rule__IntegerValue__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1467:2: ( ( rule__IntegerValue__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1467:2: ( ( rule__IntegerValue__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1468:3: ( rule__IntegerValue__ValueAssignment )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1469:3: ( rule__IntegerValue__ValueAssignment )
            // InternalJsonSchemaDsl.g:1469:4: rule__IntegerValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalJsonSchemaDsl.g:1478:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1479:1: ( ruleBooleanValue EOF )
            // InternalJsonSchemaDsl.g:1480:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalJsonSchemaDsl.g:1487:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1491:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1492:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1492:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1493:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1494:3: ( rule__BooleanValue__ValueAssignment )
            // InternalJsonSchemaDsl.g:1494:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalJsonSchemaDsl.g:1503:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1504:1: ( ruleNullValue EOF )
            // InternalJsonSchemaDsl.g:1505:1: ruleNullValue EOF
            {
             before(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getNullValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalJsonSchemaDsl.g:1512:1: ruleNullValue : ( ( rule__NullValue__Group__0 ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1516:2: ( ( ( rule__NullValue__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1517:2: ( ( rule__NullValue__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1517:2: ( ( rule__NullValue__Group__0 ) )
            // InternalJsonSchemaDsl.g:1518:3: ( rule__NullValue__Group__0 )
            {
             before(grammarAccess.getNullValueAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1519:3: ( rule__NullValue__Group__0 )
            // InternalJsonSchemaDsl.g:1519:4: rule__NullValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalJsonSchemaDsl.g:1528:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1529:1: ( ruleStringValue EOF )
            // InternalJsonSchemaDsl.g:1530:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalJsonSchemaDsl.g:1537:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1541:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1542:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1542:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1543:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1544:3: ( rule__StringValue__ValueAssignment )
            // InternalJsonSchemaDsl.g:1544:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalJsonSchemaDsl.g:1553:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1554:1: ( ruleObjectValue EOF )
            // InternalJsonSchemaDsl.g:1555:1: ruleObjectValue EOF
            {
             before(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectValue();

            state._fsp--;

             after(grammarAccess.getObjectValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalJsonSchemaDsl.g:1562:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1566:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1567:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1567:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalJsonSchemaDsl.g:1568:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1569:3: ( rule__ObjectValue__Group__0 )
            // InternalJsonSchemaDsl.g:1569:4: rule__ObjectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalJsonSchemaDsl.g:1578:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1579:1: ( ruleNumberValue EOF )
            // InternalJsonSchemaDsl.g:1580:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalJsonSchemaDsl.g:1587:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1591:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1592:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1592:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1593:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1594:3: ( rule__NumberValue__ValueAssignment )
            // InternalJsonSchemaDsl.g:1594:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalJsonSchemaDsl.g:1603:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1604:1: ( ruleArrayValue EOF )
            // InternalJsonSchemaDsl.g:1605:1: ruleArrayValue EOF
            {
             before(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayValue();

            state._fsp--;

             after(grammarAccess.getArrayValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalJsonSchemaDsl.g:1612:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1616:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1617:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1617:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalJsonSchemaDsl.g:1618:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1619:3: ( rule__ArrayValue__Group__0 )
            // InternalJsonSchemaDsl.g:1619:4: rule__ArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleEInt"
    // InternalJsonSchemaDsl.g:1628:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1629:1: ( ruleEInt EOF )
            // InternalJsonSchemaDsl.g:1630:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalJsonSchemaDsl.g:1637:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1641:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1642:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1642:2: ( ( rule__EInt__Group__0 ) )
            // InternalJsonSchemaDsl.g:1643:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1644:3: ( rule__EInt__Group__0 )
            // InternalJsonSchemaDsl.g:1644:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSchemaArray"
    // InternalJsonSchemaDsl.g:1653:1: entryRuleSchemaArray : ruleSchemaArray EOF ;
    public final void entryRuleSchemaArray() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1654:1: ( ruleSchemaArray EOF )
            // InternalJsonSchemaDsl.g:1655:1: ruleSchemaArray EOF
            {
             before(grammarAccess.getSchemaArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleSchemaArray();

            state._fsp--;

             after(grammarAccess.getSchemaArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemaArray"


    // $ANTLR start "ruleSchemaArray"
    // InternalJsonSchemaDsl.g:1662:1: ruleSchemaArray : ( ( rule__SchemaArray__Group__0 ) ) ;
    public final void ruleSchemaArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1666:2: ( ( ( rule__SchemaArray__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1667:2: ( ( rule__SchemaArray__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1667:2: ( ( rule__SchemaArray__Group__0 ) )
            // InternalJsonSchemaDsl.g:1668:3: ( rule__SchemaArray__Group__0 )
            {
             before(grammarAccess.getSchemaArrayAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1669:3: ( rule__SchemaArray__Group__0 )
            // InternalJsonSchemaDsl.g:1669:4: rule__SchemaArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaArray"


    // $ANTLR start "entryRuleNonNegativeIntegerDefault0"
    // InternalJsonSchemaDsl.g:1678:1: entryRuleNonNegativeIntegerDefault0 : ruleNonNegativeIntegerDefault0 EOF ;
    public final void entryRuleNonNegativeIntegerDefault0() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1679:1: ( ruleNonNegativeIntegerDefault0 EOF )
            // InternalJsonSchemaDsl.g:1680:1: ruleNonNegativeIntegerDefault0 EOF
            {
             before(grammarAccess.getNonNegativeIntegerDefault0Rule()); 
            pushFollow(FOLLOW_1);
            ruleNonNegativeIntegerDefault0();

            state._fsp--;

             after(grammarAccess.getNonNegativeIntegerDefault0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeIntegerDefault0"


    // $ANTLR start "ruleNonNegativeIntegerDefault0"
    // InternalJsonSchemaDsl.g:1687:1: ruleNonNegativeIntegerDefault0 : ( ( rule__NonNegativeIntegerDefault0__ValueAssignment ) ) ;
    public final void ruleNonNegativeIntegerDefault0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1691:2: ( ( ( rule__NonNegativeIntegerDefault0__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1692:2: ( ( rule__NonNegativeIntegerDefault0__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1692:2: ( ( rule__NonNegativeIntegerDefault0__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1693:3: ( rule__NonNegativeIntegerDefault0__ValueAssignment )
            {
             before(grammarAccess.getNonNegativeIntegerDefault0Access().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1694:3: ( rule__NonNegativeIntegerDefault0__ValueAssignment )
            // InternalJsonSchemaDsl.g:1694:4: rule__NonNegativeIntegerDefault0__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NonNegativeIntegerDefault0__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNonNegativeIntegerDefault0Access().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeIntegerDefault0"


    // $ANTLR start "entryRuleKeySchemaPair"
    // InternalJsonSchemaDsl.g:1703:1: entryRuleKeySchemaPair : ruleKeySchemaPair EOF ;
    public final void entryRuleKeySchemaPair() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1704:1: ( ruleKeySchemaPair EOF )
            // InternalJsonSchemaDsl.g:1705:1: ruleKeySchemaPair EOF
            {
             before(grammarAccess.getKeySchemaPairRule()); 
            pushFollow(FOLLOW_1);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getKeySchemaPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeySchemaPair"


    // $ANTLR start "ruleKeySchemaPair"
    // InternalJsonSchemaDsl.g:1712:1: ruleKeySchemaPair : ( ( rule__KeySchemaPair__Group__0 ) ) ;
    public final void ruleKeySchemaPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1716:2: ( ( ( rule__KeySchemaPair__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1717:2: ( ( rule__KeySchemaPair__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1717:2: ( ( rule__KeySchemaPair__Group__0 ) )
            // InternalJsonSchemaDsl.g:1718:3: ( rule__KeySchemaPair__Group__0 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1719:3: ( rule__KeySchemaPair__Group__0 )
            // InternalJsonSchemaDsl.g:1719:4: rule__KeySchemaPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeySchemaPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeySchemaPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeySchemaPair"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalJsonSchemaDsl.g:1728:1: entryRuleNonNegativeInteger : ruleNonNegativeInteger EOF ;
    public final void entryRuleNonNegativeInteger() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1729:1: ( ruleNonNegativeInteger EOF )
            // InternalJsonSchemaDsl.g:1730:1: ruleNonNegativeInteger EOF
            {
             before(grammarAccess.getNonNegativeIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleNonNegativeInteger();

            state._fsp--;

             after(grammarAccess.getNonNegativeIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalJsonSchemaDsl.g:1737:1: ruleNonNegativeInteger : ( ( rule__NonNegativeInteger__ValueAssignment ) ) ;
    public final void ruleNonNegativeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1741:2: ( ( ( rule__NonNegativeInteger__ValueAssignment ) ) )
            // InternalJsonSchemaDsl.g:1742:2: ( ( rule__NonNegativeInteger__ValueAssignment ) )
            {
            // InternalJsonSchemaDsl.g:1742:2: ( ( rule__NonNegativeInteger__ValueAssignment ) )
            // InternalJsonSchemaDsl.g:1743:3: ( rule__NonNegativeInteger__ValueAssignment )
            {
             before(grammarAccess.getNonNegativeIntegerAccess().getValueAssignment()); 
            // InternalJsonSchemaDsl.g:1744:3: ( rule__NonNegativeInteger__ValueAssignment )
            // InternalJsonSchemaDsl.g:1744:4: rule__NonNegativeInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NonNegativeInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNonNegativeIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleTypesAnyOf2"
    // InternalJsonSchemaDsl.g:1753:1: entryRuleTypesAnyOf2 : ruleTypesAnyOf2 EOF ;
    public final void entryRuleTypesAnyOf2() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1754:1: ( ruleTypesAnyOf2 EOF )
            // InternalJsonSchemaDsl.g:1755:1: ruleTypesAnyOf2 EOF
            {
             before(grammarAccess.getTypesAnyOf2Rule()); 
            pushFollow(FOLLOW_1);
            ruleTypesAnyOf2();

            state._fsp--;

             after(grammarAccess.getTypesAnyOf2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypesAnyOf2"


    // $ANTLR start "ruleTypesAnyOf2"
    // InternalJsonSchemaDsl.g:1762:1: ruleTypesAnyOf2 : ( ( rule__TypesAnyOf2__Group__0 ) ) ;
    public final void ruleTypesAnyOf2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1766:2: ( ( ( rule__TypesAnyOf2__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1767:2: ( ( rule__TypesAnyOf2__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1767:2: ( ( rule__TypesAnyOf2__Group__0 ) )
            // InternalJsonSchemaDsl.g:1768:3: ( rule__TypesAnyOf2__Group__0 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getGroup()); 
            // InternalJsonSchemaDsl.g:1769:3: ( rule__TypesAnyOf2__Group__0 )
            // InternalJsonSchemaDsl.g:1769:4: rule__TypesAnyOf2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypesAnyOf2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypesAnyOf2"


    // $ANTLR start "entryRuleDependenciesAnyOf"
    // InternalJsonSchemaDsl.g:1778:1: entryRuleDependenciesAnyOf : ruleDependenciesAnyOf EOF ;
    public final void entryRuleDependenciesAnyOf() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1779:1: ( ruleDependenciesAnyOf EOF )
            // InternalJsonSchemaDsl.g:1780:1: ruleDependenciesAnyOf EOF
            {
             before(grammarAccess.getDependenciesAnyOfRule()); 
            pushFollow(FOLLOW_1);
            ruleDependenciesAnyOf();

            state._fsp--;

             after(grammarAccess.getDependenciesAnyOfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependenciesAnyOf"


    // $ANTLR start "ruleDependenciesAnyOf"
    // InternalJsonSchemaDsl.g:1787:1: ruleDependenciesAnyOf : ( ( rule__DependenciesAnyOf__Group__0 ) ) ;
    public final void ruleDependenciesAnyOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1791:2: ( ( ( rule__DependenciesAnyOf__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1792:2: ( ( rule__DependenciesAnyOf__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1792:2: ( ( rule__DependenciesAnyOf__Group__0 ) )
            // InternalJsonSchemaDsl.g:1793:3: ( rule__DependenciesAnyOf__Group__0 )
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1794:3: ( rule__DependenciesAnyOf__Group__0 )
            // InternalJsonSchemaDsl.g:1794:4: rule__DependenciesAnyOf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DependenciesAnyOf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependenciesAnyOfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependenciesAnyOf"


    // $ANTLR start "entryRuleKeyStringArrayPair"
    // InternalJsonSchemaDsl.g:1803:1: entryRuleKeyStringArrayPair : ruleKeyStringArrayPair EOF ;
    public final void entryRuleKeyStringArrayPair() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1804:1: ( ruleKeyStringArrayPair EOF )
            // InternalJsonSchemaDsl.g:1805:1: ruleKeyStringArrayPair EOF
            {
             before(grammarAccess.getKeyStringArrayPairRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyStringArrayPair();

            state._fsp--;

             after(grammarAccess.getKeyStringArrayPairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyStringArrayPair"


    // $ANTLR start "ruleKeyStringArrayPair"
    // InternalJsonSchemaDsl.g:1812:1: ruleKeyStringArrayPair : ( ( rule__KeyStringArrayPair__Group__0 ) ) ;
    public final void ruleKeyStringArrayPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1816:2: ( ( ( rule__KeyStringArrayPair__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1817:2: ( ( rule__KeyStringArrayPair__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1817:2: ( ( rule__KeyStringArrayPair__Group__0 ) )
            // InternalJsonSchemaDsl.g:1818:3: ( rule__KeyStringArrayPair__Group__0 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1819:3: ( rule__KeyStringArrayPair__Group__0 )
            // InternalJsonSchemaDsl.g:1819:4: rule__KeyStringArrayPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyStringArrayPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringArrayPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyStringArrayPair"


    // $ANTLR start "entryRuleStringArray"
    // InternalJsonSchemaDsl.g:1828:1: entryRuleStringArray : ruleStringArray EOF ;
    public final void entryRuleStringArray() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1829:1: ( ruleStringArray EOF )
            // InternalJsonSchemaDsl.g:1830:1: ruleStringArray EOF
            {
             before(grammarAccess.getStringArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleStringArray();

            state._fsp--;

             after(grammarAccess.getStringArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringArray"


    // $ANTLR start "ruleStringArray"
    // InternalJsonSchemaDsl.g:1837:1: ruleStringArray : ( ( rule__StringArray__Group__0 ) ) ;
    public final void ruleStringArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1841:2: ( ( ( rule__StringArray__Group__0 ) ) )
            // InternalJsonSchemaDsl.g:1842:2: ( ( rule__StringArray__Group__0 ) )
            {
            // InternalJsonSchemaDsl.g:1842:2: ( ( rule__StringArray__Group__0 ) )
            // InternalJsonSchemaDsl.g:1843:3: ( rule__StringArray__Group__0 )
            {
             before(grammarAccess.getStringArrayAccess().getGroup()); 
            // InternalJsonSchemaDsl.g:1844:3: ( rule__StringArray__Group__0 )
            // InternalJsonSchemaDsl.g:1844:4: rule__StringArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringArray"


    // $ANTLR start "ruleSimpleTypes"
    // InternalJsonSchemaDsl.g:1853:1: ruleSimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void ruleSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1857:1: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:1858:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:1858:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalJsonSchemaDsl.g:1859:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:1860:3: ( rule__SimpleTypes__Alternatives )
            // InternalJsonSchemaDsl.g:1860:4: rule__SimpleTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleTypes"


    // $ANTLR start "rule__Schema__Alternatives"
    // InternalJsonSchemaDsl.g:1868:1: rule__Schema__Alternatives : ( ( ruleObjectSchema ) | ( ruleBooleanSchema ) );
    public final void rule__Schema__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1872:1: ( ( ruleObjectSchema ) | ( ruleBooleanSchema ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1873:2: ( ruleObjectSchema )
                    {
                    // InternalJsonSchemaDsl.g:1873:2: ( ruleObjectSchema )
                    // InternalJsonSchemaDsl.g:1874:3: ruleObjectSchema
                    {
                     before(grammarAccess.getSchemaAccess().getObjectSchemaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectSchema();

                    state._fsp--;

                     after(grammarAccess.getSchemaAccess().getObjectSchemaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:1879:2: ( ruleBooleanSchema )
                    {
                    // InternalJsonSchemaDsl.g:1879:2: ( ruleBooleanSchema )
                    // InternalJsonSchemaDsl.g:1880:3: ruleBooleanSchema
                    {
                     before(grammarAccess.getSchemaAccess().getBooleanSchemaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanSchema();

                    state._fsp--;

                     after(grammarAccess.getSchemaAccess().getBooleanSchemaParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Alternatives"


    // $ANTLR start "rule__KeywordDefinition__Alternatives"
    // InternalJsonSchemaDsl.g:1889:1: rule__KeywordDefinition__Alternatives : ( ( ruleIdSchemaDefinition ) | ( ruleSchemaSchemaDefinition ) | ( ruleRefSchemaDefinition ) | ( ruleCommentSchemaDefinition ) | ( ruleTitleSchemaDefinition ) | ( ruleDescriptionSchemaDefinition ) | ( ruleDefaultSchemaDefinition ) | ( ruleReadOnlySchemaDefinition ) | ( ruleWriteOnlySchemaDefinition ) | ( ruleExamplesSchemaDefinition ) | ( ruleMultipleOfSchemaDefinition ) | ( ruleMaximumSchemaDefinition ) | ( ruleExclusiveMaximumSchemaDefinition ) | ( ruleMinimumSchemaDefinition ) | ( ruleExclusiveMinimumSchemaDefinition ) | ( ruleMaxLengthSchemaDefinition ) | ( ruleMinLengthSchemaDefinition ) | ( rulePatternSchemaDefinition ) | ( ruleAdditionalItemsSchemaDefinition ) | ( ruleItemsSchemaDefinition ) | ( ruleMaxItemsSchemaDefinition ) | ( ruleMinItemsSchemaDefinition ) | ( ruleUniqueItemsSchemaDefinition ) | ( ruleContainsSchemaDefinition ) | ( ruleMaxPropertiesSchemaDefinition ) | ( ruleMinPropertiesSchemaDefinition ) | ( ruleRequiredSchemaDefinition ) | ( ruleAdditionalPropertiesSchemaDefinition ) | ( ruleDefinitionsSchemaDefinition ) | ( rulePropertiesSchemaDefinition ) | ( rulePatternPropertiesSchemaDefinition ) | ( rulePropertyNamesSchemaDefinition ) | ( ruleConstSchemaDefinition ) | ( ruleEnumSchemaDefinition ) | ( ruleTypeSchemaDefinition ) | ( ruleFormatSchemaDefinition ) | ( ruleContentMediaTypeSchemaDefinition ) | ( ruleContentEncodingSchemaDefinition ) | ( ruleIfSchemaDefinition ) | ( ruleThenSchemaDefinition ) | ( ruleElseSchemaDefinition ) | ( ruleAllOfSchemaDefinition ) | ( ruleAnyOfSchemaDefinition ) | ( ruleOneOfSchemaDefinition ) | ( ruleNotSchemaDefinition ) | ( ruleKeyValuePair ) );
    public final void rule__KeywordDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1893:1: ( ( ruleIdSchemaDefinition ) | ( ruleSchemaSchemaDefinition ) | ( ruleRefSchemaDefinition ) | ( ruleCommentSchemaDefinition ) | ( ruleTitleSchemaDefinition ) | ( ruleDescriptionSchemaDefinition ) | ( ruleDefaultSchemaDefinition ) | ( ruleReadOnlySchemaDefinition ) | ( ruleWriteOnlySchemaDefinition ) | ( ruleExamplesSchemaDefinition ) | ( ruleMultipleOfSchemaDefinition ) | ( ruleMaximumSchemaDefinition ) | ( ruleExclusiveMaximumSchemaDefinition ) | ( ruleMinimumSchemaDefinition ) | ( ruleExclusiveMinimumSchemaDefinition ) | ( ruleMaxLengthSchemaDefinition ) | ( ruleMinLengthSchemaDefinition ) | ( rulePatternSchemaDefinition ) | ( ruleAdditionalItemsSchemaDefinition ) | ( ruleItemsSchemaDefinition ) | ( ruleMaxItemsSchemaDefinition ) | ( ruleMinItemsSchemaDefinition ) | ( ruleUniqueItemsSchemaDefinition ) | ( ruleContainsSchemaDefinition ) | ( ruleMaxPropertiesSchemaDefinition ) | ( ruleMinPropertiesSchemaDefinition ) | ( ruleRequiredSchemaDefinition ) | ( ruleAdditionalPropertiesSchemaDefinition ) | ( ruleDefinitionsSchemaDefinition ) | ( rulePropertiesSchemaDefinition ) | ( rulePatternPropertiesSchemaDefinition ) | ( rulePropertyNamesSchemaDefinition ) | ( ruleConstSchemaDefinition ) | ( ruleEnumSchemaDefinition ) | ( ruleTypeSchemaDefinition ) | ( ruleFormatSchemaDefinition ) | ( ruleContentMediaTypeSchemaDefinition ) | ( ruleContentEncodingSchemaDefinition ) | ( ruleIfSchemaDefinition ) | ( ruleThenSchemaDefinition ) | ( ruleElseSchemaDefinition ) | ( ruleAllOfSchemaDefinition ) | ( ruleAnyOfSchemaDefinition ) | ( ruleOneOfSchemaDefinition ) | ( ruleNotSchemaDefinition ) | ( ruleKeyValuePair ) )
            int alt2=46;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt2=1;
                }
                break;
            case 70:
                {
                alt2=2;
                }
                break;
            case 67:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 32:
                {
                alt2=5;
                }
                break;
            case 53:
                {
                alt2=6;
                }
                break;
            case 36:
                {
                alt2=7;
                }
                break;
            case 46:
                {
                alt2=8;
                }
                break;
            case 26:
                {
                alt2=9;
                }
                break;
            case 57:
                {
                alt2=10;
                }
                break;
            case 61:
                {
                alt2=11;
                }
                break;
            case 24:
                {
                alt2=12;
                }
                break;
            case 65:
                {
                alt2=13;
                }
                break;
            case 43:
                {
                alt2=14;
                }
                break;
            case 69:
                {
                alt2=15;
                }
                break;
            case 66:
                {
                alt2=16;
                }
                break;
            case 38:
                {
                alt2=17;
                }
                break;
            case 62:
                {
                alt2=18;
                }
                break;
            case 56:
                {
                alt2=19;
                }
                break;
            case 33:
                {
                alt2=20;
                }
                break;
            case 44:
                {
                alt2=21;
                }
                break;
            case 40:
                {
                alt2=22;
                }
                break;
            case 30:
                {
                alt2=23;
                }
                break;
            case 63:
                {
                alt2=24;
                }
                break;
            case 42:
                {
                alt2=25;
                }
                break;
            case 54:
                {
                alt2=26;
                }
                break;
            case 52:
                {
                alt2=27;
                }
                break;
            case 48:
                {
                alt2=28;
                }
                break;
            case 39:
                {
                alt2=29;
                }
                break;
            case 71:
                {
                alt2=30;
                }
                break;
            case 55:
                {
                alt2=31;
                }
                break;
            case 72:
                {
                alt2=32;
                }
                break;
            case 51:
                {
                alt2=33;
                }
                break;
            case 28:
                {
                alt2=34;
                }
                break;
            case 47:
                {
                alt2=35;
                }
                break;
            case 45:
                {
                alt2=36;
                }
                break;
            case 68:
                {
                alt2=37;
                }
                break;
            case 60:
                {
                alt2=38;
                }
                break;
            case 58:
                {
                alt2=39;
                }
                break;
            case 37:
                {
                alt2=40;
                }
                break;
            case 49:
                {
                alt2=41;
                }
                break;
            case 59:
                {
                alt2=42;
                }
                break;
            case 31:
                {
                alt2=43;
                }
                break;
            case 41:
                {
                alt2=44;
                }
                break;
            case 64:
                {
                alt2=45;
                }
                break;
            case RULE_STRING:
                {
                alt2=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonSchemaDsl.g:1894:2: ( ruleIdSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1894:2: ( ruleIdSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1895:3: ruleIdSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getIdSchemaDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIdSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getIdSchemaDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:1900:2: ( ruleSchemaSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1900:2: ( ruleSchemaSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1901:3: ruleSchemaSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getSchemaSchemaDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSchemaSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getSchemaSchemaDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:1906:2: ( ruleRefSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1906:2: ( ruleRefSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1907:3: ruleRefSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getRefSchemaDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRefSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getRefSchemaDefinitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:1912:2: ( ruleCommentSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1912:2: ( ruleCommentSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1913:3: ruleCommentSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getCommentSchemaDefinitionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCommentSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getCommentSchemaDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:1918:2: ( ruleTitleSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1918:2: ( ruleTitleSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1919:3: ruleTitleSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getTitleSchemaDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTitleSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getTitleSchemaDefinitionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:1924:2: ( ruleDescriptionSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1924:2: ( ruleDescriptionSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1925:3: ruleDescriptionSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getDescriptionSchemaDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDescriptionSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getDescriptionSchemaDefinitionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:1930:2: ( ruleDefaultSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1930:2: ( ruleDefaultSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1931:3: ruleDefaultSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getDefaultSchemaDefinitionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getDefaultSchemaDefinitionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJsonSchemaDsl.g:1936:2: ( ruleReadOnlySchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1936:2: ( ruleReadOnlySchemaDefinition )
                    // InternalJsonSchemaDsl.g:1937:3: ruleReadOnlySchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getReadOnlySchemaDefinitionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleReadOnlySchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getReadOnlySchemaDefinitionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJsonSchemaDsl.g:1942:2: ( ruleWriteOnlySchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1942:2: ( ruleWriteOnlySchemaDefinition )
                    // InternalJsonSchemaDsl.g:1943:3: ruleWriteOnlySchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getWriteOnlySchemaDefinitionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleWriteOnlySchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getWriteOnlySchemaDefinitionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJsonSchemaDsl.g:1948:2: ( ruleExamplesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1948:2: ( ruleExamplesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1949:3: ruleExamplesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getExamplesSchemaDefinitionParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleExamplesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getExamplesSchemaDefinitionParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJsonSchemaDsl.g:1954:2: ( ruleMultipleOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1954:2: ( ruleMultipleOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1955:3: ruleMultipleOfSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMultipleOfSchemaDefinitionParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleOfSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMultipleOfSchemaDefinitionParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJsonSchemaDsl.g:1960:2: ( ruleMaximumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1960:2: ( ruleMaximumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1961:3: ruleMaximumSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMaximumSchemaDefinitionParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleMaximumSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMaximumSchemaDefinitionParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJsonSchemaDsl.g:1966:2: ( ruleExclusiveMaximumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1966:2: ( ruleExclusiveMaximumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1967:3: ruleExclusiveMaximumSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getExclusiveMaximumSchemaDefinitionParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleExclusiveMaximumSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getExclusiveMaximumSchemaDefinitionParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJsonSchemaDsl.g:1972:2: ( ruleMinimumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1972:2: ( ruleMinimumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1973:3: ruleMinimumSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMinimumSchemaDefinitionParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleMinimumSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMinimumSchemaDefinitionParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJsonSchemaDsl.g:1978:2: ( ruleExclusiveMinimumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1978:2: ( ruleExclusiveMinimumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1979:3: ruleExclusiveMinimumSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getExclusiveMinimumSchemaDefinitionParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleExclusiveMinimumSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getExclusiveMinimumSchemaDefinitionParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJsonSchemaDsl.g:1984:2: ( ruleMaxLengthSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1984:2: ( ruleMaxLengthSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1985:3: ruleMaxLengthSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMaxLengthSchemaDefinitionParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxLengthSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMaxLengthSchemaDefinitionParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJsonSchemaDsl.g:1990:2: ( ruleMinLengthSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1990:2: ( ruleMinLengthSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1991:3: ruleMinLengthSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMinLengthSchemaDefinitionParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleMinLengthSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMinLengthSchemaDefinitionParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalJsonSchemaDsl.g:1996:2: ( rulePatternSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1996:2: ( rulePatternSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1997:3: rulePatternSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getPatternSchemaDefinitionParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    rulePatternSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getPatternSchemaDefinitionParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalJsonSchemaDsl.g:2002:2: ( ruleAdditionalItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2002:2: ( ruleAdditionalItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2003:3: ruleAdditionalItemsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getAdditionalItemsSchemaDefinitionParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleAdditionalItemsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getAdditionalItemsSchemaDefinitionParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalJsonSchemaDsl.g:2008:2: ( ruleItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2008:2: ( ruleItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2009:3: ruleItemsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getItemsSchemaDefinitionParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleItemsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getItemsSchemaDefinitionParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalJsonSchemaDsl.g:2014:2: ( ruleMaxItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2014:2: ( ruleMaxItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2015:3: ruleMaxItemsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMaxItemsSchemaDefinitionParserRuleCall_20()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxItemsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMaxItemsSchemaDefinitionParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalJsonSchemaDsl.g:2020:2: ( ruleMinItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2020:2: ( ruleMinItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2021:3: ruleMinItemsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMinItemsSchemaDefinitionParserRuleCall_21()); 
                    pushFollow(FOLLOW_2);
                    ruleMinItemsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMinItemsSchemaDefinitionParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalJsonSchemaDsl.g:2026:2: ( ruleUniqueItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2026:2: ( ruleUniqueItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2027:3: ruleUniqueItemsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getUniqueItemsSchemaDefinitionParserRuleCall_22()); 
                    pushFollow(FOLLOW_2);
                    ruleUniqueItemsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getUniqueItemsSchemaDefinitionParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalJsonSchemaDsl.g:2032:2: ( ruleContainsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2032:2: ( ruleContainsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2033:3: ruleContainsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getContainsSchemaDefinitionParserRuleCall_23()); 
                    pushFollow(FOLLOW_2);
                    ruleContainsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getContainsSchemaDefinitionParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalJsonSchemaDsl.g:2038:2: ( ruleMaxPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2038:2: ( ruleMaxPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2039:3: ruleMaxPropertiesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMaxPropertiesSchemaDefinitionParserRuleCall_24()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxPropertiesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMaxPropertiesSchemaDefinitionParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalJsonSchemaDsl.g:2044:2: ( ruleMinPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2044:2: ( ruleMinPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2045:3: ruleMinPropertiesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getMinPropertiesSchemaDefinitionParserRuleCall_25()); 
                    pushFollow(FOLLOW_2);
                    ruleMinPropertiesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getMinPropertiesSchemaDefinitionParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalJsonSchemaDsl.g:2050:2: ( ruleRequiredSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2050:2: ( ruleRequiredSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2051:3: ruleRequiredSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getRequiredSchemaDefinitionParserRuleCall_26()); 
                    pushFollow(FOLLOW_2);
                    ruleRequiredSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getRequiredSchemaDefinitionParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalJsonSchemaDsl.g:2056:2: ( ruleAdditionalPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2056:2: ( ruleAdditionalPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2057:3: ruleAdditionalPropertiesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getAdditionalPropertiesSchemaDefinitionParserRuleCall_27()); 
                    pushFollow(FOLLOW_2);
                    ruleAdditionalPropertiesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getAdditionalPropertiesSchemaDefinitionParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalJsonSchemaDsl.g:2062:2: ( ruleDefinitionsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2062:2: ( ruleDefinitionsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2063:3: ruleDefinitionsSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getDefinitionsSchemaDefinitionParserRuleCall_28()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinitionsSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getDefinitionsSchemaDefinitionParserRuleCall_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalJsonSchemaDsl.g:2068:2: ( rulePropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2068:2: ( rulePropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2069:3: rulePropertiesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getPropertiesSchemaDefinitionParserRuleCall_29()); 
                    pushFollow(FOLLOW_2);
                    rulePropertiesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getPropertiesSchemaDefinitionParserRuleCall_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalJsonSchemaDsl.g:2074:2: ( rulePatternPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2074:2: ( rulePatternPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2075:3: rulePatternPropertiesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getPatternPropertiesSchemaDefinitionParserRuleCall_30()); 
                    pushFollow(FOLLOW_2);
                    rulePatternPropertiesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getPatternPropertiesSchemaDefinitionParserRuleCall_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalJsonSchemaDsl.g:2080:2: ( rulePropertyNamesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2080:2: ( rulePropertyNamesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2081:3: rulePropertyNamesSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getPropertyNamesSchemaDefinitionParserRuleCall_31()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyNamesSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getPropertyNamesSchemaDefinitionParserRuleCall_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalJsonSchemaDsl.g:2086:2: ( ruleConstSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2086:2: ( ruleConstSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2087:3: ruleConstSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getConstSchemaDefinitionParserRuleCall_32()); 
                    pushFollow(FOLLOW_2);
                    ruleConstSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getConstSchemaDefinitionParserRuleCall_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalJsonSchemaDsl.g:2092:2: ( ruleEnumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2092:2: ( ruleEnumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2093:3: ruleEnumSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getEnumSchemaDefinitionParserRuleCall_33()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getEnumSchemaDefinitionParserRuleCall_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalJsonSchemaDsl.g:2098:2: ( ruleTypeSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2098:2: ( ruleTypeSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2099:3: ruleTypeSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getTypeSchemaDefinitionParserRuleCall_34()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getTypeSchemaDefinitionParserRuleCall_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalJsonSchemaDsl.g:2104:2: ( ruleFormatSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2104:2: ( ruleFormatSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2105:3: ruleFormatSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getFormatSchemaDefinitionParserRuleCall_35()); 
                    pushFollow(FOLLOW_2);
                    ruleFormatSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getFormatSchemaDefinitionParserRuleCall_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalJsonSchemaDsl.g:2110:2: ( ruleContentMediaTypeSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2110:2: ( ruleContentMediaTypeSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2111:3: ruleContentMediaTypeSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getContentMediaTypeSchemaDefinitionParserRuleCall_36()); 
                    pushFollow(FOLLOW_2);
                    ruleContentMediaTypeSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getContentMediaTypeSchemaDefinitionParserRuleCall_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalJsonSchemaDsl.g:2116:2: ( ruleContentEncodingSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2116:2: ( ruleContentEncodingSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2117:3: ruleContentEncodingSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getContentEncodingSchemaDefinitionParserRuleCall_37()); 
                    pushFollow(FOLLOW_2);
                    ruleContentEncodingSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getContentEncodingSchemaDefinitionParserRuleCall_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalJsonSchemaDsl.g:2122:2: ( ruleIfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2122:2: ( ruleIfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2123:3: ruleIfSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getIfSchemaDefinitionParserRuleCall_38()); 
                    pushFollow(FOLLOW_2);
                    ruleIfSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getIfSchemaDefinitionParserRuleCall_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalJsonSchemaDsl.g:2128:2: ( ruleThenSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2128:2: ( ruleThenSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2129:3: ruleThenSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getThenSchemaDefinitionParserRuleCall_39()); 
                    pushFollow(FOLLOW_2);
                    ruleThenSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getThenSchemaDefinitionParserRuleCall_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalJsonSchemaDsl.g:2134:2: ( ruleElseSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2134:2: ( ruleElseSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2135:3: ruleElseSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getElseSchemaDefinitionParserRuleCall_40()); 
                    pushFollow(FOLLOW_2);
                    ruleElseSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getElseSchemaDefinitionParserRuleCall_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalJsonSchemaDsl.g:2140:2: ( ruleAllOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2140:2: ( ruleAllOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2141:3: ruleAllOfSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getAllOfSchemaDefinitionParserRuleCall_41()); 
                    pushFollow(FOLLOW_2);
                    ruleAllOfSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getAllOfSchemaDefinitionParserRuleCall_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalJsonSchemaDsl.g:2146:2: ( ruleAnyOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2146:2: ( ruleAnyOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2147:3: ruleAnyOfSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getAnyOfSchemaDefinitionParserRuleCall_42()); 
                    pushFollow(FOLLOW_2);
                    ruleAnyOfSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getAnyOfSchemaDefinitionParserRuleCall_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalJsonSchemaDsl.g:2152:2: ( ruleOneOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2152:2: ( ruleOneOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2153:3: ruleOneOfSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getOneOfSchemaDefinitionParserRuleCall_43()); 
                    pushFollow(FOLLOW_2);
                    ruleOneOfSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getOneOfSchemaDefinitionParserRuleCall_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalJsonSchemaDsl.g:2158:2: ( ruleNotSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2158:2: ( ruleNotSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2159:3: ruleNotSchemaDefinition
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getNotSchemaDefinitionParserRuleCall_44()); 
                    pushFollow(FOLLOW_2);
                    ruleNotSchemaDefinition();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getNotSchemaDefinitionParserRuleCall_44()); 

                    }


                    }
                    break;
                case 46 :
                    // InternalJsonSchemaDsl.g:2164:2: ( ruleKeyValuePair )
                    {
                    // InternalJsonSchemaDsl.g:2164:2: ( ruleKeyValuePair )
                    // InternalJsonSchemaDsl.g:2165:3: ruleKeyValuePair
                    {
                     before(grammarAccess.getKeywordDefinitionAccess().getKeyValuePairParserRuleCall_45()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyValuePair();

                    state._fsp--;

                     after(grammarAccess.getKeywordDefinitionAccess().getKeyValuePairParserRuleCall_45()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeywordDefinition__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalJsonSchemaDsl.g:2174:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleObjectValue ) | ( ruleNumberValue ) | ( ruleArrayValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2178:1: ( ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleObjectValue ) | ( ruleNumberValue ) | ( ruleArrayValue ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 74:
                {
                alt3=1;
                }
                break;
            case 12:
            case 13:
                {
                alt3=2;
                }
                break;
            case 73:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2179:2: ( ruleIntegerValue )
                    {
                    // InternalJsonSchemaDsl.g:2179:2: ( ruleIntegerValue )
                    // InternalJsonSchemaDsl.g:2180:3: ruleIntegerValue
                    {
                     before(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntegerValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2185:2: ( ruleBooleanValue )
                    {
                    // InternalJsonSchemaDsl.g:2185:2: ( ruleBooleanValue )
                    // InternalJsonSchemaDsl.g:2186:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:2191:2: ( ruleNullValue )
                    {
                    // InternalJsonSchemaDsl.g:2191:2: ( ruleNullValue )
                    // InternalJsonSchemaDsl.g:2192:3: ruleNullValue
                    {
                     before(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNullValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:2197:2: ( ruleStringValue )
                    {
                    // InternalJsonSchemaDsl.g:2197:2: ( ruleStringValue )
                    // InternalJsonSchemaDsl.g:2198:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:2203:2: ( ruleObjectValue )
                    {
                    // InternalJsonSchemaDsl.g:2203:2: ( ruleObjectValue )
                    // InternalJsonSchemaDsl.g:2204:3: ruleObjectValue
                    {
                     before(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:2209:2: ( ruleNumberValue )
                    {
                    // InternalJsonSchemaDsl.g:2209:2: ( ruleNumberValue )
                    // InternalJsonSchemaDsl.g:2210:3: ruleNumberValue
                    {
                     before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:2215:2: ( ruleArrayValue )
                    {
                    // InternalJsonSchemaDsl.g:2215:2: ( ruleArrayValue )
                    // InternalJsonSchemaDsl.g:2216:3: ruleArrayValue
                    {
                     before(grammarAccess.getValueAccess().getArrayValueParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayValueParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalJsonSchemaDsl.g:2225:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2229:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2230:2: ( 'true' )
                    {
                    // InternalJsonSchemaDsl.g:2230:2: ( 'true' )
                    // InternalJsonSchemaDsl.g:2231:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2236:2: ( 'false' )
                    {
                    // InternalJsonSchemaDsl.g:2236:2: ( 'false' )
                    // InternalJsonSchemaDsl.g:2237:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalJsonSchemaDsl.g:2246:1: rule__SimpleTypes__Alternatives : ( ( ( '\"array\"' ) ) | ( ( '\"boolean\"' ) ) | ( ( '\"integer\"' ) ) | ( ( '\"null\"' ) ) | ( ( '\"number\"' ) ) | ( ( '\"object\"' ) ) | ( ( '\"string\"' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2250:1: ( ( ( '\"array\"' ) ) | ( ( '\"boolean\"' ) ) | ( ( '\"integer\"' ) ) | ( ( '\"null\"' ) ) | ( ( '\"number\"' ) ) | ( ( '\"object\"' ) ) | ( ( '\"string\"' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            case 20:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2251:2: ( ( '\"array\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2251:2: ( ( '\"array\"' ) )
                    // InternalJsonSchemaDsl.g:2252:3: ( '\"array\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0()); 
                    // InternalJsonSchemaDsl.g:2253:3: ( '\"array\"' )
                    // InternalJsonSchemaDsl.g:2253:4: '\"array\"'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2257:2: ( ( '\"boolean\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2257:2: ( ( '\"boolean\"' ) )
                    // InternalJsonSchemaDsl.g:2258:3: ( '\"boolean\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalJsonSchemaDsl.g:2259:3: ( '\"boolean\"' )
                    // InternalJsonSchemaDsl.g:2259:4: '\"boolean\"'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:2263:2: ( ( '\"integer\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2263:2: ( ( '\"integer\"' ) )
                    // InternalJsonSchemaDsl.g:2264:3: ( '\"integer\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalJsonSchemaDsl.g:2265:3: ( '\"integer\"' )
                    // InternalJsonSchemaDsl.g:2265:4: '\"integer\"'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:2269:2: ( ( '\"null\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2269:2: ( ( '\"null\"' ) )
                    // InternalJsonSchemaDsl.g:2270:3: ( '\"null\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3()); 
                    // InternalJsonSchemaDsl.g:2271:3: ( '\"null\"' )
                    // InternalJsonSchemaDsl.g:2271:4: '\"null\"'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:2275:2: ( ( '\"number\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2275:2: ( ( '\"number\"' ) )
                    // InternalJsonSchemaDsl.g:2276:3: ( '\"number\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4()); 
                    // InternalJsonSchemaDsl.g:2277:3: ( '\"number\"' )
                    // InternalJsonSchemaDsl.g:2277:4: '\"number\"'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:2281:2: ( ( '\"object\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2281:2: ( ( '\"object\"' ) )
                    // InternalJsonSchemaDsl.g:2282:3: ( '\"object\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // InternalJsonSchemaDsl.g:2283:3: ( '\"object\"' )
                    // InternalJsonSchemaDsl.g:2283:4: '\"object\"'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:2287:2: ( ( '\"string\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2287:2: ( ( '\"string\"' ) )
                    // InternalJsonSchemaDsl.g:2288:3: ( '\"string\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_6()); 
                    // InternalJsonSchemaDsl.g:2289:3: ( '\"string\"' )
                    // InternalJsonSchemaDsl.g:2289:4: '\"string\"'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleTypes__Alternatives"


    // $ANTLR start "rule__JsonSchema__Group__0"
    // InternalJsonSchemaDsl.g:2297:1: rule__JsonSchema__Group__0 : rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1 ;
    public final void rule__JsonSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2301:1: ( rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1 )
            // InternalJsonSchemaDsl.g:2302:2: rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JsonSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonSchema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonSchema__Group__0"


    // $ANTLR start "rule__JsonSchema__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2309:1: rule__JsonSchema__Group__0__Impl : ( () ) ;
    public final void rule__JsonSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2313:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:2314:1: ( () )
            {
            // InternalJsonSchemaDsl.g:2314:1: ( () )
            // InternalJsonSchemaDsl.g:2315:2: ()
            {
             before(grammarAccess.getJsonSchemaAccess().getJsonSchemaAction_0()); 
            // InternalJsonSchemaDsl.g:2316:2: ()
            // InternalJsonSchemaDsl.g:2316:3: 
            {
            }

             after(grammarAccess.getJsonSchemaAccess().getJsonSchemaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonSchema__Group__0__Impl"


    // $ANTLR start "rule__JsonSchema__Group__1"
    // InternalJsonSchemaDsl.g:2324:1: rule__JsonSchema__Group__1 : rule__JsonSchema__Group__1__Impl ;
    public final void rule__JsonSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2328:1: ( rule__JsonSchema__Group__1__Impl )
            // InternalJsonSchemaDsl.g:2329:2: rule__JsonSchema__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonSchema__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonSchema__Group__1"


    // $ANTLR start "rule__JsonSchema__Group__1__Impl"
    // InternalJsonSchemaDsl.g:2335:1: rule__JsonSchema__Group__1__Impl : ( ( rule__JsonSchema__SchemaAssignment_1 )? ) ;
    public final void rule__JsonSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2339:1: ( ( ( rule__JsonSchema__SchemaAssignment_1 )? ) )
            // InternalJsonSchemaDsl.g:2340:1: ( ( rule__JsonSchema__SchemaAssignment_1 )? )
            {
            // InternalJsonSchemaDsl.g:2340:1: ( ( rule__JsonSchema__SchemaAssignment_1 )? )
            // InternalJsonSchemaDsl.g:2341:2: ( rule__JsonSchema__SchemaAssignment_1 )?
            {
             before(grammarAccess.getJsonSchemaAccess().getSchemaAssignment_1()); 
            // InternalJsonSchemaDsl.g:2342:2: ( rule__JsonSchema__SchemaAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=13)||LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2342:3: rule__JsonSchema__SchemaAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonSchema__SchemaAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonSchemaAccess().getSchemaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonSchema__Group__1__Impl"


    // $ANTLR start "rule__ObjectSchema__Group__0"
    // InternalJsonSchemaDsl.g:2351:1: rule__ObjectSchema__Group__0 : rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1 ;
    public final void rule__ObjectSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2355:1: ( rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1 )
            // InternalJsonSchemaDsl.g:2356:2: rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ObjectSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__0"


    // $ANTLR start "rule__ObjectSchema__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2363:1: rule__ObjectSchema__Group__0__Impl : ( () ) ;
    public final void rule__ObjectSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2367:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:2368:1: ( () )
            {
            // InternalJsonSchemaDsl.g:2368:1: ( () )
            // InternalJsonSchemaDsl.g:2369:2: ()
            {
             before(grammarAccess.getObjectSchemaAccess().getObjectSchemaAction_0()); 
            // InternalJsonSchemaDsl.g:2370:2: ()
            // InternalJsonSchemaDsl.g:2370:3: 
            {
            }

             after(grammarAccess.getObjectSchemaAccess().getObjectSchemaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__0__Impl"


    // $ANTLR start "rule__ObjectSchema__Group__1"
    // InternalJsonSchemaDsl.g:2378:1: rule__ObjectSchema__Group__1 : rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2 ;
    public final void rule__ObjectSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2382:1: ( rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2 )
            // InternalJsonSchemaDsl.g:2383:2: rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ObjectSchema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__1"


    // $ANTLR start "rule__ObjectSchema__Group__1__Impl"
    // InternalJsonSchemaDsl.g:2390:1: rule__ObjectSchema__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2394:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:2395:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:2395:1: ( '{' )
            // InternalJsonSchemaDsl.g:2396:2: '{'
            {
             before(grammarAccess.getObjectSchemaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObjectSchemaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__1__Impl"


    // $ANTLR start "rule__ObjectSchema__Group__2"
    // InternalJsonSchemaDsl.g:2405:1: rule__ObjectSchema__Group__2 : rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3 ;
    public final void rule__ObjectSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2409:1: ( rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3 )
            // InternalJsonSchemaDsl.g:2410:2: rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ObjectSchema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__2"


    // $ANTLR start "rule__ObjectSchema__Group__2__Impl"
    // InternalJsonSchemaDsl.g:2417:1: rule__ObjectSchema__Group__2__Impl : ( ( rule__ObjectSchema__Group_2__0 )? ) ;
    public final void rule__ObjectSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2421:1: ( ( ( rule__ObjectSchema__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:2422:1: ( ( rule__ObjectSchema__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:2422:1: ( ( rule__ObjectSchema__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:2423:2: ( rule__ObjectSchema__Group_2__0 )?
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:2424:2: ( rule__ObjectSchema__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==24||(LA7_0>=26 && LA7_0<=28)||(LA7_0>=30 && LA7_0<=33)||(LA7_0>=36 && LA7_0<=72)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2424:3: rule__ObjectSchema__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectSchema__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectSchemaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__2__Impl"


    // $ANTLR start "rule__ObjectSchema__Group__3"
    // InternalJsonSchemaDsl.g:2432:1: rule__ObjectSchema__Group__3 : rule__ObjectSchema__Group__3__Impl ;
    public final void rule__ObjectSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2436:1: ( rule__ObjectSchema__Group__3__Impl )
            // InternalJsonSchemaDsl.g:2437:2: rule__ObjectSchema__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__3"


    // $ANTLR start "rule__ObjectSchema__Group__3__Impl"
    // InternalJsonSchemaDsl.g:2443:1: rule__ObjectSchema__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2447:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:2448:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:2448:1: ( '}' )
            // InternalJsonSchemaDsl.g:2449:2: '}'
            {
             before(grammarAccess.getObjectSchemaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectSchemaAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group__3__Impl"


    // $ANTLR start "rule__ObjectSchema__Group_2__0"
    // InternalJsonSchemaDsl.g:2459:1: rule__ObjectSchema__Group_2__0 : rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1 ;
    public final void rule__ObjectSchema__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2463:1: ( rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1 )
            // InternalJsonSchemaDsl.g:2464:2: rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ObjectSchema__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2__0"


    // $ANTLR start "rule__ObjectSchema__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:2471:1: rule__ObjectSchema__Group_2__0__Impl : ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) ) ;
    public final void rule__ObjectSchema__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2475:1: ( ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:2476:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:2476:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:2477:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 )
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:2478:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 )
            // InternalJsonSchemaDsl.g:2478:3: rule__ObjectSchema__KeywordDefinitionAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSchema__KeywordDefinitionAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectSchema__Group_2__1"
    // InternalJsonSchemaDsl.g:2486:1: rule__ObjectSchema__Group_2__1 : rule__ObjectSchema__Group_2__1__Impl ;
    public final void rule__ObjectSchema__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2490:1: ( rule__ObjectSchema__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:2491:2: rule__ObjectSchema__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2__1"


    // $ANTLR start "rule__ObjectSchema__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:2497:1: rule__ObjectSchema__Group_2__1__Impl : ( ( rule__ObjectSchema__Group_2_1__0 )* ) ;
    public final void rule__ObjectSchema__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2501:1: ( ( ( rule__ObjectSchema__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:2502:1: ( ( rule__ObjectSchema__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:2502:1: ( ( rule__ObjectSchema__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:2503:2: ( rule__ObjectSchema__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:2504:2: ( rule__ObjectSchema__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:2504:3: rule__ObjectSchema__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ObjectSchema__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getObjectSchemaAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectSchema__Group_2_1__0"
    // InternalJsonSchemaDsl.g:2513:1: rule__ObjectSchema__Group_2_1__0 : rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1 ;
    public final void rule__ObjectSchema__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2517:1: ( rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:2518:2: rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ObjectSchema__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2_1__0"


    // $ANTLR start "rule__ObjectSchema__Group_2_1__0__Impl"
    // InternalJsonSchemaDsl.g:2525:1: rule__ObjectSchema__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectSchema__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2529:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:2530:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:2530:1: ( ',' )
            // InternalJsonSchemaDsl.g:2531:2: ','
            {
             before(grammarAccess.getObjectSchemaAccess().getCommaKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectSchemaAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2_1__0__Impl"


    // $ANTLR start "rule__ObjectSchema__Group_2_1__1"
    // InternalJsonSchemaDsl.g:2540:1: rule__ObjectSchema__Group_2_1__1 : rule__ObjectSchema__Group_2_1__1__Impl ;
    public final void rule__ObjectSchema__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2544:1: ( rule__ObjectSchema__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:2545:2: rule__ObjectSchema__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSchema__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2_1__1"


    // $ANTLR start "rule__ObjectSchema__Group_2_1__1__Impl"
    // InternalJsonSchemaDsl.g:2551:1: rule__ObjectSchema__Group_2_1__1__Impl : ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) ) ;
    public final void rule__ObjectSchema__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2555:1: ( ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:2556:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:2556:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:2557:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:2558:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:2558:3: rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__Group_2_1__1__Impl"


    // $ANTLR start "rule__MaximumSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:2567:1: rule__MaximumSchemaDefinition__Group__0 : rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1 ;
    public final void rule__MaximumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2571:1: ( rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2572:2: rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MaximumSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaximumSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__Group__0"


    // $ANTLR start "rule__MaximumSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2579:1: rule__MaximumSchemaDefinition__Group__0__Impl : ( '\"maximum\"' ) ;
    public final void rule__MaximumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2583:1: ( ( '\"maximum\"' ) )
            // InternalJsonSchemaDsl.g:2584:1: ( '\"maximum\"' )
            {
            // InternalJsonSchemaDsl.g:2584:1: ( '\"maximum\"' )
            // InternalJsonSchemaDsl.g:2585:2: '\"maximum\"'
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MaximumSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:2594:1: rule__MaximumSchemaDefinition__Group__1 : rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2 ;
    public final void rule__MaximumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2598:1: ( rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:2599:2: rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MaximumSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaximumSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__Group__1"


    // $ANTLR start "rule__MaximumSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:2606:1: rule__MaximumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaximumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2610:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:2611:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:2611:1: ( ':' )
            // InternalJsonSchemaDsl.g:2612:2: ':'
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaximumSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MaximumSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:2621:1: rule__MaximumSchemaDefinition__Group__2 : rule__MaximumSchemaDefinition__Group__2__Impl ;
    public final void rule__MaximumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2625:1: ( rule__MaximumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:2626:2: rule__MaximumSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaximumSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__Group__2"


    // $ANTLR start "rule__MaximumSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:2632:1: rule__MaximumSchemaDefinition__Group__2__Impl : ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) ) ;
    public final void rule__MaximumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2636:1: ( ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:2637:1: ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:2637:1: ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:2638:2: ( rule__MaximumSchemaDefinition__MaximumAssignment_2 )
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumAssignment_2()); 
            // InternalJsonSchemaDsl.g:2639:2: ( rule__MaximumSchemaDefinition__MaximumAssignment_2 )
            // InternalJsonSchemaDsl.g:2639:3: rule__MaximumSchemaDefinition__MaximumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaximumSchemaDefinition__MaximumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:2648:1: rule__WriteOnlySchemaDefinition__Group__0 : rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1 ;
    public final void rule__WriteOnlySchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2652:1: ( rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2653:2: rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WriteOnlySchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteOnlySchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__Group__0"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2660:1: rule__WriteOnlySchemaDefinition__Group__0__Impl : ( '\"writeOnly\"' ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2664:1: ( ( '\"writeOnly\"' ) )
            // InternalJsonSchemaDsl.g:2665:1: ( '\"writeOnly\"' )
            {
            // InternalJsonSchemaDsl.g:2665:1: ( '\"writeOnly\"' )
            // InternalJsonSchemaDsl.g:2666:2: '\"writeOnly\"'
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:2675:1: rule__WriteOnlySchemaDefinition__Group__1 : rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2 ;
    public final void rule__WriteOnlySchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2679:1: ( rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:2680:2: rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__WriteOnlySchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteOnlySchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__Group__1"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:2687:1: rule__WriteOnlySchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2691:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:2692:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:2692:1: ( ':' )
            // InternalJsonSchemaDsl.g:2693:2: ':'
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWriteOnlySchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:2702:1: rule__WriteOnlySchemaDefinition__Group__2 : rule__WriteOnlySchemaDefinition__Group__2__Impl ;
    public final void rule__WriteOnlySchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2706:1: ( rule__WriteOnlySchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:2707:2: rule__WriteOnlySchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteOnlySchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__Group__2"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:2713:1: rule__WriteOnlySchemaDefinition__Group__2__Impl : ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2717:1: ( ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:2718:1: ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:2718:1: ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) )
            // InternalJsonSchemaDsl.g:2719:2: ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 )
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyAssignment_2()); 
            // InternalJsonSchemaDsl.g:2720:2: ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 )
            // InternalJsonSchemaDsl.g:2720:3: rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__CommentSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:2729:1: rule__CommentSchemaDefinition__Group__0 : rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1 ;
    public final void rule__CommentSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2733:1: ( rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2734:2: rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CommentSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommentSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__Group__0"


    // $ANTLR start "rule__CommentSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2741:1: rule__CommentSchemaDefinition__Group__0__Impl : ( '\"$comment\"' ) ;
    public final void rule__CommentSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2745:1: ( ( '\"$comment\"' ) )
            // InternalJsonSchemaDsl.g:2746:1: ( '\"$comment\"' )
            {
            // InternalJsonSchemaDsl.g:2746:1: ( '\"$comment\"' )
            // InternalJsonSchemaDsl.g:2747:2: '\"$comment\"'
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getCommentKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCommentSchemaDefinitionAccess().getCommentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__CommentSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:2756:1: rule__CommentSchemaDefinition__Group__1 : rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2 ;
    public final void rule__CommentSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2760:1: ( rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:2761:2: rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CommentSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommentSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__Group__1"


    // $ANTLR start "rule__CommentSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:2768:1: rule__CommentSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__CommentSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2772:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:2773:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:2773:1: ( ':' )
            // InternalJsonSchemaDsl.g:2774:2: ':'
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCommentSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__CommentSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:2783:1: rule__CommentSchemaDefinition__Group__2 : rule__CommentSchemaDefinition__Group__2__Impl ;
    public final void rule__CommentSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2787:1: ( rule__CommentSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:2788:2: rule__CommentSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommentSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__Group__2"


    // $ANTLR start "rule__CommentSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:2794:1: rule__CommentSchemaDefinition__Group__2__Impl : ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) ) ;
    public final void rule__CommentSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2798:1: ( ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:2799:1: ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:2799:1: ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) )
            // InternalJsonSchemaDsl.g:2800:2: ( rule__CommentSchemaDefinition__CommentAssignment_2 )
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getCommentAssignment_2()); 
            // InternalJsonSchemaDsl.g:2801:2: ( rule__CommentSchemaDefinition__CommentAssignment_2 )
            // InternalJsonSchemaDsl.g:2801:3: rule__CommentSchemaDefinition__CommentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommentSchemaDefinition__CommentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommentSchemaDefinitionAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:2810:1: rule__EnumSchemaDefinition__Group__0 : rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1 ;
    public final void rule__EnumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2814:1: ( rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2815:2: rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EnumSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__0"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2822:1: rule__EnumSchemaDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__EnumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2826:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:2827:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:2827:1: ( '[' )
            // InternalJsonSchemaDsl.g:2828:2: '['
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnumSchemaDefinitionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:2837:1: rule__EnumSchemaDefinition__Group__1 : rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2 ;
    public final void rule__EnumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2841:1: ( rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:2842:2: rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EnumSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__1"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:2849:1: rule__EnumSchemaDefinition__Group__1__Impl : ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) ) ;
    public final void rule__EnumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2853:1: ( ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:2854:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:2854:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:2855:2: ( rule__EnumSchemaDefinition__ItemsAssignment_1 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:2856:2: ( rule__EnumSchemaDefinition__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:2856:3: rule__EnumSchemaDefinition__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:2864:1: rule__EnumSchemaDefinition__Group__2 : rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3 ;
    public final void rule__EnumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2868:1: ( rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:2869:2: rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EnumSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__2"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:2876:1: rule__EnumSchemaDefinition__Group__2__Impl : ( ( rule__EnumSchemaDefinition__Group_2__0 )* ) ;
    public final void rule__EnumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2880:1: ( ( ( rule__EnumSchemaDefinition__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:2881:1: ( ( rule__EnumSchemaDefinition__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:2881:1: ( ( rule__EnumSchemaDefinition__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:2882:2: ( rule__EnumSchemaDefinition__Group_2__0 )*
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:2883:2: ( rule__EnumSchemaDefinition__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:2883:3: rule__EnumSchemaDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__EnumSchemaDefinition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnumSchemaDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:2891:1: rule__EnumSchemaDefinition__Group__3 : rule__EnumSchemaDefinition__Group__3__Impl ;
    public final void rule__EnumSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2895:1: ( rule__EnumSchemaDefinition__Group__3__Impl )
            // InternalJsonSchemaDsl.g:2896:2: rule__EnumSchemaDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__3"


    // $ANTLR start "rule__EnumSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:2902:1: rule__EnumSchemaDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__EnumSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2906:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:2907:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:2907:1: ( ']' )
            // InternalJsonSchemaDsl.g:2908:2: ']'
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getRightSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnumSchemaDefinitionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__EnumSchemaDefinition__Group_2__0"
    // InternalJsonSchemaDsl.g:2918:1: rule__EnumSchemaDefinition__Group_2__0 : rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1 ;
    public final void rule__EnumSchemaDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2922:1: ( rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1 )
            // InternalJsonSchemaDsl.g:2923:2: rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__EnumSchemaDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group_2__0"


    // $ANTLR start "rule__EnumSchemaDefinition__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:2930:1: rule__EnumSchemaDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumSchemaDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2934:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:2935:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:2935:1: ( ',' )
            // InternalJsonSchemaDsl.g:2936:2: ','
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumSchemaDefinitionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__EnumSchemaDefinition__Group_2__1"
    // InternalJsonSchemaDsl.g:2945:1: rule__EnumSchemaDefinition__Group_2__1 : rule__EnumSchemaDefinition__Group_2__1__Impl ;
    public final void rule__EnumSchemaDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2949:1: ( rule__EnumSchemaDefinition__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:2950:2: rule__EnumSchemaDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group_2__1"


    // $ANTLR start "rule__EnumSchemaDefinition__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:2956:1: rule__EnumSchemaDefinition__Group_2__1__Impl : ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) ) ;
    public final void rule__EnumSchemaDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2960:1: ( ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:2961:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:2961:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:2962:2: ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:2963:2: ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:2963:3: rule__EnumSchemaDefinition__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumSchemaDefinition__ItemsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:2972:1: rule__UniqueItemsSchemaDefinition__Group__0 : rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1 ;
    public final void rule__UniqueItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2976:1: ( rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2977:2: rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__UniqueItemsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueItemsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__Group__0"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:2984:1: rule__UniqueItemsSchemaDefinition__Group__0__Impl : ( '\"uniqueItems\"' ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2988:1: ( ( '\"uniqueItems\"' ) )
            // InternalJsonSchemaDsl.g:2989:1: ( '\"uniqueItems\"' )
            {
            // InternalJsonSchemaDsl.g:2989:1: ( '\"uniqueItems\"' )
            // InternalJsonSchemaDsl.g:2990:2: '\"uniqueItems\"'
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:2999:1: rule__UniqueItemsSchemaDefinition__Group__1 : rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2 ;
    public final void rule__UniqueItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3003:1: ( rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3004:2: rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__UniqueItemsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UniqueItemsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__Group__1"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3011:1: rule__UniqueItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3015:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3016:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3016:1: ( ':' )
            // InternalJsonSchemaDsl.g:3017:2: ':'
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3026:1: rule__UniqueItemsSchemaDefinition__Group__2 : rule__UniqueItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__UniqueItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3030:1: ( rule__UniqueItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3031:2: rule__UniqueItemsSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniqueItemsSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__Group__2"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3037:1: rule__UniqueItemsSchemaDefinition__Group__2__Impl : ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3041:1: ( ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3042:1: ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3042:1: ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3043:2: ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 )
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:3044:2: ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:3044:3: rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__AnyOfSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3053:1: rule__AnyOfSchemaDefinition__Group__0 : rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1 ;
    public final void rule__AnyOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3057:1: ( rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3058:2: rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AnyOfSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyOfSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__Group__0"


    // $ANTLR start "rule__AnyOfSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3065:1: rule__AnyOfSchemaDefinition__Group__0__Impl : ( '\"anyOf\"' ) ;
    public final void rule__AnyOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3069:1: ( ( '\"anyOf\"' ) )
            // InternalJsonSchemaDsl.g:3070:1: ( '\"anyOf\"' )
            {
            // InternalJsonSchemaDsl.g:3070:1: ( '\"anyOf\"' )
            // InternalJsonSchemaDsl.g:3071:2: '\"anyOf\"'
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__AnyOfSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3080:1: rule__AnyOfSchemaDefinition__Group__1 : rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2 ;
    public final void rule__AnyOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3084:1: ( rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3085:2: rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AnyOfSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnyOfSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__Group__1"


    // $ANTLR start "rule__AnyOfSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3092:1: rule__AnyOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AnyOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3096:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3097:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3097:1: ( ':' )
            // InternalJsonSchemaDsl.g:3098:2: ':'
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAnyOfSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__AnyOfSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3107:1: rule__AnyOfSchemaDefinition__Group__2 : rule__AnyOfSchemaDefinition__Group__2__Impl ;
    public final void rule__AnyOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3111:1: ( rule__AnyOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3112:2: rule__AnyOfSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnyOfSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__Group__2"


    // $ANTLR start "rule__AnyOfSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3118:1: rule__AnyOfSchemaDefinition__Group__2__Impl : ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) ) ;
    public final void rule__AnyOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3122:1: ( ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3123:1: ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3123:1: ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3124:2: ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 )
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:3125:2: ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 )
            // InternalJsonSchemaDsl.g:3125:3: rule__AnyOfSchemaDefinition__AnyOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnyOfSchemaDefinition__AnyOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__TitleSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3134:1: rule__TitleSchemaDefinition__Group__0 : rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1 ;
    public final void rule__TitleSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3138:1: ( rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3139:2: rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TitleSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TitleSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__Group__0"


    // $ANTLR start "rule__TitleSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3146:1: rule__TitleSchemaDefinition__Group__0__Impl : ( '\"title\"' ) ;
    public final void rule__TitleSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3150:1: ( ( '\"title\"' ) )
            // InternalJsonSchemaDsl.g:3151:1: ( '\"title\"' )
            {
            // InternalJsonSchemaDsl.g:3151:1: ( '\"title\"' )
            // InternalJsonSchemaDsl.g:3152:2: '\"title\"'
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getTitleKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTitleSchemaDefinitionAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__TitleSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3161:1: rule__TitleSchemaDefinition__Group__1 : rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2 ;
    public final void rule__TitleSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3165:1: ( rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3166:2: rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TitleSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TitleSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__Group__1"


    // $ANTLR start "rule__TitleSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3173:1: rule__TitleSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TitleSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3177:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3178:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3178:1: ( ':' )
            // InternalJsonSchemaDsl.g:3179:2: ':'
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTitleSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__TitleSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3188:1: rule__TitleSchemaDefinition__Group__2 : rule__TitleSchemaDefinition__Group__2__Impl ;
    public final void rule__TitleSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3192:1: ( rule__TitleSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3193:2: rule__TitleSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TitleSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__Group__2"


    // $ANTLR start "rule__TitleSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3199:1: rule__TitleSchemaDefinition__Group__2__Impl : ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) ) ;
    public final void rule__TitleSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3203:1: ( ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3204:1: ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3204:1: ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3205:2: ( rule__TitleSchemaDefinition__TitleAssignment_2 )
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getTitleAssignment_2()); 
            // InternalJsonSchemaDsl.g:3206:2: ( rule__TitleSchemaDefinition__TitleAssignment_2 )
            // InternalJsonSchemaDsl.g:3206:3: rule__TitleSchemaDefinition__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TitleSchemaDefinition__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTitleSchemaDefinitionAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3215:1: rule__ItemsSchemaDefinition__Group__0 : rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1 ;
    public final void rule__ItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3219:1: ( rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3220:2: rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ItemsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__0"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3227:1: rule__ItemsSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3231:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:3232:1: ( () )
            {
            // InternalJsonSchemaDsl.g:3232:1: ( () )
            // InternalJsonSchemaDsl.g:3233:2: ()
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:3234:2: ()
            // InternalJsonSchemaDsl.g:3234:3: 
            {
            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3242:1: rule__ItemsSchemaDefinition__Group__1 : rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2 ;
    public final void rule__ItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3246:1: ( rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3247:2: rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ItemsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__1"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3254:1: rule__ItemsSchemaDefinition__Group__1__Impl : ( 'ItemsSchemaDefinition' ) ;
    public final void rule__ItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3258:1: ( ( 'ItemsSchemaDefinition' ) )
            // InternalJsonSchemaDsl.g:3259:1: ( 'ItemsSchemaDefinition' )
            {
            // InternalJsonSchemaDsl.g:3259:1: ( 'ItemsSchemaDefinition' )
            // InternalJsonSchemaDsl.g:3260:2: 'ItemsSchemaDefinition'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3269:1: rule__ItemsSchemaDefinition__Group__2 : rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3 ;
    public final void rule__ItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3273:1: ( rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3274:2: rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ItemsSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__2"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3281:1: rule__ItemsSchemaDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__ItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3285:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:3286:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:3286:1: ( '{' )
            // InternalJsonSchemaDsl.g:3287:2: '{'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:3296:1: rule__ItemsSchemaDefinition__Group__3 : rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4 ;
    public final void rule__ItemsSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3300:1: ( rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:3301:2: rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ItemsSchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__3"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:3308:1: rule__ItemsSchemaDefinition__Group__3__Impl : ( ( rule__ItemsSchemaDefinition__Group_3__0 )? ) ;
    public final void rule__ItemsSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3312:1: ( ( ( rule__ItemsSchemaDefinition__Group_3__0 )? ) )
            // InternalJsonSchemaDsl.g:3313:1: ( ( rule__ItemsSchemaDefinition__Group_3__0 )? )
            {
            // InternalJsonSchemaDsl.g:3313:1: ( ( rule__ItemsSchemaDefinition__Group_3__0 )? )
            // InternalJsonSchemaDsl.g:3314:2: ( rule__ItemsSchemaDefinition__Group_3__0 )?
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getGroup_3()); 
            // InternalJsonSchemaDsl.g:3315:2: ( rule__ItemsSchemaDefinition__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3315:3: rule__ItemsSchemaDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ItemsSchemaDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__4"
    // InternalJsonSchemaDsl.g:3323:1: rule__ItemsSchemaDefinition__Group__4 : rule__ItemsSchemaDefinition__Group__4__Impl rule__ItemsSchemaDefinition__Group__5 ;
    public final void rule__ItemsSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3327:1: ( rule__ItemsSchemaDefinition__Group__4__Impl rule__ItemsSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:3328:2: rule__ItemsSchemaDefinition__Group__4__Impl rule__ItemsSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ItemsSchemaDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__4"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__4__Impl"
    // InternalJsonSchemaDsl.g:3335:1: rule__ItemsSchemaDefinition__Group__4__Impl : ( ( rule__ItemsSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__ItemsSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3339:1: ( ( ( rule__ItemsSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:3340:1: ( ( rule__ItemsSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:3340:1: ( ( rule__ItemsSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:3341:2: ( rule__ItemsSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:3342:2: ( rule__ItemsSchemaDefinition__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3342:3: rule__ItemsSchemaDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ItemsSchemaDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__5"
    // InternalJsonSchemaDsl.g:3350:1: rule__ItemsSchemaDefinition__Group__5 : rule__ItemsSchemaDefinition__Group__5__Impl ;
    public final void rule__ItemsSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3354:1: ( rule__ItemsSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:3355:2: rule__ItemsSchemaDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__5"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group__5__Impl"
    // InternalJsonSchemaDsl.g:3361:1: rule__ItemsSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ItemsSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3365:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:3366:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:3366:1: ( '}' )
            // InternalJsonSchemaDsl.g:3367:2: '}'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group__5__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_3__0"
    // InternalJsonSchemaDsl.g:3377:1: rule__ItemsSchemaDefinition__Group_3__0 : rule__ItemsSchemaDefinition__Group_3__0__Impl rule__ItemsSchemaDefinition__Group_3__1 ;
    public final void rule__ItemsSchemaDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3381:1: ( rule__ItemsSchemaDefinition__Group_3__0__Impl rule__ItemsSchemaDefinition__Group_3__1 )
            // InternalJsonSchemaDsl.g:3382:2: rule__ItemsSchemaDefinition__Group_3__0__Impl rule__ItemsSchemaDefinition__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ItemsSchemaDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_3__0"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_3__0__Impl"
    // InternalJsonSchemaDsl.g:3389:1: rule__ItemsSchemaDefinition__Group_3__0__Impl : ( 'itemsAnyOf1' ) ;
    public final void rule__ItemsSchemaDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3393:1: ( ( 'itemsAnyOf1' ) )
            // InternalJsonSchemaDsl.g:3394:1: ( 'itemsAnyOf1' )
            {
            // InternalJsonSchemaDsl.g:3394:1: ( 'itemsAnyOf1' )
            // InternalJsonSchemaDsl.g:3395:2: 'itemsAnyOf1'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Keyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_3__1"
    // InternalJsonSchemaDsl.g:3404:1: rule__ItemsSchemaDefinition__Group_3__1 : rule__ItemsSchemaDefinition__Group_3__1__Impl ;
    public final void rule__ItemsSchemaDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3408:1: ( rule__ItemsSchemaDefinition__Group_3__1__Impl )
            // InternalJsonSchemaDsl.g:3409:2: rule__ItemsSchemaDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_3__1"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_3__1__Impl"
    // InternalJsonSchemaDsl.g:3415:1: rule__ItemsSchemaDefinition__Group_3__1__Impl : ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 ) ) ;
    public final void rule__ItemsSchemaDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3419:1: ( ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 ) ) )
            // InternalJsonSchemaDsl.g:3420:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 ) )
            {
            // InternalJsonSchemaDsl.g:3420:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 ) )
            // InternalJsonSchemaDsl.g:3421:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 )
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Assignment_3_1()); 
            // InternalJsonSchemaDsl.g:3422:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 )
            // InternalJsonSchemaDsl.g:3422:3: rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_4__0"
    // InternalJsonSchemaDsl.g:3431:1: rule__ItemsSchemaDefinition__Group_4__0 : rule__ItemsSchemaDefinition__Group_4__0__Impl rule__ItemsSchemaDefinition__Group_4__1 ;
    public final void rule__ItemsSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3435:1: ( rule__ItemsSchemaDefinition__Group_4__0__Impl rule__ItemsSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:3436:2: rule__ItemsSchemaDefinition__Group_4__0__Impl rule__ItemsSchemaDefinition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ItemsSchemaDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_4__0"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_4__0__Impl"
    // InternalJsonSchemaDsl.g:3443:1: rule__ItemsSchemaDefinition__Group_4__0__Impl : ( 'itemsAnyOf2' ) ;
    public final void rule__ItemsSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3447:1: ( ( 'itemsAnyOf2' ) )
            // InternalJsonSchemaDsl.g:3448:1: ( 'itemsAnyOf2' )
            {
            // InternalJsonSchemaDsl.g:3448:1: ( 'itemsAnyOf2' )
            // InternalJsonSchemaDsl.g:3449:2: 'itemsAnyOf2'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Keyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_4__1"
    // InternalJsonSchemaDsl.g:3458:1: rule__ItemsSchemaDefinition__Group_4__1 : rule__ItemsSchemaDefinition__Group_4__1__Impl ;
    public final void rule__ItemsSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3462:1: ( rule__ItemsSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:3463:2: rule__ItemsSchemaDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_4__1"


    // $ANTLR start "rule__ItemsSchemaDefinition__Group_4__1__Impl"
    // InternalJsonSchemaDsl.g:3469:1: rule__ItemsSchemaDefinition__Group_4__1__Impl : ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 ) ) ;
    public final void rule__ItemsSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3473:1: ( ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 ) ) )
            // InternalJsonSchemaDsl.g:3474:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 ) )
            {
            // InternalJsonSchemaDsl.g:3474:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 ) )
            // InternalJsonSchemaDsl.g:3475:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 )
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Assignment_4_1()); 
            // InternalJsonSchemaDsl.g:3476:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 )
            // InternalJsonSchemaDsl.g:3476:3: rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3485:1: rule__DefaultSchemaDefinition__Group__0 : rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1 ;
    public final void rule__DefaultSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3489:1: ( rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3490:2: rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DefaultSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__Group__0"


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3497:1: rule__DefaultSchemaDefinition__Group__0__Impl : ( '\"default\"' ) ;
    public final void rule__DefaultSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3501:1: ( ( '\"default\"' ) )
            // InternalJsonSchemaDsl.g:3502:1: ( '\"default\"' )
            {
            // InternalJsonSchemaDsl.g:3502:1: ( '\"default\"' )
            // InternalJsonSchemaDsl.g:3503:2: '\"default\"'
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3512:1: rule__DefaultSchemaDefinition__Group__1 : rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2 ;
    public final void rule__DefaultSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3516:1: ( rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3517:2: rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DefaultSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__Group__1"


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3524:1: rule__DefaultSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3528:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3529:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3529:1: ( ':' )
            // InternalJsonSchemaDsl.g:3530:2: ':'
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefaultSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3539:1: rule__DefaultSchemaDefinition__Group__2 : rule__DefaultSchemaDefinition__Group__2__Impl ;
    public final void rule__DefaultSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3543:1: ( rule__DefaultSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3544:2: rule__DefaultSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__Group__2"


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3550:1: rule__DefaultSchemaDefinition__Group__2__Impl : ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) ) ;
    public final void rule__DefaultSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3554:1: ( ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3555:1: ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3555:1: ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3556:2: ( rule__DefaultSchemaDefinition__DefaultAssignment_2 )
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultAssignment_2()); 
            // InternalJsonSchemaDsl.g:3557:2: ( rule__DefaultSchemaDefinition__DefaultAssignment_2 )
            // InternalJsonSchemaDsl.g:3557:3: rule__DefaultSchemaDefinition__DefaultAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefaultSchemaDefinition__DefaultAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ThenSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3566:1: rule__ThenSchemaDefinition__Group__0 : rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1 ;
    public final void rule__ThenSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3570:1: ( rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3571:2: rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ThenSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThenSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__Group__0"


    // $ANTLR start "rule__ThenSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3578:1: rule__ThenSchemaDefinition__Group__0__Impl : ( '\"then\"' ) ;
    public final void rule__ThenSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3582:1: ( ( '\"then\"' ) )
            // InternalJsonSchemaDsl.g:3583:1: ( '\"then\"' )
            {
            // InternalJsonSchemaDsl.g:3583:1: ( '\"then\"' )
            // InternalJsonSchemaDsl.g:3584:2: '\"then\"'
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getThenSchemaDefinitionAccess().getThenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ThenSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3593:1: rule__ThenSchemaDefinition__Group__1 : rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2 ;
    public final void rule__ThenSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3597:1: ( rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3598:2: rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ThenSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThenSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__Group__1"


    // $ANTLR start "rule__ThenSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3605:1: rule__ThenSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ThenSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3609:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3610:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3610:1: ( ':' )
            // InternalJsonSchemaDsl.g:3611:2: ':'
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getThenSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ThenSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3620:1: rule__ThenSchemaDefinition__Group__2 : rule__ThenSchemaDefinition__Group__2__Impl ;
    public final void rule__ThenSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3624:1: ( rule__ThenSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3625:2: rule__ThenSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThenSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__Group__2"


    // $ANTLR start "rule__ThenSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3631:1: rule__ThenSchemaDefinition__Group__2__Impl : ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) ) ;
    public final void rule__ThenSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3635:1: ( ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3636:1: ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3636:1: ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3637:2: ( rule__ThenSchemaDefinition__ThenAssignment_2 )
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenAssignment_2()); 
            // InternalJsonSchemaDsl.g:3638:2: ( rule__ThenSchemaDefinition__ThenAssignment_2 )
            // InternalJsonSchemaDsl.g:3638:3: rule__ThenSchemaDefinition__ThenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ThenSchemaDefinition__ThenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThenSchemaDefinitionAccess().getThenAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MinLengthSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3647:1: rule__MinLengthSchemaDefinition__Group__0 : rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1 ;
    public final void rule__MinLengthSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3651:1: ( rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3652:2: rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MinLengthSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLengthSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__Group__0"


    // $ANTLR start "rule__MinLengthSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3659:1: rule__MinLengthSchemaDefinition__Group__0__Impl : ( '\"minLength\"' ) ;
    public final void rule__MinLengthSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3663:1: ( ( '\"minLength\"' ) )
            // InternalJsonSchemaDsl.g:3664:1: ( '\"minLength\"' )
            {
            // InternalJsonSchemaDsl.g:3664:1: ( '\"minLength\"' )
            // InternalJsonSchemaDsl.g:3665:2: '\"minLength\"'
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MinLengthSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3674:1: rule__MinLengthSchemaDefinition__Group__1 : rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2 ;
    public final void rule__MinLengthSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3678:1: ( rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3679:2: rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MinLengthSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLengthSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__Group__1"


    // $ANTLR start "rule__MinLengthSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3686:1: rule__MinLengthSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinLengthSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3690:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3691:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3691:1: ( ':' )
            // InternalJsonSchemaDsl.g:3692:2: ':'
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMinLengthSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MinLengthSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3701:1: rule__MinLengthSchemaDefinition__Group__2 : rule__MinLengthSchemaDefinition__Group__2__Impl ;
    public final void rule__MinLengthSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3705:1: ( rule__MinLengthSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3706:2: rule__MinLengthSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinLengthSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__Group__2"


    // $ANTLR start "rule__MinLengthSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3712:1: rule__MinLengthSchemaDefinition__Group__2__Impl : ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) ) ;
    public final void rule__MinLengthSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3716:1: ( ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3717:1: ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3717:1: ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3718:2: ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 )
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthAssignment_2()); 
            // InternalJsonSchemaDsl.g:3719:2: ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 )
            // InternalJsonSchemaDsl.g:3719:3: rule__MinLengthSchemaDefinition__MinLengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MinLengthSchemaDefinition__MinLengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3728:1: rule__DefinitionsSchemaDefinition__Group__0 : rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3732:1: ( rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3733:2: rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DefinitionsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__0"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:3740:1: rule__DefinitionsSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3744:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:3745:1: ( () )
            {
            // InternalJsonSchemaDsl.g:3745:1: ( () )
            // InternalJsonSchemaDsl.g:3746:2: ()
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:3747:2: ()
            // InternalJsonSchemaDsl.g:3747:3: 
            {
            }

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsSchemaDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:3755:1: rule__DefinitionsSchemaDefinition__Group__1 : rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2 ;
    public final void rule__DefinitionsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3759:1: ( rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3760:2: rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DefinitionsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__1"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:3767:1: rule__DefinitionsSchemaDefinition__Group__1__Impl : ( '\"definitions\"' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3771:1: ( ( '\"definitions\"' ) )
            // InternalJsonSchemaDsl.g:3772:1: ( '\"definitions\"' )
            {
            // InternalJsonSchemaDsl.g:3772:1: ( '\"definitions\"' )
            // InternalJsonSchemaDsl.g:3773:2: '\"definitions\"'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:3782:1: rule__DefinitionsSchemaDefinition__Group__2 : rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3 ;
    public final void rule__DefinitionsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3786:1: ( rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3787:2: rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DefinitionsSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__2"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:3794:1: rule__DefinitionsSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3798:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3799:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3799:1: ( ':' )
            // InternalJsonSchemaDsl.g:3800:2: ':'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:3809:1: rule__DefinitionsSchemaDefinition__Group__3 : rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4 ;
    public final void rule__DefinitionsSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3813:1: ( rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:3814:2: rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DefinitionsSchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__3"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:3821:1: rule__DefinitionsSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3825:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:3826:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:3826:1: ( '{' )
            // InternalJsonSchemaDsl.g:3827:2: '{'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__4"
    // InternalJsonSchemaDsl.g:3836:1: rule__DefinitionsSchemaDefinition__Group__4 : rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5 ;
    public final void rule__DefinitionsSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3840:1: ( rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:3841:2: rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DefinitionsSchemaDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__4"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__4__Impl"
    // InternalJsonSchemaDsl.g:3848:1: rule__DefinitionsSchemaDefinition__Group__4__Impl : ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3852:1: ( ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:3853:1: ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:3853:1: ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:3854:2: ( rule__DefinitionsSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:3855:2: ( rule__DefinitionsSchemaDefinition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3855:3: rule__DefinitionsSchemaDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefinitionsSchemaDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__5"
    // InternalJsonSchemaDsl.g:3863:1: rule__DefinitionsSchemaDefinition__Group__5 : rule__DefinitionsSchemaDefinition__Group__5__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3867:1: ( rule__DefinitionsSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:3868:2: rule__DefinitionsSchemaDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__5"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group__5__Impl"
    // InternalJsonSchemaDsl.g:3874:1: rule__DefinitionsSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3878:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:3879:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:3879:1: ( '}' )
            // InternalJsonSchemaDsl.g:3880:2: '}'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group__5__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4__0"
    // InternalJsonSchemaDsl.g:3890:1: rule__DefinitionsSchemaDefinition__Group_4__0 : rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3894:1: ( rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:3895:2: rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__DefinitionsSchemaDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4__0"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4__0__Impl"
    // InternalJsonSchemaDsl.g:3902:1: rule__DefinitionsSchemaDefinition__Group_4__0__Impl : ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3906:1: ( ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:3907:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:3907:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:3908:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:3909:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:3909:3: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4__1"
    // InternalJsonSchemaDsl.g:3917:1: rule__DefinitionsSchemaDefinition__Group_4__1 : rule__DefinitionsSchemaDefinition__Group_4__1__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3921:1: ( rule__DefinitionsSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:3922:2: rule__DefinitionsSchemaDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4__1"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4__1__Impl"
    // InternalJsonSchemaDsl.g:3928:1: rule__DefinitionsSchemaDefinition__Group_4__1__Impl : ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3932:1: ( ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:3933:1: ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:3933:1: ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:3934:2: ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:3935:2: ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3935:3: rule__DefinitionsSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DefinitionsSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4_1__0"
    // InternalJsonSchemaDsl.g:3944:1: rule__DefinitionsSchemaDefinition__Group_4_1__0 : rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3948:1: ( rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:3949:2: rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4_1__0"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl"
    // InternalJsonSchemaDsl.g:3956:1: rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3960:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:3961:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:3961:1: ( ',' )
            // InternalJsonSchemaDsl.g:3962:2: ','
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4_1__1"
    // InternalJsonSchemaDsl.g:3971:1: rule__DefinitionsSchemaDefinition__Group_4_1__1 : rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3975:1: ( rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:3976:2: rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4_1__1"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl"
    // InternalJsonSchemaDsl.g:3982:1: rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl : ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3986:1: ( ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:3987:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:3987:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:3988:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:3989:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:3989:3: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__MinItemsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3998:1: rule__MinItemsSchemaDefinition__Group__0 : rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1 ;
    public final void rule__MinItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4002:1: ( rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4003:2: rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MinItemsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinItemsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__Group__0"


    // $ANTLR start "rule__MinItemsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4010:1: rule__MinItemsSchemaDefinition__Group__0__Impl : ( '\"minItems\"' ) ;
    public final void rule__MinItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4014:1: ( ( '\"minItems\"' ) )
            // InternalJsonSchemaDsl.g:4015:1: ( '\"minItems\"' )
            {
            // InternalJsonSchemaDsl.g:4015:1: ( '\"minItems\"' )
            // InternalJsonSchemaDsl.g:4016:2: '\"minItems\"'
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MinItemsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4025:1: rule__MinItemsSchemaDefinition__Group__1 : rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2 ;
    public final void rule__MinItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4029:1: ( rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4030:2: rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MinItemsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinItemsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__Group__1"


    // $ANTLR start "rule__MinItemsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4037:1: rule__MinItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4041:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4042:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4042:1: ( ':' )
            // InternalJsonSchemaDsl.g:4043:2: ':'
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMinItemsSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MinItemsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4052:1: rule__MinItemsSchemaDefinition__Group__2 : rule__MinItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__MinItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4056:1: ( rule__MinItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4057:2: rule__MinItemsSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinItemsSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__Group__2"


    // $ANTLR start "rule__MinItemsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4063:1: rule__MinItemsSchemaDefinition__Group__2__Impl : ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) ) ;
    public final void rule__MinItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4067:1: ( ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4068:1: ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4068:1: ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4069:2: ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 )
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:4070:2: ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:4070:3: rule__MinItemsSchemaDefinition__MinItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MinItemsSchemaDefinition__MinItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__OneOfSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4079:1: rule__OneOfSchemaDefinition__Group__0 : rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1 ;
    public final void rule__OneOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4083:1: ( rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4084:2: rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OneOfSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOfSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__Group__0"


    // $ANTLR start "rule__OneOfSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4091:1: rule__OneOfSchemaDefinition__Group__0__Impl : ( '\"oneOf\"' ) ;
    public final void rule__OneOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4095:1: ( ( '\"oneOf\"' ) )
            // InternalJsonSchemaDsl.g:4096:1: ( '\"oneOf\"' )
            {
            // InternalJsonSchemaDsl.g:4096:1: ( '\"oneOf\"' )
            // InternalJsonSchemaDsl.g:4097:2: '\"oneOf\"'
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__OneOfSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4106:1: rule__OneOfSchemaDefinition__Group__1 : rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2 ;
    public final void rule__OneOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4110:1: ( rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4111:2: rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__OneOfSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOfSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__Group__1"


    // $ANTLR start "rule__OneOfSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4118:1: rule__OneOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__OneOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4122:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4123:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4123:1: ( ':' )
            // InternalJsonSchemaDsl.g:4124:2: ':'
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOneOfSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__OneOfSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4133:1: rule__OneOfSchemaDefinition__Group__2 : rule__OneOfSchemaDefinition__Group__2__Impl ;
    public final void rule__OneOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4137:1: ( rule__OneOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4138:2: rule__OneOfSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneOfSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__Group__2"


    // $ANTLR start "rule__OneOfSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4144:1: rule__OneOfSchemaDefinition__Group__2__Impl : ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) ) ;
    public final void rule__OneOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4148:1: ( ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4149:1: ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4149:1: ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4150:2: ( rule__OneOfSchemaDefinition__OneOfAssignment_2 )
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:4151:2: ( rule__OneOfSchemaDefinition__OneOfAssignment_2 )
            // InternalJsonSchemaDsl.g:4151:3: rule__OneOfSchemaDefinition__OneOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OneOfSchemaDefinition__OneOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4160:1: rule__MaxPropertiesSchemaDefinition__Group__0 : rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1 ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4164:1: ( rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4165:2: rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MaxPropertiesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPropertiesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__Group__0"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4172:1: rule__MaxPropertiesSchemaDefinition__Group__0__Impl : ( '\"maxProperties\"' ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4176:1: ( ( '\"maxProperties\"' ) )
            // InternalJsonSchemaDsl.g:4177:1: ( '\"maxProperties\"' )
            {
            // InternalJsonSchemaDsl.g:4177:1: ( '\"maxProperties\"' )
            // InternalJsonSchemaDsl.g:4178:2: '\"maxProperties\"'
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4187:1: rule__MaxPropertiesSchemaDefinition__Group__1 : rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2 ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4191:1: ( rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4192:2: rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MaxPropertiesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxPropertiesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__Group__1"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4199:1: rule__MaxPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4203:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4204:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4204:1: ( ':' )
            // InternalJsonSchemaDsl.g:4205:2: ':'
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4214:1: rule__MaxPropertiesSchemaDefinition__Group__2 : rule__MaxPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4218:1: ( rule__MaxPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4219:2: rule__MaxPropertiesSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxPropertiesSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__Group__2"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4225:1: rule__MaxPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4229:1: ( ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4230:1: ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4230:1: ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4231:2: ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 )
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:4232:2: ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:4232:3: rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MinimumSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4241:1: rule__MinimumSchemaDefinition__Group__0 : rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1 ;
    public final void rule__MinimumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4245:1: ( rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4246:2: rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MinimumSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinimumSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__Group__0"


    // $ANTLR start "rule__MinimumSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4253:1: rule__MinimumSchemaDefinition__Group__0__Impl : ( '\"minimum\"' ) ;
    public final void rule__MinimumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4257:1: ( ( '\"minimum\"' ) )
            // InternalJsonSchemaDsl.g:4258:1: ( '\"minimum\"' )
            {
            // InternalJsonSchemaDsl.g:4258:1: ( '\"minimum\"' )
            // InternalJsonSchemaDsl.g:4259:2: '\"minimum\"'
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MinimumSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4268:1: rule__MinimumSchemaDefinition__Group__1 : rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2 ;
    public final void rule__MinimumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4272:1: ( rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4273:2: rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MinimumSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinimumSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__Group__1"


    // $ANTLR start "rule__MinimumSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4280:1: rule__MinimumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinimumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4284:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4285:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4285:1: ( ':' )
            // InternalJsonSchemaDsl.g:4286:2: ':'
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMinimumSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MinimumSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4295:1: rule__MinimumSchemaDefinition__Group__2 : rule__MinimumSchemaDefinition__Group__2__Impl ;
    public final void rule__MinimumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4299:1: ( rule__MinimumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4300:2: rule__MinimumSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinimumSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__Group__2"


    // $ANTLR start "rule__MinimumSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4306:1: rule__MinimumSchemaDefinition__Group__2__Impl : ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) ) ;
    public final void rule__MinimumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4310:1: ( ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4311:1: ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4311:1: ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4312:2: ( rule__MinimumSchemaDefinition__MinimumAssignment_2 )
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumAssignment_2()); 
            // InternalJsonSchemaDsl.g:4313:2: ( rule__MinimumSchemaDefinition__MinimumAssignment_2 )
            // InternalJsonSchemaDsl.g:4313:3: rule__MinimumSchemaDefinition__MinimumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MinimumSchemaDefinition__MinimumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4322:1: rule__MaxItemsSchemaDefinition__Group__0 : rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1 ;
    public final void rule__MaxItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4326:1: ( rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4327:2: rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MaxItemsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxItemsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__Group__0"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4334:1: rule__MaxItemsSchemaDefinition__Group__0__Impl : ( '\"maxItems\"' ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4338:1: ( ( '\"maxItems\"' ) )
            // InternalJsonSchemaDsl.g:4339:1: ( '\"maxItems\"' )
            {
            // InternalJsonSchemaDsl.g:4339:1: ( '\"maxItems\"' )
            // InternalJsonSchemaDsl.g:4340:2: '\"maxItems\"'
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4349:1: rule__MaxItemsSchemaDefinition__Group__1 : rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2 ;
    public final void rule__MaxItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4353:1: ( rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4354:2: rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MaxItemsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxItemsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__Group__1"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4361:1: rule__MaxItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4365:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4366:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4366:1: ( ':' )
            // InternalJsonSchemaDsl.g:4367:2: ':'
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaxItemsSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4376:1: rule__MaxItemsSchemaDefinition__Group__2 : rule__MaxItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4380:1: ( rule__MaxItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4381:2: rule__MaxItemsSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxItemsSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__Group__2"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4387:1: rule__MaxItemsSchemaDefinition__Group__2__Impl : ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4391:1: ( ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4392:1: ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4392:1: ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4393:2: ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 )
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:4394:2: ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:4394:3: rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__FormatSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4403:1: rule__FormatSchemaDefinition__Group__0 : rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1 ;
    public final void rule__FormatSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4407:1: ( rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4408:2: rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormatSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormatSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__Group__0"


    // $ANTLR start "rule__FormatSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4415:1: rule__FormatSchemaDefinition__Group__0__Impl : ( '\"format\"' ) ;
    public final void rule__FormatSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4419:1: ( ( '\"format\"' ) )
            // InternalJsonSchemaDsl.g:4420:1: ( '\"format\"' )
            {
            // InternalJsonSchemaDsl.g:4420:1: ( '\"format\"' )
            // InternalJsonSchemaDsl.g:4421:2: '\"format\"'
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFormatSchemaDefinitionAccess().getFormatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__FormatSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4430:1: rule__FormatSchemaDefinition__Group__1 : rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2 ;
    public final void rule__FormatSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4434:1: ( rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4435:2: rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__FormatSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormatSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__Group__1"


    // $ANTLR start "rule__FormatSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4442:1: rule__FormatSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FormatSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4446:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4447:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4447:1: ( ':' )
            // InternalJsonSchemaDsl.g:4448:2: ':'
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFormatSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__FormatSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4457:1: rule__FormatSchemaDefinition__Group__2 : rule__FormatSchemaDefinition__Group__2__Impl ;
    public final void rule__FormatSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4461:1: ( rule__FormatSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4462:2: rule__FormatSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormatSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__Group__2"


    // $ANTLR start "rule__FormatSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4468:1: rule__FormatSchemaDefinition__Group__2__Impl : ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) ) ;
    public final void rule__FormatSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4472:1: ( ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4473:1: ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4473:1: ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4474:2: ( rule__FormatSchemaDefinition__FormatAssignment_2 )
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatAssignment_2()); 
            // InternalJsonSchemaDsl.g:4475:2: ( rule__FormatSchemaDefinition__FormatAssignment_2 )
            // InternalJsonSchemaDsl.g:4475:3: rule__FormatSchemaDefinition__FormatAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FormatSchemaDefinition__FormatAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormatSchemaDefinitionAccess().getFormatAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4484:1: rule__ReadOnlySchemaDefinition__Group__0 : rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1 ;
    public final void rule__ReadOnlySchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4488:1: ( rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4489:2: rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReadOnlySchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadOnlySchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__Group__0"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4496:1: rule__ReadOnlySchemaDefinition__Group__0__Impl : ( '\"readOnly\"' ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4500:1: ( ( '\"readOnly\"' ) )
            // InternalJsonSchemaDsl.g:4501:1: ( '\"readOnly\"' )
            {
            // InternalJsonSchemaDsl.g:4501:1: ( '\"readOnly\"' )
            // InternalJsonSchemaDsl.g:4502:2: '\"readOnly\"'
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4511:1: rule__ReadOnlySchemaDefinition__Group__1 : rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2 ;
    public final void rule__ReadOnlySchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4515:1: ( rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4516:2: rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ReadOnlySchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadOnlySchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__Group__1"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4523:1: rule__ReadOnlySchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4527:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4528:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4528:1: ( ':' )
            // InternalJsonSchemaDsl.g:4529:2: ':'
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReadOnlySchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4538:1: rule__ReadOnlySchemaDefinition__Group__2 : rule__ReadOnlySchemaDefinition__Group__2__Impl ;
    public final void rule__ReadOnlySchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4542:1: ( rule__ReadOnlySchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4543:2: rule__ReadOnlySchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlySchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__Group__2"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4549:1: rule__ReadOnlySchemaDefinition__Group__2__Impl : ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4553:1: ( ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4554:1: ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4554:1: ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4555:2: ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 )
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyAssignment_2()); 
            // InternalJsonSchemaDsl.g:4556:2: ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 )
            // InternalJsonSchemaDsl.g:4556:3: rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4565:1: rule__TypeSchemaDefinition__Group__0 : rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1 ;
    public final void rule__TypeSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4569:1: ( rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4570:2: rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__TypeSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__0"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4577:1: rule__TypeSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__TypeSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4581:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:4582:1: ( () )
            {
            // InternalJsonSchemaDsl.g:4582:1: ( () )
            // InternalJsonSchemaDsl.g:4583:2: ()
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:4584:2: ()
            // InternalJsonSchemaDsl.g:4584:3: 
            {
            }

             after(grammarAccess.getTypeSchemaDefinitionAccess().getTypeSchemaDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4592:1: rule__TypeSchemaDefinition__Group__1 : rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2 ;
    public final void rule__TypeSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4596:1: ( rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4597:2: rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TypeSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__1"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4604:1: rule__TypeSchemaDefinition__Group__1__Impl : ( '\"type\"' ) ;
    public final void rule__TypeSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4608:1: ( ( '\"type\"' ) )
            // InternalJsonSchemaDsl.g:4609:1: ( '\"type\"' )
            {
            // InternalJsonSchemaDsl.g:4609:1: ( '\"type\"' )
            // InternalJsonSchemaDsl.g:4610:2: '\"type\"'
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTypeSchemaDefinitionAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4619:1: rule__TypeSchemaDefinition__Group__2 : rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3 ;
    public final void rule__TypeSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4623:1: ( rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:4624:2: rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__TypeSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__2"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4631:1: rule__TypeSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__TypeSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4635:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4636:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4636:1: ( ':' )
            // InternalJsonSchemaDsl.g:4637:2: ':'
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeSchemaDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:4646:1: rule__TypeSchemaDefinition__Group__3 : rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4 ;
    public final void rule__TypeSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4650:1: ( rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:4651:2: rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__TypeSchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__3"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:4658:1: rule__TypeSchemaDefinition__Group__3__Impl : ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? ) ;
    public final void rule__TypeSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4662:1: ( ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? ) )
            // InternalJsonSchemaDsl.g:4663:1: ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? )
            {
            // InternalJsonSchemaDsl.g:4663:1: ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? )
            // InternalJsonSchemaDsl.g:4664:2: ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )?
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1Assignment_3()); 
            // InternalJsonSchemaDsl.g:4665:2: ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=20)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4665:3: rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__4"
    // InternalJsonSchemaDsl.g:4673:1: rule__TypeSchemaDefinition__Group__4 : rule__TypeSchemaDefinition__Group__4__Impl ;
    public final void rule__TypeSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4677:1: ( rule__TypeSchemaDefinition__Group__4__Impl )
            // InternalJsonSchemaDsl.g:4678:2: rule__TypeSchemaDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeSchemaDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__4"


    // $ANTLR start "rule__TypeSchemaDefinition__Group__4__Impl"
    // InternalJsonSchemaDsl.g:4684:1: rule__TypeSchemaDefinition__Group__4__Impl : ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? ) ;
    public final void rule__TypeSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4688:1: ( ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? ) )
            // InternalJsonSchemaDsl.g:4689:1: ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? )
            {
            // InternalJsonSchemaDsl.g:4689:1: ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? )
            // InternalJsonSchemaDsl.g:4690:2: ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )?
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2Assignment_4()); 
            // InternalJsonSchemaDsl.g:4691:2: ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4691:3: rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4700:1: rule__AdditionalPropertiesSchemaDefinition__Group__0 : rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1 ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4704:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4705:2: rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalPropertiesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__Group__0"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4712:1: rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl : ( '\"additionalProperties\"' ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4716:1: ( ( '\"additionalProperties\"' ) )
            // InternalJsonSchemaDsl.g:4717:1: ( '\"additionalProperties\"' )
            {
            // InternalJsonSchemaDsl.g:4717:1: ( '\"additionalProperties\"' )
            // InternalJsonSchemaDsl.g:4718:2: '\"additionalProperties\"'
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4727:1: rule__AdditionalPropertiesSchemaDefinition__Group__1 : rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2 ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4731:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4732:2: rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalPropertiesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__Group__1"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4739:1: rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4743:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4744:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4744:1: ( ':' )
            // InternalJsonSchemaDsl.g:4745:2: ':'
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4754:1: rule__AdditionalPropertiesSchemaDefinition__Group__2 : rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4758:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4759:2: rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__Group__2"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4765:1: rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4769:1: ( ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4770:1: ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4770:1: ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4771:2: ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 )
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:4772:2: ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:4772:3: rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ElseSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4781:1: rule__ElseSchemaDefinition__Group__0 : rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1 ;
    public final void rule__ElseSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4785:1: ( rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4786:2: rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ElseSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__Group__0"


    // $ANTLR start "rule__ElseSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4793:1: rule__ElseSchemaDefinition__Group__0__Impl : ( '\"else\"' ) ;
    public final void rule__ElseSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4797:1: ( ( '\"else\"' ) )
            // InternalJsonSchemaDsl.g:4798:1: ( '\"else\"' )
            {
            // InternalJsonSchemaDsl.g:4798:1: ( '\"else\"' )
            // InternalJsonSchemaDsl.g:4799:2: '\"else\"'
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getElseSchemaDefinitionAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ElseSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4808:1: rule__ElseSchemaDefinition__Group__1 : rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2 ;
    public final void rule__ElseSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4812:1: ( rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4813:2: rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ElseSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__Group__1"


    // $ANTLR start "rule__ElseSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4820:1: rule__ElseSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ElseSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4824:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4825:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4825:1: ( ':' )
            // InternalJsonSchemaDsl.g:4826:2: ':'
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getElseSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ElseSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4835:1: rule__ElseSchemaDefinition__Group__2 : rule__ElseSchemaDefinition__Group__2__Impl ;
    public final void rule__ElseSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4839:1: ( rule__ElseSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4840:2: rule__ElseSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__Group__2"


    // $ANTLR start "rule__ElseSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4846:1: rule__ElseSchemaDefinition__Group__2__Impl : ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) ) ;
    public final void rule__ElseSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4850:1: ( ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4851:1: ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4851:1: ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4852:2: ( rule__ElseSchemaDefinition__ElseAssignment_2 )
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseAssignment_2()); 
            // InternalJsonSchemaDsl.g:4853:2: ( rule__ElseSchemaDefinition__ElseAssignment_2 )
            // InternalJsonSchemaDsl.g:4853:3: rule__ElseSchemaDefinition__ElseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseSchemaDefinition__ElseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseSchemaDefinitionAccess().getElseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__IdSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4862:1: rule__IdSchemaDefinition__Group__0 : rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1 ;
    public final void rule__IdSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4866:1: ( rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4867:2: rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IdSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__Group__0"


    // $ANTLR start "rule__IdSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4874:1: rule__IdSchemaDefinition__Group__0__Impl : ( '\"$id\"' ) ;
    public final void rule__IdSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4878:1: ( ( '\"$id\"' ) )
            // InternalJsonSchemaDsl.g:4879:1: ( '\"$id\"' )
            {
            // InternalJsonSchemaDsl.g:4879:1: ( '\"$id\"' )
            // InternalJsonSchemaDsl.g:4880:2: '\"$id\"'
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getIdKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getIdSchemaDefinitionAccess().getIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__IdSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4889:1: rule__IdSchemaDefinition__Group__1 : rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2 ;
    public final void rule__IdSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4893:1: ( rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4894:2: rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__IdSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__Group__1"


    // $ANTLR start "rule__IdSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4901:1: rule__IdSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__IdSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4905:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4906:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4906:1: ( ':' )
            // InternalJsonSchemaDsl.g:4907:2: ':'
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIdSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__IdSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4916:1: rule__IdSchemaDefinition__Group__2 : rule__IdSchemaDefinition__Group__2__Impl ;
    public final void rule__IdSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4920:1: ( rule__IdSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4921:2: rule__IdSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__Group__2"


    // $ANTLR start "rule__IdSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:4927:1: rule__IdSchemaDefinition__Group__2__Impl : ( ( rule__IdSchemaDefinition__IdAssignment_2 ) ) ;
    public final void rule__IdSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4931:1: ( ( ( rule__IdSchemaDefinition__IdAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4932:1: ( ( rule__IdSchemaDefinition__IdAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4932:1: ( ( rule__IdSchemaDefinition__IdAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4933:2: ( rule__IdSchemaDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getIdAssignment_2()); 
            // InternalJsonSchemaDsl.g:4934:2: ( rule__IdSchemaDefinition__IdAssignment_2 )
            // InternalJsonSchemaDsl.g:4934:3: rule__IdSchemaDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IdSchemaDefinition__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIdSchemaDefinitionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ConstSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:4943:1: rule__ConstSchemaDefinition__Group__0 : rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1 ;
    public final void rule__ConstSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4947:1: ( rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4948:2: rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ConstSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__Group__0"


    // $ANTLR start "rule__ConstSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:4955:1: rule__ConstSchemaDefinition__Group__0__Impl : ( '\"const\"' ) ;
    public final void rule__ConstSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4959:1: ( ( '\"const\"' ) )
            // InternalJsonSchemaDsl.g:4960:1: ( '\"const\"' )
            {
            // InternalJsonSchemaDsl.g:4960:1: ( '\"const\"' )
            // InternalJsonSchemaDsl.g:4961:2: '\"const\"'
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getConstSchemaDefinitionAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ConstSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:4970:1: rule__ConstSchemaDefinition__Group__1 : rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2 ;
    public final void rule__ConstSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4974:1: ( rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4975:2: rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ConstSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__Group__1"


    // $ANTLR start "rule__ConstSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:4982:1: rule__ConstSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ConstSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4986:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4987:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4987:1: ( ':' )
            // InternalJsonSchemaDsl.g:4988:2: ':'
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConstSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ConstSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:4997:1: rule__ConstSchemaDefinition__Group__2 : rule__ConstSchemaDefinition__Group__2__Impl ;
    public final void rule__ConstSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5001:1: ( rule__ConstSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5002:2: rule__ConstSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__Group__2"


    // $ANTLR start "rule__ConstSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5008:1: rule__ConstSchemaDefinition__Group__2__Impl : ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) ) ;
    public final void rule__ConstSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5012:1: ( ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5013:1: ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5013:1: ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5014:2: ( rule__ConstSchemaDefinition__ConstAssignment_2 )
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstAssignment_2()); 
            // InternalJsonSchemaDsl.g:5015:2: ( rule__ConstSchemaDefinition__ConstAssignment_2 )
            // InternalJsonSchemaDsl.g:5015:3: rule__ConstSchemaDefinition__ConstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConstSchemaDefinition__ConstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstSchemaDefinitionAccess().getConstAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__RequiredSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5024:1: rule__RequiredSchemaDefinition__Group__0 : rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1 ;
    public final void rule__RequiredSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5028:1: ( rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5029:2: rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RequiredSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__Group__0"


    // $ANTLR start "rule__RequiredSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5036:1: rule__RequiredSchemaDefinition__Group__0__Impl : ( '\"required\"' ) ;
    public final void rule__RequiredSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5040:1: ( ( '\"required\"' ) )
            // InternalJsonSchemaDsl.g:5041:1: ( '\"required\"' )
            {
            // InternalJsonSchemaDsl.g:5041:1: ( '\"required\"' )
            // InternalJsonSchemaDsl.g:5042:2: '\"required\"'
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__RequiredSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5051:1: rule__RequiredSchemaDefinition__Group__1 : rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2 ;
    public final void rule__RequiredSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5055:1: ( rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5056:2: rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RequiredSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__Group__1"


    // $ANTLR start "rule__RequiredSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5063:1: rule__RequiredSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RequiredSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5067:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5068:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5068:1: ( ':' )
            // InternalJsonSchemaDsl.g:5069:2: ':'
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRequiredSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__RequiredSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:5078:1: rule__RequiredSchemaDefinition__Group__2 : rule__RequiredSchemaDefinition__Group__2__Impl ;
    public final void rule__RequiredSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5082:1: ( rule__RequiredSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5083:2: rule__RequiredSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__Group__2"


    // $ANTLR start "rule__RequiredSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5089:1: rule__RequiredSchemaDefinition__Group__2__Impl : ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) ) ;
    public final void rule__RequiredSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5093:1: ( ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5094:1: ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5094:1: ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5095:2: ( rule__RequiredSchemaDefinition__RequiredAssignment_2 )
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredAssignment_2()); 
            // InternalJsonSchemaDsl.g:5096:2: ( rule__RequiredSchemaDefinition__RequiredAssignment_2 )
            // InternalJsonSchemaDsl.g:5096:3: rule__RequiredSchemaDefinition__RequiredAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequiredSchemaDefinition__RequiredAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__DescriptionSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5105:1: rule__DescriptionSchemaDefinition__Group__0 : rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1 ;
    public final void rule__DescriptionSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5109:1: ( rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5110:2: rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DescriptionSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__Group__0"


    // $ANTLR start "rule__DescriptionSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5117:1: rule__DescriptionSchemaDefinition__Group__0__Impl : ( '\"description\"' ) ;
    public final void rule__DescriptionSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5121:1: ( ( '\"description\"' ) )
            // InternalJsonSchemaDsl.g:5122:1: ( '\"description\"' )
            {
            // InternalJsonSchemaDsl.g:5122:1: ( '\"description\"' )
            // InternalJsonSchemaDsl.g:5123:2: '\"description\"'
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__DescriptionSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5132:1: rule__DescriptionSchemaDefinition__Group__1 : rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2 ;
    public final void rule__DescriptionSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5136:1: ( rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5137:2: rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DescriptionSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__Group__1"


    // $ANTLR start "rule__DescriptionSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5144:1: rule__DescriptionSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DescriptionSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5148:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5149:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5149:1: ( ':' )
            // InternalJsonSchemaDsl.g:5150:2: ':'
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDescriptionSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__DescriptionSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:5159:1: rule__DescriptionSchemaDefinition__Group__2 : rule__DescriptionSchemaDefinition__Group__2__Impl ;
    public final void rule__DescriptionSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5163:1: ( rule__DescriptionSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5164:2: rule__DescriptionSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__Group__2"


    // $ANTLR start "rule__DescriptionSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5170:1: rule__DescriptionSchemaDefinition__Group__2__Impl : ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) ) ;
    public final void rule__DescriptionSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5174:1: ( ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5175:1: ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5175:1: ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5176:2: ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionAssignment_2()); 
            // InternalJsonSchemaDsl.g:5177:2: ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 )
            // InternalJsonSchemaDsl.g:5177:3: rule__DescriptionSchemaDefinition__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionSchemaDefinition__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5186:1: rule__MinPropertiesSchemaDefinition__Group__0 : rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1 ;
    public final void rule__MinPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5190:1: ( rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5191:2: rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MinPropertiesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinPropertiesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__Group__0"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5198:1: rule__MinPropertiesSchemaDefinition__Group__0__Impl : ( '\"minProperties\"' ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5202:1: ( ( '\"minProperties\"' ) )
            // InternalJsonSchemaDsl.g:5203:1: ( '\"minProperties\"' )
            {
            // InternalJsonSchemaDsl.g:5203:1: ( '\"minProperties\"' )
            // InternalJsonSchemaDsl.g:5204:2: '\"minProperties\"'
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5213:1: rule__MinPropertiesSchemaDefinition__Group__1 : rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2 ;
    public final void rule__MinPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5217:1: ( rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5218:2: rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MinPropertiesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinPropertiesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__Group__1"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5225:1: rule__MinPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5229:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5230:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5230:1: ( ':' )
            // InternalJsonSchemaDsl.g:5231:2: ':'
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:5240:1: rule__MinPropertiesSchemaDefinition__Group__2 : rule__MinPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__MinPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5244:1: ( rule__MinPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5245:2: rule__MinPropertiesSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinPropertiesSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__Group__2"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5251:1: rule__MinPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5255:1: ( ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5256:1: ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5256:1: ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5257:2: ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 )
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:5258:2: ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:5258:3: rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5267:1: rule__PatternPropertiesSchemaDefinition__Group__0 : rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5271:1: ( rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5272:2: rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__PatternPropertiesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__0"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5279:1: rule__PatternPropertiesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5283:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:5284:1: ( () )
            {
            // InternalJsonSchemaDsl.g:5284:1: ( () )
            // InternalJsonSchemaDsl.g:5285:2: ()
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:5286:2: ()
            // InternalJsonSchemaDsl.g:5286:3: 
            {
            }

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesSchemaDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5294:1: rule__PatternPropertiesSchemaDefinition__Group__1 : rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5298:1: ( rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5299:2: rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PatternPropertiesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__1"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5306:1: rule__PatternPropertiesSchemaDefinition__Group__1__Impl : ( '\"patternProperties\"' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5310:1: ( ( '\"patternProperties\"' ) )
            // InternalJsonSchemaDsl.g:5311:1: ( '\"patternProperties\"' )
            {
            // InternalJsonSchemaDsl.g:5311:1: ( '\"patternProperties\"' )
            // InternalJsonSchemaDsl.g:5312:2: '\"patternProperties\"'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:5321:1: rule__PatternPropertiesSchemaDefinition__Group__2 : rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5325:1: ( rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:5326:2: rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PatternPropertiesSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__2"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5333:1: rule__PatternPropertiesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5337:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5338:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5338:1: ( ':' )
            // InternalJsonSchemaDsl.g:5339:2: ':'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:5348:1: rule__PatternPropertiesSchemaDefinition__Group__3 : rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5352:1: ( rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:5353:2: rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PatternPropertiesSchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__3"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:5360:1: rule__PatternPropertiesSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5364:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:5365:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:5365:1: ( '{' )
            // InternalJsonSchemaDsl.g:5366:2: '{'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__4"
    // InternalJsonSchemaDsl.g:5375:1: rule__PatternPropertiesSchemaDefinition__Group__4 : rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5379:1: ( rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:5380:2: rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__PatternPropertiesSchemaDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__4"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__4__Impl"
    // InternalJsonSchemaDsl.g:5387:1: rule__PatternPropertiesSchemaDefinition__Group__4__Impl : ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5391:1: ( ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:5392:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:5392:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:5393:2: ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:5394:2: ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJsonSchemaDsl.g:5394:3: rule__PatternPropertiesSchemaDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternPropertiesSchemaDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__5"
    // InternalJsonSchemaDsl.g:5402:1: rule__PatternPropertiesSchemaDefinition__Group__5 : rule__PatternPropertiesSchemaDefinition__Group__5__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5406:1: ( rule__PatternPropertiesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:5407:2: rule__PatternPropertiesSchemaDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__5"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group__5__Impl"
    // InternalJsonSchemaDsl.g:5413:1: rule__PatternPropertiesSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5417:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:5418:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:5418:1: ( '}' )
            // InternalJsonSchemaDsl.g:5419:2: '}'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group__5__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4__0"
    // InternalJsonSchemaDsl.g:5429:1: rule__PatternPropertiesSchemaDefinition__Group_4__0 : rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5433:1: ( rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:5434:2: rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4__0"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl"
    // InternalJsonSchemaDsl.g:5441:1: rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl : ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5445:1: ( ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:5446:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:5446:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:5447:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:5448:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:5448:3: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4__1"
    // InternalJsonSchemaDsl.g:5456:1: rule__PatternPropertiesSchemaDefinition__Group_4__1 : rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5460:1: ( rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:5461:2: rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4__1"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl"
    // InternalJsonSchemaDsl.g:5467:1: rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl : ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5471:1: ( ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:5472:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:5472:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:5473:2: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:5474:2: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:5474:3: rule__PatternPropertiesSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PatternPropertiesSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4_1__0"
    // InternalJsonSchemaDsl.g:5483:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__0 : rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5487:1: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:5488:2: rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4_1__0"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl"
    // InternalJsonSchemaDsl.g:5495:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5499:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:5500:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:5500:1: ( ',' )
            // InternalJsonSchemaDsl.g:5501:2: ','
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4_1__1"
    // InternalJsonSchemaDsl.g:5510:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__1 : rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5514:1: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:5515:2: rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4_1__1"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl"
    // InternalJsonSchemaDsl.g:5521:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5525:1: ( ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:5526:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:5526:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:5527:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:5528:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:5528:3: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5537:1: rule__AdditionalItemsSchemaDefinition__Group__0 : rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1 ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5541:1: ( rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5542:2: rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AdditionalItemsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalItemsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__Group__0"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5549:1: rule__AdditionalItemsSchemaDefinition__Group__0__Impl : ( '\"additionalItems\"' ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5553:1: ( ( '\"additionalItems\"' ) )
            // InternalJsonSchemaDsl.g:5554:1: ( '\"additionalItems\"' )
            {
            // InternalJsonSchemaDsl.g:5554:1: ( '\"additionalItems\"' )
            // InternalJsonSchemaDsl.g:5555:2: '\"additionalItems\"'
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5564:1: rule__AdditionalItemsSchemaDefinition__Group__1 : rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2 ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5568:1: ( rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5569:2: rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AdditionalItemsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalItemsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__Group__1"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5576:1: rule__AdditionalItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5580:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5581:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5581:1: ( ':' )
            // InternalJsonSchemaDsl.g:5582:2: ':'
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:5591:1: rule__AdditionalItemsSchemaDefinition__Group__2 : rule__AdditionalItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5595:1: ( rule__AdditionalItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5596:2: rule__AdditionalItemsSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalItemsSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__Group__2"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5602:1: rule__AdditionalItemsSchemaDefinition__Group__2__Impl : ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5606:1: ( ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5607:1: ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5607:1: ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5608:2: ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 )
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:5609:2: ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:5609:3: rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__0"
    // InternalJsonSchemaDsl.g:5618:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5622:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalJsonSchemaDsl.g:5623:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__0"


    // $ANTLR start "rule__KeyValuePair__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5630:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5634:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:5635:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:5635:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:5636:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:5637:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:5637:3: rule__KeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__1"
    // InternalJsonSchemaDsl.g:5645:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5649:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalJsonSchemaDsl.g:5650:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__KeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__1"


    // $ANTLR start "rule__KeyValuePair__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5657:1: rule__KeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5661:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5662:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5662:1: ( ':' )
            // InternalJsonSchemaDsl.g:5663:2: ':'
            {
             before(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__2"
    // InternalJsonSchemaDsl.g:5672:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5676:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5677:2: rule__KeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__2"


    // $ANTLR start "rule__KeyValuePair__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5683:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5687:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5688:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5688:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5689:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:5690:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:5690:3: rule__KeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5699:1: rule__ExamplesSchemaDefinition__Group__0 : rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1 ;
    public final void rule__ExamplesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5703:1: ( rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5704:2: rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ExamplesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__0"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5711:1: rule__ExamplesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ExamplesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5715:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:5716:1: ( () )
            {
            // InternalJsonSchemaDsl.g:5716:1: ( () )
            // InternalJsonSchemaDsl.g:5717:2: ()
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:5718:2: ()
            // InternalJsonSchemaDsl.g:5718:3: 
            {
            }

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesSchemaDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5726:1: rule__ExamplesSchemaDefinition__Group__1 : rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2 ;
    public final void rule__ExamplesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5730:1: ( rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5731:2: rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExamplesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__1"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:5738:1: rule__ExamplesSchemaDefinition__Group__1__Impl : ( '\"examples\"' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5742:1: ( ( '\"examples\"' ) )
            // InternalJsonSchemaDsl.g:5743:1: ( '\"examples\"' )
            {
            // InternalJsonSchemaDsl.g:5743:1: ( '\"examples\"' )
            // InternalJsonSchemaDsl.g:5744:2: '\"examples\"'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:5753:1: rule__ExamplesSchemaDefinition__Group__2 : rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3 ;
    public final void rule__ExamplesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5757:1: ( rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:5758:2: rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ExamplesSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__2"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:5765:1: rule__ExamplesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5769:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5770:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5770:1: ( ':' )
            // InternalJsonSchemaDsl.g:5771:2: ':'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExamplesSchemaDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:5780:1: rule__ExamplesSchemaDefinition__Group__3 : rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4 ;
    public final void rule__ExamplesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5784:1: ( rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:5785:2: rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ExamplesSchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__3"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:5792:1: rule__ExamplesSchemaDefinition__Group__3__Impl : ( '[' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5796:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:5797:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:5797:1: ( '[' )
            // InternalJsonSchemaDsl.g:5798:2: '['
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExamplesSchemaDefinitionAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__4"
    // InternalJsonSchemaDsl.g:5807:1: rule__ExamplesSchemaDefinition__Group__4 : rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5 ;
    public final void rule__ExamplesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5811:1: ( rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:5812:2: rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ExamplesSchemaDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__4"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__4__Impl"
    // InternalJsonSchemaDsl.g:5819:1: rule__ExamplesSchemaDefinition__Group__4__Impl : ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__ExamplesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5823:1: ( ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:5824:1: ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:5824:1: ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:5825:2: ( rule__ExamplesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:5826:2: ( rule__ExamplesSchemaDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_JSON_NUMBER && LA18_0<=RULE_INT)||(LA18_0>=12 && LA18_0<=13)||LA18_0==21||LA18_0==28||(LA18_0>=73 && LA18_0<=74)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJsonSchemaDsl.g:5826:3: rule__ExamplesSchemaDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExamplesSchemaDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__5"
    // InternalJsonSchemaDsl.g:5834:1: rule__ExamplesSchemaDefinition__Group__5 : rule__ExamplesSchemaDefinition__Group__5__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5838:1: ( rule__ExamplesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:5839:2: rule__ExamplesSchemaDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__5"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group__5__Impl"
    // InternalJsonSchemaDsl.g:5845:1: rule__ExamplesSchemaDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5849:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:5850:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:5850:1: ( ']' )
            // InternalJsonSchemaDsl.g:5851:2: ']'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExamplesSchemaDefinitionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group__5__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4__0"
    // InternalJsonSchemaDsl.g:5861:1: rule__ExamplesSchemaDefinition__Group_4__0 : rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1 ;
    public final void rule__ExamplesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5865:1: ( rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:5866:2: rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ExamplesSchemaDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4__0"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4__0__Impl"
    // InternalJsonSchemaDsl.g:5873:1: rule__ExamplesSchemaDefinition__Group_4__0__Impl : ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5877:1: ( ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:5878:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:5878:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:5879:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:5880:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 )
            // InternalJsonSchemaDsl.g:5880:3: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4__1"
    // InternalJsonSchemaDsl.g:5888:1: rule__ExamplesSchemaDefinition__Group_4__1 : rule__ExamplesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5892:1: ( rule__ExamplesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:5893:2: rule__ExamplesSchemaDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4__1"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4__1__Impl"
    // InternalJsonSchemaDsl.g:5899:1: rule__ExamplesSchemaDefinition__Group_4__1__Impl : ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5903:1: ( ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:5904:1: ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:5904:1: ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:5905:2: ( rule__ExamplesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:5906:2: ( rule__ExamplesSchemaDefinition__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:5906:3: rule__ExamplesSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ExamplesSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4_1__0"
    // InternalJsonSchemaDsl.g:5915:1: rule__ExamplesSchemaDefinition__Group_4_1__0 : rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1 ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5919:1: ( rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:5920:2: rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ExamplesSchemaDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4_1__0"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4_1__0__Impl"
    // InternalJsonSchemaDsl.g:5927:1: rule__ExamplesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5931:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:5932:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:5932:1: ( ',' )
            // InternalJsonSchemaDsl.g:5933:2: ','
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExamplesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4_1__1"
    // InternalJsonSchemaDsl.g:5942:1: rule__ExamplesSchemaDefinition__Group_4_1__1 : rule__ExamplesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5946:1: ( rule__ExamplesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:5947:2: rule__ExamplesSchemaDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4_1__1"


    // $ANTLR start "rule__ExamplesSchemaDefinition__Group_4_1__1__Impl"
    // InternalJsonSchemaDsl.g:5953:1: rule__ExamplesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5957:1: ( ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:5958:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:5958:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:5959:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:5960:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:5960:3: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__IfSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:5969:1: rule__IfSchemaDefinition__Group__0 : rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1 ;
    public final void rule__IfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5973:1: ( rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5974:2: rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IfSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__Group__0"


    // $ANTLR start "rule__IfSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:5981:1: rule__IfSchemaDefinition__Group__0__Impl : ( '\"if\"' ) ;
    public final void rule__IfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5985:1: ( ( '\"if\"' ) )
            // InternalJsonSchemaDsl.g:5986:1: ( '\"if\"' )
            {
            // InternalJsonSchemaDsl.g:5986:1: ( '\"if\"' )
            // InternalJsonSchemaDsl.g:5987:2: '\"if\"'
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getIfSchemaDefinitionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__IfSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:5996:1: rule__IfSchemaDefinition__Group__1 : rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2 ;
    public final void rule__IfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6000:1: ( rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6001:2: rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__IfSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__Group__1"


    // $ANTLR start "rule__IfSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6008:1: rule__IfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__IfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6012:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6013:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6013:1: ( ':' )
            // InternalJsonSchemaDsl.g:6014:2: ':'
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIfSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__IfSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6023:1: rule__IfSchemaDefinition__Group__2 : rule__IfSchemaDefinition__Group__2__Impl ;
    public final void rule__IfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6027:1: ( rule__IfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6028:2: rule__IfSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__Group__2"


    // $ANTLR start "rule__IfSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6034:1: rule__IfSchemaDefinition__Group__2__Impl : ( ( rule__IfSchemaDefinition__IfAssignment_2 ) ) ;
    public final void rule__IfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6038:1: ( ( ( rule__IfSchemaDefinition__IfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6039:1: ( ( rule__IfSchemaDefinition__IfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6039:1: ( ( rule__IfSchemaDefinition__IfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6040:2: ( rule__IfSchemaDefinition__IfAssignment_2 )
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6041:2: ( rule__IfSchemaDefinition__IfAssignment_2 )
            // InternalJsonSchemaDsl.g:6041:3: rule__IfSchemaDefinition__IfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfSchemaDefinition__IfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfSchemaDefinitionAccess().getIfAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__AllOfSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6050:1: rule__AllOfSchemaDefinition__Group__0 : rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1 ;
    public final void rule__AllOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6054:1: ( rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6055:2: rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AllOfSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllOfSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__Group__0"


    // $ANTLR start "rule__AllOfSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6062:1: rule__AllOfSchemaDefinition__Group__0__Impl : ( '\"allOf\"' ) ;
    public final void rule__AllOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6066:1: ( ( '\"allOf\"' ) )
            // InternalJsonSchemaDsl.g:6067:1: ( '\"allOf\"' )
            {
            // InternalJsonSchemaDsl.g:6067:1: ( '\"allOf\"' )
            // InternalJsonSchemaDsl.g:6068:2: '\"allOf\"'
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__AllOfSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6077:1: rule__AllOfSchemaDefinition__Group__1 : rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2 ;
    public final void rule__AllOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6081:1: ( rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6082:2: rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AllOfSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllOfSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__Group__1"


    // $ANTLR start "rule__AllOfSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6089:1: rule__AllOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AllOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6093:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6094:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6094:1: ( ':' )
            // InternalJsonSchemaDsl.g:6095:2: ':'
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAllOfSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__AllOfSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6104:1: rule__AllOfSchemaDefinition__Group__2 : rule__AllOfSchemaDefinition__Group__2__Impl ;
    public final void rule__AllOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6108:1: ( rule__AllOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6109:2: rule__AllOfSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllOfSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__Group__2"


    // $ANTLR start "rule__AllOfSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6115:1: rule__AllOfSchemaDefinition__Group__2__Impl : ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) ) ;
    public final void rule__AllOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6119:1: ( ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6120:1: ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6120:1: ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6121:2: ( rule__AllOfSchemaDefinition__AllOfAssignment_2 )
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6122:2: ( rule__AllOfSchemaDefinition__AllOfAssignment_2 )
            // InternalJsonSchemaDsl.g:6122:3: rule__AllOfSchemaDefinition__AllOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AllOfSchemaDefinition__AllOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6131:1: rule__ContentEncodingSchemaDefinition__Group__0 : rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1 ;
    public final void rule__ContentEncodingSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6135:1: ( rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6136:2: rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ContentEncodingSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentEncodingSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__Group__0"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6143:1: rule__ContentEncodingSchemaDefinition__Group__0__Impl : ( '\"contentEncoding\"' ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6147:1: ( ( '\"contentEncoding\"' ) )
            // InternalJsonSchemaDsl.g:6148:1: ( '\"contentEncoding\"' )
            {
            // InternalJsonSchemaDsl.g:6148:1: ( '\"contentEncoding\"' )
            // InternalJsonSchemaDsl.g:6149:2: '\"contentEncoding\"'
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6158:1: rule__ContentEncodingSchemaDefinition__Group__1 : rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2 ;
    public final void rule__ContentEncodingSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6162:1: ( rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6163:2: rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ContentEncodingSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentEncodingSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__Group__1"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6170:1: rule__ContentEncodingSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6174:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6175:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6175:1: ( ':' )
            // InternalJsonSchemaDsl.g:6176:2: ':'
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContentEncodingSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6185:1: rule__ContentEncodingSchemaDefinition__Group__2 : rule__ContentEncodingSchemaDefinition__Group__2__Impl ;
    public final void rule__ContentEncodingSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6189:1: ( rule__ContentEncodingSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6190:2: rule__ContentEncodingSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentEncodingSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__Group__2"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6196:1: rule__ContentEncodingSchemaDefinition__Group__2__Impl : ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6200:1: ( ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6201:1: ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6201:1: ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6202:2: ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 )
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingAssignment_2()); 
            // InternalJsonSchemaDsl.g:6203:2: ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 )
            // InternalJsonSchemaDsl.g:6203:3: rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6212:1: rule__MultipleOfSchemaDefinition__Group__0 : rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1 ;
    public final void rule__MultipleOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6216:1: ( rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6217:2: rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MultipleOfSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleOfSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__Group__0"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6224:1: rule__MultipleOfSchemaDefinition__Group__0__Impl : ( '\"multipleOf\"' ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6228:1: ( ( '\"multipleOf\"' ) )
            // InternalJsonSchemaDsl.g:6229:1: ( '\"multipleOf\"' )
            {
            // InternalJsonSchemaDsl.g:6229:1: ( '\"multipleOf\"' )
            // InternalJsonSchemaDsl.g:6230:2: '\"multipleOf\"'
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6239:1: rule__MultipleOfSchemaDefinition__Group__1 : rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2 ;
    public final void rule__MultipleOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6243:1: ( rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6244:2: rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MultipleOfSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleOfSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__Group__1"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6251:1: rule__MultipleOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6255:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6256:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6256:1: ( ':' )
            // InternalJsonSchemaDsl.g:6257:2: ':'
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMultipleOfSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6266:1: rule__MultipleOfSchemaDefinition__Group__2 : rule__MultipleOfSchemaDefinition__Group__2__Impl ;
    public final void rule__MultipleOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6270:1: ( rule__MultipleOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6271:2: rule__MultipleOfSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleOfSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__Group__2"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6277:1: rule__MultipleOfSchemaDefinition__Group__2__Impl : ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6281:1: ( ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6282:1: ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6282:1: ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6283:2: ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 )
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6284:2: ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 )
            // InternalJsonSchemaDsl.g:6284:3: rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__PatternSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6293:1: rule__PatternSchemaDefinition__Group__0 : rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1 ;
    public final void rule__PatternSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6297:1: ( rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6298:2: rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PatternSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__Group__0"


    // $ANTLR start "rule__PatternSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6305:1: rule__PatternSchemaDefinition__Group__0__Impl : ( '\"pattern\"' ) ;
    public final void rule__PatternSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6309:1: ( ( '\"pattern\"' ) )
            // InternalJsonSchemaDsl.g:6310:1: ( '\"pattern\"' )
            {
            // InternalJsonSchemaDsl.g:6310:1: ( '\"pattern\"' )
            // InternalJsonSchemaDsl.g:6311:2: '\"pattern\"'
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPatternSchemaDefinitionAccess().getPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__PatternSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6320:1: rule__PatternSchemaDefinition__Group__1 : rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2 ;
    public final void rule__PatternSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6324:1: ( rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6325:2: rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PatternSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__Group__1"


    // $ANTLR start "rule__PatternSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6332:1: rule__PatternSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PatternSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6336:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6337:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6337:1: ( ':' )
            // InternalJsonSchemaDsl.g:6338:2: ':'
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__PatternSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6347:1: rule__PatternSchemaDefinition__Group__2 : rule__PatternSchemaDefinition__Group__2__Impl ;
    public final void rule__PatternSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6351:1: ( rule__PatternSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6352:2: rule__PatternSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__Group__2"


    // $ANTLR start "rule__PatternSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6358:1: rule__PatternSchemaDefinition__Group__2__Impl : ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) ) ;
    public final void rule__PatternSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6362:1: ( ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6363:1: ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6363:1: ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6364:2: ( rule__PatternSchemaDefinition__PatternAssignment_2 )
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternAssignment_2()); 
            // InternalJsonSchemaDsl.g:6365:2: ( rule__PatternSchemaDefinition__PatternAssignment_2 )
            // InternalJsonSchemaDsl.g:6365:3: rule__PatternSchemaDefinition__PatternAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternSchemaDefinition__PatternAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternSchemaDefinitionAccess().getPatternAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContainsSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6374:1: rule__ContainsSchemaDefinition__Group__0 : rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1 ;
    public final void rule__ContainsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6378:1: ( rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6379:2: rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ContainsSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__Group__0"


    // $ANTLR start "rule__ContainsSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6386:1: rule__ContainsSchemaDefinition__Group__0__Impl : ( '\"contains\"' ) ;
    public final void rule__ContainsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6390:1: ( ( '\"contains\"' ) )
            // InternalJsonSchemaDsl.g:6391:1: ( '\"contains\"' )
            {
            // InternalJsonSchemaDsl.g:6391:1: ( '\"contains\"' )
            // InternalJsonSchemaDsl.g:6392:2: '\"contains\"'
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getContainsSchemaDefinitionAccess().getContainsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContainsSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6401:1: rule__ContainsSchemaDefinition__Group__1 : rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2 ;
    public final void rule__ContainsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6405:1: ( rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6406:2: rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ContainsSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__Group__1"


    // $ANTLR start "rule__ContainsSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6413:1: rule__ContainsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContainsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6417:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6418:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6418:1: ( ':' )
            // InternalJsonSchemaDsl.g:6419:2: ':'
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContainsSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContainsSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6428:1: rule__ContainsSchemaDefinition__Group__2 : rule__ContainsSchemaDefinition__Group__2__Impl ;
    public final void rule__ContainsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6432:1: ( rule__ContainsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6433:2: rule__ContainsSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainsSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__Group__2"


    // $ANTLR start "rule__ContainsSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6439:1: rule__ContainsSchemaDefinition__Group__2__Impl : ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) ) ;
    public final void rule__ContainsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6443:1: ( ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6444:1: ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6444:1: ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6445:2: ( rule__ContainsSchemaDefinition__ContainsAssignment_2 )
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsAssignment_2()); 
            // InternalJsonSchemaDsl.g:6446:2: ( rule__ContainsSchemaDefinition__ContainsAssignment_2 )
            // InternalJsonSchemaDsl.g:6446:3: rule__ContainsSchemaDefinition__ContainsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContainsSchemaDefinition__ContainsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainsSchemaDefinitionAccess().getContainsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__NotSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6455:1: rule__NotSchemaDefinition__Group__0 : rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1 ;
    public final void rule__NotSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6459:1: ( rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6460:2: rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NotSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__Group__0"


    // $ANTLR start "rule__NotSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6467:1: rule__NotSchemaDefinition__Group__0__Impl : ( '\"not\"' ) ;
    public final void rule__NotSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6471:1: ( ( '\"not\"' ) )
            // InternalJsonSchemaDsl.g:6472:1: ( '\"not\"' )
            {
            // InternalJsonSchemaDsl.g:6472:1: ( '\"not\"' )
            // InternalJsonSchemaDsl.g:6473:2: '\"not\"'
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getNotSchemaDefinitionAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__NotSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6482:1: rule__NotSchemaDefinition__Group__1 : rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2 ;
    public final void rule__NotSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6486:1: ( rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6487:2: rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__NotSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__Group__1"


    // $ANTLR start "rule__NotSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6494:1: rule__NotSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__NotSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6498:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6499:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6499:1: ( ':' )
            // InternalJsonSchemaDsl.g:6500:2: ':'
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNotSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__NotSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6509:1: rule__NotSchemaDefinition__Group__2 : rule__NotSchemaDefinition__Group__2__Impl ;
    public final void rule__NotSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6513:1: ( rule__NotSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6514:2: rule__NotSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__Group__2"


    // $ANTLR start "rule__NotSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6520:1: rule__NotSchemaDefinition__Group__2__Impl : ( ( rule__NotSchemaDefinition__NotAssignment_2 ) ) ;
    public final void rule__NotSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6524:1: ( ( ( rule__NotSchemaDefinition__NotAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6525:1: ( ( rule__NotSchemaDefinition__NotAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6525:1: ( ( rule__NotSchemaDefinition__NotAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6526:2: ( rule__NotSchemaDefinition__NotAssignment_2 )
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotAssignment_2()); 
            // InternalJsonSchemaDsl.g:6527:2: ( rule__NotSchemaDefinition__NotAssignment_2 )
            // InternalJsonSchemaDsl.g:6527:3: rule__NotSchemaDefinition__NotAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NotSchemaDefinition__NotAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNotSchemaDefinitionAccess().getNotAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6536:1: rule__ExclusiveMaximumSchemaDefinition__Group__0 : rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1 ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6540:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6541:2: rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximumSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__Group__0"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6548:1: rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl : ( '\"exclusiveMaximum\"' ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6552:1: ( ( '\"exclusiveMaximum\"' ) )
            // InternalJsonSchemaDsl.g:6553:1: ( '\"exclusiveMaximum\"' )
            {
            // InternalJsonSchemaDsl.g:6553:1: ( '\"exclusiveMaximum\"' )
            // InternalJsonSchemaDsl.g:6554:2: '\"exclusiveMaximum\"'
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6563:1: rule__ExclusiveMaximumSchemaDefinition__Group__1 : rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2 ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6567:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6568:2: rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximumSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__Group__1"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6575:1: rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6579:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6580:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6580:1: ( ':' )
            // InternalJsonSchemaDsl.g:6581:2: ':'
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6590:1: rule__ExclusiveMaximumSchemaDefinition__Group__2 : rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6594:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6595:2: rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__Group__2"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6601:1: rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl : ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6605:1: ( ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6606:1: ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6606:1: ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6607:2: ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumAssignment_2()); 
            // InternalJsonSchemaDsl.g:6608:2: ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 )
            // InternalJsonSchemaDsl.g:6608:3: rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6617:1: rule__MaxLengthSchemaDefinition__Group__0 : rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1 ;
    public final void rule__MaxLengthSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6621:1: ( rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6622:2: rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MaxLengthSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLengthSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__Group__0"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6629:1: rule__MaxLengthSchemaDefinition__Group__0__Impl : ( '\"maxLength\"' ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6633:1: ( ( '\"maxLength\"' ) )
            // InternalJsonSchemaDsl.g:6634:1: ( '\"maxLength\"' )
            {
            // InternalJsonSchemaDsl.g:6634:1: ( '\"maxLength\"' )
            // InternalJsonSchemaDsl.g:6635:2: '\"maxLength\"'
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6644:1: rule__MaxLengthSchemaDefinition__Group__1 : rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2 ;
    public final void rule__MaxLengthSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6648:1: ( rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6649:2: rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MaxLengthSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLengthSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__Group__1"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6656:1: rule__MaxLengthSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6660:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6661:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6661:1: ( ':' )
            // InternalJsonSchemaDsl.g:6662:2: ':'
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaxLengthSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6671:1: rule__MaxLengthSchemaDefinition__Group__2 : rule__MaxLengthSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxLengthSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6675:1: ( rule__MaxLengthSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6676:2: rule__MaxLengthSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxLengthSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__Group__2"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6682:1: rule__MaxLengthSchemaDefinition__Group__2__Impl : ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6686:1: ( ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6687:1: ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6687:1: ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6688:2: ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 )
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthAssignment_2()); 
            // InternalJsonSchemaDsl.g:6689:2: ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 )
            // InternalJsonSchemaDsl.g:6689:3: rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__RefSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6698:1: rule__RefSchemaDefinition__Group__0 : rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1 ;
    public final void rule__RefSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6702:1: ( rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6703:2: rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RefSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__Group__0"


    // $ANTLR start "rule__RefSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6710:1: rule__RefSchemaDefinition__Group__0__Impl : ( '\"$ref\"' ) ;
    public final void rule__RefSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6714:1: ( ( '\"$ref\"' ) )
            // InternalJsonSchemaDsl.g:6715:1: ( '\"$ref\"' )
            {
            // InternalJsonSchemaDsl.g:6715:1: ( '\"$ref\"' )
            // InternalJsonSchemaDsl.g:6716:2: '\"$ref\"'
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getRefKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRefSchemaDefinitionAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__RefSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6725:1: rule__RefSchemaDefinition__Group__1 : rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2 ;
    public final void rule__RefSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6729:1: ( rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6730:2: rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RefSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__Group__1"


    // $ANTLR start "rule__RefSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6737:1: rule__RefSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RefSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6741:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6742:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6742:1: ( ':' )
            // InternalJsonSchemaDsl.g:6743:2: ':'
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRefSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__RefSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6752:1: rule__RefSchemaDefinition__Group__2 : rule__RefSchemaDefinition__Group__2__Impl ;
    public final void rule__RefSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6756:1: ( rule__RefSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6757:2: rule__RefSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__Group__2"


    // $ANTLR start "rule__RefSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6763:1: rule__RefSchemaDefinition__Group__2__Impl : ( ( rule__RefSchemaDefinition__RefAssignment_2 ) ) ;
    public final void rule__RefSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6767:1: ( ( ( rule__RefSchemaDefinition__RefAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6768:1: ( ( rule__RefSchemaDefinition__RefAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6768:1: ( ( rule__RefSchemaDefinition__RefAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6769:2: ( rule__RefSchemaDefinition__RefAssignment_2 )
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getRefAssignment_2()); 
            // InternalJsonSchemaDsl.g:6770:2: ( rule__RefSchemaDefinition__RefAssignment_2 )
            // InternalJsonSchemaDsl.g:6770:3: rule__RefSchemaDefinition__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RefSchemaDefinition__RefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRefSchemaDefinitionAccess().getRefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6779:1: rule__ContentMediaTypeSchemaDefinition__Group__0 : rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1 ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6783:1: ( rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6784:2: rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ContentMediaTypeSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentMediaTypeSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__Group__0"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6791:1: rule__ContentMediaTypeSchemaDefinition__Group__0__Impl : ( '\"contentMediaType\"' ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6795:1: ( ( '\"contentMediaType\"' ) )
            // InternalJsonSchemaDsl.g:6796:1: ( '\"contentMediaType\"' )
            {
            // InternalJsonSchemaDsl.g:6796:1: ( '\"contentMediaType\"' )
            // InternalJsonSchemaDsl.g:6797:2: '\"contentMediaType\"'
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6806:1: rule__ContentMediaTypeSchemaDefinition__Group__1 : rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2 ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6810:1: ( rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6811:2: rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ContentMediaTypeSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentMediaTypeSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__Group__1"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6818:1: rule__ContentMediaTypeSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6822:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6823:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6823:1: ( ':' )
            // InternalJsonSchemaDsl.g:6824:2: ':'
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6833:1: rule__ContentMediaTypeSchemaDefinition__Group__2 : rule__ContentMediaTypeSchemaDefinition__Group__2__Impl ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6837:1: ( rule__ContentMediaTypeSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6838:2: rule__ContentMediaTypeSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentMediaTypeSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__Group__2"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6844:1: rule__ContentMediaTypeSchemaDefinition__Group__2__Impl : ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6848:1: ( ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6849:1: ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6849:1: ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6850:2: ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 )
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeAssignment_2()); 
            // InternalJsonSchemaDsl.g:6851:2: ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 )
            // InternalJsonSchemaDsl.g:6851:3: rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6860:1: rule__ExclusiveMinimumSchemaDefinition__Group__0 : rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1 ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6864:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6865:2: rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimumSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__Group__0"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6872:1: rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl : ( '\"exclusiveMinimum\"' ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6876:1: ( ( '\"exclusiveMinimum\"' ) )
            // InternalJsonSchemaDsl.g:6877:1: ( '\"exclusiveMinimum\"' )
            {
            // InternalJsonSchemaDsl.g:6877:1: ( '\"exclusiveMinimum\"' )
            // InternalJsonSchemaDsl.g:6878:2: '\"exclusiveMinimum\"'
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6887:1: rule__ExclusiveMinimumSchemaDefinition__Group__1 : rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2 ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6891:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6892:2: rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimumSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__Group__1"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6899:1: rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6903:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6904:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6904:1: ( ':' )
            // InternalJsonSchemaDsl.g:6905:2: ':'
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6914:1: rule__ExclusiveMinimumSchemaDefinition__Group__2 : rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6918:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6919:2: rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__Group__2"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:6925:1: rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl : ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6929:1: ( ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6930:1: ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6930:1: ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6931:2: ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumAssignment_2()); 
            // InternalJsonSchemaDsl.g:6932:2: ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 )
            // InternalJsonSchemaDsl.g:6932:3: rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__SchemaSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:6941:1: rule__SchemaSchemaDefinition__Group__0 : rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1 ;
    public final void rule__SchemaSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6945:1: ( rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6946:2: rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SchemaSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__Group__0"


    // $ANTLR start "rule__SchemaSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:6953:1: rule__SchemaSchemaDefinition__Group__0__Impl : ( '\"$schema\"' ) ;
    public final void rule__SchemaSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6957:1: ( ( '\"$schema\"' ) )
            // InternalJsonSchemaDsl.g:6958:1: ( '\"$schema\"' )
            {
            // InternalJsonSchemaDsl.g:6958:1: ( '\"$schema\"' )
            // InternalJsonSchemaDsl.g:6959:2: '\"$schema\"'
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__SchemaSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:6968:1: rule__SchemaSchemaDefinition__Group__1 : rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2 ;
    public final void rule__SchemaSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6972:1: ( rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6973:2: rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SchemaSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__Group__1"


    // $ANTLR start "rule__SchemaSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:6980:1: rule__SchemaSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__SchemaSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6984:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6985:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6985:1: ( ':' )
            // InternalJsonSchemaDsl.g:6986:2: ':'
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSchemaSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__SchemaSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:6995:1: rule__SchemaSchemaDefinition__Group__2 : rule__SchemaSchemaDefinition__Group__2__Impl ;
    public final void rule__SchemaSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6999:1: ( rule__SchemaSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7000:2: rule__SchemaSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__Group__2"


    // $ANTLR start "rule__SchemaSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:7006:1: rule__SchemaSchemaDefinition__Group__2__Impl : ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) ) ;
    public final void rule__SchemaSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7010:1: ( ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7011:1: ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7011:1: ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7012:2: ( rule__SchemaSchemaDefinition__SchemaAssignment_2 )
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaAssignment_2()); 
            // InternalJsonSchemaDsl.g:7013:2: ( rule__SchemaSchemaDefinition__SchemaAssignment_2 )
            // InternalJsonSchemaDsl.g:7013:3: rule__SchemaSchemaDefinition__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SchemaSchemaDefinition__SchemaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:7022:1: rule__PropertiesSchemaDefinition__Group__0 : rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1 ;
    public final void rule__PropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7026:1: ( rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7027:2: rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__PropertiesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__0"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7034:1: rule__PropertiesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7038:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7039:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7039:1: ( () )
            // InternalJsonSchemaDsl.g:7040:2: ()
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:7041:2: ()
            // InternalJsonSchemaDsl.g:7041:3: 
            {
            }

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesSchemaDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:7049:1: rule__PropertiesSchemaDefinition__Group__1 : rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2 ;
    public final void rule__PropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7053:1: ( rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7054:2: rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PropertiesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__1"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7061:1: rule__PropertiesSchemaDefinition__Group__1__Impl : ( '\"properties\"' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7065:1: ( ( '\"properties\"' ) )
            // InternalJsonSchemaDsl.g:7066:1: ( '\"properties\"' )
            {
            // InternalJsonSchemaDsl.g:7066:1: ( '\"properties\"' )
            // InternalJsonSchemaDsl.g:7067:2: '\"properties\"'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:7076:1: rule__PropertiesSchemaDefinition__Group__2 : rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3 ;
    public final void rule__PropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7080:1: ( rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:7081:2: rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PropertiesSchemaDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__2"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:7088:1: rule__PropertiesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7092:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7093:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7093:1: ( ':' )
            // InternalJsonSchemaDsl.g:7094:2: ':'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__3"
    // InternalJsonSchemaDsl.g:7103:1: rule__PropertiesSchemaDefinition__Group__3 : rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4 ;
    public final void rule__PropertiesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7107:1: ( rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:7108:2: rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PropertiesSchemaDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__3"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__3__Impl"
    // InternalJsonSchemaDsl.g:7115:1: rule__PropertiesSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7119:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:7120:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:7120:1: ( '{' )
            // InternalJsonSchemaDsl.g:7121:2: '{'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__4"
    // InternalJsonSchemaDsl.g:7130:1: rule__PropertiesSchemaDefinition__Group__4 : rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5 ;
    public final void rule__PropertiesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7134:1: ( rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:7135:2: rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__PropertiesSchemaDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__4"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__4__Impl"
    // InternalJsonSchemaDsl.g:7142:1: rule__PropertiesSchemaDefinition__Group__4__Impl : ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__PropertiesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7146:1: ( ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:7147:1: ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:7147:1: ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:7148:2: ( rule__PropertiesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:7149:2: ( rule__PropertiesSchemaDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7149:3: rule__PropertiesSchemaDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertiesSchemaDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__5"
    // InternalJsonSchemaDsl.g:7157:1: rule__PropertiesSchemaDefinition__Group__5 : rule__PropertiesSchemaDefinition__Group__5__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7161:1: ( rule__PropertiesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:7162:2: rule__PropertiesSchemaDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__5"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group__5__Impl"
    // InternalJsonSchemaDsl.g:7168:1: rule__PropertiesSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7172:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:7173:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:7173:1: ( '}' )
            // InternalJsonSchemaDsl.g:7174:2: '}'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4__0"
    // InternalJsonSchemaDsl.g:7184:1: rule__PropertiesSchemaDefinition__Group_4__0 : rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1 ;
    public final void rule__PropertiesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7188:1: ( rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:7189:2: rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__PropertiesSchemaDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4__0"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4__0__Impl"
    // InternalJsonSchemaDsl.g:7196:1: rule__PropertiesSchemaDefinition__Group_4__0__Impl : ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7200:1: ( ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:7201:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:7201:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:7202:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:7203:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:7203:3: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4__1"
    // InternalJsonSchemaDsl.g:7211:1: rule__PropertiesSchemaDefinition__Group_4__1 : rule__PropertiesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7215:1: ( rule__PropertiesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:7216:2: rule__PropertiesSchemaDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4__1"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4__1__Impl"
    // InternalJsonSchemaDsl.g:7222:1: rule__PropertiesSchemaDefinition__Group_4__1__Impl : ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7226:1: ( ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7227:1: ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7227:1: ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:7228:2: ( rule__PropertiesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:7229:2: ( rule__PropertiesSchemaDefinition__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7229:3: rule__PropertiesSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PropertiesSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4_1__0"
    // InternalJsonSchemaDsl.g:7238:1: rule__PropertiesSchemaDefinition__Group_4_1__0 : rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1 ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7242:1: ( rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:7243:2: rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PropertiesSchemaDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4_1__0"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4_1__0__Impl"
    // InternalJsonSchemaDsl.g:7250:1: rule__PropertiesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7254:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7255:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7255:1: ( ',' )
            // InternalJsonSchemaDsl.g:7256:2: ','
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4_1__1"
    // InternalJsonSchemaDsl.g:7265:1: rule__PropertiesSchemaDefinition__Group_4_1__1 : rule__PropertiesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7269:1: ( rule__PropertiesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:7270:2: rule__PropertiesSchemaDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4_1__1"


    // $ANTLR start "rule__PropertiesSchemaDefinition__Group_4_1__1__Impl"
    // InternalJsonSchemaDsl.g:7276:1: rule__PropertiesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7280:1: ( ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7281:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7281:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:7282:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:7283:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:7283:3: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:7292:1: rule__PropertyNamesSchemaDefinition__Group__0 : rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1 ;
    public final void rule__PropertyNamesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7296:1: ( rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7297:2: rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PropertyNamesSchemaDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyNamesSchemaDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__Group__0"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7304:1: rule__PropertyNamesSchemaDefinition__Group__0__Impl : ( '\"propertyNames\"' ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7308:1: ( ( '\"propertyNames\"' ) )
            // InternalJsonSchemaDsl.g:7309:1: ( '\"propertyNames\"' )
            {
            // InternalJsonSchemaDsl.g:7309:1: ( '\"propertyNames\"' )
            // InternalJsonSchemaDsl.g:7310:2: '\"propertyNames\"'
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__Group__1"
    // InternalJsonSchemaDsl.g:7319:1: rule__PropertyNamesSchemaDefinition__Group__1 : rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2 ;
    public final void rule__PropertyNamesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7323:1: ( rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7324:2: rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PropertyNamesSchemaDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyNamesSchemaDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__Group__1"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7331:1: rule__PropertyNamesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7335:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7336:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7336:1: ( ':' )
            // InternalJsonSchemaDsl.g:7337:2: ':'
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__Group__2"
    // InternalJsonSchemaDsl.g:7346:1: rule__PropertyNamesSchemaDefinition__Group__2 : rule__PropertyNamesSchemaDefinition__Group__2__Impl ;
    public final void rule__PropertyNamesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7350:1: ( rule__PropertyNamesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7351:2: rule__PropertyNamesSchemaDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyNamesSchemaDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__Group__2"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__Group__2__Impl"
    // InternalJsonSchemaDsl.g:7357:1: rule__PropertyNamesSchemaDefinition__Group__2__Impl : ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7361:1: ( ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7362:1: ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7362:1: ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7363:2: ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 )
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesAssignment_2()); 
            // InternalJsonSchemaDsl.g:7364:2: ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 )
            // InternalJsonSchemaDsl.g:7364:3: rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__Group__2__Impl"


    // $ANTLR start "rule__NullValue__Group__0"
    // InternalJsonSchemaDsl.g:7373:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
    public final void rule__NullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7377:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
            // InternalJsonSchemaDsl.g:7378:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NullValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__0"


    // $ANTLR start "rule__NullValue__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7385:1: rule__NullValue__Group__0__Impl : ( () ) ;
    public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7389:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7390:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7390:1: ( () )
            // InternalJsonSchemaDsl.g:7391:2: ()
            {
             before(grammarAccess.getNullValueAccess().getNullValueAction_0()); 
            // InternalJsonSchemaDsl.g:7392:2: ()
            // InternalJsonSchemaDsl.g:7392:3: 
            {
            }

             after(grammarAccess.getNullValueAccess().getNullValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__0__Impl"


    // $ANTLR start "rule__NullValue__Group__1"
    // InternalJsonSchemaDsl.g:7400:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
    public final void rule__NullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7404:1: ( rule__NullValue__Group__1__Impl )
            // InternalJsonSchemaDsl.g:7405:2: rule__NullValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__1"


    // $ANTLR start "rule__NullValue__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7411:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7415:1: ( ( 'null' ) )
            // InternalJsonSchemaDsl.g:7416:1: ( 'null' )
            {
            // InternalJsonSchemaDsl.g:7416:1: ( 'null' )
            // InternalJsonSchemaDsl.g:7417:2: 'null'
            {
             before(grammarAccess.getNullValueAccess().getNullKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getNullValueAccess().getNullKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__Group__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__0"
    // InternalJsonSchemaDsl.g:7427:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7431:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalJsonSchemaDsl.g:7432:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ObjectValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0"


    // $ANTLR start "rule__ObjectValue__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7439:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7443:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7444:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7444:1: ( () )
            // InternalJsonSchemaDsl.g:7445:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalJsonSchemaDsl.g:7446:2: ()
            // InternalJsonSchemaDsl.g:7446:3: 
            {
            }

             after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group__1"
    // InternalJsonSchemaDsl.g:7454:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7458:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalJsonSchemaDsl.g:7459:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ObjectValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1"


    // $ANTLR start "rule__ObjectValue__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7466:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7470:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:7471:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:7471:1: ( '{' )
            // InternalJsonSchemaDsl.g:7472:2: '{'
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__2"
    // InternalJsonSchemaDsl.g:7481:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7485:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalJsonSchemaDsl.g:7486:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ObjectValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2"


    // $ANTLR start "rule__ObjectValue__Group__2__Impl"
    // InternalJsonSchemaDsl.g:7493:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7497:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:7498:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:7498:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:7499:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7500:2: ( rule__ObjectValue__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7500:3: rule__ObjectValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectValue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2__Impl"


    // $ANTLR start "rule__ObjectValue__Group__3"
    // InternalJsonSchemaDsl.g:7508:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7512:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7513:2: rule__ObjectValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3"


    // $ANTLR start "rule__ObjectValue__Group__3__Impl"
    // InternalJsonSchemaDsl.g:7519:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7523:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:7524:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:7524:1: ( '}' )
            // InternalJsonSchemaDsl.g:7525:2: '}'
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2__0"
    // InternalJsonSchemaDsl.g:7535:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7539:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalJsonSchemaDsl.g:7540:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ObjectValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__0"


    // $ANTLR start "rule__ObjectValue__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:7547:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7551:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:7552:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:7552:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:7553:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:7554:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalJsonSchemaDsl.g:7554:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__KeyvaluepairAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2__1"
    // InternalJsonSchemaDsl.g:7562:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7566:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:7567:2: rule__ObjectValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__1"


    // $ANTLR start "rule__ObjectValue__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:7573:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7577:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7578:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7578:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:7579:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:7580:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7580:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getObjectValueAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2_1__0"
    // InternalJsonSchemaDsl.g:7589:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7593:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:7594:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ObjectValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__0"


    // $ANTLR start "rule__ObjectValue__Group_2_1__0__Impl"
    // InternalJsonSchemaDsl.g:7601:1: rule__ObjectValue__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7605:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7606:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7606:1: ( ',' )
            // InternalJsonSchemaDsl.g:7607:2: ','
            {
             before(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2_1__1"
    // InternalJsonSchemaDsl.g:7616:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7620:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:7621:2: rule__ObjectValue__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__1"


    // $ANTLR start "rule__ObjectValue__Group_2_1__1__Impl"
    // InternalJsonSchemaDsl.g:7627:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7631:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7632:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7632:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:7633:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:7634:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:7634:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__KeyvaluepairAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalJsonSchemaDsl.g:7643:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7647:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalJsonSchemaDsl.g:7648:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ArrayValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0"


    // $ANTLR start "rule__ArrayValue__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7655:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7659:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7660:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7660:1: ( () )
            // InternalJsonSchemaDsl.g:7661:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalJsonSchemaDsl.g:7662:2: ()
            // InternalJsonSchemaDsl.g:7662:3: 
            {
            }

             after(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group__1"
    // InternalJsonSchemaDsl.g:7670:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7674:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalJsonSchemaDsl.g:7675:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ArrayValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1"


    // $ANTLR start "rule__ArrayValue__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7682:1: rule__ArrayValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7686:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:7687:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:7687:1: ( '[' )
            // InternalJsonSchemaDsl.g:7688:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__2"
    // InternalJsonSchemaDsl.g:7697:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7701:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalJsonSchemaDsl.g:7702:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ArrayValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2"


    // $ANTLR start "rule__ArrayValue__Group__2__Impl"
    // InternalJsonSchemaDsl.g:7709:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7713:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:7714:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:7714:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:7715:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7716:2: ( rule__ArrayValue__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_JSON_NUMBER && LA24_0<=RULE_INT)||(LA24_0>=12 && LA24_0<=13)||LA24_0==21||LA24_0==28||(LA24_0>=73 && LA24_0<=74)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7716:3: rule__ArrayValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayValue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__3"
    // InternalJsonSchemaDsl.g:7724:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7728:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7729:2: rule__ArrayValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__3"


    // $ANTLR start "rule__ArrayValue__Group__3__Impl"
    // InternalJsonSchemaDsl.g:7735:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7739:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:7740:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:7740:1: ( ']' )
            // InternalJsonSchemaDsl.g:7741:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__3__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2__0"
    // InternalJsonSchemaDsl.g:7751:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7755:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalJsonSchemaDsl.g:7756:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ArrayValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__0"


    // $ANTLR start "rule__ArrayValue__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:7763:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7767:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:7768:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:7768:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:7769:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:7770:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalJsonSchemaDsl.g:7770:3: rule__ArrayValue__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValueAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2__1"
    // InternalJsonSchemaDsl.g:7778:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7782:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:7783:2: rule__ArrayValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__1"


    // $ANTLR start "rule__ArrayValue__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:7789:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7793:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7794:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7794:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:7795:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:7796:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7796:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getArrayValueAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2_1__0"
    // InternalJsonSchemaDsl.g:7805:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7809:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:7810:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ArrayValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__0"


    // $ANTLR start "rule__ArrayValue__Group_2_1__0__Impl"
    // InternalJsonSchemaDsl.g:7817:1: rule__ArrayValue__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7821:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7822:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7822:1: ( ',' )
            // InternalJsonSchemaDsl.g:7823:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2_1__1"
    // InternalJsonSchemaDsl.g:7832:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7836:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:7837:2: rule__ArrayValue__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__1"


    // $ANTLR start "rule__ArrayValue__Group_2_1__1__Impl"
    // InternalJsonSchemaDsl.g:7843:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7847:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7848:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7848:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:7849:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:7850:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:7850:3: rule__ArrayValue__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalJsonSchemaDsl.g:7859:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7863:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJsonSchemaDsl.g:7864:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7871:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7875:1: ( ( ( '-' )? ) )
            // InternalJsonSchemaDsl.g:7876:1: ( ( '-' )? )
            {
            // InternalJsonSchemaDsl.g:7876:1: ( ( '-' )? )
            // InternalJsonSchemaDsl.g:7877:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJsonSchemaDsl.g:7878:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==74) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7878:3: '-'
                    {
                    match(input,74,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalJsonSchemaDsl.g:7886:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7890:1: ( rule__EInt__Group__1__Impl )
            // InternalJsonSchemaDsl.g:7891:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7897:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7901:1: ( ( RULE_INT ) )
            // InternalJsonSchemaDsl.g:7902:1: ( RULE_INT )
            {
            // InternalJsonSchemaDsl.g:7902:1: ( RULE_INT )
            // InternalJsonSchemaDsl.g:7903:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__SchemaArray__Group__0"
    // InternalJsonSchemaDsl.g:7913:1: rule__SchemaArray__Group__0 : rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1 ;
    public final void rule__SchemaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7917:1: ( rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1 )
            // InternalJsonSchemaDsl.g:7918:2: rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SchemaArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__0"


    // $ANTLR start "rule__SchemaArray__Group__0__Impl"
    // InternalJsonSchemaDsl.g:7925:1: rule__SchemaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__SchemaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7929:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:7930:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:7930:1: ( '[' )
            // InternalJsonSchemaDsl.g:7931:2: '['
            {
             before(grammarAccess.getSchemaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSchemaArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__0__Impl"


    // $ANTLR start "rule__SchemaArray__Group__1"
    // InternalJsonSchemaDsl.g:7940:1: rule__SchemaArray__Group__1 : rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2 ;
    public final void rule__SchemaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7944:1: ( rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2 )
            // InternalJsonSchemaDsl.g:7945:2: rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SchemaArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__1"


    // $ANTLR start "rule__SchemaArray__Group__1__Impl"
    // InternalJsonSchemaDsl.g:7952:1: rule__SchemaArray__Group__1__Impl : ( ( rule__SchemaArray__ItemsAssignment_1 ) ) ;
    public final void rule__SchemaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7956:1: ( ( ( rule__SchemaArray__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:7957:1: ( ( rule__SchemaArray__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:7957:1: ( ( rule__SchemaArray__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:7958:2: ( rule__SchemaArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:7959:2: ( rule__SchemaArray__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:7959:3: rule__SchemaArray__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SchemaArray__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaArrayAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__1__Impl"


    // $ANTLR start "rule__SchemaArray__Group__2"
    // InternalJsonSchemaDsl.g:7967:1: rule__SchemaArray__Group__2 : rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3 ;
    public final void rule__SchemaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7971:1: ( rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3 )
            // InternalJsonSchemaDsl.g:7972:2: rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SchemaArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__2"


    // $ANTLR start "rule__SchemaArray__Group__2__Impl"
    // InternalJsonSchemaDsl.g:7979:1: rule__SchemaArray__Group__2__Impl : ( ( rule__SchemaArray__Group_2__0 )* ) ;
    public final void rule__SchemaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7983:1: ( ( ( rule__SchemaArray__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:7984:1: ( ( rule__SchemaArray__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:7984:1: ( ( rule__SchemaArray__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:7985:2: ( rule__SchemaArray__Group_2__0 )*
            {
             before(grammarAccess.getSchemaArrayAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7986:2: ( rule__SchemaArray__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7986:3: rule__SchemaArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SchemaArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSchemaArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__2__Impl"


    // $ANTLR start "rule__SchemaArray__Group__3"
    // InternalJsonSchemaDsl.g:7994:1: rule__SchemaArray__Group__3 : rule__SchemaArray__Group__3__Impl ;
    public final void rule__SchemaArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7998:1: ( rule__SchemaArray__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7999:2: rule__SchemaArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__3"


    // $ANTLR start "rule__SchemaArray__Group__3__Impl"
    // InternalJsonSchemaDsl.g:8005:1: rule__SchemaArray__Group__3__Impl : ( ']' ) ;
    public final void rule__SchemaArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8009:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8010:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8010:1: ( ']' )
            // InternalJsonSchemaDsl.g:8011:2: ']'
            {
             before(grammarAccess.getSchemaArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSchemaArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group__3__Impl"


    // $ANTLR start "rule__SchemaArray__Group_2__0"
    // InternalJsonSchemaDsl.g:8021:1: rule__SchemaArray__Group_2__0 : rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1 ;
    public final void rule__SchemaArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8025:1: ( rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1 )
            // InternalJsonSchemaDsl.g:8026:2: rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SchemaArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group_2__0"


    // $ANTLR start "rule__SchemaArray__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:8033:1: rule__SchemaArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SchemaArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8037:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8038:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8038:1: ( ',' )
            // InternalJsonSchemaDsl.g:8039:2: ','
            {
             before(grammarAccess.getSchemaArrayAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSchemaArrayAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group_2__0__Impl"


    // $ANTLR start "rule__SchemaArray__Group_2__1"
    // InternalJsonSchemaDsl.g:8048:1: rule__SchemaArray__Group_2__1 : rule__SchemaArray__Group_2__1__Impl ;
    public final void rule__SchemaArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8052:1: ( rule__SchemaArray__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8053:2: rule__SchemaArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaArray__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group_2__1"


    // $ANTLR start "rule__SchemaArray__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:8059:1: rule__SchemaArray__Group_2__1__Impl : ( ( rule__SchemaArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__SchemaArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8063:1: ( ( ( rule__SchemaArray__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:8064:1: ( ( rule__SchemaArray__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:8064:1: ( ( rule__SchemaArray__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:8065:2: ( rule__SchemaArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:8066:2: ( rule__SchemaArray__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:8066:3: rule__SchemaArray__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SchemaArray__ItemsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaArrayAccess().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__Group_2__1__Impl"


    // $ANTLR start "rule__KeySchemaPair__Group__0"
    // InternalJsonSchemaDsl.g:8075:1: rule__KeySchemaPair__Group__0 : rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1 ;
    public final void rule__KeySchemaPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8079:1: ( rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1 )
            // InternalJsonSchemaDsl.g:8080:2: rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KeySchemaPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeySchemaPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__Group__0"


    // $ANTLR start "rule__KeySchemaPair__Group__0__Impl"
    // InternalJsonSchemaDsl.g:8087:1: rule__KeySchemaPair__Group__0__Impl : ( ( rule__KeySchemaPair__KeyAssignment_0 ) ) ;
    public final void rule__KeySchemaPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8091:1: ( ( ( rule__KeySchemaPair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:8092:1: ( ( rule__KeySchemaPair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:8092:1: ( ( rule__KeySchemaPair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:8093:2: ( rule__KeySchemaPair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:8094:2: ( rule__KeySchemaPair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:8094:3: rule__KeySchemaPair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeySchemaPair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeySchemaPairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__Group__0__Impl"


    // $ANTLR start "rule__KeySchemaPair__Group__1"
    // InternalJsonSchemaDsl.g:8102:1: rule__KeySchemaPair__Group__1 : rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2 ;
    public final void rule__KeySchemaPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8106:1: ( rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2 )
            // InternalJsonSchemaDsl.g:8107:2: rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__KeySchemaPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeySchemaPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__Group__1"


    // $ANTLR start "rule__KeySchemaPair__Group__1__Impl"
    // InternalJsonSchemaDsl.g:8114:1: rule__KeySchemaPair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeySchemaPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8118:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:8119:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:8119:1: ( ':' )
            // InternalJsonSchemaDsl.g:8120:2: ':'
            {
             before(grammarAccess.getKeySchemaPairAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getKeySchemaPairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__Group__1__Impl"


    // $ANTLR start "rule__KeySchemaPair__Group__2"
    // InternalJsonSchemaDsl.g:8129:1: rule__KeySchemaPair__Group__2 : rule__KeySchemaPair__Group__2__Impl ;
    public final void rule__KeySchemaPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8133:1: ( rule__KeySchemaPair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8134:2: rule__KeySchemaPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeySchemaPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__Group__2"


    // $ANTLR start "rule__KeySchemaPair__Group__2__Impl"
    // InternalJsonSchemaDsl.g:8140:1: rule__KeySchemaPair__Group__2__Impl : ( ( rule__KeySchemaPair__ValueAssignment_2 ) ) ;
    public final void rule__KeySchemaPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8144:1: ( ( ( rule__KeySchemaPair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:8145:1: ( ( rule__KeySchemaPair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:8145:1: ( ( rule__KeySchemaPair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:8146:2: ( rule__KeySchemaPair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:8147:2: ( rule__KeySchemaPair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:8147:3: rule__KeySchemaPair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeySchemaPair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeySchemaPairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__Group__2__Impl"


    // $ANTLR start "rule__TypesAnyOf2__Group__0"
    // InternalJsonSchemaDsl.g:8156:1: rule__TypesAnyOf2__Group__0 : rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1 ;
    public final void rule__TypesAnyOf2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8160:1: ( rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1 )
            // InternalJsonSchemaDsl.g:8161:2: rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__TypesAnyOf2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__0"


    // $ANTLR start "rule__TypesAnyOf2__Group__0__Impl"
    // InternalJsonSchemaDsl.g:8168:1: rule__TypesAnyOf2__Group__0__Impl : ( '[' ) ;
    public final void rule__TypesAnyOf2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8172:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8173:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8173:1: ( '[' )
            // InternalJsonSchemaDsl.g:8174:2: '['
            {
             before(grammarAccess.getTypesAnyOf2Access().getLeftSquareBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypesAnyOf2Access().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__0__Impl"


    // $ANTLR start "rule__TypesAnyOf2__Group__1"
    // InternalJsonSchemaDsl.g:8183:1: rule__TypesAnyOf2__Group__1 : rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2 ;
    public final void rule__TypesAnyOf2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8187:1: ( rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2 )
            // InternalJsonSchemaDsl.g:8188:2: rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TypesAnyOf2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__1"


    // $ANTLR start "rule__TypesAnyOf2__Group__1__Impl"
    // InternalJsonSchemaDsl.g:8195:1: rule__TypesAnyOf2__Group__1__Impl : ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) ) ;
    public final void rule__TypesAnyOf2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8199:1: ( ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:8200:1: ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:8200:1: ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:8201:2: ( rule__TypesAnyOf2__ItemsAssignment_1 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:8202:2: ( rule__TypesAnyOf2__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:8202:3: rule__TypesAnyOf2__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__1__Impl"


    // $ANTLR start "rule__TypesAnyOf2__Group__2"
    // InternalJsonSchemaDsl.g:8210:1: rule__TypesAnyOf2__Group__2 : rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3 ;
    public final void rule__TypesAnyOf2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8214:1: ( rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3 )
            // InternalJsonSchemaDsl.g:8215:2: rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__TypesAnyOf2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__2"


    // $ANTLR start "rule__TypesAnyOf2__Group__2__Impl"
    // InternalJsonSchemaDsl.g:8222:1: rule__TypesAnyOf2__Group__2__Impl : ( ( rule__TypesAnyOf2__Group_2__0 )* ) ;
    public final void rule__TypesAnyOf2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8226:1: ( ( ( rule__TypesAnyOf2__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:8227:1: ( ( rule__TypesAnyOf2__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:8227:1: ( ( rule__TypesAnyOf2__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:8228:2: ( rule__TypesAnyOf2__Group_2__0 )*
            {
             before(grammarAccess.getTypesAnyOf2Access().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8229:2: ( rule__TypesAnyOf2__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==23) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8229:3: rule__TypesAnyOf2__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TypesAnyOf2__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTypesAnyOf2Access().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__2__Impl"


    // $ANTLR start "rule__TypesAnyOf2__Group__3"
    // InternalJsonSchemaDsl.g:8237:1: rule__TypesAnyOf2__Group__3 : rule__TypesAnyOf2__Group__3__Impl ;
    public final void rule__TypesAnyOf2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8241:1: ( rule__TypesAnyOf2__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8242:2: rule__TypesAnyOf2__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__3"


    // $ANTLR start "rule__TypesAnyOf2__Group__3__Impl"
    // InternalJsonSchemaDsl.g:8248:1: rule__TypesAnyOf2__Group__3__Impl : ( ']' ) ;
    public final void rule__TypesAnyOf2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8252:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8253:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8253:1: ( ']' )
            // InternalJsonSchemaDsl.g:8254:2: ']'
            {
             before(grammarAccess.getTypesAnyOf2Access().getRightSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypesAnyOf2Access().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group__3__Impl"


    // $ANTLR start "rule__TypesAnyOf2__Group_2__0"
    // InternalJsonSchemaDsl.g:8264:1: rule__TypesAnyOf2__Group_2__0 : rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1 ;
    public final void rule__TypesAnyOf2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8268:1: ( rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1 )
            // InternalJsonSchemaDsl.g:8269:2: rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__TypesAnyOf2__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group_2__0"


    // $ANTLR start "rule__TypesAnyOf2__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:8276:1: rule__TypesAnyOf2__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypesAnyOf2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8280:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8281:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8281:1: ( ',' )
            // InternalJsonSchemaDsl.g:8282:2: ','
            {
             before(grammarAccess.getTypesAnyOf2Access().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypesAnyOf2Access().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group_2__0__Impl"


    // $ANTLR start "rule__TypesAnyOf2__Group_2__1"
    // InternalJsonSchemaDsl.g:8291:1: rule__TypesAnyOf2__Group_2__1 : rule__TypesAnyOf2__Group_2__1__Impl ;
    public final void rule__TypesAnyOf2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8295:1: ( rule__TypesAnyOf2__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8296:2: rule__TypesAnyOf2__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group_2__1"


    // $ANTLR start "rule__TypesAnyOf2__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:8302:1: rule__TypesAnyOf2__Group_2__1__Impl : ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) ) ;
    public final void rule__TypesAnyOf2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8306:1: ( ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:8307:1: ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:8307:1: ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:8308:2: ( rule__TypesAnyOf2__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:8309:2: ( rule__TypesAnyOf2__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:8309:3: rule__TypesAnyOf2__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypesAnyOf2__ItemsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__Group_2__1__Impl"


    // $ANTLR start "rule__DependenciesAnyOf__Group__0"
    // InternalJsonSchemaDsl.g:8318:1: rule__DependenciesAnyOf__Group__0 : rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1 ;
    public final void rule__DependenciesAnyOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8322:1: ( rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1 )
            // InternalJsonSchemaDsl.g:8323:2: rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DependenciesAnyOf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependenciesAnyOf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__Group__0"


    // $ANTLR start "rule__DependenciesAnyOf__Group__0__Impl"
    // InternalJsonSchemaDsl.g:8330:1: rule__DependenciesAnyOf__Group__0__Impl : ( () ) ;
    public final void rule__DependenciesAnyOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8334:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:8335:1: ( () )
            {
            // InternalJsonSchemaDsl.g:8335:1: ( () )
            // InternalJsonSchemaDsl.g:8336:2: ()
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOfAction_0()); 
            // InternalJsonSchemaDsl.g:8337:2: ()
            // InternalJsonSchemaDsl.g:8337:3: 
            {
            }

             after(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOfAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__Group__0__Impl"


    // $ANTLR start "rule__DependenciesAnyOf__Group__1"
    // InternalJsonSchemaDsl.g:8345:1: rule__DependenciesAnyOf__Group__1 : rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2 ;
    public final void rule__DependenciesAnyOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8349:1: ( rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2 )
            // InternalJsonSchemaDsl.g:8350:2: rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DependenciesAnyOf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependenciesAnyOf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__Group__1"


    // $ANTLR start "rule__DependenciesAnyOf__Group__1__Impl"
    // InternalJsonSchemaDsl.g:8357:1: rule__DependenciesAnyOf__Group__1__Impl : ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? ) ;
    public final void rule__DependenciesAnyOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8361:1: ( ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? ) )
            // InternalJsonSchemaDsl.g:8362:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? )
            {
            // InternalJsonSchemaDsl.g:8362:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? )
            // InternalJsonSchemaDsl.g:8363:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2Assignment_1()); 
            // InternalJsonSchemaDsl.g:8364:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==25) ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3==28) ) {
                        alt29=1;
                    }
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8364:3: rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__Group__1__Impl"


    // $ANTLR start "rule__DependenciesAnyOf__Group__2"
    // InternalJsonSchemaDsl.g:8372:1: rule__DependenciesAnyOf__Group__2 : rule__DependenciesAnyOf__Group__2__Impl ;
    public final void rule__DependenciesAnyOf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8376:1: ( rule__DependenciesAnyOf__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8377:2: rule__DependenciesAnyOf__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DependenciesAnyOf__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__Group__2"


    // $ANTLR start "rule__DependenciesAnyOf__Group__2__Impl"
    // InternalJsonSchemaDsl.g:8383:1: rule__DependenciesAnyOf__Group__2__Impl : ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? ) ;
    public final void rule__DependenciesAnyOf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8387:1: ( ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? ) )
            // InternalJsonSchemaDsl.g:8388:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? )
            {
            // InternalJsonSchemaDsl.g:8388:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? )
            // InternalJsonSchemaDsl.g:8389:2: ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )?
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1Assignment_2()); 
            // InternalJsonSchemaDsl.g:8390:2: ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8390:3: rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__Group__2__Impl"


    // $ANTLR start "rule__KeyStringArrayPair__Group__0"
    // InternalJsonSchemaDsl.g:8399:1: rule__KeyStringArrayPair__Group__0 : rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1 ;
    public final void rule__KeyStringArrayPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8403:1: ( rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1 )
            // InternalJsonSchemaDsl.g:8404:2: rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__KeyStringArrayPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyStringArrayPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__Group__0"


    // $ANTLR start "rule__KeyStringArrayPair__Group__0__Impl"
    // InternalJsonSchemaDsl.g:8411:1: rule__KeyStringArrayPair__Group__0__Impl : ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) ) ;
    public final void rule__KeyStringArrayPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8415:1: ( ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:8416:1: ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:8416:1: ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:8417:2: ( rule__KeyStringArrayPair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:8418:2: ( rule__KeyStringArrayPair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:8418:3: rule__KeyStringArrayPair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyStringArrayPair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringArrayPairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__Group__0__Impl"


    // $ANTLR start "rule__KeyStringArrayPair__Group__1"
    // InternalJsonSchemaDsl.g:8426:1: rule__KeyStringArrayPair__Group__1 : rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2 ;
    public final void rule__KeyStringArrayPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8430:1: ( rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2 )
            // InternalJsonSchemaDsl.g:8431:2: rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__KeyStringArrayPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyStringArrayPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__Group__1"


    // $ANTLR start "rule__KeyStringArrayPair__Group__1__Impl"
    // InternalJsonSchemaDsl.g:8438:1: rule__KeyStringArrayPair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyStringArrayPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8442:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:8443:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:8443:1: ( ':' )
            // InternalJsonSchemaDsl.g:8444:2: ':'
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getKeyStringArrayPairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__Group__1__Impl"


    // $ANTLR start "rule__KeyStringArrayPair__Group__2"
    // InternalJsonSchemaDsl.g:8453:1: rule__KeyStringArrayPair__Group__2 : rule__KeyStringArrayPair__Group__2__Impl ;
    public final void rule__KeyStringArrayPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8457:1: ( rule__KeyStringArrayPair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8458:2: rule__KeyStringArrayPair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyStringArrayPair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__Group__2"


    // $ANTLR start "rule__KeyStringArrayPair__Group__2__Impl"
    // InternalJsonSchemaDsl.g:8464:1: rule__KeyStringArrayPair__Group__2__Impl : ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringArrayPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8468:1: ( ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:8469:1: ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:8469:1: ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:8470:2: ( rule__KeyStringArrayPair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:8471:2: ( rule__KeyStringArrayPair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:8471:3: rule__KeyStringArrayPair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyStringArrayPair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringArrayPairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__Group__2__Impl"


    // $ANTLR start "rule__StringArray__Group__0"
    // InternalJsonSchemaDsl.g:8480:1: rule__StringArray__Group__0 : rule__StringArray__Group__0__Impl rule__StringArray__Group__1 ;
    public final void rule__StringArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8484:1: ( rule__StringArray__Group__0__Impl rule__StringArray__Group__1 )
            // InternalJsonSchemaDsl.g:8485:2: rule__StringArray__Group__0__Impl rule__StringArray__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__StringArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__0"


    // $ANTLR start "rule__StringArray__Group__0__Impl"
    // InternalJsonSchemaDsl.g:8492:1: rule__StringArray__Group__0__Impl : ( () ) ;
    public final void rule__StringArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8496:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:8497:1: ( () )
            {
            // InternalJsonSchemaDsl.g:8497:1: ( () )
            // InternalJsonSchemaDsl.g:8498:2: ()
            {
             before(grammarAccess.getStringArrayAccess().getStringArrayAction_0()); 
            // InternalJsonSchemaDsl.g:8499:2: ()
            // InternalJsonSchemaDsl.g:8499:3: 
            {
            }

             after(grammarAccess.getStringArrayAccess().getStringArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__0__Impl"


    // $ANTLR start "rule__StringArray__Group__1"
    // InternalJsonSchemaDsl.g:8507:1: rule__StringArray__Group__1 : rule__StringArray__Group__1__Impl rule__StringArray__Group__2 ;
    public final void rule__StringArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8511:1: ( rule__StringArray__Group__1__Impl rule__StringArray__Group__2 )
            // InternalJsonSchemaDsl.g:8512:2: rule__StringArray__Group__1__Impl rule__StringArray__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__StringArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__1"


    // $ANTLR start "rule__StringArray__Group__1__Impl"
    // InternalJsonSchemaDsl.g:8519:1: rule__StringArray__Group__1__Impl : ( '[' ) ;
    public final void rule__StringArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8523:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8524:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8524:1: ( '[' )
            // InternalJsonSchemaDsl.g:8525:2: '['
            {
             before(grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__1__Impl"


    // $ANTLR start "rule__StringArray__Group__2"
    // InternalJsonSchemaDsl.g:8534:1: rule__StringArray__Group__2 : rule__StringArray__Group__2__Impl rule__StringArray__Group__3 ;
    public final void rule__StringArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8538:1: ( rule__StringArray__Group__2__Impl rule__StringArray__Group__3 )
            // InternalJsonSchemaDsl.g:8539:2: rule__StringArray__Group__2__Impl rule__StringArray__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__StringArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__2"


    // $ANTLR start "rule__StringArray__Group__2__Impl"
    // InternalJsonSchemaDsl.g:8546:1: rule__StringArray__Group__2__Impl : ( ( rule__StringArray__Group_2__0 )? ) ;
    public final void rule__StringArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8550:1: ( ( ( rule__StringArray__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:8551:1: ( ( rule__StringArray__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:8551:1: ( ( rule__StringArray__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:8552:2: ( rule__StringArray__Group_2__0 )?
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8553:2: ( rule__StringArray__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8553:3: rule__StringArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__2__Impl"


    // $ANTLR start "rule__StringArray__Group__3"
    // InternalJsonSchemaDsl.g:8561:1: rule__StringArray__Group__3 : rule__StringArray__Group__3__Impl ;
    public final void rule__StringArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8565:1: ( rule__StringArray__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8566:2: rule__StringArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__3"


    // $ANTLR start "rule__StringArray__Group__3__Impl"
    // InternalJsonSchemaDsl.g:8572:1: rule__StringArray__Group__3__Impl : ( ']' ) ;
    public final void rule__StringArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8576:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8577:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8577:1: ( ']' )
            // InternalJsonSchemaDsl.g:8578:2: ']'
            {
             before(grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__3__Impl"


    // $ANTLR start "rule__StringArray__Group_2__0"
    // InternalJsonSchemaDsl.g:8588:1: rule__StringArray__Group_2__0 : rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 ;
    public final void rule__StringArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8592:1: ( rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 )
            // InternalJsonSchemaDsl.g:8593:2: rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__StringArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__0"


    // $ANTLR start "rule__StringArray__Group_2__0__Impl"
    // InternalJsonSchemaDsl.g:8600:1: rule__StringArray__Group_2__0__Impl : ( ( rule__StringArray__ValuesAssignment_2_0 ) ) ;
    public final void rule__StringArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8604:1: ( ( ( rule__StringArray__ValuesAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:8605:1: ( ( rule__StringArray__ValuesAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:8605:1: ( ( rule__StringArray__ValuesAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:8606:2: ( rule__StringArray__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getStringArrayAccess().getValuesAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:8607:2: ( rule__StringArray__ValuesAssignment_2_0 )
            // InternalJsonSchemaDsl.g:8607:3: rule__StringArray__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getValuesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__0__Impl"


    // $ANTLR start "rule__StringArray__Group_2__1"
    // InternalJsonSchemaDsl.g:8615:1: rule__StringArray__Group_2__1 : rule__StringArray__Group_2__1__Impl ;
    public final void rule__StringArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8619:1: ( rule__StringArray__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8620:2: rule__StringArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__1"


    // $ANTLR start "rule__StringArray__Group_2__1__Impl"
    // InternalJsonSchemaDsl.g:8626:1: rule__StringArray__Group_2__1__Impl : ( ( rule__StringArray__Group_2_1__0 )* ) ;
    public final void rule__StringArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8630:1: ( ( ( rule__StringArray__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:8631:1: ( ( rule__StringArray__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:8631:1: ( ( rule__StringArray__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:8632:2: ( rule__StringArray__Group_2_1__0 )*
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:8633:2: ( rule__StringArray__Group_2_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8633:3: rule__StringArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StringArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getStringArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__1__Impl"


    // $ANTLR start "rule__StringArray__Group_2_1__0"
    // InternalJsonSchemaDsl.g:8642:1: rule__StringArray__Group_2_1__0 : rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1 ;
    public final void rule__StringArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8646:1: ( rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:8647:2: rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__StringArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2_1__0"


    // $ANTLR start "rule__StringArray__Group_2_1__0__Impl"
    // InternalJsonSchemaDsl.g:8654:1: rule__StringArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StringArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8658:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8659:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8659:1: ( ',' )
            // InternalJsonSchemaDsl.g:8660:2: ','
            {
             before(grammarAccess.getStringArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__StringArray__Group_2_1__1"
    // InternalJsonSchemaDsl.g:8669:1: rule__StringArray__Group_2_1__1 : rule__StringArray__Group_2_1__1__Impl ;
    public final void rule__StringArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8673:1: ( rule__StringArray__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:8674:2: rule__StringArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2_1__1"


    // $ANTLR start "rule__StringArray__Group_2_1__1__Impl"
    // InternalJsonSchemaDsl.g:8680:1: rule__StringArray__Group_2_1__1__Impl : ( ( rule__StringArray__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__StringArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8684:1: ( ( ( rule__StringArray__ValuesAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:8685:1: ( ( rule__StringArray__ValuesAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:8685:1: ( ( rule__StringArray__ValuesAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:8686:2: ( rule__StringArray__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getStringArrayAccess().getValuesAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:8687:2: ( rule__StringArray__ValuesAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:8687:3: rule__StringArray__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__JsonSchema__SchemaAssignment_1"
    // InternalJsonSchemaDsl.g:8696:1: rule__JsonSchema__SchemaAssignment_1 : ( ruleSchema ) ;
    public final void rule__JsonSchema__SchemaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8700:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:8701:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:8701:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:8702:3: ruleSchema
            {
             before(grammarAccess.getJsonSchemaAccess().getSchemaSchemaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getJsonSchemaAccess().getSchemaSchemaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonSchema__SchemaAssignment_1"


    // $ANTLR start "rule__ObjectSchema__KeywordDefinitionAssignment_2_0"
    // InternalJsonSchemaDsl.g:8711:1: rule__ObjectSchema__KeywordDefinitionAssignment_2_0 : ( ruleKeywordDefinition ) ;
    public final void rule__ObjectSchema__KeywordDefinitionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8715:1: ( ( ruleKeywordDefinition ) )
            // InternalJsonSchemaDsl.g:8716:2: ( ruleKeywordDefinition )
            {
            // InternalJsonSchemaDsl.g:8716:2: ( ruleKeywordDefinition )
            // InternalJsonSchemaDsl.g:8717:3: ruleKeywordDefinition
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionKeywordDefinitionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeywordDefinition();

            state._fsp--;

             after(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionKeywordDefinitionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__KeywordDefinitionAssignment_2_0"


    // $ANTLR start "rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1"
    // InternalJsonSchemaDsl.g:8726:1: rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 : ( ruleKeywordDefinition ) ;
    public final void rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8730:1: ( ( ruleKeywordDefinition ) )
            // InternalJsonSchemaDsl.g:8731:2: ( ruleKeywordDefinition )
            {
            // InternalJsonSchemaDsl.g:8731:2: ( ruleKeywordDefinition )
            // InternalJsonSchemaDsl.g:8732:3: ruleKeywordDefinition
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionKeywordDefinitionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeywordDefinition();

            state._fsp--;

             after(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionKeywordDefinitionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1"


    // $ANTLR start "rule__BooleanSchema__ValueAssignment"
    // InternalJsonSchemaDsl.g:8741:1: rule__BooleanSchema__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanSchema__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8745:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8746:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8746:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8747:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanSchemaAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanSchemaAccess().getValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanSchema__ValueAssignment"


    // $ANTLR start "rule__MaximumSchemaDefinition__MaximumAssignment_2"
    // InternalJsonSchemaDsl.g:8756:1: rule__MaximumSchemaDefinition__MaximumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MaximumSchemaDefinition__MaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8760:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:8761:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:8761:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:8762:3: ruleEDouble
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaximumSchemaDefinition__MaximumAssignment_2"


    // $ANTLR start "rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2"
    // InternalJsonSchemaDsl.g:8771:1: rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8775:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8776:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8776:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8777:3: ruleEBoolean
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyEBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2"


    // $ANTLR start "rule__CommentSchemaDefinition__CommentAssignment_2"
    // InternalJsonSchemaDsl.g:8786:1: rule__CommentSchemaDefinition__CommentAssignment_2 : ( ruleEString ) ;
    public final void rule__CommentSchemaDefinition__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8790:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:8791:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:8791:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:8792:3: ruleEString
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getCommentEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommentSchemaDefinitionAccess().getCommentEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentSchemaDefinition__CommentAssignment_2"


    // $ANTLR start "rule__EnumSchemaDefinition__ItemsAssignment_1"
    // InternalJsonSchemaDsl.g:8801:1: rule__EnumSchemaDefinition__ItemsAssignment_1 : ( ruleJsonDocument ) ;
    public final void rule__EnumSchemaDefinition__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8805:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:8806:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:8806:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:8807:3: ruleJsonDocument
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__ItemsAssignment_1"


    // $ANTLR start "rule__EnumSchemaDefinition__ItemsAssignment_2_1"
    // InternalJsonSchemaDsl.g:8816:1: rule__EnumSchemaDefinition__ItemsAssignment_2_1 : ( ruleJsonDocument ) ;
    public final void rule__EnumSchemaDefinition__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8820:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:8821:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:8821:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:8822:3: ruleJsonDocument
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getEnumSchemaDefinitionAccess().getItemsJsonDocumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumSchemaDefinition__ItemsAssignment_2_1"


    // $ANTLR start "rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2"
    // InternalJsonSchemaDsl.g:8831:1: rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8835:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8836:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8836:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8837:3: ruleEBoolean
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsEBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2"


    // $ANTLR start "rule__AnyOfSchemaDefinition__AnyOfAssignment_2"
    // InternalJsonSchemaDsl.g:8846:1: rule__AnyOfSchemaDefinition__AnyOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__AnyOfSchemaDefinition__AnyOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8850:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:8851:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:8851:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:8852:3: ruleSchemaArray
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfSchemaArrayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaArray();

            state._fsp--;

             after(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfSchemaArrayParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyOfSchemaDefinition__AnyOfAssignment_2"


    // $ANTLR start "rule__TitleSchemaDefinition__TitleAssignment_2"
    // InternalJsonSchemaDsl.g:8861:1: rule__TitleSchemaDefinition__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__TitleSchemaDefinition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8865:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:8866:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:8866:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:8867:3: ruleEString
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTitleSchemaDefinitionAccess().getTitleEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleSchemaDefinition__TitleAssignment_2"


    // $ANTLR start "rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1"
    // InternalJsonSchemaDsl.g:8876:1: rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1 : ( ruleSchema ) ;
    public final void rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8880:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:8881:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:8881:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:8882:3: ruleSchema
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1SchemaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1SchemaParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3_1"


    // $ANTLR start "rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1"
    // InternalJsonSchemaDsl.g:8891:1: rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1 : ( ruleSchemaArray ) ;
    public final void rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8895:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:8896:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:8896:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:8897:3: ruleSchemaArray
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2SchemaArrayParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaArray();

            state._fsp--;

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2SchemaArrayParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4_1"


    // $ANTLR start "rule__DefaultSchemaDefinition__DefaultAssignment_2"
    // InternalJsonSchemaDsl.g:8906:1: rule__DefaultSchemaDefinition__DefaultAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__DefaultSchemaDefinition__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8910:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:8911:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:8911:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:8912:3: ruleJsonDocument
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultJsonDocumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultJsonDocumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultSchemaDefinition__DefaultAssignment_2"


    // $ANTLR start "rule__ThenSchemaDefinition__ThenAssignment_2"
    // InternalJsonSchemaDsl.g:8921:1: rule__ThenSchemaDefinition__ThenAssignment_2 : ( ruleSchema ) ;
    public final void rule__ThenSchemaDefinition__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8925:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:8926:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:8926:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:8927:3: ruleSchema
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getThenSchemaDefinitionAccess().getThenSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenSchemaDefinition__ThenAssignment_2"


    // $ANTLR start "rule__MinLengthSchemaDefinition__MinLengthAssignment_2"
    // InternalJsonSchemaDsl.g:8936:1: rule__MinLengthSchemaDefinition__MinLengthAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinLengthSchemaDefinition__MinLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8940:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:8941:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:8941:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:8942:3: ruleNonNegativeIntegerDefault0
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthNonNegativeIntegerDefault0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNonNegativeIntegerDefault0();

            state._fsp--;

             after(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthNonNegativeIntegerDefault0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLengthSchemaDefinition__MinLengthAssignment_2"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0"
    // InternalJsonSchemaDsl.g:8951:1: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8955:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:8956:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:8956:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:8957:3: ruleKeySchemaPair
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0"


    // $ANTLR start "rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1"
    // InternalJsonSchemaDsl.g:8966:1: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8970:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:8971:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:8971:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:8972:3: ruleKeySchemaPair
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1"


    // $ANTLR start "rule__MinItemsSchemaDefinition__MinItemsAssignment_2"
    // InternalJsonSchemaDsl.g:8981:1: rule__MinItemsSchemaDefinition__MinItemsAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinItemsSchemaDefinition__MinItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8985:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:8986:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:8986:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:8987:3: ruleNonNegativeIntegerDefault0
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsNonNegativeIntegerDefault0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNonNegativeIntegerDefault0();

            state._fsp--;

             after(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsNonNegativeIntegerDefault0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinItemsSchemaDefinition__MinItemsAssignment_2"


    // $ANTLR start "rule__OneOfSchemaDefinition__OneOfAssignment_2"
    // InternalJsonSchemaDsl.g:8996:1: rule__OneOfSchemaDefinition__OneOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__OneOfSchemaDefinition__OneOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9000:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9001:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9001:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9002:3: ruleSchemaArray
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfSchemaArrayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaArray();

            state._fsp--;

             after(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfSchemaArrayParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOfSchemaDefinition__OneOfAssignment_2"


    // $ANTLR start "rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2"
    // InternalJsonSchemaDsl.g:9011:1: rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9015:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9016:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9016:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9017:3: ruleNonNegativeInteger
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesNonNegativeIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;

             after(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesNonNegativeIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2"


    // $ANTLR start "rule__MinimumSchemaDefinition__MinimumAssignment_2"
    // InternalJsonSchemaDsl.g:9026:1: rule__MinimumSchemaDefinition__MinimumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MinimumSchemaDefinition__MinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9030:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9031:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9031:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9032:3: ruleEDouble
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinimumSchemaDefinition__MinimumAssignment_2"


    // $ANTLR start "rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2"
    // InternalJsonSchemaDsl.g:9041:1: rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9045:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9046:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9046:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9047:3: ruleNonNegativeInteger
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsNonNegativeIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;

             after(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsNonNegativeIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2"


    // $ANTLR start "rule__FormatSchemaDefinition__FormatAssignment_2"
    // InternalJsonSchemaDsl.g:9056:1: rule__FormatSchemaDefinition__FormatAssignment_2 : ( ruleEString ) ;
    public final void rule__FormatSchemaDefinition__FormatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9060:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9061:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9061:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9062:3: ruleEString
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormatSchemaDefinitionAccess().getFormatEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSchemaDefinition__FormatAssignment_2"


    // $ANTLR start "rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2"
    // InternalJsonSchemaDsl.g:9071:1: rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9075:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9076:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9076:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9077:3: ruleEBoolean
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyEBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2"


    // $ANTLR start "rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3"
    // InternalJsonSchemaDsl.g:9086:1: rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 : ( ruleSimpleTypes ) ;
    public final void rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9090:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:9091:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:9091:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:9092:3: ruleSimpleTypes
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1SimpleTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1SimpleTypesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3"


    // $ANTLR start "rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4"
    // InternalJsonSchemaDsl.g:9101:1: rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 : ( ruleTypesAnyOf2 ) ;
    public final void rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9105:1: ( ( ruleTypesAnyOf2 ) )
            // InternalJsonSchemaDsl.g:9106:2: ( ruleTypesAnyOf2 )
            {
            // InternalJsonSchemaDsl.g:9106:2: ( ruleTypesAnyOf2 )
            // InternalJsonSchemaDsl.g:9107:3: ruleTypesAnyOf2
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2TypesAnyOf2ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypesAnyOf2();

            state._fsp--;

             after(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2TypesAnyOf2ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4"


    // $ANTLR start "rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2"
    // InternalJsonSchemaDsl.g:9116:1: rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 : ( ruleSchema ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9120:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9121:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9121:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9122:3: ruleSchema
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__ElseSchemaDefinition__ElseAssignment_2"
    // InternalJsonSchemaDsl.g:9131:1: rule__ElseSchemaDefinition__ElseAssignment_2 : ( ruleSchema ) ;
    public final void rule__ElseSchemaDefinition__ElseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9135:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9136:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9136:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9137:3: ruleSchema
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getElseSchemaDefinitionAccess().getElseSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseSchemaDefinition__ElseAssignment_2"


    // $ANTLR start "rule__IdSchemaDefinition__IdAssignment_2"
    // InternalJsonSchemaDsl.g:9146:1: rule__IdSchemaDefinition__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__IdSchemaDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9150:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9151:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9151:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9152:3: ruleEString
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdSchemaDefinitionAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSchemaDefinition__IdAssignment_2"


    // $ANTLR start "rule__ConstSchemaDefinition__ConstAssignment_2"
    // InternalJsonSchemaDsl.g:9161:1: rule__ConstSchemaDefinition__ConstAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__ConstSchemaDefinition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9165:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9166:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9166:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9167:3: ruleJsonDocument
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstJsonDocumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getConstSchemaDefinitionAccess().getConstJsonDocumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstSchemaDefinition__ConstAssignment_2"


    // $ANTLR start "rule__RequiredSchemaDefinition__RequiredAssignment_2"
    // InternalJsonSchemaDsl.g:9176:1: rule__RequiredSchemaDefinition__RequiredAssignment_2 : ( ruleStringArray ) ;
    public final void rule__RequiredSchemaDefinition__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9180:1: ( ( ruleStringArray ) )
            // InternalJsonSchemaDsl.g:9181:2: ( ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:9181:2: ( ruleStringArray )
            // InternalJsonSchemaDsl.g:9182:3: ruleStringArray
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredStringArrayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringArray();

            state._fsp--;

             after(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredStringArrayParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredSchemaDefinition__RequiredAssignment_2"


    // $ANTLR start "rule__DescriptionSchemaDefinition__DescriptionAssignment_2"
    // InternalJsonSchemaDsl.g:9191:1: rule__DescriptionSchemaDefinition__DescriptionAssignment_2 : ( ruleEString ) ;
    public final void rule__DescriptionSchemaDefinition__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9195:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9196:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9196:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9197:3: ruleEString
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionSchemaDefinition__DescriptionAssignment_2"


    // $ANTLR start "rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2"
    // InternalJsonSchemaDsl.g:9206:1: rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9210:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9211:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9211:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9212:3: ruleNonNegativeIntegerDefault0
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesNonNegativeIntegerDefault0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNonNegativeIntegerDefault0();

            state._fsp--;

             after(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesNonNegativeIntegerDefault0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0"
    // InternalJsonSchemaDsl.g:9221:1: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9225:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9226:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9226:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9227:3: ruleKeySchemaPair
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0"


    // $ANTLR start "rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1"
    // InternalJsonSchemaDsl.g:9236:1: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9240:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9241:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9241:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9242:3: ruleKeySchemaPair
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1"


    // $ANTLR start "rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2"
    // InternalJsonSchemaDsl.g:9251:1: rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 : ( ruleSchema ) ;
    public final void rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9255:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9256:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9256:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9257:3: ruleSchema
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2"


    // $ANTLR start "rule__KeyValuePair__KeyAssignment_0"
    // InternalJsonSchemaDsl.g:9266:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9270:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9271:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9271:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9272:3: ruleEString
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__KeyValuePair__ValueAssignment_2"
    // InternalJsonSchemaDsl.g:9281:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9285:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9286:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9286:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9287:3: ruleValue
            {
             before(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__ValueAssignment_2"


    // $ANTLR start "rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0"
    // InternalJsonSchemaDsl.g:9296:1: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 : ( ruleJsonDocument ) ;
    public final void rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9300:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9301:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9301:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9302:3: ruleJsonDocument
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0"


    // $ANTLR start "rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1"
    // InternalJsonSchemaDsl.g:9311:1: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 : ( ruleJsonDocument ) ;
    public final void rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9315:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9316:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9316:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9317:3: ruleJsonDocument
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesJsonDocumentParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1"


    // $ANTLR start "rule__IfSchemaDefinition__IfAssignment_2"
    // InternalJsonSchemaDsl.g:9326:1: rule__IfSchemaDefinition__IfAssignment_2 : ( ruleSchema ) ;
    public final void rule__IfSchemaDefinition__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9330:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9331:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9331:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9332:3: ruleSchema
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getIfSchemaDefinitionAccess().getIfSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfSchemaDefinition__IfAssignment_2"


    // $ANTLR start "rule__AllOfSchemaDefinition__AllOfAssignment_2"
    // InternalJsonSchemaDsl.g:9341:1: rule__AllOfSchemaDefinition__AllOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__AllOfSchemaDefinition__AllOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9345:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9346:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9346:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9347:3: ruleSchemaArray
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfSchemaArrayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaArray();

            state._fsp--;

             after(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfSchemaArrayParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllOfSchemaDefinition__AllOfAssignment_2"


    // $ANTLR start "rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2"
    // InternalJsonSchemaDsl.g:9356:1: rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9360:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9361:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9361:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9362:3: ruleEString
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2"


    // $ANTLR start "rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2"
    // InternalJsonSchemaDsl.g:9371:1: rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9375:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9376:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9376:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9377:3: ruleEDouble
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2"


    // $ANTLR start "rule__PatternSchemaDefinition__PatternAssignment_2"
    // InternalJsonSchemaDsl.g:9386:1: rule__PatternSchemaDefinition__PatternAssignment_2 : ( ruleEString ) ;
    public final void rule__PatternSchemaDefinition__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9390:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9391:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9391:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9392:3: ruleEString
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternSchemaDefinitionAccess().getPatternEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternSchemaDefinition__PatternAssignment_2"


    // $ANTLR start "rule__ContainsSchemaDefinition__ContainsAssignment_2"
    // InternalJsonSchemaDsl.g:9401:1: rule__ContainsSchemaDefinition__ContainsAssignment_2 : ( ruleSchema ) ;
    public final void rule__ContainsSchemaDefinition__ContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9405:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9406:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9406:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9407:3: ruleSchema
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getContainsSchemaDefinitionAccess().getContainsSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsSchemaDefinition__ContainsAssignment_2"


    // $ANTLR start "rule__NotSchemaDefinition__NotAssignment_2"
    // InternalJsonSchemaDsl.g:9416:1: rule__NotSchemaDefinition__NotAssignment_2 : ( ruleSchema ) ;
    public final void rule__NotSchemaDefinition__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9420:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9421:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9421:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9422:3: ruleSchema
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getNotSchemaDefinitionAccess().getNotSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSchemaDefinition__NotAssignment_2"


    // $ANTLR start "rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2"
    // InternalJsonSchemaDsl.g:9431:1: rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9435:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9436:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9436:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9437:3: ruleEDouble
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2"


    // $ANTLR start "rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2"
    // InternalJsonSchemaDsl.g:9446:1: rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9450:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9451:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9451:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9452:3: ruleNonNegativeInteger
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthNonNegativeIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;

             after(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthNonNegativeIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2"


    // $ANTLR start "rule__RefSchemaDefinition__RefAssignment_2"
    // InternalJsonSchemaDsl.g:9461:1: rule__RefSchemaDefinition__RefAssignment_2 : ( ruleEString ) ;
    public final void rule__RefSchemaDefinition__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9465:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9466:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9466:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9467:3: ruleEString
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getRefEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRefSchemaDefinitionAccess().getRefEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefSchemaDefinition__RefAssignment_2"


    // $ANTLR start "rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2"
    // InternalJsonSchemaDsl.g:9476:1: rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9480:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9481:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9481:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9482:3: ruleEString
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2"


    // $ANTLR start "rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2"
    // InternalJsonSchemaDsl.g:9491:1: rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9495:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9496:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9496:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9497:3: ruleEDouble
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2"


    // $ANTLR start "rule__SchemaSchemaDefinition__SchemaAssignment_2"
    // InternalJsonSchemaDsl.g:9506:1: rule__SchemaSchemaDefinition__SchemaAssignment_2 : ( ruleEString ) ;
    public final void rule__SchemaSchemaDefinition__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9510:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9511:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9511:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9512:3: ruleEString
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaSchemaDefinition__SchemaAssignment_2"


    // $ANTLR start "rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0"
    // InternalJsonSchemaDsl.g:9521:1: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9525:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9526:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9526:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9527:3: ruleKeySchemaPair
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0"


    // $ANTLR start "rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1"
    // InternalJsonSchemaDsl.g:9536:1: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9540:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9541:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9541:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9542:3: ruleKeySchemaPair
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsKeySchemaPairParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1"


    // $ANTLR start "rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2"
    // InternalJsonSchemaDsl.g:9551:1: rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 : ( ruleSchema ) ;
    public final void rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9555:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9556:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9556:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9557:3: ruleSchema
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalJsonSchemaDsl.g:9566:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9570:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9571:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9571:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9572:3: ruleValue
            {
             before(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonDocument__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment"
    // InternalJsonSchemaDsl.g:9581:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9585:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9586:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9586:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9587:3: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalJsonSchemaDsl.g:9596:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9600:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9601:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9601:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9602:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalJsonSchemaDsl.g:9611:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9615:1: ( ( RULE_STRING ) )
            // InternalJsonSchemaDsl.g:9616:2: ( RULE_STRING )
            {
            // InternalJsonSchemaDsl.g:9616:2: ( RULE_STRING )
            // InternalJsonSchemaDsl.g:9617:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__ObjectValue__KeyvaluepairAssignment_2_0"
    // InternalJsonSchemaDsl.g:9626:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9630:1: ( ( ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:9631:2: ( ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:9631:2: ( ruleKeyValuePair )
            // InternalJsonSchemaDsl.g:9632:3: ruleKeyValuePair
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyValuePair();

            state._fsp--;

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__KeyvaluepairAssignment_2_0"


    // $ANTLR start "rule__ObjectValue__KeyvaluepairAssignment_2_1_1"
    // InternalJsonSchemaDsl.g:9641:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9645:1: ( ( ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:9646:2: ( ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:9646:2: ( ruleKeyValuePair )
            // InternalJsonSchemaDsl.g:9647:3: ruleKeyValuePair
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyValuePair();

            state._fsp--;

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__KeyvaluepairAssignment_2_1_1"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalJsonSchemaDsl.g:9656:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9660:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9661:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9661:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9662:3: ruleEDouble
            {
             before(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__ArrayValue__ValueAssignment_2_0"
    // InternalJsonSchemaDsl.g:9671:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9675:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9676:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9676:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9677:3: ruleValue
            {
             before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__ValueAssignment_2_0"


    // $ANTLR start "rule__ArrayValue__ValueAssignment_2_1_1"
    // InternalJsonSchemaDsl.g:9686:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9690:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9691:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9691:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9692:3: ruleValue
            {
             before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__ValueAssignment_2_1_1"


    // $ANTLR start "rule__SchemaArray__ItemsAssignment_1"
    // InternalJsonSchemaDsl.g:9701:1: rule__SchemaArray__ItemsAssignment_1 : ( ruleSchema ) ;
    public final void rule__SchemaArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9705:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9706:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9706:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9707:3: ruleSchema
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__ItemsAssignment_1"


    // $ANTLR start "rule__SchemaArray__ItemsAssignment_2_1"
    // InternalJsonSchemaDsl.g:9716:1: rule__SchemaArray__ItemsAssignment_2_1 : ( ruleSchema ) ;
    public final void rule__SchemaArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9720:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9721:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9721:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9722:3: ruleSchema
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaArrayAccess().getItemsSchemaParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaArray__ItemsAssignment_2_1"


    // $ANTLR start "rule__NonNegativeIntegerDefault0__ValueAssignment"
    // InternalJsonSchemaDsl.g:9731:1: rule__NonNegativeIntegerDefault0__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NonNegativeIntegerDefault0__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9735:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9736:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9736:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9737:3: ruleEInt
            {
             before(grammarAccess.getNonNegativeIntegerDefault0Access().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNonNegativeIntegerDefault0Access().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeIntegerDefault0__ValueAssignment"


    // $ANTLR start "rule__KeySchemaPair__KeyAssignment_0"
    // InternalJsonSchemaDsl.g:9746:1: rule__KeySchemaPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeySchemaPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9750:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9751:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9751:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9752:3: ruleEString
            {
             before(grammarAccess.getKeySchemaPairAccess().getKeyEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeySchemaPairAccess().getKeyEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__KeyAssignment_0"


    // $ANTLR start "rule__KeySchemaPair__ValueAssignment_2"
    // InternalJsonSchemaDsl.g:9761:1: rule__KeySchemaPair__ValueAssignment_2 : ( ruleSchema ) ;
    public final void rule__KeySchemaPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9765:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9766:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9766:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9767:3: ruleSchema
            {
             before(grammarAccess.getKeySchemaPairAccess().getValueSchemaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getKeySchemaPairAccess().getValueSchemaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySchemaPair__ValueAssignment_2"


    // $ANTLR start "rule__NonNegativeInteger__ValueAssignment"
    // InternalJsonSchemaDsl.g:9776:1: rule__NonNegativeInteger__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NonNegativeInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9780:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9781:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9781:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9782:3: ruleEInt
            {
             before(grammarAccess.getNonNegativeIntegerAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNonNegativeIntegerAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__ValueAssignment"


    // $ANTLR start "rule__TypesAnyOf2__ItemsAssignment_1"
    // InternalJsonSchemaDsl.g:9791:1: rule__TypesAnyOf2__ItemsAssignment_1 : ( ruleSimpleTypes ) ;
    public final void rule__TypesAnyOf2__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9795:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:9796:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:9796:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:9797:3: ruleSimpleTypes
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__ItemsAssignment_1"


    // $ANTLR start "rule__TypesAnyOf2__ItemsAssignment_2_1"
    // InternalJsonSchemaDsl.g:9806:1: rule__TypesAnyOf2__ItemsAssignment_2_1 : ( ruleSimpleTypes ) ;
    public final void rule__TypesAnyOf2__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9810:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:9811:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:9811:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:9812:3: ruleSimpleTypes
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleTypes();

            state._fsp--;

             after(grammarAccess.getTypesAnyOf2Access().getItemsSimpleTypesEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypesAnyOf2__ItemsAssignment_2_1"


    // $ANTLR start "rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1"
    // InternalJsonSchemaDsl.g:9821:1: rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 : ( ruleKeyStringArrayPair ) ;
    public final void rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9825:1: ( ( ruleKeyStringArrayPair ) )
            // InternalJsonSchemaDsl.g:9826:2: ( ruleKeyStringArrayPair )
            {
            // InternalJsonSchemaDsl.g:9826:2: ( ruleKeyStringArrayPair )
            // InternalJsonSchemaDsl.g:9827:3: ruleKeyStringArrayPair
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2KeyStringArrayPairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyStringArrayPair();

            state._fsp--;

             after(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2KeyStringArrayPairParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1"


    // $ANTLR start "rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2"
    // InternalJsonSchemaDsl.g:9836:1: rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 : ( ruleKeySchemaPair ) ;
    public final void rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9840:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9841:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9841:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9842:3: ruleKeySchemaPair
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1KeySchemaPairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKeySchemaPair();

            state._fsp--;

             after(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1KeySchemaPairParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2"


    // $ANTLR start "rule__KeyStringArrayPair__KeyAssignment_0"
    // InternalJsonSchemaDsl.g:9851:1: rule__KeyStringArrayPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyStringArrayPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9855:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9856:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9856:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9857:3: ruleEString
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getKeyEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyStringArrayPairAccess().getKeyEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__KeyAssignment_0"


    // $ANTLR start "rule__KeyStringArrayPair__ValueAssignment_2"
    // InternalJsonSchemaDsl.g:9866:1: rule__KeyStringArrayPair__ValueAssignment_2 : ( ruleStringArray ) ;
    public final void rule__KeyStringArrayPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9870:1: ( ( ruleStringArray ) )
            // InternalJsonSchemaDsl.g:9871:2: ( ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:9871:2: ( ruleStringArray )
            // InternalJsonSchemaDsl.g:9872:3: ruleStringArray
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getValueStringArrayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringArray();

            state._fsp--;

             after(grammarAccess.getKeyStringArrayPairAccess().getValueStringArrayParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringArrayPair__ValueAssignment_2"


    // $ANTLR start "rule__StringArray__ValuesAssignment_2_0"
    // InternalJsonSchemaDsl.g:9881:1: rule__StringArray__ValuesAssignment_2_0 : ( ruleEString ) ;
    public final void rule__StringArray__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9885:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9886:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9886:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9887:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__ValuesAssignment_2_0"


    // $ANTLR start "rule__StringArray__ValuesAssignment_2_1_1"
    // InternalJsonSchemaDsl.g:9896:1: rule__StringArray__ValuesAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__StringArray__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9900:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9901:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9901:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9902:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getValuesEStringParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__ValuesAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000203000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xFFFFFFF3DD400020L,0x00000000000001FFL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xFFFFFFF3DD000020L,0x00000000000001FFL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010203070L,0x0000000000000600L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000101FC000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030203070L,0x0000000000000600L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFFFFFFF3FD000020L,0x00000000000001FFL});

}