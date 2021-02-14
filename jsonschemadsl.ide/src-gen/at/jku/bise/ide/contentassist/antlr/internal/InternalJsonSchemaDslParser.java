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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_JSON_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'\"$id\"'", "'\"$schema\"'", "'\"$ref\"'", "'\"$comment\"'", "'\"title\"'", "'\"description\"'", "'\"default\"'", "'\"readOnly\"'", "'\"writeOnly\"'", "'\"examples\"'", "'\"multipleOf\"'", "'\"maximum\"'", "'\"exclusiveMaximum\"'", "'\"minimum\"'", "'\"exclusiveMinimum\"'", "'\"maxLength\"'", "'\"minLength\"'", "'\"pattern\"'", "'\"additionalItems\"'", "'\"items\"'", "'\"maxItems\"'", "'\"minItems\"'", "'\"uniqueItems\"'", "'\"contains\"'", "'\"maxProperties\"'", "'\"minProperties\"'", "'\"required\"'", "'\"additionalProperties\"'", "'\"definitions\"'", "'\"properties\"'", "'\"patternProperties\"'", "'\"dependencies\"'", "'\"propertyNames\"'", "'\"const\"'", "'\"enum\"'", "'\"type\"'", "'\"format\"'", "'\"contentMediaType\"'", "'\"contentEncoding\"'", "'\"if\"'", "'\"then\"'", "'\"else\"'", "'\"allOf\"'", "'\"anyOf\"'", "'\"oneOf\"'", "'\"not\"'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"string\"'", "'{'", "'}'", "','", "':'", "'['", "']'", "'null'", "'-'"
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

            if ( (LA1_0==67) ) {
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
            case 27:
                {
                alt2=14;
                }
                break;
            case 28:
                {
                alt2=15;
                }
                break;
            case 29:
                {
                alt2=16;
                }
                break;
            case 30:
                {
                alt2=17;
                }
                break;
            case 31:
                {
                alt2=18;
                }
                break;
            case 32:
                {
                alt2=19;
                }
                break;
            case 33:
                {
                alt2=20;
                }
                break;
            case 34:
                {
                alt2=21;
                }
                break;
            case 35:
                {
                alt2=22;
                }
                break;
            case 36:
                {
                alt2=23;
                }
                break;
            case 37:
                {
                alt2=24;
                }
                break;
            case 38:
                {
                alt2=25;
                }
                break;
            case 39:
                {
                alt2=26;
                }
                break;
            case 40:
                {
                alt2=27;
                }
                break;
            case 41:
                {
                alt2=28;
                }
                break;
            case 42:
                {
                alt2=29;
                }
                break;
            case 43:
                {
                alt2=30;
                }
                break;
            case 44:
                {
                alt2=31;
                }
                break;
            case 46:
                {
                alt2=32;
                }
                break;
            case 47:
                {
                alt2=33;
                }
                break;
            case 71:
                {
                alt2=34;
                }
                break;
            case 49:
                {
                alt2=35;
                }
                break;
            case 50:
                {
                alt2=36;
                }
                break;
            case 51:
                {
                alt2=37;
                }
                break;
            case 52:
                {
                alt2=38;
                }
                break;
            case 53:
                {
                alt2=39;
                }
                break;
            case 54:
                {
                alt2=40;
                }
                break;
            case 55:
                {
                alt2=41;
                }
                break;
            case 56:
                {
                alt2=42;
                }
                break;
            case 57:
                {
                alt2=43;
                }
                break;
            case 58:
                {
                alt2=44;
                }
                break;
            case 59:
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
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt3=4;
                }
                break;
            case 67:
                {
                alt3=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt3=6;
                }
                break;
            case 71:
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
            else if ( ((LA5_0>=14 && LA5_0<=59)) ) {
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
    // InternalJsonSchemaDsl.g:2317:1: rule__KEYWORD__Alternatives : ( ( '\"$id\"' ) | ( '\"$schema\"' ) | ( '\"$ref\"' ) | ( '\"$comment\"' ) | ( '\"title\"' ) | ( '\"description\"' ) | ( '\"default\"' ) | ( '\"readOnly\"' ) | ( '\"writeOnly\"' ) | ( '\"examples\"' ) | ( '\"multipleOf\"' ) | ( '\"maximum\"' ) | ( '\"exclusiveMaximum\"' ) | ( '\"minimum\"' ) | ( '\"exclusiveMinimum\"' ) | ( '\"maxLength\"' ) | ( '\"minLength\"' ) | ( '\"pattern\"' ) | ( '\"additionalItems\"' ) | ( '\"items\"' ) | ( '\"maxItems\"' ) | ( '\"minItems\"' ) | ( '\"uniqueItems\"' ) | ( '\"contains\"' ) | ( '\"maxProperties\"' ) | ( '\"minProperties\"' ) | ( '\"required\"' ) | ( '\"additionalProperties\"' ) | ( '\"definitions\"' ) | ( '\"properties\"' ) | ( '\"patternProperties\"' ) | ( '\"dependencies\"' ) | ( '\"propertyNames\"' ) | ( '\"const\"' ) | ( '\"enum\"' ) | ( '\"type\"' ) | ( '\"format\"' ) | ( '\"contentMediaType\"' ) | ( '\"contentEncoding\"' ) | ( '\"if\"' ) | ( '\"then\"' ) | ( '\"else\"' ) | ( '\"allOf\"' ) | ( '\"anyOf\"' ) | ( '\"oneOf\"' ) | ( '\"not\"' ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2321:1: ( ( '\"$id\"' ) | ( '\"$schema\"' ) | ( '\"$ref\"' ) | ( '\"$comment\"' ) | ( '\"title\"' ) | ( '\"description\"' ) | ( '\"default\"' ) | ( '\"readOnly\"' ) | ( '\"writeOnly\"' ) | ( '\"examples\"' ) | ( '\"multipleOf\"' ) | ( '\"maximum\"' ) | ( '\"exclusiveMaximum\"' ) | ( '\"minimum\"' ) | ( '\"exclusiveMinimum\"' ) | ( '\"maxLength\"' ) | ( '\"minLength\"' ) | ( '\"pattern\"' ) | ( '\"additionalItems\"' ) | ( '\"items\"' ) | ( '\"maxItems\"' ) | ( '\"minItems\"' ) | ( '\"uniqueItems\"' ) | ( '\"contains\"' ) | ( '\"maxProperties\"' ) | ( '\"minProperties\"' ) | ( '\"required\"' ) | ( '\"additionalProperties\"' ) | ( '\"definitions\"' ) | ( '\"properties\"' ) | ( '\"patternProperties\"' ) | ( '\"dependencies\"' ) | ( '\"propertyNames\"' ) | ( '\"const\"' ) | ( '\"enum\"' ) | ( '\"type\"' ) | ( '\"format\"' ) | ( '\"contentMediaType\"' ) | ( '\"contentEncoding\"' ) | ( '\"if\"' ) | ( '\"then\"' ) | ( '\"else\"' ) | ( '\"allOf\"' ) | ( '\"anyOf\"' ) | ( '\"oneOf\"' ) | ( '\"not\"' ) )
            int alt6=46;
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
            case 56:
                {
                alt6=43;
                }
                break;
            case 57:
                {
                alt6=44;
                }
                break;
            case 58:
                {
                alt6=45;
                }
                break;
            case 59:
                {
                alt6=46;
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
                    // InternalJsonSchemaDsl.g:2400:2: ( '\"minimum\"' )
                    {
                    // InternalJsonSchemaDsl.g:2400:2: ( '\"minimum\"' )
                    // InternalJsonSchemaDsl.g:2401:3: '\"minimum\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinimumKeyword_13()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinimumKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJsonSchemaDsl.g:2406:2: ( '\"exclusiveMinimum\"' )
                    {
                    // InternalJsonSchemaDsl.g:2406:2: ( '\"exclusiveMinimum\"' )
                    // InternalJsonSchemaDsl.g:2407:3: '\"exclusiveMinimum\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getExclusiveMinimumKeyword_14()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExclusiveMinimumKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJsonSchemaDsl.g:2412:2: ( '\"maxLength\"' )
                    {
                    // InternalJsonSchemaDsl.g:2412:2: ( '\"maxLength\"' )
                    // InternalJsonSchemaDsl.g:2413:3: '\"maxLength\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_15()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJsonSchemaDsl.g:2418:2: ( '\"minLength\"' )
                    {
                    // InternalJsonSchemaDsl.g:2418:2: ( '\"minLength\"' )
                    // InternalJsonSchemaDsl.g:2419:3: '\"minLength\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinLengthKeyword_16()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinLengthKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalJsonSchemaDsl.g:2424:2: ( '\"pattern\"' )
                    {
                    // InternalJsonSchemaDsl.g:2424:2: ( '\"pattern\"' )
                    // InternalJsonSchemaDsl.g:2425:3: '\"pattern\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPatternKeyword_17()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPatternKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalJsonSchemaDsl.g:2430:2: ( '\"additionalItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2430:2: ( '\"additionalItems\"' )
                    // InternalJsonSchemaDsl.g:2431:3: '\"additionalItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAdditionalItemsKeyword_18()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAdditionalItemsKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalJsonSchemaDsl.g:2436:2: ( '\"items\"' )
                    {
                    // InternalJsonSchemaDsl.g:2436:2: ( '\"items\"' )
                    // InternalJsonSchemaDsl.g:2437:3: '\"items\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getItemsKeyword_19()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getItemsKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalJsonSchemaDsl.g:2442:2: ( '\"maxItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2442:2: ( '\"maxItems\"' )
                    // InternalJsonSchemaDsl.g:2443:3: '\"maxItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxItemsKeyword_20()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxItemsKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalJsonSchemaDsl.g:2448:2: ( '\"minItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2448:2: ( '\"minItems\"' )
                    // InternalJsonSchemaDsl.g:2449:3: '\"minItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinItemsKeyword_21()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinItemsKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalJsonSchemaDsl.g:2454:2: ( '\"uniqueItems\"' )
                    {
                    // InternalJsonSchemaDsl.g:2454:2: ( '\"uniqueItems\"' )
                    // InternalJsonSchemaDsl.g:2455:3: '\"uniqueItems\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getUniqueItemsKeyword_22()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getUniqueItemsKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalJsonSchemaDsl.g:2460:2: ( '\"contains\"' )
                    {
                    // InternalJsonSchemaDsl.g:2460:2: ( '\"contains\"' )
                    // InternalJsonSchemaDsl.g:2461:3: '\"contains\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getContainsKeyword_23()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContainsKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalJsonSchemaDsl.g:2466:2: ( '\"maxProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2466:2: ( '\"maxProperties\"' )
                    // InternalJsonSchemaDsl.g:2467:3: '\"maxProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxPropertiesKeyword_24()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxPropertiesKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalJsonSchemaDsl.g:2472:2: ( '\"minProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2472:2: ( '\"minProperties\"' )
                    // InternalJsonSchemaDsl.g:2473:3: '\"minProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinPropertiesKeyword_25()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinPropertiesKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalJsonSchemaDsl.g:2478:2: ( '\"required\"' )
                    {
                    // InternalJsonSchemaDsl.g:2478:2: ( '\"required\"' )
                    // InternalJsonSchemaDsl.g:2479:3: '\"required\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getRequiredKeyword_26()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRequiredKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalJsonSchemaDsl.g:2484:2: ( '\"additionalProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2484:2: ( '\"additionalProperties\"' )
                    // InternalJsonSchemaDsl.g:2485:3: '\"additionalProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAdditionalPropertiesKeyword_27()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAdditionalPropertiesKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalJsonSchemaDsl.g:2490:2: ( '\"definitions\"' )
                    {
                    // InternalJsonSchemaDsl.g:2490:2: ( '\"definitions\"' )
                    // InternalJsonSchemaDsl.g:2491:3: '\"definitions\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDefinitionsKeyword_28()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDefinitionsKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalJsonSchemaDsl.g:2496:2: ( '\"properties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2496:2: ( '\"properties\"' )
                    // InternalJsonSchemaDsl.g:2497:3: '\"properties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPropertiesKeyword_29()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPropertiesKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalJsonSchemaDsl.g:2502:2: ( '\"patternProperties\"' )
                    {
                    // InternalJsonSchemaDsl.g:2502:2: ( '\"patternProperties\"' )
                    // InternalJsonSchemaDsl.g:2503:3: '\"patternProperties\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPatternPropertiesKeyword_30()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPatternPropertiesKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalJsonSchemaDsl.g:2508:2: ( '\"dependencies\"' )
                    {
                    // InternalJsonSchemaDsl.g:2508:2: ( '\"dependencies\"' )
                    // InternalJsonSchemaDsl.g:2509:3: '\"dependencies\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDependenciesKeyword_31()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDependenciesKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalJsonSchemaDsl.g:2514:2: ( '\"propertyNames\"' )
                    {
                    // InternalJsonSchemaDsl.g:2514:2: ( '\"propertyNames\"' )
                    // InternalJsonSchemaDsl.g:2515:3: '\"propertyNames\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPropertyNamesKeyword_32()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPropertyNamesKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalJsonSchemaDsl.g:2520:2: ( '\"const\"' )
                    {
                    // InternalJsonSchemaDsl.g:2520:2: ( '\"const\"' )
                    // InternalJsonSchemaDsl.g:2521:3: '\"const\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getConstKeyword_33()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getConstKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalJsonSchemaDsl.g:2526:2: ( '\"enum\"' )
                    {
                    // InternalJsonSchemaDsl.g:2526:2: ( '\"enum\"' )
                    // InternalJsonSchemaDsl.g:2527:3: '\"enum\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getEnumKeyword_34()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getEnumKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalJsonSchemaDsl.g:2532:2: ( '\"type\"' )
                    {
                    // InternalJsonSchemaDsl.g:2532:2: ( '\"type\"' )
                    // InternalJsonSchemaDsl.g:2533:3: '\"type\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_35()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalJsonSchemaDsl.g:2538:2: ( '\"format\"' )
                    {
                    // InternalJsonSchemaDsl.g:2538:2: ( '\"format\"' )
                    // InternalJsonSchemaDsl.g:2539:3: '\"format\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getFormatKeyword_36()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFormatKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalJsonSchemaDsl.g:2544:2: ( '\"contentMediaType\"' )
                    {
                    // InternalJsonSchemaDsl.g:2544:2: ( '\"contentMediaType\"' )
                    // InternalJsonSchemaDsl.g:2545:3: '\"contentMediaType\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getContentMediaTypeKeyword_37()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContentMediaTypeKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalJsonSchemaDsl.g:2550:2: ( '\"contentEncoding\"' )
                    {
                    // InternalJsonSchemaDsl.g:2550:2: ( '\"contentEncoding\"' )
                    // InternalJsonSchemaDsl.g:2551:3: '\"contentEncoding\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getContentEncodingKeyword_38()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContentEncodingKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalJsonSchemaDsl.g:2556:2: ( '\"if\"' )
                    {
                    // InternalJsonSchemaDsl.g:2556:2: ( '\"if\"' )
                    // InternalJsonSchemaDsl.g:2557:3: '\"if\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getIfKeyword_39()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIfKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalJsonSchemaDsl.g:2562:2: ( '\"then\"' )
                    {
                    // InternalJsonSchemaDsl.g:2562:2: ( '\"then\"' )
                    // InternalJsonSchemaDsl.g:2563:3: '\"then\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getThenKeyword_40()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getThenKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalJsonSchemaDsl.g:2568:2: ( '\"else\"' )
                    {
                    // InternalJsonSchemaDsl.g:2568:2: ( '\"else\"' )
                    // InternalJsonSchemaDsl.g:2569:3: '\"else\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getElseKeyword_41()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getElseKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalJsonSchemaDsl.g:2574:2: ( '\"allOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2574:2: ( '\"allOf\"' )
                    // InternalJsonSchemaDsl.g:2575:3: '\"allOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAllOfKeyword_42()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAllOfKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalJsonSchemaDsl.g:2580:2: ( '\"anyOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2580:2: ( '\"anyOf\"' )
                    // InternalJsonSchemaDsl.g:2581:3: '\"anyOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAnyOfKeyword_43()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAnyOfKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalJsonSchemaDsl.g:2586:2: ( '\"oneOf\"' )
                    {
                    // InternalJsonSchemaDsl.g:2586:2: ( '\"oneOf\"' )
                    // InternalJsonSchemaDsl.g:2587:3: '\"oneOf\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getOneOfKeyword_44()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getOneOfKeyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // InternalJsonSchemaDsl.g:2592:2: ( '\"not\"' )
                    {
                    // InternalJsonSchemaDsl.g:2592:2: ( '\"not\"' )
                    // InternalJsonSchemaDsl.g:2593:3: '\"not\"'
                    {
                     before(grammarAccess.getKEYWORDAccess().getNotKeyword_45()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNotKeyword_45()); 

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
    // InternalJsonSchemaDsl.g:2602:1: rule__SimpleTypes__Alternatives : ( ( ( '\"array\"' ) ) | ( ( '\"boolean\"' ) ) | ( ( '\"integer\"' ) ) | ( ( '\"null\"' ) ) | ( ( '\"number\"' ) ) | ( ( '\"object\"' ) ) | ( ( '\"string\"' ) ) );
    public final void rule__SimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2606:1: ( ( ( '\"array\"' ) ) | ( ( '\"boolean\"' ) ) | ( ( '\"integer\"' ) ) | ( ( '\"null\"' ) ) | ( ( '\"number\"' ) ) | ( ( '\"object\"' ) ) | ( ( '\"string\"' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt7=1;
                }
                break;
            case 61:
                {
                alt7=2;
                }
                break;
            case 62:
                {
                alt7=3;
                }
                break;
            case 63:
                {
                alt7=4;
                }
                break;
            case 64:
                {
                alt7=5;
                }
                break;
            case 65:
                {
                alt7=6;
                }
                break;
            case 66:
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
                    // InternalJsonSchemaDsl.g:2607:2: ( ( '\"array\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2607:2: ( ( '\"array\"' ) )
                    // InternalJsonSchemaDsl.g:2608:3: ( '\"array\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0()); 
                    // InternalJsonSchemaDsl.g:2609:3: ( '\"array\"' )
                    // InternalJsonSchemaDsl.g:2609:4: '\"array\"'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getArrayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonSchemaDsl.g:2613:2: ( ( '\"boolean\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2613:2: ( ( '\"boolean\"' ) )
                    // InternalJsonSchemaDsl.g:2614:3: ( '\"boolean\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // InternalJsonSchemaDsl.g:2615:3: ( '\"boolean\"' )
                    // InternalJsonSchemaDsl.g:2615:4: '\"boolean\"'
                    {
                    match(input,61,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonSchemaDsl.g:2619:2: ( ( '\"integer\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2619:2: ( ( '\"integer\"' ) )
                    // InternalJsonSchemaDsl.g:2620:3: ( '\"integer\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // InternalJsonSchemaDsl.g:2621:3: ( '\"integer\"' )
                    // InternalJsonSchemaDsl.g:2621:4: '\"integer\"'
                    {
                    match(input,62,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonSchemaDsl.g:2625:2: ( ( '\"null\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2625:2: ( ( '\"null\"' ) )
                    // InternalJsonSchemaDsl.g:2626:3: ( '\"null\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3()); 
                    // InternalJsonSchemaDsl.g:2627:3: ( '\"null\"' )
                    // InternalJsonSchemaDsl.g:2627:4: '\"null\"'
                    {
                    match(input,63,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getNullEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonSchemaDsl.g:2631:2: ( ( '\"number\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2631:2: ( ( '\"number\"' ) )
                    // InternalJsonSchemaDsl.g:2632:3: ( '\"number\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4()); 
                    // InternalJsonSchemaDsl.g:2633:3: ( '\"number\"' )
                    // InternalJsonSchemaDsl.g:2633:4: '\"number\"'
                    {
                    match(input,64,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getNumberEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonSchemaDsl.g:2637:2: ( ( '\"object\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2637:2: ( ( '\"object\"' ) )
                    // InternalJsonSchemaDsl.g:2638:3: ( '\"object\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // InternalJsonSchemaDsl.g:2639:3: ( '\"object\"' )
                    // InternalJsonSchemaDsl.g:2639:4: '\"object\"'
                    {
                    match(input,65,FOLLOW_2); 

                    }

                     after(grammarAccess.getSimpleTypesAccess().getObjectEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonSchemaDsl.g:2643:2: ( ( '\"string\"' ) )
                    {
                    // InternalJsonSchemaDsl.g:2643:2: ( ( '\"string\"' ) )
                    // InternalJsonSchemaDsl.g:2644:3: ( '\"string\"' )
                    {
                     before(grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_6()); 
                    // InternalJsonSchemaDsl.g:2645:3: ( '\"string\"' )
                    // InternalJsonSchemaDsl.g:2645:4: '\"string\"'
                    {
                    match(input,66,FOLLOW_2); 

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
    // InternalJsonSchemaDsl.g:2653:1: rule__JsonSchema__Group__0 : rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1 ;
    public final void rule__JsonSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2657:1: ( rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1 )
            // InternalJsonSchemaDsl.g:2658:2: rule__JsonSchema__Group__0__Impl rule__JsonSchema__Group__1
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
    // InternalJsonSchemaDsl.g:2665:1: rule__JsonSchema__Group__0__Impl : ( () ) ;
    public final void rule__JsonSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2669:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:2670:1: ( () )
            {
            // InternalJsonSchemaDsl.g:2670:1: ( () )
            // InternalJsonSchemaDsl.g:2671:2: ()
            {
             before(grammarAccess.getJsonSchemaAccess().getJsonSchemaAction_0()); 
            // InternalJsonSchemaDsl.g:2672:2: ()
            // InternalJsonSchemaDsl.g:2672:3: 
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
    // InternalJsonSchemaDsl.g:2680:1: rule__JsonSchema__Group__1 : rule__JsonSchema__Group__1__Impl ;
    public final void rule__JsonSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2684:1: ( rule__JsonSchema__Group__1__Impl )
            // InternalJsonSchemaDsl.g:2685:2: rule__JsonSchema__Group__1__Impl
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
    // InternalJsonSchemaDsl.g:2691:1: rule__JsonSchema__Group__1__Impl : ( ( rule__JsonSchema__SchemaAssignment_1 )? ) ;
    public final void rule__JsonSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2695:1: ( ( ( rule__JsonSchema__SchemaAssignment_1 )? ) )
            // InternalJsonSchemaDsl.g:2696:1: ( ( rule__JsonSchema__SchemaAssignment_1 )? )
            {
            // InternalJsonSchemaDsl.g:2696:1: ( ( rule__JsonSchema__SchemaAssignment_1 )? )
            // InternalJsonSchemaDsl.g:2697:2: ( rule__JsonSchema__SchemaAssignment_1 )?
            {
             before(grammarAccess.getJsonSchemaAccess().getSchemaAssignment_1()); 
            // InternalJsonSchemaDsl.g:2698:2: ( rule__JsonSchema__SchemaAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=13)||LA8_0==67) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2698:3: rule__JsonSchema__SchemaAssignment_1
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
    // InternalJsonSchemaDsl.g:2707:1: rule__ObjectSchema__Group__0 : rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1 ;
    public final void rule__ObjectSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2711:1: ( rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1 )
            // InternalJsonSchemaDsl.g:2712:2: rule__ObjectSchema__Group__0__Impl rule__ObjectSchema__Group__1
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
    // InternalJsonSchemaDsl.g:2719:1: rule__ObjectSchema__Group__0__Impl : ( () ) ;
    public final void rule__ObjectSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2723:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:2724:1: ( () )
            {
            // InternalJsonSchemaDsl.g:2724:1: ( () )
            // InternalJsonSchemaDsl.g:2725:2: ()
            {
             before(grammarAccess.getObjectSchemaAccess().getObjectSchemaAction_0()); 
            // InternalJsonSchemaDsl.g:2726:2: ()
            // InternalJsonSchemaDsl.g:2726:3: 
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
    // InternalJsonSchemaDsl.g:2734:1: rule__ObjectSchema__Group__1 : rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2 ;
    public final void rule__ObjectSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2738:1: ( rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2 )
            // InternalJsonSchemaDsl.g:2739:2: rule__ObjectSchema__Group__1__Impl rule__ObjectSchema__Group__2
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
    // InternalJsonSchemaDsl.g:2746:1: rule__ObjectSchema__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2750:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:2751:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:2751:1: ( '{' )
            // InternalJsonSchemaDsl.g:2752:2: '{'
            {
             before(grammarAccess.getObjectSchemaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2761:1: rule__ObjectSchema__Group__2 : rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3 ;
    public final void rule__ObjectSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2765:1: ( rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3 )
            // InternalJsonSchemaDsl.g:2766:2: rule__ObjectSchema__Group__2__Impl rule__ObjectSchema__Group__3
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
    // InternalJsonSchemaDsl.g:2773:1: rule__ObjectSchema__Group__2__Impl : ( ( rule__ObjectSchema__Group_2__0 )? ) ;
    public final void rule__ObjectSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2777:1: ( ( ( rule__ObjectSchema__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:2778:1: ( ( rule__ObjectSchema__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:2778:1: ( ( rule__ObjectSchema__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:2779:2: ( rule__ObjectSchema__Group_2__0 )?
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:2780:2: ( rule__ObjectSchema__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||(LA9_0>=14 && LA9_0<=44)||(LA9_0>=46 && LA9_0<=47)||(LA9_0>=49 && LA9_0<=59)||LA9_0==71) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonSchemaDsl.g:2780:3: rule__ObjectSchema__Group_2__0
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
    // InternalJsonSchemaDsl.g:2788:1: rule__ObjectSchema__Group__3 : rule__ObjectSchema__Group__3__Impl ;
    public final void rule__ObjectSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2792:1: ( rule__ObjectSchema__Group__3__Impl )
            // InternalJsonSchemaDsl.g:2793:2: rule__ObjectSchema__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:2799:1: rule__ObjectSchema__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2803:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:2804:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:2804:1: ( '}' )
            // InternalJsonSchemaDsl.g:2805:2: '}'
            {
             before(grammarAccess.getObjectSchemaAccess().getRightCurlyBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2815:1: rule__ObjectSchema__Group_2__0 : rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1 ;
    public final void rule__ObjectSchema__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2819:1: ( rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1 )
            // InternalJsonSchemaDsl.g:2820:2: rule__ObjectSchema__Group_2__0__Impl rule__ObjectSchema__Group_2__1
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
    // InternalJsonSchemaDsl.g:2827:1: rule__ObjectSchema__Group_2__0__Impl : ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) ) ;
    public final void rule__ObjectSchema__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2831:1: ( ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:2832:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:2832:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:2833:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 )
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:2834:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_0 )
            // InternalJsonSchemaDsl.g:2834:3: rule__ObjectSchema__KeywordDefinitionAssignment_2_0
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
    // InternalJsonSchemaDsl.g:2842:1: rule__ObjectSchema__Group_2__1 : rule__ObjectSchema__Group_2__1__Impl ;
    public final void rule__ObjectSchema__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2846:1: ( rule__ObjectSchema__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:2847:2: rule__ObjectSchema__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:2853:1: rule__ObjectSchema__Group_2__1__Impl : ( ( rule__ObjectSchema__Group_2_1__0 )* ) ;
    public final void rule__ObjectSchema__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2857:1: ( ( ( rule__ObjectSchema__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:2858:1: ( ( rule__ObjectSchema__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:2858:1: ( ( rule__ObjectSchema__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:2859:2: ( rule__ObjectSchema__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectSchemaAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:2860:2: ( rule__ObjectSchema__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==69) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:2860:3: rule__ObjectSchema__Group_2_1__0
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
    // InternalJsonSchemaDsl.g:2869:1: rule__ObjectSchema__Group_2_1__0 : rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1 ;
    public final void rule__ObjectSchema__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2873:1: ( rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:2874:2: rule__ObjectSchema__Group_2_1__0__Impl rule__ObjectSchema__Group_2_1__1
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
    // InternalJsonSchemaDsl.g:2881:1: rule__ObjectSchema__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectSchema__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2885:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:2886:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:2886:1: ( ',' )
            // InternalJsonSchemaDsl.g:2887:2: ','
            {
             before(grammarAccess.getObjectSchemaAccess().getCommaKeyword_2_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2896:1: rule__ObjectSchema__Group_2_1__1 : rule__ObjectSchema__Group_2_1__1__Impl ;
    public final void rule__ObjectSchema__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2900:1: ( rule__ObjectSchema__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:2901:2: rule__ObjectSchema__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:2907:1: rule__ObjectSchema__Group_2_1__1__Impl : ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) ) ;
    public final void rule__ObjectSchema__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2911:1: ( ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:2912:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:2912:1: ( ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:2913:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectSchemaAccess().getKeywordDefinitionAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:2914:2: ( rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:2914:3: rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:2923:1: rule__MaximumSchemaDefinition__Group__0 : rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1 ;
    public final void rule__MaximumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2927:1: ( rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:2928:2: rule__MaximumSchemaDefinition__Group__0__Impl rule__MaximumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:2935:1: rule__MaximumSchemaDefinition__Group__0__Impl : ( '\"maximum\"' ) ;
    public final void rule__MaximumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2939:1: ( ( '\"maximum\"' ) )
            // InternalJsonSchemaDsl.g:2940:1: ( '\"maximum\"' )
            {
            // InternalJsonSchemaDsl.g:2940:1: ( '\"maximum\"' )
            // InternalJsonSchemaDsl.g:2941:2: '\"maximum\"'
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
    // InternalJsonSchemaDsl.g:2950:1: rule__MaximumSchemaDefinition__Group__1 : rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2 ;
    public final void rule__MaximumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2954:1: ( rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:2955:2: rule__MaximumSchemaDefinition__Group__1__Impl rule__MaximumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:2962:1: rule__MaximumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaximumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2966:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:2967:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:2967:1: ( ':' )
            // InternalJsonSchemaDsl.g:2968:2: ':'
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:2977:1: rule__MaximumSchemaDefinition__Group__2 : rule__MaximumSchemaDefinition__Group__2__Impl ;
    public final void rule__MaximumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2981:1: ( rule__MaximumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:2982:2: rule__MaximumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:2988:1: rule__MaximumSchemaDefinition__Group__2__Impl : ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) ) ;
    public final void rule__MaximumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:2992:1: ( ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:2993:1: ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:2993:1: ( ( rule__MaximumSchemaDefinition__MaximumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:2994:2: ( rule__MaximumSchemaDefinition__MaximumAssignment_2 )
            {
             before(grammarAccess.getMaximumSchemaDefinitionAccess().getMaximumAssignment_2()); 
            // InternalJsonSchemaDsl.g:2995:2: ( rule__MaximumSchemaDefinition__MaximumAssignment_2 )
            // InternalJsonSchemaDsl.g:2995:3: rule__MaximumSchemaDefinition__MaximumAssignment_2
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
    // InternalJsonSchemaDsl.g:3004:1: rule__WriteOnlySchemaDefinition__Group__0 : rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1 ;
    public final void rule__WriteOnlySchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3008:1: ( rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3009:2: rule__WriteOnlySchemaDefinition__Group__0__Impl rule__WriteOnlySchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3016:1: rule__WriteOnlySchemaDefinition__Group__0__Impl : ( '\"writeOnly\"' ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3020:1: ( ( '\"writeOnly\"' ) )
            // InternalJsonSchemaDsl.g:3021:1: ( '\"writeOnly\"' )
            {
            // InternalJsonSchemaDsl.g:3021:1: ( '\"writeOnly\"' )
            // InternalJsonSchemaDsl.g:3022:2: '\"writeOnly\"'
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
    // InternalJsonSchemaDsl.g:3031:1: rule__WriteOnlySchemaDefinition__Group__1 : rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2 ;
    public final void rule__WriteOnlySchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3035:1: ( rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3036:2: rule__WriteOnlySchemaDefinition__Group__1__Impl rule__WriteOnlySchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3043:1: rule__WriteOnlySchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3047:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3048:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3048:1: ( ':' )
            // InternalJsonSchemaDsl.g:3049:2: ':'
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3058:1: rule__WriteOnlySchemaDefinition__Group__2 : rule__WriteOnlySchemaDefinition__Group__2__Impl ;
    public final void rule__WriteOnlySchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3062:1: ( rule__WriteOnlySchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3063:2: rule__WriteOnlySchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3069:1: rule__WriteOnlySchemaDefinition__Group__2__Impl : ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) ) ;
    public final void rule__WriteOnlySchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3073:1: ( ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3074:1: ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3074:1: ( ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3075:2: ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 )
            {
             before(grammarAccess.getWriteOnlySchemaDefinitionAccess().getWriteOnlyAssignment_2()); 
            // InternalJsonSchemaDsl.g:3076:2: ( rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 )
            // InternalJsonSchemaDsl.g:3076:3: rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2
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
    // InternalJsonSchemaDsl.g:3085:1: rule__CommentSchemaDefinition__Group__0 : rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1 ;
    public final void rule__CommentSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3089:1: ( rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3090:2: rule__CommentSchemaDefinition__Group__0__Impl rule__CommentSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3097:1: rule__CommentSchemaDefinition__Group__0__Impl : ( '\"$comment\"' ) ;
    public final void rule__CommentSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3101:1: ( ( '\"$comment\"' ) )
            // InternalJsonSchemaDsl.g:3102:1: ( '\"$comment\"' )
            {
            // InternalJsonSchemaDsl.g:3102:1: ( '\"$comment\"' )
            // InternalJsonSchemaDsl.g:3103:2: '\"$comment\"'
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
    // InternalJsonSchemaDsl.g:3112:1: rule__CommentSchemaDefinition__Group__1 : rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2 ;
    public final void rule__CommentSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3116:1: ( rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3117:2: rule__CommentSchemaDefinition__Group__1__Impl rule__CommentSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3124:1: rule__CommentSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__CommentSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3128:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3129:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3129:1: ( ':' )
            // InternalJsonSchemaDsl.g:3130:2: ':'
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3139:1: rule__CommentSchemaDefinition__Group__2 : rule__CommentSchemaDefinition__Group__2__Impl ;
    public final void rule__CommentSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3143:1: ( rule__CommentSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3144:2: rule__CommentSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3150:1: rule__CommentSchemaDefinition__Group__2__Impl : ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) ) ;
    public final void rule__CommentSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3154:1: ( ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3155:1: ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3155:1: ( ( rule__CommentSchemaDefinition__CommentAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3156:2: ( rule__CommentSchemaDefinition__CommentAssignment_2 )
            {
             before(grammarAccess.getCommentSchemaDefinitionAccess().getCommentAssignment_2()); 
            // InternalJsonSchemaDsl.g:3157:2: ( rule__CommentSchemaDefinition__CommentAssignment_2 )
            // InternalJsonSchemaDsl.g:3157:3: rule__CommentSchemaDefinition__CommentAssignment_2
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
    // InternalJsonSchemaDsl.g:3166:1: rule__EnumSchemaDefinition__Group__0 : rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1 ;
    public final void rule__EnumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3170:1: ( rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3171:2: rule__EnumSchemaDefinition__Group__0__Impl rule__EnumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3178:1: rule__EnumSchemaDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__EnumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3182:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:3183:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:3183:1: ( '[' )
            // InternalJsonSchemaDsl.g:3184:2: '['
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3193:1: rule__EnumSchemaDefinition__Group__1 : rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2 ;
    public final void rule__EnumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3197:1: ( rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3198:2: rule__EnumSchemaDefinition__Group__1__Impl rule__EnumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3205:1: rule__EnumSchemaDefinition__Group__1__Impl : ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) ) ;
    public final void rule__EnumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3209:1: ( ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:3210:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:3210:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:3211:2: ( rule__EnumSchemaDefinition__ItemsAssignment_1 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:3212:2: ( rule__EnumSchemaDefinition__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:3212:3: rule__EnumSchemaDefinition__ItemsAssignment_1
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
    // InternalJsonSchemaDsl.g:3220:1: rule__EnumSchemaDefinition__Group__2 : rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3 ;
    public final void rule__EnumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3224:1: ( rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3225:2: rule__EnumSchemaDefinition__Group__2__Impl rule__EnumSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:3232:1: rule__EnumSchemaDefinition__Group__2__Impl : ( ( rule__EnumSchemaDefinition__Group_2__0 )* ) ;
    public final void rule__EnumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3236:1: ( ( ( rule__EnumSchemaDefinition__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:3237:1: ( ( rule__EnumSchemaDefinition__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:3237:1: ( ( rule__EnumSchemaDefinition__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:3238:2: ( rule__EnumSchemaDefinition__Group_2__0 )*
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:3239:2: ( rule__EnumSchemaDefinition__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==69) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:3239:3: rule__EnumSchemaDefinition__Group_2__0
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
    // InternalJsonSchemaDsl.g:3247:1: rule__EnumSchemaDefinition__Group__3 : rule__EnumSchemaDefinition__Group__3__Impl ;
    public final void rule__EnumSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3251:1: ( rule__EnumSchemaDefinition__Group__3__Impl )
            // InternalJsonSchemaDsl.g:3252:2: rule__EnumSchemaDefinition__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:3258:1: rule__EnumSchemaDefinition__Group__3__Impl : ( ']' ) ;
    public final void rule__EnumSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3262:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:3263:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:3263:1: ( ']' )
            // InternalJsonSchemaDsl.g:3264:2: ']'
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getRightSquareBracketKeyword_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3274:1: rule__EnumSchemaDefinition__Group_2__0 : rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1 ;
    public final void rule__EnumSchemaDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3278:1: ( rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1 )
            // InternalJsonSchemaDsl.g:3279:2: rule__EnumSchemaDefinition__Group_2__0__Impl rule__EnumSchemaDefinition__Group_2__1
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
    // InternalJsonSchemaDsl.g:3286:1: rule__EnumSchemaDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumSchemaDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3290:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:3291:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:3291:1: ( ',' )
            // InternalJsonSchemaDsl.g:3292:2: ','
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3301:1: rule__EnumSchemaDefinition__Group_2__1 : rule__EnumSchemaDefinition__Group_2__1__Impl ;
    public final void rule__EnumSchemaDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3305:1: ( rule__EnumSchemaDefinition__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:3306:2: rule__EnumSchemaDefinition__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:3312:1: rule__EnumSchemaDefinition__Group_2__1__Impl : ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) ) ;
    public final void rule__EnumSchemaDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3316:1: ( ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:3317:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:3317:1: ( ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:3318:2: ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getEnumSchemaDefinitionAccess().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:3319:2: ( rule__EnumSchemaDefinition__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:3319:3: rule__EnumSchemaDefinition__ItemsAssignment_2_1
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
    // InternalJsonSchemaDsl.g:3328:1: rule__UniqueItemsSchemaDefinition__Group__0 : rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1 ;
    public final void rule__UniqueItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3332:1: ( rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3333:2: rule__UniqueItemsSchemaDefinition__Group__0__Impl rule__UniqueItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3340:1: rule__UniqueItemsSchemaDefinition__Group__0__Impl : ( '\"uniqueItems\"' ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3344:1: ( ( '\"uniqueItems\"' ) )
            // InternalJsonSchemaDsl.g:3345:1: ( '\"uniqueItems\"' )
            {
            // InternalJsonSchemaDsl.g:3345:1: ( '\"uniqueItems\"' )
            // InternalJsonSchemaDsl.g:3346:2: '\"uniqueItems\"'
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3355:1: rule__UniqueItemsSchemaDefinition__Group__1 : rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2 ;
    public final void rule__UniqueItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3359:1: ( rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3360:2: rule__UniqueItemsSchemaDefinition__Group__1__Impl rule__UniqueItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3367:1: rule__UniqueItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3371:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3372:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3372:1: ( ':' )
            // InternalJsonSchemaDsl.g:3373:2: ':'
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3382:1: rule__UniqueItemsSchemaDefinition__Group__2 : rule__UniqueItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__UniqueItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3386:1: ( rule__UniqueItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3387:2: rule__UniqueItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3393:1: rule__UniqueItemsSchemaDefinition__Group__2__Impl : ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) ) ;
    public final void rule__UniqueItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3397:1: ( ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3398:1: ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3398:1: ( ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3399:2: ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 )
            {
             before(grammarAccess.getUniqueItemsSchemaDefinitionAccess().getUniqueItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:3400:2: ( rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:3400:3: rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:3409:1: rule__AnyOfSchemaDefinition__Group__0 : rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1 ;
    public final void rule__AnyOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3413:1: ( rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3414:2: rule__AnyOfSchemaDefinition__Group__0__Impl rule__AnyOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3421:1: rule__AnyOfSchemaDefinition__Group__0__Impl : ( '\"anyOf\"' ) ;
    public final void rule__AnyOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3425:1: ( ( '\"anyOf\"' ) )
            // InternalJsonSchemaDsl.g:3426:1: ( '\"anyOf\"' )
            {
            // InternalJsonSchemaDsl.g:3426:1: ( '\"anyOf\"' )
            // InternalJsonSchemaDsl.g:3427:2: '\"anyOf\"'
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3436:1: rule__AnyOfSchemaDefinition__Group__1 : rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2 ;
    public final void rule__AnyOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3440:1: ( rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3441:2: rule__AnyOfSchemaDefinition__Group__1__Impl rule__AnyOfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3448:1: rule__AnyOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AnyOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3452:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3453:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3453:1: ( ':' )
            // InternalJsonSchemaDsl.g:3454:2: ':'
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3463:1: rule__AnyOfSchemaDefinition__Group__2 : rule__AnyOfSchemaDefinition__Group__2__Impl ;
    public final void rule__AnyOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3467:1: ( rule__AnyOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3468:2: rule__AnyOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3474:1: rule__AnyOfSchemaDefinition__Group__2__Impl : ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) ) ;
    public final void rule__AnyOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3478:1: ( ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3479:1: ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3479:1: ( ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3480:2: ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 )
            {
             before(grammarAccess.getAnyOfSchemaDefinitionAccess().getAnyOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:3481:2: ( rule__AnyOfSchemaDefinition__AnyOfAssignment_2 )
            // InternalJsonSchemaDsl.g:3481:3: rule__AnyOfSchemaDefinition__AnyOfAssignment_2
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
    // InternalJsonSchemaDsl.g:3490:1: rule__TitleSchemaDefinition__Group__0 : rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1 ;
    public final void rule__TitleSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3494:1: ( rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3495:2: rule__TitleSchemaDefinition__Group__0__Impl rule__TitleSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3502:1: rule__TitleSchemaDefinition__Group__0__Impl : ( '\"title\"' ) ;
    public final void rule__TitleSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3506:1: ( ( '\"title\"' ) )
            // InternalJsonSchemaDsl.g:3507:1: ( '\"title\"' )
            {
            // InternalJsonSchemaDsl.g:3507:1: ( '\"title\"' )
            // InternalJsonSchemaDsl.g:3508:2: '\"title\"'
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
    // InternalJsonSchemaDsl.g:3517:1: rule__TitleSchemaDefinition__Group__1 : rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2 ;
    public final void rule__TitleSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3521:1: ( rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3522:2: rule__TitleSchemaDefinition__Group__1__Impl rule__TitleSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3529:1: rule__TitleSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__TitleSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3533:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3534:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3534:1: ( ':' )
            // InternalJsonSchemaDsl.g:3535:2: ':'
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3544:1: rule__TitleSchemaDefinition__Group__2 : rule__TitleSchemaDefinition__Group__2__Impl ;
    public final void rule__TitleSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3548:1: ( rule__TitleSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3549:2: rule__TitleSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3555:1: rule__TitleSchemaDefinition__Group__2__Impl : ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) ) ;
    public final void rule__TitleSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3559:1: ( ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3560:1: ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3560:1: ( ( rule__TitleSchemaDefinition__TitleAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3561:2: ( rule__TitleSchemaDefinition__TitleAssignment_2 )
            {
             before(grammarAccess.getTitleSchemaDefinitionAccess().getTitleAssignment_2()); 
            // InternalJsonSchemaDsl.g:3562:2: ( rule__TitleSchemaDefinition__TitleAssignment_2 )
            // InternalJsonSchemaDsl.g:3562:3: rule__TitleSchemaDefinition__TitleAssignment_2
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
    // InternalJsonSchemaDsl.g:3571:1: rule__ItemsSchemaDefinition__Group__0 : rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1 ;
    public final void rule__ItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3575:1: ( rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3576:2: rule__ItemsSchemaDefinition__Group__0__Impl rule__ItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3583:1: rule__ItemsSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3587:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:3588:1: ( () )
            {
            // InternalJsonSchemaDsl.g:3588:1: ( () )
            // InternalJsonSchemaDsl.g:3589:2: ()
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:3590:2: ()
            // InternalJsonSchemaDsl.g:3590:3: 
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
    // InternalJsonSchemaDsl.g:3598:1: rule__ItemsSchemaDefinition__Group__1 : rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2 ;
    public final void rule__ItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3602:1: ( rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3603:2: rule__ItemsSchemaDefinition__Group__1__Impl rule__ItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3610:1: rule__ItemsSchemaDefinition__Group__1__Impl : ( '\"items\"' ) ;
    public final void rule__ItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3614:1: ( ( '\"items\"' ) )
            // InternalJsonSchemaDsl.g:3615:1: ( '\"items\"' )
            {
            // InternalJsonSchemaDsl.g:3615:1: ( '\"items\"' )
            // InternalJsonSchemaDsl.g:3616:2: '\"items\"'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3625:1: rule__ItemsSchemaDefinition__Group__2 : rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3 ;
    public final void rule__ItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3629:1: ( rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:3630:2: rule__ItemsSchemaDefinition__Group__2__Impl rule__ItemsSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:3637:1: rule__ItemsSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3641:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3642:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3642:1: ( ':' )
            // InternalJsonSchemaDsl.g:3643:2: ':'
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3652:1: rule__ItemsSchemaDefinition__Group__3 : rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4 ;
    public final void rule__ItemsSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3656:1: ( rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:3657:2: rule__ItemsSchemaDefinition__Group__3__Impl rule__ItemsSchemaDefinition__Group__4
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
    // InternalJsonSchemaDsl.g:3664:1: rule__ItemsSchemaDefinition__Group__3__Impl : ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? ) ;
    public final void rule__ItemsSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3668:1: ( ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? ) )
            // InternalJsonSchemaDsl.g:3669:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? )
            {
            // InternalJsonSchemaDsl.g:3669:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )? )
            // InternalJsonSchemaDsl.g:3670:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )?
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf1Assignment_3()); 
            // InternalJsonSchemaDsl.g:3671:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=13)||LA12_0==67) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3671:3: rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3
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
    // InternalJsonSchemaDsl.g:3679:1: rule__ItemsSchemaDefinition__Group__4 : rule__ItemsSchemaDefinition__Group__4__Impl ;
    public final void rule__ItemsSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3683:1: ( rule__ItemsSchemaDefinition__Group__4__Impl )
            // InternalJsonSchemaDsl.g:3684:2: rule__ItemsSchemaDefinition__Group__4__Impl
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
    // InternalJsonSchemaDsl.g:3690:1: rule__ItemsSchemaDefinition__Group__4__Impl : ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? ) ;
    public final void rule__ItemsSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3694:1: ( ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? ) )
            // InternalJsonSchemaDsl.g:3695:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? )
            {
            // InternalJsonSchemaDsl.g:3695:1: ( ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )? )
            // InternalJsonSchemaDsl.g:3696:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )?
            {
             before(grammarAccess.getItemsSchemaDefinitionAccess().getItemsAnyOf2Assignment_4()); 
            // InternalJsonSchemaDsl.g:3697:2: ( rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==71) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonSchemaDsl.g:3697:3: rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4
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
    // InternalJsonSchemaDsl.g:3706:1: rule__DefaultSchemaDefinition__Group__0 : rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1 ;
    public final void rule__DefaultSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3710:1: ( rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3711:2: rule__DefaultSchemaDefinition__Group__0__Impl rule__DefaultSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3718:1: rule__DefaultSchemaDefinition__Group__0__Impl : ( '\"default\"' ) ;
    public final void rule__DefaultSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3722:1: ( ( '\"default\"' ) )
            // InternalJsonSchemaDsl.g:3723:1: ( '\"default\"' )
            {
            // InternalJsonSchemaDsl.g:3723:1: ( '\"default\"' )
            // InternalJsonSchemaDsl.g:3724:2: '\"default\"'
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
    // InternalJsonSchemaDsl.g:3733:1: rule__DefaultSchemaDefinition__Group__1 : rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2 ;
    public final void rule__DefaultSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3737:1: ( rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3738:2: rule__DefaultSchemaDefinition__Group__1__Impl rule__DefaultSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3745:1: rule__DefaultSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DefaultSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3749:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3750:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3750:1: ( ':' )
            // InternalJsonSchemaDsl.g:3751:2: ':'
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3760:1: rule__DefaultSchemaDefinition__Group__2 : rule__DefaultSchemaDefinition__Group__2__Impl ;
    public final void rule__DefaultSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3764:1: ( rule__DefaultSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3765:2: rule__DefaultSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3771:1: rule__DefaultSchemaDefinition__Group__2__Impl : ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) ) ;
    public final void rule__DefaultSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3775:1: ( ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3776:1: ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3776:1: ( ( rule__DefaultSchemaDefinition__DefaultAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3777:2: ( rule__DefaultSchemaDefinition__DefaultAssignment_2 )
            {
             before(grammarAccess.getDefaultSchemaDefinitionAccess().getDefaultAssignment_2()); 
            // InternalJsonSchemaDsl.g:3778:2: ( rule__DefaultSchemaDefinition__DefaultAssignment_2 )
            // InternalJsonSchemaDsl.g:3778:3: rule__DefaultSchemaDefinition__DefaultAssignment_2
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
    // InternalJsonSchemaDsl.g:3787:1: rule__ThenSchemaDefinition__Group__0 : rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1 ;
    public final void rule__ThenSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3791:1: ( rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3792:2: rule__ThenSchemaDefinition__Group__0__Impl rule__ThenSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3799:1: rule__ThenSchemaDefinition__Group__0__Impl : ( '\"then\"' ) ;
    public final void rule__ThenSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3803:1: ( ( '\"then\"' ) )
            // InternalJsonSchemaDsl.g:3804:1: ( '\"then\"' )
            {
            // InternalJsonSchemaDsl.g:3804:1: ( '\"then\"' )
            // InternalJsonSchemaDsl.g:3805:2: '\"then\"'
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3814:1: rule__ThenSchemaDefinition__Group__1 : rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2 ;
    public final void rule__ThenSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3818:1: ( rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3819:2: rule__ThenSchemaDefinition__Group__1__Impl rule__ThenSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3826:1: rule__ThenSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ThenSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3830:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3831:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3831:1: ( ':' )
            // InternalJsonSchemaDsl.g:3832:2: ':'
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3841:1: rule__ThenSchemaDefinition__Group__2 : rule__ThenSchemaDefinition__Group__2__Impl ;
    public final void rule__ThenSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3845:1: ( rule__ThenSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3846:2: rule__ThenSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3852:1: rule__ThenSchemaDefinition__Group__2__Impl : ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) ) ;
    public final void rule__ThenSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3856:1: ( ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3857:1: ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3857:1: ( ( rule__ThenSchemaDefinition__ThenAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3858:2: ( rule__ThenSchemaDefinition__ThenAssignment_2 )
            {
             before(grammarAccess.getThenSchemaDefinitionAccess().getThenAssignment_2()); 
            // InternalJsonSchemaDsl.g:3859:2: ( rule__ThenSchemaDefinition__ThenAssignment_2 )
            // InternalJsonSchemaDsl.g:3859:3: rule__ThenSchemaDefinition__ThenAssignment_2
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
    // InternalJsonSchemaDsl.g:3868:1: rule__MinLengthSchemaDefinition__Group__0 : rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1 ;
    public final void rule__MinLengthSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3872:1: ( rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3873:2: rule__MinLengthSchemaDefinition__Group__0__Impl rule__MinLengthSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3880:1: rule__MinLengthSchemaDefinition__Group__0__Impl : ( '\"minLength\"' ) ;
    public final void rule__MinLengthSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3884:1: ( ( '\"minLength\"' ) )
            // InternalJsonSchemaDsl.g:3885:1: ( '\"minLength\"' )
            {
            // InternalJsonSchemaDsl.g:3885:1: ( '\"minLength\"' )
            // InternalJsonSchemaDsl.g:3886:2: '\"minLength\"'
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3895:1: rule__MinLengthSchemaDefinition__Group__1 : rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2 ;
    public final void rule__MinLengthSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3899:1: ( rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3900:2: rule__MinLengthSchemaDefinition__Group__1__Impl rule__MinLengthSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3907:1: rule__MinLengthSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinLengthSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3911:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:3912:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:3912:1: ( ':' )
            // InternalJsonSchemaDsl.g:3913:2: ':'
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:3922:1: rule__MinLengthSchemaDefinition__Group__2 : rule__MinLengthSchemaDefinition__Group__2__Impl ;
    public final void rule__MinLengthSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3926:1: ( rule__MinLengthSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:3927:2: rule__MinLengthSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:3933:1: rule__MinLengthSchemaDefinition__Group__2__Impl : ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) ) ;
    public final void rule__MinLengthSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3937:1: ( ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:3938:1: ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:3938:1: ( ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 ) )
            // InternalJsonSchemaDsl.g:3939:2: ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 )
            {
             before(grammarAccess.getMinLengthSchemaDefinitionAccess().getMinLengthAssignment_2()); 
            // InternalJsonSchemaDsl.g:3940:2: ( rule__MinLengthSchemaDefinition__MinLengthAssignment_2 )
            // InternalJsonSchemaDsl.g:3940:3: rule__MinLengthSchemaDefinition__MinLengthAssignment_2
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
    // InternalJsonSchemaDsl.g:3949:1: rule__DefinitionsSchemaDefinition__Group__0 : rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3953:1: ( rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:3954:2: rule__DefinitionsSchemaDefinition__Group__0__Impl rule__DefinitionsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:3961:1: rule__DefinitionsSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3965:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:3966:1: ( () )
            {
            // InternalJsonSchemaDsl.g:3966:1: ( () )
            // InternalJsonSchemaDsl.g:3967:2: ()
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:3968:2: ()
            // InternalJsonSchemaDsl.g:3968:3: 
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
    // InternalJsonSchemaDsl.g:3976:1: rule__DefinitionsSchemaDefinition__Group__1 : rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2 ;
    public final void rule__DefinitionsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3980:1: ( rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:3981:2: rule__DefinitionsSchemaDefinition__Group__1__Impl rule__DefinitionsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:3988:1: rule__DefinitionsSchemaDefinition__Group__1__Impl : ( '\"definitions\"' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:3992:1: ( ( '\"definitions\"' ) )
            // InternalJsonSchemaDsl.g:3993:1: ( '\"definitions\"' )
            {
            // InternalJsonSchemaDsl.g:3993:1: ( '\"definitions\"' )
            // InternalJsonSchemaDsl.g:3994:2: '\"definitions\"'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getDefinitionsKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4003:1: rule__DefinitionsSchemaDefinition__Group__2 : rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3 ;
    public final void rule__DefinitionsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4007:1: ( rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:4008:2: rule__DefinitionsSchemaDefinition__Group__2__Impl rule__DefinitionsSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:4015:1: rule__DefinitionsSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4019:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4020:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4020:1: ( ':' )
            // InternalJsonSchemaDsl.g:4021:2: ':'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4030:1: rule__DefinitionsSchemaDefinition__Group__3 : rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4 ;
    public final void rule__DefinitionsSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4034:1: ( rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:4035:2: rule__DefinitionsSchemaDefinition__Group__3__Impl rule__DefinitionsSchemaDefinition__Group__4
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
    // InternalJsonSchemaDsl.g:4042:1: rule__DefinitionsSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4046:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:4047:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:4047:1: ( '{' )
            // InternalJsonSchemaDsl.g:4048:2: '{'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4057:1: rule__DefinitionsSchemaDefinition__Group__4 : rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5 ;
    public final void rule__DefinitionsSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4061:1: ( rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:4062:2: rule__DefinitionsSchemaDefinition__Group__4__Impl rule__DefinitionsSchemaDefinition__Group__5
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
    // InternalJsonSchemaDsl.g:4069:1: rule__DefinitionsSchemaDefinition__Group__4__Impl : ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4073:1: ( ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:4074:1: ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:4074:1: ( ( rule__DefinitionsSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:4075:2: ( rule__DefinitionsSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:4076:2: ( rule__DefinitionsSchemaDefinition__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=14 && LA14_0<=59)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4076:3: rule__DefinitionsSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:4084:1: rule__DefinitionsSchemaDefinition__Group__5 : rule__DefinitionsSchemaDefinition__Group__5__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4088:1: ( rule__DefinitionsSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:4089:2: rule__DefinitionsSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:4095:1: rule__DefinitionsSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4099:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:4100:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:4100:1: ( '}' )
            // InternalJsonSchemaDsl.g:4101:2: '}'
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4111:1: rule__DefinitionsSchemaDefinition__Group_4__0 : rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4115:1: ( rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:4116:2: rule__DefinitionsSchemaDefinition__Group_4__0__Impl rule__DefinitionsSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:4123:1: rule__DefinitionsSchemaDefinition__Group_4__0__Impl : ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4127:1: ( ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:4128:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:4128:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:4129:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:4130:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:4130:3: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0
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
    // InternalJsonSchemaDsl.g:4138:1: rule__DefinitionsSchemaDefinition__Group_4__1 : rule__DefinitionsSchemaDefinition__Group_4__1__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4142:1: ( rule__DefinitionsSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:4143:2: rule__DefinitionsSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:4149:1: rule__DefinitionsSchemaDefinition__Group_4__1__Impl : ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4153:1: ( ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:4154:1: ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:4154:1: ( ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:4155:2: ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:4156:2: ( rule__DefinitionsSchemaDefinition__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==69) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:4156:3: rule__DefinitionsSchemaDefinition__Group_4_1__0
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
    // InternalJsonSchemaDsl.g:4165:1: rule__DefinitionsSchemaDefinition__Group_4_1__0 : rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1 ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4169:1: ( rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:4170:2: rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl rule__DefinitionsSchemaDefinition__Group_4_1__1
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
    // InternalJsonSchemaDsl.g:4177:1: rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4181:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:4182:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:4182:1: ( ',' )
            // InternalJsonSchemaDsl.g:4183:2: ','
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4192:1: rule__DefinitionsSchemaDefinition__Group_4_1__1 : rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4196:1: ( rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:4197:2: rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:4203:1: rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl : ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__DefinitionsSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4207:1: ( ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:4208:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:4208:1: ( ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:4209:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getDefinitionsSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:4210:2: ( rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:4210:3: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:4219:1: rule__MinItemsSchemaDefinition__Group__0 : rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1 ;
    public final void rule__MinItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4223:1: ( rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4224:2: rule__MinItemsSchemaDefinition__Group__0__Impl rule__MinItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4231:1: rule__MinItemsSchemaDefinition__Group__0__Impl : ( '\"minItems\"' ) ;
    public final void rule__MinItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4235:1: ( ( '\"minItems\"' ) )
            // InternalJsonSchemaDsl.g:4236:1: ( '\"minItems\"' )
            {
            // InternalJsonSchemaDsl.g:4236:1: ( '\"minItems\"' )
            // InternalJsonSchemaDsl.g:4237:2: '\"minItems\"'
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4246:1: rule__MinItemsSchemaDefinition__Group__1 : rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2 ;
    public final void rule__MinItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4250:1: ( rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4251:2: rule__MinItemsSchemaDefinition__Group__1__Impl rule__MinItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4258:1: rule__MinItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4262:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4263:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4263:1: ( ':' )
            // InternalJsonSchemaDsl.g:4264:2: ':'
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4273:1: rule__MinItemsSchemaDefinition__Group__2 : rule__MinItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__MinItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4277:1: ( rule__MinItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4278:2: rule__MinItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4284:1: rule__MinItemsSchemaDefinition__Group__2__Impl : ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) ) ;
    public final void rule__MinItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4288:1: ( ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4289:1: ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4289:1: ( ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4290:2: ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 )
            {
             before(grammarAccess.getMinItemsSchemaDefinitionAccess().getMinItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:4291:2: ( rule__MinItemsSchemaDefinition__MinItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:4291:3: rule__MinItemsSchemaDefinition__MinItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:4300:1: rule__OneOfSchemaDefinition__Group__0 : rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1 ;
    public final void rule__OneOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4304:1: ( rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4305:2: rule__OneOfSchemaDefinition__Group__0__Impl rule__OneOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4312:1: rule__OneOfSchemaDefinition__Group__0__Impl : ( '\"oneOf\"' ) ;
    public final void rule__OneOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4316:1: ( ( '\"oneOf\"' ) )
            // InternalJsonSchemaDsl.g:4317:1: ( '\"oneOf\"' )
            {
            // InternalJsonSchemaDsl.g:4317:1: ( '\"oneOf\"' )
            // InternalJsonSchemaDsl.g:4318:2: '\"oneOf\"'
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4327:1: rule__OneOfSchemaDefinition__Group__1 : rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2 ;
    public final void rule__OneOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4331:1: ( rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4332:2: rule__OneOfSchemaDefinition__Group__1__Impl rule__OneOfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4339:1: rule__OneOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__OneOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4343:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4344:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4344:1: ( ':' )
            // InternalJsonSchemaDsl.g:4345:2: ':'
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4354:1: rule__OneOfSchemaDefinition__Group__2 : rule__OneOfSchemaDefinition__Group__2__Impl ;
    public final void rule__OneOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4358:1: ( rule__OneOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4359:2: rule__OneOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4365:1: rule__OneOfSchemaDefinition__Group__2__Impl : ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) ) ;
    public final void rule__OneOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4369:1: ( ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4370:1: ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4370:1: ( ( rule__OneOfSchemaDefinition__OneOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4371:2: ( rule__OneOfSchemaDefinition__OneOfAssignment_2 )
            {
             before(grammarAccess.getOneOfSchemaDefinitionAccess().getOneOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:4372:2: ( rule__OneOfSchemaDefinition__OneOfAssignment_2 )
            // InternalJsonSchemaDsl.g:4372:3: rule__OneOfSchemaDefinition__OneOfAssignment_2
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
    // InternalJsonSchemaDsl.g:4381:1: rule__MaxPropertiesSchemaDefinition__Group__0 : rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1 ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4385:1: ( rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4386:2: rule__MaxPropertiesSchemaDefinition__Group__0__Impl rule__MaxPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4393:1: rule__MaxPropertiesSchemaDefinition__Group__0__Impl : ( '\"maxProperties\"' ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4397:1: ( ( '\"maxProperties\"' ) )
            // InternalJsonSchemaDsl.g:4398:1: ( '\"maxProperties\"' )
            {
            // InternalJsonSchemaDsl.g:4398:1: ( '\"maxProperties\"' )
            // InternalJsonSchemaDsl.g:4399:2: '\"maxProperties\"'
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4408:1: rule__MaxPropertiesSchemaDefinition__Group__1 : rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2 ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4412:1: ( rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4413:2: rule__MaxPropertiesSchemaDefinition__Group__1__Impl rule__MaxPropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4420:1: rule__MaxPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4424:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4425:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4425:1: ( ':' )
            // InternalJsonSchemaDsl.g:4426:2: ':'
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4435:1: rule__MaxPropertiesSchemaDefinition__Group__2 : rule__MaxPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4439:1: ( rule__MaxPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4440:2: rule__MaxPropertiesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4446:1: rule__MaxPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) ) ;
    public final void rule__MaxPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4450:1: ( ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4451:1: ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4451:1: ( ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4452:2: ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 )
            {
             before(grammarAccess.getMaxPropertiesSchemaDefinitionAccess().getMaxPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:4453:2: ( rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:4453:3: rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2
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
    // InternalJsonSchemaDsl.g:4462:1: rule__MinimumSchemaDefinition__Group__0 : rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1 ;
    public final void rule__MinimumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4466:1: ( rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4467:2: rule__MinimumSchemaDefinition__Group__0__Impl rule__MinimumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4474:1: rule__MinimumSchemaDefinition__Group__0__Impl : ( '\"minimum\"' ) ;
    public final void rule__MinimumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4478:1: ( ( '\"minimum\"' ) )
            // InternalJsonSchemaDsl.g:4479:1: ( '\"minimum\"' )
            {
            // InternalJsonSchemaDsl.g:4479:1: ( '\"minimum\"' )
            // InternalJsonSchemaDsl.g:4480:2: '\"minimum\"'
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4489:1: rule__MinimumSchemaDefinition__Group__1 : rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2 ;
    public final void rule__MinimumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4493:1: ( rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4494:2: rule__MinimumSchemaDefinition__Group__1__Impl rule__MinimumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4501:1: rule__MinimumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinimumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4505:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4506:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4506:1: ( ':' )
            // InternalJsonSchemaDsl.g:4507:2: ':'
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4516:1: rule__MinimumSchemaDefinition__Group__2 : rule__MinimumSchemaDefinition__Group__2__Impl ;
    public final void rule__MinimumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4520:1: ( rule__MinimumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4521:2: rule__MinimumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4527:1: rule__MinimumSchemaDefinition__Group__2__Impl : ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) ) ;
    public final void rule__MinimumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4531:1: ( ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4532:1: ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4532:1: ( ( rule__MinimumSchemaDefinition__MinimumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4533:2: ( rule__MinimumSchemaDefinition__MinimumAssignment_2 )
            {
             before(grammarAccess.getMinimumSchemaDefinitionAccess().getMinimumAssignment_2()); 
            // InternalJsonSchemaDsl.g:4534:2: ( rule__MinimumSchemaDefinition__MinimumAssignment_2 )
            // InternalJsonSchemaDsl.g:4534:3: rule__MinimumSchemaDefinition__MinimumAssignment_2
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
    // InternalJsonSchemaDsl.g:4543:1: rule__MaxItemsSchemaDefinition__Group__0 : rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1 ;
    public final void rule__MaxItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4547:1: ( rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4548:2: rule__MaxItemsSchemaDefinition__Group__0__Impl rule__MaxItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4555:1: rule__MaxItemsSchemaDefinition__Group__0__Impl : ( '\"maxItems\"' ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4559:1: ( ( '\"maxItems\"' ) )
            // InternalJsonSchemaDsl.g:4560:1: ( '\"maxItems\"' )
            {
            // InternalJsonSchemaDsl.g:4560:1: ( '\"maxItems\"' )
            // InternalJsonSchemaDsl.g:4561:2: '\"maxItems\"'
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4570:1: rule__MaxItemsSchemaDefinition__Group__1 : rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2 ;
    public final void rule__MaxItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4574:1: ( rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4575:2: rule__MaxItemsSchemaDefinition__Group__1__Impl rule__MaxItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4582:1: rule__MaxItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4586:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4587:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4587:1: ( ':' )
            // InternalJsonSchemaDsl.g:4588:2: ':'
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4597:1: rule__MaxItemsSchemaDefinition__Group__2 : rule__MaxItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4601:1: ( rule__MaxItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4602:2: rule__MaxItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4608:1: rule__MaxItemsSchemaDefinition__Group__2__Impl : ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) ) ;
    public final void rule__MaxItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4612:1: ( ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4613:1: ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4613:1: ( ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4614:2: ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 )
            {
             before(grammarAccess.getMaxItemsSchemaDefinitionAccess().getMaxItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:4615:2: ( rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:4615:3: rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:4624:1: rule__FormatSchemaDefinition__Group__0 : rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1 ;
    public final void rule__FormatSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4628:1: ( rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4629:2: rule__FormatSchemaDefinition__Group__0__Impl rule__FormatSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4636:1: rule__FormatSchemaDefinition__Group__0__Impl : ( '\"format\"' ) ;
    public final void rule__FormatSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4640:1: ( ( '\"format\"' ) )
            // InternalJsonSchemaDsl.g:4641:1: ( '\"format\"' )
            {
            // InternalJsonSchemaDsl.g:4641:1: ( '\"format\"' )
            // InternalJsonSchemaDsl.g:4642:2: '\"format\"'
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4651:1: rule__FormatSchemaDefinition__Group__1 : rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2 ;
    public final void rule__FormatSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4655:1: ( rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4656:2: rule__FormatSchemaDefinition__Group__1__Impl rule__FormatSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4663:1: rule__FormatSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__FormatSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4667:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4668:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4668:1: ( ':' )
            // InternalJsonSchemaDsl.g:4669:2: ':'
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4678:1: rule__FormatSchemaDefinition__Group__2 : rule__FormatSchemaDefinition__Group__2__Impl ;
    public final void rule__FormatSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4682:1: ( rule__FormatSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4683:2: rule__FormatSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4689:1: rule__FormatSchemaDefinition__Group__2__Impl : ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) ) ;
    public final void rule__FormatSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4693:1: ( ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4694:1: ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4694:1: ( ( rule__FormatSchemaDefinition__FormatAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4695:2: ( rule__FormatSchemaDefinition__FormatAssignment_2 )
            {
             before(grammarAccess.getFormatSchemaDefinitionAccess().getFormatAssignment_2()); 
            // InternalJsonSchemaDsl.g:4696:2: ( rule__FormatSchemaDefinition__FormatAssignment_2 )
            // InternalJsonSchemaDsl.g:4696:3: rule__FormatSchemaDefinition__FormatAssignment_2
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
    // InternalJsonSchemaDsl.g:4705:1: rule__ReadOnlySchemaDefinition__Group__0 : rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1 ;
    public final void rule__ReadOnlySchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4709:1: ( rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4710:2: rule__ReadOnlySchemaDefinition__Group__0__Impl rule__ReadOnlySchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4717:1: rule__ReadOnlySchemaDefinition__Group__0__Impl : ( '\"readOnly\"' ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4721:1: ( ( '\"readOnly\"' ) )
            // InternalJsonSchemaDsl.g:4722:1: ( '\"readOnly\"' )
            {
            // InternalJsonSchemaDsl.g:4722:1: ( '\"readOnly\"' )
            // InternalJsonSchemaDsl.g:4723:2: '\"readOnly\"'
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
    // InternalJsonSchemaDsl.g:4732:1: rule__ReadOnlySchemaDefinition__Group__1 : rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2 ;
    public final void rule__ReadOnlySchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4736:1: ( rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4737:2: rule__ReadOnlySchemaDefinition__Group__1__Impl rule__ReadOnlySchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4744:1: rule__ReadOnlySchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4748:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4749:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4749:1: ( ':' )
            // InternalJsonSchemaDsl.g:4750:2: ':'
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4759:1: rule__ReadOnlySchemaDefinition__Group__2 : rule__ReadOnlySchemaDefinition__Group__2__Impl ;
    public final void rule__ReadOnlySchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4763:1: ( rule__ReadOnlySchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4764:2: rule__ReadOnlySchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4770:1: rule__ReadOnlySchemaDefinition__Group__2__Impl : ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) ) ;
    public final void rule__ReadOnlySchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4774:1: ( ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4775:1: ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4775:1: ( ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4776:2: ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 )
            {
             before(grammarAccess.getReadOnlySchemaDefinitionAccess().getReadOnlyAssignment_2()); 
            // InternalJsonSchemaDsl.g:4777:2: ( rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 )
            // InternalJsonSchemaDsl.g:4777:3: rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2
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
    // InternalJsonSchemaDsl.g:4786:1: rule__TypeSchemaDefinition__Group__0 : rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1 ;
    public final void rule__TypeSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4790:1: ( rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4791:2: rule__TypeSchemaDefinition__Group__0__Impl rule__TypeSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4798:1: rule__TypeSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__TypeSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4802:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:4803:1: ( () )
            {
            // InternalJsonSchemaDsl.g:4803:1: ( () )
            // InternalJsonSchemaDsl.g:4804:2: ()
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:4805:2: ()
            // InternalJsonSchemaDsl.g:4805:3: 
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
    // InternalJsonSchemaDsl.g:4813:1: rule__TypeSchemaDefinition__Group__1 : rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2 ;
    public final void rule__TypeSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4817:1: ( rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4818:2: rule__TypeSchemaDefinition__Group__1__Impl rule__TypeSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4825:1: rule__TypeSchemaDefinition__Group__1__Impl : ( '\"type\"' ) ;
    public final void rule__TypeSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4829:1: ( ( '\"type\"' ) )
            // InternalJsonSchemaDsl.g:4830:1: ( '\"type\"' )
            {
            // InternalJsonSchemaDsl.g:4830:1: ( '\"type\"' )
            // InternalJsonSchemaDsl.g:4831:2: '\"type\"'
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4840:1: rule__TypeSchemaDefinition__Group__2 : rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3 ;
    public final void rule__TypeSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4844:1: ( rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:4845:2: rule__TypeSchemaDefinition__Group__2__Impl rule__TypeSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:4852:1: rule__TypeSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__TypeSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4856:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4857:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4857:1: ( ':' )
            // InternalJsonSchemaDsl.g:4858:2: ':'
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4867:1: rule__TypeSchemaDefinition__Group__3 : rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4 ;
    public final void rule__TypeSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4871:1: ( rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:4872:2: rule__TypeSchemaDefinition__Group__3__Impl rule__TypeSchemaDefinition__Group__4
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
    // InternalJsonSchemaDsl.g:4879:1: rule__TypeSchemaDefinition__Group__3__Impl : ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? ) ;
    public final void rule__TypeSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4883:1: ( ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? ) )
            // InternalJsonSchemaDsl.g:4884:1: ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? )
            {
            // InternalJsonSchemaDsl.g:4884:1: ( ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )? )
            // InternalJsonSchemaDsl.g:4885:2: ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )?
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypeAnyOf1Assignment_3()); 
            // InternalJsonSchemaDsl.g:4886:2: ( rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=60 && LA16_0<=66)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4886:3: rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3
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
    // InternalJsonSchemaDsl.g:4894:1: rule__TypeSchemaDefinition__Group__4 : rule__TypeSchemaDefinition__Group__4__Impl ;
    public final void rule__TypeSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4898:1: ( rule__TypeSchemaDefinition__Group__4__Impl )
            // InternalJsonSchemaDsl.g:4899:2: rule__TypeSchemaDefinition__Group__4__Impl
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
    // InternalJsonSchemaDsl.g:4905:1: rule__TypeSchemaDefinition__Group__4__Impl : ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? ) ;
    public final void rule__TypeSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4909:1: ( ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? ) )
            // InternalJsonSchemaDsl.g:4910:1: ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? )
            {
            // InternalJsonSchemaDsl.g:4910:1: ( ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )? )
            // InternalJsonSchemaDsl.g:4911:2: ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )?
            {
             before(grammarAccess.getTypeSchemaDefinitionAccess().getTypesAnyOf2Assignment_4()); 
            // InternalJsonSchemaDsl.g:4912:2: ( rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==71) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonSchemaDsl.g:4912:3: rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4
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
    // InternalJsonSchemaDsl.g:4921:1: rule__AdditionalPropertiesSchemaDefinition__Group__0 : rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1 ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4925:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:4926:2: rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl rule__AdditionalPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:4933:1: rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl : ( '\"additionalProperties\"' ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4937:1: ( ( '\"additionalProperties\"' ) )
            // InternalJsonSchemaDsl.g:4938:1: ( '\"additionalProperties\"' )
            {
            // InternalJsonSchemaDsl.g:4938:1: ( '\"additionalProperties\"' )
            // InternalJsonSchemaDsl.g:4939:2: '\"additionalProperties\"'
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4948:1: rule__AdditionalPropertiesSchemaDefinition__Group__1 : rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2 ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4952:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:4953:2: rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl rule__AdditionalPropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:4960:1: rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4964:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:4965:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:4965:1: ( ':' )
            // InternalJsonSchemaDsl.g:4966:2: ':'
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:4975:1: rule__AdditionalPropertiesSchemaDefinition__Group__2 : rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4979:1: ( rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:4980:2: rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:4986:1: rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:4990:1: ( ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:4991:1: ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:4991:1: ( ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:4992:2: ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 )
            {
             before(grammarAccess.getAdditionalPropertiesSchemaDefinitionAccess().getAdditionalPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:4993:2: ( rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:4993:3: rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2
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
    // InternalJsonSchemaDsl.g:5002:1: rule__ElseSchemaDefinition__Group__0 : rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1 ;
    public final void rule__ElseSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5006:1: ( rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5007:2: rule__ElseSchemaDefinition__Group__0__Impl rule__ElseSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5014:1: rule__ElseSchemaDefinition__Group__0__Impl : ( '\"else\"' ) ;
    public final void rule__ElseSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5018:1: ( ( '\"else\"' ) )
            // InternalJsonSchemaDsl.g:5019:1: ( '\"else\"' )
            {
            // InternalJsonSchemaDsl.g:5019:1: ( '\"else\"' )
            // InternalJsonSchemaDsl.g:5020:2: '\"else\"'
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5029:1: rule__ElseSchemaDefinition__Group__1 : rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2 ;
    public final void rule__ElseSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5033:1: ( rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5034:2: rule__ElseSchemaDefinition__Group__1__Impl rule__ElseSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5041:1: rule__ElseSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ElseSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5045:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5046:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5046:1: ( ':' )
            // InternalJsonSchemaDsl.g:5047:2: ':'
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5056:1: rule__ElseSchemaDefinition__Group__2 : rule__ElseSchemaDefinition__Group__2__Impl ;
    public final void rule__ElseSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5060:1: ( rule__ElseSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5061:2: rule__ElseSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5067:1: rule__ElseSchemaDefinition__Group__2__Impl : ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) ) ;
    public final void rule__ElseSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5071:1: ( ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5072:1: ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5072:1: ( ( rule__ElseSchemaDefinition__ElseAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5073:2: ( rule__ElseSchemaDefinition__ElseAssignment_2 )
            {
             before(grammarAccess.getElseSchemaDefinitionAccess().getElseAssignment_2()); 
            // InternalJsonSchemaDsl.g:5074:2: ( rule__ElseSchemaDefinition__ElseAssignment_2 )
            // InternalJsonSchemaDsl.g:5074:3: rule__ElseSchemaDefinition__ElseAssignment_2
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
    // InternalJsonSchemaDsl.g:5083:1: rule__IdSchemaDefinition__Group__0 : rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1 ;
    public final void rule__IdSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5087:1: ( rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5088:2: rule__IdSchemaDefinition__Group__0__Impl rule__IdSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5095:1: rule__IdSchemaDefinition__Group__0__Impl : ( '\"$id\"' ) ;
    public final void rule__IdSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5099:1: ( ( '\"$id\"' ) )
            // InternalJsonSchemaDsl.g:5100:1: ( '\"$id\"' )
            {
            // InternalJsonSchemaDsl.g:5100:1: ( '\"$id\"' )
            // InternalJsonSchemaDsl.g:5101:2: '\"$id\"'
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
    // InternalJsonSchemaDsl.g:5110:1: rule__IdSchemaDefinition__Group__1 : rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2 ;
    public final void rule__IdSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5114:1: ( rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5115:2: rule__IdSchemaDefinition__Group__1__Impl rule__IdSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5122:1: rule__IdSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__IdSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5126:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5127:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5127:1: ( ':' )
            // InternalJsonSchemaDsl.g:5128:2: ':'
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5137:1: rule__IdSchemaDefinition__Group__2 : rule__IdSchemaDefinition__Group__2__Impl ;
    public final void rule__IdSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5141:1: ( rule__IdSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5142:2: rule__IdSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5148:1: rule__IdSchemaDefinition__Group__2__Impl : ( ( rule__IdSchemaDefinition__IdAssignment_2 ) ) ;
    public final void rule__IdSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5152:1: ( ( ( rule__IdSchemaDefinition__IdAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5153:1: ( ( rule__IdSchemaDefinition__IdAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5153:1: ( ( rule__IdSchemaDefinition__IdAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5154:2: ( rule__IdSchemaDefinition__IdAssignment_2 )
            {
             before(grammarAccess.getIdSchemaDefinitionAccess().getIdAssignment_2()); 
            // InternalJsonSchemaDsl.g:5155:2: ( rule__IdSchemaDefinition__IdAssignment_2 )
            // InternalJsonSchemaDsl.g:5155:3: rule__IdSchemaDefinition__IdAssignment_2
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
    // InternalJsonSchemaDsl.g:5164:1: rule__ConstSchemaDefinition__Group__0 : rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1 ;
    public final void rule__ConstSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5168:1: ( rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5169:2: rule__ConstSchemaDefinition__Group__0__Impl rule__ConstSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5176:1: rule__ConstSchemaDefinition__Group__0__Impl : ( '\"const\"' ) ;
    public final void rule__ConstSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5180:1: ( ( '\"const\"' ) )
            // InternalJsonSchemaDsl.g:5181:1: ( '\"const\"' )
            {
            // InternalJsonSchemaDsl.g:5181:1: ( '\"const\"' )
            // InternalJsonSchemaDsl.g:5182:2: '\"const\"'
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5191:1: rule__ConstSchemaDefinition__Group__1 : rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2 ;
    public final void rule__ConstSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5195:1: ( rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5196:2: rule__ConstSchemaDefinition__Group__1__Impl rule__ConstSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5203:1: rule__ConstSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ConstSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5207:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5208:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5208:1: ( ':' )
            // InternalJsonSchemaDsl.g:5209:2: ':'
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5218:1: rule__ConstSchemaDefinition__Group__2 : rule__ConstSchemaDefinition__Group__2__Impl ;
    public final void rule__ConstSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5222:1: ( rule__ConstSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5223:2: rule__ConstSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5229:1: rule__ConstSchemaDefinition__Group__2__Impl : ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) ) ;
    public final void rule__ConstSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5233:1: ( ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5234:1: ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5234:1: ( ( rule__ConstSchemaDefinition__ConstAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5235:2: ( rule__ConstSchemaDefinition__ConstAssignment_2 )
            {
             before(grammarAccess.getConstSchemaDefinitionAccess().getConstAssignment_2()); 
            // InternalJsonSchemaDsl.g:5236:2: ( rule__ConstSchemaDefinition__ConstAssignment_2 )
            // InternalJsonSchemaDsl.g:5236:3: rule__ConstSchemaDefinition__ConstAssignment_2
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
    // InternalJsonSchemaDsl.g:5245:1: rule__RequiredSchemaDefinition__Group__0 : rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1 ;
    public final void rule__RequiredSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5249:1: ( rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5250:2: rule__RequiredSchemaDefinition__Group__0__Impl rule__RequiredSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5257:1: rule__RequiredSchemaDefinition__Group__0__Impl : ( '\"required\"' ) ;
    public final void rule__RequiredSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5261:1: ( ( '\"required\"' ) )
            // InternalJsonSchemaDsl.g:5262:1: ( '\"required\"' )
            {
            // InternalJsonSchemaDsl.g:5262:1: ( '\"required\"' )
            // InternalJsonSchemaDsl.g:5263:2: '\"required\"'
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5272:1: rule__RequiredSchemaDefinition__Group__1 : rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2 ;
    public final void rule__RequiredSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5276:1: ( rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5277:2: rule__RequiredSchemaDefinition__Group__1__Impl rule__RequiredSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5284:1: rule__RequiredSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RequiredSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5288:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5289:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5289:1: ( ':' )
            // InternalJsonSchemaDsl.g:5290:2: ':'
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5299:1: rule__RequiredSchemaDefinition__Group__2 : rule__RequiredSchemaDefinition__Group__2__Impl ;
    public final void rule__RequiredSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5303:1: ( rule__RequiredSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5304:2: rule__RequiredSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5310:1: rule__RequiredSchemaDefinition__Group__2__Impl : ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) ) ;
    public final void rule__RequiredSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5314:1: ( ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5315:1: ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5315:1: ( ( rule__RequiredSchemaDefinition__RequiredAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5316:2: ( rule__RequiredSchemaDefinition__RequiredAssignment_2 )
            {
             before(grammarAccess.getRequiredSchemaDefinitionAccess().getRequiredAssignment_2()); 
            // InternalJsonSchemaDsl.g:5317:2: ( rule__RequiredSchemaDefinition__RequiredAssignment_2 )
            // InternalJsonSchemaDsl.g:5317:3: rule__RequiredSchemaDefinition__RequiredAssignment_2
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
    // InternalJsonSchemaDsl.g:5326:1: rule__DescriptionSchemaDefinition__Group__0 : rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1 ;
    public final void rule__DescriptionSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5330:1: ( rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5331:2: rule__DescriptionSchemaDefinition__Group__0__Impl rule__DescriptionSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5338:1: rule__DescriptionSchemaDefinition__Group__0__Impl : ( '\"description\"' ) ;
    public final void rule__DescriptionSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5342:1: ( ( '\"description\"' ) )
            // InternalJsonSchemaDsl.g:5343:1: ( '\"description\"' )
            {
            // InternalJsonSchemaDsl.g:5343:1: ( '\"description\"' )
            // InternalJsonSchemaDsl.g:5344:2: '\"description\"'
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
    // InternalJsonSchemaDsl.g:5353:1: rule__DescriptionSchemaDefinition__Group__1 : rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2 ;
    public final void rule__DescriptionSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5357:1: ( rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5358:2: rule__DescriptionSchemaDefinition__Group__1__Impl rule__DescriptionSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5365:1: rule__DescriptionSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__DescriptionSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5369:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5370:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5370:1: ( ':' )
            // InternalJsonSchemaDsl.g:5371:2: ':'
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5380:1: rule__DescriptionSchemaDefinition__Group__2 : rule__DescriptionSchemaDefinition__Group__2__Impl ;
    public final void rule__DescriptionSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5384:1: ( rule__DescriptionSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5385:2: rule__DescriptionSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5391:1: rule__DescriptionSchemaDefinition__Group__2__Impl : ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) ) ;
    public final void rule__DescriptionSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5395:1: ( ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5396:1: ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5396:1: ( ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5397:2: ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 )
            {
             before(grammarAccess.getDescriptionSchemaDefinitionAccess().getDescriptionAssignment_2()); 
            // InternalJsonSchemaDsl.g:5398:2: ( rule__DescriptionSchemaDefinition__DescriptionAssignment_2 )
            // InternalJsonSchemaDsl.g:5398:3: rule__DescriptionSchemaDefinition__DescriptionAssignment_2
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
    // InternalJsonSchemaDsl.g:5407:1: rule__MinPropertiesSchemaDefinition__Group__0 : rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1 ;
    public final void rule__MinPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5411:1: ( rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5412:2: rule__MinPropertiesSchemaDefinition__Group__0__Impl rule__MinPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5419:1: rule__MinPropertiesSchemaDefinition__Group__0__Impl : ( '\"minProperties\"' ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5423:1: ( ( '\"minProperties\"' ) )
            // InternalJsonSchemaDsl.g:5424:1: ( '\"minProperties\"' )
            {
            // InternalJsonSchemaDsl.g:5424:1: ( '\"minProperties\"' )
            // InternalJsonSchemaDsl.g:5425:2: '\"minProperties\"'
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5434:1: rule__MinPropertiesSchemaDefinition__Group__1 : rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2 ;
    public final void rule__MinPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5438:1: ( rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5439:2: rule__MinPropertiesSchemaDefinition__Group__1__Impl rule__MinPropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5446:1: rule__MinPropertiesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5450:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5451:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5451:1: ( ':' )
            // InternalJsonSchemaDsl.g:5452:2: ':'
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5461:1: rule__MinPropertiesSchemaDefinition__Group__2 : rule__MinPropertiesSchemaDefinition__Group__2__Impl ;
    public final void rule__MinPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5465:1: ( rule__MinPropertiesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5466:2: rule__MinPropertiesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5472:1: rule__MinPropertiesSchemaDefinition__Group__2__Impl : ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) ) ;
    public final void rule__MinPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5476:1: ( ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5477:1: ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5477:1: ( ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5478:2: ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 )
            {
             before(grammarAccess.getMinPropertiesSchemaDefinitionAccess().getMinPropertiesAssignment_2()); 
            // InternalJsonSchemaDsl.g:5479:2: ( rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 )
            // InternalJsonSchemaDsl.g:5479:3: rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2
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
    // InternalJsonSchemaDsl.g:5488:1: rule__PatternPropertiesSchemaDefinition__Group__0 : rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5492:1: ( rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5493:2: rule__PatternPropertiesSchemaDefinition__Group__0__Impl rule__PatternPropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5500:1: rule__PatternPropertiesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5504:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:5505:1: ( () )
            {
            // InternalJsonSchemaDsl.g:5505:1: ( () )
            // InternalJsonSchemaDsl.g:5506:2: ()
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:5507:2: ()
            // InternalJsonSchemaDsl.g:5507:3: 
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
    // InternalJsonSchemaDsl.g:5515:1: rule__PatternPropertiesSchemaDefinition__Group__1 : rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5519:1: ( rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5520:2: rule__PatternPropertiesSchemaDefinition__Group__1__Impl rule__PatternPropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5527:1: rule__PatternPropertiesSchemaDefinition__Group__1__Impl : ( '\"patternProperties\"' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5531:1: ( ( '\"patternProperties\"' ) )
            // InternalJsonSchemaDsl.g:5532:1: ( '\"patternProperties\"' )
            {
            // InternalJsonSchemaDsl.g:5532:1: ( '\"patternProperties\"' )
            // InternalJsonSchemaDsl.g:5533:2: '\"patternProperties\"'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getPatternPropertiesKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5542:1: rule__PatternPropertiesSchemaDefinition__Group__2 : rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5546:1: ( rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:5547:2: rule__PatternPropertiesSchemaDefinition__Group__2__Impl rule__PatternPropertiesSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:5554:1: rule__PatternPropertiesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5558:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5559:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5559:1: ( ':' )
            // InternalJsonSchemaDsl.g:5560:2: ':'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5569:1: rule__PatternPropertiesSchemaDefinition__Group__3 : rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5573:1: ( rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:5574:2: rule__PatternPropertiesSchemaDefinition__Group__3__Impl rule__PatternPropertiesSchemaDefinition__Group__4
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
    // InternalJsonSchemaDsl.g:5581:1: rule__PatternPropertiesSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5585:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:5586:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:5586:1: ( '{' )
            // InternalJsonSchemaDsl.g:5587:2: '{'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5596:1: rule__PatternPropertiesSchemaDefinition__Group__4 : rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5600:1: ( rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:5601:2: rule__PatternPropertiesSchemaDefinition__Group__4__Impl rule__PatternPropertiesSchemaDefinition__Group__5
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
    // InternalJsonSchemaDsl.g:5608:1: rule__PatternPropertiesSchemaDefinition__Group__4__Impl : ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5612:1: ( ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:5613:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:5613:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:5614:2: ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:5615:2: ( rule__PatternPropertiesSchemaDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||(LA18_0>=14 && LA18_0<=59)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJsonSchemaDsl.g:5615:3: rule__PatternPropertiesSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:5623:1: rule__PatternPropertiesSchemaDefinition__Group__5 : rule__PatternPropertiesSchemaDefinition__Group__5__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5627:1: ( rule__PatternPropertiesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:5628:2: rule__PatternPropertiesSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:5634:1: rule__PatternPropertiesSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5638:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:5639:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:5639:1: ( '}' )
            // InternalJsonSchemaDsl.g:5640:2: '}'
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5650:1: rule__PatternPropertiesSchemaDefinition__Group_4__0 : rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5654:1: ( rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:5655:2: rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:5662:1: rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl : ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5666:1: ( ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:5667:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:5667:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:5668:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:5669:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:5669:3: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0
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
    // InternalJsonSchemaDsl.g:5677:1: rule__PatternPropertiesSchemaDefinition__Group_4__1 : rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5681:1: ( rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:5682:2: rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:5688:1: rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl : ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5692:1: ( ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:5693:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:5693:1: ( ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:5694:2: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:5695:2: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==69) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:5695:3: rule__PatternPropertiesSchemaDefinition__Group_4_1__0
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
    // InternalJsonSchemaDsl.g:5704:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__0 : rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1 ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5708:1: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:5709:2: rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl rule__PatternPropertiesSchemaDefinition__Group_4_1__1
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
    // InternalJsonSchemaDsl.g:5716:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5720:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:5721:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:5721:1: ( ',' )
            // InternalJsonSchemaDsl.g:5722:2: ','
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5731:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__1 : rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5735:1: ( rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:5736:2: rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:5742:1: rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__PatternPropertiesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5746:1: ( ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:5747:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:5747:1: ( ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:5748:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getPatternPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:5749:2: ( rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:5749:3: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:5758:1: rule__AdditionalItemsSchemaDefinition__Group__0 : rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1 ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5762:1: ( rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5763:2: rule__AdditionalItemsSchemaDefinition__Group__0__Impl rule__AdditionalItemsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5770:1: rule__AdditionalItemsSchemaDefinition__Group__0__Impl : ( '\"additionalItems\"' ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5774:1: ( ( '\"additionalItems\"' ) )
            // InternalJsonSchemaDsl.g:5775:1: ( '\"additionalItems\"' )
            {
            // InternalJsonSchemaDsl.g:5775:1: ( '\"additionalItems\"' )
            // InternalJsonSchemaDsl.g:5776:2: '\"additionalItems\"'
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5785:1: rule__AdditionalItemsSchemaDefinition__Group__1 : rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2 ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5789:1: ( rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5790:2: rule__AdditionalItemsSchemaDefinition__Group__1__Impl rule__AdditionalItemsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5797:1: rule__AdditionalItemsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5801:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5802:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5802:1: ( ':' )
            // InternalJsonSchemaDsl.g:5803:2: ':'
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5812:1: rule__AdditionalItemsSchemaDefinition__Group__2 : rule__AdditionalItemsSchemaDefinition__Group__2__Impl ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5816:1: ( rule__AdditionalItemsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5817:2: rule__AdditionalItemsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5823:1: rule__AdditionalItemsSchemaDefinition__Group__2__Impl : ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) ) ;
    public final void rule__AdditionalItemsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5827:1: ( ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5828:1: ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5828:1: ( ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5829:2: ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 )
            {
             before(grammarAccess.getAdditionalItemsSchemaDefinitionAccess().getAdditionalItemsAssignment_2()); 
            // InternalJsonSchemaDsl.g:5830:2: ( rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 )
            // InternalJsonSchemaDsl.g:5830:3: rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2
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
    // InternalJsonSchemaDsl.g:5839:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5843:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalJsonSchemaDsl.g:5844:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalJsonSchemaDsl.g:5851:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5855:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:5856:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:5856:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:5857:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:5858:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:5858:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalJsonSchemaDsl.g:5866:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5870:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalJsonSchemaDsl.g:5871:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
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
    // InternalJsonSchemaDsl.g:5878:1: rule__KeyValuePair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5882:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5883:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5883:1: ( ':' )
            // InternalJsonSchemaDsl.g:5884:2: ':'
            {
             before(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:5893:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5897:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:5898:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:5904:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5908:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:5909:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:5909:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:5910:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:5911:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:5911:3: rule__KeyValuePair__ValueAssignment_2
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
    // InternalJsonSchemaDsl.g:5920:1: rule__ExamplesSchemaDefinition__Group__0 : rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1 ;
    public final void rule__ExamplesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5924:1: ( rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:5925:2: rule__ExamplesSchemaDefinition__Group__0__Impl rule__ExamplesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:5932:1: rule__ExamplesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ExamplesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5936:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:5937:1: ( () )
            {
            // InternalJsonSchemaDsl.g:5937:1: ( () )
            // InternalJsonSchemaDsl.g:5938:2: ()
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:5939:2: ()
            // InternalJsonSchemaDsl.g:5939:3: 
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
    // InternalJsonSchemaDsl.g:5947:1: rule__ExamplesSchemaDefinition__Group__1 : rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2 ;
    public final void rule__ExamplesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5951:1: ( rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:5952:2: rule__ExamplesSchemaDefinition__Group__1__Impl rule__ExamplesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:5959:1: rule__ExamplesSchemaDefinition__Group__1__Impl : ( '\"examples\"' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5963:1: ( ( '\"examples\"' ) )
            // InternalJsonSchemaDsl.g:5964:1: ( '\"examples\"' )
            {
            // InternalJsonSchemaDsl.g:5964:1: ( '\"examples\"' )
            // InternalJsonSchemaDsl.g:5965:2: '\"examples\"'
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
    // InternalJsonSchemaDsl.g:5974:1: rule__ExamplesSchemaDefinition__Group__2 : rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3 ;
    public final void rule__ExamplesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5978:1: ( rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:5979:2: rule__ExamplesSchemaDefinition__Group__2__Impl rule__ExamplesSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:5986:1: rule__ExamplesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:5990:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:5991:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:5991:1: ( ':' )
            // InternalJsonSchemaDsl.g:5992:2: ':'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6001:1: rule__ExamplesSchemaDefinition__Group__3 : rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4 ;
    public final void rule__ExamplesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6005:1: ( rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:6006:2: rule__ExamplesSchemaDefinition__Group__3__Impl rule__ExamplesSchemaDefinition__Group__4
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
    // InternalJsonSchemaDsl.g:6013:1: rule__ExamplesSchemaDefinition__Group__3__Impl : ( '[' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6017:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:6018:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:6018:1: ( '[' )
            // InternalJsonSchemaDsl.g:6019:2: '['
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6028:1: rule__ExamplesSchemaDefinition__Group__4 : rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5 ;
    public final void rule__ExamplesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6032:1: ( rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:6033:2: rule__ExamplesSchemaDefinition__Group__4__Impl rule__ExamplesSchemaDefinition__Group__5
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
    // InternalJsonSchemaDsl.g:6040:1: rule__ExamplesSchemaDefinition__Group__4__Impl : ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__ExamplesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6044:1: ( ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:6045:1: ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:6045:1: ( ( rule__ExamplesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:6046:2: ( rule__ExamplesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:6047:2: ( rule__ExamplesSchemaDefinition__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_JSON_NUMBER && LA20_0<=RULE_INT)||(LA20_0>=12 && LA20_0<=59)||LA20_0==67||LA20_0==71||(LA20_0>=73 && LA20_0<=74)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJsonSchemaDsl.g:6047:3: rule__ExamplesSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:6055:1: rule__ExamplesSchemaDefinition__Group__5 : rule__ExamplesSchemaDefinition__Group__5__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6059:1: ( rule__ExamplesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:6060:2: rule__ExamplesSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:6066:1: rule__ExamplesSchemaDefinition__Group__5__Impl : ( ']' ) ;
    public final void rule__ExamplesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6070:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:6071:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:6071:1: ( ']' )
            // InternalJsonSchemaDsl.g:6072:2: ']'
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getRightSquareBracketKeyword_5()); 
            match(input,72,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6082:1: rule__ExamplesSchemaDefinition__Group_4__0 : rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1 ;
    public final void rule__ExamplesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6086:1: ( rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:6087:2: rule__ExamplesSchemaDefinition__Group_4__0__Impl rule__ExamplesSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:6094:1: rule__ExamplesSchemaDefinition__Group_4__0__Impl : ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6098:1: ( ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:6099:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:6099:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:6100:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:6101:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 )
            // InternalJsonSchemaDsl.g:6101:3: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0
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
    // InternalJsonSchemaDsl.g:6109:1: rule__ExamplesSchemaDefinition__Group_4__1 : rule__ExamplesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6113:1: ( rule__ExamplesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:6114:2: rule__ExamplesSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:6120:1: rule__ExamplesSchemaDefinition__Group_4__1__Impl : ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6124:1: ( ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:6125:1: ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:6125:1: ( ( rule__ExamplesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:6126:2: ( rule__ExamplesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:6127:2: ( rule__ExamplesSchemaDefinition__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==69) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:6127:3: rule__ExamplesSchemaDefinition__Group_4_1__0
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
    // InternalJsonSchemaDsl.g:6136:1: rule__ExamplesSchemaDefinition__Group_4_1__0 : rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1 ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6140:1: ( rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:6141:2: rule__ExamplesSchemaDefinition__Group_4_1__0__Impl rule__ExamplesSchemaDefinition__Group_4_1__1
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
    // InternalJsonSchemaDsl.g:6148:1: rule__ExamplesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6152:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:6153:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:6153:1: ( ',' )
            // InternalJsonSchemaDsl.g:6154:2: ','
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6163:1: rule__ExamplesSchemaDefinition__Group_4_1__1 : rule__ExamplesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6167:1: ( rule__ExamplesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:6168:2: rule__ExamplesSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:6174:1: rule__ExamplesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) ) ;
    public final void rule__ExamplesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6178:1: ( ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:6179:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:6179:1: ( ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:6180:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 )
            {
             before(grammarAccess.getExamplesSchemaDefinitionAccess().getExamplesAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:6181:2: ( rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:6181:3: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:6190:1: rule__IfSchemaDefinition__Group__0 : rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1 ;
    public final void rule__IfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6194:1: ( rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6195:2: rule__IfSchemaDefinition__Group__0__Impl rule__IfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6202:1: rule__IfSchemaDefinition__Group__0__Impl : ( '\"if\"' ) ;
    public final void rule__IfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6206:1: ( ( '\"if\"' ) )
            // InternalJsonSchemaDsl.g:6207:1: ( '\"if\"' )
            {
            // InternalJsonSchemaDsl.g:6207:1: ( '\"if\"' )
            // InternalJsonSchemaDsl.g:6208:2: '\"if\"'
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6217:1: rule__IfSchemaDefinition__Group__1 : rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2 ;
    public final void rule__IfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6221:1: ( rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6222:2: rule__IfSchemaDefinition__Group__1__Impl rule__IfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6229:1: rule__IfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__IfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6233:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6234:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6234:1: ( ':' )
            // InternalJsonSchemaDsl.g:6235:2: ':'
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6244:1: rule__IfSchemaDefinition__Group__2 : rule__IfSchemaDefinition__Group__2__Impl ;
    public final void rule__IfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6248:1: ( rule__IfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6249:2: rule__IfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6255:1: rule__IfSchemaDefinition__Group__2__Impl : ( ( rule__IfSchemaDefinition__IfAssignment_2 ) ) ;
    public final void rule__IfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6259:1: ( ( ( rule__IfSchemaDefinition__IfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6260:1: ( ( rule__IfSchemaDefinition__IfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6260:1: ( ( rule__IfSchemaDefinition__IfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6261:2: ( rule__IfSchemaDefinition__IfAssignment_2 )
            {
             before(grammarAccess.getIfSchemaDefinitionAccess().getIfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6262:2: ( rule__IfSchemaDefinition__IfAssignment_2 )
            // InternalJsonSchemaDsl.g:6262:3: rule__IfSchemaDefinition__IfAssignment_2
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
    // InternalJsonSchemaDsl.g:6271:1: rule__AllOfSchemaDefinition__Group__0 : rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1 ;
    public final void rule__AllOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6275:1: ( rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6276:2: rule__AllOfSchemaDefinition__Group__0__Impl rule__AllOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6283:1: rule__AllOfSchemaDefinition__Group__0__Impl : ( '\"allOf\"' ) ;
    public final void rule__AllOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6287:1: ( ( '\"allOf\"' ) )
            // InternalJsonSchemaDsl.g:6288:1: ( '\"allOf\"' )
            {
            // InternalJsonSchemaDsl.g:6288:1: ( '\"allOf\"' )
            // InternalJsonSchemaDsl.g:6289:2: '\"allOf\"'
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6298:1: rule__AllOfSchemaDefinition__Group__1 : rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2 ;
    public final void rule__AllOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6302:1: ( rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6303:2: rule__AllOfSchemaDefinition__Group__1__Impl rule__AllOfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6310:1: rule__AllOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AllOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6314:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6315:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6315:1: ( ':' )
            // InternalJsonSchemaDsl.g:6316:2: ':'
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6325:1: rule__AllOfSchemaDefinition__Group__2 : rule__AllOfSchemaDefinition__Group__2__Impl ;
    public final void rule__AllOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6329:1: ( rule__AllOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6330:2: rule__AllOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6336:1: rule__AllOfSchemaDefinition__Group__2__Impl : ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) ) ;
    public final void rule__AllOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6340:1: ( ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6341:1: ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6341:1: ( ( rule__AllOfSchemaDefinition__AllOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6342:2: ( rule__AllOfSchemaDefinition__AllOfAssignment_2 )
            {
             before(grammarAccess.getAllOfSchemaDefinitionAccess().getAllOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6343:2: ( rule__AllOfSchemaDefinition__AllOfAssignment_2 )
            // InternalJsonSchemaDsl.g:6343:3: rule__AllOfSchemaDefinition__AllOfAssignment_2
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
    // InternalJsonSchemaDsl.g:6352:1: rule__ContentEncodingSchemaDefinition__Group__0 : rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1 ;
    public final void rule__ContentEncodingSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6356:1: ( rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6357:2: rule__ContentEncodingSchemaDefinition__Group__0__Impl rule__ContentEncodingSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6364:1: rule__ContentEncodingSchemaDefinition__Group__0__Impl : ( '\"contentEncoding\"' ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6368:1: ( ( '\"contentEncoding\"' ) )
            // InternalJsonSchemaDsl.g:6369:1: ( '\"contentEncoding\"' )
            {
            // InternalJsonSchemaDsl.g:6369:1: ( '\"contentEncoding\"' )
            // InternalJsonSchemaDsl.g:6370:2: '\"contentEncoding\"'
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6379:1: rule__ContentEncodingSchemaDefinition__Group__1 : rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2 ;
    public final void rule__ContentEncodingSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6383:1: ( rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6384:2: rule__ContentEncodingSchemaDefinition__Group__1__Impl rule__ContentEncodingSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6391:1: rule__ContentEncodingSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6395:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6396:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6396:1: ( ':' )
            // InternalJsonSchemaDsl.g:6397:2: ':'
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6406:1: rule__ContentEncodingSchemaDefinition__Group__2 : rule__ContentEncodingSchemaDefinition__Group__2__Impl ;
    public final void rule__ContentEncodingSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6410:1: ( rule__ContentEncodingSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6411:2: rule__ContentEncodingSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6417:1: rule__ContentEncodingSchemaDefinition__Group__2__Impl : ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) ) ;
    public final void rule__ContentEncodingSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6421:1: ( ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6422:1: ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6422:1: ( ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6423:2: ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 )
            {
             before(grammarAccess.getContentEncodingSchemaDefinitionAccess().getContentEncodingAssignment_2()); 
            // InternalJsonSchemaDsl.g:6424:2: ( rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 )
            // InternalJsonSchemaDsl.g:6424:3: rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2
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
    // InternalJsonSchemaDsl.g:6433:1: rule__MultipleOfSchemaDefinition__Group__0 : rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1 ;
    public final void rule__MultipleOfSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6437:1: ( rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6438:2: rule__MultipleOfSchemaDefinition__Group__0__Impl rule__MultipleOfSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6445:1: rule__MultipleOfSchemaDefinition__Group__0__Impl : ( '\"multipleOf\"' ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6449:1: ( ( '\"multipleOf\"' ) )
            // InternalJsonSchemaDsl.g:6450:1: ( '\"multipleOf\"' )
            {
            // InternalJsonSchemaDsl.g:6450:1: ( '\"multipleOf\"' )
            // InternalJsonSchemaDsl.g:6451:2: '\"multipleOf\"'
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
    // InternalJsonSchemaDsl.g:6460:1: rule__MultipleOfSchemaDefinition__Group__1 : rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2 ;
    public final void rule__MultipleOfSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6464:1: ( rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6465:2: rule__MultipleOfSchemaDefinition__Group__1__Impl rule__MultipleOfSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6472:1: rule__MultipleOfSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6476:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6477:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6477:1: ( ':' )
            // InternalJsonSchemaDsl.g:6478:2: ':'
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6487:1: rule__MultipleOfSchemaDefinition__Group__2 : rule__MultipleOfSchemaDefinition__Group__2__Impl ;
    public final void rule__MultipleOfSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6491:1: ( rule__MultipleOfSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6492:2: rule__MultipleOfSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6498:1: rule__MultipleOfSchemaDefinition__Group__2__Impl : ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) ) ;
    public final void rule__MultipleOfSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6502:1: ( ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6503:1: ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6503:1: ( ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6504:2: ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 )
            {
             before(grammarAccess.getMultipleOfSchemaDefinitionAccess().getMultipleOfAssignment_2()); 
            // InternalJsonSchemaDsl.g:6505:2: ( rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 )
            // InternalJsonSchemaDsl.g:6505:3: rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2
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
    // InternalJsonSchemaDsl.g:6514:1: rule__PatternSchemaDefinition__Group__0 : rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1 ;
    public final void rule__PatternSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6518:1: ( rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6519:2: rule__PatternSchemaDefinition__Group__0__Impl rule__PatternSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6526:1: rule__PatternSchemaDefinition__Group__0__Impl : ( '\"pattern\"' ) ;
    public final void rule__PatternSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6530:1: ( ( '\"pattern\"' ) )
            // InternalJsonSchemaDsl.g:6531:1: ( '\"pattern\"' )
            {
            // InternalJsonSchemaDsl.g:6531:1: ( '\"pattern\"' )
            // InternalJsonSchemaDsl.g:6532:2: '\"pattern\"'
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6541:1: rule__PatternSchemaDefinition__Group__1 : rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2 ;
    public final void rule__PatternSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6545:1: ( rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6546:2: rule__PatternSchemaDefinition__Group__1__Impl rule__PatternSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6553:1: rule__PatternSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PatternSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6557:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6558:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6558:1: ( ':' )
            // InternalJsonSchemaDsl.g:6559:2: ':'
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6568:1: rule__PatternSchemaDefinition__Group__2 : rule__PatternSchemaDefinition__Group__2__Impl ;
    public final void rule__PatternSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6572:1: ( rule__PatternSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6573:2: rule__PatternSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6579:1: rule__PatternSchemaDefinition__Group__2__Impl : ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) ) ;
    public final void rule__PatternSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6583:1: ( ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6584:1: ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6584:1: ( ( rule__PatternSchemaDefinition__PatternAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6585:2: ( rule__PatternSchemaDefinition__PatternAssignment_2 )
            {
             before(grammarAccess.getPatternSchemaDefinitionAccess().getPatternAssignment_2()); 
            // InternalJsonSchemaDsl.g:6586:2: ( rule__PatternSchemaDefinition__PatternAssignment_2 )
            // InternalJsonSchemaDsl.g:6586:3: rule__PatternSchemaDefinition__PatternAssignment_2
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
    // InternalJsonSchemaDsl.g:6595:1: rule__ContainsSchemaDefinition__Group__0 : rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1 ;
    public final void rule__ContainsSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6599:1: ( rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6600:2: rule__ContainsSchemaDefinition__Group__0__Impl rule__ContainsSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6607:1: rule__ContainsSchemaDefinition__Group__0__Impl : ( '\"contains\"' ) ;
    public final void rule__ContainsSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6611:1: ( ( '\"contains\"' ) )
            // InternalJsonSchemaDsl.g:6612:1: ( '\"contains\"' )
            {
            // InternalJsonSchemaDsl.g:6612:1: ( '\"contains\"' )
            // InternalJsonSchemaDsl.g:6613:2: '\"contains\"'
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6622:1: rule__ContainsSchemaDefinition__Group__1 : rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2 ;
    public final void rule__ContainsSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6626:1: ( rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6627:2: rule__ContainsSchemaDefinition__Group__1__Impl rule__ContainsSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6634:1: rule__ContainsSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContainsSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6638:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6639:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6639:1: ( ':' )
            // InternalJsonSchemaDsl.g:6640:2: ':'
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6649:1: rule__ContainsSchemaDefinition__Group__2 : rule__ContainsSchemaDefinition__Group__2__Impl ;
    public final void rule__ContainsSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6653:1: ( rule__ContainsSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6654:2: rule__ContainsSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6660:1: rule__ContainsSchemaDefinition__Group__2__Impl : ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) ) ;
    public final void rule__ContainsSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6664:1: ( ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6665:1: ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6665:1: ( ( rule__ContainsSchemaDefinition__ContainsAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6666:2: ( rule__ContainsSchemaDefinition__ContainsAssignment_2 )
            {
             before(grammarAccess.getContainsSchemaDefinitionAccess().getContainsAssignment_2()); 
            // InternalJsonSchemaDsl.g:6667:2: ( rule__ContainsSchemaDefinition__ContainsAssignment_2 )
            // InternalJsonSchemaDsl.g:6667:3: rule__ContainsSchemaDefinition__ContainsAssignment_2
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
    // InternalJsonSchemaDsl.g:6676:1: rule__NotSchemaDefinition__Group__0 : rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1 ;
    public final void rule__NotSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6680:1: ( rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6681:2: rule__NotSchemaDefinition__Group__0__Impl rule__NotSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6688:1: rule__NotSchemaDefinition__Group__0__Impl : ( '\"not\"' ) ;
    public final void rule__NotSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6692:1: ( ( '\"not\"' ) )
            // InternalJsonSchemaDsl.g:6693:1: ( '\"not\"' )
            {
            // InternalJsonSchemaDsl.g:6693:1: ( '\"not\"' )
            // InternalJsonSchemaDsl.g:6694:2: '\"not\"'
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6703:1: rule__NotSchemaDefinition__Group__1 : rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2 ;
    public final void rule__NotSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6707:1: ( rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6708:2: rule__NotSchemaDefinition__Group__1__Impl rule__NotSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6715:1: rule__NotSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__NotSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6719:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6720:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6720:1: ( ':' )
            // InternalJsonSchemaDsl.g:6721:2: ':'
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6730:1: rule__NotSchemaDefinition__Group__2 : rule__NotSchemaDefinition__Group__2__Impl ;
    public final void rule__NotSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6734:1: ( rule__NotSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6735:2: rule__NotSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6741:1: rule__NotSchemaDefinition__Group__2__Impl : ( ( rule__NotSchemaDefinition__NotAssignment_2 ) ) ;
    public final void rule__NotSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6745:1: ( ( ( rule__NotSchemaDefinition__NotAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6746:1: ( ( rule__NotSchemaDefinition__NotAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6746:1: ( ( rule__NotSchemaDefinition__NotAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6747:2: ( rule__NotSchemaDefinition__NotAssignment_2 )
            {
             before(grammarAccess.getNotSchemaDefinitionAccess().getNotAssignment_2()); 
            // InternalJsonSchemaDsl.g:6748:2: ( rule__NotSchemaDefinition__NotAssignment_2 )
            // InternalJsonSchemaDsl.g:6748:3: rule__NotSchemaDefinition__NotAssignment_2
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
    // InternalJsonSchemaDsl.g:6757:1: rule__ExclusiveMaximumSchemaDefinition__Group__0 : rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1 ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6761:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6762:2: rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl rule__ExclusiveMaximumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6769:1: rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl : ( '\"exclusiveMaximum\"' ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6773:1: ( ( '\"exclusiveMaximum\"' ) )
            // InternalJsonSchemaDsl.g:6774:1: ( '\"exclusiveMaximum\"' )
            {
            // InternalJsonSchemaDsl.g:6774:1: ( '\"exclusiveMaximum\"' )
            // InternalJsonSchemaDsl.g:6775:2: '\"exclusiveMaximum\"'
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
    // InternalJsonSchemaDsl.g:6784:1: rule__ExclusiveMaximumSchemaDefinition__Group__1 : rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2 ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6788:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6789:2: rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl rule__ExclusiveMaximumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6796:1: rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6800:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6801:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6801:1: ( ':' )
            // InternalJsonSchemaDsl.g:6802:2: ':'
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6811:1: rule__ExclusiveMaximumSchemaDefinition__Group__2 : rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6815:1: ( rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6816:2: rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6822:1: rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl : ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6826:1: ( ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6827:1: ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6827:1: ( ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6828:2: ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMaximumSchemaDefinitionAccess().getExclusiveMaximumAssignment_2()); 
            // InternalJsonSchemaDsl.g:6829:2: ( rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 )
            // InternalJsonSchemaDsl.g:6829:3: rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2
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
    // InternalJsonSchemaDsl.g:6838:1: rule__MaxLengthSchemaDefinition__Group__0 : rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1 ;
    public final void rule__MaxLengthSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6842:1: ( rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6843:2: rule__MaxLengthSchemaDefinition__Group__0__Impl rule__MaxLengthSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6850:1: rule__MaxLengthSchemaDefinition__Group__0__Impl : ( '\"maxLength\"' ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6854:1: ( ( '\"maxLength\"' ) )
            // InternalJsonSchemaDsl.g:6855:1: ( '\"maxLength\"' )
            {
            // InternalJsonSchemaDsl.g:6855:1: ( '\"maxLength\"' )
            // InternalJsonSchemaDsl.g:6856:2: '\"maxLength\"'
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6865:1: rule__MaxLengthSchemaDefinition__Group__1 : rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2 ;
    public final void rule__MaxLengthSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6869:1: ( rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6870:2: rule__MaxLengthSchemaDefinition__Group__1__Impl rule__MaxLengthSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6877:1: rule__MaxLengthSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6881:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6882:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6882:1: ( ':' )
            // InternalJsonSchemaDsl.g:6883:2: ':'
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6892:1: rule__MaxLengthSchemaDefinition__Group__2 : rule__MaxLengthSchemaDefinition__Group__2__Impl ;
    public final void rule__MaxLengthSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6896:1: ( rule__MaxLengthSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6897:2: rule__MaxLengthSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6903:1: rule__MaxLengthSchemaDefinition__Group__2__Impl : ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) ) ;
    public final void rule__MaxLengthSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6907:1: ( ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6908:1: ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6908:1: ( ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6909:2: ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 )
            {
             before(grammarAccess.getMaxLengthSchemaDefinitionAccess().getMaxLengthAssignment_2()); 
            // InternalJsonSchemaDsl.g:6910:2: ( rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 )
            // InternalJsonSchemaDsl.g:6910:3: rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2
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
    // InternalJsonSchemaDsl.g:6919:1: rule__RefSchemaDefinition__Group__0 : rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1 ;
    public final void rule__RefSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6923:1: ( rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:6924:2: rule__RefSchemaDefinition__Group__0__Impl rule__RefSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:6931:1: rule__RefSchemaDefinition__Group__0__Impl : ( '\"$ref\"' ) ;
    public final void rule__RefSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6935:1: ( ( '\"$ref\"' ) )
            // InternalJsonSchemaDsl.g:6936:1: ( '\"$ref\"' )
            {
            // InternalJsonSchemaDsl.g:6936:1: ( '\"$ref\"' )
            // InternalJsonSchemaDsl.g:6937:2: '\"$ref\"'
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
    // InternalJsonSchemaDsl.g:6946:1: rule__RefSchemaDefinition__Group__1 : rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2 ;
    public final void rule__RefSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6950:1: ( rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:6951:2: rule__RefSchemaDefinition__Group__1__Impl rule__RefSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:6958:1: rule__RefSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__RefSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6962:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:6963:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:6963:1: ( ':' )
            // InternalJsonSchemaDsl.g:6964:2: ':'
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:6973:1: rule__RefSchemaDefinition__Group__2 : rule__RefSchemaDefinition__Group__2__Impl ;
    public final void rule__RefSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6977:1: ( rule__RefSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:6978:2: rule__RefSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:6984:1: rule__RefSchemaDefinition__Group__2__Impl : ( ( rule__RefSchemaDefinition__RefAssignment_2 ) ) ;
    public final void rule__RefSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:6988:1: ( ( ( rule__RefSchemaDefinition__RefAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:6989:1: ( ( rule__RefSchemaDefinition__RefAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:6989:1: ( ( rule__RefSchemaDefinition__RefAssignment_2 ) )
            // InternalJsonSchemaDsl.g:6990:2: ( rule__RefSchemaDefinition__RefAssignment_2 )
            {
             before(grammarAccess.getRefSchemaDefinitionAccess().getRefAssignment_2()); 
            // InternalJsonSchemaDsl.g:6991:2: ( rule__RefSchemaDefinition__RefAssignment_2 )
            // InternalJsonSchemaDsl.g:6991:3: rule__RefSchemaDefinition__RefAssignment_2
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
    // InternalJsonSchemaDsl.g:7000:1: rule__ContentMediaTypeSchemaDefinition__Group__0 : rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1 ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7004:1: ( rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7005:2: rule__ContentMediaTypeSchemaDefinition__Group__0__Impl rule__ContentMediaTypeSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7012:1: rule__ContentMediaTypeSchemaDefinition__Group__0__Impl : ( '\"contentMediaType\"' ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7016:1: ( ( '\"contentMediaType\"' ) )
            // InternalJsonSchemaDsl.g:7017:1: ( '\"contentMediaType\"' )
            {
            // InternalJsonSchemaDsl.g:7017:1: ( '\"contentMediaType\"' )
            // InternalJsonSchemaDsl.g:7018:2: '\"contentMediaType\"'
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7027:1: rule__ContentMediaTypeSchemaDefinition__Group__1 : rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2 ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7031:1: ( rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7032:2: rule__ContentMediaTypeSchemaDefinition__Group__1__Impl rule__ContentMediaTypeSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7039:1: rule__ContentMediaTypeSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7043:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7044:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7044:1: ( ':' )
            // InternalJsonSchemaDsl.g:7045:2: ':'
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7054:1: rule__ContentMediaTypeSchemaDefinition__Group__2 : rule__ContentMediaTypeSchemaDefinition__Group__2__Impl ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7058:1: ( rule__ContentMediaTypeSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7059:2: rule__ContentMediaTypeSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7065:1: rule__ContentMediaTypeSchemaDefinition__Group__2__Impl : ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7069:1: ( ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7070:1: ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7070:1: ( ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7071:2: ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 )
            {
             before(grammarAccess.getContentMediaTypeSchemaDefinitionAccess().getContentMediaTypeAssignment_2()); 
            // InternalJsonSchemaDsl.g:7072:2: ( rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 )
            // InternalJsonSchemaDsl.g:7072:3: rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2
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
    // InternalJsonSchemaDsl.g:7081:1: rule__ExclusiveMinimumSchemaDefinition__Group__0 : rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1 ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7085:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7086:2: rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl rule__ExclusiveMinimumSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7093:1: rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl : ( '\"exclusiveMinimum\"' ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7097:1: ( ( '\"exclusiveMinimum\"' ) )
            // InternalJsonSchemaDsl.g:7098:1: ( '\"exclusiveMinimum\"' )
            {
            // InternalJsonSchemaDsl.g:7098:1: ( '\"exclusiveMinimum\"' )
            // InternalJsonSchemaDsl.g:7099:2: '\"exclusiveMinimum\"'
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7108:1: rule__ExclusiveMinimumSchemaDefinition__Group__1 : rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2 ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7112:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7113:2: rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl rule__ExclusiveMinimumSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7120:1: rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7124:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7125:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7125:1: ( ':' )
            // InternalJsonSchemaDsl.g:7126:2: ':'
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7135:1: rule__ExclusiveMinimumSchemaDefinition__Group__2 : rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7139:1: ( rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7140:2: rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7146:1: rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl : ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7150:1: ( ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7151:1: ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7151:1: ( ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7152:2: ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 )
            {
             before(grammarAccess.getExclusiveMinimumSchemaDefinitionAccess().getExclusiveMinimumAssignment_2()); 
            // InternalJsonSchemaDsl.g:7153:2: ( rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 )
            // InternalJsonSchemaDsl.g:7153:3: rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2
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
    // InternalJsonSchemaDsl.g:7162:1: rule__SchemaSchemaDefinition__Group__0 : rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1 ;
    public final void rule__SchemaSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7166:1: ( rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7167:2: rule__SchemaSchemaDefinition__Group__0__Impl rule__SchemaSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7174:1: rule__SchemaSchemaDefinition__Group__0__Impl : ( '\"$schema\"' ) ;
    public final void rule__SchemaSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7178:1: ( ( '\"$schema\"' ) )
            // InternalJsonSchemaDsl.g:7179:1: ( '\"$schema\"' )
            {
            // InternalJsonSchemaDsl.g:7179:1: ( '\"$schema\"' )
            // InternalJsonSchemaDsl.g:7180:2: '\"$schema\"'
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
    // InternalJsonSchemaDsl.g:7189:1: rule__SchemaSchemaDefinition__Group__1 : rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2 ;
    public final void rule__SchemaSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7193:1: ( rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7194:2: rule__SchemaSchemaDefinition__Group__1__Impl rule__SchemaSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7201:1: rule__SchemaSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__SchemaSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7205:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7206:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7206:1: ( ':' )
            // InternalJsonSchemaDsl.g:7207:2: ':'
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7216:1: rule__SchemaSchemaDefinition__Group__2 : rule__SchemaSchemaDefinition__Group__2__Impl ;
    public final void rule__SchemaSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7220:1: ( rule__SchemaSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7221:2: rule__SchemaSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7227:1: rule__SchemaSchemaDefinition__Group__2__Impl : ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) ) ;
    public final void rule__SchemaSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7231:1: ( ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7232:1: ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7232:1: ( ( rule__SchemaSchemaDefinition__SchemaAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7233:2: ( rule__SchemaSchemaDefinition__SchemaAssignment_2 )
            {
             before(grammarAccess.getSchemaSchemaDefinitionAccess().getSchemaAssignment_2()); 
            // InternalJsonSchemaDsl.g:7234:2: ( rule__SchemaSchemaDefinition__SchemaAssignment_2 )
            // InternalJsonSchemaDsl.g:7234:3: rule__SchemaSchemaDefinition__SchemaAssignment_2
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
    // InternalJsonSchemaDsl.g:7243:1: rule__PropertiesSchemaDefinition__Group__0 : rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1 ;
    public final void rule__PropertiesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7247:1: ( rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7248:2: rule__PropertiesSchemaDefinition__Group__0__Impl rule__PropertiesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7255:1: rule__PropertiesSchemaDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertiesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7259:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7260:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7260:1: ( () )
            // InternalJsonSchemaDsl.g:7261:2: ()
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesSchemaDefinitionAction_0()); 
            // InternalJsonSchemaDsl.g:7262:2: ()
            // InternalJsonSchemaDsl.g:7262:3: 
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
    // InternalJsonSchemaDsl.g:7270:1: rule__PropertiesSchemaDefinition__Group__1 : rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2 ;
    public final void rule__PropertiesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7274:1: ( rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7275:2: rule__PropertiesSchemaDefinition__Group__1__Impl rule__PropertiesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7282:1: rule__PropertiesSchemaDefinition__Group__1__Impl : ( '\"properties\"' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7286:1: ( ( '\"properties\"' ) )
            // InternalJsonSchemaDsl.g:7287:1: ( '\"properties\"' )
            {
            // InternalJsonSchemaDsl.g:7287:1: ( '\"properties\"' )
            // InternalJsonSchemaDsl.g:7288:2: '\"properties\"'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getPropertiesKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7297:1: rule__PropertiesSchemaDefinition__Group__2 : rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3 ;
    public final void rule__PropertiesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7301:1: ( rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3 )
            // InternalJsonSchemaDsl.g:7302:2: rule__PropertiesSchemaDefinition__Group__2__Impl rule__PropertiesSchemaDefinition__Group__3
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
    // InternalJsonSchemaDsl.g:7309:1: rule__PropertiesSchemaDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7313:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7314:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7314:1: ( ':' )
            // InternalJsonSchemaDsl.g:7315:2: ':'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7324:1: rule__PropertiesSchemaDefinition__Group__3 : rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4 ;
    public final void rule__PropertiesSchemaDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7328:1: ( rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4 )
            // InternalJsonSchemaDsl.g:7329:2: rule__PropertiesSchemaDefinition__Group__3__Impl rule__PropertiesSchemaDefinition__Group__4
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
    // InternalJsonSchemaDsl.g:7336:1: rule__PropertiesSchemaDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7340:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:7341:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:7341:1: ( '{' )
            // InternalJsonSchemaDsl.g:7342:2: '{'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7351:1: rule__PropertiesSchemaDefinition__Group__4 : rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5 ;
    public final void rule__PropertiesSchemaDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7355:1: ( rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5 )
            // InternalJsonSchemaDsl.g:7356:2: rule__PropertiesSchemaDefinition__Group__4__Impl rule__PropertiesSchemaDefinition__Group__5
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
    // InternalJsonSchemaDsl.g:7363:1: rule__PropertiesSchemaDefinition__Group__4__Impl : ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? ) ;
    public final void rule__PropertiesSchemaDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7367:1: ( ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? ) )
            // InternalJsonSchemaDsl.g:7368:1: ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? )
            {
            // InternalJsonSchemaDsl.g:7368:1: ( ( rule__PropertiesSchemaDefinition__Group_4__0 )? )
            // InternalJsonSchemaDsl.g:7369:2: ( rule__PropertiesSchemaDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4()); 
            // InternalJsonSchemaDsl.g:7370:2: ( rule__PropertiesSchemaDefinition__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING||(LA22_0>=14 && LA22_0<=59)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7370:3: rule__PropertiesSchemaDefinition__Group_4__0
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
    // InternalJsonSchemaDsl.g:7378:1: rule__PropertiesSchemaDefinition__Group__5 : rule__PropertiesSchemaDefinition__Group__5__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7382:1: ( rule__PropertiesSchemaDefinition__Group__5__Impl )
            // InternalJsonSchemaDsl.g:7383:2: rule__PropertiesSchemaDefinition__Group__5__Impl
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
    // InternalJsonSchemaDsl.g:7389:1: rule__PropertiesSchemaDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PropertiesSchemaDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7393:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:7394:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:7394:1: ( '}' )
            // InternalJsonSchemaDsl.g:7395:2: '}'
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7405:1: rule__PropertiesSchemaDefinition__Group_4__0 : rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1 ;
    public final void rule__PropertiesSchemaDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7409:1: ( rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1 )
            // InternalJsonSchemaDsl.g:7410:2: rule__PropertiesSchemaDefinition__Group_4__0__Impl rule__PropertiesSchemaDefinition__Group_4__1
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
    // InternalJsonSchemaDsl.g:7417:1: rule__PropertiesSchemaDefinition__Group_4__0__Impl : ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7421:1: ( ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) ) )
            // InternalJsonSchemaDsl.g:7422:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            {
            // InternalJsonSchemaDsl.g:7422:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 ) )
            // InternalJsonSchemaDsl.g:7423:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_0()); 
            // InternalJsonSchemaDsl.g:7424:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 )
            // InternalJsonSchemaDsl.g:7424:3: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0
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
    // InternalJsonSchemaDsl.g:7432:1: rule__PropertiesSchemaDefinition__Group_4__1 : rule__PropertiesSchemaDefinition__Group_4__1__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7436:1: ( rule__PropertiesSchemaDefinition__Group_4__1__Impl )
            // InternalJsonSchemaDsl.g:7437:2: rule__PropertiesSchemaDefinition__Group_4__1__Impl
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
    // InternalJsonSchemaDsl.g:7443:1: rule__PropertiesSchemaDefinition__Group_4__1__Impl : ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7447:1: ( ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7448:1: ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7448:1: ( ( rule__PropertiesSchemaDefinition__Group_4_1__0 )* )
            // InternalJsonSchemaDsl.g:7449:2: ( rule__PropertiesSchemaDefinition__Group_4_1__0 )*
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getGroup_4_1()); 
            // InternalJsonSchemaDsl.g:7450:2: ( rule__PropertiesSchemaDefinition__Group_4_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==69) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7450:3: rule__PropertiesSchemaDefinition__Group_4_1__0
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
    // InternalJsonSchemaDsl.g:7459:1: rule__PropertiesSchemaDefinition__Group_4_1__0 : rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1 ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7463:1: ( rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1 )
            // InternalJsonSchemaDsl.g:7464:2: rule__PropertiesSchemaDefinition__Group_4_1__0__Impl rule__PropertiesSchemaDefinition__Group_4_1__1
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
    // InternalJsonSchemaDsl.g:7471:1: rule__PropertiesSchemaDefinition__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7475:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7476:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7476:1: ( ',' )
            // InternalJsonSchemaDsl.g:7477:2: ','
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getCommaKeyword_4_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7486:1: rule__PropertiesSchemaDefinition__Group_4_1__1 : rule__PropertiesSchemaDefinition__Group_4_1__1__Impl ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7490:1: ( rule__PropertiesSchemaDefinition__Group_4_1__1__Impl )
            // InternalJsonSchemaDsl.g:7491:2: rule__PropertiesSchemaDefinition__Group_4_1__1__Impl
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
    // InternalJsonSchemaDsl.g:7497:1: rule__PropertiesSchemaDefinition__Group_4_1__1__Impl : ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) ;
    public final void rule__PropertiesSchemaDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7501:1: ( ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7502:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7502:1: ( ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 ) )
            // InternalJsonSchemaDsl.g:7503:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            {
             before(grammarAccess.getPropertiesSchemaDefinitionAccess().getKeySchemaPairsAssignment_4_1_1()); 
            // InternalJsonSchemaDsl.g:7504:2: ( rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 )
            // InternalJsonSchemaDsl.g:7504:3: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1
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
    // InternalJsonSchemaDsl.g:7513:1: rule__PropertyNamesSchemaDefinition__Group__0 : rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1 ;
    public final void rule__PropertyNamesSchemaDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7517:1: ( rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1 )
            // InternalJsonSchemaDsl.g:7518:2: rule__PropertyNamesSchemaDefinition__Group__0__Impl rule__PropertyNamesSchemaDefinition__Group__1
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
    // InternalJsonSchemaDsl.g:7525:1: rule__PropertyNamesSchemaDefinition__Group__0__Impl : ( '\"propertyNames\"' ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7529:1: ( ( '\"propertyNames\"' ) )
            // InternalJsonSchemaDsl.g:7530:1: ( '\"propertyNames\"' )
            {
            // InternalJsonSchemaDsl.g:7530:1: ( '\"propertyNames\"' )
            // InternalJsonSchemaDsl.g:7531:2: '\"propertyNames\"'
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7540:1: rule__PropertyNamesSchemaDefinition__Group__1 : rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2 ;
    public final void rule__PropertyNamesSchemaDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7544:1: ( rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2 )
            // InternalJsonSchemaDsl.g:7545:2: rule__PropertyNamesSchemaDefinition__Group__1__Impl rule__PropertyNamesSchemaDefinition__Group__2
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
    // InternalJsonSchemaDsl.g:7552:1: rule__PropertyNamesSchemaDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7556:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:7557:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:7557:1: ( ':' )
            // InternalJsonSchemaDsl.g:7558:2: ':'
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7567:1: rule__PropertyNamesSchemaDefinition__Group__2 : rule__PropertyNamesSchemaDefinition__Group__2__Impl ;
    public final void rule__PropertyNamesSchemaDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7571:1: ( rule__PropertyNamesSchemaDefinition__Group__2__Impl )
            // InternalJsonSchemaDsl.g:7572:2: rule__PropertyNamesSchemaDefinition__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:7578:1: rule__PropertyNamesSchemaDefinition__Group__2__Impl : ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) ) ;
    public final void rule__PropertyNamesSchemaDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7582:1: ( ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:7583:1: ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:7583:1: ( ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 ) )
            // InternalJsonSchemaDsl.g:7584:2: ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 )
            {
             before(grammarAccess.getPropertyNamesSchemaDefinitionAccess().getPropertyNamesAssignment_2()); 
            // InternalJsonSchemaDsl.g:7585:2: ( rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 )
            // InternalJsonSchemaDsl.g:7585:3: rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2
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
    // InternalJsonSchemaDsl.g:7594:1: rule__NullValue__Group__0 : rule__NullValue__Group__0__Impl rule__NullValue__Group__1 ;
    public final void rule__NullValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7598:1: ( rule__NullValue__Group__0__Impl rule__NullValue__Group__1 )
            // InternalJsonSchemaDsl.g:7599:2: rule__NullValue__Group__0__Impl rule__NullValue__Group__1
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
    // InternalJsonSchemaDsl.g:7606:1: rule__NullValue__Group__0__Impl : ( () ) ;
    public final void rule__NullValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7610:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7611:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7611:1: ( () )
            // InternalJsonSchemaDsl.g:7612:2: ()
            {
             before(grammarAccess.getNullValueAccess().getNullValueAction_0()); 
            // InternalJsonSchemaDsl.g:7613:2: ()
            // InternalJsonSchemaDsl.g:7613:3: 
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
    // InternalJsonSchemaDsl.g:7621:1: rule__NullValue__Group__1 : rule__NullValue__Group__1__Impl ;
    public final void rule__NullValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7625:1: ( rule__NullValue__Group__1__Impl )
            // InternalJsonSchemaDsl.g:7626:2: rule__NullValue__Group__1__Impl
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
    // InternalJsonSchemaDsl.g:7632:1: rule__NullValue__Group__1__Impl : ( 'null' ) ;
    public final void rule__NullValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7636:1: ( ( 'null' ) )
            // InternalJsonSchemaDsl.g:7637:1: ( 'null' )
            {
            // InternalJsonSchemaDsl.g:7637:1: ( 'null' )
            // InternalJsonSchemaDsl.g:7638:2: 'null'
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
    // InternalJsonSchemaDsl.g:7648:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7652:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalJsonSchemaDsl.g:7653:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalJsonSchemaDsl.g:7660:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7664:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7665:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7665:1: ( () )
            // InternalJsonSchemaDsl.g:7666:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalJsonSchemaDsl.g:7667:2: ()
            // InternalJsonSchemaDsl.g:7667:3: 
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
    // InternalJsonSchemaDsl.g:7675:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7679:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalJsonSchemaDsl.g:7680:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalJsonSchemaDsl.g:7687:1: rule__ObjectValue__Group__1__Impl : ( '{' ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7691:1: ( ( '{' ) )
            // InternalJsonSchemaDsl.g:7692:1: ( '{' )
            {
            // InternalJsonSchemaDsl.g:7692:1: ( '{' )
            // InternalJsonSchemaDsl.g:7693:2: '{'
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7702:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7706:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalJsonSchemaDsl.g:7707:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalJsonSchemaDsl.g:7714:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7718:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:7719:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:7719:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:7720:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7721:2: ( rule__ObjectValue__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7721:3: rule__ObjectValue__Group_2__0
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
    // InternalJsonSchemaDsl.g:7729:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7733:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7734:2: rule__ObjectValue__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:7740:1: rule__ObjectValue__Group__3__Impl : ( '}' ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7744:1: ( ( '}' ) )
            // InternalJsonSchemaDsl.g:7745:1: ( '}' )
            {
            // InternalJsonSchemaDsl.g:7745:1: ( '}' )
            // InternalJsonSchemaDsl.g:7746:2: '}'
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7756:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7760:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalJsonSchemaDsl.g:7761:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalJsonSchemaDsl.g:7768:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7772:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:7773:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:7773:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:7774:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:7775:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalJsonSchemaDsl.g:7775:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalJsonSchemaDsl.g:7783:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7787:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:7788:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:7794:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7798:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:7799:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:7799:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:7800:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:7801:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==69) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:7801:3: rule__ObjectValue__Group_2_1__0
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
    // InternalJsonSchemaDsl.g:7810:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7814:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:7815:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalJsonSchemaDsl.g:7822:1: rule__ObjectValue__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7826:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:7827:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:7827:1: ( ',' )
            // InternalJsonSchemaDsl.g:7828:2: ','
            {
             before(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7837:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7841:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:7842:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:7848:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7852:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:7853:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:7853:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:7854:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:7855:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:7855:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:7864:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7868:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalJsonSchemaDsl.g:7869:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalJsonSchemaDsl.g:7876:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7880:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:7881:1: ( () )
            {
            // InternalJsonSchemaDsl.g:7881:1: ( () )
            // InternalJsonSchemaDsl.g:7882:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalJsonSchemaDsl.g:7883:2: ()
            // InternalJsonSchemaDsl.g:7883:3: 
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
    // InternalJsonSchemaDsl.g:7891:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7895:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalJsonSchemaDsl.g:7896:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalJsonSchemaDsl.g:7903:1: rule__ArrayValue__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7907:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:7908:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:7908:1: ( '[' )
            // InternalJsonSchemaDsl.g:7909:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7918:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7922:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalJsonSchemaDsl.g:7923:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalJsonSchemaDsl.g:7930:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7934:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:7935:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:7935:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:7936:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:7937:2: ( rule__ArrayValue__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_JSON_NUMBER && LA26_0<=RULE_INT)||(LA26_0>=12 && LA26_0<=59)||LA26_0==67||LA26_0==71||(LA26_0>=73 && LA26_0<=74)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJsonSchemaDsl.g:7937:3: rule__ArrayValue__Group_2__0
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
    // InternalJsonSchemaDsl.g:7945:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7949:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalJsonSchemaDsl.g:7950:2: rule__ArrayValue__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:7956:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7960:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:7961:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:7961:1: ( ']' )
            // InternalJsonSchemaDsl.g:7962:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:7972:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7976:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalJsonSchemaDsl.g:7977:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalJsonSchemaDsl.g:7984:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:7988:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:7989:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:7989:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:7990:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:7991:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalJsonSchemaDsl.g:7991:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalJsonSchemaDsl.g:7999:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8003:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8004:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8010:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8014:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:8015:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:8015:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:8016:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:8017:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==69) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8017:3: rule__ArrayValue__Group_2_1__0
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
    // InternalJsonSchemaDsl.g:8026:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8030:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:8031:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
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
    // InternalJsonSchemaDsl.g:8038:1: rule__ArrayValue__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8042:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8043:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8043:1: ( ',' )
            // InternalJsonSchemaDsl.g:8044:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8053:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8057:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:8058:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:8064:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8068:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:8069:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:8069:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:8070:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:8071:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:8071:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:8080:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8084:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalJsonSchemaDsl.g:8085:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalJsonSchemaDsl.g:8092:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8096:1: ( ( ( '-' )? ) )
            // InternalJsonSchemaDsl.g:8097:1: ( ( '-' )? )
            {
            // InternalJsonSchemaDsl.g:8097:1: ( ( '-' )? )
            // InternalJsonSchemaDsl.g:8098:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalJsonSchemaDsl.g:8099:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==74) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8099:3: '-'
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
    // InternalJsonSchemaDsl.g:8107:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8111:1: ( rule__EInt__Group__1__Impl )
            // InternalJsonSchemaDsl.g:8112:2: rule__EInt__Group__1__Impl
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
    // InternalJsonSchemaDsl.g:8118:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8122:1: ( ( RULE_INT ) )
            // InternalJsonSchemaDsl.g:8123:1: ( RULE_INT )
            {
            // InternalJsonSchemaDsl.g:8123:1: ( RULE_INT )
            // InternalJsonSchemaDsl.g:8124:2: RULE_INT
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
    // InternalJsonSchemaDsl.g:8134:1: rule__SchemaArray__Group__0 : rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1 ;
    public final void rule__SchemaArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8138:1: ( rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1 )
            // InternalJsonSchemaDsl.g:8139:2: rule__SchemaArray__Group__0__Impl rule__SchemaArray__Group__1
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
    // InternalJsonSchemaDsl.g:8146:1: rule__SchemaArray__Group__0__Impl : ( '[' ) ;
    public final void rule__SchemaArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8150:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8151:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8151:1: ( '[' )
            // InternalJsonSchemaDsl.g:8152:2: '['
            {
             before(grammarAccess.getSchemaArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8161:1: rule__SchemaArray__Group__1 : rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2 ;
    public final void rule__SchemaArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8165:1: ( rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2 )
            // InternalJsonSchemaDsl.g:8166:2: rule__SchemaArray__Group__1__Impl rule__SchemaArray__Group__2
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
    // InternalJsonSchemaDsl.g:8173:1: rule__SchemaArray__Group__1__Impl : ( ( rule__SchemaArray__ItemsAssignment_1 ) ) ;
    public final void rule__SchemaArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8177:1: ( ( ( rule__SchemaArray__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:8178:1: ( ( rule__SchemaArray__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:8178:1: ( ( rule__SchemaArray__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:8179:2: ( rule__SchemaArray__ItemsAssignment_1 )
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:8180:2: ( rule__SchemaArray__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:8180:3: rule__SchemaArray__ItemsAssignment_1
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
    // InternalJsonSchemaDsl.g:8188:1: rule__SchemaArray__Group__2 : rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3 ;
    public final void rule__SchemaArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8192:1: ( rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3 )
            // InternalJsonSchemaDsl.g:8193:2: rule__SchemaArray__Group__2__Impl rule__SchemaArray__Group__3
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
    // InternalJsonSchemaDsl.g:8200:1: rule__SchemaArray__Group__2__Impl : ( ( rule__SchemaArray__Group_2__0 )* ) ;
    public final void rule__SchemaArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8204:1: ( ( ( rule__SchemaArray__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:8205:1: ( ( rule__SchemaArray__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:8205:1: ( ( rule__SchemaArray__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:8206:2: ( rule__SchemaArray__Group_2__0 )*
            {
             before(grammarAccess.getSchemaArrayAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8207:2: ( rule__SchemaArray__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==69) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8207:3: rule__SchemaArray__Group_2__0
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
    // InternalJsonSchemaDsl.g:8215:1: rule__SchemaArray__Group__3 : rule__SchemaArray__Group__3__Impl ;
    public final void rule__SchemaArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8219:1: ( rule__SchemaArray__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8220:2: rule__SchemaArray__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:8226:1: rule__SchemaArray__Group__3__Impl : ( ']' ) ;
    public final void rule__SchemaArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8230:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8231:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8231:1: ( ']' )
            // InternalJsonSchemaDsl.g:8232:2: ']'
            {
             before(grammarAccess.getSchemaArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8242:1: rule__SchemaArray__Group_2__0 : rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1 ;
    public final void rule__SchemaArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8246:1: ( rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1 )
            // InternalJsonSchemaDsl.g:8247:2: rule__SchemaArray__Group_2__0__Impl rule__SchemaArray__Group_2__1
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
    // InternalJsonSchemaDsl.g:8254:1: rule__SchemaArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SchemaArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8258:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8259:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8259:1: ( ',' )
            // InternalJsonSchemaDsl.g:8260:2: ','
            {
             before(grammarAccess.getSchemaArrayAccess().getCommaKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8269:1: rule__SchemaArray__Group_2__1 : rule__SchemaArray__Group_2__1__Impl ;
    public final void rule__SchemaArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8273:1: ( rule__SchemaArray__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8274:2: rule__SchemaArray__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8280:1: rule__SchemaArray__Group_2__1__Impl : ( ( rule__SchemaArray__ItemsAssignment_2_1 ) ) ;
    public final void rule__SchemaArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8284:1: ( ( ( rule__SchemaArray__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:8285:1: ( ( rule__SchemaArray__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:8285:1: ( ( rule__SchemaArray__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:8286:2: ( rule__SchemaArray__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getSchemaArrayAccess().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:8287:2: ( rule__SchemaArray__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:8287:3: rule__SchemaArray__ItemsAssignment_2_1
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
    // InternalJsonSchemaDsl.g:8296:1: rule__KeySchemaPair__Group__0 : rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1 ;
    public final void rule__KeySchemaPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8300:1: ( rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1 )
            // InternalJsonSchemaDsl.g:8301:2: rule__KeySchemaPair__Group__0__Impl rule__KeySchemaPair__Group__1
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
    // InternalJsonSchemaDsl.g:8308:1: rule__KeySchemaPair__Group__0__Impl : ( ( rule__KeySchemaPair__KeyAssignment_0 ) ) ;
    public final void rule__KeySchemaPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8312:1: ( ( ( rule__KeySchemaPair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:8313:1: ( ( rule__KeySchemaPair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:8313:1: ( ( rule__KeySchemaPair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:8314:2: ( rule__KeySchemaPair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:8315:2: ( rule__KeySchemaPair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:8315:3: rule__KeySchemaPair__KeyAssignment_0
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
    // InternalJsonSchemaDsl.g:8323:1: rule__KeySchemaPair__Group__1 : rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2 ;
    public final void rule__KeySchemaPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8327:1: ( rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2 )
            // InternalJsonSchemaDsl.g:8328:2: rule__KeySchemaPair__Group__1__Impl rule__KeySchemaPair__Group__2
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
    // InternalJsonSchemaDsl.g:8335:1: rule__KeySchemaPair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeySchemaPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8339:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:8340:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:8340:1: ( ':' )
            // InternalJsonSchemaDsl.g:8341:2: ':'
            {
             before(grammarAccess.getKeySchemaPairAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8350:1: rule__KeySchemaPair__Group__2 : rule__KeySchemaPair__Group__2__Impl ;
    public final void rule__KeySchemaPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8354:1: ( rule__KeySchemaPair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8355:2: rule__KeySchemaPair__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:8361:1: rule__KeySchemaPair__Group__2__Impl : ( ( rule__KeySchemaPair__ValueAssignment_2 ) ) ;
    public final void rule__KeySchemaPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8365:1: ( ( ( rule__KeySchemaPair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:8366:1: ( ( rule__KeySchemaPair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:8366:1: ( ( rule__KeySchemaPair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:8367:2: ( rule__KeySchemaPair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeySchemaPairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:8368:2: ( rule__KeySchemaPair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:8368:3: rule__KeySchemaPair__ValueAssignment_2
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
    // InternalJsonSchemaDsl.g:8377:1: rule__TypesAnyOf2__Group__0 : rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1 ;
    public final void rule__TypesAnyOf2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8381:1: ( rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1 )
            // InternalJsonSchemaDsl.g:8382:2: rule__TypesAnyOf2__Group__0__Impl rule__TypesAnyOf2__Group__1
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
    // InternalJsonSchemaDsl.g:8389:1: rule__TypesAnyOf2__Group__0__Impl : ( '[' ) ;
    public final void rule__TypesAnyOf2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8393:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8394:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8394:1: ( '[' )
            // InternalJsonSchemaDsl.g:8395:2: '['
            {
             before(grammarAccess.getTypesAnyOf2Access().getLeftSquareBracketKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8404:1: rule__TypesAnyOf2__Group__1 : rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2 ;
    public final void rule__TypesAnyOf2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8408:1: ( rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2 )
            // InternalJsonSchemaDsl.g:8409:2: rule__TypesAnyOf2__Group__1__Impl rule__TypesAnyOf2__Group__2
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
    // InternalJsonSchemaDsl.g:8416:1: rule__TypesAnyOf2__Group__1__Impl : ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) ) ;
    public final void rule__TypesAnyOf2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8420:1: ( ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) ) )
            // InternalJsonSchemaDsl.g:8421:1: ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) )
            {
            // InternalJsonSchemaDsl.g:8421:1: ( ( rule__TypesAnyOf2__ItemsAssignment_1 ) )
            // InternalJsonSchemaDsl.g:8422:2: ( rule__TypesAnyOf2__ItemsAssignment_1 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_1()); 
            // InternalJsonSchemaDsl.g:8423:2: ( rule__TypesAnyOf2__ItemsAssignment_1 )
            // InternalJsonSchemaDsl.g:8423:3: rule__TypesAnyOf2__ItemsAssignment_1
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
    // InternalJsonSchemaDsl.g:8431:1: rule__TypesAnyOf2__Group__2 : rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3 ;
    public final void rule__TypesAnyOf2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8435:1: ( rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3 )
            // InternalJsonSchemaDsl.g:8436:2: rule__TypesAnyOf2__Group__2__Impl rule__TypesAnyOf2__Group__3
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
    // InternalJsonSchemaDsl.g:8443:1: rule__TypesAnyOf2__Group__2__Impl : ( ( rule__TypesAnyOf2__Group_2__0 )* ) ;
    public final void rule__TypesAnyOf2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8447:1: ( ( ( rule__TypesAnyOf2__Group_2__0 )* ) )
            // InternalJsonSchemaDsl.g:8448:1: ( ( rule__TypesAnyOf2__Group_2__0 )* )
            {
            // InternalJsonSchemaDsl.g:8448:1: ( ( rule__TypesAnyOf2__Group_2__0 )* )
            // InternalJsonSchemaDsl.g:8449:2: ( rule__TypesAnyOf2__Group_2__0 )*
            {
             before(grammarAccess.getTypesAnyOf2Access().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8450:2: ( rule__TypesAnyOf2__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==69) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8450:3: rule__TypesAnyOf2__Group_2__0
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
    // InternalJsonSchemaDsl.g:8458:1: rule__TypesAnyOf2__Group__3 : rule__TypesAnyOf2__Group__3__Impl ;
    public final void rule__TypesAnyOf2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8462:1: ( rule__TypesAnyOf2__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8463:2: rule__TypesAnyOf2__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:8469:1: rule__TypesAnyOf2__Group__3__Impl : ( ']' ) ;
    public final void rule__TypesAnyOf2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8473:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8474:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8474:1: ( ']' )
            // InternalJsonSchemaDsl.g:8475:2: ']'
            {
             before(grammarAccess.getTypesAnyOf2Access().getRightSquareBracketKeyword_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8485:1: rule__TypesAnyOf2__Group_2__0 : rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1 ;
    public final void rule__TypesAnyOf2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8489:1: ( rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1 )
            // InternalJsonSchemaDsl.g:8490:2: rule__TypesAnyOf2__Group_2__0__Impl rule__TypesAnyOf2__Group_2__1
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
    // InternalJsonSchemaDsl.g:8497:1: rule__TypesAnyOf2__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TypesAnyOf2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8501:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8502:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8502:1: ( ',' )
            // InternalJsonSchemaDsl.g:8503:2: ','
            {
             before(grammarAccess.getTypesAnyOf2Access().getCommaKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8512:1: rule__TypesAnyOf2__Group_2__1 : rule__TypesAnyOf2__Group_2__1__Impl ;
    public final void rule__TypesAnyOf2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8516:1: ( rule__TypesAnyOf2__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8517:2: rule__TypesAnyOf2__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8523:1: rule__TypesAnyOf2__Group_2__1__Impl : ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) ) ;
    public final void rule__TypesAnyOf2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8527:1: ( ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) ) )
            // InternalJsonSchemaDsl.g:8528:1: ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) )
            {
            // InternalJsonSchemaDsl.g:8528:1: ( ( rule__TypesAnyOf2__ItemsAssignment_2_1 ) )
            // InternalJsonSchemaDsl.g:8529:2: ( rule__TypesAnyOf2__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getTypesAnyOf2Access().getItemsAssignment_2_1()); 
            // InternalJsonSchemaDsl.g:8530:2: ( rule__TypesAnyOf2__ItemsAssignment_2_1 )
            // InternalJsonSchemaDsl.g:8530:3: rule__TypesAnyOf2__ItemsAssignment_2_1
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
    // InternalJsonSchemaDsl.g:8539:1: rule__DependenciesAnyOf__Group__0 : rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1 ;
    public final void rule__DependenciesAnyOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8543:1: ( rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1 )
            // InternalJsonSchemaDsl.g:8544:2: rule__DependenciesAnyOf__Group__0__Impl rule__DependenciesAnyOf__Group__1
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
    // InternalJsonSchemaDsl.g:8551:1: rule__DependenciesAnyOf__Group__0__Impl : ( () ) ;
    public final void rule__DependenciesAnyOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8555:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:8556:1: ( () )
            {
            // InternalJsonSchemaDsl.g:8556:1: ( () )
            // InternalJsonSchemaDsl.g:8557:2: ()
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOfAction_0()); 
            // InternalJsonSchemaDsl.g:8558:2: ()
            // InternalJsonSchemaDsl.g:8558:3: 
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
    // InternalJsonSchemaDsl.g:8566:1: rule__DependenciesAnyOf__Group__1 : rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2 ;
    public final void rule__DependenciesAnyOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8570:1: ( rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2 )
            // InternalJsonSchemaDsl.g:8571:2: rule__DependenciesAnyOf__Group__1__Impl rule__DependenciesAnyOf__Group__2
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
    // InternalJsonSchemaDsl.g:8578:1: rule__DependenciesAnyOf__Group__1__Impl : ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? ) ;
    public final void rule__DependenciesAnyOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8582:1: ( ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? ) )
            // InternalJsonSchemaDsl.g:8583:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? )
            {
            // InternalJsonSchemaDsl.g:8583:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )? )
            // InternalJsonSchemaDsl.g:8584:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf2Assignment_1()); 
            // InternalJsonSchemaDsl.g:8585:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8585:3: rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1
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
    // InternalJsonSchemaDsl.g:8593:1: rule__DependenciesAnyOf__Group__2 : rule__DependenciesAnyOf__Group__2__Impl ;
    public final void rule__DependenciesAnyOf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8597:1: ( rule__DependenciesAnyOf__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8598:2: rule__DependenciesAnyOf__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:8604:1: rule__DependenciesAnyOf__Group__2__Impl : ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? ) ;
    public final void rule__DependenciesAnyOf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8608:1: ( ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? ) )
            // InternalJsonSchemaDsl.g:8609:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? )
            {
            // InternalJsonSchemaDsl.g:8609:1: ( ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )? )
            // InternalJsonSchemaDsl.g:8610:2: ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )?
            {
             before(grammarAccess.getDependenciesAnyOfAccess().getDependenciesAnyOf1Assignment_2()); 
            // InternalJsonSchemaDsl.g:8611:2: ( rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING||(LA32_0>=14 && LA32_0<=59)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8611:3: rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2
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
    // InternalJsonSchemaDsl.g:8620:1: rule__KeyStringArrayPair__Group__0 : rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1 ;
    public final void rule__KeyStringArrayPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8624:1: ( rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1 )
            // InternalJsonSchemaDsl.g:8625:2: rule__KeyStringArrayPair__Group__0__Impl rule__KeyStringArrayPair__Group__1
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
    // InternalJsonSchemaDsl.g:8632:1: rule__KeyStringArrayPair__Group__0__Impl : ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) ) ;
    public final void rule__KeyStringArrayPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8636:1: ( ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) ) )
            // InternalJsonSchemaDsl.g:8637:1: ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) )
            {
            // InternalJsonSchemaDsl.g:8637:1: ( ( rule__KeyStringArrayPair__KeyAssignment_0 ) )
            // InternalJsonSchemaDsl.g:8638:2: ( rule__KeyStringArrayPair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getKeyAssignment_0()); 
            // InternalJsonSchemaDsl.g:8639:2: ( rule__KeyStringArrayPair__KeyAssignment_0 )
            // InternalJsonSchemaDsl.g:8639:3: rule__KeyStringArrayPair__KeyAssignment_0
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
    // InternalJsonSchemaDsl.g:8647:1: rule__KeyStringArrayPair__Group__1 : rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2 ;
    public final void rule__KeyStringArrayPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8651:1: ( rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2 )
            // InternalJsonSchemaDsl.g:8652:2: rule__KeyStringArrayPair__Group__1__Impl rule__KeyStringArrayPair__Group__2
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
    // InternalJsonSchemaDsl.g:8659:1: rule__KeyStringArrayPair__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyStringArrayPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8663:1: ( ( ':' ) )
            // InternalJsonSchemaDsl.g:8664:1: ( ':' )
            {
            // InternalJsonSchemaDsl.g:8664:1: ( ':' )
            // InternalJsonSchemaDsl.g:8665:2: ':'
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getColonKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8674:1: rule__KeyStringArrayPair__Group__2 : rule__KeyStringArrayPair__Group__2__Impl ;
    public final void rule__KeyStringArrayPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8678:1: ( rule__KeyStringArrayPair__Group__2__Impl )
            // InternalJsonSchemaDsl.g:8679:2: rule__KeyStringArrayPair__Group__2__Impl
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
    // InternalJsonSchemaDsl.g:8685:1: rule__KeyStringArrayPair__Group__2__Impl : ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringArrayPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8689:1: ( ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) ) )
            // InternalJsonSchemaDsl.g:8690:1: ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) )
            {
            // InternalJsonSchemaDsl.g:8690:1: ( ( rule__KeyStringArrayPair__ValueAssignment_2 ) )
            // InternalJsonSchemaDsl.g:8691:2: ( rule__KeyStringArrayPair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyStringArrayPairAccess().getValueAssignment_2()); 
            // InternalJsonSchemaDsl.g:8692:2: ( rule__KeyStringArrayPair__ValueAssignment_2 )
            // InternalJsonSchemaDsl.g:8692:3: rule__KeyStringArrayPair__ValueAssignment_2
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
    // InternalJsonSchemaDsl.g:8701:1: rule__StringArray__Group__0 : rule__StringArray__Group__0__Impl rule__StringArray__Group__1 ;
    public final void rule__StringArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8705:1: ( rule__StringArray__Group__0__Impl rule__StringArray__Group__1 )
            // InternalJsonSchemaDsl.g:8706:2: rule__StringArray__Group__0__Impl rule__StringArray__Group__1
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
    // InternalJsonSchemaDsl.g:8713:1: rule__StringArray__Group__0__Impl : ( () ) ;
    public final void rule__StringArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8717:1: ( ( () ) )
            // InternalJsonSchemaDsl.g:8718:1: ( () )
            {
            // InternalJsonSchemaDsl.g:8718:1: ( () )
            // InternalJsonSchemaDsl.g:8719:2: ()
            {
             before(grammarAccess.getStringArrayAccess().getStringArrayAction_0()); 
            // InternalJsonSchemaDsl.g:8720:2: ()
            // InternalJsonSchemaDsl.g:8720:3: 
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
    // InternalJsonSchemaDsl.g:8728:1: rule__StringArray__Group__1 : rule__StringArray__Group__1__Impl rule__StringArray__Group__2 ;
    public final void rule__StringArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8732:1: ( rule__StringArray__Group__1__Impl rule__StringArray__Group__2 )
            // InternalJsonSchemaDsl.g:8733:2: rule__StringArray__Group__1__Impl rule__StringArray__Group__2
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
    // InternalJsonSchemaDsl.g:8740:1: rule__StringArray__Group__1__Impl : ( '[' ) ;
    public final void rule__StringArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8744:1: ( ( '[' ) )
            // InternalJsonSchemaDsl.g:8745:1: ( '[' )
            {
            // InternalJsonSchemaDsl.g:8745:1: ( '[' )
            // InternalJsonSchemaDsl.g:8746:2: '['
            {
             before(grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8755:1: rule__StringArray__Group__2 : rule__StringArray__Group__2__Impl rule__StringArray__Group__3 ;
    public final void rule__StringArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8759:1: ( rule__StringArray__Group__2__Impl rule__StringArray__Group__3 )
            // InternalJsonSchemaDsl.g:8760:2: rule__StringArray__Group__2__Impl rule__StringArray__Group__3
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
    // InternalJsonSchemaDsl.g:8767:1: rule__StringArray__Group__2__Impl : ( ( rule__StringArray__Group_2__0 )? ) ;
    public final void rule__StringArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8771:1: ( ( ( rule__StringArray__Group_2__0 )? ) )
            // InternalJsonSchemaDsl.g:8772:1: ( ( rule__StringArray__Group_2__0 )? )
            {
            // InternalJsonSchemaDsl.g:8772:1: ( ( rule__StringArray__Group_2__0 )? )
            // InternalJsonSchemaDsl.g:8773:2: ( rule__StringArray__Group_2__0 )?
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2()); 
            // InternalJsonSchemaDsl.g:8774:2: ( rule__StringArray__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING||(LA33_0>=14 && LA33_0<=59)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalJsonSchemaDsl.g:8774:3: rule__StringArray__Group_2__0
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
    // InternalJsonSchemaDsl.g:8782:1: rule__StringArray__Group__3 : rule__StringArray__Group__3__Impl ;
    public final void rule__StringArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8786:1: ( rule__StringArray__Group__3__Impl )
            // InternalJsonSchemaDsl.g:8787:2: rule__StringArray__Group__3__Impl
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
    // InternalJsonSchemaDsl.g:8793:1: rule__StringArray__Group__3__Impl : ( ']' ) ;
    public final void rule__StringArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8797:1: ( ( ']' ) )
            // InternalJsonSchemaDsl.g:8798:1: ( ']' )
            {
            // InternalJsonSchemaDsl.g:8798:1: ( ']' )
            // InternalJsonSchemaDsl.g:8799:2: ']'
            {
             before(grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,72,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8809:1: rule__StringArray__Group_2__0 : rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 ;
    public final void rule__StringArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8813:1: ( rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 )
            // InternalJsonSchemaDsl.g:8814:2: rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1
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
    // InternalJsonSchemaDsl.g:8821:1: rule__StringArray__Group_2__0__Impl : ( ( rule__StringArray__ValuesAssignment_2_0 ) ) ;
    public final void rule__StringArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8825:1: ( ( ( rule__StringArray__ValuesAssignment_2_0 ) ) )
            // InternalJsonSchemaDsl.g:8826:1: ( ( rule__StringArray__ValuesAssignment_2_0 ) )
            {
            // InternalJsonSchemaDsl.g:8826:1: ( ( rule__StringArray__ValuesAssignment_2_0 ) )
            // InternalJsonSchemaDsl.g:8827:2: ( rule__StringArray__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getStringArrayAccess().getValuesAssignment_2_0()); 
            // InternalJsonSchemaDsl.g:8828:2: ( rule__StringArray__ValuesAssignment_2_0 )
            // InternalJsonSchemaDsl.g:8828:3: rule__StringArray__ValuesAssignment_2_0
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
    // InternalJsonSchemaDsl.g:8836:1: rule__StringArray__Group_2__1 : rule__StringArray__Group_2__1__Impl ;
    public final void rule__StringArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8840:1: ( rule__StringArray__Group_2__1__Impl )
            // InternalJsonSchemaDsl.g:8841:2: rule__StringArray__Group_2__1__Impl
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
    // InternalJsonSchemaDsl.g:8847:1: rule__StringArray__Group_2__1__Impl : ( ( rule__StringArray__Group_2_1__0 )* ) ;
    public final void rule__StringArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8851:1: ( ( ( rule__StringArray__Group_2_1__0 )* ) )
            // InternalJsonSchemaDsl.g:8852:1: ( ( rule__StringArray__Group_2_1__0 )* )
            {
            // InternalJsonSchemaDsl.g:8852:1: ( ( rule__StringArray__Group_2_1__0 )* )
            // InternalJsonSchemaDsl.g:8853:2: ( rule__StringArray__Group_2_1__0 )*
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2_1()); 
            // InternalJsonSchemaDsl.g:8854:2: ( rule__StringArray__Group_2_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==69) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalJsonSchemaDsl.g:8854:3: rule__StringArray__Group_2_1__0
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
    // InternalJsonSchemaDsl.g:8863:1: rule__StringArray__Group_2_1__0 : rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1 ;
    public final void rule__StringArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8867:1: ( rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1 )
            // InternalJsonSchemaDsl.g:8868:2: rule__StringArray__Group_2_1__0__Impl rule__StringArray__Group_2_1__1
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
    // InternalJsonSchemaDsl.g:8875:1: rule__StringArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StringArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8879:1: ( ( ',' ) )
            // InternalJsonSchemaDsl.g:8880:1: ( ',' )
            {
            // InternalJsonSchemaDsl.g:8880:1: ( ',' )
            // InternalJsonSchemaDsl.g:8881:2: ','
            {
             before(grammarAccess.getStringArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalJsonSchemaDsl.g:8890:1: rule__StringArray__Group_2_1__1 : rule__StringArray__Group_2_1__1__Impl ;
    public final void rule__StringArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8894:1: ( rule__StringArray__Group_2_1__1__Impl )
            // InternalJsonSchemaDsl.g:8895:2: rule__StringArray__Group_2_1__1__Impl
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
    // InternalJsonSchemaDsl.g:8901:1: rule__StringArray__Group_2_1__1__Impl : ( ( rule__StringArray__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__StringArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8905:1: ( ( ( rule__StringArray__ValuesAssignment_2_1_1 ) ) )
            // InternalJsonSchemaDsl.g:8906:1: ( ( rule__StringArray__ValuesAssignment_2_1_1 ) )
            {
            // InternalJsonSchemaDsl.g:8906:1: ( ( rule__StringArray__ValuesAssignment_2_1_1 ) )
            // InternalJsonSchemaDsl.g:8907:2: ( rule__StringArray__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getStringArrayAccess().getValuesAssignment_2_1_1()); 
            // InternalJsonSchemaDsl.g:8908:2: ( rule__StringArray__ValuesAssignment_2_1_1 )
            // InternalJsonSchemaDsl.g:8908:3: rule__StringArray__ValuesAssignment_2_1_1
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
    // InternalJsonSchemaDsl.g:8917:1: rule__JsonSchema__SchemaAssignment_1 : ( ruleSchema ) ;
    public final void rule__JsonSchema__SchemaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8921:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:8922:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:8922:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:8923:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:8932:1: rule__ObjectSchema__KeywordDefinitionAssignment_2_0 : ( ruleKeywordDefinition ) ;
    public final void rule__ObjectSchema__KeywordDefinitionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8936:1: ( ( ruleKeywordDefinition ) )
            // InternalJsonSchemaDsl.g:8937:2: ( ruleKeywordDefinition )
            {
            // InternalJsonSchemaDsl.g:8937:2: ( ruleKeywordDefinition )
            // InternalJsonSchemaDsl.g:8938:3: ruleKeywordDefinition
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
    // InternalJsonSchemaDsl.g:8947:1: rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1 : ( ruleKeywordDefinition ) ;
    public final void rule__ObjectSchema__KeywordDefinitionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8951:1: ( ( ruleKeywordDefinition ) )
            // InternalJsonSchemaDsl.g:8952:2: ( ruleKeywordDefinition )
            {
            // InternalJsonSchemaDsl.g:8952:2: ( ruleKeywordDefinition )
            // InternalJsonSchemaDsl.g:8953:3: ruleKeywordDefinition
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
    // InternalJsonSchemaDsl.g:8962:1: rule__BooleanSchema__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanSchema__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8966:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8967:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8967:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8968:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:8977:1: rule__MaximumSchemaDefinition__MaximumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MaximumSchemaDefinition__MaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8981:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:8982:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:8982:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:8983:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:8992:1: rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__WriteOnlySchemaDefinition__WriteOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:8996:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:8997:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:8997:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:8998:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9007:1: rule__CommentSchemaDefinition__CommentAssignment_2 : ( ruleEString ) ;
    public final void rule__CommentSchemaDefinition__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9011:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9012:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9012:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9013:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9022:1: rule__EnumSchemaDefinition__ItemsAssignment_1 : ( ruleJsonDocument ) ;
    public final void rule__EnumSchemaDefinition__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9026:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9027:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9027:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9028:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9037:1: rule__EnumSchemaDefinition__ItemsAssignment_2_1 : ( ruleJsonDocument ) ;
    public final void rule__EnumSchemaDefinition__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9041:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9042:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9042:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9043:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9052:1: rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__UniqueItemsSchemaDefinition__UniqueItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9056:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9057:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9057:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9058:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9067:1: rule__AnyOfSchemaDefinition__AnyOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__AnyOfSchemaDefinition__AnyOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9071:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9072:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9072:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9073:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9082:1: rule__TitleSchemaDefinition__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__TitleSchemaDefinition__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9086:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9087:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9087:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9088:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9097:1: rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3 : ( ruleSchema ) ;
    public final void rule__ItemsSchemaDefinition__ItemsAnyOf1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9101:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9102:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9102:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9103:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9112:1: rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4 : ( ruleSchemaArray ) ;
    public final void rule__ItemsSchemaDefinition__ItemsAnyOf2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9116:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9117:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9117:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9118:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9127:1: rule__DefaultSchemaDefinition__DefaultAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__DefaultSchemaDefinition__DefaultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9131:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9132:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9132:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9133:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9142:1: rule__ThenSchemaDefinition__ThenAssignment_2 : ( ruleSchema ) ;
    public final void rule__ThenSchemaDefinition__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9146:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9147:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9147:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9148:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9157:1: rule__MinLengthSchemaDefinition__MinLengthAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinLengthSchemaDefinition__MinLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9161:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9162:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9162:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9163:3: ruleNonNegativeIntegerDefault0
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
    // InternalJsonSchemaDsl.g:9172:1: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9176:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9177:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9177:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9178:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9187:1: rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__DefinitionsSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9191:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9192:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9192:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9193:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9202:1: rule__MinItemsSchemaDefinition__MinItemsAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinItemsSchemaDefinition__MinItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9206:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9207:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9207:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9208:3: ruleNonNegativeIntegerDefault0
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
    // InternalJsonSchemaDsl.g:9217:1: rule__OneOfSchemaDefinition__OneOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__OneOfSchemaDefinition__OneOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9221:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9222:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9222:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9223:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9232:1: rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxPropertiesSchemaDefinition__MaxPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9236:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9237:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9237:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9238:3: ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:9247:1: rule__MinimumSchemaDefinition__MinimumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MinimumSchemaDefinition__MinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9251:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9252:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9252:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9253:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9262:1: rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxItemsSchemaDefinition__MaxItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9266:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9267:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9267:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9268:3: ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:9277:1: rule__FormatSchemaDefinition__FormatAssignment_2 : ( ruleEString ) ;
    public final void rule__FormatSchemaDefinition__FormatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9281:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9282:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9282:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9283:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9292:1: rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ReadOnlySchemaDefinition__ReadOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9296:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9297:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9297:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9298:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9307:1: rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3 : ( ruleSimpleTypes ) ;
    public final void rule__TypeSchemaDefinition__TypeAnyOf1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9311:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:9312:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:9312:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:9313:3: ruleSimpleTypes
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
    // InternalJsonSchemaDsl.g:9322:1: rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4 : ( ruleTypesAnyOf2 ) ;
    public final void rule__TypeSchemaDefinition__TypesAnyOf2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9326:1: ( ( ruleTypesAnyOf2 ) )
            // InternalJsonSchemaDsl.g:9327:2: ( ruleTypesAnyOf2 )
            {
            // InternalJsonSchemaDsl.g:9327:2: ( ruleTypesAnyOf2 )
            // InternalJsonSchemaDsl.g:9328:3: ruleTypesAnyOf2
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
    // InternalJsonSchemaDsl.g:9337:1: rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2 : ( ruleSchema ) ;
    public final void rule__AdditionalPropertiesSchemaDefinition__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9341:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9342:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9342:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9343:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9352:1: rule__ElseSchemaDefinition__ElseAssignment_2 : ( ruleSchema ) ;
    public final void rule__ElseSchemaDefinition__ElseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9356:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9357:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9357:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9358:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9367:1: rule__IdSchemaDefinition__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__IdSchemaDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9371:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9372:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9372:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9373:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9382:1: rule__ConstSchemaDefinition__ConstAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__ConstSchemaDefinition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9386:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9387:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9387:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9388:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9397:1: rule__RequiredSchemaDefinition__RequiredAssignment_2 : ( ruleStringArray ) ;
    public final void rule__RequiredSchemaDefinition__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9401:1: ( ( ruleStringArray ) )
            // InternalJsonSchemaDsl.g:9402:2: ( ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:9402:2: ( ruleStringArray )
            // InternalJsonSchemaDsl.g:9403:3: ruleStringArray
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
    // InternalJsonSchemaDsl.g:9412:1: rule__DescriptionSchemaDefinition__DescriptionAssignment_2 : ( ruleEString ) ;
    public final void rule__DescriptionSchemaDefinition__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9416:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9417:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9417:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9418:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9427:1: rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2 : ( ruleNonNegativeIntegerDefault0 ) ;
    public final void rule__MinPropertiesSchemaDefinition__MinPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9431:1: ( ( ruleNonNegativeIntegerDefault0 ) )
            // InternalJsonSchemaDsl.g:9432:2: ( ruleNonNegativeIntegerDefault0 )
            {
            // InternalJsonSchemaDsl.g:9432:2: ( ruleNonNegativeIntegerDefault0 )
            // InternalJsonSchemaDsl.g:9433:3: ruleNonNegativeIntegerDefault0
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
    // InternalJsonSchemaDsl.g:9442:1: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9446:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9447:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9447:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9448:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9457:1: rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__PatternPropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9461:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9462:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9462:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9463:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9472:1: rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2 : ( ruleSchema ) ;
    public final void rule__AdditionalItemsSchemaDefinition__AdditionalItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9476:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9477:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9477:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9478:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9487:1: rule__KeyValuePair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9491:1: ( ( RULE_STRING ) )
            // InternalJsonSchemaDsl.g:9492:2: ( RULE_STRING )
            {
            // InternalJsonSchemaDsl.g:9492:2: ( RULE_STRING )
            // InternalJsonSchemaDsl.g:9493:3: RULE_STRING
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
    // InternalJsonSchemaDsl.g:9502:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9506:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9507:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9507:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9508:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9517:1: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0 : ( ruleJsonDocument ) ;
    public final void rule__ExamplesSchemaDefinition__ExamplesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9521:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9522:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9522:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9523:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9532:1: rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1 : ( ruleJsonDocument ) ;
    public final void rule__ExamplesSchemaDefinition__ExamplesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9536:1: ( ( ruleJsonDocument ) )
            // InternalJsonSchemaDsl.g:9537:2: ( ruleJsonDocument )
            {
            // InternalJsonSchemaDsl.g:9537:2: ( ruleJsonDocument )
            // InternalJsonSchemaDsl.g:9538:3: ruleJsonDocument
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
    // InternalJsonSchemaDsl.g:9547:1: rule__IfSchemaDefinition__IfAssignment_2 : ( ruleSchema ) ;
    public final void rule__IfSchemaDefinition__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9551:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9552:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9552:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9553:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9562:1: rule__AllOfSchemaDefinition__AllOfAssignment_2 : ( ruleSchemaArray ) ;
    public final void rule__AllOfSchemaDefinition__AllOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9566:1: ( ( ruleSchemaArray ) )
            // InternalJsonSchemaDsl.g:9567:2: ( ruleSchemaArray )
            {
            // InternalJsonSchemaDsl.g:9567:2: ( ruleSchemaArray )
            // InternalJsonSchemaDsl.g:9568:3: ruleSchemaArray
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
    // InternalJsonSchemaDsl.g:9577:1: rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentEncodingSchemaDefinition__ContentEncodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9581:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9582:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9582:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9583:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9592:1: rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2 : ( ruleEDouble ) ;
    public final void rule__MultipleOfSchemaDefinition__MultipleOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9596:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9597:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9597:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9598:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9607:1: rule__PatternSchemaDefinition__PatternAssignment_2 : ( ruleEString ) ;
    public final void rule__PatternSchemaDefinition__PatternAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9611:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9612:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9612:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9613:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9622:1: rule__ContainsSchemaDefinition__ContainsAssignment_2 : ( ruleSchema ) ;
    public final void rule__ContainsSchemaDefinition__ContainsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9626:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9627:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9627:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9628:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9637:1: rule__NotSchemaDefinition__NotAssignment_2 : ( ruleSchema ) ;
    public final void rule__NotSchemaDefinition__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9641:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9642:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9642:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9643:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9652:1: rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExclusiveMaximumSchemaDefinition__ExclusiveMaximumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9656:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9657:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9657:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9658:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9667:1: rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2 : ( ruleNonNegativeInteger ) ;
    public final void rule__MaxLengthSchemaDefinition__MaxLengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9671:1: ( ( ruleNonNegativeInteger ) )
            // InternalJsonSchemaDsl.g:9672:2: ( ruleNonNegativeInteger )
            {
            // InternalJsonSchemaDsl.g:9672:2: ( ruleNonNegativeInteger )
            // InternalJsonSchemaDsl.g:9673:3: ruleNonNegativeInteger
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
    // InternalJsonSchemaDsl.g:9682:1: rule__RefSchemaDefinition__RefAssignment_2 : ( ruleEString ) ;
    public final void rule__RefSchemaDefinition__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9686:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9687:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9687:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9688:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9697:1: rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentMediaTypeSchemaDefinition__ContentMediaTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9701:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9702:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9702:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9703:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9712:1: rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExclusiveMinimumSchemaDefinition__ExclusiveMinimumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9716:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9717:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9717:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9718:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9727:1: rule__SchemaSchemaDefinition__SchemaAssignment_2 : ( ruleEString ) ;
    public final void rule__SchemaSchemaDefinition__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9731:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9732:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9732:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9733:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9742:1: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0 : ( ruleKeySchemaPair ) ;
    public final void rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9746:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9747:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9747:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9748:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9757:1: rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1 : ( ruleKeySchemaPair ) ;
    public final void rule__PropertiesSchemaDefinition__KeySchemaPairsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9761:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:9762:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:9762:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:9763:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:9772:1: rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2 : ( ruleSchema ) ;
    public final void rule__PropertyNamesSchemaDefinition__PropertyNamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9776:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9777:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9777:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9778:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9787:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9791:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9792:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9792:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9793:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9802:1: rule__IntegerValue__ValueAssignment : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9806:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9807:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9807:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9808:3: ruleEInt
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
    // InternalJsonSchemaDsl.g:9817:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9821:1: ( ( ruleEBoolean ) )
            // InternalJsonSchemaDsl.g:9822:2: ( ruleEBoolean )
            {
            // InternalJsonSchemaDsl.g:9822:2: ( ruleEBoolean )
            // InternalJsonSchemaDsl.g:9823:3: ruleEBoolean
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
    // InternalJsonSchemaDsl.g:9832:1: rule__StringValue__ValueAssignment : ( ruleVALID_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9836:1: ( ( ruleVALID_STRING ) )
            // InternalJsonSchemaDsl.g:9837:2: ( ruleVALID_STRING )
            {
            // InternalJsonSchemaDsl.g:9837:2: ( ruleVALID_STRING )
            // InternalJsonSchemaDsl.g:9838:3: ruleVALID_STRING
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
    // InternalJsonSchemaDsl.g:9847:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9851:1: ( ( ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:9852:2: ( ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:9852:2: ( ruleKeyValuePair )
            // InternalJsonSchemaDsl.g:9853:3: ruleKeyValuePair
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
    // InternalJsonSchemaDsl.g:9862:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9866:1: ( ( ruleKeyValuePair ) )
            // InternalJsonSchemaDsl.g:9867:2: ( ruleKeyValuePair )
            {
            // InternalJsonSchemaDsl.g:9867:2: ( ruleKeyValuePair )
            // InternalJsonSchemaDsl.g:9868:3: ruleKeyValuePair
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
    // InternalJsonSchemaDsl.g:9877:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9881:1: ( ( ruleEDouble ) )
            // InternalJsonSchemaDsl.g:9882:2: ( ruleEDouble )
            {
            // InternalJsonSchemaDsl.g:9882:2: ( ruleEDouble )
            // InternalJsonSchemaDsl.g:9883:3: ruleEDouble
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
    // InternalJsonSchemaDsl.g:9892:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9896:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9897:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9897:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9898:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9907:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9911:1: ( ( ruleValue ) )
            // InternalJsonSchemaDsl.g:9912:2: ( ruleValue )
            {
            // InternalJsonSchemaDsl.g:9912:2: ( ruleValue )
            // InternalJsonSchemaDsl.g:9913:3: ruleValue
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
    // InternalJsonSchemaDsl.g:9922:1: rule__SchemaArray__ItemsAssignment_1 : ( ruleSchema ) ;
    public final void rule__SchemaArray__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9926:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9927:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9927:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9928:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9937:1: rule__SchemaArray__ItemsAssignment_2_1 : ( ruleSchema ) ;
    public final void rule__SchemaArray__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9941:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9942:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9942:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9943:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9952:1: rule__NonNegativeIntegerDefault0__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NonNegativeIntegerDefault0__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9956:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:9957:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:9957:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:9958:3: ruleEInt
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
    // InternalJsonSchemaDsl.g:9967:1: rule__KeySchemaPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeySchemaPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9971:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:9972:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:9972:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:9973:3: ruleEString
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
    // InternalJsonSchemaDsl.g:9982:1: rule__KeySchemaPair__ValueAssignment_2 : ( ruleSchema ) ;
    public final void rule__KeySchemaPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:9986:1: ( ( ruleSchema ) )
            // InternalJsonSchemaDsl.g:9987:2: ( ruleSchema )
            {
            // InternalJsonSchemaDsl.g:9987:2: ( ruleSchema )
            // InternalJsonSchemaDsl.g:9988:3: ruleSchema
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
    // InternalJsonSchemaDsl.g:9997:1: rule__NonNegativeInteger__ValueAssignment : ( ruleEInt ) ;
    public final void rule__NonNegativeInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10001:1: ( ( ruleEInt ) )
            // InternalJsonSchemaDsl.g:10002:2: ( ruleEInt )
            {
            // InternalJsonSchemaDsl.g:10002:2: ( ruleEInt )
            // InternalJsonSchemaDsl.g:10003:3: ruleEInt
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
    // InternalJsonSchemaDsl.g:10012:1: rule__TypesAnyOf2__ItemsAssignment_1 : ( ruleSimpleTypes ) ;
    public final void rule__TypesAnyOf2__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10016:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:10017:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:10017:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:10018:3: ruleSimpleTypes
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
    // InternalJsonSchemaDsl.g:10027:1: rule__TypesAnyOf2__ItemsAssignment_2_1 : ( ruleSimpleTypes ) ;
    public final void rule__TypesAnyOf2__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10031:1: ( ( ruleSimpleTypes ) )
            // InternalJsonSchemaDsl.g:10032:2: ( ruleSimpleTypes )
            {
            // InternalJsonSchemaDsl.g:10032:2: ( ruleSimpleTypes )
            // InternalJsonSchemaDsl.g:10033:3: ruleSimpleTypes
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
    // InternalJsonSchemaDsl.g:10042:1: rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 : ( ruleKeyStringArrayPair ) ;
    public final void rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10046:1: ( ( ruleKeyStringArrayPair ) )
            // InternalJsonSchemaDsl.g:10047:2: ( ruleKeyStringArrayPair )
            {
            // InternalJsonSchemaDsl.g:10047:2: ( ruleKeyStringArrayPair )
            // InternalJsonSchemaDsl.g:10048:3: ruleKeyStringArrayPair
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
    // InternalJsonSchemaDsl.g:10057:1: rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2 : ( ruleKeySchemaPair ) ;
    public final void rule__DependenciesAnyOf__DependenciesAnyOf1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10061:1: ( ( ruleKeySchemaPair ) )
            // InternalJsonSchemaDsl.g:10062:2: ( ruleKeySchemaPair )
            {
            // InternalJsonSchemaDsl.g:10062:2: ( ruleKeySchemaPair )
            // InternalJsonSchemaDsl.g:10063:3: ruleKeySchemaPair
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
    // InternalJsonSchemaDsl.g:10072:1: rule__KeyStringArrayPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyStringArrayPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10076:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:10077:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:10077:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:10078:3: ruleEString
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
    // InternalJsonSchemaDsl.g:10087:1: rule__KeyStringArrayPair__ValueAssignment_2 : ( ruleStringArray ) ;
    public final void rule__KeyStringArrayPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10091:1: ( ( ruleStringArray ) )
            // InternalJsonSchemaDsl.g:10092:2: ( ruleStringArray )
            {
            // InternalJsonSchemaDsl.g:10092:2: ( ruleStringArray )
            // InternalJsonSchemaDsl.g:10093:3: ruleStringArray
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
    // InternalJsonSchemaDsl.g:10102:1: rule__StringArray__ValuesAssignment_2_0 : ( ruleEString ) ;
    public final void rule__StringArray__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10106:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:10107:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:10107:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:10108:3: ruleEString
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
    // InternalJsonSchemaDsl.g:10117:1: rule__StringArray__ValuesAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__StringArray__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonSchemaDsl.g:10121:1: ( ( ruleEString ) )
            // InternalJsonSchemaDsl.g:10122:2: ( ruleEString )
            {
            // InternalJsonSchemaDsl.g:10122:2: ( ruleEString )
            // InternalJsonSchemaDsl.g:10123:3: ruleEString
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
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\1\60\62\uffff";
    static final String dfa_3s = "\1\5\57\106\1\uffff\1\14\1\uffff";
    static final String dfa_4s = "\1\73\57\106\1\uffff\1\107\1\uffff";
    static final String dfa_5s = "\60\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\63\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57",
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
            "\2\60\65\uffff\1\60\3\uffff\1\62",
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
            return "8585:2: ( rule__DependenciesAnyOf__DependenciesAnyOf2Assignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0FFEDFFFFFFFC020L,0x0000000000000090L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0FFEDFFFFFFFC020L,0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0FFFFFFFFFFFC020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0FFFFFFFFFFFF070L,0x0000000000000688L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003000L,0x0000000000000088L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0FFFFFFFFFFFC020L,0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000087L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0FFFFFFFFFFFF070L,0x0000000000000788L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0FFFFFFFFFFFC020L,0x0000000000000100L});

}