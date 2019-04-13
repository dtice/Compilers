package com.company;

import java.util.LinkedHashMap;
import java.util.Stack;


public class littleListener extends littleParserBaseListener {
    // Symbol Table initialization
    LinkedHashMap<String,String> currentSymbolTable;
    Stack<LinkedHashMap<String,String>> symbolTables;
    Stack<String> symbolTableNames;
    int blockNum;

    // AST/Semantic Stack initialization
    AST ast;
    Stack<ASTNode> semanticStack = new Stack<>();

    public littleListener(){
        this.symbolTables = new Stack<>();
        this.symbolTableNames = new Stack<>();
        this.blockNum = 1;
    }

    @Override
    public void enterAddop(littleParserParser.AddopContext ctx) {
        ASTNode addopNode = new ASTNode("AddExpr");
        addopNode.value = ctx.getText();
        this.semanticStack.push(addopNode);
    }

    @Override
    public void enterMulop(littleParserParser.MulopContext ctx) {
        ASTNode mulopNode = new ASTNode("MulExpr");
        mulopNode.value = ctx.getText();
        this.semanticStack.push(mulopNode);
    }

    @Override
    public void enterId(littleParserParser.IdContext ctx){
        ASTNode primaryNode = new ASTNode("VarRef");
        primaryNode.value = ctx.IDENTIFIER().getText();
        this.semanticStack.push(primaryNode);
    }
    
    @Override
    public void enterPgm_body(littleParserParser.Pgm_bodyContext ctx){
        // Create symbol table
        createSymbolTable("GLOBAL");
    }

    @Override
    public void enterIf_stmt(littleParserParser.If_stmtContext ctx){
        // Create symbol table
        createBlockSymbolTable();
    }

    @Override
    public void enterFunc_decl(littleParserParser.Func_declContext ctx){
        // Create symbol table
        createSymbolTable(ctx.id().getText());
    }

    @Override
    public void enterElse_part(littleParserParser.Else_partContext ctx){
        if(ctx.decl() != null){
            createBlockSymbolTable();
        }
    }

    @Override
    public void enterWhile_stmt(littleParserParser.While_stmtContext ctx){
        // Create symbol table
        createBlockSymbolTable();
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
            symbolTables.pop().forEach((k,v)-> tempStack2.push("name "+k+" "+v));
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

    public AST generateAST(){
        ASTNode curNode = this.semanticStack.pop();
        while(curNode != null){
            System.out.println(curNode.type + ": " + curNode.value);
            if(this.semanticStack.size() == 0) break;
            curNode = this.semanticStack.pop();
        }
        return this.ast;
    }
}
