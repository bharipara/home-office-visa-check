package gov.uk.check.visa.Pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlistners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startNowButton;


    public void clickOnAcceptCookies(){
        CustomListeners.test.log(Status.PASS, "Click on Accept cookies ");
        Reporter.log("Clicking on Accept cookies" + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }
    public void clickStartNow(){
        CustomListeners.test.log(Status.PASS, "Click on Start now ");
        Reporter.log("Clicking on Start now" + startNowButton.toString());
        clickOnElement(startNowButton);

    }
}
