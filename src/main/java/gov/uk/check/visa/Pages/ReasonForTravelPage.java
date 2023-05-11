package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {



    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

     public void selectReasonForVisit(String reason){
         List<WebElement> reasonList = reasonForVisitList;
         for (WebElement reason1 : reasonList) {
             if (reason1.getText().equals(reason)) {
                 reason1.click();
             }
         }
         Reporter.log("Reason for visit" + reasonForVisitList.toString());
         CustomListeners.test.log(Status.PASS, "Reason for visit");

     }
//         CustomListeners.test.log(Status.PASS, "Select reason for visit ");
//         Reporter.log("Select reason for visit" + reason.toString());
        // clickOnElement(reasonForVisitList);


     public void clickNextStepButton(){
         CustomListeners.test.log(Status.PASS, "Click on Next step button ");
         Reporter.log("Clicking on Next step button" + nextStepButton.toString());
         clickOnElement(nextStepButton);

  }
}
