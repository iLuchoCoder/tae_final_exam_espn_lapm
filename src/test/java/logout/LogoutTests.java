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
        loginPage.clickLoginPreButton1();
        log.info("Clicking on pre login button 2");
        loginPage.clickLoginPreButton2();
        log.info("Setting the test onto iFrame");
        loginPage.setToiFrame();
        log.info("Putting the username value on text username element");
        loginPage.setUsername();
        log.info("Putting the password value on text password element");
        loginPage.setPassword();
        log.info("Clicking on login button");
        loginPage.clickLoginButton();
        log.info("Waiting until the element PreButton1 shows up");
        loginPage.waitTimePreButton1();
        log.info("Clicking on pre login button 1");
        loginPage.clickLoginPreButton1();
        log.info("Clicking on log out post button");
        loginPage.clickLogoutPostButton();
        log.info("Waiting until the element LogInOut shows up");
        loginPage.waitTimeLabelLogInOut();
        log.info("Finally checking if the logout process completes successfully");
        assertTrue(loginPage.getOnPageAlertLogOutSuccesfull().contains("button"),"Alert text is incorrect");
    }
}
