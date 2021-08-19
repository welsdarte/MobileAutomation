package android.pageObjects;
import Base.Util;
import Base.AppDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.time.Duration;
import static java.time.Duration.ofMillis;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }
@FindBy(xpath = "//*[@text='Kapat']")
public WebElement Kapat;
@FindBy(xpath = "//*[@text='Üye Kodu']")
public WebElement Üye_Kodu;
@FindBy(xpath = "//*[@text='Kullanıcı Adı']")
public WebElement Kullanıcı_Adı;
@FindBy(xpath = "//*[@text='Parola']")
public WebElement Parola;
@FindBy(xpath = "//*[@text='Giriş Yap']")
public WebElement Giriş_Yap;
@FindBy(xpath = "//*[@text='Bağlan']")
public WebElement Bağlan;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Ekleme')]")
public WebElement Cari_Kart_Ekleme;
@FindBy(xpath = "//*[@text='Şahıs']")
public WebElement Şahıs;
@FindBy(xpath = "//*[@text='* Cari Kodu']")
public WebElement _Cari_Kodu;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_227198;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_186021;
@FindBy(xpath = "//*[@text='Tamam']")
public WebElement Tamam;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Listesi')]")
public WebElement Cari_Kart_Listesi;
@FindBy(xpath = "//*[@text='Sil']")
public WebElement Sil;
public void basitGiris() throws InterruptedException {
Kapat.click();
Thread.sleep(1750);
Üye_Kodu.clear();
Üye_Kodu.sendKeys("testalper");
Thread.sleep(350);
Kullanıcı_Adı.clear();
Kullanıcı_Adı.sendKeys("dia");
Thread.sleep(350);
Parola.clear();
Parola.sendKeys("dia");
Thread.sleep(350);
Giriş_Yap.click();
Thread.sleep(350);
Thread.sleep(5 *1000);
Thread.sleep(350);
Bağlan.click();
Thread.sleep(350);
Thread.sleep(5 *1000);
Thread.sleep(350);
}
public void cariKartEkle() throws InterruptedException {
Cari.click();
Thread.sleep(1750);
Cari_Kart_Ekleme.click();
Thread.sleep(1750);
Şahıs.click();
Thread.sleep(1750);
int Y__Cari_Kodu = _Cari_Kodu.getLocation().getY() + (_Cari_Kodu.getSize().getHeight() / 2);
int X__Cari_Kodu = _Cari_Kodu.getLocation().getX() + (_Cari_Kodu.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X__Cari_Kodu + 200, Y__Cari_Kodu)).release().perform();
Thread.sleep(1750);
EditText_227198.clear();
EditText_227198.sendKeys("333.999");
Actions action227198 = new Actions(AppDriver.getDriver());
action227198.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
int Y_Ünvan = Ünvan.getLocation().getY() + (Ünvan.getSize().getHeight() / 2);
int X_Ünvan = Ünvan.getLocation().getX() + (Ünvan.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_Ünvan + 200, Y_Ünvan)).release().perform();
Thread.sleep(1750);
EditText_186021.clear();
EditText_186021.sendKeys("testutku2");
Actions action186021 = new Actions(AppDriver.getDriver());
action186021.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
Thread.sleep(2 *1000);
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 180)).release().perform();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 180)).release().perform();
Thread.sleep(1750);
Tamam.click();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(200, 200)).release().perform();
Thread.sleep(1750);
}
public void cariKartListele() throws InterruptedException {
Cari.click();
Thread.sleep(1750);
Cari_Kart_Listesi.click();
Thread.sleep(1750);
}
public void cariKartSilEnUstten() throws InterruptedException {
Util.swipe(new Point(900,400), new Point(100, 400), Duration.ofMillis(300));
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 400)).release().perform();
Thread.sleep(1750);
Sil.click();
Thread.sleep(1750);
Sil.click();
Thread.sleep(1750);
}
}