package com.company;

/**
 * @description A structure representing one 3AC instruction. Can have at most 2 source operands and one destination
 * operand
 */
public class IRNode {
    String type;
    String src1;
    String src2;
    String dest;

    public IRNode(String type, String src1, String src2, String dest){
        this.type = type;
        this.src1 = src1;
        this.src2 = src2;
        this.dest = dest;
    }

    @Override
    public String toString(){
        String returnString = this.type;
        if(!this.src1.isEmpty()){
            returnString += " " + this.src1;
        }
        if(!this.src2.isEmpty()){
            returnString += " " + this.src2;
        }
        if(!this.dest.isEmpty()){
            returnString += " " + this.dest;
        }
        return returnString;
    }
}
