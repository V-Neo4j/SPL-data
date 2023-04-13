// Generated from apoc/custom/Signature.g4 by ANTLR 4.7.2
package apoc.custom;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SignatureParser}.
 */
public interface SignatureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SignatureParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(SignatureParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(SignatureParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SignatureParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SignatureParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#results}.
	 * @param ctx the parse tree
	 */
	void enterResults(SignatureParser.ResultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#results}.
	 * @param ctx the parse tree
	 */
	void exitResults(SignatureParser.ResultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SignatureParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SignatureParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(SignatureParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(SignatureParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(SignatureParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(SignatureParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SignatureParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SignatureParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(SignatureParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(SignatureParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SignatureParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SignatureParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SignatureParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SignatureParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(SignatureParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(SignatureParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type(SignatureParser.Opt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type(SignatureParser.Opt_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(SignatureParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(SignatureParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SignatureParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SignatureParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(SignatureParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(SignatureParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(SignatureParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(SignatureParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(SignatureParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(SignatureParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(SignatureParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(SignatureParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignatureParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void enterMapValue(SignatureParser.MapValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignatureParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void exitMapValue(SignatureParser.MapValueContext ctx);
}