package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utils.BaseUtils;


public class Hooks extends BaseUtils {
	@BeforeStep
	public void beforeScenario(Scenario scenario){
		if(driver==null) {
			// lanchBrowser();
//			url(BaseUtils.getProperties());
//			waiting(CONSTANT_WAIT_TIME);
//			driver.findElement(By.id("Email")).sendKeys("mugesh1@gmail.com");
//			driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Mugesh@1");
//			driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		}	
	}
	

	@AfterStep
	public void failureScreenshot(Scenario scenario) {
		if(scenario.isFailed())	{
			TakesScreenshot photo = ((TakesScreenshot) driver);
			File src=photo.getScreenshotAs(OutputType.FILE);
			File trgt=new File(".\\screenshots\\failedimge.png");
			try {
				FileUtils.copyFile(src, trgt);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			//scenario.embed(photo, "image/png","error_image");		
			
		}
		
		}

}
