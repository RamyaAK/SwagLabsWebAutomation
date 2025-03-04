package swag_labs_client_tests.cart;

import org.testng.Assert;
import org.testng.annotations.Test;
import swag_labs_client_tests.base.BaseTest;

public class CartTests extends BaseTest {
    @Test
    public void buyProduct(){
        /* login-> login page
         select a product -> inventory page
         add to cart -> product details page
         click on cart icon -> checkout page
         click on checkout btn -> checkout page
         Fill Firstname, lastname and Zip and click continue -> checkout information page
         click on finish button -> checkout overview page
         Assert msg "thank for your order" -> checkout complete page
         */
        homePage.enter_username("standard_user")
                .enter_password("secret_sauce")
                .click_on_login_button();
        loginPage.verify_on_login_page();
        inventoryPage.select_product("Sauce Labs Bolt T-Shirt");
        productDetailsPage.add_to_cart();
        checkoutPage.clickOnCheckoutButton();
        checkoutInformationPage.FillDetails("Rohan","Sharma","123141");
        checkoutOverviewPage.clickOnFinishButton();
       String result= checkoutCompletePage.verifyOrderPlacedSuccessfully();
        Assert.assertEquals(result,"THANK YOU FOR YOUR ORDER");

    }
}
