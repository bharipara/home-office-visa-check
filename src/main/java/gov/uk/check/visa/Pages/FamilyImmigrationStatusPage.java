package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(xpath= "//input[@id='response-0']")
    WebElement yesRadioBtn;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement noRadioBtn;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement verifyVisa;



    public void clickOnNextStepBtn() {
        Reporter.log("Click on Next step Button" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Next step Button");
        clickOnElement(nextStepButton);

    }

    public void clickNextStepButton(){
        Reporter.log("Click on Next step" + clickContinue.toString());
        CustomListeners.test.log(Status.PASS, "Click On Next step");
        clickOnElement(clickContinue);

    }
    public void clickOnRadioBtn(String YesOrNo){
        switch (YesOrNo) {
            case "Yes":
                clickOnElement(yesRadioBtn);
                break;
            case "No":
                clickOnElement(noRadioBtn);
                break;
            default:
                System.out.println("Invalid selection");
        }
       // Reporter.log("Select Yes Radio button" +yesRadioBtn.toString());
       // CustomListeners.test.log(Status.PASS, "Select Yes");
       // clickOnElement(yesRadioBtn);
    }

    public void clickContinueBtn(){
        Reporter.log("Click on Next step" + clickContinue.toString());
        CustomListeners.test.log(Status.PASS, "Click On Next step");
        clickOnElement(clickContinue);


    }
    public String verifyVisaText(){
        Reporter.log("Verify Visa Text" + verifyVisa.toString());
        CustomListeners.test.log(Status.PASS, "Verify Visa Text");
        return getTextFromElement(verifyVisa);
    }
}
