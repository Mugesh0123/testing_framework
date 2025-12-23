package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtils {

    public static WebDriver driver;
    private static WebDriverWait wait;
    private static final int WAIT_TIME = 30;

    private static Properties properties = new Properties();

    // ---------------- BROWSER ----------------

    public static void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
    }

    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    // ---------------- PROPERTIES ----------------

    public static String getProperty(String key) {
        try (InputStream input =
                     new FileInputStream("properties/config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file", e);
        }
        return properties.getProperty(key);
    }

    // ---------------- NAVIGATION ----------------

    public static void openUrl(String url) {
        driver.get(url);
    }

    // ---------------- WAITS ----------------

    private static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        }
        return wait;
    }

    public static WebElement waitForVisible(WebElement element) {
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickable(WebElement element) {
        return getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    // ---------------- ACTIONS ----------------

    public static void clickElement(WebElement element) {
        waitForClickable(element).click();
    }

    public static void type(WebElement element, String text) {
        WebElement el = waitForVisible(element);
        el.clear();
        el.sendKeys(text);
    }

    public static String getTextByElement(WebElement element) {
        return waitForVisible(element).getText();
    }

    public static void selectByValue(WebElement element, String value) {
        new Select(element).selectByValue(value);
    }

    public static void selectByIndex(WebElement element, int index) {
        new Select(element).selectByIndex(index);
    }

    public static void selectByVisibleText(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }

    public static void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void moveToElement(WebElement element) {
        new Actions(driver).moveToElement(element).perform();
    }
    public static void fillTheTextBox(WebElement element, String text) { element.sendKeys(text); }
    public static void buttonClick(WebElement element) { element.click(); }
}
