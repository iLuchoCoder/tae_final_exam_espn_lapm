package final_exam;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static org.testng.Assert.assertTrue;

public class FinalWebModuleTests extends BaseTests {

    private Logger log = Logger.getLogger(FinalWebModuleTests.class);

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
}
