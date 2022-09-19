package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {


    public ProductsPage(WebDriver driver) {
        super(driver);

    }

    By allProductsTxt = By.className("title");
    By searchProductField = By.xpath("//*[@id=\"search_product\"]");
    By checkSameKeyword = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p");


    public String getAllProductsTxt() {
        return getTextOfWebElement(allProductsTxt);
    }


    public ProductsSearchPage getNameProduct(String productName) {
        this.typeOnInputField(this.searchProductField,productName);
        return new ProductsSearchPage(driver);
    }

    public String getTheSameKeyword() {
        return this.getTextOfWebElement(this.checkSameKeyword);
    }

}












