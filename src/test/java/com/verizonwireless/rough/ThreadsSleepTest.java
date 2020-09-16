package com.verizonwireless.rough;

import com.verizonwireless.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.util.List;

public class ThreadsSleepTest extends BaseClass {

    @Test
    public void Test(){
        navigateToPage(webDriver,"homePageURL");
        explicitWait(webDriver,"feedbackFormButton_XPATH");
        click(webDriver,"feedbackFormButton_XPATH");
        List<WebElement> webElementList = webDriver.findElements(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/div/neb-rating/div/form"));

        for(WebElement webElement: webElementList){

            System.out.println(webElement.getText());
        }

    }
}
