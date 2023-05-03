package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;


    @FindBy(xpath = "//*[@id=\"common-header-root\"]/div/nav/div/div/div[2]/ul/li[3]/a/i")
    WebElement testpro;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input")
    WebElement pass;

    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/button/div")
    WebElement loginButton;

    public Login(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickon(){
        testpro.click();
    }



    public void loginWebsite(String username, String password) throws InterruptedException {
        email.sendKeys(username);
        email.click();
        Thread.sleep(2000);
        pass.sendKeys(password);
        pass.click();
        Thread.sleep(2000);
        loginButton.click();
        loginButton.click();
        Thread.sleep(2000);
    }

    public void loginWebsiteagain(String username, String password) throws InterruptedException {
        email.clear();
        email.sendKeys(username);
        Thread.sleep(2000);
        pass.clear();
        pass.sendKeys(password);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(6000);
    }
}

