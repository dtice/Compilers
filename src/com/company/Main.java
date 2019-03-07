package com.company;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("What is the path to the Little source file? > ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        littleWrapper lw = new littleWrapper(input);
        ParseTree tree = lw.lpp.program();
        littleListener listener = new littleListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        lw.lpl.removeErrorListeners();
        walker.walk(listener,tree);
        listener.printSymbolTables();
    }
}
