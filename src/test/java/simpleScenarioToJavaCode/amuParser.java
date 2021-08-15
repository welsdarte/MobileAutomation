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
		SCENARIO=1, I=2, OPEN_BRACE=3, CLOSE_BRACE=4, X=5, Y=6, COMMA=7, MINUS=8, 
		TO=9, FROM=10, THE=11, OF=12, TO_CLICK=13, SECONDS=14, POINT=15, TIMES=16, 
		MAX=17, DIRECTION=18, CARRIAGE_RETURN=19, NEW_LINE=20, CLICK=21, TYPE=22, 
		WAIT=23, SCROLL=24, SWIPE=25, THEN=26, AND=27, STRING=28, INTEGER=29, 
		X_PIXEL=30, X_TH=31, X_SECONDS=32, X_TIMES=33, INDEXABLE_ELEMENT=34, SKIP_=35;
	public static final int
		RULE_scenario = 0, RULE_head = 1, RULE_body = 2, RULE_line = 3, RULE_action = 4, 
		RULE_end = 5, RULE_actionClick = 6, RULE_actionType = 7, RULE_actionWait = 8, 
		RULE_actionScroll = 9, RULE_actionSwipe = 10, RULE_element = 11, RULE_point = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"scenario", "head", "body", "line", "action", "end", "actionClick", "actionType", 
			"actionWait", "actionScroll", "actionSwipe", "element", "point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Scenario: '", "'I'", "'('", "')'", "'x'", "'y'", "','", "'-'", 
			"'to'", "'from'", "'the'", "'of'", null, "'seconds'", "'point'", "'times'", 
			"'max'", null, "'\r'", "'\n'", null, null, null, null, null, "'then'", 
			"'and'", null, null, null, null, null, null, "'switch'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCENARIO", "I", "OPEN_BRACE", "CLOSE_BRACE", "X", "Y", "COMMA", 
			"MINUS", "TO", "FROM", "THE", "OF", "TO_CLICK", "SECONDS", "POINT", "TIMES", 
			"MAX", "DIRECTION", "CARRIAGE_RETURN", "NEW_LINE", "CLICK", "TYPE", "WAIT", 
			"SCROLL", "SWIPE", "THEN", "AND", "STRING", "INTEGER", "X_PIXEL", "X_TH", 
			"X_SECONDS", "X_TIMES", "INDEXABLE_ELEMENT", "SKIP_"
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

	public static class ScenarioContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		enterRule(_localctx, 0, RULE_scenario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			head();
			setState(27);
			body();
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode SCENARIO() { return getToken(amuParser.SCENARIO, 0); }
		public TerminalNode STRING() { return getToken(amuParser.STRING, 0); }
		public TerminalNode NEW_LINE() { return getToken(amuParser.NEW_LINE, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof amuParserListener ) ((amuParserListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof amuParserVisitor ) return ((amuParserVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(SCENARIO);
			setState(30);
			match(STRING);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE) {
				{
				setState(31);
				match(NEW_LINE);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
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
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				line();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==I );
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
		public TerminalNode NEW_LINE() { return getToken(amuParser.NEW_LINE, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
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
		enterRule(_localctx, 6, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39);
			action();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN || _la==AND) {
				{
				setState(40);
				end();
				}
			}

			}
			setState(43);
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
		enterRule(_localctx, 8, RULE_action);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				actionClick();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				actionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				actionWait();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				actionScroll();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
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
		enterRule(_localctx, 10, RULE_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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
		enterRule(_localctx, 12, RULE_actionClick);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(I);
				setState(55);
				match(CLICK);
				setState(56);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(I);
				setState(58);
				match(CLICK);
				setState(59);
				match(DIRECTION);
				setState(60);
				match(OF);
				setState(61);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(I);
				setState(63);
				match(CLICK);
				setState(64);
				match(X_PIXEL);
				setState(65);
				match(DIRECTION);
				setState(66);
				match(OF);
				setState(67);
				element();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(I);
				setState(69);
				match(CLICK);
				setState(70);
				match(THE);
				setState(71);
				match(X_TH);
				setState(72);
				match(INDEXABLE_ELEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(I);
				setState(74);
				match(CLICK);
				setState(75);
				match(THE);
				setState(76);
				match(POINT);
				setState(77);
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
		enterRule(_localctx, 14, RULE_actionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(I);
			setState(81);
			match(TYPE);
			setState(82);
			match(STRING);
			setState(83);
			match(TO);
			setState(84);
			element();
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
		enterRule(_localctx, 16, RULE_actionWait);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(I);
				setState(87);
				match(WAIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(I);
				setState(89);
				match(WAIT);
				setState(90);
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
		enterRule(_localctx, 18, RULE_actionScroll);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(I);
				setState(94);
				match(SCROLL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(I);
				setState(96);
				match(SCROLL);
				setState(97);
				match(X_TIMES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(I);
				setState(99);
				match(SCROLL);
				setState(100);
				match(X_TIMES);
				setState(101);
				match(TO_CLICK);
				setState(102);
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
		enterRule(_localctx, 20, RULE_actionSwipe);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(I);
				setState(106);
				match(SWIPE);
				setState(107);
				match(DIRECTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(I);
				setState(109);
				match(SWIPE);
				setState(110);
				match(DIRECTION);
				setState(111);
				match(FROM);
				setState(112);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(I);
				setState(114);
				match(SWIPE);
				setState(115);
				match(DIRECTION);
				setState(116);
				match(FROM);
				setState(117);
				element();
				setState(118);
				match(X_PIXEL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(I);
				setState(121);
				match(SWIPE);
				setState(122);
				match(FROM);
				setState(123);
				element();
				setState(124);
				match(TO);
				setState(125);
				element();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(I);
				setState(128);
				match(SWIPE);
				setState(129);
				match(FROM);
				setState(130);
				point();
				setState(131);
				match(TO);
				setState(132);
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
		enterRule(_localctx, 22, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 24, RULE_point);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(OPEN_BRACE);
				setState(139);
				match(INTEGER);
				setState(140);
				match(COMMA);
				setState(141);
				match(INTEGER);
				setState(142);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(INTEGER);
				setState(144);
				match(COMMA);
				setState(145);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(INTEGER);
				setState(147);
				match(MINUS);
				setState(148);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(INTEGER);
				setState(150);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u009c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\5\3#\n\3\3\4\6\4"+
		"&\n\4\r\4\16\4\'\3\5\3\5\5\5,\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\65\n"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0089\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u009a\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\3\3\2\34\35\2\u00a3\2\34\3\2\2\2\4\37\3\2\2\2\6%\3\2\2\2\b)\3"+
		"\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16P\3\2\2\2\20R\3\2\2\2\22]\3\2\2\2\24"+
		"i\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u0099\3\2\2\2\34\35\5\4"+
		"\3\2\35\36\5\6\4\2\36\3\3\2\2\2\37 \7\3\2\2 \"\7\36\2\2!#\7\26\2\2\"!"+
		"\3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$&\5\b\5\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(\7\3\2\2\2)+\5\n\6\2*,\5\f\7\2+*\3\2\2\2+,\3\2\2\2,-\3\2"+
		"\2\2-.\7\26\2\2.\t\3\2\2\2/\65\5\16\b\2\60\65\5\20\t\2\61\65\5\22\n\2"+
		"\62\65\5\24\13\2\63\65\5\26\f\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2"+
		"\2\64\62\3\2\2\2\64\63\3\2\2\2\65\13\3\2\2\2\66\67\t\2\2\2\67\r\3\2\2"+
		"\289\7\4\2\29:\7\27\2\2:Q\5\30\r\2;<\7\4\2\2<=\7\27\2\2=>\7\24\2\2>?\7"+
		"\16\2\2?Q\5\30\r\2@A\7\4\2\2AB\7\27\2\2BC\7 \2\2CD\7\24\2\2DE\7\16\2\2"+
		"EQ\5\30\r\2FG\7\4\2\2GH\7\27\2\2HI\7\r\2\2IJ\7!\2\2JQ\7$\2\2KL\7\4\2\2"+
		"LM\7\27\2\2MN\7\r\2\2NO\7\21\2\2OQ\5\32\16\2P8\3\2\2\2P;\3\2\2\2P@\3\2"+
		"\2\2PF\3\2\2\2PK\3\2\2\2Q\17\3\2\2\2RS\7\4\2\2ST\7\30\2\2TU\7\36\2\2U"+
		"V\7\13\2\2VW\5\30\r\2W\21\3\2\2\2XY\7\4\2\2Y^\7\31\2\2Z[\7\4\2\2[\\\7"+
		"\31\2\2\\^\7\"\2\2]X\3\2\2\2]Z\3\2\2\2^\23\3\2\2\2_`\7\4\2\2`j\7\32\2"+
		"\2ab\7\4\2\2bc\7\32\2\2cj\7#\2\2de\7\4\2\2ef\7\32\2\2fg\7#\2\2gh\7\17"+
		"\2\2hj\5\30\r\2i_\3\2\2\2ia\3\2\2\2id\3\2\2\2j\25\3\2\2\2kl\7\4\2\2lm"+
		"\7\33\2\2m\u0089\7\24\2\2no\7\4\2\2op\7\33\2\2pq\7\24\2\2qr\7\f\2\2r\u0089"+
		"\5\30\r\2st\7\4\2\2tu\7\33\2\2uv\7\24\2\2vw\7\f\2\2wx\5\30\r\2xy\7 \2"+
		"\2y\u0089\3\2\2\2z{\7\4\2\2{|\7\33\2\2|}\7\f\2\2}~\5\30\r\2~\177\7\13"+
		"\2\2\177\u0080\5\30\r\2\u0080\u0089\3\2\2\2\u0081\u0082\7\4\2\2\u0082"+
		"\u0083\7\33\2\2\u0083\u0084\7\f\2\2\u0084\u0085\5\32\16\2\u0085\u0086"+
		"\7\13\2\2\u0086\u0087\5\32\16\2\u0087\u0089\3\2\2\2\u0088k\3\2\2\2\u0088"+
		"n\3\2\2\2\u0088s\3\2\2\2\u0088z\3\2\2\2\u0088\u0081\3\2\2\2\u0089\27\3"+
		"\2\2\2\u008a\u008b\7\36\2\2\u008b\31\3\2\2\2\u008c\u008d\7\5\2\2\u008d"+
		"\u008e\7\37\2\2\u008e\u008f\7\t\2\2\u008f\u0090\7\37\2\2\u0090\u009a\7"+
		"\6\2\2\u0091\u0092\7\37\2\2\u0092\u0093\7\t\2\2\u0093\u009a\7\37\2\2\u0094"+
		"\u0095\7\37\2\2\u0095\u0096\7\n\2\2\u0096\u009a\7\37\2\2\u0097\u0098\7"+
		"\37\2\2\u0098\u009a\7\37\2\2\u0099\u008c\3\2\2\2\u0099\u0091\3\2\2\2\u0099"+
		"\u0094\3\2\2\2\u0099\u0097\3\2\2\2\u009a\33\3\2\2\2\13\"\'+\64P]i\u0088"+
		"\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}