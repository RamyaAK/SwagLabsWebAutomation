package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By menue_icon = By.cssSelector("div[class='bm-burger-button'] button");
    private By logout_button = By.cssSelector("#logout_sidebar_link");// 4 items

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String verify_on_login_page() {
        return driver.getTitle();
    }

    public void user_logout() {
        driver.findElement(menue_icon).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement logout_Button = driver.findElement(logout_button);
        js.executeScript("arguments[0].click();", logout_Button);
    }
}
