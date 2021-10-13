package test;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){

        initialization();
         loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "The title is validated");
    }

    @Test(priority = 2)
    public void logoImageTest(){
        boolean present = loginPage.validateImage();
        Assert.assertTrue(present);
    }

    @Test(priority = 3)
    public void logInTest(){
       HomePage homePage =  loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
