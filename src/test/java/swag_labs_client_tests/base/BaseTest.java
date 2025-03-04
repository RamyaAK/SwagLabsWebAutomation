package swag_labs_client_tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import swag_labs.pages.HomePage;
import swag_labs.pages.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        this.driver = driver;
        launchUrl();
        initializePageObjects();
    }

    private void initializePageObjects() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    private void launchUrl() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
        System.out.println("closing tests, Thank you!");
    }
}
