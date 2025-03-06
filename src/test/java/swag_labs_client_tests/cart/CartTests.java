package swag_labs_client_tests.cart;

import org.testng.Assert;
import org.testng.annotations.Test;
import swag_labs_client_tests.base.BaseTest;

public class CartTests extends BaseTest {
    @Test(priority =0)
    public void buyProduct() {
        homePage.enter_username("standard_user")
                .enter_password("secret_sauce")
                .click_on_login_button();

        loginPage.verify_on_login_page();

        inventoryPage.select_product("Sauce Labs Bolt T-Shirt");

        productDetailsPage.add_to_cart();

        checkoutPage.clickOnCheckoutButton();

        checkoutInformationPage.FillDetails("Rohan", "Sharma", "test123");

        checkoutOverviewPage.clickOnFinishButton();

        String result = checkoutCompletePage.verifyOrderPlacedSuccessfully();
        Assert.assertEquals(result, "THANK YOU FOR YOUR ORDER");

        loginPage.user_logout();

    }
}
