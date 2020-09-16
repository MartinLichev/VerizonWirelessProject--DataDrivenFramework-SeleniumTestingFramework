package com.verizonwireless.testcases;

import com.verizonwireless.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FeedBackFormTest extends BaseClass {

    @Test
    public void enterLowestRatingLeaveComments() {

        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingFirstDigit_XPATH");
        click(webDriver,"ratingFirstDigit_XPATH");
        addThreadSleep(webDriver,500);
        click(webDriver,"leaveCommentsField_XPATH");
        addThreadSleep(webDriver,500);
        type(webDriver,"leaveCommentsField_XPATH","dummyLoremIpsum");
        addThreadSleep(webDriver,500);
        click(webDriver,"submitFormButton_XPATH");


    }

    @Test
    public void enterLowerRatingLeaveComments() {

        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingSecondDigit_XPATH");
        click(webDriver,"ratingSecondDigit_XPATH");
        addThreadSleep(webDriver,500);
        click(webDriver,"leaveCommentsField_XPATH");
        addThreadSleep(webDriver,500);
        type(webDriver,"leaveCommentsField_XPATH","dummyLoremIpsum");
        addThreadSleep(webDriver,500);
        click(webDriver,"submitFormButton_XPATH");


    }

    @Test
    public void enterAverageRatingLeaveComments() {

        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingThirdDigit_XPATH");
        click(webDriver,"ratingThirdDigit_XPATH");
        addThreadSleep(webDriver,500);
        click(webDriver,"leaveCommentsField_XPATH");
        addThreadSleep(webDriver,500);
        type(webDriver,"leaveCommentsField_XPATH","dummyLoremIpsum");
        addThreadSleep(webDriver,500);
        click(webDriver,"submitFormButton_XPATH");

    }

    @Test
    public void enterNormalRatingLeaveComments() {

        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingForthDigit_XPATH");
        click(webDriver,"ratingForthDigit_XPATH");
        addThreadSleep(webDriver,500);
        click(webDriver,"leaveCommentsField_XPATH");
        addThreadSleep(webDriver,500);
        type(webDriver,"leaveCommentsField_XPATH","dummyLoremIpsum");
        addThreadSleep(webDriver,500);
        click(webDriver,"submitFormButton_XPATH");


    }

    @Test
    public void enterHighestRatingLeaveComments() {

        navigateToPage(webDriver, "homePageURL");
        explicitWait(webDriver,"feedbackFormButton_ID");
        click(webDriver, "feedbackFormButton_ID");
        switchToIFrame(webDriver,"kampyleForm1098");
        explicitWait(webDriver,"ratingFifthDigit_XPATH");
        click(webDriver,"ratingFifthDigit_XPATH");
        addThreadSleep(webDriver,500);
        click(webDriver,"leaveCommentsField_XPATH");
        addThreadSleep(webDriver,500);
        type(webDriver,"leaveCommentsField_XPATH","dummyLoremIpsum");
        addThreadSleep(webDriver,500);
        click(webDriver,"submitFormButton_XPATH");


    }

    @Test
    public void enterLowestRatingWithoutComments() {


    }

    @Test
    public void enterLowerRatingWithoutComments() {


    }

    @Test
    public void enterAverageRatingWithoutComments() {


    }

    @Test
    public void enterNormalRatingWithoutComments() {


    }

    @Test
    public void enterHighestRatingWithoutComments() {


    }
}
