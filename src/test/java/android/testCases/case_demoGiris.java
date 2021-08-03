package android.testCases;

import android.pageObjects.BasePage;
import org.testng.annotations.Test;

public class case_demoGiris {
    @Test
    public void test_demoGiris() throws InterruptedException {
        BasePage basePage = new BasePage(); // CONSTRUCTOR RELAUNCHES THE APP

        basePage.demoGirisiYap();
    }
}
