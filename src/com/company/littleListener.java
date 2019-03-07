package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class littleListener extends littleParserBaseListener {
    // Key: SymbolTable ID
    // Value: SymbolTable
    String currentSymbolTable;
    Stack<ArrayList<String>> symbolTables;
    Stack<String> symbolTableNames;
    int blockNum;

    public littleListener(){
        this.symbolTables = new Stack<>();
        this.symbolTableNames = new Stack<>();
        this.symbolTables.push(new ArrayList<>());
        this.blockNum = 0;
        this.symbolTableNames.push("GLOBAL");
    }

    @Override
    public void enterIf_stmt(littleParserParser.If_stmtContext ctx){
        // Push new symbol table on stack
        symbolTables.push(new ArrayList<>());
        symbolTableNames.push("BLOCK "+blockNum);
        blockNum++;
    }

    @Override
    public void enterFunc_decl(littleParserParser.Func_declContext ctx){

    }

    public void printSymbolTables(){
        while(!this.symbolTables.empty()){
            System.out.println(symbolTableNames.pop());
            for(String i : symbolTables.pop()){
                System.out.println(i);
            }
        }
    }
}
