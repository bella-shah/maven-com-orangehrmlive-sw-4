package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    LoginPage loginpage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){;
        loginPage.clickOnforgottenPasswordLink();
        String expectedForgottenMessage = "Forgot Your Password?";
        String actualForgottenMessage = loginpage.getForgottenMessage();
        Assert.assertEquals(expectedForgottenMessage,actualForgottenMessage,"Forgot Your Password? Message Not Displayed correctly");
    }
}
