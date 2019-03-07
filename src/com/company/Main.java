package com.company;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;

public class Main {
    public static void old_main(String input){
        littleWrapper lw = new littleWrapper(input);
        ParseTree tree = lw.lpp.program();
        littleListener listener = new littleListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        lw.lpl.removeErrorListeners();
        walker.walk(listener,tree);
        listener.printSymbolTables();
    }
    public static void main(String[] args){
        if(args.length < 1){
            Scanner in = new Scanner(System.in);
            System.out.println("What is the path to your input file? > ");
            String input = in.nextLine();
            old_main(input);
        } else {
            old_main(args[0]);
        }
    }
}
