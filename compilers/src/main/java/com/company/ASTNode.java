package com.company;

import java.util.ArrayList;

public class ASTNode {
    String name;
    ArrayList<ASTNode> children = new ArrayList<>();
    public ASTNode(String name){
        this.name = name;
    }

    public void addChild(ASTNode child){
        children.add(child);
    }
}
