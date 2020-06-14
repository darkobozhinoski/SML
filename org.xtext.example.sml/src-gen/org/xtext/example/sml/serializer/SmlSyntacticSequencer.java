/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.sml.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.sml.services.SmlGrammarAccess;

@SuppressWarnings("all")
public class SmlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SmlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Condition_CommaKeyword_1_9_a;
	protected AbstractElementAlias match_Condition_IfKeyword_0_0_0_or_IfKeyword_0_0_1;
	protected AbstractElementAlias match_Condition_IfKeyword_1_0_0_or_IfKeyword_1_0_1;
	protected AbstractElementAlias match_Condition_IfKeyword_2_0_0_or_IfKeyword_2_0_1;
	protected AbstractElementAlias match_Condition_OnKeyword_0_3_0_or_OutsideKeyword_0_3_1;
	protected AbstractElementAlias match_Condition_OnKeyword_1_7_0_or_OutsideKeyword_1_7_1;
	protected AbstractElementAlias match_Environment___TheKeyword_0_0_ArenaKeyword_0_1_ContainsKeyword_0_2_TheKeyword_0_3_FollowingKeyword_0_4_ElementsKeyword_0_5_ColonKeyword_0_6__q;
	protected AbstractElementAlias match_Position___ReferenceKeyword_0_1_or___CenterKeyword_0_0_0_AtKeyword_0_0_1____q;
	protected AbstractElementAlias match_Time___BegginingKeyword_1_0_OfKeyword_1_1_TheKeyword_1_2_MissionKeyword_1_3___or___EndKeyword_2_0_OfKeyword_2_1_TheKeyword_2_2_MissionKeyword_2_3__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SmlGrammarAccess) access;
		match_Condition_CommaKeyword_1_9_a = new TokenAlias(true, true, grammarAccess.getConditionAccess().getCommaKeyword_1_9());
		match_Condition_IfKeyword_0_0_0_or_IfKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getIfKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getIfKeyword_0_0_1()));
		match_Condition_IfKeyword_1_0_0_or_IfKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getIfKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getIfKeyword_1_0_1()));
		match_Condition_IfKeyword_2_0_0_or_IfKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getIfKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getIfKeyword_2_0_1()));
		match_Condition_OnKeyword_0_3_0_or_OutsideKeyword_0_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getOnKeyword_0_3_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getOutsideKeyword_0_3_1()));
		match_Condition_OnKeyword_1_7_0_or_OutsideKeyword_1_7_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getOnKeyword_1_7_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getOutsideKeyword_1_7_1()));
		match_Environment___TheKeyword_0_0_ArenaKeyword_0_1_ContainsKeyword_0_2_TheKeyword_0_3_FollowingKeyword_0_4_ElementsKeyword_0_5_ColonKeyword_0_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getTheKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getArenaKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getContainsKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getTheKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getFollowingKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getElementsKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getEnvironmentAccess().getColonKeyword_0_6()));
		match_Position___ReferenceKeyword_0_1_or___CenterKeyword_0_0_0_AtKeyword_0_0_1____q = new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPositionAccess().getCenterKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getPositionAccess().getAtKeyword_0_0_1())), new TokenAlias(false, false, grammarAccess.getPositionAccess().getReferenceKeyword_0_1()));
		match_Time___BegginingKeyword_1_0_OfKeyword_1_1_TheKeyword_1_2_MissionKeyword_1_3___or___EndKeyword_2_0_OfKeyword_2_1_TheKeyword_2_2_MissionKeyword_2_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeAccess().getBegginingKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTimeAccess().getOfKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getTimeAccess().getTheKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getTimeAccess().getMissionKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTimeAccess().getEndKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTimeAccess().getOfKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getTimeAccess().getTheKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getTimeAccess().getMissionKeyword_2_3())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Condition_CommaKeyword_1_9_a.equals(syntax))
				emit_Condition_CommaKeyword_1_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_IfKeyword_0_0_0_or_IfKeyword_0_0_1.equals(syntax))
				emit_Condition_IfKeyword_0_0_0_or_IfKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_IfKeyword_1_0_0_or_IfKeyword_1_0_1.equals(syntax))
				emit_Condition_IfKeyword_1_0_0_or_IfKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_IfKeyword_2_0_0_or_IfKeyword_2_0_1.equals(syntax))
				emit_Condition_IfKeyword_2_0_0_or_IfKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_OnKeyword_0_3_0_or_OutsideKeyword_0_3_1.equals(syntax))
				emit_Condition_OnKeyword_0_3_0_or_OutsideKeyword_0_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_OnKeyword_1_7_0_or_OutsideKeyword_1_7_1.equals(syntax))
				emit_Condition_OnKeyword_1_7_0_or_OutsideKeyword_1_7_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Environment___TheKeyword_0_0_ArenaKeyword_0_1_ContainsKeyword_0_2_TheKeyword_0_3_FollowingKeyword_0_4_ElementsKeyword_0_5_ColonKeyword_0_6__q.equals(syntax))
				emit_Environment___TheKeyword_0_0_ArenaKeyword_0_1_ContainsKeyword_0_2_TheKeyword_0_3_FollowingKeyword_0_4_ElementsKeyword_0_5_ColonKeyword_0_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Position___ReferenceKeyword_0_1_or___CenterKeyword_0_0_0_AtKeyword_0_0_1____q.equals(syntax))
				emit_Position___ReferenceKeyword_0_1_or___CenterKeyword_0_0_0_AtKeyword_0_0_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Time___BegginingKeyword_1_0_OfKeyword_1_1_TheKeyword_1_2_MissionKeyword_1_3___or___EndKeyword_2_0_OfKeyword_2_1_TheKeyword_2_2_MissionKeyword_2_3__.equals(syntax))
				emit_Time___BegginingKeyword_1_0_OfKeyword_1_1_TheKeyword_1_2_MissionKeyword_1_3___or___EndKeyword_2_0_OfKeyword_2_1_TheKeyword_2_2_MissionKeyword_2_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','*
	 *
	 * This ambiguous syntax occurs at:
	 *     r=[Region|ID] (ambiguity) (rule end)
	 */
	protected void emit_Condition_CommaKeyword_1_9_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'if' | 'If'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'it' 'is' ('on' | 'outside') r=[Region|ID]
	 */
	protected void emit_Condition_IfKeyword_0_0_0_or_IfKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'if' | 'If'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'there' 'are' 'more' 'than' n=INT
	 */
	protected void emit_Condition_IfKeyword_1_0_0_or_IfKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'if' | 'If'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'it' 'goes' 'from' r=[Region|ID]
	 */
	protected void emit_Condition_IfKeyword_2_0_0_or_IfKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'on' | 'outside'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('if' | 'If') 'it' 'is' (ambiguity) r=[Region|ID]
	 */
	protected void emit_Condition_OnKeyword_0_3_0_or_OutsideKeyword_0_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'on' | 'outside'
	 *
	 * This ambiguous syntax occurs at:
	 *     n=INT 'robots' (ambiguity) r=[Region|ID]
	 */
	protected void emit_Condition_OnKeyword_1_7_0_or_OutsideKeyword_1_7_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'The' 
	  *         'arena' 
	  *         'contains' 
	  *         'the' 
	  *         'following' 
	  *         'elements' 
	  *         ':'
	  *     )?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) environment+=EnvironmentElements
	 */
	protected void emit_Environment___TheKeyword_0_0_ArenaKeyword_0_1_ContainsKeyword_0_2_TheKeyword_0_3_FollowingKeyword_0_4_ElementsKeyword_0_5_ColonKeyword_0_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('center' 'at') | 'reference')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'point' point=Coordinate2D
	 *     (rule start) (ambiguity) 'point' point=Coordinate3D
	 */
	protected void emit_Position___ReferenceKeyword_0_1_or___CenterKeyword_0_0_0_AtKeyword_0_0_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('beggining' 'of' 'the' 'mission') | ('end' 'of' 'the' 'mission')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Time___BegginingKeyword_1_0_OfKeyword_1_1_TheKeyword_1_2_MissionKeyword_1_3___or___EndKeyword_2_0_OfKeyword_2_1_TheKeyword_2_2_MissionKeyword_2_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
