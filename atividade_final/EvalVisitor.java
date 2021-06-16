import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();
    Map<String, Boolean> memoryConst = new HashMap<String, Boolean>();
    Map<String, int[]> list_memory = new HashMap<String, int[]>();

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        try{
            String id = ctx.ID().getText();

            if (memoryConst.containsKey(id))
                throw new Exception("Erro de compilação: Valor da constante não pode ser alterado.");
    
            int value = visit(ctx.expr());
    
            memory.put(id, value);
    
            return value;
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return 0;
    }
    
    /** PRINTLN */
    @Override
    public Integer visitPrintln(LabeledExprParser.PrintlnContext ctx) { 
        Integer value = visit(ctx.expr());
        
        if (value != Integer.MIN_VALUE)
            System.out.println(value);
        
        return 0; 
    }
    
    // Comentário
    @Override
    public Integer visitComentary(LabeledExprParser.ComentaryContext ctx) {
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

        if(memory.containsKey(id)) 
            return memory.get(id);

        return 0;
    }


    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        try {
            int left = visit(ctx.expr(0));
            int right = visit(ctx.expr(1));

            if(ctx.op.getType() == LabeledExprParser.MUL) 
                return left * right;
                
            if (right == 0) {
                throw new Exception("Erro de compilação: Não é possível realizar divisão por zero.");
            }

            return left / right;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
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
    public Integer visitIf_else_stat(LabeledExprParser.If_else_statContext ctx) {
        LabeledExprParser.Condition_blockContext condition = ctx.condition_block();

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
    public Integer visitWhile_stat(LabeledExprParser.While_statContext ctx) {
        int condition = this.visit(ctx.expr());

        while(condition == 1) {
            this.visit(ctx.code_block());
            condition = this.visit(ctx.expr());
        }

        return 0;
    }
    
    private void assingFor(String id, int value){
        memory.put(id, value);
    }
    
    @Override
    public Integer visitFor_stat(LabeledExprParser.For_statContext ctx){
        String id = ctx.ID().getText();
        assingFor(id, visit(ctx.expr(0)));
        int condition = this.visit(ctx.expr(1));

        for (int x = memory.get(id); condition == 1; x++)
        {
            visit(ctx.code_block());
            memory.put(id, x);
            condition = this.visit(ctx.expr(1));
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
        try {
            int left = this.visit(ctx.expr(0));
            int right = this.visit(ctx.expr(1));

            switch (ctx.op.getType()) {
                case LabeledExprParser.EQ:
                    return left == right ? 1 : 0;
                case LabeledExprParser.NEQ:
                    return left != right ? 1 : 0;
                default:
                    throw new Exception("Erro de compilação: Operador inválido.");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
    }
    
    @Override
    public Integer visitRelationalExpr(LabeledExprParser.RelationalExprContext ctx) {
        try {
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
                    throw new Exception("Erro de compilação: Operador inválido.");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
    }
    
    @Override
    public Integer visitConst_stat(LabeledExprParser.Const_statContext ctx) {
        try {
            String id = ctx.ID().getText();
            
            if (memoryConst.containsKey(id)){
                throw new Exception("Erro de compilação: constante " + id + "já declarada.");
            } else {
                int value = this.visit(ctx.expr());

                memory.put(id, value);
                memoryConst.put(id, true);
        
                return value;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
    }
    
    @Override 
    public Integer visitLength(LabeledExprParser.LengthContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
    
    @Override 
    public Integer visitPosition(LabeledExprParser.PositionContext ctx) { 
        return Integer.valueOf(ctx.INT().getText());
    }
    
    @Override
    public Integer visitArray_declaration(LabeledExprParser.Array_declarationContext ctx) { 
        try {
            String id = ctx.ID().getText();
            
            if (list_memory.containsKey(id)) {
                throw new Exception("Erro de compilação. Variável já declarada.");
            }
            
            int length =this.visit(ctx.length());
            list_memory.put(id, new int[length]);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
    }
    
    @Override 
    public Integer visitArray_assign(LabeledExprParser.Array_assignContext ctx) {
        try {
            String id = ctx.ID().getText();
            Integer position = visit(ctx.position());
            Integer value = Integer.valueOf(ctx.INT().getText());
            
            if (!list_memory.containsKey(id)) {
                throw new Exception("Erro de compilação. Variável não existe.");
            }
            
            list_memory.get(id)[position] = value;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
    }
    
    @Override 
    public Integer visitArray_access(LabeledExprParser.Array_accessContext ctx) { 
        try {
            String id = ctx.ID().getText();
            Integer position = visit(ctx.position());
            
            if (!list_memory.containsKey(id)) {
                throw new Exception("Erro de compilação. Variável não existe.");
            }
            
            return list_memory.get(id)[position];
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        return 0;
    }
    
    @Override 
    public Integer visitConcatStringFirst(LabeledExprParser.ConcatStringFirstContext ctx) { 
        String text = ctx.STRING().getText().replace("\"", "");
        Integer expr = visit(ctx.expr());
        
        System.out.println(text + expr);
        
        // POG DEVIDO A NÃO FAZERMOS A TIPAGEM =/ SAD BUT TRUE
        return Integer.MIN_VALUE;
    }
    
    @Override 
    public Integer visitConcatExprFirst(LabeledExprParser.ConcatExprFirstContext ctx) { 
        String text = ctx.STRING().getText().replace("\"", "");
        Integer expr = visit(ctx.expr());
        
        System.out.println(expr + text);
        
        // POG DEVIDO A NÃO FAZERMOS A TIPAGEM =/ SAD BUT TRUE
        return Integer.MIN_VALUE;
    }
}