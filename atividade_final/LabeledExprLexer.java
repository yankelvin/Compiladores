// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ASSIGN=8, APARE=9, 
		FPARE=10, ACHAV=11, FCHAV=12, ACOL=13, FCOL=14, PTVIG=15, NEWLINE=16, 
		COMMENT=17, WS=18, OR=19, AND=20, EQ=21, NEQ=22, GT=23, LT=24, GTEQ=25, 
		LTEQ=26, IF=27, ELSE=28, WHILE=29, FOR=30, CONST=31, ARRAY=32, ID=33, 
		INT=34, FLOAT=35, STRING=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", 
			"FPARE", "ACHAV", "FCHAV", "ACOL", "FCOL", "PTVIG", "NEWLINE", "COMMENT", 
			"WS", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", 
			"WHILE", "FOR", "CONST", "ARRAY", "ID", "INT", "FLOAT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'/*'", "'*/'", "'*'", "'/'", "'+'", "'-'", "'='", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", null, null, null, "'||'", 
			"'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'if'", "'else'", 
			"'while'", "'for'", "'const'", "'array'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", 
			"FPARE", "ACHAV", "FCHAV", "ACOL", "FCOL", "PTVIG", "NEWLINE", "COMMENT", 
			"WS", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", 
			"WHILE", "FOR", "CONST", "ARRAY", "ID", "INT", "FLOAT", "STRING"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21s\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\7\22{\n\22\f\22\16\22~\13\22\3\22\3\22\3"+
		"\23\6\23\u0083\n\23\r\23\16\23\u0084\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3\"\6\"\u00be\n\"\r\"\16\"\u00bf\3#\6#\u00c3\n#\r#\16#\u00c4\3$\6$\u00c8"+
		"\n$\r$\16$\u00c9\3$\3$\7$\u00ce\n$\f$\16$\u00d1\13$\3$\3$\6$\u00d5\n$"+
		"\r$\16$\u00d6\5$\u00d9\n$\3%\3%\3%\3%\7%\u00df\n%\f%\16%\u00e2\13%\3%"+
		"\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\3\2"+
		"\62;\5\2\f\f\17\17$$\2\u00ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5S\3\2\2\2\7V\3\2"+
		"\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2"+
		"\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3"+
		"\2\2\2!r\3\2\2\2#v\3\2\2\2%\u0082\3\2\2\2\'\u0088\3\2\2\2)\u008b\3\2\2"+
		"\2+\u008e\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2\2\2\61\u0096\3\2\2\2\63\u0098"+
		"\3\2\2\2\65\u009b\3\2\2\2\67\u009e\3\2\2\29\u00a1\3\2\2\2;\u00a6\3\2\2"+
		"\2=\u00ac\3\2\2\2?\u00b0\3\2\2\2A\u00b6\3\2\2\2C\u00bd\3\2\2\2E\u00c2"+
		"\3\2\2\2G\u00d8\3\2\2\2I\u00da\3\2\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7"+
		"p\2\2OP\7v\2\2PQ\7n\2\2QR\7p\2\2R\4\3\2\2\2ST\7\61\2\2TU\7,\2\2U\6\3\2"+
		"\2\2VW\7,\2\2WX\7\61\2\2X\b\3\2\2\2YZ\7,\2\2Z\n\3\2\2\2[\\\7\61\2\2\\"+
		"\f\3\2\2\2]^\7-\2\2^\16\3\2\2\2_`\7/\2\2`\20\3\2\2\2ab\7?\2\2b\22\3\2"+
		"\2\2cd\7*\2\2d\24\3\2\2\2ef\7+\2\2f\26\3\2\2\2gh\7}\2\2h\30\3\2\2\2ij"+
		"\7\177\2\2j\32\3\2\2\2kl\7]\2\2l\34\3\2\2\2mn\7_\2\2n\36\3\2\2\2op\7="+
		"\2\2p \3\2\2\2qs\7\17\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\f\2\2u\"\3"+
		"\2\2\2vw\7\61\2\2wx\7\61\2\2x|\3\2\2\2y{\n\2\2\2zy\3\2\2\2{~\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\b\22\2\2\u0080$\3"+
		"\2\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\23"+
		"\2\2\u0087&\3\2\2\2\u0088\u0089\7~\2\2\u0089\u008a\7~\2\2\u008a(\3\2\2"+
		"\2\u008b\u008c\7(\2\2\u008c\u008d\7(\2\2\u008d*\3\2\2\2\u008e\u008f\7"+
		"?\2\2\u008f\u0090\7?\2\2\u0090,\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0093"+
		"\7?\2\2\u0093.\3\2\2\2\u0094\u0095\7@\2\2\u0095\60\3\2\2\2\u0096\u0097"+
		"\7>\2\2\u0097\62\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a\64"+
		"\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d\66\3\2\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a08\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5:\3\2\2\2\u00a6"+
		"\u00a7\7y\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2"+
		"\u00aa\u00ab\7g\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7q\2"+
		"\2\u00ae\u00af\7t\2\2\u00af>\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7"+
		"q\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5@"+
		"\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7{\2\2\u00bbB\3\2\2\2\u00bc\u00be\t\4\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0D\3\2\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5F\3\2\2\2\u00c6"+
		"\u00c8\t\5\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\7\60\2\2\u00cc"+
		"\u00ce\t\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d4\7\60\2\2\u00d3\u00d5\t\5\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00c7\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d9H\3\2\2\2\u00da\u00e0\7$\2\2\u00db"+
		"\u00df\n\6\2\2\u00dc\u00dd\7$\2\2\u00dd\u00df\7$\2\2\u00de\u00db\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4"+
		"J\3\2\2\2\16\2r|\u0084\u00bf\u00c4\u00c9\u00cf\u00d6\u00d8\u00de\u00e0"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}