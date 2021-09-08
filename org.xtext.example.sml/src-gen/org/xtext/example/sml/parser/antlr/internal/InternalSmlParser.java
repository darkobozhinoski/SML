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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'robot'", "'swarm'", "'consists'", "'of'", "'total'", "'time'", "'the'", "'mission'", "'is'", "'robots'", "'to'", "'aggregate'", "'on'", "','", "'while'", "'avoiding'", "'collect'", "'food'", "'from'", "'and'", "'bring'", "'it'", "'back'", "'seconds'", "'steps'", "'m'", "'kg'", "'arena'", "'contains'", "'following'", "'elements'", "':'", "'distributed'", "'with'", "'a'", "'distribution'", "'in'", "'performance'", "'measure'", "'defined'", "'terms'", "'an'", "'objective'", "'function'", "'be'", "'maximized.'", "'minimized.'", "'computed'", "'as'", "'follows:'", "'each'", "'At any point in time,'", "'At the end of the mission,'", "'gets'", "'penalty'", "'reward'", "'if'", "'If'", "'outside'", "'there'", "'are'", "'more'", "'than'", "'goes'", "'into'", "'e-puck'", "'foot-boot'", "'Uniform'", "'Gaussian'", "'Constant'", "'A'", "'There'", "'dimensions'", "'weight'", "'intensity'", "'objects'", "'obstacles'", "'light'", "'sources'", "'patch'", "'An'", "'object'", "'obstacle'", "'source'", "'emitting'", "'placed'", "'at'", "'center'", "'reference'", "'point'", "'Circle'", "'Polygon'", "'Triangle'", "'Rectangle'", "'Dodecagon'", "'Hexagon'", "'Square'", "'Region'", "'surrounded'", "'by'", "'walls'", "'.'", "'red'", "'yellow'", "'green'", "'gray'", "'black'", "'white'", "'through'", "'Vertices'", "';'", "'where'", "'x'", "'y'", "'radius'", "'height'", "'length'", "',width'", "'side'", "'-'", "'less'", "'or'", "'equal'", "'between'"
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
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
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
    // InternalSml.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) )* ( (lv_ms_3_0= ruleMissionSpecification ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_arenas_0_0 = null;

        EObject lv_env_1_0 = null;

        EObject lv_sw_2_0 = null;

        EObject lv_ms_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:77:2: ( ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) )* ( (lv_ms_3_0= ruleMissionSpecification ) )* ) )
            // InternalSml.g:78:2: ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) )* ( (lv_ms_3_0= ruleMissionSpecification ) )* )
            {
            // InternalSml.g:78:2: ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) )* ( (lv_ms_3_0= ruleMissionSpecification ) )* )
            // InternalSml.g:79:3: ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) )* ( (lv_ms_3_0= ruleMissionSpecification ) )*
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
            				
            pushFollow(FOLLOW_4);
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

            // InternalSml.g:117:3: ( (lv_sw_2_0= ruleSwarmconf ) )*
            loop1:
            do {
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSml.g:136:3: ( (lv_ms_3_0= ruleMissionSpecification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSml.g:137:4: (lv_ms_3_0= ruleMissionSpecification )
            	    {
            	    // InternalSml.g:137:4: (lv_ms_3_0= ruleMissionSpecification )
            	    // InternalSml.g:138:5: lv_ms_3_0= ruleMissionSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMsMissionSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_ms_3_0=ruleMissionSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					set(
            	    						current,
            	    						"ms",
            	    						lv_ms_3_0,
            	    						"org.xtext.example.sml.Sml.MissionSpecification");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSwarmconf"
    // InternalSml.g:159:1: entryRuleSwarmconf returns [EObject current=null] : iv_ruleSwarmconf= ruleSwarmconf EOF ;
    public final EObject entryRuleSwarmconf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwarmconf = null;


        try {
            // InternalSml.g:159:50: (iv_ruleSwarmconf= ruleSwarmconf EOF )
            // InternalSml.g:160:2: iv_ruleSwarmconf= ruleSwarmconf EOF
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
    // InternalSml.g:166:1: ruleSwarmconf returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) ;
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
            // InternalSml.g:172:2: ( (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:173:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:173:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:174:3: otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSwarmconfAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSwarmconfAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSwarmconfAccess().getSwarmKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSwarmconfAccess().getConsistsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSwarmconfAccess().getOfKeyword_4());
            		
            // InternalSml.g:194:3: ( (lv_x_5_0= ruleRange ) )
            // InternalSml.g:195:4: (lv_x_5_0= ruleRange )
            {
            // InternalSml.g:195:4: (lv_x_5_0= ruleRange )
            // InternalSml.g:196:5: lv_x_5_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getXRangeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalSml.g:213:3: ( (lv_r_6_0= ruleRobot ) )
            // InternalSml.g:214:4: (lv_r_6_0= ruleRobot )
            {
            // InternalSml.g:214:4: (lv_r_6_0= ruleRobot )
            // InternalSml.g:215:5: lv_r_6_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getRRobotParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalSml.g:232:3: ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            // InternalSml.g:233:4: (lv_pr_7_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:233:4: (lv_pr_7_0= ruleProbabilisticDecription )
            // InternalSml.g:234:5: lv_pr_7_0= ruleProbabilisticDecription
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


    // $ANTLR start "entryRuleMissionSpecification"
    // InternalSml.g:255:1: entryRuleMissionSpecification returns [EObject current=null] : iv_ruleMissionSpecification= ruleMissionSpecification EOF ;
    public final EObject entryRuleMissionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionSpecification = null;


        try {
            // InternalSml.g:255:61: (iv_ruleMissionSpecification= ruleMissionSpecification EOF )
            // InternalSml.g:256:2: iv_ruleMissionSpecification= ruleMissionSpecification EOF
            {
             newCompositeNode(grammarAccess.getMissionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionSpecification=ruleMissionSpecification();

            state._fsp--;

             current =iv_ruleMissionSpecification; 
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
    // $ANTLR end "entryRuleMissionSpecification"


    // $ANTLR start "ruleMissionSpecification"
    // InternalSml.g:262:1: ruleMissionSpecification returns [EObject current=null] : ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) ) ;
    public final EObject ruleMissionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_m_0_0 = null;

        EObject lv_mt_1_0 = null;

        EObject lv_ob_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:268:2: ( ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) ) )
            // InternalSml.g:269:2: ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) )
            {
            // InternalSml.g:269:2: ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) )
            // InternalSml.g:270:3: ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) )
            {
            // InternalSml.g:270:3: ( (lv_m_0_0= ruleMission ) )
            // InternalSml.g:271:4: (lv_m_0_0= ruleMission )
            {
            // InternalSml.g:271:4: (lv_m_0_0= ruleMission )
            // InternalSml.g:272:5: lv_m_0_0= ruleMission
            {

            					newCompositeNode(grammarAccess.getMissionSpecificationAccess().getMMissionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_m_0_0=ruleMission();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionSpecificationRule());
            					}
            					set(
            						current,
            						"m",
            						lv_m_0_0,
            						"org.xtext.example.sml.Sml.Mission");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:289:3: ( (lv_mt_1_0= ruleMissionTime ) )
            // InternalSml.g:290:4: (lv_mt_1_0= ruleMissionTime )
            {
            // InternalSml.g:290:4: (lv_mt_1_0= ruleMissionTime )
            // InternalSml.g:291:5: lv_mt_1_0= ruleMissionTime
            {

            					newCompositeNode(grammarAccess.getMissionSpecificationAccess().getMtMissionTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_mt_1_0=ruleMissionTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionSpecificationRule());
            					}
            					set(
            						current,
            						"mt",
            						lv_mt_1_0,
            						"org.xtext.example.sml.Sml.MissionTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:308:3: ( (lv_ob_2_0= ruleMissionObjective ) )
            // InternalSml.g:309:4: (lv_ob_2_0= ruleMissionObjective )
            {
            // InternalSml.g:309:4: (lv_ob_2_0= ruleMissionObjective )
            // InternalSml.g:310:5: lv_ob_2_0= ruleMissionObjective
            {

            					newCompositeNode(grammarAccess.getMissionSpecificationAccess().getObMissionObjectiveParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ob_2_0=ruleMissionObjective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionSpecificationRule());
            					}
            					set(
            						current,
            						"ob",
            						lv_ob_2_0,
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
    // $ANTLR end "ruleMissionSpecification"


    // $ANTLR start "entryRuleMissionTime"
    // InternalSml.g:331:1: entryRuleMissionTime returns [EObject current=null] : iv_ruleMissionTime= ruleMissionTime EOF ;
    public final EObject entryRuleMissionTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionTime = null;


        try {
            // InternalSml.g:331:52: (iv_ruleMissionTime= ruleMissionTime EOF )
            // InternalSml.g:332:2: iv_ruleMissionTime= ruleMissionTime EOF
            {
             newCompositeNode(grammarAccess.getMissionTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionTime=ruleMissionTime();

            state._fsp--;

             current =iv_ruleMissionTime; 
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
    // $ANTLR end "entryRuleMissionTime"


    // $ANTLR start "ruleMissionTime"
    // InternalSml.g:338:1: ruleMissionTime returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) ) ;
    public final EObject ruleMissionTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_t_7_0 = null;

        AntlrDatatypeRuleToken lv_m_8_0 = null;



        	enterRule();

        try {
            // InternalSml.g:344:2: ( (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) ) )
            // InternalSml.g:345:2: (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) )
            {
            // InternalSml.g:345:2: (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) )
            // InternalSml.g:346:3: otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionTimeAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionTimeAccess().getTotalKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionTimeAccess().getTimeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionTimeAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionTimeAccess().getTheKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionTimeAccess().getMissionKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionTimeAccess().getIsKeyword_6());
            		
            // InternalSml.g:374:3: ( (lv_t_7_0= ruleRange ) )
            // InternalSml.g:375:4: (lv_t_7_0= ruleRange )
            {
            // InternalSml.g:375:4: (lv_t_7_0= ruleRange )
            // InternalSml.g:376:5: lv_t_7_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getMissionTimeAccess().getTRangeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_t_7_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionTimeRule());
            					}
            					set(
            						current,
            						"t",
            						lv_t_7_0,
            						"org.xtext.example.sml.Sml.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:393:3: ( (lv_m_8_0= ruleMetric ) )
            // InternalSml.g:394:4: (lv_m_8_0= ruleMetric )
            {
            // InternalSml.g:394:4: (lv_m_8_0= ruleMetric )
            // InternalSml.g:395:5: lv_m_8_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getMissionTimeAccess().getMMetricParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_m_8_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionTimeRule());
            					}
            					set(
            						current,
            						"m",
            						lv_m_8_0,
            						"org.xtext.example.sml.Sml.Metric");
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
    // $ANTLR end "ruleMissionTime"


    // $ANTLR start "entryRuleMission"
    // InternalSml.g:416:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalSml.g:416:48: (iv_ruleMission= ruleMission EOF )
            // InternalSml.g:417:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalSml.g:423:1: ruleMission returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_t_7_0 = null;



        	enterRule();

        try {
            // InternalSml.g:429:2: ( (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) ) )
            // InternalSml.g:430:2: (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) )
            {
            // InternalSml.g:430:2: (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) )
            // InternalSml.g:431:3: otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTheKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getRobotsKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getIsKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getToKeyword_6());
            		
            // InternalSml.g:459:3: ( (lv_t_7_0= ruleTask ) )
            // InternalSml.g:460:4: (lv_t_7_0= ruleTask )
            {
            // InternalSml.g:460:4: (lv_t_7_0= ruleTask )
            // InternalSml.g:461:5: lv_t_7_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getTTaskParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_t_7_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"t",
            						lv_t_7_0,
            						"org.xtext.example.sml.Sml.Task");
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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalSml.g:482:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalSml.g:482:45: (iv_ruleTask= ruleTask EOF )
            // InternalSml.g:483:2: iv_ruleTask= ruleTask EOF
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
    // InternalSml.g:489:1: ruleTask returns [EObject current=null] : (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_Aggregate_0 = null;

        EObject this_Migration_1 = null;

        EObject this_Foraging_2 = null;



        	enterRule();

        try {
            // InternalSml.g:495:2: ( (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging ) )
            // InternalSml.g:496:2: (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging )
            {
            // InternalSml.g:496:2: (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSml.g:497:3: this_Aggregate_0= ruleAggregate
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getAggregateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregate_0=ruleAggregate();

                    state._fsp--;


                    			current = this_Aggregate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:506:3: this_Migration_1= ruleMigration
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getMigrationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Migration_1=ruleMigration();

                    state._fsp--;


                    			current = this_Migration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:515:3: this_Foraging_2= ruleForaging
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getForagingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Foraging_2=ruleForaging();

                    state._fsp--;


                    			current = this_Foraging_2;
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAggregate"
    // InternalSml.g:527:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalSml.g:527:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalSml.g:528:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
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
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // InternalSml.g:534:1: ruleAggregate returns [EObject current=null] : (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSml.g:540:2: ( (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalSml.g:541:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalSml.g:541:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalSml.g:542:3: otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregateAccess().getAggregateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getOnKeyword_1());
            		
            // InternalSml.g:550:3: ( (otherlv_2= RULE_ID ) )
            // InternalSml.g:551:4: (otherlv_2= RULE_ID )
            {
            // InternalSml.g:551:4: (otherlv_2= RULE_ID )
            // InternalSml.g:552:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getRRegionCrossReference_2_0());
            				

            }


            }

            // InternalSml.g:563:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSml.g:564:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_23); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSml.g:568:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSml.g:569:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSml.g:569:5: (otherlv_4= RULE_ID )
            	    // InternalSml.g:570:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAggregateRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getRRegionCrossReference_3_1_0());
            	    					

            	    }


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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleMigration"
    // InternalSml.g:586:1: entryRuleMigration returns [EObject current=null] : iv_ruleMigration= ruleMigration EOF ;
    public final EObject entryRuleMigration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigration = null;


        try {
            // InternalSml.g:586:50: (iv_ruleMigration= ruleMigration EOF )
            // InternalSml.g:587:2: iv_ruleMigration= ruleMigration EOF
            {
             newCompositeNode(grammarAccess.getMigrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMigration=ruleMigration();

            state._fsp--;

             current =iv_ruleMigration; 
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
    // $ANTLR end "entryRuleMigration"


    // $ANTLR start "ruleMigration"
    // InternalSml.g:593:1: ruleMigration returns [EObject current=null] : (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ;
    public final EObject ruleMigration() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSml.g:599:2: ( (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            // InternalSml.g:600:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            {
            // InternalSml.g:600:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            // InternalSml.g:601:3: otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getMigrationAccess().getAggregateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getMigrationAccess().getOnKeyword_1());
            		
            // InternalSml.g:609:3: ( (otherlv_2= RULE_ID ) )
            // InternalSml.g:610:4: (otherlv_2= RULE_ID )
            {
            // InternalSml.g:610:4: (otherlv_2= RULE_ID )
            // InternalSml.g:611:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getMigrationAccess().getRRegionCrossReference_2_0());
            				

            }


            }

            // InternalSml.g:622:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSml.g:623:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_23); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMigrationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSml.g:627:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSml.g:628:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSml.g:628:5: (otherlv_4= RULE_ID )
            	    // InternalSml.g:629:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMigrationRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    						newLeafNode(otherlv_4, grammarAccess.getMigrationAccess().getRRegionCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getMigrationAccess().getWhileKeyword_4());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getMigrationAccess().getAvoidingKeyword_5());
            		
            // InternalSml.g:649:3: ( (otherlv_7= RULE_ID ) )
            // InternalSml.g:650:4: (otherlv_7= RULE_ID )
            {
            // InternalSml.g:650:4: (otherlv_7= RULE_ID )
            // InternalSml.g:651:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_7, grammarAccess.getMigrationAccess().getTRegionCrossReference_6_0());
            				

            }


            }

            // InternalSml.g:662:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSml.g:663:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_23); 

            	    				newLeafNode(otherlv_8, grammarAccess.getMigrationAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSml.g:667:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalSml.g:668:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalSml.g:668:5: (otherlv_9= RULE_ID )
            	    // InternalSml.g:669:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMigrationRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_9, grammarAccess.getMigrationAccess().getTRegionCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleMigration"


    // $ANTLR start "entryRuleForaging"
    // InternalSml.g:685:1: entryRuleForaging returns [EObject current=null] : iv_ruleForaging= ruleForaging EOF ;
    public final EObject entryRuleForaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForaging = null;


        try {
            // InternalSml.g:685:49: (iv_ruleForaging= ruleForaging EOF )
            // InternalSml.g:686:2: iv_ruleForaging= ruleForaging EOF
            {
             newCompositeNode(grammarAccess.getForagingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForaging=ruleForaging();

            state._fsp--;

             current =iv_ruleForaging; 
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
    // $ANTLR end "entryRuleForaging"


    // $ANTLR start "ruleForaging"
    // InternalSml.g:692:1: ruleForaging returns [EObject current=null] : (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) ;
    public final EObject ruleForaging() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalSml.g:698:2: ( (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )
            // InternalSml.g:699:2: (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            {
            // InternalSml.g:699:2: (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            // InternalSml.g:700:3: otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getForagingAccess().getCollectKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getForagingAccess().getFoodKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getForagingAccess().getFromKeyword_2());
            		
            // InternalSml.g:712:3: ( (otherlv_3= RULE_ID ) )
            // InternalSml.g:713:4: (otherlv_3= RULE_ID )
            {
            // InternalSml.g:713:4: (otherlv_3= RULE_ID )
            // InternalSml.g:714:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForagingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_3, grammarAccess.getForagingAccess().getSourceRegionCrossReference_3_0());
            				

            }


            }

            // InternalSml.g:725:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSml.g:726:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForagingAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSml.g:730:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSml.g:731:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSml.g:731:5: (otherlv_5= RULE_ID )
            	    // InternalSml.g:732:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForagingRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForagingAccess().getSourceRegionCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getForagingAccess().getAndKeyword_5());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getForagingAccess().getBringKeyword_6());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getForagingAccess().getItKeyword_7());
            		
            otherlv_9=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getForagingAccess().getBackKeyword_8());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getForagingAccess().getToKeyword_9());
            		
            // InternalSml.g:764:3: ( (otherlv_11= RULE_ID ) )
            // InternalSml.g:765:4: (otherlv_11= RULE_ID )
            {
            // InternalSml.g:765:4: (otherlv_11= RULE_ID )
            // InternalSml.g:766:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForagingRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_11, grammarAccess.getForagingAccess().getNestRegionCrossReference_10_0());
            				

            }


            }

            // InternalSml.g:777:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSml.g:778:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,25,FOLLOW_23); 

            	    				newLeafNode(otherlv_12, grammarAccess.getForagingAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalSml.g:782:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalSml.g:783:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalSml.g:783:5: (otherlv_13= RULE_ID )
            	    // InternalSml.g:784:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForagingRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_13, grammarAccess.getForagingAccess().getSourceRegionCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleForaging"


    // $ANTLR start "entryRuleMetric"
    // InternalSml.g:800:1: entryRuleMetric returns [String current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final String entryRuleMetric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetric = null;


        try {
            // InternalSml.g:800:46: (iv_ruleMetric= ruleMetric EOF )
            // InternalSml.g:801:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalSml.g:807:1: ruleMetric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'seconds' | kw= 'steps' | kw= 'm' | kw= 'kg' ) ;
    public final AntlrDatatypeRuleToken ruleMetric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:813:2: ( (kw= 'seconds' | kw= 'steps' | kw= 'm' | kw= 'kg' ) )
            // InternalSml.g:814:2: (kw= 'seconds' | kw= 'steps' | kw= 'm' | kw= 'kg' )
            {
            // InternalSml.g:814:2: (kw= 'seconds' | kw= 'steps' | kw= 'm' | kw= 'kg' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 38:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSml.g:815:3: kw= 'seconds'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getSecondsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:821:3: kw= 'steps'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getStepsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:827:3: kw= 'm'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getMKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:833:3: kw= 'kg'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getKgKeyword_3());
                    		

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


    // $ANTLR start "entryRuleEnvironment"
    // InternalSml.g:842:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalSml.g:842:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalSml.g:843:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalSml.g:849:1: ruleEnvironment returns [EObject current=null] : ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* ) ;
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
            // InternalSml.g:855:2: ( ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* ) )
            // InternalSml.g:856:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* )
            {
            // InternalSml.g:856:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* )
            // InternalSml.g:857:3: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )*
            {
            // InternalSml.g:857:3: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==39) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalSml.g:858:4: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getTheKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,39,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getArenaKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getContainsKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getTheKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getFollowingKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,42,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getElementsKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,43,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getColonKeyword_0_6());
                    			

                    }
                    break;

            }

            // InternalSml.g:887:3: ( (lv_environment_7_0= ruleEnvironmentElements ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=82 && LA11_0<=83)||LA11_0==92) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSml.g:888:4: (lv_environment_7_0= ruleEnvironmentElements )
            	    {
            	    // InternalSml.g:888:4: (lv_environment_7_0= ruleEnvironmentElements )
            	    // InternalSml.g:889:5: lv_environment_7_0= ruleEnvironmentElements
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentElementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    break loop11;
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
    // InternalSml.g:910:1: entryRuleProbabilisticDecription returns [EObject current=null] : iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF ;
    public final EObject entryRuleProbabilisticDecription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilisticDecription = null;


        try {
            // InternalSml.g:910:64: (iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF )
            // InternalSml.g:911:2: iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF
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
    // InternalSml.g:917:1: ruleProbabilisticDecription returns [EObject current=null] : (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleProbabilisticDecription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_dis_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:923:2: ( (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalSml.g:924:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalSml.g:924:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )
            // InternalSml.g:925:3: otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getProbabilisticDecriptionAccess().getDistributedKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getProbabilisticDecriptionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_2());
            		
            // InternalSml.g:937:3: ( (lv_dis_3_0= ruleDistribution ) )
            // InternalSml.g:938:4: (lv_dis_3_0= ruleDistribution )
            {
            // InternalSml.g:938:4: (lv_dis_3_0= ruleDistribution )
            // InternalSml.g:939:5: lv_dis_3_0= ruleDistribution
            {

            					newCompositeNode(grammarAccess.getProbabilisticDecriptionAccess().getDisDistributionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_4=(Token)match(input,47,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getProbabilisticDecriptionAccess().getDistributionKeyword_4());
            		
            otherlv_5=(Token)match(input,48,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getProbabilisticDecriptionAccess().getInKeyword_5());
            		
            // InternalSml.g:964:3: ( (otherlv_6= RULE_ID ) )
            // InternalSml.g:965:4: (otherlv_6= RULE_ID )
            {
            // InternalSml.g:965:4: (otherlv_6= RULE_ID )
            // InternalSml.g:966:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProbabilisticDecriptionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getProbabilisticDecriptionAccess().getKRegionCrossReference_6_0());
            				

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


    // $ANTLR start "entryRuleMissionObjective"
    // InternalSml.g:981:1: entryRuleMissionObjective returns [EObject current=null] : iv_ruleMissionObjective= ruleMissionObjective EOF ;
    public final EObject entryRuleMissionObjective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionObjective = null;


        try {
            // InternalSml.g:981:57: (iv_ruleMissionObjective= ruleMissionObjective EOF )
            // InternalSml.g:982:2: iv_ruleMissionObjective= ruleMissionObjective EOF
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
    // InternalSml.g:988:1: ruleMissionObjective returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* ) ;
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
        Token lv_Type_13_1=null;
        Token lv_Type_13_2=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_in_21_0 = null;



        	enterRule();

        try {
            // InternalSml.g:994:2: ( (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* ) )
            // InternalSml.g:995:2: (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* )
            {
            // InternalSml.g:995:2: (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* )
            // InternalSml.g:996:3: otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionObjectiveAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionObjectiveAccess().getPerformanceKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionObjectiveAccess().getMeasureKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionObjectiveAccess().getIsKeyword_3());
            		
            otherlv_4=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionObjectiveAccess().getDefinedKeyword_4());
            		
            otherlv_5=(Token)match(input,48,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionObjectiveAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionObjectiveAccess().getTermsKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_48); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionObjectiveAccess().getOfKeyword_7());
            		
            otherlv_8=(Token)match(input,53,FOLLOW_49); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionObjectiveAccess().getAnKeyword_8());
            		
            otherlv_9=(Token)match(input,54,FOLLOW_50); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionObjectiveAccess().getObjectiveKeyword_9());
            		
            otherlv_10=(Token)match(input,55,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionObjectiveAccess().getFunctionKeyword_10());
            		
            otherlv_11=(Token)match(input,22,FOLLOW_51); 

            			newLeafNode(otherlv_11, grammarAccess.getMissionObjectiveAccess().getToKeyword_11());
            		
            otherlv_12=(Token)match(input,56,FOLLOW_52); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionObjectiveAccess().getBeKeyword_12());
            		
            // InternalSml.g:1048:3: ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) )
            // InternalSml.g:1049:4: ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) )
            {
            // InternalSml.g:1049:4: ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) )
            // InternalSml.g:1050:5: (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' )
            {
            // InternalSml.g:1050:5: (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==57) ) {
                alt12=1;
            }
            else if ( (LA12_0==58) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSml.g:1051:6: lv_Type_13_1= 'maximized.'
                    {
                    lv_Type_13_1=(Token)match(input,57,FOLLOW_12); 

                    						newLeafNode(lv_Type_13_1, grammarAccess.getMissionObjectiveAccess().getTypeMaximizedKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionObjectiveRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_13_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSml.g:1062:6: lv_Type_13_2= 'minimized.'
                    {
                    lv_Type_13_2=(Token)match(input,58,FOLLOW_12); 

                    						newLeafNode(lv_Type_13_2, grammarAccess.getMissionObjectiveAccess().getTypeMinimizedKeyword_13_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionObjectiveRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_13_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_14=(Token)match(input,11,FOLLOW_49); 

            			newLeafNode(otherlv_14, grammarAccess.getMissionObjectiveAccess().getTheKeyword_14());
            		
            otherlv_15=(Token)match(input,54,FOLLOW_50); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionObjectiveAccess().getObjectiveKeyword_15());
            		
            otherlv_16=(Token)match(input,55,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionObjectiveAccess().getFunctionKeyword_16());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_53); 

            			newLeafNode(otherlv_17, grammarAccess.getMissionObjectiveAccess().getIsKeyword_17());
            		
            otherlv_18=(Token)match(input,59,FOLLOW_54); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionObjectiveAccess().getComputedKeyword_18());
            		
            otherlv_19=(Token)match(input,60,FOLLOW_55); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionObjectiveAccess().getAsKeyword_19());
            		
            otherlv_20=(Token)match(input,61,FOLLOW_56); 

            			newLeafNode(otherlv_20, grammarAccess.getMissionObjectiveAccess().getFollowsKeyword_20());
            		
            // InternalSml.g:1103:3: ( (lv_in_21_0= ruleIndicator ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=63 && LA13_0<=64)||(LA13_0>=68 && LA13_0<=69)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSml.g:1104:4: (lv_in_21_0= ruleIndicator )
            	    {
            	    // InternalSml.g:1104:4: (lv_in_21_0= ruleIndicator )
            	    // InternalSml.g:1105:5: lv_in_21_0= ruleIndicator
            	    {

            	    					newCompositeNode(grammarAccess.getMissionObjectiveAccess().getInIndicatorParserRuleCall_21_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_in_21_0=ruleIndicator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionObjectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"in",
            	    						lv_in_21_0,
            	    						"org.xtext.example.sml.Sml.Indicator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSml.g:1126:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // InternalSml.g:1126:50: (iv_ruleIndicator= ruleIndicator EOF )
            // InternalSml.g:1127:2: iv_ruleIndicator= ruleIndicator EOF
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
    // InternalSml.g:1133:1: ruleIndicator returns [EObject current=null] : ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) ) ;
    public final EObject ruleIndicator() throws RecognitionException {
        EObject current = null;

        EObject lv_sp_0_0 = null;

        EObject lv_oc_1_1 = null;

        EObject lv_oc_1_2 = null;



        	enterRule();

        try {
            // InternalSml.g:1139:2: ( ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) ) )
            // InternalSml.g:1140:2: ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) )
            {
            // InternalSml.g:1140:2: ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) )
            // InternalSml.g:1141:3: ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) )
            {
            // InternalSml.g:1141:3: ( (lv_sp_0_0= ruleScope ) )
            // InternalSml.g:1142:4: (lv_sp_0_0= ruleScope )
            {
            // InternalSml.g:1142:4: (lv_sp_0_0= ruleScope )
            // InternalSml.g:1143:5: lv_sp_0_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getIndicatorAccess().getSpScopeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
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

            // InternalSml.g:1160:3: ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) )
            // InternalSml.g:1161:4: ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) )
            {
            // InternalSml.g:1161:4: ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) )
            // InternalSml.g:1162:5: (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator )
            {
            // InternalSml.g:1162:5: (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==62) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSml.g:1163:6: lv_oc_1_1= ruleAtomicIndicator
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
                    // InternalSml.g:1179:6: lv_oc_1_2= ruleCompoundIndicator
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
    // InternalSml.g:1201:1: entryRuleAtomicIndicator returns [EObject current=null] : iv_ruleAtomicIndicator= ruleAtomicIndicator EOF ;
    public final EObject entryRuleAtomicIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicIndicator = null;


        try {
            // InternalSml.g:1201:56: (iv_ruleAtomicIndicator= ruleAtomicIndicator EOF )
            // InternalSml.g:1202:2: iv_ruleAtomicIndicator= ruleAtomicIndicator EOF
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
    // InternalSml.g:1208:1: ruleAtomicIndicator returns [EObject current=null] : (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) ) ;
    public final EObject ruleAtomicIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oc_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1214:2: ( (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) ) )
            // InternalSml.g:1215:2: (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) )
            {
            // InternalSml.g:1215:2: (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) )
            // InternalSml.g:1216:3: otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicIndicatorAccess().getEachKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicIndicatorAccess().getRobotKeyword_1());
            		
            // InternalSml.g:1224:3: ( (lv_oc_2_0= ruleOccurence ) )
            // InternalSml.g:1225:4: (lv_oc_2_0= ruleOccurence )
            {
            // InternalSml.g:1225:4: (lv_oc_2_0= ruleOccurence )
            // InternalSml.g:1226:5: lv_oc_2_0= ruleOccurence
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
    // InternalSml.g:1247:1: entryRuleCompoundIndicator returns [EObject current=null] : iv_ruleCompoundIndicator= ruleCompoundIndicator EOF ;
    public final EObject entryRuleCompoundIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundIndicator = null;


        try {
            // InternalSml.g:1247:58: (iv_ruleCompoundIndicator= ruleCompoundIndicator EOF )
            // InternalSml.g:1248:2: iv_ruleCompoundIndicator= ruleCompoundIndicator EOF
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
    // InternalSml.g:1254:1: ruleCompoundIndicator returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) ) ;
    public final EObject ruleCompoundIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oc_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1260:2: ( (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) ) )
            // InternalSml.g:1261:2: (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) )
            {
            // InternalSml.g:1261:2: (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) )
            // InternalSml.g:1262:3: otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundIndicatorAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundIndicatorAccess().getSwarmKeyword_1());
            		
            // InternalSml.g:1270:3: ( (lv_oc_2_0= ruleOccurence ) )
            // InternalSml.g:1271:4: (lv_oc_2_0= ruleOccurence )
            {
            // InternalSml.g:1271:4: (lv_oc_2_0= ruleOccurence )
            // InternalSml.g:1272:5: lv_oc_2_0= ruleOccurence
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
    // InternalSml.g:1293:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalSml.g:1293:46: (iv_ruleScope= ruleScope EOF )
            // InternalSml.g:1294:2: iv_ruleScope= ruleScope EOF
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
    // InternalSml.g:1300:1: ruleScope returns [EObject current=null] : ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_sp_0_1=null;
        Token lv_sp_0_2=null;
        EObject this_Condition_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1306:2: ( ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition ) )
            // InternalSml.g:1307:2: ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition )
            {
            // InternalSml.g:1307:2: ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=63 && LA16_0<=64)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=68 && LA16_0<=69)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSml.g:1308:3: ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) )
                    {
                    // InternalSml.g:1308:3: ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) )
                    // InternalSml.g:1309:4: ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) )
                    {
                    // InternalSml.g:1309:4: ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) )
                    // InternalSml.g:1310:5: (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' )
                    {
                    // InternalSml.g:1310:5: (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==63) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==64) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSml.g:1311:6: lv_sp_0_1= 'At any point in time,'
                            {
                            lv_sp_0_1=(Token)match(input,63,FOLLOW_2); 

                            						newLeafNode(lv_sp_0_1, grammarAccess.getScopeAccess().getSpAtAnyPointInTimeKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getScopeRule());
                            						}
                            						setWithLastConsumed(current, "sp", lv_sp_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1322:6: lv_sp_0_2= 'At the end of the mission,'
                            {
                            lv_sp_0_2=(Token)match(input,64,FOLLOW_2); 

                            						newLeafNode(lv_sp_0_2, grammarAccess.getScopeAccess().getSpAtTheEndOfTheMissionKeyword_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getScopeRule());
                            						}
                            						setWithLastConsumed(current, "sp", lv_sp_0_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1336:3: this_Condition_1= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getScopeAccess().getConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_1=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_1;
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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleOccurence"
    // InternalSml.g:1348:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalSml.g:1348:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalSml.g:1349:2: iv_ruleOccurence= ruleOccurence EOF
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
    // InternalSml.g:1355:1: ruleOccurence returns [EObject current=null] : (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        EObject this_Reward_0 = null;

        EObject this_Penalty_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1361:2: ( (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty ) )
            // InternalSml.g:1362:2: (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty )
            {
            // InternalSml.g:1362:2: (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==65) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==46) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==66) ) {
                        alt17=2;
                    }
                    else if ( (LA17_2==67) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSml.g:1363:3: this_Reward_0= ruleReward
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
                    // InternalSml.g:1372:3: this_Penalty_1= rulePenalty
                    {

                    			newCompositeNode(grammarAccess.getOccurenceAccess().getPenaltyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Penalty_1=rulePenalty();

                    state._fsp--;


                    			current = this_Penalty_1;
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


    // $ANTLR start "entryRulePenalty"
    // InternalSml.g:1384:1: entryRulePenalty returns [EObject current=null] : iv_rulePenalty= rulePenalty EOF ;
    public final EObject entryRulePenalty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenalty = null;


        try {
            // InternalSml.g:1384:48: (iv_rulePenalty= rulePenalty EOF )
            // InternalSml.g:1385:2: iv_rulePenalty= rulePenalty EOF
            {
             newCompositeNode(grammarAccess.getPenaltyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenalty=rulePenalty();

            state._fsp--;

             current =iv_rulePenalty; 
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
    // $ANTLR end "entryRulePenalty"


    // $ANTLR start "rulePenalty"
    // InternalSml.g:1391:1: rulePenalty returns [EObject current=null] : (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) ;
    public final EObject rulePenalty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_k_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1397:2: ( (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) )
            // InternalSml.g:1398:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            {
            // InternalSml.g:1398:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            // InternalSml.g:1399:3: otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getPenaltyAccess().getGetsKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getPenaltyAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getPenaltyAccess().getPenaltyKeyword_2());
            		
            // InternalSml.g:1411:3: ( (lv_k_3_0= ruleDouble ) )
            // InternalSml.g:1412:4: (lv_k_3_0= ruleDouble )
            {
            // InternalSml.g:1412:4: (lv_k_3_0= ruleDouble )
            // InternalSml.g:1413:5: lv_k_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getPenaltyAccess().getKDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
            lv_k_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPenaltyRule());
            					}
            					set(
            						current,
            						"k",
            						lv_k_3_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:1430:3: ( (lv_c_4_0= ruleCondition ) )
            // InternalSml.g:1431:4: (lv_c_4_0= ruleCondition )
            {
            // InternalSml.g:1431:4: (lv_c_4_0= ruleCondition )
            // InternalSml.g:1432:5: lv_c_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPenaltyAccess().getCConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_c_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPenaltyRule());
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
    // $ANTLR end "rulePenalty"


    // $ANTLR start "entryRuleReward"
    // InternalSml.g:1453:1: entryRuleReward returns [EObject current=null] : iv_ruleReward= ruleReward EOF ;
    public final EObject entryRuleReward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReward = null;


        try {
            // InternalSml.g:1453:47: (iv_ruleReward= ruleReward EOF )
            // InternalSml.g:1454:2: iv_ruleReward= ruleReward EOF
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
    // InternalSml.g:1460:1: ruleReward returns [EObject current=null] : (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) ;
    public final EObject ruleReward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_k_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1466:2: ( (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) )
            // InternalSml.g:1467:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            {
            // InternalSml.g:1467:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            // InternalSml.g:1468:3: otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getRewardAccess().getGetsKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getRewardAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,67,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getRewardAccess().getRewardKeyword_2());
            		
            // InternalSml.g:1480:3: ( (lv_k_3_0= ruleDouble ) )
            // InternalSml.g:1481:4: (lv_k_3_0= ruleDouble )
            {
            // InternalSml.g:1481:4: (lv_k_3_0= ruleDouble )
            // InternalSml.g:1482:5: lv_k_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getRewardAccess().getKDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
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

            // InternalSml.g:1499:3: ( (lv_c_4_0= ruleCondition ) )
            // InternalSml.g:1500:4: (lv_c_4_0= ruleCondition )
            {
            // InternalSml.g:1500:4: (lv_c_4_0= ruleCondition )
            // InternalSml.g:1501:5: lv_c_4_0= ruleCondition
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
    // InternalSml.g:1522:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSml.g:1522:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSml.g:1523:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSml.g:1529:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
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
        Token lv_n_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;


        	enterRule();

        try {
            // InternalSml.g:1535:2: ( ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) ) )
            // InternalSml.g:1536:2: ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) )
            {
            // InternalSml.g:1536:2: ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==68) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==33) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==20) ) {
                        alt24=1;
                    }
                    else if ( (LA24_3==75) ) {
                        alt24=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1==71) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==69) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==71) ) {
                    alt24=2;
                }
                else if ( (LA24_2==33) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==20) ) {
                        alt24=1;
                    }
                    else if ( (LA24_3==75) ) {
                        alt24=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSml.g:1537:3: ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalSml.g:1537:3: ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) )
                    // InternalSml.g:1538:4: (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalSml.g:1538:4: (otherlv_0= 'if' | otherlv_1= 'If' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==68) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==69) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSml.g:1539:5: otherlv_0= 'if'
                            {
                            otherlv_0=(Token)match(input,68,FOLLOW_31); 

                            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1544:5: otherlv_1= 'If'
                            {
                            otherlv_1=(Token)match(input,69,FOLLOW_31); 

                            					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getIfKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getItKeyword_0_1());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_63); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getIsKeyword_0_2());
                    			
                    // InternalSml.g:1557:4: (otherlv_4= 'on' | otherlv_5= 'outside' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==24) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==70) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSml.g:1558:5: otherlv_4= 'on'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_23); 

                            					newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getOnKeyword_0_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1563:5: otherlv_5= 'outside'
                            {
                            otherlv_5=(Token)match(input,70,FOLLOW_23); 

                            					newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getOutsideKeyword_0_3_1());
                            				

                            }
                            break;

                    }

                    // InternalSml.g:1568:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSml.g:1569:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSml.g:1569:5: (otherlv_6= RULE_ID )
                    // InternalSml.g:1570:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRRegionCrossReference_0_4_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:1583:3: ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* )
                    {
                    // InternalSml.g:1583:3: ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* )
                    // InternalSml.g:1584:4: (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )*
                    {
                    // InternalSml.g:1584:4: (otherlv_7= 'if' | otherlv_8= 'If' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==68) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==69) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalSml.g:1585:5: otherlv_7= 'if'
                            {
                            otherlv_7=(Token)match(input,68,FOLLOW_64); 

                            					newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getIfKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1590:5: otherlv_8= 'If'
                            {
                            otherlv_8=(Token)match(input,69,FOLLOW_64); 

                            					newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getIfKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,71,FOLLOW_65); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getThereKeyword_1_1());
                    			
                    otherlv_10=(Token)match(input,72,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getAreKeyword_1_2());
                    			
                    otherlv_11=(Token)match(input,73,FOLLOW_67); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getMoreKeyword_1_3());
                    			
                    otherlv_12=(Token)match(input,74,FOLLOW_68); 

                    				newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getThanKeyword_1_4());
                    			
                    // InternalSml.g:1611:4: ( (lv_n_13_0= RULE_INT ) )
                    // InternalSml.g:1612:5: (lv_n_13_0= RULE_INT )
                    {
                    // InternalSml.g:1612:5: (lv_n_13_0= RULE_INT )
                    // InternalSml.g:1613:6: lv_n_13_0= RULE_INT
                    {
                    lv_n_13_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    						newLeafNode(lv_n_13_0, grammarAccess.getConditionAccess().getNINTTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n",
                    							lv_n_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_63); 

                    				newLeafNode(otherlv_14, grammarAccess.getConditionAccess().getRobotsKeyword_1_6());
                    			
                    // InternalSml.g:1633:4: (otherlv_15= 'on' | otherlv_16= 'outside' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==24) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==70) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSml.g:1634:5: otherlv_15= 'on'
                            {
                            otherlv_15=(Token)match(input,24,FOLLOW_23); 

                            					newLeafNode(otherlv_15, grammarAccess.getConditionAccess().getOnKeyword_1_7_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1639:5: otherlv_16= 'outside'
                            {
                            otherlv_16=(Token)match(input,70,FOLLOW_23); 

                            					newLeafNode(otherlv_16, grammarAccess.getConditionAccess().getOutsideKeyword_1_7_1());
                            				

                            }
                            break;

                    }

                    // InternalSml.g:1644:4: ( (otherlv_17= RULE_ID ) )
                    // InternalSml.g:1645:5: (otherlv_17= RULE_ID )
                    {
                    // InternalSml.g:1645:5: (otherlv_17= RULE_ID )
                    // InternalSml.g:1646:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_17, grammarAccess.getConditionAccess().getRRegionCrossReference_1_8_0());
                    					

                    }


                    }

                    // InternalSml.g:1657:4: (otherlv_18= ',' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==25) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSml.g:1658:5: otherlv_18= ','
                    	    {
                    	    otherlv_18=(Token)match(input,25,FOLLOW_24); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getConditionAccess().getCommaKeyword_1_9());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalSml.g:1665:3: ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) )
                    {
                    // InternalSml.g:1665:3: ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) )
                    // InternalSml.g:1666:4: (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) )
                    {
                    // InternalSml.g:1666:4: (otherlv_19= 'if' | otherlv_20= 'If' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==68) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==69) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalSml.g:1667:5: otherlv_19= 'if'
                            {
                            otherlv_19=(Token)match(input,68,FOLLOW_31); 

                            					newLeafNode(otherlv_19, grammarAccess.getConditionAccess().getIfKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1672:5: otherlv_20= 'If'
                            {
                            otherlv_20=(Token)match(input,69,FOLLOW_31); 

                            					newLeafNode(otherlv_20, grammarAccess.getConditionAccess().getIfKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,33,FOLLOW_69); 

                    				newLeafNode(otherlv_21, grammarAccess.getConditionAccess().getItKeyword_2_1());
                    			
                    otherlv_22=(Token)match(input,75,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getConditionAccess().getGoesKeyword_2_2());
                    			
                    otherlv_23=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_23, grammarAccess.getConditionAccess().getFromKeyword_2_3());
                    			
                    // InternalSml.g:1689:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSml.g:1690:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSml.g:1690:5: (otherlv_24= RULE_ID )
                    // InternalSml.g:1691:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_70); 

                    						newLeafNode(otherlv_24, grammarAccess.getConditionAccess().getRRegionCrossReference_2_4_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,76,FOLLOW_23); 

                    				newLeafNode(otherlv_25, grammarAccess.getConditionAccess().getIntoKeyword_2_5());
                    			
                    // InternalSml.g:1706:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSml.g:1707:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSml.g:1707:5: (otherlv_26= RULE_ID )
                    // InternalSml.g:1708:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_26, grammarAccess.getConditionAccess().getNestRegionCrossReference_2_6_0());
                    					

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


    // $ANTLR start "entryRuleRobot"
    // InternalSml.g:1724:1: entryRuleRobot returns [String current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final String entryRuleRobot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRobot = null;


        try {
            // InternalSml.g:1724:45: (iv_ruleRobot= ruleRobot EOF )
            // InternalSml.g:1725:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalSml.g:1731:1: ruleRobot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e-puck' | kw= 'foot-boot' ) ;
    public final AntlrDatatypeRuleToken ruleRobot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1737:2: ( (kw= 'e-puck' | kw= 'foot-boot' ) )
            // InternalSml.g:1738:2: (kw= 'e-puck' | kw= 'foot-boot' )
            {
            // InternalSml.g:1738:2: (kw= 'e-puck' | kw= 'foot-boot' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==77) ) {
                alt25=1;
            }
            else if ( (LA25_0==78) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSml.g:1739:3: kw= 'e-puck'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRobotAccess().getEPuckKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1745:3: kw= 'foot-boot'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

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
    // InternalSml.g:1754:1: entryRuleDistribution returns [String current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final String entryRuleDistribution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDistribution = null;


        try {
            // InternalSml.g:1754:52: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalSml.g:1755:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalSml.g:1761:1: ruleDistribution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' ) ;
    public final AntlrDatatypeRuleToken ruleDistribution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1767:2: ( (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' ) )
            // InternalSml.g:1768:2: (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' )
            {
            // InternalSml.g:1768:2: (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt26=1;
                }
                break;
            case 80:
                {
                alt26=2;
                }
                break;
            case 81:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSml.g:1769:3: kw= 'Uniform'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getUniformKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1775:3: kw= 'Gaussian'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getGaussianKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1781:3: kw= 'Constant'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

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
    // InternalSml.g:1790:1: entryRuleEnvironmentElements returns [EObject current=null] : iv_ruleEnvironmentElements= ruleEnvironmentElements EOF ;
    public final EObject entryRuleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElements = null;


        try {
            // InternalSml.g:1790:60: (iv_ruleEnvironmentElements= ruleEnvironmentElements EOF )
            // InternalSml.g:1791:2: iv_ruleEnvironmentElements= ruleEnvironmentElements EOF
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
    // InternalSml.g:1797:1: ruleEnvironmentElements returns [EObject current=null] : (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) ;
    public final EObject ruleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentElement_0 = null;

        EObject this_ElementDescription_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1803:2: ( (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) )
            // InternalSml.g:1804:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            {
            // InternalSml.g:1804:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==82||LA27_0==92) ) {
                alt27=1;
            }
            else if ( (LA27_0==83) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSml.g:1805:3: this_EnvironmentElement_0= ruleEnvironmentElement
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
                    // InternalSml.g:1814:3: this_ElementDescription_1= ruleElementDescription
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
    // InternalSml.g:1826:1: entryRuleEnvironmentElement returns [EObject current=null] : iv_ruleEnvironmentElement= ruleEnvironmentElement EOF ;
    public final EObject entryRuleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElement = null;


        try {
            // InternalSml.g:1826:59: (iv_ruleEnvironmentElement= ruleEnvironmentElement EOF )
            // InternalSml.g:1827:2: iv_ruleEnvironmentElement= ruleEnvironmentElement EOF
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
    // InternalSml.g:1833:1: ruleEnvironmentElement returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) ) ;
    public final EObject ruleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Obstacle_0 = null;

        EObject this_Light_1 = null;

        EObject this_Object_2 = null;

        EObject this_Patch_3 = null;

        EObject this_Region_5 = null;



        	enterRule();

        try {
            // InternalSml.g:1839:2: ( (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) ) )
            // InternalSml.g:1840:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) )
            {
            // InternalSml.g:1840:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalSml.g:1841:3: this_Obstacle_0= ruleObstacle
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
                    // InternalSml.g:1850:3: this_Light_1= ruleLight
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
                    // InternalSml.g:1859:3: this_Object_2= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementAccess().getObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_2=ruleObject();

                    state._fsp--;


                    			current = this_Object_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:1868:3: this_Patch_3= rulePatch
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentElementAccess().getPatchParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Patch_3=rulePatch();

                    state._fsp--;


                    			current = this_Patch_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSml.g:1877:3: (otherlv_4= 'A' this_Region_5= ruleRegion )
                    {
                    // InternalSml.g:1877:3: (otherlv_4= 'A' this_Region_5= ruleRegion )
                    // InternalSml.g:1878:4: otherlv_4= 'A' this_Region_5= ruleRegion
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentElementAccess().getAKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getEnvironmentElementAccess().getRegionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Region_5=ruleRegion();

                    state._fsp--;


                    				current = this_Region_5;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleEnvironmentElement"


    // $ANTLR start "entryRuleElementDescription"
    // InternalSml.g:1895:1: entryRuleElementDescription returns [EObject current=null] : iv_ruleElementDescription= ruleElementDescription EOF ;
    public final EObject entryRuleElementDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDescription = null;


        try {
            // InternalSml.g:1895:59: (iv_ruleElementDescription= ruleElementDescription EOF )
            // InternalSml.g:1896:2: iv_ruleElementDescription= ruleElementDescription EOF
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
    // InternalSml.g:1902:1: ruleElementDescription returns [EObject current=null] : (otherlv_0= 'There' otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) ;
    public final EObject ruleElementDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_x_2_0 = null;

        EObject lv_obj_3_0 = null;

        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1908:2: ( (otherlv_0= 'There' otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:1909:2: (otherlv_0= 'There' otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:1909:2: (otherlv_0= 'There' otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:1910:3: otherlv_0= 'There' otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getElementDescriptionAccess().getThereKeyword_0());
            		
            otherlv_1=(Token)match(input,72,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getElementDescriptionAccess().getAreKeyword_1());
            		
            // InternalSml.g:1918:3: ( (lv_x_2_0= ruleRange ) )
            // InternalSml.g:1919:4: (lv_x_2_0= ruleRange )
            {
            // InternalSml.g:1919:4: (lv_x_2_0= ruleRange )
            // InternalSml.g:1920:5: lv_x_2_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getXRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_72);
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

            // InternalSml.g:1937:3: ( (lv_obj_3_0= ruleElement ) )
            // InternalSml.g:1938:4: (lv_obj_3_0= ruleElement )
            {
            // InternalSml.g:1938:4: (lv_obj_3_0= ruleElement )
            // InternalSml.g:1939:5: lv_obj_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getObjElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalSml.g:1956:3: ( (lv_r_4_0= ruleProbabilisticDecription ) )
            // InternalSml.g:1957:4: (lv_r_4_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:1957:4: (lv_r_4_0= ruleProbabilisticDecription )
            // InternalSml.g:1958:5: lv_r_4_0= ruleProbabilisticDecription
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
    // InternalSml.g:1979:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSml.g:1979:48: (iv_ruleElement= ruleElement EOF )
            // InternalSml.g:1980:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // InternalSml.g:1986:1: ruleElement returns [EObject current=null] : ( ( (lv_ob_0_0= ruleEl ) ) (otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )? (otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) ) )? (otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) ) )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ob_0_0 = null;

        EObject lv_d_4_0 = null;

        AntlrDatatypeRuleToken lv_w_7_0 = null;

        AntlrDatatypeRuleToken lv_sm_8_0 = null;

        AntlrDatatypeRuleToken lv_it_12_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1992:2: ( ( ( (lv_ob_0_0= ruleEl ) ) (otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )? (otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) ) )? (otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) ) )? ) )
            // InternalSml.g:1993:2: ( ( (lv_ob_0_0= ruleEl ) ) (otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )? (otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) ) )? (otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) ) )? )
            {
            // InternalSml.g:1993:2: ( ( (lv_ob_0_0= ruleEl ) ) (otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )? (otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) ) )? (otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) ) )? )
            // InternalSml.g:1994:3: ( (lv_ob_0_0= ruleEl ) ) (otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )? (otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) ) )? (otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) ) )?
            {
            // InternalSml.g:1994:3: ( (lv_ob_0_0= ruleEl ) )
            // InternalSml.g:1995:4: (lv_ob_0_0= ruleEl )
            {
            // InternalSml.g:1995:4: (lv_ob_0_0= ruleEl )
            // InternalSml.g:1996:5: lv_ob_0_0= ruleEl
            {

            					newCompositeNode(grammarAccess.getElementAccess().getObElParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_73);
            lv_ob_0_0=ruleEl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"ob",
            						lv_ob_0_0,
            						"org.xtext.example.sml.Sml.El");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:2013:3: (otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==84) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalSml.g:2014:4: otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) )
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_74); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementAccess().getWithKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,84,FOLLOW_37); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getDimensionsKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,43,FOLLOW_75); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getColonKeyword_1_2());
                    			
                    // InternalSml.g:2026:4: ( (lv_d_4_0= ruleDimension2 ) )
                    // InternalSml.g:2027:5: (lv_d_4_0= ruleDimension2 )
                    {
                    // InternalSml.g:2027:5: (lv_d_4_0= ruleDimension2 )
                    // InternalSml.g:2028:6: lv_d_4_0= ruleDimension2
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getDDimension2ParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_d_4_0=ruleDimension2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_4_0,
                    							"org.xtext.example.sml.Sml.Dimension2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSml.g:2046:3: (otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSml.g:2047:4: otherlv_5= 'and' otherlv_6= 'weight' ( (lv_w_7_0= ruleDouble ) ) ( (lv_sm_8_0= ruleMetric ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_76); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getAndKeyword_2_0());
                    			
                    otherlv_6=(Token)match(input,85,FOLLOW_60); 

                    				newLeafNode(otherlv_6, grammarAccess.getElementAccess().getWeightKeyword_2_1());
                    			
                    // InternalSml.g:2055:4: ( (lv_w_7_0= ruleDouble ) )
                    // InternalSml.g:2056:5: (lv_w_7_0= ruleDouble )
                    {
                    // InternalSml.g:2056:5: (lv_w_7_0= ruleDouble )
                    // InternalSml.g:2057:6: lv_w_7_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getWDoubleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_w_7_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"w",
                    							lv_w_7_0,
                    							"org.xtext.example.sml.Sml.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSml.g:2074:4: ( (lv_sm_8_0= ruleMetric ) )
                    // InternalSml.g:2075:5: (lv_sm_8_0= ruleMetric )
                    {
                    // InternalSml.g:2075:5: (lv_sm_8_0= ruleMetric )
                    // InternalSml.g:2076:6: lv_sm_8_0= ruleMetric
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getSmMetricParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_sm_8_0=ruleMetric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"sm",
                    							lv_sm_8_0,
                    							"org.xtext.example.sml.Sml.Metric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSml.g:2094:3: (otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSml.g:2095:4: otherlv_9= 'with' otherlv_10= 'intensity' otherlv_11= ':' ( (lv_it_12_0= ruleDouble ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_78); 

                    				newLeafNode(otherlv_9, grammarAccess.getElementAccess().getWithKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,86,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getElementAccess().getIntensityKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,43,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getElementAccess().getColonKeyword_3_2());
                    			
                    // InternalSml.g:2107:4: ( (lv_it_12_0= ruleDouble ) )
                    // InternalSml.g:2108:5: (lv_it_12_0= ruleDouble )
                    {
                    // InternalSml.g:2108:5: (lv_it_12_0= ruleDouble )
                    // InternalSml.g:2109:6: lv_it_12_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getItDoubleParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_it_12_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"it",
                    							lv_it_12_0,
                    							"org.xtext.example.sml.Sml.Double");
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEl"
    // InternalSml.g:2131:1: entryRuleEl returns [String current=null] : iv_ruleEl= ruleEl EOF ;
    public final String entryRuleEl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEl = null;


        try {
            // InternalSml.g:2131:42: (iv_ruleEl= ruleEl EOF )
            // InternalSml.g:2132:2: iv_ruleEl= ruleEl EOF
            {
             newCompositeNode(grammarAccess.getElRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEl=ruleEl();

            state._fsp--;

             current =iv_ruleEl.getText(); 
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
    // $ANTLR end "entryRuleEl"


    // $ANTLR start "ruleEl"
    // InternalSml.g:2138:1: ruleEl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' ) ;
    public final AntlrDatatypeRuleToken ruleEl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2144:2: ( (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' ) )
            // InternalSml.g:2145:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' )
            {
            // InternalSml.g:2145:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt32=1;
                }
                break;
            case 88:
                {
                alt32=2;
                }
                break;
            case 89:
                {
                alt32=3;
                }
                break;
            case 91:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSml.g:2146:3: kw= 'objects'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElAccess().getObjectsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2152:3: kw= 'obstacles'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElAccess().getObstaclesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2158:3: (kw= 'light' kw= 'sources' )
                    {
                    // InternalSml.g:2158:3: (kw= 'light' kw= 'sources' )
                    // InternalSml.g:2159:4: kw= 'light' kw= 'sources'
                    {
                    kw=(Token)match(input,89,FOLLOW_79); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElAccess().getLightKeyword_2_0());
                    			
                    kw=(Token)match(input,90,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElAccess().getSourcesKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSml.g:2171:3: kw= 'patch'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElAccess().getPatchKeyword_3());
                    		

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
    // $ANTLR end "ruleEl"


    // $ANTLR start "entryRuleObject"
    // InternalSml.g:2180:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalSml.g:2180:47: (iv_ruleObject= ruleObject EOF )
            // InternalSml.g:2181:2: iv_ruleObject= ruleObject EOF
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
    // InternalSml.g:2187:1: ruleObject returns [EObject current=null] : ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2193:2: ( ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:2194:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:2194:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:2195:3: ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:2195:3: ( (lv_obj_0_0= 'An' ) )
            // InternalSml.g:2196:4: (lv_obj_0_0= 'An' )
            {
            // InternalSml.g:2196:4: (lv_obj_0_0= 'An' )
            // InternalSml.g:2197:5: lv_obj_0_0= 'An'
            {
            lv_obj_0_0=(Token)match(input,92,FOLLOW_80); 

            					newLeafNode(lv_obj_0_0, grammarAccess.getObjectAccess().getObjAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(current, "obj", lv_obj_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,93,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,60,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getAKeyword_3());
            		
            // InternalSml.g:2221:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:2222:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:2222:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:2223:5: lv_r_4_0= ruleRegion
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
    // InternalSml.g:2244:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalSml.g:2244:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalSml.g:2245:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalSml.g:2251:1: ruleObstacle returns [EObject current=null] : ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token lv_obs_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2257:2: ( ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:2258:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:2258:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:2259:3: ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:2259:3: ( (lv_obs_0_0= 'An' ) )
            // InternalSml.g:2260:4: (lv_obs_0_0= 'An' )
            {
            // InternalSml.g:2260:4: (lv_obs_0_0= 'An' )
            // InternalSml.g:2261:5: lv_obs_0_0= 'An'
            {
            lv_obs_0_0=(Token)match(input,92,FOLLOW_81); 

            					newLeafNode(lv_obs_0_0, grammarAccess.getObstacleAccess().getObsAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleRule());
            					}
            					setWithLastConsumed(current, "obs", lv_obs_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,94,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getObstacleKeyword_1());
            		
            otherlv_2=(Token)match(input,60,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getAKeyword_3());
            		
            // InternalSml.g:2285:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:2286:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:2286:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:2287:5: lv_r_4_0= ruleRegion
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


    // $ANTLR start "entryRulePatch"
    // InternalSml.g:2308:1: entryRulePatch returns [EObject current=null] : iv_rulePatch= rulePatch EOF ;
    public final EObject entryRulePatch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatch = null;


        try {
            // InternalSml.g:2308:46: (iv_rulePatch= rulePatch EOF )
            // InternalSml.g:2309:2: iv_rulePatch= rulePatch EOF
            {
             newCompositeNode(grammarAccess.getPatchRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatch=rulePatch();

            state._fsp--;

             current =iv_rulePatch; 
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
    // $ANTLR end "entryRulePatch"


    // $ANTLR start "rulePatch"
    // InternalSml.g:2315:1: rulePatch returns [EObject current=null] : (otherlv_0= 'A' ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) ) ;
    public final EObject rulePatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_c_1_0 = null;

        EObject lv_r_5_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2321:2: ( (otherlv_0= 'A' ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) ) )
            // InternalSml.g:2322:2: (otherlv_0= 'A' ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) )
            {
            // InternalSml.g:2322:2: (otherlv_0= 'A' ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) )
            // InternalSml.g:2323:3: otherlv_0= 'A' ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82); 

            			newLeafNode(otherlv_0, grammarAccess.getPatchAccess().getAKeyword_0());
            		
            // InternalSml.g:2327:3: ( (lv_c_1_0= ruleColor ) )
            // InternalSml.g:2328:4: (lv_c_1_0= ruleColor )
            {
            // InternalSml.g:2328:4: (lv_c_1_0= ruleColor )
            // InternalSml.g:2329:5: lv_c_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getPatchAccess().getCColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_83);
            lv_c_1_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatchRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_1_0,
            						"org.xtext.example.sml.Sml.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getPatchAccess().getPatchKeyword_2());
            		
            otherlv_3=(Token)match(input,60,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getPatchAccess().getAsKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_71); 

            			newLeafNode(otherlv_4, grammarAccess.getPatchAccess().getAKeyword_4());
            		
            // InternalSml.g:2358:3: ( (lv_r_5_0= ruleRegion ) )
            // InternalSml.g:2359:4: (lv_r_5_0= ruleRegion )
            {
            // InternalSml.g:2359:4: (lv_r_5_0= ruleRegion )
            // InternalSml.g:2360:5: lv_r_5_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getPatchAccess().getRRegionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_5_0=ruleRegion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatchRule());
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
    // $ANTLR end "rulePatch"


    // $ANTLR start "entryRuleLight"
    // InternalSml.g:2381:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalSml.g:2381:46: (iv_ruleLight= ruleLight EOF )
            // InternalSml.g:2382:2: iv_ruleLight= ruleLight EOF
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
    // InternalSml.g:2388:1: ruleLight returns [EObject current=null] : ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'with' otherlv_8= 'intensity' ( (lv_it_9_0= ruleDouble ) ) otherlv_10= 'is' otherlv_11= 'placed' otherlv_12= 'at' ( (lv_p_13_0= rulePosition ) ) ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_c_5_0 = null;

        AntlrDatatypeRuleToken lv_it_9_0 = null;

        EObject lv_p_13_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2394:2: ( ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'with' otherlv_8= 'intensity' ( (lv_it_9_0= ruleDouble ) ) otherlv_10= 'is' otherlv_11= 'placed' otherlv_12= 'at' ( (lv_p_13_0= rulePosition ) ) ) )
            // InternalSml.g:2395:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'with' otherlv_8= 'intensity' ( (lv_it_9_0= ruleDouble ) ) otherlv_10= 'is' otherlv_11= 'placed' otherlv_12= 'at' ( (lv_p_13_0= rulePosition ) ) )
            {
            // InternalSml.g:2395:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'with' otherlv_8= 'intensity' ( (lv_it_9_0= ruleDouble ) ) otherlv_10= 'is' otherlv_11= 'placed' otherlv_12= 'at' ( (lv_p_13_0= rulePosition ) ) )
            // InternalSml.g:2396:3: ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'with' otherlv_8= 'intensity' ( (lv_it_9_0= ruleDouble ) ) otherlv_10= 'is' otherlv_11= 'placed' otherlv_12= 'at' ( (lv_p_13_0= rulePosition ) )
            {
            // InternalSml.g:2396:3: ( (lv_l_0_0= 'A' ) )
            // InternalSml.g:2397:4: (lv_l_0_0= 'A' )
            {
            // InternalSml.g:2397:4: (lv_l_0_0= 'A' )
            // InternalSml.g:2398:5: lv_l_0_0= 'A'
            {
            lv_l_0_0=(Token)match(input,82,FOLLOW_84); 

            					newLeafNode(lv_l_0_0, grammarAccess.getLightAccess().getLAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightRule());
            					}
            					setWithLastConsumed(current, "l", lv_l_0_0, "A");
            				

            }


            }

            otherlv_1=(Token)match(input,89,FOLLOW_85); 

            			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
            		
            otherlv_2=(Token)match(input,95,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getLightAccess().getSourceKeyword_2());
            		
            otherlv_3=(Token)match(input,96,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getLightAccess().getEmittingKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_82); 

            			newLeafNode(otherlv_4, grammarAccess.getLightAccess().getAKeyword_4());
            		
            // InternalSml.g:2426:3: ( (lv_c_5_0= ruleColor ) )
            // InternalSml.g:2427:4: (lv_c_5_0= ruleColor )
            {
            // InternalSml.g:2427:4: (lv_c_5_0= ruleColor )
            // InternalSml.g:2428:5: lv_c_5_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getLightAccess().getCColorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_84);
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

            otherlv_6=(Token)match(input,89,FOLLOW_39); 

            			newLeafNode(otherlv_6, grammarAccess.getLightAccess().getLightKeyword_6());
            		
            otherlv_7=(Token)match(input,45,FOLLOW_78); 

            			newLeafNode(otherlv_7, grammarAccess.getLightAccess().getWithKeyword_7());
            		
            otherlv_8=(Token)match(input,86,FOLLOW_60); 

            			newLeafNode(otherlv_8, grammarAccess.getLightAccess().getIntensityKeyword_8());
            		
            // InternalSml.g:2457:3: ( (lv_it_9_0= ruleDouble ) )
            // InternalSml.g:2458:4: (lv_it_9_0= ruleDouble )
            {
            // InternalSml.g:2458:4: (lv_it_9_0= ruleDouble )
            // InternalSml.g:2459:5: lv_it_9_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getLightAccess().getItDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_it_9_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRule());
            					}
            					set(
            						current,
            						"it",
            						lv_it_9_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_87); 

            			newLeafNode(otherlv_10, grammarAccess.getLightAccess().getIsKeyword_10());
            		
            otherlv_11=(Token)match(input,97,FOLLOW_88); 

            			newLeafNode(otherlv_11, grammarAccess.getLightAccess().getPlacedKeyword_11());
            		
            otherlv_12=(Token)match(input,98,FOLLOW_89); 

            			newLeafNode(otherlv_12, grammarAccess.getLightAccess().getAtKeyword_12());
            		
            // InternalSml.g:2488:3: ( (lv_p_13_0= rulePosition ) )
            // InternalSml.g:2489:4: (lv_p_13_0= rulePosition )
            {
            // InternalSml.g:2489:4: (lv_p_13_0= rulePosition )
            // InternalSml.g:2490:5: lv_p_13_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getLightAccess().getPPositionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_2);
            lv_p_13_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_13_0,
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
    // InternalSml.g:2511:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalSml.g:2511:49: (iv_rulePosition= rulePosition EOF )
            // InternalSml.g:2512:2: iv_rulePosition= rulePosition EOF
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
    // InternalSml.g:2518:1: rulePosition returns [EObject current=null] : ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_point_4_1 = null;

        EObject lv_point_4_2 = null;



        	enterRule();

        try {
            // InternalSml.g:2524:2: ( ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) ) )
            // InternalSml.g:2525:2: ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) )
            {
            // InternalSml.g:2525:2: ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) )
            // InternalSml.g:2526:3: ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) )
            {
            // InternalSml.g:2526:3: ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==99) ) {
                alt33=1;
            }
            else if ( (LA33_0==100) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // InternalSml.g:2527:4: (otherlv_0= 'center' otherlv_1= 'at' )
                    {
                    // InternalSml.g:2527:4: (otherlv_0= 'center' otherlv_1= 'at' )
                    // InternalSml.g:2528:5: otherlv_0= 'center' otherlv_1= 'at'
                    {
                    otherlv_0=(Token)match(input,99,FOLLOW_88); 

                    					newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getCenterKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,98,FOLLOW_90); 

                    					newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getAtKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:2538:4: otherlv_2= 'reference'
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_90); 

                    				newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getReferenceKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,101,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getPointKeyword_1());
            		
            // InternalSml.g:2547:3: ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) )
            // InternalSml.g:2548:4: ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) )
            {
            // InternalSml.g:2548:4: ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) )
            // InternalSml.g:2549:5: (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D )
            {
            // InternalSml.g:2549:5: (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalSml.g:2550:6: lv_point_4_1= ruleCoordinate2D
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getPointCoordinate2DParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_point_4_1=ruleCoordinate2D();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						set(
                    							current,
                    							"point",
                    							lv_point_4_1,
                    							"org.xtext.example.sml.Sml.Coordinate2D");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSml.g:2566:6: lv_point_4_2= ruleCoordinate3D
                    {

                    						newCompositeNode(grammarAccess.getPositionAccess().getPointCoordinate3DParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_point_4_2=ruleCoordinate3D();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPositionRule());
                    						}
                    						set(
                    							current,
                    							"point",
                    							lv_point_4_2,
                    							"org.xtext.example.sml.Sml.Coordinate3D");
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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleShape2D"
    // InternalSml.g:2588:1: entryRuleShape2D returns [String current=null] : iv_ruleShape2D= ruleShape2D EOF ;
    public final String entryRuleShape2D() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShape2D = null;


        try {
            // InternalSml.g:2588:47: (iv_ruleShape2D= ruleShape2D EOF )
            // InternalSml.g:2589:2: iv_ruleShape2D= ruleShape2D EOF
            {
             newCompositeNode(grammarAccess.getShape2DRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShape2D=ruleShape2D();

            state._fsp--;

             current =iv_ruleShape2D.getText(); 
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
    // $ANTLR end "entryRuleShape2D"


    // $ANTLR start "ruleShape2D"
    // InternalSml.g:2595:1: ruleShape2D returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' ) ;
    public final AntlrDatatypeRuleToken ruleShape2D() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2601:2: ( (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' ) )
            // InternalSml.g:2602:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' )
            {
            // InternalSml.g:2602:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' )
            int alt35=8;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt35=1;
                }
                break;
            case 103:
                {
                alt35=2;
                }
                break;
            case 104:
                {
                alt35=3;
                }
                break;
            case 105:
                {
                alt35=4;
                }
                break;
            case 106:
                {
                alt35=5;
                }
                break;
            case 107:
                {
                alt35=6;
                }
                break;
            case 108:
                {
                alt35=7;
                }
                break;
            case 109:
                {
                alt35=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSml.g:2603:3: kw= 'Circle'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getCircleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2609:3: kw= 'Polygon'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getPolygonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2615:3: kw= 'Triangle'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getTriangleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:2621:3: kw= 'Rectangle'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getRectangleKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSml.g:2627:3: kw= 'Dodecagon'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getDodecagonKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSml.g:2633:3: kw= 'Hexagon'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getHexagonKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSml.g:2639:3: kw= 'Square'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getSquareKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSml.g:2645:3: kw= 'Region'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getRegionKeyword_7());
                    		

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
    // $ANTLR end "ruleShape2D"


    // $ANTLR start "entryRuleArena"
    // InternalSml.g:2654:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalSml.g:2654:46: (iv_ruleArena= ruleArena EOF )
            // InternalSml.g:2655:2: iv_ruleArena= ruleArena EOF
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
    // InternalSml.g:2661:1: ruleArena returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' ) ;
    public final EObject ruleArena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_s_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2667:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' ) )
            // InternalSml.g:2668:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' )
            {
            // InternalSml.g:2668:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' )
            // InternalSml.g:2669:3: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getArenaKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getArenaAccess().getAKeyword_3());
            		
            // InternalSml.g:2685:3: ( (lv_s_4_0= ruleRegion ) )
            // InternalSml.g:2686:4: (lv_s_4_0= ruleRegion )
            {
            // InternalSml.g:2686:4: (lv_s_4_0= ruleRegion )
            // InternalSml.g:2687:5: lv_s_4_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getArenaAccess().getSRegionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_91);
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

            otherlv_5=(Token)match(input,110,FOLLOW_92); 

            			newLeafNode(otherlv_5, grammarAccess.getArenaAccess().getSurroundedKeyword_5());
            		
            otherlv_6=(Token)match(input,111,FOLLOW_93); 

            			newLeafNode(otherlv_6, grammarAccess.getArenaAccess().getByKeyword_6());
            		
            otherlv_7=(Token)match(input,112,FOLLOW_94); 

            			newLeafNode(otherlv_7, grammarAccess.getArenaAccess().getWallsKeyword_7());
            		
            otherlv_8=(Token)match(input,113,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getArenaAccess().getFullStopKeyword_8());
            		

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
    // InternalSml.g:2724:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalSml.g:2724:45: (iv_ruleColor= ruleColor EOF )
            // InternalSml.g:2725:2: iv_ruleColor= ruleColor EOF
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
    // InternalSml.g:2731:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2737:2: ( (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' ) )
            // InternalSml.g:2738:2: (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' )
            {
            // InternalSml.g:2738:2: (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt36=1;
                }
                break;
            case 115:
                {
                alt36=2;
                }
                break;
            case 116:
                {
                alt36=3;
                }
                break;
            case 117:
                {
                alt36=4;
                }
                break;
            case 118:
                {
                alt36=5;
                }
                break;
            case 119:
                {
                alt36=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSml.g:2739:3: kw= 'red'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2745:3: kw= 'yellow'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2751:3: kw= 'green'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:2757:3: kw= 'gray'
                    {
                    kw=(Token)match(input,117,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getGrayKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSml.g:2763:3: kw= 'black'
                    {
                    kw=(Token)match(input,118,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getBlackKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSml.g:2769:3: kw= 'white'
                    {
                    kw=(Token)match(input,119,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getWhiteKeyword_5());
                    		

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
    // InternalSml.g:2778:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSml.g:2778:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalSml.g:2779:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalSml.g:2785:1: ruleRegion returns [EObject current=null] : ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_colors_0_0 = null;

        AntlrDatatypeRuleToken lv_shape2d_1_0 = null;

        EObject lv_region_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2791:2: ( ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) ) )
            // InternalSml.g:2792:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) )
            {
            // InternalSml.g:2792:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) )
            // InternalSml.g:2793:3: ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) )
            {
            // InternalSml.g:2793:3: ( (lv_colors_0_0= ruleColor ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=114 && LA37_0<=119)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSml.g:2794:4: (lv_colors_0_0= ruleColor )
                    {
                    // InternalSml.g:2794:4: (lv_colors_0_0= ruleColor )
                    // InternalSml.g:2795:5: lv_colors_0_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getRegionAccess().getColorsColorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_71);
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

            // InternalSml.g:2812:3: ( (lv_shape2d_1_0= ruleShape2D ) )
            // InternalSml.g:2813:4: (lv_shape2d_1_0= ruleShape2D )
            {
            // InternalSml.g:2813:4: (lv_shape2d_1_0= ruleShape2D )
            // InternalSml.g:2814:5: lv_shape2d_1_0= ruleShape2D
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getShape2dShape2DParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_shape2d_1_0=ruleShape2D();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegionRule());
            					}
            					set(
            						current,
            						"shape2d",
            						lv_shape2d_1_0,
            						"org.xtext.example.sml.Sml.Shape2D");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:2831:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSml.g:2832:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSml.g:2832:4: (lv_name_2_0= RULE_ID )
            // InternalSml.g:2833:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_95); 

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

            // InternalSml.g:2849:3: ( (lv_region_3_0= ruleRegionDefinition ) )
            // InternalSml.g:2850:4: (lv_region_3_0= ruleRegionDefinition )
            {
            // InternalSml.g:2850:4: (lv_region_3_0= ruleRegionDefinition )
            // InternalSml.g:2851:5: lv_region_3_0= ruleRegionDefinition
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getRegionRegionDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_region_3_0=ruleRegionDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegionRule());
            					}
            					set(
            						current,
            						"region",
            						lv_region_3_0,
            						"org.xtext.example.sml.Sml.RegionDefinition");
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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleRegionDefinition"
    // InternalSml.g:2872:1: entryRuleRegionDefinition returns [EObject current=null] : iv_ruleRegionDefinition= ruleRegionDefinition EOF ;
    public final EObject entryRuleRegionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionDefinition = null;


        try {
            // InternalSml.g:2872:57: (iv_ruleRegionDefinition= ruleRegionDefinition EOF )
            // InternalSml.g:2873:2: iv_ruleRegionDefinition= ruleRegionDefinition EOF
            {
             newCompositeNode(grammarAccess.getRegionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegionDefinition=ruleRegionDefinition();

            state._fsp--;

             current =iv_ruleRegionDefinition; 
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
    // $ANTLR end "entryRuleRegionDefinition"


    // $ANTLR start "ruleRegionDefinition"
    // InternalSml.g:2879:1: ruleRegionDefinition returns [EObject current=null] : (this_Definition1_0= ruleDefinition1 | this_Definition2_1= ruleDefinition2 | this_Definition3_2= ruleDefinition3 ) ;
    public final EObject ruleRegionDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Definition1_0 = null;

        EObject this_Definition2_1 = null;

        EObject this_Definition3_2 = null;



        	enterRule();

        try {
            // InternalSml.g:2885:2: ( (this_Definition1_0= ruleDefinition1 | this_Definition2_1= ruleDefinition2 | this_Definition3_2= ruleDefinition3 ) )
            // InternalSml.g:2886:2: (this_Definition1_0= ruleDefinition1 | this_Definition2_1= ruleDefinition2 | this_Definition3_2= ruleDefinition3 )
            {
            // InternalSml.g:2886:2: (this_Definition1_0= ruleDefinition1 | this_Definition2_1= ruleDefinition2 | this_Definition3_2= ruleDefinition3 )
            int alt38=3;
            switch ( input.LA(1) ) {
            case EOF:
            case 11:
            case 31:
            case 45:
            case 82:
            case 83:
            case 92:
            case 110:
                {
                alt38=1;
                }
                break;
            case 51:
                {
                alt38=2;
                }
                break;
            case 123:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalSml.g:2887:3: this_Definition1_0= ruleDefinition1
                    {

                    			newCompositeNode(grammarAccess.getRegionDefinitionAccess().getDefinition1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition1_0=ruleDefinition1();

                    state._fsp--;


                    			current = this_Definition1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2896:3: this_Definition2_1= ruleDefinition2
                    {

                    			newCompositeNode(grammarAccess.getRegionDefinitionAccess().getDefinition2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition2_1=ruleDefinition2();

                    state._fsp--;


                    			current = this_Definition2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2905:3: this_Definition3_2= ruleDefinition3
                    {

                    			newCompositeNode(grammarAccess.getRegionDefinitionAccess().getDefinition3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition3_2=ruleDefinition3();

                    state._fsp--;


                    			current = this_Definition3_2;
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
    // $ANTLR end "ruleRegionDefinition"


    // $ANTLR start "entryRuleDefinition1"
    // InternalSml.g:2917:1: entryRuleDefinition1 returns [EObject current=null] : iv_ruleDefinition1= ruleDefinition1 EOF ;
    public final EObject entryRuleDefinition1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition1 = null;


        try {
            // InternalSml.g:2917:52: (iv_ruleDefinition1= ruleDefinition1 EOF )
            // InternalSml.g:2918:2: iv_ruleDefinition1= ruleDefinition1 EOF
            {
             newCompositeNode(grammarAccess.getDefinition1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition1=ruleDefinition1();

            state._fsp--;

             current =iv_ruleDefinition1; 
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
    // $ANTLR end "entryRuleDefinition1"


    // $ANTLR start "ruleDefinition1"
    // InternalSml.g:2924:1: ruleDefinition1 returns [EObject current=null] : ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? ) ;
    public final EObject ruleDefinition1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_referencepoint_1_0 = null;

        EObject lv_dimensions_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2930:2: ( ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? ) )
            // InternalSml.g:2931:2: ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? )
            {
            // InternalSml.g:2931:2: ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? )
            // InternalSml.g:2932:3: (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )?
            {
            // InternalSml.g:2932:3: (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSml.g:2933:4: otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_89); 

                    				newLeafNode(otherlv_0, grammarAccess.getDefinition1Access().getWithKeyword_0_0());
                    			
                    // InternalSml.g:2937:4: ( (lv_referencepoint_1_0= rulePosition ) )
                    // InternalSml.g:2938:5: (lv_referencepoint_1_0= rulePosition )
                    {
                    // InternalSml.g:2938:5: (lv_referencepoint_1_0= rulePosition )
                    // InternalSml.g:2939:6: lv_referencepoint_1_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getDefinition1Access().getReferencepointPositionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_referencepoint_1_0=rulePosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinition1Rule());
                    						}
                    						set(
                    							current,
                    							"referencepoint",
                    							lv_referencepoint_1_0,
                    							"org.xtext.example.sml.Sml.Position");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSml.g:2957:3: (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSml.g:2958:4: otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_97); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefinition1Access().getAndKeyword_1_0());
                    			
                    // InternalSml.g:2962:4: ( (lv_dimensions_3_0= ruleDimension ) )
                    // InternalSml.g:2963:5: (lv_dimensions_3_0= ruleDimension )
                    {
                    // InternalSml.g:2963:5: (lv_dimensions_3_0= ruleDimension )
                    // InternalSml.g:2964:6: lv_dimensions_3_0= ruleDimension
                    {

                    						newCompositeNode(grammarAccess.getDefinition1Access().getDimensionsDimensionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dimensions_3_0=ruleDimension();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinition1Rule());
                    						}
                    						set(
                    							current,
                    							"dimensions",
                    							lv_dimensions_3_0,
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
    // $ANTLR end "ruleDefinition1"


    // $ANTLR start "entryRuleDefinition2"
    // InternalSml.g:2986:1: entryRuleDefinition2 returns [EObject current=null] : iv_ruleDefinition2= ruleDefinition2 EOF ;
    public final EObject entryRuleDefinition2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition2 = null;


        try {
            // InternalSml.g:2986:52: (iv_ruleDefinition2= ruleDefinition2 EOF )
            // InternalSml.g:2987:2: iv_ruleDefinition2= ruleDefinition2 EOF
            {
             newCompositeNode(grammarAccess.getDefinition2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition2=ruleDefinition2();

            state._fsp--;

             current =iv_ruleDefinition2; 
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
    // $ANTLR end "entryRuleDefinition2"


    // $ANTLR start "ruleDefinition2"
    // InternalSml.g:2993:1: ruleDefinition2 returns [EObject current=null] : (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* ) ;
    public final EObject ruleDefinition2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_point_6_0 = null;

        EObject lv_point_8_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2999:2: ( (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* ) )
            // InternalSml.g:3000:2: (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* )
            {
            // InternalSml.g:3000:2: (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* )
            // InternalSml.g:3001:3: otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_98); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinition2Access().getDefinedKeyword_0());
            		
            otherlv_1=(Token)match(input,120,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinition2Access().getThroughKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinition2Access().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_99); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinition2Access().getFollowingKeyword_3());
            		
            otherlv_4=(Token)match(input,121,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinition2Access().getVerticesKeyword_4());
            		
            otherlv_5=(Token)match(input,43,FOLLOW_89); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinition2Access().getColonKeyword_5());
            		
            // InternalSml.g:3025:3: ( (lv_point_6_0= rulePosition ) )
            // InternalSml.g:3026:4: (lv_point_6_0= rulePosition )
            {
            // InternalSml.g:3026:4: (lv_point_6_0= rulePosition )
            // InternalSml.g:3027:5: lv_point_6_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getDefinition2Access().getPointPositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_100);
            lv_point_6_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinition2Rule());
            					}
            					add(
            						current,
            						"point",
            						lv_point_6_0,
            						"org.xtext.example.sml.Sml.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3044:3: (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==122) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSml.g:3045:4: otherlv_7= ';' ( (lv_point_8_0= rulePosition ) )
            	    {
            	    otherlv_7=(Token)match(input,122,FOLLOW_89); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDefinition2Access().getSemicolonKeyword_7_0());
            	    			
            	    // InternalSml.g:3049:4: ( (lv_point_8_0= rulePosition ) )
            	    // InternalSml.g:3050:5: (lv_point_8_0= rulePosition )
            	    {
            	    // InternalSml.g:3050:5: (lv_point_8_0= rulePosition )
            	    // InternalSml.g:3051:6: lv_point_8_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinition2Access().getPointPositionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_100);
            	    lv_point_8_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinition2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"point",
            	    							lv_point_8_0,
            	    							"org.xtext.example.sml.Sml.Position");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleDefinition2"


    // $ANTLR start "entryRuleDefinition3"
    // InternalSml.g:3073:1: entryRuleDefinition3 returns [EObject current=null] : iv_ruleDefinition3= ruleDefinition3 EOF ;
    public final EObject entryRuleDefinition3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition3 = null;


        try {
            // InternalSml.g:3073:52: (iv_ruleDefinition3= ruleDefinition3 EOF )
            // InternalSml.g:3074:2: iv_ruleDefinition3= ruleDefinition3 EOF
            {
             newCompositeNode(grammarAccess.getDefinition3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition3=ruleDefinition3();

            state._fsp--;

             current =iv_ruleDefinition3; 
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
    // $ANTLR end "entryRuleDefinition3"


    // $ANTLR start "ruleDefinition3"
    // InternalSml.g:3080:1: ruleDefinition3 returns [EObject current=null] : (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) ) ;
    public final EObject ruleDefinition3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_ax_1_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3086:2: ( (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) ) )
            // InternalSml.g:3087:2: (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) )
            {
            // InternalSml.g:3087:2: (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) )
            // InternalSml.g:3088:3: otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) )
            {
            otherlv_0=(Token)match(input,123,FOLLOW_101); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinition3Access().getWhereKeyword_0());
            		
            // InternalSml.g:3092:3: ( (lv_ax_1_0= ruleAxis ) )
            // InternalSml.g:3093:4: (lv_ax_1_0= ruleAxis )
            {
            // InternalSml.g:3093:4: (lv_ax_1_0= ruleAxis )
            // InternalSml.g:3094:5: lv_ax_1_0= ruleAxis
            {

            					newCompositeNode(grammarAccess.getDefinition3Access().getAxAxisParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_ax_1_0=ruleAxis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinition3Rule());
            					}
            					set(
            						current,
            						"ax",
            						lv_ax_1_0,
            						"org.xtext.example.sml.Sml.Axis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinition3Access().getIsKeyword_2());
            		
            // InternalSml.g:3115:3: ( (lv_r_3_0= ruleRange ) )
            // InternalSml.g:3116:4: (lv_r_3_0= ruleRange )
            {
            // InternalSml.g:3116:4: (lv_r_3_0= ruleRange )
            // InternalSml.g:3117:5: lv_r_3_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getDefinition3Access().getRRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_3_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinition3Rule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_3_0,
            						"org.xtext.example.sml.Sml.Range");
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
    // $ANTLR end "ruleDefinition3"


    // $ANTLR start "entryRuleAxis"
    // InternalSml.g:3138:1: entryRuleAxis returns [String current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final String entryRuleAxis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAxis = null;


        try {
            // InternalSml.g:3138:44: (iv_ruleAxis= ruleAxis EOF )
            // InternalSml.g:3139:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis.getText(); 
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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalSml.g:3145:1: ruleAxis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'x' | kw= 'y' ) ;
    public final AntlrDatatypeRuleToken ruleAxis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:3151:2: ( (kw= 'x' | kw= 'y' ) )
            // InternalSml.g:3152:2: (kw= 'x' | kw= 'y' )
            {
            // InternalSml.g:3152:2: (kw= 'x' | kw= 'y' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==124) ) {
                alt42=1;
            }
            else if ( (LA42_0==125) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalSml.g:3153:3: kw= 'x'
                    {
                    kw=(Token)match(input,124,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAxisAccess().getXKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:3159:3: kw= 'y'
                    {
                    kw=(Token)match(input,125,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAxisAccess().getYKeyword_1());
                    		

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleDimension"
    // InternalSml.g:3168:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalSml.g:3168:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalSml.g:3169:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalSml.g:3175:1: ruleDimension returns [EObject current=null] : (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        EObject this_Dimension1_0 = null;

        EObject this_Dimension2_1 = null;

        EObject this_Dimension3_2 = null;



        	enterRule();

        try {
            // InternalSml.g:3181:2: ( (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 ) )
            // InternalSml.g:3182:2: (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 )
            {
            // InternalSml.g:3182:2: (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt43=1;
                }
                break;
            case 128:
                {
                alt43=2;
                }
                break;
            case 130:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSml.g:3183:3: this_Dimension1_0= ruleDimension1
                    {

                    			newCompositeNode(grammarAccess.getDimensionAccess().getDimension1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dimension1_0=ruleDimension1();

                    state._fsp--;


                    			current = this_Dimension1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:3192:3: this_Dimension2_1= ruleDimension2
                    {

                    			newCompositeNode(grammarAccess.getDimensionAccess().getDimension2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dimension2_1=ruleDimension2();

                    state._fsp--;


                    			current = this_Dimension2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:3201:3: this_Dimension3_2= ruleDimension3
                    {

                    			newCompositeNode(grammarAccess.getDimensionAccess().getDimension3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dimension3_2=ruleDimension3();

                    state._fsp--;


                    			current = this_Dimension3_2;
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


    // $ANTLR start "entryRuleDimension1"
    // InternalSml.g:3213:1: entryRuleDimension1 returns [EObject current=null] : iv_ruleDimension1= ruleDimension1 EOF ;
    public final EObject entryRuleDimension1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension1 = null;


        try {
            // InternalSml.g:3213:51: (iv_ruleDimension1= ruleDimension1 EOF )
            // InternalSml.g:3214:2: iv_ruleDimension1= ruleDimension1 EOF
            {
             newCompositeNode(grammarAccess.getDimension1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension1=ruleDimension1();

            state._fsp--;

             current =iv_ruleDimension1; 
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
    // $ANTLR end "entryRuleDimension1"


    // $ANTLR start "ruleDimension1"
    // InternalSml.g:3220:1: ruleDimension1 returns [EObject current=null] : (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? ) ;
    public final EObject ruleDimension1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_r_1_0 = null;

        AntlrDatatypeRuleToken lv_m1_2_0 = null;

        AntlrDatatypeRuleToken lv_h_5_0 = null;

        AntlrDatatypeRuleToken lv_m2_6_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3226:2: ( (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? ) )
            // InternalSml.g:3227:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? )
            {
            // InternalSml.g:3227:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? )
            // InternalSml.g:3228:3: otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )?
            {
            otherlv_0=(Token)match(input,126,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getDimension1Access().getRadiusKeyword_0());
            		
            // InternalSml.g:3232:3: ( (lv_r_1_0= ruleDouble ) )
            // InternalSml.g:3233:4: (lv_r_1_0= ruleDouble )
            {
            // InternalSml.g:3233:4: (lv_r_1_0= ruleDouble )
            // InternalSml.g:3234:5: lv_r_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension1Access().getRDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_r_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension1Rule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_1_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3251:3: ( (lv_m1_2_0= ruleMetric ) )
            // InternalSml.g:3252:4: (lv_m1_2_0= ruleMetric )
            {
            // InternalSml.g:3252:4: (lv_m1_2_0= ruleMetric )
            // InternalSml.g:3253:5: lv_m1_2_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension1Access().getM1MetricParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_m1_2_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension1Rule());
            					}
            					set(
            						current,
            						"m1",
            						lv_m1_2_0,
            						"org.xtext.example.sml.Sml.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3270:3: (otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSml.g:3271:4: otherlv_3= ',' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_102); 

                    				newLeafNode(otherlv_3, grammarAccess.getDimension1Access().getCommaKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,127,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getDimension1Access().getHeightKeyword_3_1());
                    			
                    // InternalSml.g:3279:4: ( (lv_h_5_0= ruleDouble ) )
                    // InternalSml.g:3280:5: (lv_h_5_0= ruleDouble )
                    {
                    // InternalSml.g:3280:5: (lv_h_5_0= ruleDouble )
                    // InternalSml.g:3281:6: lv_h_5_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDimension1Access().getHDoubleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_h_5_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDimension1Rule());
                    						}
                    						set(
                    							current,
                    							"h",
                    							lv_h_5_0,
                    							"org.xtext.example.sml.Sml.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSml.g:3298:4: ( (lv_m2_6_0= ruleMetric ) )
                    // InternalSml.g:3299:5: (lv_m2_6_0= ruleMetric )
                    {
                    // InternalSml.g:3299:5: (lv_m2_6_0= ruleMetric )
                    // InternalSml.g:3300:6: lv_m2_6_0= ruleMetric
                    {

                    						newCompositeNode(grammarAccess.getDimension1Access().getM2MetricParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_m2_6_0=ruleMetric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDimension1Rule());
                    						}
                    						set(
                    							current,
                    							"m2",
                    							lv_m2_6_0,
                    							"org.xtext.example.sml.Sml.Metric");
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
    // $ANTLR end "ruleDimension1"


    // $ANTLR start "entryRuleDimension2"
    // InternalSml.g:3322:1: entryRuleDimension2 returns [EObject current=null] : iv_ruleDimension2= ruleDimension2 EOF ;
    public final EObject entryRuleDimension2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension2 = null;


        try {
            // InternalSml.g:3322:51: (iv_ruleDimension2= ruleDimension2 EOF )
            // InternalSml.g:3323:2: iv_ruleDimension2= ruleDimension2 EOF
            {
             newCompositeNode(grammarAccess.getDimension2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension2=ruleDimension2();

            state._fsp--;

             current =iv_ruleDimension2; 
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
    // $ANTLR end "entryRuleDimension2"


    // $ANTLR start "ruleDimension2"
    // InternalSml.g:3329:1: ruleDimension2 returns [EObject current=null] : (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? ) ;
    public final EObject ruleDimension2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_l_1_0 = null;

        AntlrDatatypeRuleToken lv_m3_2_0 = null;

        AntlrDatatypeRuleToken lv_w_4_0 = null;

        AntlrDatatypeRuleToken lv_m4_5_0 = null;

        AntlrDatatypeRuleToken lv_h_8_0 = null;

        AntlrDatatypeRuleToken lv_m5_9_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3335:2: ( (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? ) )
            // InternalSml.g:3336:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? )
            {
            // InternalSml.g:3336:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? )
            // InternalSml.g:3337:3: otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )?
            {
            otherlv_0=(Token)match(input,128,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getDimension2Access().getLengthKeyword_0());
            		
            // InternalSml.g:3341:3: ( (lv_l_1_0= ruleDouble ) )
            // InternalSml.g:3342:4: (lv_l_1_0= ruleDouble )
            {
            // InternalSml.g:3342:4: (lv_l_1_0= ruleDouble )
            // InternalSml.g:3343:5: lv_l_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getLDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_l_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension2Rule());
            					}
            					set(
            						current,
            						"l",
            						lv_l_1_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3360:3: ( (lv_m3_2_0= ruleMetric ) )
            // InternalSml.g:3361:4: (lv_m3_2_0= ruleMetric )
            {
            // InternalSml.g:3361:4: (lv_m3_2_0= ruleMetric )
            // InternalSml.g:3362:5: lv_m3_2_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getM3MetricParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_103);
            lv_m3_2_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension2Rule());
            					}
            					set(
            						current,
            						"m3",
            						lv_m3_2_0,
            						"org.xtext.example.sml.Sml.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,129,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getDimension2Access().getWidthKeyword_3());
            		
            // InternalSml.g:3383:3: ( (lv_w_4_0= ruleDouble ) )
            // InternalSml.g:3384:4: (lv_w_4_0= ruleDouble )
            {
            // InternalSml.g:3384:4: (lv_w_4_0= ruleDouble )
            // InternalSml.g:3385:5: lv_w_4_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getWDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_w_4_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension2Rule());
            					}
            					set(
            						current,
            						"w",
            						lv_w_4_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3402:3: ( (lv_m4_5_0= ruleMetric ) )
            // InternalSml.g:3403:4: (lv_m4_5_0= ruleMetric )
            {
            // InternalSml.g:3403:4: (lv_m4_5_0= ruleMetric )
            // InternalSml.g:3404:5: lv_m4_5_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getM4MetricParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_m4_5_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension2Rule());
            					}
            					set(
            						current,
            						"m4",
            						lv_m4_5_0,
            						"org.xtext.example.sml.Sml.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3421:3: (otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSml.g:3422:4: otherlv_6= ',' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_102); 

                    				newLeafNode(otherlv_6, grammarAccess.getDimension2Access().getCommaKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,127,FOLLOW_60); 

                    				newLeafNode(otherlv_7, grammarAccess.getDimension2Access().getHeightKeyword_6_1());
                    			
                    // InternalSml.g:3430:4: ( (lv_h_8_0= ruleDouble ) )
                    // InternalSml.g:3431:5: (lv_h_8_0= ruleDouble )
                    {
                    // InternalSml.g:3431:5: (lv_h_8_0= ruleDouble )
                    // InternalSml.g:3432:6: lv_h_8_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDimension2Access().getHDoubleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_h_8_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDimension2Rule());
                    						}
                    						set(
                    							current,
                    							"h",
                    							lv_h_8_0,
                    							"org.xtext.example.sml.Sml.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSml.g:3449:4: ( (lv_m5_9_0= ruleMetric ) )
                    // InternalSml.g:3450:5: (lv_m5_9_0= ruleMetric )
                    {
                    // InternalSml.g:3450:5: (lv_m5_9_0= ruleMetric )
                    // InternalSml.g:3451:6: lv_m5_9_0= ruleMetric
                    {

                    						newCompositeNode(grammarAccess.getDimension2Access().getM5MetricParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_m5_9_0=ruleMetric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDimension2Rule());
                    						}
                    						set(
                    							current,
                    							"m5",
                    							lv_m5_9_0,
                    							"org.xtext.example.sml.Sml.Metric");
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
    // $ANTLR end "ruleDimension2"


    // $ANTLR start "entryRuleDimension3"
    // InternalSml.g:3473:1: entryRuleDimension3 returns [EObject current=null] : iv_ruleDimension3= ruleDimension3 EOF ;
    public final EObject entryRuleDimension3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension3 = null;


        try {
            // InternalSml.g:3473:51: (iv_ruleDimension3= ruleDimension3 EOF )
            // InternalSml.g:3474:2: iv_ruleDimension3= ruleDimension3 EOF
            {
             newCompositeNode(grammarAccess.getDimension3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension3=ruleDimension3();

            state._fsp--;

             current =iv_ruleDimension3; 
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
    // $ANTLR end "entryRuleDimension3"


    // $ANTLR start "ruleDimension3"
    // InternalSml.g:3480:1: ruleDimension3 returns [EObject current=null] : (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) ) ;
    public final EObject ruleDimension3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_s_1_0 = null;

        AntlrDatatypeRuleToken lv_m6_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3486:2: ( (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) ) )
            // InternalSml.g:3487:2: (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) )
            {
            // InternalSml.g:3487:2: (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) )
            // InternalSml.g:3488:3: otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) )
            {
            otherlv_0=(Token)match(input,130,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getDimension3Access().getSideKeyword_0());
            		
            // InternalSml.g:3492:3: ( (lv_s_1_0= ruleDouble ) )
            // InternalSml.g:3493:4: (lv_s_1_0= ruleDouble )
            {
            // InternalSml.g:3493:4: (lv_s_1_0= ruleDouble )
            // InternalSml.g:3494:5: lv_s_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension3Access().getSDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_s_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension3Rule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_1_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:3511:3: ( (lv_m6_2_0= ruleMetric ) )
            // InternalSml.g:3512:4: (lv_m6_2_0= ruleMetric )
            {
            // InternalSml.g:3512:4: (lv_m6_2_0= ruleMetric )
            // InternalSml.g:3513:5: lv_m6_2_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension3Access().getM6MetricParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_m6_2_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimension3Rule());
            					}
            					set(
            						current,
            						"m6",
            						lv_m6_2_0,
            						"org.xtext.example.sml.Sml.Metric");
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
    // $ANTLR end "ruleDimension3"


    // $ANTLR start "entryRuleCoordinate2D"
    // InternalSml.g:3534:1: entryRuleCoordinate2D returns [EObject current=null] : iv_ruleCoordinate2D= ruleCoordinate2D EOF ;
    public final EObject entryRuleCoordinate2D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate2D = null;


        try {
            // InternalSml.g:3534:53: (iv_ruleCoordinate2D= ruleCoordinate2D EOF )
            // InternalSml.g:3535:2: iv_ruleCoordinate2D= ruleCoordinate2D EOF
            {
             newCompositeNode(grammarAccess.getCoordinate2DRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate2D=ruleCoordinate2D();

            state._fsp--;

             current =iv_ruleCoordinate2D; 
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
    // $ANTLR end "entryRuleCoordinate2D"


    // $ANTLR start "ruleCoordinate2D"
    // InternalSml.g:3541:1: ruleCoordinate2D returns [EObject current=null] : ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) ) ;
    public final EObject ruleCoordinate2D() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3547:2: ( ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3548:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3548:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) )
            // InternalSml.g:3549:3: ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) )
            {
            // InternalSml.g:3549:3: ( (lv_x_0_0= ruleDouble ) )
            // InternalSml.g:3550:4: (lv_x_0_0= ruleDouble )
            {
            // InternalSml.g:3550:4: (lv_x_0_0= ruleDouble )
            // InternalSml.g:3551:5: lv_x_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate2DAccess().getXDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_104);
            lv_x_0_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinate2DRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_0_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinate2DAccess().getCommaKeyword_1());
            		
            // InternalSml.g:3572:3: ( (lv_y_2_0= ruleDouble ) )
            // InternalSml.g:3573:4: (lv_y_2_0= ruleDouble )
            {
            // InternalSml.g:3573:4: (lv_y_2_0= ruleDouble )
            // InternalSml.g:3574:5: lv_y_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate2DAccess().getYDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinate2DRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_2_0,
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
    // $ANTLR end "ruleCoordinate2D"


    // $ANTLR start "entryRuleCoordinate3D"
    // InternalSml.g:3595:1: entryRuleCoordinate3D returns [EObject current=null] : iv_ruleCoordinate3D= ruleCoordinate3D EOF ;
    public final EObject entryRuleCoordinate3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate3D = null;


        try {
            // InternalSml.g:3595:53: (iv_ruleCoordinate3D= ruleCoordinate3D EOF )
            // InternalSml.g:3596:2: iv_ruleCoordinate3D= ruleCoordinate3D EOF
            {
             newCompositeNode(grammarAccess.getCoordinate3DRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate3D=ruleCoordinate3D();

            state._fsp--;

             current =iv_ruleCoordinate3D; 
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
    // $ANTLR end "entryRuleCoordinate3D"


    // $ANTLR start "ruleCoordinate3D"
    // InternalSml.g:3602:1: ruleCoordinate3D returns [EObject current=null] : ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) ) ;
    public final EObject ruleCoordinate3D() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_2_0 = null;

        AntlrDatatypeRuleToken lv_z_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3608:2: ( ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) ) )
            // InternalSml.g:3609:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) )
            {
            // InternalSml.g:3609:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) )
            // InternalSml.g:3610:3: ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) )
            {
            // InternalSml.g:3610:3: ( (lv_x_0_0= ruleDouble ) )
            // InternalSml.g:3611:4: (lv_x_0_0= ruleDouble )
            {
            // InternalSml.g:3611:4: (lv_x_0_0= ruleDouble )
            // InternalSml.g:3612:5: lv_x_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate3DAccess().getXDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_104);
            lv_x_0_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinate3DRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_0_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinate3DAccess().getCommaKeyword_1());
            		
            // InternalSml.g:3633:3: ( (lv_y_2_0= ruleDouble ) )
            // InternalSml.g:3634:4: (lv_y_2_0= ruleDouble )
            {
            // InternalSml.g:3634:4: (lv_y_2_0= ruleDouble )
            // InternalSml.g:3635:5: lv_y_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate3DAccess().getYDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_104);
            lv_y_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinate3DRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_2_0,
            						"org.xtext.example.sml.Sml.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getCoordinate3DAccess().getCommaKeyword_3());
            		
            // InternalSml.g:3656:3: ( (lv_z_4_0= ruleDouble ) )
            // InternalSml.g:3657:4: (lv_z_4_0= ruleDouble )
            {
            // InternalSml.g:3657:4: (lv_z_4_0= ruleDouble )
            // InternalSml.g:3658:5: lv_z_4_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate3DAccess().getZDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_z_4_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoordinate3DRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_4_0,
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
    // $ANTLR end "ruleCoordinate3D"


    // $ANTLR start "entryRuleDouble"
    // InternalSml.g:3679:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalSml.g:3679:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalSml.g:3680:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalSml.g:3686:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSml.g:3692:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalSml.g:3693:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalSml.g:3693:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalSml.g:3694:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalSml.g:3694:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==131) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSml.g:3695:4: kw= '-'
                    {
                    kw=(Token)match(input,131,FOLLOW_68); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_105); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1());
            		
            // InternalSml.g:3708:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==113) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSml.g:3709:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,113,FOLLOW_68); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2_1());
                    			

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleRange"
    // InternalSml.g:3726:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalSml.g:3726:46: (iv_ruleRange= ruleRange EOF )
            // InternalSml.g:3727:2: iv_ruleRange= ruleRange EOF
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
    // InternalSml.g:3733:1: ruleRange returns [EObject current=null] : (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) ;
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
            // InternalSml.g:3739:2: ( (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) )
            // InternalSml.g:3740:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            {
            // InternalSml.g:3740:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            int alt48=6;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalSml.g:3741:3: this_Upperbound_0= ruleUpperbound
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
                    // InternalSml.g:3750:3: this_Lowerbound_1= ruleLowerbound
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
                    // InternalSml.g:3759:3: this_Interval_2= ruleInterval
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
                    // InternalSml.g:3768:3: this_LowerorEqualbound_3= ruleLowerorEqualbound
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
                    // InternalSml.g:3777:3: this_UpperorEqualbound_4= ruleUpperorEqualbound
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
                    // InternalSml.g:3786:3: this_ConstantSize_5= ruleConstantSize
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
    // InternalSml.g:3798:1: entryRuleConstantSize returns [EObject current=null] : iv_ruleConstantSize= ruleConstantSize EOF ;
    public final EObject entryRuleConstantSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSize = null;


        try {
            // InternalSml.g:3798:53: (iv_ruleConstantSize= ruleConstantSize EOF )
            // InternalSml.g:3799:2: iv_ruleConstantSize= ruleConstantSize EOF
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
    // InternalSml.g:3805:1: ruleConstantSize returns [EObject current=null] : ( (lv_n_0_0= ruleDouble ) ) ;
    public final EObject ruleConstantSize() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_n_0_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3811:2: ( ( (lv_n_0_0= ruleDouble ) ) )
            // InternalSml.g:3812:2: ( (lv_n_0_0= ruleDouble ) )
            {
            // InternalSml.g:3812:2: ( (lv_n_0_0= ruleDouble ) )
            // InternalSml.g:3813:3: (lv_n_0_0= ruleDouble )
            {
            // InternalSml.g:3813:3: (lv_n_0_0= ruleDouble )
            // InternalSml.g:3814:4: lv_n_0_0= ruleDouble
            {

            				newCompositeNode(grammarAccess.getConstantSizeAccess().getNDoubleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_n_0_0=ruleDouble();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstantSizeRule());
            				}
            				set(
            					current,
            					"n",
            					lv_n_0_0,
            					"org.xtext.example.sml.Sml.Double");
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
    // $ANTLR end "ruleConstantSize"


    // $ANTLR start "entryRuleLowerbound"
    // InternalSml.g:3834:1: entryRuleLowerbound returns [EObject current=null] : iv_ruleLowerbound= ruleLowerbound EOF ;
    public final EObject entryRuleLowerbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerbound = null;


        try {
            // InternalSml.g:3834:51: (iv_ruleLowerbound= ruleLowerbound EOF )
            // InternalSml.g:3835:2: iv_ruleLowerbound= ruleLowerbound EOF
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
    // InternalSml.g:3841:1: ruleLowerbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) ;
    public final EObject ruleLowerbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_n_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3847:2: ( (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3848:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3848:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            // InternalSml.g:3849:3: otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,132,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,74,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:3857:3: ( (lv_n_2_0= ruleDouble ) )
            // InternalSml.g:3858:4: (lv_n_2_0= ruleDouble )
            {
            // InternalSml.g:3858:4: (lv_n_2_0= ruleDouble )
            // InternalSml.g:3859:5: lv_n_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getLowerboundAccess().getNDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_n_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowerboundRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_2_0,
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
    // $ANTLR end "ruleLowerbound"


    // $ANTLR start "entryRuleLowerorEqualbound"
    // InternalSml.g:3880:1: entryRuleLowerorEqualbound returns [EObject current=null] : iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF ;
    public final EObject entryRuleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerorEqualbound = null;


        try {
            // InternalSml.g:3880:58: (iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF )
            // InternalSml.g:3881:2: iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF
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
    // InternalSml.g:3887:1: ruleLowerorEqualbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) ;
    public final EObject ruleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_n_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3893:2: ( (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) )
            // InternalSml.g:3894:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            {
            // InternalSml.g:3894:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            // InternalSml.g:3895:3: otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,132,FOLLOW_106); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerorEqualboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,133,FOLLOW_107); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,134,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getLowerorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,74,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getLowerorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:3911:3: ( (lv_n_4_0= ruleDouble ) )
            // InternalSml.g:3912:4: (lv_n_4_0= ruleDouble )
            {
            // InternalSml.g:3912:4: (lv_n_4_0= ruleDouble )
            // InternalSml.g:3913:5: lv_n_4_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getLowerorEqualboundAccess().getNDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_n_4_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowerorEqualboundRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_4_0,
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
    // $ANTLR end "ruleLowerorEqualbound"


    // $ANTLR start "entryRuleUpperbound"
    // InternalSml.g:3934:1: entryRuleUpperbound returns [EObject current=null] : iv_ruleUpperbound= ruleUpperbound EOF ;
    public final EObject entryRuleUpperbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperbound = null;


        try {
            // InternalSml.g:3934:51: (iv_ruleUpperbound= ruleUpperbound EOF )
            // InternalSml.g:3935:2: iv_ruleUpperbound= ruleUpperbound EOF
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
    // InternalSml.g:3941:1: ruleUpperbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) ;
    public final EObject ruleUpperbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_n_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3947:2: ( (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3948:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3948:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            // InternalSml.g:3949:3: otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,74,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:3957:3: ( (lv_n_2_0= ruleDouble ) )
            // InternalSml.g:3958:4: (lv_n_2_0= ruleDouble )
            {
            // InternalSml.g:3958:4: (lv_n_2_0= ruleDouble )
            // InternalSml.g:3959:5: lv_n_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getUpperboundAccess().getNDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_n_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperboundRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_2_0,
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
    // $ANTLR end "ruleUpperbound"


    // $ANTLR start "entryRuleUpperorEqualbound"
    // InternalSml.g:3980:1: entryRuleUpperorEqualbound returns [EObject current=null] : iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF ;
    public final EObject entryRuleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperorEqualbound = null;


        try {
            // InternalSml.g:3980:58: (iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF )
            // InternalSml.g:3981:2: iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF
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
    // InternalSml.g:3987:1: ruleUpperorEqualbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) ;
    public final EObject ruleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_n_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3993:2: ( (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) )
            // InternalSml.g:3994:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            {
            // InternalSml.g:3994:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            // InternalSml.g:3995:3: otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_106); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperorEqualboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,133,FOLLOW_107); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,134,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getUpperorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,74,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getUpperorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:4011:3: ( (lv_n_4_0= ruleDouble ) )
            // InternalSml.g:4012:4: (lv_n_4_0= ruleDouble )
            {
            // InternalSml.g:4012:4: (lv_n_4_0= ruleDouble )
            // InternalSml.g:4013:5: lv_n_4_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getUpperorEqualboundAccess().getNDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_n_4_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperorEqualboundRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_4_0,
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
    // $ANTLR end "ruleUpperorEqualbound"


    // $ANTLR start "entryRuleInterval"
    // InternalSml.g:4034:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSml.g:4034:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSml.g:4035:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalSml.g:4041:1: ruleInterval returns [EObject current=null] : ( ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) ) | (otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_n_0_0 = null;

        AntlrDatatypeRuleToken lv_m_2_0 = null;

        AntlrDatatypeRuleToken lv_n_4_0 = null;

        AntlrDatatypeRuleToken lv_m_6_0 = null;



        	enterRule();

        try {
            // InternalSml.g:4047:2: ( ( ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) ) | (otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) ) ) ) )
            // InternalSml.g:4048:2: ( ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) ) | (otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) ) ) )
            {
            // InternalSml.g:4048:2: ( ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) ) | (otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT||LA49_0==131) ) {
                alt49=1;
            }
            else if ( (LA49_0==135) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSml.g:4049:3: ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) )
                    {
                    // InternalSml.g:4049:3: ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) )
                    // InternalSml.g:4050:4: ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) )
                    {
                    // InternalSml.g:4050:4: ( (lv_n_0_0= ruleDouble ) )
                    // InternalSml.g:4051:5: (lv_n_0_0= ruleDouble )
                    {
                    // InternalSml.g:4051:5: (lv_n_0_0= ruleDouble )
                    // InternalSml.g:4052:6: lv_n_0_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getNDoubleParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_n_0_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						set(
                    							current,
                    							"n",
                    							lv_n_0_0,
                    							"org.xtext.example.sml.Sml.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_60); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getToKeyword_0_1());
                    			
                    // InternalSml.g:4073:4: ( (lv_m_2_0= ruleDouble ) )
                    // InternalSml.g:4074:5: (lv_m_2_0= ruleDouble )
                    {
                    // InternalSml.g:4074:5: (lv_m_2_0= ruleDouble )
                    // InternalSml.g:4075:6: lv_m_2_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getMDoubleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_m_2_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						set(
                    							current,
                    							"m",
                    							lv_m_2_0,
                    							"org.xtext.example.sml.Sml.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:4094:3: (otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) ) )
                    {
                    // InternalSml.g:4094:3: (otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) ) )
                    // InternalSml.g:4095:4: otherlv_3= 'between' ( (lv_n_4_0= ruleDouble ) ) otherlv_5= 'and' ( (lv_m_6_0= ruleDouble ) )
                    {
                    otherlv_3=(Token)match(input,135,FOLLOW_60); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntervalAccess().getBetweenKeyword_1_0());
                    			
                    // InternalSml.g:4099:4: ( (lv_n_4_0= ruleDouble ) )
                    // InternalSml.g:4100:5: (lv_n_4_0= ruleDouble )
                    {
                    // InternalSml.g:4100:5: (lv_n_4_0= ruleDouble )
                    // InternalSml.g:4101:6: lv_n_4_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getNDoubleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    lv_n_4_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						set(
                    							current,
                    							"n",
                    							lv_n_4_0,
                    							"org.xtext.example.sml.Sml.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntervalAccess().getAndKeyword_1_2());
                    			
                    // InternalSml.g:4122:4: ( (lv_m_6_0= ruleDouble ) )
                    // InternalSml.g:4123:5: (lv_m_6_0= ruleDouble )
                    {
                    // InternalSml.g:4123:5: (lv_m_6_0= ruleDouble )
                    // InternalSml.g:4124:6: lv_m_6_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getIntervalAccess().getMDoubleParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_m_6_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervalRule());
                    						}
                    						set(
                    							current,
                    							"m",
                    							lv_m_6_0,
                    							"org.xtext.example.sml.Sml.Double");
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
    // $ANTLR end "ruleInterval"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\4\uffff\1\7\3\uffff\1\7";
    static final String dfa_3s = "\1\27\1\30\1\uffff\1\4\1\13\1\4\2\uffff\1\13";
    static final String dfa_4s = "\1\34\1\30\1\uffff\1\4\1\32\1\4\2\uffff\1\32";
    static final String dfa_5s = "\2\uffff\1\3\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\7\15\uffff\1\5\1\6",
            "\1\10",
            "",
            "",
            "\1\7\15\uffff\1\5\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "496:2: (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging )";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\122\1\135\1\131\2\uffff\6\133\3\uffff";
    static final String dfa_10s = "\1\134\1\136\1\167\2\uffff\6\155\3\uffff";
    static final String dfa_11s = "\3\uffff\1\1\1\3\6\uffff\1\5\1\2\1\4";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\11\uffff\1\1",
            "\1\4\1\3",
            "\1\14\14\uffff\10\13\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "",
            "\1\15\12\uffff\10\13",
            "\1\15\12\uffff\10\13",
            "\1\15\12\uffff\10\13",
            "\1\15\12\uffff\10\13",
            "\1\15\12\uffff\10\13",
            "\1\15\12\uffff\10\13",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1840:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) )";
        }
    }
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\7\uffff\1\12\3\uffff\1\12";
    static final String dfa_16s = "\2\5\1\31\2\5\1\31\1\5\1\13\1\5\2\uffff\1\13";
    static final String dfa_17s = "\1\u0083\1\5\1\161\1\5\1\u0083\1\31\1\5\1\172\1\5\2\uffff\1\172";
    static final String dfa_18s = "\11\uffff\1\2\1\1\1\uffff";
    static final String dfa_19s = "\14\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\175\uffff\1\1",
            "\1\2",
            "\1\4\127\uffff\1\3",
            "\1\5",
            "\1\7\175\uffff\1\6",
            "\1\4",
            "\1\7",
            "\1\12\15\uffff\1\11\5\uffff\1\12\62\uffff\2\12\10\uffff\1\12\21\uffff\1\12\2\uffff\1\10\10\uffff\1\12",
            "\1\13",
            "",
            "",
            "\1\12\15\uffff\1\11\5\uffff\1\12\62\uffff\2\12\10\uffff\1\12\21\uffff\1\12\13\uffff\1\12"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2549:5: (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D )";
        }
    }
    static final String dfa_21s = "\15\uffff";
    static final String dfa_22s = "\4\uffff\1\13\7\uffff\1\13";
    static final String dfa_23s = "\1\5\2\112\1\5\1\13\5\uffff\1\5\1\uffff\1\13";
    static final String dfa_24s = "\1\u0087\2\u0085\1\5\1\161\5\uffff\1\5\1\uffff\1\156";
    static final String dfa_25s = "\5\uffff\1\3\1\5\1\1\1\2\1\4\1\uffff\1\6\1\uffff";
    static final String dfa_26s = "\15\uffff}>";
    static final String[] dfa_27s = {
            "\1\4\103\uffff\1\1\71\uffff\1\3\1\2\2\uffff\1\5",
            "\1\7\72\uffff\1\6",
            "\1\10\72\uffff\1\11",
            "\1\4",
            "\1\13\12\uffff\1\5\14\uffff\4\13\46\uffff\2\13\3\uffff\2\13\3\uffff\3\13\1\uffff\2\13\21\uffff\1\13\2\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "\1\13\12\uffff\1\5\14\uffff\4\13\46\uffff\2\13\3\uffff\2\13\3\uffff\3\13\1\uffff\2\13\21\uffff\1\13"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "3740:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L,0x00000000100C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000200L,0x0000000000000098L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x00000000100C0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000031L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x00FC3FC000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x000000000B800000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000200080000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x00FC000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0008200080000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000080000000L});

}