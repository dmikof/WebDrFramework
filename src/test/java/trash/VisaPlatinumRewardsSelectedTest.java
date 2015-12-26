package trash;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.DriverFactory;
import utils.AdditionalConditions;



/**
 * Created by dmitrykovpak on 21/12/15.
 */
public class VisaPlatinumRewardsSelectedTest extends DriverFactory {


    public void VisaPlatiunumRewardsSelected() throws Exception{
        WebDriver driver = DriverFactory.getDriver();
        driver.get("http://54.200.206.205:32789/");
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        WebElement VisaPlatiunumRewardscheckbox = driver.findElement(By.cssSelector("#radio_0"));
        if (!VisaPlatiunumRewardscheckbox.isSelected())VisaPlatiunumRewardscheckbox.click();
        //WebElement Nextbutton = driver.findElements(By.cssSelector("[class='ng-binding ng-scope']")).get(1);
        WebElement Nextbutton = driver.findElements(By.cssSelector(".md-button.md-ink-ripple")).get(1);
        Nextbutton.click();
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        WebElement pageHeader = driver.findElement(By.xpath("html/body/div[1]/div/md-toolbar/div/div/h2"));
        System.out.println("Page is " + pageHeader.getText());
        Assert.assertEquals(pageHeader.getText(), "Application Type");

    }
}
