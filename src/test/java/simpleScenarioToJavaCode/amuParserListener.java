// Generated from /Users/admin/IdeaProjects/com.diaAppTest/src/amuParser.g4 by ANTLR 4.9.1
package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link amuParser}.
 */
public interface amuParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link amuParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(amuParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(amuParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#testCases}.
	 * @param ctx the parse tree
	 */
	void enterTestCases(amuParser.TestCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#testCases}.
	 * @param ctx the parse tree
	 */
	void exitTestCases(amuParser.TestCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(amuParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(amuParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#test_close}.
	 * @param ctx the parse tree
	 */
	void enterTest_close(amuParser.Test_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#test_close}.
	 * @param ctx the parse tree
	 */
	void exitTest_close(amuParser.Test_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#scenarios}.
	 * @param ctx the parse tree
	 */
	void enterScenarios(amuParser.ScenariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#scenarios}.
	 * @param ctx the parse tree
	 */
	void exitScenarios(amuParser.ScenariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#scenario}.
	 * @param ctx the parse tree
	 */
	void enterScenario(amuParser.ScenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#scenario}.
	 * @param ctx the parse tree
	 */
	void exitScenario(amuParser.ScenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#scenario_close}.
	 * @param ctx the parse tree
	 */
	void enterScenario_close(amuParser.Scenario_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#scenario_close}.
	 * @param ctx the parse tree
	 */
	void exitScenario_close(amuParser.Scenario_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(amuParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(amuParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(amuParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(amuParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(amuParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(amuParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(amuParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(amuParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#actionClick}.
	 * @param ctx the parse tree
	 */
	void enterActionClick(amuParser.ActionClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#actionClick}.
	 * @param ctx the parse tree
	 */
	void exitActionClick(amuParser.ActionClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(amuParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(amuParser.ActionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#actionWait}.
	 * @param ctx the parse tree
	 */
	void enterActionWait(amuParser.ActionWaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#actionWait}.
	 * @param ctx the parse tree
	 */
	void exitActionWait(amuParser.ActionWaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#actionScroll}.
	 * @param ctx the parse tree
	 */
	void enterActionScroll(amuParser.ActionScrollContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#actionScroll}.
	 * @param ctx the parse tree
	 */
	void exitActionScroll(amuParser.ActionScrollContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#actionSwipe}.
	 * @param ctx the parse tree
	 */
	void enterActionSwipe(amuParser.ActionSwipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#actionSwipe}.
	 * @param ctx the parse tree
	 */
	void exitActionSwipe(amuParser.ActionSwipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(amuParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(amuParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link amuParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(amuParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link amuParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(amuParser.PointContext ctx);
}