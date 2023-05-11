package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectCountry;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickContinueBtn;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement selectReasonWork;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(id="response-1")
    WebElement moreThanSixMonths;

public void selectReasonForWork(){
    selectByVisibleTextFromDropDown(selectReasonWork,"Work, academic visit or business");
}

  public void selectLengthOfStay(String moreOrLess){

      switch (moreOrLess.toLowerCase()) {
          case "more":
              clickOnElement(moreThanSixMonths);
              break;
          case "less":
              clickOnElement(lessThanSixMonths);
              break;
          default:
              System.out.println("Invalid selection. Please enter either 'more' or 'less'.");

      }
  }


  public void clickNextStepButton(){
      CustomListeners.test.log(Status.PASS, "Click on Next step button ");
      Reporter.log("Clicking on Next step button" + clickContinueBtn.toString());
      clickOnElement(clickContinueBtn);

  }
}
