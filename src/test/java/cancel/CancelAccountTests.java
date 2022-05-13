package cancel;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CancelAccountTests extends BaseTests {

    @Test
    public void testSuccessCancelAccount(){
        loginPage.clickLoginPreButton1();
        loginPage.clickLoginPreButton2();
        loginPage.setToiFrame();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        loginPage.waitTimePreButton1();
        loginPage.clickLoginPreButton1();
        loginPage.clickProfileButton();
        loginPage.setToiFrame();
        loginPage.clickCancelAccountButton();
        loginPage.clickSubmitCancelationButton();
        assertTrue(loginPage.getOnPageAlertLogOutSuccesfull().contains("button"),"Alert text is incorrect");
    }
}
