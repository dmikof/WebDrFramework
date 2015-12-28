package trash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AdditionalConditions;
import utils.DriverFactory;

/**
 * Created by dmitrykovpak on 23/12/15.
 */
public class ClassForTestingTests {
    @Test
    public void Test() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://54.200.206.205:32789/");
        WebDriverWait wait = new WebDriverWait(driver, 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        String tesText = driver.findElement(By.cssSelector("#radio_2")).getText();
        System.out.println(tesText);
        Assert.assertEquals("Visa Classic\n" +
                "Annual Fee: $0\n" +
                "As low as 8.99% APR* 2,500\n" +
                "Welcome bonus reward points", tesText);
        // driver.findElement(By.cssSelector("[data-test='button-next']"));
       // driver.findElement(By.cssSelector("[wizard-title='']"));
        driver.quit();

    }
}
