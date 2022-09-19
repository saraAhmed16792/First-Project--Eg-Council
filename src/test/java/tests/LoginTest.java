package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.NavigationBarPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest {
    public LoginTest(){

    }
    @Test
    public void testLoginNavigation() {
        // Verify that home page is visible successfully
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getDefinitionMsg(), "AutomationExercise");

        // click on log in Btn
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnLoginFromNavBar();

        //login to App
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp("sara.a.imbaby@gmail.com", "sara123");



    }
}




