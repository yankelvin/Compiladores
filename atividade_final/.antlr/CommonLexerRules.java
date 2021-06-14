// Generated from d:\Code\Faculdade\Compiladores\atividade_final\CommonLexerRules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, ASSIGN=5, APARE=6, FPARE=7, ACHAV=8, FCHAV=9, 
		PTVIG=10, NEWLINE=11, COMMENT=12, WS=13, OR=14, AND=15, EQ=16, NEQ=17, 
		GT=18, LT=19, GTEQ=20, LTEQ=21, IF=22, ELSE=23, WHILE=24, TYPE_INT=25, 
		TYPE_FLOAT=26, TYPE_STRING=27, ID=28, INT=29, FLOAT=30, STRING=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", "FPARE", "ACHAV", "FCHAV", 
			"PTVIG", "NEWLINE", "COMMENT", "WS", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE", "TYPE_INT", "TYPE_FLOAT", 
			"TYPE_STRING", "ID", "INT", "FLOAT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'('", "')'", "'{'", "'}'", 
			"';'", null, null, null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'if'", "'else'", "'while'", "'int'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", "FPARE", "ACHAV", 
			"FCHAV", "PTVIG", "NEWLINE", "COMMENT", "WS", "OR", "AND", "EQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE", "TYPE_INT", "TYPE_FLOAT", 
			"TYPE_STRING", "ID", "INT", "FLOAT", "STRING"
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


	public CommonLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexerRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\5\fW\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r_\n\r\f\r\16\rb\13\r"+
		"\3\r\3\r\3\16\6\16g\n\16\r\16\16\16h\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\6\35\u00a3\n\35\r\35\16\35\u00a4\3"+
		"\36\6\36\u00a8\n\36\r\36\16\36\u00a9\3\37\6\37\u00ad\n\37\r\37\16\37\u00ae"+
		"\3\37\3\37\7\37\u00b3\n\37\f\37\16\37\u00b6\13\37\3\37\3\37\6\37\u00ba"+
		"\n\37\r\37\16\37\u00bb\5\37\u00be\n\37\3 \3 \3 \3 \7 \u00c4\n \f \16 "+
		"\u00c7\13 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\3"+
		"\2\62;\5\2\f\f\17\17$$\2\u00d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5"+
		"C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21"+
		"O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27V\3\2\2\2\31Z\3\2\2\2\33f\3\2\2\2"+
		"\35l\3\2\2\2\37o\3\2\2\2!r\3\2\2\2#u\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3"+
		"\2\2\2+\177\3\2\2\2-\u0082\3\2\2\2/\u0085\3\2\2\2\61\u008a\3\2\2\2\63"+
		"\u0090\3\2\2\2\65\u0094\3\2\2\2\67\u009a\3\2\2\29\u00a2\3\2\2\2;\u00a7"+
		"\3\2\2\2=\u00bd\3\2\2\2?\u00bf\3\2\2\2AB\7,\2\2B\4\3\2\2\2CD\7\61\2\2"+
		"D\6\3\2\2\2EF\7-\2\2F\b\3\2\2\2GH\7/\2\2H\n\3\2\2\2IJ\7?\2\2J\f\3\2\2"+
		"\2KL\7*\2\2L\16\3\2\2\2MN\7+\2\2N\20\3\2\2\2OP\7}\2\2P\22\3\2\2\2QR\7"+
		"\177\2\2R\24\3\2\2\2ST\7=\2\2T\26\3\2\2\2UW\7\17\2\2VU\3\2\2\2VW\3\2\2"+
		"\2WX\3\2\2\2XY\7\f\2\2Y\30\3\2\2\2Z[\7\61\2\2[\\\7\61\2\2\\`\3\2\2\2]"+
		"_\n\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\b\r\2\2d\32\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ij\3\2\2\2jk\b\16\2\2k\34\3\2\2\2lm\7~\2\2mn\7~\2\2n\36\3\2\2\2op\7"+
		"(\2\2pq\7(\2\2q \3\2\2\2rs\7?\2\2st\7?\2\2t\"\3\2\2\2uv\7#\2\2vw\7?\2"+
		"\2w$\3\2\2\2xy\7@\2\2y&\3\2\2\2z{\7>\2\2{(\3\2\2\2|}\7@\2\2}~\7?\2\2~"+
		"*\3\2\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2\u0081,\3\2\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7h\2\2\u0084.\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7y\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7g\2\2\u008f\62\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7v\2\2\u0093\64\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7n\2\2\u0096"+
		"\u0097\7q\2\2\u0097\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099\66\3\2\2\2\u009a"+
		"\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2"+
		"\u009e\u009f\7p\2\2\u009f\u00a0\7i\2\2\u00a08\3\2\2\2\u00a1\u00a3\t\4"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5:\3\2\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa<\3"+
		"\2\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\7\60"+
		"\2\2\u00b1\u00b3\t\5\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00ac\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be>\3\2\2\2\u00bf\u00c5"+
		"\7$\2\2\u00c0\u00c4\n\6\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c4\7$\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\7$\2\2\u00c9@\3\2\2\2\16\2V`h\u00a4\u00a9\u00ae\u00b4\u00bb\u00bd"+
		"\u00c3\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}