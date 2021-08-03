package android.simpleScenarioToJavaCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ScenarioTranspiler {
    static int thenBreakTime = 1000; //thread sleep amount between actions in milliseconds
    static int andBreakTime = 10;   //minimum sleep amount
    static String functionName = "";
    public static void main(String[] args) throws FileNotFoundException {
        String JAVA = "package android.pageObjects;\n" +
                "\n" +
                "import Base.Util;\n"+
                "import org.openqa.selenium.By;\n" +
                "import org.openqa.selenium.support.ui.ExpectedConditions;\n" +
                "import org.openqa.selenium.support.ui.WebDriverWait;\n" +
                "import Base.AppDriver;\n" +
                "import io.appium.java_client.pagefactory.AppiumFieldDecorator;\n" +
                "import org.openqa.selenium.WebElement;\n" +
                "import org.openqa.selenium.support.FindBy;\n" +
                "import org.openqa.selenium.support.PageFactory;\n" +
                "\n" +
                "public class BasePage {\n" +
                "    public BasePage(){\n" +
                "        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);\n" +
                "    }";
        ArrayList<String> declarations = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        File f = new File(args[0]);
        Scanner sc = new Scanner(f);
        String allContent = "";
        while (sc.hasNextLine())allContent+=sc.nextLine()+"\n";

        sc = new Scanner(allContent);

        while(sc.hasNextLine()){
            String declaration = "";
            String action ="";
            String line = sc.nextLine();

            if(line.contains("Scenario:")){
                action = "System.out.println(\"Dia app launched\");\nThread.sleep(4000);";
            }else{
                String name ="";
                if(line.contains("\""))name = line.substring(line.indexOf("\"") + 1, line.lastIndexOf("\""));

                if(line.startsWith("I clicked")){
                    if(line.contains("the ")){
                        String end = line.substring(line.indexOf("the ") + 4);
                        String number = end.substring(0, end.indexOf(" ")-2);

                        if(line.contains("switch")){
                            declaration = "@FindBy(xpath = \"//android.widget.Switch["+number+"]\")\npublic WebElement switch_"+format(number)+";";
                            action = "switch_"+format(number)+".click();";
                        }
                    }else if( ! name.startsWith("//")){
                        declaration = "@FindBy(xpath = \"//android.widget.TextView[@text='"+name+"']\")\npublic WebElement "+format(name)+";";
                        action = format(name)+".click();";
                    }else{
                        declaration = "@FindBy(xpath = \""+name+"\")\npublic WebElement "+format(name)+";";
                        action = format(name)+".click();";
                    }
                }else if(line.startsWith("I typed")){
                    String input = line.substring(line.indexOf("'") + 1, line.lastIndexOf("'"));
                    System.out.println("input: "+input);
                    declaration = "@FindBy(xpath = \"//android.widget.EditText[@text='"+name+"']\")\npublic WebElement "+format(name)+";";
                    action = format(name)+".sendKeys(\""+input+"\");";
                }else if(line.startsWith("I wait")) {
                    String piece = line.substring(line.indexOf("wait") + 5);
                    int seconds = Integer.parseInt(piece.substring(0, piece.indexOf(" ")));
                    if (line.contains("\"")) {
                        System.out.println(" yazılmadı ");
                        System.exit(3);
                        action = "new WebDriverWait(AppDriver.getDriver(), " + seconds + ").until(ExpectedConditions.presenceOfElementLocated(" + name + "));";
                    }else{
                        action = "Thread.sleep(1000 * "+seconds+");";
                    }
                }else if(line.startsWith("I scroll")){
                    if(line.contains("to click ")){
                        //flag
                        int count = 0;
                        String end = line.substring(line.indexOf("max") + 4);
                        count = Integer.parseInt(end.substring(0,end.indexOf(" ")));
                        declaration = "@FindBy(xpath = \"//android.widget.TextView[@text='"+name+"']\")\npublic WebElement "+format(name)+";";
                        action = "Util.scrollNClick("+format(name)+","+count+");";
                    }else if(line.contains("times")){
                        int count = 0;
                        String end = line.substring(line.indexOf("scroll") + 7);
                        count = Integer.parseInt(end.substring(0,end.indexOf(" ")));
                        action = "Util.scrollDown("+count+");";
                    }else{
                        action = "Util.scrollDown();";
                    }
                }
            }

            action = "//\t\t"+line + "\n"+action;
            if(line.endsWith("then")){
                action += "\nThread.sleep("+thenBreakTime+");";
            }else if(line.endsWith("and")){
                action += "\nThread.sleep("+andBreakTime+");";
            }
            if(!declarations.contains(declaration)) {
                declarations.add(declaration);
            }
            actions.add(action);
        }

        for (int i = 0; i <declarations.size() ; i++) {

            JAVA += declarations.get(i)+"\n";
            System.out.println(declarations.get(i));
        }

        JAVA += "    public void demoGirisiYap() throws InterruptedException {\n";

        for (int i = 0; i <actions.size() ; i++) {
            JAVA += actions.get(i)+"\n";
            System.out.println(actions.get(i));
        }
        JAVA += "\n}\n}";

        System.out.println(" ????? JAVA ??????\n"+JAVA);
        PrintWriter pr = new PrintWriter(new File(  "/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/android/simpleScenarioToJavaCode/output.txt"));
        pr.println(JAVA);
        pr.flush();
        pr.close();

    }


    static int unnamedElementCount = 0;
    protected static String format(String s){
        if(s.startsWith("//")){
            return "unnamed"+(unnamedElementCount+1);
        }
        if(s.endsWith("..."))s = s.substring(0, s.length() - 3);
        return s.replaceAll(" ","");
    }
}
