// Generated from d:\Code\Faculdade\Compiladores\analisesintatica_exemplo1\LabeledExpr.g4 by ANTLR 4.8
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
		T__0=1, MUL=2, DIV=3, ADD=4, SUB=5, ASSIGN=6, APARE=7, FPARE=8, ACHAV=9, 
		FCHAV=10, ID=11, INT=12, NEWLINE=13, WS=14, OR=15, AND=16, EQ=17, NEQ=18, 
		GT=19, LT=20, GTEQ=21, LTEQ=22, IF=23, ELSE=24, WHILE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", "FPARE", "ACHAV", 
			"FCHAV", "ID", "INT", "NEWLINE", "WS", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'*'", "'/'", "'+'", "'-'", "'='", "'('", "')'", "'{'", 
			"'}'", null, null, null, null, "'||'", "'&&'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'if'", "'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", "FPARE", "ACHAV", 
			"FCHAV", "ID", "INT", "NEWLINE", "WS", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "IF", "ELSE", "WHILE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fQ\n\f\r\f"+
		"\16\fR\3\r\6\rV\n\r\r\r\16\rW\3\16\5\16[\n\16\3\16\3\16\3\17\6\17`\n\17"+
		"\r\17\16\17a\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\5\4\2C\\c|\3\2"+
		"\62;\4\2\13\13\"\"\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5=\3"+
		"\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3"+
		"\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31U\3\2\2\2\33Z\3\2\2\2\35"+
		"_\3\2\2\2\37e\3\2\2\2!h\3\2\2\2#k\3\2\2\2%n\3\2\2\2\'q\3\2\2\2)s\3\2\2"+
		"\2+u\3\2\2\2-x\3\2\2\2/{\3\2\2\2\61~\3\2\2\2\63\u0083\3\2\2\2\65\66\7"+
		"r\2\2\66\67\7t\2\2\678\7k\2\289\7p\2\29:\7v\2\2:;\7n\2\2;<\7p\2\2<\4\3"+
		"\2\2\2=>\7,\2\2>\6\3\2\2\2?@\7\61\2\2@\b\3\2\2\2AB\7-\2\2B\n\3\2\2\2C"+
		"D\7/\2\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2GH\7*\2\2H\20\3\2\2\2IJ\7+\2\2"+
		"J\22\3\2\2\2KL\7}\2\2L\24\3\2\2\2MN\7\177\2\2N\26\3\2\2\2OQ\t\2\2\2PO"+
		"\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\30\3\2\2\2TV\t\3\2\2UT\3\2\2\2"+
		"VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\32\3\2\2\2Y[\7\17\2\2ZY\3\2\2\2Z[\3\2"+
		"\2\2[\\\3\2\2\2\\]\7\f\2\2]\34\3\2\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2\2a"+
		"_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\17\2\2d\36\3\2\2\2ef\7~\2\2fg\7~\2\2"+
		"g \3\2\2\2hi\7(\2\2ij\7(\2\2j\"\3\2\2\2kl\7?\2\2lm\7?\2\2m$\3\2\2\2no"+
		"\7#\2\2op\7?\2\2p&\3\2\2\2qr\7@\2\2r(\3\2\2\2st\7>\2\2t*\3\2\2\2uv\7@"+
		"\2\2vw\7?\2\2w,\3\2\2\2xy\7>\2\2yz\7?\2\2z.\3\2\2\2{|\7k\2\2|}\7h\2\2"+
		"}\60\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7g\2\2\u0082\62\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\64\3\2\2\2\7\2RWZ"+
		"a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}