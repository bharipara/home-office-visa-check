package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;



    public void selectNationality(String nationality) {

            Reporter.log("Select nationality" + nationalityDropDownList.toString());
            selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
            CustomListeners.test.log(Status.PASS, "Select nationality");
        }


    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS, "Click on Next step Button ");
        Reporter.log("Clicking on Next step Button" + nextStepButton.toString());
        clickOnElement(nextStepButton);

    }
}
