package android.pageObjects;

import Base.Util;
import Base.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

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
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Giriş')]")
    public WebElement Giriş;
    @FindBy(xpath = "//android.widget.TextView[@text='Bağlan']")
    public WebElement Bağlan;
    @FindBy(xpath = "//android.widget.TextView[@text='Teklif']")
    public WebElement Teklif;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Teklif Ekle')]")
    public WebElement TeklifEkle;
    @FindBy(xpath = "//android.widget.TextView[@text='Verilen Teklif Ekle']")
    public WebElement VerilenTeklifEkleme;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Kalemler')]")
    public WebElement Kalemler;

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
//		I clicked "Teklif Ekle*" then
        TeklifEkle.click();
        Thread.sleep(1000);
//		I clicked "Verilen Teklif Ekleme" then
        VerilenTeklifEkleme.click();
        Thread.sleep(1000);
//		I wait 2 seconds
        Thread.sleep(1000 * 2);
//

        int kalemler_Y = Kalemler.getLocation().getY() + (Kalemler.getSize().getHeight() / 2);
        int kalemler_X = Kalemler.getLocation().getX() + (Kalemler.getSize().getWidth() / 2);
        Util.swipe(new Point(kalemler_X, kalemler_Y), new Point(kalemler_X - 300, kalemler_Y), Duration.ofMillis(300));

//		I wait 100 seconds
        Thread.sleep(1000 * 100);



    }
}
