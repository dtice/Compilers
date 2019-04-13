package com.company;

import java.util.HashMap;

public class ASTNode {
    String type;
    HashMap<String, ASTNode> children = new HashMap<>();
    String value;
    public ASTNode(String type){
        this.type = type;
    }

    public void addChild(ASTNode child){
        children.put(child.type, child);
    }
    @Override
    public String toString(){
        return this.type;
    }
}
