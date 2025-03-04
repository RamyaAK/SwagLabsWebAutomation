package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage {
    private WebDriver driver;
    private By firstname = By.cssSelector("#first-name");
    private By lastname = By.cssSelector("#last-name");
    private By zip_code = By.cssSelector("#postal-code");
    private By continue_button = By.cssSelector("input[value='CONTINUE']");

    public CheckoutInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutOverviewPage FillDetails(String first_name, String last_name, String zip){
        driver.findElement(firstname).sendKeys(first_name);
        driver.findElement(lastname).sendKeys(last_name);
        driver.findElement(zip_code).sendKeys(zip);
        driver.findElement(continue_button).click();
        return new CheckoutOverviewPage(driver);
    }

}
