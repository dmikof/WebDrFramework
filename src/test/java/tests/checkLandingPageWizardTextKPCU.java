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
        getDriver().get("http://54.200.206.205:32789/");
        LandingPage landingPage = new LandingPage();
        //WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        //wait.until(AdditionalConditions.angularHasFinishedProcessing());
         Thread.sleep(20000);
         //String WizardTitleText = landingPage.wizardTitle.getText();
        Assert.assertEquals("Card Type", landingPage.wizardTitle.getText());
    }


}
