// Generated from /Users/admin/IdeaProjects/com.diaAppTest/src/amuParser.g4 by ANTLR 4.9.1
package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class amuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCENARIO_OPEN=1, TEST_OPEN=2, SCENARIO_REF=3, I=4, OPEN_BRACE=5, CLOSE_BRACE=6, 
		LB=7, RB=8, X=9, Y=10, COMMA=11, COLON=12, MINUS=13, TO=14, FROM=15, THE=16, 
		OF=17, TO_CLICK=18, SECONDS=19, POINT=20, TIMES=21, MAX=22, DIRECTION=23, 
		CARRIAGE_RETURN=24, NEW_LINE=25, CLICK=26, TYPE=27, WAIT=28, SCROLL=29, 
		SWIPE=30, THEN=31, AND=32, FINALLY=33, STRING=34, INTEGER=35, X_PIXEL=36, 
		X_TH=37, X_SECONDS=38, X_TIMES=39, INDEXABLE_ELEMENT=40, SKIP_=41;
	public static final int
		RULE_body = 0, RULE_testCases = 1, RULE_test = 2, RULE_test_close = 3, 
		RULE_scenarios = 4, RULE_scenario = 5, RULE_scenario_close = 6, RULE_line = 7, 
		RULE_label = 8, RULE_action = 9, RULE_end = 10, RULE_actionClick = 11, 
		RULE_actionType = 12, RULE_actionWait = 13, RULE_actionScroll = 14, RULE_actionSwipe = 15, 
		RULE_element = 16, RULE_point = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"body", "testCases", "test", "test_close", "scenarios", "scenario", "scenario_close", 
			"line", "label", "action", "end", "actionClick", "actionType", "actionWait", 
			"actionScroll", "actionSwipe", "element", "point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'I'", "'('", "')'", "'{'", "'}'", "'x'", "'y'", 
			"','", "':'", "'-'", "'to'", "'from'", "'the'", "'of'", null, "'seconds'", 
			"'point'", "'times'", "'max'", null, "'\r'", "'\n'", null, null, null, 
			null, null, "'then'", "'and'", null, null, null, null, null, null, null, 
			"'switch'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCENARIO_OPEN", "TEST_OPEN", "SCENARIO_REF", "I", "OPEN_BRACE", 
			"CLOSE_BRACE", "LB", "RB", "X", "Y", "COMMA", "COLON", "MINUS", "TO", 
			"FROM", "THE", "OF", "TO_CLICK", "SECONDS", "POINT", "TIMES", "MAX", 
			"DIRECTION", "CARRIAGE_RETURN", "NEW_LINE", "CLICK", "TYPE", "WAIT", 
			"SCROLL", "SWIPE", "THEN", "AND", "FINALLY", "STRING", "INTEGER", "X_PIXEL", 
			"X_TH", "X_SECONDS", "X_TIMES", "INDEXABLE_ELEMENT", "SKIP_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "amuParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public amuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BodyContext extends ParserRuleContext {
		public ScenariosContext scenarios() {
			return getRuleContext(ScenariosContext.class,0);
		}
		public TestCasesContext testCases() {
			return getRuleContext(TestCasesContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			scenarios();
			setState(37);
			testCases();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestCasesContext extends ParserRuleContext {
		public List<TerminalNode> NEW_LINE() { return getTokens(amuParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(amuParser.NEW_LINE, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterTestCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitTestCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitTestCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestCasesContext testCases() throws RecognitionException {
		TestCasesContext _localctx = new TestCasesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_testCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(39);
				match(NEW_LINE);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEST_OPEN) {
				{
				{
				setState(45);
				test();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(46);
					match(NEW_LINE);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public TerminalNode TEST_OPEN() { return getToken(amuParser.TEST_OPEN, 0); }
		public Test_closeContext test_close() {
			return getRuleContext(Test_closeContext.class,0);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(amuParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(amuParser.NEW_LINE, i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TEST_OPEN);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				label();
				setState(59);
				match(NEW_LINE);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SCENARIO_REF );
			setState(65);
			test_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Test_closeContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACE() { return getToken(amuParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(amuParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(amuParser.NEW_LINE, i);
		}
		public Test_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterTest_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitTest_close(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitTest_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_closeContext test_close() throws RecognitionException {
		Test_closeContext _localctx = new Test_closeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_test_close);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(67);
				match(NEW_LINE);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(CLOSE_BRACE);
			setState(74);
			match(NEW_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScenariosContext extends ParserRuleContext {
		public List<ScenarioContext> scenario() {
			return getRuleContexts(ScenarioContext.class);
		}
		public ScenarioContext scenario(int i) {
			return getRuleContext(ScenarioContext.class,i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(amuParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(amuParser.NEW_LINE, i);
		}
		public ScenariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterScenarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitScenarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitScenarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScenariosContext scenarios() throws RecognitionException {
		ScenariosContext _localctx = new ScenariosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scenarios);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCENARIO_OPEN) {
				{
				{
				setState(76);
				scenario();
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						match(NEW_LINE);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScenarioContext extends ParserRuleContext {
		public TerminalNode SCENARIO_OPEN() { return getToken(amuParser.SCENARIO_OPEN, 0); }
		public Scenario_closeContext scenario_close() {
			return getRuleContext(Scenario_closeContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterScenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitScenario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitScenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScenarioContext scenario() throws RecognitionException {
		ScenarioContext _localctx = new ScenarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scenario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SCENARIO_OPEN);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				line();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SCENARIO_REF || _la==I );
			setState(94);
			scenario_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scenario_closeContext extends ParserRuleContext {
		public TerminalNode RB() { return getToken(amuParser.RB, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(amuParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(amuParser.NEW_LINE, i);
		}
		public Scenario_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterScenario_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitScenario_close(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitScenario_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scenario_closeContext scenario_close() throws RecognitionException {
		Scenario_closeContext _localctx = new Scenario_closeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scenario_close);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(96);
				match(NEW_LINE);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(RB);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(NEW_LINE);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(amuParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(amuParser.NEW_LINE, i);
		}
		public TerminalNode FINALLY() { return getToken(amuParser.FINALLY, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		try {
			int _alt;
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(109);
				action();
				setState(110);
				end();
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						match(NEW_LINE);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(118);
				action();
				setState(119);
				match(FINALLY);
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						match(NEW_LINE);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				label();
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(NEW_LINE);
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode SCENARIO_REF() { return getToken(amuParser.SCENARIO_REF, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(SCENARIO_REF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ActionClickContext actionClick() {
			return getRuleContext(ActionClickContext.class,0);
		}
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public ActionWaitContext actionWait() {
			return getRuleContext(ActionWaitContext.class,0);
		}
		public ActionScrollContext actionScroll() {
			return getRuleContext(ActionScrollContext.class,0);
		}
		public ActionSwipeContext actionSwipe() {
			return getRuleContext(ActionSwipeContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_action);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				actionClick();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				actionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				actionWait();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				actionScroll();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				actionSwipe();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(amuParser.THEN, 0); }
		public TerminalNode AND() { return getToken(amuParser.AND, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==THEN || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionClickContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(amuParser.I, 0); }
		public TerminalNode CLICK() { return getToken(amuParser.CLICK, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode DIRECTION() { return getToken(amuParser.DIRECTION, 0); }
		public TerminalNode OF() { return getToken(amuParser.OF, 0); }
		public TerminalNode X_PIXEL() { return getToken(amuParser.X_PIXEL, 0); }
		public TerminalNode THE() { return getToken(amuParser.THE, 0); }
		public TerminalNode X_TH() { return getToken(amuParser.X_TH, 0); }
		public TerminalNode INDEXABLE_ELEMENT() { return getToken(amuParser.INDEXABLE_ELEMENT, 0); }
		public TerminalNode POINT() { return getToken(amuParser.POINT, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ActionClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterActionClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitActionClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitActionClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionClickContext actionClick() throws RecognitionException {
		ActionClickContext _localctx = new ActionClickContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actionClick);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(I);
				setState(148);
				match(CLICK);
				setState(149);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(I);
				setState(151);
				match(CLICK);
				setState(152);
				match(DIRECTION);
				setState(153);
				match(OF);
				setState(154);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(I);
				setState(156);
				match(CLICK);
				setState(157);
				match(X_PIXEL);
				setState(158);
				match(DIRECTION);
				setState(159);
				match(OF);
				setState(160);
				element();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(I);
				setState(162);
				match(CLICK);
				setState(163);
				match(THE);
				setState(164);
				match(X_TH);
				setState(165);
				match(INDEXABLE_ELEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(I);
				setState(167);
				match(CLICK);
				setState(168);
				match(THE);
				setState(169);
				match(POINT);
				setState(170);
				point();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(amuParser.I, 0); }
		public TerminalNode TYPE() { return getToken(amuParser.TYPE, 0); }
		public TerminalNode STRING() { return getToken(amuParser.STRING, 0); }
		public TerminalNode TO() { return getToken(amuParser.TO, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actionType);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(I);
				setState(174);
				match(TYPE);
				setState(175);
				match(STRING);
				setState(176);
				match(TO);
				setState(177);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(I);
				setState(179);
				match(TYPE);
				setState(180);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionWaitContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(amuParser.I, 0); }
		public TerminalNode WAIT() { return getToken(amuParser.WAIT, 0); }
		public TerminalNode X_SECONDS() { return getToken(amuParser.X_SECONDS, 0); }
		public ActionWaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionWait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterActionWait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitActionWait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitActionWait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionWaitContext actionWait() throws RecognitionException {
		ActionWaitContext _localctx = new ActionWaitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_actionWait);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(I);
				setState(184);
				match(WAIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(I);
				setState(186);
				match(WAIT);
				setState(187);
				match(X_SECONDS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionScrollContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(amuParser.I, 0); }
		public TerminalNode SCROLL() { return getToken(amuParser.SCROLL, 0); }
		public TerminalNode X_TIMES() { return getToken(amuParser.X_TIMES, 0); }
		public TerminalNode TO_CLICK() { return getToken(amuParser.TO_CLICK, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ActionScrollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScroll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterActionScroll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitActionScroll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitActionScroll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionScrollContext actionScroll() throws RecognitionException {
		ActionScrollContext _localctx = new ActionScrollContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_actionScroll);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(I);
				setState(191);
				match(SCROLL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(I);
				setState(193);
				match(SCROLL);
				setState(194);
				match(X_TIMES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(I);
				setState(196);
				match(SCROLL);
				setState(197);
				match(X_TIMES);
				setState(198);
				match(TO_CLICK);
				setState(199);
				element();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionSwipeContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(amuParser.I, 0); }
		public TerminalNode SWIPE() { return getToken(amuParser.SWIPE, 0); }
		public TerminalNode DIRECTION() { return getToken(amuParser.DIRECTION, 0); }
		public TerminalNode FROM() { return getToken(amuParser.FROM, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode X_PIXEL() { return getToken(amuParser.X_PIXEL, 0); }
		public TerminalNode TO() { return getToken(amuParser.TO, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public ActionSwipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionSwipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterActionSwipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitActionSwipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitActionSwipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionSwipeContext actionSwipe() throws RecognitionException {
		ActionSwipeContext _localctx = new ActionSwipeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actionSwipe);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(I);
				setState(203);
				match(SWIPE);
				setState(204);
				match(DIRECTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(I);
				setState(206);
				match(SWIPE);
				setState(207);
				match(DIRECTION);
				setState(208);
				match(FROM);
				setState(209);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(I);
				setState(211);
				match(SWIPE);
				setState(212);
				match(DIRECTION);
				setState(213);
				match(FROM);
				setState(214);
				element();
				setState(215);
				match(X_PIXEL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(I);
				setState(218);
				match(SWIPE);
				setState(219);
				match(FROM);
				setState(220);
				element();
				setState(221);
				match(TO);
				setState(222);
				element();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(I);
				setState(225);
				match(SWIPE);
				setState(226);
				match(FROM);
				setState(227);
				point();
				setState(228);
				match(TO);
				setState(229);
				point();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(amuParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(amuParser.OPEN_BRACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(amuParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(amuParser.INTEGER, i);
		}
		public TerminalNode COMMA() { return getToken(amuParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(amuParser.CLOSE_BRACE, 0); }
		public TerminalNode MINUS() { return getToken(amuParser.MINUS, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_point);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(OPEN_BRACE);
				setState(236);
				match(INTEGER);
				setState(237);
				match(COMMA);
				setState(238);
				match(INTEGER);
				setState(239);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(INTEGER);
				setState(241);
				match(COMMA);
				setState(242);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(INTEGER);
				setState(244);
				match(MINUS);
				setState(245);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(INTEGER);
				setState(247);
				match(INTEGER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\3\4\3\4\6\4@\n\4\r"+
		"\4\16\4A\3\4\3\4\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\3\6\3\6\7\6Q"+
		"\n\6\f\6\16\6T\13\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\6\7]\n\7\r\7\16\7"+
		"^\3\7\3\7\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b"+
		"\3\t\3\t\3\t\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\t\3\t\7\t}\n\t\f\t"+
		"\16\t\u0080\13\t\3\t\3\t\7\t\u0084\n\t\f\t\16\t\u0087\13\t\5\t\u0089\n"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00b8\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ea"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00fb\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\3\3\2!\"\2\u010c\2&\3\2\2\2\4,\3\2\2\2\6;\3\2\2\2\bH\3\2"+
		"\2\2\nW\3\2\2\2\fZ\3\2\2\2\16e\3\2\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2"+
		"\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00ad\3\2\2\2\32\u00b7\3\2\2\2"+
		"\34\u00be\3\2\2\2\36\u00ca\3\2\2\2 \u00e9\3\2\2\2\"\u00eb\3\2\2\2$\u00fa"+
		"\3\2\2\2&\'\5\n\6\2\'(\5\4\3\2(\3\3\2\2\2)+\7\33\2\2*)\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-8\3\2\2\2.,\3\2\2\2/\63\5\6\4\2\60\62\7\33\2\2"+
		"\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\66/\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\5\3\2\2"+
		"\2:8\3\2\2\2;?\7\4\2\2<=\5\22\n\2=>\7\33\2\2>@\3\2\2\2?<\3\2\2\2@A\3\2"+
		"\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\b\5\2D\7\3\2\2\2EG\7\33\2\2FE\3"+
		"\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\b\2\2LM\7"+
		"\33\2\2M\t\3\2\2\2NR\5\f\7\2OQ\7\33\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UN\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"X\13\3\2\2\2YW\3\2\2\2Z\\\7\3\2\2[]\5\20\t\2\\[\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\16\b\2a\r\3\2\2\2bd\7\33\2\2cb\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hl\7\n\2\2ik\7\33\2"+
		"\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2nl\3\2\2\2op\5\24"+
		"\13\2pq\5\26\f\2qu\3\2\2\2rt\7\33\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2v\u0089\3\2\2\2wu\3\2\2\2xy\5\24\13\2yz\7#\2\2z~\3\2\2\2{}\7\33"+
		"\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0089\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0085\5\22\n\2\u0082\u0084\7\33\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088o\3\2\2\2\u0088x\3\2\2\2\u0088"+
		"\u0081\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b\7\5\2\2\u008b\23\3\2\2\2\u008c"+
		"\u0092\5\30\r\2\u008d\u0092\5\32\16\2\u008e\u0092\5\34\17\2\u008f\u0092"+
		"\5\36\20\2\u0090\u0092\5 \21\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25"+
		"\3\2\2\2\u0093\u0094\t\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7\6\2\2\u0096"+
		"\u0097\7\34\2\2\u0097\u00ae\5\"\22\2\u0098\u0099\7\6\2\2\u0099\u009a\7"+
		"\34\2\2\u009a\u009b\7\31\2\2\u009b\u009c\7\23\2\2\u009c\u00ae\5\"\22\2"+
		"\u009d\u009e\7\6\2\2\u009e\u009f\7\34\2\2\u009f\u00a0\7&\2\2\u00a0\u00a1"+
		"\7\31\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00ae\5\"\22\2\u00a3\u00a4\7\6\2"+
		"\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\7\'\2\2\u00a7"+
		"\u00ae\7*\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7\34\2\2\u00aa\u00ab\7\22"+
		"\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ae\5$\23\2\u00ad\u0095\3\2\2\2\u00ad"+
		"\u0098\3\2\2\2\u00ad\u009d\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a8\3\2"+
		"\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00b2"+
		"\7$\2\2\u00b2\u00b3\7\20\2\2\u00b3\u00b8\5\"\22\2\u00b4\u00b5\7\6\2\2"+
		"\u00b5\u00b6\7\35\2\2\u00b6\u00b8\7$\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b4"+
		"\3\2\2\2\u00b8\33\3\2\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bf\7\36\2\2\u00bb"+
		"\u00bc\7\6\2\2\u00bc\u00bd\7\36\2\2\u00bd\u00bf\7(\2\2\u00be\u00b9\3\2"+
		"\2\2\u00be\u00bb\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00cb"+
		"\7\37\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7\37\2\2\u00c4\u00cb\7)\2\2"+
		"\u00c5\u00c6\7\6\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00c8\7)\2\2\u00c8\u00c9"+
		"\7\24\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c0\3\2\2\2\u00ca\u00c2\3\2\2\2"+
		"\u00ca\u00c5\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce"+
		"\7 \2\2\u00ce\u00ea\7\31\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\7 \2\2\u00d1"+
		"\u00d2\7\31\2\2\u00d2\u00d3\7\21\2\2\u00d3\u00ea\5\"\22\2\u00d4\u00d5"+
		"\7\6\2\2\u00d5\u00d6\7 \2\2\u00d6\u00d7\7\31\2\2\u00d7\u00d8\7\21\2\2"+
		"\u00d8\u00d9\5\"\22\2\u00d9\u00da\7&\2\2\u00da\u00ea\3\2\2\2\u00db\u00dc"+
		"\7\6\2\2\u00dc\u00dd\7 \2\2\u00dd\u00de\7\21\2\2\u00de\u00df\5\"\22\2"+
		"\u00df\u00e0\7\20\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3"+
		"\7\6\2\2\u00e3\u00e4\7 \2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\5$\23\2\u00e6"+
		"\u00e7\7\20\2\2\u00e7\u00e8\5$\23\2\u00e8\u00ea\3\2\2\2\u00e9\u00cc\3"+
		"\2\2\2\u00e9\u00cf\3\2\2\2\u00e9\u00d4\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9"+
		"\u00e2\3\2\2\2\u00ea!\3\2\2\2\u00eb\u00ec\7$\2\2\u00ec#\3\2\2\2\u00ed"+
		"\u00ee\7\7\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\7%\2"+
		"\2\u00f1\u00fb\7\b\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\7\r\2\2\u00f4\u00fb"+
		"\7%\2\2\u00f5\u00f6\7%\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00fb\7%\2\2\u00f8"+
		"\u00f9\7%\2\2\u00f9\u00fb\7%\2\2\u00fa\u00ed\3\2\2\2\u00fa\u00f2\3\2\2"+
		"\2\u00fa\u00f5\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb%\3\2\2\2\27,\638AHRW"+
		"^elu~\u0085\u0088\u0091\u00ad\u00b7\u00be\u00ca\u00e9\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}