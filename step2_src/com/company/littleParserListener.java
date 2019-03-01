package com.company;

// Generated from littleParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link littleParserParser}.
 */
public interface littleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link littleParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(littleParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(littleParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(littleParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(littleParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(littleParserParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(littleParserParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(littleParserParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(littleParserParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(littleParserParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(littleParserParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(littleParserParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(littleParserParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(littleParserParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(littleParserParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(littleParserParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(littleParserParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(littleParserParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(littleParserParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(littleParserParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(littleParserParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(littleParserParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(littleParserParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(littleParserParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(littleParserParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(littleParserParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(littleParserParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(littleParserParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(littleParserParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(littleParserParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(littleParserParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(littleParserParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(littleParserParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(littleParserParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(littleParserParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(littleParserParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(littleParserParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(littleParserParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(littleParserParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(littleParserParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(littleParserParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(littleParserParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(littleParserParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(littleParserParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(littleParserParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(littleParserParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(littleParserParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(littleParserParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(littleParserParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(littleParserParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(littleParserParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(littleParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(littleParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(littleParserParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(littleParserParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(littleParserParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(littleParserParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(littleParserParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(littleParserParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(littleParserParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(littleParserParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(littleParserParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(littleParserParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(littleParserParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(littleParserParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(littleParserParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(littleParserParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(littleParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(littleParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(littleParserParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(littleParserParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(littleParserParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(littleParserParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(littleParserParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(littleParserParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(littleParserParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(littleParserParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(littleParserParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(littleParserParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(littleParserParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(littleParserParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleParserParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(littleParserParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleParserParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(littleParserParser.While_stmtContext ctx);
}