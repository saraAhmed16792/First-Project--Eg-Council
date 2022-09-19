package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsSearchPage extends BasePage {
    public ProductsSearchPage(WebDriver driver) {
        super(driver);
    }


    By searchedProductsTxt = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");


    public String getSearchedTxt() {
        return this.getTextOfWebElement(this.searchedProductsTxt);


    }
}





