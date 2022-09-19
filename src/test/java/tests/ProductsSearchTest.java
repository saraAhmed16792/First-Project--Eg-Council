package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class ProductsSearchTest extends BaseTest{
    NavigationBarPage navigationBarPage;
    public ProductsSearchTest(){}
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
    public void testProductsNavigation(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.getNameProduct("Blue Top");
        productsPage.clickElement(By.xpath("//*[@id=\"submit_search\"]"));





        // Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertEquals(productsPage.getAllProductsTxt(), "SEARCHED PRODUCTS");


        //Verify all the products related to search are visible
        ProductsSearchPage productsSearchPage =new ProductsSearchPage(driver);
       Assert.assertEquals(productsSearchPage.getSearchedTxt(),"View Product");





    }
}
