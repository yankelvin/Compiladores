// Generated from d:\Code\Faculdade\Compiladores\atividade_final\LabeledExpr.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ASSIGN=8, APARE=9, 
		FPARE=10, ACHAV=11, FCHAV=12, PTVIG=13, NEWLINE=14, COMMENT=15, WS=16, 
		OR=17, AND=18, EQ=19, NEQ=20, GT=21, LT=22, GTEQ=23, LTEQ=24, IF=25, ELSE=26, 
		WHILE=27, TYPE_INT=28, TYPE_FLOAT=29, TYPE_STRING=30, ID=31, INT=32, FLOAT=33, 
		STRING=34;
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
			"TYPE_INT", "TYPE_FLOAT", "TYPE_STRING", "ID", "INT", "FLOAT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'/*'", "'*/'", "'*'", "'/'", "'+'", "'-'", "'='", 
			"'('", "')'", "'{'", "'}'", "';'", null, null, null, "'||'", "'&&'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'if'", "'else'", "'while'", 
			"'int'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", 
			"FPARE", "ACHAV", "FCHAV", "PTVIG", "NEWLINE", "COMMENT", "WS", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE", 
			"TYPE_INT", "TYPE_FLOAT", "TYPE_STRING", "ID", "INT", "FLOAT", "STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\5\17k\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"s\n\20\f\20\16\20v\13\20\3\20\3\20\3\21\6\21{\n\21\r\21\16\21|\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00b7"+
		"\n \r \16 \u00b8\3!\6!\u00bc\n!\r!\16!\u00bd\3\"\6\"\u00c1\n\"\r\"\16"+
		"\"\u00c2\3\"\3\"\7\"\u00c7\n\"\f\"\16\"\u00ca\13\"\3\"\3\"\6\"\u00ce\n"+
		"\"\r\"\16\"\u00cf\5\"\u00d2\n\"\3#\3#\3#\3#\7#\u00d8\n#\f#\16#\u00db\13"+
		"#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\3"+
		"\2\62;\5\2\f\f\17\17$$\2\u00e8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5O\3\2\2\2\7R\3\2\2\2\tU\3\2\2\2\13W\3"+
		"\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c"+
		"\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35j\3\2\2\2\37n\3\2\2\2!z\3\2\2\2#\u0080"+
		"\3\2\2\2%\u0083\3\2\2\2\'\u0086\3\2\2\2)\u0089\3\2\2\2+\u008c\3\2\2\2"+
		"-\u008e\3\2\2\2/\u0090\3\2\2\2\61\u0093\3\2\2\2\63\u0096\3\2\2\2\65\u0099"+
		"\3\2\2\2\67\u009e\3\2\2\29\u00a4\3\2\2\2;\u00a8\3\2\2\2=\u00ae\3\2\2\2"+
		"?\u00b6\3\2\2\2A\u00bb\3\2\2\2C\u00d1\3\2\2\2E\u00d3\3\2\2\2GH\7r\2\2"+
		"HI\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2LM\7n\2\2MN\7p\2\2N\4\3\2\2\2OP\7"+
		"\61\2\2PQ\7,\2\2Q\6\3\2\2\2RS\7,\2\2ST\7\61\2\2T\b\3\2\2\2UV\7,\2\2V\n"+
		"\3\2\2\2WX\7\61\2\2X\f\3\2\2\2YZ\7-\2\2Z\16\3\2\2\2[\\\7/\2\2\\\20\3\2"+
		"\2\2]^\7?\2\2^\22\3\2\2\2_`\7*\2\2`\24\3\2\2\2ab\7+\2\2b\26\3\2\2\2cd"+
		"\7}\2\2d\30\3\2\2\2ef\7\177\2\2f\32\3\2\2\2gh\7=\2\2h\34\3\2\2\2ik\7\17"+
		"\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\f\2\2m\36\3\2\2\2no\7\61\2\2op"+
		"\7\61\2\2pt\3\2\2\2qs\n\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"uw\3\2\2\2vt\3\2\2\2wx\b\20\2\2x \3\2\2\2y{\t\3\2\2zy\3\2\2\2{|\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\21\2\2\177\"\3\2\2\2\u0080\u0081"+
		"\7~\2\2\u0081\u0082\7~\2\2\u0082$\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085"+
		"\7(\2\2\u0085&\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088\7?\2\2\u0088(\3"+
		"\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7?\2\2\u008b*\3\2\2\2\u008c\u008d"+
		"\7@\2\2\u008d,\3\2\2\2\u008e\u008f\7>\2\2\u008f.\3\2\2\2\u0090\u0091\7"+
		"@\2\2\u0091\u0092\7?\2\2\u0092\60\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095"+
		"\7?\2\2\u0095\62\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\64"+
		"\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7g\2\2\u009d\66\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7j\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a38\3\2\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7:\3\2\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7c\2\2"+
		"\u00ac\u00ad\7v\2\2\u00ad<\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2"+
		"\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7i\2\2\u00b4>\3\2\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9@\3\2\2\2\u00ba"+
		"\u00bc\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00beB\3\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c8\7\60\2\2\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00d2\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\60\2\2\u00cc\u00ce\t"+
		"\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d1\u00cb\3\2"+
		"\2\2\u00d2D\3\2\2\2\u00d3\u00d9\7$\2\2\u00d4\u00d8\n\6\2\2\u00d5\u00d6"+
		"\7$\2\2\u00d6\u00d8\7$\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$\2\2\u00ddF\3\2\2\2\16\2jt|\u00b8"+
		"\u00bd\u00c2\u00c8\u00cf\u00d1\u00d7\u00d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}