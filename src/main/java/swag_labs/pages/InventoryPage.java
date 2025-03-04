package swag_labs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage {
    private WebDriver driver;
    private By product_names = By.cssSelector(".inventory_item_name"); //6

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductDetailsPage select_product(String product_name){
        List<WebElement> products =driver.findElements(product_names);
        for(int i=0;i<products.size();i++){
            if(product_name.equalsIgnoreCase(products.get(i).getText())){
                products.get(i).click();
                break;
            }
        }
        return new ProductDetailsPage(driver);
    }

}
