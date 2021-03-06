package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import utils.AdditionalConditions;
import utils.DriverFactory;

/**
 * Created by dmitrykovpak on 26/12/15.
 */
public class checkVizaPlatinumTextKPCU extends DriverFactory {
    @Test
    public void testVisaPlatinumRewards() throws Exception {
        //getDriver().get("http://staging.kpcu.agilefusion.work/");
        loadLandingPage();
        LandingPage landingPage = new LandingPage();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        Assert.assertEquals(landingPage.getVisaPlatinumText(), "Visa Platinum\n" +
                "Annual Fee: $0\n" +
                "As low as 6.99% APR\n" +
                "First 6 months 0% APR for balance transfers");

    }
}
