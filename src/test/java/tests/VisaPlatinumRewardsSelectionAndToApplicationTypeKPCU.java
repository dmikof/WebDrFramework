package tests;

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
public class VisaPlatinumRewardsSelectionAndToApplicationTypeKPCU extends DriverFactory{
    @Test
    public void testVisaPlatinumSelectionAndGoigtoNextPage() throws Exception{
        loadLandingPage();
        LandingPage landingPage = new LandingPage();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        landingPage.selectVisaPlatinumRewards();
        landingPage.clickNextbutton();
        ApplicationTypePage applicationTypePage = new ApplicationTypePage();
        //wait = new WebDriverWait(DriverFactory.getDriver(), 15, 100);
        //wait.until(AdditionalConditions.angularHasFinishedProcessing());
        //WebElement pageHeader = getDriver().findElement(By.cssSelector(""));
        Assert.assertEquals(applicationTypePage.getWizardTitleText(), "Application Type");
    }



}
