package com.company;

import java.util.HashMap;

class ExprPrefixNode extends ASTNode {
    ASTNode exprPrefix;
    ASTNode factor;
    ASTNode addOp;

    public ExprPrefixNode(String type) {
        super(type);
    }

    public void addChild(String type, ASTNode child){
        switch(type){
            case "exprPrefix":
                this.exprPrefix = child;
                break;
            case "factor":
                this.factor = child;
                break;
            case "addExpr":
                this.addOp = child;
                break;
        }
    }
}

class MulExprNode extends BinaryOpNode {
    MulExprNode(String op){
        super("MulExpr", op);
    }
    @Override
    public String toString(){
        return this.operator;
    }
}

class AddExprNode extends BinaryOpNode {
    AddExprNode(String op){
        super("AddExpr", op);
    }
    @Override
    public String toString(){
        // return this.leftChild.toString() + this.operator + this.rightChild.toString();
        return this.operator;
    }
    
}

class BinaryOpNode extends ASTNode {
    ASTNode leftChild;
    ASTNode rightChild;
    String operator;

    public BinaryOpNode(String name, String operator){
        super(name);
        this.operator = operator;
    }

    public void addLeftChild(ASTNode node){
        this.leftChild = node;
    }

    public void addRightChild(ASTNode node){
        this.rightChild = node;
    }
}

public class ASTNode {
    String name;
    String value;
    public ASTNode(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
