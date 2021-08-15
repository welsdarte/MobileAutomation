// Generated from /Users/admin/IdeaProjects/com.diaAppTest/src/amuParser.g4 by ANTLR 4.9.1
package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link amuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface amuParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link amuParser#scenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario(amuParser.ScenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(amuParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(amuParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(amuParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(amuParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(amuParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#actionClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionClick(amuParser.ActionClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionType(amuParser.ActionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#actionWait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionWait(amuParser.ActionWaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#actionScroll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionScroll(amuParser.ActionScrollContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#actionSwipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionSwipe(amuParser.ActionSwipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(amuParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link amuParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(amuParser.PointContext ctx);
}