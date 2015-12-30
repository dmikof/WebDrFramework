package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import utils.AdditionalConditions;
import utils.DriverFactory;

//import static page_objects.LandingPage.getWizardTitleText;

/**
 * Created by dmitrykovpak on 25/12/15.
 */
public class checkLandingPageWizardTextKPCU extends DriverFactory {
     @Test
    public void testLandingPageWizardText() throws Exception {
        getDriver().get("http://staging.kpcu.agilefusion.work/");
        LandingPage landingPage = new LandingPage();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
         //String WizardTitleText = landingPage.wizardTitle.getText();
        Assert.assertEquals("Card Type", landingPage.getWizardTitleText());
    }

}
