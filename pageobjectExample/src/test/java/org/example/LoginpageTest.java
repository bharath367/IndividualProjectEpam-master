package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginpageTest {
    WebDriver driver;
    @Test
    public void loginverfication(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Loginpage login = new Loginpage(driver);
        login.enterusername("standard_user");
        login.enterpassword("secret_sauce");
        login.loginButton();

        driver.quit();
    }
}
