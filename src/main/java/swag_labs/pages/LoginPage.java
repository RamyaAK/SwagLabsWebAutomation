package swag_labs.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public String verify_on_login_page(){
        return driver.getTitle();
    }
}
