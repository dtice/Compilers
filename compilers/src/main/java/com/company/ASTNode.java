package com.company;

class WhileNode extends ASTNode {
    BinaryOpNode conditional;
    ASTNode stmt_list;
    
    WhileNode(){
        super("While Node");
    }
}

class ExitWhileNode extends ASTNode{
    ExitWhileNode(){
        super("Exit While Node");
    }
}

class ElseNode extends ASTNode {
    ASTNode stmt_list;

    ElseNode(){
        super("Else Node");
    }
}

class IfNode extends ASTNode {
    BinaryOpNode conditional;
    ASTNode stmt_list;
    ASTNode else_part;
    
    IfNode(){
        super("If Node");
    }
}

class EndIfNode extends ASTNode {
    EndIfNode(){
        super("EndIf node");
    }
}

class LiteralNode extends VarRefNode {
    LiteralNode(String type, String value){
        this.type = type;
        this.value = value;
    }
}

class VarRefNode extends ASTNode {
    protected String type;
    VarRefNode(){
        super("VarRef");
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public String toString(){
        return String.format("(%s, %s, %s)", this.name, this.value, this.type);
    }
}

class MulExprNode extends BinaryOpNode {
    MulExprNode(String op){
        super("MulExpr", op);
    }
}

class AddExprNode extends BinaryOpNode {
    AddExprNode(String op){
        super("AddExpr", op);
    }
}

class BinaryOpNode extends ASTNode {
    ASTNode leftChild;
    ASTNode rightChild;
    String operator;

    public BinaryOpNode(String name, String operator){
        super(name);
        this.operator = operator;
        this.leftChild = new ASTNode();
        this.rightChild = new ASTNode();
    }

    public void addLeftChild(ASTNode node){
        this.leftChild = node;
    }

    public void addRightChild(ASTNode node){
        this.rightChild = node;
    }

    @Override
    public String toString(){
        return String.format("(Op: %s, lChild: %s, rChild: %s)", this.operator, this.leftChild.toString(), this.rightChild.toString());
    }
}

public class ASTNode {
    protected String name;
    protected String value;

    public ASTNode(){}

    public ASTNode(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("(%s, %s)", this.name, this.value);
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
