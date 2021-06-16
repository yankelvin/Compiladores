// Generated from LabeledExpr.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ASSIGN=8, APARE=9, 
		FPARE=10, ACHAV=11, FCHAV=12, PTVIG=13, NEWLINE=14, COMMENT=15, WS=16, 
		OR=17, AND=18, EQ=19, NEQ=20, GT=21, LT=22, GTEQ=23, LTEQ=24, IF=25, ELSE=26, 
		WHILE=27, FOR=28, CONST=29, TYPE_INT=30, TYPE_FLOAT=31, TYPE_STRING=32, 
		ID=33, INT=34, FLOAT=35, STRING=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", 
			"FPARE", "ACHAV", "FCHAV", "PTVIG", "NEWLINE", "COMMENT", "WS", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE", 
			"FOR", "CONST", "TYPE_INT", "TYPE_FLOAT", "TYPE_STRING", "ID", "INT", 
			"FLOAT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'/*'", "'*/'", "'*'", "'/'", "'+'", "'-'", "'='", 
			"'('", "')'", "'{'", "'}'", "';'", null, null, null, "'||'", "'&&'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'if'", "'else'", "'while'", 
			"'for'", "'const'", "'int'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", 
			"FPARE", "ACHAV", "FCHAV", "PTVIG", "NEWLINE", "COMMENT", "WS", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE", 
			"FOR", "CONST", "TYPE_INT", "TYPE_FLOAT", "TYPE_STRING", "ID", "INT", 
			"FLOAT", "STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17o\n\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\7\20w\n\20\f\20\16\20z\13\20\3\20\3\20\3\21\6\21\177\n\21\r\21"+
		"\16\21\u0080\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\6\"\u00c5\n\"\r\"\16\"\u00c6\3#"+
		"\6#\u00ca\n#\r#\16#\u00cb\3$\6$\u00cf\n$\r$\16$\u00d0\3$\3$\7$\u00d5\n"+
		"$\f$\16$\u00d8\13$\3$\3$\6$\u00dc\n$\r$\16$\u00dd\5$\u00e0\n$\3%\3%\3"+
		"%\3%\7%\u00e6\n%\f%\16%\u00e9\13%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\7\4\2"+
		"\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\3\2\62;\5\2\f\f\17\17$$\2\u00f6\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\3K\3\2\2\2\5S\3\2\2\2\7V\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3"+
		"\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31"+
		"i\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37r\3\2\2\2!~\3\2\2\2#\u0084\3\2\2\2"+
		"%\u0087\3\2\2\2\'\u008a\3\2\2\2)\u008d\3\2\2\2+\u0090\3\2\2\2-\u0092\3"+
		"\2\2\2/\u0094\3\2\2\2\61\u0097\3\2\2\2\63\u009a\3\2\2\2\65\u009d\3\2\2"+
		"\2\67\u00a2\3\2\2\29\u00a8\3\2\2\2;\u00ac\3\2\2\2=\u00b2\3\2\2\2?\u00b6"+
		"\3\2\2\2A\u00bc\3\2\2\2C\u00c4\3\2\2\2E\u00c9\3\2\2\2G\u00df\3\2\2\2I"+
		"\u00e1\3\2\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7n\2\2Q"+
		"R\7p\2\2R\4\3\2\2\2ST\7\61\2\2TU\7,\2\2U\6\3\2\2\2VW\7,\2\2WX\7\61\2\2"+
		"X\b\3\2\2\2YZ\7,\2\2Z\n\3\2\2\2[\\\7\61\2\2\\\f\3\2\2\2]^\7-\2\2^\16\3"+
		"\2\2\2_`\7/\2\2`\20\3\2\2\2ab\7?\2\2b\22\3\2\2\2cd\7*\2\2d\24\3\2\2\2"+
		"ef\7+\2\2f\26\3\2\2\2gh\7}\2\2h\30\3\2\2\2ij\7\177\2\2j\32\3\2\2\2kl\7"+
		"=\2\2l\34\3\2\2\2mo\7\17\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2q"+
		"\36\3\2\2\2rs\7\61\2\2st\7\61\2\2tx\3\2\2\2uw\n\2\2\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\b\20\2\2| \3\2\2\2}\177"+
		"\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\b\21\2\2\u0083\"\3\2\2\2\u0084\u0085"+
		"\7~\2\2\u0085\u0086\7~\2\2\u0086$\3\2\2\2\u0087\u0088\7(\2\2\u0088\u0089"+
		"\7(\2\2\u0089&\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c\7?\2\2\u008c(\3"+
		"\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7?\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7@\2\2\u0091,\3\2\2\2\u0092\u0093\7>\2\2\u0093.\3\2\2\2\u0094\u0095\7"+
		"@\2\2\u0095\u0096\7?\2\2\u0096\60\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099"+
		"\7?\2\2\u0099\62\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\64"+
		"\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a78\3\2\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab:\3\2\2\2\u00ac"+
		"\u00ad\7e\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2"+
		"\2\u00b4\u00b5\7v\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7"+
		"n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb@"+
		"\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7i\2\2\u00c2B\3\2\2\2\u00c3"+
		"\u00c5\t\4\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7D\3\2\2\2\u00c8\u00ca\t\5\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"F\3\2\2\2\u00cd\u00cf\t\5\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6"+
		"\7\60\2\2\u00d3\u00d5\t\5\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00e0\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00db\7\60\2\2\u00da\u00dc\t\5\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00ce\3\2\2\2\u00df\u00d9\3\2\2\2\u00e0H\3\2\2\2\u00e1"+
		"\u00e7\7$\2\2\u00e2\u00e6\n\6\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e6\7$\2"+
		"\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7$\2\2\u00ebJ\3\2\2\2\16\2nx\u0080\u00c6\u00cb\u00d0\u00d6\u00dd"+
		"\u00df\u00e5\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}