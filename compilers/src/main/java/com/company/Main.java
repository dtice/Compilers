package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void old_main(String input) throws IOException{
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
        String generatedCode = listener.generateTinyCode();

        String[] filePath = input.split("/");
        String fileName = filePath[filePath.length - 1].replace(".micro", ".out");
        BufferedWriter bw = new BufferedWriter(new FileWriter("test_out/"+fileName));
        bw.write(generatedCode);
        bw.close();
    }
    public static void main(String[] args){
        String debug_input = "input/test_mult.micro";
        if(!debug_input.isEmpty()){
            try{
                old_main(debug_input);
            } catch(IOException e){
                System.out.println("Error: file not found");
            }
        }
        else if(args.length < 1){
            Scanner in = new Scanner(System.in);
            System.out.println("What is the path to your input file? > ");
            String input = in.nextLine();
            in.close();
            try{
                old_main(input);
            } catch(IOException e){
                System.out.println("Error: file not found");
            }
        } 
        else {
            try{
                old_main(args[0]);
            } catch(IOException e){
                System.out.println("Error: file not found");
            }
        }
    }
}
