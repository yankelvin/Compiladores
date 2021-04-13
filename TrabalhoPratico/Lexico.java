// Generated from .\Lexico.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexico extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, IF=2, ELSE=3, WHILE=4, DO=5, PTVIG=6, ABCHAV=7, FECHAV=8, ABPAR=9, 
		FEPAR=10, ATRIB=11, OPARI=12, OPREL=13, COMNTR=14, ID=15, NUM=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "IF", "ELSE", "WHILE", "DO", "PTVIG", "ABCHAV", "FECHAV", "ABPAR", 
			"FEPAR", "ATRIB", "OPARI", "OPREL", "COMNTR", "ID", "NUM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'else'", "'while'", "'do'", "';'", "'{'", "'}'", 
			"'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "IF", "ELSE", "WHILE", "DO", "PTVIG", "ABCHAV", "FECHAV", 
			"ABPAR", "FEPAR", "ATRIB", "OPARI", "OPREL", "COMNTR", "ID", "NUM", "WS"
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


	public Lexico(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexico.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16X\n\16\3\17\3\17\3\17\3\17\7\17^\n\17\f\17\16\17a\13\17\3\17"+
		"\3\17\3\17\3\20\3\20\7\20h\n\20\f\20\16\20k\13\20\3\21\7\21n\n\21\f\21"+
		"\16\21q\13\21\3\21\6\21t\n\21\r\21\16\21u\3\22\6\22y\n\22\r\22\16\22z"+
		"\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\t\3\2c|\4\2\62;c|\5\2,-//\61\61\4\2"+
		">>@@\4\2--//\3\2\62;\5\2\13\f\17\17\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5/\3\2"+
		"\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13=\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D"+
		"\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33W\3\2\2\2\35"+
		"Y\3\2\2\2\37e\3\2\2\2!o\3\2\2\2#x\3\2\2\2%&\7$\2\2&*\t\2\2\2\')\t\3\2"+
		"\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7$\2"+
		"\2.\4\3\2\2\2/\60\7k\2\2\60\61\7h\2\2\61\6\3\2\2\2\62\63\7g\2\2\63\64"+
		"\7n\2\2\64\65\7u\2\2\65\66\7g\2\2\66\b\3\2\2\2\678\7y\2\289\7j\2\29:\7"+
		"k\2\2:;\7n\2\2;<\7g\2\2<\n\3\2\2\2=>\7f\2\2>?\7q\2\2?\f\3\2\2\2@A\7=\2"+
		"\2A\16\3\2\2\2BC\7}\2\2C\20\3\2\2\2DE\7\177\2\2E\22\3\2\2\2FG\7*\2\2G"+
		"\24\3\2\2\2HI\7+\2\2I\26\3\2\2\2JK\7?\2\2K\30\3\2\2\2LM\t\4\2\2M\32\3"+
		"\2\2\2NX\t\5\2\2OP\7@\2\2PX\7?\2\2QR\7>\2\2RX\7?\2\2ST\7?\2\2TX\7?\2\2"+
		"UV\7>\2\2VX\7@\2\2WN\3\2\2\2WO\3\2\2\2WQ\3\2\2\2WS\3\2\2\2WU\3\2\2\2X"+
		"\34\3\2\2\2YZ\7\61\2\2Z[\7,\2\2[_\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^a\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7,\2\2cd\7\61\2\2d\36\3"+
		"\2\2\2ei\t\2\2\2fh\t\3\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j \3"+
		"\2\2\2ki\3\2\2\2ln\t\6\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2rt\t\7\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\""+
		"\3\2\2\2wy\t\b\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|"+
		"}\b\22\2\2}$\3\2\2\2\n\2*W_iouz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}