package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyMessage;



   public void selectJobType(String job){
       CustomListeners.test.log(Status.PASS, "Select Job type ");
       Reporter.log("Select Job type" + selectJobtypeList.toString());
       clickOnElement(selectJobtypeList);

   }

    public void clickNextStepButton() {
        Reporter.log("Click on Next step" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click On Next step");
        clickOnElement(nextStepButton);
    }
    public String verifyMessageForWork(){
        CustomListeners.test.log(Status.PASS, "Verify Message for Work ");
        Reporter.log("Verify Message for Work" + verifyMessage.toString());
       return getTextFromElement(verifyMessage);


    }
}
