package com.verizonwireless.testcases;

import com.verizonwireless.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {


    @Test
    public void loginWithValidUsernameAndPassword() {

        log.debug("loginWithValidUsernameAndPassword started successfully!");
        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "usernameField_XPATH");
        type(webDriver, "usernameField_XPATH", "username");
        click(webDriver, "passwordField_XPATH");
        type(webDriver, "passwordField_XPATH", "password");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);
        log.debug("loginWithValidUsernameAndPassword executed successfully!");


    }

    @Test
    public void loginWithUsernameOnly() {

        log.debug("loginWithUsernameOnly started successfully!");
        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "usernameField_XPATH");
        type(webDriver, "usernameField_XPATH", "username");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);
        log.debug("loginWithUsernameOnly executed successfully!");

    }

    @Test
    public void loginWithPasswordOnly() {

        log.debug("loginWithPasswordOnly started successfully!");
        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "passwordField_XPATH");
        type(webDriver, "passwordField_XPATH", "password");
        click(webDriver, "signinButton_XPATH");
        addThreadSleep(webDriver, 500);
        log.debug("loginWithPasswordOnly executed successfully!");
    }

    @Test
    public void loginWithValidUsernameAndPasswordCheckBoxTicked() {

        log.debug("loginWithValidUsernameAndPasswordCheckBoxTicked started successfully!");
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
        log.debug("loginWithValidUsernameAndPasswordCheckBoxTicked executed successfully!");

    }

    @Test
    public void loginWithNoDataRememberMeCheckBoxTicked() {

        log.debug("loginWithNoDataRememberMeCheckBoxTicked started successfully!");
        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "rememberMeCheckbox_XPATH");
        click(webDriver, "signinButton_XPATH");
        log.debug("loginWithNoDataRememberMeCheckBoxTicked executed successfully!");

    }

    @Test
    public void loginWithNoDataRememberMeCheckBoxUnchecked() {

        log.debug("loginWithNoDataRememberMeCheckBoxUnchecked started successfully!");
        navigateToPage(webDriver, "homePageURL");
        navigateToPage(webDriver, "loginPageURL");
        addThreadSleep(webDriver, 500);
        click(webDriver, "signinButton_XPATH");
        log.debug("loginWithNoDataRememberMeCheckBoxUnchecked executed successfully!");

    }


}


