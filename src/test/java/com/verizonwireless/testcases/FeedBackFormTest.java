package com.verizonwireless.testcases;

import com.verizonwireless.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FeedBackFormTest extends BaseClass {

    @Test
    public void enterLowestRatingLeaveComments() {

        log.debug("enterLowestRatingLeaveComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingFirstDigit_XPATH");
        click(webDriver,"ratingFirstDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"leaveCommentsField_XPATH$");
        addThreadSleep(webDriver,400);
        type(webDriver,"leaveCommentsField_XPATH$","dummyLoremIpsum");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterLowestRatingLeaveComments executed successfully!");


    }

    @Test
    public void enterLowerRatingLeaveComments() {

        log.debug("enterLowerRatingLeaveComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingSecondDigit_XPATH");
        click(webDriver,"ratingSecondDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"leaveCommentsField_XPATH$");
        addThreadSleep(webDriver,400);
        type(webDriver,"leaveCommentsField_XPATH$","dummyLoremIpsum");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterLowerRatingLeaveComments executed successfully!");


    }

    @Test
    public void enterAverageRatingLeaveComments() {

        log.debug("enterAverageRatingLeaveComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingThirdDigit_XPATH");
        click(webDriver,"ratingThirdDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"leaveCommentsField_XPATH$");
        addThreadSleep(webDriver,400);
        type(webDriver,"leaveCommentsField_XPATH$","dummyLoremIpsum");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterAverageRatingLeaveComments executed successfully!");

    }

    @Test
    public void enterNormalRatingLeaveComments() {

        log.debug("enterNormalRatingLeaveComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingForthDigit_XPATH");
        click(webDriver,"ratingForthDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"leaveCommentsField_XPATH$");
        addThreadSleep(webDriver,400);
        type(webDriver,"leaveCommentsField_XPATH$","dummyLoremIpsum");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterNormalRatingLeaveComments executed successfully!");


    }

    @Test
    public void enterHighestRatingLeaveComments() {

        log.debug("enterHighestRatingLeaveComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingFifthDigit_XPATH");
        click(webDriver,"ratingFifthDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"leaveCommentsField_XPATH$");
        addThreadSleep(webDriver,400);
        type(webDriver,"leaveCommentsField_XPATH$","dummyLoremIpsum");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterHighestRatingLeaveComments executed successfully!");


    }

    @Test
    public void enterLowestRatingWithoutComments() {

        log.debug("enterLowestRatingWithoutComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingFirstDigit_XPATH");
        click(webDriver,"ratingFirstDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterLowestRatingWithoutComments executed successfully!");


    }

    @Test
    public void enterLowerRatingWithoutComments() {

        log.debug("enterLowerRatingWithoutComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingSecondDigit_XPATH");
        click(webDriver,"ratingSecondDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterLowerRatingWithoutComments executed successfully!");


    }

    @Test
    public void enterAverageRatingWithoutComments() {

        log.debug("enterAverageRatingWithoutComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingThirdDigit_XPATH");
        click(webDriver,"ratingThirdDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterAverageRatingWithoutComments executed successfully!");


    }

    @Test
    public void enterNormalRatingWithoutComments() {

        log.debug("enterNormalRatingWithoutComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingForthDigit_XPATH");
        click(webDriver,"ratingForthDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterNormalRatingWithoutComments executed successfully!");


    }

    @Test
    public void enterHighestRatingWithoutComments() {

        log.debug("enterHighestRatingWithoutComments started successfully!");
        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingFifthDigit_XPATH");
        click(webDriver,"ratingFifthDigit_XPATH");
        addThreadSleep(webDriver,400);
        click(webDriver,"submitFormButton_XPATH");
        log.debug("enterHighestRatingWithoutComments executed successfully!");


    }
}
