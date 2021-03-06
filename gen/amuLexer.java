// Generated from /Users/admin/IdeaProjects/com.diaAppTest/src/amuLexer.g4 by ANTLR 4.9.1
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
		SCENARIO=1, I=2, OPEN_BRACE=3, CLOSE_BRACE=4, X=5, Y=6, COMMA=7, COLON=8, 
		MINUS=9, TO=10, FROM=11, THE=12, OF=13, TO_CLICK=14, SECONDS=15, POINT=16, 
		TIMES=17, MAX=18, DIRECTION=19, CARRIAGE_RETURN=20, NEW_LINE=21, CLICK=22, 
		TYPE=23, WAIT=24, SCROLL=25, SWIPE=26, THEN=27, AND=28, STRING=29, INTEGER=30, 
		X_PIXEL=31, X_TH=32, X_SECONDS=33, X_TIMES=34, INDEXABLE_ELEMENT=35, SKIP_=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SCENARIO", "I", "OPEN_BRACE", "CLOSE_BRACE", "X", "Y", "COMMA", "COLON", 
			"MINUS", "TO", "FROM", "THE", "OF", "TO_CLICK", "SECONDS", "POINT", "TIMES", 
			"MAX", "DIRECTION", "UP", "DOWN", "LEFT", "RIGHT", "SPACE", "CARRIAGE_RETURN", 
			"NEW_LINE", "CLICK", "TYPE", "WAIT", "SCROLL", "SWIPE", "THEN", "AND", 
			"STRING", "STRING_CONTENT", "COMMENT", "INTEGER", "DEC", "PX", "TH", 
			"X_PIXEL", "X_TH", "X_SECONDS", "X_TIMES", "INDEXABLE_ELEMENT", "SKIP_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'I'", "'('", "')'", "'x'", "'y'", "','", "':'", "'-'", "'to'", 
			"'from'", "'the'", "'of'", null, "'seconds'", "'point'", "'times'", "'max'", 
			null, "'\r'", "'\n'", null, null, null, null, null, "'then'", "'and'", 
			null, null, null, null, null, null, "'switch'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCENARIO", "I", "OPEN_BRACE", "CLOSE_BRACE", "X", "Y", "COMMA", 
			"COLON", "MINUS", "TO", "FROM", "THE", "OF", "TO_CLICK", "SECONDS", "POINT", 
			"TIMES", "MAX", "DIRECTION", "CARRIAGE_RETURN", "NEW_LINE", "CLICK", 
			"TYPE", "WAIT", "SCROLL", "SWIPE", "THEN", "AND", "STRING", "INTEGER", 
			"X_PIXEL", "X_TH", "X_SECONDS", "X_TIMES", "INDEXABLE_ELEMENT", "SKIP_"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\5\24\u00aa\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u00c0"+
		"\n\31\r\31\16\31\u00c1\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d4\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00df\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u00eb\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00fb\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \5 \u0108\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\7#\u0115"+
		"\n#\f#\16#\u0118\13#\3#\3#\3#\7#\u011d\n#\f#\16#\u0120\13#\3#\5#\u0123"+
		"\n#\3$\3$\3$\5$\u0128\n$\3%\3%\7%\u012c\n%\f%\16%\u012f\13%\3&\6&\u0132"+
		"\n&\r&\16&\u0133\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0143\n)"+
		"\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\5/"+
		"\u015b\n/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26\65"+
		"\27\67\309\31;\32=\33?\34A\35C\36E\37G\2I\2K M\2O\2Q\2S!U\"W#Y$[%]&\3"+
		"\2\t\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\7\2\f\f\17\17$$))^^\13\2"+
		"$$))^^cdhhppttvvxx\4\2\f\f\17\17\3\2\62;\2\u0167\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2K\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2"+
		"\2\5f\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2"+
		"\21r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27y\3\2\2\2\31~\3\2\2\2\33\u0082"+
		"\3\2\2\2\35\u0085\3\2\2\2\37\u008d\3\2\2\2!\u0095\3\2\2\2#\u009b\3\2\2"+
		"\2%\u00a1\3\2\2\2\'\u00a9\3\2\2\2)\u00ab\3\2\2\2+\u00ae\3\2\2\2-\u00b3"+
		"\3\2\2\2/\u00b8\3\2\2\2\61\u00bf\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2"+
		"\2\2\67\u00d3\3\2\2\29\u00de\3\2\2\2;\u00ea\3\2\2\2=\u00fa\3\2\2\2?\u0107"+
		"\3\2\2\2A\u0109\3\2\2\2C\u010e\3\2\2\2E\u0122\3\2\2\2G\u0127\3\2\2\2I"+
		"\u0129\3\2\2\2K\u0131\3\2\2\2M\u0135\3\2\2\2O\u0137\3\2\2\2Q\u0142\3\2"+
		"\2\2S\u0144\3\2\2\2U\u0147\3\2\2\2W\u014a\3\2\2\2Y\u014e\3\2\2\2[\u0151"+
		"\3\2\2\2]\u015a\3\2\2\2_c\t\2\2\2`b\t\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2d\4\3\2\2\2ec\3\2\2\2fg\7K\2\2g\6\3\2\2\2hi\7*\2\2i\b\3"+
		"\2\2\2jk\7+\2\2k\n\3\2\2\2lm\7z\2\2m\f\3\2\2\2no\7{\2\2o\16\3\2\2\2pq"+
		"\7.\2\2q\20\3\2\2\2rs\7<\2\2s\22\3\2\2\2tu\7/\2\2u\24\3\2\2\2vw\7v\2\2"+
		"wx\7q\2\2x\26\3\2\2\2yz\7h\2\2z{\7t\2\2{|\7q\2\2|}\7o\2\2}\30\3\2\2\2"+
		"~\177\7v\2\2\177\u0080\7j\2\2\u0080\u0081\7g\2\2\u0081\32\3\2\2\2\u0082"+
		"\u0083\7q\2\2\u0083\u0084\7h\2\2\u0084\34\3\2\2\2\u0085\u0086\5\25\13"+
		"\2\u0086\u0087\7\"\2\2\u0087\u0088\7e\2\2\u0088\u0089\7n\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7e\2\2\u008b\u008c\7m\2\2\u008c\36\3\2\2\2\u008d\u008e"+
		"\7u\2\2\u008e\u008f\7g\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7p\2\2\u0092\u0093\7f\2\2\u0093\u0094\7u\2\2\u0094 \3\2\2\2\u0095"+
		"\u0096\7r\2\2\u0096\u0097\7q\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2"+
		"\u0099\u009a\7v\2\2\u009a\"\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7k"+
		"\2\2\u009d\u009e\7o\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7u\2\2\u00a0$\3"+
		"\2\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7z\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00aa\5)\25\2\u00a6\u00aa\5+\26\2\u00a7\u00aa\5-\27\2"+
		"\u00a8\u00aa\5/\30\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad"+
		"\7r\2\2\u00ad*\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7y\2\2\u00b1\u00b2\7p\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7v\2\2\u00b7.\3\2\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7j\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\60\3\2\2\2\u00be\u00c0\t\4\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\62"+
		"\3\2\2\2\u00c3\u00c4\7\17\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6"+
		"\66\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7e\2\2\u00cb\u00cc\7m\2\2\u00cc\u00cd\7g\2\2\u00cd\u00d4\7f\2\2"+
		"\u00ce\u00cf\7e\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7e\2\2\u00d2\u00d4\7m\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4"+
		"8\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7r\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\u00df\7f\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7{\2\2"+
		"\u00dc\u00dd\7r\2\2\u00dd\u00df\7g\2\2\u00de\u00d5\3\2\2\2\u00de\u00da"+
		"\3\2\2\2\u00df:\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3"+
		"\7k\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00eb\7f\2\2\u00e6"+
		"\u00e7\7y\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7k\2\2\u00e9\u00eb\7v\2\2"+
		"\u00ea\u00e0\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7"+
		"u\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7n\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2\u00f3\u00fb\7f\2\2\u00f4"+
		"\u00f5\7u\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7q\2\2"+
		"\u00f8\u00f9\7n\2\2\u00f9\u00fb\7n\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00f4"+
		"\3\2\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7g\2\2\u0101\u0108\7f\2\2\u0102"+
		"\u0103\7u\2\2\u0103\u0104\7y\2\2\u0104\u0105\7k\2\2\u0105\u0106\7r\2\2"+
		"\u0106\u0108\7g\2\2\u0107\u00fc\3\2\2\2\u0107\u0102\3\2\2\2\u0108@\3\2"+
		"\2\2\u0109\u010a\7v\2\2\u010a\u010b\7j\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7p\2\2\u010dB\3\2\2\2\u010e\u010f\7c\2\2\u010f\u0110\7p\2\2\u0110\u0111"+
		"\7f\2\2\u0111D\3\2\2\2\u0112\u0116\7$\2\2\u0113\u0115\5G$\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0123\7$\2\2\u011a\u011e\7)\2"+
		"\2\u011b\u011d\5G$\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0123\7)\2\2\u0122\u0112\3\2\2\2\u0122\u011a\3\2\2\2\u0123F\3\2\2\2\u0124"+
		"\u0128\n\5\2\2\u0125\u0126\7^\2\2\u0126\u0128\t\6\2\2\u0127\u0124\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128H\3\2\2\2\u0129\u012d\7%\2\2\u012a\u012c"+
		"\n\7\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012eJ\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\5M\'\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134L\3\2\2\2\u0135\u0136\t\b\2\2\u0136N\3\2\2\2\u0137\u0138\7r"+
		"\2\2\u0138\u0139\7z\2\2\u0139P\3\2\2\2\u013a\u013b\7u\2\2\u013b\u0143"+
		"\7v\2\2\u013c\u013d\7p\2\2\u013d\u0143\7f\2\2\u013e\u013f\7t\2\2\u013f"+
		"\u0143\7f\2\2\u0140\u0141\7v\2\2\u0141\u0143\7j\2\2\u0142\u013a\3\2\2"+
		"\2\u0142\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0140\3\2\2\2\u0143R"+
		"\3\2\2\2\u0144\u0145\5K&\2\u0145\u0146\5O(\2\u0146T\3\2\2\2\u0147\u0148"+
		"\5K&\2\u0148\u0149\5Q)\2\u0149V\3\2\2\2\u014a\u014b\5K&\2\u014b\u014c"+
		"\7\"\2\2\u014c\u014d\5\37\20\2\u014dX\3\2\2\2\u014e\u014f\5K&\2\u014f"+
		"\u0150\5#\22\2\u0150Z\3\2\2\2\u0151\u0152\7u\2\2\u0152\u0153\7y\2\2\u0153"+
		"\u0154\7k\2\2\u0154\u0155\7v\2\2\u0155\u0156\7e\2\2\u0156\u0157\7j\2\2"+
		"\u0157\\\3\2\2\2\u0158\u015b\5\61\31\2\u0159\u015b\5I%\2\u015a\u0158\3"+
		"\2\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b/\2\2\u015d"+
		"^\3\2\2\2\23\2c\u00a9\u00c1\u00d3\u00de\u00ea\u00fa\u0107\u0116\u011e"+
		"\u0122\u0127\u012d\u0133\u0142\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}