package sampleTest.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities cap;

    public static void Android_LaunchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Utku'nun Note 8'i");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        cap.setCapability("appPackage", "tr.com.dia.mobile.android.erp");
        cap.setCapability("appActivity", ".MainActivity");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");

        AppDriver.setDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap));
        System.out.println("driverInAndroid_LaunchApp(): " + AppDriver.getDriver());
        System.out.println("Android driver is set");

    }

    public static void iOS_LaunchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "iOS");
        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("platformVersion", "13.5");
        cap.setCapability("bundleId", "io.cloudgrey.the-app");
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        AppDriver.setDriver(driver);
        System.out.println("iOS driver is set");

    }

    public static void closeApp(){
        AppDriver.getDriver().quit();
    }
}