package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePage {
    //Locators
    By loginFromNavbar = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    By productsFromNavBar = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");



    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }

    //Operations
    public ProductsPage clickOnLoginFromNavBar(){
        clickElement(loginFromNavbar);
        return new ProductsPage(driver);
    }


    public ProductsPage clickOnproductsFromNavBar()
    {
        clickElement(productsFromNavBar);
         return new ProductsPage(driver);

    }

}
