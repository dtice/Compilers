package com.company;

import java.awt.List;
import java.util.LinkedHashMap;
import java.util.Stack;
import com.company.littleParserParser.Assign_exprContext;
import org.antlr.v4.runtime.ParserRuleContext;


public class littleListener extends littleParserBaseListener {
    // Symbol Table initialization
    LinkedHashMap<String,String> currentSymbolTable;
    Stack<LinkedHashMap<String,String>> symbolTables;
    Stack<String> symbolTableNames;
    int blockNum;

    Stack<ASTNode> semanticStack = new Stack<>();
    Stack<ASTNode> exprStack = new Stack<>();
    Stack<ASTNode> orderedExprStack = new Stack<>();
    List semanticList = new List();

    public littleListener(){
        this.symbolTables = new Stack<>();
        this.symbolTableNames = new Stack<>();
        this.blockNum = 1;
    }

    @Override
    public void exitAssign_expr(Assign_exprContext ctx) {
        BinaryOpNode equal = new BinaryOpNode(null, ":=");
        equal.addRightChild(exprStack.pop());
        VarRefNode vrn = new VarRefNode();
        vrn.setValue(ctx.id().getText());
        equal.addLeftChild(vrn);
        exprStack.push(equal);
    }

    @Override
    public void exitWhile_stmt(littleParserParser.While_stmtContext ctx){
        exprStack.push(new ExitWhileNode());
    }

    @Override
    public void exitIf_stmt(littleParserParser.If_stmtContext ctx){
        exprStack.push(new EndIfNode());
    }

    @Override
    public void exitCond(littleParserParser.CondContext ctx){
        if(exprStack.size() > 1){
            ASTNode a = exprStack.pop();
            ASTNode b = exprStack.pop();
            BinaryOpNode cond = new BinaryOpNode("Conditional", ctx.compop().getText());
            cond.addRightChild(a);
            cond.addLeftChild(b);
            exprStack.push(cond);
        }
    }

    @Override
    public void exitExpr(littleParserParser.ExprContext ctx){
        if(semanticStack.size() > 1){
            ASTNode a = semanticStack.pop();
            ASTNode b = semanticStack.pop();
            if(b instanceof BinaryOpNode){
                BinaryOpNode b0 = (BinaryOpNode)b;
                b0.addRightChild(a);
                semanticStack.push(b0);
            }
        }
        if(littleParserParser.ruleNames[ctx.getParent().getRuleIndex()] == "primary"){

        }
        else{
            exprStack.push(semanticStack.pop());
        }
    }

    @Override
    public void exitFactor(littleParserParser.FactorContext ctx){
        if(semanticStack.size() > 1){
            ASTNode a = semanticStack.pop();
            ASTNode b = semanticStack.pop();
            if(b instanceof BinaryOpNode){
                BinaryOpNode b0 = (BinaryOpNode)b;
                b0.addRightChild(a);
                semanticStack.push(b0);
            }
        }
    }

    @Override
    public void exitExpr_prefix(littleParserParser.Expr_prefixContext ctx) {
        if(ctx.addop() != null){
            AddExprNode aen = new AddExprNode(ctx.addop().getText());
            // When expr_prefix is null
            if(ctx.expr_prefix().getText() == ""){
                ASTNode vrn = semanticStack.pop();
                aen.addLeftChild(vrn);
            }
            // When expr_prefix is not null
            else {
                ASTNode vrn = semanticStack.pop();
                System.out.println("VRN Print");
                System.out.println(vrn);
                BinaryOpNode an = (BinaryOpNode)semanticStack.pop();
                System.out.println("AN Print");
                System.out.println(an);
                an.addRightChild(vrn);
                aen.addLeftChild(an);
            }
            semanticStack.push(aen);
        }
    }

    @Override
    public void enterPostfix_expr(littleParserParser.Postfix_exprContext ctx){
        // System.out.println(ctx.getText());
        // System.out.println("--------");
        if(ctx.primary() != null){
            // Var Ref
            // System.out.println(ctx.primary().getText());
            if(ctx.primary().id() != null){
                VarRefNode vrn = new VarRefNode();
                vrn.setValue(ctx.primary().id().getText());
                String type = symbolTables.get(0).get(ctx.primary().id().getText());
                vrn.setType(type);
                semanticStack.push(vrn);
            }
            // Int Literal
            else if(ctx.primary().INTLITERAL() != null){
                LiteralNode intLit = new LiteralNode("INT", ctx.primary().INTLITERAL().getText());
                semanticStack.push(intLit);
            }
            // Float Literal
            else if(ctx.primary().FLOATLITERAL() != null){
                LiteralNode floatLit = new LiteralNode("FLOAT", ctx.primary().FLOATLITERAL().getText());
                semanticStack.push(floatLit);
            }
        }
    }

    @Override
    public void exitFactor_prefix(littleParserParser.Factor_prefixContext ctx){
        if(ctx != null){
            if(ctx.mulop() != null){
                MulExprNode men = new MulExprNode(ctx.mulop().getText());
                if(ctx.factor_prefix().getText() == ""){
                    ASTNode vrn = semanticStack.pop();
                    men.addLeftChild(vrn);
                }
                else{
                    ASTNode vrn = semanticStack.pop();
                    BinaryOpNode mn = (BinaryOpNode)semanticStack.pop();
                    mn.addRightChild(vrn);
                    men.addLeftChild(mn);
                }
                semanticStack.push(men);
            }
        }
    }
    
    @Override
    public void enterPgm_body(littleParserParser.Pgm_bodyContext ctx){
        // Create symbol table
        createSymbolTable("GLOBAL");
    }

    @Override
    public void enterIf_stmt(littleParserParser.If_stmtContext ctx){
        // Create symbol table
        exprStack.push(new IfNode());
        createBlockSymbolTable();
    }

    @Override
    public void enterWrite_stmt(littleParserParser.Write_stmtContext ctx){
        exprStack.push(new ASTNode("WriteStmt"));
    }

    @Override
    public void enterRead_stmt(littleParserParser.Read_stmtContext ctx){
        exprStack.push(new ASTNode("ReadStmt"));
        
    }

    @Override
    public void enterReturn_stmt(littleParserParser.Return_stmtContext ctx){
        exprStack.push(new ASTNode("ReturnStmt"));

    }

    @Override
    public void enterFunc_decl(littleParserParser.Func_declContext ctx){
        // Create symbol table
        createSymbolTable(ctx.id().getText());
    }

    @Override
    public void enterElse_part(littleParserParser.Else_partContext ctx){
        exprStack.push(new ElseNode());
        if(ctx.decl() != null){
            createBlockSymbolTable();
        }
    }

    @Override
    public void enterWhile_stmt(littleParserParser.While_stmtContext ctx){
        // Create symbol table
        createBlockSymbolTable();
        exprStack.push(new WhileNode());
    }

    @Override
    public void enterString_decl(littleParserParser.String_declContext ctx){
        insertSymbolTableStr(ctx.id().getText(), ctx.children.get(0).getText(), ctx.str().getText());
    }

    @Override
    public void enterVar_decl(littleParserParser.Var_declContext ctx){
        String varType = ctx.var_type().getText();
        insertSymbolTableVar(ctx.id_list().id().getText(), varType);
        littleParserParser.Id_tailContext idlctx = ctx.id_list().id_tail();
        while(idlctx.id() != null){
            insertSymbolTableVar(idlctx.id().getText(), varType);
            idlctx = idlctx.id_tail();
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // if(!semanticStack.empty()){
        //     System.out.println("---------------");
        //     System.out.println("Rule: " + littleParserParser.ruleNames[ctx.getRuleIndex()]);
        //     System.out.println("-----Stack-----");
        //     System.out.println("Printing with forEach:");
        //     semanticStack.forEach(c -> System.out.println(c));
        //     System.out.println("---------------");
        // }
    }

    @Override
    public void enterParam_decl_list(littleParserParser.Param_decl_listContext ctx){
        if(ctx.param_decl() != null) {
            String varType = ctx.param_decl().var_type().getText();
            String name = ctx.param_decl().id().getText();
            insertSymbolTableVar(name, varType);
            littleParserParser.Param_decl_tailContext pdtctx = ctx.param_decl_tail();
            while (pdtctx.param_decl() != null) {
                varType = pdtctx.param_decl().var_type().getText();
                name = pdtctx.param_decl().id().getText();
                insertSymbolTableVar(name, varType);
                pdtctx = pdtctx.param_decl_tail();
            }
        }
    }

    private void insertSymbolTableVar(String name, String type){
        if(this.currentSymbolTable.containsKey(name)){
            System.out.println("DECLARATION ERROR "+name);
            System.exit(-1);
        } else {
            this.currentSymbolTable.put(name, "type "+type);
        }
    }

    private void insertSymbolTableStr(String name, String type, String val){
        if(this.currentSymbolTable.containsKey(name)){
            System.out.println("DECLARATION ERROR "+name);
            System.exit(-1);
        } else {
            this.currentSymbolTable.put(name, "type "+type+" value "+val);
        }
    }

    private void createSymbolTable(String name){
        this.symbolTables.push(new LinkedHashMap<>());
        this.symbolTableNames.push(name);
        this.currentSymbolTable = symbolTables.peek();
    }

    private void createBlockSymbolTable(){
        // Push new symbol table on stack
        String name = "BLOCK "+this.blockNum;
        createSymbolTable(name);
        this.blockNum++;
    }

    public void printSymbolTables(){
        Stack<String> tempStack = new Stack<>();
        while(!this.symbolTables.empty()){
            Stack<String> tempStack2 = new Stack<>();
            symbolTables.pop().forEach((k,v)-> tempStack2.push("name " + k + " " + v));
            while(!tempStack2.empty()){
                tempStack.push(tempStack2.pop());
            }
            tempStack.push("Symbol table " + symbolTableNames.pop());
            tempStack.push("\n");
        }
        while(!tempStack.empty()){
            System.out.println(tempStack.pop());
        }
    }

    void printPostorder(ASTNode node) { 
        if (node instanceof VarRefNode){
            // System.out.print(node.value + " "); 
            semanticList.add(node.value);
            return; 
        }
            
        if(node instanceof BinaryOpNode){
            BinaryOpNode bnode = (BinaryOpNode)node;
            
            // first recur on left subtree 
            printPostorder(bnode.leftChild); 
            
            // then recur on right subtree 
            printPostorder(bnode.rightChild); 
            
            // now deal with the node 
            // System.out.print(bnode.operator + " "); 
            semanticList.add(bnode.operator);
        }
    }

    public String generateTinyCode(){
        String code = ";IR code\n";
        int i = 0;
        int j = 0;
        while(!exprStack.isEmpty()){
            orderedExprStack.push(exprStack.pop());
        }
        while(!orderedExprStack.isEmpty()){
            //code += orderedExprStack.pop().toString() + '\n';
            printPostorder(orderedExprStack.pop());
        }
        Stack<String> testStack = new Stack<>();
        String currentNode = semanticList.getItem(i);
        i++;
        while(i < semanticList.getItemCount()){
            testStack.push(currentNode);
            currentNode = semanticList.getItem(i);
            i++;
            while(testStack.peek().matches("[+]|[-]|[*]|[/]|[(:=)]")){
                String operator = testStack.pop();
                String rightSide = testStack.pop();
                String leftSide = testStack.pop();
                switch(operator){
                    case "+":
                        code += "addi " + leftSide + " " + rightSide + " $T"+j+'\n';
                        testStack.push("$T"+j);
                        j++;
                        break;
                    case "-":
                        code += "subi " + leftSide + " " + rightSide + " $T"+j+'\n';
                        testStack.push("$T"+j);
                        j++;
                        break;
                    case "/":
                        code += "divi " + leftSide + " " + rightSide + " $T"+j+'\n';
                        testStack.push("$T"+j);
                        j++;
                        break;
                    case "*":
                        code += "muli " + leftSide + " " + rightSide + " $T"+j+'\n';
                        testStack.push("$T"+j);
                        j++;
                        break;
                    case ":=":
                        code += "STOREI " + rightSide + "$T" + j + '\n';
                        code += "STOREI " + "$T" + j + " " + leftSide + '\n';
                        testStack.push("$T"+j);
                        j++;
                        break;
                }
            }
        }
        return code;
    }
}
