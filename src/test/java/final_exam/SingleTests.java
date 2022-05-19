package final_exam;

import base.BaseTests;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SingleTests extends BaseTests {

    private Logger log = Logger.getLogger(SingleTests.class);

    @Test(description = "Point 1, 2 - Click on login and check some elements")
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

    @Test(description = "Point 3 - Click sign up button and check some elements"
            , dependsOnMethods = "checkElementsOnIframeLoginButton")
    public void checkElementsOnSignUpOnIframe(){
        log.info("Clicking on sign up button on the iFrame");
        frontPage.clickOnSignUpButtonOnFrontPage();
        log.info("Validating if -> 'Create Account' title is present");
        // In the exercise says compare with Sign Up, but maybe it changes, so I changed it to Create Account like is displayed actually
        assertEquals(frontPage.getOnElementAlertSignUpTittle(),"Create Account","Sign Up tittle not present");
        log.info("Validating if -> 'First Name' input is present");
        assertTrue(frontPage.getOnElementAlertFirstNameInput(),"First Name Input not present");
        log.info("Validating if -> 'Last name' input is present");
        assertTrue(frontPage.getOnElementAlertLastNameInput(),"Last Name Input not present");
        log.info("Validating if -> 'Email' input is present");
        assertTrue(frontPage.getOnElementAlertEmailInput(),"Email Input not present");
        log.info("Validating if -> 'Password' input is present");
        assertTrue(frontPage.getOnElementAlertPasswordInput(),"Password Input not present");
        log.info("Validating if -> 'Sign Up' button");
        assertTrue(frontPage.getOnElementAlertSignUpButtonIframe(),"Sign Up Button not found");
        log.info("Validating if -> 'X' close button");
        assertTrue(frontPage.getOnElementAlertCloseButtonIframe(),"Sign Up Button not found");
    }

    @Test(description = "Point 4 - Data will be generated to be placed on the page and make a record"
            ,dependsOnMethods = "checkElementsOnSignUpOnIframe")
    public void signUpAccount(){
        log.info("Putting the data on the page");
        frontPage.fillSignUpData();
        log.info("Clicking on Sign Up");
        frontPage.clickOnSignUpButtonOnFrontPage();
        log.info("Waiting until the element PreButton1 shows up");
        frontPage.waitTimePreButton1();
        log.info("Clicking on pre login button 1");
        frontPage.clickLoginPreButton1();
        log.info("Finally checking if the login process completes successfully after sign up");
        assertTrue(frontPage.getOnPageAlert().contains("Welcome"),"Alert text is incorrect");
    }

    @Test(description = "Points 5,6,7 - Click on 'Watch' and validate that at least one carousel is present"
            ,dependsOnMethods = "signUpAccount")
    public void clickWatchSectionAndValidate(){
        log.info("Clicking on Watch Section");
        frontPage.clickWatchButton();
        log.info("Waiting until the element Video Carrousel shows up");
        frontPage.waitVideoCarrousel();
        log.info("Clicking on the second video on the first carrousel");
        frontPage.clickVideoCarrousel();
        log.info("Waiting until the element Close Button Video Carrousel shows up");
        frontPage.waitCloseButtonVideoCarrousel();
        log.info("Validating if -> 'X' close button on carrousel");
        assertTrue(frontPage.getOnElementCloseButtonVideoCarrousel(),"Close Button not found");
        log.info("Clicking on the 'X' close button on carrousel");
        frontPage.clickCloseButtonVideoCarrousel();
    }

    @Test(description = "Points 8, 9 - Go back to landing page and validate 'Welcome {{username}}!'"
            ,dependsOnMethods = "clickWatchSectionAndValidate")
    public void validateWelcomeLoginMessage(){
        log.info("Going back to the landing page");
        backPage();
        log.info("Waiting until the element PreButton1 shows up");
        frontPage.waitTimePreButton1();
        log.info("Clicking on pre login button 1");
        frontPage.clickLoginPreButton1();
        log.info("Validating text -> 'Welcome {{username}}!'");
        log.info(frontPage.getOnElementAlertWelcomeLabelTittle());
        // The page gives the welcome message with spaces
        assertTrue(frontPage.getOnElementAlertWelcomeLabelTittle().contains("Welcome"+frontPage.returnFirstName()+"!"),"Welcome message is incorrect");
    }

    @Test(description = "Point 10 - Finally click on log out button and validate welcome message"
            ,dependsOnMethods = "validateWelcomeLoginMessage")
    public void logOutAndValidateWelcomeMessage(){
        log.info("Clicking on logout button");
        frontPage.clickLogoutPostButton();
        log.info("Waiting until the element PreButton1 shows up");
        frontPage.waitTimePreButton1();
        log.info("Clicking on pre login button 1");
        frontPage.clickLoginPreButton1();
        log.info("Validating text -> 'Welcome!'");
        log.info(frontPage.getOnElementAlertWelcomeLabelTittle());
        assertTrue(frontPage.getOnElementAlertWelcomeLabelTittle().contains("Welcome!"),"Welcome message is incorrect");
    }
}
