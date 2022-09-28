package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public  LoginPage (WebDriver driver){
        super(driver);
    }
    //locators
    By emailField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    By passwardField = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    By loginBtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    By loginName = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");



    //operations
    public HomePage loginToApp (String email , String password)
    {
        this.typeOnInputField(this.emailField,email);

        this.typeOnInputField(this.passwardField,password);
        this.clickElement(this.loginBtn);
        return new HomePage(this.driver);
    }
    public String getLoginName(){
        return this.getTextOfWebElement(this.loginName);
    }

}
