package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.List;

public class AddtoCartTest extends BaseTest {
    NavigationBarPage navigationBarPage;
    // precondition
    @BeforeMethod
    public void loginToApp(){
        navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnLoginFromNavBar();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApp("sara.a.imbaby@gmail.com", "sara123");
        navigationBarPage = new NavigationBarPage(driver);
        ProductsPage productsPage = navigationBarPage.clickOnproductsFromNavBar();
        // Verify user is navigated to ALL PRODUCTS page successful
        Assert.assertEquals(productsPage.getAllProductsTxt(), "ALL PRODUCTS");

    }
    @Test
    public void testAddtoCart(){

        //Add to cart product1
        Actions actions = new Actions(this.driver);
        WebElement product1 = this.driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]"));
        actions.moveToElement(product1).perform();
        actions.perform();
        AddtoCartPage addtoCartPage= new AddtoCartPage(driver);
        addtoCartPage.clickOnCartPage();
        AddtoCartPage addToCartPage1 = new AddtoCartPage(driver);
        addToCartPage1.clickOnContinueBtn();

        //Add to cart product2
        Actions actions1 = new Actions(this.driver);
        WebElement product2 = this.driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]"));
        actions1.moveToElement(product2).perform();
        AddtoCartPage addtoCartPage2 = new AddtoCartPage(driver);
        addtoCartPage2.clickOnCartPage2();
        addtoCartPage2.clickOnViewCartBtn();

        //  Verify both products are added to Cart
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isProduct1Displayed());
        Assert.assertTrue(cartPage.isProduct2Displayed());

        //Verify their prices, quantity and total price product1
        CartPage cartPage1 = new CartPage(driver);
        Assert.assertEquals(cartPage1.getProduct1Price(),"Rs. 500" );
        Assert.assertEquals(cartPage1.getProduct1Quantity(),"52");
        Assert.assertEquals(cartPage1.getTotalPriceProduct1(),"Rs. 22500");

        //Verify their prices, quantity and total price product2
        CartPage cartPage2 = new CartPage(driver);
        Assert.assertEquals(cartPage2.getProduct2Price(),"Rs. 400" );
        Assert.assertEquals(cartPage2.getProduct2Quantity(),"14");
        Assert.assertEquals(cartPage2.getTotalPriceProduct2(),"Rs. 5200");



    }
        }




