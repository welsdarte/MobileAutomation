package android.testCases;

import android.pageObjects.BasePage;
import org.testng.annotations.Test;

public class TestCases {
@Test
public void tc() throws InterruptedException {
BasePage basePage = new BasePage();
Thread.sleep(5 *1000);
basePage.basitGiris();
for(int i = 0; i++< 14; )
basePage.yanlisCariEkle();
}
}