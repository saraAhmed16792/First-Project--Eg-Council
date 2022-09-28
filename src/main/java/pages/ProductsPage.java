package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {


    public ProductsPage(WebDriver driver) {
        super(driver);

    }

    By allProductsTxt = By.className("title");
    By searchProductField = By.xpath("//*[@id=\"search_product\"]");
    By searchBtn = By.xpath("//*[@id=\"submit_search\"]");


    public String getAllProductsTxt() {
        return getTextOfWebElement(allProductsTxt);
    }


    public ProductsSearchPage getNameProduct(String productName) {
        this.typeOnInputField(this.searchProductField,productName);
        return new ProductsSearchPage(driver);
    }
    public void clickOnSearchBtn (){
        clickElement(searchBtn);
    }


}












