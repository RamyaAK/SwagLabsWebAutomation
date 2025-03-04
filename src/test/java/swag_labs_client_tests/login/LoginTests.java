package swag_labs_client_tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import swag_labs_client_tests.base.BaseTest;

public class LoginTests extends BaseTest {
    @Test
    public void valid_login_test() {
        homePage.enter_username("standard_user")
                .enter_password("secret_sauce")
                .click_on_login_button();
        String result = loginPage.verify_on_login_page();
        Assert.assertEquals(result, "Swag Labs", "Login successful.");

    }

    @Test
    public void Invalid_login_test() {
        homePage.enter_username("abc")
                .enter_password("abc_123")
                .click_on_login_button();
        Boolean result = homePage.isErrorMsgDisplayed();
        Assert.assertTrue(result);
        System.out.println(result);

    }
}
