package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    private WebDriver driver;
    private By finish_button = By.cssSelector(".btn_action.cart_button");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver=driver;
    }

    public CheckoutCompletePage clickOnFinishButton(){
        driver.findElement(finish_button).click();
        return new CheckoutCompletePage(driver);
    }
}
