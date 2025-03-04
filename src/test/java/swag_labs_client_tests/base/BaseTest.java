package swag_labs_client_tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import swag_labs.pages.*;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;
    protected ProductDetailsPage productDetailsPage;
    protected CheckoutPage checkoutPage;
    protected CheckoutInformationPage checkoutInformationPage;
    protected CheckoutOverviewPage checkoutOverviewPage;
    protected CheckoutCompletePage checkoutCompletePage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        this.driver = driver;
        launchUrl();
        initializePageObjects();
    }

    private void initializePageObjects() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutOverviewPage= new CheckoutOverviewPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);

    }

    private void launchUrl() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @AfterClass
    public void teardown() {
        driver.close();
        System.out.println("closing tests, Thank you!");
    }
}
