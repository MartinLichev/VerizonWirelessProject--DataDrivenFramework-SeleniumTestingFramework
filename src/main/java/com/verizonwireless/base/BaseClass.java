package com.verizonwireless.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseClass {

    public static WebDriver webDriver;
    public static Properties configProperties;
    public static Properties pagesElementsProperties;
    public static Properties loremIpsumDummyFileProperties;
    public static FileInputStream fileInputStream;
    public static Logger logger;
    public static WebElement dropDown;


    @BeforeSuite
    public void setUp() {


        if (webDriver == null) {

            configProperties = new Properties();

            try {
                fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            try {
                configProperties.load(fileInputStream);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            pagesElementsProperties = new Properties();

            try {
                fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\pagesElements.properties");
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            try {
                pagesElementsProperties.load(fileInputStream);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            loremIpsumDummyFileProperties = new Properties();

            try {
                fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\loremIpsumDummyFile.properties");
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            try {
                loremIpsumDummyFileProperties.load(fileInputStream);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }

        if (configProperties.getProperty("browser").equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Martin Lichev\\IdeaProjects\\VerizonWirelessProject\\src\\test\\resources\\executables\\chromedriver.exe");
            webDriver = new ChromeDriver();

        } else if (configProperties.getProperty("browser").equals("firefox")) {


            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Martin Lichev\\IdeaProjects\\VerizonWirelessProject\\src\\test\\resources\\executables\\geckodriver.exe");
            webDriver = new FirefoxDriver();

        }

        maximizeBrowserWindow(webDriver);


    }

    @AfterSuite
    public void tearDown() {

        if (webDriver != null) {
            webDriver.close();
        }


    }

    public void click(WebDriver webDriver, String locator) {

        if (locator.endsWith("_XPATH")) {
            webDriver.findElement(By.xpath(pagesElementsProperties.getProperty(locator))).click();

        } else if (locator.endsWith("_CSS")) {
            webDriver.findElement(By.cssSelector(pagesElementsProperties.getProperty(locator))).click();

        } else if (locator.endsWith("_ID")) {
            webDriver.findElement(By.id(pagesElementsProperties.getProperty(locator))).click();

        } else if (locator.endsWith("_TagName")) {
            webDriver.findElement(By.tagName(pagesElementsProperties.getProperty(locator))).click();

        } else if (locator.endsWith("_ClassName")) {
            webDriver.findElement(By.className(pagesElementsProperties.getProperty(locator))).click();

        }
    }

    public void type(WebDriver webDriver, String locator, String input) {

        if (locator.endsWith("_XPATH")) {
            webDriver.findElement(By.xpath(pagesElementsProperties.getProperty(locator))).sendKeys(configProperties.getProperty(input));

        } else if (locator.endsWith("_CSS")) {
            webDriver.findElement(By.cssSelector(pagesElementsProperties.getProperty(locator))).sendKeys(configProperties.getProperty(input));

        } else if (locator.endsWith("_ID")) {
            webDriver.findElement(By.id(pagesElementsProperties.getProperty(locator))).sendKeys(configProperties.getProperty(input));

        } else if (locator.endsWith("_TagName")) {
            webDriver.findElement(By.tagName(pagesElementsProperties.getProperty(locator))).sendKeys(configProperties.getProperty(input));

        } else if (locator.endsWith("_ClassName")) {
            webDriver.findElement(By.className(pagesElementsProperties.getProperty(locator))).sendKeys(configProperties.getProperty(input));

        } else if(locator.endsWith("_XPATH$")){
            webDriver.findElement(By.xpath(pagesElementsProperties.getProperty(locator))).sendKeys(loremIpsumDummyFileProperties.getProperty(input));
        }

    }

    public void dropdownSelect(WebDriver webDriver, String locator, String value) {

        if (locator.endsWith("_XPATH")) {
            dropDown = webDriver.findElement(By.xpath(pagesElementsProperties.getProperty(locator)));

        } else if (locator.endsWith("_CSS")) {
            dropDown = webDriver.findElement(By.cssSelector(pagesElementsProperties.getProperty(locator)));

        } else if (locator.endsWith("_ID")) {
            dropDown = webDriver.findElement(By.id(pagesElementsProperties.getProperty(locator)));

        } else if (locator.endsWith("_TagName")) {
            dropDown = webDriver.findElement(By.tagName(pagesElementsProperties.getProperty(locator)));

        } else if (locator.endsWith("_ClassName")) {
            dropDown = webDriver.findElement(By.className(pagesElementsProperties.getProperty(locator)));

        }

        Select select = new Select(dropDown);
        select.selectByVisibleText(value);
    }

    public void fluentWait(int time) {

        Wait webDriverWait = new FluentWait<WebDriver>(webDriver);

        try {
            webDriverWait.wait(time);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void explicitWait(WebDriver webDriver, String locator) {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Long.parseLong(configProperties.getProperty("explicitWait")));

        if (locator.endsWith("_XPATH")) {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pagesElementsProperties.getProperty(locator))));

        } else if (locator.endsWith("_CSS")) {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pagesElementsProperties.getProperty(locator))));

        } else if (locator.endsWith("_ID")) {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(pagesElementsProperties.getProperty(locator))));

        } else if (locator.endsWith("_TagName")) {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(pagesElementsProperties.getProperty(locator))));

        } else if (locator.endsWith("_ClassName")) {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(pagesElementsProperties.getProperty(locator))));
        }
    }

    public void deleteCookies(WebDriver webDriver) {

        webDriver.manage().deleteAllCookies();
    }

    public void maximizeBrowserWindow(WebDriver webDriver) {

        webDriver.manage().window().maximize();
    }

    public void navigateToPage(WebDriver webDriver, String URL) {

        webDriver.navigate().to(configProperties.getProperty(URL));
    }

    public void implicitWait(WebDriver webDriver, TimeUnit timeUnit) {

        webDriver.manage().timeouts().implicitlyWait(Integer.parseInt(configProperties.getProperty("implicitWait")), timeUnit);
    }

    public boolean isElementPresent(By by) {

        try {
            webDriver.findElement(by);
            return true;

        } catch (NoSuchElementException noSuchElementException) {
            return false;
        }

    }

    public void addThreadSleep(WebDriver webDriver, long milliSeconds) {

        try {
            Thread.sleep(milliSeconds);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void switchToIFrame(WebDriver webDriver, String frameName){

        webDriver.switchTo().frame(frameName);
    }

}
