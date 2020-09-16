package com.verizonwireless.testcases;

import com.verizonwireless.base.BaseClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {


    @Test
    public void loginWithValidUsernameAndPassword() {

        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "usernameField_XPATH");
        type(webDriver, "usernameField_XPATH", "username");
        click(webDriver, "passwordField_XPATH");
        type(webDriver, "passwordField_XPATH", "password");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);


    }

    @Test
    public void loginWithUsernameOnly() {

        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "usernameField_XPATH");
        type(webDriver, "usernameField_XPATH", "username");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);

    }

    @Test
    public void loginWithPasswordOnly() {

        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "passwordField_XPATH");
        type(webDriver, "passwordField_XPATH", "password");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);
    }

    @Test
    public void loginWithValidUsernameAndPasswordCheckBoxTicked() {

        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "usernameField_XPATH");
        type(webDriver, "usernameField_XPATH", "username");
        click(webDriver, "passwordField_XPATH");
        type(webDriver, "passwordField_XPATH", "password");
        click(webDriver, "rememberMeCheckbox_XPATH");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);

    }

    @Test
    public void loginWithNoDataRememberMeCheckBoxTicked() {

        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "rememberMeCheckbox_XPATH");
        click(webDriver, "signinButton_XPATH");

    }

    @Test
    public void loginWithNoDataRememberMeCheckBoxUnchecked() {

        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "signinButton_XPATH");

    }


}


