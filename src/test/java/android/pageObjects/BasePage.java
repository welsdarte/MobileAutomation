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
public WebElement Kapat_177686;
@FindBy(xpath = "//*[@text='Üye Kodu']")
public WebElement Üye_Kodu_851930;
@FindBy(xpath = "//*[@text='Kullanıcı Adı']")
public WebElement Kullanıcı_Adı_396002;
@FindBy(xpath = "//*[@text='Parola']")
public WebElement Parola_39879;
@FindBy(xpath = "//*[@text='Giriş Yap']")
public WebElement Giriş_Yap_665579;
@FindBy(xpath = "//*[@text='Bağlan']")
public WebElement Bağlan_287233;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari_377964;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Ekleme')]")
public WebElement Cari_Kart_Ekleme_258781;
@FindBy(xpath = "//*[@text='Şahıs']")
public WebElement Şahıs_470259;
@FindBy(xpath = "//*[@text='* Cari Kodu']")
public WebElement _Cari_Kodu_105289;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_817746;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan_546247;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_385320;
@FindBy(xpath = "//*[@text='Tamam']")
public WebElement Tamam_109645;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari_96072;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Listesi')]")
public WebElement Cari_Kart_Listesi_707388;
@FindBy(xpath = "//*[@text='Sil']")
public WebElement Sil_585463;
@FindBy(xpath = "//*[@text='Sil']")
public WebElement Sil_114951;
@FindBy(xpath = "//*[@text='Teklif']")
public WebElement Teklif_67530;
@FindBy(xpath = "//*[contains(@text,'Teklif Listesi')]")
public WebElement Teklif_Listesi_97462;
@FindBy(xpath = "//*[contains(@text,'Verilen')]")
public WebElement Verilen_555429;
@FindBy(xpath = "//*[@text='foo element']")
public WebElement foo_element_715519;
@FindBy(xpath = "//*[@text='Cari']")
public WebElement Cari_605688;
@FindBy(xpath = "//*[contains(@text,'Cari Kart Ekleme')]")
public WebElement Cari_Kart_Ekleme_635766;
@FindBy(xpath = "//*[@text='Şahıs']")
public WebElement Şahıs_918351;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan_300796;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_767491;
@FindBy(xpath = "//*[@text='Ünvan']")
public WebElement Ünvan_455304;
@FindBy(xpath = "//*[@text='TC Kimlik No']")
public WebElement TC_Kimlik_No_494239;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_277278;
@FindBy(xpath = "//*[@text='TC Kimlik No']")
public WebElement TC_Kimlik_No_398205;
@FindBy(xpath = "//*[@text='Tamam']")
public WebElement Tamam_587055;
@FindBy(xpath = "//*[contains(@text,'mevcuttur')]")
public WebElement mevcuttur_553999;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_162730;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_426987;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_944907;
@FindBy(xpath = "//android.widget.Switch[4]")
public WebElement switch_4__494278;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_535067;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_650771;
@FindBy(xpath = "//*[@focused='true']")
public WebElement EditText_776418;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_911583;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_476816;
@FindBy(xpath = "//*[@text='some text']")
public WebElement some_text_267128;@FindBy(xpath = "//*[@text='some other text']")
public WebElement some_other_text_448416;
public void basitGiris() throws InterruptedException {
Kapat_177686.click();
Thread.sleep(1750);
Üye_Kodu_851930.clear();
Üye_Kodu_851930.sendKeys("testalper");
Thread.sleep(350);
Kullanıcı_Adı_396002.clear();
Kullanıcı_Adı_396002.sendKeys("dia");
Thread.sleep(350);
Parola_39879.clear();
Parola_39879.sendKeys("dia");
Thread.sleep(350);
Giriş_Yap_665579.click();
Thread.sleep(350);
Thread.sleep(7 *1000);
Thread.sleep(350);
Bağlan_287233.click();
Thread.sleep(350);
Thread.sleep(3 *1000);
Thread.sleep(350);
}
public void cariKartEkle() throws InterruptedException {
Cari_377964.click();
Thread.sleep(1750);
Cari_Kart_Ekleme_258781.click();
Thread.sleep(1750);
Şahıs_470259.click();
Thread.sleep(1750);
int Y__Cari_Kodu_105289 = _Cari_Kodu_105289.getLocation().getY() + (_Cari_Kodu_105289.getSize().getHeight() / 2);
int X__Cari_Kodu_105289 = _Cari_Kodu_105289.getLocation().getX() + (_Cari_Kodu_105289.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X__Cari_Kodu_105289 + 200, Y__Cari_Kodu_105289)).release().perform();
Thread.sleep(1750);
EditText_817746.clear();
EditText_817746.sendKeys("333.999");
Actions action817746 = new Actions(AppDriver.getDriver());
action817746.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
int Y_Ünvan_546247 = Ünvan_546247.getLocation().getY() + (Ünvan_546247.getSize().getHeight() / 2);
int X_Ünvan_546247 = Ünvan_546247.getLocation().getX() + (Ünvan_546247.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_Ünvan_546247 + 200, Y_Ünvan_546247)).release().perform();
Thread.sleep(1750);
EditText_385320.clear();
EditText_385320.sendKeys("testutku2");
Actions action385320 = new Actions(AppDriver.getDriver());
action385320.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
Thread.sleep(2 *1000);
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 180)).release().perform();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 180)).release().perform();
Thread.sleep(1750);
Tamam_109645.click();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(200, 200)).release().perform();
Thread.sleep(1750);
}
public void cariKartListele() throws InterruptedException {
Cari_96072.click();
Thread.sleep(1750);
Cari_Kart_Listesi_707388.click();
Thread.sleep(1750);
}
public void cariKartSilEnUstten() throws InterruptedException {
Util.swipe(new Point(900,400), new Point(100, 400), Duration.ofMillis(700));
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1000, 400)).release().perform();
Thread.sleep(1750);
Sil_585463.click();
Thread.sleep(1750);
Sil_114951.click();
Thread.sleep(1750);
Thread.sleep(1 *1000);
Thread.sleep(1750);
}
public void teklifListele() throws InterruptedException {
Teklif_67530.click();
Thread.sleep(1750);
Teklif_Listesi_97462.click();
Thread.sleep(1750);
}
public void teklifArti() throws InterruptedException {
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1050, 150)).release().perform();
Thread.sleep(1750);
Verilen_555429.click();
Thread.sleep(1750);
foo_element_715519.click();
Thread.sleep(1750);
}
public void yanlisCariEkle() throws InterruptedException {
Cari_605688.click();
Thread.sleep(1750);
Cari_Kart_Ekleme_635766.click();
Thread.sleep(1750);
Şahıs_918351.click();
Thread.sleep(1750);
int Y_Ünvan_300796 = Ünvan_300796.getLocation().getY() + (Ünvan_300796.getSize().getHeight() / 2);
int X_Ünvan_300796 = Ünvan_300796.getLocation().getX() + (Ünvan_300796.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_Ünvan_300796 + 200, Y_Ünvan_300796)).release().perform();
Thread.sleep(1750);
EditText_767491.clear();
EditText_767491.sendKeys("utku123");
Actions action767491 = new Actions(AppDriver.getDriver());
action767491.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
Ünvan_455304.click();
Thread.sleep(1750);
int Y_TC_Kimlik_No_494239 = TC_Kimlik_No_494239.getLocation().getY() + (TC_Kimlik_No_494239.getSize().getHeight() / 2);
int X_TC_Kimlik_No_494239 = TC_Kimlik_No_494239.getLocation().getX() + (TC_Kimlik_No_494239.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_TC_Kimlik_No_494239 + 200, Y_TC_Kimlik_No_494239)).release().perform();
Thread.sleep(1750);
EditText_277278.clear();
EditText_277278.sendKeys("123");
Actions action277278 = new Actions(AppDriver.getDriver());
action277278.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
TC_Kimlik_No_398205.click();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(1050, 150)).release().perform();
Thread.sleep(1750);
Tamam_587055.click();
Thread.sleep(1750);
mevcuttur_553999.click();
Thread.sleep(1750);
}
public void actions() throws InterruptedException {
some_text_162730.click();
Thread.sleep(1750);
int Y_some_text_426987 = some_text_426987.getLocation().getY() + (some_text_426987.getSize().getHeight() / 2);
int X_some_text_426987 = some_text_426987.getLocation().getX() + (some_text_426987.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_some_text_426987 - 200, Y_some_text_426987)).release().perform();
Thread.sleep(350);
int Y_some_text_944907 = some_text_944907.getLocation().getY() + (some_text_944907.getSize().getHeight() / 2);
int X_some_text_944907 = some_text_944907.getLocation().getX() + (some_text_944907.getSize().getWidth() / 2);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(X_some_text_944907, Y_some_text_944907 - 200)).release().perform();
Thread.sleep(1750);
switch_4__494278.click();
Thread.sleep(1750);
new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(480, 120)).release().perform();
Thread.sleep(350);
some_text_535067.clear();
some_text_535067.sendKeys("some string");
Thread.sleep(1750);
EditText_650771.clear();
EditText_650771.sendKeys("some string");
Actions action650771 = new Actions(AppDriver.getDriver());
action650771.sendKeys(Keys.ENTER).perform();
Thread.sleep(350);
EditText_776418.clear();
EditText_776418.sendKeys("<ENTER>");
Actions action776418 = new Actions(AppDriver.getDriver());
action776418.sendKeys(Keys.ENTER).perform();
Thread.sleep(1750);
Thread.sleep(15000);
Thread.sleep(350);
Thread.sleep(4 *1000);
Thread.sleep(1750);
Util.scrollDown();
Thread.sleep(350);
Util.scrollDown(5);
Thread.sleep(350);
Util.scroll("left", 700);
Thread.sleep(350);
int Y_some_text_911583 = some_text_911583.getLocation().getY() + (some_text_911583.getSize().getHeight() / 2);
int X_some_text_911583 = some_text_911583.getLocation().getX() + (some_text_911583.getSize().getWidth() / 2);
Util.swipe(new Point(X_some_text_911583, Y_some_text_911583), new Point(X_some_text_911583, Y_some_text_911583 - 300), Duration.ofMillis(700));
Thread.sleep(1750);
int Y_some_text_476816 = some_text_476816.getLocation().getY() + (some_text_476816.getSize().getHeight() / 2);
int X_some_text_476816 = some_text_476816.getLocation().getX() + (some_text_476816.getSize().getWidth() / 2);
Util.swipe(new Point(X_some_text_476816, Y_some_text_476816), new Point(X_some_text_476816, Y_some_text_476816 + 300), Duration.ofMillis(700));
Thread.sleep(1750);
int Y_some_text_267128 = some_text_267128.getLocation().getY() + (some_text_267128.getSize().getHeight() / 2);
int X_some_text_267128 = some_text_267128.getLocation().getX() + (some_text_267128.getSize().getWidth() / 2);
int Y_some_other_text_448416 = some_other_text_448416.getLocation().getY() + (some_other_text_448416.getSize().getHeight() / 2);
int X_some_other_text_448416 = some_other_text_448416.getLocation().getX() + (some_other_text_448416.getSize().getWidth() / 2);
Util.swipe(new Point(X_some_text_267128, Y_some_text_267128), new Point(X_some_other_text_448416, Y_some_other_text_448416), Duration.ofMillis(700));
Thread.sleep(350);
Util.swipe(new Point(120,140), new Point(120, 500), Duration.ofMillis(700));
Thread.sleep(1750);
}
}