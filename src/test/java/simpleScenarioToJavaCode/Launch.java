package simpleScenarioToJavaCode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {

    public static void main(String[] args) {

        try{
            String fileName = "/Users/admin/IdeaProjects/com.diaAppTest/src/test/java/simpleScenarioToJavaCode/scenarios.txt";
            CharStream cs = fromFileName(fileName);
            amuLexer lexer = new amuLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            amuParser parser = new amuParser(token);
            ParseTree tree = parser.scenario();

            Visitor visitor = new Visitor();
            visitor.visit(tree);

        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}
