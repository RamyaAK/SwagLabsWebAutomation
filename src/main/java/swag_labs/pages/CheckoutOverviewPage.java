package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewPage {
    private WebDriver driver;
    private By finish_btn = By.cssSelector(".btn_action.cart_button");

    public CheckoutOverviewPage(WebDriver driver) {
      this.driver=driver;
    }

    public CheckoutCompletePage clickOnFinishButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(finish_btn));
        finishButton.click();
        return new CheckoutCompletePage(driver);
    }
}
