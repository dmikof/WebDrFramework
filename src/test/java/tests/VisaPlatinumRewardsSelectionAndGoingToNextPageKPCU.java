package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.ApplicationTypePage;
import page_objects.LandingPage;
import utils.AdditionalConditions;
import utils.DriverFactory;

/**
 * Created by dmitrykovpak on 25/12/15.
 */
public class VisaPlatinumRewardsSelectionAndGoingToNextPageKPCU extends DriverFactory{
    @Test
    public void testVisaPlatinumSelectionAndGoigtoNextPage() throws Exception{
    getDriver().get("http://54.200.206.205:32789");
    LandingPage landingPage = new LandingPage();
        //WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        //wait.until(AdditionalConditions.angularHasFinishedProcessing());
        Thread.sleep(20000);
        landingPage.selectVisaPlatinumRewards();
        landingPage.clickNextbutton();
        ApplicationTypePage applicationTypePage = new ApplicationTypePage();
        //wait = new WebDriverWait(DriverFactory.getDriver(), 15, 100);
        //wait.until(AdditionalConditions.angularHasFinishedProcessing());
        //WebElement pageHeader = getDriver().findElement(By.cssSelector(""));
        Assert.assertEquals(applicationTypePage.getWizardTitleText(), "Application Type");
    }



}
