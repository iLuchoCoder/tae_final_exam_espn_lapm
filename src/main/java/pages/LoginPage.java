package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import strings.EspnStrings;

/**
 * ESPN Login Page, class that contains the methods to be used in the test
 * @author luis.pineda@globant.com
 */
public class LoginPage {

    private WebDriver driver;
    private EspnStrings espnStrings = new EspnStrings();

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

    /**
     * Constructor.
     */
    public LoginPage(WebDriver driver){
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
}
