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
		GT=19, LT=20, GTEQ=21, LTEQ=22, IF=23, ELSE=24;
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
			"LT", "GTEQ", "LTEQ", "IF", "ELSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'*'", "'/'", "'+'", "'-'", "'='", "'('", "')'", "'{'", 
			"'}'", null, null, null, null, "'||'", "'&&'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MUL", "DIV", "ADD", "SUB", "ASSIGN", "APARE", "FPARE", "ACHAV", 
			"FCHAV", "ID", "INT", "NEWLINE", "WS", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "IF", "ELSE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fO\n\f\r\f\16\fP\3\r"+
		"\6\rT\n\r\r\r\16\rU\3\16\5\16Y\n\16\3\16\3\16\3\17\6\17^\n\17\r\17\16"+
		"\17_\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2\u0084\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63"+
		"\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3"+
		"\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27N\3\2\2\2\31S\3\2\2\2\33"+
		"X\3\2\2\2\35]\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#i\3\2\2\2%l\3\2\2\2\'o\3\2"+
		"\2\2)q\3\2\2\2+s\3\2\2\2-v\3\2\2\2/y\3\2\2\2\61|\3\2\2\2\63\64\7r\2\2"+
		"\64\65\7t\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\289\7n\2\29:\7p\2\2:"+
		"\4\3\2\2\2;<\7,\2\2<\6\3\2\2\2=>\7\61\2\2>\b\3\2\2\2?@\7-\2\2@\n\3\2\2"+
		"\2AB\7/\2\2B\f\3\2\2\2CD\7?\2\2D\16\3\2\2\2EF\7*\2\2F\20\3\2\2\2GH\7+"+
		"\2\2H\22\3\2\2\2IJ\7}\2\2J\24\3\2\2\2KL\7\177\2\2L\26\3\2\2\2MO\t\2\2"+
		"\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RT\t\3\2\2SR\3\2"+
		"\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\32\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY"+
		"\3\2\2\2YZ\3\2\2\2Z[\7\f\2\2[\34\3\2\2\2\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\17\2\2b\36\3\2\2\2cd\7~\2\2de\7~"+
		"\2\2e \3\2\2\2fg\7(\2\2gh\7(\2\2h\"\3\2\2\2ij\7?\2\2jk\7?\2\2k$\3\2\2"+
		"\2lm\7#\2\2mn\7?\2\2n&\3\2\2\2op\7@\2\2p(\3\2\2\2qr\7>\2\2r*\3\2\2\2s"+
		"t\7@\2\2tu\7?\2\2u,\3\2\2\2vw\7>\2\2wx\7?\2\2x.\3\2\2\2yz\7k\2\2z{\7h"+
		"\2\2{\60\3\2\2\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080"+
		"\62\3\2\2\2\7\2PUX_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}