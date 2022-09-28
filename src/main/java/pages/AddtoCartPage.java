package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCartPage extends BasePage{

    // add first product
    By firstProduct = By.xpath("(//div[@class=\"productinfo text-center\"])[1]");

    By addToCartBtn = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
    By continueShoppingBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");

    // add second product
    By secondProduct = By.xpath("(//div[@class=\"productinfo text-center\"])[2]");

    By addToCartBtn2 = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a");
    By viewCartBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]");

    public void hoverFirstProduct() {
        hoverOverElement(firstProduct);
    }


    public AddtoCartPage (WebDriver driver){
        super(driver);
    }


    public void clickOnCartPage () {
        this.driver.findElement(this.addToCartBtn).click();}

    public ProductsSearchPage clickOnContinueBtn (){
        clickElement(continueShoppingBtn);
        return new ProductsSearchPage(driver);

    }
    public void hoverSecondProduct() {
        hoverOverElement(secondProduct);
    }
    public void clickOnCartPage2(){
        driver.findElement(addToCartBtn2).click();
    }



    public ProductsSearchPage clickOnViewCartBtn(){
        clickElement(viewCartBtn);
        return new ProductsSearchPage(driver);
    }

}
