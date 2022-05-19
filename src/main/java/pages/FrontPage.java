package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import strings.EspnStrings;
import util.AccountGenerator;


/**
 * ESPN Login Page, class that contains the methods to be used in the test
 * @author luis.pineda@globant.com
 */
public class FrontPage {
    /**
     * Attributes
     */
    private WebDriver driver;
    private EspnStrings espnStrings = new EspnStrings();
    private Logger log = Logger.getLogger(FrontPage.class);
    private String first_name ="";

    private By loginPreButton1 = By.xpath(espnStrings.getElement1());
    private By loginPreButton2 = By.xpath(espnStrings.getElement2());
    private By loginIframe = By.cssSelector(espnStrings.getElement3());
    private By usernameField = By.xpath(espnStrings.getElement4());
    private By passwordField = By.xpath(espnStrings.getElement5());
    private By loginButton = By.xpath(espnStrings.getElement6());
    private By logoutButton = By.xpath(espnStrings.getElement7());
    private By logoutPostButton = By.xpath(espnStrings.getElement8());
    private By labelWelcomeLogIn = By.xpath(espnStrings.getElement9());
    private By profileButton = By.xpath(espnStrings.getElement10());
    private By cancelAccountButton = By.xpath(espnStrings.getElement11());
    private By submitCancelationButton = By.xpath(espnStrings.getElement12());

    // Section for Final Exam Web Module properties
    private By loginFrontPageButton = By.xpath(espnStrings.getElement13());
    private By oneSingleIframe = By.xpath(espnStrings.getElement14());
    private By iframeLogo = By.xpath(espnStrings.getElement15());
    private By loginButtonIframe = By.xpath(espnStrings.getElement16());
    private By signUpButtonIframe = By.xpath(espnStrings.getElement17());
    private By countryRegionLink = By.xpath(espnStrings.getElement18());
    private By signUpTittle = By.xpath(espnStrings.getElement19());
    private By firstNameInput = By.xpath(espnStrings.getElement20());
    private By lastNameInput = By.xpath(espnStrings.getElement21());
    private By emailInput = By.xpath(espnStrings.getElement22());
    private By passwordInput = By.xpath(espnStrings.getElement23());
    private By closeButtonIframe = By.xpath(espnStrings.getElement24());
    private By watchButton = By.xpath(espnStrings.getElement25());
    private By carrouselOnWatch = By.xpath(espnStrings.getElement26());
    private By closeButtonCarrousel = By.xpath(espnStrings.getElement27());
    private By welcomeLabel = By.xpath(espnStrings.getElement28());


    /**
     * Constructor.
     */
    public FrontPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * setUsername
     * Method to set the username onto the found element on ESPN Page.
     */
    public void setUsername(){
        driver.findElement(usernameField).sendKeys(espnStrings.getUsername());
    }

    /**
     * setPassword
     * Method to set the password onto the found element on ESPN Page.
     */
    public void setPassword(){
        driver.findElement(passwordField).sendKeys(espnStrings.getPassword());
    }

    /**
     * clickLoginPreButton1
     * Method that click onto the found element on ESPN Page.
     */
    public void clickLoginPreButton1(){
        driver.findElement(loginPreButton1).click();
    }

    /**
     * clickLoginPreButton2
     * Method that click onto the found element on ESPN Page.
     */
    public void clickLoginPreButton2(){
        driver.findElement(loginPreButton2).click();
    }

    /**
     * clickLogoutPostButton
     * Method that click onto the found element on ESPN Page.
     */
    public void clickLogoutPostButton(){
        driver.findElement(logoutPostButton).click();
    }

    /**
     * clickProfileButton
     * Method that click onto the found element on ESPN Page.
     */
    public void clickProfileButton(){
        driver.findElement(profileButton).click();
    }

    /**
     * clickCancelAccountButton
     * Method that click onto the found element on ESPN Page.
     */
    public void clickCancelAccountButton(){
        driver.findElement(cancelAccountButton).click();
    }

    /**
     * clickSubmitCancelationButton
     * Method that click onto the found element on ESPN Page.
     */
    public void clickSubmitCancelationButton(){
        driver.findElement(submitCancelationButton).click();
    }

    /**
     * clickLoginButton
     * Method that click onto the found element on ESPN Page.
     */
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    /**
     * setToiFrame
     * Method that switch the test onto the found frame on the ESPN Page.
     */
    public void setToiFrame(){
        driver.switchTo().frame(driver.findElement(loginIframe));
    }

    /**
     * getOnPageAlert
     * Method that returns the element text on ESPN Page.
     * @return String
     */
    public String getOnPageAlert(){
        return driver.findElement(logoutButton).getText();
    }

    /**
     * getOnPageAlertLogOutSuccesfull
     * Method that returns the element tag name on ESPN Page.
     * @return String
     */
    public String getOnPageAlertLogOutSuccesfull(){
        return driver.findElement(labelWelcomeLogIn).getTagName();
    }

    /**
     * waitTimePreButton1
     * Method that realize a wait until the visibility of element1 on ESPN Page.
     */
    public void waitTimePreButton1(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnStrings.getElement1())));
    }

    /**
     * waitTimeLabelLogInOut
     * Method that realize a wait until the visibility of element9 on ESPN Page.
     */
    public void waitTimeLabelLogInOut(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(espnStrings.getElement9())));
    }

    //// Section for Final Exam Web Module methods

    /**
     * clickOnLogInButtonOnFrontPage
     * Method that click onto the found element on ESPN Page.
     */
    public void clickOnLogInButtonOnFrontPage(){
        driver.findElement(loginFrontPageButton).click();
    }

    /**
     * setToiFrame
     * Method that switch the test onto the found frame on the ESPN Page.
     */
    public void setToOneSingleLoginIframe(){
        driver.switchTo().frame(driver.findElement(oneSingleIframe));
    }

    /**
     * getOnElementAlertLogoIframe
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertLogoIframe(){
        return driver.findElement(iframeLogo).isDisplayed();
    }

    /**
     * getOnElementAlertLoginButtonIframe
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertLoginButtonIframe(){
        return driver.findElement(loginButtonIframe).isDisplayed();
    }

    /**
     * getOnElementAlertSignUpButtonIframe
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertSignUpButtonIframe(){
        return driver.findElement(signUpButtonIframe).isDisplayed();
    }

    /**
     * clickOnSignUpButtonOnFrontPage
     * Method that click onto the found element on ESPN Page.
     */
    public void clickOnSignUpButtonOnFrontPage(){
        driver.findElement(signUpButtonIframe).click();
    }

    /**
     * clickOnCountryRegion
     * Method that click onto the found element on ESPN Page.
     */
    public void clickOnCountryRegion(){
        driver.findElement(countryRegionLink).click();
    }

    /**
     * getOnElementAlertSignUpTittle
     * Method that returns the text from the element
     * @return String
     */
    public String getOnElementAlertSignUpTittle(){
        return driver.findElement(signUpTittle).getText();
    }

    /**
     * getOnElementAlertFirstNameInput
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertFirstNameInput(){
        return driver.findElement(firstNameInput).isDisplayed();
    }

    /**
     * getOnElementAlertLastNameInput
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertLastNameInput(){
        return driver.findElement(lastNameInput).isDisplayed();
    }

    /**
     * getOnElementAlertEmailInput
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertEmailInput(){
        return driver.findElement(emailInput).isDisplayed();
    }

    /**
     * getOnElementAlertEmailInput
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertPasswordInput(){
        return driver.findElement(passwordInput).isDisplayed();
    }

    /**
     * getOnElementAlertcloseButtonIframe
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementAlertCloseButtonIframe(){
        return driver.findElement(closeButtonIframe).isDisplayed();
    }

    /**
     * fillSignUpData
     * Method that fill the first name, last name, email and password in the Sign Up form
     */
    public void fillSignUpData(){
        AccountGenerator accountGenerator = new AccountGenerator();
        log.info("Setting the first name on page [" + accountGenerator.getFirstName()+"]");
        first_name = accountGenerator.getFirstName();
        driver.findElement(firstNameInput).sendKeys(accountGenerator.getFirstName());
        log.info("Setting the last name on page [" + accountGenerator.getLastName()+"]");
        driver.findElement(lastNameInput).sendKeys(accountGenerator.getLastName());
        log.info("Setting the email on page [" + accountGenerator.getEmail()+"]");
        driver.findElement(emailInput).sendKeys(accountGenerator.getEmail());
        log.info("Setting the password on page [" + accountGenerator.getPassword()+"]");
        driver.findElement(passwordInput).sendKeys(accountGenerator.getPassword());
    }

    /**
     * returnFirstName
     * Method that returns the first name generated previously
     * @return String
     */
    public String returnFirstName(){
        return first_name;
    }

    /**
     * clickWatchButton
     * Method that click onto the found element on ESPN Page.
     */
    public void clickWatchButton(){
        driver.findElement(watchButton).click();
    }

    /**
     * clickCarrousel
     * Method that click onto the found element on ESPN Page.
     */
    public void clickVideoCarrousel(){
        driver.findElement(carrouselOnWatch).click();
    }

    /**
     * getOnElementCloseButtonVideoCarrousel
     * Method that returns true if the element is displayed, otherwise false
     * @return boolean
     */
    public boolean getOnElementCloseButtonVideoCarrousel(){
        return driver.findElement(closeButtonCarrousel).isDisplayed();
    }

    /**
     * clickCloseButtonVideoCarrousel
     * Method that click onto the found element on ESPN Page.
     */
    public void clickCloseButtonVideoCarrousel(){
        driver.findElement(closeButtonCarrousel).click();
    }

    /**
     * waitVideoCarrousel
     * Method that realize a wait until the visibility of element26 on ESPN Page.
     */
    public void waitVideoCarrousel(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnStrings.getElement26())));
    }

    /**
     * waitCloseButtonVideoCarrousel
     * Method that realize a wait until the visibility of element27 on ESPN Page.
     */
    public void waitCloseButtonVideoCarrousel(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnStrings.getElement27())));
    }


    /**
     * getOnElementAlertWelcomeLabelTittle
     * Method that returns the text from the element
     * @return String
     */
    public String getOnElementAlertWelcomeLabelTittle(){
        return driver.findElement(welcomeLabel).getText();
    }



}
