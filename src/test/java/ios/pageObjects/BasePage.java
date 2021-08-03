package ios.pageObjects;

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

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    public WebElement kapat_ilkPopup;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Switch[3]")
    public WebElement demo_switchButton;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    public WebElement demo_epostaInput;

    @FindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]")
    public WebElement demo_girisButonu;

    @FindBy (xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]")
    public WebElement baglan_butonu;
    By by_baglan_butonu = By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]");

    @FindBy (xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    public WebElement cari;

    @FindBy (xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]")
    public WebElement cari_kart_ekleme;

    @FindBy (xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    public WebElement sahis;

    public void demoGirisiYap() throws InterruptedException {
        Thread.sleep(4000);

        kapat_ilkPopup.click();
        Thread.sleep(10);

        demo_switchButton.click();
        Thread.sleep(10);

        demo_epostaInput.sendKeys("utkudemircil28@gmail.com");
        Thread.sleep(10);

        demo_girisButonu.click();
        new WebDriverWait(AppDriver.getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(by_baglan_butonu));

        baglan_butonu.click();
        Thread.sleep(1000);

        cari.click();
        Thread.sleep(2000);

    }
}

/*

<?xml version='1.0' encoding='UTF-8' standalone='yes' ?>
<hierarchy index="0" class="hierarchy" rotation="0" width="1080" height="2130">
  <android.widget.FrameLayout index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.FrameLayout" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,0][1080,2130]" displayed="true">
    <android.widget.LinearLayout index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.LinearLayout" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,0][1080,2130]" displayed="true">
      <android.widget.FrameLayout index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.FrameLayout" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
        <android.widget.LinearLayout index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.LinearLayout" text="" resource-id="tr.com.dia.mobile.android.erp:id/action_bar_root" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
          <android.widget.FrameLayout index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.FrameLayout" text="" resource-id="android:id/content" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
            <android.widget.FrameLayout index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.FrameLayout" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
              <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
                <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
                  <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
                    <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
                      <android.widget.ScrollView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.ScrollView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
                        <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,2130]" displayed="true">
                          <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,80][1080,233]" displayed="true">
                            <android.widget.ImageView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.ImageView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[3,83][122,230]" displayed="true" />
                          </android.view.ViewGroup>
                          <android.view.ViewGroup index="1" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,233][1080,690]" displayed="true">
                            <android.widget.ImageView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.ImageView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[314,253][766,690]" displayed="true" />
                          </android.view.ViewGroup>
                          <android.view.ViewGroup index="2" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,690][1080,2130]" displayed="true">
                            <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[315,690][405,717]" displayed="true" />
                            <android.view.ViewGroup index="1" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[405,690][496,717]" displayed="true" />
                            <android.view.ViewGroup index="2" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[495,690][585,717]" displayed="true" />
                            <android.view.ViewGroup index="3" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[586,690][677,717]" displayed="true" />
                            <android.view.ViewGroup index="4" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[676,690][766,717]" displayed="true" />
                            <android.view.ViewGroup index="5" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,762][1024,881]" displayed="true">
                              <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,762][1024,881]" displayed="true">
                                <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[60,765][143,878]" displayed="true">
                                  <android.widget.ImageView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.ImageView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[74,765][129,878]" displayed="true" />
                                </android.view.ViewGroup>
                                <android.widget.EditText index="1" package="tr.com.dia.mobile.android.erp" class="android.widget.EditText" text="Üye Kodu" checkable="false" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="true" password="false" scrollable="false" selected="false" bounds="[156,765][1007,878]" displayed="true" />
                              </android.view.ViewGroup>
                            </android.view.ViewGroup>
                            <android.view.ViewGroup index="6" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,918][1024,1037]" displayed="true">
                              <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,918][1024,1037]" displayed="true">
                                <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[60,921][143,1034]" displayed="true">
                                  <android.widget.ImageView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.ImageView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[74,921][129,1034]" displayed="true" />
                                </android.view.ViewGroup>
                                <android.widget.EditText index="1" package="tr.com.dia.mobile.android.erp" class="android.widget.EditText" text="Kullanıcı Adı" checkable="false" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="true" password="false" scrollable="false" selected="false" bounds="[156,921][1007,1034]" displayed="true" />
                              </android.view.ViewGroup>
                            </android.view.ViewGroup>
                            <android.view.ViewGroup index="7" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,1074][1024,1193]" displayed="true">
                              <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,1074][1024,1193]" displayed="true">
                                <android.view.ViewGroup index="0" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[60,1077][143,1190]" displayed="true">
                                  <android.widget.ImageView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.ImageView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[74,1077][129,1190]" displayed="true" />
                                </android.view.ViewGroup>
                                <android.widget.EditText index="1" package="tr.com.dia.mobile.android.erp" class="android.widget.EditText" text="Parola" checkable="false" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="true" password="true" scrollable="false" selected="false" bounds="[156,1077][1007,1190]" displayed="true" />
                              </android.view.ViewGroup>
                            </android.view.ViewGroup>
                            <android.widget.Switch index="8" package="tr.com.dia.mobile.android.erp" class="android.widget.Switch" text="OFF" checkable="true" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[173,1240][301,1314]" displayed="true" />
                            <android.widget.TextView index="9" package="tr.com.dia.mobile.android.erp" class="android.widget.TextView" text="Hatırla" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[315,1250][430,1303]" displayed="true" />
                            <android.widget.Switch index="10" package="tr.com.dia.mobile.android.erp" class="android.widget.Switch" text="OFF" checkable="true" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[444,1240][572,1314]" displayed="true" />
                            <android.widget.TextView index="11" package="tr.com.dia.mobile.android.erp" class="android.widget.TextView" text="Bağ. Kes" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[586,1250][738,1303]" displayed="true" />
                            <android.widget.Switch index="12" package="tr.com.dia.mobile.android.erp" class="android.widget.Switch" text="OFF" checkable="true" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[751,1240][879,1314]" displayed="true" />
                            <android.view.ViewGroup index="14" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,1398][1024,1548]" displayed="true">
                              <android.widget.TextView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.TextView" text="Giriş Yap" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[451,1444][630,1503]" displayed="true" />
                            </android.view.ViewGroup>
                            <android.widget.TextView index="15" package="tr.com.dia.mobile.android.erp" class="android.widget.TextView" text="21.04.1" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[57,1549][1024,1587]" displayed="true" />
                          </android.view.ViewGroup>
                        </android.view.ViewGroup>
                      </android.widget.ScrollView>
                    </android.view.ViewGroup>
                  </android.view.ViewGroup>
                </android.view.ViewGroup>
                <android.view.ViewGroup index="1" package="tr.com.dia.mobile.android.erp" class="android.view.ViewGroup" text="" checkable="false" checked="false" clickable="true" enabled="true" focusable="true" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[0,2216][1080,2340]" displayed="true">
                  <android.widget.TextView index="0" package="tr.com.dia.mobile.android.erp" class="android.widget.TextView" text="DİA Mobile hoşgeldiniz." checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[14,2238][970,2318]" displayed="true" />
                  <android.widget.ImageView index="1" package="tr.com.dia.mobile.android.erp" class="android.widget.ImageView" text="" checkable="false" checked="false" clickable="false" enabled="true" focusable="false" focused="false" long-clickable="false" password="false" scrollable="false" selected="false" bounds="[970,2230][1066,2326]" displayed="true" />
                </android.view.ViewGroup>
              </android.view.ViewGroup>
            </android.widget.FrameLayout>
          </android.widget.FrameLayout>
        </android.widget.LinearLayout>
      </android.widget.FrameLayout>
    </android.widget.LinearLayout>
  </android.widget.FrameLayout>
</hierarchy>
 */