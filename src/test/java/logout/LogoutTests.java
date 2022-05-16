package logout;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static org.testng.Assert.assertTrue;

public class LogoutTests extends BaseTests {

    private Logger log = Logger.getLogger(LogoutTests.class);

    @Test(description = "Test for logout process")
    public void testSuccessLogout(){
        log.info("Clicking on pre login button 1");
        frontPage.clickLoginPreButton1();
        log.info("Clicking on pre login button 2");
        frontPage.clickLoginPreButton2();
        log.info("Setting the test onto iFrame");
        frontPage.setToiFrame();
        log.info("Putting the username value on text username element");
        frontPage.setUsername();
        log.info("Putting the password value on text password element");
        frontPage.setPassword();
        log.info("Clicking on login button");
        frontPage.clickLoginButton();
        log.info("Waiting until the element PreButton1 shows up");
        frontPage.waitTimePreButton1();
        log.info("Clicking on pre login button 1");
        frontPage.clickLoginPreButton1();
        log.info("Clicking on log out post button");
        frontPage.clickLogoutPostButton();
        log.info("Waiting until the element LogInOut shows up");
        frontPage.waitTimeLabelLogInOut();
        log.info("Finally checking if the logout process completes successfully");
        assertTrue(frontPage.getOnPageAlertLogOutSuccesfull().contains("button"),"Alert text is incorrect");
    }
}
