package ios.testCases;

import ios.pageObjects.BasePage;
import org.testng.annotations.Test;

public class case_demoGiris {
    @Test
    public void test_demoGiris() throws InterruptedException {
        System.out.println("test_demoGiris()...");
        BasePage basePage = new BasePage();
        basePage.demoGirisiYap();
    }
}
