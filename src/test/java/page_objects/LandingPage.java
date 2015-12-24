package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**    .md-button.md-ink-ripple >
 * Created by dmitrykovpak on 23/12/15.
 */
public class LandingPage {

    @FindBy(how = How.CSS, using = "#radio_0")
    private WebElement visaPlatiunumRewardsCheckbox;

    @FindBy(how = How.CSS, using = "radio#1")
    private WebElement visaPlatinumCheckbox;

    @FindBy(how = How.CSS, using = "radio#2")
    private WebElement visaClassicCheckbox;

    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/md-toolbar/div/button[2]")
    private WebElement nextButton;

    //public static By VisaPlatinumcheckbox = By.cssSelector("#radio_1");
    //public static By VisaClassiccheckbox = By.cssSelector("#radio_2");
    //public static By Nextbutton = By.xpath("html/body/div[1]/div/md-toolbar/div/button[2]");

    public void checkVisaPlatiunumRewardscheckbox() {
        if (!visaPlatiunumRewardsCheckbox.isSelected()) {
            visaPlatiunumRewardsCheckbox.click();
        }
    }
}
