package final_exam;

import base.BaseTests;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import static org.testng.Assert.assertTrue;

public class SingleTests extends BaseTests {

    private Logger log = Logger.getLogger(SingleTests.class);

    @Test(description = "Point 2 - Click on login and check some elements")
    public void checkElementsOnIframeLoginButton(){
        log.info("Clicking on login button front page");
        frontPage.clickOnLogInButtonOnFrontPage();
        log.info("Setting the test onto one single login iFrame");
        frontPage.setToOneSingleLoginIframe();
        log.info("Checking if the logo is displayed in the iFrame");
        assertTrue(frontPage.getOnElementAlertLogoIframe(),"Logo not found");
        log.info("Checking if the login button is displayed in the iFrame");
        assertTrue(frontPage.getOnElementAlertLoginButtonIframe(),"Login Button not found");
        log.info("Checking if the sign up button is displayed in the iFrame");
        assertTrue(frontPage.getOnElementAlertSignUpButtonIframe(),"Sign Up Button not found");
    }

    @Test(description = "Point 3 - Click sign up button and check some elements", dependsOnMethods = "checkElementsOnIframeLoginButton")
    public void signUpOnIframe(){
        log.info("Clicking on sign up button on the iFrame");
        frontPage.clickOnSignUpButtonOnFrontPage();
        log.info("Clicking on country/region to change it to United States");
        frontPage.clickOnCountryRegion();
        log.info("Clicking on the region selector");
    }
}
