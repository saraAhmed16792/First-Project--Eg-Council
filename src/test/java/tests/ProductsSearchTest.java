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
    public void openApp(){

        navigationBarPage = new NavigationBarPage(driver);
        ProductsPage productsPage = navigationBarPage.clickOnproductsFromNavBar();
        // Verify user is navigated to ALL PRODUCTS page successful
        Assert.assertEquals(productsPage.getAllProductsTxt(), "ALL PRODUCTS");
    }

    @Test
    public void testProductsNavigation(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.getNameProduct("Blue Top");
        ProductsPage productsPage1 = new ProductsPage(driver);
        productsPage1.clickOnSearchBtn();


        // Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertEquals(productsPage.getAllProductsTxt(), "SEARCHED PRODUCTS");


        //Verify all the products related to search are visible
        ProductsSearchPage productsSearchPage =new ProductsSearchPage(driver);
       Assert.assertEquals(productsSearchPage.getSearchedTxt(),"Blue Top");





    }
}
