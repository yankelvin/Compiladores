import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();

        int value = visit(ctx.expr());

        memory.put(id, value);

        return value;

    }
    
    /** PRINTLN */
    @Override
    public Integer visitPrintln(LabeledExprParser.PrintlnContext ctx) { 
        Integer value = visit(ctx.expr());
        
        System.out.println(value);
        
        return 0; 
    }

    /** INT */
    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID */
    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if(memory.containsKey(id)) return memory.get(id);

        return 0;
    }


    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));

        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LabeledExprParser.MUL) return left * right;

        return left / right;
    }

    /** expr op=('+' | '-') */
    @Override
    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LabeledExprParser.ADD) return left + right;

        return left - right;

    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
    
    // if override
    @Override
    public Integer visitIf_else(LabeledExprParser.If_elseContext ctx) {
        LabeledExprParser.ConditionContext condition = ctx.condition();

        boolean evaluatedBlock = false;

        int evaluated = this.visit(condition.expr());

        if (evaluated == 1) {
            evaluatedBlock = true;
            this.visit(condition.code_block());
        }

        if (!evaluatedBlock && ctx.code_block() != null) {
            this.visit(ctx.code_block());
        }

        return 0;
    }
    
    @Override
    public Integer visitAndExpr(LabeledExprParser.AndExprContext ctx) {
        int left = this.visit(ctx.expr(0));
        int right = this.visit(ctx.expr(1));
        
        return left == 1 && right == 1 ? 1 : 0;
    }
    
    @Override
    public Integer visitOrExpr(LabeledExprParser.OrExprContext ctx) {
        int left = this.visit(ctx.expr(0));
        int right = this.visit(ctx.expr(1));
        
        return left == 1 || right == 1 ? 1 : 0;
    }
    
    @Override
    public Integer visitEqualityExpr(LabeledExprParser.EqualityExprContext ctx) {

        int left = this.visit(ctx.expr(0));
        int right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.EQ:
                return left == right ? 1 : 0;
            case LabeledExprParser.NEQ:
                return left != right ? 1 : 0;
            default:
                return 0;
        }
    }
    
    @Override
    public Integer visitRelationalExpr(LabeledExprParser.RelationalExprContext ctx) {
        int left = this.visit(ctx.expr(0));
        int right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LabeledExprParser.LT:
                return left < right ? 1 : 0;
            case LabeledExprParser.LTEQ:
                return left <= right ? 1 : 0;
            case LabeledExprParser.GT:
                return left > right ? 1 : 0;
            case LabeledExprParser.GTEQ:
                return left >= right ? 1 : 0;
            default:
                return 0;
        }
    }
}