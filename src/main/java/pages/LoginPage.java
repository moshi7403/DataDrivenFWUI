package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "")
    WebElement passWord;

    @FindBy(xpath = "")
    WebElement loginBtn;

    @FindBy(id = "")
    WebElement signUpBtn;

    @FindBy(xpath = "")
    WebElement logo;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle() {
        return driver.getTitle();
    }


    public boolean validateImage() {
        return logo.isDisplayed();
    }

    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        passWord.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }
}
