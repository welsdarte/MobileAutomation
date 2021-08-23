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
public WebElement Kapat_592696;
@FindBy(xpath = "//*[@text='Üye Kodu']")
public WebElement Üye_Kodu_52756;
@FindBy(xpath = "//*[@text='Kullanıcı Adı']")
public WebElement Kullanıcı_Adı_667717;
@FindBy(xpath = "//*[@text='Parola']")
public WebElement Parola_956889;
@FindBy(xpath = "//*[@text='Giriş Yap']")
public WebElement Giriş_Yap_195731;
@FindBy(xpath = "//*[@text='Bağlan']")
public WebElement Bağlan_881339;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari_245557;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Ekleme')]")
public WebElement Cari_Kart_Ekleme_867880;
@FindBy(xpath = "//*[@text='Şahıs']")
public WebElement Şahıs_312319;
@FindBy(xpath = "//*[@text='* Cari Kodu']")
public WebElement _Cari_Kodu_774940;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_309377;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan_763104;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_672051;
@FindBy(xpath = "//*[@text='Tamam']")
public WebElement Tamam_155591;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari_674312;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Listesi')]")
public WebElement Cari_Kart_Listesi_698082;
@FindBy(xpath = "//*[@text='Sil']")
public WebElement Sil_242487;
@FindBy(xpath = "//*[@text='Sil']")
public WebElement Sil_766988;
@FindBy(xpath = "//*[@text='Teklif']")
public WebElement Teklif_14540;
@FindBy(xpath = "//*[contains(@text,'Teklif Listesi')]")
public WebElement Teklif_Listesi_788364;
@FindBy(xpath = "//*[contains(@text,'Verilen')]")
public WebElement Verilen_334384;
@FindBy(xpath = "//*[@text='foo element']")
public WebElement foo_element_243073;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari_311708;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Ekleme')]")
public WebElement Cari_Kart_Ekleme_942475;
@FindBy(xpath = "//*[@text='Şahıs']")
public WebElement Şahıs_462762;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan_564050;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_901611;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan_888664;
@FindBy(xpath = "//*[@text='TC Kimlik No']")
public WebElement TC_Kimlik_No_442055;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_430534;
@FindBy(xpath = "//*[@text='TC Kimlik No']")
public WebElement TC_Kimlik_No_145864;
@FindBy(xpath = "//*[@text='Tamam']")
public WebElement Tamam_524318;
@FindBy(xpath = "//*[contains(@text,'mevcuttur')]")
public WebElement mevcuttur_742287;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_187543;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_821465;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_75998;
public void basitGiris() throws InterruptedException {
Kapat_592696.click();
Thread.sleep(1750);
Üye_Kodu_52756.clear();
Üye_Kodu_52756.sendKeys("testalper");
Thread.sleep(350);
Kullanıcı_Adı_667717.clear();
Kullanıcı_Adı_667717.sendKeys("dia");
Thread.sleep(350);
Parola_956889.clear();
Parola_956889.sendKeys("dia");
Thread.sleep(350);
Giriş_Yap_195731.click();
Thread.sleep(350);
Thread.sleep(7 *1000);
Thread.sleep(350);
Bağlan_881339.click();
Thread.sleep(350);
Thread.sleep(3 *1000);
Thread.sleep(350);
}
public void cariKartEkle() throws InterruptedException {
Cari_245557.click();
Thread.sleep(1750);
Cari_Kart_Ekleme_867880.click();
Thread.sleep(1750);
Şahıs_312319.click();
Thread.sleep(1750);
int Y__Cari_Kodu_774940 = _Cari_Kodu_774940.getLocation().getY() + (_Cari_Kodu_774940.getSize().getHeight() / 2);
int X__Cari_Kodu_774940 = _Cari_Kodu_774940.getLocation().getX() + (_Cari_Kodu_774940.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X__Cari_Kodu_774940 + 200, Y__Cari_Kodu_774940)).release().perform();
Thread.sleep(1750);
EditText_309377.clear();
EditText_309377.sendKeys("333.999");
Actions action309377 = new Actions(AppDriver.getDriver());
action309377.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
int Y_Ünvan_763104 = Ünvan_763104.getLocation().getY() + (Ünvan_763104.getSize().getHeight() / 2);
int X_Ünvan_763104 = Ünvan_763104.getLocation().getX() + (Ünvan_763104.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_Ünvan_763104 + 200, Y_Ünvan_763104)).release().perform();
Thread.sleep(1750);
EditText_672051.clear();
EditText_672051.sendKeys("testutku2");
Actions action672051 = new Actions(AppDriver.getDriver());
action672051.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
Thread.sleep(2 *1000);
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 180)).release().perform();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 180)).release().perform();
Thread.sleep(1750);
Tamam_155591.click();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(200, 200)).release().perform();
Thread.sleep(1750);
}
public void cariKartListele() throws InterruptedException {
Cari_674312.click();
Thread.sleep(1750);
Cari_Kart_Listesi_698082.click();
Thread.sleep(1750);
}
public void cariKartSilEnUstten() throws InterruptedException {
Util.swipe(new Point(900,400), new Point(100, 400), Duration.ofMillis(700));
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 400)).release().perform();
Thread.sleep(1750);
Sil_242487.click();
Thread.sleep(1750);
Sil_766988.click();
Thread.sleep(1750);
Thread.sleep(10 *1000);
Thread.sleep(1750);
}
public void teklifListele() throws InterruptedException {
Teklif_14540.click();
Thread.sleep(1750);
Teklif_Listesi_788364.click();
Thread.sleep(1750);
}
public void teklifArti() throws InterruptedException {
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1050, 150)).release().perform();
Thread.sleep(1750);
Verilen_334384.click();
Thread.sleep(1750);
foo_element_243073.click();
Thread.sleep(1750);
}
public void yanlisCariEkle() throws InterruptedException {
Cari_311708.click();
Thread.sleep(1750);
Cari_Kart_Ekleme_942475.click();
Thread.sleep(1750);
Şahıs_462762.click();
Thread.sleep(1750);
int Y_Ünvan_564050 = Ünvan_564050.getLocation().getY() + (Ünvan_564050.getSize().getHeight() / 2);
int X_Ünvan_564050 = Ünvan_564050.getLocation().getX() + (Ünvan_564050.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_Ünvan_564050 + 200, Y_Ünvan_564050)).release().perform();
Thread.sleep(1750);
EditText_901611.clear();
EditText_901611.sendKeys("utku123");
Actions action901611 = new Actions(AppDriver.getDriver());
action901611.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
Ünvan_888664.click();
Thread.sleep(1750);
int Y_TC_Kimlik_No_442055 = TC_Kimlik_No_442055.getLocation().getY() + (TC_Kimlik_No_442055.getSize().getHeight() / 2);
int X_TC_Kimlik_No_442055 = TC_Kimlik_No_442055.getLocation().getX() + (TC_Kimlik_No_442055.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_TC_Kimlik_No_442055 + 200, Y_TC_Kimlik_No_442055)).release().perform();
Thread.sleep(1750);
EditText_430534.clear();
EditText_430534.sendKeys("123");
Actions action430534 = new Actions(AppDriver.getDriver());
action430534.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
TC_Kimlik_No_145864.click();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1050, 150)).release().perform();
Thread.sleep(1750);
Tamam_524318.click();
Thread.sleep(1750);
mevcuttur_742287.click();
Thread.sleep(1750);
}
public void actions() throws InterruptedException {
some_text_187543.click();
Thread.sleep(1750);
int Y_some_text_821465 = some_text_821465.getLocation().getY() + (some_text_821465.getSize().getHeight() / 2);
int X_some_text_821465 = some_text_821465.getLocation().getX() + (some_text_821465.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_some_text_821465 - 200, Y_some_text_821465)).release().perform();
Thread.sleep(350);
int Y_some_text_75998 = some_text_75998.getLocation().getY() + (some_text_75998.getSize().getHeight() / 2);
int X_some_text_75998 = some_text_75998.getLocation().getX() + (some_text_75998.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_some_text_75998, Y_some_text_75998 - 200)).release().perform();
Thread.sleep(1750);
}
}