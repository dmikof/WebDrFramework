package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.ApplicationTypePage;
import page_objects.LandingPage;
import utils.AdditionalConditions;
import utils.DriverFactory;

/**
 * Created by dmitrykovpak on 28/12/15.
 */
public class VisaPlatinumSelectionAndToApplicationTypeKPCU extends DriverFactory {
    @Test
    public void testVisaPlatinumSelectionAndToAplicationTypeKPCU() throws Exception {
            //getDriver().get("http://staging.kpcu.agilefusion.work/");
        loadLandingPage();
        LandingPage landingPage = new LandingPage();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        landingPage.checkVisaPlatinum();
        landingPage.clickNextbutton();
        ApplicationTypePage applicationTypePage = new ApplicationTypePage();
            //wait.until(AdditionalConditions.angularHasFinishedProcessing());
        Assert.assertEquals(applicationTypePage.getWizardTitleText(), "Application Type");
    }
}
