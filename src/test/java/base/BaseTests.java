package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import strings.EspnStrings;

public class BaseTests {

    private WebDriver driver;
    protected LoginPage loginPage;
    private static EspnStrings espnStrings = new EspnStrings();

    @BeforeClass
    @Parameters({"url"})
    public void SetUpDocument(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void shutdown(){
        driver.quit();
    }
}
