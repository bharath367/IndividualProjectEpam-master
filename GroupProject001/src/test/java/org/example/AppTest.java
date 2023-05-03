package org.example;

import com.Browser.FactoryBrowser;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class AppTest {

    WebDriver driver = FactoryBrowser.SetupBrowser("chrome", "https://www.tcl.com/in/en");



        @Test
        public void LoginVerification () throws InterruptedException {
            Login login = PageFactory.initElements(driver, Login.class);


            //UI-1
            login.loginWebsite("alhvfbhvpewryvf@gmail.com", "dfiuverpivp");
            //UI-2
            login.loginWebsiteagain("manideep.sirisala@gmail.com", "160c88652d47d0be60bF");
        }
    }


