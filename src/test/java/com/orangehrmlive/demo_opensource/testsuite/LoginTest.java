package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginpage.enterUsername("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickOnLoginBtn();
        String expectedMessage = "Welcome";
        String actualMessage = loginpage.getWelcomeMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Welcome message not displayed");
    }
}
