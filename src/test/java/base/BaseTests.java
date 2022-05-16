package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.FrontPage;
import strings.EspnStrings;

/**
 * BaseTests, class that setups the url and driver conditions
 * @author luis.pineda@globant.com
 */
public class BaseTests {

    private WebDriver driver;
    protected FrontPage frontPage;
    private static EspnStrings espnStrings = new EspnStrings();

    /**
     * SetUpDocument
     * Method that initializes the initial execution of the driver and is passed as a parameter to the Login Page
     */
    @BeforeClass
    @Parameters({"url"})
    public void SetUpDocument(String url){
        // Windows Property
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        // MacOS Property
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();

        frontPage = new FrontPage(driver);
    }

    /**
     * shutdown
     * Method that closes the driver after the execution of the tests
     */
    @AfterClass
    public void shutdown(){
        driver.quit();
    }
}
