package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import javax.swing.text.Document;

import org.apache.logging.log4j.Logger;
//import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.cucumberexpressions.Argument;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseUtils {
	
	
	private static final String JavascriptExecutor = null;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebElement element;
	public final int CONSTANT_WAIT_TIME = 60;
	public static Properties properties = new Properties();
	//static public Logger log = Logger.getLogger(BaseClass.class);
	public static String getProperties() {
		try (InputStream input = new FileInputStream("D:\\sivajigroups\\properties\\config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

		
		String value1 = properties.getProperty("url");
		return value1;
		
	}

	public static void lanchBrowser() {
		//log.info("browserlanch");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void QAStagingUrl(String url) {
		driver.get(url);
	}


	

	public static void fillTheTextBox(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}
	
	
	
	public static void getElementText(WebElement element) {
		element.getText();
	}

	public static void selectDropDown(WebElement e1, String selectByValue) {
		Select select = new Select(e1);
		select.selectByValue(selectByValue);
	}

	public static void selectDropDown(WebElement e1, int selectByIndex) {
		Select select = new Select(e1);
		select.selectByIndex(selectByIndex);
	}

	public static void selectDropDown(String selectByVisibleText, WebElement e1) {
		Select select = new Select(e1);
		select.selectByVisibleText(selectByVisibleText);
	}

	public static void waiting(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void utilWait(WebElement e1, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(e1)).click();
	}

	public static void scrollByElement(WebElement e1) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", e1);

	}

	public static void moveToElement(WebElement e1) {
		Actions act = new Actions(driver);
		act.moveToElement(e1);
	}
	
	
	public static void implicityWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static WebElement waitForElementToVisible(WebElement element) {

		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static WebElement waitForElementClickable(WebElement element) {

		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void clickElement(WebElement element) {
		waitForElementClickable(element).click();
	}

	public static void sendText(WebElement element, String text) {
		waitForElementClickable(element).sendKeys(text);
	}

	public static String getText(WebElement element) {
		waitForElementClickable(element);
		return waitForElementClickable(element).getText();
	}

	
}
