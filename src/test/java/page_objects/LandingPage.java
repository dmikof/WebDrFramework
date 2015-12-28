package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

/**    .md-button.md-ink-ripple >
 * Created by dmitrykovpak on 23/12/15.
 */
public class LandingPage {

    @FindBy(how = How.CSS, using = "#radio_0")
    private WebElement visaPlatinumRewards;

    @FindBy(how = How.CSS, using = "#radio_1")
    private WebElement visaPlatinum;

    @FindBy(how = How.CSS, using = "#radio_2")
    private WebElement visaClassic;

    @FindBy(how = How.CSS, using = "[data-test='button-next']")
    private WebElement nextButton;

    //@FindBy(how = How.CSS, using = "[data-test='button-back']")
    //private WebElement backButton;

    @FindBy(how = How.CSS, using = "[wizard-title='']")
    public WebElement wizardTitle;

    public LandingPage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void selectVisaPlatinumRewards() {
        if (!visaPlatinumRewards.isSelected()) {
            visaPlatinumRewards.click();}
    }

    public void checkVisaPlatinum() {
        if (visaPlatinum.isSelected()) {
            visaPlatinum.click();
        }
    }

    public void checkVisaClassic() {
        if (!visaClassic.isSelected()) {
            visaClassic.click();
        }
    }

    public ApplicationTypePage clickNextbutton() throws Exception {
        nextButton.click();
        return new ApplicationTypePage();
    }

    public String getVisaPlatinumRewardsText() {
        String visaPlatinumRewardsText = visaPlatinumRewards.getText();
        return visaPlatinumRewardsText;
    }

    public String getVisaPlatinumText() {
        String visaPlatinumText = visaPlatinum.getText();
        return visaPlatinumText;
    }

    public String getVisaClassicText() {
        String visaClassicText = visaClassic.getText();
        return visaClassicText;
    }

    public  String getWizardTitleText() {
        String wizardTitleText = wizardTitle.getText();
        return wizardTitleText;
    }
}

