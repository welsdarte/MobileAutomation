// Generated from /Users/admin/IdeaProjects/com.diaAppTest/src/amuLexer.g4 by ANTLR 4.9.1
package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class amuLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCENARIO_OPEN", "TEST_OPEN", "SCENARIO_REF", "SCENARIO_IDENT", "TEST_IDENT", 
			"I", "OPEN_BRACE", "CLOSE_BRACE", "LB", "RB", "X", "Y", "COMMA", "COLON", 
			"MINUS", "TO", "FROM", "THE", "OF", "TO_CLICK", "SECONDS", "POINT", "TIMES", 
			"MAX", "DIRECTION", "UP", "DOWN", "LEFT", "RIGHT", "SPACE", "CARRIAGE_RETURN", 
			"NEW_LINE", "CLICK", "TYPE", "WAIT", "SCROLL", "SWIPE", "THEN", "AND", 
			"FINALLY", "STRING", "STRING_CONTENT", "COMMENT", "INTEGER", "DEC", "PX", 
			"TH", "X_PIXEL", "X_TH", "X_SECONDS", "X_TIMES", "INDEXABLE_ELEMENT", 
			"SKIP_"
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


	public amuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "amuLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\3\2\6\2w\n"+
		"\2\r\2\16\2x\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\7\3\u0084\n"+
		"\3\f\3\16\3\u0087\13\3\3\4\3\4\7\4\u008b\n\4\f\4\16\4\u008e\13\4\3\4\3"+
		"\4\7\4\u0092\n\4\f\4\16\4\u0095\13\4\3\4\3\4\3\4\3\4\7\4\u009b\n\4\f\4"+
		"\16\4\u009e\13\4\3\4\3\4\7\4\u00a2\n\4\f\4\16\4\u00a5\13\4\3\4\3\4\7\4"+
		"\u00a9\n\4\f\4\16\4\u00ac\13\4\3\4\3\4\7\4\u00b0\n\4\f\4\16\4\u00b3\13"+
		"\4\3\4\3\4\5\4\u00b7\n\4\3\5\3\5\7\5\u00bb\n\5\f\5\16\5\u00be\13\5\3\6"+
		"\3\6\7\6\u00c2\n\6\f\6\16\6\u00c5\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u010e\n\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\6\37\u0124\n\37\r\37\16\37\u0125\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0138\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\5#\u0143\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u014f\n$\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u015f\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\5&\u016c\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0184\n)\3*\3*\7*\u0188\n*\f*\16*\u018b\13*\3*\3*"+
		"\3*\7*\u0190\n*\f*\16*\u0193\13*\3*\5*\u0196\n*\3+\3+\3+\5+\u019b\n+\3"+
		",\3,\3,\3,\7,\u01a1\n,\f,\16,\u01a4\13,\3-\6-\u01a7\n-\r-\16-\u01a8\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01b8\n\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u01d1\n\66\3\66\3\66"+
		"\2\2\67\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\2\67\29\2;\2"+
		"=\2?\32A\33C\34E\35G\36I\37K M!O\"Q#S$U\2W\2Y%[\2]\2_\2a&c\'e(g)i*k+\3"+
		"\2\t\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\7\2\f\f\17\17$$))^^\13\2"+
		"$$))^^cdhhppttvvxx\4\2\f\f\17\17\3\2\62;\2\u01e8\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2Y\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5z\3\2\2\2\7\u00b6"+
		"\3\2\2\2\t\u00b8\3\2\2\2\13\u00bf\3\2\2\2\r\u00c6\3\2\2\2\17\u00c8\3\2"+
		"\2\2\21\u00ca\3\2\2\2\23\u00cc\3\2\2\2\25\u00ce\3\2\2\2\27\u00d0\3\2\2"+
		"\2\31\u00d2\3\2\2\2\33\u00d4\3\2\2\2\35\u00d6\3\2\2\2\37\u00d8\3\2\2\2"+
		"!\u00da\3\2\2\2#\u00dd\3\2\2\2%\u00e2\3\2\2\2\'\u00e6\3\2\2\2)\u00e9\3"+
		"\2\2\2+\u00f1\3\2\2\2-\u00f9\3\2\2\2/\u00ff\3\2\2\2\61\u0105\3\2\2\2\63"+
		"\u010d\3\2\2\2\65\u010f\3\2\2\2\67\u0112\3\2\2\29\u0117\3\2\2\2;\u011c"+
		"\3\2\2\2=\u0123\3\2\2\2?\u0127\3\2\2\2A\u0129\3\2\2\2C\u0137\3\2\2\2E"+
		"\u0142\3\2\2\2G\u014e\3\2\2\2I\u015e\3\2\2\2K\u016b\3\2\2\2M\u016d\3\2"+
		"\2\2O\u0172\3\2\2\2Q\u0183\3\2\2\2S\u0195\3\2\2\2U\u019a\3\2\2\2W\u019c"+
		"\3\2\2\2Y\u01a6\3\2\2\2[\u01aa\3\2\2\2]\u01ac\3\2\2\2_\u01b7\3\2\2\2a"+
		"\u01b9\3\2\2\2c\u01bc\3\2\2\2e\u01bf\3\2\2\2g\u01c3\3\2\2\2i\u01c7\3\2"+
		"\2\2k\u01d0\3\2\2\2mq\5\t\5\2np\5A!\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr"+
		"\3\2\2\2rt\3\2\2\2sq\3\2\2\2tv\5\23\n\2uw\5A!\2vu\3\2\2\2wx\3\2\2\2xv"+
		"\3\2\2\2xy\3\2\2\2y\4\3\2\2\2z~\5\13\6\2{}\5A!\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0085"+
		"\5\17\b\2\u0082\u0084\5A!\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\6\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088\u008c\7>\2\2\u0089\u008b\7\"\2\2\u008a\u0089\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0093\5\t\5\2\u0090\u0092\7\"\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7@\2\2\u0097\u00b7\3\2"+
		"\2\2\u0098\u009c\7>\2\2\u0099\u009b\7\"\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\5\t\5\2\u00a0\u00a2\7\"\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\5\35\17\2\u00a7"+
		"\u00a9\7\"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b1\5Y-\2\u00ae\u00b0\7\"\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\u00b7\3\2\2\2\u00b6\u0088\3\2\2\2\u00b6"+
		"\u0098\3\2\2\2\u00b7\b\3\2\2\2\u00b8\u00bc\t\2\2\2\u00b9\u00bb\t\3\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\n\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\t\2\2\2\u00c0"+
		"\u00c2\t\3\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\f\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7"+
		"\7K\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9\20\3\2\2\2\u00ca\u00cb"+
		"\7+\2\2\u00cb\22\3\2\2\2\u00cc\u00cd\7}\2\2\u00cd\24\3\2\2\2\u00ce\u00cf"+
		"\7\177\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7z\2\2\u00d1\30\3\2\2\2\u00d2"+
		"\u00d3\7{\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7.\2\2\u00d5\34\3\2\2\2\u00d6"+
		"\u00d7\7<\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9 \3\2\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\u00df\7t\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7o\2\2\u00e1$\3\2\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7g\2\2\u00e5&\3\2\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7h\2\2\u00e8(\3\2\2\2\u00e9\u00ea\5!\21\2\u00ea"+
		"\u00eb\7\"\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2"+
		"\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7u\2\2\u00f0*\3\2\2\2\u00f1\u00f2\7"+
		"u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7u\2\2\u00f8,\3\2\2\2\u00f9\u00fa"+
		"\7r\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe.\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0102\7o\2\2\u0102\u0103\7g\2\2\u0103\u0104\7u\2\2\u0104\60\3\2\2\2\u0105"+
		"\u0106\7o\2\2\u0106\u0107\7c\2\2\u0107\u0108\7z\2\2\u0108\62\3\2\2\2\u0109"+
		"\u010e\5\65\33\2\u010a\u010e\5\67\34\2\u010b\u010e\59\35\2\u010c\u010e"+
		"\5;\36\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\64\3\2\2\2\u010f\u0110\7w\2\2\u0110\u0111\7r\2\2"+
		"\u0111\66\3\2\2\2\u0112\u0113\7f\2\2\u0113\u0114\7q\2\2\u0114\u0115\7"+
		"y\2\2\u0115\u0116\7p\2\2\u01168\3\2\2\2\u0117\u0118\7n\2\2\u0118\u0119"+
		"\7g\2\2\u0119\u011a\7h\2\2\u011a\u011b\7v\2\2\u011b:\3\2\2\2\u011c\u011d"+
		"\7t\2\2\u011d\u011e\7k\2\2\u011e\u011f\7i\2\2\u011f\u0120\7j\2\2\u0120"+
		"\u0121\7v\2\2\u0121<\3\2\2\2\u0122\u0124\t\4\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126>\3\2\2\2"+
		"\u0127\u0128\7\17\2\2\u0128@\3\2\2\2\u0129\u012a\7\f\2\2\u012aB\3\2\2"+
		"\2\u012b\u012c\7e\2\2\u012c\u012d\7n\2\2\u012d\u012e\7k\2\2\u012e\u012f"+
		"\7e\2\2\u012f\u0130\7m\2\2\u0130\u0131\7g\2\2\u0131\u0138\7f\2\2\u0132"+
		"\u0133\7e\2\2\u0133\u0134\7n\2\2\u0134\u0135\7k\2\2\u0135\u0136\7e\2\2"+
		"\u0136\u0138\7m\2\2\u0137\u012b\3\2\2\2\u0137\u0132\3\2\2\2\u0138D\3\2"+
		"\2\2\u0139\u013a\7v\2\2\u013a\u013b\7{\2\2\u013b\u013c\7r\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u0143\7f\2\2\u013e\u013f\7v\2\2\u013f\u0140\7{\2\2\u0140"+
		"\u0141\7r\2\2\u0141\u0143\7g\2\2\u0142\u0139\3\2\2\2\u0142\u013e\3\2\2"+
		"\2\u0143F\3\2\2\2\u0144\u0145\7y\2\2\u0145\u0146\7c\2\2\u0146\u0147\7"+
		"k\2\2\u0147\u0148\7v\2\2\u0148\u0149\7g\2\2\u0149\u014f\7f\2\2\u014a\u014b"+
		"\7y\2\2\u014b\u014c\7c\2\2\u014c\u014d\7k\2\2\u014d\u014f\7v\2\2\u014e"+
		"\u0144\3\2\2\2\u014e\u014a\3\2\2\2\u014fH\3\2\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7e\2\2\u0152\u0153\7t\2\2\u0153\u0154\7q\2\2\u0154\u0155\7n\2\2"+
		"\u0155\u0156\7n\2\2\u0156\u0157\7g\2\2\u0157\u015f\7f\2\2\u0158\u0159"+
		"\7u\2\2\u0159\u015a\7e\2\2\u015a\u015b\7t\2\2\u015b\u015c\7q\2\2\u015c"+
		"\u015d\7n\2\2\u015d\u015f\7n\2\2\u015e\u0150\3\2\2\2\u015e\u0158\3\2\2"+
		"\2\u015fJ\3\2\2\2\u0160\u0161\7u\2\2\u0161\u0162\7y\2\2\u0162\u0163\7"+
		"k\2\2\u0163\u0164\7r\2\2\u0164\u0165\7g\2\2\u0165\u016c\7f\2\2\u0166\u0167"+
		"\7u\2\2\u0167\u0168\7y\2\2\u0168\u0169\7k\2\2\u0169\u016a\7r\2\2\u016a"+
		"\u016c\7g\2\2\u016b\u0160\3\2\2\2\u016b\u0166\3\2\2\2\u016cL\3\2\2\2\u016d"+
		"\u016e\7v\2\2\u016e\u016f\7j\2\2\u016f\u0170\7g\2\2\u0170\u0171\7p\2\2"+
		"\u0171N\3\2\2\2\u0172\u0173\7c\2\2\u0173\u0174\7p\2\2\u0174\u0175\7f\2"+
		"\2\u0175P\3\2\2\2\u0176\u0177\7h\2\2\u0177\u0178\7k\2\2\u0178\u0179\7"+
		"p\2\2\u0179\u017a\7c\2\2\u017a\u017b\7n\2\2\u017b\u017c\7n\2\2\u017c\u0184"+
		"\7{\2\2\u017d\u017e\7n\2\2\u017e\u017f\7c\2\2\u017f\u0180\7u\2\2\u0180"+
		"\u0181\7v\2\2\u0181\u0182\7n\2\2\u0182\u0184\7{\2\2\u0183\u0176\3\2\2"+
		"\2\u0183\u017d\3\2\2\2\u0184R\3\2\2\2\u0185\u0189\7$\2\2\u0186\u0188\5"+
		"U+\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0196\7$"+
		"\2\2\u018d\u0191\7)\2\2\u018e\u0190\5U+\2\u018f\u018e\3\2\2\2\u0190\u0193"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0196\7)\2\2\u0195\u0185\3\2\2\2\u0195\u018d\3\2"+
		"\2\2\u0196T\3\2\2\2\u0197\u019b\n\5\2\2\u0198\u0199\7^\2\2\u0199\u019b"+
		"\t\6\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019bV\3\2\2\2\u019c"+
		"\u019d\7\61\2\2\u019d\u019e\7\61\2\2\u019e\u01a2\3\2\2\2\u019f\u01a1\n"+
		"\7\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3X\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5[.\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9Z\3\2\2\2\u01aa\u01ab\t\b\2\2\u01ab\\\3\2\2\2\u01ac\u01ad\7"+
		"r\2\2\u01ad\u01ae\7z\2\2\u01ae^\3\2\2\2\u01af\u01b0\7u\2\2\u01b0\u01b8"+
		"\7v\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b8\7f\2\2\u01b3\u01b4\7t\2\2\u01b4"+
		"\u01b8\7f\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b8\7j\2\2\u01b7\u01af\3\2\2"+
		"\2\u01b7\u01b1\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8`"+
		"\3\2\2\2\u01b9\u01ba\5Y-\2\u01ba\u01bb\5]/\2\u01bbb\3\2\2\2\u01bc\u01bd"+
		"\5Y-\2\u01bd\u01be\5_\60\2\u01bed\3\2\2\2\u01bf\u01c0\5Y-\2\u01c0\u01c1"+
		"\7\"\2\2\u01c1\u01c2\5+\26\2\u01c2f\3\2\2\2\u01c3\u01c4\5Y-\2\u01c4\u01c5"+
		"\7\"\2\2\u01c5\u01c6\5/\30\2\u01c6h\3\2\2\2\u01c7\u01c8\7u\2\2\u01c8\u01c9"+
		"\7y\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7e\2\2\u01cc"+
		"\u01cd\7j\2\2\u01cdj\3\2\2\2\u01ce\u01d1\5=\37\2\u01cf\u01d1\5W,\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\b\66"+
		"\2\2\u01d3l\3\2\2\2 \2qx~\u0085\u008c\u0093\u009c\u00a3\u00aa\u00b1\u00b6"+
		"\u00bc\u00c3\u010d\u0125\u0137\u0142\u014e\u015e\u016b\u0183\u0189\u0191"+
		"\u0195\u019a\u01a2\u01a8\u01b7\u01d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}