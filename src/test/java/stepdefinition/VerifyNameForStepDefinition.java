package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;
import pages.VerifyNamePagesElements;
import utils.BaseUtils;

public class VerifyNameForStepDefinition extends VerifyNamePagesElements{
	@When("user can able to see the {string} in the dashboard")
	public void user_can_able_to_see_the_in_the_dashboard(String string) throws InterruptedException {
		String dashboardname=getTextByElement(PageObjectManager.getInstanceVerifyNames().getDashboardName());
		//System.out.println(dashboardname);
		Assert.assertEquals(dashboardname, string);
	}

	@When("user can able to see the {string} in the container header")
	public void user_can_able_to_see_the_in_the_container_header(String string) throws InterruptedException {
		String containername1=getTextByElement(PageObjectManager.getInstanceVerifyNames().getContainerHeader());
		//System.out.println(containername1);
		Assert.assertEquals(containername1, string);
	}
		
	

	
	    
	}


