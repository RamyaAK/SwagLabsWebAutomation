package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By username = By.cssSelector("#user-name");
    private By password = By.cssSelector("#password");
    private By login_btn = By.cssSelector("#login-button");
    private By error_msg = By.cssSelector("h3[data-test='error']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enter_username(String user_id){
        driver.findElement(username).sendKeys(user_id);
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
