package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {
    private WebDriver driver;
    private By logoutbtn = By.cssSelector("div[class='bm-burger-button'] button");
    private By menuOptions = By.cssSelector(".bm-item.menu-item");// 4 items

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String verify_on_login_page() {
        return driver.getTitle();
    }

    public void logout() {
        driver.findElement(logoutbtn).click();
        List<WebElement> options = driver.findElements(menuOptions);
        String option ="Logout";
        for (WebElement webElement : options) {
            if (option.equalsIgnoreCase(webElement.getText())) {
                webElement.click();
                break;
            }
        }

    }
}
