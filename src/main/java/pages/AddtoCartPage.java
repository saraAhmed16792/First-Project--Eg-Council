package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCartPage extends BasePage{
    public AddtoCartPage (WebDriver driver){
        super(driver);

    }
    // add first product
    By addToCartBtn = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
    By continueShoppingBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    // add second product
    By addToCartBtn2 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a");
    By viewCartBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]");




    public void clickOnCartPage () {
        driver.findElement(addToCartBtn).click();
    }
    public ProductsSearchPage clickOnContinueBtn (){
        clickElement(continueShoppingBtn);
        return new ProductsSearchPage(driver);

    }
    public void clickOnCartPage2(){
        driver.findElement(addToCartBtn2).click();
    }



    public ProductsSearchPage clickOnViewCartBtn(){
        clickElement(viewCartBtn);
        return new ProductsSearchPage(driver);
    }

}
