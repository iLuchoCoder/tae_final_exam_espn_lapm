package logout;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LogoutTests extends BaseTests {

    @Test
    public void testSuccessLogout(){
        loginPage.clickLoginPreButton1();
        loginPage.clickLoginPreButton2();
        loginPage.setToiFrame();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        loginPage.waitTimePreButton1();
        loginPage.clickLoginPreButton1();
        loginPage.clickLogoutPostButton();
        loginPage.waitTimeLabelLogInOut();
        assertTrue(loginPage.getOnPageAlertLogOutSuccesfull().contains("button"),"Alert text is incorrect");
    }
}
