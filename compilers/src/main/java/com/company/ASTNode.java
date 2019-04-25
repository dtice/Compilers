package com.company;

class FactorNode extends ASTNode{
    FactorPrefixNode fpn;
    PostFixExprNode pfen;
    FactorNode(){
        super("Factor");
    }
}

class FactorPrefixNode extends ASTNode{
    FactorPrefixNode fpn;
    PostFixExprNode pfen;
    MulExprNode men;
    FactorPrefixNode(){
        super("FactorPrefix");
    }
}

class ExprPrefixNode extends ASTNode {
    ExprPrefixNode epn;
    FactorNode fn;
    AddExprNode aen;
    ExprPrefixNode(){
        super("ExprPrefix");
    }
}

class PostFixExprNode extends ASTNode {

}

class VarRefNode extends ASTNode {
    private String type;
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
    // @Override
    // public String toString(){
    //     return String.format("(MulExpr, %s)", this.operator);
    // }
}

class AddExprNode extends BinaryOpNode {
    AddExprNode(String op){
        super("AddExpr", op);
    }

    // @Override
    // public String toString(){
    //     return String.format("(AddExpr, %s)", this.operator);
    // }
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
