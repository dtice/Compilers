package com.company;

import org.antlr.v4.runtime.*;
import java.io.*;
import java.util.List;
import org.antlr.v4.runtime.CharStreams;

public class Main {

    public static void main(String[] args) throws Exception
    {
        if(args.length < 0 || args[0] == ""){
            System.out.println("NOTE: Use of micro.bat requires a folder in the same directory called inputs/ which contains the\n.micro files");
            System.out.println("Usage: >micro.bat [name_of_micro_file]");
        }
        String fileName;
        String[] fileTokens = args[0].split("\\.");
        fileName = fileTokens[0];
        FileWriter fw;
        CharStream cs = CharStreams.fromFileName("./inputs/"+args[0]);
        littleLexer ll = new littleLexer(cs);
        Vocabulary v = ll.getVocabulary();

        fw = new FileWriter(fileName+".out");
        Token currentToken = ll.nextToken();
        while(currentToken.getText() != "<EOF>"){
            fw.write("Token Type: "+v.getSymbolicName(currentToken.getType())+'\n');
            System.out.println("Token Type: "+v.getSymbolicName(currentToken.getType()));
            fw.write("Value: " + currentToken.getText()+'\n');
            System.out.println("Value: " + currentToken.getText());
            currentToken = ll.nextToken();
        }
        System.out.println("Outputting to "+fileName+".out...");
        fw.close();

    }
}
