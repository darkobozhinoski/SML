package org.xtext.example.sml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.sml.services.SmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'arena'", "'contains'", "'the'", "'following'", "'elements'", "':'", "'distributed'", "'with'", "'a'", "'distribution'", "'in'", "'robot'", "'swarm'", "'consists'", "'of'", "'aggregate'", "'on'", "'seconds'", "'steps'", "'performance'", "'measure'", "'is'", "'defined'", "'terms'", "'an'", "'objective'", "'function'", "'that'", "'maximizes'", "'score'", "'each'", "'At'", "'any'", "'point'", "'time'", "'Before'", "'After'", "'Between'", "'and'", "'Untii'", "'at'", "'Walls change color'", "'gets'", "'penalty'", "'reward'", "'if'", "'it'", "'there'", "'are'", "'more'", "'than'", "'robots'", "'beggining'", "'mission'", "'end'", "'e-puck'", "'foot-boot'", "'uniform'", "'gaussian'", "'constant'", "'There'", "'objects'", "'obstacles'", "'light'", "'sources'", "'An'", "'object'", "'as'", "'obstacle'", "'A'", "'source'", "'emitting'", "'placed'", "'center'", "'reference point'", "'Circle'", "'Polygon'", "'Triangle'", "'Rectangle'", "'red'", "'yellow'", "'green'", "'radius'", "'length'", "',width'", "'height'", "'.'", "'less'", "'or'", "'equal'", "'between'", "'IntLiteral'", "'RealLiteral'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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

        public InternalSmlParser(TokenStream input, SmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSml.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSml.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSml.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSml.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ( (lv_ob_3_0= ruleMissionObjective ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_arenas_0_0 = null;

        EObject lv_env_1_0 = null;

        EObject lv_sw_2_0 = null;

        EObject lv_ob_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:77:2: ( ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ( (lv_ob_3_0= ruleMissionObjective ) ) ) )
            // InternalSml.g:78:2: ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ( (lv_ob_3_0= ruleMissionObjective ) ) )
            {
            // InternalSml.g:78:2: ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ( (lv_ob_3_0= ruleMissionObjective ) ) )
            // InternalSml.g:79:3: ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ( (lv_ob_3_0= ruleMissionObjective ) )
            {
            // InternalSml.g:79:3: ( (lv_arenas_0_0= ruleArena ) )
            // InternalSml.g:80:4: (lv_arenas_0_0= ruleArena )
            {
            // InternalSml.g:80:4: (lv_arenas_0_0= ruleArena )
            // InternalSml.g:81:5: lv_arenas_0_0= ruleArena
            {

            					newCompositeNode(grammarAccess.getModelAccess().getArenasArenaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_arenas_0_0=ruleArena();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"arenas",
            						lv_arenas_0_0,
            						"org.xtext.example.sml.Sml.Arena");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:98:3: ( (lv_env_1_0= ruleEnvironment ) )
            // InternalSml.g:99:4: (lv_env_1_0= ruleEnvironment )
            {
            // InternalSml.g:99:4: (lv_env_1_0= ruleEnvironment )
            // InternalSml.g:100:5: lv_env_1_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getModelAccess().getEnvEnvironmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_env_1_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"env",
            						lv_env_1_0,
            						"org.xtext.example.sml.Sml.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:117:3: ( (lv_sw_2_0= ruleSwarmconf ) )
            // InternalSml.g:118:4: (lv_sw_2_0= ruleSwarmconf )
            {
            // InternalSml.g:118:4: (lv_sw_2_0= ruleSwarmconf )
            // InternalSml.g:119:5: lv_sw_2_0= ruleSwarmconf
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSwSwarmconfParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_sw_2_0=ruleSwarmconf();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"sw",
            						lv_sw_2_0,
            						"org.xtext.example.sml.Sml.Swarmconf");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:136:3: ( (lv_ob_3_0= ruleMissionObjective ) )
            // InternalSml.g:137:4: (lv_ob_3_0= ruleMissionObjective )
            {
            // InternalSml.g:137:4: (lv_ob_3_0= ruleMissionObjective )
            // InternalSml.g:138:5: lv_ob_3_0= ruleMissionObjective
            {

            					newCompositeNode(grammarAccess.getModelAccess().getObMissionObjectiveParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_ob_3_0=ruleMissionObjective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"ob",
            						lv_ob_3_0,
            						"org.xtext.example.sml.Sml.MissionObjective");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEnvironment"
    // InternalSml.g:159:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalSml.g:159:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalSml.g:160:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalSml.g:166:1: ruleEnvironment returns [EObject current=null] : ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_environment_7_0 = null;



        	enterRule();

        try {
            // InternalSml.g:172:2: ( ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* ) )
            // InternalSml.g:173:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* )
            {
            // InternalSml.g:173:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* )
            // InternalSml.g:174:3: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )*
            {
            // InternalSml.g:174:3: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==12) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // InternalSml.g:175:4: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getTheKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getArenaKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getContainsKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getTheKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getFollowingKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getElementsKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getColonKeyword_0_6());
                    			

                    }
                    break;

            }

            // InternalSml.g:204:3: ( (lv_environment_7_0= ruleEnvironmentElements ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==72||LA2_0==77||LA2_0==81) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSml.g:205:4: (lv_environment_7_0= ruleEnvironmentElements )
            	    {
            	    // InternalSml.g:205:4: (lv_environment_7_0= ruleEnvironmentElements )
            	    // InternalSml.g:206:5: lv_environment_7_0= ruleEnvironmentElements
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentElementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_environment_7_0=ruleEnvironmentElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"environment",
            	    						lv_environment_7_0,
            	    						"org.xtext.example.sml.Sml.EnvironmentElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleProbabilisticDecription"
    // InternalSml.g:227:1: entryRuleProbabilisticDecription returns [EObject current=null] : iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF ;
    public final EObject entryRuleProbabilisticDecription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilisticDecription = null;


        try {
            // InternalSml.g:227:64: (iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF )
            // InternalSml.g:228:2: iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF
            {
             newCompositeNode(grammarAccess.getProbabilisticDecriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProbabilisticDecription=ruleProbabilisticDecription();

            state._fsp--;

             current =iv_ruleProbabilisticDecription; 
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
    // $ANTLR end "entryRuleProbabilisticDecription"


    // $ANTLR start "ruleProbabilisticDecription"
    // InternalSml.g:234:1: ruleProbabilisticDecription returns [EObject current=null] : (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) ) ;
    public final EObject ruleProbabilisticDecription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_dis_3_0 = null;

        EObject lv_k_7_0 = null;



        	enterRule();

        try {
            // InternalSml.g:240:2: ( (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) ) )
            // InternalSml.g:241:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) )
            {
            // InternalSml.g:241:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) )
            // InternalSml.g:242:3: otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getProbabilisticDecriptionAccess().getDistributedKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProbabilisticDecriptionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_2());
            		
            // InternalSml.g:254:3: ( (lv_dis_3_0= ruleDistribution ) )
            // InternalSml.g:255:4: (lv_dis_3_0= ruleDistribution )
            {
            // InternalSml.g:255:4: (lv_dis_3_0= ruleDistribution )
            // InternalSml.g:256:5: lv_dis_3_0= ruleDistribution
            {

            					newCompositeNode(grammarAccess.getProbabilisticDecriptionAccess().getDisDistributionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_dis_3_0=ruleDistribution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProbabilisticDecriptionRule());
            					}
            					set(
            						current,
            						"dis",
            						lv_dis_3_0,
            						"org.xtext.example.sml.Sml.Distribution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getProbabilisticDecriptionAccess().getDistributionKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getProbabilisticDecriptionAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_6());
            		
            // InternalSml.g:285:3: ( (lv_k_7_0= ruleRegion ) )
            // InternalSml.g:286:4: (lv_k_7_0= ruleRegion )
            {
            // InternalSml.g:286:4: (lv_k_7_0= ruleRegion )
            // InternalSml.g:287:5: lv_k_7_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getProbabilisticDecriptionAccess().getKRegionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_k_7_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProbabilisticDecriptionRule());
            					}
            					set(
            						current,
            						"k",
            						lv_k_7_0,
            						"org.xtext.example.sml.Sml.Region");
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
    // $ANTLR end "ruleProbabilisticDecription"


    // $ANTLR start "entryRuleSwarmconf"
    // InternalSml.g:308:1: entryRuleSwarmconf returns [EObject current=null] : iv_ruleSwarmconf= ruleSwarmconf EOF ;
    public final EObject entryRuleSwarmconf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwarmconf = null;


        try {
            // InternalSml.g:308:50: (iv_ruleSwarmconf= ruleSwarmconf EOF )
            // InternalSml.g:309:2: iv_ruleSwarmconf= ruleSwarmconf EOF
            {
             newCompositeNode(grammarAccess.getSwarmconfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwarmconf=ruleSwarmconf();

            state._fsp--;

             current =iv_ruleSwarmconf; 
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
    // $ANTLR end "entryRuleSwarmconf"


    // $ANTLR start "ruleSwarmconf"
    // InternalSml.g:315:1: ruleSwarmconf returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) ;
    public final EObject ruleSwarmconf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_x_5_0 = null;

        AntlrDatatypeRuleToken lv_r_6_0 = null;

        EObject lv_pr_7_0 = null;



        	enterRule();

        try {
            // InternalSml.g:321:2: ( (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:322:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:322:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:323:3: otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSwarmconfAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSwarmconfAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSwarmconfAccess().getSwarmKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getSwarmconfAccess().getConsistsKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getSwarmconfAccess().getOfKeyword_4());
            		
            // InternalSml.g:343:3: ( (lv_x_5_0= ruleRange ) )
            // InternalSml.g:344:4: (lv_x_5_0= ruleRange )
            {
            // InternalSml.g:344:4: (lv_x_5_0= ruleRange )
            // InternalSml.g:345:5: lv_x_5_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getXRangeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_x_5_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwarmconfRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_5_0,
            						"org.xtext.example.sml.Sml.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:362:3: ( (lv_r_6_0= ruleRobot ) )
            // InternalSml.g:363:4: (lv_r_6_0= ruleRobot )
            {
            // InternalSml.g:363:4: (lv_r_6_0= ruleRobot )
            // InternalSml.g:364:5: lv_r_6_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getRRobotParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_r_6_0=ruleRobot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwarmconfRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_6_0,
            						"org.xtext.example.sml.Sml.Robot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:381:3: ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            // InternalSml.g:382:4: (lv_pr_7_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:382:4: (lv_pr_7_0= ruleProbabilisticDecription )
            // InternalSml.g:383:5: lv_pr_7_0= ruleProbabilisticDecription
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getPrProbabilisticDecriptionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_pr_7_0=ruleProbabilisticDecription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwarmconfRule());
            					}
            					set(
            						current,
            						"pr",
            						lv_pr_7_0,
            						"org.xtext.example.sml.Sml.ProbabilisticDecription");
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
    // $ANTLR end "ruleSwarmconf"


    // $ANTLR start "entryRuleTask"
    // InternalSml.g:404:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalSml.g:404:45: (iv_ruleTask= ruleTask EOF )
            // InternalSml.g:405:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalSml.g:411:1: ruleTask returns [EObject current=null] : (otherlv_0= 'aggregate' otherlv_1= 'on' ( (lv_r_2_0= ruleRegion ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_r_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:417:2: ( (otherlv_0= 'aggregate' otherlv_1= 'on' ( (lv_r_2_0= ruleRegion ) ) ) )
            // InternalSml.g:418:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (lv_r_2_0= ruleRegion ) ) )
            {
            // InternalSml.g:418:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (lv_r_2_0= ruleRegion ) ) )
            // InternalSml.g:419:3: otherlv_0= 'aggregate' otherlv_1= 'on' ( (lv_r_2_0= ruleRegion ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getAggregateKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getOnKeyword_1());
            		
            // InternalSml.g:427:3: ( (lv_r_2_0= ruleRegion ) )
            // InternalSml.g:428:4: (lv_r_2_0= ruleRegion )
            {
            // InternalSml.g:428:4: (lv_r_2_0= ruleRegion )
            // InternalSml.g:429:5: lv_r_2_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getRRegionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_2_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_2_0,
            						"org.xtext.example.sml.Sml.Region");
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleMetric"
    // InternalSml.g:450:1: entryRuleMetric returns [String current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final String entryRuleMetric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetric = null;


        try {
            // InternalSml.g:450:46: (iv_ruleMetric= ruleMetric EOF )
            // InternalSml.g:451:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric.getText(); 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalSml.g:457:1: ruleMetric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'seconds' | kw= 'steps' ) ;
    public final AntlrDatatypeRuleToken ruleMetric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:463:2: ( (kw= 'seconds' | kw= 'steps' ) )
            // InternalSml.g:464:2: (kw= 'seconds' | kw= 'steps' )
            {
            // InternalSml.g:464:2: (kw= 'seconds' | kw= 'steps' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSml.g:465:3: kw= 'seconds'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getSecondsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:471:3: kw= 'steps'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getStepsKeyword_1());
                    		

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleMissionObjective"
    // InternalSml.g:480:1: entryRuleMissionObjective returns [EObject current=null] : iv_ruleMissionObjective= ruleMissionObjective EOF ;
    public final EObject entryRuleMissionObjective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionObjective = null;


        try {
            // InternalSml.g:480:57: (iv_ruleMissionObjective= ruleMissionObjective EOF )
            // InternalSml.g:481:2: iv_ruleMissionObjective= ruleMissionObjective EOF
            {
             newCompositeNode(grammarAccess.getMissionObjectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionObjective=ruleMissionObjective();

            state._fsp--;

             current =iv_ruleMissionObjective; 
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
    // $ANTLR end "entryRuleMissionObjective"


    // $ANTLR start "ruleMissionObjective"
    // InternalSml.g:487:1: ruleMissionObjective returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'that' otherlv_12= 'maximizes' otherlv_13= 'the' otherlv_14= 'following' otherlv_15= 'score' otherlv_16= ':' ( (lv_in_17_0= ruleIndicator ) )* ) ;
    public final EObject ruleMissionObjective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_in_17_0 = null;



        	enterRule();

        try {
            // InternalSml.g:493:2: ( (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'that' otherlv_12= 'maximizes' otherlv_13= 'the' otherlv_14= 'following' otherlv_15= 'score' otherlv_16= ':' ( (lv_in_17_0= ruleIndicator ) )* ) )
            // InternalSml.g:494:2: (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'that' otherlv_12= 'maximizes' otherlv_13= 'the' otherlv_14= 'following' otherlv_15= 'score' otherlv_16= ':' ( (lv_in_17_0= ruleIndicator ) )* )
            {
            // InternalSml.g:494:2: (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'that' otherlv_12= 'maximizes' otherlv_13= 'the' otherlv_14= 'following' otherlv_15= 'score' otherlv_16= ':' ( (lv_in_17_0= ruleIndicator ) )* )
            // InternalSml.g:495:3: otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'that' otherlv_12= 'maximizes' otherlv_13= 'the' otherlv_14= 'following' otherlv_15= 'score' otherlv_16= ':' ( (lv_in_17_0= ruleIndicator ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionObjectiveAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionObjectiveAccess().getPerformanceKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionObjectiveAccess().getMeasureKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionObjectiveAccess().getIsKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionObjectiveAccess().getDefinedKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionObjectiveAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionObjectiveAccess().getTermsKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionObjectiveAccess().getOfKeyword_7());
            		
            otherlv_8=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionObjectiveAccess().getAnKeyword_8());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionObjectiveAccess().getObjectiveKeyword_9());
            		
            otherlv_10=(Token)match(input,38,FOLLOW_34); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionObjectiveAccess().getFunctionKeyword_10());
            		
            otherlv_11=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_11, grammarAccess.getMissionObjectiveAccess().getThatKeyword_11());
            		
            otherlv_12=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionObjectiveAccess().getMaximizesKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getMissionObjectiveAccess().getTheKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_36); 

            			newLeafNode(otherlv_14, grammarAccess.getMissionObjectiveAccess().getFollowingKeyword_14());
            		
            otherlv_15=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionObjectiveAccess().getScoreKeyword_15());
            		
            otherlv_16=(Token)match(input,17,FOLLOW_37); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionObjectiveAccess().getColonKeyword_16());
            		
            // InternalSml.g:563:3: ( (lv_in_17_0= ruleIndicator ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43||(LA4_0>=47 && LA4_0<=49)||LA4_0==52) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSml.g:564:4: (lv_in_17_0= ruleIndicator )
            	    {
            	    // InternalSml.g:564:4: (lv_in_17_0= ruleIndicator )
            	    // InternalSml.g:565:5: lv_in_17_0= ruleIndicator
            	    {

            	    					newCompositeNode(grammarAccess.getMissionObjectiveAccess().getInIndicatorParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_in_17_0=ruleIndicator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionObjectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"in",
            	    						lv_in_17_0,
            	    						"org.xtext.example.sml.Sml.Indicator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleMissionObjective"


    // $ANTLR start "entryRuleIndicator"
    // InternalSml.g:586:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // InternalSml.g:586:50: (iv_ruleIndicator= ruleIndicator EOF )
            // InternalSml.g:587:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
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
    // $ANTLR end "entryRuleIndicator"


    // $ANTLR start "ruleIndicator"
    // InternalSml.g:593:1: ruleIndicator returns [EObject current=null] : ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) ) ;
    public final EObject ruleIndicator() throws RecognitionException {
        EObject current = null;

        EObject lv_sp_0_0 = null;

        EObject lv_oc_1_1 = null;

        EObject lv_oc_1_2 = null;



        	enterRule();

        try {
            // InternalSml.g:599:2: ( ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) ) )
            // InternalSml.g:600:2: ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) )
            {
            // InternalSml.g:600:2: ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) )
            // InternalSml.g:601:3: ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) )
            {
            // InternalSml.g:601:3: ( (lv_sp_0_0= ruleScope ) )
            // InternalSml.g:602:4: (lv_sp_0_0= ruleScope )
            {
            // InternalSml.g:602:4: (lv_sp_0_0= ruleScope )
            // InternalSml.g:603:5: lv_sp_0_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getIndicatorAccess().getSpScopeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_sp_0_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndicatorRule());
            					}
            					set(
            						current,
            						"sp",
            						lv_sp_0_0,
            						"org.xtext.example.sml.Sml.Scope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:620:3: ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) )
            // InternalSml.g:621:4: ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) )
            {
            // InternalSml.g:621:4: ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) )
            // InternalSml.g:622:5: (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator )
            {
            // InternalSml.g:622:5: (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSml.g:623:6: lv_oc_1_1= ruleAtomicIndicator
                    {

                    						newCompositeNode(grammarAccess.getIndicatorAccess().getOcAtomicIndicatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_oc_1_1=ruleAtomicIndicator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    						}
                    						set(
                    							current,
                    							"oc",
                    							lv_oc_1_1,
                    							"org.xtext.example.sml.Sml.AtomicIndicator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSml.g:639:6: lv_oc_1_2= ruleCompoundIndicator
                    {

                    						newCompositeNode(grammarAccess.getIndicatorAccess().getOcCompoundIndicatorParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_oc_1_2=ruleCompoundIndicator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    						}
                    						set(
                    							current,
                    							"oc",
                    							lv_oc_1_2,
                    							"org.xtext.example.sml.Sml.CompoundIndicator");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleIndicator"


    // $ANTLR start "entryRuleAtomicIndicator"
    // InternalSml.g:661:1: entryRuleAtomicIndicator returns [EObject current=null] : iv_ruleAtomicIndicator= ruleAtomicIndicator EOF ;
    public final EObject entryRuleAtomicIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicIndicator = null;


        try {
            // InternalSml.g:661:56: (iv_ruleAtomicIndicator= ruleAtomicIndicator EOF )
            // InternalSml.g:662:2: iv_ruleAtomicIndicator= ruleAtomicIndicator EOF
            {
             newCompositeNode(grammarAccess.getAtomicIndicatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicIndicator=ruleAtomicIndicator();

            state._fsp--;

             current =iv_ruleAtomicIndicator; 
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
    // $ANTLR end "entryRuleAtomicIndicator"


    // $ANTLR start "ruleAtomicIndicator"
    // InternalSml.g:668:1: ruleAtomicIndicator returns [EObject current=null] : (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) ) ;
    public final EObject ruleAtomicIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oc_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:674:2: ( (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) ) )
            // InternalSml.g:675:2: (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) )
            {
            // InternalSml.g:675:2: (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) )
            // InternalSml.g:676:3: otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicIndicatorAccess().getEachKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicIndicatorAccess().getRobotKeyword_1());
            		
            // InternalSml.g:684:3: ( (lv_oc_2_0= ruleOccurence ) )
            // InternalSml.g:685:4: (lv_oc_2_0= ruleOccurence )
            {
            // InternalSml.g:685:4: (lv_oc_2_0= ruleOccurence )
            // InternalSml.g:686:5: lv_oc_2_0= ruleOccurence
            {

            					newCompositeNode(grammarAccess.getAtomicIndicatorAccess().getOcOccurenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_oc_2_0=ruleOccurence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicIndicatorRule());
            					}
            					set(
            						current,
            						"oc",
            						lv_oc_2_0,
            						"org.xtext.example.sml.Sml.Occurence");
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
    // $ANTLR end "ruleAtomicIndicator"


    // $ANTLR start "entryRuleCompoundIndicator"
    // InternalSml.g:707:1: entryRuleCompoundIndicator returns [EObject current=null] : iv_ruleCompoundIndicator= ruleCompoundIndicator EOF ;
    public final EObject entryRuleCompoundIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundIndicator = null;


        try {
            // InternalSml.g:707:58: (iv_ruleCompoundIndicator= ruleCompoundIndicator EOF )
            // InternalSml.g:708:2: iv_ruleCompoundIndicator= ruleCompoundIndicator EOF
            {
             newCompositeNode(grammarAccess.getCompoundIndicatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundIndicator=ruleCompoundIndicator();

            state._fsp--;

             current =iv_ruleCompoundIndicator; 
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
    // $ANTLR end "entryRuleCompoundIndicator"


    // $ANTLR start "ruleCompoundIndicator"
    // InternalSml.g:714:1: ruleCompoundIndicator returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) ) ;
    public final EObject ruleCompoundIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oc_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:720:2: ( (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) ) )
            // InternalSml.g:721:2: (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) )
            {
            // InternalSml.g:721:2: (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) )
            // InternalSml.g:722:3: otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundIndicatorAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundIndicatorAccess().getSwarmKeyword_1());
            		
            // InternalSml.g:730:3: ( (lv_oc_2_0= ruleOccurence ) )
            // InternalSml.g:731:4: (lv_oc_2_0= ruleOccurence )
            {
            // InternalSml.g:731:4: (lv_oc_2_0= ruleOccurence )
            // InternalSml.g:732:5: lv_oc_2_0= ruleOccurence
            {

            					newCompositeNode(grammarAccess.getCompoundIndicatorAccess().getOcOccurenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_oc_2_0=ruleOccurence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundIndicatorRule());
            					}
            					set(
            						current,
            						"oc",
            						lv_oc_2_0,
            						"org.xtext.example.sml.Sml.Occurence");
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
    // $ANTLR end "ruleCompoundIndicator"


    // $ANTLR start "entryRuleScope"
    // InternalSml.g:753:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalSml.g:753:46: (iv_ruleScope= ruleScope EOF )
            // InternalSml.g:754:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalSml.g:760:1: ruleScope returns [EObject current=null] : ( (otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time' ) | (otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) ) ) | (otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) ) ) | (otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) ) ) | (otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) ) ) | (otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_p_6_0 = null;

        AntlrDatatypeRuleToken lv_p_8_0 = null;

        AntlrDatatypeRuleToken lv_p_10_0 = null;

        AntlrDatatypeRuleToken lv_q_12_0 = null;

        AntlrDatatypeRuleToken lv_p_14_0 = null;

        AntlrDatatypeRuleToken lv_q_16_0 = null;

        EObject lv_t_19_0 = null;



        	enterRule();

        try {
            // InternalSml.g:766:2: ( ( (otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time' ) | (otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) ) ) | (otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) ) ) | (otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) ) ) | (otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) ) ) | (otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) ) ) ) )
            // InternalSml.g:767:2: ( (otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time' ) | (otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) ) ) | (otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) ) ) | (otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) ) ) | (otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) ) ) | (otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) ) ) )
            {
            // InternalSml.g:767:2: ( (otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time' ) | (otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) ) ) | (otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) ) ) | (otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) ) ) | (otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) ) ) | (otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==53) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==51) ) {
                        alt6=5;
                    }
                    else if ( (LA6_6==EOF||LA6_6==14||LA6_6==42) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt6=4;
                }
                break;
            case 52:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSml.g:768:3: (otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time' )
                    {
                    // InternalSml.g:768:3: (otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time' )
                    // InternalSml.g:769:4: otherlv_0= 'At' otherlv_1= 'any' otherlv_2= 'point' otherlv_3= 'of' otherlv_4= 'time'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getScopeAccess().getAtKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,44,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getAnyKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,45,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getPointKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getOfKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getScopeAccess().getTimeKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:791:3: (otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) ) )
                    {
                    // InternalSml.g:791:3: (otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) ) )
                    // InternalSml.g:792:4: otherlv_5= 'Before' ( (lv_p_6_0= ruleAtomicEvent ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getBeforeKeyword_1_0());
                    			
                    // InternalSml.g:796:4: ( (lv_p_6_0= ruleAtomicEvent ) )
                    // InternalSml.g:797:5: (lv_p_6_0= ruleAtomicEvent )
                    {
                    // InternalSml.g:797:5: (lv_p_6_0= ruleAtomicEvent )
                    // InternalSml.g:798:6: lv_p_6_0= ruleAtomicEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getPAtomicEventParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_p_6_0=ruleAtomicEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_6_0,
                    							"org.xtext.example.sml.Sml.AtomicEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:817:3: (otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) ) )
                    {
                    // InternalSml.g:817:3: (otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) ) )
                    // InternalSml.g:818:4: otherlv_7= 'After' ( (lv_p_8_0= ruleAtomicEvent ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_43); 

                    				newLeafNode(otherlv_7, grammarAccess.getScopeAccess().getAfterKeyword_2_0());
                    			
                    // InternalSml.g:822:4: ( (lv_p_8_0= ruleAtomicEvent ) )
                    // InternalSml.g:823:5: (lv_p_8_0= ruleAtomicEvent )
                    {
                    // InternalSml.g:823:5: (lv_p_8_0= ruleAtomicEvent )
                    // InternalSml.g:824:6: lv_p_8_0= ruleAtomicEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getPAtomicEventParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_p_8_0=ruleAtomicEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_8_0,
                    							"org.xtext.example.sml.Sml.AtomicEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSml.g:843:3: (otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) ) )
                    {
                    // InternalSml.g:843:3: (otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) ) )
                    // InternalSml.g:844:4: otherlv_9= 'Between' ( (lv_p_10_0= ruleAtomicEvent ) ) otherlv_11= 'and' ( (lv_q_12_0= ruleAtomicEvent ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_43); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_0());
                    			
                    // InternalSml.g:848:4: ( (lv_p_10_0= ruleAtomicEvent ) )
                    // InternalSml.g:849:5: (lv_p_10_0= ruleAtomicEvent )
                    {
                    // InternalSml.g:849:5: (lv_p_10_0= ruleAtomicEvent )
                    // InternalSml.g:850:6: lv_p_10_0= ruleAtomicEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getPAtomicEventParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_p_10_0=ruleAtomicEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_10_0,
                    							"org.xtext.example.sml.Sml.AtomicEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,50,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_2());
                    			
                    // InternalSml.g:871:4: ( (lv_q_12_0= ruleAtomicEvent ) )
                    // InternalSml.g:872:5: (lv_q_12_0= ruleAtomicEvent )
                    {
                    // InternalSml.g:872:5: (lv_q_12_0= ruleAtomicEvent )
                    // InternalSml.g:873:6: lv_q_12_0= ruleAtomicEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQAtomicEventParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_q_12_0=ruleAtomicEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_12_0,
                    							"org.xtext.example.sml.Sml.AtomicEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalSml.g:892:3: (otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) ) )
                    {
                    // InternalSml.g:892:3: (otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) ) )
                    // InternalSml.g:893:4: otherlv_13= 'After' ( (lv_p_14_0= ruleAtomicEvent ) ) otherlv_15= 'Untii' ( (lv_q_16_0= ruleAtomicEvent ) )
                    {
                    otherlv_13=(Token)match(input,48,FOLLOW_43); 

                    				newLeafNode(otherlv_13, grammarAccess.getScopeAccess().getAfterKeyword_4_0());
                    			
                    // InternalSml.g:897:4: ( (lv_p_14_0= ruleAtomicEvent ) )
                    // InternalSml.g:898:5: (lv_p_14_0= ruleAtomicEvent )
                    {
                    // InternalSml.g:898:5: (lv_p_14_0= ruleAtomicEvent )
                    // InternalSml.g:899:6: lv_p_14_0= ruleAtomicEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getPAtomicEventParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_p_14_0=ruleAtomicEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_14_0,
                    							"org.xtext.example.sml.Sml.AtomicEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,51,FOLLOW_43); 

                    				newLeafNode(otherlv_15, grammarAccess.getScopeAccess().getUntiiKeyword_4_2());
                    			
                    // InternalSml.g:920:4: ( (lv_q_16_0= ruleAtomicEvent ) )
                    // InternalSml.g:921:5: (lv_q_16_0= ruleAtomicEvent )
                    {
                    // InternalSml.g:921:5: (lv_q_16_0= ruleAtomicEvent )
                    // InternalSml.g:922:6: lv_q_16_0= ruleAtomicEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getQAtomicEventParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_q_16_0=ruleAtomicEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"q",
                    							lv_q_16_0,
                    							"org.xtext.example.sml.Sml.AtomicEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalSml.g:941:3: (otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) ) )
                    {
                    // InternalSml.g:941:3: (otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) ) )
                    // InternalSml.g:942:4: otherlv_17= 'at' otherlv_18= 'time' ( (lv_t_19_0= ruleTime ) )
                    {
                    otherlv_17=(Token)match(input,52,FOLLOW_42); 

                    				newLeafNode(otherlv_17, grammarAccess.getScopeAccess().getAtKeyword_5_0());
                    			
                    otherlv_18=(Token)match(input,46,FOLLOW_46); 

                    				newLeafNode(otherlv_18, grammarAccess.getScopeAccess().getTimeKeyword_5_1());
                    			
                    // InternalSml.g:950:4: ( (lv_t_19_0= ruleTime ) )
                    // InternalSml.g:951:5: (lv_t_19_0= ruleTime )
                    {
                    // InternalSml.g:951:5: (lv_t_19_0= ruleTime )
                    // InternalSml.g:952:6: lv_t_19_0= ruleTime
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getTTimeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_19_0=ruleTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_19_0,
                    							"org.xtext.example.sml.Sml.Time");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleAtomicEvent"
    // InternalSml.g:974:1: entryRuleAtomicEvent returns [String current=null] : iv_ruleAtomicEvent= ruleAtomicEvent EOF ;
    public final String entryRuleAtomicEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtomicEvent = null;


        try {
            // InternalSml.g:974:51: (iv_ruleAtomicEvent= ruleAtomicEvent EOF )
            // InternalSml.g:975:2: iv_ruleAtomicEvent= ruleAtomicEvent EOF
            {
             newCompositeNode(grammarAccess.getAtomicEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicEvent=ruleAtomicEvent();

            state._fsp--;

             current =iv_ruleAtomicEvent.getText(); 
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
    // $ANTLR end "entryRuleAtomicEvent"


    // $ANTLR start "ruleAtomicEvent"
    // InternalSml.g:981:1: ruleAtomicEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Walls change color' ;
    public final AntlrDatatypeRuleToken ruleAtomicEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:987:2: (kw= 'Walls change color' )
            // InternalSml.g:988:2: kw= 'Walls change color'
            {
            kw=(Token)match(input,53,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAtomicEventAccess().getWallsChangeColorKeyword());
            	

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
    // $ANTLR end "ruleAtomicEvent"


    // $ANTLR start "entryRuleOccurence"
    // InternalSml.g:996:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalSml.g:996:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalSml.g:997:2: iv_ruleOccurence= ruleOccurence EOF
            {
             newCompositeNode(grammarAccess.getOccurenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurence=ruleOccurence();

            state._fsp--;

             current =iv_ruleOccurence; 
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
    // $ANTLR end "entryRuleOccurence"


    // $ANTLR start "ruleOccurence"
    // InternalSml.g:1003:1: ruleOccurence returns [EObject current=null] : (this_Reward_0= ruleReward | this_Penatly_1= rulePenatly ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        EObject this_Reward_0 = null;

        EObject this_Penatly_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1009:2: ( (this_Reward_0= ruleReward | this_Penatly_1= rulePenatly ) )
            // InternalSml.g:1010:2: (this_Reward_0= ruleReward | this_Penatly_1= rulePenatly )
            {
            // InternalSml.g:1010:2: (this_Reward_0= ruleReward | this_Penatly_1= rulePenatly )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==54) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==55) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==56) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSml.g:1011:3: this_Reward_0= ruleReward
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getRewardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reward_0=ruleReward();

                    state._fsp--;


                    			current = this_Reward_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1020:3: this_Penatly_1= rulePenatly
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getPenatlyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Penatly_1=rulePenatly();

                    state._fsp--;


                    			current = this_Penatly_1;
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
    // $ANTLR end "ruleOccurence"


    // $ANTLR start "entryRulePenatly"
    // InternalSml.g:1032:1: entryRulePenatly returns [EObject current=null] : iv_rulePenatly= rulePenatly EOF ;
    public final EObject entryRulePenatly() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenatly = null;


        try {
            // InternalSml.g:1032:48: (iv_rulePenatly= rulePenatly EOF )
            // InternalSml.g:1033:2: iv_rulePenatly= rulePenatly EOF
            {
             newCompositeNode(grammarAccess.getPenatlyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenatly=rulePenatly();

            state._fsp--;

             current =iv_rulePenatly; 
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
    // $ANTLR end "entryRulePenatly"


    // $ANTLR start "rulePenatly"
    // InternalSml.g:1039:1: rulePenatly returns [EObject current=null] : (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) ;
    public final EObject rulePenatly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_k_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1045:2: ( (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) )
            // InternalSml.g:1046:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            {
            // InternalSml.g:1046:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            // InternalSml.g:1047:3: otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPenatlyAccess().getGetsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getPenatlyAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getPenatlyAccess().getPenaltyKeyword_2());
            		
            // InternalSml.g:1059:3: ( (lv_k_3_0= ruleDouble ) )
            // InternalSml.g:1060:4: (lv_k_3_0= ruleDouble )
            {
            // InternalSml.g:1060:4: (lv_k_3_0= ruleDouble )
            // InternalSml.g:1061:5: lv_k_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getPenatlyAccess().getKDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_k_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPenatlyRule());
            					}
            					set(
            						current,
            						"k",
            						lv_k_3_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:1078:3: ( (lv_c_4_0= ruleCondition ) )
            // InternalSml.g:1079:4: (lv_c_4_0= ruleCondition )
            {
            // InternalSml.g:1079:4: (lv_c_4_0= ruleCondition )
            // InternalSml.g:1080:5: lv_c_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPenatlyAccess().getCConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_c_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPenatlyRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_4_0,
            						"org.xtext.example.sml.Sml.Condition");
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
    // $ANTLR end "rulePenatly"


    // $ANTLR start "entryRuleReward"
    // InternalSml.g:1101:1: entryRuleReward returns [EObject current=null] : iv_ruleReward= ruleReward EOF ;
    public final EObject entryRuleReward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReward = null;


        try {
            // InternalSml.g:1101:47: (iv_ruleReward= ruleReward EOF )
            // InternalSml.g:1102:2: iv_ruleReward= ruleReward EOF
            {
             newCompositeNode(grammarAccess.getRewardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReward=ruleReward();

            state._fsp--;

             current =iv_ruleReward; 
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
    // $ANTLR end "entryRuleReward"


    // $ANTLR start "ruleReward"
    // InternalSml.g:1108:1: ruleReward returns [EObject current=null] : (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) ;
    public final EObject ruleReward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_k_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1114:2: ( (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) )
            // InternalSml.g:1115:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            {
            // InternalSml.g:1115:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            // InternalSml.g:1116:3: otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRewardAccess().getGetsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getRewardAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getRewardAccess().getRewardKeyword_2());
            		
            // InternalSml.g:1128:3: ( (lv_k_3_0= ruleDouble ) )
            // InternalSml.g:1129:4: (lv_k_3_0= ruleDouble )
            {
            // InternalSml.g:1129:4: (lv_k_3_0= ruleDouble )
            // InternalSml.g:1130:5: lv_k_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getRewardAccess().getKDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_k_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRewardRule());
            					}
            					set(
            						current,
            						"k",
            						lv_k_3_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:1147:3: ( (lv_c_4_0= ruleCondition ) )
            // InternalSml.g:1148:4: (lv_c_4_0= ruleCondition )
            {
            // InternalSml.g:1148:4: (lv_c_4_0= ruleCondition )
            // InternalSml.g:1149:5: lv_c_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRewardAccess().getCConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_c_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRewardRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_4_0,
            						"org.xtext.example.sml.Sml.Condition");
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
    // $ANTLR end "ruleReward"


    // $ANTLR start "entryRuleCondition"
    // InternalSml.g:1170:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSml.g:1170:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSml.g:1171:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSml.g:1177:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) ) ) | (otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_n_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_r_5_0 = null;

        EObject lv_r_15_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1183:2: ( ( (otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) ) ) | (otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) ) ) ) )
            // InternalSml.g:1184:2: ( (otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) ) ) | (otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) ) ) )
            {
            // InternalSml.g:1184:2: ( (otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) ) ) | (otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==57) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==59) ) {
                    alt8=2;
                }
                else if ( (LA8_1==58) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSml.g:1185:3: (otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) ) )
                    {
                    // InternalSml.g:1185:3: (otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) ) )
                    // InternalSml.g:1186:4: otherlv_0= 'if' otherlv_1= 'it' otherlv_2= 'is' otherlv_3= 'on' otherlv_4= 'the' ( (lv_r_5_0= ruleRegion ) )
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_51); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,58,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getItKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,33,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getIsKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getOnKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getTheKeyword_0_4());
                    			
                    // InternalSml.g:1206:4: ( (lv_r_5_0= ruleRegion ) )
                    // InternalSml.g:1207:5: (lv_r_5_0= ruleRegion )
                    {
                    // InternalSml.g:1207:5: (lv_r_5_0= ruleRegion )
                    // InternalSml.g:1208:6: lv_r_5_0= ruleRegion
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRRegionParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_5_0=ruleRegion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_5_0,
                    							"org.xtext.example.sml.Sml.Region");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1227:3: (otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) ) )
                    {
                    // InternalSml.g:1227:3: (otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) ) )
                    // InternalSml.g:1228:4: otherlv_6= 'if' otherlv_7= 'there' otherlv_8= 'are' otherlv_9= 'more' otherlv_10= 'than' ( (lv_n_11_0= RULE_INT ) ) otherlv_12= 'robots' otherlv_13= 'on' otherlv_14= 'the' ( (lv_r_15_0= ruleRegion ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_52); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getIfKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,59,FOLLOW_53); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getThereKeyword_1_1());
                    			
                    otherlv_8=(Token)match(input,60,FOLLOW_54); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getAreKeyword_1_2());
                    			
                    otherlv_9=(Token)match(input,61,FOLLOW_55); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getMoreKeyword_1_3());
                    			
                    otherlv_10=(Token)match(input,62,FOLLOW_48); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getThanKeyword_1_4());
                    			
                    // InternalSml.g:1248:4: ( (lv_n_11_0= RULE_INT ) )
                    // InternalSml.g:1249:5: (lv_n_11_0= RULE_INT )
                    {
                    // InternalSml.g:1249:5: (lv_n_11_0= RULE_INT )
                    // InternalSml.g:1250:6: lv_n_11_0= RULE_INT
                    {
                    lv_n_11_0=(Token)match(input,RULE_INT,FOLLOW_56); 

                    						newLeafNode(lv_n_11_0, grammarAccess.getConditionAccess().getNINTTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n",
                    							lv_n_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,63,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getRobotsKeyword_1_6());
                    			
                    otherlv_13=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getOnKeyword_1_7());
                    			
                    otherlv_14=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getConditionAccess().getTheKeyword_1_8());
                    			
                    // InternalSml.g:1278:4: ( (lv_r_15_0= ruleRegion ) )
                    // InternalSml.g:1279:5: (lv_r_15_0= ruleRegion )
                    {
                    // InternalSml.g:1279:5: (lv_r_15_0= ruleRegion )
                    // InternalSml.g:1280:6: lv_r_15_0= ruleRegion
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRRegionParserRuleCall_1_9_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_r_15_0=ruleRegion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"r",
                    							lv_r_15_0,
                    							"org.xtext.example.sml.Sml.Region");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTime"
    // InternalSml.g:1302:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSml.g:1302:45: (iv_ruleTime= ruleTime EOF )
            // InternalSml.g:1303:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSml.g:1309:1: ruleTime returns [EObject current=null] : ( ( (lv_x_0_0= ruleLiteral ) ) | (otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission' ) | (otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission' ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_x_0_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1315:2: ( ( ( (lv_x_0_0= ruleLiteral ) ) | (otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission' ) | (otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission' ) ) )
            // InternalSml.g:1316:2: ( ( (lv_x_0_0= ruleLiteral ) ) | (otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission' ) | (otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission' ) )
            {
            // InternalSml.g:1316:2: ( ( (lv_x_0_0= ruleLiteral ) ) | (otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission' ) | (otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 103:
            case 104:
            case 105:
            case 106:
                {
                alt9=1;
                }
                break;
            case 64:
                {
                alt9=2;
                }
                break;
            case 66:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSml.g:1317:3: ( (lv_x_0_0= ruleLiteral ) )
                    {
                    // InternalSml.g:1317:3: ( (lv_x_0_0= ruleLiteral ) )
                    // InternalSml.g:1318:4: (lv_x_0_0= ruleLiteral )
                    {
                    // InternalSml.g:1318:4: (lv_x_0_0= ruleLiteral )
                    // InternalSml.g:1319:5: lv_x_0_0= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getTimeAccess().getXLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_x_0_0=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimeRule());
                    					}
                    					set(
                    						current,
                    						"x",
                    						lv_x_0_0,
                    						"org.xtext.example.sml.Sml.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1337:3: (otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission' )
                    {
                    // InternalSml.g:1337:3: (otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission' )
                    // InternalSml.g:1338:4: otherlv_1= 'beggining' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'mission'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getBegginingKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getOfKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getTheKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,65,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getMissionKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:1356:3: (otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission' )
                    {
                    // InternalSml.g:1356:3: (otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission' )
                    // InternalSml.g:1357:4: otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'the' otherlv_8= 'mission'
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeAccess().getEndKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getTimeAccess().getOfKeyword_2_1());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_57); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimeAccess().getTheKeyword_2_2());
                    			
                    otherlv_8=(Token)match(input,65,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTimeAccess().getMissionKeyword_2_3());
                    			

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleRobot"
    // InternalSml.g:1378:1: entryRuleRobot returns [String current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final String entryRuleRobot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRobot = null;


        try {
            // InternalSml.g:1378:45: (iv_ruleRobot= ruleRobot EOF )
            // InternalSml.g:1379:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot.getText(); 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalSml.g:1385:1: ruleRobot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e-puck' | kw= 'foot-boot' ) ;
    public final AntlrDatatypeRuleToken ruleRobot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1391:2: ( (kw= 'e-puck' | kw= 'foot-boot' ) )
            // InternalSml.g:1392:2: (kw= 'e-puck' | kw= 'foot-boot' )
            {
            // InternalSml.g:1392:2: (kw= 'e-puck' | kw= 'foot-boot' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==67) ) {
                alt10=1;
            }
            else if ( (LA10_0==68) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSml.g:1393:3: kw= 'e-puck'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRobotAccess().getEPuckKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1399:3: kw= 'foot-boot'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRobotAccess().getFootBootKeyword_1());
                    		

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleDistribution"
    // InternalSml.g:1408:1: entryRuleDistribution returns [String current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final String entryRuleDistribution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDistribution = null;


        try {
            // InternalSml.g:1408:52: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalSml.g:1409:2: iv_ruleDistribution= ruleDistribution EOF
            {
             newCompositeNode(grammarAccess.getDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistribution=ruleDistribution();

            state._fsp--;

             current =iv_ruleDistribution.getText(); 
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
    // $ANTLR end "entryRuleDistribution"


    // $ANTLR start "ruleDistribution"
    // InternalSml.g:1415:1: ruleDistribution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' ) ;
    public final AntlrDatatypeRuleToken ruleDistribution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1421:2: ( (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' ) )
            // InternalSml.g:1422:2: (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' )
            {
            // InternalSml.g:1422:2: (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt11=1;
                }
                break;
            case 70:
                {
                alt11=2;
                }
                break;
            case 71:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSml.g:1423:3: kw= 'uniform'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getUniformKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1429:3: kw= 'gaussian'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getGaussianKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1435:3: kw= 'constant'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getConstantKeyword_2());
                    		

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
    // $ANTLR end "ruleDistribution"


    // $ANTLR start "entryRuleEnvironmentElements"
    // InternalSml.g:1444:1: entryRuleEnvironmentElements returns [EObject current=null] : iv_ruleEnvironmentElements= ruleEnvironmentElements EOF ;
    public final EObject entryRuleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElements = null;


        try {
            // InternalSml.g:1444:60: (iv_ruleEnvironmentElements= ruleEnvironmentElements EOF )
            // InternalSml.g:1445:2: iv_ruleEnvironmentElements= ruleEnvironmentElements EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentElements=ruleEnvironmentElements();

            state._fsp--;

             current =iv_ruleEnvironmentElements; 
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
    // $ANTLR end "entryRuleEnvironmentElements"


    // $ANTLR start "ruleEnvironmentElements"
    // InternalSml.g:1451:1: ruleEnvironmentElements returns [EObject current=null] : (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) ;
    public final EObject ruleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentElement_0 = null;

        EObject this_ElementDescription_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1457:2: ( (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) )
            // InternalSml.g:1458:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            {
            // InternalSml.g:1458:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==77||LA12_0==81) ) {
                alt12=1;
            }
            else if ( (LA12_0==72) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSml.g:1459:3: this_EnvironmentElement_0= ruleEnvironmentElement
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementsAccess().getEnvironmentElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvironmentElement_0=ruleEnvironmentElement();

                    state._fsp--;


                    			current = this_EnvironmentElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1468:3: this_ElementDescription_1= ruleElementDescription
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementsAccess().getElementDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementDescription_1=ruleElementDescription();

                    state._fsp--;


                    			current = this_ElementDescription_1;
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
    // $ANTLR end "ruleEnvironmentElements"


    // $ANTLR start "entryRuleEnvironmentElement"
    // InternalSml.g:1480:1: entryRuleEnvironmentElement returns [EObject current=null] : iv_ruleEnvironmentElement= ruleEnvironmentElement EOF ;
    public final EObject entryRuleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElement = null;


        try {
            // InternalSml.g:1480:59: (iv_ruleEnvironmentElement= ruleEnvironmentElement EOF )
            // InternalSml.g:1481:2: iv_ruleEnvironmentElement= ruleEnvironmentElement EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentElement=ruleEnvironmentElement();

            state._fsp--;

             current =iv_ruleEnvironmentElement; 
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
    // $ANTLR end "entryRuleEnvironmentElement"


    // $ANTLR start "ruleEnvironmentElement"
    // InternalSml.g:1487:1: ruleEnvironmentElement returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject ) ;
    public final EObject ruleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Obstacle_0 = null;

        EObject this_Light_1 = null;

        EObject this_Object_2 = null;



        	enterRule();

        try {
            // InternalSml.g:1493:2: ( (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject ) )
            // InternalSml.g:1494:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject )
            {
            // InternalSml.g:1494:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==77) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==80) ) {
                    alt13=1;
                }
                else if ( (LA13_1==78) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==81) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSml.g:1495:3: this_Obstacle_0= ruleObstacle
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementAccess().getObstacleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Obstacle_0=ruleObstacle();

                    state._fsp--;


                    			current = this_Obstacle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1504:3: this_Light_1= ruleLight
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementAccess().getLightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Light_1=ruleLight();

                    state._fsp--;


                    			current = this_Light_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1513:3: this_Object_2= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementAccess().getObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_2=ruleObject();

                    state._fsp--;


                    			current = this_Object_2;
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
    // $ANTLR end "ruleEnvironmentElement"


    // $ANTLR start "entryRuleElementDescription"
    // InternalSml.g:1525:1: entryRuleElementDescription returns [EObject current=null] : iv_ruleElementDescription= ruleElementDescription EOF ;
    public final EObject entryRuleElementDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDescription = null;


        try {
            // InternalSml.g:1525:59: (iv_ruleElementDescription= ruleElementDescription EOF )
            // InternalSml.g:1526:2: iv_ruleElementDescription= ruleElementDescription EOF
            {
             newCompositeNode(grammarAccess.getElementDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementDescription=ruleElementDescription();

            state._fsp--;

             current =iv_ruleElementDescription; 
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
    // $ANTLR end "entryRuleElementDescription"


    // $ANTLR start "ruleElementDescription"
    // InternalSml.g:1532:1: ruleElementDescription returns [EObject current=null] : ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) ;
    public final EObject ruleElementDescription() throws RecognitionException {
        EObject current = null;

        Token lv_el_0_0=null;
        Token otherlv_1=null;
        EObject lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_obj_3_0 = null;

        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1538:2: ( ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:1539:2: ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:1539:2: ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:1540:3: ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) )
            {
            // InternalSml.g:1540:3: ( (lv_el_0_0= 'There' ) )
            // InternalSml.g:1541:4: (lv_el_0_0= 'There' )
            {
            // InternalSml.g:1541:4: (lv_el_0_0= 'There' )
            // InternalSml.g:1542:5: lv_el_0_0= 'There'
            {
            lv_el_0_0=(Token)match(input,72,FOLLOW_53); 

            					newLeafNode(lv_el_0_0, grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementDescriptionRule());
            					}
            					setWithLastConsumed(current, "el", lv_el_0_0, "There");
            				

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getElementDescriptionAccess().getAreKeyword_1());
            		
            // InternalSml.g:1558:3: ( (lv_x_2_0= ruleRange ) )
            // InternalSml.g:1559:4: (lv_x_2_0= ruleRange )
            {
            // InternalSml.g:1559:4: (lv_x_2_0= ruleRange )
            // InternalSml.g:1560:5: lv_x_2_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getXRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_58);
            lv_x_2_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementDescriptionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.xtext.example.sml.Sml.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:1577:3: ( (lv_obj_3_0= ruleElement ) )
            // InternalSml.g:1578:4: (lv_obj_3_0= ruleElement )
            {
            // InternalSml.g:1578:4: (lv_obj_3_0= ruleElement )
            // InternalSml.g:1579:5: lv_obj_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getObjElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_obj_3_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementDescriptionRule());
            					}
            					set(
            						current,
            						"obj",
            						lv_obj_3_0,
            						"org.xtext.example.sml.Sml.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:1596:3: ( (lv_r_4_0= ruleProbabilisticDecription ) )
            // InternalSml.g:1597:4: (lv_r_4_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:1597:4: (lv_r_4_0= ruleProbabilisticDecription )
            // InternalSml.g:1598:5: lv_r_4_0= ruleProbabilisticDecription
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getRProbabilisticDecriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_4_0=ruleProbabilisticDecription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementDescriptionRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_4_0,
            						"org.xtext.example.sml.Sml.ProbabilisticDecription");
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
    // $ANTLR end "ruleElementDescription"


    // $ANTLR start "entryRuleElement"
    // InternalSml.g:1619:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalSml.g:1619:47: (iv_ruleElement= ruleElement EOF )
            // InternalSml.g:1620:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement.getText(); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSml.g:1626:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1632:2: ( (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) ) )
            // InternalSml.g:1633:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) )
            {
            // InternalSml.g:1633:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt14=1;
                }
                break;
            case 74:
                {
                alt14=2;
                }
                break;
            case 75:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSml.g:1634:3: kw= 'objects'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getObjectsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1640:3: kw= 'obstacles'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getObstaclesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1646:3: (kw= 'light' kw= 'sources' )
                    {
                    // InternalSml.g:1646:3: (kw= 'light' kw= 'sources' )
                    // InternalSml.g:1647:4: kw= 'light' kw= 'sources'
                    {
                    kw=(Token)match(input,75,FOLLOW_59); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementAccess().getLightKeyword_2_0());
                    			
                    kw=(Token)match(input,76,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementAccess().getSourcesKeyword_2_1());
                    			

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleObject"
    // InternalSml.g:1662:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalSml.g:1662:47: (iv_ruleObject= ruleObject EOF )
            // InternalSml.g:1663:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalSml.g:1669:1: ruleObject returns [EObject current=null] : ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1675:2: ( ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:1676:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:1676:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:1677:3: ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:1677:3: ( (lv_obj_0_0= 'An' ) )
            // InternalSml.g:1678:4: (lv_obj_0_0= 'An' )
            {
            // InternalSml.g:1678:4: (lv_obj_0_0= 'An' )
            // InternalSml.g:1679:5: lv_obj_0_0= 'An'
            {
            lv_obj_0_0=(Token)match(input,77,FOLLOW_60); 

            					newLeafNode(lv_obj_0_0, grammarAccess.getObjectAccess().getObjAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(current, "obj", lv_obj_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,78,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getAKeyword_3());
            		
            // InternalSml.g:1703:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:1704:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:1704:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:1705:5: lv_r_4_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getRRegionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_4_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_4_0,
            						"org.xtext.example.sml.Sml.Region");
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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleObstacle"
    // InternalSml.g:1726:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalSml.g:1726:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalSml.g:1727:2: iv_ruleObstacle= ruleObstacle EOF
            {
             newCompositeNode(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacle=ruleObstacle();

            state._fsp--;

             current =iv_ruleObstacle; 
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
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalSml.g:1733:1: ruleObstacle returns [EObject current=null] : ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token lv_obs_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1739:2: ( ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:1740:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:1740:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:1741:3: ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:1741:3: ( (lv_obs_0_0= 'An' ) )
            // InternalSml.g:1742:4: (lv_obs_0_0= 'An' )
            {
            // InternalSml.g:1742:4: (lv_obs_0_0= 'An' )
            // InternalSml.g:1743:5: lv_obs_0_0= 'An'
            {
            lv_obs_0_0=(Token)match(input,77,FOLLOW_62); 

            					newLeafNode(lv_obs_0_0, grammarAccess.getObstacleAccess().getObsAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleRule());
            					}
            					setWithLastConsumed(current, "obs", lv_obs_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getObstacleKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getAKeyword_3());
            		
            // InternalSml.g:1767:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:1768:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:1768:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:1769:5: lv_r_4_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getObstacleAccess().getRRegionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_4_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObstacleRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_4_0,
            						"org.xtext.example.sml.Sml.Region");
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
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleLight"
    // InternalSml.g:1790:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalSml.g:1790:46: (iv_ruleLight= ruleLight EOF )
            // InternalSml.g:1791:2: iv_ruleLight= ruleLight EOF
            {
             newCompositeNode(grammarAccess.getLightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLight=ruleLight();

            state._fsp--;

             current =iv_ruleLight; 
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
    // $ANTLR end "entryRuleLight"


    // $ANTLR start "ruleLight"
    // InternalSml.g:1797:1: ruleLight returns [EObject current=null] : ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) ) ;
    public final EObject ruleLight() throws RecognitionException {
        EObject current = null;

        Token lv_l_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_c_5_0 = null;

        EObject lv_p_11_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1803:2: ( ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) ) )
            // InternalSml.g:1804:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) )
            {
            // InternalSml.g:1804:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) )
            // InternalSml.g:1805:3: ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) )
            {
            // InternalSml.g:1805:3: ( (lv_l_0_0= 'A' ) )
            // InternalSml.g:1806:4: (lv_l_0_0= 'A' )
            {
            // InternalSml.g:1806:4: (lv_l_0_0= 'A' )
            // InternalSml.g:1807:5: lv_l_0_0= 'A'
            {
            lv_l_0_0=(Token)match(input,81,FOLLOW_63); 

            					newLeafNode(lv_l_0_0, grammarAccess.getLightAccess().getLAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightRule());
            					}
            					setWithLastConsumed(current, "l", lv_l_0_0, "A");
            				

            }


            }

            otherlv_1=(Token)match(input,75,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
            		
            otherlv_2=(Token)match(input,82,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getLightAccess().getSourceKeyword_2());
            		
            otherlv_3=(Token)match(input,83,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getLightAccess().getEmittingKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_66); 

            			newLeafNode(otherlv_4, grammarAccess.getLightAccess().getAKeyword_4());
            		
            // InternalSml.g:1835:3: ( (lv_c_5_0= ruleColor ) )
            // InternalSml.g:1836:4: (lv_c_5_0= ruleColor )
            {
            // InternalSml.g:1836:4: (lv_c_5_0= ruleColor )
            // InternalSml.g:1837:5: lv_c_5_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getLightAccess().getCColorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_63);
            lv_c_5_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_5_0,
            						"org.xtext.example.sml.Sml.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,75,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getLightAccess().getLightKeyword_6());
            		
            otherlv_7=(Token)match(input,33,FOLLOW_67); 

            			newLeafNode(otherlv_7, grammarAccess.getLightAccess().getIsKeyword_7());
            		
            otherlv_8=(Token)match(input,84,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getLightAccess().getPlacedKeyword_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getLightAccess().getInKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_68); 

            			newLeafNode(otherlv_10, grammarAccess.getLightAccess().getAKeyword_10());
            		
            // InternalSml.g:1874:3: ( (lv_p_11_0= rulePosition ) )
            // InternalSml.g:1875:4: (lv_p_11_0= rulePosition )
            {
            // InternalSml.g:1875:4: (lv_p_11_0= rulePosition )
            // InternalSml.g:1876:5: lv_p_11_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getLightAccess().getPPositionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_p_11_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_11_0,
            						"org.xtext.example.sml.Sml.Position");
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
    // $ANTLR end "ruleLight"


    // $ANTLR start "entryRulePosition"
    // InternalSml.g:1897:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalSml.g:1897:49: (iv_rulePosition= rulePosition EOF )
            // InternalSml.g:1898:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalSml.g:1904:1: rulePosition returns [EObject current=null] : ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_point_2_0 = null;

        EObject lv_point_5_0 = null;

        EObject lv_point_8_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1910:2: ( ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) ) )
            // InternalSml.g:1911:2: ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) )
            {
            // InternalSml.g:1911:2: ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt15=1;
                }
                break;
            case 86:
                {
                alt15=2;
                }
                break;
            case 45:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSml.g:1912:3: ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) )
                    {
                    // InternalSml.g:1912:3: ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) )
                    // InternalSml.g:1913:4: () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) )
                    {
                    // InternalSml.g:1913:4: ()
                    // InternalSml.g:1914:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPositionAccess().getCircleAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,85,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getCenterKeyword_0_1());
                    			
                    // InternalSml.g:1924:4: ( (lv_point_2_0= ruleCoordinate ) )
                    // InternalSml.g:1925:5: (lv_point_2_0= ruleCoordinate )
                    {
                    // InternalSml.g:1925:5: (lv_point_2_0= ruleCoordinate )
                    // InternalSml.g:1926:6: lv_point_2_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_point_2_0=ruleCoordinate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						set(
                    							current,
                    							"point",
                    							lv_point_2_0,
                    							"org.xtext.example.sml.Sml.Coordinate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1945:3: ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) )
                    {
                    // InternalSml.g:1945:3: ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) )
                    // InternalSml.g:1946:4: () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) )
                    {
                    // InternalSml.g:1946:4: ()
                    // InternalSml.g:1947:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPositionAccess().getRectangleAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,86,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getPositionAccess().getReferencePointKeyword_1_1());
                    			
                    // InternalSml.g:1957:4: ( (lv_point_5_0= ruleCoordinate ) )
                    // InternalSml.g:1958:5: (lv_point_5_0= ruleCoordinate )
                    {
                    // InternalSml.g:1958:5: (lv_point_5_0= ruleCoordinate )
                    // InternalSml.g:1959:6: lv_point_5_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_point_5_0=ruleCoordinate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						set(
                    							current,
                    							"point",
                    							lv_point_5_0,
                    							"org.xtext.example.sml.Sml.Coordinate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:1978:3: ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) )
                    {
                    // InternalSml.g:1978:3: ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) )
                    // InternalSml.g:1979:4: () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) )
                    {
                    // InternalSml.g:1979:4: ()
                    // InternalSml.g:1980:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPositionAccess().getPointDAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_7, grammarAccess.getPositionAccess().getPointKeyword_2_1());
                    			
                    // InternalSml.g:1990:4: ( (lv_point_8_0= ruleCoordinate ) )
                    // InternalSml.g:1991:5: (lv_point_8_0= ruleCoordinate )
                    {
                    // InternalSml.g:1991:5: (lv_point_8_0= ruleCoordinate )
                    // InternalSml.g:1992:6: lv_point_8_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getPointCoordinateParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_point_8_0=ruleCoordinate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						set(
                    							current,
                    							"point",
                    							lv_point_8_0,
                    							"org.xtext.example.sml.Sml.Coordinate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleShape"
    // InternalSml.g:2014:1: entryRuleShape returns [String current=null] : iv_ruleShape= ruleShape EOF ;
    public final String entryRuleShape() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShape = null;


        try {
            // InternalSml.g:2014:45: (iv_ruleShape= ruleShape EOF )
            // InternalSml.g:2015:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape.getText(); 
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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalSml.g:2021:1: ruleShape returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' ) ;
    public final AntlrDatatypeRuleToken ruleShape() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2027:2: ( (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' ) )
            // InternalSml.g:2028:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' )
            {
            // InternalSml.g:2028:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt16=1;
                }
                break;
            case 88:
                {
                alt16=2;
                }
                break;
            case 89:
                {
                alt16=3;
                }
                break;
            case 90:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSml.g:2029:3: kw= 'Circle'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getCircleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2035:3: kw= 'Polygon'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getPolygonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2041:3: kw= 'Triangle'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getTriangleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:2047:3: kw= 'Rectangle'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getRectangleKeyword_3());
                    		

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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleArena"
    // InternalSml.g:2056:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalSml.g:2056:46: (iv_ruleArena= ruleArena EOF )
            // InternalSml.g:2057:2: iv_ruleArena= ruleArena EOF
            {
             newCompositeNode(grammarAccess.getArenaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArena=ruleArena();

            state._fsp--;

             current =iv_ruleArena; 
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
    // $ANTLR end "entryRuleArena"


    // $ANTLR start "ruleArena"
    // InternalSml.g:2063:1: ruleArena returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) ) ;
    public final EObject ruleArena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_s_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2069:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) ) )
            // InternalSml.g:2070:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:2070:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) )
            // InternalSml.g:2071:3: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getArenaKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getArenaAccess().getAKeyword_3());
            		
            // InternalSml.g:2087:3: ( (lv_s_4_0= ruleRegion ) )
            // InternalSml.g:2088:4: (lv_s_4_0= ruleRegion )
            {
            // InternalSml.g:2088:4: (lv_s_4_0= ruleRegion )
            // InternalSml.g:2089:5: lv_s_4_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getArenaAccess().getSRegionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_s_4_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArenaRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_4_0,
            						"org.xtext.example.sml.Sml.Region");
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
    // $ANTLR end "ruleArena"


    // $ANTLR start "entryRuleColor"
    // InternalSml.g:2110:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalSml.g:2110:45: (iv_ruleColor= ruleColor EOF )
            // InternalSml.g:2111:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSml.g:2117:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'red' | kw= 'yellow' | kw= 'green' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2123:2: ( (kw= 'red' | kw= 'yellow' | kw= 'green' ) )
            // InternalSml.g:2124:2: (kw= 'red' | kw= 'yellow' | kw= 'green' )
            {
            // InternalSml.g:2124:2: (kw= 'red' | kw= 'yellow' | kw= 'green' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt17=1;
                }
                break;
            case 92:
                {
                alt17=2;
                }
                break;
            case 93:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSml.g:2125:3: kw= 'red'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2131:3: kw= 'yellow'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2137:3: kw= 'green'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_2());
                    		

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleRegion"
    // InternalSml.g:2146:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSml.g:2146:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalSml.g:2147:2: iv_ruleRegion= ruleRegion EOF
            {
             newCompositeNode(grammarAccess.getRegionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegion=ruleRegion();

            state._fsp--;

             current =iv_ruleRegion; 
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
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalSml.g:2153:1: ruleRegion returns [EObject current=null] : ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_colors_0_0 = null;

        AntlrDatatypeRuleToken lv_shape_1_0 = null;

        EObject lv_referencepoint_4_0 = null;

        EObject lv_dimensions_6_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2159:2: ( ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? ) )
            // InternalSml.g:2160:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? )
            {
            // InternalSml.g:2160:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? )
            // InternalSml.g:2161:3: ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )?
            {
            // InternalSml.g:2161:3: ( (lv_colors_0_0= ruleColor ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=91 && LA18_0<=93)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSml.g:2162:4: (lv_colors_0_0= ruleColor )
                    {
                    // InternalSml.g:2162:4: (lv_colors_0_0= ruleColor )
                    // InternalSml.g:2163:5: lv_colors_0_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getRegionAccess().getColorsColorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_69);
                    lv_colors_0_0=ruleColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRegionRule());
                    					}
                    					set(
                    						current,
                    						"colors",
                    						lv_colors_0_0,
                    						"org.xtext.example.sml.Sml.Color");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSml.g:2180:3: ( (lv_shape_1_0= ruleShape ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=87 && LA19_0<=90)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSml.g:2181:4: (lv_shape_1_0= ruleShape )
                    {
                    // InternalSml.g:2181:4: (lv_shape_1_0= ruleShape )
                    // InternalSml.g:2182:5: lv_shape_1_0= ruleShape
                    {

                    					newCompositeNode(grammarAccess.getRegionAccess().getShapeShapeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_70);
                    lv_shape_1_0=ruleShape();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRegionRule());
                    					}
                    					set(
                    						current,
                    						"shape",
                    						lv_shape_1_0,
                    						"org.xtext.example.sml.Sml.Shape");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSml.g:2199:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSml.g:2200:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSml.g:2200:4: (lv_name_2_0= RULE_ID )
            // InternalSml.g:2201:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSml.g:2217:3: (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSml.g:2218:4: otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_68); 

                    				newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getWithKeyword_3_0());
                    			
                    // InternalSml.g:2222:4: ( (lv_referencepoint_4_0= rulePosition ) )
                    // InternalSml.g:2223:5: (lv_referencepoint_4_0= rulePosition )
                    {
                    // InternalSml.g:2223:5: (lv_referencepoint_4_0= rulePosition )
                    // InternalSml.g:2224:6: lv_referencepoint_4_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getRegionAccess().getReferencepointPositionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_referencepoint_4_0=rulePosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegionRule());
                    						}
                    						set(
                    							current,
                    							"referencepoint",
                    							lv_referencepoint_4_0,
                    							"org.xtext.example.sml.Sml.Position");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSml.g:2242:3: (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSml.g:2243:4: otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_73); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegionAccess().getAndKeyword_4_0());
                    			
                    // InternalSml.g:2247:4: ( (lv_dimensions_6_0= ruleDimension ) )
                    // InternalSml.g:2248:5: (lv_dimensions_6_0= ruleDimension )
                    {
                    // InternalSml.g:2248:5: (lv_dimensions_6_0= ruleDimension )
                    // InternalSml.g:2249:6: lv_dimensions_6_0= ruleDimension
                    {

                    						newCompositeNode(grammarAccess.getRegionAccess().getDimensionsDimensionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dimensions_6_0=ruleDimension();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegionRule());
                    						}
                    						set(
                    							current,
                    							"dimensions",
                    							lv_dimensions_6_0,
                    							"org.xtext.example.sml.Sml.Dimension");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleDimension"
    // InternalSml.g:2271:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalSml.g:2271:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalSml.g:2272:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
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
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalSml.g:2278:1: ruleDimension returns [EObject current=null] : (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        EObject this_CircleD_0 = null;

        EObject this_RectangleD_1 = null;



        	enterRule();

        try {
            // InternalSml.g:2284:2: ( (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD ) )
            // InternalSml.g:2285:2: (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD )
            {
            // InternalSml.g:2285:2: (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==94) ) {
                alt22=1;
            }
            else if ( (LA22_0==95) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSml.g:2286:3: this_CircleD_0= ruleCircleD
                    {

                    			newCompositeNode(grammarAccess.getDimensionAccess().getCircleDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CircleD_0=ruleCircleD();

                    state._fsp--;


                    			current = this_CircleD_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2295:3: this_RectangleD_1= ruleRectangleD
                    {

                    			newCompositeNode(grammarAccess.getDimensionAccess().getRectangleDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RectangleD_1=ruleRectangleD();

                    state._fsp--;


                    			current = this_RectangleD_1;
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
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleCircleD"
    // InternalSml.g:2307:1: entryRuleCircleD returns [EObject current=null] : iv_ruleCircleD= ruleCircleD EOF ;
    public final EObject entryRuleCircleD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircleD = null;


        try {
            // InternalSml.g:2307:48: (iv_ruleCircleD= ruleCircleD EOF )
            // InternalSml.g:2308:2: iv_ruleCircleD= ruleCircleD EOF
            {
             newCompositeNode(grammarAccess.getCircleDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCircleD=ruleCircleD();

            state._fsp--;

             current =iv_ruleCircleD; 
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
    // $ANTLR end "entryRuleCircleD"


    // $ANTLR start "ruleCircleD"
    // InternalSml.g:2314:1: ruleCircleD returns [EObject current=null] : (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ) ;
    public final EObject ruleCircleD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_r_1_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2320:2: ( (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ) )
            // InternalSml.g:2321:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) )
            {
            // InternalSml.g:2321:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) )
            // InternalSml.g:2322:3: otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getCircleDAccess().getRadiusKeyword_0());
            		
            // InternalSml.g:2326:3: ( (lv_r_1_0= ruleDouble ) )
            // InternalSml.g:2327:4: (lv_r_1_0= ruleDouble )
            {
            // InternalSml.g:2327:4: (lv_r_1_0= ruleDouble )
            // InternalSml.g:2328:5: lv_r_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCircleDAccess().getRDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCircleDRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_1_0,
            						"org.xtext.example.sml.Sml.Double");
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
    // $ANTLR end "ruleCircleD"


    // $ANTLR start "entryRuleRectangleD"
    // InternalSml.g:2349:1: entryRuleRectangleD returns [EObject current=null] : iv_ruleRectangleD= ruleRectangleD EOF ;
    public final EObject entryRuleRectangleD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleD = null;


        try {
            // InternalSml.g:2349:51: (iv_ruleRectangleD= ruleRectangleD EOF )
            // InternalSml.g:2350:2: iv_ruleRectangleD= ruleRectangleD EOF
            {
             newCompositeNode(grammarAccess.getRectangleDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangleD=ruleRectangleD();

            state._fsp--;

             current =iv_ruleRectangleD; 
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
    // $ANTLR end "entryRuleRectangleD"


    // $ANTLR start "ruleRectangleD"
    // InternalSml.g:2356:1: ruleRectangleD returns [EObject current=null] : (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) ) ;
    public final EObject ruleRectangleD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_l_1_0 = null;

        AntlrDatatypeRuleToken lv_w_3_0 = null;

        AntlrDatatypeRuleToken lv_h_6_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2362:2: ( (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) ) )
            // InternalSml.g:2363:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) )
            {
            // InternalSml.g:2363:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) )
            // InternalSml.g:2364:3: otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangleDAccess().getLengthKeyword_0());
            		
            // InternalSml.g:2368:3: ( (lv_l_1_0= ruleDouble ) )
            // InternalSml.g:2369:4: (lv_l_1_0= ruleDouble )
            {
            // InternalSml.g:2369:4: (lv_l_1_0= ruleDouble )
            // InternalSml.g:2370:5: lv_l_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getRectangleDAccess().getLDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_74);
            lv_l_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleDRule());
            					}
            					set(
            						current,
            						"l",
            						lv_l_1_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,96,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleDAccess().getWidthKeyword_2());
            		
            // InternalSml.g:2391:3: ( (lv_w_3_0= ruleDouble ) )
            // InternalSml.g:2392:4: (lv_w_3_0= ruleDouble )
            {
            // InternalSml.g:2392:4: (lv_w_3_0= ruleDouble )
            // InternalSml.g:2393:5: lv_w_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getRectangleDAccess().getWDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_w_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleDRule());
            					}
            					set(
            						current,
            						"w",
            						lv_w_3_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_75); 

            			newLeafNode(otherlv_4, grammarAccess.getRectangleDAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,97,FOLLOW_48); 

            			newLeafNode(otherlv_5, grammarAccess.getRectangleDAccess().getHeightKeyword_5());
            		
            // InternalSml.g:2418:3: ( (lv_h_6_0= ruleDouble ) )
            // InternalSml.g:2419:4: (lv_h_6_0= ruleDouble )
            {
            // InternalSml.g:2419:4: (lv_h_6_0= ruleDouble )
            // InternalSml.g:2420:5: lv_h_6_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getRectangleDAccess().getHDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_h_6_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleDRule());
            					}
            					set(
            						current,
            						"h",
            						lv_h_6_0,
            						"org.xtext.example.sml.Sml.Double");
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
    // $ANTLR end "ruleRectangleD"


    // $ANTLR start "entryRuleCoordinate"
    // InternalSml.g:2441:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalSml.g:2441:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalSml.g:2442:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalSml.g:2448:1: ruleCoordinate returns [EObject current=null] : ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_1_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2454:2: ( ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) ) )
            // InternalSml.g:2455:2: ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) )
            {
            // InternalSml.g:2455:2: ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) )
            // InternalSml.g:2456:3: ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) )
            {
            // InternalSml.g:2456:3: ( (lv_x_0_0= ruleDouble ) )
            // InternalSml.g:2457:4: (lv_x_0_0= ruleDouble )
            {
            // InternalSml.g:2457:4: (lv_x_0_0= ruleDouble )
            // InternalSml.g:2458:5: lv_x_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getXDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_x_0_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_0_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:2475:3: ( (lv_y_1_0= ruleDouble ) )
            // InternalSml.g:2476:4: (lv_y_1_0= ruleDouble )
            {
            // InternalSml.g:2476:4: (lv_y_1_0= ruleDouble )
            // InternalSml.g:2477:5: lv_y_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getYDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinateRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_1_0,
            						"org.xtext.example.sml.Sml.Double");
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
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleDouble"
    // InternalSml.g:2498:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalSml.g:2498:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalSml.g:2499:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalSml.g:2505:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSml.g:2511:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalSml.g:2512:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalSml.g:2512:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalSml.g:2513:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_76); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,98,FOLLOW_48); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleRange"
    // InternalSml.g:2536:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalSml.g:2536:46: (iv_ruleRange= ruleRange EOF )
            // InternalSml.g:2537:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalSml.g:2543:1: ruleRange returns [EObject current=null] : (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject this_Upperbound_0 = null;

        EObject this_Lowerbound_1 = null;

        EObject this_Interval_2 = null;

        EObject this_LowerorEqualbound_3 = null;

        EObject this_UpperorEqualbound_4 = null;

        EObject this_ConstantSize_5 = null;



        	enterRule();

        try {
            // InternalSml.g:2549:2: ( (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) )
            // InternalSml.g:2550:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            {
            // InternalSml.g:2550:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==62) ) {
                    alt23=1;
                }
                else if ( (LA23_1==100) ) {
                    alt23=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 99:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==100) ) {
                    alt23=4;
                }
                else if ( (LA23_2==62) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case 102:
                {
                alt23=3;
                }
                break;
            case RULE_INT:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSml.g:2551:3: this_Upperbound_0= ruleUpperbound
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getUpperboundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Upperbound_0=ruleUpperbound();

                    state._fsp--;


                    			current = this_Upperbound_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2560:3: this_Lowerbound_1= ruleLowerbound
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getLowerboundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lowerbound_1=ruleLowerbound();

                    state._fsp--;


                    			current = this_Lowerbound_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2569:3: this_Interval_2= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getIntervalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_2=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:2578:3: this_LowerorEqualbound_3= ruleLowerorEqualbound
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getLowerorEqualboundParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerorEqualbound_3=ruleLowerorEqualbound();

                    state._fsp--;


                    			current = this_LowerorEqualbound_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSml.g:2587:3: this_UpperorEqualbound_4= ruleUpperorEqualbound
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getUpperorEqualboundParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpperorEqualbound_4=ruleUpperorEqualbound();

                    state._fsp--;


                    			current = this_UpperorEqualbound_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSml.g:2596:3: this_ConstantSize_5= ruleConstantSize
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getConstantSizeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantSize_5=ruleConstantSize();

                    state._fsp--;


                    			current = this_ConstantSize_5;
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleConstantSize"
    // InternalSml.g:2608:1: entryRuleConstantSize returns [EObject current=null] : iv_ruleConstantSize= ruleConstantSize EOF ;
    public final EObject entryRuleConstantSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSize = null;


        try {
            // InternalSml.g:2608:53: (iv_ruleConstantSize= ruleConstantSize EOF )
            // InternalSml.g:2609:2: iv_ruleConstantSize= ruleConstantSize EOF
            {
             newCompositeNode(grammarAccess.getConstantSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantSize=ruleConstantSize();

            state._fsp--;

             current =iv_ruleConstantSize; 
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
    // $ANTLR end "entryRuleConstantSize"


    // $ANTLR start "ruleConstantSize"
    // InternalSml.g:2615:1: ruleConstantSize returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleConstantSize() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalSml.g:2621:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalSml.g:2622:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalSml.g:2622:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalSml.g:2623:3: (lv_n_0_0= RULE_INT )
            {
            // InternalSml.g:2623:3: (lv_n_0_0= RULE_INT )
            // InternalSml.g:2624:4: lv_n_0_0= RULE_INT
            {
            lv_n_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_n_0_0, grammarAccess.getConstantSizeAccess().getNINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstantSizeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"n",
            					lv_n_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleConstantSize"


    // $ANTLR start "entryRuleLowerbound"
    // InternalSml.g:2643:1: entryRuleLowerbound returns [EObject current=null] : iv_ruleLowerbound= ruleLowerbound EOF ;
    public final EObject entryRuleLowerbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerbound = null;


        try {
            // InternalSml.g:2643:51: (iv_ruleLowerbound= ruleLowerbound EOF )
            // InternalSml.g:2644:2: iv_ruleLowerbound= ruleLowerbound EOF
            {
             newCompositeNode(grammarAccess.getLowerboundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerbound=ruleLowerbound();

            state._fsp--;

             current =iv_ruleLowerbound; 
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
    // $ANTLR end "entryRuleLowerbound"


    // $ANTLR start "ruleLowerbound"
    // InternalSml.g:2650:1: ruleLowerbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_n_2_0=null;


        	enterRule();

        try {
            // InternalSml.g:2656:2: ( (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) )
            // InternalSml.g:2657:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            {
            // InternalSml.g:2657:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            // InternalSml.g:2658:3: otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,62,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:2666:3: ( (lv_n_2_0= RULE_INT ) )
            // InternalSml.g:2667:4: (lv_n_2_0= RULE_INT )
            {
            // InternalSml.g:2667:4: (lv_n_2_0= RULE_INT )
            // InternalSml.g:2668:5: lv_n_2_0= RULE_INT
            {
            lv_n_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_2_0, grammarAccess.getLowerboundAccess().getNINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLowerboundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleLowerbound"


    // $ANTLR start "entryRuleLowerorEqualbound"
    // InternalSml.g:2688:1: entryRuleLowerorEqualbound returns [EObject current=null] : iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF ;
    public final EObject entryRuleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerorEqualbound = null;


        try {
            // InternalSml.g:2688:58: (iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF )
            // InternalSml.g:2689:2: iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF
            {
             newCompositeNode(grammarAccess.getLowerorEqualboundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerorEqualbound=ruleLowerorEqualbound();

            state._fsp--;

             current =iv_ruleLowerorEqualbound; 
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
    // $ANTLR end "entryRuleLowerorEqualbound"


    // $ANTLR start "ruleLowerorEqualbound"
    // InternalSml.g:2695:1: ruleLowerorEqualbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;


        	enterRule();

        try {
            // InternalSml.g:2701:2: ( (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) )
            // InternalSml.g:2702:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            {
            // InternalSml.g:2702:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            // InternalSml.g:2703:3: otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerorEqualboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,100,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,101,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getLowerorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getLowerorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:2719:3: ( (lv_n_4_0= RULE_INT ) )
            // InternalSml.g:2720:4: (lv_n_4_0= RULE_INT )
            {
            // InternalSml.g:2720:4: (lv_n_4_0= RULE_INT )
            // InternalSml.g:2721:5: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_4_0, grammarAccess.getLowerorEqualboundAccess().getNINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLowerorEqualboundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleLowerorEqualbound"


    // $ANTLR start "entryRuleUpperbound"
    // InternalSml.g:2741:1: entryRuleUpperbound returns [EObject current=null] : iv_ruleUpperbound= ruleUpperbound EOF ;
    public final EObject entryRuleUpperbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperbound = null;


        try {
            // InternalSml.g:2741:51: (iv_ruleUpperbound= ruleUpperbound EOF )
            // InternalSml.g:2742:2: iv_ruleUpperbound= ruleUpperbound EOF
            {
             newCompositeNode(grammarAccess.getUpperboundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperbound=ruleUpperbound();

            state._fsp--;

             current =iv_ruleUpperbound; 
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
    // $ANTLR end "entryRuleUpperbound"


    // $ANTLR start "ruleUpperbound"
    // InternalSml.g:2748:1: ruleUpperbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_n_2_0=null;


        	enterRule();

        try {
            // InternalSml.g:2754:2: ( (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) )
            // InternalSml.g:2755:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            {
            // InternalSml.g:2755:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            // InternalSml.g:2756:3: otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,62,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:2764:3: ( (lv_n_2_0= RULE_INT ) )
            // InternalSml.g:2765:4: (lv_n_2_0= RULE_INT )
            {
            // InternalSml.g:2765:4: (lv_n_2_0= RULE_INT )
            // InternalSml.g:2766:5: lv_n_2_0= RULE_INT
            {
            lv_n_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_2_0, grammarAccess.getUpperboundAccess().getNINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpperboundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleUpperbound"


    // $ANTLR start "entryRuleUpperorEqualbound"
    // InternalSml.g:2786:1: entryRuleUpperorEqualbound returns [EObject current=null] : iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF ;
    public final EObject entryRuleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperorEqualbound = null;


        try {
            // InternalSml.g:2786:58: (iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF )
            // InternalSml.g:2787:2: iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF
            {
             newCompositeNode(grammarAccess.getUpperorEqualboundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperorEqualbound=ruleUpperorEqualbound();

            state._fsp--;

             current =iv_ruleUpperorEqualbound; 
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
    // $ANTLR end "entryRuleUpperorEqualbound"


    // $ANTLR start "ruleUpperorEqualbound"
    // InternalSml.g:2793:1: ruleUpperorEqualbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;


        	enterRule();

        try {
            // InternalSml.g:2799:2: ( (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) )
            // InternalSml.g:2800:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            {
            // InternalSml.g:2800:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            // InternalSml.g:2801:3: otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperorEqualboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,100,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,101,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getUpperorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getUpperorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:2817:3: ( (lv_n_4_0= RULE_INT ) )
            // InternalSml.g:2818:4: (lv_n_4_0= RULE_INT )
            {
            // InternalSml.g:2818:4: (lv_n_4_0= RULE_INT )
            // InternalSml.g:2819:5: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_4_0, grammarAccess.getUpperorEqualboundAccess().getNINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpperorEqualboundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleUpperorEqualbound"


    // $ANTLR start "entryRuleInterval"
    // InternalSml.g:2839:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSml.g:2839:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSml.g:2840:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSml.g:2846:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_m_1_0=null;
        Token otherlv_2=null;
        Token lv_n_3_0=null;


        	enterRule();

        try {
            // InternalSml.g:2852:2: ( (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) ) )
            // InternalSml.g:2853:2: (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) )
            {
            // InternalSml.g:2853:2: (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) )
            // InternalSml.g:2854:3: otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getBetweenKeyword_0());
            		
            // InternalSml.g:2858:3: ( (lv_m_1_0= RULE_INT ) )
            // InternalSml.g:2859:4: (lv_m_1_0= RULE_INT )
            {
            // InternalSml.g:2859:4: (lv_m_1_0= RULE_INT )
            // InternalSml.g:2860:5: lv_m_1_0= RULE_INT
            {
            lv_m_1_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            					newLeafNode(lv_m_1_0, grammarAccess.getIntervalAccess().getMINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"m",
            						lv_m_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getAndKeyword_2());
            		
            // InternalSml.g:2880:3: ( (lv_n_3_0= RULE_INT ) )
            // InternalSml.g:2881:4: (lv_n_3_0= RULE_INT )
            {
            // InternalSml.g:2881:4: (lv_n_3_0= RULE_INT )
            // InternalSml.g:2882:5: lv_n_3_0= RULE_INT
            {
            lv_n_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_3_0, grammarAccess.getIntervalAccess().getNINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleLiteral"
    // InternalSml.g:2902:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSml.g:2902:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSml.g:2903:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSml.g:2909:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'IntLiteral' | otherlv_1= 'RealLiteral' | this_BoolLiteral_2= ruleBoolLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_BoolLiteral_2 = null;



        	enterRule();

        try {
            // InternalSml.g:2915:2: ( (otherlv_0= 'IntLiteral' | otherlv_1= 'RealLiteral' | this_BoolLiteral_2= ruleBoolLiteral ) )
            // InternalSml.g:2916:2: (otherlv_0= 'IntLiteral' | otherlv_1= 'RealLiteral' | this_BoolLiteral_2= ruleBoolLiteral )
            {
            // InternalSml.g:2916:2: (otherlv_0= 'IntLiteral' | otherlv_1= 'RealLiteral' | this_BoolLiteral_2= ruleBoolLiteral )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt24=1;
                }
                break;
            case 104:
                {
                alt24=2;
                }
                break;
            case 105:
            case 106:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalSml.g:2917:3: otherlv_0= 'IntLiteral'
                    {
                    otherlv_0=(Token)match(input,103,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getIntLiteralKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2922:3: otherlv_1= 'RealLiteral'
                    {
                    otherlv_1=(Token)match(input,104,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getRealLiteralKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2927:3: this_BoolLiteral_2= ruleBoolLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolLiteral_2=ruleBoolLiteral();

                    state._fsp--;


                    			current = this_BoolLiteral_2;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // InternalSml.g:2939:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // InternalSml.g:2939:52: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // InternalSml.g:2940:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
             newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;

             current =iv_ruleBoolLiteral; 
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
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // InternalSml.g:2946:1: ruleBoolLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalSml.g:2952:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalSml.g:2953:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalSml.g:2953:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalSml.g:2954:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalSml.g:2954:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalSml.g:2955:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalSml.g:2955:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==105) ) {
                alt25=1;
            }
            else if ( (LA25_0==106) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSml.g:2956:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,105,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBoolLiteralAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSml.g:2967:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,106,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBoolLiteralAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBoolLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L,0x0000000000022100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0000000000022100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L,0x000000003F800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x2000000000000010L,0x0000004800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0013880000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000078000000005L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000200000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000020L,0x0000000007800000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0004000000080002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});

}