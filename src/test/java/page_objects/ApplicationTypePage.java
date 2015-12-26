package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

/**
 * Created by dmitrykovpak on 25/12/15.
 */
public class ApplicationTypePage {

    @FindBy(how = How.CSS, using = "[wizard-title='']")
    private WebElement wizardTitle;


    public ApplicationTypePage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this); }

    public String getWizardTitleText() {
       String wizardTitleText = wizardTitle.getText();
        return wizardTitleText;
    }
}
