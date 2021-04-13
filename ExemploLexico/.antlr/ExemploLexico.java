// Generated from d:\Code\Faculdade\Compiladores\ExemploLexico\ExemploLexico.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExemploLexico extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, STRING=4, BEGIN=5, END=6, VAR=7, FALSE=8, 
		TRUE=9, WRITE=10, WHILE=11, DO=12, READ=13, COMNTR=14, OPARI=15, OPREL=16, 
		OPLOG=17, OPNEG=18, PTVIG=19, DOISPT=20, PONTO=21, ABPAR=22, FEPAR=23, 
		ATRIB=24, ID=25, NUM=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "INTEGER", "BOOLEAN", "STRING", "BEGIN", "END", "VAR", "FALSE", 
			"TRUE", "WRITE", "WHILE", "DO", "READ", "COMNTR", "OPARI", "OPREL", "OPLOG", 
			"OPNEG", "PTVIG", "DOISPT", "PONTO", "ABPAR", "FEPAR", "ATRIB", "ID", 
			"NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'integer'", "'boolean'", null, "'begin'", "'end'", 
			"'var'", "'false'", "'true'", "'write'", "'while'", "'do'", "'read'", 
			"'//'", null, null, null, "'~'", "';'", "':'", "'.'", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "STRING", "BEGIN", "END", "VAR", 
			"FALSE", "TRUE", "WRITE", "WHILE", "DO", "READ", "COMNTR", "OPARI", "OPREL", 
			"OPLOG", "OPNEG", "PTVIG", "DOISPT", "PONTO", "ABPAR", "FEPAR", "ATRIB", 
			"ID", "NUM", "WS"
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


	public ExemploLexico(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExemploLexico.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0097\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u009e\n"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\7\32\u00b1\n\32\f\32\16\32\u00b4\13\32\3\33\7\33\u00b7"+
		"\n\33\f\33\16\33\u00ba\13\33\3\33\6\33\u00bd\n\33\r\33\16\33\u00be\3\34"+
		"\6\34\u00c2\n\34\r\34\16\34\u00c3\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\t\3\2c|\4\2\62;c|\5\2"+
		",-//\61\61\4\2>>@@\4\2--//\3\2\62;\5\2\13\f\17\17\"\"\2\u00d0\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5A\3\2\2\2\7"+
		"I\3\2\2\2\tQ\3\2\2\2\13[\3\2\2\2\ra\3\2\2\2\17e\3\2\2\2\21i\3\2\2\2\23"+
		"o\3\2\2\2\25t\3\2\2\2\27z\3\2\2\2\31\u0080\3\2\2\2\33\u0083\3\2\2\2\35"+
		"\u0088\3\2\2\2\37\u008b\3\2\2\2!\u0096\3\2\2\2#\u009d\3\2\2\2%\u009f\3"+
		"\2\2\2\'\u00a1\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9"+
		"\3\2\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2\2\65\u00b8\3\2\2\2\67\u00c1\3"+
		"\2\2\29:\7r\2\2:;\7t\2\2;<\7q\2\2<=\7i\2\2=>\7t\2\2>?\7c\2\2?@\7o\2\2"+
		"@\4\3\2\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2DE\7g\2\2EF\7i\2\2FG\7g\2\2GH\7"+
		"t\2\2H\6\3\2\2\2IJ\7d\2\2JK\7q\2\2KL\7q\2\2LM\7n\2\2MN\7g\2\2NO\7c\2\2"+
		"OP\7p\2\2P\b\3\2\2\2QR\7$\2\2RV\t\2\2\2SU\t\3\2\2TS\3\2\2\2UX\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7$\2\2Z\n\3\2\2\2[\\\7d\2\2"+
		"\\]\7g\2\2]^\7i\2\2^_\7k\2\2_`\7p\2\2`\f\3\2\2\2ab\7g\2\2bc\7p\2\2cd\7"+
		"f\2\2d\16\3\2\2\2ef\7x\2\2fg\7c\2\2gh\7t\2\2h\20\3\2\2\2ij\7h\2\2jk\7"+
		"c\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\22\3\2\2\2op\7v\2\2pq\7t\2\2qr\7w\2"+
		"\2rs\7g\2\2s\24\3\2\2\2tu\7y\2\2uv\7t\2\2vw\7k\2\2wx\7v\2\2xy\7g\2\2y"+
		"\26\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177\30\3\2"+
		"\2\2\u0080\u0081\7f\2\2\u0081\u0082\7q\2\2\u0082\32\3\2\2\2\u0083\u0084"+
		"\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7f\2\2\u0087"+
		"\34\3\2\2\2\u0088\u0089\7\61\2\2\u0089\u008a\7\61\2\2\u008a\36\3\2\2\2"+
		"\u008b\u008c\t\4\2\2\u008c \3\2\2\2\u008d\u0097\t\5\2\2\u008e\u008f\7"+
		"@\2\2\u008f\u0097\7?\2\2\u0090\u0091\7>\2\2\u0091\u0097\7?\2\2\u0092\u0093"+
		"\7?\2\2\u0093\u0097\7?\2\2\u0094\u0095\7>\2\2\u0095\u0097\7@\2\2\u0096"+
		"\u008d\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0092\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\"\3\2\2\2\u0098\u0099\7q\2\2\u0099\u009e"+
		"\7t\2\2\u009a\u009b\7c\2\2\u009b\u009c\7p\2\2\u009c\u009e\7f\2\2\u009d"+
		"\u0098\3\2\2\2\u009d\u009a\3\2\2\2\u009e$\3\2\2\2\u009f\u00a0\7\u0080"+
		"\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7=\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7<\2"+
		"\2\u00a4*\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7*\2"+
		"\2\u00a8.\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7<\2"+
		"\2\u00ac\u00ad\7?\2\2\u00ad\62\3\2\2\2\u00ae\u00b2\t\2\2\2\u00af\u00b1"+
		"\t\3\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\64\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\t\6\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\t\7\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\66\3\2\2\2\u00c0\u00c2\t\b\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\b\34\2\2\u00c68\3\2\2\2\n\2V\u0096\u009d\u00b2\u00b8\u00be\u00c3"+
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