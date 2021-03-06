// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ASSIGN=8, APARE=9, 
		FPARE=10, ACHAV=11, FCHAV=12, ACOL=13, FCOL=14, PTVIG=15, NEWLINE=16, 
		COMMENT=17, WS=18, OR=19, AND=20, EQ=21, NEQ=22, GT=23, LT=24, GTEQ=25, 
		LTEQ=26, IF=27, ELSE=28, WHILE=29, FOR=30, CONST=31, ARRAY=32, STRING=33, 
		ID=34, INT=35, FLOAT=36;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_length = 2, RULE_position = 3, RULE_expr = 4, 
		RULE_const_stat = 5, RULE_if_else_stat = 6, RULE_for_stat = 7, RULE_while_stat = 8, 
		RULE_condition_block = 9, RULE_code_block = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "length", "position", "expr", "const_stat", "if_else_stat", 
			"for_stat", "while_stat", "condition_block", "code_block"
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
			"WHILE", "FOR", "CONST", "ARRAY", "STRING", "ID", "INT", "FLOAT"
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

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NEWLINE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << CONST) | (1L << ARRAY) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComentaryContext extends StatContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ComentaryContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitComentary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnContext extends StatContext {
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public PrintlnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_declarationContext extends StatContext {
		public TerminalNode ARRAY() { return getToken(LabeledExprParser.ARRAY, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ACOL() { return getToken(LabeledExprParser.ACOL, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode FCOL() { return getToken(LabeledExprParser.FCOL, 0); }
		public Array_declarationContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoneContext extends StatContext {
		public If_else_statContext if_else_stat() {
			return getRuleContext(If_else_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Const_statContext const_stat() {
			return getRuleContext(Const_statContext.class,0);
		}
		public NoneContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_assignContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ACOL() { return getToken(LabeledExprParser.ACOL, 0); }
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public TerminalNode FCOL() { return getToken(LabeledExprParser.FCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(LabeledExprParser.ASSIGN, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public Array_assignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArray_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LabeledExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__0);
				setState(28);
				match(APARE);
				setState(29);
				expr(0);
				setState(30);
				match(FPARE);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(ID);
				setState(33);
				match(ASSIGN);
				setState(34);
				expr(0);
				setState(35);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				if_else_stat();
				}
				break;
			case 4:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				while_stat();
				}
				break;
			case 5:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				for_stat();
				}
				break;
			case 6:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				const_stat();
				}
				break;
			case 8:
				_localctx = new Array_declarationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				match(ARRAY);
				setState(43);
				match(ID);
				setState(44);
				match(ACOL);
				setState(45);
				length();
				setState(46);
				match(FCOL);
				}
				break;
			case 9:
				_localctx = new Array_assignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				match(ID);
				setState(49);
				match(ACOL);
				setState(50);
				position();
				setState(51);
				match(FCOL);
				setState(52);
				match(ASSIGN);
				setState(53);
				match(INT);
				}
				break;
			case 10:
				_localctx = new ComentaryContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(55);
				match(T__1);
				setState(56);
				prog();
				setState(57);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LabeledExprParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LabeledExprParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatStringFirstContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConcatStringFirstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConcatStringFirst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_accessContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ACOL() { return getToken(LabeledExprParser.ACOL, 0); }
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public TerminalNode FCOL() { return getToken(LabeledExprParser.FCOL, 0); }
		public Array_accessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatExprFirstContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public ConcatExprFirstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConcatExprFirst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(LabeledExprParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(LabeledExprParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(LabeledExprParser.LT, 0); }
		public TerminalNode GT() { return getToken(LabeledExprParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LabeledExprParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new Array_accessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(ID);
				setState(67);
				match(ACOL);
				setState(68);
				position();
				setState(69);
				match(FCOL);
				}
				break;
			case 2:
				{
				_localctx = new ConcatStringFirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(STRING);
				setState(72);
				match(ADD);
				setState(73);
				expr(5);
				}
				break;
			case 3:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(APARE);
				setState(77);
				expr(0);
				setState(78);
				match(FPARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(83);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(86);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(89);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(92);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(95);
						match(AND);
						setState(96);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(98);
						match(OR);
						setState(99);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ConcatExprFirstContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(101);
						match(ADD);
						setState(102);
						match(STRING);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Const_statContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LabeledExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public Const_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConst_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_statContext const_stat() throws RecognitionException {
		Const_statContext _localctx = new Const_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CONST);
			setState(109);
			match(ID);
			setState(110);
			match(ASSIGN);
			setState(111);
			expr(0);
			setState(112);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LabeledExprParser.IF, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(LabeledExprParser.ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIf_else_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_statContext if_else_stat() throws RecognitionException {
		If_else_statContext _localctx = new If_else_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			condition_block();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(116);
				match(ELSE);
				setState(117);
				code_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LabeledExprParser.FOR, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LabeledExprParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PTVIG() { return getToken(LabeledExprParser.PTVIG, 0); }
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FOR);
			setState(121);
			match(APARE);
			setState(122);
			match(ID);
			setState(123);
			match(ASSIGN);
			setState(124);
			expr(0);
			setState(125);
			match(PTVIG);
			setState(126);
			expr(0);
			setState(127);
			match(FPARE);
			setState(128);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LabeledExprParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(WHILE);
			setState(131);
			expr(0);
			setState(132);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			expr(0);
			setState(135);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode ACHAV() { return getToken(LabeledExprParser.ACHAV, 0); }
		public TerminalNode FCHAV() { return getToken(LabeledExprParser.FCHAV, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_code_block);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACHAV:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ACHAV);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NEWLINE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << CONST) | (1L << ARRAY) | (1L << ID))) != 0)) {
					{
					{
					setState(138);
					stat();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(FCHAV);
				}
				break;
			case T__0:
			case T__1:
			case NEWLINE:
			case IF:
			case WHILE:
			case FOR:
			case CONST:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"j\n\6\f\6\16\6m\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\by\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091\13\f\3\f\3\f\5\f\u0095\n\f\3\f\2"+
		"\3\n\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2\6\7\3\2\b\t\3\2\31\34\3\2\27"+
		"\30\2\u00a3\2\31\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nR\3\2\2\2\f"+
		"n\3\2\2\2\16t\3\2\2\2\20z\3\2\2\2\22\u0084\3\2\2\2\24\u0088\3\2\2\2\26"+
		"\u0094\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2"+
		"\33\34\3\2\2\2\34\3\3\2\2\2\35\36\7\3\2\2\36\37\7\13\2\2\37 \5\n\6\2 "+
		"!\7\f\2\2!>\3\2\2\2\"#\7$\2\2#$\7\n\2\2$%\5\n\6\2%&\7\22\2\2&>\3\2\2\2"+
		"\'>\5\16\b\2(>\5\22\n\2)>\5\20\t\2*>\7\22\2\2+>\5\f\7\2,-\7\"\2\2-.\7"+
		"$\2\2./\7\17\2\2/\60\5\6\4\2\60\61\7\20\2\2\61>\3\2\2\2\62\63\7$\2\2\63"+
		"\64\7\17\2\2\64\65\5\b\5\2\65\66\7\20\2\2\66\67\7\n\2\2\678\7%\2\28>\3"+
		"\2\2\29:\7\4\2\2:;\5\2\2\2;<\7\5\2\2<>\3\2\2\2=\35\3\2\2\2=\"\3\2\2\2"+
		"=\'\3\2\2\2=(\3\2\2\2=)\3\2\2\2=*\3\2\2\2=+\3\2\2\2=,\3\2\2\2=\62\3\2"+
		"\2\2=9\3\2\2\2>\5\3\2\2\2?@\7%\2\2@\7\3\2\2\2AB\7%\2\2B\t\3\2\2\2CD\b"+
		"\6\1\2DE\7$\2\2EF\7\17\2\2FG\5\b\5\2GH\7\20\2\2HS\3\2\2\2IJ\7#\2\2JK\7"+
		"\b\2\2KS\5\n\6\7LS\7%\2\2MS\7$\2\2NO\7\13\2\2OP\5\n\6\2PQ\7\f\2\2QS\3"+
		"\2\2\2RC\3\2\2\2RI\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2Sk\3\2\2\2TU\f"+
		"\16\2\2UV\t\2\2\2Vj\5\n\6\17WX\f\r\2\2XY\t\3\2\2Yj\5\n\6\16Z[\f\f\2\2"+
		"[\\\t\4\2\2\\j\5\n\6\r]^\f\13\2\2^_\t\5\2\2_j\5\n\6\f`a\f\n\2\2ab\7\26"+
		"\2\2bj\5\n\6\13cd\f\t\2\2de\7\25\2\2ej\5\n\6\nfg\f\6\2\2gh\7\b\2\2hj\7"+
		"#\2\2iT\3\2\2\2iW\3\2\2\2iZ\3\2\2\2i]\3\2\2\2i`\3\2\2\2ic\3\2\2\2if\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\13\3\2\2\2mk\3\2\2\2no\7!\2\2op"+
		"\7$\2\2pq\7\n\2\2qr\5\n\6\2rs\7\22\2\2s\r\3\2\2\2tu\7\35\2\2ux\5\24\13"+
		"\2vw\7\36\2\2wy\5\26\f\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2z{\7 \2\2{|\7"+
		"\13\2\2|}\7$\2\2}~\7\n\2\2~\177\5\n\6\2\177\u0080\7\21\2\2\u0080\u0081"+
		"\5\n\6\2\u0081\u0082\7\f\2\2\u0082\u0083\5\26\f\2\u0083\21\3\2\2\2\u0084"+
		"\u0085\7\37\2\2\u0085\u0086\5\n\6\2\u0086\u0087\5\26\f\2\u0087\23\3\2"+
		"\2\2\u0088\u0089\5\n\6\2\u0089\u008a\5\26\f\2\u008a\25\3\2\2\2\u008b\u008f"+
		"\7\r\2\2\u008c\u008e\5\4\3\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0095\7\16\2\2\u0093\u0095\5\4\3\2\u0094\u008b\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\27\3\2\2\2\n\33=Rikx\u008f\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}