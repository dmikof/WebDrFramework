package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.DocumentType;
import utils.DriverFactory;

import javax.swing.text.Document;

/**
 * Created by dmitrykovpak on 25/12/15.
 */
public class ApplicationTypePage {

    @FindBy(how = How.CSS, using = "[wizard-title='']")
    private WebElement wizardTitle;

    @FindBy(how = How.ID, using = "radio_3")
    private WebElement invidualRadioBtn;

    @FindBy(how = How.CSS, using = "input[id = 'phone']")
    private WebElement phoneField;

    @FindBy(how= How.ID, using = "radio_4")
    private WebElement jointRadioBtn;

    @FindBy(how = How.CSS, using = "input[id = 'email']")
    private WebElement emailField;

    @FindBy(how = How.CSS, using = "[data-test='button-next']")
    private WebElement nextButton;

    @FindBy(how = How.CSS, using = "[data-test='button-back']")
    private WebElement backButton;

    @FindBy(how = How.CSS, using = "input[id = 'promoCode']")
    private WebElement promoCodeField;


    public ApplicationTypePage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this); }

    public String getWizardTitleText() {
       String wizardTitleText = wizardTitle.getText();
        return wizardTitleText;
    }

    public void selectIndividualType() throws Exception {
        if(!jointRadioBtn.isSelected()){
            jointRadioBtn.click();
        }
        if(!invidualRadioBtn.isSelected()){
            invidualRadioBtn.click();
        }
    }

    public void selectJointType() throws Exception {
        if(!jointRadioBtn.isSelected()){
            jointRadioBtn.click();
        }
    }

    public void enterPhoneNumber() throws Exception {
        phoneField.sendKeys("(916) 445-2841");
    }

    public void enterEmailAddress() throws Exception {
        emailField.sendKeys("governor@governor.ca.gov");
    }

    public LandingPage clickBackButton() throws Exception {
        backButton.click();
        return new LandingPage();
    }

    public void falseClickOnNextButton() throws Exception {
        nextButton.click();
    }

    public DocumentTypePage clickOnNextButton() throws Exception {
        nextButton.click();
        return new DocumentTypePage();
    }
}
