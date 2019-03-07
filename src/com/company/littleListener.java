package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class littleListener extends littleParserBaseListener {
    // TODO:
    HashMap<String,String> currentSymbolTable;
    Stack<HashMap<String,String>> symbolTables;
    Stack<String> symbolTableNames;
    int blockNum;

    public littleListener(){
        this.symbolTables = new Stack<>();
        this.symbolTableNames = new Stack<>();
        this.blockNum = 1;
    }

    @Override
    public void enterPgm_body(littleParserParser.Pgm_bodyContext ctx){
        // Create symbol table
        createSymbolTable("GLOBAL");
    }

    @Override
    public void enterIf_stmt(littleParserParser.If_stmtContext ctx){
        // Create symbol table
        // System.out.println(ctx.getText());
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
        //this.currentSymbolTable.add("name " + ctx.id().getText() + " type " + ctx.children.get(0).getText() + " value " + ctx.str().getText());
        insertSymbolTableStr(ctx.id().getText(), ctx.children.get(0).getText(), ctx.str().getText());
    }

    @Override
    public void enterVar_decl(littleParserParser.Var_declContext ctx){
        String varType = ctx.var_type().getText();
        //currentSymbolTable.add("name "+ctx.id_list().id().getText()+" type "+varType);
        insertSymbolTableVar(ctx.id_list().id().getText(), varType);
        littleParserParser.Id_tailContext idlctx = ctx.id_list().id_tail();
        while(idlctx.id() != null){
            //currentSymbolTable.add("name " + idlctx.id().getText() + " type " + varType);
            insertSymbolTableVar(idlctx.id().getText(), varType);
            idlctx = idlctx.id_tail();
        }
    }

    @Override
    public void enterParam_decl_list(littleParserParser.Param_decl_listContext ctx){
        if(ctx.param_decl() != null) {
            String varType = ctx.param_decl().var_type().getText();
            String name = ctx.param_decl().id().getText();
            //currentSymbolTable.add("name " + name + " type " + varType);
            insertSymbolTableVar(name, varType);
            littleParserParser.Param_decl_tailContext pdtctx = ctx.param_decl_tail();
            while (pdtctx.param_decl() != null) {
                varType = pdtctx.param_decl().var_type().getText();
                name = pdtctx.param_decl().id().getText();
                //currentSymbolTable.add("name " + name + " type " + varType);
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
        this.symbolTables.push(new HashMap<>());
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
        //System.out.println(symbolTables.toString());
        Stack<String> tempStack = new Stack<>();
        while(!this.symbolTables.empty()){
            symbolTables.pop().forEach((k,v)-> tempStack.push("name "+k+" "+v));
            tempStack.push("Symbol table " + symbolTableNames.pop());
            tempStack.push("\n");
        }
        while(!tempStack.empty()){
            System.out.println(tempStack.pop());
        }
    }
}
