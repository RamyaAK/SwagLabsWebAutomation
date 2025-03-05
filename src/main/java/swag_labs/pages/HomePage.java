package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    private By username = By.cssSelector("#user-name");
    private By password = By.cssSelector("#password");
    private By login_btn = By.cssSelector("#login-button");
    private By error_msg = By.cssSelector("h3[data-test='error']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String verifyOnHomePage(){
        return driver.getTitle();
    }

    public HomePage enter_username(String user_id){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-name")));
        usernameField.sendKeys(user_id);
        return new HomePage(driver);
    }

    public HomePage enter_password(String usr_pass){
        driver.findElement(password).sendKeys(usr_pass);
        return new HomePage(driver);
    }

    public LoginPage click_on_login_button(){
        driver.findElement(login_btn).click();
        return new LoginPage(driver);
    }
    public Boolean isErrorMsgDisplayed(){
      return driver.findElement(error_msg).isDisplayed();
    }
}
