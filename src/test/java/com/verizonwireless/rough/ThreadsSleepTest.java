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
        navigateToPage(webDriver,"storesPageURL");
        List<WebElement> webElementList = webDriver.findElements(By.tagName("a"));

        for(WebElement webElement: webElementList){

            System.out.println(webElement.getAttribute("sitecat-cta"));
        }

    }
}
