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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'arena'", "'contains'", "'the'", "'following'", "'elements'", "':'", "'distributed'", "'with'", "'a'", "'distribution'", "'in'", "'robot'", "'swarm'", "'consists'", "'of'", "'e-puck'", "'foot-boot'", "'uniform'", "'gaussian'", "'constant'", "'There'", "'are'", "'objects'", "'obstacles'", "'light'", "'sources'", "'An'", "'object'", "'as'", "'obstacle'", "'A'", "'source'", "'emitting'", "'is'", "'placed'", "'center'", "'reference point'", "'point'", "'Circle'", "'Polygon'", "'Triangle'", "'Rectangle'", "'red'", "'yellow'", "'green'", "'and'", "'radius'", "'length'", "',width'", "'height'", "'.'", "'less'", "'than'", "'or'", "'equal'", "'more'", "'between'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    // InternalSml.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_arenas_0_0 = null;

        EObject lv_env_1_0 = null;

        EObject lv_sw_2_0 = null;



        	enterRule();

        try {
            // InternalSml.g:77:2: ( ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) ) )
            // InternalSml.g:78:2: ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) )
            {
            // InternalSml.g:78:2: ( ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) ) )
            // InternalSml.g:79:3: ( (lv_arenas_0_0= ruleArena ) ) ( (lv_env_1_0= ruleEnvironment ) ) ( (lv_sw_2_0= ruleSwarmconf ) )
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
            				
            pushFollow(FOLLOW_2);
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


            }


            }


            	leaveRule();

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
    // InternalSml.g:140:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalSml.g:140:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalSml.g:141:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalSml.g:147:1: ruleEnvironment returns [EObject current=null] : ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* ) ;
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
            // InternalSml.g:153:2: ( ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* ) )
            // InternalSml.g:154:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* )
            {
            // InternalSml.g:154:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )* )
            // InternalSml.g:155:3: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )? ( (lv_environment_7_0= ruleEnvironmentElements ) )*
            {
            // InternalSml.g:155:3: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':' )?
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
                    // InternalSml.g:156:4: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'contains' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'elements' otherlv_6= ':'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getTheKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getArenaKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getContainsKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getTheKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getFollowingKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getElementsKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getColonKeyword_0_6());
                    			

                    }
                    break;

            }

            // InternalSml.g:185:3: ( (lv_environment_7_0= ruleEnvironmentElements ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32||LA2_0==38||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSml.g:186:4: (lv_environment_7_0= ruleEnvironmentElements )
            	    {
            	    // InternalSml.g:186:4: (lv_environment_7_0= ruleEnvironmentElements )
            	    // InternalSml.g:187:5: lv_environment_7_0= ruleEnvironmentElements
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentElementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalSml.g:208:1: entryRuleProbabilisticDecription returns [EObject current=null] : iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF ;
    public final EObject entryRuleProbabilisticDecription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilisticDecription = null;


        try {
            // InternalSml.g:208:64: (iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF )
            // InternalSml.g:209:2: iv_ruleProbabilisticDecription= ruleProbabilisticDecription EOF
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
    // InternalSml.g:215:1: ruleProbabilisticDecription returns [EObject current=null] : (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) ) ;
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
            // InternalSml.g:221:2: ( (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) ) )
            // InternalSml.g:222:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) )
            {
            // InternalSml.g:222:2: (otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) ) )
            // InternalSml.g:223:3: otherlv_0= 'distributed' otherlv_1= 'with' otherlv_2= 'a' ( (lv_dis_3_0= ruleDistribution ) ) otherlv_4= 'distribution' otherlv_5= 'in' otherlv_6= 'a' ( (lv_k_7_0= ruleRegion ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getProbabilisticDecriptionAccess().getDistributedKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getProbabilisticDecriptionAccess().getWithKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_2());
            		
            // InternalSml.g:235:3: ( (lv_dis_3_0= ruleDistribution ) )
            // InternalSml.g:236:4: (lv_dis_3_0= ruleDistribution )
            {
            // InternalSml.g:236:4: (lv_dis_3_0= ruleDistribution )
            // InternalSml.g:237:5: lv_dis_3_0= ruleDistribution
            {

            					newCompositeNode(grammarAccess.getProbabilisticDecriptionAccess().getDisDistributionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getProbabilisticDecriptionAccess().getDistributionKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getProbabilisticDecriptionAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getProbabilisticDecriptionAccess().getAKeyword_6());
            		
            // InternalSml.g:266:3: ( (lv_k_7_0= ruleRegion ) )
            // InternalSml.g:267:4: (lv_k_7_0= ruleRegion )
            {
            // InternalSml.g:267:4: (lv_k_7_0= ruleRegion )
            // InternalSml.g:268:5: lv_k_7_0= ruleRegion
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
    // InternalSml.g:289:1: entryRuleSwarmconf returns [EObject current=null] : iv_ruleSwarmconf= ruleSwarmconf EOF ;
    public final EObject entryRuleSwarmconf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwarmconf = null;


        try {
            // InternalSml.g:289:50: (iv_ruleSwarmconf= ruleSwarmconf EOF )
            // InternalSml.g:290:2: iv_ruleSwarmconf= ruleSwarmconf EOF
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
    // InternalSml.g:296:1: ruleSwarmconf returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) ;
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
            // InternalSml.g:302:2: ( (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:303:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:303:2: (otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:304:3: otherlv_0= 'The' otherlv_1= 'robot' otherlv_2= 'swarm' otherlv_3= 'consists' otherlv_4= 'of' ( (lv_x_5_0= ruleRange ) ) ( (lv_r_6_0= ruleRobot ) ) ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSwarmconfAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSwarmconfAccess().getRobotKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSwarmconfAccess().getSwarmKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSwarmconfAccess().getConsistsKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getSwarmconfAccess().getOfKeyword_4());
            		
            // InternalSml.g:324:3: ( (lv_x_5_0= ruleRange ) )
            // InternalSml.g:325:4: (lv_x_5_0= ruleRange )
            {
            // InternalSml.g:325:4: (lv_x_5_0= ruleRange )
            // InternalSml.g:326:5: lv_x_5_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getXRangeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalSml.g:343:3: ( (lv_r_6_0= ruleRobot ) )
            // InternalSml.g:344:4: (lv_r_6_0= ruleRobot )
            {
            // InternalSml.g:344:4: (lv_r_6_0= ruleRobot )
            // InternalSml.g:345:5: lv_r_6_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getSwarmconfAccess().getRRobotParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSml.g:362:3: ( (lv_pr_7_0= ruleProbabilisticDecription ) )
            // InternalSml.g:363:4: (lv_pr_7_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:363:4: (lv_pr_7_0= ruleProbabilisticDecription )
            // InternalSml.g:364:5: lv_pr_7_0= ruleProbabilisticDecription
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


    // $ANTLR start "entryRuleRobot"
    // InternalSml.g:385:1: entryRuleRobot returns [String current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final String entryRuleRobot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRobot = null;


        try {
            // InternalSml.g:385:45: (iv_ruleRobot= ruleRobot EOF )
            // InternalSml.g:386:2: iv_ruleRobot= ruleRobot EOF
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
    // InternalSml.g:392:1: ruleRobot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e-puck' | kw= 'foot-boot' ) ;
    public final AntlrDatatypeRuleToken ruleRobot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:398:2: ( (kw= 'e-puck' | kw= 'foot-boot' ) )
            // InternalSml.g:399:2: (kw= 'e-puck' | kw= 'foot-boot' )
            {
            // InternalSml.g:399:2: (kw= 'e-puck' | kw= 'foot-boot' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSml.g:400:3: kw= 'e-puck'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRobotAccess().getEPuckKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:406:3: kw= 'foot-boot'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSml.g:415:1: entryRuleDistribution returns [String current=null] : iv_ruleDistribution= ruleDistribution EOF ;
    public final String entryRuleDistribution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDistribution = null;


        try {
            // InternalSml.g:415:52: (iv_ruleDistribution= ruleDistribution EOF )
            // InternalSml.g:416:2: iv_ruleDistribution= ruleDistribution EOF
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
    // InternalSml.g:422:1: ruleDistribution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' ) ;
    public final AntlrDatatypeRuleToken ruleDistribution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:428:2: ( (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' ) )
            // InternalSml.g:429:2: (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' )
            {
            // InternalSml.g:429:2: (kw= 'uniform' | kw= 'gaussian' | kw= 'constant' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSml.g:430:3: kw= 'uniform'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getUniformKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:436:3: kw= 'gaussian'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistributionAccess().getGaussianKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:442:3: kw= 'constant'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

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
    // InternalSml.g:451:1: entryRuleEnvironmentElements returns [EObject current=null] : iv_ruleEnvironmentElements= ruleEnvironmentElements EOF ;
    public final EObject entryRuleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElements = null;


        try {
            // InternalSml.g:451:60: (iv_ruleEnvironmentElements= ruleEnvironmentElements EOF )
            // InternalSml.g:452:2: iv_ruleEnvironmentElements= ruleEnvironmentElements EOF
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
    // InternalSml.g:458:1: ruleEnvironmentElements returns [EObject current=null] : (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) ;
    public final EObject ruleEnvironmentElements() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentElement_0 = null;

        EObject this_ElementDescription_1 = null;



        	enterRule();

        try {
            // InternalSml.g:464:2: ( (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription ) )
            // InternalSml.g:465:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            {
            // InternalSml.g:465:2: (this_EnvironmentElement_0= ruleEnvironmentElement | this_ElementDescription_1= ruleElementDescription )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38||LA5_0==42) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSml.g:466:3: this_EnvironmentElement_0= ruleEnvironmentElement
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
                    // InternalSml.g:475:3: this_ElementDescription_1= ruleElementDescription
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
    // InternalSml.g:487:1: entryRuleEnvironmentElement returns [EObject current=null] : iv_ruleEnvironmentElement= ruleEnvironmentElement EOF ;
    public final EObject entryRuleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentElement = null;


        try {
            // InternalSml.g:487:59: (iv_ruleEnvironmentElement= ruleEnvironmentElement EOF )
            // InternalSml.g:488:2: iv_ruleEnvironmentElement= ruleEnvironmentElement EOF
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
    // InternalSml.g:494:1: ruleEnvironmentElement returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject ) ;
    public final EObject ruleEnvironmentElement() throws RecognitionException {
        EObject current = null;

        EObject this_Obstacle_0 = null;

        EObject this_Light_1 = null;

        EObject this_Object_2 = null;



        	enterRule();

        try {
            // InternalSml.g:500:2: ( (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject ) )
            // InternalSml.g:501:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject )
            {
            // InternalSml.g:501:2: (this_Obstacle_0= ruleObstacle | this_Light_1= ruleLight | this_Object_2= ruleObject )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==41) ) {
                    alt6=1;
                }
                else if ( (LA6_1==39) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==42) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSml.g:502:3: this_Obstacle_0= ruleObstacle
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
                    // InternalSml.g:511:3: this_Light_1= ruleLight
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
                    // InternalSml.g:520:3: this_Object_2= ruleObject
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
    // InternalSml.g:532:1: entryRuleElementDescription returns [EObject current=null] : iv_ruleElementDescription= ruleElementDescription EOF ;
    public final EObject entryRuleElementDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDescription = null;


        try {
            // InternalSml.g:532:59: (iv_ruleElementDescription= ruleElementDescription EOF )
            // InternalSml.g:533:2: iv_ruleElementDescription= ruleElementDescription EOF
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
    // InternalSml.g:539:1: ruleElementDescription returns [EObject current=null] : ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) ;
    public final EObject ruleElementDescription() throws RecognitionException {
        EObject current = null;

        Token lv_el_0_0=null;
        Token otherlv_1=null;
        EObject lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_obj_3_0 = null;

        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:545:2: ( ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) ) )
            // InternalSml.g:546:2: ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            {
            // InternalSml.g:546:2: ( ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) ) )
            // InternalSml.g:547:3: ( (lv_el_0_0= 'There' ) ) otherlv_1= 'are' ( (lv_x_2_0= ruleRange ) ) ( (lv_obj_3_0= ruleElement ) ) ( (lv_r_4_0= ruleProbabilisticDecription ) )
            {
            // InternalSml.g:547:3: ( (lv_el_0_0= 'There' ) )
            // InternalSml.g:548:4: (lv_el_0_0= 'There' )
            {
            // InternalSml.g:548:4: (lv_el_0_0= 'There' )
            // InternalSml.g:549:5: lv_el_0_0= 'There'
            {
            lv_el_0_0=(Token)match(input,32,FOLLOW_24); 

            					newLeafNode(lv_el_0_0, grammarAccess.getElementDescriptionAccess().getElThereKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementDescriptionRule());
            					}
            					setWithLastConsumed(current, "el", lv_el_0_0, "There");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getElementDescriptionAccess().getAreKeyword_1());
            		
            // InternalSml.g:565:3: ( (lv_x_2_0= ruleRange ) )
            // InternalSml.g:566:4: (lv_x_2_0= ruleRange )
            {
            // InternalSml.g:566:4: (lv_x_2_0= ruleRange )
            // InternalSml.g:567:5: lv_x_2_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getXRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSml.g:584:3: ( (lv_obj_3_0= ruleElement ) )
            // InternalSml.g:585:4: (lv_obj_3_0= ruleElement )
            {
            // InternalSml.g:585:4: (lv_obj_3_0= ruleElement )
            // InternalSml.g:586:5: lv_obj_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getElementDescriptionAccess().getObjElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalSml.g:603:3: ( (lv_r_4_0= ruleProbabilisticDecription ) )
            // InternalSml.g:604:4: (lv_r_4_0= ruleProbabilisticDecription )
            {
            // InternalSml.g:604:4: (lv_r_4_0= ruleProbabilisticDecription )
            // InternalSml.g:605:5: lv_r_4_0= ruleProbabilisticDecription
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
    // InternalSml.g:626:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalSml.g:626:47: (iv_ruleElement= ruleElement EOF )
            // InternalSml.g:627:2: iv_ruleElement= ruleElement EOF
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
    // InternalSml.g:633:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:639:2: ( (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) ) )
            // InternalSml.g:640:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) )
            {
            // InternalSml.g:640:2: (kw= 'objects' | kw= 'obstacles' | (kw= 'light' kw= 'sources' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSml.g:641:3: kw= 'objects'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getObjectsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:647:3: kw= 'obstacles'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getElementAccess().getObstaclesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:653:3: (kw= 'light' kw= 'sources' )
                    {
                    // InternalSml.g:653:3: (kw= 'light' kw= 'sources' )
                    // InternalSml.g:654:4: kw= 'light' kw= 'sources'
                    {
                    kw=(Token)match(input,36,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getElementAccess().getLightKeyword_2_0());
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalSml.g:669:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalSml.g:669:47: (iv_ruleObject= ruleObject EOF )
            // InternalSml.g:670:2: iv_ruleObject= ruleObject EOF
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
    // InternalSml.g:676:1: ruleObject returns [EObject current=null] : ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:682:2: ( ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:683:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:683:2: ( ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:684:3: ( (lv_obj_0_0= 'An' ) ) otherlv_1= 'object' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:684:3: ( (lv_obj_0_0= 'An' ) )
            // InternalSml.g:685:4: (lv_obj_0_0= 'An' )
            {
            // InternalSml.g:685:4: (lv_obj_0_0= 'An' )
            // InternalSml.g:686:5: lv_obj_0_0= 'An'
            {
            lv_obj_0_0=(Token)match(input,38,FOLLOW_27); 

            					newLeafNode(lv_obj_0_0, grammarAccess.getObjectAccess().getObjAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(current, "obj", lv_obj_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getAKeyword_3());
            		
            // InternalSml.g:710:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:711:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:711:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:712:5: lv_r_4_0= ruleRegion
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
    // InternalSml.g:733:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalSml.g:733:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalSml.g:734:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalSml.g:740:1: ruleObstacle returns [EObject current=null] : ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token lv_obs_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_r_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:746:2: ( ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) ) )
            // InternalSml.g:747:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:747:2: ( ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) ) )
            // InternalSml.g:748:3: ( (lv_obs_0_0= 'An' ) ) otherlv_1= 'obstacle' otherlv_2= 'as' otherlv_3= 'a' ( (lv_r_4_0= ruleRegion ) )
            {
            // InternalSml.g:748:3: ( (lv_obs_0_0= 'An' ) )
            // InternalSml.g:749:4: (lv_obs_0_0= 'An' )
            {
            // InternalSml.g:749:4: (lv_obs_0_0= 'An' )
            // InternalSml.g:750:5: lv_obs_0_0= 'An'
            {
            lv_obs_0_0=(Token)match(input,38,FOLLOW_29); 

            					newLeafNode(lv_obs_0_0, grammarAccess.getObstacleAccess().getObsAnKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObstacleRule());
            					}
            					setWithLastConsumed(current, "obs", lv_obs_0_0, "An");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getObstacleKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getAKeyword_3());
            		
            // InternalSml.g:774:3: ( (lv_r_4_0= ruleRegion ) )
            // InternalSml.g:775:4: (lv_r_4_0= ruleRegion )
            {
            // InternalSml.g:775:4: (lv_r_4_0= ruleRegion )
            // InternalSml.g:776:5: lv_r_4_0= ruleRegion
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
    // InternalSml.g:797:1: entryRuleLight returns [EObject current=null] : iv_ruleLight= ruleLight EOF ;
    public final EObject entryRuleLight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLight = null;


        try {
            // InternalSml.g:797:46: (iv_ruleLight= ruleLight EOF )
            // InternalSml.g:798:2: iv_ruleLight= ruleLight EOF
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
    // InternalSml.g:804:1: ruleLight returns [EObject current=null] : ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) ) ;
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
            // InternalSml.g:810:2: ( ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) ) )
            // InternalSml.g:811:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) )
            {
            // InternalSml.g:811:2: ( ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) ) )
            // InternalSml.g:812:3: ( (lv_l_0_0= 'A' ) ) otherlv_1= 'light' otherlv_2= 'source' otherlv_3= 'emitting' otherlv_4= 'a' ( (lv_c_5_0= ruleColor ) ) otherlv_6= 'light' otherlv_7= 'is' otherlv_8= 'placed' otherlv_9= 'in' otherlv_10= 'a' ( (lv_p_11_0= rulePosition ) )
            {
            // InternalSml.g:812:3: ( (lv_l_0_0= 'A' ) )
            // InternalSml.g:813:4: (lv_l_0_0= 'A' )
            {
            // InternalSml.g:813:4: (lv_l_0_0= 'A' )
            // InternalSml.g:814:5: lv_l_0_0= 'A'
            {
            lv_l_0_0=(Token)match(input,42,FOLLOW_30); 

            					newLeafNode(lv_l_0_0, grammarAccess.getLightAccess().getLAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightRule());
            					}
            					setWithLastConsumed(current, "l", lv_l_0_0, "A");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLightAccess().getLightKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getLightAccess().getSourceKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLightAccess().getEmittingKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getLightAccess().getAKeyword_4());
            		
            // InternalSml.g:842:3: ( (lv_c_5_0= ruleColor ) )
            // InternalSml.g:843:4: (lv_c_5_0= ruleColor )
            {
            // InternalSml.g:843:4: (lv_c_5_0= ruleColor )
            // InternalSml.g:844:5: lv_c_5_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getLightAccess().getCColorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_6=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getLightAccess().getLightKeyword_6());
            		
            otherlv_7=(Token)match(input,45,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getLightAccess().getIsKeyword_7());
            		
            otherlv_8=(Token)match(input,46,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getLightAccess().getPlacedKeyword_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getLightAccess().getInKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_36); 

            			newLeafNode(otherlv_10, grammarAccess.getLightAccess().getAKeyword_10());
            		
            // InternalSml.g:881:3: ( (lv_p_11_0= rulePosition ) )
            // InternalSml.g:882:4: (lv_p_11_0= rulePosition )
            {
            // InternalSml.g:882:4: (lv_p_11_0= rulePosition )
            // InternalSml.g:883:5: lv_p_11_0= rulePosition
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
    // InternalSml.g:904:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalSml.g:904:49: (iv_rulePosition= rulePosition EOF )
            // InternalSml.g:905:2: iv_rulePosition= rulePosition EOF
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
    // InternalSml.g:911:1: rulePosition returns [EObject current=null] : ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) ) ;
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
            // InternalSml.g:917:2: ( ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) ) )
            // InternalSml.g:918:2: ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) )
            {
            // InternalSml.g:918:2: ( ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) ) | ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) ) | ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt8=1;
                }
                break;
            case 48:
                {
                alt8=2;
                }
                break;
            case 49:
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
                    // InternalSml.g:919:3: ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) )
                    {
                    // InternalSml.g:919:3: ( () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) ) )
                    // InternalSml.g:920:4: () otherlv_1= 'center' ( (lv_point_2_0= ruleCoordinate ) )
                    {
                    // InternalSml.g:920:4: ()
                    // InternalSml.g:921:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPositionAccess().getCircleAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getCenterKeyword_0_1());
                    			
                    // InternalSml.g:931:4: ( (lv_point_2_0= ruleCoordinate ) )
                    // InternalSml.g:932:5: (lv_point_2_0= ruleCoordinate )
                    {
                    // InternalSml.g:932:5: (lv_point_2_0= ruleCoordinate )
                    // InternalSml.g:933:6: lv_point_2_0= ruleCoordinate
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
                    // InternalSml.g:952:3: ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) )
                    {
                    // InternalSml.g:952:3: ( () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) ) )
                    // InternalSml.g:953:4: () otherlv_4= 'reference point' ( (lv_point_5_0= ruleCoordinate ) )
                    {
                    // InternalSml.g:953:4: ()
                    // InternalSml.g:954:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPositionAccess().getRectangleAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getPositionAccess().getReferencePointKeyword_1_1());
                    			
                    // InternalSml.g:964:4: ( (lv_point_5_0= ruleCoordinate ) )
                    // InternalSml.g:965:5: (lv_point_5_0= ruleCoordinate )
                    {
                    // InternalSml.g:965:5: (lv_point_5_0= ruleCoordinate )
                    // InternalSml.g:966:6: lv_point_5_0= ruleCoordinate
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
                    // InternalSml.g:985:3: ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) )
                    {
                    // InternalSml.g:985:3: ( () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) ) )
                    // InternalSml.g:986:4: () otherlv_7= 'point' ( (lv_point_8_0= ruleCoordinate ) )
                    {
                    // InternalSml.g:986:4: ()
                    // InternalSml.g:987:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPositionAccess().getPointDAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,49,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getPositionAccess().getPointKeyword_2_1());
                    			
                    // InternalSml.g:997:4: ( (lv_point_8_0= ruleCoordinate ) )
                    // InternalSml.g:998:5: (lv_point_8_0= ruleCoordinate )
                    {
                    // InternalSml.g:998:5: (lv_point_8_0= ruleCoordinate )
                    // InternalSml.g:999:6: lv_point_8_0= ruleCoordinate
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
    // InternalSml.g:1021:1: entryRuleShape returns [String current=null] : iv_ruleShape= ruleShape EOF ;
    public final String entryRuleShape() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShape = null;


        try {
            // InternalSml.g:1021:45: (iv_ruleShape= ruleShape EOF )
            // InternalSml.g:1022:2: iv_ruleShape= ruleShape EOF
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
    // InternalSml.g:1028:1: ruleShape returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' ) ;
    public final AntlrDatatypeRuleToken ruleShape() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1034:2: ( (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' ) )
            // InternalSml.g:1035:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' )
            {
            // InternalSml.g:1035:2: (kw= 'Circle' | kw= 'Polygon' | kw= 'Triangle' | kw= 'Rectangle' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt9=1;
                }
                break;
            case 51:
                {
                alt9=2;
                }
                break;
            case 52:
                {
                alt9=3;
                }
                break;
            case 53:
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
                    // InternalSml.g:1036:3: kw= 'Circle'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getCircleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1042:3: kw= 'Polygon'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getPolygonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1048:3: kw= 'Triangle'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getShapeAccess().getTriangleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSml.g:1054:3: kw= 'Rectangle'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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
    // InternalSml.g:1063:1: entryRuleArena returns [EObject current=null] : iv_ruleArena= ruleArena EOF ;
    public final EObject entryRuleArena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArena = null;


        try {
            // InternalSml.g:1063:46: (iv_ruleArena= ruleArena EOF )
            // InternalSml.g:1064:2: iv_ruleArena= ruleArena EOF
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
    // InternalSml.g:1070:1: ruleArena returns [EObject current=null] : (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) ) ;
    public final EObject ruleArena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_s_4_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1076:2: ( (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) ) )
            // InternalSml.g:1077:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) )
            {
            // InternalSml.g:1077:2: (otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) ) )
            // InternalSml.g:1078:3: otherlv_0= 'The' otherlv_1= 'arena' otherlv_2= 'is' otherlv_3= 'a' ( (lv_s_4_0= ruleRegion ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArenaAccess().getTheKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getArenaAccess().getArenaKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getArenaAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getArenaAccess().getAKeyword_3());
            		
            // InternalSml.g:1094:3: ( (lv_s_4_0= ruleRegion ) )
            // InternalSml.g:1095:4: (lv_s_4_0= ruleRegion )
            {
            // InternalSml.g:1095:4: (lv_s_4_0= ruleRegion )
            // InternalSml.g:1096:5: lv_s_4_0= ruleRegion
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
    // InternalSml.g:1117:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalSml.g:1117:45: (iv_ruleColor= ruleColor EOF )
            // InternalSml.g:1118:2: iv_ruleColor= ruleColor EOF
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
    // InternalSml.g:1124:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'red' | kw= 'yellow' | kw= 'green' ) ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSml.g:1130:2: ( (kw= 'red' | kw= 'yellow' | kw= 'green' ) )
            // InternalSml.g:1131:2: (kw= 'red' | kw= 'yellow' | kw= 'green' )
            {
            // InternalSml.g:1131:2: (kw= 'red' | kw= 'yellow' | kw= 'green' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt10=1;
                }
                break;
            case 55:
                {
                alt10=2;
                }
                break;
            case 56:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSml.g:1132:3: kw= 'red'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getRedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSml.g:1138:3: kw= 'yellow'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getColorAccess().getYellowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSml.g:1144:3: kw= 'green'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

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
    // InternalSml.g:1153:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSml.g:1153:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalSml.g:1154:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalSml.g:1160:1: ruleRegion returns [EObject current=null] : ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? ) ;
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
            // InternalSml.g:1166:2: ( ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? ) )
            // InternalSml.g:1167:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? )
            {
            // InternalSml.g:1167:2: ( ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )? )
            // InternalSml.g:1168:3: ( (lv_colors_0_0= ruleColor ) )? ( (lv_shape_1_0= ruleShape ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )? (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )?
            {
            // InternalSml.g:1168:3: ( (lv_colors_0_0= ruleColor ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=54 && LA11_0<=56)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSml.g:1169:4: (lv_colors_0_0= ruleColor )
                    {
                    // InternalSml.g:1169:4: (lv_colors_0_0= ruleColor )
                    // InternalSml.g:1170:5: lv_colors_0_0= ruleColor
                    {

                    					newCompositeNode(grammarAccess.getRegionAccess().getColorsColorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_38);
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

            // InternalSml.g:1187:3: ( (lv_shape_1_0= ruleShape ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=50 && LA12_0<=53)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSml.g:1188:4: (lv_shape_1_0= ruleShape )
                    {
                    // InternalSml.g:1188:4: (lv_shape_1_0= ruleShape )
                    // InternalSml.g:1189:5: lv_shape_1_0= ruleShape
                    {

                    					newCompositeNode(grammarAccess.getRegionAccess().getShapeShapeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_39);
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

            // InternalSml.g:1206:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSml.g:1207:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSml.g:1207:4: (lv_name_2_0= RULE_ID )
            // InternalSml.g:1208:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_40); 

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

            // InternalSml.g:1224:3: (otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSml.g:1225:4: otherlv_3= 'with' ( (lv_referencepoint_4_0= rulePosition ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getWithKeyword_3_0());
                    			
                    // InternalSml.g:1229:4: ( (lv_referencepoint_4_0= rulePosition ) )
                    // InternalSml.g:1230:5: (lv_referencepoint_4_0= rulePosition )
                    {
                    // InternalSml.g:1230:5: (lv_referencepoint_4_0= rulePosition )
                    // InternalSml.g:1231:6: lv_referencepoint_4_0= rulePosition
                    {

                    						newCompositeNode(grammarAccess.getRegionAccess().getReferencepointPositionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalSml.g:1249:3: (otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSml.g:1250:4: otherlv_5= 'and' ( (lv_dimensions_6_0= ruleDimension ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegionAccess().getAndKeyword_4_0());
                    			
                    // InternalSml.g:1254:4: ( (lv_dimensions_6_0= ruleDimension ) )
                    // InternalSml.g:1255:5: (lv_dimensions_6_0= ruleDimension )
                    {
                    // InternalSml.g:1255:5: (lv_dimensions_6_0= ruleDimension )
                    // InternalSml.g:1256:6: lv_dimensions_6_0= ruleDimension
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
    // InternalSml.g:1278:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalSml.g:1278:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalSml.g:1279:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalSml.g:1285:1: ruleDimension returns [EObject current=null] : (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        EObject this_CircleD_0 = null;

        EObject this_RectangleD_1 = null;



        	enterRule();

        try {
            // InternalSml.g:1291:2: ( (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD ) )
            // InternalSml.g:1292:2: (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD )
            {
            // InternalSml.g:1292:2: (this_CircleD_0= ruleCircleD | this_RectangleD_1= ruleRectangleD )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==58) ) {
                alt15=1;
            }
            else if ( (LA15_0==59) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSml.g:1293:3: this_CircleD_0= ruleCircleD
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
                    // InternalSml.g:1302:3: this_RectangleD_1= ruleRectangleD
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
    // InternalSml.g:1314:1: entryRuleCircleD returns [EObject current=null] : iv_ruleCircleD= ruleCircleD EOF ;
    public final EObject entryRuleCircleD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircleD = null;


        try {
            // InternalSml.g:1314:48: (iv_ruleCircleD= ruleCircleD EOF )
            // InternalSml.g:1315:2: iv_ruleCircleD= ruleCircleD EOF
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
    // InternalSml.g:1321:1: ruleCircleD returns [EObject current=null] : (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ) ;
    public final EObject ruleCircleD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_r_1_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1327:2: ( (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) ) )
            // InternalSml.g:1328:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) )
            {
            // InternalSml.g:1328:2: (otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) ) )
            // InternalSml.g:1329:3: otherlv_0= 'radius' ( (lv_r_1_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getCircleDAccess().getRadiusKeyword_0());
            		
            // InternalSml.g:1333:3: ( (lv_r_1_0= ruleDouble ) )
            // InternalSml.g:1334:4: (lv_r_1_0= ruleDouble )
            {
            // InternalSml.g:1334:4: (lv_r_1_0= ruleDouble )
            // InternalSml.g:1335:5: lv_r_1_0= ruleDouble
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
    // InternalSml.g:1356:1: entryRuleRectangleD returns [EObject current=null] : iv_ruleRectangleD= ruleRectangleD EOF ;
    public final EObject entryRuleRectangleD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangleD = null;


        try {
            // InternalSml.g:1356:51: (iv_ruleRectangleD= ruleRectangleD EOF )
            // InternalSml.g:1357:2: iv_ruleRectangleD= ruleRectangleD EOF
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
    // InternalSml.g:1363:1: ruleRectangleD returns [EObject current=null] : (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) ) ;
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
            // InternalSml.g:1369:2: ( (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) ) )
            // InternalSml.g:1370:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) )
            {
            // InternalSml.g:1370:2: (otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) ) )
            // InternalSml.g:1371:3: otherlv_0= 'length' ( (lv_l_1_0= ruleDouble ) ) otherlv_2= ',width' ( (lv_w_3_0= ruleDouble ) ) otherlv_4= 'and' otherlv_5= 'height' ( (lv_h_6_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangleDAccess().getLengthKeyword_0());
            		
            // InternalSml.g:1375:3: ( (lv_l_1_0= ruleDouble ) )
            // InternalSml.g:1376:4: (lv_l_1_0= ruleDouble )
            {
            // InternalSml.g:1376:4: (lv_l_1_0= ruleDouble )
            // InternalSml.g:1377:5: lv_l_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getRectangleDAccess().getLDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
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

            otherlv_2=(Token)match(input,60,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleDAccess().getWidthKeyword_2());
            		
            // InternalSml.g:1398:3: ( (lv_w_3_0= ruleDouble ) )
            // InternalSml.g:1399:4: (lv_w_3_0= ruleDouble )
            {
            // InternalSml.g:1399:4: (lv_w_3_0= ruleDouble )
            // InternalSml.g:1400:5: lv_w_3_0= ruleDouble
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

            otherlv_4=(Token)match(input,57,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getRectangleDAccess().getAndKeyword_4());
            		
            otherlv_5=(Token)match(input,61,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getRectangleDAccess().getHeightKeyword_5());
            		
            // InternalSml.g:1425:3: ( (lv_h_6_0= ruleDouble ) )
            // InternalSml.g:1426:4: (lv_h_6_0= ruleDouble )
            {
            // InternalSml.g:1426:4: (lv_h_6_0= ruleDouble )
            // InternalSml.g:1427:5: lv_h_6_0= ruleDouble
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
    // InternalSml.g:1448:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalSml.g:1448:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalSml.g:1449:2: iv_ruleCoordinate= ruleCoordinate EOF
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
    // InternalSml.g:1455:1: ruleCoordinate returns [EObject current=null] : ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_1_0 = null;



        	enterRule();

        try {
            // InternalSml.g:1461:2: ( ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) ) )
            // InternalSml.g:1462:2: ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) )
            {
            // InternalSml.g:1462:2: ( ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) ) )
            // InternalSml.g:1463:3: ( (lv_x_0_0= ruleDouble ) ) ( (lv_y_1_0= ruleDouble ) )
            {
            // InternalSml.g:1463:3: ( (lv_x_0_0= ruleDouble ) )
            // InternalSml.g:1464:4: (lv_x_0_0= ruleDouble )
            {
            // InternalSml.g:1464:4: (lv_x_0_0= ruleDouble )
            // InternalSml.g:1465:5: lv_x_0_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getCoordinateAccess().getXDoubleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalSml.g:1482:3: ( (lv_y_1_0= ruleDouble ) )
            // InternalSml.g:1483:4: (lv_y_1_0= ruleDouble )
            {
            // InternalSml.g:1483:4: (lv_y_1_0= ruleDouble )
            // InternalSml.g:1484:5: lv_y_1_0= ruleDouble
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
    // InternalSml.g:1505:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalSml.g:1505:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalSml.g:1506:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalSml.g:1512:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSml.g:1518:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalSml.g:1519:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalSml.g:1519:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalSml.g:1520:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_46); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,62,FOLLOW_37); 

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
    // InternalSml.g:1543:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalSml.g:1543:46: (iv_ruleRange= ruleRange EOF )
            // InternalSml.g:1544:2: iv_ruleRange= ruleRange EOF
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
    // InternalSml.g:1550:1: ruleRange returns [EObject current=null] : (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) ;
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
            // InternalSml.g:1556:2: ( (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize ) )
            // InternalSml.g:1557:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            {
            // InternalSml.g:1557:2: (this_Upperbound_0= ruleUpperbound | this_Lowerbound_1= ruleLowerbound | this_Interval_2= ruleInterval | this_LowerorEqualbound_3= ruleLowerorEqualbound | this_UpperorEqualbound_4= ruleUpperorEqualbound | this_ConstantSize_5= ruleConstantSize )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 67:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==64) ) {
                    alt16=1;
                }
                else if ( (LA16_1==65) ) {
                    alt16=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==65) ) {
                    alt16=4;
                }
                else if ( (LA16_2==64) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                alt16=3;
                }
                break;
            case RULE_INT:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSml.g:1558:3: this_Upperbound_0= ruleUpperbound
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
                    // InternalSml.g:1567:3: this_Lowerbound_1= ruleLowerbound
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
                    // InternalSml.g:1576:3: this_Interval_2= ruleInterval
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
                    // InternalSml.g:1585:3: this_LowerorEqualbound_3= ruleLowerorEqualbound
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
                    // InternalSml.g:1594:3: this_UpperorEqualbound_4= ruleUpperorEqualbound
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
                    // InternalSml.g:1603:3: this_ConstantSize_5= ruleConstantSize
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
    // InternalSml.g:1615:1: entryRuleConstantSize returns [EObject current=null] : iv_ruleConstantSize= ruleConstantSize EOF ;
    public final EObject entryRuleConstantSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSize = null;


        try {
            // InternalSml.g:1615:53: (iv_ruleConstantSize= ruleConstantSize EOF )
            // InternalSml.g:1616:2: iv_ruleConstantSize= ruleConstantSize EOF
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
    // InternalSml.g:1622:1: ruleConstantSize returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleConstantSize() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalSml.g:1628:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalSml.g:1629:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalSml.g:1629:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalSml.g:1630:3: (lv_n_0_0= RULE_INT )
            {
            // InternalSml.g:1630:3: (lv_n_0_0= RULE_INT )
            // InternalSml.g:1631:4: lv_n_0_0= RULE_INT
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
    // InternalSml.g:1650:1: entryRuleLowerbound returns [EObject current=null] : iv_ruleLowerbound= ruleLowerbound EOF ;
    public final EObject entryRuleLowerbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerbound = null;


        try {
            // InternalSml.g:1650:51: (iv_ruleLowerbound= ruleLowerbound EOF )
            // InternalSml.g:1651:2: iv_ruleLowerbound= ruleLowerbound EOF
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
    // InternalSml.g:1657:1: ruleLowerbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_n_2_0=null;


        	enterRule();

        try {
            // InternalSml.g:1663:2: ( (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) )
            // InternalSml.g:1664:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            {
            // InternalSml.g:1664:2: (otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            // InternalSml.g:1665:3: otherlv_0= 'less' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:1673:3: ( (lv_n_2_0= RULE_INT ) )
            // InternalSml.g:1674:4: (lv_n_2_0= RULE_INT )
            {
            // InternalSml.g:1674:4: (lv_n_2_0= RULE_INT )
            // InternalSml.g:1675:5: lv_n_2_0= RULE_INT
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
    // InternalSml.g:1695:1: entryRuleLowerorEqualbound returns [EObject current=null] : iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF ;
    public final EObject entryRuleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerorEqualbound = null;


        try {
            // InternalSml.g:1695:58: (iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF )
            // InternalSml.g:1696:2: iv_ruleLowerorEqualbound= ruleLowerorEqualbound EOF
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
    // InternalSml.g:1702:1: ruleLowerorEqualbound returns [EObject current=null] : (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;


        	enterRule();

        try {
            // InternalSml.g:1708:2: ( (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) )
            // InternalSml.g:1709:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            {
            // InternalSml.g:1709:2: (otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            // InternalSml.g:1710:3: otherlv_0= 'less' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerorEqualboundAccess().getLessKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getLowerorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getLowerorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:1726:3: ( (lv_n_4_0= RULE_INT ) )
            // InternalSml.g:1727:4: (lv_n_4_0= RULE_INT )
            {
            // InternalSml.g:1727:4: (lv_n_4_0= RULE_INT )
            // InternalSml.g:1728:5: lv_n_4_0= RULE_INT
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
    // InternalSml.g:1748:1: entryRuleUpperbound returns [EObject current=null] : iv_ruleUpperbound= ruleUpperbound EOF ;
    public final EObject entryRuleUpperbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperbound = null;


        try {
            // InternalSml.g:1748:51: (iv_ruleUpperbound= ruleUpperbound EOF )
            // InternalSml.g:1749:2: iv_ruleUpperbound= ruleUpperbound EOF
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
    // InternalSml.g:1755:1: ruleUpperbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_n_2_0=null;


        	enterRule();

        try {
            // InternalSml.g:1761:2: ( (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) ) )
            // InternalSml.g:1762:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            {
            // InternalSml.g:1762:2: (otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) ) )
            // InternalSml.g:1763:3: otherlv_0= 'more' otherlv_1= 'than' ( (lv_n_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperboundAccess().getThanKeyword_1());
            		
            // InternalSml.g:1771:3: ( (lv_n_2_0= RULE_INT ) )
            // InternalSml.g:1772:4: (lv_n_2_0= RULE_INT )
            {
            // InternalSml.g:1772:4: (lv_n_2_0= RULE_INT )
            // InternalSml.g:1773:5: lv_n_2_0= RULE_INT
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
    // InternalSml.g:1793:1: entryRuleUpperorEqualbound returns [EObject current=null] : iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF ;
    public final EObject entryRuleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperorEqualbound = null;


        try {
            // InternalSml.g:1793:58: (iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF )
            // InternalSml.g:1794:2: iv_ruleUpperorEqualbound= ruleUpperorEqualbound EOF
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
    // InternalSml.g:1800:1: ruleUpperorEqualbound returns [EObject current=null] : (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperorEqualbound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;


        	enterRule();

        try {
            // InternalSml.g:1806:2: ( (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) ) )
            // InternalSml.g:1807:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            {
            // InternalSml.g:1807:2: (otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) ) )
            // InternalSml.g:1808:3: otherlv_0= 'more' otherlv_1= 'or' otherlv_2= 'equal' otherlv_3= 'than' ( (lv_n_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperorEqualboundAccess().getMoreKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperorEqualboundAccess().getOrKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getUpperorEqualboundAccess().getEqualKeyword_2());
            		
            otherlv_3=(Token)match(input,64,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getUpperorEqualboundAccess().getThanKeyword_3());
            		
            // InternalSml.g:1824:3: ( (lv_n_4_0= RULE_INT ) )
            // InternalSml.g:1825:4: (lv_n_4_0= RULE_INT )
            {
            // InternalSml.g:1825:4: (lv_n_4_0= RULE_INT )
            // InternalSml.g:1826:5: lv_n_4_0= RULE_INT
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
    // InternalSml.g:1846:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSml.g:1846:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSml.g:1847:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalSml.g:1853:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_m_1_0=null;
        Token otherlv_2=null;
        Token lv_n_3_0=null;


        	enterRule();

        try {
            // InternalSml.g:1859:2: ( (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) ) )
            // InternalSml.g:1860:2: (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) )
            {
            // InternalSml.g:1860:2: (otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) ) )
            // InternalSml.g:1861:3: otherlv_0= 'between' ( (lv_m_1_0= RULE_INT ) ) otherlv_2= 'and' ( (lv_n_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getBetweenKeyword_0());
            		
            // InternalSml.g:1865:3: ( (lv_m_1_0= RULE_INT ) )
            // InternalSml.g:1866:4: (lv_m_1_0= RULE_INT )
            {
            // InternalSml.g:1866:4: (lv_m_1_0= RULE_INT )
            // InternalSml.g:1867:5: lv_m_1_0= RULE_INT
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

            otherlv_2=(Token)match(input,57,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getAndKeyword_2());
            		
            // InternalSml.g:1887:3: ( (lv_n_3_0= RULE_INT ) )
            // InternalSml.g:1888:4: (lv_n_3_0= RULE_INT )
            {
            // InternalSml.g:1888:4: (lv_n_3_0= RULE_INT )
            // InternalSml.g:1889:5: lv_n_3_0= RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000044100000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000044100000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01FC000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000000000020L,0x0000000000000018L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x003C000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000080002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});

}