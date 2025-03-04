package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
    private WebDriver driver;
    private By thank_you_button = By.cssSelector(".complete-header");

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public String verifyOrderPlacedSuccessfully(){
       return driver.findElement(thank_you_button).getText();

    }
}
