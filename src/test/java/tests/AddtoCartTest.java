package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class AddtoCartTest extends BaseTest {
    NavigationBarPage navigationBarPage;
    // precondition
    @BeforeMethod
    public void openApp(){

        navigationBarPage = new NavigationBarPage(driver);
        ProductsPage productsPage = navigationBarPage.clickOnproductsFromNavBar();
        // Verify user is navigated to ALL PRODUCTS page successful
        Assert.assertEquals(productsPage.getAllProductsTxt(), "ALL PRODUCTS");

    }
    @Test
    public void testAddtoCart(){

        //Add to cart product1
        AddtoCartPage addtoCartPage = new AddtoCartPage(driver);
        addtoCartPage.hoverFirstProduct();
        addtoCartPage.clickOnCartPage();
        addtoCartPage.clickOnContinueBtn();

        //Add to cart product2
        addtoCartPage.hoverSecondProduct();
        addtoCartPage.clickOnCartPage2();
        addtoCartPage.clickOnViewCartBtn();

        //  Verify both products are added to Cart
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isProduct1Displayed());
        Assert.assertTrue(cartPage.isProduct2Displayed());

        //Verify their prices, quantity and total price product1
        CartPage cartPage1 = new CartPage(driver);
        Assert.assertEquals(cartPage1.getProduct1Price(),"Rs. 500" );
        Assert.assertEquals(cartPage1.getProduct1Quantity(),"63");
        Assert.assertEquals(cartPage1.getTotalPriceProduct1(),"Rs. 29000");

        //Verify their prices, quantity and total price product2
        CartPage cartPage2 = new CartPage(driver);
        Assert.assertEquals(cartPage2.getProduct2Price(),"Rs. 400" );
        Assert.assertEquals(cartPage2.getProduct2Quantity(),"26");
        Assert.assertEquals(cartPage2.getTotalPriceProduct2(),"Rs. 8500");



    }
        }




