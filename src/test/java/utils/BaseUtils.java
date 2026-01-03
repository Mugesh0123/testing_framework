package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseUtils extends LoggerUtils {

    public static WebDriver driver;
    private static WebDriverWait wait;
    private static final int WAIT_TIME = 30;

    protected static Properties properties = new Properties();

    protected static Logger log =
            LoggerUtils.getLogger(BaseUtils.class);
    
    // ---------------- BROWSER ----------------

    public static void launchBrowser() {
    	log.info("Launching browser");
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
   

    static {
        try (InputStream input =
                     new FileInputStream("C:\\Users\\vinot\\git\\testing_framework\\properties\\config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
    public static void openApplicationUrl() {
        driver.get(getProperty("url"));
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

    public static void clickElementWhenOverlayGone(WebElement element) {
        waitForClickable(element).click();
    }

    public static void clickElement(WebElement element) {
        waitForClickable(element).click();
          
    }
    
    public static void clickWhenReady(WebElement element) {
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
        WebElement dropdown = waitForVisible(element);
        new Select(dropdown).selectByValue(value);
    }

    public static void selectByIndexByDropdown(WebElement element, int index) {
        WebElement dropdown = waitForVisible(element);
        Select select = new Select(dropdown);

        if (index < 0 || index >= select.getOptions().size()) {
            throw new IllegalArgumentException("Invalid dropdown index: " + index);
        }

        select.selectByIndex(index);
    }

    public static void selectByVisibleText(WebElement element, String text) {
        WebElement dropdown = waitForVisible(element);
        new Select(dropdown).selectByVisibleText(text);
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
    public static boolean isElementVisible(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void forceClearTextBox(WebElement element) {
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }

    
    
    
    }




