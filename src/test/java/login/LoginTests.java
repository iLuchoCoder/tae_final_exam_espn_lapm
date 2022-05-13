package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessLogin(){
        loginPage.clickLoginPreButton1();
        loginPage.clickLoginPreButton2();
        loginPage.setToiFrame();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        loginPage.waitTimePreButton1();
        loginPage.clickLoginPreButton1();
        assertTrue(loginPage.getOnPageAlert().contains("Welcome"),"Alert text is incorrect");
    }

    @Test
    public void testSuccessLogout(){
        loginPage.clickLogoutPostButton();
        loginPage.waitTimeLabelLogInOut();
        assertTrue(loginPage.getOnPageAlertLogOutSuccesfull().contains("button"),"Alert text is incorrect");
    }
}
