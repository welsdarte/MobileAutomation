package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Transpiler {
    //<editor-fold desc="Java code head loong">
    static String JavaCode = "package android.pageObjects;\n" +
            "import Base.Util;\n" +
            "import Base.AppDriver;\n" +
            "import io.appium.java_client.PerformsTouchActions;\n" +
            "import io.appium.java_client.TouchAction;\n" +
            "import io.appium.java_client.pagefactory.AppiumFieldDecorator;\n" +
            "import io.appium.java_client.touch.WaitOptions;\n" +
            "import io.appium.java_client.touch.offset.PointOption;\n" +
            "import org.openqa.selenium.Keys;\n" +
            "import org.openqa.selenium.WebElement;\n" +
            "import org.openqa.selenium.interactions.Actions;\n" +
            "import org.openqa.selenium.support.FindBy;\n" +
            "import org.openqa.selenium.support.PageFactory;\n" +
            "import java.awt.*;\n" +
            "import java.time.Duration;\n" +
            "import static java.time.Duration.ofMillis;\n\n" +
            "public class BasePage {\n" +
            "    public BasePage(){\n" +
            "        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);\n" +
            "    }\n";
    //</editor-fold>
    //<editor-fold desc="Test code head long>
    static String TestCode="package android.testCases;\n" +
            "\n" +
            "import android.pageObjects.BasePage;\n" +
            "import org.testng.annotations.Test;\n" +
            "\n" +
            "public class testCases {\n";
    //</editor-fold>

    public static void main(String[] args) {

        try{
            String fileName = "/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/simpleScenarioToJavaCode/input.amu";
            CharStream cs = fromFileName(fileName);
            amuLexer lexer = new amuLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            amuParser parser = new amuParser(token);
            ParseTree tree = parser.body(); //

            Visitor visitor = new Visitor();
            visitor.visit(tree);

            String DECS ="";
            String STTS ="";
            String TSTS ="";
            String testContent= "BasePage basePage = new BasePage();\nThread.sleep(5 *1000);\n";
            for (int i = 0; i < visitor.tests.size(); i++) {
                String s = visitor.tests.get(i).replaceAll("\n","");
                s = s.replaceAll(" ", "");
                if(s.startsWith("<") && s.endsWith(">") && !s.contains(":")){
                    testContent += "basePage."+s.substring(1,s.length()-1)+"();\n";
                }else if(s.startsWith("<") && s.endsWith(">") && s.contains(":")){
                    int iteration = Integer.parseInt(s.substring(s.indexOf(":")+1, s.indexOf(">")));
                    s = s.replace("<", "");
                    s = s.substring(0, s.indexOf(":"));
                    testContent += "for(int i = 0; i++< "+iteration+"; )\n";
                    testContent += "basePage."+s+"();\n";
                }  else if (s.equalsIgnoreCase("$testsEnd$")){
                     TSTS += testContent;
                     testContent ="";
                } else {
                    if (TSTS.length() > 0) {
                        TSTS += testContent ;
                        testContent = "BasePage basePage = new BasePage();\nThread.sleep(5 *1000);\n";
                        TSTS += "}\n@Test\npublic void " + s + ") throws InterruptedException {\n";
                    } else {
                        TSTS += "@Test\npublic void " + s + ") throws InterruptedException {\n";
                    }
                }
            }
            TestCode += TSTS + "}\n}";
            System.out.println(TestCode);

            for (int i = 0; i < visitor.declarations.size(); i++) {
                JavaCode += visitor.declarations.get(i) + "\n";
                DECS+=visitor.declarations.get(i);
            }
            //System.out.println(" <<<<<<<<<<<<<<<<<<<< declarations to copy paste >>>>>>>>>>>>>>>>>>>> \n" + DECS);

             // add base page method/scenario/label
            for (int t = 0; t < visitor.statementsArray.size(); t++) {
                JavaCode += "public void "+visitor.scenarioNames.get(t).replace("<","").replace(">","")+"() throws InterruptedException {\n";
                for (int i = 0; i < visitor.statementsArray.get(t).size(); i++) {
                    JavaCode += visitor.statementsArray.get(t).get(i)+ "\n";
                    STTS+=visitor.statementsArray.get(t).get(i);
                }
                JavaCode += "}\n";
            }
            //System.out.println(" <<<<<<<<<<<<<<<<<<<< statements to copy paste >>>>>>>>>>>>>>>>>>>> \n"+STTS);
            JavaCode+="}";

            PrintWriter pr = new PrintWriter("/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/simpleScenarioToJavaCode/outBasePage.txt");
            pr.write(JavaCode);
            pr.flush();
            pr.close();
            pr = new PrintWriter("/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/android/pageObjects/BasePage.java");
            pr.write(JavaCode);
            pr.flush();
            pr.close();
            pr = new PrintWriter("/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/simpleScenarioToJavaCode/outTestCases.txt");
            pr.write(TestCode);
            pr.flush();
            pr.close();
            pr = new PrintWriter("/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/android/testCases/testCases.java");
            pr.write(TestCode);
            pr.flush();
            pr.close();

        }catch(IOException e ){
            e.printStackTrace();
        }
    }

    public String textPreProcessing(String code){
        String result = "";

        return result;
    }
}
