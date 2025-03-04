package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
   private WebDriver driver;
   private By add_to_cart_button =By.cssSelector(".btn_primary.btn_inventory");
   private By cart_icon = By.cssSelector(".fa-layers-counter.shopping_cart_badge");

    public ProductDetailsPage(WebDriver driver) {
        this.driver =driver;
    }

    public CheckoutPage add_to_cart() {
        driver.findElement(add_to_cart_button).click();
        driver.findElement(cart_icon).click();
        return new CheckoutPage(driver);
    }



}
