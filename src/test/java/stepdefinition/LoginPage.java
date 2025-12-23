package stepdefinition;

import io.cucumber.java.en.*;
import pageobjectmanager.PageObjectManager;
import pages.LoginPageElement;
import utils.BaseUtils;

public class LoginPage extends LoginPageElement{
	
	
	@Given("user should be in login  page {string}")
	public void user_should_be_in_login_page(String string) {
		launchBrowser();
		openUrl(string);
		
	   	}

	@When("user  enter phone number {string}")
	public void user_enter_username(String string) {
      fillTheTextBox(PageObjectManager.getInstanceLogin().getPhoneNumber(), string);
	}

	@When("user enter password {string}")
	public void user_enter_password(String string) {
	      fillTheTextBox(PageObjectManager.getInstanceLogin().getPassword(), string);
	}

	@When("user click login button")
	public void user_click_login_button() {
      buttonClick(PageObjectManager.getInstanceLogin().getSignButton());
	}
	@When("user click profile icon")
	public void user_click_profile_icon() {
//		(PageObjectManager.getInstanceLogin().getProfileIcon());
	}
//
	@Then("click logout option")
	public void click_logout_option() {
//		buttonClick(PageObjectManager.getInstanceLogin().getLogout());
//
	}

	@When("i close the browser")
	public void i_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.close();
	}



}
