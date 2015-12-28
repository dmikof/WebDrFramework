package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import page_objects.ApplicationTypePage;
import page_objects.LandingPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dmitrykovpak on 16/12/15.
 */
public class DriverFactory {
    protected LandingPage landingPage;
    protected ApplicationTypePage applicationTypePage;

    private static List<WebDriverThread> webDriverThreadPool
            = Collections.synchronizedList(new ArrayList<WebDriverThread>());
    private static ThreadLocal<WebDriverThread> driverThread;

    @BeforeSuite
    public static void instantiateDriverObject() {
        driverThread = new ThreadLocal<WebDriverThread>() {
            @Override
        protected WebDriverThread initialValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                webDriverThreadPool.add(webDriverThread);
                return webDriverThread;
            }
        };
    }

    public static WebDriver getDriver() throws Exception {return driverThread.get().getDriver();}

    @AfterMethod
    public static void clearCookies() throws Exception {
        getDriver().manage().deleteAllCookies();
    }
   /*@AfterMethod
    public void closeDriver() throws Exception {
     getDriver().quit();
   }  */
  @AfterSuite
    public static void closeDriverObjects() {
        for (WebDriverThread webDriverThread : webDriverThreadPool) {
            webDriverThread.quitDriver();
        }
    }
}
