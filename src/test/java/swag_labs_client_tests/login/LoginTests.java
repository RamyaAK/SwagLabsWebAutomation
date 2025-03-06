package swag_labs_client_tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import swag_labs_client_tests.base.BaseTest;

public class LoginTests extends BaseTest {
    @Test(priority = 0)
    public void valid_login_test() {
        homePage.verifyOnHomePage();
        homePage.enter_username("standard_user")
                .enter_password("secret_sauce")
                .click_on_login_button();
        String result = loginPage.verify_on_login_page();
        loginPage.user_logout();
        String homePageTitle = homePage.verifyOnHomePage();
        Assert.assertEquals(homePageTitle,"Swag Labs","User on Homepage");
        Assert.assertEquals(result, "Swag Labs", "Login successful.");

    }

    @Test(priority = 1)
    public void Invalid_login_test() {
        homePage.enter_username("abc")
                .enter_password("abc_123")
                .click_on_login_button();
        Boolean result = homePage.isErrorMsgDisplayed();
        Assert.assertTrue(result,"Error message displayed for invalid user credentials.");
    }

    @Test(priority =2)
    public void blank_credentials_login_test(){
        homePage.enter_username("")
                .enter_password("")
                .click_on_login_button();
        Boolean error_msg=homePage.isErrorMsgDisplayed();
        Assert.assertTrue(error_msg,"User credentials cannot be empty or blank error.");
    }

    @Test(priority =3)
    public void locked_user_login_attempt(){
        homePage.enter_username("locked_out_user")
                .enter_password("secret_sauce")
                .click_on_login_button();
        Boolean error_msg =homePage.isErrorMsgDisplayed();
        Assert.assertTrue(error_msg,"Locked User cannot be logged In.");
    }
}
