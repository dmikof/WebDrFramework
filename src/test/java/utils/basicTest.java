package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//run with mvn clean install -Dthreads=2 from the project folder
/**
 * Created by dmitrykovpak on 14/12/15.
 */
public class basicTest extends DriverFactory{
    private void googleExampleThatSearchesFor(final String searchString) throws Exception{
       WebDriver driver = DriverFactory.getDriver();
        driver.get("http://google.com");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.clear();
        searchField.sendKeys(searchString);
        System.out.println("Page title is: " + driver.getTitle());
        searchField.submit();
        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver driverObject) {
                return driverObject.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
            }
        });
        System.out.println("Page title is: " + driver.getTitle());
    }

    //@Test
    public void googleCheeseExample() throws Exception{
        googleExampleThatSearchesFor("Cheese!");
    }

    //@Test
    public void googleMilkExample() throws Exception{
        googleExampleThatSearchesFor("Milk!");
    }
}
