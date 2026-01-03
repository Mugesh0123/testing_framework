package hooks;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import pageobjectmanager.PageObjectManager;
import utils.BaseUtils;


public class Hooks extends BaseUtils {

	@BeforeStep
	public void beforeScenario(Scenario scenario){
		if(driver==null) {
			launchBrowser();
			//openUrl("https://sharks.sivajigroups.com/");
			openApplicationUrl();
			log.info("User able to enter mail id and password");
			 fillTheTextBox(PageObjectManager.getInstanceLogin().getPhoneNumber(),"8248151460");
			 fillTheTextBox(PageObjectManager.getInstanceLogin().getPassword(), "admin");
			 buttonClick(PageObjectManager.getInstanceLogin().getSignButton());
			 log.info("User click signin button");
			
		}	
	}
	

	@AfterStep
    public void takeScreenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) BaseUtils.driver;

            // attach to report
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failure Screenshot");

            // save locally
            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("screenshots/FAILED_" + timestamp + ".png");

            try {
                FileUtils.copyFile(src, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
//	 @After
//	    public void closeBrowser() {
//	        BaseUtils.quitBrowser();
	//    }
	}