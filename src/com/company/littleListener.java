package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class littleListener extends littleParserBaseListener {
    // TODO: Perhaps use a reference to the actual symbol table
    ArrayList<String> currentSymbolTable;
    Stack<ArrayList<String>> symbolTables;
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
        // Create symbol table
        //System.out.println(ctx.getText());
        //createBlockSymbolTable();
    }

    @Override
    public void enterWhile_stmt(littleParserParser.While_stmtContext ctx){
        // Create symbol table
        //System.out.println(ctx.getText());
        createBlockSymbolTable();
    }

    @Override
    public void enterString_decl(littleParserParser.String_declContext ctx){
        this.currentSymbolTable.add("name " + ctx.id().getText() + " type " + ctx.children.get(0).getText() + " value " + ctx.str().getText());
    }

    @Override
    public void enterVar_decl(littleParserParser.Var_declContext ctx){
        String varType = ctx.var_type().getText();
        currentSymbolTable.add("name "+ctx.id_list().id().getText()+" type "+varType);
        littleParserParser.Id_tailContext idlctx = ctx.id_list().id_tail();
        while(idlctx.id() != null){
            currentSymbolTable.add("name " + idlctx.id().getText() + " type " + varType);
            idlctx = idlctx.id_tail();
        }
    }

    private void createSymbolTable(String name){
        this.symbolTables.push(new ArrayList<>());
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
            Stack<String> tempStack2 = new Stack<>();
            for(String i : symbolTables.pop()){
                tempStack2.push(i);
            }
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
}
