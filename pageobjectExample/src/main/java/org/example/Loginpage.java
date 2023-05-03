package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    WebDriver driver;
    By username = By.id("user-name");
    By pass = By.name("password");
    By login =By.id("login-button");
    public Loginpage(WebDriver driver){
        this.driver = driver;
    }
    public void enterusername(String uname){
        driver.findElement(username).sendKeys(uname);

    }
    public void enterpassword(String upass){
        driver.findElement(pass).sendKeys(upass);
    }
    public void loginButton(){
        driver.findElement(login).click();
    }

}
