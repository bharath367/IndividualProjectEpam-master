package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginpageupdateTest {
    @Test
    public void verifyLoginTest(){
      WebDriver driver= FactoryBrowser.SetupBrowser("chrome","https://www.saucedemo.com/ ");

        Loginpageupdate login = PageFactory.initElements(driver,Loginpageupdate.class);


        login.loginWebsite("standard_user","secret_sauce");

    }

}
