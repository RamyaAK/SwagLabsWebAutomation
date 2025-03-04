package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
  private WebDriver driver;
  private By checkout_button = By.cssSelector(".btn_action.checkout_button");

    public CheckoutPage(WebDriver driver) {
      this.driver =driver;
    }

    public CheckoutInformationPage clickOnCheckoutButton(){
      driver.findElement(checkout_button).click();
      return new CheckoutInformationPage(driver);
    }
}
