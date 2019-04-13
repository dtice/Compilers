package com.company;

import java.util.Scanner;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void old_main(String input){
        littleWrapper lw = new littleWrapper(input);
        ParseTree tree = lw.lpp.program();
        littleListener listener = new littleListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        lw.lpl.removeErrorListeners();
        // Parse input
        walker.walk(listener,tree);

        // Print Symbol Tables
        listener.printSymbolTables();

        // Generate and print AST
        AST ast = listener.generateAST();

        // Traverse AST to generate code
    }
    public static void main(String[] args){
        if(args.length < 1){
            Scanner in = new Scanner(System.in);
            System.out.println("What is the path to your input file? > ");
            String input = in.nextLine();
            in.close();
            old_main(input);
        } else {
            old_main(args[0]);
        }
    }
}
