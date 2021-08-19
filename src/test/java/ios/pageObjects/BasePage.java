package ios.pageObjects;

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
    }@FindBy(xpath = "//android.widget.TextView[@text='Kapat']")
    public WebElement Kapat;
    @FindBy(xpath = "//android.widget.EditText[@text='Üye Kodu']")
    public WebElement Üye_Kodu;
    @FindBy(xpath = "//android.widget.EditText[@text='Kullanıcı Adı']")
    public WebElement Kullanıcı_Adı;
    @FindBy(xpath = "//android.widget.EditText[@text='Parola']")
    public WebElement Parola;
    @FindBy(xpath = "//android.widget.TextView[@text='Giriş Yap']")
    public WebElement Giriş_Yap;
    public void demoGirisiYap() throws InterruptedException {
        Thread.sleep(10000);
        Kapat.click();
        Thread.sleep(1000);
        Üye_Kodu.sendKeys("teststable");
        Thread.sleep(50);
        Kullanıcı_Adı.sendKeys("dia");
        Thread.sleep(50);
        Parola.sendKeys("dia");
        Thread.sleep(1000);
        Giriş_Yap.click();
        Thread.sleep(10 *1000);
        Kapat.click();
        Thread.sleep(1000);
        Kullanıcı_Adı.sendKeys("dia");
        Thread.sleep(50);
        Parola.sendKeys("dia");
        Thread.sleep(1000);
        Giriş_Yap.click();
    }
}