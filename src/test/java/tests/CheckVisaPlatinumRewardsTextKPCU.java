package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import utils.AdditionalConditions;
import utils.DriverFactory;

/**
 * Created by dmitrykovpak on 28/12/15.
 */
public class CheckVisaPlatinumRewardsTextKPCU extends DriverFactory {
    @Test
    public void checkVisaPlatinumRewardsText() throws Exception {
        //getDriver().get("http://staging.kpcu.agilefusion.work/");
        loadLandingPage();
        LandingPage landingPage = new LandingPage();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        Assert.assertEquals(landingPage.getVisaPlatinumRewardsText(), "Visa Platinum Rewards\n" +
                "Annual Fee: $0\n" +
                "As low as 8.99% APR\n" +
                "2,500 Welcome bonus reward points");
    }
}

