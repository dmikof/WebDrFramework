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
public class CheckVisaClassicTextKPCU extends DriverFactory {
    @Test
    public void checkVisaClassicText() throws Exception{
        getDriver().get("http://54.200.206.205:32789/");
        LandingPage landingPage = new LandingPage();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15, 100);
        wait.until(AdditionalConditions.angularHasFinishedProcessing());
        Assert.assertEquals("Visa Classic\n" +
                "Annual Fee: $0\n" +
                "As low as 8.99% APR* 2,500\n" +
                "Welcome bonus reward points", landingPage.getVisaClassicText());
    }
}
