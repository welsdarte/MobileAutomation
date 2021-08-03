package android.pageObjects;

import Base.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Kapat']")
    public WebElement Kapat;
    @FindBy(xpath = "//android.widget.Switch[3]")
    public WebElement switch_3;
    @FindBy(xpath = "//android.widget.EditText[@text='Eposta adresinizi giriniz...']")
    public WebElement Epostaadresinizigiriniz;
    @FindBy(xpath = "//android.widget.TextView[@text='Giriş']")
    public WebElement Giriş;
    @FindBy(xpath = "//android.widget.TextView[@text='Bağlan']")
    public WebElement Bağlan;
    @FindBy(xpath = "//android.widget.TextView[@text='Teklif']")
    public WebElement Teklif;
    @FindBy(xpath = "//android.widget.TextView[@text='Cari']")
    public WebElement Cari;
    @FindBy(xpath = "//android.widget.TextView[@text='Restoran']")
    public WebElement Restoran;
    public void demoGirisiYap() throws InterruptedException {
//		Scenario: "I must be able to login via demo account"
        System.out.println("Dia app launched");
        Thread.sleep(4000);
//		I clicked "Kapat" then
        Kapat.click();
        Thread.sleep(1000);
//		I clicked the 3rd switch then
        switch_3.click();
        Thread.sleep(1000);
//		I typed 'utkudemircil28@gmail.com' to "Eposta adresinizi giriniz..."
        Epostaadresinizigiriniz.sendKeys("utkudemircil28@gmail.com");
//		I clicked "Giriş"
        Giriş.click();
//		I wait 10 seconds
        Thread.sleep(1000 * 10);
//		I clicked "Bağlan"
        Bağlan.click();
//		I wait 2 seconds
        Thread.sleep(1000 * 2);
//		I clicked "Teklif" then
        Teklif.click();
        Thread.sleep(1000);
//		I clicked "Cari" then
        Cari.click();
        Thread.sleep(1000);
//		I scroll max 5 times to click "Restoran"
        Util.scrollNClick(Restoran,5);
//		I wait 5 seconds
        Thread.sleep(1000 * 5);

    }
}
