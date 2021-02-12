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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSON_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'\"$id\"'", "'\"$schema\"'", "'\"$ref\"'", "'\"$comment\"'", "'\"title\"'", "'\"description\"'", "'\"default\"'", "'\"readOnly\"'", "'\"writeOnly\"'", "'\"examples\"'", "'\"multipleOf\"'", "'\"maximum\"'", "'\"exclusiveMaximum\"'", "'\"maxLength\"'", "'\"minLength\"'", "'\"pattern\"'", "'\"additionalItems\"'", "'\"items\"'", "'\"maxItems\"'", "'\"minItems\"'", "'\"uniqueItems\"'", "'\"contains\"'", "'\"maxProperties\"'", "'\"minProperties\"'", "'\"required\"'", "'\"additionalProperties\"'", "'\"definitions\"'", "'\"properties\"'", "'\"patternProperties\"'", "'\"propertyNames\"'", "'\"const\"'", "'\"type\"'", "'\"format\"'", "'\"contentMediaType\"'", "'\"contentEncoding\"'", "'\"if\"'", "'\"then\"'", "'\"else\"'", "'\"allOf\"'", "'\"anyOf\"'", "'\"oneOf\"'", "'\"not\"'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"string\"'", "'{'", "'}'", "','", "':'", "'['", "']'", "'\"minimum\"'", "'\"exclusiveMinimum\"'", "'null'", "'-'"
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
    // InternalJsonSchemaDsl.g:1412:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1416:2: ( ( ruleVALID_STRING ) )
            // InternalJsonSchemaDsl.g:1417:2: ( ruleVALID_STRING )
            {
            // InternalJsonSchemaDsl.g:1417:2: ( ruleVALID_STRING )
            // InternalJsonSchemaDsl.g:1418:3: ruleVALID_STRING
            {
             before(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalJsonSchemaDsl.g:1853:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1854:1: ( ruleVALID_STRING EOF )
            // InternalJsonSchemaDsl.g:1855:1: ruleVALID_STRING EOF
            {
             before(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getVALID_STRINGRule()); 
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
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalJsonSchemaDsl.g:1862:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1866:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:1867:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:1867:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalJsonSchemaDsl.g:1868:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:1869:3: ( rule__VALID_STRING__Alternatives )
            // InternalJsonSchemaDsl.g:1869:4: rule__VALID_STRING__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALID_STRING__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalJsonSchemaDsl.g:1878:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalJsonSchemaDsl.g:1879:1: ( ruleKEYWORD EOF )
            // InternalJsonSchemaDsl.g:1880:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalJsonSchemaDsl.g:1887:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1891:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:1892:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:1892:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalJsonSchemaDsl.g:1893:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:1894:3: ( rule__KEYWORD__Alternatives )
            // InternalJsonSchemaDsl.g:1894:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleSimpleTypes"
    // InternalJsonSchemaDsl.g:1903:1: ruleSimpleTypes : ( ( rule__SimpleTypes__Alternatives ) ) ;
    public final void ruleSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1907:1: ( ( ( rule__SimpleTypes__Alternatives ) ) )
            // InternalJsonSchemaDsl.g:1908:2: ( ( rule__SimpleTypes__Alternatives ) )
            {
            // InternalJsonSchemaDsl.g:1908:2: ( ( rule__SimpleTypes__Alternatives ) )
            // InternalJsonSchemaDsl.g:1909:3: ( rule__SimpleTypes__Alternatives )
            {
             before(grammarAccess.getSimpleTypesAccess().getAlternatives()); 
            // InternalJsonSchemaDsl.g:1910:3: ( rule__SimpleTypes__Alternatives )
            // InternalJsonSchemaDsl.g:1910:4: rule__SimpleTypes__Alternatives
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
    // InternalJsonSchemaDsl.g:1918:1: rule__Schema__Alternatives : ( ( ruleObjectSchema ) | ( ruleBooleanSchema ) );
    public final void rule__Schema__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1922:1: ( ( ruleObjectSchema ) | ( ruleBooleanSchema ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==63) ) {
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
                    // InternalJsonSchemaDsl.g:1923:2: ( ruleObjectSchema )
                    {
                    // InternalJsonSchemaDsl.g:1923:2: ( ruleObjectSchema )
                    // InternalJsonSchemaDsl.g:1924:3: ruleObjectSchema
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
                    // InternalJsonSchemaDsl.g:1929:2: ( ruleBooleanSchema )
                    {
                    // InternalJsonSchemaDsl.g:1929:2: ( ruleBooleanSchema )
                    // InternalJsonSchemaDsl.g:1930:3: ruleBooleanSchema
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
    // InternalJsonSchemaDsl.g:1939:1: rule__KeywordDefinition__Alternatives : ( ( ruleIdSchemaDefinition ) | ( ruleSchemaSchemaDefinition ) | ( ruleRefSchemaDefinition ) | ( ruleCommentSchemaDefinition ) | ( ruleTitleSchemaDefinition ) | ( ruleDescriptionSchemaDefinition ) | ( ruleDefaultSchemaDefinition ) | ( ruleReadOnlySchemaDefinition ) | ( ruleWriteOnlySchemaDefinition ) | ( ruleExamplesSchemaDefinition ) | ( ruleMultipleOfSchemaDefinition ) | ( ruleMaximumSchemaDefinition ) | ( ruleExclusiveMaximumSchemaDefinition ) | ( ruleMinimumSchemaDefinition ) | ( ruleExclusiveMinimumSchemaDefinition ) | ( ruleMaxLengthSchemaDefinition ) | ( ruleMinLengthSchemaDefinition ) | ( rulePatternSchemaDefinition ) | ( ruleAdditionalItemsSchemaDefinition ) | ( ruleItemsSchemaDefinition ) | ( ruleMaxItemsSchemaDefinition ) | ( ruleMinItemsSchemaDefinition ) | ( ruleUniqueItemsSchemaDefinition ) | ( ruleContainsSchemaDefinition ) | ( ruleMaxPropertiesSchemaDefinition ) | ( ruleMinPropertiesSchemaDefinition ) | ( ruleRequiredSchemaDefinition ) | ( ruleAdditionalPropertiesSchemaDefinition ) | ( ruleDefinitionsSchemaDefinition ) | ( rulePropertiesSchemaDefinition ) | ( rulePatternPropertiesSchemaDefinition ) | ( rulePropertyNamesSchemaDefinition ) | ( ruleConstSchemaDefinition ) | ( ruleEnumSchemaDefinition ) | ( ruleTypeSchemaDefinition ) | ( ruleFormatSchemaDefinition ) | ( ruleContentMediaTypeSchemaDefinition ) | ( ruleContentEncodingSchemaDefinition ) | ( ruleIfSchemaDefinition ) | ( ruleThenSchemaDefinition ) | ( ruleElseSchemaDefinition ) | ( ruleAllOfSchemaDefinition ) | ( ruleAnyOfSchemaDefinition ) | ( ruleOneOfSchemaDefinition ) | ( ruleNotSchemaDefinition ) | ( ruleKeyValuePair ) );
    public final void rule__KeywordDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:1943:1: ( ( ruleIdSchemaDefinition ) | ( ruleSchemaSchemaDefinition ) | ( ruleRefSchemaDefinition ) | ( ruleCommentSchemaDefinition ) | ( ruleTitleSchemaDefinition ) | ( ruleDescriptionSchemaDefinition ) | ( ruleDefaultSchemaDefinition ) | ( ruleReadOnlySchemaDefinition ) | ( ruleWriteOnlySchemaDefinition ) | ( ruleExamplesSchemaDefinition ) | ( ruleMultipleOfSchemaDefinition ) | ( ruleMaximumSchemaDefinition ) | ( ruleExclusiveMaximumSchemaDefinition ) | ( ruleMinimumSchemaDefinition ) | ( ruleExclusiveMinimumSchemaDefinition ) | ( ruleMaxLengthSchemaDefinition ) | ( ruleMinLengthSchemaDefinition ) | ( rulePatternSchemaDefinition ) | ( ruleAdditionalItemsSchemaDefinition ) | ( ruleItemsSchemaDefinition ) | ( ruleMaxItemsSchemaDefinition ) | ( ruleMinItemsSchemaDefinition ) | ( ruleUniqueItemsSchemaDefinition ) | ( ruleContainsSchemaDefinition ) | ( ruleMaxPropertiesSchemaDefinition ) | ( ruleMinPropertiesSchemaDefinition ) | ( ruleRequiredSchemaDefinition ) | ( ruleAdditionalPropertiesSchemaDefinition ) | ( ruleDefinitionsSchemaDefinition ) | ( rulePropertiesSchemaDefinition ) | ( rulePatternPropertiesSchemaDefinition ) | ( rulePropertyNamesSchemaDefinition ) | ( ruleConstSchemaDefinition ) | ( ruleEnumSchemaDefinition ) | ( ruleTypeSchemaDefinition ) | ( ruleFormatSchemaDefinition ) | ( ruleContentMediaTypeSchemaDefinition ) | ( ruleContentEncodingSchemaDefinition ) | ( ruleIfSchemaDefinition ) | ( ruleThenSchemaDefinition ) | ( ruleElseSchemaDefinition ) | ( ruleAllOfSchemaDefinition ) | ( ruleAnyOfSchemaDefinition ) | ( ruleOneOfSchemaDefinition ) | ( ruleNotSchemaDefinition ) | ( ruleKeyValuePair ) )
            int alt2=46;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            case 23:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 25:
                {
                alt2=12;
                }
                break;
            case 26:
                {
                alt2=13;
                }
                break;
            case 69:
                {
                alt2=14;
                }
                break;
            case 70:
                {
                alt2=15;
                }
                break;
            case 27:
                {
                alt2=16;
                }
                break;
            case 28:
                {
                alt2=17;
                }
                break;
            case 29:
                {
                alt2=18;
                }
                break;
            case 30:
                {
                alt2=19;
                }
                break;
            case 31:
                {
                alt2=20;
                }
                break;
            case 32:
                {
                alt2=21;
                }
                break;
            case 33:
                {
                alt2=22;
                }
                break;
            case 34:
                {
                alt2=23;
                }
                break;
            case 35:
                {
                alt2=24;
                }
                break;
            case 36:
                {
                alt2=25;
                }
                break;
            case 37:
                {
                alt2=26;
                }
                break;
            case 38:
                {
                alt2=27;
                }
                break;
            case 39:
                {
                alt2=28;
                }
                break;
            case 40:
                {
                alt2=29;
                }
                break;
            case 41:
                {
                alt2=30;
                }
                break;
            case 42:
                {
                alt2=31;
                }
                break;
            case 43:
                {
                alt2=32;
                }
                break;
            case 44:
                {
                alt2=33;
                }
                break;
            case 67:
                {
                alt2=34;
                }
                break;
            case 45:
                {
                alt2=35;
                }
                break;
            case 46:
                {
                alt2=36;
                }
                break;
            case 47:
                {
                alt2=37;
                }
                break;
            case 48:
                {
                alt2=38;
                }
                break;
            case 49:
                {
                alt2=39;
                }
                break;
            case 50:
                {
                alt2=40;
                }
                break;
            case 51:
                {
                alt2=41;
                }
                break;
            case 52:
                {
                alt2=42;
                }
                break;
            case 53:
                {
                alt2=43;
                }
                break;
            case 54:
                {
                alt2=44;
                }
                break;
            case 55:
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
                    // InternalJsonSchemaDsl.g:1944:2: ( ruleIdSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1944:2: ( ruleIdSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1945:3: ruleIdSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1950:2: ( ruleSchemaSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1950:2: ( ruleSchemaSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1951:3: ruleSchemaSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1956:2: ( ruleRefSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1956:2: ( ruleRefSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1957:3: ruleRefSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1962:2: ( ruleCommentSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1962:2: ( ruleCommentSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1963:3: ruleCommentSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1968:2: ( ruleTitleSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1968:2: ( ruleTitleSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1969:3: ruleTitleSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1974:2: ( ruleDescriptionSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1974:2: ( ruleDescriptionSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1975:3: ruleDescriptionSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1980:2: ( ruleDefaultSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1980:2: ( ruleDefaultSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1981:3: ruleDefaultSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1986:2: ( ruleReadOnlySchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1986:2: ( ruleReadOnlySchemaDefinition )
                    // InternalJsonSchemaDsl.g:1987:3: ruleReadOnlySchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1992:2: ( ruleWriteOnlySchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1992:2: ( ruleWriteOnlySchemaDefinition )
                    // InternalJsonSchemaDsl.g:1993:3: ruleWriteOnlySchemaDefinition
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
                    // InternalJsonSchemaDsl.g:1998:2: ( ruleExamplesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:1998:2: ( ruleExamplesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:1999:3: ruleExamplesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2004:2: ( ruleMultipleOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2004:2: ( ruleMultipleOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2005:3: ruleMultipleOfSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2010:2: ( ruleMaximumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2010:2: ( ruleMaximumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2011:3: ruleMaximumSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2016:2: ( ruleExclusiveMaximumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2016:2: ( ruleExclusiveMaximumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2017:3: ruleExclusiveMaximumSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2022:2: ( ruleMinimumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2022:2: ( ruleMinimumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2023:3: ruleMinimumSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2028:2: ( ruleExclusiveMinimumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2028:2: ( ruleExclusiveMinimumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2029:3: ruleExclusiveMinimumSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2034:2: ( ruleMaxLengthSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2034:2: ( ruleMaxLengthSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2035:3: ruleMaxLengthSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2040:2: ( ruleMinLengthSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2040:2: ( ruleMinLengthSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2041:3: ruleMinLengthSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2046:2: ( rulePatternSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2046:2: ( rulePatternSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2047:3: rulePatternSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2052:2: ( ruleAdditionalItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2052:2: ( ruleAdditionalItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2053:3: ruleAdditionalItemsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2058:2: ( ruleItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2058:2: ( ruleItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2059:3: ruleItemsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2064:2: ( ruleMaxItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2064:2: ( ruleMaxItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2065:3: ruleMaxItemsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2070:2: ( ruleMinItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2070:2: ( ruleMinItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2071:3: ruleMinItemsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2076:2: ( ruleUniqueItemsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2076:2: ( ruleUniqueItemsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2077:3: ruleUniqueItemsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2082:2: ( ruleContainsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2082:2: ( ruleContainsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2083:3: ruleContainsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2088:2: ( ruleMaxPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2088:2: ( ruleMaxPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2089:3: ruleMaxPropertiesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2094:2: ( ruleMinPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2094:2: ( ruleMinPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2095:3: ruleMinPropertiesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2100:2: ( ruleRequiredSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2100:2: ( ruleRequiredSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2101:3: ruleRequiredSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2106:2: ( ruleAdditionalPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2106:2: ( ruleAdditionalPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2107:3: ruleAdditionalPropertiesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2112:2: ( ruleDefinitionsSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2112:2: ( ruleDefinitionsSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2113:3: ruleDefinitionsSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2118:2: ( rulePropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2118:2: ( rulePropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2119:3: rulePropertiesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2124:2: ( rulePatternPropertiesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2124:2: ( rulePatternPropertiesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2125:3: rulePatternPropertiesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2130:2: ( rulePropertyNamesSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2130:2: ( rulePropertyNamesSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2131:3: rulePropertyNamesSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2136:2: ( ruleConstSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2136:2: ( ruleConstSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2137:3: ruleConstSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2142:2: ( ruleEnumSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2142:2: ( ruleEnumSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2143:3: ruleEnumSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2148:2: ( ruleTypeSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2148:2: ( ruleTypeSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2149:3: ruleTypeSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2154:2: ( ruleFormatSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2154:2: ( ruleFormatSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2155:3: ruleFormatSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2160:2: ( ruleContentMediaTypeSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2160:2: ( ruleContentMediaTypeSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2161:3: ruleContentMediaTypeSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2166:2: ( ruleContentEncodingSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2166:2: ( ruleContentEncodingSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2167:3: ruleContentEncodingSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2172:2: ( ruleIfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2172:2: ( ruleIfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2173:3: ruleIfSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2178:2: ( ruleThenSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2178:2: ( ruleThenSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2179:3: ruleThenSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2184:2: ( ruleElseSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2184:2: ( ruleElseSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2185:3: ruleElseSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2190:2: ( ruleAllOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2190:2: ( ruleAllOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2191:3: ruleAllOfSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2196:2: ( ruleAnyOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2196:2: ( ruleAnyOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2197:3: ruleAnyOfSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2202:2: ( ruleOneOfSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2202:2: ( ruleOneOfSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2203:3: ruleOneOfSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2208:2: ( ruleNotSchemaDefinition )
                    {
                    // InternalJsonSchemaDsl.g:2208:2: ( ruleNotSchemaDefinition )
                    // InternalJsonSchemaDsl.g:2209:3: ruleNotSchemaDefinition
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
                    // InternalJsonSchemaDsl.g:2214:2: ( ruleKeyValuePair )
                    {
                    // InternalJsonSchemaDsl.g:2214:2: ( ruleKeyValuePair )
                    // InternalJsonSchemaDsl.g:2215:3: ruleKeyValuePair
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
    // InternalJsonSchemaDsl.g:2224:1: rule__Value__Alternatives : ( ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleObjectValue ) | ( ruleNumberValue ) | ( ruleArrayValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2228:1: ( ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleNullValue ) | ( ruleStringValue ) | ( ruleObjectValue ) | ( ruleNumberValue ) | ( ruleArrayValue ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 72:
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
            case 71:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
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
                {
                alt3=4;
                }
                break;
            case 63:
                {
                alt3=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt3=6;
                }
                break;
            case 67:
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
                    // InternalJsonSchemaDsl.g:2229:2: ( ruleIntegerValue )
                    {
                    // InternalJsonSchemaDsl.g:2229:2: ( ruleIntegerValue )
                    // InternalJsonSchemaDsl.g:2230:3: ruleIntegerValue
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
                    // InternalJsonSchemaDsl.g:2235:2: ( ruleBooleanValue )
                    {
                    // InternalJsonSchemaDsl.g:2235:2: ( ruleBooleanValue )
                    // InternalJsonSchemaDsl.g:2236:3: ruleBooleanValue
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
                    // InternalJsonSchemaDsl.g:2241:2: ( ruleNullValue )
                    {
                    // InternalJsonSchemaDsl.g:2241:2: ( ruleNullValue )
                    // InternalJsonSchemaDsl.g:2242:3: ruleNullValue
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
                    // InternalJsonSchemaDsl.g:2247:2: ( ruleStringValue )
                    {
                    // InternalJsonSchemaDsl.g:2247:2: ( ruleStringValue )
                    // InternalJsonSchemaDsl.g:2248:3: ruleStringValue
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
                    // InternalJsonSchemaDsl.g:2253:2: ( ruleObjectValue )
                    {
                    // InternalJsonSchemaDsl.g:2253:2: ( ruleObjectValue )
                    // InternalJsonSchemaDsl.g:2254:3: ruleObjectValue
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
                    // InternalJsonSchemaDsl.g:2259:2: ( ruleNumberValue )
                    {
                    // InternalJsonSchemaDsl.g:2259:2: ( ruleNumberValue )
                    // InternalJsonSchemaDsl.g:2260:3: ruleNumberValue
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
                    // InternalJsonSchemaDsl.g:2265:2: ( ruleArrayValue )
                    {
                    // InternalJsonSchemaDsl.g:2265:2: ( ruleArrayValue )
                    // InternalJsonSchemaDsl.g:2266:3: ruleArrayValue
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
    // InternalJsonSchemaDsl.g:2275:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2279:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalJsonSchemaDsl.g:2280:2: ( 'true' )
                    {
                    // InternalJsonSchemaDsl.g:2280:2: ( 'true' )
                    // InternalJsonSchemaDsl.g:2281:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2286:2: ( 'false' )
                    {
                    // InternalJsonSchemaDsl.g:2286:2: ( 'false' )
                    // InternalJsonSchemaDsl.g:2287:3: 'false'
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


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalJsonSchemaDsl.g:2296:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2300:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=14 && LA5_0<=55)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2301:2: ( RULE_STRING )
                    {
                    // InternalJsonSchemaDsl.g:2301:2: ( RULE_STRING )
                    // InternalJsonSchemaDsl.g:2302:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2307:2: ( ruleKEYWORD )
                    {
                    // InternalJsonSchemaDsl.g:2307:2: ( ruleKEYWORD )
                    // InternalJsonSchemaDsl.g:2308:3: ruleKEYWORD
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 

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
    // $ANTLR end "rule__VALID_STRING__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalJsonSchemaDsl.g:2317:1: rule__KEYWORD__Alternatives : ( ( '\"$id\"' ) | ( '\"$schema\"' ) | ( '\"$ref\"' ) | ( '\"$comment\"' ) | ( '\"title\"' ) | ( '\"description\"' ) | ( '\"default\"' ) | ( '\"readOnly\"' ) | ( '\"writeOnly\"' ) | ( '\"examples\"' ) | ( '\"multipleOf\"' ) | ( '\"maximum\"' ) | ( '\"exclusiveMaximum\"' ) | ( '\"maxLength\"' ) | ( '\"minLength\"' ) | ( '\"pattern\"' ) | ( '\"additionalItems\"' ) | ( '\"items\"' ) | ( '\"maxItems\"' ) | ( '\"minItems\"' ) | ( '\"uniqueItems\"' ) | ( '\"contains\"' ) | ( '\"maxProperties\"' ) | ( '\"minProperties\"' ) | ( '\"required\"' ) | ( '\"additionalProperties\"' ) | ( '\"definitions\"' ) | ( '\"properties\"' ) | ( '\"patternProperties\"' ) | ( '\"propertyNames\"' ) | ( '\"const\"' ) | ( '\"type\"' ) | ( '\"format\"' ) | ( '\"contentMediaType\"' ) | ( '\"contentEncoding\"' ) | ( '\"if\"' ) | ( '\"then\"' ) | ( '\"else\"' ) | ( '\"allOf\"' ) | ( '\"anyOf\"' ) | ( '\"oneOf\"' ) | ( '\"not\"' ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2321:1: ( ( '\"$id\"' ) | ( '\"$schema\"' ) | ( '\"$ref\"' ) | ( '\"$comment\"' ) | ( '\"title\"' ) | ( '\"description\"' ) | ( '\"default\"' ) | ( '\"readOnly\"' ) | ( '\"writeOnly\"' ) | ( '\"examples\"' ) | ( '\"multipleOf\"' ) | ( '\"maximum\"' ) | ( '\"exclusiveMaximum\"' ) | ( '\"maxLength\"' ) | ( '\"minLength\"' ) | ( '\"pattern\"' ) | ( '\"additionalItems\"' ) | ( '\"items\"' ) | ( '\"maxItems\"' ) | ( '\"minItems\"' ) | ( '\"uniqueItems\"' ) | ( '\"contains\"' ) | ( '\"maxProperties\"' ) | ( '\"minProperties\"' ) | ( '\"required\"' ) | ( '\"additionalProperties\"' ) | ( '\"definitions\"' ) | ( '\"properties\"' ) | ( '\"patternProperties\"' ) | ( '\"propertyNames\"' ) | ( '\"const\"' ) | ( '\"type\"' ) | ( '\"format\"' ) | ( '\"contentMediaType\"' ) | ( '\"contentEncoding\"' ) | ( '\"if\"' ) | ( '\"then\"' ) | ( '\"else\"' ) | ( '\"allOf\"' ) | ( '\"anyOf\"' ) | ( '\"oneOf\"' ) | ( '\"not\"' ) )
            int alt6=42;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
                {
                alt6=8;
                }
                break;
            case 22:
                {
                alt6=9;
                }
                break;
            case 23:
                {
                alt6=10;
                }
                break;
            case 24:
                {
                alt6=11;
                }
                break;
            case 25:
                {
                alt6=12;
                }
                break;
            case 26:
                {
                alt6=13;
                }
                break;
            case 27:
                {
                alt6=14;
                }
                break;
            case 28:
                {
                alt6=15;
                }
                break;
            case 29:
                {
                alt6=16;
                }
                break;
            case 30:
                {
                alt6=17;
                }
                break;
            case 31:
                {
                alt6=18;
                }
                break;
            case 32:
                {
                alt6=19;
                }
                break;
            case 33:
                {
                alt6=20;
                }
                break;
            case 34:
                {
                alt6=21;
                }
                break;
            case 35:
                {
                alt6=22;
                }
                break;
            case 36:
                {
                alt6=23;
                }
                break;
            case 37:
                {
                alt6=24;
                }
                break;
            case 38:
                {
                alt6=25;
                }
                break;
            case 39:
                {
                alt6=26;
                }
                break;
            case 40:
                {
                alt6=27;
                }
                break;
            case 41:
                {
                alt6=28;
                }
                break;
            case 42:
                {
                alt6=29;
                }
                break;
            case 43:
                {
                alt6=30;
                }
                break;
            case 44:
                {
                alt6=31;
                }
                break;
            case 45:
                {
                alt6=32;
                }
                break;
            case 46:
                {
                alt6=33;
                }
                break;
            case 47:
                {
                alt6=34;
                }
                break;
            case 48:
                {
                alt6=35;
                }
                break;
            case 49:
                {
                alt6=36;
                }
                break;
            case 50:
                {
                alt6=37;
                }
                break;
            case 51:
                {
                alt6=38;
                }
                break;
            case 52:
                {
                alt6=39;
                }
                break;
            case 53:
                {
                alt6=40;
                }
                break;
            case 54:
                {
                alt6=41;
                }
                break;
            case 55:
                {
                alt6=42;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2322:2: ( '\"$id\"' )
                    {
                    // InternalJsonSchemaDsl.g:2322:2: ( '\"$id\"' )
                    // InternalJsonSchemaDsl.g:2323:3: '\"$id\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getIdKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIdKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2328:2: ( '\"$schema\"' )
                    {
                    // InternalJsonSchemaDsl.g:2328:2: ( '\"$schema\"' )
                    // InternalJsonSchemaDsl.g:2329:3: '\"$schema\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getSchemaKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSchemaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:2334:2: ( '\"$ref\"' )
                    {
                    // InternalJsonSchemaDsl.g:2334:2: ( '\"$ref\"' )
                    // InternalJsonSchemaDsl.g:2335:3: '\"$ref\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getRefKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRefKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:2340:2: ( '\"$comment\"' )
                    {
                    // InternalJsonSchemaDsl.g:2340:2: ( '\"$comment\"' )
                    // InternalJsonSchemaDsl.g:2341:3: '\"$comment\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getCommentKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getCommentKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:2346:2: ( '\"title\"' )
                    {
                    // InternalJsonSchemaDsl.g:2346:2: ( '\"title\"' )
                    // InternalJsonSchemaDsl.g:2347:3: '\"title\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTitleKeyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTitleKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:2352:2: ( '\"description\"' )
                    {
                    // InternalJsonSchemaDsl.g:2352:2: ( '\"description\"' )
                    // InternalJsonSchemaDsl.g:2353:3: '\"description\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDescriptionKeyword_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDescriptionKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:2358:2: ( '\"default\"' )
                    {
                    // InternalJsonSchemaDsl.g:2358:2: ( '\"default\"' )
                    // InternalJsonSchemaDsl.g:2359:3: '\"default\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDefaultKeyword_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDefaultKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJsonSchemaDsl.g:2364:2: ( '\"readOnly\"' )
                    {
                    // InternalJsonSchemaDsl.g:2364:2: ( '\"readOnly\"' )
                    // InternalJsonSchemaDsl.g:2365:3: '\"readOnly\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getReadOnlyKeyword_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getReadOnlyKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJsonSchemaDsl.g:2370:2: ( '\"writeOnly\"' )
                    {
                    // InternalJsonSchemaDsl.g:2370:2: ( '\"writeOnly\"' )
                    // InternalJsonSchemaDsl.g:2371:3: '\"writeOnly\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getWriteOnlyKeyword_8()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getWriteOnlyKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJsonSchemaDsl.g:2376:2: ( '\"examples\"' )
                    {
                    // InternalJsonSchemaDsl.g:2376:2: ( '\"examples\"' )
                    // InternalJsonSchemaDsl.g:2377:3: '\"examples\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getExamplesKeyword_9()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExamplesKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJsonSchemaDsl.g:2382:2: ( '\"multipleOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2382:2: ( '\"multipleOf\"' )
                    // InternalJsonSchemaDsl.g:2383:3: '\"multipleOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMultipleOfKeyword_10()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMultipleOfKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJsonSchemaDsl.g:2388:2: ( '\"maximum\"' )
                    {
                    // InternalJsonSchemaDsl.g:2388:2: ( '\"maximum\"' )
                    // InternalJsonSchemaDsl.g:2389:3: '\"maximum\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaximumKeyword_11()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaximumKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJsonSchemaDsl.g:2394:2: ( '\"exclusiveMaximum\"' )
                    {
                    // InternalJsonSchemaDsl.g:2394:2: ( '\"exclusiveMaximum\"' )
                    // InternalJsonSchemaDsl.g:2395:3: '\"exclusiveMaximum\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getExclusiveMaximumKeyword_12()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExclusiveMaximumKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJsonSchemaDsl.g:2400:2: ( '\"maxLength\"' )
                    {
                    // InternalJsonSchemaDsl.g:2400:2: ( '\"maxLength\"' )
                    // InternalJsonSchemaDsl.g:2401:3: '\"maxLength\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_13()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJsonSchemaDsl.g:2406:2: ( '\"minLength\"' )
                    {
                    // InternalJsonSchemaDsl.g:2406:2: ( '\"minLength\"' )
                    // InternalJsonSchemaDsl.g:2407:3: '\"minLength\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinLengthKeyword_14()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinLengthKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJsonSchemaDsl.g:2412:2: ( '\"pattern\"' )
                    {
                    // InternalJsonSchemaDsl.g:2412:2: ( '\"pattern\"' )
                    // InternalJsonSchemaDsl.g:2413:3: '\"pattern\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPatternKeyword_15()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPatternKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJsonSchemaDsl.g:2418:2: ( '\"additionalItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2418:2: ( '\"additionalItems\"' )
                    // InternalJsonSchemaDsl.g:2419:3: '\"additionalItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAdditionalItemsKeyword_16()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAdditionalItemsKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalJsonSchemaDsl.g:2424:2: ( '\"items\"' )
                    {
                    // InternalJsonSchemaDsl.g:2424:2: ( '\"items\"' )
                    // InternalJsonSchemaDsl.g:2425:3: '\"items\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getItemsKeyword_17()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getItemsKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalJsonSchemaDsl.g:2430:2: ( '\"maxItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2430:2: ( '\"maxItems\"' )
                    // InternalJsonSchemaDsl.g:2431:3: '\"maxItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxItemsKeyword_18()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxItemsKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalJsonSchemaDsl.g:2436:2: ( '\"minItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2436:2: ( '\"minItems\"' )
                    // InternalJsonSchemaDsl.g:2437:3: '\"minItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinItemsKeyword_19()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinItemsKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalJsonSchemaDsl.g:2442:2: ( '\"uniqueItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2442:2: ( '\"uniqueItems\"' )
                    // InternalJsonSchemaDsl.g:2443:3: '\"uniqueItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getUniqueItemsKeyword_20()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getUniqueItemsKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalJsonSchemaDsl.g:2448:2: ( '\"contains\"' )
                    {
                    // InternalJsonSchemaDsl.g:2448:2: ( '\"contains\"' )
                    // InternalJsonSchemaDsl.g:2449:3: '\"contains\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getContainsKeyword_21()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContainsKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalJsonSchemaDsl.g:2454:2: ( '\"maxProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2454:2: ( '\"maxProperties\"' )
                    // InternalJsonSchemaDsl.g:2455:3: '\"maxProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxPropertiesKeyword_22()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxPropertiesKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalJsonSchemaDsl.g:2460:2: ( '\"minProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2460:2: ( '\"minProperties\"' )
                    // InternalJsonSchemaDsl.g:2461:3: '\"minProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinPropertiesKeyword_23()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinPropertiesKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalJsonSchemaDsl.g:2466:2: ( '\"required\"' )
                    {
                    // InternalJsonSchemaDsl.g:2466:2: ( '\"required\"' )
                    // InternalJsonSchemaDsl.g:2467:3: '\"required\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getRequiredKeyword_24()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRequiredKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalJsonSchemaDsl.g:2472:2: ( '\"additionalProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2472:2: ( '\"additionalProperties\"' )
                    // InternalJsonSchemaDsl.g:2473:3: '\"additionalProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAdditionalPropertiesKeyword_25()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAdditionalPropertiesKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalJsonSchemaDsl.g:2478:2: ( '\"definitions\"' )
                    {
                    // InternalJsonSchemaDsl.g:2478:2: ( '\"definitions\"' )
                    // InternalJsonSchemaDsl.g:2479:3: '\"definitions\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDefinitionsKeyword_26()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDefinitionsKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalJsonSchemaDsl.g:2484:2: ( '\"properties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2484:2: ( '\"properties\"' )
                    // InternalJsonSchemaDsl.g:2485:3: '\"properties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPropertiesKeyword_27()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPropertiesKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalJsonSchemaDsl.g:2490:2: ( '\"patternProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2490:2: ( '\"patternProperties\"' )
                    // InternalJsonSchemaDsl.g:2491:3: '\"patternProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPatternPropertiesKeyword_28()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPatternPropertiesKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalJsonSchemaDsl.g:2496:2: ( '\"propertyNames\"' )
                    {
                    // InternalJsonSchemaDsl.g:2496:2: ( '\"propertyNames\"' )
                    // InternalJsonSchemaDsl.g:2497:3: '\"propertyNames\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPropertyNamesKeyword_29()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPropertyNamesKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalJsonSchemaDsl.g:2502:2: ( '\"const\"' )
                    {
                    // InternalJsonSchemaDsl.g:2502:2: ( '\"const\"' )
                    // InternalJsonSchemaDsl.g:2503:3: '\"const\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getConstKeyword_30()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getConstKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalJsonSchemaDsl.g:2508:2: ( '\"type\"' )
                    {
                    // InternalJsonSchemaDsl.g:2508:2: ( '\"type\"' )
                    // InternalJsonSchemaDsl.g:2509:3: '\"type\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_31()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalJsonSchemaDsl.g:2514:2: ( '\"format\"' )
                    {
                    // InternalJsonSchemaDsl.g:2514:2: ( '\"format\"' )
                    // InternalJsonSchemaDsl.g:2515:3: '\"format\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getFormatKeyword_32()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFormatKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalJsonSchemaDsl.g:2520:2: ( '\"contentMediaType\"' )
                    {
                    // InternalJsonSchemaDsl.g:2520:2: ( '\"contentMediaType\"' )
                    // InternalJsonSchemaDsl.g:2521:3: '\"contentMediaType\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getContentMediaTypeKeyword_33()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContentMediaTypeKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalJsonSchemaDsl.g:2526:2: ( '\"contentEncoding\"' )
                    {
                    // InternalJsonSchemaDsl.g:2526:2: ( '\"contentEncoding\"' )
                    // InternalJsonSchemaDsl.g:2527:3: '\"contentEncoding\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getContentEncodingKeyword_34()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContentEncodingKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalJsonSchemaDsl.g:2532:2: ( '\"if\"' )
                    {
                    // InternalJsonSchemaDsl.g:2532:2: ( '\"if\"' )
                    // InternalJsonSchemaDsl.g:2533:3: '\"if\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getIfKeyword_35()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIfKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalJsonSchemaDsl.g:2538:2: ( '\"then\"' )
                    {
                    // InternalJsonSchemaDsl.g:2538:2: ( '\"then\"' )
                    // InternalJsonSchemaDsl.g:2539:3: '\"then\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getThenKeyword_36()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getThenKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalJsonSchemaDsl.g:2544:2: ( '\"else\"' )
                    {
                    // InternalJsonSchemaDsl.g:2544:2: ( '\"else\"' )
                    // InternalJsonSchemaDsl.g:2545:3: '\"else\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getElseKeyword_37()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getElseKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalJsonSchemaDsl.g:2550:2: ( '\"allOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2550:2: ( '\"allOf\"' )
                    // InternalJsonSchemaDsl.g:2551:3: '\"allOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAllOfKeyword_38()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAllOfKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalJsonSchemaDsl.g:2556:2: ( '\"anyOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2556:2: ( '\"anyOf\"' )
                    // InternalJsonSchemaDsl.g:2557:3: '\"anyOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAnyOfKeyword_39()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAnyOfKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalJsonSchemaDsl.g:2562:2: ( '\"oneOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2562:2: ( '\"oneOf\"' )
                    // InternalJsonSchemaDsl.g:2563:3: '\"oneOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getOneOfKeyword_40()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOneOfKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalJsonSchemaDsl.g:2568:2: ( '\"not\"' )
                    {
                    // InternalJsonSchemaDsl.g:2568:2: ( '\"not\"' )
                    // InternalJsonSchemaDsl.g:2569:3: '\"not\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getNotKeyword_41()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNotKeyword_41()); 

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
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__SimpleTypes__Alternatives"
    // InternalJsonSchemaDsl.g:2578:1: rule__SimpleTypes__Alternatives : ( ( ( '\"array\"' ) ) | ( ( '\"boolean\"' ) ) | ( ( '\"integer\"' ) ) | ( ( '\"null\"' ) ) | ( ( '\"number\"' ) ) | ( ( '\"object\"' ) ) | ( ( '\"string\"' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2582:1: ( ( ( '\"array\"' ) ) | ( ( '\"boolean\"' ) ) | ( ( '\"integer\"' ) ) | ( ( '\"null\"' ) ) | ( ( '\"number\"' ) ) | ( ( '\"object\"' ) ) | ( ( '\"string\"' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt7=1;
                }
                break;
            case 57:
                {
                alt7=2;
                }
                break;
            case 58:
                {
                alt7=3;
                }
                break;
            case 59:
                {
                alt7=4;
                }
                break;
            case 60:
                {
                alt7=5;
                }
                break;
            case 61:
                {
                alt7=6;
                }
                break;
            case 62:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2583:2: ( ( '\"array\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2583:2: ( ( '\"array\"' ) )
                    // InternalJsonSchemaDsl.g:2584:3: ( '\"array\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0()); 
                    // InternalJsonSchemaDsl.g:2585:3: ( '\"array\"' )
                    // InternalJsonSchemaDsl.g:2585:4: '\"array\"'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2589:2: ( ( '\"boolean\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2589:2: ( ( '\"boolean\"' ) )
                    // InternalJsonSchemaDsl.g:2590:3: ( '\"boolean\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalJsonSchemaDsl.g:2591:3: ( '\"boolean\"' )
                    // InternalJsonSchemaDsl.g:2591:4: '\"boolean\"'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:2595:2: ( ( '\"integer\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2595:2: ( ( '\"integer\"' ) )
                    // InternalJsonSchemaDsl.g:2596:3: ( '\"integer\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalJsonSchemaDsl.g:2597:3: ( '\"integer\"' )
                    // InternalJsonSchemaDsl.g:2597:4: '\"integer\"'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:2601:2: ( ( '\"null\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2601:2: ( ( '\"null\"' ) )
                    // InternalJsonSchemaDsl.g:2602:3: ( '\"null\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3()); 
                    // InternalJsonSchemaDsl.g:2603:3: ( '\"null\"' )
                    // InternalJsonSchemaDsl.g:2603:4: '\"null\"'
                    {
                    match(input,59,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:2607:2: ( ( '\"number\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2607:2: ( ( '\"number\"' ) )
                    // InternalJsonSchemaDsl.g:2608:3: ( '\"number\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4()); 
                    // InternalJsonSchemaDsl.g:2609:3: ( '\"number\"' )
                    // InternalJsonSchemaDsl.g:2609:4: '\"number\"'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:2613:2: ( ( '\"object\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2613:2: ( ( '\"object\"' ) )
                    // InternalJsonSchemaDsl.g:2614:3: ( '\"object\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // InternalJsonSchemaDsl.g:2615:3: ( '\"object\"' )
                    // InternalJsonSchemaDsl.g:2615:4: '\"object\"'
                    {
                    match(input,61,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:2619:2: ( ( '\"string\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2619:2: ( ( '\"string\"' ) )
                    // InternalJsonSchemaDsl.g:2620:3: ( '\"string\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_6()); 
                    // InternalJsonSchemaDsl.g:2621:3: ( '\"string\"' )
                    // InternalJsonSchemaDsl.g:2621:4: '\"string\"'
                    {
                    match(input,62,FOLLOW_2); 

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
    // InternalJsonSchemaDsl.g:2629:1: rule__JsonSchema__Group__0 : rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1 ;
    public final void rule__JsonSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2633:1: ( rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1 )
            // InternalJsonSchemaDsl.g:2634:2: rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1
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
    // InternalJsonSchemaDsl.g:2641:1: rule__JsonSchema__Group__0__Impl : ( () ) ;
    public final void rule__JsonSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2645:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:2646:1: ( () )
            {
            // InternalJsonSchemaDsl.g:2646:1: ( () )
            // InternalJsonSchemaDsl.g:2647:2: ()
            {
             before(grammarAccess.getJsonSchemaAccess().getJsonSchemaAction_0()); 
            // InternalJsonSchemaDsl.g:2648:2: ()
            // InternalJsonSchemaDsl.g:2648:3: 
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
    // InternalJsonSchemaDsl.g:2656:1: rule__JsonSchema__Group__1 : rule__JsonSchema__Group__1__Impl ;
    public final void rule__JsonSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2660:1: ( rule__JsonSchema__Group__1__Impl )
            // InternalJsonSchemaDsl.g:2661:2: rule__JsonSchema__Group__1__Impl
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
    // InternalJsonSchemaDsl.g:2667:1: rule__JsonSchema__Group__1__Impl : ( ( rule__JsonSchema__SchemaAssignment_1 )? ) ;
    public final void rule__JsonSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2671:1: ( ( ( rule__JsonSchema__SchemaAssignment_1 )? ) )
            // InternalJsonSchemaDsl.g:2672:1: ( ( rule__JsonSchema__SchemaAssignment_1 )? )
            {
            // InternalJsonSchemaDsl.g:2672:1: ( ( rule__JsonSchema__SchemaAssignment_1 )? )
            // InternalJsonSchemaDsl.g:2673:2: ( rule__JsonSchema__SchemaAssignment_1 )?
            {
             before(grammarAccess.getJsonSchemaAccess().getSchemaAssignment_1()); 
            // InternalJsonSchemaDsl.g:2674:2: ( rule__JsonSchema__SchemaAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=13)||LA8_0==63) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2674:3: rule__JsonSchema__SchemaAssignment_1
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
    // InternalJsonSchemaDsl.g:2683:1: rule__ObjectSchema__Group__0 : rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1 ;
    public final void rule__ObjectSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2687:1: ( rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1 )
            // InternalJsonSchemaDsl.g:2688:2: rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1
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
    // InternalJsonSchemaDsl.g:2695:1: rule__ObjectSchema__Group__0__Impl : ( () ) ;
    public final void rule__ObjectSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2699:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:2700:1: ( () )
            {
            // InternalJsonSchemaDsl.g:2700:1: ( () )
            // InternalJsonSchemaDsl.g:2701:2: ()
            {
             before(grammarAccess.getObjectSchemaAccess().getObjectSchemaAction_0()); 
            // InternalJsonSchemaDsl.g:2702:2: ()
            // InternalJsonSchemaDsl.g:2702:3: 
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
    // InternalJsonSchemaDsl.g:2710:1: rule__ObjectSchema__Group__1 : rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2 ;
    public final void rule__ObjectSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2714:1: ( rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2 )
            // InternalJsonSchemaDsl.g:2715:2: rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2
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
    // InternalJsonSchemaDsl.g:2722:1: rule__ObjectSchema__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2726:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:2727:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:2727:1: ( '{' )
            // InternalJsonSchemaDsl.g:2728:2: '{'
            {
             before(grammarAccess.getObjectSchemaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2737:1: rule__ObjectSchema__Group__2 : rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3 ;
    public final void rule__ObjectSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2741:1: ( rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3 )
            // InternalJsonSchemaDsl.g:2742:2: rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3
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
    // InternalJsonSchemaDsl.g:2749:1: rule__ObjectSchema__Group__2__Impl : ( ( rule__ObjectSchema__Group_2__0 )? ) ;
    public final void rule__ObjectSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2753:1: ( ( ( rule__ObjectSchema__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:2754:1: ( ( rule__ObjectSchema__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:2754:1: ( ( rule__ObjectSchema__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:2755:2: ( rule__ObjectSchema__Group_2__0 )?
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:2756:2: ( rule__ObjectSchema__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||(LA9_0>=14 && LA9_0<=55)||LA9_0==67||(LA9_0>=69 && LA9_0<=70)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2756:3: rule__ObjectSchema__Group_2__0
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
    // InternalJsonSchemaDsl.g:2764:1: rule__ObjectSchema__Group__3 : rule__ObjectSchema__Group__3__Impl ;
    public final void rule__ObjectSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2768:1: ( rule__ObjectSchema__Group__3__Impl )
            // InternalJsonSchemaDsl.g:2769:2: rule__ObjectSchema__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:2775:1: rule__ObjectSchema__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2779:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:2780:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:2780:1: ( '}' )
            // InternalJsonSchemaDsl.g:2781:2: '}'
            {
             before(grammarAccess.getObjectSchemaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2791:1: rule__ObjectSchema__Group_2__0 : rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1 ;
    public final void rule__ObjectSchema__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2795:1: ( rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1 )
            // InternalJsonSchemaDsl.g:2796:2: rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1
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
    // InternalJsonSchemaDsl.g:2803:1: rule__ObjectSchema__Group_2__0__Impl : ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) ) ;
    public final void rule__ObjectSchema__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2807:1: ( ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:2808:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:2808:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:2809:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 )
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:2810:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 )
            // InternalJsonSchemaDsl.g:2810:3: rule__ObjectSchema__KeywordDefinitionAssignment_2_0
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
    // InternalJsonSchemaDsl.g:2818:1: rule__ObjectSchema__Group_2__1 : rule__ObjectSchema__Group_2__1__Impl ;
    public final void rule__ObjectSchema__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2822:1: ( rule__ObjectSchema__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:2823:2: rule__ObjectSchema__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:2829:1: rule__ObjectSchema__Group_2__1__Impl : ( ( rule__ObjectSchema__Group_2_1__0 )* ) ;
    public final void rule__ObjectSchema__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2833:1: ( ( ( rule__ObjectSchema__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:2834:1: ( ( rule__ObjectSchema__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:2834:1: ( ( rule__ObjectSchema__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:2835:2: ( rule__ObjectSchema__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:2836:2: ( rule__ObjectSchema__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==65) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:2836:3: rule__ObjectSchema__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ObjectSchema__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalJsonSchemaDsl.g:2845:1: rule__ObjectSchema__Group_2_1__0 : rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1 ;
    public final void rule__ObjectSchema__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2849:1: ( rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:2850:2: rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1
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
    // InternalJsonSchemaDsl.g:2857:1: rule__ObjectSchema__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectSchema__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2861:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:2862:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:2862:1: ( ',' )
            // InternalJsonSchemaDsl.g:2863:2: ','
            {
             before(grammarAccess.getObjectSchemaAccess().getCommaKeyword_2_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2872:1: rule__ObjectSchema__Group_2_1__1 : rule__ObjectSchema__Group_2_1__1__Impl ;
    public final void rule__ObjectSchema__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2876:1: ( rule__ObjectSchema__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:2877:2: rule__ObjectSchema__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:2883:1: rule__ObjectSchema__Group_2_1__1__Impl : ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) ) ;
    public final void rule__ObjectSchema__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2887:1: ( ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:2888:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:2888:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:2889:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:2890:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:2890:3: rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:2899:1: rule__MaximumSchemaDefinition__Group__0 : rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1 ;
    public final void rule__MaximumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2903:1: ( rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2904:2: rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:2911:1: rule__MaximumSchemaDefinition__Group__0__Impl : ( '\"maximum\"' ) ;
    public final void rule__MaximumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2915:1: ( ( '\"maximum\"' ) )
            // InternalJsonSchemaDsl.g:2916:1: ( '\"maximum\"' )
            {
            // InternalJsonSchemaDsl.g:2916:1: ( '\"maximum\"' )
            // InternalJsonSchemaDsl.g:2917:2: '\"maximum\"'
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2926:1: rule__MaximumSchemaDefinition__Group__1 : rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2 ;
    public final void rule__MaximumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2930:1: ( rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:2931:2: rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:2938:1: rule__MaximumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaximumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2942:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:2943:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:2943:1: ( ':' )
            // InternalJsonSchemaDsl.g:2944:2: ':'
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2953:1: rule__MaximumSchemaDefinition__Group__2 : rule__MaximumSchemaDefinition__Group__2__Impl ;
    public final void rule__MaximumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2957:1: ( rule__MaximumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:2958:2: rule__MaximumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:2964:1: rule__MaximumSchemaDefinition__Group__2__Impl : ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) ) ;
    public final void rule__MaximumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2968:1: ( ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:2969:1: ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:2969:1: ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:2970:2: ( rule__MaximumSchemaDefinition__MaximumAssignment_2 )
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumAssignment_2()); 
            // InternalJsonSchemaDsl.g:2971:2: ( rule__MaximumSchemaDefinition__MaximumAssignment_2 )
            // InternalJsonSchemaDsl.g:2971:3: rule__MaximumSchemaDefinition__MaximumAssignment_2
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
    // InternalJsonSchemaDsl.g:2980:1: rule__WriteOnlySchemaDefinition__Group__0 : rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1 ;
    public final void rule__WriteOnlySchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2984:1: ( rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2985:2: rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:2992:1: rule__WriteOnlySchemaDefinition__Group__0__Impl : ( '\"writeOnly\"' ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2996:1: ( ( '\"writeOnly\"' ) )
            // InternalJsonSchemaDsl.g:2997:1: ( '\"writeOnly\"' )
            {
            // InternalJsonSchemaDsl.g:2997:1: ( '\"writeOnly\"' )
            // InternalJsonSchemaDsl.g:2998:2: '\"writeOnly\"'
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3007:1: rule__WriteOnlySchemaDefinition__Group__1 : rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2 ;
    public final void rule__WriteOnlySchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3011:1: ( rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3012:2: rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3019:1: rule__WriteOnlySchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3023:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3024:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3024:1: ( ':' )
            // InternalJsonSchemaDsl.g:3025:2: ':'
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3034:1: rule__WriteOnlySchemaDefinition__Group__2 : rule__WriteOnlySchemaDefinition__Group__2__Impl ;
    public final void rule__WriteOnlySchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3038:1: ( rule__WriteOnlySchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3039:2: rule__WriteOnlySchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3045:1: rule__WriteOnlySchemaDefinition__Group__2__Impl : ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3049:1: ( ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3050:1: ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3050:1: ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3051:2: ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 )
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyAssignment_2()); 
            // InternalJsonSchemaDsl.g:3052:2: ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 )
            // InternalJsonSchemaDsl.g:3052:3: rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2
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
    // InternalJsonSchemaDsl.g:3061:1: rule__CommentSchemaDefinition__Group__0 : rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1 ;
    public final void rule__CommentSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3065:1: ( rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3066:2: rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3073:1: rule__CommentSchemaDefinition__Group__0__Impl : ( '\"$comment\"' ) ;
    public final void rule__CommentSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3077:1: ( ( '\"$comment\"' ) )
            // InternalJsonSchemaDsl.g:3078:1: ( '\"$comment\"' )
            {
            // InternalJsonSchemaDsl.g:3078:1: ( '\"$comment\"' )
            // InternalJsonSchemaDsl.g:3079:2: '\"$comment\"'
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getCommentKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3088:1: rule__CommentSchemaDefinition__Group__1 : rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2 ;
    public final void rule__CommentSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3092:1: ( rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3093:2: rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:3100:1: rule__CommentSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__CommentSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3104:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3105:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3105:1: ( ':' )
            // InternalJsonSchemaDsl.g:3106:2: ':'
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3115:1: rule__CommentSchemaDefinition__Group__2 : rule__CommentSchemaDefinition__Group__2__Impl ;
    public final void rule__CommentSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3119:1: ( rule__CommentSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3120:2: rule__CommentSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3126:1: rule__CommentSchemaDefinition__Group__2__Impl : ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) ) ;
    public final void rule__CommentSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3130:1: ( ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3131:1: ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3131:1: ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3132:2: ( rule__CommentSchemaDefinition__CommentAssignment_2 )
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getCommentAssignment_2()); 
            // InternalJsonSchemaDsl.g:3133:2: ( rule__CommentSchemaDefinition__CommentAssignment_2 )
            // InternalJsonSchemaDsl.g:3133:3: rule__CommentSchemaDefinition__CommentAssignment_2
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
    // InternalJsonSchemaDsl.g:3142:1: rule__EnumSchemaDefinition__Group__0 : rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1 ;
    public final void rule__EnumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3146:1: ( rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3147:2: rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:3154:1: rule__EnumSchemaDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__EnumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3158:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:3159:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:3159:1: ( '[' )
            // InternalJsonSchemaDsl.g:3160:2: '['
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3169:1: rule__EnumSchemaDefinition__Group__1 : rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2 ;
    public final void rule__EnumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3173:1: ( rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3174:2: rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalJsonSchemaDsl.g:3181:1: rule__EnumSchemaDefinition__Group__1__Impl : ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) ) ;
    public final void rule__EnumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3185:1: ( ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:3186:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:3186:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:3187:2: ( rule__EnumSchemaDefinition__ItemsAssignment_1 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:3188:2: ( rule__EnumSchemaDefinition__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:3188:3: rule__EnumSchemaDefinition__ItemsAssignment_1
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
    // InternalJsonSchemaDsl.g:3196:1: rule__EnumSchemaDefinition__Group__2 : rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3 ;
    public final void rule__EnumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3200:1: ( rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3201:2: rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalJsonSchemaDsl.g:3208:1: rule__EnumSchemaDefinition__Group__2__Impl : ( ( rule__EnumSchemaDefinition__Group_2__0 )* ) ;
    public final void rule__EnumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3212:1: ( ( ( rule__EnumSchemaDefinition__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:3213:1: ( ( rule__EnumSchemaDefinition__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:3213:1: ( ( rule__EnumSchemaDefinition__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:3214:2: ( rule__EnumSchemaDefinition__Group_2__0 )*
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:3215:2: ( rule__EnumSchemaDefinition__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==65) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3215:3: rule__EnumSchemaDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__EnumSchemaDefinition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalJsonSchemaDsl.g:3223:1: rule__EnumSchemaDefinition__Group__3 : rule__EnumSchemaDefinition__Group__3__Impl ;
    public final void rule__EnumSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3227:1: ( rule__EnumSchemaDefinition__Group__3__Impl )
            // InternalJsonSchemaDsl.g:3228:2: rule__EnumSchemaDefinition__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:3234:1: rule__EnumSchemaDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__EnumSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3238:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:3239:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:3239:1: ( ']' )
            // InternalJsonSchemaDsl.g:3240:2: ']'
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getRightSquareBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3250:1: rule__EnumSchemaDefinition__Group_2__0 : rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1 ;
    public final void rule__EnumSchemaDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3254:1: ( rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1 )
            // InternalJsonSchemaDsl.g:3255:2: rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:3262:1: rule__EnumSchemaDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumSchemaDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3266:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:3267:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:3267:1: ( ',' )
            // InternalJsonSchemaDsl.g:3268:2: ','
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3277:1: rule__EnumSchemaDefinition__Group_2__1 : rule__EnumSchemaDefinition__Group_2__1__Impl ;
    public final void rule__EnumSchemaDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3281:1: ( rule__EnumSchemaDefinition__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:3282:2: rule__EnumSchemaDefinition__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:3288:1: rule__EnumSchemaDefinition__Group_2__1__Impl : ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) ) ;
    public final void rule__EnumSchemaDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3292:1: ( ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:3293:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:3293:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:3294:2: ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:3295:2: ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:3295:3: rule__EnumSchemaDefinition__ItemsAssignment_2_1
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
    // InternalJsonSchemaDsl.g:3304:1: rule__UniqueItemsSchemaDefinition__Group__0 : rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1 ;
    public final void rule__UniqueItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3308:1: ( rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3309:2: rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3316:1: rule__UniqueItemsSchemaDefinition__Group__0__Impl : ( '\"uniqueItems\"' ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3320:1: ( ( '\"uniqueItems\"' ) )
            // InternalJsonSchemaDsl.g:3321:1: ( '\"uniqueItems\"' )
            {
            // InternalJsonSchemaDsl.g:3321:1: ( '\"uniqueItems\"' )
            // InternalJsonSchemaDsl.g:3322:2: '\"uniqueItems\"'
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3331:1: rule__UniqueItemsSchemaDefinition__Group__1 : rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2 ;
    public final void rule__UniqueItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3335:1: ( rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3336:2: rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3343:1: rule__UniqueItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3347:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3348:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3348:1: ( ':' )
            // InternalJsonSchemaDsl.g:3349:2: ':'
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3358:1: rule__UniqueItemsSchemaDefinition__Group__2 : rule__UniqueItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__UniqueItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3362:1: ( rule__UniqueItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3363:2: rule__UniqueItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3369:1: rule__UniqueItemsSchemaDefinition__Group__2__Impl : ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3373:1: ( ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3374:1: ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3374:1: ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3375:2: ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 )
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:3376:2: ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:3376:3: rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:3385:1: rule__AnyOfSchemaDefinition__Group__0 : rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1 ;
    public final void rule__AnyOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3389:1: ( rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3390:2: rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3397:1: rule__AnyOfSchemaDefinition__Group__0__Impl : ( '\"anyOf\"' ) ;
    public final void rule__AnyOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3401:1: ( ( '\"anyOf\"' ) )
            // InternalJsonSchemaDsl.g:3402:1: ( '\"anyOf\"' )
            {
            // InternalJsonSchemaDsl.g:3402:1: ( '\"anyOf\"' )
            // InternalJsonSchemaDsl.g:3403:2: '\"anyOf\"'
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3412:1: rule__AnyOfSchemaDefinition__Group__1 : rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2 ;
    public final void rule__AnyOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3416:1: ( rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3417:2: rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:3424:1: rule__AnyOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AnyOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3428:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3429:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3429:1: ( ':' )
            // InternalJsonSchemaDsl.g:3430:2: ':'
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3439:1: rule__AnyOfSchemaDefinition__Group__2 : rule__AnyOfSchemaDefinition__Group__2__Impl ;
    public final void rule__AnyOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3443:1: ( rule__AnyOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3444:2: rule__AnyOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3450:1: rule__AnyOfSchemaDefinition__Group__2__Impl : ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) ) ;
    public final void rule__AnyOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3454:1: ( ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3455:1: ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3455:1: ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3456:2: ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 )
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:3457:2: ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 )
            // InternalJsonSchemaDsl.g:3457:3: rule__AnyOfSchemaDefinition__AnyOfAssignment_2
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
    // InternalJsonSchemaDsl.g:3466:1: rule__TitleSchemaDefinition__Group__0 : rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1 ;
    public final void rule__TitleSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3470:1: ( rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3471:2: rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3478:1: rule__TitleSchemaDefinition__Group__0__Impl : ( '\"title\"' ) ;
    public final void rule__TitleSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3482:1: ( ( '\"title\"' ) )
            // InternalJsonSchemaDsl.g:3483:1: ( '\"title\"' )
            {
            // InternalJsonSchemaDsl.g:3483:1: ( '\"title\"' )
            // InternalJsonSchemaDsl.g:3484:2: '\"title\"'
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getTitleKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3493:1: rule__TitleSchemaDefinition__Group__1 : rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2 ;
    public final void rule__TitleSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3497:1: ( rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3498:2: rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:3505:1: rule__TitleSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TitleSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3509:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3510:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3510:1: ( ':' )
            // InternalJsonSchemaDsl.g:3511:2: ':'
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3520:1: rule__TitleSchemaDefinition__Group__2 : rule__TitleSchemaDefinition__Group__2__Impl ;
    public final void rule__TitleSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3524:1: ( rule__TitleSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3525:2: rule__TitleSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3531:1: rule__TitleSchemaDefinition__Group__2__Impl : ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) ) ;
    public final void rule__TitleSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3535:1: ( ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3536:1: ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3536:1: ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3537:2: ( rule__TitleSchemaDefinition__TitleAssignment_2 )
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getTitleAssignment_2()); 
            // InternalJsonSchemaDsl.g:3538:2: ( rule__TitleSchemaDefinition__TitleAssignment_2 )
            // InternalJsonSchemaDsl.g:3538:3: rule__TitleSchemaDefinition__TitleAssignment_2
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
    // InternalJsonSchemaDsl.g:3547:1: rule__ItemsSchemaDefinition__Group__0 : rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1 ;
    public final void rule__ItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3551:1: ( rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3552:2: rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalJsonSchemaDsl.g:3559:1: rule__ItemsSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3563:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:3564:1: ( () )
            {
            // InternalJsonSchemaDsl.g:3564:1: ( () )
            // InternalJsonSchemaDsl.g:3565:2: ()
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:3566:2: ()
            // InternalJsonSchemaDsl.g:3566:3: 
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
    // InternalJsonSchemaDsl.g:3574:1: rule__ItemsSchemaDefinition__Group__1 : rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2 ;
    public final void rule__ItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3578:1: ( rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3579:2: rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalJsonSchemaDsl.g:3586:1: rule__ItemsSchemaDefinition__Group__1__Impl : ( '\"items\"' ) ;
    public final void rule__ItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3590:1: ( ( '\"items\"' ) )
            // InternalJsonSchemaDsl.g:3591:1: ( '\"items\"' )
            {
            // InternalJsonSchemaDsl.g:3591:1: ( '\"items\"' )
            // InternalJsonSchemaDsl.g:3592:2: '\"items\"'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsKeyword_1()); 

            }


            }

        }
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
    // InternalJsonSchemaDsl.g:3601:1: rule__ItemsSchemaDefinition__Group__2 : rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3 ;
    public final void rule__ItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3605:1: ( rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3606:2: rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalJsonSchemaDsl.g:3613:1: rule__ItemsSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3617:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3618:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3618:1: ( ':' )
            // InternalJsonSchemaDsl.g:3619:2: ':'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getItemsSchemaDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalJsonSchemaDsl.g:3628:1: rule__ItemsSchemaDefinition__Group__3 : rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4 ;
    public final void rule__ItemsSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3632:1: ( rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:3633:2: rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalJsonSchemaDsl.g:3640:1: rule__ItemsSchemaDefinition__Group__3__Impl : ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? ) ;
    public final void rule__ItemsSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3644:1: ( ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? ) )
            // InternalJsonSchemaDsl.g:3645:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? )
            {
            // InternalJsonSchemaDsl.g:3645:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? )
            // InternalJsonSchemaDsl.g:3646:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )?
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Assignment_3()); 
            // InternalJsonSchemaDsl.g:3647:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=13)||LA12_0==63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3647:3: rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Assignment_3()); 

            }


            }

        }
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
    // InternalJsonSchemaDsl.g:3655:1: rule__ItemsSchemaDefinition__Group__4 : rule__ItemsSchemaDefinition__Group__4__Impl ;
    public final void rule__ItemsSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3659:1: ( rule__ItemsSchemaDefinition__Group__4__Impl )
            // InternalJsonSchemaDsl.g:3660:2: rule__ItemsSchemaDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemsSchemaDefinition__Group__4__Impl();

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
    // InternalJsonSchemaDsl.g:3666:1: rule__ItemsSchemaDefinition__Group__4__Impl : ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? ) ;
    public final void rule__ItemsSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3670:1: ( ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? ) )
            // InternalJsonSchemaDsl.g:3671:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? )
            {
            // InternalJsonSchemaDsl.g:3671:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? )
            // InternalJsonSchemaDsl.g:3672:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )?
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Assignment_4()); 
            // InternalJsonSchemaDsl.g:3673:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==67) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3673:3: rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Assignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DefaultSchemaDefinition__Group__0"
    // InternalJsonSchemaDsl.g:3682:1: rule__DefaultSchemaDefinition__Group__0 : rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1 ;
    public final void rule__DefaultSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3686:1: ( rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3687:2: rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3694:1: rule__DefaultSchemaDefinition__Group__0__Impl : ( '\"default\"' ) ;
    public final void rule__DefaultSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3698:1: ( ( '\"default\"' ) )
            // InternalJsonSchemaDsl.g:3699:1: ( '\"default\"' )
            {
            // InternalJsonSchemaDsl.g:3699:1: ( '\"default\"' )
            // InternalJsonSchemaDsl.g:3700:2: '\"default\"'
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3709:1: rule__DefaultSchemaDefinition__Group__1 : rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2 ;
    public final void rule__DefaultSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3713:1: ( rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3714:2: rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:3721:1: rule__DefaultSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3725:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3726:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3726:1: ( ':' )
            // InternalJsonSchemaDsl.g:3727:2: ':'
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3736:1: rule__DefaultSchemaDefinition__Group__2 : rule__DefaultSchemaDefinition__Group__2__Impl ;
    public final void rule__DefaultSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3740:1: ( rule__DefaultSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3741:2: rule__DefaultSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3747:1: rule__DefaultSchemaDefinition__Group__2__Impl : ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) ) ;
    public final void rule__DefaultSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3751:1: ( ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3752:1: ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3752:1: ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3753:2: ( rule__DefaultSchemaDefinition__DefaultAssignment_2 )
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultAssignment_2()); 
            // InternalJsonSchemaDsl.g:3754:2: ( rule__DefaultSchemaDefinition__DefaultAssignment_2 )
            // InternalJsonSchemaDsl.g:3754:3: rule__DefaultSchemaDefinition__DefaultAssignment_2
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
    // InternalJsonSchemaDsl.g:3763:1: rule__ThenSchemaDefinition__Group__0 : rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1 ;
    public final void rule__ThenSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3767:1: ( rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3768:2: rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3775:1: rule__ThenSchemaDefinition__Group__0__Impl : ( '\"then\"' ) ;
    public final void rule__ThenSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3779:1: ( ( '\"then\"' ) )
            // InternalJsonSchemaDsl.g:3780:1: ( '\"then\"' )
            {
            // InternalJsonSchemaDsl.g:3780:1: ( '\"then\"' )
            // InternalJsonSchemaDsl.g:3781:2: '\"then\"'
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3790:1: rule__ThenSchemaDefinition__Group__1 : rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2 ;
    public final void rule__ThenSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3794:1: ( rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3795:2: rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3802:1: rule__ThenSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ThenSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3806:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3807:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3807:1: ( ':' )
            // InternalJsonSchemaDsl.g:3808:2: ':'
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3817:1: rule__ThenSchemaDefinition__Group__2 : rule__ThenSchemaDefinition__Group__2__Impl ;
    public final void rule__ThenSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3821:1: ( rule__ThenSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3822:2: rule__ThenSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3828:1: rule__ThenSchemaDefinition__Group__2__Impl : ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) ) ;
    public final void rule__ThenSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3832:1: ( ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3833:1: ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3833:1: ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3834:2: ( rule__ThenSchemaDefinition__ThenAssignment_2 )
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenAssignment_2()); 
            // InternalJsonSchemaDsl.g:3835:2: ( rule__ThenSchemaDefinition__ThenAssignment_2 )
            // InternalJsonSchemaDsl.g:3835:3: rule__ThenSchemaDefinition__ThenAssignment_2
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
    // InternalJsonSchemaDsl.g:3844:1: rule__MinLengthSchemaDefinition__Group__0 : rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1 ;
    public final void rule__MinLengthSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3848:1: ( rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3849:2: rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3856:1: rule__MinLengthSchemaDefinition__Group__0__Impl : ( '\"minLength\"' ) ;
    public final void rule__MinLengthSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3860:1: ( ( '\"minLength\"' ) )
            // InternalJsonSchemaDsl.g:3861:1: ( '\"minLength\"' )
            {
            // InternalJsonSchemaDsl.g:3861:1: ( '\"minLength\"' )
            // InternalJsonSchemaDsl.g:3862:2: '\"minLength\"'
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3871:1: rule__MinLengthSchemaDefinition__Group__1 : rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2 ;
    public final void rule__MinLengthSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3875:1: ( rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3876:2: rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:3883:1: rule__MinLengthSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinLengthSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3887:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3888:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3888:1: ( ':' )
            // InternalJsonSchemaDsl.g:3889:2: ':'
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3898:1: rule__MinLengthSchemaDefinition__Group__2 : rule__MinLengthSchemaDefinition__Group__2__Impl ;
    public final void rule__MinLengthSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3902:1: ( rule__MinLengthSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3903:2: rule__MinLengthSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3909:1: rule__MinLengthSchemaDefinition__Group__2__Impl : ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) ) ;
    public final void rule__MinLengthSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3913:1: ( ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3914:1: ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3914:1: ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3915:2: ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 )
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthAssignment_2()); 
            // InternalJsonSchemaDsl.g:3916:2: ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 )
            // InternalJsonSchemaDsl.g:3916:3: rule__MinLengthSchemaDefinition__MinLengthAssignment_2
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
    // InternalJsonSchemaDsl.g:3925:1: rule__DefinitionsSchemaDefinition__Group__0 : rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3929:1: ( rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3930:2: rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalJsonSchemaDsl.g:3937:1: rule__DefinitionsSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3941:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:3942:1: ( () )
            {
            // InternalJsonSchemaDsl.g:3942:1: ( () )
            // InternalJsonSchemaDsl.g:3943:2: ()
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:3944:2: ()
            // InternalJsonSchemaDsl.g:3944:3: 
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
    // InternalJsonSchemaDsl.g:3952:1: rule__DefinitionsSchemaDefinition__Group__1 : rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2 ;
    public final void rule__DefinitionsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3956:1: ( rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3957:2: rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3964:1: rule__DefinitionsSchemaDefinition__Group__1__Impl : ( '\"definitions\"' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3968:1: ( ( '\"definitions\"' ) )
            // InternalJsonSchemaDsl.g:3969:1: ( '\"definitions\"' )
            {
            // InternalJsonSchemaDsl.g:3969:1: ( '\"definitions\"' )
            // InternalJsonSchemaDsl.g:3970:2: '\"definitions\"'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3979:1: rule__DefinitionsSchemaDefinition__Group__2 : rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3 ;
    public final void rule__DefinitionsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3983:1: ( rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3984:2: rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:3991:1: rule__DefinitionsSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3995:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3996:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3996:1: ( ':' )
            // InternalJsonSchemaDsl.g:3997:2: ':'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4006:1: rule__DefinitionsSchemaDefinition__Group__3 : rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4 ;
    public final void rule__DefinitionsSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4010:1: ( rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:4011:2: rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalJsonSchemaDsl.g:4018:1: rule__DefinitionsSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4022:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:4023:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:4023:1: ( '{' )
            // InternalJsonSchemaDsl.g:4024:2: '{'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4033:1: rule__DefinitionsSchemaDefinition__Group__4 : rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5 ;
    public final void rule__DefinitionsSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4037:1: ( rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:4038:2: rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalJsonSchemaDsl.g:4045:1: rule__DefinitionsSchemaDefinition__Group__4__Impl : ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4049:1: ( ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:4050:1: ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:4050:1: ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:4051:2: ( rule__DefinitionsSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:4052:2: ( rule__DefinitionsSchemaDefinition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=14 && LA14_0<=55)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4052:3: rule__DefinitionsSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:4060:1: rule__DefinitionsSchemaDefinition__Group__5 : rule__DefinitionsSchemaDefinition__Group__5__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4064:1: ( rule__DefinitionsSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:4065:2: rule__DefinitionsSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:4071:1: rule__DefinitionsSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4075:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:4076:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:4076:1: ( '}' )
            // InternalJsonSchemaDsl.g:4077:2: '}'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4087:1: rule__DefinitionsSchemaDefinition__Group_4__0 : rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4091:1: ( rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:4092:2: rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:4099:1: rule__DefinitionsSchemaDefinition__Group_4__0__Impl : ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4103:1: ( ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:4104:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:4104:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:4105:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:4106:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:4106:3: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0
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
    // InternalJsonSchemaDsl.g:4114:1: rule__DefinitionsSchemaDefinition__Group_4__1 : rule__DefinitionsSchemaDefinition__Group_4__1__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4118:1: ( rule__DefinitionsSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:4119:2: rule__DefinitionsSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:4125:1: rule__DefinitionsSchemaDefinition__Group_4__1__Impl : ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4129:1: ( ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:4130:1: ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:4130:1: ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:4131:2: ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:4132:2: ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==65) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:4132:3: rule__DefinitionsSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DefinitionsSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalJsonSchemaDsl.g:4141:1: rule__DefinitionsSchemaDefinition__Group_4_1__0 : rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4145:1: ( rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:4146:2: rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:4153:1: rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4157:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:4158:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:4158:1: ( ',' )
            // InternalJsonSchemaDsl.g:4159:2: ','
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4168:1: rule__DefinitionsSchemaDefinition__Group_4_1__1 : rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4172:1: ( rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:4173:2: rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:4179:1: rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl : ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4183:1: ( ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:4184:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:4184:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:4185:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:4186:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:4186:3: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:4195:1: rule__MinItemsSchemaDefinition__Group__0 : rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1 ;
    public final void rule__MinItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4199:1: ( rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4200:2: rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4207:1: rule__MinItemsSchemaDefinition__Group__0__Impl : ( '\"minItems\"' ) ;
    public final void rule__MinItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4211:1: ( ( '\"minItems\"' ) )
            // InternalJsonSchemaDsl.g:4212:1: ( '\"minItems\"' )
            {
            // InternalJsonSchemaDsl.g:4212:1: ( '\"minItems\"' )
            // InternalJsonSchemaDsl.g:4213:2: '\"minItems\"'
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4222:1: rule__MinItemsSchemaDefinition__Group__1 : rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2 ;
    public final void rule__MinItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4226:1: ( rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4227:2: rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:4234:1: rule__MinItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4238:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4239:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4239:1: ( ':' )
            // InternalJsonSchemaDsl.g:4240:2: ':'
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4249:1: rule__MinItemsSchemaDefinition__Group__2 : rule__MinItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__MinItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4253:1: ( rule__MinItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4254:2: rule__MinItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4260:1: rule__MinItemsSchemaDefinition__Group__2__Impl : ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) ) ;
    public final void rule__MinItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4264:1: ( ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4265:1: ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4265:1: ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4266:2: ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 )
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:4267:2: ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:4267:3: rule__MinItemsSchemaDefinition__MinItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:4276:1: rule__OneOfSchemaDefinition__Group__0 : rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1 ;
    public final void rule__OneOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4280:1: ( rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4281:2: rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4288:1: rule__OneOfSchemaDefinition__Group__0__Impl : ( '\"oneOf\"' ) ;
    public final void rule__OneOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4292:1: ( ( '\"oneOf\"' ) )
            // InternalJsonSchemaDsl.g:4293:1: ( '\"oneOf\"' )
            {
            // InternalJsonSchemaDsl.g:4293:1: ( '\"oneOf\"' )
            // InternalJsonSchemaDsl.g:4294:2: '\"oneOf\"'
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4303:1: rule__OneOfSchemaDefinition__Group__1 : rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2 ;
    public final void rule__OneOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4307:1: ( rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4308:2: rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:4315:1: rule__OneOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__OneOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4319:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4320:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4320:1: ( ':' )
            // InternalJsonSchemaDsl.g:4321:2: ':'
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4330:1: rule__OneOfSchemaDefinition__Group__2 : rule__OneOfSchemaDefinition__Group__2__Impl ;
    public final void rule__OneOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4334:1: ( rule__OneOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4335:2: rule__OneOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4341:1: rule__OneOfSchemaDefinition__Group__2__Impl : ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) ) ;
    public final void rule__OneOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4345:1: ( ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4346:1: ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4346:1: ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4347:2: ( rule__OneOfSchemaDefinition__OneOfAssignment_2 )
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:4348:2: ( rule__OneOfSchemaDefinition__OneOfAssignment_2 )
            // InternalJsonSchemaDsl.g:4348:3: rule__OneOfSchemaDefinition__OneOfAssignment_2
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
    // InternalJsonSchemaDsl.g:4357:1: rule__MaxPropertiesSchemaDefinition__Group__0 : rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1 ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4361:1: ( rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4362:2: rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4369:1: rule__MaxPropertiesSchemaDefinition__Group__0__Impl : ( '\"maxProperties\"' ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4373:1: ( ( '\"maxProperties\"' ) )
            // InternalJsonSchemaDsl.g:4374:1: ( '\"maxProperties\"' )
            {
            // InternalJsonSchemaDsl.g:4374:1: ( '\"maxProperties\"' )
            // InternalJsonSchemaDsl.g:4375:2: '\"maxProperties\"'
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4384:1: rule__MaxPropertiesSchemaDefinition__Group__1 : rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2 ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4388:1: ( rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4389:2: rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:4396:1: rule__MaxPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4400:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4401:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4401:1: ( ':' )
            // InternalJsonSchemaDsl.g:4402:2: ':'
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4411:1: rule__MaxPropertiesSchemaDefinition__Group__2 : rule__MaxPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4415:1: ( rule__MaxPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4416:2: rule__MaxPropertiesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4422:1: rule__MaxPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4426:1: ( ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4427:1: ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4427:1: ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4428:2: ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 )
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:4429:2: ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:4429:3: rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2
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
    // InternalJsonSchemaDsl.g:4438:1: rule__MinimumSchemaDefinition__Group__0 : rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1 ;
    public final void rule__MinimumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4442:1: ( rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4443:2: rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4450:1: rule__MinimumSchemaDefinition__Group__0__Impl : ( '\"minimum\"' ) ;
    public final void rule__MinimumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4454:1: ( ( '\"minimum\"' ) )
            // InternalJsonSchemaDsl.g:4455:1: ( '\"minimum\"' )
            {
            // InternalJsonSchemaDsl.g:4455:1: ( '\"minimum\"' )
            // InternalJsonSchemaDsl.g:4456:2: '\"minimum\"'
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4465:1: rule__MinimumSchemaDefinition__Group__1 : rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2 ;
    public final void rule__MinimumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4469:1: ( rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4470:2: rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4477:1: rule__MinimumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinimumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4481:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4482:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4482:1: ( ':' )
            // InternalJsonSchemaDsl.g:4483:2: ':'
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4492:1: rule__MinimumSchemaDefinition__Group__2 : rule__MinimumSchemaDefinition__Group__2__Impl ;
    public final void rule__MinimumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4496:1: ( rule__MinimumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4497:2: rule__MinimumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4503:1: rule__MinimumSchemaDefinition__Group__2__Impl : ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) ) ;
    public final void rule__MinimumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4507:1: ( ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4508:1: ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4508:1: ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4509:2: ( rule__MinimumSchemaDefinition__MinimumAssignment_2 )
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumAssignment_2()); 
            // InternalJsonSchemaDsl.g:4510:2: ( rule__MinimumSchemaDefinition__MinimumAssignment_2 )
            // InternalJsonSchemaDsl.g:4510:3: rule__MinimumSchemaDefinition__MinimumAssignment_2
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
    // InternalJsonSchemaDsl.g:4519:1: rule__MaxItemsSchemaDefinition__Group__0 : rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1 ;
    public final void rule__MaxItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4523:1: ( rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4524:2: rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4531:1: rule__MaxItemsSchemaDefinition__Group__0__Impl : ( '\"maxItems\"' ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4535:1: ( ( '\"maxItems\"' ) )
            // InternalJsonSchemaDsl.g:4536:1: ( '\"maxItems\"' )
            {
            // InternalJsonSchemaDsl.g:4536:1: ( '\"maxItems\"' )
            // InternalJsonSchemaDsl.g:4537:2: '\"maxItems\"'
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4546:1: rule__MaxItemsSchemaDefinition__Group__1 : rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2 ;
    public final void rule__MaxItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4550:1: ( rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4551:2: rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:4558:1: rule__MaxItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4562:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4563:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4563:1: ( ':' )
            // InternalJsonSchemaDsl.g:4564:2: ':'
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4573:1: rule__MaxItemsSchemaDefinition__Group__2 : rule__MaxItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4577:1: ( rule__MaxItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4578:2: rule__MaxItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4584:1: rule__MaxItemsSchemaDefinition__Group__2__Impl : ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4588:1: ( ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4589:1: ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4589:1: ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4590:2: ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 )
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:4591:2: ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:4591:3: rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:4600:1: rule__FormatSchemaDefinition__Group__0 : rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1 ;
    public final void rule__FormatSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4604:1: ( rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4605:2: rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4612:1: rule__FormatSchemaDefinition__Group__0__Impl : ( '\"format\"' ) ;
    public final void rule__FormatSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4616:1: ( ( '\"format\"' ) )
            // InternalJsonSchemaDsl.g:4617:1: ( '\"format\"' )
            {
            // InternalJsonSchemaDsl.g:4617:1: ( '\"format\"' )
            // InternalJsonSchemaDsl.g:4618:2: '\"format\"'
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4627:1: rule__FormatSchemaDefinition__Group__1 : rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2 ;
    public final void rule__FormatSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4631:1: ( rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4632:2: rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:4639:1: rule__FormatSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FormatSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4643:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4644:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4644:1: ( ':' )
            // InternalJsonSchemaDsl.g:4645:2: ':'
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4654:1: rule__FormatSchemaDefinition__Group__2 : rule__FormatSchemaDefinition__Group__2__Impl ;
    public final void rule__FormatSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4658:1: ( rule__FormatSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4659:2: rule__FormatSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4665:1: rule__FormatSchemaDefinition__Group__2__Impl : ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) ) ;
    public final void rule__FormatSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4669:1: ( ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4670:1: ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4670:1: ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4671:2: ( rule__FormatSchemaDefinition__FormatAssignment_2 )
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatAssignment_2()); 
            // InternalJsonSchemaDsl.g:4672:2: ( rule__FormatSchemaDefinition__FormatAssignment_2 )
            // InternalJsonSchemaDsl.g:4672:3: rule__FormatSchemaDefinition__FormatAssignment_2
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
    // InternalJsonSchemaDsl.g:4681:1: rule__ReadOnlySchemaDefinition__Group__0 : rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1 ;
    public final void rule__ReadOnlySchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4685:1: ( rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4686:2: rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4693:1: rule__ReadOnlySchemaDefinition__Group__0__Impl : ( '\"readOnly\"' ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4697:1: ( ( '\"readOnly\"' ) )
            // InternalJsonSchemaDsl.g:4698:1: ( '\"readOnly\"' )
            {
            // InternalJsonSchemaDsl.g:4698:1: ( '\"readOnly\"' )
            // InternalJsonSchemaDsl.g:4699:2: '\"readOnly\"'
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4708:1: rule__ReadOnlySchemaDefinition__Group__1 : rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2 ;
    public final void rule__ReadOnlySchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4712:1: ( rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4713:2: rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4720:1: rule__ReadOnlySchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4724:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4725:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4725:1: ( ':' )
            // InternalJsonSchemaDsl.g:4726:2: ':'
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4735:1: rule__ReadOnlySchemaDefinition__Group__2 : rule__ReadOnlySchemaDefinition__Group__2__Impl ;
    public final void rule__ReadOnlySchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4739:1: ( rule__ReadOnlySchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4740:2: rule__ReadOnlySchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4746:1: rule__ReadOnlySchemaDefinition__Group__2__Impl : ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4750:1: ( ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4751:1: ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4751:1: ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4752:2: ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 )
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyAssignment_2()); 
            // InternalJsonSchemaDsl.g:4753:2: ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 )
            // InternalJsonSchemaDsl.g:4753:3: rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2
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
    // InternalJsonSchemaDsl.g:4762:1: rule__TypeSchemaDefinition__Group__0 : rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1 ;
    public final void rule__TypeSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4766:1: ( rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4767:2: rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalJsonSchemaDsl.g:4774:1: rule__TypeSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__TypeSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4778:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:4779:1: ( () )
            {
            // InternalJsonSchemaDsl.g:4779:1: ( () )
            // InternalJsonSchemaDsl.g:4780:2: ()
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:4781:2: ()
            // InternalJsonSchemaDsl.g:4781:3: 
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
    // InternalJsonSchemaDsl.g:4789:1: rule__TypeSchemaDefinition__Group__1 : rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2 ;
    public final void rule__TypeSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4793:1: ( rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4794:2: rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4801:1: rule__TypeSchemaDefinition__Group__1__Impl : ( '\"type\"' ) ;
    public final void rule__TypeSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4805:1: ( ( '\"type\"' ) )
            // InternalJsonSchemaDsl.g:4806:1: ( '\"type\"' )
            {
            // InternalJsonSchemaDsl.g:4806:1: ( '\"type\"' )
            // InternalJsonSchemaDsl.g:4807:2: '\"type\"'
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4816:1: rule__TypeSchemaDefinition__Group__2 : rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3 ;
    public final void rule__TypeSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4820:1: ( rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:4821:2: rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalJsonSchemaDsl.g:4828:1: rule__TypeSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__TypeSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4832:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4833:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4833:1: ( ':' )
            // InternalJsonSchemaDsl.g:4834:2: ':'
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4843:1: rule__TypeSchemaDefinition__Group__3 : rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4 ;
    public final void rule__TypeSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4847:1: ( rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:4848:2: rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalJsonSchemaDsl.g:4855:1: rule__TypeSchemaDefinition__Group__3__Impl : ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? ) ;
    public final void rule__TypeSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4859:1: ( ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? ) )
            // InternalJsonSchemaDsl.g:4860:1: ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? )
            {
            // InternalJsonSchemaDsl.g:4860:1: ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? )
            // InternalJsonSchemaDsl.g:4861:2: ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )?
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1Assignment_3()); 
            // InternalJsonSchemaDsl.g:4862:2: ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=56 && LA16_0<=62)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4862:3: rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3
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
    // InternalJsonSchemaDsl.g:4870:1: rule__TypeSchemaDefinition__Group__4 : rule__TypeSchemaDefinition__Group__4__Impl ;
    public final void rule__TypeSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4874:1: ( rule__TypeSchemaDefinition__Group__4__Impl )
            // InternalJsonSchemaDsl.g:4875:2: rule__TypeSchemaDefinition__Group__4__Impl
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
    // InternalJsonSchemaDsl.g:4881:1: rule__TypeSchemaDefinition__Group__4__Impl : ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? ) ;
    public final void rule__TypeSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4885:1: ( ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? ) )
            // InternalJsonSchemaDsl.g:4886:1: ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? )
            {
            // InternalJsonSchemaDsl.g:4886:1: ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? )
            // InternalJsonSchemaDsl.g:4887:2: ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )?
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2Assignment_4()); 
            // InternalJsonSchemaDsl.g:4888:2: ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==67) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4888:3: rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4
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
    // InternalJsonSchemaDsl.g:4897:1: rule__AdditionalPropertiesSchemaDefinition__Group__0 : rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1 ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4901:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4902:2: rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4909:1: rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl : ( '\"additionalProperties\"' ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4913:1: ( ( '\"additionalProperties\"' ) )
            // InternalJsonSchemaDsl.g:4914:1: ( '\"additionalProperties\"' )
            {
            // InternalJsonSchemaDsl.g:4914:1: ( '\"additionalProperties\"' )
            // InternalJsonSchemaDsl.g:4915:2: '\"additionalProperties\"'
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4924:1: rule__AdditionalPropertiesSchemaDefinition__Group__1 : rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2 ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4928:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4929:2: rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4936:1: rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4940:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4941:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4941:1: ( ':' )
            // InternalJsonSchemaDsl.g:4942:2: ':'
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4951:1: rule__AdditionalPropertiesSchemaDefinition__Group__2 : rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4955:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4956:2: rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4962:1: rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4966:1: ( ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4967:1: ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4967:1: ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4968:2: ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 )
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:4969:2: ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:4969:3: rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2
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
    // InternalJsonSchemaDsl.g:4978:1: rule__ElseSchemaDefinition__Group__0 : rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1 ;
    public final void rule__ElseSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4982:1: ( rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4983:2: rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4990:1: rule__ElseSchemaDefinition__Group__0__Impl : ( '\"else\"' ) ;
    public final void rule__ElseSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4994:1: ( ( '\"else\"' ) )
            // InternalJsonSchemaDsl.g:4995:1: ( '\"else\"' )
            {
            // InternalJsonSchemaDsl.g:4995:1: ( '\"else\"' )
            // InternalJsonSchemaDsl.g:4996:2: '\"else\"'
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5005:1: rule__ElseSchemaDefinition__Group__1 : rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2 ;
    public final void rule__ElseSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5009:1: ( rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5010:2: rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5017:1: rule__ElseSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ElseSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5021:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5022:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5022:1: ( ':' )
            // InternalJsonSchemaDsl.g:5023:2: ':'
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5032:1: rule__ElseSchemaDefinition__Group__2 : rule__ElseSchemaDefinition__Group__2__Impl ;
    public final void rule__ElseSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5036:1: ( rule__ElseSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5037:2: rule__ElseSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5043:1: rule__ElseSchemaDefinition__Group__2__Impl : ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) ) ;
    public final void rule__ElseSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5047:1: ( ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5048:1: ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5048:1: ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5049:2: ( rule__ElseSchemaDefinition__ElseAssignment_2 )
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseAssignment_2()); 
            // InternalJsonSchemaDsl.g:5050:2: ( rule__ElseSchemaDefinition__ElseAssignment_2 )
            // InternalJsonSchemaDsl.g:5050:3: rule__ElseSchemaDefinition__ElseAssignment_2
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
    // InternalJsonSchemaDsl.g:5059:1: rule__IdSchemaDefinition__Group__0 : rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1 ;
    public final void rule__IdSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5063:1: ( rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5064:2: rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5071:1: rule__IdSchemaDefinition__Group__0__Impl : ( '\"$id\"' ) ;
    public final void rule__IdSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5075:1: ( ( '\"$id\"' ) )
            // InternalJsonSchemaDsl.g:5076:1: ( '\"$id\"' )
            {
            // InternalJsonSchemaDsl.g:5076:1: ( '\"$id\"' )
            // InternalJsonSchemaDsl.g:5077:2: '\"$id\"'
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getIdKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5086:1: rule__IdSchemaDefinition__Group__1 : rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2 ;
    public final void rule__IdSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5090:1: ( rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5091:2: rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:5098:1: rule__IdSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__IdSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5102:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5103:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5103:1: ( ':' )
            // InternalJsonSchemaDsl.g:5104:2: ':'
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5113:1: rule__IdSchemaDefinition__Group__2 : rule__IdSchemaDefinition__Group__2__Impl ;
    public final void rule__IdSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5117:1: ( rule__IdSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5118:2: rule__IdSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5124:1: rule__IdSchemaDefinition__Group__2__Impl : ( ( rule__IdSchemaDefinition__IdAssignment_2 ) ) ;
    public final void rule__IdSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5128:1: ( ( ( rule__IdSchemaDefinition__IdAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5129:1: ( ( rule__IdSchemaDefinition__IdAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5129:1: ( ( rule__IdSchemaDefinition__IdAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5130:2: ( rule__IdSchemaDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getIdAssignment_2()); 
            // InternalJsonSchemaDsl.g:5131:2: ( rule__IdSchemaDefinition__IdAssignment_2 )
            // InternalJsonSchemaDsl.g:5131:3: rule__IdSchemaDefinition__IdAssignment_2
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
    // InternalJsonSchemaDsl.g:5140:1: rule__ConstSchemaDefinition__Group__0 : rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1 ;
    public final void rule__ConstSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5144:1: ( rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5145:2: rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5152:1: rule__ConstSchemaDefinition__Group__0__Impl : ( '\"const\"' ) ;
    public final void rule__ConstSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5156:1: ( ( '\"const\"' ) )
            // InternalJsonSchemaDsl.g:5157:1: ( '\"const\"' )
            {
            // InternalJsonSchemaDsl.g:5157:1: ( '\"const\"' )
            // InternalJsonSchemaDsl.g:5158:2: '\"const\"'
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5167:1: rule__ConstSchemaDefinition__Group__1 : rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2 ;
    public final void rule__ConstSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5171:1: ( rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5172:2: rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:5179:1: rule__ConstSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ConstSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5183:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5184:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5184:1: ( ':' )
            // InternalJsonSchemaDsl.g:5185:2: ':'
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5194:1: rule__ConstSchemaDefinition__Group__2 : rule__ConstSchemaDefinition__Group__2__Impl ;
    public final void rule__ConstSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5198:1: ( rule__ConstSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5199:2: rule__ConstSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5205:1: rule__ConstSchemaDefinition__Group__2__Impl : ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) ) ;
    public final void rule__ConstSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5209:1: ( ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5210:1: ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5210:1: ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5211:2: ( rule__ConstSchemaDefinition__ConstAssignment_2 )
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstAssignment_2()); 
            // InternalJsonSchemaDsl.g:5212:2: ( rule__ConstSchemaDefinition__ConstAssignment_2 )
            // InternalJsonSchemaDsl.g:5212:3: rule__ConstSchemaDefinition__ConstAssignment_2
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
    // InternalJsonSchemaDsl.g:5221:1: rule__RequiredSchemaDefinition__Group__0 : rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1 ;
    public final void rule__RequiredSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5225:1: ( rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5226:2: rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5233:1: rule__RequiredSchemaDefinition__Group__0__Impl : ( '\"required\"' ) ;
    public final void rule__RequiredSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5237:1: ( ( '\"required\"' ) )
            // InternalJsonSchemaDsl.g:5238:1: ( '\"required\"' )
            {
            // InternalJsonSchemaDsl.g:5238:1: ( '\"required\"' )
            // InternalJsonSchemaDsl.g:5239:2: '\"required\"'
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5248:1: rule__RequiredSchemaDefinition__Group__1 : rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2 ;
    public final void rule__RequiredSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5252:1: ( rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5253:2: rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:5260:1: rule__RequiredSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RequiredSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5264:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5265:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5265:1: ( ':' )
            // InternalJsonSchemaDsl.g:5266:2: ':'
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5275:1: rule__RequiredSchemaDefinition__Group__2 : rule__RequiredSchemaDefinition__Group__2__Impl ;
    public final void rule__RequiredSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5279:1: ( rule__RequiredSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5280:2: rule__RequiredSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5286:1: rule__RequiredSchemaDefinition__Group__2__Impl : ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) ) ;
    public final void rule__RequiredSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5290:1: ( ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5291:1: ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5291:1: ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5292:2: ( rule__RequiredSchemaDefinition__RequiredAssignment_2 )
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredAssignment_2()); 
            // InternalJsonSchemaDsl.g:5293:2: ( rule__RequiredSchemaDefinition__RequiredAssignment_2 )
            // InternalJsonSchemaDsl.g:5293:3: rule__RequiredSchemaDefinition__RequiredAssignment_2
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
    // InternalJsonSchemaDsl.g:5302:1: rule__DescriptionSchemaDefinition__Group__0 : rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1 ;
    public final void rule__DescriptionSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5306:1: ( rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5307:2: rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5314:1: rule__DescriptionSchemaDefinition__Group__0__Impl : ( '\"description\"' ) ;
    public final void rule__DescriptionSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5318:1: ( ( '\"description\"' ) )
            // InternalJsonSchemaDsl.g:5319:1: ( '\"description\"' )
            {
            // InternalJsonSchemaDsl.g:5319:1: ( '\"description\"' )
            // InternalJsonSchemaDsl.g:5320:2: '\"description\"'
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5329:1: rule__DescriptionSchemaDefinition__Group__1 : rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2 ;
    public final void rule__DescriptionSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5333:1: ( rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5334:2: rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:5341:1: rule__DescriptionSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DescriptionSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5345:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5346:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5346:1: ( ':' )
            // InternalJsonSchemaDsl.g:5347:2: ':'
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5356:1: rule__DescriptionSchemaDefinition__Group__2 : rule__DescriptionSchemaDefinition__Group__2__Impl ;
    public final void rule__DescriptionSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5360:1: ( rule__DescriptionSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5361:2: rule__DescriptionSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5367:1: rule__DescriptionSchemaDefinition__Group__2__Impl : ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) ) ;
    public final void rule__DescriptionSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5371:1: ( ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5372:1: ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5372:1: ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5373:2: ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionAssignment_2()); 
            // InternalJsonSchemaDsl.g:5374:2: ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 )
            // InternalJsonSchemaDsl.g:5374:3: rule__DescriptionSchemaDefinition__DescriptionAssignment_2
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
    // InternalJsonSchemaDsl.g:5383:1: rule__MinPropertiesSchemaDefinition__Group__0 : rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1 ;
    public final void rule__MinPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5387:1: ( rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5388:2: rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5395:1: rule__MinPropertiesSchemaDefinition__Group__0__Impl : ( '\"minProperties\"' ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5399:1: ( ( '\"minProperties\"' ) )
            // InternalJsonSchemaDsl.g:5400:1: ( '\"minProperties\"' )
            {
            // InternalJsonSchemaDsl.g:5400:1: ( '\"minProperties\"' )
            // InternalJsonSchemaDsl.g:5401:2: '\"minProperties\"'
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5410:1: rule__MinPropertiesSchemaDefinition__Group__1 : rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2 ;
    public final void rule__MinPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5414:1: ( rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5415:2: rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:5422:1: rule__MinPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5426:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5427:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5427:1: ( ':' )
            // InternalJsonSchemaDsl.g:5428:2: ':'
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5437:1: rule__MinPropertiesSchemaDefinition__Group__2 : rule__MinPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__MinPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5441:1: ( rule__MinPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5442:2: rule__MinPropertiesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5448:1: rule__MinPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5452:1: ( ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5453:1: ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5453:1: ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5454:2: ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 )
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:5455:2: ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:5455:3: rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2
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
    // InternalJsonSchemaDsl.g:5464:1: rule__PatternPropertiesSchemaDefinition__Group__0 : rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5468:1: ( rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5469:2: rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJsonSchemaDsl.g:5476:1: rule__PatternPropertiesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5480:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:5481:1: ( () )
            {
            // InternalJsonSchemaDsl.g:5481:1: ( () )
            // InternalJsonSchemaDsl.g:5482:2: ()
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:5483:2: ()
            // InternalJsonSchemaDsl.g:5483:3: 
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
    // InternalJsonSchemaDsl.g:5491:1: rule__PatternPropertiesSchemaDefinition__Group__1 : rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5495:1: ( rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5496:2: rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5503:1: rule__PatternPropertiesSchemaDefinition__Group__1__Impl : ( '\"patternProperties\"' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5507:1: ( ( '\"patternProperties\"' ) )
            // InternalJsonSchemaDsl.g:5508:1: ( '\"patternProperties\"' )
            {
            // InternalJsonSchemaDsl.g:5508:1: ( '\"patternProperties\"' )
            // InternalJsonSchemaDsl.g:5509:2: '\"patternProperties\"'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5518:1: rule__PatternPropertiesSchemaDefinition__Group__2 : rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5522:1: ( rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:5523:2: rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:5530:1: rule__PatternPropertiesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5534:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5535:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5535:1: ( ':' )
            // InternalJsonSchemaDsl.g:5536:2: ':'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5545:1: rule__PatternPropertiesSchemaDefinition__Group__3 : rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5549:1: ( rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:5550:2: rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalJsonSchemaDsl.g:5557:1: rule__PatternPropertiesSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5561:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:5562:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:5562:1: ( '{' )
            // InternalJsonSchemaDsl.g:5563:2: '{'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5572:1: rule__PatternPropertiesSchemaDefinition__Group__4 : rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5576:1: ( rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:5577:2: rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalJsonSchemaDsl.g:5584:1: rule__PatternPropertiesSchemaDefinition__Group__4__Impl : ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5588:1: ( ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:5589:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:5589:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:5590:2: ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:5591:2: ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||(LA18_0>=14 && LA18_0<=55)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJsonSchemaDsl.g:5591:3: rule__PatternPropertiesSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:5599:1: rule__PatternPropertiesSchemaDefinition__Group__5 : rule__PatternPropertiesSchemaDefinition__Group__5__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5603:1: ( rule__PatternPropertiesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:5604:2: rule__PatternPropertiesSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:5610:1: rule__PatternPropertiesSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5614:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:5615:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:5615:1: ( '}' )
            // InternalJsonSchemaDsl.g:5616:2: '}'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5626:1: rule__PatternPropertiesSchemaDefinition__Group_4__0 : rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5630:1: ( rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:5631:2: rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:5638:1: rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl : ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5642:1: ( ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:5643:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:5643:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:5644:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:5645:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:5645:3: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0
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
    // InternalJsonSchemaDsl.g:5653:1: rule__PatternPropertiesSchemaDefinition__Group_4__1 : rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5657:1: ( rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:5658:2: rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:5664:1: rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl : ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5668:1: ( ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:5669:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:5669:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:5670:2: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:5671:2: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==65) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:5671:3: rule__PatternPropertiesSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PatternPropertiesSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalJsonSchemaDsl.g:5680:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__0 : rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5684:1: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:5685:2: rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:5692:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5696:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:5697:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:5697:1: ( ',' )
            // InternalJsonSchemaDsl.g:5698:2: ','
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5707:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__1 : rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5711:1: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:5712:2: rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:5718:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5722:1: ( ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:5723:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:5723:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:5724:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:5725:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:5725:3: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:5734:1: rule__AdditionalItemsSchemaDefinition__Group__0 : rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1 ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5738:1: ( rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5739:2: rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5746:1: rule__AdditionalItemsSchemaDefinition__Group__0__Impl : ( '\"additionalItems\"' ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5750:1: ( ( '\"additionalItems\"' ) )
            // InternalJsonSchemaDsl.g:5751:1: ( '\"additionalItems\"' )
            {
            // InternalJsonSchemaDsl.g:5751:1: ( '\"additionalItems\"' )
            // InternalJsonSchemaDsl.g:5752:2: '\"additionalItems\"'
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5761:1: rule__AdditionalItemsSchemaDefinition__Group__1 : rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2 ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5765:1: ( rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5766:2: rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5773:1: rule__AdditionalItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5777:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5778:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5778:1: ( ':' )
            // InternalJsonSchemaDsl.g:5779:2: ':'
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5788:1: rule__AdditionalItemsSchemaDefinition__Group__2 : rule__AdditionalItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5792:1: ( rule__AdditionalItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5793:2: rule__AdditionalItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5799:1: rule__AdditionalItemsSchemaDefinition__Group__2__Impl : ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5803:1: ( ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5804:1: ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5804:1: ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5805:2: ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 )
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:5806:2: ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:5806:3: rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:5815:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5819:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalJsonSchemaDsl.g:5820:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalJsonSchemaDsl.g:5827:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5831:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:5832:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:5832:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:5833:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:5834:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:5834:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalJsonSchemaDsl.g:5842:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5846:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalJsonSchemaDsl.g:5847:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:5854:1: rule__KeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5858:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5859:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5859:1: ( ':' )
            // InternalJsonSchemaDsl.g:5860:2: ':'
            {
             before(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5869:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5873:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5874:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5880:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5884:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5885:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5885:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5886:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:5887:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:5887:3: rule__KeyValuePair__ValueAssignment_2
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
    // InternalJsonSchemaDsl.g:5896:1: rule__ExamplesSchemaDefinition__Group__0 : rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1 ;
    public final void rule__ExamplesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5900:1: ( rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5901:2: rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalJsonSchemaDsl.g:5908:1: rule__ExamplesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ExamplesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5912:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:5913:1: ( () )
            {
            // InternalJsonSchemaDsl.g:5913:1: ( () )
            // InternalJsonSchemaDsl.g:5914:2: ()
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:5915:2: ()
            // InternalJsonSchemaDsl.g:5915:3: 
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
    // InternalJsonSchemaDsl.g:5923:1: rule__ExamplesSchemaDefinition__Group__1 : rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2 ;
    public final void rule__ExamplesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5927:1: ( rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5928:2: rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5935:1: rule__ExamplesSchemaDefinition__Group__1__Impl : ( '\"examples\"' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5939:1: ( ( '\"examples\"' ) )
            // InternalJsonSchemaDsl.g:5940:1: ( '\"examples\"' )
            {
            // InternalJsonSchemaDsl.g:5940:1: ( '\"examples\"' )
            // InternalJsonSchemaDsl.g:5941:2: '\"examples\"'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5950:1: rule__ExamplesSchemaDefinition__Group__2 : rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3 ;
    public final void rule__ExamplesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5954:1: ( rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:5955:2: rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:5962:1: rule__ExamplesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5966:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5967:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5967:1: ( ':' )
            // InternalJsonSchemaDsl.g:5968:2: ':'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5977:1: rule__ExamplesSchemaDefinition__Group__3 : rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4 ;
    public final void rule__ExamplesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5981:1: ( rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:5982:2: rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalJsonSchemaDsl.g:5989:1: rule__ExamplesSchemaDefinition__Group__3__Impl : ( '[' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5993:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:5994:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:5994:1: ( '[' )
            // InternalJsonSchemaDsl.g:5995:2: '['
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6004:1: rule__ExamplesSchemaDefinition__Group__4 : rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5 ;
    public final void rule__ExamplesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6008:1: ( rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:6009:2: rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalJsonSchemaDsl.g:6016:1: rule__ExamplesSchemaDefinition__Group__4__Impl : ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__ExamplesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6020:1: ( ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:6021:1: ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:6021:1: ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:6022:2: ( rule__ExamplesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:6023:2: ( rule__ExamplesSchemaDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_JSON_NUMBER && LA20_0<=RULE_INT)||(LA20_0>=12 && LA20_0<=55)||LA20_0==63||LA20_0==67||(LA20_0>=71 && LA20_0<=72)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJsonSchemaDsl.g:6023:3: rule__ExamplesSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:6031:1: rule__ExamplesSchemaDefinition__Group__5 : rule__ExamplesSchemaDefinition__Group__5__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6035:1: ( rule__ExamplesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:6036:2: rule__ExamplesSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:6042:1: rule__ExamplesSchemaDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6046:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:6047:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:6047:1: ( ']' )
            // InternalJsonSchemaDsl.g:6048:2: ']'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6058:1: rule__ExamplesSchemaDefinition__Group_4__0 : rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1 ;
    public final void rule__ExamplesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6062:1: ( rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:6063:2: rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:6070:1: rule__ExamplesSchemaDefinition__Group_4__0__Impl : ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6074:1: ( ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:6075:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:6075:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:6076:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:6077:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 )
            // InternalJsonSchemaDsl.g:6077:3: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0
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
    // InternalJsonSchemaDsl.g:6085:1: rule__ExamplesSchemaDefinition__Group_4__1 : rule__ExamplesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6089:1: ( rule__ExamplesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:6090:2: rule__ExamplesSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:6096:1: rule__ExamplesSchemaDefinition__Group_4__1__Impl : ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6100:1: ( ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:6101:1: ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:6101:1: ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:6102:2: ( rule__ExamplesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:6103:2: ( rule__ExamplesSchemaDefinition__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==65) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:6103:3: rule__ExamplesSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ExamplesSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalJsonSchemaDsl.g:6112:1: rule__ExamplesSchemaDefinition__Group_4_1__0 : rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1 ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6116:1: ( rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:6117:2: rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:6124:1: rule__ExamplesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6128:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:6129:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:6129:1: ( ',' )
            // InternalJsonSchemaDsl.g:6130:2: ','
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6139:1: rule__ExamplesSchemaDefinition__Group_4_1__1 : rule__ExamplesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6143:1: ( rule__ExamplesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:6144:2: rule__ExamplesSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:6150:1: rule__ExamplesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6154:1: ( ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:6155:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:6155:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:6156:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:6157:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:6157:3: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:6166:1: rule__IfSchemaDefinition__Group__0 : rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1 ;
    public final void rule__IfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6170:1: ( rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6171:2: rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6178:1: rule__IfSchemaDefinition__Group__0__Impl : ( '\"if\"' ) ;
    public final void rule__IfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6182:1: ( ( '\"if\"' ) )
            // InternalJsonSchemaDsl.g:6183:1: ( '\"if\"' )
            {
            // InternalJsonSchemaDsl.g:6183:1: ( '\"if\"' )
            // InternalJsonSchemaDsl.g:6184:2: '\"if\"'
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6193:1: rule__IfSchemaDefinition__Group__1 : rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2 ;
    public final void rule__IfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6197:1: ( rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6198:2: rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6205:1: rule__IfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__IfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6209:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6210:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6210:1: ( ':' )
            // InternalJsonSchemaDsl.g:6211:2: ':'
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6220:1: rule__IfSchemaDefinition__Group__2 : rule__IfSchemaDefinition__Group__2__Impl ;
    public final void rule__IfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6224:1: ( rule__IfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6225:2: rule__IfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6231:1: rule__IfSchemaDefinition__Group__2__Impl : ( ( rule__IfSchemaDefinition__IfAssignment_2 ) ) ;
    public final void rule__IfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6235:1: ( ( ( rule__IfSchemaDefinition__IfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6236:1: ( ( rule__IfSchemaDefinition__IfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6236:1: ( ( rule__IfSchemaDefinition__IfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6237:2: ( rule__IfSchemaDefinition__IfAssignment_2 )
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6238:2: ( rule__IfSchemaDefinition__IfAssignment_2 )
            // InternalJsonSchemaDsl.g:6238:3: rule__IfSchemaDefinition__IfAssignment_2
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
    // InternalJsonSchemaDsl.g:6247:1: rule__AllOfSchemaDefinition__Group__0 : rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1 ;
    public final void rule__AllOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6251:1: ( rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6252:2: rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6259:1: rule__AllOfSchemaDefinition__Group__0__Impl : ( '\"allOf\"' ) ;
    public final void rule__AllOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6263:1: ( ( '\"allOf\"' ) )
            // InternalJsonSchemaDsl.g:6264:1: ( '\"allOf\"' )
            {
            // InternalJsonSchemaDsl.g:6264:1: ( '\"allOf\"' )
            // InternalJsonSchemaDsl.g:6265:2: '\"allOf\"'
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6274:1: rule__AllOfSchemaDefinition__Group__1 : rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2 ;
    public final void rule__AllOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6278:1: ( rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6279:2: rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:6286:1: rule__AllOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AllOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6290:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6291:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6291:1: ( ':' )
            // InternalJsonSchemaDsl.g:6292:2: ':'
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6301:1: rule__AllOfSchemaDefinition__Group__2 : rule__AllOfSchemaDefinition__Group__2__Impl ;
    public final void rule__AllOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6305:1: ( rule__AllOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6306:2: rule__AllOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6312:1: rule__AllOfSchemaDefinition__Group__2__Impl : ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) ) ;
    public final void rule__AllOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6316:1: ( ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6317:1: ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6317:1: ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6318:2: ( rule__AllOfSchemaDefinition__AllOfAssignment_2 )
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6319:2: ( rule__AllOfSchemaDefinition__AllOfAssignment_2 )
            // InternalJsonSchemaDsl.g:6319:3: rule__AllOfSchemaDefinition__AllOfAssignment_2
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
    // InternalJsonSchemaDsl.g:6328:1: rule__ContentEncodingSchemaDefinition__Group__0 : rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1 ;
    public final void rule__ContentEncodingSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6332:1: ( rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6333:2: rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6340:1: rule__ContentEncodingSchemaDefinition__Group__0__Impl : ( '\"contentEncoding\"' ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6344:1: ( ( '\"contentEncoding\"' ) )
            // InternalJsonSchemaDsl.g:6345:1: ( '\"contentEncoding\"' )
            {
            // InternalJsonSchemaDsl.g:6345:1: ( '\"contentEncoding\"' )
            // InternalJsonSchemaDsl.g:6346:2: '\"contentEncoding\"'
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6355:1: rule__ContentEncodingSchemaDefinition__Group__1 : rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2 ;
    public final void rule__ContentEncodingSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6359:1: ( rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6360:2: rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:6367:1: rule__ContentEncodingSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6371:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6372:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6372:1: ( ':' )
            // InternalJsonSchemaDsl.g:6373:2: ':'
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6382:1: rule__ContentEncodingSchemaDefinition__Group__2 : rule__ContentEncodingSchemaDefinition__Group__2__Impl ;
    public final void rule__ContentEncodingSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6386:1: ( rule__ContentEncodingSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6387:2: rule__ContentEncodingSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6393:1: rule__ContentEncodingSchemaDefinition__Group__2__Impl : ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6397:1: ( ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6398:1: ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6398:1: ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6399:2: ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 )
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingAssignment_2()); 
            // InternalJsonSchemaDsl.g:6400:2: ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 )
            // InternalJsonSchemaDsl.g:6400:3: rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2
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
    // InternalJsonSchemaDsl.g:6409:1: rule__MultipleOfSchemaDefinition__Group__0 : rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1 ;
    public final void rule__MultipleOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6413:1: ( rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6414:2: rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6421:1: rule__MultipleOfSchemaDefinition__Group__0__Impl : ( '\"multipleOf\"' ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6425:1: ( ( '\"multipleOf\"' ) )
            // InternalJsonSchemaDsl.g:6426:1: ( '\"multipleOf\"' )
            {
            // InternalJsonSchemaDsl.g:6426:1: ( '\"multipleOf\"' )
            // InternalJsonSchemaDsl.g:6427:2: '\"multipleOf\"'
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6436:1: rule__MultipleOfSchemaDefinition__Group__1 : rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2 ;
    public final void rule__MultipleOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6440:1: ( rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6441:2: rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6448:1: rule__MultipleOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6452:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6453:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6453:1: ( ':' )
            // InternalJsonSchemaDsl.g:6454:2: ':'
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6463:1: rule__MultipleOfSchemaDefinition__Group__2 : rule__MultipleOfSchemaDefinition__Group__2__Impl ;
    public final void rule__MultipleOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6467:1: ( rule__MultipleOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6468:2: rule__MultipleOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6474:1: rule__MultipleOfSchemaDefinition__Group__2__Impl : ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6478:1: ( ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6479:1: ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6479:1: ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6480:2: ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 )
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6481:2: ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 )
            // InternalJsonSchemaDsl.g:6481:3: rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2
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
    // InternalJsonSchemaDsl.g:6490:1: rule__PatternSchemaDefinition__Group__0 : rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1 ;
    public final void rule__PatternSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6494:1: ( rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6495:2: rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6502:1: rule__PatternSchemaDefinition__Group__0__Impl : ( '\"pattern\"' ) ;
    public final void rule__PatternSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6506:1: ( ( '\"pattern\"' ) )
            // InternalJsonSchemaDsl.g:6507:1: ( '\"pattern\"' )
            {
            // InternalJsonSchemaDsl.g:6507:1: ( '\"pattern\"' )
            // InternalJsonSchemaDsl.g:6508:2: '\"pattern\"'
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6517:1: rule__PatternSchemaDefinition__Group__1 : rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2 ;
    public final void rule__PatternSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6521:1: ( rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6522:2: rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:6529:1: rule__PatternSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PatternSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6533:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6534:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6534:1: ( ':' )
            // InternalJsonSchemaDsl.g:6535:2: ':'
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6544:1: rule__PatternSchemaDefinition__Group__2 : rule__PatternSchemaDefinition__Group__2__Impl ;
    public final void rule__PatternSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6548:1: ( rule__PatternSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6549:2: rule__PatternSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6555:1: rule__PatternSchemaDefinition__Group__2__Impl : ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) ) ;
    public final void rule__PatternSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6559:1: ( ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6560:1: ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6560:1: ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6561:2: ( rule__PatternSchemaDefinition__PatternAssignment_2 )
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternAssignment_2()); 
            // InternalJsonSchemaDsl.g:6562:2: ( rule__PatternSchemaDefinition__PatternAssignment_2 )
            // InternalJsonSchemaDsl.g:6562:3: rule__PatternSchemaDefinition__PatternAssignment_2
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
    // InternalJsonSchemaDsl.g:6571:1: rule__ContainsSchemaDefinition__Group__0 : rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1 ;
    public final void rule__ContainsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6575:1: ( rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6576:2: rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6583:1: rule__ContainsSchemaDefinition__Group__0__Impl : ( '\"contains\"' ) ;
    public final void rule__ContainsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6587:1: ( ( '\"contains\"' ) )
            // InternalJsonSchemaDsl.g:6588:1: ( '\"contains\"' )
            {
            // InternalJsonSchemaDsl.g:6588:1: ( '\"contains\"' )
            // InternalJsonSchemaDsl.g:6589:2: '\"contains\"'
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6598:1: rule__ContainsSchemaDefinition__Group__1 : rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2 ;
    public final void rule__ContainsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6602:1: ( rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6603:2: rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6610:1: rule__ContainsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContainsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6614:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6615:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6615:1: ( ':' )
            // InternalJsonSchemaDsl.g:6616:2: ':'
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6625:1: rule__ContainsSchemaDefinition__Group__2 : rule__ContainsSchemaDefinition__Group__2__Impl ;
    public final void rule__ContainsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6629:1: ( rule__ContainsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6630:2: rule__ContainsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6636:1: rule__ContainsSchemaDefinition__Group__2__Impl : ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) ) ;
    public final void rule__ContainsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6640:1: ( ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6641:1: ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6641:1: ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6642:2: ( rule__ContainsSchemaDefinition__ContainsAssignment_2 )
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsAssignment_2()); 
            // InternalJsonSchemaDsl.g:6643:2: ( rule__ContainsSchemaDefinition__ContainsAssignment_2 )
            // InternalJsonSchemaDsl.g:6643:3: rule__ContainsSchemaDefinition__ContainsAssignment_2
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
    // InternalJsonSchemaDsl.g:6652:1: rule__NotSchemaDefinition__Group__0 : rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1 ;
    public final void rule__NotSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6656:1: ( rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6657:2: rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6664:1: rule__NotSchemaDefinition__Group__0__Impl : ( '\"not\"' ) ;
    public final void rule__NotSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6668:1: ( ( '\"not\"' ) )
            // InternalJsonSchemaDsl.g:6669:1: ( '\"not\"' )
            {
            // InternalJsonSchemaDsl.g:6669:1: ( '\"not\"' )
            // InternalJsonSchemaDsl.g:6670:2: '\"not\"'
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6679:1: rule__NotSchemaDefinition__Group__1 : rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2 ;
    public final void rule__NotSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6683:1: ( rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6684:2: rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6691:1: rule__NotSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__NotSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6695:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6696:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6696:1: ( ':' )
            // InternalJsonSchemaDsl.g:6697:2: ':'
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6706:1: rule__NotSchemaDefinition__Group__2 : rule__NotSchemaDefinition__Group__2__Impl ;
    public final void rule__NotSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6710:1: ( rule__NotSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6711:2: rule__NotSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6717:1: rule__NotSchemaDefinition__Group__2__Impl : ( ( rule__NotSchemaDefinition__NotAssignment_2 ) ) ;
    public final void rule__NotSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6721:1: ( ( ( rule__NotSchemaDefinition__NotAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6722:1: ( ( rule__NotSchemaDefinition__NotAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6722:1: ( ( rule__NotSchemaDefinition__NotAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6723:2: ( rule__NotSchemaDefinition__NotAssignment_2 )
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotAssignment_2()); 
            // InternalJsonSchemaDsl.g:6724:2: ( rule__NotSchemaDefinition__NotAssignment_2 )
            // InternalJsonSchemaDsl.g:6724:3: rule__NotSchemaDefinition__NotAssignment_2
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
    // InternalJsonSchemaDsl.g:6733:1: rule__ExclusiveMaximumSchemaDefinition__Group__0 : rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1 ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6737:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6738:2: rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6745:1: rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl : ( '\"exclusiveMaximum\"' ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6749:1: ( ( '\"exclusiveMaximum\"' ) )
            // InternalJsonSchemaDsl.g:6750:1: ( '\"exclusiveMaximum\"' )
            {
            // InternalJsonSchemaDsl.g:6750:1: ( '\"exclusiveMaximum\"' )
            // InternalJsonSchemaDsl.g:6751:2: '\"exclusiveMaximum\"'
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6760:1: rule__ExclusiveMaximumSchemaDefinition__Group__1 : rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2 ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6764:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6765:2: rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6772:1: rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6776:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6777:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6777:1: ( ':' )
            // InternalJsonSchemaDsl.g:6778:2: ':'
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6787:1: rule__ExclusiveMaximumSchemaDefinition__Group__2 : rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6791:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6792:2: rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6798:1: rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl : ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6802:1: ( ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6803:1: ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6803:1: ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6804:2: ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumAssignment_2()); 
            // InternalJsonSchemaDsl.g:6805:2: ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 )
            // InternalJsonSchemaDsl.g:6805:3: rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2
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
    // InternalJsonSchemaDsl.g:6814:1: rule__MaxLengthSchemaDefinition__Group__0 : rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1 ;
    public final void rule__MaxLengthSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6818:1: ( rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6819:2: rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6826:1: rule__MaxLengthSchemaDefinition__Group__0__Impl : ( '\"maxLength\"' ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6830:1: ( ( '\"maxLength\"' ) )
            // InternalJsonSchemaDsl.g:6831:1: ( '\"maxLength\"' )
            {
            // InternalJsonSchemaDsl.g:6831:1: ( '\"maxLength\"' )
            // InternalJsonSchemaDsl.g:6832:2: '\"maxLength\"'
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6841:1: rule__MaxLengthSchemaDefinition__Group__1 : rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2 ;
    public final void rule__MaxLengthSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6845:1: ( rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6846:2: rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:6853:1: rule__MaxLengthSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6857:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6858:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6858:1: ( ':' )
            // InternalJsonSchemaDsl.g:6859:2: ':'
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6868:1: rule__MaxLengthSchemaDefinition__Group__2 : rule__MaxLengthSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxLengthSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6872:1: ( rule__MaxLengthSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6873:2: rule__MaxLengthSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6879:1: rule__MaxLengthSchemaDefinition__Group__2__Impl : ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6883:1: ( ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6884:1: ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6884:1: ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6885:2: ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 )
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthAssignment_2()); 
            // InternalJsonSchemaDsl.g:6886:2: ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 )
            // InternalJsonSchemaDsl.g:6886:3: rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2
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
    // InternalJsonSchemaDsl.g:6895:1: rule__RefSchemaDefinition__Group__0 : rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1 ;
    public final void rule__RefSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6899:1: ( rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6900:2: rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6907:1: rule__RefSchemaDefinition__Group__0__Impl : ( '\"$ref\"' ) ;
    public final void rule__RefSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6911:1: ( ( '\"$ref\"' ) )
            // InternalJsonSchemaDsl.g:6912:1: ( '\"$ref\"' )
            {
            // InternalJsonSchemaDsl.g:6912:1: ( '\"$ref\"' )
            // InternalJsonSchemaDsl.g:6913:2: '\"$ref\"'
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getRefKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6922:1: rule__RefSchemaDefinition__Group__1 : rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2 ;
    public final void rule__RefSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6926:1: ( rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6927:2: rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:6934:1: rule__RefSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RefSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6938:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6939:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6939:1: ( ':' )
            // InternalJsonSchemaDsl.g:6940:2: ':'
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6949:1: rule__RefSchemaDefinition__Group__2 : rule__RefSchemaDefinition__Group__2__Impl ;
    public final void rule__RefSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6953:1: ( rule__RefSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6954:2: rule__RefSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6960:1: rule__RefSchemaDefinition__Group__2__Impl : ( ( rule__RefSchemaDefinition__RefAssignment_2 ) ) ;
    public final void rule__RefSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6964:1: ( ( ( rule__RefSchemaDefinition__RefAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6965:1: ( ( rule__RefSchemaDefinition__RefAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6965:1: ( ( rule__RefSchemaDefinition__RefAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6966:2: ( rule__RefSchemaDefinition__RefAssignment_2 )
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getRefAssignment_2()); 
            // InternalJsonSchemaDsl.g:6967:2: ( rule__RefSchemaDefinition__RefAssignment_2 )
            // InternalJsonSchemaDsl.g:6967:3: rule__RefSchemaDefinition__RefAssignment_2
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
    // InternalJsonSchemaDsl.g:6976:1: rule__ContentMediaTypeSchemaDefinition__Group__0 : rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1 ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6980:1: ( rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6981:2: rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6988:1: rule__ContentMediaTypeSchemaDefinition__Group__0__Impl : ( '\"contentMediaType\"' ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6992:1: ( ( '\"contentMediaType\"' ) )
            // InternalJsonSchemaDsl.g:6993:1: ( '\"contentMediaType\"' )
            {
            // InternalJsonSchemaDsl.g:6993:1: ( '\"contentMediaType\"' )
            // InternalJsonSchemaDsl.g:6994:2: '\"contentMediaType\"'
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7003:1: rule__ContentMediaTypeSchemaDefinition__Group__1 : rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2 ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7007:1: ( rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7008:2: rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:7015:1: rule__ContentMediaTypeSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7019:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7020:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7020:1: ( ':' )
            // InternalJsonSchemaDsl.g:7021:2: ':'
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7030:1: rule__ContentMediaTypeSchemaDefinition__Group__2 : rule__ContentMediaTypeSchemaDefinition__Group__2__Impl ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7034:1: ( rule__ContentMediaTypeSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7035:2: rule__ContentMediaTypeSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7041:1: rule__ContentMediaTypeSchemaDefinition__Group__2__Impl : ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7045:1: ( ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7046:1: ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7046:1: ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7047:2: ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 )
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeAssignment_2()); 
            // InternalJsonSchemaDsl.g:7048:2: ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 )
            // InternalJsonSchemaDsl.g:7048:3: rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2
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
    // InternalJsonSchemaDsl.g:7057:1: rule__ExclusiveMinimumSchemaDefinition__Group__0 : rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1 ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7061:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7062:2: rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7069:1: rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl : ( '\"exclusiveMinimum\"' ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7073:1: ( ( '\"exclusiveMinimum\"' ) )
            // InternalJsonSchemaDsl.g:7074:1: ( '\"exclusiveMinimum\"' )
            {
            // InternalJsonSchemaDsl.g:7074:1: ( '\"exclusiveMinimum\"' )
            // InternalJsonSchemaDsl.g:7075:2: '\"exclusiveMinimum\"'
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7084:1: rule__ExclusiveMinimumSchemaDefinition__Group__1 : rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2 ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7088:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7089:2: rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7096:1: rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7100:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7101:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7101:1: ( ':' )
            // InternalJsonSchemaDsl.g:7102:2: ':'
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7111:1: rule__ExclusiveMinimumSchemaDefinition__Group__2 : rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7115:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7116:2: rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7122:1: rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl : ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7126:1: ( ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7127:1: ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7127:1: ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7128:2: ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumAssignment_2()); 
            // InternalJsonSchemaDsl.g:7129:2: ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 )
            // InternalJsonSchemaDsl.g:7129:3: rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2
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
    // InternalJsonSchemaDsl.g:7138:1: rule__SchemaSchemaDefinition__Group__0 : rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1 ;
    public final void rule__SchemaSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7142:1: ( rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7143:2: rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7150:1: rule__SchemaSchemaDefinition__Group__0__Impl : ( '\"$schema\"' ) ;
    public final void rule__SchemaSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7154:1: ( ( '\"$schema\"' ) )
            // InternalJsonSchemaDsl.g:7155:1: ( '\"$schema\"' )
            {
            // InternalJsonSchemaDsl.g:7155:1: ( '\"$schema\"' )
            // InternalJsonSchemaDsl.g:7156:2: '\"$schema\"'
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7165:1: rule__SchemaSchemaDefinition__Group__1 : rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2 ;
    public final void rule__SchemaSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7169:1: ( rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7170:2: rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:7177:1: rule__SchemaSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__SchemaSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7181:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7182:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7182:1: ( ':' )
            // InternalJsonSchemaDsl.g:7183:2: ':'
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7192:1: rule__SchemaSchemaDefinition__Group__2 : rule__SchemaSchemaDefinition__Group__2__Impl ;
    public final void rule__SchemaSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7196:1: ( rule__SchemaSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7197:2: rule__SchemaSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7203:1: rule__SchemaSchemaDefinition__Group__2__Impl : ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) ) ;
    public final void rule__SchemaSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7207:1: ( ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7208:1: ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7208:1: ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7209:2: ( rule__SchemaSchemaDefinition__SchemaAssignment_2 )
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaAssignment_2()); 
            // InternalJsonSchemaDsl.g:7210:2: ( rule__SchemaSchemaDefinition__SchemaAssignment_2 )
            // InternalJsonSchemaDsl.g:7210:3: rule__SchemaSchemaDefinition__SchemaAssignment_2
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
    // InternalJsonSchemaDsl.g:7219:1: rule__PropertiesSchemaDefinition__Group__0 : rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1 ;
    public final void rule__PropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7223:1: ( rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7224:2: rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalJsonSchemaDsl.g:7231:1: rule__PropertiesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7235:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7236:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7236:1: ( () )
            // InternalJsonSchemaDsl.g:7237:2: ()
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:7238:2: ()
            // InternalJsonSchemaDsl.g:7238:3: 
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
    // InternalJsonSchemaDsl.g:7246:1: rule__PropertiesSchemaDefinition__Group__1 : rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2 ;
    public final void rule__PropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7250:1: ( rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7251:2: rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7258:1: rule__PropertiesSchemaDefinition__Group__1__Impl : ( '\"properties\"' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7262:1: ( ( '\"properties\"' ) )
            // InternalJsonSchemaDsl.g:7263:1: ( '\"properties\"' )
            {
            // InternalJsonSchemaDsl.g:7263:1: ( '\"properties\"' )
            // InternalJsonSchemaDsl.g:7264:2: '\"properties\"'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7273:1: rule__PropertiesSchemaDefinition__Group__2 : rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3 ;
    public final void rule__PropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7277:1: ( rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:7278:2: rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:7285:1: rule__PropertiesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7289:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7290:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7290:1: ( ':' )
            // InternalJsonSchemaDsl.g:7291:2: ':'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7300:1: rule__PropertiesSchemaDefinition__Group__3 : rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4 ;
    public final void rule__PropertiesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7304:1: ( rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:7305:2: rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalJsonSchemaDsl.g:7312:1: rule__PropertiesSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7316:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:7317:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:7317:1: ( '{' )
            // InternalJsonSchemaDsl.g:7318:2: '{'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7327:1: rule__PropertiesSchemaDefinition__Group__4 : rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5 ;
    public final void rule__PropertiesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7331:1: ( rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:7332:2: rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalJsonSchemaDsl.g:7339:1: rule__PropertiesSchemaDefinition__Group__4__Impl : ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__PropertiesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7343:1: ( ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:7344:1: ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:7344:1: ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:7345:2: ( rule__PropertiesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:7346:2: ( rule__PropertiesSchemaDefinition__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING||(LA22_0>=14 && LA22_0<=55)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7346:3: rule__PropertiesSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:7354:1: rule__PropertiesSchemaDefinition__Group__5 : rule__PropertiesSchemaDefinition__Group__5__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7358:1: ( rule__PropertiesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:7359:2: rule__PropertiesSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:7365:1: rule__PropertiesSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7369:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:7370:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:7370:1: ( '}' )
            // InternalJsonSchemaDsl.g:7371:2: '}'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7381:1: rule__PropertiesSchemaDefinition__Group_4__0 : rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1 ;
    public final void rule__PropertiesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7385:1: ( rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:7386:2: rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:7393:1: rule__PropertiesSchemaDefinition__Group_4__0__Impl : ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7397:1: ( ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:7398:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:7398:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:7399:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:7400:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:7400:3: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0
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
    // InternalJsonSchemaDsl.g:7408:1: rule__PropertiesSchemaDefinition__Group_4__1 : rule__PropertiesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7412:1: ( rule__PropertiesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:7413:2: rule__PropertiesSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:7419:1: rule__PropertiesSchemaDefinition__Group_4__1__Impl : ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7423:1: ( ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7424:1: ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7424:1: ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:7425:2: ( rule__PropertiesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:7426:2: ( rule__PropertiesSchemaDefinition__Group_4_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==65) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7426:3: rule__PropertiesSchemaDefinition__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__PropertiesSchemaDefinition__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalJsonSchemaDsl.g:7435:1: rule__PropertiesSchemaDefinition__Group_4_1__0 : rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1 ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7439:1: ( rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:7440:2: rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:7447:1: rule__PropertiesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7451:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7452:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7452:1: ( ',' )
            // InternalJsonSchemaDsl.g:7453:2: ','
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7462:1: rule__PropertiesSchemaDefinition__Group_4_1__1 : rule__PropertiesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7466:1: ( rule__PropertiesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:7467:2: rule__PropertiesSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:7473:1: rule__PropertiesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7477:1: ( ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7478:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7478:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:7479:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:7480:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:7480:3: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:7489:1: rule__PropertyNamesSchemaDefinition__Group__0 : rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1 ;
    public final void rule__PropertyNamesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7493:1: ( rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7494:2: rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7501:1: rule__PropertyNamesSchemaDefinition__Group__0__Impl : ( '\"propertyNames\"' ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7505:1: ( ( '\"propertyNames\"' ) )
            // InternalJsonSchemaDsl.g:7506:1: ( '\"propertyNames\"' )
            {
            // InternalJsonSchemaDsl.g:7506:1: ( '\"propertyNames\"' )
            // InternalJsonSchemaDsl.g:7507:2: '\"propertyNames\"'
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7516:1: rule__PropertyNamesSchemaDefinition__Group__1 : rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2 ;
    public final void rule__PropertyNamesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7520:1: ( rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7521:2: rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7528:1: rule__PropertyNamesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7532:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7533:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7533:1: ( ':' )
            // InternalJsonSchemaDsl.g:7534:2: ':'
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7543:1: rule__PropertyNamesSchemaDefinition__Group__2 : rule__PropertyNamesSchemaDefinition__Group__2__Impl ;
    public final void rule__PropertyNamesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7547:1: ( rule__PropertyNamesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7548:2: rule__PropertyNamesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7554:1: rule__PropertyNamesSchemaDefinition__Group__2__Impl : ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7558:1: ( ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7559:1: ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7559:1: ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7560:2: ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 )
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesAssignment_2()); 
            // InternalJsonSchemaDsl.g:7561:2: ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 )
            // InternalJsonSchemaDsl.g:7561:3: rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2
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
    // InternalJsonSchemaDsl.g:7570:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
    public final void rule__NullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7574:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
            // InternalJsonSchemaDsl.g:7575:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalJsonSchemaDsl.g:7582:1: rule__NullValue__Group__0__Impl : ( () ) ;
    public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7586:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7587:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7587:1: ( () )
            // InternalJsonSchemaDsl.g:7588:2: ()
            {
             before(grammarAccess.getNullValueAccess().getNullValueAction_0()); 
            // InternalJsonSchemaDsl.g:7589:2: ()
            // InternalJsonSchemaDsl.g:7589:3: 
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
    // InternalJsonSchemaDsl.g:7597:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
    public final void rule__NullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7601:1: ( rule__NullValue__Group__1__Impl )
            // InternalJsonSchemaDsl.g:7602:2: rule__NullValue__Group__1__Impl
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
    // InternalJsonSchemaDsl.g:7608:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7612:1: ( ( 'null' ) )
            // InternalJsonSchemaDsl.g:7613:1: ( 'null' )
            {
            // InternalJsonSchemaDsl.g:7613:1: ( 'null' )
            // InternalJsonSchemaDsl.g:7614:2: 'null'
            {
             before(grammarAccess.getNullValueAccess().getNullKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7624:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7628:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalJsonSchemaDsl.g:7629:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalJsonSchemaDsl.g:7636:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7640:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7641:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7641:1: ( () )
            // InternalJsonSchemaDsl.g:7642:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalJsonSchemaDsl.g:7643:2: ()
            // InternalJsonSchemaDsl.g:7643:3: 
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
    // InternalJsonSchemaDsl.g:7651:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7655:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalJsonSchemaDsl.g:7656:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalJsonSchemaDsl.g:7663:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7667:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:7668:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:7668:1: ( '{' )
            // InternalJsonSchemaDsl.g:7669:2: '{'
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7678:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7682:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalJsonSchemaDsl.g:7683:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalJsonSchemaDsl.g:7690:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7694:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:7695:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:7695:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:7696:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7697:2: ( rule__ObjectValue__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7697:3: rule__ObjectValue__Group_2__0
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
    // InternalJsonSchemaDsl.g:7705:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7709:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7710:2: rule__ObjectValue__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:7716:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7720:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:7721:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:7721:1: ( '}' )
            // InternalJsonSchemaDsl.g:7722:2: '}'
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7732:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7736:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalJsonSchemaDsl.g:7737:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalJsonSchemaDsl.g:7744:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7748:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:7749:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:7749:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:7750:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:7751:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalJsonSchemaDsl.g:7751:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalJsonSchemaDsl.g:7759:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7763:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:7764:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:7770:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7774:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7775:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7775:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:7776:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:7777:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==65) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7777:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalJsonSchemaDsl.g:7786:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7790:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:7791:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalJsonSchemaDsl.g:7798:1: rule__ObjectValue__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7802:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7803:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7803:1: ( ',' )
            // InternalJsonSchemaDsl.g:7804:2: ','
            {
             before(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7813:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7817:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:7818:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:7824:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7828:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7829:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7829:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:7830:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:7831:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:7831:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:7840:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7844:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalJsonSchemaDsl.g:7845:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:7852:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7856:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7857:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7857:1: ( () )
            // InternalJsonSchemaDsl.g:7858:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalJsonSchemaDsl.g:7859:2: ()
            // InternalJsonSchemaDsl.g:7859:3: 
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
    // InternalJsonSchemaDsl.g:7867:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7871:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalJsonSchemaDsl.g:7872:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalJsonSchemaDsl.g:7879:1: rule__ArrayValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7883:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:7884:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:7884:1: ( '[' )
            // InternalJsonSchemaDsl.g:7885:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7894:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7898:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalJsonSchemaDsl.g:7899:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalJsonSchemaDsl.g:7906:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7910:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:7911:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:7911:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:7912:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7913:2: ( rule__ArrayValue__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_JSON_NUMBER && LA26_0<=RULE_INT)||(LA26_0>=12 && LA26_0<=55)||LA26_0==63||LA26_0==67||(LA26_0>=71 && LA26_0<=72)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7913:3: rule__ArrayValue__Group_2__0
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
    // InternalJsonSchemaDsl.g:7921:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7925:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7926:2: rule__ArrayValue__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:7932:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7936:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:7937:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:7937:1: ( ']' )
            // InternalJsonSchemaDsl.g:7938:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7948:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7952:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalJsonSchemaDsl.g:7953:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalJsonSchemaDsl.g:7960:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7964:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:7965:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:7965:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:7966:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:7967:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalJsonSchemaDsl.g:7967:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalJsonSchemaDsl.g:7975:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7979:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:7980:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:7986:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7990:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7991:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7991:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:7992:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:7993:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==65) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7993:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalJsonSchemaDsl.g:8002:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8006:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:8007:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJsonSchemaDsl.g:8014:1: rule__ArrayValue__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8018:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8019:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8019:1: ( ',' )
            // InternalJsonSchemaDsl.g:8020:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8029:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8033:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:8034:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:8040:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8044:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:8045:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:8045:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:8046:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:8047:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:8047:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:8056:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8060:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJsonSchemaDsl.g:8061:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJsonSchemaDsl.g:8068:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8072:1: ( ( ( '-' )? ) )
            // InternalJsonSchemaDsl.g:8073:1: ( ( '-' )? )
            {
            // InternalJsonSchemaDsl.g:8073:1: ( ( '-' )? )
            // InternalJsonSchemaDsl.g:8074:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJsonSchemaDsl.g:8075:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==72) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8075:3: '-'
                    {
                    match(input,72,FOLLOW_2); 

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
    // InternalJsonSchemaDsl.g:8083:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8087:1: ( rule__EInt__Group__1__Impl )
            // InternalJsonSchemaDsl.g:8088:2: rule__EInt__Group__1__Impl
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
    // InternalJsonSchemaDsl.g:8094:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8098:1: ( ( RULE_INT ) )
            // InternalJsonSchemaDsl.g:8099:1: ( RULE_INT )
            {
            // InternalJsonSchemaDsl.g:8099:1: ( RULE_INT )
            // InternalJsonSchemaDsl.g:8100:2: RULE_INT
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
    // InternalJsonSchemaDsl.g:8110:1: rule__SchemaArray__Group__0 : rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1 ;
    public final void rule__SchemaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8114:1: ( rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1 )
            // InternalJsonSchemaDsl.g:8115:2: rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1
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
    // InternalJsonSchemaDsl.g:8122:1: rule__SchemaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__SchemaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8126:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8127:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8127:1: ( '[' )
            // InternalJsonSchemaDsl.g:8128:2: '['
            {
             before(grammarAccess.getSchemaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8137:1: rule__SchemaArray__Group__1 : rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2 ;
    public final void rule__SchemaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8141:1: ( rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2 )
            // InternalJsonSchemaDsl.g:8142:2: rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalJsonSchemaDsl.g:8149:1: rule__SchemaArray__Group__1__Impl : ( ( rule__SchemaArray__ItemsAssignment_1 ) ) ;
    public final void rule__SchemaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8153:1: ( ( ( rule__SchemaArray__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:8154:1: ( ( rule__SchemaArray__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:8154:1: ( ( rule__SchemaArray__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:8155:2: ( rule__SchemaArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:8156:2: ( rule__SchemaArray__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:8156:3: rule__SchemaArray__ItemsAssignment_1
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
    // InternalJsonSchemaDsl.g:8164:1: rule__SchemaArray__Group__2 : rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3 ;
    public final void rule__SchemaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8168:1: ( rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3 )
            // InternalJsonSchemaDsl.g:8169:2: rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalJsonSchemaDsl.g:8176:1: rule__SchemaArray__Group__2__Impl : ( ( rule__SchemaArray__Group_2__0 )* ) ;
    public final void rule__SchemaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8180:1: ( ( ( rule__SchemaArray__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:8181:1: ( ( rule__SchemaArray__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:8181:1: ( ( rule__SchemaArray__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:8182:2: ( rule__SchemaArray__Group_2__0 )*
            {
             before(grammarAccess.getSchemaArrayAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8183:2: ( rule__SchemaArray__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==65) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8183:3: rule__SchemaArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SchemaArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalJsonSchemaDsl.g:8191:1: rule__SchemaArray__Group__3 : rule__SchemaArray__Group__3__Impl ;
    public final void rule__SchemaArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8195:1: ( rule__SchemaArray__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8196:2: rule__SchemaArray__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:8202:1: rule__SchemaArray__Group__3__Impl : ( ']' ) ;
    public final void rule__SchemaArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8206:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8207:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8207:1: ( ']' )
            // InternalJsonSchemaDsl.g:8208:2: ']'
            {
             before(grammarAccess.getSchemaArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8218:1: rule__SchemaArray__Group_2__0 : rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1 ;
    public final void rule__SchemaArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8222:1: ( rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1 )
            // InternalJsonSchemaDsl.g:8223:2: rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1
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
    // InternalJsonSchemaDsl.g:8230:1: rule__SchemaArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SchemaArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8234:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8235:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8235:1: ( ',' )
            // InternalJsonSchemaDsl.g:8236:2: ','
            {
             before(grammarAccess.getSchemaArrayAccess().getCommaKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8245:1: rule__SchemaArray__Group_2__1 : rule__SchemaArray__Group_2__1__Impl ;
    public final void rule__SchemaArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8249:1: ( rule__SchemaArray__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8250:2: rule__SchemaArray__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8256:1: rule__SchemaArray__Group_2__1__Impl : ( ( rule__SchemaArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__SchemaArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8260:1: ( ( ( rule__SchemaArray__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:8261:1: ( ( rule__SchemaArray__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:8261:1: ( ( rule__SchemaArray__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:8262:2: ( rule__SchemaArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:8263:2: ( rule__SchemaArray__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:8263:3: rule__SchemaArray__ItemsAssignment_2_1
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
    // InternalJsonSchemaDsl.g:8272:1: rule__KeySchemaPair__Group__0 : rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1 ;
    public final void rule__KeySchemaPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8276:1: ( rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1 )
            // InternalJsonSchemaDsl.g:8277:2: rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1
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
    // InternalJsonSchemaDsl.g:8284:1: rule__KeySchemaPair__Group__0__Impl : ( ( rule__KeySchemaPair__KeyAssignment_0 ) ) ;
    public final void rule__KeySchemaPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8288:1: ( ( ( rule__KeySchemaPair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:8289:1: ( ( rule__KeySchemaPair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:8289:1: ( ( rule__KeySchemaPair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:8290:2: ( rule__KeySchemaPair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:8291:2: ( rule__KeySchemaPair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:8291:3: rule__KeySchemaPair__KeyAssignment_0
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
    // InternalJsonSchemaDsl.g:8299:1: rule__KeySchemaPair__Group__1 : rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2 ;
    public final void rule__KeySchemaPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8303:1: ( rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2 )
            // InternalJsonSchemaDsl.g:8304:2: rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2
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
    // InternalJsonSchemaDsl.g:8311:1: rule__KeySchemaPair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeySchemaPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8315:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:8316:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:8316:1: ( ':' )
            // InternalJsonSchemaDsl.g:8317:2: ':'
            {
             before(grammarAccess.getKeySchemaPairAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8326:1: rule__KeySchemaPair__Group__2 : rule__KeySchemaPair__Group__2__Impl ;
    public final void rule__KeySchemaPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8330:1: ( rule__KeySchemaPair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8331:2: rule__KeySchemaPair__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:8337:1: rule__KeySchemaPair__Group__2__Impl : ( ( rule__KeySchemaPair__ValueAssignment_2 ) ) ;
    public final void rule__KeySchemaPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8341:1: ( ( ( rule__KeySchemaPair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:8342:1: ( ( rule__KeySchemaPair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:8342:1: ( ( rule__KeySchemaPair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:8343:2: ( rule__KeySchemaPair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:8344:2: ( rule__KeySchemaPair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:8344:3: rule__KeySchemaPair__ValueAssignment_2
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
    // InternalJsonSchemaDsl.g:8353:1: rule__TypesAnyOf2__Group__0 : rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1 ;
    public final void rule__TypesAnyOf2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8357:1: ( rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1 )
            // InternalJsonSchemaDsl.g:8358:2: rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalJsonSchemaDsl.g:8365:1: rule__TypesAnyOf2__Group__0__Impl : ( '[' ) ;
    public final void rule__TypesAnyOf2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8369:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8370:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8370:1: ( '[' )
            // InternalJsonSchemaDsl.g:8371:2: '['
            {
             before(grammarAccess.getTypesAnyOf2Access().getLeftSquareBracketKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8380:1: rule__TypesAnyOf2__Group__1 : rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2 ;
    public final void rule__TypesAnyOf2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8384:1: ( rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2 )
            // InternalJsonSchemaDsl.g:8385:2: rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalJsonSchemaDsl.g:8392:1: rule__TypesAnyOf2__Group__1__Impl : ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) ) ;
    public final void rule__TypesAnyOf2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8396:1: ( ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:8397:1: ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:8397:1: ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:8398:2: ( rule__TypesAnyOf2__ItemsAssignment_1 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:8399:2: ( rule__TypesAnyOf2__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:8399:3: rule__TypesAnyOf2__ItemsAssignment_1
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
    // InternalJsonSchemaDsl.g:8407:1: rule__TypesAnyOf2__Group__2 : rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3 ;
    public final void rule__TypesAnyOf2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8411:1: ( rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3 )
            // InternalJsonSchemaDsl.g:8412:2: rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalJsonSchemaDsl.g:8419:1: rule__TypesAnyOf2__Group__2__Impl : ( ( rule__TypesAnyOf2__Group_2__0 )* ) ;
    public final void rule__TypesAnyOf2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8423:1: ( ( ( rule__TypesAnyOf2__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:8424:1: ( ( rule__TypesAnyOf2__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:8424:1: ( ( rule__TypesAnyOf2__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:8425:2: ( rule__TypesAnyOf2__Group_2__0 )*
            {
             before(grammarAccess.getTypesAnyOf2Access().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8426:2: ( rule__TypesAnyOf2__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==65) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8426:3: rule__TypesAnyOf2__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TypesAnyOf2__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalJsonSchemaDsl.g:8434:1: rule__TypesAnyOf2__Group__3 : rule__TypesAnyOf2__Group__3__Impl ;
    public final void rule__TypesAnyOf2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8438:1: ( rule__TypesAnyOf2__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8439:2: rule__TypesAnyOf2__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:8445:1: rule__TypesAnyOf2__Group__3__Impl : ( ']' ) ;
    public final void rule__TypesAnyOf2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8449:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8450:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8450:1: ( ']' )
            // InternalJsonSchemaDsl.g:8451:2: ']'
            {
             before(grammarAccess.getTypesAnyOf2Access().getRightSquareBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8461:1: rule__TypesAnyOf2__Group_2__0 : rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1 ;
    public final void rule__TypesAnyOf2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8465:1: ( rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1 )
            // InternalJsonSchemaDsl.g:8466:2: rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalJsonSchemaDsl.g:8473:1: rule__TypesAnyOf2__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypesAnyOf2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8477:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8478:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8478:1: ( ',' )
            // InternalJsonSchemaDsl.g:8479:2: ','
            {
             before(grammarAccess.getTypesAnyOf2Access().getCommaKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8488:1: rule__TypesAnyOf2__Group_2__1 : rule__TypesAnyOf2__Group_2__1__Impl ;
    public final void rule__TypesAnyOf2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8492:1: ( rule__TypesAnyOf2__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8493:2: rule__TypesAnyOf2__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8499:1: rule__TypesAnyOf2__Group_2__1__Impl : ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) ) ;
    public final void rule__TypesAnyOf2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8503:1: ( ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:8504:1: ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:8504:1: ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:8505:2: ( rule__TypesAnyOf2__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:8506:2: ( rule__TypesAnyOf2__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:8506:3: rule__TypesAnyOf2__ItemsAssignment_2_1
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
    // InternalJsonSchemaDsl.g:8515:1: rule__DependenciesAnyOf__Group__0 : rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1 ;
    public final void rule__DependenciesAnyOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8519:1: ( rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1 )
            // InternalJsonSchemaDsl.g:8520:2: rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:8527:1: rule__DependenciesAnyOf__Group__0__Impl : ( () ) ;
    public final void rule__DependenciesAnyOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8531:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:8532:1: ( () )
            {
            // InternalJsonSchemaDsl.g:8532:1: ( () )
            // InternalJsonSchemaDsl.g:8533:2: ()
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOfAction_0()); 
            // InternalJsonSchemaDsl.g:8534:2: ()
            // InternalJsonSchemaDsl.g:8534:3: 
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
    // InternalJsonSchemaDsl.g:8542:1: rule__DependenciesAnyOf__Group__1 : rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2 ;
    public final void rule__DependenciesAnyOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8546:1: ( rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2 )
            // InternalJsonSchemaDsl.g:8547:2: rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:8554:1: rule__DependenciesAnyOf__Group__1__Impl : ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? ) ;
    public final void rule__DependenciesAnyOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8558:1: ( ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? ) )
            // InternalJsonSchemaDsl.g:8559:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? )
            {
            // InternalJsonSchemaDsl.g:8559:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? )
            // InternalJsonSchemaDsl.g:8560:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2Assignment_1()); 
            // InternalJsonSchemaDsl.g:8561:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8561:3: rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1
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
    // InternalJsonSchemaDsl.g:8569:1: rule__DependenciesAnyOf__Group__2 : rule__DependenciesAnyOf__Group__2__Impl ;
    public final void rule__DependenciesAnyOf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8573:1: ( rule__DependenciesAnyOf__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8574:2: rule__DependenciesAnyOf__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:8580:1: rule__DependenciesAnyOf__Group__2__Impl : ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? ) ;
    public final void rule__DependenciesAnyOf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8584:1: ( ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? ) )
            // InternalJsonSchemaDsl.g:8585:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? )
            {
            // InternalJsonSchemaDsl.g:8585:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? )
            // InternalJsonSchemaDsl.g:8586:2: ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )?
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1Assignment_2()); 
            // InternalJsonSchemaDsl.g:8587:2: ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING||(LA32_0>=14 && LA32_0<=55)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8587:3: rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2
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
    // InternalJsonSchemaDsl.g:8596:1: rule__KeyStringArrayPair__Group__0 : rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1 ;
    public final void rule__KeyStringArrayPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8600:1: ( rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1 )
            // InternalJsonSchemaDsl.g:8601:2: rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1
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
    // InternalJsonSchemaDsl.g:8608:1: rule__KeyStringArrayPair__Group__0__Impl : ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) ) ;
    public final void rule__KeyStringArrayPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8612:1: ( ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:8613:1: ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:8613:1: ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:8614:2: ( rule__KeyStringArrayPair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:8615:2: ( rule__KeyStringArrayPair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:8615:3: rule__KeyStringArrayPair__KeyAssignment_0
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
    // InternalJsonSchemaDsl.g:8623:1: rule__KeyStringArrayPair__Group__1 : rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2 ;
    public final void rule__KeyStringArrayPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8627:1: ( rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2 )
            // InternalJsonSchemaDsl.g:8628:2: rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:8635:1: rule__KeyStringArrayPair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyStringArrayPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8639:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:8640:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:8640:1: ( ':' )
            // InternalJsonSchemaDsl.g:8641:2: ':'
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getColonKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8650:1: rule__KeyStringArrayPair__Group__2 : rule__KeyStringArrayPair__Group__2__Impl ;
    public final void rule__KeyStringArrayPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8654:1: ( rule__KeyStringArrayPair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8655:2: rule__KeyStringArrayPair__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:8661:1: rule__KeyStringArrayPair__Group__2__Impl : ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringArrayPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8665:1: ( ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:8666:1: ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:8666:1: ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:8667:2: ( rule__KeyStringArrayPair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:8668:2: ( rule__KeyStringArrayPair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:8668:3: rule__KeyStringArrayPair__ValueAssignment_2
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
    // InternalJsonSchemaDsl.g:8677:1: rule__StringArray__Group__0 : rule__StringArray__Group__0__Impl rule__StringArray__Group__1 ;
    public final void rule__StringArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8681:1: ( rule__StringArray__Group__0__Impl rule__StringArray__Group__1 )
            // InternalJsonSchemaDsl.g:8682:2: rule__StringArray__Group__0__Impl rule__StringArray__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalJsonSchemaDsl.g:8689:1: rule__StringArray__Group__0__Impl : ( () ) ;
    public final void rule__StringArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8693:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:8694:1: ( () )
            {
            // InternalJsonSchemaDsl.g:8694:1: ( () )
            // InternalJsonSchemaDsl.g:8695:2: ()
            {
             before(grammarAccess.getStringArrayAccess().getStringArrayAction_0()); 
            // InternalJsonSchemaDsl.g:8696:2: ()
            // InternalJsonSchemaDsl.g:8696:3: 
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
    // InternalJsonSchemaDsl.g:8704:1: rule__StringArray__Group__1 : rule__StringArray__Group__1__Impl rule__StringArray__Group__2 ;
    public final void rule__StringArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8708:1: ( rule__StringArray__Group__1__Impl rule__StringArray__Group__2 )
            // InternalJsonSchemaDsl.g:8709:2: rule__StringArray__Group__1__Impl rule__StringArray__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalJsonSchemaDsl.g:8716:1: rule__StringArray__Group__1__Impl : ( '[' ) ;
    public final void rule__StringArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8720:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8721:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8721:1: ( '[' )
            // InternalJsonSchemaDsl.g:8722:2: '['
            {
             before(grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8731:1: rule__StringArray__Group__2 : rule__StringArray__Group__2__Impl rule__StringArray__Group__3 ;
    public final void rule__StringArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8735:1: ( rule__StringArray__Group__2__Impl rule__StringArray__Group__3 )
            // InternalJsonSchemaDsl.g:8736:2: rule__StringArray__Group__2__Impl rule__StringArray__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalJsonSchemaDsl.g:8743:1: rule__StringArray__Group__2__Impl : ( ( rule__StringArray__Group_2__0 )? ) ;
    public final void rule__StringArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8747:1: ( ( ( rule__StringArray__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:8748:1: ( ( rule__StringArray__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:8748:1: ( ( rule__StringArray__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:8749:2: ( rule__StringArray__Group_2__0 )?
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8750:2: ( rule__StringArray__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING||(LA33_0>=14 && LA33_0<=55)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8750:3: rule__StringArray__Group_2__0
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
    // InternalJsonSchemaDsl.g:8758:1: rule__StringArray__Group__3 : rule__StringArray__Group__3__Impl ;
    public final void rule__StringArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8762:1: ( rule__StringArray__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8763:2: rule__StringArray__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:8769:1: rule__StringArray__Group__3__Impl : ( ']' ) ;
    public final void rule__StringArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8773:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8774:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8774:1: ( ']' )
            // InternalJsonSchemaDsl.g:8775:2: ']'
            {
             before(grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8785:1: rule__StringArray__Group_2__0 : rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 ;
    public final void rule__StringArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8789:1: ( rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 )
            // InternalJsonSchemaDsl.g:8790:2: rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1
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
    // InternalJsonSchemaDsl.g:8797:1: rule__StringArray__Group_2__0__Impl : ( ( rule__StringArray__ValuesAssignment_2_0 ) ) ;
    public final void rule__StringArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8801:1: ( ( ( rule__StringArray__ValuesAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:8802:1: ( ( rule__StringArray__ValuesAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:8802:1: ( ( rule__StringArray__ValuesAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:8803:2: ( rule__StringArray__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getStringArrayAccess().getValuesAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:8804:2: ( rule__StringArray__ValuesAssignment_2_0 )
            // InternalJsonSchemaDsl.g:8804:3: rule__StringArray__ValuesAssignment_2_0
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
    // InternalJsonSchemaDsl.g:8812:1: rule__StringArray__Group_2__1 : rule__StringArray__Group_2__1__Impl ;
    public final void rule__StringArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8816:1: ( rule__StringArray__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8817:2: rule__StringArray__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8823:1: rule__StringArray__Group_2__1__Impl : ( ( rule__StringArray__Group_2_1__0 )* ) ;
    public final void rule__StringArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8827:1: ( ( ( rule__StringArray__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:8828:1: ( ( rule__StringArray__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:8828:1: ( ( rule__StringArray__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:8829:2: ( rule__StringArray__Group_2_1__0 )*
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:8830:2: ( rule__StringArray__Group_2_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==65) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8830:3: rule__StringArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StringArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalJsonSchemaDsl.g:8839:1: rule__StringArray__Group_2_1__0 : rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1 ;
    public final void rule__StringArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8843:1: ( rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:8844:2: rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalJsonSchemaDsl.g:8851:1: rule__StringArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StringArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8855:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8856:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8856:1: ( ',' )
            // InternalJsonSchemaDsl.g:8857:2: ','
            {
             before(grammarAccess.getStringArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8866:1: rule__StringArray__Group_2_1__1 : rule__StringArray__Group_2_1__1__Impl ;
    public final void rule__StringArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8870:1: ( rule__StringArray__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:8871:2: rule__StringArray__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:8877:1: rule__StringArray__Group_2_1__1__Impl : ( ( rule__StringArray__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__StringArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8881:1: ( ( ( rule__StringArray__ValuesAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:8882:1: ( ( rule__StringArray__ValuesAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:8882:1: ( ( rule__StringArray__ValuesAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:8883:2: ( rule__StringArray__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getStringArrayAccess().getValuesAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:8884:2: ( rule__StringArray__ValuesAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:8884:3: rule__StringArray__ValuesAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:8893:1: rule__JsonSchema__SchemaAssignment_1 : ( ruleSchema ) ;
    public final void rule__JsonSchema__SchemaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8897:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:8898:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:8898:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:8899:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:8908:1: rule__ObjectSchema__KeywordDefinitionAssignment_2_0 : ( ruleKeywordDefinition ) ;
    public final void rule__ObjectSchema__KeywordDefinitionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8912:1: ( ( ruleKeywordDefinition ) )
            // InternalJsonSchemaDsl.g:8913:2: ( ruleKeywordDefinition )
            {
            // InternalJsonSchemaDsl.g:8913:2: ( ruleKeywordDefinition )
            // InternalJsonSchemaDsl.g:8914:3: ruleKeywordDefinition
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
    // InternalJsonSchemaDsl.g:8923:1: rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 : ( ruleKeywordDefinition ) ;
    public final void rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8927:1: ( ( ruleKeywordDefinition ) )
            // InternalJsonSchemaDsl.g:8928:2: ( ruleKeywordDefinition )
            {
            // InternalJsonSchemaDsl.g:8928:2: ( ruleKeywordDefinition )
            // InternalJsonSchemaDsl.g:8929:3: ruleKeywordDefinition
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
    // InternalJsonSchemaDsl.g:8938:1: rule__BooleanSchema__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanSchema__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8942:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8943:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8943:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8944:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:8953:1: rule__MaximumSchemaDefinition__MaximumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MaximumSchemaDefinition__MaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8957:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:8958:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:8958:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:8959:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:8968:1: rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8972:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8973:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8973:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8974:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:8983:1: rule__CommentSchemaDefinition__CommentAssignment_2 : ( ruleEString ) ;
    public final void rule__CommentSchemaDefinition__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8987:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:8988:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:8988:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:8989:3: ruleEString
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
    // InternalJsonSchemaDsl.g:8998:1: rule__EnumSchemaDefinition__ItemsAssignment_1 : ( ruleJsonDocument ) ;
    public final void rule__EnumSchemaDefinition__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9002:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9003:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9003:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9004:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9013:1: rule__EnumSchemaDefinition__ItemsAssignment_2_1 : ( ruleJsonDocument ) ;
    public final void rule__EnumSchemaDefinition__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9017:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9018:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9018:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9019:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9028:1: rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9032:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9033:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9033:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9034:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9043:1: rule__AnyOfSchemaDefinition__AnyOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__AnyOfSchemaDefinition__AnyOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9047:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9048:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9048:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9049:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9058:1: rule__TitleSchemaDefinition__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__TitleSchemaDefinition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9062:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9063:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9063:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9064:3: ruleEString
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


    // $ANTLR start "rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3"
    // InternalJsonSchemaDsl.g:9073:1: rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 : ( ruleSchema ) ;
    public final void rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9077:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9078:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9078:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9079:3: ruleSchema
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1SchemaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1SchemaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3"


    // $ANTLR start "rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4"
    // InternalJsonSchemaDsl.g:9088:1: rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 : ( ruleSchemaArray ) ;
    public final void rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9092:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9093:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9093:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9094:3: ruleSchemaArray
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2SchemaArrayParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaArray();

            state._fsp--;

             after(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2SchemaArrayParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4"


    // $ANTLR start "rule__DefaultSchemaDefinition__DefaultAssignment_2"
    // InternalJsonSchemaDsl.g:9103:1: rule__DefaultSchemaDefinition__DefaultAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__DefaultSchemaDefinition__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9107:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9108:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9108:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9109:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9118:1: rule__ThenSchemaDefinition__ThenAssignment_2 : ( ruleSchema ) ;
    public final void rule__ThenSchemaDefinition__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9122:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9123:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9123:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9124:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9133:1: rule__MinLengthSchemaDefinition__MinLengthAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinLengthSchemaDefinition__MinLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9137:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9138:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9138:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9139:3: ruleNonNegativeIntegerDefault0
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
    // InternalJsonSchemaDsl.g:9148:1: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9152:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9153:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9153:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9154:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9163:1: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9167:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9168:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9168:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9169:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9178:1: rule__MinItemsSchemaDefinition__MinItemsAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinItemsSchemaDefinition__MinItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9182:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9183:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9183:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9184:3: ruleNonNegativeIntegerDefault0
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
    // InternalJsonSchemaDsl.g:9193:1: rule__OneOfSchemaDefinition__OneOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__OneOfSchemaDefinition__OneOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9197:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9198:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9198:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9199:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9208:1: rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9212:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9213:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9213:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9214:3: ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:9223:1: rule__MinimumSchemaDefinition__MinimumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MinimumSchemaDefinition__MinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9227:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9228:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9228:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9229:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9238:1: rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9242:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9243:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9243:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9244:3: ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:9253:1: rule__FormatSchemaDefinition__FormatAssignment_2 : ( ruleEString ) ;
    public final void rule__FormatSchemaDefinition__FormatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9257:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9258:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9258:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9259:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9268:1: rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9272:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9273:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9273:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9274:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9283:1: rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 : ( ruleSimpleTypes ) ;
    public final void rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9287:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:9288:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:9288:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:9289:3: ruleSimpleTypes
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
    // InternalJsonSchemaDsl.g:9298:1: rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 : ( ruleTypesAnyOf2 ) ;
    public final void rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9302:1: ( ( ruleTypesAnyOf2 ) )
            // InternalJsonSchemaDsl.g:9303:2: ( ruleTypesAnyOf2 )
            {
            // InternalJsonSchemaDsl.g:9303:2: ( ruleTypesAnyOf2 )
            // InternalJsonSchemaDsl.g:9304:3: ruleTypesAnyOf2
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
    // InternalJsonSchemaDsl.g:9313:1: rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 : ( ruleSchema ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9317:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9318:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9318:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9319:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9328:1: rule__ElseSchemaDefinition__ElseAssignment_2 : ( ruleSchema ) ;
    public final void rule__ElseSchemaDefinition__ElseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9332:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9333:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9333:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9334:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9343:1: rule__IdSchemaDefinition__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__IdSchemaDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9347:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9348:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9348:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9349:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9358:1: rule__ConstSchemaDefinition__ConstAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__ConstSchemaDefinition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9362:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9363:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9363:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9364:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9373:1: rule__RequiredSchemaDefinition__RequiredAssignment_2 : ( ruleStringArray ) ;
    public final void rule__RequiredSchemaDefinition__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9377:1: ( ( ruleStringArray ) )
            // InternalJsonSchemaDsl.g:9378:2: ( ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:9378:2: ( ruleStringArray )
            // InternalJsonSchemaDsl.g:9379:3: ruleStringArray
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
    // InternalJsonSchemaDsl.g:9388:1: rule__DescriptionSchemaDefinition__DescriptionAssignment_2 : ( ruleEString ) ;
    public final void rule__DescriptionSchemaDefinition__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9392:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9393:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9393:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9394:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9403:1: rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9407:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9408:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9408:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9409:3: ruleNonNegativeIntegerDefault0
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
    // InternalJsonSchemaDsl.g:9418:1: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9422:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9423:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9423:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9424:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9433:1: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9437:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9438:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9438:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9439:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9448:1: rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 : ( ruleSchema ) ;
    public final void rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9452:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9453:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9453:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9454:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9463:1: rule__KeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9467:1: ( ( RULE_STRING ) )
            // InternalJsonSchemaDsl.g:9468:2: ( RULE_STRING )
            {
            // InternalJsonSchemaDsl.g:9468:2: ( RULE_STRING )
            // InternalJsonSchemaDsl.g:9469:3: RULE_STRING
            {
             before(grammarAccess.getKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalJsonSchemaDsl.g:9478:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9482:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9483:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9483:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9484:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9493:1: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 : ( ruleJsonDocument ) ;
    public final void rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9497:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9498:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9498:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9499:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9508:1: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 : ( ruleJsonDocument ) ;
    public final void rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9512:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9513:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9513:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9514:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9523:1: rule__IfSchemaDefinition__IfAssignment_2 : ( ruleSchema ) ;
    public final void rule__IfSchemaDefinition__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9527:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9528:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9528:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9529:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9538:1: rule__AllOfSchemaDefinition__AllOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__AllOfSchemaDefinition__AllOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9542:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9543:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9543:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9544:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9553:1: rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9557:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9558:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9558:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9559:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9568:1: rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9572:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9573:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9573:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9574:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9583:1: rule__PatternSchemaDefinition__PatternAssignment_2 : ( ruleEString ) ;
    public final void rule__PatternSchemaDefinition__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9587:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9588:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9588:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9589:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9598:1: rule__ContainsSchemaDefinition__ContainsAssignment_2 : ( ruleSchema ) ;
    public final void rule__ContainsSchemaDefinition__ContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9602:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9603:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9603:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9604:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9613:1: rule__NotSchemaDefinition__NotAssignment_2 : ( ruleSchema ) ;
    public final void rule__NotSchemaDefinition__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9617:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9618:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9618:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9619:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9628:1: rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9632:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9633:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9633:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9634:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9643:1: rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9647:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9648:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9648:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9649:3: ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:9658:1: rule__RefSchemaDefinition__RefAssignment_2 : ( ruleEString ) ;
    public final void rule__RefSchemaDefinition__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9662:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9663:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9663:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9664:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9673:1: rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9677:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9678:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9678:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9679:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9688:1: rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9692:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9693:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9693:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9694:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9703:1: rule__SchemaSchemaDefinition__SchemaAssignment_2 : ( ruleEString ) ;
    public final void rule__SchemaSchemaDefinition__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9707:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9708:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9708:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9709:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9718:1: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9722:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9723:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9723:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9724:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9733:1: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9737:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9738:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9738:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9739:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9748:1: rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 : ( ruleSchema ) ;
    public final void rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9752:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9753:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9753:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9754:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9763:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9767:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9768:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9768:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9769:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9778:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9782:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9783:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9783:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9784:3: ruleEInt
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
    // InternalJsonSchemaDsl.g:9793:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9797:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9798:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9798:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9799:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9808:1: rule__StringValue__ValueAssignment : ( ruleVALID_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9812:1: ( ( ruleVALID_STRING ) )
            // InternalJsonSchemaDsl.g:9813:2: ( ruleVALID_STRING )
            {
            // InternalJsonSchemaDsl.g:9813:2: ( ruleVALID_STRING )
            // InternalJsonSchemaDsl.g:9814:3: ruleVALID_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueVALID_STRINGParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getValueVALID_STRINGParserRuleCall_0()); 

            }


            }

        }
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
    // InternalJsonSchemaDsl.g:9823:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9827:1: ( ( ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:9828:2: ( ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:9828:2: ( ruleKeyValuePair )
            // InternalJsonSchemaDsl.g:9829:3: ruleKeyValuePair
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
    // InternalJsonSchemaDsl.g:9838:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9842:1: ( ( ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:9843:2: ( ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:9843:2: ( ruleKeyValuePair )
            // InternalJsonSchemaDsl.g:9844:3: ruleKeyValuePair
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
    // InternalJsonSchemaDsl.g:9853:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9857:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9858:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9858:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9859:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9868:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9872:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9873:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9873:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9874:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9883:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9887:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9888:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9888:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9889:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9898:1: rule__SchemaArray__ItemsAssignment_1 : ( ruleSchema ) ;
    public final void rule__SchemaArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9902:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9903:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9903:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9904:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9913:1: rule__SchemaArray__ItemsAssignment_2_1 : ( ruleSchema ) ;
    public final void rule__SchemaArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9917:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9918:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9918:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9919:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9928:1: rule__NonNegativeIntegerDefault0__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NonNegativeIntegerDefault0__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9932:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9933:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9933:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9934:3: ruleEInt
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
    // InternalJsonSchemaDsl.g:9943:1: rule__KeySchemaPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeySchemaPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9947:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9948:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9948:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9949:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9958:1: rule__KeySchemaPair__ValueAssignment_2 : ( ruleSchema ) ;
    public final void rule__KeySchemaPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9962:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9963:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9963:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9964:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9973:1: rule__NonNegativeInteger__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NonNegativeInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9977:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9978:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9978:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9979:3: ruleEInt
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
    // InternalJsonSchemaDsl.g:9988:1: rule__TypesAnyOf2__ItemsAssignment_1 : ( ruleSimpleTypes ) ;
    public final void rule__TypesAnyOf2__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9992:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:9993:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:9993:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:9994:3: ruleSimpleTypes
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
    // InternalJsonSchemaDsl.g:10003:1: rule__TypesAnyOf2__ItemsAssignment_2_1 : ( ruleSimpleTypes ) ;
    public final void rule__TypesAnyOf2__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10007:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:10008:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:10008:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:10009:3: ruleSimpleTypes
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
    // InternalJsonSchemaDsl.g:10018:1: rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 : ( ruleKeyStringArrayPair ) ;
    public final void rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10022:1: ( ( ruleKeyStringArrayPair ) )
            // InternalJsonSchemaDsl.g:10023:2: ( ruleKeyStringArrayPair )
            {
            // InternalJsonSchemaDsl.g:10023:2: ( ruleKeyStringArrayPair )
            // InternalJsonSchemaDsl.g:10024:3: ruleKeyStringArrayPair
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
    // InternalJsonSchemaDsl.g:10033:1: rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 : ( ruleKeySchemaPair ) ;
    public final void rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10037:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:10038:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:10038:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:10039:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:10048:1: rule__KeyStringArrayPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyStringArrayPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10052:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:10053:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:10053:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:10054:3: ruleEString
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
    // InternalJsonSchemaDsl.g:10063:1: rule__KeyStringArrayPair__ValueAssignment_2 : ( ruleStringArray ) ;
    public final void rule__KeyStringArrayPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10067:1: ( ( ruleStringArray ) )
            // InternalJsonSchemaDsl.g:10068:2: ( ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:10068:2: ( ruleStringArray )
            // InternalJsonSchemaDsl.g:10069:3: ruleStringArray
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
    // InternalJsonSchemaDsl.g:10078:1: rule__StringArray__ValuesAssignment_2_0 : ( ruleEString ) ;
    public final void rule__StringArray__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10082:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:10083:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:10083:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:10084:3: ruleEString
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
    // InternalJsonSchemaDsl.g:10093:1: rule__StringArray__ValuesAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__StringArray__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10097:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:10098:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:10098:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:10099:3: ruleEString
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


    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\1\54\56\uffff";
    static final String dfa_3s = "\1\5\53\102\1\uffff\1\14\1\uffff";
    static final String dfa_4s = "\1\67\53\102\1\uffff\1\103\1\uffff";
    static final String dfa_5s = "\54\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "",
            "\2\54\61\uffff\1\54\3\uffff\1\56",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "8561:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00FFFFFFFFFFC020L,0x0000000000000069L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00FFFFFFFFFFC020L,0x0000000000000068L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00FFFFFFFFFFC020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x80FFFFFFFFFFF070L,0x0000000000000188L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x8000000000003000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00FFFFFFFFFFC020L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x7F00000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x80FFFFFFFFFFF070L,0x0000000000000198L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00FFFFFFFFFFC020L,0x0000000000000010L});

}