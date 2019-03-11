package org.xtext.example.sml.ide.contentassist.antlr.internal;

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
import org.xtext.example.sml.services.SmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'e-puck'", "'foot-boot'", "'uniform'", "'gaussian'", "'constant'", "'objects'", "'obstacles'", "'Circle'", "'Polygon'", "'Triangle'", "'Rectangle'", "'red'", "'yellow'", "'green'", "'The'", "'arena'", "'contains'", "'the'", "'following'", "'elements'", "':'", "'distributed'", "'with'", "'a'", "'distribution'", "'in'", "'robot'", "'swarm'", "'consists'", "'of'", "'are'", "'light'", "'sources'", "'object'", "'as'", "'obstacle'", "'source'", "'emitting'", "'is'", "'placed'", "'center'", "'reference point'", "'point'", "'and'", "'radius'", "'length'", "',width'", "'height'", "'.'", "'less'", "'than'", "'or'", "'equal'", "'more'", "'between'", "'There'", "'An'", "'A'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalSmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSml.g"; }


    	private SmlGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSml.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSml.g:54:1: ( ruleModel EOF )
            // InternalSml.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSml.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSml.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSml.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSml.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSml.g:69:3: ( rule__Model__Group__0 )
            // InternalSml.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEnvironment"
    // InternalSml.g:78:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalSml.g:79:1: ( ruleEnvironment EOF )
            // InternalSml.g:80:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalSml.g:87:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:91:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalSml.g:92:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalSml.g:92:2: ( ( rule__Environment__Group__0 ) )
            // InternalSml.g:93:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalSml.g:94:3: ( rule__Environment__Group__0 )
            // InternalSml.g:94:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleProbabilisticDecription"
    // InternalSml.g:103:1: entryRuleProbabilisticDecription : ruleProbabilisticDecription EOF ;
    public final void entryRuleProbabilisticDecription() throws RecognitionException {
        try {
            // InternalSml.g:104:1: ( ruleProbabilisticDecription EOF )
            // InternalSml.g:105:1: ruleProbabilisticDecription EOF
            {
             before(grammarAccess.getProbabilisticDecriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleProbabilisticDecription();

            state._fsp--;

             after(grammarAccess.getProbabilisticDecriptionRule()); 
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
    // $ANTLR end "entryRuleProbabilisticDecription"


    // $ANTLR start "ruleProbabilisticDecription"
    // InternalSml.g:112:1: ruleProbabilisticDecription : ( ( rule__ProbabilisticDecription__Group__0 ) ) ;
    public final void ruleProbabilisticDecription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:116:2: ( ( ( rule__ProbabilisticDecription__Group__0 ) ) )
            // InternalSml.g:117:2: ( ( rule__ProbabilisticDecription__Group__0 ) )
            {
            // InternalSml.g:117:2: ( ( rule__ProbabilisticDecription__Group__0 ) )
            // InternalSml.g:118:3: ( rule__ProbabilisticDecription__Group__0 )
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getGroup()); 
            // InternalSml.g:119:3: ( rule__ProbabilisticDecription__Group__0 )
            // InternalSml.g:119:4: rule__ProbabilisticDecription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProbabilisticDecriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbabilisticDecription"


    // $ANTLR start "entryRuleSwarmconf"
    // InternalSml.g:128:1: entryRuleSwarmconf : ruleSwarmconf EOF ;
    public final void entryRuleSwarmconf() throws RecognitionException {
        try {
            // InternalSml.g:129:1: ( ruleSwarmconf EOF )
            // InternalSml.g:130:1: ruleSwarmconf EOF
            {
             before(grammarAccess.getSwarmconfRule()); 
            pushFollow(FOLLOW_1);
            ruleSwarmconf();

            state._fsp--;

             after(grammarAccess.getSwarmconfRule()); 
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
    // $ANTLR end "entryRuleSwarmconf"


    // $ANTLR start "ruleSwarmconf"
    // InternalSml.g:137:1: ruleSwarmconf : ( ( rule__Swarmconf__Group__0 ) ) ;
    public final void ruleSwarmconf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:141:2: ( ( ( rule__Swarmconf__Group__0 ) ) )
            // InternalSml.g:142:2: ( ( rule__Swarmconf__Group__0 ) )
            {
            // InternalSml.g:142:2: ( ( rule__Swarmconf__Group__0 ) )
            // InternalSml.g:143:3: ( rule__Swarmconf__Group__0 )
            {
             before(grammarAccess.getSwarmconfAccess().getGroup()); 
            // InternalSml.g:144:3: ( rule__Swarmconf__Group__0 )
            // InternalSml.g:144:4: rule__Swarmconf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSwarmconfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwarmconf"


    // $ANTLR start "entryRuleRobot"
    // InternalSml.g:153:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalSml.g:154:1: ( ruleRobot EOF )
            // InternalSml.g:155:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalSml.g:162:1: ruleRobot : ( ( rule__Robot__Alternatives ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:166:2: ( ( ( rule__Robot__Alternatives ) ) )
            // InternalSml.g:167:2: ( ( rule__Robot__Alternatives ) )
            {
            // InternalSml.g:167:2: ( ( rule__Robot__Alternatives ) )
            // InternalSml.g:168:3: ( rule__Robot__Alternatives )
            {
             before(grammarAccess.getRobotAccess().getAlternatives()); 
            // InternalSml.g:169:3: ( rule__Robot__Alternatives )
            // InternalSml.g:169:4: rule__Robot__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleDistribution"
    // InternalSml.g:178:1: entryRuleDistribution : ruleDistribution EOF ;
    public final void entryRuleDistribution() throws RecognitionException {
        try {
            // InternalSml.g:179:1: ( ruleDistribution EOF )
            // InternalSml.g:180:1: ruleDistribution EOF
            {
             before(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_1);
            ruleDistribution();

            state._fsp--;

             after(grammarAccess.getDistributionRule()); 
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
    // $ANTLR end "entryRuleDistribution"


    // $ANTLR start "ruleDistribution"
    // InternalSml.g:187:1: ruleDistribution : ( ( rule__Distribution__Alternatives ) ) ;
    public final void ruleDistribution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:191:2: ( ( ( rule__Distribution__Alternatives ) ) )
            // InternalSml.g:192:2: ( ( rule__Distribution__Alternatives ) )
            {
            // InternalSml.g:192:2: ( ( rule__Distribution__Alternatives ) )
            // InternalSml.g:193:3: ( rule__Distribution__Alternatives )
            {
             before(grammarAccess.getDistributionAccess().getAlternatives()); 
            // InternalSml.g:194:3: ( rule__Distribution__Alternatives )
            // InternalSml.g:194:4: rule__Distribution__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Distribution__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistributionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleEnvironmentElements"
    // InternalSml.g:203:1: entryRuleEnvironmentElements : ruleEnvironmentElements EOF ;
    public final void entryRuleEnvironmentElements() throws RecognitionException {
        try {
            // InternalSml.g:204:1: ( ruleEnvironmentElements EOF )
            // InternalSml.g:205:1: ruleEnvironmentElements EOF
            {
             before(grammarAccess.getEnvironmentElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentElements();

            state._fsp--;

             after(grammarAccess.getEnvironmentElementsRule()); 
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
    // $ANTLR end "entryRuleEnvironmentElements"


    // $ANTLR start "ruleEnvironmentElements"
    // InternalSml.g:212:1: ruleEnvironmentElements : ( ( rule__EnvironmentElements__Alternatives ) ) ;
    public final void ruleEnvironmentElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:216:2: ( ( ( rule__EnvironmentElements__Alternatives ) ) )
            // InternalSml.g:217:2: ( ( rule__EnvironmentElements__Alternatives ) )
            {
            // InternalSml.g:217:2: ( ( rule__EnvironmentElements__Alternatives ) )
            // InternalSml.g:218:3: ( rule__EnvironmentElements__Alternatives )
            {
             before(grammarAccess.getEnvironmentElementsAccess().getAlternatives()); 
            // InternalSml.g:219:3: ( rule__EnvironmentElements__Alternatives )
            // InternalSml.g:219:4: rule__EnvironmentElements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironmentElements"


    // $ANTLR start "entryRuleEnvironmentElement"
    // InternalSml.g:228:1: entryRuleEnvironmentElement : ruleEnvironmentElement EOF ;
    public final void entryRuleEnvironmentElement() throws RecognitionException {
        try {
            // InternalSml.g:229:1: ( ruleEnvironmentElement EOF )
            // InternalSml.g:230:1: ruleEnvironmentElement EOF
            {
             before(grammarAccess.getEnvironmentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentElement();

            state._fsp--;

             after(grammarAccess.getEnvironmentElementRule()); 
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
    // $ANTLR end "entryRuleEnvironmentElement"


    // $ANTLR start "ruleEnvironmentElement"
    // InternalSml.g:237:1: ruleEnvironmentElement : ( ( rule__EnvironmentElement__Alternatives ) ) ;
    public final void ruleEnvironmentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:241:2: ( ( ( rule__EnvironmentElement__Alternatives ) ) )
            // InternalSml.g:242:2: ( ( rule__EnvironmentElement__Alternatives ) )
            {
            // InternalSml.g:242:2: ( ( rule__EnvironmentElement__Alternatives ) )
            // InternalSml.g:243:3: ( rule__EnvironmentElement__Alternatives )
            {
             before(grammarAccess.getEnvironmentElementAccess().getAlternatives()); 
            // InternalSml.g:244:3: ( rule__EnvironmentElement__Alternatives )
            // InternalSml.g:244:4: rule__EnvironmentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironmentElement"


    // $ANTLR start "entryRuleElementDescription"
    // InternalSml.g:253:1: entryRuleElementDescription : ruleElementDescription EOF ;
    public final void entryRuleElementDescription() throws RecognitionException {
        try {
            // InternalSml.g:254:1: ( ruleElementDescription EOF )
            // InternalSml.g:255:1: ruleElementDescription EOF
            {
             before(grammarAccess.getElementDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleElementDescription();

            state._fsp--;

             after(grammarAccess.getElementDescriptionRule()); 
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
    // $ANTLR end "entryRuleElementDescription"


    // $ANTLR start "ruleElementDescription"
    // InternalSml.g:262:1: ruleElementDescription : ( ( rule__ElementDescription__Group__0 ) ) ;
    public final void ruleElementDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:266:2: ( ( ( rule__ElementDescription__Group__0 ) ) )
            // InternalSml.g:267:2: ( ( rule__ElementDescription__Group__0 ) )
            {
            // InternalSml.g:267:2: ( ( rule__ElementDescription__Group__0 ) )
            // InternalSml.g:268:3: ( rule__ElementDescription__Group__0 )
            {
             before(grammarAccess.getElementDescriptionAccess().getGroup()); 
            // InternalSml.g:269:3: ( rule__ElementDescription__Group__0 )
            // InternalSml.g:269:4: rule__ElementDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementDescription"


    // $ANTLR start "entryRuleElement"
    // InternalSml.g:278:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSml.g:279:1: ( ruleElement EOF )
            // InternalSml.g:280:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSml.g:287:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:291:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalSml.g:292:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalSml.g:292:2: ( ( rule__Element__Alternatives ) )
            // InternalSml.g:293:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalSml.g:294:3: ( rule__Element__Alternatives )
            // InternalSml.g:294:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleObject"
    // InternalSml.g:303:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalSml.g:304:1: ( ruleObject EOF )
            // InternalSml.g:305:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalSml.g:312:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:316:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalSml.g:317:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalSml.g:317:2: ( ( rule__Object__Group__0 ) )
            // InternalSml.g:318:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalSml.g:319:3: ( rule__Object__Group__0 )
            // InternalSml.g:319:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleObstacle"
    // InternalSml.g:328:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalSml.g:329:1: ( ruleObstacle EOF )
            // InternalSml.g:330:1: ruleObstacle EOF
            {
             before(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacle();

            state._fsp--;

             after(grammarAccess.getObstacleRule()); 
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
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalSml.g:337:1: ruleObstacle : ( ( rule__Obstacle__Group__0 ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:341:2: ( ( ( rule__Obstacle__Group__0 ) ) )
            // InternalSml.g:342:2: ( ( rule__Obstacle__Group__0 ) )
            {
            // InternalSml.g:342:2: ( ( rule__Obstacle__Group__0 ) )
            // InternalSml.g:343:3: ( rule__Obstacle__Group__0 )
            {
             before(grammarAccess.getObstacleAccess().getGroup()); 
            // InternalSml.g:344:3: ( rule__Obstacle__Group__0 )
            // InternalSml.g:344:4: rule__Obstacle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleLight"
    // InternalSml.g:353:1: entryRuleLight : ruleLight EOF ;
    public final void entryRuleLight() throws RecognitionException {
        try {
            // InternalSml.g:354:1: ( ruleLight EOF )
            // InternalSml.g:355:1: ruleLight EOF
            {
             before(grammarAccess.getLightRule()); 
            pushFollow(FOLLOW_1);
            ruleLight();

            state._fsp--;

             after(grammarAccess.getLightRule()); 
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
    // $ANTLR end "entryRuleLight"


    // $ANTLR start "ruleLight"
    // InternalSml.g:362:1: ruleLight : ( ( rule__Light__Group__0 ) ) ;
    public final void ruleLight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:366:2: ( ( ( rule__Light__Group__0 ) ) )
            // InternalSml.g:367:2: ( ( rule__Light__Group__0 ) )
            {
            // InternalSml.g:367:2: ( ( rule__Light__Group__0 ) )
            // InternalSml.g:368:3: ( rule__Light__Group__0 )
            {
             before(grammarAccess.getLightAccess().getGroup()); 
            // InternalSml.g:369:3: ( rule__Light__Group__0 )
            // InternalSml.g:369:4: rule__Light__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Light__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLight"


    // $ANTLR start "entryRulePosition"
    // InternalSml.g:378:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalSml.g:379:1: ( rulePosition EOF )
            // InternalSml.g:380:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalSml.g:387:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:391:2: ( ( ( rule__Position__Alternatives ) ) )
            // InternalSml.g:392:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalSml.g:392:2: ( ( rule__Position__Alternatives ) )
            // InternalSml.g:393:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalSml.g:394:3: ( rule__Position__Alternatives )
            // InternalSml.g:394:4: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleShape"
    // InternalSml.g:403:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // InternalSml.g:404:1: ( ruleShape EOF )
            // InternalSml.g:405:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalSml.g:412:1: ruleShape : ( ( rule__Shape__Alternatives ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:416:2: ( ( ( rule__Shape__Alternatives ) ) )
            // InternalSml.g:417:2: ( ( rule__Shape__Alternatives ) )
            {
            // InternalSml.g:417:2: ( ( rule__Shape__Alternatives ) )
            // InternalSml.g:418:3: ( rule__Shape__Alternatives )
            {
             before(grammarAccess.getShapeAccess().getAlternatives()); 
            // InternalSml.g:419:3: ( rule__Shape__Alternatives )
            // InternalSml.g:419:4: rule__Shape__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleArena"
    // InternalSml.g:428:1: entryRuleArena : ruleArena EOF ;
    public final void entryRuleArena() throws RecognitionException {
        try {
            // InternalSml.g:429:1: ( ruleArena EOF )
            // InternalSml.g:430:1: ruleArena EOF
            {
             before(grammarAccess.getArenaRule()); 
            pushFollow(FOLLOW_1);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getArenaRule()); 
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
    // $ANTLR end "entryRuleArena"


    // $ANTLR start "ruleArena"
    // InternalSml.g:437:1: ruleArena : ( ( rule__Arena__Group__0 ) ) ;
    public final void ruleArena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:441:2: ( ( ( rule__Arena__Group__0 ) ) )
            // InternalSml.g:442:2: ( ( rule__Arena__Group__0 ) )
            {
            // InternalSml.g:442:2: ( ( rule__Arena__Group__0 ) )
            // InternalSml.g:443:3: ( rule__Arena__Group__0 )
            {
             before(grammarAccess.getArenaAccess().getGroup()); 
            // InternalSml.g:444:3: ( rule__Arena__Group__0 )
            // InternalSml.g:444:4: rule__Arena__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArena"


    // $ANTLR start "entryRuleColor"
    // InternalSml.g:453:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalSml.g:454:1: ( ruleColor EOF )
            // InternalSml.g:455:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSml.g:462:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:466:2: ( ( ( rule__Color__Alternatives ) ) )
            // InternalSml.g:467:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalSml.g:467:2: ( ( rule__Color__Alternatives ) )
            // InternalSml.g:468:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalSml.g:469:3: ( rule__Color__Alternatives )
            // InternalSml.g:469:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleRegion"
    // InternalSml.g:478:1: entryRuleRegion : ruleRegion EOF ;
    public final void entryRuleRegion() throws RecognitionException {
        try {
            // InternalSml.g:479:1: ( ruleRegion EOF )
            // InternalSml.g:480:1: ruleRegion EOF
            {
             before(grammarAccess.getRegionRule()); 
            pushFollow(FOLLOW_1);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getRegionRule()); 
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
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalSml.g:487:1: ruleRegion : ( ( rule__Region__Group__0 ) ) ;
    public final void ruleRegion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:491:2: ( ( ( rule__Region__Group__0 ) ) )
            // InternalSml.g:492:2: ( ( rule__Region__Group__0 ) )
            {
            // InternalSml.g:492:2: ( ( rule__Region__Group__0 ) )
            // InternalSml.g:493:3: ( rule__Region__Group__0 )
            {
             before(grammarAccess.getRegionAccess().getGroup()); 
            // InternalSml.g:494:3: ( rule__Region__Group__0 )
            // InternalSml.g:494:4: rule__Region__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Region__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleDimension"
    // InternalSml.g:503:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // InternalSml.g:504:1: ( ruleDimension EOF )
            // InternalSml.g:505:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
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
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalSml.g:512:1: ruleDimension : ( ( rule__Dimension__Alternatives ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:516:2: ( ( ( rule__Dimension__Alternatives ) ) )
            // InternalSml.g:517:2: ( ( rule__Dimension__Alternatives ) )
            {
            // InternalSml.g:517:2: ( ( rule__Dimension__Alternatives ) )
            // InternalSml.g:518:3: ( rule__Dimension__Alternatives )
            {
             before(grammarAccess.getDimensionAccess().getAlternatives()); 
            // InternalSml.g:519:3: ( rule__Dimension__Alternatives )
            // InternalSml.g:519:4: rule__Dimension__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleCircleD"
    // InternalSml.g:528:1: entryRuleCircleD : ruleCircleD EOF ;
    public final void entryRuleCircleD() throws RecognitionException {
        try {
            // InternalSml.g:529:1: ( ruleCircleD EOF )
            // InternalSml.g:530:1: ruleCircleD EOF
            {
             before(grammarAccess.getCircleDRule()); 
            pushFollow(FOLLOW_1);
            ruleCircleD();

            state._fsp--;

             after(grammarAccess.getCircleDRule()); 
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
    // $ANTLR end "entryRuleCircleD"


    // $ANTLR start "ruleCircleD"
    // InternalSml.g:537:1: ruleCircleD : ( ( rule__CircleD__Group__0 ) ) ;
    public final void ruleCircleD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:541:2: ( ( ( rule__CircleD__Group__0 ) ) )
            // InternalSml.g:542:2: ( ( rule__CircleD__Group__0 ) )
            {
            // InternalSml.g:542:2: ( ( rule__CircleD__Group__0 ) )
            // InternalSml.g:543:3: ( rule__CircleD__Group__0 )
            {
             before(grammarAccess.getCircleDAccess().getGroup()); 
            // InternalSml.g:544:3: ( rule__CircleD__Group__0 )
            // InternalSml.g:544:4: rule__CircleD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CircleD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCircleDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCircleD"


    // $ANTLR start "entryRuleRectangleD"
    // InternalSml.g:553:1: entryRuleRectangleD : ruleRectangleD EOF ;
    public final void entryRuleRectangleD() throws RecognitionException {
        try {
            // InternalSml.g:554:1: ( ruleRectangleD EOF )
            // InternalSml.g:555:1: ruleRectangleD EOF
            {
             before(grammarAccess.getRectangleDRule()); 
            pushFollow(FOLLOW_1);
            ruleRectangleD();

            state._fsp--;

             after(grammarAccess.getRectangleDRule()); 
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
    // $ANTLR end "entryRuleRectangleD"


    // $ANTLR start "ruleRectangleD"
    // InternalSml.g:562:1: ruleRectangleD : ( ( rule__RectangleD__Group__0 ) ) ;
    public final void ruleRectangleD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:566:2: ( ( ( rule__RectangleD__Group__0 ) ) )
            // InternalSml.g:567:2: ( ( rule__RectangleD__Group__0 ) )
            {
            // InternalSml.g:567:2: ( ( rule__RectangleD__Group__0 ) )
            // InternalSml.g:568:3: ( rule__RectangleD__Group__0 )
            {
             before(grammarAccess.getRectangleDAccess().getGroup()); 
            // InternalSml.g:569:3: ( rule__RectangleD__Group__0 )
            // InternalSml.g:569:4: rule__RectangleD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRectangleD"


    // $ANTLR start "entryRuleCoordinate"
    // InternalSml.g:578:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalSml.g:579:1: ( ruleCoordinate EOF )
            // InternalSml.g:580:1: ruleCoordinate EOF
            {
             before(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinateRule()); 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalSml.g:587:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:591:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalSml.g:592:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalSml.g:592:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalSml.g:593:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalSml.g:594:3: ( rule__Coordinate__Group__0 )
            // InternalSml.g:594:4: rule__Coordinate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleDouble"
    // InternalSml.g:603:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalSml.g:604:1: ( ruleDouble EOF )
            // InternalSml.g:605:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalSml.g:612:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:616:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalSml.g:617:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalSml.g:617:2: ( ( rule__Double__Group__0 ) )
            // InternalSml.g:618:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalSml.g:619:3: ( rule__Double__Group__0 )
            // InternalSml.g:619:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleRange"
    // InternalSml.g:628:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalSml.g:629:1: ( ruleRange EOF )
            // InternalSml.g:630:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalSml.g:637:1: ruleRange : ( ( rule__Range__Alternatives ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:641:2: ( ( ( rule__Range__Alternatives ) ) )
            // InternalSml.g:642:2: ( ( rule__Range__Alternatives ) )
            {
            // InternalSml.g:642:2: ( ( rule__Range__Alternatives ) )
            // InternalSml.g:643:3: ( rule__Range__Alternatives )
            {
             before(grammarAccess.getRangeAccess().getAlternatives()); 
            // InternalSml.g:644:3: ( rule__Range__Alternatives )
            // InternalSml.g:644:4: rule__Range__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Range__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleConstantSize"
    // InternalSml.g:653:1: entryRuleConstantSize : ruleConstantSize EOF ;
    public final void entryRuleConstantSize() throws RecognitionException {
        try {
            // InternalSml.g:654:1: ( ruleConstantSize EOF )
            // InternalSml.g:655:1: ruleConstantSize EOF
            {
             before(grammarAccess.getConstantSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantSize();

            state._fsp--;

             after(grammarAccess.getConstantSizeRule()); 
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
    // $ANTLR end "entryRuleConstantSize"


    // $ANTLR start "ruleConstantSize"
    // InternalSml.g:662:1: ruleConstantSize : ( ( rule__ConstantSize__NAssignment ) ) ;
    public final void ruleConstantSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:666:2: ( ( ( rule__ConstantSize__NAssignment ) ) )
            // InternalSml.g:667:2: ( ( rule__ConstantSize__NAssignment ) )
            {
            // InternalSml.g:667:2: ( ( rule__ConstantSize__NAssignment ) )
            // InternalSml.g:668:3: ( rule__ConstantSize__NAssignment )
            {
             before(grammarAccess.getConstantSizeAccess().getNAssignment()); 
            // InternalSml.g:669:3: ( rule__ConstantSize__NAssignment )
            // InternalSml.g:669:4: rule__ConstantSize__NAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstantSize__NAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstantSizeAccess().getNAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantSize"


    // $ANTLR start "entryRuleLowerbound"
    // InternalSml.g:678:1: entryRuleLowerbound : ruleLowerbound EOF ;
    public final void entryRuleLowerbound() throws RecognitionException {
        try {
            // InternalSml.g:679:1: ( ruleLowerbound EOF )
            // InternalSml.g:680:1: ruleLowerbound EOF
            {
             before(grammarAccess.getLowerboundRule()); 
            pushFollow(FOLLOW_1);
            ruleLowerbound();

            state._fsp--;

             after(grammarAccess.getLowerboundRule()); 
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
    // $ANTLR end "entryRuleLowerbound"


    // $ANTLR start "ruleLowerbound"
    // InternalSml.g:687:1: ruleLowerbound : ( ( rule__Lowerbound__Group__0 ) ) ;
    public final void ruleLowerbound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:691:2: ( ( ( rule__Lowerbound__Group__0 ) ) )
            // InternalSml.g:692:2: ( ( rule__Lowerbound__Group__0 ) )
            {
            // InternalSml.g:692:2: ( ( rule__Lowerbound__Group__0 ) )
            // InternalSml.g:693:3: ( rule__Lowerbound__Group__0 )
            {
             before(grammarAccess.getLowerboundAccess().getGroup()); 
            // InternalSml.g:694:3: ( rule__Lowerbound__Group__0 )
            // InternalSml.g:694:4: rule__Lowerbound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lowerbound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLowerboundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLowerbound"


    // $ANTLR start "entryRuleLowerorEqualbound"
    // InternalSml.g:703:1: entryRuleLowerorEqualbound : ruleLowerorEqualbound EOF ;
    public final void entryRuleLowerorEqualbound() throws RecognitionException {
        try {
            // InternalSml.g:704:1: ( ruleLowerorEqualbound EOF )
            // InternalSml.g:705:1: ruleLowerorEqualbound EOF
            {
             before(grammarAccess.getLowerorEqualboundRule()); 
            pushFollow(FOLLOW_1);
            ruleLowerorEqualbound();

            state._fsp--;

             after(grammarAccess.getLowerorEqualboundRule()); 
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
    // $ANTLR end "entryRuleLowerorEqualbound"


    // $ANTLR start "ruleLowerorEqualbound"
    // InternalSml.g:712:1: ruleLowerorEqualbound : ( ( rule__LowerorEqualbound__Group__0 ) ) ;
    public final void ruleLowerorEqualbound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:716:2: ( ( ( rule__LowerorEqualbound__Group__0 ) ) )
            // InternalSml.g:717:2: ( ( rule__LowerorEqualbound__Group__0 ) )
            {
            // InternalSml.g:717:2: ( ( rule__LowerorEqualbound__Group__0 ) )
            // InternalSml.g:718:3: ( rule__LowerorEqualbound__Group__0 )
            {
             before(grammarAccess.getLowerorEqualboundAccess().getGroup()); 
            // InternalSml.g:719:3: ( rule__LowerorEqualbound__Group__0 )
            // InternalSml.g:719:4: rule__LowerorEqualbound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLowerorEqualboundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLowerorEqualbound"


    // $ANTLR start "entryRuleUpperbound"
    // InternalSml.g:728:1: entryRuleUpperbound : ruleUpperbound EOF ;
    public final void entryRuleUpperbound() throws RecognitionException {
        try {
            // InternalSml.g:729:1: ( ruleUpperbound EOF )
            // InternalSml.g:730:1: ruleUpperbound EOF
            {
             before(grammarAccess.getUpperboundRule()); 
            pushFollow(FOLLOW_1);
            ruleUpperbound();

            state._fsp--;

             after(grammarAccess.getUpperboundRule()); 
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
    // $ANTLR end "entryRuleUpperbound"


    // $ANTLR start "ruleUpperbound"
    // InternalSml.g:737:1: ruleUpperbound : ( ( rule__Upperbound__Group__0 ) ) ;
    public final void ruleUpperbound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:741:2: ( ( ( rule__Upperbound__Group__0 ) ) )
            // InternalSml.g:742:2: ( ( rule__Upperbound__Group__0 ) )
            {
            // InternalSml.g:742:2: ( ( rule__Upperbound__Group__0 ) )
            // InternalSml.g:743:3: ( rule__Upperbound__Group__0 )
            {
             before(grammarAccess.getUpperboundAccess().getGroup()); 
            // InternalSml.g:744:3: ( rule__Upperbound__Group__0 )
            // InternalSml.g:744:4: rule__Upperbound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Upperbound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpperboundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpperbound"


    // $ANTLR start "entryRuleUpperorEqualbound"
    // InternalSml.g:753:1: entryRuleUpperorEqualbound : ruleUpperorEqualbound EOF ;
    public final void entryRuleUpperorEqualbound() throws RecognitionException {
        try {
            // InternalSml.g:754:1: ( ruleUpperorEqualbound EOF )
            // InternalSml.g:755:1: ruleUpperorEqualbound EOF
            {
             before(grammarAccess.getUpperorEqualboundRule()); 
            pushFollow(FOLLOW_1);
            ruleUpperorEqualbound();

            state._fsp--;

             after(grammarAccess.getUpperorEqualboundRule()); 
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
    // $ANTLR end "entryRuleUpperorEqualbound"


    // $ANTLR start "ruleUpperorEqualbound"
    // InternalSml.g:762:1: ruleUpperorEqualbound : ( ( rule__UpperorEqualbound__Group__0 ) ) ;
    public final void ruleUpperorEqualbound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:766:2: ( ( ( rule__UpperorEqualbound__Group__0 ) ) )
            // InternalSml.g:767:2: ( ( rule__UpperorEqualbound__Group__0 ) )
            {
            // InternalSml.g:767:2: ( ( rule__UpperorEqualbound__Group__0 ) )
            // InternalSml.g:768:3: ( rule__UpperorEqualbound__Group__0 )
            {
             before(grammarAccess.getUpperorEqualboundAccess().getGroup()); 
            // InternalSml.g:769:3: ( rule__UpperorEqualbound__Group__0 )
            // InternalSml.g:769:4: rule__UpperorEqualbound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpperorEqualboundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpperorEqualbound"


    // $ANTLR start "entryRuleInterval"
    // InternalSml.g:778:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSml.g:779:1: ( ruleInterval EOF )
            // InternalSml.g:780:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSml.g:787:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:791:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSml.g:792:2: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSml.g:792:2: ( ( rule__Interval__Group__0 ) )
            // InternalSml.g:793:3: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSml.g:794:3: ( rule__Interval__Group__0 )
            // InternalSml.g:794:4: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "rule__Robot__Alternatives"
    // InternalSml.g:802:1: rule__Robot__Alternatives : ( ( 'e-puck' ) | ( 'foot-boot' ) );
    public final void rule__Robot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:806:1: ( ( 'e-puck' ) | ( 'foot-boot' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSml.g:807:2: ( 'e-puck' )
                    {
                    // InternalSml.g:807:2: ( 'e-puck' )
                    // InternalSml.g:808:3: 'e-puck'
                    {
                     before(grammarAccess.getRobotAccess().getEPuckKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRobotAccess().getEPuckKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:813:2: ( 'foot-boot' )
                    {
                    // InternalSml.g:813:2: ( 'foot-boot' )
                    // InternalSml.g:814:3: 'foot-boot'
                    {
                     before(grammarAccess.getRobotAccess().getFootBootKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRobotAccess().getFootBootKeyword_1()); 

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
    // $ANTLR end "rule__Robot__Alternatives"


    // $ANTLR start "rule__Distribution__Alternatives"
    // InternalSml.g:823:1: rule__Distribution__Alternatives : ( ( 'uniform' ) | ( 'gaussian' ) | ( 'constant' ) );
    public final void rule__Distribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:827:1: ( ( 'uniform' ) | ( 'gaussian' ) | ( 'constant' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSml.g:828:2: ( 'uniform' )
                    {
                    // InternalSml.g:828:2: ( 'uniform' )
                    // InternalSml.g:829:3: 'uniform'
                    {
                     before(grammarAccess.getDistributionAccess().getUniformKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDistributionAccess().getUniformKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:834:2: ( 'gaussian' )
                    {
                    // InternalSml.g:834:2: ( 'gaussian' )
                    // InternalSml.g:835:3: 'gaussian'
                    {
                     before(grammarAccess.getDistributionAccess().getGaussianKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDistributionAccess().getGaussianKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:840:2: ( 'constant' )
                    {
                    // InternalSml.g:840:2: ( 'constant' )
                    // InternalSml.g:841:3: 'constant'
                    {
                     before(grammarAccess.getDistributionAccess().getConstantKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDistributionAccess().getConstantKeyword_2()); 

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
    // $ANTLR end "rule__Distribution__Alternatives"


    // $ANTLR start "rule__EnvironmentElements__Alternatives"
    // InternalSml.g:850:1: rule__EnvironmentElements__Alternatives : ( ( ruleEnvironmentElement ) | ( ruleElementDescription ) );
    public final void rule__EnvironmentElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:854:1: ( ( ruleEnvironmentElement ) | ( ruleElementDescription ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=67 && LA3_0<=68)) ) {
                alt3=1;
            }
            else if ( (LA3_0==66) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSml.g:855:2: ( ruleEnvironmentElement )
                    {
                    // InternalSml.g:855:2: ( ruleEnvironmentElement )
                    // InternalSml.g:856:3: ruleEnvironmentElement
                    {
                     before(grammarAccess.getEnvironmentElementsAccess().getEnvironmentElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvironmentElement();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentElementsAccess().getEnvironmentElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:861:2: ( ruleElementDescription )
                    {
                    // InternalSml.g:861:2: ( ruleElementDescription )
                    // InternalSml.g:862:3: ruleElementDescription
                    {
                     before(grammarAccess.getEnvironmentElementsAccess().getElementDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElementDescription();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentElementsAccess().getElementDescriptionParserRuleCall_1()); 

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
    // $ANTLR end "rule__EnvironmentElements__Alternatives"


    // $ANTLR start "rule__EnvironmentElement__Alternatives"
    // InternalSml.g:871:1: rule__EnvironmentElement__Alternatives : ( ( ruleObstacle ) | ( ruleLight ) | ( ruleObject ) );
    public final void rule__EnvironmentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:875:1: ( ( ruleObstacle ) | ( ruleLight ) | ( ruleObject ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==67) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==46) ) {
                    alt4=1;
                }
                else if ( (LA4_1==44) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==68) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSml.g:876:2: ( ruleObstacle )
                    {
                    // InternalSml.g:876:2: ( ruleObstacle )
                    // InternalSml.g:877:3: ruleObstacle
                    {
                     before(grammarAccess.getEnvironmentElementAccess().getObstacleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObstacle();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentElementAccess().getObstacleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:882:2: ( ruleLight )
                    {
                    // InternalSml.g:882:2: ( ruleLight )
                    // InternalSml.g:883:3: ruleLight
                    {
                     before(grammarAccess.getEnvironmentElementAccess().getLightParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLight();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentElementAccess().getLightParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:888:2: ( ruleObject )
                    {
                    // InternalSml.g:888:2: ( ruleObject )
                    // InternalSml.g:889:3: ruleObject
                    {
                     before(grammarAccess.getEnvironmentElementAccess().getObjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentElementAccess().getObjectParserRuleCall_2()); 

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
    // $ANTLR end "rule__EnvironmentElement__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalSml.g:898:1: rule__Element__Alternatives : ( ( 'objects' ) | ( 'obstacles' ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:902:1: ( ( 'objects' ) | ( 'obstacles' ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSml.g:903:2: ( 'objects' )
                    {
                    // InternalSml.g:903:2: ( 'objects' )
                    // InternalSml.g:904:3: 'objects'
                    {
                     before(grammarAccess.getElementAccess().getObjectsKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getObjectsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:909:2: ( 'obstacles' )
                    {
                    // InternalSml.g:909:2: ( 'obstacles' )
                    // InternalSml.g:910:3: 'obstacles'
                    {
                     before(grammarAccess.getElementAccess().getObstaclesKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getElementAccess().getObstaclesKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:915:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalSml.g:915:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalSml.g:916:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalSml.g:917:3: ( rule__Element__Group_2__0 )
                    // InternalSml.g:917:4: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // InternalSml.g:925:1: rule__Position__Alternatives : ( ( ( rule__Position__Group_0__0 ) ) | ( ( rule__Position__Group_1__0 ) ) | ( ( rule__Position__Group_2__0 ) ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:929:1: ( ( ( rule__Position__Group_0__0 ) ) | ( ( rule__Position__Group_1__0 ) ) | ( ( rule__Position__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt6=1;
                }
                break;
            case 52:
                {
                alt6=2;
                }
                break;
            case 53:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSml.g:930:2: ( ( rule__Position__Group_0__0 ) )
                    {
                    // InternalSml.g:930:2: ( ( rule__Position__Group_0__0 ) )
                    // InternalSml.g:931:3: ( rule__Position__Group_0__0 )
                    {
                     before(grammarAccess.getPositionAccess().getGroup_0()); 
                    // InternalSml.g:932:3: ( rule__Position__Group_0__0 )
                    // InternalSml.g:932:4: rule__Position__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPositionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:936:2: ( ( rule__Position__Group_1__0 ) )
                    {
                    // InternalSml.g:936:2: ( ( rule__Position__Group_1__0 ) )
                    // InternalSml.g:937:3: ( rule__Position__Group_1__0 )
                    {
                     before(grammarAccess.getPositionAccess().getGroup_1()); 
                    // InternalSml.g:938:3: ( rule__Position__Group_1__0 )
                    // InternalSml.g:938:4: rule__Position__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPositionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:942:2: ( ( rule__Position__Group_2__0 ) )
                    {
                    // InternalSml.g:942:2: ( ( rule__Position__Group_2__0 ) )
                    // InternalSml.g:943:3: ( rule__Position__Group_2__0 )
                    {
                     before(grammarAccess.getPositionAccess().getGroup_2()); 
                    // InternalSml.g:944:3: ( rule__Position__Group_2__0 )
                    // InternalSml.g:944:4: rule__Position__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPositionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__Shape__Alternatives"
    // InternalSml.g:952:1: rule__Shape__Alternatives : ( ( 'Circle' ) | ( 'Polygon' ) | ( 'Triangle' ) | ( 'Rectangle' ) );
    public final void rule__Shape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:956:1: ( ( 'Circle' ) | ( 'Polygon' ) | ( 'Triangle' ) | ( 'Rectangle' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSml.g:957:2: ( 'Circle' )
                    {
                    // InternalSml.g:957:2: ( 'Circle' )
                    // InternalSml.g:958:3: 'Circle'
                    {
                     before(grammarAccess.getShapeAccess().getCircleKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getCircleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:963:2: ( 'Polygon' )
                    {
                    // InternalSml.g:963:2: ( 'Polygon' )
                    // InternalSml.g:964:3: 'Polygon'
                    {
                     before(grammarAccess.getShapeAccess().getPolygonKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getPolygonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:969:2: ( 'Triangle' )
                    {
                    // InternalSml.g:969:2: ( 'Triangle' )
                    // InternalSml.g:970:3: 'Triangle'
                    {
                     before(grammarAccess.getShapeAccess().getTriangleKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getTriangleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSml.g:975:2: ( 'Rectangle' )
                    {
                    // InternalSml.g:975:2: ( 'Rectangle' )
                    // InternalSml.g:976:3: 'Rectangle'
                    {
                     before(grammarAccess.getShapeAccess().getRectangleKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getShapeAccess().getRectangleKeyword_3()); 

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
    // $ANTLR end "rule__Shape__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalSml.g:985:1: rule__Color__Alternatives : ( ( 'red' ) | ( 'yellow' ) | ( 'green' ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:989:1: ( ( 'red' ) | ( 'yellow' ) | ( 'green' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSml.g:990:2: ( 'red' )
                    {
                    // InternalSml.g:990:2: ( 'red' )
                    // InternalSml.g:991:3: 'red'
                    {
                     before(grammarAccess.getColorAccess().getRedKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getRedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:996:2: ( 'yellow' )
                    {
                    // InternalSml.g:996:2: ( 'yellow' )
                    // InternalSml.g:997:3: 'yellow'
                    {
                     before(grammarAccess.getColorAccess().getYellowKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getYellowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:1002:2: ( 'green' )
                    {
                    // InternalSml.g:1002:2: ( 'green' )
                    // InternalSml.g:1003:3: 'green'
                    {
                     before(grammarAccess.getColorAccess().getGreenKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getColorAccess().getGreenKeyword_2()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Dimension__Alternatives"
    // InternalSml.g:1012:1: rule__Dimension__Alternatives : ( ( ruleCircleD ) | ( ruleRectangleD ) );
    public final void rule__Dimension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1016:1: ( ( ruleCircleD ) | ( ruleRectangleD ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==55) ) {
                alt9=1;
            }
            else if ( (LA9_0==56) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSml.g:1017:2: ( ruleCircleD )
                    {
                    // InternalSml.g:1017:2: ( ruleCircleD )
                    // InternalSml.g:1018:3: ruleCircleD
                    {
                     before(grammarAccess.getDimensionAccess().getCircleDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCircleD();

                    state._fsp--;

                     after(grammarAccess.getDimensionAccess().getCircleDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1023:2: ( ruleRectangleD )
                    {
                    // InternalSml.g:1023:2: ( ruleRectangleD )
                    // InternalSml.g:1024:3: ruleRectangleD
                    {
                     before(grammarAccess.getDimensionAccess().getRectangleDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRectangleD();

                    state._fsp--;

                     after(grammarAccess.getDimensionAccess().getRectangleDParserRuleCall_1()); 

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
    // $ANTLR end "rule__Dimension__Alternatives"


    // $ANTLR start "rule__Range__Alternatives"
    // InternalSml.g:1033:1: rule__Range__Alternatives : ( ( ruleUpperbound ) | ( ruleLowerbound ) | ( ruleInterval ) | ( ruleLowerorEqualbound ) | ( ruleUpperorEqualbound ) | ( ruleConstantSize ) );
    public final void rule__Range__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1037:1: ( ( ruleUpperbound ) | ( ruleLowerbound ) | ( ruleInterval ) | ( ruleLowerorEqualbound ) | ( ruleUpperorEqualbound ) | ( ruleConstantSize ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==61) ) {
                    alt10=1;
                }
                else if ( (LA10_1==62) ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==61) ) {
                    alt10=2;
                }
                else if ( (LA10_2==62) ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                alt10=3;
                }
                break;
            case RULE_INT:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSml.g:1038:2: ( ruleUpperbound )
                    {
                    // InternalSml.g:1038:2: ( ruleUpperbound )
                    // InternalSml.g:1039:3: ruleUpperbound
                    {
                     before(grammarAccess.getRangeAccess().getUpperboundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpperbound();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getUpperboundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1044:2: ( ruleLowerbound )
                    {
                    // InternalSml.g:1044:2: ( ruleLowerbound )
                    // InternalSml.g:1045:3: ruleLowerbound
                    {
                     before(grammarAccess.getRangeAccess().getLowerboundParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLowerbound();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getLowerboundParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:1050:2: ( ruleInterval )
                    {
                    // InternalSml.g:1050:2: ( ruleInterval )
                    // InternalSml.g:1051:3: ruleInterval
                    {
                     before(grammarAccess.getRangeAccess().getIntervalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterval();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getIntervalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSml.g:1056:2: ( ruleLowerorEqualbound )
                    {
                    // InternalSml.g:1056:2: ( ruleLowerorEqualbound )
                    // InternalSml.g:1057:3: ruleLowerorEqualbound
                    {
                     before(grammarAccess.getRangeAccess().getLowerorEqualboundParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLowerorEqualbound();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getLowerorEqualboundParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSml.g:1062:2: ( ruleUpperorEqualbound )
                    {
                    // InternalSml.g:1062:2: ( ruleUpperorEqualbound )
                    // InternalSml.g:1063:3: ruleUpperorEqualbound
                    {
                     before(grammarAccess.getRangeAccess().getUpperorEqualboundParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleUpperorEqualbound();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getUpperorEqualboundParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSml.g:1068:2: ( ruleConstantSize )
                    {
                    // InternalSml.g:1068:2: ( ruleConstantSize )
                    // InternalSml.g:1069:3: ruleConstantSize
                    {
                     before(grammarAccess.getRangeAccess().getConstantSizeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantSize();

                    state._fsp--;

                     after(grammarAccess.getRangeAccess().getConstantSizeParserRuleCall_5()); 

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
    // $ANTLR end "rule__Range__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSml.g:1078:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1082:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSml.g:1083:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSml.g:1090:1: rule__Model__Group__0__Impl : ( ( rule__Model__ArenasAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1094:1: ( ( ( rule__Model__ArenasAssignment_0 ) ) )
            // InternalSml.g:1095:1: ( ( rule__Model__ArenasAssignment_0 ) )
            {
            // InternalSml.g:1095:1: ( ( rule__Model__ArenasAssignment_0 ) )
            // InternalSml.g:1096:2: ( rule__Model__ArenasAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getArenasAssignment_0()); 
            // InternalSml.g:1097:2: ( rule__Model__ArenasAssignment_0 )
            // InternalSml.g:1097:3: rule__Model__ArenasAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ArenasAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getArenasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSml.g:1105:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1109:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSml.g:1110:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSml.g:1117:1: rule__Model__Group__1__Impl : ( ( rule__Model__EnvAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1121:1: ( ( ( rule__Model__EnvAssignment_1 ) ) )
            // InternalSml.g:1122:1: ( ( rule__Model__EnvAssignment_1 ) )
            {
            // InternalSml.g:1122:1: ( ( rule__Model__EnvAssignment_1 ) )
            // InternalSml.g:1123:2: ( rule__Model__EnvAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getEnvAssignment_1()); 
            // InternalSml.g:1124:2: ( rule__Model__EnvAssignment_1 )
            // InternalSml.g:1124:3: rule__Model__EnvAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__EnvAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEnvAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalSml.g:1132:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1136:1: ( rule__Model__Group__2__Impl )
            // InternalSml.g:1137:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalSml.g:1143:1: rule__Model__Group__2__Impl : ( ( rule__Model__SwAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1147:1: ( ( ( rule__Model__SwAssignment_2 ) ) )
            // InternalSml.g:1148:1: ( ( rule__Model__SwAssignment_2 ) )
            {
            // InternalSml.g:1148:1: ( ( rule__Model__SwAssignment_2 ) )
            // InternalSml.g:1149:2: ( rule__Model__SwAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getSwAssignment_2()); 
            // InternalSml.g:1150:2: ( rule__Model__SwAssignment_2 )
            // InternalSml.g:1150:3: rule__Model__SwAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__SwAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSwAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalSml.g:1159:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1163:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalSml.g:1164:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalSml.g:1171:1: rule__Environment__Group__0__Impl : ( ( rule__Environment__Group_0__0 )? ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1175:1: ( ( ( rule__Environment__Group_0__0 )? ) )
            // InternalSml.g:1176:1: ( ( rule__Environment__Group_0__0 )? )
            {
            // InternalSml.g:1176:1: ( ( rule__Environment__Group_0__0 )? )
            // InternalSml.g:1177:2: ( rule__Environment__Group_0__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_0()); 
            // InternalSml.g:1178:2: ( rule__Environment__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalSml.g:1178:3: rule__Environment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalSml.g:1186:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1190:1: ( rule__Environment__Group__1__Impl )
            // InternalSml.g:1191:2: rule__Environment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalSml.g:1197:1: rule__Environment__Group__1__Impl : ( ( rule__Environment__EnvironmentAssignment_1 )* ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1201:1: ( ( ( rule__Environment__EnvironmentAssignment_1 )* ) )
            // InternalSml.g:1202:1: ( ( rule__Environment__EnvironmentAssignment_1 )* )
            {
            // InternalSml.g:1202:1: ( ( rule__Environment__EnvironmentAssignment_1 )* )
            // InternalSml.g:1203:2: ( rule__Environment__EnvironmentAssignment_1 )*
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAssignment_1()); 
            // InternalSml.g:1204:2: ( rule__Environment__EnvironmentAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=66 && LA12_0<=68)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSml.g:1204:3: rule__Environment__EnvironmentAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Environment__EnvironmentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group_0__0"
    // InternalSml.g:1213:1: rule__Environment__Group_0__0 : rule__Environment__Group_0__0__Impl rule__Environment__Group_0__1 ;
    public final void rule__Environment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1217:1: ( rule__Environment__Group_0__0__Impl rule__Environment__Group_0__1 )
            // InternalSml.g:1218:2: rule__Environment__Group_0__0__Impl rule__Environment__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__0"


    // $ANTLR start "rule__Environment__Group_0__0__Impl"
    // InternalSml.g:1225:1: rule__Environment__Group_0__0__Impl : ( 'The' ) ;
    public final void rule__Environment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1229:1: ( ( 'The' ) )
            // InternalSml.g:1230:1: ( 'The' )
            {
            // InternalSml.g:1230:1: ( 'The' )
            // InternalSml.g:1231:2: 'The'
            {
             before(grammarAccess.getEnvironmentAccess().getTheKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getTheKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__0__Impl"


    // $ANTLR start "rule__Environment__Group_0__1"
    // InternalSml.g:1240:1: rule__Environment__Group_0__1 : rule__Environment__Group_0__1__Impl rule__Environment__Group_0__2 ;
    public final void rule__Environment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1244:1: ( rule__Environment__Group_0__1__Impl rule__Environment__Group_0__2 )
            // InternalSml.g:1245:2: rule__Environment__Group_0__1__Impl rule__Environment__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Environment__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__1"


    // $ANTLR start "rule__Environment__Group_0__1__Impl"
    // InternalSml.g:1252:1: rule__Environment__Group_0__1__Impl : ( 'arena' ) ;
    public final void rule__Environment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1256:1: ( ( 'arena' ) )
            // InternalSml.g:1257:1: ( 'arena' )
            {
            // InternalSml.g:1257:1: ( 'arena' )
            // InternalSml.g:1258:2: 'arena'
            {
             before(grammarAccess.getEnvironmentAccess().getArenaKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getArenaKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__1__Impl"


    // $ANTLR start "rule__Environment__Group_0__2"
    // InternalSml.g:1267:1: rule__Environment__Group_0__2 : rule__Environment__Group_0__2__Impl rule__Environment__Group_0__3 ;
    public final void rule__Environment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1271:1: ( rule__Environment__Group_0__2__Impl rule__Environment__Group_0__3 )
            // InternalSml.g:1272:2: rule__Environment__Group_0__2__Impl rule__Environment__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__2"


    // $ANTLR start "rule__Environment__Group_0__2__Impl"
    // InternalSml.g:1279:1: rule__Environment__Group_0__2__Impl : ( 'contains' ) ;
    public final void rule__Environment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1283:1: ( ( 'contains' ) )
            // InternalSml.g:1284:1: ( 'contains' )
            {
            // InternalSml.g:1284:1: ( 'contains' )
            // InternalSml.g:1285:2: 'contains'
            {
             before(grammarAccess.getEnvironmentAccess().getContainsKeyword_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getContainsKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__2__Impl"


    // $ANTLR start "rule__Environment__Group_0__3"
    // InternalSml.g:1294:1: rule__Environment__Group_0__3 : rule__Environment__Group_0__3__Impl rule__Environment__Group_0__4 ;
    public final void rule__Environment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1298:1: ( rule__Environment__Group_0__3__Impl rule__Environment__Group_0__4 )
            // InternalSml.g:1299:2: rule__Environment__Group_0__3__Impl rule__Environment__Group_0__4
            {
            pushFollow(FOLLOW_9);
            rule__Environment__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__3"


    // $ANTLR start "rule__Environment__Group_0__3__Impl"
    // InternalSml.g:1306:1: rule__Environment__Group_0__3__Impl : ( 'the' ) ;
    public final void rule__Environment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1310:1: ( ( 'the' ) )
            // InternalSml.g:1311:1: ( 'the' )
            {
            // InternalSml.g:1311:1: ( 'the' )
            // InternalSml.g:1312:2: 'the'
            {
             before(grammarAccess.getEnvironmentAccess().getTheKeyword_0_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getTheKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__3__Impl"


    // $ANTLR start "rule__Environment__Group_0__4"
    // InternalSml.g:1321:1: rule__Environment__Group_0__4 : rule__Environment__Group_0__4__Impl rule__Environment__Group_0__5 ;
    public final void rule__Environment__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1325:1: ( rule__Environment__Group_0__4__Impl rule__Environment__Group_0__5 )
            // InternalSml.g:1326:2: rule__Environment__Group_0__4__Impl rule__Environment__Group_0__5
            {
            pushFollow(FOLLOW_10);
            rule__Environment__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__4"


    // $ANTLR start "rule__Environment__Group_0__4__Impl"
    // InternalSml.g:1333:1: rule__Environment__Group_0__4__Impl : ( 'following' ) ;
    public final void rule__Environment__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1337:1: ( ( 'following' ) )
            // InternalSml.g:1338:1: ( 'following' )
            {
            // InternalSml.g:1338:1: ( 'following' )
            // InternalSml.g:1339:2: 'following'
            {
             before(grammarAccess.getEnvironmentAccess().getFollowingKeyword_0_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getFollowingKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__4__Impl"


    // $ANTLR start "rule__Environment__Group_0__5"
    // InternalSml.g:1348:1: rule__Environment__Group_0__5 : rule__Environment__Group_0__5__Impl rule__Environment__Group_0__6 ;
    public final void rule__Environment__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1352:1: ( rule__Environment__Group_0__5__Impl rule__Environment__Group_0__6 )
            // InternalSml.g:1353:2: rule__Environment__Group_0__5__Impl rule__Environment__Group_0__6
            {
            pushFollow(FOLLOW_11);
            rule__Environment__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__5"


    // $ANTLR start "rule__Environment__Group_0__5__Impl"
    // InternalSml.g:1360:1: rule__Environment__Group_0__5__Impl : ( 'elements' ) ;
    public final void rule__Environment__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1364:1: ( ( 'elements' ) )
            // InternalSml.g:1365:1: ( 'elements' )
            {
            // InternalSml.g:1365:1: ( 'elements' )
            // InternalSml.g:1366:2: 'elements'
            {
             before(grammarAccess.getEnvironmentAccess().getElementsKeyword_0_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getElementsKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__5__Impl"


    // $ANTLR start "rule__Environment__Group_0__6"
    // InternalSml.g:1375:1: rule__Environment__Group_0__6 : rule__Environment__Group_0__6__Impl ;
    public final void rule__Environment__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1379:1: ( rule__Environment__Group_0__6__Impl )
            // InternalSml.g:1380:2: rule__Environment__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__6"


    // $ANTLR start "rule__Environment__Group_0__6__Impl"
    // InternalSml.g:1386:1: rule__Environment__Group_0__6__Impl : ( ':' ) ;
    public final void rule__Environment__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1390:1: ( ( ':' ) )
            // InternalSml.g:1391:1: ( ':' )
            {
            // InternalSml.g:1391:1: ( ':' )
            // InternalSml.g:1392:2: ':'
            {
             before(grammarAccess.getEnvironmentAccess().getColonKeyword_0_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getColonKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_0__6__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__0"
    // InternalSml.g:1402:1: rule__ProbabilisticDecription__Group__0 : rule__ProbabilisticDecription__Group__0__Impl rule__ProbabilisticDecription__Group__1 ;
    public final void rule__ProbabilisticDecription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1406:1: ( rule__ProbabilisticDecription__Group__0__Impl rule__ProbabilisticDecription__Group__1 )
            // InternalSml.g:1407:2: rule__ProbabilisticDecription__Group__0__Impl rule__ProbabilisticDecription__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ProbabilisticDecription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__0"


    // $ANTLR start "rule__ProbabilisticDecription__Group__0__Impl"
    // InternalSml.g:1414:1: rule__ProbabilisticDecription__Group__0__Impl : ( 'distributed' ) ;
    public final void rule__ProbabilisticDecription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1418:1: ( ( 'distributed' ) )
            // InternalSml.g:1419:1: ( 'distributed' )
            {
            // InternalSml.g:1419:1: ( 'distributed' )
            // InternalSml.g:1420:2: 'distributed'
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getDistributedKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProbabilisticDecriptionAccess().getDistributedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__0__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__1"
    // InternalSml.g:1429:1: rule__ProbabilisticDecription__Group__1 : rule__ProbabilisticDecription__Group__1__Impl rule__ProbabilisticDecription__Group__2 ;
    public final void rule__ProbabilisticDecription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1433:1: ( rule__ProbabilisticDecription__Group__1__Impl rule__ProbabilisticDecription__Group__2 )
            // InternalSml.g:1434:2: rule__ProbabilisticDecription__Group__1__Impl rule__ProbabilisticDecription__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ProbabilisticDecription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__1"


    // $ANTLR start "rule__ProbabilisticDecription__Group__1__Impl"
    // InternalSml.g:1441:1: rule__ProbabilisticDecription__Group__1__Impl : ( 'with' ) ;
    public final void rule__ProbabilisticDecription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1445:1: ( ( 'with' ) )
            // InternalSml.g:1446:1: ( 'with' )
            {
            // InternalSml.g:1446:1: ( 'with' )
            // InternalSml.g:1447:2: 'with'
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getWithKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProbabilisticDecriptionAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__1__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__2"
    // InternalSml.g:1456:1: rule__ProbabilisticDecription__Group__2 : rule__ProbabilisticDecription__Group__2__Impl rule__ProbabilisticDecription__Group__3 ;
    public final void rule__ProbabilisticDecription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1460:1: ( rule__ProbabilisticDecription__Group__2__Impl rule__ProbabilisticDecription__Group__3 )
            // InternalSml.g:1461:2: rule__ProbabilisticDecription__Group__2__Impl rule__ProbabilisticDecription__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ProbabilisticDecription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__2"


    // $ANTLR start "rule__ProbabilisticDecription__Group__2__Impl"
    // InternalSml.g:1468:1: rule__ProbabilisticDecription__Group__2__Impl : ( 'a' ) ;
    public final void rule__ProbabilisticDecription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1472:1: ( ( 'a' ) )
            // InternalSml.g:1473:1: ( 'a' )
            {
            // InternalSml.g:1473:1: ( 'a' )
            // InternalSml.g:1474:2: 'a'
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__2__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__3"
    // InternalSml.g:1483:1: rule__ProbabilisticDecription__Group__3 : rule__ProbabilisticDecription__Group__3__Impl rule__ProbabilisticDecription__Group__4 ;
    public final void rule__ProbabilisticDecription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1487:1: ( rule__ProbabilisticDecription__Group__3__Impl rule__ProbabilisticDecription__Group__4 )
            // InternalSml.g:1488:2: rule__ProbabilisticDecription__Group__3__Impl rule__ProbabilisticDecription__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ProbabilisticDecription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__3"


    // $ANTLR start "rule__ProbabilisticDecription__Group__3__Impl"
    // InternalSml.g:1495:1: rule__ProbabilisticDecription__Group__3__Impl : ( ( rule__ProbabilisticDecription__DisAssignment_3 ) ) ;
    public final void rule__ProbabilisticDecription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1499:1: ( ( ( rule__ProbabilisticDecription__DisAssignment_3 ) ) )
            // InternalSml.g:1500:1: ( ( rule__ProbabilisticDecription__DisAssignment_3 ) )
            {
            // InternalSml.g:1500:1: ( ( rule__ProbabilisticDecription__DisAssignment_3 ) )
            // InternalSml.g:1501:2: ( rule__ProbabilisticDecription__DisAssignment_3 )
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getDisAssignment_3()); 
            // InternalSml.g:1502:2: ( rule__ProbabilisticDecription__DisAssignment_3 )
            // InternalSml.g:1502:3: rule__ProbabilisticDecription__DisAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__DisAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProbabilisticDecriptionAccess().getDisAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__3__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__4"
    // InternalSml.g:1510:1: rule__ProbabilisticDecription__Group__4 : rule__ProbabilisticDecription__Group__4__Impl rule__ProbabilisticDecription__Group__5 ;
    public final void rule__ProbabilisticDecription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1514:1: ( rule__ProbabilisticDecription__Group__4__Impl rule__ProbabilisticDecription__Group__5 )
            // InternalSml.g:1515:2: rule__ProbabilisticDecription__Group__4__Impl rule__ProbabilisticDecription__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ProbabilisticDecription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__4"


    // $ANTLR start "rule__ProbabilisticDecription__Group__4__Impl"
    // InternalSml.g:1522:1: rule__ProbabilisticDecription__Group__4__Impl : ( 'distribution' ) ;
    public final void rule__ProbabilisticDecription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1526:1: ( ( 'distribution' ) )
            // InternalSml.g:1527:1: ( 'distribution' )
            {
            // InternalSml.g:1527:1: ( 'distribution' )
            // InternalSml.g:1528:2: 'distribution'
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getDistributionKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProbabilisticDecriptionAccess().getDistributionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__4__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__5"
    // InternalSml.g:1537:1: rule__ProbabilisticDecription__Group__5 : rule__ProbabilisticDecription__Group__5__Impl rule__ProbabilisticDecription__Group__6 ;
    public final void rule__ProbabilisticDecription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1541:1: ( rule__ProbabilisticDecription__Group__5__Impl rule__ProbabilisticDecription__Group__6 )
            // InternalSml.g:1542:2: rule__ProbabilisticDecription__Group__5__Impl rule__ProbabilisticDecription__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ProbabilisticDecription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__5"


    // $ANTLR start "rule__ProbabilisticDecription__Group__5__Impl"
    // InternalSml.g:1549:1: rule__ProbabilisticDecription__Group__5__Impl : ( 'in' ) ;
    public final void rule__ProbabilisticDecription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1553:1: ( ( 'in' ) )
            // InternalSml.g:1554:1: ( 'in' )
            {
            // InternalSml.g:1554:1: ( 'in' )
            // InternalSml.g:1555:2: 'in'
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getInKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProbabilisticDecriptionAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__5__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__6"
    // InternalSml.g:1564:1: rule__ProbabilisticDecription__Group__6 : rule__ProbabilisticDecription__Group__6__Impl rule__ProbabilisticDecription__Group__7 ;
    public final void rule__ProbabilisticDecription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1568:1: ( rule__ProbabilisticDecription__Group__6__Impl rule__ProbabilisticDecription__Group__7 )
            // InternalSml.g:1569:2: rule__ProbabilisticDecription__Group__6__Impl rule__ProbabilisticDecription__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__ProbabilisticDecription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__6"


    // $ANTLR start "rule__ProbabilisticDecription__Group__6__Impl"
    // InternalSml.g:1576:1: rule__ProbabilisticDecription__Group__6__Impl : ( 'a' ) ;
    public final void rule__ProbabilisticDecription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1580:1: ( ( 'a' ) )
            // InternalSml.g:1581:1: ( 'a' )
            {
            // InternalSml.g:1581:1: ( 'a' )
            // InternalSml.g:1582:2: 'a'
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__6__Impl"


    // $ANTLR start "rule__ProbabilisticDecription__Group__7"
    // InternalSml.g:1591:1: rule__ProbabilisticDecription__Group__7 : rule__ProbabilisticDecription__Group__7__Impl ;
    public final void rule__ProbabilisticDecription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1595:1: ( rule__ProbabilisticDecription__Group__7__Impl )
            // InternalSml.g:1596:2: rule__ProbabilisticDecription__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__7"


    // $ANTLR start "rule__ProbabilisticDecription__Group__7__Impl"
    // InternalSml.g:1602:1: rule__ProbabilisticDecription__Group__7__Impl : ( ( rule__ProbabilisticDecription__KAssignment_7 ) ) ;
    public final void rule__ProbabilisticDecription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1606:1: ( ( ( rule__ProbabilisticDecription__KAssignment_7 ) ) )
            // InternalSml.g:1607:1: ( ( rule__ProbabilisticDecription__KAssignment_7 ) )
            {
            // InternalSml.g:1607:1: ( ( rule__ProbabilisticDecription__KAssignment_7 ) )
            // InternalSml.g:1608:2: ( rule__ProbabilisticDecription__KAssignment_7 )
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getKAssignment_7()); 
            // InternalSml.g:1609:2: ( rule__ProbabilisticDecription__KAssignment_7 )
            // InternalSml.g:1609:3: rule__ProbabilisticDecription__KAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilisticDecription__KAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProbabilisticDecriptionAccess().getKAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__Group__7__Impl"


    // $ANTLR start "rule__Swarmconf__Group__0"
    // InternalSml.g:1618:1: rule__Swarmconf__Group__0 : rule__Swarmconf__Group__0__Impl rule__Swarmconf__Group__1 ;
    public final void rule__Swarmconf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1622:1: ( rule__Swarmconf__Group__0__Impl rule__Swarmconf__Group__1 )
            // InternalSml.g:1623:2: rule__Swarmconf__Group__0__Impl rule__Swarmconf__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Swarmconf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__0"


    // $ANTLR start "rule__Swarmconf__Group__0__Impl"
    // InternalSml.g:1630:1: rule__Swarmconf__Group__0__Impl : ( 'The' ) ;
    public final void rule__Swarmconf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1634:1: ( ( 'The' ) )
            // InternalSml.g:1635:1: ( 'The' )
            {
            // InternalSml.g:1635:1: ( 'The' )
            // InternalSml.g:1636:2: 'The'
            {
             before(grammarAccess.getSwarmconfAccess().getTheKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSwarmconfAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__0__Impl"


    // $ANTLR start "rule__Swarmconf__Group__1"
    // InternalSml.g:1645:1: rule__Swarmconf__Group__1 : rule__Swarmconf__Group__1__Impl rule__Swarmconf__Group__2 ;
    public final void rule__Swarmconf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1649:1: ( rule__Swarmconf__Group__1__Impl rule__Swarmconf__Group__2 )
            // InternalSml.g:1650:2: rule__Swarmconf__Group__1__Impl rule__Swarmconf__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Swarmconf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__1"


    // $ANTLR start "rule__Swarmconf__Group__1__Impl"
    // InternalSml.g:1657:1: rule__Swarmconf__Group__1__Impl : ( 'robot' ) ;
    public final void rule__Swarmconf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1661:1: ( ( 'robot' ) )
            // InternalSml.g:1662:1: ( 'robot' )
            {
            // InternalSml.g:1662:1: ( 'robot' )
            // InternalSml.g:1663:2: 'robot'
            {
             before(grammarAccess.getSwarmconfAccess().getRobotKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSwarmconfAccess().getRobotKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__1__Impl"


    // $ANTLR start "rule__Swarmconf__Group__2"
    // InternalSml.g:1672:1: rule__Swarmconf__Group__2 : rule__Swarmconf__Group__2__Impl rule__Swarmconf__Group__3 ;
    public final void rule__Swarmconf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1676:1: ( rule__Swarmconf__Group__2__Impl rule__Swarmconf__Group__3 )
            // InternalSml.g:1677:2: rule__Swarmconf__Group__2__Impl rule__Swarmconf__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Swarmconf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__2"


    // $ANTLR start "rule__Swarmconf__Group__2__Impl"
    // InternalSml.g:1684:1: rule__Swarmconf__Group__2__Impl : ( 'swarm' ) ;
    public final void rule__Swarmconf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1688:1: ( ( 'swarm' ) )
            // InternalSml.g:1689:1: ( 'swarm' )
            {
            // InternalSml.g:1689:1: ( 'swarm' )
            // InternalSml.g:1690:2: 'swarm'
            {
             before(grammarAccess.getSwarmconfAccess().getSwarmKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSwarmconfAccess().getSwarmKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__2__Impl"


    // $ANTLR start "rule__Swarmconf__Group__3"
    // InternalSml.g:1699:1: rule__Swarmconf__Group__3 : rule__Swarmconf__Group__3__Impl rule__Swarmconf__Group__4 ;
    public final void rule__Swarmconf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1703:1: ( rule__Swarmconf__Group__3__Impl rule__Swarmconf__Group__4 )
            // InternalSml.g:1704:2: rule__Swarmconf__Group__3__Impl rule__Swarmconf__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Swarmconf__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__3"


    // $ANTLR start "rule__Swarmconf__Group__3__Impl"
    // InternalSml.g:1711:1: rule__Swarmconf__Group__3__Impl : ( 'consists' ) ;
    public final void rule__Swarmconf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1715:1: ( ( 'consists' ) )
            // InternalSml.g:1716:1: ( 'consists' )
            {
            // InternalSml.g:1716:1: ( 'consists' )
            // InternalSml.g:1717:2: 'consists'
            {
             before(grammarAccess.getSwarmconfAccess().getConsistsKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSwarmconfAccess().getConsistsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__3__Impl"


    // $ANTLR start "rule__Swarmconf__Group__4"
    // InternalSml.g:1726:1: rule__Swarmconf__Group__4 : rule__Swarmconf__Group__4__Impl rule__Swarmconf__Group__5 ;
    public final void rule__Swarmconf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1730:1: ( rule__Swarmconf__Group__4__Impl rule__Swarmconf__Group__5 )
            // InternalSml.g:1731:2: rule__Swarmconf__Group__4__Impl rule__Swarmconf__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Swarmconf__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__4"


    // $ANTLR start "rule__Swarmconf__Group__4__Impl"
    // InternalSml.g:1738:1: rule__Swarmconf__Group__4__Impl : ( 'of' ) ;
    public final void rule__Swarmconf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1742:1: ( ( 'of' ) )
            // InternalSml.g:1743:1: ( 'of' )
            {
            // InternalSml.g:1743:1: ( 'of' )
            // InternalSml.g:1744:2: 'of'
            {
             before(grammarAccess.getSwarmconfAccess().getOfKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSwarmconfAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__4__Impl"


    // $ANTLR start "rule__Swarmconf__Group__5"
    // InternalSml.g:1753:1: rule__Swarmconf__Group__5 : rule__Swarmconf__Group__5__Impl rule__Swarmconf__Group__6 ;
    public final void rule__Swarmconf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1757:1: ( rule__Swarmconf__Group__5__Impl rule__Swarmconf__Group__6 )
            // InternalSml.g:1758:2: rule__Swarmconf__Group__5__Impl rule__Swarmconf__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Swarmconf__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__5"


    // $ANTLR start "rule__Swarmconf__Group__5__Impl"
    // InternalSml.g:1765:1: rule__Swarmconf__Group__5__Impl : ( ( rule__Swarmconf__XAssignment_5 ) ) ;
    public final void rule__Swarmconf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1769:1: ( ( ( rule__Swarmconf__XAssignment_5 ) ) )
            // InternalSml.g:1770:1: ( ( rule__Swarmconf__XAssignment_5 ) )
            {
            // InternalSml.g:1770:1: ( ( rule__Swarmconf__XAssignment_5 ) )
            // InternalSml.g:1771:2: ( rule__Swarmconf__XAssignment_5 )
            {
             before(grammarAccess.getSwarmconfAccess().getXAssignment_5()); 
            // InternalSml.g:1772:2: ( rule__Swarmconf__XAssignment_5 )
            // InternalSml.g:1772:3: rule__Swarmconf__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Swarmconf__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSwarmconfAccess().getXAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__5__Impl"


    // $ANTLR start "rule__Swarmconf__Group__6"
    // InternalSml.g:1780:1: rule__Swarmconf__Group__6 : rule__Swarmconf__Group__6__Impl rule__Swarmconf__Group__7 ;
    public final void rule__Swarmconf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1784:1: ( rule__Swarmconf__Group__6__Impl rule__Swarmconf__Group__7 )
            // InternalSml.g:1785:2: rule__Swarmconf__Group__6__Impl rule__Swarmconf__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Swarmconf__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__6"


    // $ANTLR start "rule__Swarmconf__Group__6__Impl"
    // InternalSml.g:1792:1: rule__Swarmconf__Group__6__Impl : ( ( rule__Swarmconf__RAssignment_6 ) ) ;
    public final void rule__Swarmconf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1796:1: ( ( ( rule__Swarmconf__RAssignment_6 ) ) )
            // InternalSml.g:1797:1: ( ( rule__Swarmconf__RAssignment_6 ) )
            {
            // InternalSml.g:1797:1: ( ( rule__Swarmconf__RAssignment_6 ) )
            // InternalSml.g:1798:2: ( rule__Swarmconf__RAssignment_6 )
            {
             before(grammarAccess.getSwarmconfAccess().getRAssignment_6()); 
            // InternalSml.g:1799:2: ( rule__Swarmconf__RAssignment_6 )
            // InternalSml.g:1799:3: rule__Swarmconf__RAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Swarmconf__RAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSwarmconfAccess().getRAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__6__Impl"


    // $ANTLR start "rule__Swarmconf__Group__7"
    // InternalSml.g:1807:1: rule__Swarmconf__Group__7 : rule__Swarmconf__Group__7__Impl ;
    public final void rule__Swarmconf__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1811:1: ( rule__Swarmconf__Group__7__Impl )
            // InternalSml.g:1812:2: rule__Swarmconf__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Swarmconf__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__7"


    // $ANTLR start "rule__Swarmconf__Group__7__Impl"
    // InternalSml.g:1818:1: rule__Swarmconf__Group__7__Impl : ( ( rule__Swarmconf__PrAssignment_7 ) ) ;
    public final void rule__Swarmconf__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1822:1: ( ( ( rule__Swarmconf__PrAssignment_7 ) ) )
            // InternalSml.g:1823:1: ( ( rule__Swarmconf__PrAssignment_7 ) )
            {
            // InternalSml.g:1823:1: ( ( rule__Swarmconf__PrAssignment_7 ) )
            // InternalSml.g:1824:2: ( rule__Swarmconf__PrAssignment_7 )
            {
             before(grammarAccess.getSwarmconfAccess().getPrAssignment_7()); 
            // InternalSml.g:1825:2: ( rule__Swarmconf__PrAssignment_7 )
            // InternalSml.g:1825:3: rule__Swarmconf__PrAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Swarmconf__PrAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSwarmconfAccess().getPrAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__Group__7__Impl"


    // $ANTLR start "rule__ElementDescription__Group__0"
    // InternalSml.g:1834:1: rule__ElementDescription__Group__0 : rule__ElementDescription__Group__0__Impl rule__ElementDescription__Group__1 ;
    public final void rule__ElementDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1838:1: ( rule__ElementDescription__Group__0__Impl rule__ElementDescription__Group__1 )
            // InternalSml.g:1839:2: rule__ElementDescription__Group__0__Impl rule__ElementDescription__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ElementDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__0"


    // $ANTLR start "rule__ElementDescription__Group__0__Impl"
    // InternalSml.g:1846:1: rule__ElementDescription__Group__0__Impl : ( ( rule__ElementDescription__ElAssignment_0 ) ) ;
    public final void rule__ElementDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1850:1: ( ( ( rule__ElementDescription__ElAssignment_0 ) ) )
            // InternalSml.g:1851:1: ( ( rule__ElementDescription__ElAssignment_0 ) )
            {
            // InternalSml.g:1851:1: ( ( rule__ElementDescription__ElAssignment_0 ) )
            // InternalSml.g:1852:2: ( rule__ElementDescription__ElAssignment_0 )
            {
             before(grammarAccess.getElementDescriptionAccess().getElAssignment_0()); 
            // InternalSml.g:1853:2: ( rule__ElementDescription__ElAssignment_0 )
            // InternalSml.g:1853:3: rule__ElementDescription__ElAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementDescription__ElAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementDescriptionAccess().getElAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__0__Impl"


    // $ANTLR start "rule__ElementDescription__Group__1"
    // InternalSml.g:1861:1: rule__ElementDescription__Group__1 : rule__ElementDescription__Group__1__Impl rule__ElementDescription__Group__2 ;
    public final void rule__ElementDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1865:1: ( rule__ElementDescription__Group__1__Impl rule__ElementDescription__Group__2 )
            // InternalSml.g:1866:2: rule__ElementDescription__Group__1__Impl rule__ElementDescription__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ElementDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__1"


    // $ANTLR start "rule__ElementDescription__Group__1__Impl"
    // InternalSml.g:1873:1: rule__ElementDescription__Group__1__Impl : ( 'are' ) ;
    public final void rule__ElementDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1877:1: ( ( 'are' ) )
            // InternalSml.g:1878:1: ( 'are' )
            {
            // InternalSml.g:1878:1: ( 'are' )
            // InternalSml.g:1879:2: 'are'
            {
             before(grammarAccess.getElementDescriptionAccess().getAreKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getElementDescriptionAccess().getAreKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__1__Impl"


    // $ANTLR start "rule__ElementDescription__Group__2"
    // InternalSml.g:1888:1: rule__ElementDescription__Group__2 : rule__ElementDescription__Group__2__Impl rule__ElementDescription__Group__3 ;
    public final void rule__ElementDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1892:1: ( rule__ElementDescription__Group__2__Impl rule__ElementDescription__Group__3 )
            // InternalSml.g:1893:2: rule__ElementDescription__Group__2__Impl rule__ElementDescription__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ElementDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__2"


    // $ANTLR start "rule__ElementDescription__Group__2__Impl"
    // InternalSml.g:1900:1: rule__ElementDescription__Group__2__Impl : ( ( rule__ElementDescription__XAssignment_2 ) ) ;
    public final void rule__ElementDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1904:1: ( ( ( rule__ElementDescription__XAssignment_2 ) ) )
            // InternalSml.g:1905:1: ( ( rule__ElementDescription__XAssignment_2 ) )
            {
            // InternalSml.g:1905:1: ( ( rule__ElementDescription__XAssignment_2 ) )
            // InternalSml.g:1906:2: ( rule__ElementDescription__XAssignment_2 )
            {
             before(grammarAccess.getElementDescriptionAccess().getXAssignment_2()); 
            // InternalSml.g:1907:2: ( rule__ElementDescription__XAssignment_2 )
            // InternalSml.g:1907:3: rule__ElementDescription__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementDescription__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementDescriptionAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__2__Impl"


    // $ANTLR start "rule__ElementDescription__Group__3"
    // InternalSml.g:1915:1: rule__ElementDescription__Group__3 : rule__ElementDescription__Group__3__Impl rule__ElementDescription__Group__4 ;
    public final void rule__ElementDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1919:1: ( rule__ElementDescription__Group__3__Impl rule__ElementDescription__Group__4 )
            // InternalSml.g:1920:2: rule__ElementDescription__Group__3__Impl rule__ElementDescription__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ElementDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__3"


    // $ANTLR start "rule__ElementDescription__Group__3__Impl"
    // InternalSml.g:1927:1: rule__ElementDescription__Group__3__Impl : ( ( rule__ElementDescription__ObjAssignment_3 ) ) ;
    public final void rule__ElementDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1931:1: ( ( ( rule__ElementDescription__ObjAssignment_3 ) ) )
            // InternalSml.g:1932:1: ( ( rule__ElementDescription__ObjAssignment_3 ) )
            {
            // InternalSml.g:1932:1: ( ( rule__ElementDescription__ObjAssignment_3 ) )
            // InternalSml.g:1933:2: ( rule__ElementDescription__ObjAssignment_3 )
            {
             before(grammarAccess.getElementDescriptionAccess().getObjAssignment_3()); 
            // InternalSml.g:1934:2: ( rule__ElementDescription__ObjAssignment_3 )
            // InternalSml.g:1934:3: rule__ElementDescription__ObjAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ElementDescription__ObjAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElementDescriptionAccess().getObjAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__3__Impl"


    // $ANTLR start "rule__ElementDescription__Group__4"
    // InternalSml.g:1942:1: rule__ElementDescription__Group__4 : rule__ElementDescription__Group__4__Impl ;
    public final void rule__ElementDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1946:1: ( rule__ElementDescription__Group__4__Impl )
            // InternalSml.g:1947:2: rule__ElementDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDescription__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__4"


    // $ANTLR start "rule__ElementDescription__Group__4__Impl"
    // InternalSml.g:1953:1: rule__ElementDescription__Group__4__Impl : ( ( rule__ElementDescription__RAssignment_4 ) ) ;
    public final void rule__ElementDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1957:1: ( ( ( rule__ElementDescription__RAssignment_4 ) ) )
            // InternalSml.g:1958:1: ( ( rule__ElementDescription__RAssignment_4 ) )
            {
            // InternalSml.g:1958:1: ( ( rule__ElementDescription__RAssignment_4 ) )
            // InternalSml.g:1959:2: ( rule__ElementDescription__RAssignment_4 )
            {
             before(grammarAccess.getElementDescriptionAccess().getRAssignment_4()); 
            // InternalSml.g:1960:2: ( rule__ElementDescription__RAssignment_4 )
            // InternalSml.g:1960:3: rule__ElementDescription__RAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ElementDescription__RAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElementDescriptionAccess().getRAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__Group__4__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // InternalSml.g:1969:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1973:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalSml.g:1974:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // InternalSml.g:1981:1: rule__Element__Group_2__0__Impl : ( 'light' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:1985:1: ( ( 'light' ) )
            // InternalSml.g:1986:1: ( 'light' )
            {
            // InternalSml.g:1986:1: ( 'light' )
            // InternalSml.g:1987:2: 'light'
            {
             before(grammarAccess.getElementAccess().getLightKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLightKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // InternalSml.g:1996:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2000:1: ( rule__Element__Group_2__1__Impl )
            // InternalSml.g:2001:2: rule__Element__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // InternalSml.g:2007:1: rule__Element__Group_2__1__Impl : ( 'sources' ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2011:1: ( ( 'sources' ) )
            // InternalSml.g:2012:1: ( 'sources' )
            {
            // InternalSml.g:2012:1: ( 'sources' )
            // InternalSml.g:2013:2: 'sources'
            {
             before(grammarAccess.getElementAccess().getSourcesKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getSourcesKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalSml.g:2023:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2027:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalSml.g:2028:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalSml.g:2035:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2039:1: ( ( ( rule__Object__ObjAssignment_0 ) ) )
            // InternalSml.g:2040:1: ( ( rule__Object__ObjAssignment_0 ) )
            {
            // InternalSml.g:2040:1: ( ( rule__Object__ObjAssignment_0 ) )
            // InternalSml.g:2041:2: ( rule__Object__ObjAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObjAssignment_0()); 
            // InternalSml.g:2042:2: ( rule__Object__ObjAssignment_0 )
            // InternalSml.g:2042:3: rule__Object__ObjAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__ObjAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObjAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalSml.g:2050:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2054:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalSml.g:2055:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalSml.g:2062:1: rule__Object__Group__1__Impl : ( 'object' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2066:1: ( ( 'object' ) )
            // InternalSml.g:2067:1: ( 'object' )
            {
            // InternalSml.g:2067:1: ( 'object' )
            // InternalSml.g:2068:2: 'object'
            {
             before(grammarAccess.getObjectAccess().getObjectKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalSml.g:2077:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2081:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalSml.g:2082:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalSml.g:2089:1: rule__Object__Group__2__Impl : ( 'as' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2093:1: ( ( 'as' ) )
            // InternalSml.g:2094:1: ( 'as' )
            {
            // InternalSml.g:2094:1: ( 'as' )
            // InternalSml.g:2095:2: 'as'
            {
             before(grammarAccess.getObjectAccess().getAsKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalSml.g:2104:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2108:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalSml.g:2109:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalSml.g:2116:1: rule__Object__Group__3__Impl : ( 'a' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2120:1: ( ( 'a' ) )
            // InternalSml.g:2121:1: ( 'a' )
            {
            // InternalSml.g:2121:1: ( 'a' )
            // InternalSml.g:2122:2: 'a'
            {
             before(grammarAccess.getObjectAccess().getAKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getAKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalSml.g:2131:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2135:1: ( rule__Object__Group__4__Impl )
            // InternalSml.g:2136:2: rule__Object__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalSml.g:2142:1: rule__Object__Group__4__Impl : ( ( rule__Object__RAssignment_4 ) ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2146:1: ( ( ( rule__Object__RAssignment_4 ) ) )
            // InternalSml.g:2147:1: ( ( rule__Object__RAssignment_4 ) )
            {
            // InternalSml.g:2147:1: ( ( rule__Object__RAssignment_4 ) )
            // InternalSml.g:2148:2: ( rule__Object__RAssignment_4 )
            {
             before(grammarAccess.getObjectAccess().getRAssignment_4()); 
            // InternalSml.g:2149:2: ( rule__Object__RAssignment_4 )
            // InternalSml.g:2149:3: rule__Object__RAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Object__RAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getRAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Obstacle__Group__0"
    // InternalSml.g:2158:1: rule__Obstacle__Group__0 : rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 ;
    public final void rule__Obstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2162:1: ( rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 )
            // InternalSml.g:2163:2: rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Obstacle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__0"


    // $ANTLR start "rule__Obstacle__Group__0__Impl"
    // InternalSml.g:2170:1: rule__Obstacle__Group__0__Impl : ( ( rule__Obstacle__ObsAssignment_0 ) ) ;
    public final void rule__Obstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2174:1: ( ( ( rule__Obstacle__ObsAssignment_0 ) ) )
            // InternalSml.g:2175:1: ( ( rule__Obstacle__ObsAssignment_0 ) )
            {
            // InternalSml.g:2175:1: ( ( rule__Obstacle__ObsAssignment_0 ) )
            // InternalSml.g:2176:2: ( rule__Obstacle__ObsAssignment_0 )
            {
             before(grammarAccess.getObstacleAccess().getObsAssignment_0()); 
            // InternalSml.g:2177:2: ( rule__Obstacle__ObsAssignment_0 )
            // InternalSml.g:2177:3: rule__Obstacle__ObsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__ObsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getObsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__0__Impl"


    // $ANTLR start "rule__Obstacle__Group__1"
    // InternalSml.g:2185:1: rule__Obstacle__Group__1 : rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 ;
    public final void rule__Obstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2189:1: ( rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 )
            // InternalSml.g:2190:2: rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Obstacle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__1"


    // $ANTLR start "rule__Obstacle__Group__1__Impl"
    // InternalSml.g:2197:1: rule__Obstacle__Group__1__Impl : ( 'obstacle' ) ;
    public final void rule__Obstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2201:1: ( ( 'obstacle' ) )
            // InternalSml.g:2202:1: ( 'obstacle' )
            {
            // InternalSml.g:2202:1: ( 'obstacle' )
            // InternalSml.g:2203:2: 'obstacle'
            {
             before(grammarAccess.getObstacleAccess().getObstacleKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getObstacleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__1__Impl"


    // $ANTLR start "rule__Obstacle__Group__2"
    // InternalSml.g:2212:1: rule__Obstacle__Group__2 : rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 ;
    public final void rule__Obstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2216:1: ( rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 )
            // InternalSml.g:2217:2: rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Obstacle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__2"


    // $ANTLR start "rule__Obstacle__Group__2__Impl"
    // InternalSml.g:2224:1: rule__Obstacle__Group__2__Impl : ( 'as' ) ;
    public final void rule__Obstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2228:1: ( ( 'as' ) )
            // InternalSml.g:2229:1: ( 'as' )
            {
            // InternalSml.g:2229:1: ( 'as' )
            // InternalSml.g:2230:2: 'as'
            {
             before(grammarAccess.getObstacleAccess().getAsKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__2__Impl"


    // $ANTLR start "rule__Obstacle__Group__3"
    // InternalSml.g:2239:1: rule__Obstacle__Group__3 : rule__Obstacle__Group__3__Impl rule__Obstacle__Group__4 ;
    public final void rule__Obstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2243:1: ( rule__Obstacle__Group__3__Impl rule__Obstacle__Group__4 )
            // InternalSml.g:2244:2: rule__Obstacle__Group__3__Impl rule__Obstacle__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Obstacle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__3"


    // $ANTLR start "rule__Obstacle__Group__3__Impl"
    // InternalSml.g:2251:1: rule__Obstacle__Group__3__Impl : ( 'a' ) ;
    public final void rule__Obstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2255:1: ( ( 'a' ) )
            // InternalSml.g:2256:1: ( 'a' )
            {
            // InternalSml.g:2256:1: ( 'a' )
            // InternalSml.g:2257:2: 'a'
            {
             before(grammarAccess.getObstacleAccess().getAKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getAKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__3__Impl"


    // $ANTLR start "rule__Obstacle__Group__4"
    // InternalSml.g:2266:1: rule__Obstacle__Group__4 : rule__Obstacle__Group__4__Impl ;
    public final void rule__Obstacle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2270:1: ( rule__Obstacle__Group__4__Impl )
            // InternalSml.g:2271:2: rule__Obstacle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__4"


    // $ANTLR start "rule__Obstacle__Group__4__Impl"
    // InternalSml.g:2277:1: rule__Obstacle__Group__4__Impl : ( ( rule__Obstacle__RAssignment_4 ) ) ;
    public final void rule__Obstacle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2281:1: ( ( ( rule__Obstacle__RAssignment_4 ) ) )
            // InternalSml.g:2282:1: ( ( rule__Obstacle__RAssignment_4 ) )
            {
            // InternalSml.g:2282:1: ( ( rule__Obstacle__RAssignment_4 ) )
            // InternalSml.g:2283:2: ( rule__Obstacle__RAssignment_4 )
            {
             before(grammarAccess.getObstacleAccess().getRAssignment_4()); 
            // InternalSml.g:2284:2: ( rule__Obstacle__RAssignment_4 )
            // InternalSml.g:2284:3: rule__Obstacle__RAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__RAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getRAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__4__Impl"


    // $ANTLR start "rule__Light__Group__0"
    // InternalSml.g:2293:1: rule__Light__Group__0 : rule__Light__Group__0__Impl rule__Light__Group__1 ;
    public final void rule__Light__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2297:1: ( rule__Light__Group__0__Impl rule__Light__Group__1 )
            // InternalSml.g:2298:2: rule__Light__Group__0__Impl rule__Light__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Light__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__0"


    // $ANTLR start "rule__Light__Group__0__Impl"
    // InternalSml.g:2305:1: rule__Light__Group__0__Impl : ( ( rule__Light__LAssignment_0 ) ) ;
    public final void rule__Light__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2309:1: ( ( ( rule__Light__LAssignment_0 ) ) )
            // InternalSml.g:2310:1: ( ( rule__Light__LAssignment_0 ) )
            {
            // InternalSml.g:2310:1: ( ( rule__Light__LAssignment_0 ) )
            // InternalSml.g:2311:2: ( rule__Light__LAssignment_0 )
            {
             before(grammarAccess.getLightAccess().getLAssignment_0()); 
            // InternalSml.g:2312:2: ( rule__Light__LAssignment_0 )
            // InternalSml.g:2312:3: rule__Light__LAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Light__LAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLightAccess().getLAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__0__Impl"


    // $ANTLR start "rule__Light__Group__1"
    // InternalSml.g:2320:1: rule__Light__Group__1 : rule__Light__Group__1__Impl rule__Light__Group__2 ;
    public final void rule__Light__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2324:1: ( rule__Light__Group__1__Impl rule__Light__Group__2 )
            // InternalSml.g:2325:2: rule__Light__Group__1__Impl rule__Light__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Light__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__1"


    // $ANTLR start "rule__Light__Group__1__Impl"
    // InternalSml.g:2332:1: rule__Light__Group__1__Impl : ( 'light' ) ;
    public final void rule__Light__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2336:1: ( ( 'light' ) )
            // InternalSml.g:2337:1: ( 'light' )
            {
            // InternalSml.g:2337:1: ( 'light' )
            // InternalSml.g:2338:2: 'light'
            {
             before(grammarAccess.getLightAccess().getLightKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getLightKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__1__Impl"


    // $ANTLR start "rule__Light__Group__2"
    // InternalSml.g:2347:1: rule__Light__Group__2 : rule__Light__Group__2__Impl rule__Light__Group__3 ;
    public final void rule__Light__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2351:1: ( rule__Light__Group__2__Impl rule__Light__Group__3 )
            // InternalSml.g:2352:2: rule__Light__Group__2__Impl rule__Light__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Light__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__2"


    // $ANTLR start "rule__Light__Group__2__Impl"
    // InternalSml.g:2359:1: rule__Light__Group__2__Impl : ( 'source' ) ;
    public final void rule__Light__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2363:1: ( ( 'source' ) )
            // InternalSml.g:2364:1: ( 'source' )
            {
            // InternalSml.g:2364:1: ( 'source' )
            // InternalSml.g:2365:2: 'source'
            {
             before(grammarAccess.getLightAccess().getSourceKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getSourceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__2__Impl"


    // $ANTLR start "rule__Light__Group__3"
    // InternalSml.g:2374:1: rule__Light__Group__3 : rule__Light__Group__3__Impl rule__Light__Group__4 ;
    public final void rule__Light__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2378:1: ( rule__Light__Group__3__Impl rule__Light__Group__4 )
            // InternalSml.g:2379:2: rule__Light__Group__3__Impl rule__Light__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Light__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__3"


    // $ANTLR start "rule__Light__Group__3__Impl"
    // InternalSml.g:2386:1: rule__Light__Group__3__Impl : ( 'emitting' ) ;
    public final void rule__Light__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2390:1: ( ( 'emitting' ) )
            // InternalSml.g:2391:1: ( 'emitting' )
            {
            // InternalSml.g:2391:1: ( 'emitting' )
            // InternalSml.g:2392:2: 'emitting'
            {
             before(grammarAccess.getLightAccess().getEmittingKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getEmittingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__3__Impl"


    // $ANTLR start "rule__Light__Group__4"
    // InternalSml.g:2401:1: rule__Light__Group__4 : rule__Light__Group__4__Impl rule__Light__Group__5 ;
    public final void rule__Light__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2405:1: ( rule__Light__Group__4__Impl rule__Light__Group__5 )
            // InternalSml.g:2406:2: rule__Light__Group__4__Impl rule__Light__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Light__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__4"


    // $ANTLR start "rule__Light__Group__4__Impl"
    // InternalSml.g:2413:1: rule__Light__Group__4__Impl : ( 'a' ) ;
    public final void rule__Light__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2417:1: ( ( 'a' ) )
            // InternalSml.g:2418:1: ( 'a' )
            {
            // InternalSml.g:2418:1: ( 'a' )
            // InternalSml.g:2419:2: 'a'
            {
             before(grammarAccess.getLightAccess().getAKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getAKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__4__Impl"


    // $ANTLR start "rule__Light__Group__5"
    // InternalSml.g:2428:1: rule__Light__Group__5 : rule__Light__Group__5__Impl rule__Light__Group__6 ;
    public final void rule__Light__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2432:1: ( rule__Light__Group__5__Impl rule__Light__Group__6 )
            // InternalSml.g:2433:2: rule__Light__Group__5__Impl rule__Light__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Light__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__5"


    // $ANTLR start "rule__Light__Group__5__Impl"
    // InternalSml.g:2440:1: rule__Light__Group__5__Impl : ( ( rule__Light__CAssignment_5 ) ) ;
    public final void rule__Light__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2444:1: ( ( ( rule__Light__CAssignment_5 ) ) )
            // InternalSml.g:2445:1: ( ( rule__Light__CAssignment_5 ) )
            {
            // InternalSml.g:2445:1: ( ( rule__Light__CAssignment_5 ) )
            // InternalSml.g:2446:2: ( rule__Light__CAssignment_5 )
            {
             before(grammarAccess.getLightAccess().getCAssignment_5()); 
            // InternalSml.g:2447:2: ( rule__Light__CAssignment_5 )
            // InternalSml.g:2447:3: rule__Light__CAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Light__CAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLightAccess().getCAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__5__Impl"


    // $ANTLR start "rule__Light__Group__6"
    // InternalSml.g:2455:1: rule__Light__Group__6 : rule__Light__Group__6__Impl rule__Light__Group__7 ;
    public final void rule__Light__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2459:1: ( rule__Light__Group__6__Impl rule__Light__Group__7 )
            // InternalSml.g:2460:2: rule__Light__Group__6__Impl rule__Light__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__Light__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__6"


    // $ANTLR start "rule__Light__Group__6__Impl"
    // InternalSml.g:2467:1: rule__Light__Group__6__Impl : ( 'light' ) ;
    public final void rule__Light__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2471:1: ( ( 'light' ) )
            // InternalSml.g:2472:1: ( 'light' )
            {
            // InternalSml.g:2472:1: ( 'light' )
            // InternalSml.g:2473:2: 'light'
            {
             before(grammarAccess.getLightAccess().getLightKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getLightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__6__Impl"


    // $ANTLR start "rule__Light__Group__7"
    // InternalSml.g:2482:1: rule__Light__Group__7 : rule__Light__Group__7__Impl rule__Light__Group__8 ;
    public final void rule__Light__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2486:1: ( rule__Light__Group__7__Impl rule__Light__Group__8 )
            // InternalSml.g:2487:2: rule__Light__Group__7__Impl rule__Light__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Light__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__7"


    // $ANTLR start "rule__Light__Group__7__Impl"
    // InternalSml.g:2494:1: rule__Light__Group__7__Impl : ( 'is' ) ;
    public final void rule__Light__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2498:1: ( ( 'is' ) )
            // InternalSml.g:2499:1: ( 'is' )
            {
            // InternalSml.g:2499:1: ( 'is' )
            // InternalSml.g:2500:2: 'is'
            {
             before(grammarAccess.getLightAccess().getIsKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getIsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__7__Impl"


    // $ANTLR start "rule__Light__Group__8"
    // InternalSml.g:2509:1: rule__Light__Group__8 : rule__Light__Group__8__Impl rule__Light__Group__9 ;
    public final void rule__Light__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2513:1: ( rule__Light__Group__8__Impl rule__Light__Group__9 )
            // InternalSml.g:2514:2: rule__Light__Group__8__Impl rule__Light__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Light__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__8"


    // $ANTLR start "rule__Light__Group__8__Impl"
    // InternalSml.g:2521:1: rule__Light__Group__8__Impl : ( 'placed' ) ;
    public final void rule__Light__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2525:1: ( ( 'placed' ) )
            // InternalSml.g:2526:1: ( 'placed' )
            {
            // InternalSml.g:2526:1: ( 'placed' )
            // InternalSml.g:2527:2: 'placed'
            {
             before(grammarAccess.getLightAccess().getPlacedKeyword_8()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getPlacedKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__8__Impl"


    // $ANTLR start "rule__Light__Group__9"
    // InternalSml.g:2536:1: rule__Light__Group__9 : rule__Light__Group__9__Impl rule__Light__Group__10 ;
    public final void rule__Light__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2540:1: ( rule__Light__Group__9__Impl rule__Light__Group__10 )
            // InternalSml.g:2541:2: rule__Light__Group__9__Impl rule__Light__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Light__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__9"


    // $ANTLR start "rule__Light__Group__9__Impl"
    // InternalSml.g:2548:1: rule__Light__Group__9__Impl : ( 'in' ) ;
    public final void rule__Light__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2552:1: ( ( 'in' ) )
            // InternalSml.g:2553:1: ( 'in' )
            {
            // InternalSml.g:2553:1: ( 'in' )
            // InternalSml.g:2554:2: 'in'
            {
             before(grammarAccess.getLightAccess().getInKeyword_9()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getInKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__9__Impl"


    // $ANTLR start "rule__Light__Group__10"
    // InternalSml.g:2563:1: rule__Light__Group__10 : rule__Light__Group__10__Impl rule__Light__Group__11 ;
    public final void rule__Light__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2567:1: ( rule__Light__Group__10__Impl rule__Light__Group__11 )
            // InternalSml.g:2568:2: rule__Light__Group__10__Impl rule__Light__Group__11
            {
            pushFollow(FOLLOW_37);
            rule__Light__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Light__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__10"


    // $ANTLR start "rule__Light__Group__10__Impl"
    // InternalSml.g:2575:1: rule__Light__Group__10__Impl : ( 'a' ) ;
    public final void rule__Light__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2579:1: ( ( 'a' ) )
            // InternalSml.g:2580:1: ( 'a' )
            {
            // InternalSml.g:2580:1: ( 'a' )
            // InternalSml.g:2581:2: 'a'
            {
             before(grammarAccess.getLightAccess().getAKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getAKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__10__Impl"


    // $ANTLR start "rule__Light__Group__11"
    // InternalSml.g:2590:1: rule__Light__Group__11 : rule__Light__Group__11__Impl ;
    public final void rule__Light__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2594:1: ( rule__Light__Group__11__Impl )
            // InternalSml.g:2595:2: rule__Light__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Light__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__11"


    // $ANTLR start "rule__Light__Group__11__Impl"
    // InternalSml.g:2601:1: rule__Light__Group__11__Impl : ( ( rule__Light__PAssignment_11 ) ) ;
    public final void rule__Light__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2605:1: ( ( ( rule__Light__PAssignment_11 ) ) )
            // InternalSml.g:2606:1: ( ( rule__Light__PAssignment_11 ) )
            {
            // InternalSml.g:2606:1: ( ( rule__Light__PAssignment_11 ) )
            // InternalSml.g:2607:2: ( rule__Light__PAssignment_11 )
            {
             before(grammarAccess.getLightAccess().getPAssignment_11()); 
            // InternalSml.g:2608:2: ( rule__Light__PAssignment_11 )
            // InternalSml.g:2608:3: rule__Light__PAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Light__PAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getLightAccess().getPAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__Group__11__Impl"


    // $ANTLR start "rule__Position__Group_0__0"
    // InternalSml.g:2617:1: rule__Position__Group_0__0 : rule__Position__Group_0__0__Impl rule__Position__Group_0__1 ;
    public final void rule__Position__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2621:1: ( rule__Position__Group_0__0__Impl rule__Position__Group_0__1 )
            // InternalSml.g:2622:2: rule__Position__Group_0__0__Impl rule__Position__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__Position__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_0__0"


    // $ANTLR start "rule__Position__Group_0__0__Impl"
    // InternalSml.g:2629:1: rule__Position__Group_0__0__Impl : ( () ) ;
    public final void rule__Position__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2633:1: ( ( () ) )
            // InternalSml.g:2634:1: ( () )
            {
            // InternalSml.g:2634:1: ( () )
            // InternalSml.g:2635:2: ()
            {
             before(grammarAccess.getPositionAccess().getCircleAction_0_0()); 
            // InternalSml.g:2636:2: ()
            // InternalSml.g:2636:3: 
            {
            }

             after(grammarAccess.getPositionAccess().getCircleAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_0__0__Impl"


    // $ANTLR start "rule__Position__Group_0__1"
    // InternalSml.g:2644:1: rule__Position__Group_0__1 : rule__Position__Group_0__1__Impl rule__Position__Group_0__2 ;
    public final void rule__Position__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2648:1: ( rule__Position__Group_0__1__Impl rule__Position__Group_0__2 )
            // InternalSml.g:2649:2: rule__Position__Group_0__1__Impl rule__Position__Group_0__2
            {
            pushFollow(FOLLOW_39);
            rule__Position__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_0__1"


    // $ANTLR start "rule__Position__Group_0__1__Impl"
    // InternalSml.g:2656:1: rule__Position__Group_0__1__Impl : ( 'center' ) ;
    public final void rule__Position__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2660:1: ( ( 'center' ) )
            // InternalSml.g:2661:1: ( 'center' )
            {
            // InternalSml.g:2661:1: ( 'center' )
            // InternalSml.g:2662:2: 'center'
            {
             before(grammarAccess.getPositionAccess().getCenterKeyword_0_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCenterKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_0__1__Impl"


    // $ANTLR start "rule__Position__Group_0__2"
    // InternalSml.g:2671:1: rule__Position__Group_0__2 : rule__Position__Group_0__2__Impl ;
    public final void rule__Position__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2675:1: ( rule__Position__Group_0__2__Impl )
            // InternalSml.g:2676:2: rule__Position__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_0__2"


    // $ANTLR start "rule__Position__Group_0__2__Impl"
    // InternalSml.g:2682:1: rule__Position__Group_0__2__Impl : ( ( rule__Position__PointAssignment_0_2 ) ) ;
    public final void rule__Position__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2686:1: ( ( ( rule__Position__PointAssignment_0_2 ) ) )
            // InternalSml.g:2687:1: ( ( rule__Position__PointAssignment_0_2 ) )
            {
            // InternalSml.g:2687:1: ( ( rule__Position__PointAssignment_0_2 ) )
            // InternalSml.g:2688:2: ( rule__Position__PointAssignment_0_2 )
            {
             before(grammarAccess.getPositionAccess().getPointAssignment_0_2()); 
            // InternalSml.g:2689:2: ( rule__Position__PointAssignment_0_2 )
            // InternalSml.g:2689:3: rule__Position__PointAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__PointAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPointAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_0__2__Impl"


    // $ANTLR start "rule__Position__Group_1__0"
    // InternalSml.g:2698:1: rule__Position__Group_1__0 : rule__Position__Group_1__0__Impl rule__Position__Group_1__1 ;
    public final void rule__Position__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2702:1: ( rule__Position__Group_1__0__Impl rule__Position__Group_1__1 )
            // InternalSml.g:2703:2: rule__Position__Group_1__0__Impl rule__Position__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Position__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_1__0"


    // $ANTLR start "rule__Position__Group_1__0__Impl"
    // InternalSml.g:2710:1: rule__Position__Group_1__0__Impl : ( () ) ;
    public final void rule__Position__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2714:1: ( ( () ) )
            // InternalSml.g:2715:1: ( () )
            {
            // InternalSml.g:2715:1: ( () )
            // InternalSml.g:2716:2: ()
            {
             before(grammarAccess.getPositionAccess().getRectangleAction_1_0()); 
            // InternalSml.g:2717:2: ()
            // InternalSml.g:2717:3: 
            {
            }

             after(grammarAccess.getPositionAccess().getRectangleAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_1__0__Impl"


    // $ANTLR start "rule__Position__Group_1__1"
    // InternalSml.g:2725:1: rule__Position__Group_1__1 : rule__Position__Group_1__1__Impl rule__Position__Group_1__2 ;
    public final void rule__Position__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2729:1: ( rule__Position__Group_1__1__Impl rule__Position__Group_1__2 )
            // InternalSml.g:2730:2: rule__Position__Group_1__1__Impl rule__Position__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__Position__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_1__1"


    // $ANTLR start "rule__Position__Group_1__1__Impl"
    // InternalSml.g:2737:1: rule__Position__Group_1__1__Impl : ( 'reference point' ) ;
    public final void rule__Position__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2741:1: ( ( 'reference point' ) )
            // InternalSml.g:2742:1: ( 'reference point' )
            {
            // InternalSml.g:2742:1: ( 'reference point' )
            // InternalSml.g:2743:2: 'reference point'
            {
             before(grammarAccess.getPositionAccess().getReferencePointKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getReferencePointKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_1__1__Impl"


    // $ANTLR start "rule__Position__Group_1__2"
    // InternalSml.g:2752:1: rule__Position__Group_1__2 : rule__Position__Group_1__2__Impl ;
    public final void rule__Position__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2756:1: ( rule__Position__Group_1__2__Impl )
            // InternalSml.g:2757:2: rule__Position__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_1__2"


    // $ANTLR start "rule__Position__Group_1__2__Impl"
    // InternalSml.g:2763:1: rule__Position__Group_1__2__Impl : ( ( rule__Position__PointAssignment_1_2 ) ) ;
    public final void rule__Position__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2767:1: ( ( ( rule__Position__PointAssignment_1_2 ) ) )
            // InternalSml.g:2768:1: ( ( rule__Position__PointAssignment_1_2 ) )
            {
            // InternalSml.g:2768:1: ( ( rule__Position__PointAssignment_1_2 ) )
            // InternalSml.g:2769:2: ( rule__Position__PointAssignment_1_2 )
            {
             before(grammarAccess.getPositionAccess().getPointAssignment_1_2()); 
            // InternalSml.g:2770:2: ( rule__Position__PointAssignment_1_2 )
            // InternalSml.g:2770:3: rule__Position__PointAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__PointAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPointAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_1__2__Impl"


    // $ANTLR start "rule__Position__Group_2__0"
    // InternalSml.g:2779:1: rule__Position__Group_2__0 : rule__Position__Group_2__0__Impl rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2783:1: ( rule__Position__Group_2__0__Impl rule__Position__Group_2__1 )
            // InternalSml.g:2784:2: rule__Position__Group_2__0__Impl rule__Position__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Position__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_2__0"


    // $ANTLR start "rule__Position__Group_2__0__Impl"
    // InternalSml.g:2791:1: rule__Position__Group_2__0__Impl : ( () ) ;
    public final void rule__Position__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2795:1: ( ( () ) )
            // InternalSml.g:2796:1: ( () )
            {
            // InternalSml.g:2796:1: ( () )
            // InternalSml.g:2797:2: ()
            {
             before(grammarAccess.getPositionAccess().getPointDAction_2_0()); 
            // InternalSml.g:2798:2: ()
            // InternalSml.g:2798:3: 
            {
            }

             after(grammarAccess.getPositionAccess().getPointDAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_2__0__Impl"


    // $ANTLR start "rule__Position__Group_2__1"
    // InternalSml.g:2806:1: rule__Position__Group_2__1 : rule__Position__Group_2__1__Impl rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2810:1: ( rule__Position__Group_2__1__Impl rule__Position__Group_2__2 )
            // InternalSml.g:2811:2: rule__Position__Group_2__1__Impl rule__Position__Group_2__2
            {
            pushFollow(FOLLOW_39);
            rule__Position__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_2__1"


    // $ANTLR start "rule__Position__Group_2__1__Impl"
    // InternalSml.g:2818:1: rule__Position__Group_2__1__Impl : ( 'point' ) ;
    public final void rule__Position__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2822:1: ( ( 'point' ) )
            // InternalSml.g:2823:1: ( 'point' )
            {
            // InternalSml.g:2823:1: ( 'point' )
            // InternalSml.g:2824:2: 'point'
            {
             before(grammarAccess.getPositionAccess().getPointKeyword_2_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPointKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_2__1__Impl"


    // $ANTLR start "rule__Position__Group_2__2"
    // InternalSml.g:2833:1: rule__Position__Group_2__2 : rule__Position__Group_2__2__Impl ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2837:1: ( rule__Position__Group_2__2__Impl )
            // InternalSml.g:2838:2: rule__Position__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_2__2"


    // $ANTLR start "rule__Position__Group_2__2__Impl"
    // InternalSml.g:2844:1: rule__Position__Group_2__2__Impl : ( ( rule__Position__PointAssignment_2_2 ) ) ;
    public final void rule__Position__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2848:1: ( ( ( rule__Position__PointAssignment_2_2 ) ) )
            // InternalSml.g:2849:1: ( ( rule__Position__PointAssignment_2_2 ) )
            {
            // InternalSml.g:2849:1: ( ( rule__Position__PointAssignment_2_2 ) )
            // InternalSml.g:2850:2: ( rule__Position__PointAssignment_2_2 )
            {
             before(grammarAccess.getPositionAccess().getPointAssignment_2_2()); 
            // InternalSml.g:2851:2: ( rule__Position__PointAssignment_2_2 )
            // InternalSml.g:2851:3: rule__Position__PointAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__PointAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPointAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_2__2__Impl"


    // $ANTLR start "rule__Arena__Group__0"
    // InternalSml.g:2860:1: rule__Arena__Group__0 : rule__Arena__Group__0__Impl rule__Arena__Group__1 ;
    public final void rule__Arena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2864:1: ( rule__Arena__Group__0__Impl rule__Arena__Group__1 )
            // InternalSml.g:2865:2: rule__Arena__Group__0__Impl rule__Arena__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Arena__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__0"


    // $ANTLR start "rule__Arena__Group__0__Impl"
    // InternalSml.g:2872:1: rule__Arena__Group__0__Impl : ( 'The' ) ;
    public final void rule__Arena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2876:1: ( ( 'The' ) )
            // InternalSml.g:2877:1: ( 'The' )
            {
            // InternalSml.g:2877:1: ( 'The' )
            // InternalSml.g:2878:2: 'The'
            {
             before(grammarAccess.getArenaAccess().getTheKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__0__Impl"


    // $ANTLR start "rule__Arena__Group__1"
    // InternalSml.g:2887:1: rule__Arena__Group__1 : rule__Arena__Group__1__Impl rule__Arena__Group__2 ;
    public final void rule__Arena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2891:1: ( rule__Arena__Group__1__Impl rule__Arena__Group__2 )
            // InternalSml.g:2892:2: rule__Arena__Group__1__Impl rule__Arena__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Arena__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__1"


    // $ANTLR start "rule__Arena__Group__1__Impl"
    // InternalSml.g:2899:1: rule__Arena__Group__1__Impl : ( 'arena' ) ;
    public final void rule__Arena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2903:1: ( ( 'arena' ) )
            // InternalSml.g:2904:1: ( 'arena' )
            {
            // InternalSml.g:2904:1: ( 'arena' )
            // InternalSml.g:2905:2: 'arena'
            {
             before(grammarAccess.getArenaAccess().getArenaKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getArenaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__1__Impl"


    // $ANTLR start "rule__Arena__Group__2"
    // InternalSml.g:2914:1: rule__Arena__Group__2 : rule__Arena__Group__2__Impl rule__Arena__Group__3 ;
    public final void rule__Arena__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2918:1: ( rule__Arena__Group__2__Impl rule__Arena__Group__3 )
            // InternalSml.g:2919:2: rule__Arena__Group__2__Impl rule__Arena__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Arena__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__2"


    // $ANTLR start "rule__Arena__Group__2__Impl"
    // InternalSml.g:2926:1: rule__Arena__Group__2__Impl : ( 'is' ) ;
    public final void rule__Arena__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2930:1: ( ( 'is' ) )
            // InternalSml.g:2931:1: ( 'is' )
            {
            // InternalSml.g:2931:1: ( 'is' )
            // InternalSml.g:2932:2: 'is'
            {
             before(grammarAccess.getArenaAccess().getIsKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__2__Impl"


    // $ANTLR start "rule__Arena__Group__3"
    // InternalSml.g:2941:1: rule__Arena__Group__3 : rule__Arena__Group__3__Impl rule__Arena__Group__4 ;
    public final void rule__Arena__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2945:1: ( rule__Arena__Group__3__Impl rule__Arena__Group__4 )
            // InternalSml.g:2946:2: rule__Arena__Group__3__Impl rule__Arena__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Arena__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arena__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__3"


    // $ANTLR start "rule__Arena__Group__3__Impl"
    // InternalSml.g:2953:1: rule__Arena__Group__3__Impl : ( 'a' ) ;
    public final void rule__Arena__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2957:1: ( ( 'a' ) )
            // InternalSml.g:2958:1: ( 'a' )
            {
            // InternalSml.g:2958:1: ( 'a' )
            // InternalSml.g:2959:2: 'a'
            {
             before(grammarAccess.getArenaAccess().getAKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getArenaAccess().getAKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__3__Impl"


    // $ANTLR start "rule__Arena__Group__4"
    // InternalSml.g:2968:1: rule__Arena__Group__4 : rule__Arena__Group__4__Impl ;
    public final void rule__Arena__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2972:1: ( rule__Arena__Group__4__Impl )
            // InternalSml.g:2973:2: rule__Arena__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arena__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__4"


    // $ANTLR start "rule__Arena__Group__4__Impl"
    // InternalSml.g:2979:1: rule__Arena__Group__4__Impl : ( ( rule__Arena__SAssignment_4 ) ) ;
    public final void rule__Arena__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2983:1: ( ( ( rule__Arena__SAssignment_4 ) ) )
            // InternalSml.g:2984:1: ( ( rule__Arena__SAssignment_4 ) )
            {
            // InternalSml.g:2984:1: ( ( rule__Arena__SAssignment_4 ) )
            // InternalSml.g:2985:2: ( rule__Arena__SAssignment_4 )
            {
             before(grammarAccess.getArenaAccess().getSAssignment_4()); 
            // InternalSml.g:2986:2: ( rule__Arena__SAssignment_4 )
            // InternalSml.g:2986:3: rule__Arena__SAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Arena__SAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArenaAccess().getSAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__Group__4__Impl"


    // $ANTLR start "rule__Region__Group__0"
    // InternalSml.g:2995:1: rule__Region__Group__0 : rule__Region__Group__0__Impl rule__Region__Group__1 ;
    public final void rule__Region__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:2999:1: ( rule__Region__Group__0__Impl rule__Region__Group__1 )
            // InternalSml.g:3000:2: rule__Region__Group__0__Impl rule__Region__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Region__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__0"


    // $ANTLR start "rule__Region__Group__0__Impl"
    // InternalSml.g:3007:1: rule__Region__Group__0__Impl : ( ( rule__Region__ColorsAssignment_0 )? ) ;
    public final void rule__Region__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3011:1: ( ( ( rule__Region__ColorsAssignment_0 )? ) )
            // InternalSml.g:3012:1: ( ( rule__Region__ColorsAssignment_0 )? )
            {
            // InternalSml.g:3012:1: ( ( rule__Region__ColorsAssignment_0 )? )
            // InternalSml.g:3013:2: ( rule__Region__ColorsAssignment_0 )?
            {
             before(grammarAccess.getRegionAccess().getColorsAssignment_0()); 
            // InternalSml.g:3014:2: ( rule__Region__ColorsAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=22 && LA13_0<=24)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSml.g:3014:3: rule__Region__ColorsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Region__ColorsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegionAccess().getColorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__0__Impl"


    // $ANTLR start "rule__Region__Group__1"
    // InternalSml.g:3022:1: rule__Region__Group__1 : rule__Region__Group__1__Impl rule__Region__Group__2 ;
    public final void rule__Region__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3026:1: ( rule__Region__Group__1__Impl rule__Region__Group__2 )
            // InternalSml.g:3027:2: rule__Region__Group__1__Impl rule__Region__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Region__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__1"


    // $ANTLR start "rule__Region__Group__1__Impl"
    // InternalSml.g:3034:1: rule__Region__Group__1__Impl : ( ( rule__Region__ShapeAssignment_1 )? ) ;
    public final void rule__Region__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3038:1: ( ( ( rule__Region__ShapeAssignment_1 )? ) )
            // InternalSml.g:3039:1: ( ( rule__Region__ShapeAssignment_1 )? )
            {
            // InternalSml.g:3039:1: ( ( rule__Region__ShapeAssignment_1 )? )
            // InternalSml.g:3040:2: ( rule__Region__ShapeAssignment_1 )?
            {
             before(grammarAccess.getRegionAccess().getShapeAssignment_1()); 
            // InternalSml.g:3041:2: ( rule__Region__ShapeAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=18 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSml.g:3041:3: rule__Region__ShapeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Region__ShapeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegionAccess().getShapeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__1__Impl"


    // $ANTLR start "rule__Region__Group__2"
    // InternalSml.g:3049:1: rule__Region__Group__2 : rule__Region__Group__2__Impl rule__Region__Group__3 ;
    public final void rule__Region__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3053:1: ( rule__Region__Group__2__Impl rule__Region__Group__3 )
            // InternalSml.g:3054:2: rule__Region__Group__2__Impl rule__Region__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Region__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__2"


    // $ANTLR start "rule__Region__Group__2__Impl"
    // InternalSml.g:3061:1: rule__Region__Group__2__Impl : ( ( rule__Region__NameAssignment_2 ) ) ;
    public final void rule__Region__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3065:1: ( ( ( rule__Region__NameAssignment_2 ) ) )
            // InternalSml.g:3066:1: ( ( rule__Region__NameAssignment_2 ) )
            {
            // InternalSml.g:3066:1: ( ( rule__Region__NameAssignment_2 ) )
            // InternalSml.g:3067:2: ( rule__Region__NameAssignment_2 )
            {
             before(grammarAccess.getRegionAccess().getNameAssignment_2()); 
            // InternalSml.g:3068:2: ( rule__Region__NameAssignment_2 )
            // InternalSml.g:3068:3: rule__Region__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Region__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__2__Impl"


    // $ANTLR start "rule__Region__Group__3"
    // InternalSml.g:3076:1: rule__Region__Group__3 : rule__Region__Group__3__Impl rule__Region__Group__4 ;
    public final void rule__Region__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3080:1: ( rule__Region__Group__3__Impl rule__Region__Group__4 )
            // InternalSml.g:3081:2: rule__Region__Group__3__Impl rule__Region__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Region__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__3"


    // $ANTLR start "rule__Region__Group__3__Impl"
    // InternalSml.g:3088:1: rule__Region__Group__3__Impl : ( ( rule__Region__Group_3__0 )? ) ;
    public final void rule__Region__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3092:1: ( ( ( rule__Region__Group_3__0 )? ) )
            // InternalSml.g:3093:1: ( ( rule__Region__Group_3__0 )? )
            {
            // InternalSml.g:3093:1: ( ( rule__Region__Group_3__0 )? )
            // InternalSml.g:3094:2: ( rule__Region__Group_3__0 )?
            {
             before(grammarAccess.getRegionAccess().getGroup_3()); 
            // InternalSml.g:3095:2: ( rule__Region__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSml.g:3095:3: rule__Region__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Region__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__3__Impl"


    // $ANTLR start "rule__Region__Group__4"
    // InternalSml.g:3103:1: rule__Region__Group__4 : rule__Region__Group__4__Impl ;
    public final void rule__Region__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3107:1: ( rule__Region__Group__4__Impl )
            // InternalSml.g:3108:2: rule__Region__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Region__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__4"


    // $ANTLR start "rule__Region__Group__4__Impl"
    // InternalSml.g:3114:1: rule__Region__Group__4__Impl : ( ( rule__Region__Group_4__0 )? ) ;
    public final void rule__Region__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3118:1: ( ( ( rule__Region__Group_4__0 )? ) )
            // InternalSml.g:3119:1: ( ( rule__Region__Group_4__0 )? )
            {
            // InternalSml.g:3119:1: ( ( rule__Region__Group_4__0 )? )
            // InternalSml.g:3120:2: ( rule__Region__Group_4__0 )?
            {
             before(grammarAccess.getRegionAccess().getGroup_4()); 
            // InternalSml.g:3121:2: ( rule__Region__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSml.g:3121:3: rule__Region__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Region__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__4__Impl"


    // $ANTLR start "rule__Region__Group_3__0"
    // InternalSml.g:3130:1: rule__Region__Group_3__0 : rule__Region__Group_3__0__Impl rule__Region__Group_3__1 ;
    public final void rule__Region__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3134:1: ( rule__Region__Group_3__0__Impl rule__Region__Group_3__1 )
            // InternalSml.g:3135:2: rule__Region__Group_3__0__Impl rule__Region__Group_3__1
            {
            pushFollow(FOLLOW_37);
            rule__Region__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_3__0"


    // $ANTLR start "rule__Region__Group_3__0__Impl"
    // InternalSml.g:3142:1: rule__Region__Group_3__0__Impl : ( 'with' ) ;
    public final void rule__Region__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3146:1: ( ( 'with' ) )
            // InternalSml.g:3147:1: ( 'with' )
            {
            // InternalSml.g:3147:1: ( 'with' )
            // InternalSml.g:3148:2: 'with'
            {
             before(grammarAccess.getRegionAccess().getWithKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getWithKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_3__0__Impl"


    // $ANTLR start "rule__Region__Group_3__1"
    // InternalSml.g:3157:1: rule__Region__Group_3__1 : rule__Region__Group_3__1__Impl ;
    public final void rule__Region__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3161:1: ( rule__Region__Group_3__1__Impl )
            // InternalSml.g:3162:2: rule__Region__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Region__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_3__1"


    // $ANTLR start "rule__Region__Group_3__1__Impl"
    // InternalSml.g:3168:1: rule__Region__Group_3__1__Impl : ( ( rule__Region__ReferencepointAssignment_3_1 ) ) ;
    public final void rule__Region__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3172:1: ( ( ( rule__Region__ReferencepointAssignment_3_1 ) ) )
            // InternalSml.g:3173:1: ( ( rule__Region__ReferencepointAssignment_3_1 ) )
            {
            // InternalSml.g:3173:1: ( ( rule__Region__ReferencepointAssignment_3_1 ) )
            // InternalSml.g:3174:2: ( rule__Region__ReferencepointAssignment_3_1 )
            {
             before(grammarAccess.getRegionAccess().getReferencepointAssignment_3_1()); 
            // InternalSml.g:3175:2: ( rule__Region__ReferencepointAssignment_3_1 )
            // InternalSml.g:3175:3: rule__Region__ReferencepointAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Region__ReferencepointAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getReferencepointAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_3__1__Impl"


    // $ANTLR start "rule__Region__Group_4__0"
    // InternalSml.g:3184:1: rule__Region__Group_4__0 : rule__Region__Group_4__0__Impl rule__Region__Group_4__1 ;
    public final void rule__Region__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3188:1: ( rule__Region__Group_4__0__Impl rule__Region__Group_4__1 )
            // InternalSml.g:3189:2: rule__Region__Group_4__0__Impl rule__Region__Group_4__1
            {
            pushFollow(FOLLOW_42);
            rule__Region__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_4__0"


    // $ANTLR start "rule__Region__Group_4__0__Impl"
    // InternalSml.g:3196:1: rule__Region__Group_4__0__Impl : ( 'and' ) ;
    public final void rule__Region__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3200:1: ( ( 'and' ) )
            // InternalSml.g:3201:1: ( 'and' )
            {
            // InternalSml.g:3201:1: ( 'and' )
            // InternalSml.g:3202:2: 'and'
            {
             before(grammarAccess.getRegionAccess().getAndKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getAndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_4__0__Impl"


    // $ANTLR start "rule__Region__Group_4__1"
    // InternalSml.g:3211:1: rule__Region__Group_4__1 : rule__Region__Group_4__1__Impl ;
    public final void rule__Region__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3215:1: ( rule__Region__Group_4__1__Impl )
            // InternalSml.g:3216:2: rule__Region__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Region__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_4__1"


    // $ANTLR start "rule__Region__Group_4__1__Impl"
    // InternalSml.g:3222:1: rule__Region__Group_4__1__Impl : ( ( rule__Region__DimensionsAssignment_4_1 ) ) ;
    public final void rule__Region__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3226:1: ( ( ( rule__Region__DimensionsAssignment_4_1 ) ) )
            // InternalSml.g:3227:1: ( ( rule__Region__DimensionsAssignment_4_1 ) )
            {
            // InternalSml.g:3227:1: ( ( rule__Region__DimensionsAssignment_4_1 ) )
            // InternalSml.g:3228:2: ( rule__Region__DimensionsAssignment_4_1 )
            {
             before(grammarAccess.getRegionAccess().getDimensionsAssignment_4_1()); 
            // InternalSml.g:3229:2: ( rule__Region__DimensionsAssignment_4_1 )
            // InternalSml.g:3229:3: rule__Region__DimensionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Region__DimensionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getDimensionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group_4__1__Impl"


    // $ANTLR start "rule__CircleD__Group__0"
    // InternalSml.g:3238:1: rule__CircleD__Group__0 : rule__CircleD__Group__0__Impl rule__CircleD__Group__1 ;
    public final void rule__CircleD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3242:1: ( rule__CircleD__Group__0__Impl rule__CircleD__Group__1 )
            // InternalSml.g:3243:2: rule__CircleD__Group__0__Impl rule__CircleD__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__CircleD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CircleD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CircleD__Group__0"


    // $ANTLR start "rule__CircleD__Group__0__Impl"
    // InternalSml.g:3250:1: rule__CircleD__Group__0__Impl : ( 'radius' ) ;
    public final void rule__CircleD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3254:1: ( ( 'radius' ) )
            // InternalSml.g:3255:1: ( 'radius' )
            {
            // InternalSml.g:3255:1: ( 'radius' )
            // InternalSml.g:3256:2: 'radius'
            {
             before(grammarAccess.getCircleDAccess().getRadiusKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCircleDAccess().getRadiusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CircleD__Group__0__Impl"


    // $ANTLR start "rule__CircleD__Group__1"
    // InternalSml.g:3265:1: rule__CircleD__Group__1 : rule__CircleD__Group__1__Impl ;
    public final void rule__CircleD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3269:1: ( rule__CircleD__Group__1__Impl )
            // InternalSml.g:3270:2: rule__CircleD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CircleD__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CircleD__Group__1"


    // $ANTLR start "rule__CircleD__Group__1__Impl"
    // InternalSml.g:3276:1: rule__CircleD__Group__1__Impl : ( ( rule__CircleD__RAssignment_1 ) ) ;
    public final void rule__CircleD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3280:1: ( ( ( rule__CircleD__RAssignment_1 ) ) )
            // InternalSml.g:3281:1: ( ( rule__CircleD__RAssignment_1 ) )
            {
            // InternalSml.g:3281:1: ( ( rule__CircleD__RAssignment_1 ) )
            // InternalSml.g:3282:2: ( rule__CircleD__RAssignment_1 )
            {
             before(grammarAccess.getCircleDAccess().getRAssignment_1()); 
            // InternalSml.g:3283:2: ( rule__CircleD__RAssignment_1 )
            // InternalSml.g:3283:3: rule__CircleD__RAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CircleD__RAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCircleDAccess().getRAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CircleD__Group__1__Impl"


    // $ANTLR start "rule__RectangleD__Group__0"
    // InternalSml.g:3292:1: rule__RectangleD__Group__0 : rule__RectangleD__Group__0__Impl rule__RectangleD__Group__1 ;
    public final void rule__RectangleD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3296:1: ( rule__RectangleD__Group__0__Impl rule__RectangleD__Group__1 )
            // InternalSml.g:3297:2: rule__RectangleD__Group__0__Impl rule__RectangleD__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__RectangleD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__0"


    // $ANTLR start "rule__RectangleD__Group__0__Impl"
    // InternalSml.g:3304:1: rule__RectangleD__Group__0__Impl : ( 'length' ) ;
    public final void rule__RectangleD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3308:1: ( ( 'length' ) )
            // InternalSml.g:3309:1: ( 'length' )
            {
            // InternalSml.g:3309:1: ( 'length' )
            // InternalSml.g:3310:2: 'length'
            {
             before(grammarAccess.getRectangleDAccess().getLengthKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRectangleDAccess().getLengthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__0__Impl"


    // $ANTLR start "rule__RectangleD__Group__1"
    // InternalSml.g:3319:1: rule__RectangleD__Group__1 : rule__RectangleD__Group__1__Impl rule__RectangleD__Group__2 ;
    public final void rule__RectangleD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3323:1: ( rule__RectangleD__Group__1__Impl rule__RectangleD__Group__2 )
            // InternalSml.g:3324:2: rule__RectangleD__Group__1__Impl rule__RectangleD__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__RectangleD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__1"


    // $ANTLR start "rule__RectangleD__Group__1__Impl"
    // InternalSml.g:3331:1: rule__RectangleD__Group__1__Impl : ( ( rule__RectangleD__LAssignment_1 ) ) ;
    public final void rule__RectangleD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3335:1: ( ( ( rule__RectangleD__LAssignment_1 ) ) )
            // InternalSml.g:3336:1: ( ( rule__RectangleD__LAssignment_1 ) )
            {
            // InternalSml.g:3336:1: ( ( rule__RectangleD__LAssignment_1 ) )
            // InternalSml.g:3337:2: ( rule__RectangleD__LAssignment_1 )
            {
             before(grammarAccess.getRectangleDAccess().getLAssignment_1()); 
            // InternalSml.g:3338:2: ( rule__RectangleD__LAssignment_1 )
            // InternalSml.g:3338:3: rule__RectangleD__LAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RectangleD__LAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleDAccess().getLAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__1__Impl"


    // $ANTLR start "rule__RectangleD__Group__2"
    // InternalSml.g:3346:1: rule__RectangleD__Group__2 : rule__RectangleD__Group__2__Impl rule__RectangleD__Group__3 ;
    public final void rule__RectangleD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3350:1: ( rule__RectangleD__Group__2__Impl rule__RectangleD__Group__3 )
            // InternalSml.g:3351:2: rule__RectangleD__Group__2__Impl rule__RectangleD__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__RectangleD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__2"


    // $ANTLR start "rule__RectangleD__Group__2__Impl"
    // InternalSml.g:3358:1: rule__RectangleD__Group__2__Impl : ( ',width' ) ;
    public final void rule__RectangleD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3362:1: ( ( ',width' ) )
            // InternalSml.g:3363:1: ( ',width' )
            {
            // InternalSml.g:3363:1: ( ',width' )
            // InternalSml.g:3364:2: ',width'
            {
             before(grammarAccess.getRectangleDAccess().getWidthKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRectangleDAccess().getWidthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__2__Impl"


    // $ANTLR start "rule__RectangleD__Group__3"
    // InternalSml.g:3373:1: rule__RectangleD__Group__3 : rule__RectangleD__Group__3__Impl rule__RectangleD__Group__4 ;
    public final void rule__RectangleD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3377:1: ( rule__RectangleD__Group__3__Impl rule__RectangleD__Group__4 )
            // InternalSml.g:3378:2: rule__RectangleD__Group__3__Impl rule__RectangleD__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__RectangleD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__3"


    // $ANTLR start "rule__RectangleD__Group__3__Impl"
    // InternalSml.g:3385:1: rule__RectangleD__Group__3__Impl : ( ( rule__RectangleD__WAssignment_3 ) ) ;
    public final void rule__RectangleD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3389:1: ( ( ( rule__RectangleD__WAssignment_3 ) ) )
            // InternalSml.g:3390:1: ( ( rule__RectangleD__WAssignment_3 ) )
            {
            // InternalSml.g:3390:1: ( ( rule__RectangleD__WAssignment_3 ) )
            // InternalSml.g:3391:2: ( rule__RectangleD__WAssignment_3 )
            {
             before(grammarAccess.getRectangleDAccess().getWAssignment_3()); 
            // InternalSml.g:3392:2: ( rule__RectangleD__WAssignment_3 )
            // InternalSml.g:3392:3: rule__RectangleD__WAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RectangleD__WAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRectangleDAccess().getWAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__3__Impl"


    // $ANTLR start "rule__RectangleD__Group__4"
    // InternalSml.g:3400:1: rule__RectangleD__Group__4 : rule__RectangleD__Group__4__Impl rule__RectangleD__Group__5 ;
    public final void rule__RectangleD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3404:1: ( rule__RectangleD__Group__4__Impl rule__RectangleD__Group__5 )
            // InternalSml.g:3405:2: rule__RectangleD__Group__4__Impl rule__RectangleD__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__RectangleD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__4"


    // $ANTLR start "rule__RectangleD__Group__4__Impl"
    // InternalSml.g:3412:1: rule__RectangleD__Group__4__Impl : ( 'and' ) ;
    public final void rule__RectangleD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3416:1: ( ( 'and' ) )
            // InternalSml.g:3417:1: ( 'and' )
            {
            // InternalSml.g:3417:1: ( 'and' )
            // InternalSml.g:3418:2: 'and'
            {
             before(grammarAccess.getRectangleDAccess().getAndKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRectangleDAccess().getAndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__4__Impl"


    // $ANTLR start "rule__RectangleD__Group__5"
    // InternalSml.g:3427:1: rule__RectangleD__Group__5 : rule__RectangleD__Group__5__Impl rule__RectangleD__Group__6 ;
    public final void rule__RectangleD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3431:1: ( rule__RectangleD__Group__5__Impl rule__RectangleD__Group__6 )
            // InternalSml.g:3432:2: rule__RectangleD__Group__5__Impl rule__RectangleD__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__RectangleD__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__5"


    // $ANTLR start "rule__RectangleD__Group__5__Impl"
    // InternalSml.g:3439:1: rule__RectangleD__Group__5__Impl : ( 'height' ) ;
    public final void rule__RectangleD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3443:1: ( ( 'height' ) )
            // InternalSml.g:3444:1: ( 'height' )
            {
            // InternalSml.g:3444:1: ( 'height' )
            // InternalSml.g:3445:2: 'height'
            {
             before(grammarAccess.getRectangleDAccess().getHeightKeyword_5()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRectangleDAccess().getHeightKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__5__Impl"


    // $ANTLR start "rule__RectangleD__Group__6"
    // InternalSml.g:3454:1: rule__RectangleD__Group__6 : rule__RectangleD__Group__6__Impl ;
    public final void rule__RectangleD__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3458:1: ( rule__RectangleD__Group__6__Impl )
            // InternalSml.g:3459:2: rule__RectangleD__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RectangleD__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__6"


    // $ANTLR start "rule__RectangleD__Group__6__Impl"
    // InternalSml.g:3465:1: rule__RectangleD__Group__6__Impl : ( ( rule__RectangleD__HAssignment_6 ) ) ;
    public final void rule__RectangleD__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3469:1: ( ( ( rule__RectangleD__HAssignment_6 ) ) )
            // InternalSml.g:3470:1: ( ( rule__RectangleD__HAssignment_6 ) )
            {
            // InternalSml.g:3470:1: ( ( rule__RectangleD__HAssignment_6 ) )
            // InternalSml.g:3471:2: ( rule__RectangleD__HAssignment_6 )
            {
             before(grammarAccess.getRectangleDAccess().getHAssignment_6()); 
            // InternalSml.g:3472:2: ( rule__RectangleD__HAssignment_6 )
            // InternalSml.g:3472:3: rule__RectangleD__HAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RectangleD__HAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRectangleDAccess().getHAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__Group__6__Impl"


    // $ANTLR start "rule__Coordinate__Group__0"
    // InternalSml.g:3481:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3485:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalSml.g:3486:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Coordinate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinate__Group__0"


    // $ANTLR start "rule__Coordinate__Group__0__Impl"
    // InternalSml.g:3493:1: rule__Coordinate__Group__0__Impl : ( ( rule__Coordinate__XAssignment_0 ) ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3497:1: ( ( ( rule__Coordinate__XAssignment_0 ) ) )
            // InternalSml.g:3498:1: ( ( rule__Coordinate__XAssignment_0 ) )
            {
            // InternalSml.g:3498:1: ( ( rule__Coordinate__XAssignment_0 ) )
            // InternalSml.g:3499:2: ( rule__Coordinate__XAssignment_0 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_0()); 
            // InternalSml.g:3500:2: ( rule__Coordinate__XAssignment_0 )
            // InternalSml.g:3500:3: rule__Coordinate__XAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinate__Group__0__Impl"


    // $ANTLR start "rule__Coordinate__Group__1"
    // InternalSml.g:3508:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3512:1: ( rule__Coordinate__Group__1__Impl )
            // InternalSml.g:3513:2: rule__Coordinate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinate__Group__1"


    // $ANTLR start "rule__Coordinate__Group__1__Impl"
    // InternalSml.g:3519:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__YAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3523:1: ( ( ( rule__Coordinate__YAssignment_1 ) ) )
            // InternalSml.g:3524:1: ( ( rule__Coordinate__YAssignment_1 ) )
            {
            // InternalSml.g:3524:1: ( ( rule__Coordinate__YAssignment_1 ) )
            // InternalSml.g:3525:2: ( rule__Coordinate__YAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_1()); 
            // InternalSml.g:3526:2: ( rule__Coordinate__YAssignment_1 )
            // InternalSml.g:3526:3: rule__Coordinate__YAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__YAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getYAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinate__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalSml.g:3535:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3539:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalSml.g:3540:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalSml.g:3547:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3551:1: ( ( RULE_INT ) )
            // InternalSml.g:3552:1: ( RULE_INT )
            {
            // InternalSml.g:3552:1: ( RULE_INT )
            // InternalSml.g:3553:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalSml.g:3562:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3566:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalSml.g:3567:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalSml.g:3574:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3578:1: ( ( '.' ) )
            // InternalSml.g:3579:1: ( '.' )
            {
            // InternalSml.g:3579:1: ( '.' )
            // InternalSml.g:3580:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalSml.g:3589:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3593:1: ( rule__Double__Group__2__Impl )
            // InternalSml.g:3594:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalSml.g:3600:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3604:1: ( ( RULE_INT ) )
            // InternalSml.g:3605:1: ( RULE_INT )
            {
            // InternalSml.g:3605:1: ( RULE_INT )
            // InternalSml.g:3606:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Lowerbound__Group__0"
    // InternalSml.g:3616:1: rule__Lowerbound__Group__0 : rule__Lowerbound__Group__0__Impl rule__Lowerbound__Group__1 ;
    public final void rule__Lowerbound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3620:1: ( rule__Lowerbound__Group__0__Impl rule__Lowerbound__Group__1 )
            // InternalSml.g:3621:2: rule__Lowerbound__Group__0__Impl rule__Lowerbound__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Lowerbound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lowerbound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__Group__0"


    // $ANTLR start "rule__Lowerbound__Group__0__Impl"
    // InternalSml.g:3628:1: rule__Lowerbound__Group__0__Impl : ( 'less' ) ;
    public final void rule__Lowerbound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3632:1: ( ( 'less' ) )
            // InternalSml.g:3633:1: ( 'less' )
            {
            // InternalSml.g:3633:1: ( 'less' )
            // InternalSml.g:3634:2: 'less'
            {
             before(grammarAccess.getLowerboundAccess().getLessKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLowerboundAccess().getLessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__Group__0__Impl"


    // $ANTLR start "rule__Lowerbound__Group__1"
    // InternalSml.g:3643:1: rule__Lowerbound__Group__1 : rule__Lowerbound__Group__1__Impl rule__Lowerbound__Group__2 ;
    public final void rule__Lowerbound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3647:1: ( rule__Lowerbound__Group__1__Impl rule__Lowerbound__Group__2 )
            // InternalSml.g:3648:2: rule__Lowerbound__Group__1__Impl rule__Lowerbound__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Lowerbound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lowerbound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__Group__1"


    // $ANTLR start "rule__Lowerbound__Group__1__Impl"
    // InternalSml.g:3655:1: rule__Lowerbound__Group__1__Impl : ( 'than' ) ;
    public final void rule__Lowerbound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3659:1: ( ( 'than' ) )
            // InternalSml.g:3660:1: ( 'than' )
            {
            // InternalSml.g:3660:1: ( 'than' )
            // InternalSml.g:3661:2: 'than'
            {
             before(grammarAccess.getLowerboundAccess().getThanKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLowerboundAccess().getThanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__Group__1__Impl"


    // $ANTLR start "rule__Lowerbound__Group__2"
    // InternalSml.g:3670:1: rule__Lowerbound__Group__2 : rule__Lowerbound__Group__2__Impl ;
    public final void rule__Lowerbound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3674:1: ( rule__Lowerbound__Group__2__Impl )
            // InternalSml.g:3675:2: rule__Lowerbound__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lowerbound__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__Group__2"


    // $ANTLR start "rule__Lowerbound__Group__2__Impl"
    // InternalSml.g:3681:1: rule__Lowerbound__Group__2__Impl : ( ( rule__Lowerbound__NAssignment_2 ) ) ;
    public final void rule__Lowerbound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3685:1: ( ( ( rule__Lowerbound__NAssignment_2 ) ) )
            // InternalSml.g:3686:1: ( ( rule__Lowerbound__NAssignment_2 ) )
            {
            // InternalSml.g:3686:1: ( ( rule__Lowerbound__NAssignment_2 ) )
            // InternalSml.g:3687:2: ( rule__Lowerbound__NAssignment_2 )
            {
             before(grammarAccess.getLowerboundAccess().getNAssignment_2()); 
            // InternalSml.g:3688:2: ( rule__Lowerbound__NAssignment_2 )
            // InternalSml.g:3688:3: rule__Lowerbound__NAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lowerbound__NAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLowerboundAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__Group__2__Impl"


    // $ANTLR start "rule__LowerorEqualbound__Group__0"
    // InternalSml.g:3697:1: rule__LowerorEqualbound__Group__0 : rule__LowerorEqualbound__Group__0__Impl rule__LowerorEqualbound__Group__1 ;
    public final void rule__LowerorEqualbound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3701:1: ( rule__LowerorEqualbound__Group__0__Impl rule__LowerorEqualbound__Group__1 )
            // InternalSml.g:3702:2: rule__LowerorEqualbound__Group__0__Impl rule__LowerorEqualbound__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__LowerorEqualbound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__0"


    // $ANTLR start "rule__LowerorEqualbound__Group__0__Impl"
    // InternalSml.g:3709:1: rule__LowerorEqualbound__Group__0__Impl : ( 'less' ) ;
    public final void rule__LowerorEqualbound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3713:1: ( ( 'less' ) )
            // InternalSml.g:3714:1: ( 'less' )
            {
            // InternalSml.g:3714:1: ( 'less' )
            // InternalSml.g:3715:2: 'less'
            {
             before(grammarAccess.getLowerorEqualboundAccess().getLessKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLowerorEqualboundAccess().getLessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__0__Impl"


    // $ANTLR start "rule__LowerorEqualbound__Group__1"
    // InternalSml.g:3724:1: rule__LowerorEqualbound__Group__1 : rule__LowerorEqualbound__Group__1__Impl rule__LowerorEqualbound__Group__2 ;
    public final void rule__LowerorEqualbound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3728:1: ( rule__LowerorEqualbound__Group__1__Impl rule__LowerorEqualbound__Group__2 )
            // InternalSml.g:3729:2: rule__LowerorEqualbound__Group__1__Impl rule__LowerorEqualbound__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__LowerorEqualbound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__1"


    // $ANTLR start "rule__LowerorEqualbound__Group__1__Impl"
    // InternalSml.g:3736:1: rule__LowerorEqualbound__Group__1__Impl : ( 'or' ) ;
    public final void rule__LowerorEqualbound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3740:1: ( ( 'or' ) )
            // InternalSml.g:3741:1: ( 'or' )
            {
            // InternalSml.g:3741:1: ( 'or' )
            // InternalSml.g:3742:2: 'or'
            {
             before(grammarAccess.getLowerorEqualboundAccess().getOrKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLowerorEqualboundAccess().getOrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__1__Impl"


    // $ANTLR start "rule__LowerorEqualbound__Group__2"
    // InternalSml.g:3751:1: rule__LowerorEqualbound__Group__2 : rule__LowerorEqualbound__Group__2__Impl rule__LowerorEqualbound__Group__3 ;
    public final void rule__LowerorEqualbound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3755:1: ( rule__LowerorEqualbound__Group__2__Impl rule__LowerorEqualbound__Group__3 )
            // InternalSml.g:3756:2: rule__LowerorEqualbound__Group__2__Impl rule__LowerorEqualbound__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__LowerorEqualbound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__2"


    // $ANTLR start "rule__LowerorEqualbound__Group__2__Impl"
    // InternalSml.g:3763:1: rule__LowerorEqualbound__Group__2__Impl : ( 'equal' ) ;
    public final void rule__LowerorEqualbound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3767:1: ( ( 'equal' ) )
            // InternalSml.g:3768:1: ( 'equal' )
            {
            // InternalSml.g:3768:1: ( 'equal' )
            // InternalSml.g:3769:2: 'equal'
            {
             before(grammarAccess.getLowerorEqualboundAccess().getEqualKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getLowerorEqualboundAccess().getEqualKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__2__Impl"


    // $ANTLR start "rule__LowerorEqualbound__Group__3"
    // InternalSml.g:3778:1: rule__LowerorEqualbound__Group__3 : rule__LowerorEqualbound__Group__3__Impl rule__LowerorEqualbound__Group__4 ;
    public final void rule__LowerorEqualbound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3782:1: ( rule__LowerorEqualbound__Group__3__Impl rule__LowerorEqualbound__Group__4 )
            // InternalSml.g:3783:2: rule__LowerorEqualbound__Group__3__Impl rule__LowerorEqualbound__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__LowerorEqualbound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__3"


    // $ANTLR start "rule__LowerorEqualbound__Group__3__Impl"
    // InternalSml.g:3790:1: rule__LowerorEqualbound__Group__3__Impl : ( 'than' ) ;
    public final void rule__LowerorEqualbound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3794:1: ( ( 'than' ) )
            // InternalSml.g:3795:1: ( 'than' )
            {
            // InternalSml.g:3795:1: ( 'than' )
            // InternalSml.g:3796:2: 'than'
            {
             before(grammarAccess.getLowerorEqualboundAccess().getThanKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLowerorEqualboundAccess().getThanKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__3__Impl"


    // $ANTLR start "rule__LowerorEqualbound__Group__4"
    // InternalSml.g:3805:1: rule__LowerorEqualbound__Group__4 : rule__LowerorEqualbound__Group__4__Impl ;
    public final void rule__LowerorEqualbound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3809:1: ( rule__LowerorEqualbound__Group__4__Impl )
            // InternalSml.g:3810:2: rule__LowerorEqualbound__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__4"


    // $ANTLR start "rule__LowerorEqualbound__Group__4__Impl"
    // InternalSml.g:3816:1: rule__LowerorEqualbound__Group__4__Impl : ( ( rule__LowerorEqualbound__NAssignment_4 ) ) ;
    public final void rule__LowerorEqualbound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3820:1: ( ( ( rule__LowerorEqualbound__NAssignment_4 ) ) )
            // InternalSml.g:3821:1: ( ( rule__LowerorEqualbound__NAssignment_4 ) )
            {
            // InternalSml.g:3821:1: ( ( rule__LowerorEqualbound__NAssignment_4 ) )
            // InternalSml.g:3822:2: ( rule__LowerorEqualbound__NAssignment_4 )
            {
             before(grammarAccess.getLowerorEqualboundAccess().getNAssignment_4()); 
            // InternalSml.g:3823:2: ( rule__LowerorEqualbound__NAssignment_4 )
            // InternalSml.g:3823:3: rule__LowerorEqualbound__NAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LowerorEqualbound__NAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLowerorEqualboundAccess().getNAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__Group__4__Impl"


    // $ANTLR start "rule__Upperbound__Group__0"
    // InternalSml.g:3832:1: rule__Upperbound__Group__0 : rule__Upperbound__Group__0__Impl rule__Upperbound__Group__1 ;
    public final void rule__Upperbound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3836:1: ( rule__Upperbound__Group__0__Impl rule__Upperbound__Group__1 )
            // InternalSml.g:3837:2: rule__Upperbound__Group__0__Impl rule__Upperbound__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Upperbound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Upperbound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__Group__0"


    // $ANTLR start "rule__Upperbound__Group__0__Impl"
    // InternalSml.g:3844:1: rule__Upperbound__Group__0__Impl : ( 'more' ) ;
    public final void rule__Upperbound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3848:1: ( ( 'more' ) )
            // InternalSml.g:3849:1: ( 'more' )
            {
            // InternalSml.g:3849:1: ( 'more' )
            // InternalSml.g:3850:2: 'more'
            {
             before(grammarAccess.getUpperboundAccess().getMoreKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getUpperboundAccess().getMoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__Group__0__Impl"


    // $ANTLR start "rule__Upperbound__Group__1"
    // InternalSml.g:3859:1: rule__Upperbound__Group__1 : rule__Upperbound__Group__1__Impl rule__Upperbound__Group__2 ;
    public final void rule__Upperbound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3863:1: ( rule__Upperbound__Group__1__Impl rule__Upperbound__Group__2 )
            // InternalSml.g:3864:2: rule__Upperbound__Group__1__Impl rule__Upperbound__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Upperbound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Upperbound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__Group__1"


    // $ANTLR start "rule__Upperbound__Group__1__Impl"
    // InternalSml.g:3871:1: rule__Upperbound__Group__1__Impl : ( 'than' ) ;
    public final void rule__Upperbound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3875:1: ( ( 'than' ) )
            // InternalSml.g:3876:1: ( 'than' )
            {
            // InternalSml.g:3876:1: ( 'than' )
            // InternalSml.g:3877:2: 'than'
            {
             before(grammarAccess.getUpperboundAccess().getThanKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUpperboundAccess().getThanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__Group__1__Impl"


    // $ANTLR start "rule__Upperbound__Group__2"
    // InternalSml.g:3886:1: rule__Upperbound__Group__2 : rule__Upperbound__Group__2__Impl ;
    public final void rule__Upperbound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3890:1: ( rule__Upperbound__Group__2__Impl )
            // InternalSml.g:3891:2: rule__Upperbound__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Upperbound__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__Group__2"


    // $ANTLR start "rule__Upperbound__Group__2__Impl"
    // InternalSml.g:3897:1: rule__Upperbound__Group__2__Impl : ( ( rule__Upperbound__NAssignment_2 ) ) ;
    public final void rule__Upperbound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3901:1: ( ( ( rule__Upperbound__NAssignment_2 ) ) )
            // InternalSml.g:3902:1: ( ( rule__Upperbound__NAssignment_2 ) )
            {
            // InternalSml.g:3902:1: ( ( rule__Upperbound__NAssignment_2 ) )
            // InternalSml.g:3903:2: ( rule__Upperbound__NAssignment_2 )
            {
             before(grammarAccess.getUpperboundAccess().getNAssignment_2()); 
            // InternalSml.g:3904:2: ( rule__Upperbound__NAssignment_2 )
            // InternalSml.g:3904:3: rule__Upperbound__NAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Upperbound__NAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpperboundAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__Group__2__Impl"


    // $ANTLR start "rule__UpperorEqualbound__Group__0"
    // InternalSml.g:3913:1: rule__UpperorEqualbound__Group__0 : rule__UpperorEqualbound__Group__0__Impl rule__UpperorEqualbound__Group__1 ;
    public final void rule__UpperorEqualbound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3917:1: ( rule__UpperorEqualbound__Group__0__Impl rule__UpperorEqualbound__Group__1 )
            // InternalSml.g:3918:2: rule__UpperorEqualbound__Group__0__Impl rule__UpperorEqualbound__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__UpperorEqualbound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__0"


    // $ANTLR start "rule__UpperorEqualbound__Group__0__Impl"
    // InternalSml.g:3925:1: rule__UpperorEqualbound__Group__0__Impl : ( 'more' ) ;
    public final void rule__UpperorEqualbound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3929:1: ( ( 'more' ) )
            // InternalSml.g:3930:1: ( 'more' )
            {
            // InternalSml.g:3930:1: ( 'more' )
            // InternalSml.g:3931:2: 'more'
            {
             before(grammarAccess.getUpperorEqualboundAccess().getMoreKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getUpperorEqualboundAccess().getMoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__0__Impl"


    // $ANTLR start "rule__UpperorEqualbound__Group__1"
    // InternalSml.g:3940:1: rule__UpperorEqualbound__Group__1 : rule__UpperorEqualbound__Group__1__Impl rule__UpperorEqualbound__Group__2 ;
    public final void rule__UpperorEqualbound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3944:1: ( rule__UpperorEqualbound__Group__1__Impl rule__UpperorEqualbound__Group__2 )
            // InternalSml.g:3945:2: rule__UpperorEqualbound__Group__1__Impl rule__UpperorEqualbound__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__UpperorEqualbound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__1"


    // $ANTLR start "rule__UpperorEqualbound__Group__1__Impl"
    // InternalSml.g:3952:1: rule__UpperorEqualbound__Group__1__Impl : ( 'or' ) ;
    public final void rule__UpperorEqualbound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3956:1: ( ( 'or' ) )
            // InternalSml.g:3957:1: ( 'or' )
            {
            // InternalSml.g:3957:1: ( 'or' )
            // InternalSml.g:3958:2: 'or'
            {
             before(grammarAccess.getUpperorEqualboundAccess().getOrKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getUpperorEqualboundAccess().getOrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__1__Impl"


    // $ANTLR start "rule__UpperorEqualbound__Group__2"
    // InternalSml.g:3967:1: rule__UpperorEqualbound__Group__2 : rule__UpperorEqualbound__Group__2__Impl rule__UpperorEqualbound__Group__3 ;
    public final void rule__UpperorEqualbound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3971:1: ( rule__UpperorEqualbound__Group__2__Impl rule__UpperorEqualbound__Group__3 )
            // InternalSml.g:3972:2: rule__UpperorEqualbound__Group__2__Impl rule__UpperorEqualbound__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__UpperorEqualbound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__2"


    // $ANTLR start "rule__UpperorEqualbound__Group__2__Impl"
    // InternalSml.g:3979:1: rule__UpperorEqualbound__Group__2__Impl : ( 'equal' ) ;
    public final void rule__UpperorEqualbound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3983:1: ( ( 'equal' ) )
            // InternalSml.g:3984:1: ( 'equal' )
            {
            // InternalSml.g:3984:1: ( 'equal' )
            // InternalSml.g:3985:2: 'equal'
            {
             before(grammarAccess.getUpperorEqualboundAccess().getEqualKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getUpperorEqualboundAccess().getEqualKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__2__Impl"


    // $ANTLR start "rule__UpperorEqualbound__Group__3"
    // InternalSml.g:3994:1: rule__UpperorEqualbound__Group__3 : rule__UpperorEqualbound__Group__3__Impl rule__UpperorEqualbound__Group__4 ;
    public final void rule__UpperorEqualbound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:3998:1: ( rule__UpperorEqualbound__Group__3__Impl rule__UpperorEqualbound__Group__4 )
            // InternalSml.g:3999:2: rule__UpperorEqualbound__Group__3__Impl rule__UpperorEqualbound__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__UpperorEqualbound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__3"


    // $ANTLR start "rule__UpperorEqualbound__Group__3__Impl"
    // InternalSml.g:4006:1: rule__UpperorEqualbound__Group__3__Impl : ( 'than' ) ;
    public final void rule__UpperorEqualbound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4010:1: ( ( 'than' ) )
            // InternalSml.g:4011:1: ( 'than' )
            {
            // InternalSml.g:4011:1: ( 'than' )
            // InternalSml.g:4012:2: 'than'
            {
             before(grammarAccess.getUpperorEqualboundAccess().getThanKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getUpperorEqualboundAccess().getThanKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__3__Impl"


    // $ANTLR start "rule__UpperorEqualbound__Group__4"
    // InternalSml.g:4021:1: rule__UpperorEqualbound__Group__4 : rule__UpperorEqualbound__Group__4__Impl ;
    public final void rule__UpperorEqualbound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4025:1: ( rule__UpperorEqualbound__Group__4__Impl )
            // InternalSml.g:4026:2: rule__UpperorEqualbound__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__4"


    // $ANTLR start "rule__UpperorEqualbound__Group__4__Impl"
    // InternalSml.g:4032:1: rule__UpperorEqualbound__Group__4__Impl : ( ( rule__UpperorEqualbound__NAssignment_4 ) ) ;
    public final void rule__UpperorEqualbound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4036:1: ( ( ( rule__UpperorEqualbound__NAssignment_4 ) ) )
            // InternalSml.g:4037:1: ( ( rule__UpperorEqualbound__NAssignment_4 ) )
            {
            // InternalSml.g:4037:1: ( ( rule__UpperorEqualbound__NAssignment_4 ) )
            // InternalSml.g:4038:2: ( rule__UpperorEqualbound__NAssignment_4 )
            {
             before(grammarAccess.getUpperorEqualboundAccess().getNAssignment_4()); 
            // InternalSml.g:4039:2: ( rule__UpperorEqualbound__NAssignment_4 )
            // InternalSml.g:4039:3: rule__UpperorEqualbound__NAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UpperorEqualbound__NAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUpperorEqualboundAccess().getNAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__Group__4__Impl"


    // $ANTLR start "rule__Interval__Group__0"
    // InternalSml.g:4048:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4052:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSml.g:4053:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0"


    // $ANTLR start "rule__Interval__Group__0__Impl"
    // InternalSml.g:4060:1: rule__Interval__Group__0__Impl : ( 'between' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4064:1: ( ( 'between' ) )
            // InternalSml.g:4065:1: ( 'between' )
            {
            // InternalSml.g:4065:1: ( 'between' )
            // InternalSml.g:4066:2: 'between'
            {
             before(grammarAccess.getIntervalAccess().getBetweenKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getBetweenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // InternalSml.g:4075:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4079:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSml.g:4080:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1"


    // $ANTLR start "rule__Interval__Group__1__Impl"
    // InternalSml.g:4087:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__MAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4091:1: ( ( ( rule__Interval__MAssignment_1 ) ) )
            // InternalSml.g:4092:1: ( ( rule__Interval__MAssignment_1 ) )
            {
            // InternalSml.g:4092:1: ( ( rule__Interval__MAssignment_1 ) )
            // InternalSml.g:4093:2: ( rule__Interval__MAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getMAssignment_1()); 
            // InternalSml.g:4094:2: ( rule__Interval__MAssignment_1 )
            // InternalSml.g:4094:3: rule__Interval__MAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interval__MAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getMAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // InternalSml.g:4102:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4106:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSml.g:4107:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Interval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2"


    // $ANTLR start "rule__Interval__Group__2__Impl"
    // InternalSml.g:4114:1: rule__Interval__Group__2__Impl : ( 'and' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4118:1: ( ( 'and' ) )
            // InternalSml.g:4119:1: ( 'and' )
            {
            // InternalSml.g:4119:1: ( 'and' )
            // InternalSml.g:4120:2: 'and'
            {
             before(grammarAccess.getIntervalAccess().getAndKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getAndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__Interval__Group__3"
    // InternalSml.g:4129:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4133:1: ( rule__Interval__Group__3__Impl )
            // InternalSml.g:4134:2: rule__Interval__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__3"


    // $ANTLR start "rule__Interval__Group__3__Impl"
    // InternalSml.g:4140:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__NAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4144:1: ( ( ( rule__Interval__NAssignment_3 ) ) )
            // InternalSml.g:4145:1: ( ( rule__Interval__NAssignment_3 ) )
            {
            // InternalSml.g:4145:1: ( ( rule__Interval__NAssignment_3 ) )
            // InternalSml.g:4146:2: ( rule__Interval__NAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getNAssignment_3()); 
            // InternalSml.g:4147:2: ( rule__Interval__NAssignment_3 )
            // InternalSml.g:4147:3: rule__Interval__NAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interval__NAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getNAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__3__Impl"


    // $ANTLR start "rule__Model__ArenasAssignment_0"
    // InternalSml.g:4156:1: rule__Model__ArenasAssignment_0 : ( ruleArena ) ;
    public final void rule__Model__ArenasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4160:1: ( ( ruleArena ) )
            // InternalSml.g:4161:2: ( ruleArena )
            {
            // InternalSml.g:4161:2: ( ruleArena )
            // InternalSml.g:4162:3: ruleArena
            {
             before(grammarAccess.getModelAccess().getArenasArenaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArena();

            state._fsp--;

             after(grammarAccess.getModelAccess().getArenasArenaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ArenasAssignment_0"


    // $ANTLR start "rule__Model__EnvAssignment_1"
    // InternalSml.g:4171:1: rule__Model__EnvAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Model__EnvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4175:1: ( ( ruleEnvironment ) )
            // InternalSml.g:4176:2: ( ruleEnvironment )
            {
            // InternalSml.g:4176:2: ( ruleEnvironment )
            // InternalSml.g:4177:3: ruleEnvironment
            {
             before(grammarAccess.getModelAccess().getEnvEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEnvEnvironmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EnvAssignment_1"


    // $ANTLR start "rule__Model__SwAssignment_2"
    // InternalSml.g:4186:1: rule__Model__SwAssignment_2 : ( ruleSwarmconf ) ;
    public final void rule__Model__SwAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4190:1: ( ( ruleSwarmconf ) )
            // InternalSml.g:4191:2: ( ruleSwarmconf )
            {
            // InternalSml.g:4191:2: ( ruleSwarmconf )
            // InternalSml.g:4192:3: ruleSwarmconf
            {
             before(grammarAccess.getModelAccess().getSwSwarmconfParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSwarmconf();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSwSwarmconfParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SwAssignment_2"


    // $ANTLR start "rule__Environment__EnvironmentAssignment_1"
    // InternalSml.g:4201:1: rule__Environment__EnvironmentAssignment_1 : ( ruleEnvironmentElements ) ;
    public final void rule__Environment__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4205:1: ( ( ruleEnvironmentElements ) )
            // InternalSml.g:4206:2: ( ruleEnvironmentElements )
            {
            // InternalSml.g:4206:2: ( ruleEnvironmentElements )
            // InternalSml.g:4207:3: ruleEnvironmentElements
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentElementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentElements();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentElementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__EnvironmentAssignment_1"


    // $ANTLR start "rule__ProbabilisticDecription__DisAssignment_3"
    // InternalSml.g:4216:1: rule__ProbabilisticDecription__DisAssignment_3 : ( ruleDistribution ) ;
    public final void rule__ProbabilisticDecription__DisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4220:1: ( ( ruleDistribution ) )
            // InternalSml.g:4221:2: ( ruleDistribution )
            {
            // InternalSml.g:4221:2: ( ruleDistribution )
            // InternalSml.g:4222:3: ruleDistribution
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getDisDistributionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDistribution();

            state._fsp--;

             after(grammarAccess.getProbabilisticDecriptionAccess().getDisDistributionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__DisAssignment_3"


    // $ANTLR start "rule__ProbabilisticDecription__KAssignment_7"
    // InternalSml.g:4231:1: rule__ProbabilisticDecription__KAssignment_7 : ( ruleRegion ) ;
    public final void rule__ProbabilisticDecription__KAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4235:1: ( ( ruleRegion ) )
            // InternalSml.g:4236:2: ( ruleRegion )
            {
            // InternalSml.g:4236:2: ( ruleRegion )
            // InternalSml.g:4237:3: ruleRegion
            {
             before(grammarAccess.getProbabilisticDecriptionAccess().getKRegionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getProbabilisticDecriptionAccess().getKRegionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilisticDecription__KAssignment_7"


    // $ANTLR start "rule__Swarmconf__XAssignment_5"
    // InternalSml.g:4246:1: rule__Swarmconf__XAssignment_5 : ( ruleRange ) ;
    public final void rule__Swarmconf__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4250:1: ( ( ruleRange ) )
            // InternalSml.g:4251:2: ( ruleRange )
            {
            // InternalSml.g:4251:2: ( ruleRange )
            // InternalSml.g:4252:3: ruleRange
            {
             before(grammarAccess.getSwarmconfAccess().getXRangeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getSwarmconfAccess().getXRangeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__XAssignment_5"


    // $ANTLR start "rule__Swarmconf__RAssignment_6"
    // InternalSml.g:4261:1: rule__Swarmconf__RAssignment_6 : ( ruleRobot ) ;
    public final void rule__Swarmconf__RAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4265:1: ( ( ruleRobot ) )
            // InternalSml.g:4266:2: ( ruleRobot )
            {
            // InternalSml.g:4266:2: ( ruleRobot )
            // InternalSml.g:4267:3: ruleRobot
            {
             before(grammarAccess.getSwarmconfAccess().getRRobotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getSwarmconfAccess().getRRobotParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__RAssignment_6"


    // $ANTLR start "rule__Swarmconf__PrAssignment_7"
    // InternalSml.g:4276:1: rule__Swarmconf__PrAssignment_7 : ( ruleProbabilisticDecription ) ;
    public final void rule__Swarmconf__PrAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4280:1: ( ( ruleProbabilisticDecription ) )
            // InternalSml.g:4281:2: ( ruleProbabilisticDecription )
            {
            // InternalSml.g:4281:2: ( ruleProbabilisticDecription )
            // InternalSml.g:4282:3: ruleProbabilisticDecription
            {
             before(grammarAccess.getSwarmconfAccess().getPrProbabilisticDecriptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleProbabilisticDecription();

            state._fsp--;

             after(grammarAccess.getSwarmconfAccess().getPrProbabilisticDecriptionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swarmconf__PrAssignment_7"


    // $ANTLR start "rule__ElementDescription__ElAssignment_0"
    // InternalSml.g:4291:1: rule__ElementDescription__ElAssignment_0 : ( ( 'There' ) ) ;
    public final void rule__ElementDescription__ElAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4295:1: ( ( ( 'There' ) ) )
            // InternalSml.g:4296:2: ( ( 'There' ) )
            {
            // InternalSml.g:4296:2: ( ( 'There' ) )
            // InternalSml.g:4297:3: ( 'There' )
            {
             before(grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0()); 
            // InternalSml.g:4298:3: ( 'There' )
            // InternalSml.g:4299:4: 'There'
            {
             before(grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0()); 

            }

             after(grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__ElAssignment_0"


    // $ANTLR start "rule__ElementDescription__XAssignment_2"
    // InternalSml.g:4310:1: rule__ElementDescription__XAssignment_2 : ( ruleRange ) ;
    public final void rule__ElementDescription__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4314:1: ( ( ruleRange ) )
            // InternalSml.g:4315:2: ( ruleRange )
            {
            // InternalSml.g:4315:2: ( ruleRange )
            // InternalSml.g:4316:3: ruleRange
            {
             before(grammarAccess.getElementDescriptionAccess().getXRangeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getElementDescriptionAccess().getXRangeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__XAssignment_2"


    // $ANTLR start "rule__ElementDescription__ObjAssignment_3"
    // InternalSml.g:4325:1: rule__ElementDescription__ObjAssignment_3 : ( ruleElement ) ;
    public final void rule__ElementDescription__ObjAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4329:1: ( ( ruleElement ) )
            // InternalSml.g:4330:2: ( ruleElement )
            {
            // InternalSml.g:4330:2: ( ruleElement )
            // InternalSml.g:4331:3: ruleElement
            {
             before(grammarAccess.getElementDescriptionAccess().getObjElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementDescriptionAccess().getObjElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__ObjAssignment_3"


    // $ANTLR start "rule__ElementDescription__RAssignment_4"
    // InternalSml.g:4340:1: rule__ElementDescription__RAssignment_4 : ( ruleProbabilisticDecription ) ;
    public final void rule__ElementDescription__RAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4344:1: ( ( ruleProbabilisticDecription ) )
            // InternalSml.g:4345:2: ( ruleProbabilisticDecription )
            {
            // InternalSml.g:4345:2: ( ruleProbabilisticDecription )
            // InternalSml.g:4346:3: ruleProbabilisticDecription
            {
             before(grammarAccess.getElementDescriptionAccess().getRProbabilisticDecriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProbabilisticDecription();

            state._fsp--;

             after(grammarAccess.getElementDescriptionAccess().getRProbabilisticDecriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDescription__RAssignment_4"


    // $ANTLR start "rule__Object__ObjAssignment_0"
    // InternalSml.g:4355:1: rule__Object__ObjAssignment_0 : ( ( 'An' ) ) ;
    public final void rule__Object__ObjAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4359:1: ( ( ( 'An' ) ) )
            // InternalSml.g:4360:2: ( ( 'An' ) )
            {
            // InternalSml.g:4360:2: ( ( 'An' ) )
            // InternalSml.g:4361:3: ( 'An' )
            {
             before(grammarAccess.getObjectAccess().getObjAnKeyword_0_0()); 
            // InternalSml.g:4362:3: ( 'An' )
            // InternalSml.g:4363:4: 'An'
            {
             before(grammarAccess.getObjectAccess().getObjAnKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjAnKeyword_0_0()); 

            }

             after(grammarAccess.getObjectAccess().getObjAnKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ObjAssignment_0"


    // $ANTLR start "rule__Object__RAssignment_4"
    // InternalSml.g:4374:1: rule__Object__RAssignment_4 : ( ruleRegion ) ;
    public final void rule__Object__RAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4378:1: ( ( ruleRegion ) )
            // InternalSml.g:4379:2: ( ruleRegion )
            {
            // InternalSml.g:4379:2: ( ruleRegion )
            // InternalSml.g:4380:3: ruleRegion
            {
             before(grammarAccess.getObjectAccess().getRRegionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getRRegionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__RAssignment_4"


    // $ANTLR start "rule__Obstacle__ObsAssignment_0"
    // InternalSml.g:4389:1: rule__Obstacle__ObsAssignment_0 : ( ( 'An' ) ) ;
    public final void rule__Obstacle__ObsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4393:1: ( ( ( 'An' ) ) )
            // InternalSml.g:4394:2: ( ( 'An' ) )
            {
            // InternalSml.g:4394:2: ( ( 'An' ) )
            // InternalSml.g:4395:3: ( 'An' )
            {
             before(grammarAccess.getObstacleAccess().getObsAnKeyword_0_0()); 
            // InternalSml.g:4396:3: ( 'An' )
            // InternalSml.g:4397:4: 'An'
            {
             before(grammarAccess.getObstacleAccess().getObsAnKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getObsAnKeyword_0_0()); 

            }

             after(grammarAccess.getObstacleAccess().getObsAnKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__ObsAssignment_0"


    // $ANTLR start "rule__Obstacle__RAssignment_4"
    // InternalSml.g:4408:1: rule__Obstacle__RAssignment_4 : ( ruleRegion ) ;
    public final void rule__Obstacle__RAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4412:1: ( ( ruleRegion ) )
            // InternalSml.g:4413:2: ( ruleRegion )
            {
            // InternalSml.g:4413:2: ( ruleRegion )
            // InternalSml.g:4414:3: ruleRegion
            {
             before(grammarAccess.getObstacleAccess().getRRegionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getObstacleAccess().getRRegionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__RAssignment_4"


    // $ANTLR start "rule__Light__LAssignment_0"
    // InternalSml.g:4423:1: rule__Light__LAssignment_0 : ( ( 'A' ) ) ;
    public final void rule__Light__LAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4427:1: ( ( ( 'A' ) ) )
            // InternalSml.g:4428:2: ( ( 'A' ) )
            {
            // InternalSml.g:4428:2: ( ( 'A' ) )
            // InternalSml.g:4429:3: ( 'A' )
            {
             before(grammarAccess.getLightAccess().getLAKeyword_0_0()); 
            // InternalSml.g:4430:3: ( 'A' )
            // InternalSml.g:4431:4: 'A'
            {
             before(grammarAccess.getLightAccess().getLAKeyword_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLightAccess().getLAKeyword_0_0()); 

            }

             after(grammarAccess.getLightAccess().getLAKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__LAssignment_0"


    // $ANTLR start "rule__Light__CAssignment_5"
    // InternalSml.g:4442:1: rule__Light__CAssignment_5 : ( ruleColor ) ;
    public final void rule__Light__CAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4446:1: ( ( ruleColor ) )
            // InternalSml.g:4447:2: ( ruleColor )
            {
            // InternalSml.g:4447:2: ( ruleColor )
            // InternalSml.g:4448:3: ruleColor
            {
             before(grammarAccess.getLightAccess().getCColorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getLightAccess().getCColorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__CAssignment_5"


    // $ANTLR start "rule__Light__PAssignment_11"
    // InternalSml.g:4457:1: rule__Light__PAssignment_11 : ( rulePosition ) ;
    public final void rule__Light__PAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4461:1: ( ( rulePosition ) )
            // InternalSml.g:4462:2: ( rulePosition )
            {
            // InternalSml.g:4462:2: ( rulePosition )
            // InternalSml.g:4463:3: rulePosition
            {
             before(grammarAccess.getLightAccess().getPPositionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getLightAccess().getPPositionParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Light__PAssignment_11"


    // $ANTLR start "rule__Position__PointAssignment_0_2"
    // InternalSml.g:4472:1: rule__Position__PointAssignment_0_2 : ( ruleCoordinate ) ;
    public final void rule__Position__PointAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4476:1: ( ( ruleCoordinate ) )
            // InternalSml.g:4477:2: ( ruleCoordinate )
            {
            // InternalSml.g:4477:2: ( ruleCoordinate )
            // InternalSml.g:4478:3: ruleCoordinate
            {
             before(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PointAssignment_0_2"


    // $ANTLR start "rule__Position__PointAssignment_1_2"
    // InternalSml.g:4487:1: rule__Position__PointAssignment_1_2 : ( ruleCoordinate ) ;
    public final void rule__Position__PointAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4491:1: ( ( ruleCoordinate ) )
            // InternalSml.g:4492:2: ( ruleCoordinate )
            {
            // InternalSml.g:4492:2: ( ruleCoordinate )
            // InternalSml.g:4493:3: ruleCoordinate
            {
             before(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PointAssignment_1_2"


    // $ANTLR start "rule__Position__PointAssignment_2_2"
    // InternalSml.g:4502:1: rule__Position__PointAssignment_2_2 : ( ruleCoordinate ) ;
    public final void rule__Position__PointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4506:1: ( ( ruleCoordinate ) )
            // InternalSml.g:4507:2: ( ruleCoordinate )
            {
            // InternalSml.g:4507:2: ( ruleCoordinate )
            // InternalSml.g:4508:3: ruleCoordinate
            {
             before(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PointAssignment_2_2"


    // $ANTLR start "rule__Arena__SAssignment_4"
    // InternalSml.g:4517:1: rule__Arena__SAssignment_4 : ( ruleRegion ) ;
    public final void rule__Arena__SAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4521:1: ( ( ruleRegion ) )
            // InternalSml.g:4522:2: ( ruleRegion )
            {
            // InternalSml.g:4522:2: ( ruleRegion )
            // InternalSml.g:4523:3: ruleRegion
            {
             before(grammarAccess.getArenaAccess().getSRegionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getArenaAccess().getSRegionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arena__SAssignment_4"


    // $ANTLR start "rule__Region__ColorsAssignment_0"
    // InternalSml.g:4532:1: rule__Region__ColorsAssignment_0 : ( ruleColor ) ;
    public final void rule__Region__ColorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4536:1: ( ( ruleColor ) )
            // InternalSml.g:4537:2: ( ruleColor )
            {
            // InternalSml.g:4537:2: ( ruleColor )
            // InternalSml.g:4538:3: ruleColor
            {
             before(grammarAccess.getRegionAccess().getColorsColorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getRegionAccess().getColorsColorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__ColorsAssignment_0"


    // $ANTLR start "rule__Region__ShapeAssignment_1"
    // InternalSml.g:4547:1: rule__Region__ShapeAssignment_1 : ( ruleShape ) ;
    public final void rule__Region__ShapeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4551:1: ( ( ruleShape ) )
            // InternalSml.g:4552:2: ( ruleShape )
            {
            // InternalSml.g:4552:2: ( ruleShape )
            // InternalSml.g:4553:3: ruleShape
            {
             before(grammarAccess.getRegionAccess().getShapeShapeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getRegionAccess().getShapeShapeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__ShapeAssignment_1"


    // $ANTLR start "rule__Region__NameAssignment_2"
    // InternalSml.g:4562:1: rule__Region__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Region__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4566:1: ( ( RULE_ID ) )
            // InternalSml.g:4567:2: ( RULE_ID )
            {
            // InternalSml.g:4567:2: ( RULE_ID )
            // InternalSml.g:4568:3: RULE_ID
            {
             before(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__NameAssignment_2"


    // $ANTLR start "rule__Region__ReferencepointAssignment_3_1"
    // InternalSml.g:4577:1: rule__Region__ReferencepointAssignment_3_1 : ( rulePosition ) ;
    public final void rule__Region__ReferencepointAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4581:1: ( ( rulePosition ) )
            // InternalSml.g:4582:2: ( rulePosition )
            {
            // InternalSml.g:4582:2: ( rulePosition )
            // InternalSml.g:4583:3: rulePosition
            {
             before(grammarAccess.getRegionAccess().getReferencepointPositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getRegionAccess().getReferencepointPositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__ReferencepointAssignment_3_1"


    // $ANTLR start "rule__Region__DimensionsAssignment_4_1"
    // InternalSml.g:4592:1: rule__Region__DimensionsAssignment_4_1 : ( ruleDimension ) ;
    public final void rule__Region__DimensionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4596:1: ( ( ruleDimension ) )
            // InternalSml.g:4597:2: ( ruleDimension )
            {
            // InternalSml.g:4597:2: ( ruleDimension )
            // InternalSml.g:4598:3: ruleDimension
            {
             before(grammarAccess.getRegionAccess().getDimensionsDimensionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getRegionAccess().getDimensionsDimensionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__DimensionsAssignment_4_1"


    // $ANTLR start "rule__CircleD__RAssignment_1"
    // InternalSml.g:4607:1: rule__CircleD__RAssignment_1 : ( ruleDouble ) ;
    public final void rule__CircleD__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4611:1: ( ( ruleDouble ) )
            // InternalSml.g:4612:2: ( ruleDouble )
            {
            // InternalSml.g:4612:2: ( ruleDouble )
            // InternalSml.g:4613:3: ruleDouble
            {
             before(grammarAccess.getCircleDAccess().getRDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getCircleDAccess().getRDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CircleD__RAssignment_1"


    // $ANTLR start "rule__RectangleD__LAssignment_1"
    // InternalSml.g:4622:1: rule__RectangleD__LAssignment_1 : ( ruleDouble ) ;
    public final void rule__RectangleD__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4626:1: ( ( ruleDouble ) )
            // InternalSml.g:4627:2: ( ruleDouble )
            {
            // InternalSml.g:4627:2: ( ruleDouble )
            // InternalSml.g:4628:3: ruleDouble
            {
             before(grammarAccess.getRectangleDAccess().getLDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getRectangleDAccess().getLDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__LAssignment_1"


    // $ANTLR start "rule__RectangleD__WAssignment_3"
    // InternalSml.g:4637:1: rule__RectangleD__WAssignment_3 : ( ruleDouble ) ;
    public final void rule__RectangleD__WAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4641:1: ( ( ruleDouble ) )
            // InternalSml.g:4642:2: ( ruleDouble )
            {
            // InternalSml.g:4642:2: ( ruleDouble )
            // InternalSml.g:4643:3: ruleDouble
            {
             before(grammarAccess.getRectangleDAccess().getWDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getRectangleDAccess().getWDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__WAssignment_3"


    // $ANTLR start "rule__RectangleD__HAssignment_6"
    // InternalSml.g:4652:1: rule__RectangleD__HAssignment_6 : ( ruleDouble ) ;
    public final void rule__RectangleD__HAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4656:1: ( ( ruleDouble ) )
            // InternalSml.g:4657:2: ( ruleDouble )
            {
            // InternalSml.g:4657:2: ( ruleDouble )
            // InternalSml.g:4658:3: ruleDouble
            {
             before(grammarAccess.getRectangleDAccess().getHDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getRectangleDAccess().getHDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RectangleD__HAssignment_6"


    // $ANTLR start "rule__Coordinate__XAssignment_0"
    // InternalSml.g:4667:1: rule__Coordinate__XAssignment_0 : ( ruleDouble ) ;
    public final void rule__Coordinate__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4671:1: ( ( ruleDouble ) )
            // InternalSml.g:4672:2: ( ruleDouble )
            {
            // InternalSml.g:4672:2: ( ruleDouble )
            // InternalSml.g:4673:3: ruleDouble
            {
             before(grammarAccess.getCoordinateAccess().getXDoubleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getCoordinateAccess().getXDoubleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinate__XAssignment_0"


    // $ANTLR start "rule__Coordinate__YAssignment_1"
    // InternalSml.g:4682:1: rule__Coordinate__YAssignment_1 : ( ruleDouble ) ;
    public final void rule__Coordinate__YAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4686:1: ( ( ruleDouble ) )
            // InternalSml.g:4687:2: ( ruleDouble )
            {
            // InternalSml.g:4687:2: ( ruleDouble )
            // InternalSml.g:4688:3: ruleDouble
            {
             before(grammarAccess.getCoordinateAccess().getYDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getCoordinateAccess().getYDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coordinate__YAssignment_1"


    // $ANTLR start "rule__ConstantSize__NAssignment"
    // InternalSml.g:4697:1: rule__ConstantSize__NAssignment : ( RULE_INT ) ;
    public final void rule__ConstantSize__NAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4701:1: ( ( RULE_INT ) )
            // InternalSml.g:4702:2: ( RULE_INT )
            {
            // InternalSml.g:4702:2: ( RULE_INT )
            // InternalSml.g:4703:3: RULE_INT
            {
             before(grammarAccess.getConstantSizeAccess().getNINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantSizeAccess().getNINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantSize__NAssignment"


    // $ANTLR start "rule__Lowerbound__NAssignment_2"
    // InternalSml.g:4712:1: rule__Lowerbound__NAssignment_2 : ( RULE_INT ) ;
    public final void rule__Lowerbound__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4716:1: ( ( RULE_INT ) )
            // InternalSml.g:4717:2: ( RULE_INT )
            {
            // InternalSml.g:4717:2: ( RULE_INT )
            // InternalSml.g:4718:3: RULE_INT
            {
             before(grammarAccess.getLowerboundAccess().getNINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLowerboundAccess().getNINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lowerbound__NAssignment_2"


    // $ANTLR start "rule__LowerorEqualbound__NAssignment_4"
    // InternalSml.g:4727:1: rule__LowerorEqualbound__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__LowerorEqualbound__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4731:1: ( ( RULE_INT ) )
            // InternalSml.g:4732:2: ( RULE_INT )
            {
            // InternalSml.g:4732:2: ( RULE_INT )
            // InternalSml.g:4733:3: RULE_INT
            {
             before(grammarAccess.getLowerorEqualboundAccess().getNINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLowerorEqualboundAccess().getNINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerorEqualbound__NAssignment_4"


    // $ANTLR start "rule__Upperbound__NAssignment_2"
    // InternalSml.g:4742:1: rule__Upperbound__NAssignment_2 : ( RULE_INT ) ;
    public final void rule__Upperbound__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4746:1: ( ( RULE_INT ) )
            // InternalSml.g:4747:2: ( RULE_INT )
            {
            // InternalSml.g:4747:2: ( RULE_INT )
            // InternalSml.g:4748:3: RULE_INT
            {
             before(grammarAccess.getUpperboundAccess().getNINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUpperboundAccess().getNINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upperbound__NAssignment_2"


    // $ANTLR start "rule__UpperorEqualbound__NAssignment_4"
    // InternalSml.g:4757:1: rule__UpperorEqualbound__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__UpperorEqualbound__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4761:1: ( ( RULE_INT ) )
            // InternalSml.g:4762:2: ( RULE_INT )
            {
            // InternalSml.g:4762:2: ( RULE_INT )
            // InternalSml.g:4763:3: RULE_INT
            {
             before(grammarAccess.getUpperorEqualboundAccess().getNINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUpperorEqualboundAccess().getNINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperorEqualbound__NAssignment_4"


    // $ANTLR start "rule__Interval__MAssignment_1"
    // InternalSml.g:4772:1: rule__Interval__MAssignment_1 : ( RULE_INT ) ;
    public final void rule__Interval__MAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4776:1: ( ( RULE_INT ) )
            // InternalSml.g:4777:2: ( RULE_INT )
            {
            // InternalSml.g:4777:2: ( RULE_INT )
            // InternalSml.g:4778:3: RULE_INT
            {
             before(grammarAccess.getIntervalAccess().getMINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getMINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__MAssignment_1"


    // $ANTLR start "rule__Interval__NAssignment_3"
    // InternalSml.g:4787:1: rule__Interval__NAssignment_3 : ( RULE_INT ) ;
    public final void rule__Interval__NAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSml.g:4791:1: ( ( RULE_INT ) )
            // InternalSml.g:4792:2: ( RULE_INT )
            {
            // InternalSml.g:4792:2: ( RULE_INT )
            // InternalSml.g:4793:3: RULE_INT
            {
             before(grammarAccess.getIntervalAccess().getNINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getNINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__NAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001FC0020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1000000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000030000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});

}