package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Scanner;

public class littleWrapper {
    littleParserLexer lpl = null;
    CommonTokenStream cts = null;
    littleParserParser lpp = null;
    littleListener ll = null;

  public littleWrapper(String input) {
      CharStream cs = null;
      try {
          cs = CharStreams.fromFileName(input);
          this.lpl = new littleParserLexer(cs);
          this.cts = new CommonTokenStream(lpl);
          this.lpp = new littleParserParser(cts);
      } catch(IOException e){
          System.out.println("Input file not found");
          return;
      }
      ParseTree tree = this.lpp.program();
      littleListener listener = new littleListener();
      ParseTreeWalker walker = new ParseTreeWalker();
      this.lpl.removeErrorListeners();
      walker.walk(listener,tree);
      if(this.lpp.getNumberOfSyntaxErrors() > 0){
          System.out.println("Not Accepted");
      } else {
          System.out.println("Accepted");
      }
  }

  public static void main(String[] args){
      //System.out.println("What is the path to the input file? > ");
      //Scanner in = new Scanner(System.in);
      //String input = in.nextLine();
      String input = null;
      if(args.length == 0){
          System.out.println("Error: Please provide a path to the input file.");
      } else {
          input = args[0];
      }
      littleWrapper lw = new littleWrapper(input);
      //in.close();
  }
}