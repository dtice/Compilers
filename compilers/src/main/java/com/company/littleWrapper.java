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
      } catch(IOException e) {
          System.out.println("Input file not found");
          return;
      }
  }
}