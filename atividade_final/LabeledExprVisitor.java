// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(LabeledExprParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(LabeledExprParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LabeledExprParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(LabeledExprParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(LabeledExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(LabeledExprParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LabeledExprParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(LabeledExprParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LabeledExprParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(LabeledExprParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LabeledExprParser.WhileContext ctx);
}