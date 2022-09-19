package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By definitionMsg = By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h1");

    public String getDefinitionMsg()
    {
        return getTextOfWebElement(definitionMsg);

    }
}
