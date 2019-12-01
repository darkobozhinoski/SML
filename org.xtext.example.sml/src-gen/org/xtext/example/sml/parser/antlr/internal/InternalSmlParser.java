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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'arena'", "'contains'", "'the'", "'following'", "'elements'", "':'", "'distributed'", "'with'", "'a'", "'distribution'", "'in'", "'robot'", "'swarm'", "'consists'", "'of'", "'total'", "'time'", "'mission'", "'is'", "'robots'", "'to'", "'aggregate'", "'on'", "','", "'while'", "'avoiding'", "'collect'", "'food'", "'from'", "'and'", "'bring'", "'it'", "'back'", "'seconds'", "'steps'", "'m'", "'performance'", "'measure'", "'defined'", "'terms'", "'an'", "'objective'", "'function'", "'be'", "'maximized.'", "'minimized.'", "'computed'", "'as'", "'follows:'", "'each'", "'At any point in time,'", "'At the end of the mission,'", "'gets'", "'penalty'", "'reward'", "'if'", "'If'", "'outside'", "'there'", "'are'", "'more'", "'than'", "'goes'", "'into'", "'e-puck'", "'foot-boot'", "'Uniform'", "'Gaussian'", "'Constant'", "'A'", "'There'", "'dimensions'", "'objects'", "'obstacles'", "'light'", "'sources'", "'patch'", "'An'", "'object'", "'obstacle'", "'source'", "'emitting'", "'placed'", "'at'", "'center'", "'reference'", "'point'", "'Circle'", "'Polygon'", "'Triangle'", "'Rectangle'", "'Dodecagon'", "'Hexagon'", "'Square'", "'Region'", "'surrounded'", "'by'", "'walls'", "'.'", "'red'", "'yellow'", "'green'", "'gray'", "'black'", "'white'", "'through'", "'Vertices'", "';'", "'where'", "'x'", "'y'", "'radius'", "'height'", "'length'", "',width'", "'side'", "'-'", "'less'", "'or'", "'equal'"
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

                    if ( (LA1_1==23) ) {
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
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==12) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
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
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=81 && LA4_0<=82)||LA4_0==89) ) {
                    alt4=1;
                }


                switch (alt4) {
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
    // InternalSml.g:234:1: ruleProbabilisticDecription returns [EObject current=null] : (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) ) ;
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
            // InternalSml.g:240:2: ( (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalSml.g:241:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalSml.g:241:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )
            // InternalSml.g:242:3: otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )
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
            		
            otherlv_5=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getProbabilisticDecriptionAccess().getInKeyword_5());
            		
            // InternalSml.g:281:3: ( (otherlv_6= RULE_ID ) )
            // InternalSml.g:282:4: (otherlv_6= RULE_ID )
            {
            // InternalSml.g:282:4: (otherlv_6= RULE_ID )
            // InternalSml.g:283:5: otherlv_6= RULE_ID
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


    // $ANTLR start "entryRuleSwarmconf"
    // InternalSml.g:298:1: entryRuleSwarmconf returns [EObject current=null] : iv_ruleSwarmconf= ruleSwarmconf EOF ;
    public final EObject entryRuleSwarmconf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwarmconf = null;


        try {
            // InternalSml.g:298:50: (iv_ruleSwarmconf= ruleSwarmconf EOF )
            // InternalSml.g:299:2: iv_ruleSwarmconf= ruleSwarmconf EOF
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
    // InternalSml.g:305:1: ruleSwarmconf returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) ;
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
            // InternalSml.g:311:2: ( (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:312:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:312:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:313:3: otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) )
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
            		
            // InternalSml.g:333:3: ( (lv_x_5_0= ruleRange ) )
            // InternalSml.g:334:4: (lv_x_5_0= ruleRange )
            {
            // InternalSml.g:334:4: (lv_x_5_0= ruleRange )
            // InternalSml.g:335:5: lv_x_5_0= ruleRange
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

            // InternalSml.g:352:3: ( (lv_r_6_0= ruleRobot ) )
            // InternalSml.g:353:4: (lv_r_6_0= ruleRobot )
            {
            // InternalSml.g:353:4: (lv_r_6_0= ruleRobot )
            // InternalSml.g:354:5: lv_r_6_0= ruleRobot
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

            // InternalSml.g:371:3: ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            // InternalSml.g:372:4: (lv_pr_7_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:372:4: (lv_pr_7_0= ruleProbabilisticDecription )
            // InternalSml.g:373:5: lv_pr_7_0= ruleProbabilisticDecription
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
    // InternalSml.g:394:1: entryRuleMissionSpecification returns [EObject current=null] : iv_ruleMissionSpecification= ruleMissionSpecification EOF ;
    public final EObject entryRuleMissionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionSpecification = null;


        try {
            // InternalSml.g:394:61: (iv_ruleMissionSpecification= ruleMissionSpecification EOF )
            // InternalSml.g:395:2: iv_ruleMissionSpecification= ruleMissionSpecification EOF
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
    // InternalSml.g:401:1: ruleMissionSpecification returns [EObject current=null] : ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) ) ;
    public final EObject ruleMissionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_m_0_0 = null;

        EObject lv_mt_1_0 = null;

        EObject lv_ob_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:407:2: ( ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) ) )
            // InternalSml.g:408:2: ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) )
            {
            // InternalSml.g:408:2: ( ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) ) )
            // InternalSml.g:409:3: ( (lv_m_0_0= ruleMission ) ) ( (lv_mt_1_0= ruleMissionTime ) ) ( (lv_ob_2_0= ruleMissionObjective ) )
            {
            // InternalSml.g:409:3: ( (lv_m_0_0= ruleMission ) )
            // InternalSml.g:410:4: (lv_m_0_0= ruleMission )
            {
            // InternalSml.g:410:4: (lv_m_0_0= ruleMission )
            // InternalSml.g:411:5: lv_m_0_0= ruleMission
            {

            					newCompositeNode(grammarAccess.getMissionSpecificationAccess().getMMissionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSml.g:428:3: ( (lv_mt_1_0= ruleMissionTime ) )
            // InternalSml.g:429:4: (lv_mt_1_0= ruleMissionTime )
            {
            // InternalSml.g:429:4: (lv_mt_1_0= ruleMissionTime )
            // InternalSml.g:430:5: lv_mt_1_0= ruleMissionTime
            {

            					newCompositeNode(grammarAccess.getMissionSpecificationAccess().getMtMissionTimeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSml.g:447:3: ( (lv_ob_2_0= ruleMissionObjective ) )
            // InternalSml.g:448:4: (lv_ob_2_0= ruleMissionObjective )
            {
            // InternalSml.g:448:4: (lv_ob_2_0= ruleMissionObjective )
            // InternalSml.g:449:5: lv_ob_2_0= ruleMissionObjective
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
    // InternalSml.g:470:1: entryRuleMissionTime returns [EObject current=null] : iv_ruleMissionTime= ruleMissionTime EOF ;
    public final EObject entryRuleMissionTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionTime = null;


        try {
            // InternalSml.g:470:52: (iv_ruleMissionTime= ruleMissionTime EOF )
            // InternalSml.g:471:2: iv_ruleMissionTime= ruleMissionTime EOF
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
    // InternalSml.g:477:1: ruleMissionTime returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) ) ;
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
            // InternalSml.g:483:2: ( (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) ) )
            // InternalSml.g:484:2: (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) )
            {
            // InternalSml.g:484:2: (otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) ) )
            // InternalSml.g:485:3: otherlv_0= 'The' otherlv_1= 'total' otherlv_2= 'time' otherlv_3= 'of' otherlv_4= 'the' otherlv_5= 'mission' otherlv_6= 'is' ( (lv_t_7_0= ruleRange ) ) ( (lv_m_8_0= ruleMetric ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionTimeAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionTimeAccess().getTotalKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionTimeAccess().getTimeKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionTimeAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionTimeAccess().getTheKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionTimeAccess().getMissionKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionTimeAccess().getIsKeyword_6());
            		
            // InternalSml.g:513:3: ( (lv_t_7_0= ruleRange ) )
            // InternalSml.g:514:4: (lv_t_7_0= ruleRange )
            {
            // InternalSml.g:514:4: (lv_t_7_0= ruleRange )
            // InternalSml.g:515:5: lv_t_7_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getMissionTimeAccess().getTRangeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSml.g:532:3: ( (lv_m_8_0= ruleMetric ) )
            // InternalSml.g:533:4: (lv_m_8_0= ruleMetric )
            {
            // InternalSml.g:533:4: (lv_m_8_0= ruleMetric )
            // InternalSml.g:534:5: lv_m_8_0= ruleMetric
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
    // InternalSml.g:555:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalSml.g:555:48: (iv_ruleMission= ruleMission EOF )
            // InternalSml.g:556:2: iv_ruleMission= ruleMission EOF
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
    // InternalSml.g:562:1: ruleMission returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) ) ;
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
            // InternalSml.g:568:2: ( (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) ) )
            // InternalSml.g:569:2: (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) )
            {
            // InternalSml.g:569:2: (otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) ) )
            // InternalSml.g:570:3: otherlv_0= 'The' otherlv_1= 'mission' otherlv_2= 'of' otherlv_3= 'the' otherlv_4= 'robots' otherlv_5= 'is' otherlv_6= 'to' ( (lv_t_7_0= ruleTask ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getTheKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getRobotsKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getIsKeyword_5());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionAccess().getToKeyword_6());
            		
            // InternalSml.g:598:3: ( (lv_t_7_0= ruleTask ) )
            // InternalSml.g:599:4: (lv_t_7_0= ruleTask )
            {
            // InternalSml.g:599:4: (lv_t_7_0= ruleTask )
            // InternalSml.g:600:5: lv_t_7_0= ruleTask
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
    // InternalSml.g:621:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalSml.g:621:45: (iv_ruleTask= ruleTask EOF )
            // InternalSml.g:622:2: iv_ruleTask= ruleTask EOF
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
    // InternalSml.g:628:1: ruleTask returns [EObject current=null] : (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_Aggregate_0 = null;

        EObject this_Migration_1 = null;

        EObject this_Foraging_2 = null;



        	enterRule();

        try {
            // InternalSml.g:634:2: ( (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging ) )
            // InternalSml.g:635:2: (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging )
            {
            // InternalSml.g:635:2: (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalSml.g:636:3: this_Aggregate_0= ruleAggregate
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
                    // InternalSml.g:645:3: this_Migration_1= ruleMigration
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
                    // InternalSml.g:654:3: this_Foraging_2= ruleForaging
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
    // InternalSml.g:666:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalSml.g:666:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalSml.g:667:2: iv_ruleAggregate= ruleAggregate EOF
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
    // InternalSml.g:673:1: ruleAggregate returns [EObject current=null] : (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSml.g:679:2: ( (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalSml.g:680:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalSml.g:680:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalSml.g:681:3: otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregateAccess().getAggregateKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregateAccess().getOnKeyword_1());
            		
            // InternalSml.g:689:3: ( (otherlv_2= RULE_ID ) )
            // InternalSml.g:690:4: (otherlv_2= RULE_ID )
            {
            // InternalSml.g:690:4: (otherlv_2= RULE_ID )
            // InternalSml.g:691:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getRRegionCrossReference_2_0());
            				

            }


            }

            // InternalSml.g:702:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSml.g:703:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSml.g:707:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSml.g:708:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSml.g:708:5: (otherlv_4= RULE_ID )
            	    // InternalSml.g:709:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAggregateRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    						newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getRRegionCrossReference_3_1_0());
            	    					

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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleMigration"
    // InternalSml.g:725:1: entryRuleMigration returns [EObject current=null] : iv_ruleMigration= ruleMigration EOF ;
    public final EObject entryRuleMigration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigration = null;


        try {
            // InternalSml.g:725:50: (iv_ruleMigration= ruleMigration EOF )
            // InternalSml.g:726:2: iv_ruleMigration= ruleMigration EOF
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
    // InternalSml.g:732:1: ruleMigration returns [EObject current=null] : (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ;
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
            // InternalSml.g:738:2: ( (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            // InternalSml.g:739:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            {
            // InternalSml.g:739:2: (otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            // InternalSml.g:740:3: otherlv_0= 'aggregate' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'while' otherlv_6= 'avoiding' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getMigrationAccess().getAggregateKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getMigrationAccess().getOnKeyword_1());
            		
            // InternalSml.g:748:3: ( (otherlv_2= RULE_ID ) )
            // InternalSml.g:749:4: (otherlv_2= RULE_ID )
            {
            // InternalSml.g:749:4: (otherlv_2= RULE_ID )
            // InternalSml.g:750:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_2, grammarAccess.getMigrationAccess().getRRegionCrossReference_2_0());
            				

            }


            }

            // InternalSml.g:761:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSml.g:762:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_17); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMigrationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSml.g:766:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalSml.g:767:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalSml.g:767:5: (otherlv_4= RULE_ID )
            	    // InternalSml.g:768:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMigrationRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    						newLeafNode(otherlv_4, grammarAccess.getMigrationAccess().getRRegionCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getMigrationAccess().getWhileKeyword_4());
            		
            otherlv_6=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getMigrationAccess().getAvoidingKeyword_5());
            		
            // InternalSml.g:788:3: ( (otherlv_7= RULE_ID ) )
            // InternalSml.g:789:4: (otherlv_7= RULE_ID )
            {
            // InternalSml.g:789:4: (otherlv_7= RULE_ID )
            // InternalSml.g:790:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMigrationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_7, grammarAccess.getMigrationAccess().getTRegionCrossReference_6_0());
            				

            }


            }

            // InternalSml.g:801:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSml.g:802:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,35,FOLLOW_17); 

            	    				newLeafNode(otherlv_8, grammarAccess.getMigrationAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSml.g:806:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalSml.g:807:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalSml.g:807:5: (otherlv_9= RULE_ID )
            	    // InternalSml.g:808:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMigrationRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    						newLeafNode(otherlv_9, grammarAccess.getMigrationAccess().getTRegionCrossReference_7_1_0());
            	    					

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
    // $ANTLR end "ruleMigration"


    // $ANTLR start "entryRuleForaging"
    // InternalSml.g:824:1: entryRuleForaging returns [EObject current=null] : iv_ruleForaging= ruleForaging EOF ;
    public final EObject entryRuleForaging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForaging = null;


        try {
            // InternalSml.g:824:49: (iv_ruleForaging= ruleForaging EOF )
            // InternalSml.g:825:2: iv_ruleForaging= ruleForaging EOF
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
    // InternalSml.g:831:1: ruleForaging returns [EObject current=null] : (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) ;
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
            // InternalSml.g:837:2: ( (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* ) )
            // InternalSml.g:838:2: (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            {
            // InternalSml.g:838:2: (otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )
            // InternalSml.g:839:3: otherlv_0= 'collect' otherlv_1= 'food' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= 'and' otherlv_7= 'bring' otherlv_8= 'it' otherlv_9= 'back' otherlv_10= 'to' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getForagingAccess().getCollectKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getForagingAccess().getFoodKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getForagingAccess().getFromKeyword_2());
            		
            // InternalSml.g:851:3: ( (otherlv_3= RULE_ID ) )
            // InternalSml.g:852:4: (otherlv_3= RULE_ID )
            {
            // InternalSml.g:852:4: (otherlv_3= RULE_ID )
            // InternalSml.g:853:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForagingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_3, grammarAccess.getForagingAccess().getSourceRegionCrossReference_3_0());
            				

            }


            }

            // InternalSml.g:864:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSml.g:865:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getForagingAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSml.g:869:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSml.g:870:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSml.g:870:5: (otherlv_5= RULE_ID )
            	    // InternalSml.g:871:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForagingRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_40); 

            	    						newLeafNode(otherlv_5, grammarAccess.getForagingAccess().getSourceRegionCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,41,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getForagingAccess().getAndKeyword_5());
            		
            otherlv_7=(Token)match(input,42,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getForagingAccess().getBringKeyword_6());
            		
            otherlv_8=(Token)match(input,43,FOLLOW_43); 

            			newLeafNode(otherlv_8, grammarAccess.getForagingAccess().getItKeyword_7());
            		
            otherlv_9=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_9, grammarAccess.getForagingAccess().getBackKeyword_8());
            		
            otherlv_10=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getForagingAccess().getToKeyword_9());
            		
            // InternalSml.g:903:3: ( (otherlv_11= RULE_ID ) )
            // InternalSml.g:904:4: (otherlv_11= RULE_ID )
            {
            // InternalSml.g:904:4: (otherlv_11= RULE_ID )
            // InternalSml.g:905:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForagingRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_11, grammarAccess.getForagingAccess().getNestRegionCrossReference_10_0());
            				

            }


            }

            // InternalSml.g:916:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSml.g:917:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,35,FOLLOW_17); 

            	    				newLeafNode(otherlv_12, grammarAccess.getForagingAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalSml.g:921:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalSml.g:922:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalSml.g:922:5: (otherlv_13= RULE_ID )
            	    // InternalSml.g:923:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForagingRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    						newLeafNode(otherlv_13, grammarAccess.getForagingAccess().getSourceRegionCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSml.g:939:1: entryRuleMetric returns [String current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final String entryRuleMetric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetric = null;


        try {
            // InternalSml.g:939:46: (iv_ruleMetric= ruleMetric EOF )
            // InternalSml.g:940:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalSml.g:946:1: ruleMetric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'seconds' | kw= 'steps' | kw= 'm' ) ;
    public final AntlrDatatypeRuleToken ruleMetric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:952:2: ( (kw= 'seconds' | kw= 'steps' | kw= 'm' ) )
            // InternalSml.g:953:2: (kw= 'seconds' | kw= 'steps' | kw= 'm' )
            {
            // InternalSml.g:953:2: (kw= 'seconds' | kw= 'steps' | kw= 'm' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 47:
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
                    // InternalSml.g:954:3: kw= 'seconds'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getSecondsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:960:3: kw= 'steps'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getStepsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:966:3: kw= 'm'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMetricAccess().getMKeyword_2());
                    		

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
    // InternalSml.g:975:1: entryRuleMissionObjective returns [EObject current=null] : iv_ruleMissionObjective= ruleMissionObjective EOF ;
    public final EObject entryRuleMissionObjective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionObjective = null;


        try {
            // InternalSml.g:975:57: (iv_ruleMissionObjective= ruleMissionObjective EOF )
            // InternalSml.g:976:2: iv_ruleMissionObjective= ruleMissionObjective EOF
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
    // InternalSml.g:982:1: ruleMissionObjective returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* ) ;
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
            // InternalSml.g:988:2: ( (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* ) )
            // InternalSml.g:989:2: (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* )
            {
            // InternalSml.g:989:2: (otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )* )
            // InternalSml.g:990:3: otherlv_0= 'The' otherlv_1= 'performance' otherlv_2= 'measure' otherlv_3= 'is' otherlv_4= 'defined' otherlv_5= 'in' otherlv_6= 'terms' otherlv_7= 'of' otherlv_8= 'an' otherlv_9= 'objective' otherlv_10= 'function' otherlv_11= 'to' otherlv_12= 'be' ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) ) otherlv_14= 'The' otherlv_15= 'objective' otherlv_16= 'function' otherlv_17= 'is' otherlv_18= 'computed' otherlv_19= 'as' otherlv_20= 'follows:' ( (lv_in_21_0= ruleIndicator ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionObjectiveAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionObjectiveAccess().getPerformanceKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionObjectiveAccess().getMeasureKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionObjectiveAccess().getIsKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionObjectiveAccess().getDefinedKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionObjectiveAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,51,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getMissionObjectiveAccess().getTermsKeyword_6());
            		
            otherlv_7=(Token)match(input,26,FOLLOW_48); 

            			newLeafNode(otherlv_7, grammarAccess.getMissionObjectiveAccess().getOfKeyword_7());
            		
            otherlv_8=(Token)match(input,52,FOLLOW_49); 

            			newLeafNode(otherlv_8, grammarAccess.getMissionObjectiveAccess().getAnKeyword_8());
            		
            otherlv_9=(Token)match(input,53,FOLLOW_50); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionObjectiveAccess().getObjectiveKeyword_9());
            		
            otherlv_10=(Token)match(input,54,FOLLOW_32); 

            			newLeafNode(otherlv_10, grammarAccess.getMissionObjectiveAccess().getFunctionKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_51); 

            			newLeafNode(otherlv_11, grammarAccess.getMissionObjectiveAccess().getToKeyword_11());
            		
            otherlv_12=(Token)match(input,55,FOLLOW_52); 

            			newLeafNode(otherlv_12, grammarAccess.getMissionObjectiveAccess().getBeKeyword_12());
            		
            // InternalSml.g:1042:3: ( ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) ) )
            // InternalSml.g:1043:4: ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) )
            {
            // InternalSml.g:1043:4: ( (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' ) )
            // InternalSml.g:1044:5: (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' )
            {
            // InternalSml.g:1044:5: (lv_Type_13_1= 'maximized.' | lv_Type_13_2= 'minimized.' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            else if ( (LA12_0==57) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSml.g:1045:6: lv_Type_13_1= 'maximized.'
                    {
                    lv_Type_13_1=(Token)match(input,56,FOLLOW_25); 

                    						newLeafNode(lv_Type_13_1, grammarAccess.getMissionObjectiveAccess().getTypeMaximizedKeyword_13_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionObjectiveRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_13_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSml.g:1056:6: lv_Type_13_2= 'minimized.'
                    {
                    lv_Type_13_2=(Token)match(input,57,FOLLOW_25); 

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
            		
            otherlv_15=(Token)match(input,53,FOLLOW_50); 

            			newLeafNode(otherlv_15, grammarAccess.getMissionObjectiveAccess().getObjectiveKeyword_15());
            		
            otherlv_16=(Token)match(input,54,FOLLOW_29); 

            			newLeafNode(otherlv_16, grammarAccess.getMissionObjectiveAccess().getFunctionKeyword_16());
            		
            otherlv_17=(Token)match(input,30,FOLLOW_53); 

            			newLeafNode(otherlv_17, grammarAccess.getMissionObjectiveAccess().getIsKeyword_17());
            		
            otherlv_18=(Token)match(input,58,FOLLOW_54); 

            			newLeafNode(otherlv_18, grammarAccess.getMissionObjectiveAccess().getComputedKeyword_18());
            		
            otherlv_19=(Token)match(input,59,FOLLOW_55); 

            			newLeafNode(otherlv_19, grammarAccess.getMissionObjectiveAccess().getAsKeyword_19());
            		
            otherlv_20=(Token)match(input,60,FOLLOW_56); 

            			newLeafNode(otherlv_20, grammarAccess.getMissionObjectiveAccess().getFollowsKeyword_20());
            		
            // InternalSml.g:1097:3: ( (lv_in_21_0= ruleIndicator ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=62 && LA13_0<=63)||(LA13_0>=67 && LA13_0<=68)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSml.g:1098:4: (lv_in_21_0= ruleIndicator )
            	    {
            	    // InternalSml.g:1098:4: (lv_in_21_0= ruleIndicator )
            	    // InternalSml.g:1099:5: lv_in_21_0= ruleIndicator
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
    // InternalSml.g:1120:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // InternalSml.g:1120:50: (iv_ruleIndicator= ruleIndicator EOF )
            // InternalSml.g:1121:2: iv_ruleIndicator= ruleIndicator EOF
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
    // InternalSml.g:1127:1: ruleIndicator returns [EObject current=null] : ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) ) ;
    public final EObject ruleIndicator() throws RecognitionException {
        EObject current = null;

        EObject lv_sp_0_0 = null;

        EObject lv_oc_1_1 = null;

        EObject lv_oc_1_2 = null;



        	enterRule();

        try {
            // InternalSml.g:1133:2: ( ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) ) )
            // InternalSml.g:1134:2: ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) )
            {
            // InternalSml.g:1134:2: ( ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) ) )
            // InternalSml.g:1135:3: ( (lv_sp_0_0= ruleScope ) ) ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) )
            {
            // InternalSml.g:1135:3: ( (lv_sp_0_0= ruleScope ) )
            // InternalSml.g:1136:4: (lv_sp_0_0= ruleScope )
            {
            // InternalSml.g:1136:4: (lv_sp_0_0= ruleScope )
            // InternalSml.g:1137:5: lv_sp_0_0= ruleScope
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

            // InternalSml.g:1154:3: ( ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) ) )
            // InternalSml.g:1155:4: ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) )
            {
            // InternalSml.g:1155:4: ( (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator ) )
            // InternalSml.g:1156:5: (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator )
            {
            // InternalSml.g:1156:5: (lv_oc_1_1= ruleAtomicIndicator | lv_oc_1_2= ruleCompoundIndicator )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==61) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSml.g:1157:6: lv_oc_1_1= ruleAtomicIndicator
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
                    // InternalSml.g:1173:6: lv_oc_1_2= ruleCompoundIndicator
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
    // InternalSml.g:1195:1: entryRuleAtomicIndicator returns [EObject current=null] : iv_ruleAtomicIndicator= ruleAtomicIndicator EOF ;
    public final EObject entryRuleAtomicIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicIndicator = null;


        try {
            // InternalSml.g:1195:56: (iv_ruleAtomicIndicator= ruleAtomicIndicator EOF )
            // InternalSml.g:1196:2: iv_ruleAtomicIndicator= ruleAtomicIndicator EOF
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
    // InternalSml.g:1202:1: ruleAtomicIndicator returns [EObject current=null] : (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) ) ;
    public final EObject ruleAtomicIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oc_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1208:2: ( (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) ) )
            // InternalSml.g:1209:2: (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) )
            {
            // InternalSml.g:1209:2: (otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) ) )
            // InternalSml.g:1210:3: otherlv_0= 'each' otherlv_1= 'robot' ( (lv_oc_2_0= ruleOccurence ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicIndicatorAccess().getEachKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicIndicatorAccess().getRobotKeyword_1());
            		
            // InternalSml.g:1218:3: ( (lv_oc_2_0= ruleOccurence ) )
            // InternalSml.g:1219:4: (lv_oc_2_0= ruleOccurence )
            {
            // InternalSml.g:1219:4: (lv_oc_2_0= ruleOccurence )
            // InternalSml.g:1220:5: lv_oc_2_0= ruleOccurence
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
    // InternalSml.g:1241:1: entryRuleCompoundIndicator returns [EObject current=null] : iv_ruleCompoundIndicator= ruleCompoundIndicator EOF ;
    public final EObject entryRuleCompoundIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundIndicator = null;


        try {
            // InternalSml.g:1241:58: (iv_ruleCompoundIndicator= ruleCompoundIndicator EOF )
            // InternalSml.g:1242:2: iv_ruleCompoundIndicator= ruleCompoundIndicator EOF
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
    // InternalSml.g:1248:1: ruleCompoundIndicator returns [EObject current=null] : (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) ) ;
    public final EObject ruleCompoundIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_oc_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1254:2: ( (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) ) )
            // InternalSml.g:1255:2: (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) )
            {
            // InternalSml.g:1255:2: (otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) ) )
            // InternalSml.g:1256:3: otherlv_0= 'the' otherlv_1= 'swarm' ( (lv_oc_2_0= ruleOccurence ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCompoundIndicatorAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundIndicatorAccess().getSwarmKeyword_1());
            		
            // InternalSml.g:1264:3: ( (lv_oc_2_0= ruleOccurence ) )
            // InternalSml.g:1265:4: (lv_oc_2_0= ruleOccurence )
            {
            // InternalSml.g:1265:4: (lv_oc_2_0= ruleOccurence )
            // InternalSml.g:1266:5: lv_oc_2_0= ruleOccurence
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
    // InternalSml.g:1287:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalSml.g:1287:46: (iv_ruleScope= ruleScope EOF )
            // InternalSml.g:1288:2: iv_ruleScope= ruleScope EOF
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
    // InternalSml.g:1294:1: ruleScope returns [EObject current=null] : ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_sp_0_1=null;
        Token lv_sp_0_2=null;
        EObject this_Condition_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1300:2: ( ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition ) )
            // InternalSml.g:1301:2: ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition )
            {
            // InternalSml.g:1301:2: ( ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) ) | this_Condition_1= ruleCondition )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=62 && LA16_0<=63)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=67 && LA16_0<=68)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSml.g:1302:3: ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) )
                    {
                    // InternalSml.g:1302:3: ( ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) ) )
                    // InternalSml.g:1303:4: ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) )
                    {
                    // InternalSml.g:1303:4: ( (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' ) )
                    // InternalSml.g:1304:5: (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' )
                    {
                    // InternalSml.g:1304:5: (lv_sp_0_1= 'At any point in time,' | lv_sp_0_2= 'At the end of the mission,' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==62) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==63) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSml.g:1305:6: lv_sp_0_1= 'At any point in time,'
                            {
                            lv_sp_0_1=(Token)match(input,62,FOLLOW_2); 

                            						newLeafNode(lv_sp_0_1, grammarAccess.getScopeAccess().getSpAtAnyPointInTimeKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getScopeRule());
                            						}
                            						setWithLastConsumed(current, "sp", lv_sp_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1316:6: lv_sp_0_2= 'At the end of the mission,'
                            {
                            lv_sp_0_2=(Token)match(input,63,FOLLOW_2); 

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
                    // InternalSml.g:1330:3: this_Condition_1= ruleCondition
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
    // InternalSml.g:1342:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalSml.g:1342:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalSml.g:1343:2: iv_ruleOccurence= ruleOccurence EOF
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
    // InternalSml.g:1349:1: ruleOccurence returns [EObject current=null] : (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        EObject this_Reward_0 = null;

        EObject this_Penalty_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1355:2: ( (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty ) )
            // InternalSml.g:1356:2: (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty )
            {
            // InternalSml.g:1356:2: (this_Reward_0= ruleReward | this_Penalty_1= rulePenalty )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==64) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==20) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==65) ) {
                        alt17=2;
                    }
                    else if ( (LA17_2==66) ) {
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
                    // InternalSml.g:1357:3: this_Reward_0= ruleReward
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
                    // InternalSml.g:1366:3: this_Penalty_1= rulePenalty
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
    // InternalSml.g:1378:1: entryRulePenalty returns [EObject current=null] : iv_rulePenalty= rulePenalty EOF ;
    public final EObject entryRulePenalty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenalty = null;


        try {
            // InternalSml.g:1378:48: (iv_rulePenalty= rulePenalty EOF )
            // InternalSml.g:1379:2: iv_rulePenalty= rulePenalty EOF
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
    // InternalSml.g:1385:1: rulePenalty returns [EObject current=null] : (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) ;
    public final EObject rulePenalty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_k_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1391:2: ( (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) )
            // InternalSml.g:1392:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            {
            // InternalSml.g:1392:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            // InternalSml.g:1393:3: otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'penalty' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPenaltyAccess().getGetsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getPenaltyAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,65,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getPenaltyAccess().getPenaltyKeyword_2());
            		
            // InternalSml.g:1405:3: ( (lv_k_3_0= ruleDouble ) )
            // InternalSml.g:1406:4: (lv_k_3_0= ruleDouble )
            {
            // InternalSml.g:1406:4: (lv_k_3_0= ruleDouble )
            // InternalSml.g:1407:5: lv_k_3_0= ruleDouble
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

            // InternalSml.g:1424:3: ( (lv_c_4_0= ruleCondition ) )
            // InternalSml.g:1425:4: (lv_c_4_0= ruleCondition )
            {
            // InternalSml.g:1425:4: (lv_c_4_0= ruleCondition )
            // InternalSml.g:1426:5: lv_c_4_0= ruleCondition
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
    // InternalSml.g:1447:1: entryRuleReward returns [EObject current=null] : iv_ruleReward= ruleReward EOF ;
    public final EObject entryRuleReward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReward = null;


        try {
            // InternalSml.g:1447:47: (iv_ruleReward= ruleReward EOF )
            // InternalSml.g:1448:2: iv_ruleReward= ruleReward EOF
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
    // InternalSml.g:1454:1: ruleReward returns [EObject current=null] : (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) ;
    public final EObject ruleReward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_k_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1460:2: ( (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) ) )
            // InternalSml.g:1461:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            {
            // InternalSml.g:1461:2: (otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) ) )
            // InternalSml.g:1462:3: otherlv_0= 'gets' otherlv_1= 'a' otherlv_2= 'reward' ( (lv_k_3_0= ruleDouble ) ) ( (lv_c_4_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRewardAccess().getGetsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getRewardAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getRewardAccess().getRewardKeyword_2());
            		
            // InternalSml.g:1474:3: ( (lv_k_3_0= ruleDouble ) )
            // InternalSml.g:1475:4: (lv_k_3_0= ruleDouble )
            {
            // InternalSml.g:1475:4: (lv_k_3_0= ruleDouble )
            // InternalSml.g:1476:5: lv_k_3_0= ruleDouble
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

            // InternalSml.g:1493:3: ( (lv_c_4_0= ruleCondition ) )
            // InternalSml.g:1494:4: (lv_c_4_0= ruleCondition )
            {
            // InternalSml.g:1494:4: (lv_c_4_0= ruleCondition )
            // InternalSml.g:1495:5: lv_c_4_0= ruleCondition
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
    // InternalSml.g:1516:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSml.g:1516:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSml.g:1517:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSml.g:1523:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) ) ;
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
            // InternalSml.g:1529:2: ( ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) ) )
            // InternalSml.g:1530:2: ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) )
            {
            // InternalSml.g:1530:2: ( ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) ) | ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* ) | ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==67) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==43) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==74) ) {
                        alt24=3;
                    }
                    else if ( (LA24_3==30) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1==70) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==68) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==43) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==74) ) {
                        alt24=3;
                    }
                    else if ( (LA24_3==30) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_2==70) ) {
                    alt24=2;
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
                    // InternalSml.g:1531:3: ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalSml.g:1531:3: ( (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) ) )
                    // InternalSml.g:1532:4: (otherlv_0= 'if' | otherlv_1= 'If' ) otherlv_2= 'it' otherlv_3= 'is' (otherlv_4= 'on' | otherlv_5= 'outside' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalSml.g:1532:4: (otherlv_0= 'if' | otherlv_1= 'If' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==67) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==68) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSml.g:1533:5: otherlv_0= 'if'
                            {
                            otherlv_0=(Token)match(input,67,FOLLOW_42); 

                            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1538:5: otherlv_1= 'If'
                            {
                            otherlv_1=(Token)match(input,68,FOLLOW_42); 

                            					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getIfKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,43,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getItKeyword_0_1());
                    			
                    otherlv_3=(Token)match(input,30,FOLLOW_63); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getIsKeyword_0_2());
                    			
                    // InternalSml.g:1551:4: (otherlv_4= 'on' | otherlv_5= 'outside' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==34) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==69) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSml.g:1552:5: otherlv_4= 'on'
                            {
                            otherlv_4=(Token)match(input,34,FOLLOW_17); 

                            					newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getOnKeyword_0_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1557:5: otherlv_5= 'outside'
                            {
                            otherlv_5=(Token)match(input,69,FOLLOW_17); 

                            					newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getOutsideKeyword_0_3_1());
                            				

                            }
                            break;

                    }

                    // InternalSml.g:1562:4: ( (otherlv_6= RULE_ID ) )
                    // InternalSml.g:1563:5: (otherlv_6= RULE_ID )
                    {
                    // InternalSml.g:1563:5: (otherlv_6= RULE_ID )
                    // InternalSml.g:1564:6: otherlv_6= RULE_ID
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
                    // InternalSml.g:1577:3: ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* )
                    {
                    // InternalSml.g:1577:3: ( (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )* )
                    // InternalSml.g:1578:4: (otherlv_7= 'if' | otherlv_8= 'If' ) otherlv_9= 'there' otherlv_10= 'are' otherlv_11= 'more' otherlv_12= 'than' ( (lv_n_13_0= RULE_INT ) ) otherlv_14= 'robots' (otherlv_15= 'on' | otherlv_16= 'outside' ) ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' )*
                    {
                    // InternalSml.g:1578:4: (otherlv_7= 'if' | otherlv_8= 'If' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==67) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==68) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalSml.g:1579:5: otherlv_7= 'if'
                            {
                            otherlv_7=(Token)match(input,67,FOLLOW_64); 

                            					newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getIfKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1584:5: otherlv_8= 'If'
                            {
                            otherlv_8=(Token)match(input,68,FOLLOW_64); 

                            					newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getIfKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,70,FOLLOW_65); 

                    				newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getThereKeyword_1_1());
                    			
                    otherlv_10=(Token)match(input,71,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getAreKeyword_1_2());
                    			
                    otherlv_11=(Token)match(input,72,FOLLOW_67); 

                    				newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getMoreKeyword_1_3());
                    			
                    otherlv_12=(Token)match(input,73,FOLLOW_68); 

                    				newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getThanKeyword_1_4());
                    			
                    // InternalSml.g:1605:4: ( (lv_n_13_0= RULE_INT ) )
                    // InternalSml.g:1606:5: (lv_n_13_0= RULE_INT )
                    {
                    // InternalSml.g:1606:5: (lv_n_13_0= RULE_INT )
                    // InternalSml.g:1607:6: lv_n_13_0= RULE_INT
                    {
                    lv_n_13_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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

                    otherlv_14=(Token)match(input,31,FOLLOW_63); 

                    				newLeafNode(otherlv_14, grammarAccess.getConditionAccess().getRobotsKeyword_1_6());
                    			
                    // InternalSml.g:1627:4: (otherlv_15= 'on' | otherlv_16= 'outside' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==34) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==69) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSml.g:1628:5: otherlv_15= 'on'
                            {
                            otherlv_15=(Token)match(input,34,FOLLOW_17); 

                            					newLeafNode(otherlv_15, grammarAccess.getConditionAccess().getOnKeyword_1_7_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1633:5: otherlv_16= 'outside'
                            {
                            otherlv_16=(Token)match(input,69,FOLLOW_17); 

                            					newLeafNode(otherlv_16, grammarAccess.getConditionAccess().getOutsideKeyword_1_7_1());
                            				

                            }
                            break;

                    }

                    // InternalSml.g:1638:4: ( (otherlv_17= RULE_ID ) )
                    // InternalSml.g:1639:5: (otherlv_17= RULE_ID )
                    {
                    // InternalSml.g:1639:5: (otherlv_17= RULE_ID )
                    // InternalSml.g:1640:6: otherlv_17= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_17, grammarAccess.getConditionAccess().getRRegionCrossReference_1_8_0());
                    					

                    }


                    }

                    // InternalSml.g:1651:4: (otherlv_18= ',' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==35) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSml.g:1652:5: otherlv_18= ','
                    	    {
                    	    otherlv_18=(Token)match(input,35,FOLLOW_35); 

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
                    // InternalSml.g:1659:3: ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) )
                    {
                    // InternalSml.g:1659:3: ( (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) ) )
                    // InternalSml.g:1660:4: (otherlv_19= 'if' | otherlv_20= 'If' ) otherlv_21= 'it' otherlv_22= 'goes' otherlv_23= 'from' ( (otherlv_24= RULE_ID ) ) otherlv_25= 'into' ( (otherlv_26= RULE_ID ) )
                    {
                    // InternalSml.g:1660:4: (otherlv_19= 'if' | otherlv_20= 'If' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==67) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==68) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalSml.g:1661:5: otherlv_19= 'if'
                            {
                            otherlv_19=(Token)match(input,67,FOLLOW_42); 

                            					newLeafNode(otherlv_19, grammarAccess.getConditionAccess().getIfKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSml.g:1666:5: otherlv_20= 'If'
                            {
                            otherlv_20=(Token)match(input,68,FOLLOW_42); 

                            					newLeafNode(otherlv_20, grammarAccess.getConditionAccess().getIfKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,43,FOLLOW_69); 

                    				newLeafNode(otherlv_21, grammarAccess.getConditionAccess().getItKeyword_2_1());
                    			
                    otherlv_22=(Token)match(input,74,FOLLOW_39); 

                    				newLeafNode(otherlv_22, grammarAccess.getConditionAccess().getGoesKeyword_2_2());
                    			
                    otherlv_23=(Token)match(input,40,FOLLOW_17); 

                    				newLeafNode(otherlv_23, grammarAccess.getConditionAccess().getFromKeyword_2_3());
                    			
                    // InternalSml.g:1683:4: ( (otherlv_24= RULE_ID ) )
                    // InternalSml.g:1684:5: (otherlv_24= RULE_ID )
                    {
                    // InternalSml.g:1684:5: (otherlv_24= RULE_ID )
                    // InternalSml.g:1685:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_70); 

                    						newLeafNode(otherlv_24, grammarAccess.getConditionAccess().getRRegionCrossReference_2_4_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,75,FOLLOW_17); 

                    				newLeafNode(otherlv_25, grammarAccess.getConditionAccess().getIntoKeyword_2_5());
                    			
                    // InternalSml.g:1700:4: ( (otherlv_26= RULE_ID ) )
                    // InternalSml.g:1701:5: (otherlv_26= RULE_ID )
                    {
                    // InternalSml.g:1701:5: (otherlv_26= RULE_ID )
                    // InternalSml.g:1702:6: otherlv_26= RULE_ID
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
    // InternalSml.g:1718:1: entryRuleRobot returns [String current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final String entryRuleRobot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRobot = null;


        try {
            // InternalSml.g:1718:45: (iv_ruleRobot= ruleRobot EOF )
            // InternalSml.g:1719:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalSml.g:1725:1: ruleRobot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e-puck' | kw= 'foot-boot' ) ;
    public final AntlrDatatypeRuleToken ruleRobot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1731:2: ( (kw= 'e-puck' | kw= 'foot-boot' ) )
            // InternalSml.g:1732:2: (kw= 'e-puck' | kw= 'foot-boot' )
            {
            // InternalSml.g:1732:2: (kw= 'e-puck' | kw= 'foot-boot' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==76) ) {
                alt25=1;
            }
            else if ( (LA25_0==77) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSml.g:1733:3: kw= 'e-puck'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRobotAccess().getEPuckKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1739:3: kw= 'foot-boot'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

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
    // InternalSml.g:1748:1: entryRuleDistribution returns [String current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final String entryRuleDistribution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDistribution = null;


        try {
            // InternalSml.g:1748:52: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalSml.g:1749:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalSml.g:1755:1: ruleDistribution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' ) ;
    public final AntlrDatatypeRuleToken ruleDistribution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1761:2: ( (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' ) )
            // InternalSml.g:1762:2: (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' )
            {
            // InternalSml.g:1762:2: (kw= 'Uniform' | kw= 'Gaussian' | kw= 'Constant' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt26=1;
                }
                break;
            case 79:
                {
                alt26=2;
                }
                break;
            case 80:
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
                    // InternalSml.g:1763:3: kw= 'Uniform'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getUniformKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1769:3: kw= 'Gaussian'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getGaussianKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1775:3: kw= 'Constant'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

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
    // InternalSml.g:1784:1: entryRuleEnvironmentElements returns [EObject current=null] : iv_ruleEnvironmentElements= ruleEnvironmentElements EOF ;
    public final EObject entryRuleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElements = null;


        try {
            // InternalSml.g:1784:60: (iv_ruleEnvironmentElements= ruleEnvironmentElements EOF )
            // InternalSml.g:1785:2: iv_ruleEnvironmentElements= ruleEnvironmentElements EOF
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
    // InternalSml.g:1791:1: ruleEnvironmentElements returns [EObject current=null] : (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) ;
    public final EObject ruleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentElement_0 = null;

        EObject this_ElementDescription_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1797:2: ( (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) )
            // InternalSml.g:1798:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            {
            // InternalSml.g:1798:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==81||LA27_0==89) ) {
                alt27=1;
            }
            else if ( (LA27_0==82) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSml.g:1799:3: this_EnvironmentElement_0= ruleEnvironmentElement
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
                    // InternalSml.g:1808:3: this_ElementDescription_1= ruleElementDescription
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
    // InternalSml.g:1820:1: entryRuleEnvironmentElement returns [EObject current=null] : iv_ruleEnvironmentElement= ruleEnvironmentElement EOF ;
    public final EObject entryRuleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElement = null;


        try {
            // InternalSml.g:1820:59: (iv_ruleEnvironmentElement= ruleEnvironmentElement EOF )
            // InternalSml.g:1821:2: iv_ruleEnvironmentElement= ruleEnvironmentElement EOF
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
    // InternalSml.g:1827:1: ruleEnvironmentElement returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) ) ;
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
            // InternalSml.g:1833:2: ( (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) ) )
            // InternalSml.g:1834:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) )
            {
            // InternalSml.g:1834:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) )
            int alt28=5;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalSml.g:1835:3: this_Obstacle_0= ruleObstacle
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
                    // InternalSml.g:1844:3: this_Light_1= ruleLight
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
                    // InternalSml.g:1853:3: this_Object_2= ruleObject
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
                    // InternalSml.g:1862:3: this_Patch_3= rulePatch
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
                    // InternalSml.g:1871:3: (otherlv_4= 'A' this_Region_5= ruleRegion )
                    {
                    // InternalSml.g:1871:3: (otherlv_4= 'A' this_Region_5= ruleRegion )
                    // InternalSml.g:1872:4: otherlv_4= 'A' this_Region_5= ruleRegion
                    {
                    otherlv_4=(Token)match(input,81,FOLLOW_71); 

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
    // InternalSml.g:1889:1: entryRuleElementDescription returns [EObject current=null] : iv_ruleElementDescription= ruleElementDescription EOF ;
    public final EObject entryRuleElementDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDescription = null;


        try {
            // InternalSml.g:1889:59: (iv_ruleElementDescription= ruleElementDescription EOF )
            // InternalSml.g:1890:2: iv_ruleElementDescription= ruleElementDescription EOF
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
    // InternalSml.g:1896:1: ruleElementDescription returns [EObject current=null] : ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) ;
    public final EObject ruleElementDescription() throws RecognitionException {
        EObject current = null;

        Token lv_el_0_0=null;
        Token otherlv_1=null;
        EObject lv_x_2_0 = null;

        EObject lv_obj_3_0 = null;

        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1902:2: ( ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:1903:2: ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:1903:2: ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:1904:3: ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) )
            {
            // InternalSml.g:1904:3: ( (lv_el_0_0= 'There' ) )
            // InternalSml.g:1905:4: (lv_el_0_0= 'There' )
            {
            // InternalSml.g:1905:4: (lv_el_0_0= 'There' )
            // InternalSml.g:1906:5: lv_el_0_0= 'There'
            {
            lv_el_0_0=(Token)match(input,82,FOLLOW_65); 

            					newLeafNode(lv_el_0_0, grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementDescriptionRule());
            					}
            					setWithLastConsumed(current, "el", lv_el_0_0, "There");
            				

            }


            }

            otherlv_1=(Token)match(input,71,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getElementDescriptionAccess().getAreKeyword_1());
            		
            // InternalSml.g:1922:3: ( (lv_x_2_0= ruleRange ) )
            // InternalSml.g:1923:4: (lv_x_2_0= ruleRange )
            {
            // InternalSml.g:1923:4: (lv_x_2_0= ruleRange )
            // InternalSml.g:1924:5: lv_x_2_0= ruleRange
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

            // InternalSml.g:1941:3: ( (lv_obj_3_0= ruleElement ) )
            // InternalSml.g:1942:4: (lv_obj_3_0= ruleElement )
            {
            // InternalSml.g:1942:4: (lv_obj_3_0= ruleElement )
            // InternalSml.g:1943:5: lv_obj_3_0= ruleElement
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

            // InternalSml.g:1960:3: ( (lv_r_4_0= ruleProbabilisticDecription ) )
            // InternalSml.g:1961:4: (lv_r_4_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:1961:4: (lv_r_4_0= ruleProbabilisticDecription )
            // InternalSml.g:1962:5: lv_r_4_0= ruleProbabilisticDecription
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
    // InternalSml.g:1983:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSml.g:1983:48: (iv_ruleElement= ruleElement EOF )
            // InternalSml.g:1984:2: iv_ruleElement= ruleElement EOF
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
    // InternalSml.g:1990:1: ruleElement returns [EObject current=null] : ( ( (lv_ob_0_0= ruleEl ) ) otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_ob_0_0 = null;

        EObject lv_d_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1996:2: ( ( ( (lv_ob_0_0= ruleEl ) ) otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) ) )
            // InternalSml.g:1997:2: ( ( (lv_ob_0_0= ruleEl ) ) otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )
            {
            // InternalSml.g:1997:2: ( ( (lv_ob_0_0= ruleEl ) ) otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) ) )
            // InternalSml.g:1998:3: ( (lv_ob_0_0= ruleEl ) ) otherlv_1= 'with' otherlv_2= 'dimensions' otherlv_3= ':' ( (lv_d_4_0= ruleDimension2 ) )
            {
            // InternalSml.g:1998:3: ( (lv_ob_0_0= ruleEl ) )
            // InternalSml.g:1999:4: (lv_ob_0_0= ruleEl )
            {
            // InternalSml.g:1999:4: (lv_ob_0_0= ruleEl )
            // InternalSml.g:2000:5: lv_ob_0_0= ruleEl
            {

            					newCompositeNode(grammarAccess.getElementAccess().getObElParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,19,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,83,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getElementAccess().getDimensionsKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getColonKeyword_3());
            		
            // InternalSml.g:2029:3: ( (lv_d_4_0= ruleDimension2 ) )
            // InternalSml.g:2030:4: (lv_d_4_0= ruleDimension2 )
            {
            // InternalSml.g:2030:4: (lv_d_4_0= ruleDimension2 )
            // InternalSml.g:2031:5: lv_d_4_0= ruleDimension2
            {

            					newCompositeNode(grammarAccess.getElementAccess().getDDimension2ParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalSml.g:2052:1: entryRuleEl returns [String current=null] : iv_ruleEl= ruleEl EOF ;
    public final String entryRuleEl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEl = null;


        try {
            // InternalSml.g:2052:42: (iv_ruleEl= ruleEl EOF )
            // InternalSml.g:2053:2: iv_ruleEl= ruleEl EOF
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
    // InternalSml.g:2059:1: ruleEl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' ) ;
    public final AntlrDatatypeRuleToken ruleEl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2065:2: ( (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' ) )
            // InternalSml.g:2066:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' )
            {
            // InternalSml.g:2066:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) | kw= 'patch' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt29=1;
                }
                break;
            case 85:
                {
                alt29=2;
                }
                break;
            case 86:
                {
                alt29=3;
                }
                break;
            case 88:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSml.g:2067:3: kw= 'objects'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElAccess().getObjectsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2073:3: kw= 'obstacles'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElAccess().getObstaclesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2079:3: (kw= 'light' kw= 'sources' )
                    {
                    // InternalSml.g:2079:3: (kw= 'light' kw= 'sources' )
                    // InternalSml.g:2080:4: kw= 'light' kw= 'sources'
                    {
                    kw=(Token)match(input,86,FOLLOW_75); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElAccess().getLightKeyword_2_0());
                    			
                    kw=(Token)match(input,87,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElAccess().getSourcesKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSml.g:2092:3: kw= 'patch'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

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
    // InternalSml.g:2101:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalSml.g:2101:47: (iv_ruleObject= ruleObject EOF )
            // InternalSml.g:2102:2: iv_ruleObject= ruleObject EOF
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
    // InternalSml.g:2108:1: ruleObject returns [EObject current=null] : ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2114:2: ( ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:2115:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:2115:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:2116:3: ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:2116:3: ( (lv_obj_0_0= 'An' ) )
            // InternalSml.g:2117:4: (lv_obj_0_0= 'An' )
            {
            // InternalSml.g:2117:4: (lv_obj_0_0= 'An' )
            // InternalSml.g:2118:5: lv_obj_0_0= 'An'
            {
            lv_obj_0_0=(Token)match(input,89,FOLLOW_76); 

            					newLeafNode(lv_obj_0_0, grammarAccess.getObjectAccess().getObjAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(current, "obj", lv_obj_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,90,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getAKeyword_3());
            		
            // InternalSml.g:2142:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:2143:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:2143:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:2144:5: lv_r_4_0= ruleRegion
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
    // InternalSml.g:2165:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalSml.g:2165:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalSml.g:2166:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalSml.g:2172:1: ruleObstacle returns [EObject current=null] : ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token lv_obs_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2178:2: ( ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:2179:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:2179:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:2180:3: ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:2180:3: ( (lv_obs_0_0= 'An' ) )
            // InternalSml.g:2181:4: (lv_obs_0_0= 'An' )
            {
            // InternalSml.g:2181:4: (lv_obs_0_0= 'An' )
            // InternalSml.g:2182:5: lv_obs_0_0= 'An'
            {
            lv_obs_0_0=(Token)match(input,89,FOLLOW_77); 

            					newLeafNode(lv_obs_0_0, grammarAccess.getObstacleAccess().getObsAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleRule());
            					}
            					setWithLastConsumed(current, "obs", lv_obs_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,91,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getObstacleKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getAKeyword_3());
            		
            // InternalSml.g:2206:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:2207:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:2207:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:2208:5: lv_r_4_0= ruleRegion
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
    // InternalSml.g:2229:1: entryRulePatch returns [EObject current=null] : iv_rulePatch= rulePatch EOF ;
    public final EObject entryRulePatch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatch = null;


        try {
            // InternalSml.g:2229:46: (iv_rulePatch= rulePatch EOF )
            // InternalSml.g:2230:2: iv_rulePatch= rulePatch EOF
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
    // InternalSml.g:2236:1: rulePatch returns [EObject current=null] : ( ( (lv_pt_0_0= 'A' ) ) ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) ) ;
    public final EObject rulePatch() throws RecognitionException {
        EObject current = null;

        Token lv_pt_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_c_1_0 = null;

        EObject lv_r_5_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2242:2: ( ( ( (lv_pt_0_0= 'A' ) ) ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) ) )
            // InternalSml.g:2243:2: ( ( (lv_pt_0_0= 'A' ) ) ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) )
            {
            // InternalSml.g:2243:2: ( ( (lv_pt_0_0= 'A' ) ) ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) ) )
            // InternalSml.g:2244:3: ( (lv_pt_0_0= 'A' ) ) ( (lv_c_1_0= ruleColor ) ) otherlv_2= 'patch' otherlv_3= 'as' otherlv_4= 'a' ( (lv_r_5_0= ruleRegion ) )
            {
            // InternalSml.g:2244:3: ( (lv_pt_0_0= 'A' ) )
            // InternalSml.g:2245:4: (lv_pt_0_0= 'A' )
            {
            // InternalSml.g:2245:4: (lv_pt_0_0= 'A' )
            // InternalSml.g:2246:5: lv_pt_0_0= 'A'
            {
            lv_pt_0_0=(Token)match(input,81,FOLLOW_78); 

            					newLeafNode(lv_pt_0_0, grammarAccess.getPatchAccess().getPtAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatchRule());
            					}
            					setWithLastConsumed(current, "pt", lv_pt_0_0, "A");
            				

            }


            }

            // InternalSml.g:2258:3: ( (lv_c_1_0= ruleColor ) )
            // InternalSml.g:2259:4: (lv_c_1_0= ruleColor )
            {
            // InternalSml.g:2259:4: (lv_c_1_0= ruleColor )
            // InternalSml.g:2260:5: lv_c_1_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getPatchAccess().getCColorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_79);
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

            otherlv_2=(Token)match(input,88,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getPatchAccess().getPatchKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPatchAccess().getAsKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_71); 

            			newLeafNode(otherlv_4, grammarAccess.getPatchAccess().getAKeyword_4());
            		
            // InternalSml.g:2289:3: ( (lv_r_5_0= ruleRegion ) )
            // InternalSml.g:2290:4: (lv_r_5_0= ruleRegion )
            {
            // InternalSml.g:2290:4: (lv_r_5_0= ruleRegion )
            // InternalSml.g:2291:5: lv_r_5_0= ruleRegion
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
    // InternalSml.g:2312:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalSml.g:2312:46: (iv_ruleLight= ruleLight EOF )
            // InternalSml.g:2313:2: iv_ruleLight= ruleLight EOF
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
    // InternalSml.g:2319:1: ruleLight returns [EObject current=null] : ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'at' ( (lv_p_10_0= rulePosition ) ) ) ;
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
        AntlrDatatypeRuleToken lv_c_5_0 = null;

        EObject lv_p_10_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2325:2: ( ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'at' ( (lv_p_10_0= rulePosition ) ) ) )
            // InternalSml.g:2326:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'at' ( (lv_p_10_0= rulePosition ) ) )
            {
            // InternalSml.g:2326:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'at' ( (lv_p_10_0= rulePosition ) ) )
            // InternalSml.g:2327:3: ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'at' ( (lv_p_10_0= rulePosition ) )
            {
            // InternalSml.g:2327:3: ( (lv_l_0_0= 'A' ) )
            // InternalSml.g:2328:4: (lv_l_0_0= 'A' )
            {
            // InternalSml.g:2328:4: (lv_l_0_0= 'A' )
            // InternalSml.g:2329:5: lv_l_0_0= 'A'
            {
            lv_l_0_0=(Token)match(input,81,FOLLOW_80); 

            					newLeafNode(lv_l_0_0, grammarAccess.getLightAccess().getLAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightRule());
            					}
            					setWithLastConsumed(current, "l", lv_l_0_0, "A");
            				

            }


            }

            otherlv_1=(Token)match(input,86,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
            		
            otherlv_2=(Token)match(input,92,FOLLOW_82); 

            			newLeafNode(otherlv_2, grammarAccess.getLightAccess().getSourceKeyword_2());
            		
            otherlv_3=(Token)match(input,93,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getLightAccess().getEmittingKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_78); 

            			newLeafNode(otherlv_4, grammarAccess.getLightAccess().getAKeyword_4());
            		
            // InternalSml.g:2357:3: ( (lv_c_5_0= ruleColor ) )
            // InternalSml.g:2358:4: (lv_c_5_0= ruleColor )
            {
            // InternalSml.g:2358:4: (lv_c_5_0= ruleColor )
            // InternalSml.g:2359:5: lv_c_5_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getLightAccess().getCColorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_80);
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

            otherlv_6=(Token)match(input,86,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getLightAccess().getLightKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_83); 

            			newLeafNode(otherlv_7, grammarAccess.getLightAccess().getIsKeyword_7());
            		
            otherlv_8=(Token)match(input,94,FOLLOW_84); 

            			newLeafNode(otherlv_8, grammarAccess.getLightAccess().getPlacedKeyword_8());
            		
            otherlv_9=(Token)match(input,95,FOLLOW_85); 

            			newLeafNode(otherlv_9, grammarAccess.getLightAccess().getAtKeyword_9());
            		
            // InternalSml.g:2392:3: ( (lv_p_10_0= rulePosition ) )
            // InternalSml.g:2393:4: (lv_p_10_0= rulePosition )
            {
            // InternalSml.g:2393:4: (lv_p_10_0= rulePosition )
            // InternalSml.g:2394:5: lv_p_10_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getLightAccess().getPPositionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_p_10_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_10_0,
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
    // InternalSml.g:2415:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalSml.g:2415:49: (iv_rulePosition= rulePosition EOF )
            // InternalSml.g:2416:2: iv_rulePosition= rulePosition EOF
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
    // InternalSml.g:2422:1: rulePosition returns [EObject current=null] : ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) ) ;
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
            // InternalSml.g:2428:2: ( ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) ) )
            // InternalSml.g:2429:2: ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) )
            {
            // InternalSml.g:2429:2: ( ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) ) )
            // InternalSml.g:2430:3: ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )? otherlv_3= 'point' ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) )
            {
            // InternalSml.g:2430:3: ( (otherlv_0= 'center' otherlv_1= 'at' ) | otherlv_2= 'reference' )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==96) ) {
                alt30=1;
            }
            else if ( (LA30_0==97) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // InternalSml.g:2431:4: (otherlv_0= 'center' otherlv_1= 'at' )
                    {
                    // InternalSml.g:2431:4: (otherlv_0= 'center' otherlv_1= 'at' )
                    // InternalSml.g:2432:5: otherlv_0= 'center' otherlv_1= 'at'
                    {
                    otherlv_0=(Token)match(input,96,FOLLOW_84); 

                    					newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getCenterKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,95,FOLLOW_86); 

                    					newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getAtKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSml.g:2442:4: otherlv_2= 'reference'
                    {
                    otherlv_2=(Token)match(input,97,FOLLOW_86); 

                    				newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getReferenceKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,98,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getPointKeyword_1());
            		
            // InternalSml.g:2451:3: ( ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) ) )
            // InternalSml.g:2452:4: ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) )
            {
            // InternalSml.g:2452:4: ( (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D ) )
            // InternalSml.g:2453:5: (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D )
            {
            // InternalSml.g:2453:5: (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalSml.g:2454:6: lv_point_4_1= ruleCoordinate2D
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
                    // InternalSml.g:2470:6: lv_point_4_2= ruleCoordinate3D
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
    // InternalSml.g:2492:1: entryRuleShape2D returns [String current=null] : iv_ruleShape2D= ruleShape2D EOF ;
    public final String entryRuleShape2D() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShape2D = null;


        try {
            // InternalSml.g:2492:47: (iv_ruleShape2D= ruleShape2D EOF )
            // InternalSml.g:2493:2: iv_ruleShape2D= ruleShape2D EOF
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
    // InternalSml.g:2499:1: ruleShape2D returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' ) ;
    public final AntlrDatatypeRuleToken ruleShape2D() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2505:2: ( (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' ) )
            // InternalSml.g:2506:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' )
            {
            // InternalSml.g:2506:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' | kw= 'Dodecagon' | kw= 'Hexagon' | kw= 'Square' | kw= 'Region' )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt32=1;
                }
                break;
            case 100:
                {
                alt32=2;
                }
                break;
            case 101:
                {
                alt32=3;
                }
                break;
            case 102:
                {
                alt32=4;
                }
                break;
            case 103:
                {
                alt32=5;
                }
                break;
            case 104:
                {
                alt32=6;
                }
                break;
            case 105:
                {
                alt32=7;
                }
                break;
            case 106:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSml.g:2507:3: kw= 'Circle'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getCircleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2513:3: kw= 'Polygon'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getPolygonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2519:3: kw= 'Triangle'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getTriangleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:2525:3: kw= 'Rectangle'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getRectangleKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSml.g:2531:3: kw= 'Dodecagon'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getDodecagonKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSml.g:2537:3: kw= 'Hexagon'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getHexagonKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSml.g:2543:3: kw= 'Square'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShape2DAccess().getSquareKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSml.g:2549:3: kw= 'Region'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

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
    // InternalSml.g:2558:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalSml.g:2558:46: (iv_ruleArena= ruleArena EOF )
            // InternalSml.g:2559:2: iv_ruleArena= ruleArena EOF
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
    // InternalSml.g:2565:1: ruleArena returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' ) ;
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
            // InternalSml.g:2571:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' ) )
            // InternalSml.g:2572:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' )
            {
            // InternalSml.g:2572:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.' )
            // InternalSml.g:2573:3: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) otherlv_5= 'surrounded' otherlv_6= 'by' otherlv_7= 'walls' otherlv_8= '.'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getArenaKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getArenaAccess().getAKeyword_3());
            		
            // InternalSml.g:2589:3: ( (lv_s_4_0= ruleRegion ) )
            // InternalSml.g:2590:4: (lv_s_4_0= ruleRegion )
            {
            // InternalSml.g:2590:4: (lv_s_4_0= ruleRegion )
            // InternalSml.g:2591:5: lv_s_4_0= ruleRegion
            {

            					newCompositeNode(grammarAccess.getArenaAccess().getSRegionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_87);
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

            otherlv_5=(Token)match(input,107,FOLLOW_88); 

            			newLeafNode(otherlv_5, grammarAccess.getArenaAccess().getSurroundedKeyword_5());
            		
            otherlv_6=(Token)match(input,108,FOLLOW_89); 

            			newLeafNode(otherlv_6, grammarAccess.getArenaAccess().getByKeyword_6());
            		
            otherlv_7=(Token)match(input,109,FOLLOW_90); 

            			newLeafNode(otherlv_7, grammarAccess.getArenaAccess().getWallsKeyword_7());
            		
            otherlv_8=(Token)match(input,110,FOLLOW_2); 

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
    // InternalSml.g:2628:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalSml.g:2628:45: (iv_ruleColor= ruleColor EOF )
            // InternalSml.g:2629:2: iv_ruleColor= ruleColor EOF
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
    // InternalSml.g:2635:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:2641:2: ( (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' ) )
            // InternalSml.g:2642:2: (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' )
            {
            // InternalSml.g:2642:2: (kw= 'red' | kw= 'yellow' | kw= 'green' | kw= 'gray' | kw= 'black' | kw= 'white' )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt33=1;
                }
                break;
            case 112:
                {
                alt33=2;
                }
                break;
            case 113:
                {
                alt33=3;
                }
                break;
            case 114:
                {
                alt33=4;
                }
                break;
            case 115:
                {
                alt33=5;
                }
                break;
            case 116:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSml.g:2643:3: kw= 'red'
                    {
                    kw=(Token)match(input,111,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2649:3: kw= 'yellow'
                    {
                    kw=(Token)match(input,112,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2655:3: kw= 'green'
                    {
                    kw=(Token)match(input,113,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getGreenKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:2661:3: kw= 'gray'
                    {
                    kw=(Token)match(input,114,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getGrayKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSml.g:2667:3: kw= 'black'
                    {
                    kw=(Token)match(input,115,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getBlackKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSml.g:2673:3: kw= 'white'
                    {
                    kw=(Token)match(input,116,FOLLOW_2); 

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
    // InternalSml.g:2682:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSml.g:2682:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalSml.g:2683:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalSml.g:2689:1: ruleRegion returns [EObject current=null] : ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_colors_0_0 = null;

        AntlrDatatypeRuleToken lv_shape2d_1_0 = null;

        EObject lv_region_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2695:2: ( ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) ) )
            // InternalSml.g:2696:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) )
            {
            // InternalSml.g:2696:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) ) )
            // InternalSml.g:2697:3: ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape2d_1_0= ruleShape2D ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_region_3_0= ruleRegionDefinition ) )
            {
            // InternalSml.g:2697:3: ( (lv_colors_0_0= ruleColor ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=111 && LA34_0<=116)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSml.g:2698:4: (lv_colors_0_0= ruleColor )
                    {
                    // InternalSml.g:2698:4: (lv_colors_0_0= ruleColor )
                    // InternalSml.g:2699:5: lv_colors_0_0= ruleColor
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

            // InternalSml.g:2716:3: ( (lv_shape2d_1_0= ruleShape2D ) )
            // InternalSml.g:2717:4: (lv_shape2d_1_0= ruleShape2D )
            {
            // InternalSml.g:2717:4: (lv_shape2d_1_0= ruleShape2D )
            // InternalSml.g:2718:5: lv_shape2d_1_0= ruleShape2D
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getShape2dShape2DParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalSml.g:2735:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSml.g:2736:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSml.g:2736:4: (lv_name_2_0= RULE_ID )
            // InternalSml.g:2737:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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

            // InternalSml.g:2753:3: ( (lv_region_3_0= ruleRegionDefinition ) )
            // InternalSml.g:2754:4: (lv_region_3_0= ruleRegionDefinition )
            {
            // InternalSml.g:2754:4: (lv_region_3_0= ruleRegionDefinition )
            // InternalSml.g:2755:5: lv_region_3_0= ruleRegionDefinition
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
    // InternalSml.g:2776:1: entryRuleRegionDefinition returns [EObject current=null] : iv_ruleRegionDefinition= ruleRegionDefinition EOF ;
    public final EObject entryRuleRegionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionDefinition = null;


        try {
            // InternalSml.g:2776:57: (iv_ruleRegionDefinition= ruleRegionDefinition EOF )
            // InternalSml.g:2777:2: iv_ruleRegionDefinition= ruleRegionDefinition EOF
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
    // InternalSml.g:2783:1: ruleRegionDefinition returns [EObject current=null] : (this_DefinitionOne_0= ruleDefinitionOne | this_DefinitionTwo_1= ruleDefinitionTwo | this_DefinitionThree_2= ruleDefinitionThree ) ;
    public final EObject ruleRegionDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionOne_0 = null;

        EObject this_DefinitionTwo_1 = null;

        EObject this_DefinitionThree_2 = null;



        	enterRule();

        try {
            // InternalSml.g:2789:2: ( (this_DefinitionOne_0= ruleDefinitionOne | this_DefinitionTwo_1= ruleDefinitionTwo | this_DefinitionThree_2= ruleDefinitionThree ) )
            // InternalSml.g:2790:2: (this_DefinitionOne_0= ruleDefinitionOne | this_DefinitionTwo_1= ruleDefinitionTwo | this_DefinitionThree_2= ruleDefinitionThree )
            {
            // InternalSml.g:2790:2: (this_DefinitionOne_0= ruleDefinitionOne | this_DefinitionTwo_1= ruleDefinitionTwo | this_DefinitionThree_2= ruleDefinitionThree )
            int alt35=3;
            switch ( input.LA(1) ) {
            case EOF:
            case 11:
            case 19:
            case 41:
            case 81:
            case 82:
            case 89:
            case 107:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 120:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSml.g:2791:3: this_DefinitionOne_0= ruleDefinitionOne
                    {

                    			newCompositeNode(grammarAccess.getRegionDefinitionAccess().getDefinitionOneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinitionOne_0=ruleDefinitionOne();

                    state._fsp--;


                    			current = this_DefinitionOne_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:2800:3: this_DefinitionTwo_1= ruleDefinitionTwo
                    {

                    			newCompositeNode(grammarAccess.getRegionDefinitionAccess().getDefinitionTwoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinitionTwo_1=ruleDefinitionTwo();

                    state._fsp--;


                    			current = this_DefinitionTwo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:2809:3: this_DefinitionThree_2= ruleDefinitionThree
                    {

                    			newCompositeNode(grammarAccess.getRegionDefinitionAccess().getDefinitionThreeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinitionThree_2=ruleDefinitionThree();

                    state._fsp--;


                    			current = this_DefinitionThree_2;
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


    // $ANTLR start "entryRuleDefinitionOne"
    // InternalSml.g:2821:1: entryRuleDefinitionOne returns [EObject current=null] : iv_ruleDefinitionOne= ruleDefinitionOne EOF ;
    public final EObject entryRuleDefinitionOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionOne = null;


        try {
            // InternalSml.g:2821:54: (iv_ruleDefinitionOne= ruleDefinitionOne EOF )
            // InternalSml.g:2822:2: iv_ruleDefinitionOne= ruleDefinitionOne EOF
            {
             newCompositeNode(grammarAccess.getDefinitionOneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionOne=ruleDefinitionOne();

            state._fsp--;

             current =iv_ruleDefinitionOne; 
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
    // $ANTLR end "entryRuleDefinitionOne"


    // $ANTLR start "ruleDefinitionOne"
    // InternalSml.g:2828:1: ruleDefinitionOne returns [EObject current=null] : ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? ) ;
    public final EObject ruleDefinitionOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_referencepoint_1_0 = null;

        EObject lv_dimensions_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2834:2: ( ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? ) )
            // InternalSml.g:2835:2: ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? )
            {
            // InternalSml.g:2835:2: ( (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )? )
            // InternalSml.g:2836:3: (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )? (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )?
            {
            // InternalSml.g:2836:3: (otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSml.g:2837:4: otherlv_0= 'with' ( (lv_referencepoint_1_0= rulePosition ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_85); 

                    				newLeafNode(otherlv_0, grammarAccess.getDefinitionOneAccess().getWithKeyword_0_0());
                    			
                    // InternalSml.g:2841:4: ( (lv_referencepoint_1_0= rulePosition ) )
                    // InternalSml.g:2842:5: (lv_referencepoint_1_0= rulePosition )
                    {
                    // InternalSml.g:2842:5: (lv_referencepoint_1_0= rulePosition )
                    // InternalSml.g:2843:6: lv_referencepoint_1_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getDefinitionOneAccess().getReferencepointPositionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_referencepoint_1_0=rulePosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionOneRule());
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

            // InternalSml.g:2861:3: (otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSml.g:2862:4: otherlv_2= 'and' ( (lv_dimensions_3_0= ruleDimension ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_93); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefinitionOneAccess().getAndKeyword_1_0());
                    			
                    // InternalSml.g:2866:4: ( (lv_dimensions_3_0= ruleDimension ) )
                    // InternalSml.g:2867:5: (lv_dimensions_3_0= ruleDimension )
                    {
                    // InternalSml.g:2867:5: (lv_dimensions_3_0= ruleDimension )
                    // InternalSml.g:2868:6: lv_dimensions_3_0= ruleDimension
                    {

                    						newCompositeNode(grammarAccess.getDefinitionOneAccess().getDimensionsDimensionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dimensions_3_0=ruleDimension();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionOneRule());
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
    // $ANTLR end "ruleDefinitionOne"


    // $ANTLR start "entryRuleDefinitionTwo"
    // InternalSml.g:2890:1: entryRuleDefinitionTwo returns [EObject current=null] : iv_ruleDefinitionTwo= ruleDefinitionTwo EOF ;
    public final EObject entryRuleDefinitionTwo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionTwo = null;


        try {
            // InternalSml.g:2890:54: (iv_ruleDefinitionTwo= ruleDefinitionTwo EOF )
            // InternalSml.g:2891:2: iv_ruleDefinitionTwo= ruleDefinitionTwo EOF
            {
             newCompositeNode(grammarAccess.getDefinitionTwoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionTwo=ruleDefinitionTwo();

            state._fsp--;

             current =iv_ruleDefinitionTwo; 
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
    // $ANTLR end "entryRuleDefinitionTwo"


    // $ANTLR start "ruleDefinitionTwo"
    // InternalSml.g:2897:1: ruleDefinitionTwo returns [EObject current=null] : (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* ) ;
    public final EObject ruleDefinitionTwo() throws RecognitionException {
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
            // InternalSml.g:2903:2: ( (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* ) )
            // InternalSml.g:2904:2: (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* )
            {
            // InternalSml.g:2904:2: (otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )* )
            // InternalSml.g:2905:3: otherlv_0= 'defined' otherlv_1= 'through' otherlv_2= 'the' otherlv_3= 'following' otherlv_4= 'Vertices' otherlv_5= ':' ( (lv_point_6_0= rulePosition ) ) (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )*
            {
            otherlv_0=(Token)match(input,50,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionTwoAccess().getDefinedKeyword_0());
            		
            otherlv_1=(Token)match(input,117,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionTwoAccess().getThroughKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionTwoAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_95); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionTwoAccess().getFollowingKeyword_3());
            		
            otherlv_4=(Token)match(input,118,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinitionTwoAccess().getVerticesKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_85); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionTwoAccess().getColonKeyword_5());
            		
            // InternalSml.g:2929:3: ( (lv_point_6_0= rulePosition ) )
            // InternalSml.g:2930:4: (lv_point_6_0= rulePosition )
            {
            // InternalSml.g:2930:4: (lv_point_6_0= rulePosition )
            // InternalSml.g:2931:5: lv_point_6_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getDefinitionTwoAccess().getPointPositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_96);
            lv_point_6_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionTwoRule());
            					}
            					add(
            						current,
            						"point",
            						lv_point_6_0,
            						"org.xtext.example.sml.Sml.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSml.g:2948:3: (otherlv_7= ';' ( (lv_point_8_0= rulePosition ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==119) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSml.g:2949:4: otherlv_7= ';' ( (lv_point_8_0= rulePosition ) )
            	    {
            	    otherlv_7=(Token)match(input,119,FOLLOW_85); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDefinitionTwoAccess().getSemicolonKeyword_7_0());
            	    			
            	    // InternalSml.g:2953:4: ( (lv_point_8_0= rulePosition ) )
            	    // InternalSml.g:2954:5: (lv_point_8_0= rulePosition )
            	    {
            	    // InternalSml.g:2954:5: (lv_point_8_0= rulePosition )
            	    // InternalSml.g:2955:6: lv_point_8_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getDefinitionTwoAccess().getPointPositionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_96);
            	    lv_point_8_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinitionTwoRule());
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
            	    break loop38;
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
    // $ANTLR end "ruleDefinitionTwo"


    // $ANTLR start "entryRuleDefinitionThree"
    // InternalSml.g:2977:1: entryRuleDefinitionThree returns [EObject current=null] : iv_ruleDefinitionThree= ruleDefinitionThree EOF ;
    public final EObject entryRuleDefinitionThree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionThree = null;


        try {
            // InternalSml.g:2977:56: (iv_ruleDefinitionThree= ruleDefinitionThree EOF )
            // InternalSml.g:2978:2: iv_ruleDefinitionThree= ruleDefinitionThree EOF
            {
             newCompositeNode(grammarAccess.getDefinitionThreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionThree=ruleDefinitionThree();

            state._fsp--;

             current =iv_ruleDefinitionThree; 
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
    // $ANTLR end "entryRuleDefinitionThree"


    // $ANTLR start "ruleDefinitionThree"
    // InternalSml.g:2984:1: ruleDefinitionThree returns [EObject current=null] : (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) ) ;
    public final EObject ruleDefinitionThree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_ax_1_0 = null;

        EObject lv_r_3_0 = null;



        	enterRule();

        try {
            // InternalSml.g:2990:2: ( (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) ) )
            // InternalSml.g:2991:2: (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) )
            {
            // InternalSml.g:2991:2: (otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) ) )
            // InternalSml.g:2992:3: otherlv_0= 'where' ( (lv_ax_1_0= ruleAxis ) ) otherlv_2= 'is' ( (lv_r_3_0= ruleRange ) )
            {
            otherlv_0=(Token)match(input,120,FOLLOW_97); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionThreeAccess().getWhereKeyword_0());
            		
            // InternalSml.g:2996:3: ( (lv_ax_1_0= ruleAxis ) )
            // InternalSml.g:2997:4: (lv_ax_1_0= ruleAxis )
            {
            // InternalSml.g:2997:4: (lv_ax_1_0= ruleAxis )
            // InternalSml.g:2998:5: lv_ax_1_0= ruleAxis
            {

            					newCompositeNode(grammarAccess.getDefinitionThreeAccess().getAxAxisParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_ax_1_0=ruleAxis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionThreeRule());
            					}
            					set(
            						current,
            						"ax",
            						lv_ax_1_0,
            						"org.xtext.example.sml.Sml.Axis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionThreeAccess().getIsKeyword_2());
            		
            // InternalSml.g:3019:3: ( (lv_r_3_0= ruleRange ) )
            // InternalSml.g:3020:4: (lv_r_3_0= ruleRange )
            {
            // InternalSml.g:3020:4: (lv_r_3_0= ruleRange )
            // InternalSml.g:3021:5: lv_r_3_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getDefinitionThreeAccess().getRRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_r_3_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionThreeRule());
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
    // $ANTLR end "ruleDefinitionThree"


    // $ANTLR start "entryRuleAxis"
    // InternalSml.g:3042:1: entryRuleAxis returns [String current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final String entryRuleAxis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAxis = null;


        try {
            // InternalSml.g:3042:44: (iv_ruleAxis= ruleAxis EOF )
            // InternalSml.g:3043:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalSml.g:3049:1: ruleAxis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'x' | kw= 'y' ) ;
    public final AntlrDatatypeRuleToken ruleAxis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:3055:2: ( (kw= 'x' | kw= 'y' ) )
            // InternalSml.g:3056:2: (kw= 'x' | kw= 'y' )
            {
            // InternalSml.g:3056:2: (kw= 'x' | kw= 'y' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==121) ) {
                alt39=1;
            }
            else if ( (LA39_0==122) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSml.g:3057:3: kw= 'x'
                    {
                    kw=(Token)match(input,121,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAxisAccess().getXKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:3063:3: kw= 'y'
                    {
                    kw=(Token)match(input,122,FOLLOW_2); 

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
    // InternalSml.g:3072:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalSml.g:3072:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalSml.g:3073:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalSml.g:3079:1: ruleDimension returns [EObject current=null] : (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        EObject this_Dimension1_0 = null;

        EObject this_Dimension2_1 = null;

        EObject this_Dimension3_2 = null;



        	enterRule();

        try {
            // InternalSml.g:3085:2: ( (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 ) )
            // InternalSml.g:3086:2: (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 )
            {
            // InternalSml.g:3086:2: (this_Dimension1_0= ruleDimension1 | this_Dimension2_1= ruleDimension2 | this_Dimension3_2= ruleDimension3 )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 123:
                {
                alt40=1;
                }
                break;
            case 125:
                {
                alt40=2;
                }
                break;
            case 127:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSml.g:3087:3: this_Dimension1_0= ruleDimension1
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
                    // InternalSml.g:3096:3: this_Dimension2_1= ruleDimension2
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
                    // InternalSml.g:3105:3: this_Dimension3_2= ruleDimension3
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
    // InternalSml.g:3117:1: entryRuleDimension1 returns [EObject current=null] : iv_ruleDimension1= ruleDimension1 EOF ;
    public final EObject entryRuleDimension1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension1 = null;


        try {
            // InternalSml.g:3117:51: (iv_ruleDimension1= ruleDimension1 EOF )
            // InternalSml.g:3118:2: iv_ruleDimension1= ruleDimension1 EOF
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
    // InternalSml.g:3124:1: ruleDimension1 returns [EObject current=null] : (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? ) ;
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
            // InternalSml.g:3130:2: ( (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? ) )
            // InternalSml.g:3131:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? )
            {
            // InternalSml.g:3131:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )? )
            // InternalSml.g:3132:3: otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ( (lv_m1_2_0= ruleMetric ) ) (otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )?
            {
            otherlv_0=(Token)match(input,123,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getDimension1Access().getRadiusKeyword_0());
            		
            // InternalSml.g:3136:3: ( (lv_r_1_0= ruleDouble ) )
            // InternalSml.g:3137:4: (lv_r_1_0= ruleDouble )
            {
            // InternalSml.g:3137:4: (lv_r_1_0= ruleDouble )
            // InternalSml.g:3138:5: lv_r_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension1Access().getRDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSml.g:3155:3: ( (lv_m1_2_0= ruleMetric ) )
            // InternalSml.g:3156:4: (lv_m1_2_0= ruleMetric )
            {
            // InternalSml.g:3156:4: (lv_m1_2_0= ruleMetric )
            // InternalSml.g:3157:5: lv_m1_2_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension1Access().getM1MetricParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_92);
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

            // InternalSml.g:3174:3: (otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSml.g:3175:4: otherlv_3= 'and' otherlv_4= 'height' ( (lv_h_5_0= ruleDouble ) ) ( (lv_m2_6_0= ruleMetric ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_98); 

                    				newLeafNode(otherlv_3, grammarAccess.getDimension1Access().getAndKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,124,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getDimension1Access().getHeightKeyword_3_1());
                    			
                    // InternalSml.g:3183:4: ( (lv_h_5_0= ruleDouble ) )
                    // InternalSml.g:3184:5: (lv_h_5_0= ruleDouble )
                    {
                    // InternalSml.g:3184:5: (lv_h_5_0= ruleDouble )
                    // InternalSml.g:3185:6: lv_h_5_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDimension1Access().getHDoubleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalSml.g:3202:4: ( (lv_m2_6_0= ruleMetric ) )
                    // InternalSml.g:3203:5: (lv_m2_6_0= ruleMetric )
                    {
                    // InternalSml.g:3203:5: (lv_m2_6_0= ruleMetric )
                    // InternalSml.g:3204:6: lv_m2_6_0= ruleMetric
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
    // InternalSml.g:3226:1: entryRuleDimension2 returns [EObject current=null] : iv_ruleDimension2= ruleDimension2 EOF ;
    public final EObject entryRuleDimension2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension2 = null;


        try {
            // InternalSml.g:3226:51: (iv_ruleDimension2= ruleDimension2 EOF )
            // InternalSml.g:3227:2: iv_ruleDimension2= ruleDimension2 EOF
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
    // InternalSml.g:3233:1: ruleDimension2 returns [EObject current=null] : (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? ) ;
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
            // InternalSml.g:3239:2: ( (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? ) )
            // InternalSml.g:3240:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? )
            {
            // InternalSml.g:3240:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )? )
            // InternalSml.g:3241:3: otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) ( (lv_m3_2_0= ruleMetric ) ) otherlv_3= ',width' ( (lv_w_4_0= ruleDouble ) ) ( (lv_m4_5_0= ruleMetric ) ) (otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )?
            {
            otherlv_0=(Token)match(input,125,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getDimension2Access().getLengthKeyword_0());
            		
            // InternalSml.g:3245:3: ( (lv_l_1_0= ruleDouble ) )
            // InternalSml.g:3246:4: (lv_l_1_0= ruleDouble )
            {
            // InternalSml.g:3246:4: (lv_l_1_0= ruleDouble )
            // InternalSml.g:3247:5: lv_l_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getLDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSml.g:3264:3: ( (lv_m3_2_0= ruleMetric ) )
            // InternalSml.g:3265:4: (lv_m3_2_0= ruleMetric )
            {
            // InternalSml.g:3265:4: (lv_m3_2_0= ruleMetric )
            // InternalSml.g:3266:5: lv_m3_2_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getM3MetricParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_99);
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

            otherlv_3=(Token)match(input,126,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getDimension2Access().getWidthKeyword_3());
            		
            // InternalSml.g:3287:3: ( (lv_w_4_0= ruleDouble ) )
            // InternalSml.g:3288:4: (lv_w_4_0= ruleDouble )
            {
            // InternalSml.g:3288:4: (lv_w_4_0= ruleDouble )
            // InternalSml.g:3289:5: lv_w_4_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getWDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSml.g:3306:3: ( (lv_m4_5_0= ruleMetric ) )
            // InternalSml.g:3307:4: (lv_m4_5_0= ruleMetric )
            {
            // InternalSml.g:3307:4: (lv_m4_5_0= ruleMetric )
            // InternalSml.g:3308:5: lv_m4_5_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getDimension2Access().getM4MetricParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_92);
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

            // InternalSml.g:3325:3: (otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSml.g:3326:4: otherlv_6= 'and' otherlv_7= 'height' ( (lv_h_8_0= ruleDouble ) ) ( (lv_m5_9_0= ruleMetric ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_98); 

                    				newLeafNode(otherlv_6, grammarAccess.getDimension2Access().getAndKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,124,FOLLOW_60); 

                    				newLeafNode(otherlv_7, grammarAccess.getDimension2Access().getHeightKeyword_6_1());
                    			
                    // InternalSml.g:3334:4: ( (lv_h_8_0= ruleDouble ) )
                    // InternalSml.g:3335:5: (lv_h_8_0= ruleDouble )
                    {
                    // InternalSml.g:3335:5: (lv_h_8_0= ruleDouble )
                    // InternalSml.g:3336:6: lv_h_8_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDimension2Access().getHDoubleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalSml.g:3353:4: ( (lv_m5_9_0= ruleMetric ) )
                    // InternalSml.g:3354:5: (lv_m5_9_0= ruleMetric )
                    {
                    // InternalSml.g:3354:5: (lv_m5_9_0= ruleMetric )
                    // InternalSml.g:3355:6: lv_m5_9_0= ruleMetric
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
    // InternalSml.g:3377:1: entryRuleDimension3 returns [EObject current=null] : iv_ruleDimension3= ruleDimension3 EOF ;
    public final EObject entryRuleDimension3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension3 = null;


        try {
            // InternalSml.g:3377:51: (iv_ruleDimension3= ruleDimension3 EOF )
            // InternalSml.g:3378:2: iv_ruleDimension3= ruleDimension3 EOF
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
    // InternalSml.g:3384:1: ruleDimension3 returns [EObject current=null] : (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) ) ;
    public final EObject ruleDimension3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_s_1_0 = null;

        AntlrDatatypeRuleToken lv_m6_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3390:2: ( (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) ) )
            // InternalSml.g:3391:2: (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) )
            {
            // InternalSml.g:3391:2: (otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) ) )
            // InternalSml.g:3392:3: otherlv_0= 'side' ( (lv_s_1_0= ruleDouble ) ) ( (lv_m6_2_0= ruleMetric ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getDimension3Access().getSideKeyword_0());
            		
            // InternalSml.g:3396:3: ( (lv_s_1_0= ruleDouble ) )
            // InternalSml.g:3397:4: (lv_s_1_0= ruleDouble )
            {
            // InternalSml.g:3397:4: (lv_s_1_0= ruleDouble )
            // InternalSml.g:3398:5: lv_s_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDimension3Access().getSDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSml.g:3415:3: ( (lv_m6_2_0= ruleMetric ) )
            // InternalSml.g:3416:4: (lv_m6_2_0= ruleMetric )
            {
            // InternalSml.g:3416:4: (lv_m6_2_0= ruleMetric )
            // InternalSml.g:3417:5: lv_m6_2_0= ruleMetric
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
    // InternalSml.g:3438:1: entryRuleCoordinate2D returns [EObject current=null] : iv_ruleCoordinate2D= ruleCoordinate2D EOF ;
    public final EObject entryRuleCoordinate2D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate2D = null;


        try {
            // InternalSml.g:3438:53: (iv_ruleCoordinate2D= ruleCoordinate2D EOF )
            // InternalSml.g:3439:2: iv_ruleCoordinate2D= ruleCoordinate2D EOF
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
    // InternalSml.g:3445:1: ruleCoordinate2D returns [EObject current=null] : ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) ) ;
    public final EObject ruleCoordinate2D() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3451:2: ( ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3452:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3452:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) )
            // InternalSml.g:3453:3: ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) )
            {
            // InternalSml.g:3453:3: ( (lv_x_0_0= ruleDouble ) )
            // InternalSml.g:3454:4: (lv_x_0_0= ruleDouble )
            {
            // InternalSml.g:3454:4: (lv_x_0_0= ruleDouble )
            // InternalSml.g:3455:5: lv_x_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate2DAccess().getXDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_100);
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

            otherlv_1=(Token)match(input,35,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinate2DAccess().getCommaKeyword_1());
            		
            // InternalSml.g:3476:3: ( (lv_y_2_0= ruleDouble ) )
            // InternalSml.g:3477:4: (lv_y_2_0= ruleDouble )
            {
            // InternalSml.g:3477:4: (lv_y_2_0= ruleDouble )
            // InternalSml.g:3478:5: lv_y_2_0= ruleDouble
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
    // InternalSml.g:3499:1: entryRuleCoordinate3D returns [EObject current=null] : iv_ruleCoordinate3D= ruleCoordinate3D EOF ;
    public final EObject entryRuleCoordinate3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate3D = null;


        try {
            // InternalSml.g:3499:53: (iv_ruleCoordinate3D= ruleCoordinate3D EOF )
            // InternalSml.g:3500:2: iv_ruleCoordinate3D= ruleCoordinate3D EOF
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
    // InternalSml.g:3506:1: ruleCoordinate3D returns [EObject current=null] : ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) ) ;
    public final EObject ruleCoordinate3D() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_2_0 = null;

        AntlrDatatypeRuleToken lv_z_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3512:2: ( ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) ) )
            // InternalSml.g:3513:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) )
            {
            // InternalSml.g:3513:2: ( ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) ) )
            // InternalSml.g:3514:3: ( (lv_x_0_0= ruleDouble ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDouble ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDouble ) )
            {
            // InternalSml.g:3514:3: ( (lv_x_0_0= ruleDouble ) )
            // InternalSml.g:3515:4: (lv_x_0_0= ruleDouble )
            {
            // InternalSml.g:3515:4: (lv_x_0_0= ruleDouble )
            // InternalSml.g:3516:5: lv_x_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate3DAccess().getXDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_100);
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

            otherlv_1=(Token)match(input,35,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getCoordinate3DAccess().getCommaKeyword_1());
            		
            // InternalSml.g:3537:3: ( (lv_y_2_0= ruleDouble ) )
            // InternalSml.g:3538:4: (lv_y_2_0= ruleDouble )
            {
            // InternalSml.g:3538:4: (lv_y_2_0= ruleDouble )
            // InternalSml.g:3539:5: lv_y_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinate3DAccess().getYDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_100);
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

            otherlv_3=(Token)match(input,35,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getCoordinate3DAccess().getCommaKeyword_3());
            		
            // InternalSml.g:3560:3: ( (lv_z_4_0= ruleDouble ) )
            // InternalSml.g:3561:4: (lv_z_4_0= ruleDouble )
            {
            // InternalSml.g:3561:4: (lv_z_4_0= ruleDouble )
            // InternalSml.g:3562:5: lv_z_4_0= ruleDouble
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
    // InternalSml.g:3583:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalSml.g:3583:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalSml.g:3584:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalSml.g:3590:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSml.g:3596:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalSml.g:3597:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalSml.g:3597:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalSml.g:3598:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalSml.g:3598:3: (kw= '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==128) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSml.g:3599:4: kw= '-'
                    {
                    kw=(Token)match(input,128,FOLLOW_68); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_101); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1());
            		
            // InternalSml.g:3612:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==110) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSml.g:3613:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,110,FOLLOW_68); 

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
    // InternalSml.g:3630:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalSml.g:3630:46: (iv_ruleRange= ruleRange EOF )
            // InternalSml.g:3631:2: iv_ruleRange= ruleRange EOF
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
    // InternalSml.g:3637:1: ruleRange returns [EObject current=null] : (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) ;
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
            // InternalSml.g:3643:2: ( (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) )
            // InternalSml.g:3644:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            {
            // InternalSml.g:3644:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            int alt45=6;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalSml.g:3645:3: this_Upperbound_0= ruleUpperbound
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
                    // InternalSml.g:3654:3: this_Lowerbound_1= ruleLowerbound
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
                    // InternalSml.g:3663:3: this_Interval_2= ruleInterval
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
                    // InternalSml.g:3672:3: this_LowerorEqualbound_3= ruleLowerorEqualbound
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
                    // InternalSml.g:3681:3: this_UpperorEqualbound_4= ruleUpperorEqualbound
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
                    // InternalSml.g:3690:3: this_ConstantSize_5= ruleConstantSize
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
    // InternalSml.g:3702:1: entryRuleConstantSize returns [EObject current=null] : iv_ruleConstantSize= ruleConstantSize EOF ;
    public final EObject entryRuleConstantSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSize = null;


        try {
            // InternalSml.g:3702:53: (iv_ruleConstantSize= ruleConstantSize EOF )
            // InternalSml.g:3703:2: iv_ruleConstantSize= ruleConstantSize EOF
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
    // InternalSml.g:3709:1: ruleConstantSize returns [EObject current=null] : ( (lv_n_0_0= ruleDouble ) ) ;
    public final EObject ruleConstantSize() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_n_0_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3715:2: ( ( (lv_n_0_0= ruleDouble ) ) )
            // InternalSml.g:3716:2: ( (lv_n_0_0= ruleDouble ) )
            {
            // InternalSml.g:3716:2: ( (lv_n_0_0= ruleDouble ) )
            // InternalSml.g:3717:3: (lv_n_0_0= ruleDouble )
            {
            // InternalSml.g:3717:3: (lv_n_0_0= ruleDouble )
            // InternalSml.g:3718:4: lv_n_0_0= ruleDouble
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
    // InternalSml.g:3738:1: entryRuleLowerbound returns [EObject current=null] : iv_ruleLowerbound= ruleLowerbound EOF ;
    public final EObject entryRuleLowerbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerbound = null;


        try {
            // InternalSml.g:3738:51: (iv_ruleLowerbound= ruleLowerbound EOF )
            // InternalSml.g:3739:2: iv_ruleLowerbound= ruleLowerbound EOF
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
    // InternalSml.g:3745:1: ruleLowerbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) ;
    public final EObject ruleLowerbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_n_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3751:2: ( (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3752:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3752:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            // InternalSml.g:3753:3: otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,129,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:3761:3: ( (lv_n_2_0= ruleDouble ) )
            // InternalSml.g:3762:4: (lv_n_2_0= ruleDouble )
            {
            // InternalSml.g:3762:4: (lv_n_2_0= ruleDouble )
            // InternalSml.g:3763:5: lv_n_2_0= ruleDouble
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
    // InternalSml.g:3784:1: entryRuleLowerorEqualbound returns [EObject current=null] : iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF ;
    public final EObject entryRuleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerorEqualbound = null;


        try {
            // InternalSml.g:3784:58: (iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF )
            // InternalSml.g:3785:2: iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF
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
    // InternalSml.g:3791:1: ruleLowerorEqualbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) ;
    public final EObject ruleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_n_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3797:2: ( (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) )
            // InternalSml.g:3798:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            {
            // InternalSml.g:3798:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            // InternalSml.g:3799:3: otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,129,FOLLOW_102); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerorEqualboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,130,FOLLOW_103); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,131,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getLowerorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,73,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getLowerorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:3815:3: ( (lv_n_4_0= ruleDouble ) )
            // InternalSml.g:3816:4: (lv_n_4_0= ruleDouble )
            {
            // InternalSml.g:3816:4: (lv_n_4_0= ruleDouble )
            // InternalSml.g:3817:5: lv_n_4_0= ruleDouble
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
    // InternalSml.g:3838:1: entryRuleUpperbound returns [EObject current=null] : iv_ruleUpperbound= ruleUpperbound EOF ;
    public final EObject entryRuleUpperbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperbound = null;


        try {
            // InternalSml.g:3838:51: (iv_ruleUpperbound= ruleUpperbound EOF )
            // InternalSml.g:3839:2: iv_ruleUpperbound= ruleUpperbound EOF
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
    // InternalSml.g:3845:1: ruleUpperbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) ;
    public final EObject ruleUpperbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_n_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3851:2: ( (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3852:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3852:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) ) )
            // InternalSml.g:3853:3: otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:3861:3: ( (lv_n_2_0= ruleDouble ) )
            // InternalSml.g:3862:4: (lv_n_2_0= ruleDouble )
            {
            // InternalSml.g:3862:4: (lv_n_2_0= ruleDouble )
            // InternalSml.g:3863:5: lv_n_2_0= ruleDouble
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
    // InternalSml.g:3884:1: entryRuleUpperorEqualbound returns [EObject current=null] : iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF ;
    public final EObject entryRuleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperorEqualbound = null;


        try {
            // InternalSml.g:3884:58: (iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF )
            // InternalSml.g:3885:2: iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF
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
    // InternalSml.g:3891:1: ruleUpperorEqualbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) ;
    public final EObject ruleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_n_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3897:2: ( (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) ) )
            // InternalSml.g:3898:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            {
            // InternalSml.g:3898:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) ) )
            // InternalSml.g:3899:3: otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_102); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperorEqualboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,130,FOLLOW_103); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,131,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getUpperorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,73,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getUpperorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:3915:3: ( (lv_n_4_0= ruleDouble ) )
            // InternalSml.g:3916:4: (lv_n_4_0= ruleDouble )
            {
            // InternalSml.g:3916:4: (lv_n_4_0= ruleDouble )
            // InternalSml.g:3917:5: lv_n_4_0= ruleDouble
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
    // InternalSml.g:3938:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSml.g:3938:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSml.g:3939:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalSml.g:3945:1: ruleInterval returns [EObject current=null] : ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_n_0_0 = null;

        AntlrDatatypeRuleToken lv_m_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:3951:2: ( ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) ) )
            // InternalSml.g:3952:2: ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) )
            {
            // InternalSml.g:3952:2: ( ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) ) )
            // InternalSml.g:3953:3: ( (lv_n_0_0= ruleDouble ) ) otherlv_1= 'to' ( (lv_m_2_0= ruleDouble ) )
            {
            // InternalSml.g:3953:3: ( (lv_n_0_0= ruleDouble ) )
            // InternalSml.g:3954:4: (lv_n_0_0= ruleDouble )
            {
            // InternalSml.g:3954:4: (lv_n_0_0= ruleDouble )
            // InternalSml.g:3955:5: lv_n_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getNDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_1=(Token)match(input,32,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getToKeyword_1());
            		
            // InternalSml.g:3976:3: ( (lv_m_2_0= ruleDouble ) )
            // InternalSml.g:3977:4: (lv_m_2_0= ruleDouble )
            {
            // InternalSml.g:3977:4: (lv_m_2_0= ruleDouble )
            // InternalSml.g:3978:5: lv_m_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getMDoubleParserRuleCall_2_0());
            				
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\4\uffff\1\6\3\uffff\1\6";
    static final String dfa_3s = "\1\41\1\42\1\uffff\1\4\1\13\1\4\2\uffff\1\13";
    static final String dfa_4s = "\1\46\1\42\1\uffff\1\4\1\44\1\4\2\uffff\1\44";
    static final String dfa_5s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\6\27\uffff\1\5\1\7",
            "\1\10",
            "",
            "",
            "\1\6\27\uffff\1\5\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "635:2: (this_Aggregate_0= ruleAggregate | this_Migration_1= ruleMigration | this_Foraging_2= ruleForaging )";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\121\1\132\1\126\2\uffff\6\130\3\uffff";
    static final String dfa_10s = "\1\131\1\133\1\164\2\uffff\6\152\3\uffff";
    static final String dfa_11s = "\3\uffff\1\3\1\1\6\uffff\1\2\1\5\1\4";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\7\uffff\1\1",
            "\1\3\1\4",
            "\1\13\14\uffff\10\14\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "",
            "\1\15\12\uffff\10\14",
            "\1\15\12\uffff\10\14",
            "\1\15\12\uffff\10\14",
            "\1\15\12\uffff\10\14",
            "\1\15\12\uffff\10\14",
            "\1\15\12\uffff\10\14",
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
            return "1834:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject | this_Patch_3= rulePatch | (otherlv_4= 'A' this_Region_5= ruleRegion ) )";
        }
    }
    static final String dfa_14s = "\14\uffff";
    static final String dfa_15s = "\7\uffff\1\12\3\uffff\1\12";
    static final String dfa_16s = "\2\5\1\43\2\5\1\43\1\5\1\13\1\5\2\uffff\1\13";
    static final String dfa_17s = "\1\u0080\1\5\1\156\1\5\1\u0080\1\43\1\5\1\167\1\5\2\uffff\1\167";
    static final String dfa_18s = "\11\uffff\1\2\1\1\1\uffff";
    static final String dfa_19s = "\14\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\172\uffff\1\1",
            "\1\2",
            "\1\4\112\uffff\1\3",
            "\1\5",
            "\1\7\172\uffff\1\6",
            "\1\4",
            "\1\7",
            "\1\12\27\uffff\1\11\5\uffff\1\12\47\uffff\2\12\6\uffff\1\12\21\uffff\1\12\2\uffff\1\10\10\uffff\1\12",
            "\1\13",
            "",
            "",
            "\1\12\27\uffff\1\11\5\uffff\1\12\47\uffff\2\12\6\uffff\1\12\21\uffff\1\12\13\uffff\1\12"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2453:5: (lv_point_4_1= ruleCoordinate2D | lv_point_4_2= ruleCoordinate3D )";
        }
    }
    static final String dfa_21s = "\15\uffff";
    static final String dfa_22s = "\4\uffff\1\12\7\uffff\1\12";
    static final String dfa_23s = "\1\5\2\111\1\5\1\13\4\uffff\1\5\2\uffff\1\13";
    static final String dfa_24s = "\1\u0081\2\u0082\1\5\1\156\4\uffff\1\5\2\uffff\1\153";
    static final String dfa_25s = "\5\uffff\1\1\1\5\1\4\1\2\1\uffff\1\6\1\3\1\uffff";
    static final String dfa_26s = "\15\uffff}>";
    static final String[] dfa_27s = {
            "\1\4\102\uffff\1\1\67\uffff\1\3\1\2",
            "\1\5\70\uffff\1\6",
            "\1\10\70\uffff\1\7",
            "\1\4",
            "\1\12\24\uffff\1\13\14\uffff\3\12\34\uffff\2\12\3\uffff\2\12\1\uffff\3\12\1\uffff\2\12\21\uffff\1\12\2\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "",
            "\1\12\24\uffff\1\13\14\uffff\3\12\34\uffff\2\12\3\uffff\2\12\1\uffff\3\12\1\uffff\2\12\21\uffff\1\12"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "3644:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L,0x0000000002060000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000002L,0x0000000002060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L,0x0000000000000003L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x001F87F800000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000001700000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x001F800000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0004020000080000L,0x0100000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0xA800000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});

}