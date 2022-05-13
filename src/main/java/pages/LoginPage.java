package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import strings.EspnStrings;

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

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(){
        driver.findElement(usernameField).sendKeys(espnStrings.getUsername());
    }

    public void setPassword(){
        driver.findElement(passwordField).sendKeys(espnStrings.getPassword());
    }

    public void clickLoginPreButton1(){
        driver.findElement(loginPreButton1).click();
    }

    public void clickLoginPreButton2(){
        driver.findElement(loginPreButton2).click();
    }

    public void clickLogoutPostButton(){
        driver.findElement(logoutPostButton).click();
    }

    public void clickProfileButton(){
        driver.findElement(profileButton).click();
    }

    public void clickCancelAccountButton(){
        driver.findElement(cancelAccountButton).click();
    }

    public void clickSubmitCancelationButton(){
        driver.findElement(submitCancelationButton).click();
    }

    public void setToiFrame(){
        driver.switchTo().frame(driver.findElement(loginIframe));
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String getOnPageAlert(){
        return driver.findElement(logoutButton).getText();
    }

    public String getOnPageAlertLogOutSuccesfull(){
        return driver.findElement(labelWelcomeLogIn).getTagName();
    }

    public void waitTimePreButton1(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(espnStrings.getElement1())));
    }

    public void waitTimeLabelLogInOut(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(espnStrings.getElement9())));
    }

}
