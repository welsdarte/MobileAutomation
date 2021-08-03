package Base;

import org.openqa.selenium.WebDriver;


public class AppDriver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){
        return driver.get();
    }
    public static void setDriver(WebDriver Driver){
        System.out.println("setDriver________: " + Driver);
        driver.set(Driver);
        System.out.println("Driver is set");
    }
}