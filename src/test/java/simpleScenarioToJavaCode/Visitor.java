package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Visitor extends amuParserBaseVisitor<Object>{

    public ArrayList<ArrayList<String>> statementsArray = new ArrayList<>();
    public ArrayList<String> declarations = new ArrayList<>();
    public ArrayList<String> statements   = new ArrayList<>();
    public ArrayList<String> tests        = new ArrayList<>();
    //public static ArrayList<String> comments   = new ArrayList<>();
    public ArrayList<String> scenarioNames    = new ArrayList<>();
    public String scenarioName;
    String currentDeclaration;
    String currentStatement ;
    Point currentPoint;
    final int DEFAULT_THEN_TIME       = 1750;
    final int DEFAULT_AND_TIME        = 350;
    final int DEFAULT_WAIT_TIME       = 15; //in seconds
    final int DEFAULT_SWIPE_PX_AMOUNT = 300;
    final int DEFAULT_TOUCH_DISTANCE  = 200;
    final int DEFAULT_SWIPE_TIME      = 700;


    @Override
    public Object visitBody(amuParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Object visitTestCases(amuParser.TestCasesContext ctx) {
        return super.visitTestCases(ctx);
    }

    @Override
    public Object visitTest(amuParser.TestContext ctx) {
        System.out.println(ctx);
        tests.add(ctx.TEST_OPEN().toString());
        return super.visitTest(ctx);
    }

    @Override
    public Object visitTest_close(amuParser.Test_closeContext ctx) {
        tests.add("$testsEnd$");
        return super.visitTest_close(ctx);
    }

    @Override
    public Object visitScenario_close(amuParser.Scenario_closeContext ctx) {

        statementsArray.add(new ArrayList<>(statements));
        statements = new ArrayList<>();

        return super.visitScenario_close(ctx);
    }

    @Override
    public Object visitScenario(amuParser.ScenarioContext ctx) {
        scenarioName = ctx.SCENARIO_OPEN().toString().substring(0, ctx.SCENARIO_OPEN().toString().indexOf("{")).replaceAll(" ","");
        scenarioNames.add(scenarioName);

        return super.visitScenario(ctx);
    }

    @Override
    public Object visitLine(amuParser.LineContext ctx) {

        return super.visitLine(ctx);
    }

    @Override
    public Object visitLabel(amuParser.LabelContext ctx) {

        tests.add(ctx.SCENARIO_REF().toString());
        // ??
        statements.add(ctx.SCENARIO_REF().toString().substring(1,ctx.SCENARIO_REF().toString().length()-1)+"();");

        return super.visitLabel(ctx);
    }

    @Override
    public Object visitAction(amuParser.ActionContext ctx) {

        if( ctx.actionClick() != null){
            ctx.actionClick();
        }else if( ctx.actionType() != null){
            ctx.actionType();
        }else if( ctx.actionWait() != null){
            ctx.actionWait();
        }else if( ctx.actionScroll() != null){
            ctx.actionScroll();
        }else if( ctx.actionSwipe() != null) {
            ctx.actionSwipe();
        }

        return super.visitAction(ctx);
    }

    @Override
    public Object visitEnd(amuParser.EndContext ctx) {
        if(ctx.THEN() != null){
            currentStatement +="\nThread.sleep("+DEFAULT_THEN_TIME+");";
            //statements.add("Thread.sleep("+DEFAULT_THEN_TIME+");");
        }else if(ctx.AND() != null){
            currentStatement += "\nThread.sleep("+DEFAULT_AND_TIME+");";
            //statements.add("Thread.sleep("+DEFAULT_AND_TIME+");");
        }

        if(currentDeclaration != null && !declarations.contains(currentDeclaration))    declarations.add(currentDeclaration);

        if(currentStatement   != null )                                                 statements.add(currentStatement);

        return super.visitEnd(ctx);
    }

    @Override
    public Object visitActionClick(amuParser.ActionClickContext ctx) {
        if(ctx.element() != null && ctx.DIRECTION() == null){
            String id = identifierGenerator(ctx.element().STRING().toString());
            if(ctx.element().STRING().toString().charAt(ctx.element().STRING().toString().length() - 2) == '*'){
                currentDeclaration = "@FindBy(xpath = \"//*[contains(@text,'"+f(ctx.element().STRING())+"')]\")\n";
            }else{
                currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element().STRING())+"']\")\n";
            }
            currentDeclaration+= "public WebElement "+id+";";
            currentStatement = id+".click();";
        }else if(ctx.point() != null){
            visitPoint(ctx.point());
            currentStatement = "new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point("+currentPoint.x+", "+currentPoint.y+")).release().perform();";
        }else if(ctx.DIRECTION() != null && ctx.X_PIXEL() == null){
            String id = identifierGenerator(ctx.element().STRING().toString());
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element().STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ id+";";
            currentStatement =  "int Y_"+id+" = "+id+".getLocation().getY() + ("+id+".getSize().getHeight() / 2);\n" +
                    "int X_"+id+" = "+id+".getLocation().getX() + ("+id+".getSize().getWidth() / 2);\n";
            currentStatement += "new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point("+getTouchCoordinates(ctx.DIRECTION().toString(),id,DEFAULT_TOUCH_DISTANCE)+")).release().perform();";
        }else if(ctx.DIRECTION() != null && ctx.X_PIXEL() != null){
            String id = identifierGenerator(ctx.element().STRING().toString());
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element().STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ id+";";
            currentStatement =  "int Y_"+id+" = "+id+".getLocation().getY() + ("+id+".getSize().getHeight() / 2);\n" +
                    "int X_"+id+" = "+id+".getLocation().getX() + ("+id+".getSize().getWidth() / 2);\n";
            currentStatement += "new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point("+getTouchCoordinates(ctx.DIRECTION().toString(),id,Integer.parseInt(ctx.X_PIXEL().toString().substring(0,ctx.X_PIXEL().toString().indexOf("p"))))+")).release().perform();";
        }else{ // ex. the third switch
            String x_th = ctx.X_TH().toString();
            int index = Integer.parseInt(x_th.substring(0,x_th.length() - 2));
            String ID = identifierGenerator("switch_"+index+"_");
            currentDeclaration = "@FindBy(xpath = \"//android.widget.Switch["+index+"]\")\n";
            currentDeclaration+= "public WebElement "+ID+";"; // ids can be mixed if there are multiple uses of indexable element finds

            currentStatement = ID+".click();";
        }
        return super.visitActionClick(ctx);
    }

    @Override
    public Object visitActionType(amuParser.ActionTypeContext ctx) {
        System.out.println(":: "+ctx.STRING());
        if(ctx.element() == null){
            currentDeclaration = "@FindBy(xpath = \"//*[@focused='true']\")\n";
            String randomId = randomIdGenerator();
            currentDeclaration+= "public WebElement EditText_"+randomId+";";
            if(ctx.STRING().toString().equals("<ENTER>")){
                currentStatement ="Actions action"+randomId+" = new Actions(AppDriver.getDriver());\n";
            }else{
                currentStatement ="EditText_"+randomId+".clear();\n";
                currentStatement+="EditText_"+randomId+".sendKeys("+ ctx.STRING().toString().replaceAll("\n","")+");\n";
                currentStatement+="Actions action"+randomId+" = new Actions(AppDriver.getDriver());\n";
            }
            currentStatement+="action"+randomId+".sendKeys(Keys.ENTER).perform();";
        }else{
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element().STRING())+"']\")\n";
            String ID = identifierGenerator(ctx.element().STRING().toString());
            currentDeclaration+= "public WebElement "+ ID + ";";
            if(ctx.STRING().toString().equals("<ENTER>")){
                currentStatement ="Actions action"+identifierGenerator(ctx.element().STRING().toString())+" = new Actions(AppDriver.getDriver());\n";
                currentStatement+="action"+identifierGenerator(ctx.element().STRING().toString())+".sendKeys(Keys.ENTER).perform();";
            }
            else{
                currentStatement =ID+".clear();\n";
                currentStatement+=ID+".sendKeys("+ ctx.STRING()+");";
            }
        }
        return super.visitActionType(ctx);
    }

    @Override
    public Object visitActionWait(amuParser.ActionWaitContext ctx) {
        if(ctx.X_SECONDS() != null){
            currentStatement="Thread.sleep("+ctx.X_SECONDS().toString().replace(" seconds", "")+" *1000);";
        }else{
            currentStatement="Thread.sleep("+DEFAULT_WAIT_TIME * 1000+");";
        }
        return super.visitActionWait(ctx);
    }

    @Override
    public Object visitActionScroll(amuParser.ActionScrollContext ctx) {
        if(ctx.X_TIMES() == null){
            currentStatement = "Util.scrollDown();";
        }else if(ctx.TO_CLICK() == null){
            currentStatement = "Util.scrollDown("+ctx.X_TIMES().toString().replace(" times", "")+");";
        }else{
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element().STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ identifierGenerator(ctx.element().STRING().toString())+";";
        }
        return super.visitActionScroll(ctx);
    }
    @Override
    public Object visitActionSwipe(amuParser.ActionSwipeContext ctx) {
        if(ctx.FROM() == null){
            currentStatement = "Util.scroll(\""+ctx.DIRECTION().toString()+"\", "+DEFAULT_SWIPE_TIME+");";
        }else if(ctx.DIRECTION() != null && ctx.X_PIXEL() == null){
            String id = identifierGenerator(ctx.element(0).STRING().toString());
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element(0).STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ id+";";
            currentStatement =  "int Y_"+id+" = "+id+".getLocation().getY() + ("+id+".getSize().getHeight() / 2);\n" +
                                "int X_"+id+" = "+id+".getLocation().getX() + ("+id+".getSize().getWidth() / 2);\n";
            String destinationCoordinates = getDestinationCoordinates(ctx.DIRECTION().toString(), id);
            currentStatement += "Util.swipe(new Point(X_"+id+", Y_"+id+"), new Point("+destinationCoordinates+"), Duration.ofMillis("+DEFAULT_SWIPE_TIME+"));";
        }else if(ctx.DIRECTION() != null && ctx.X_PIXEL() != null){
            String id = identifierGenerator(ctx.element(0).STRING().toString());
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element(0).STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ id+";";
            currentStatement =  "int Y_"+id+" = "+id+".getLocation().getY() + ("+id+".getSize().getHeight() / 2);\n" +
                    "int X_"+id+" = "+id+".getLocation().getX() + ("+id+".getSize().getWidth() / 2);\n";
            String destinationCoordinates = getDestinationCoordinates(ctx.DIRECTION().toString(), id);
            currentStatement += "Util.swipe(new Point(X_"+id+", Y_"+id+"), new Point("+destinationCoordinates+"), "+"Duration.ofMillis("+DEFAULT_SWIPE_TIME+"));";
        }else if(ctx.element(1) != null){
            String id = identifierGenerator(ctx.element(0).STRING().toString());
            currentDeclaration = "@FindBy(xpath = \"//*[@text='"+f(ctx.element(0).STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ id+";";
            String id1 = identifierGenerator(ctx.element(1).STRING().toString());
            currentDeclaration+= "@FindBy(xpath = \"//*[@text='"+f(ctx.element(1).STRING())+"']\")\n";
            currentDeclaration+= "public WebElement "+ id1+";";

            currentStatement =  "int Y_"+id+" = "+id+".getLocation().getY() + ("+id+".getSize().getHeight() / 2);\n" +
                                "int X_"+id+" = "+id+".getLocation().getX() + ("+id+".getSize().getWidth() / 2);\n";
            currentStatement += "int Y_"+id1+" = "+id1+".getLocation().getY() + ("+id1+".getSize().getHeight() / 2);\n" +
                                "int X_"+id1+" = "+id1+".getLocation().getX() + ("+id1+".getSize().getWidth() / 2);\n";

            currentStatement += "Util.swipe(new Point(X_"+id+", Y_"+id+"), new Point(X_"+id1+", Y_"+id1+"), Duration.ofMillis("+DEFAULT_SWIPE_TIME+"));";
        }else if(ctx.point(1) != null){
            visitPoint(ctx.point(0));
            currentStatement = "Util.swipe(new Point("+currentPoint.x+","+currentPoint.y+"),";
            visitPoint(ctx.point(1));
            currentStatement +=" new Point("+currentPoint.x+", "+currentPoint.y+"), Duration.ofMillis("+DEFAULT_SWIPE_TIME+"));";
        }

        return super.visitActionSwipe(ctx);
    }

    @Override
    public Object visitElement(amuParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public Object visitPoint(amuParser.PointContext ctx) {
        if(ctx.getChildCount() == 2){
            currentPoint = new Point(Integer.parseInt(ctx.getChild(0).toString()), Integer.parseInt(ctx.getChild(1).toString()));
        }else if(ctx.getChildCount() == 3){
            currentPoint = new Point(Integer.parseInt(ctx.getChild(0).toString()), Integer.parseInt(ctx.getChild(2).toString()));
        }else if(ctx.getChildCount() == 5){
            currentPoint = new Point(Integer.parseInt(ctx.getChild(1).toString()), Integer.parseInt(ctx.getChild(3).toString()));
        }
        return super.visitPoint(ctx);
    }


    public String f(TerminalNode s){

        String result = s.toString();
        result = result.substring(1);
        result = result.substring(0, result.length()-1);
        if(result.endsWith("*")){
            result = result.substring(0, result.length()-1);
        }
        return result;
    }
    public String identifierGenerator(String text){
        if(text.startsWith("\"") && text.endsWith("\""))
        text = text.substring(1, text.length()-1);
        String identifier = text.replaceAll(" ", "_");
        identifier = identifier.replaceAll("-","_");
        if(identifier.endsWith("...")){
            identifier = identifier.substring(0, identifier.length() - 3);
        }else  if(identifier.contains("*")){
            identifier = identifier.replaceAll("[*]", "");
        }
        return identifier+"_"+randomIdGenerator();
    }
    public int pixelExtractor(String s){
        s = s.replaceAll(" ", "");
        s = s.replaceAll("px", "");
        return Integer.parseInt(s);
    }
    public String getDestinationCoordinates(String s, String id){
        String destinationCoordinates = "";
        if(s.equalsIgnoreCase("up")){
            destinationCoordinates = "X_"+id+", Y_"+id+" - "+DEFAULT_SWIPE_PX_AMOUNT;
        }else if(s.equalsIgnoreCase("down")){
            destinationCoordinates = "X_"+id+", Y_"+id+" + "+DEFAULT_SWIPE_PX_AMOUNT;
        }else if(s.equalsIgnoreCase("left")){
            destinationCoordinates = "X_"+id+" - "+DEFAULT_SWIPE_PX_AMOUNT+", Y_"+id;
        }else{
            destinationCoordinates = "X_"+id+" + "+DEFAULT_SWIPE_PX_AMOUNT+", Y_"+id;
        }
        return destinationCoordinates;
    }
    public String getTouchCoordinates(String s, String id, int distance){
        String touchCoordinates = "";
        if(s.equalsIgnoreCase("up")){
            touchCoordinates = "X_"+id+", Y_"+id+" - "+distance;
        }else if(s.equalsIgnoreCase("down")){
            touchCoordinates = "X_"+id+", Y_"+id+" + "+distance;
        }else if(s.equalsIgnoreCase("left")){
            touchCoordinates = "X_"+id+" - "+distance+", Y_"+id;
        }else{
            touchCoordinates = "X_"+id+" + "+distance+", Y_"+id;
        }
        return touchCoordinates;
    }
    public static String randomIdGenerator() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return ""+number;
    }
}
