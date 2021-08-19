package android.testCases;

import android.pageObjects.BasePage;
import org.testng.annotations.Test;

public class testCases {
@Test
public void testCaseCariSil() throws InterruptedException {
BasePage basePage = new BasePage();
Thread.sleep(5 *1000);
basePage.basitGiris();
basePage.cariKartListele();
basePage.cariKartSilEnUstten();
}
}