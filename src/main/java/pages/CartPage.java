package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    //  Verify both products are added to Cart
    By product1 = By.id("product-1");
    By product2 = By.id("product-2");

    // Verify price , quantity , total price product1
    By product1Price = By.xpath("//*[@id=\"product-1\"]/td[3]/p");
    By product1Quantity = By.xpath("//*[@id=\"product-1\"]/td[4]/button");
    By totalPriceProduct1 = By.xpath("//*[@id=\"product-1\"]/td[5]/p");

    // Verify price , quantity , total price product1
    By product2Price =  By.xpath("//*[@id=\"product-2\"]/td[3]/p");
    By product2Quantity = By.xpath("//*[@id=\"product-2\"]/td[4]/button");
    By totalPriceProduct2 =By.xpath("//*[@id=\"product-2\"]/td[5]/p");



    //visibility of 2 products

    public boolean isProduct1Displayed() {
        return this.isElementDisplayedOnPage(this.product1);
    }
    public boolean isProduct2Displayed() {
        return this.isElementDisplayedOnPage(this.product2);
    }


    //product1
    public String getProduct1Price() {
        return this.getTextOfWebElement(this.product1Price);
    }
    public String getProduct1Quantity() {

        return this.getTextOfWebElement(this.product1Quantity);
    }
    public String getTotalPriceProduct1(){

        return this.getTextOfWebElement(this.totalPriceProduct1);
    }
    //product2
    public String getProduct2Price() {
        return this.getTextOfWebElement(this.product2Price);
    }
    public String getProduct2Quantity() {

        return this.getTextOfWebElement(this.product2Quantity);
    }
    public String getTotalPriceProduct2(){

        return this.getTextOfWebElement(this.totalPriceProduct2);
    }




}

