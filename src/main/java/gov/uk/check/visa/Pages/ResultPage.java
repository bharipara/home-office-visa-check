package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;




    public String getResultMessage(){
        CustomListeners.test.log(Status.PASS, "Get Result Message ");
        Reporter.log("Get Result Message" + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }
    public void confirmResultMessage(String expectedMessage){
        CustomListeners.test.log(Status.PASS, "Actual Result");
        Reporter.log("Actual Result" + resultMessage.toString());
        //SoftAssert softAssert = new SoftAssert();
        Assert.assertTrue(getResultMessage().equals(expectedMessage));
        //softAssert.assertAll();
    }
}
