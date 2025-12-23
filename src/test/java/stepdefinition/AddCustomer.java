package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;
import pages.AddCustomers;

public class AddCustomer extends AddCustomers {
	
	@When("the admin clicks on the Management menu")
	public void the_admin_clicks_on_the_management_menu() {
		clickElement(PageObjectManager.getInstanceAddCustomerName().getManagementMenu());
	}

	@When("the admin clicks on the Customer option")
	public void the_admin_clicks_on_the_customer_option() {
		clickElement(PageObjectManager.getInstanceAddCustomerName().getCustomerOption());   
	}

	@When("the admin clicks on the Add Customer button")
	public void the_admin_clicks_on_the_add_customer_button() {
		clickElement(PageObjectManager.getInstanceAddCustomerName().getAddCustomerButton());	
	}

	@When("the admin enters the customer name {string}")
	public void the_admin_enters_the_customer_name(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddCustomerName().getCustomerName(), string);
			    
	}

	@When("the admin enters the customer phone number {string}")
	public void the_admin_enters_the_customer_phone_number(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddCustomerName().getCustomerMobileNumber(), string);   
	}

	@When("the admin clicks on the Save button")
	public void the_admin_clicks_on_the_save_button() {
		clickElement(PageObjectManager.getInstanceAddCustomerName().getSaveButton());
	}

	@Then("the admin should see the message {string}")
	public void the_admin_should_see_the_message(String string) {
		String NotifyArea=getTextByElement(PageObjectManager.getInstanceAddCustomerName().getNotificationArea());
		System.out.println(NotifyArea);
		Assert.assertEquals(NotifyArea, string);
	}
	
	@When("the admin searches for the customer using phone number {string}")
	public void the_admin_searches_for_the_customer_using_phone_number(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddCustomerName().getSearchArea(), string);    
	}

	@When("the admin deletes the customer details")
	public void the_admin_deletes_the_customer_details() {
		clickElement(PageObjectManager.getInstanceAddCustomerName().getDeleteButton());
		
	    
	}
	
	@When("nd the admin clicks on the Confirm button")
	public void nd_the_admin_clicks_on_the_confirm_button() {
		clickElement(PageObjectManager.getInstanceAddCustomerName().getConfirmButton());   
	}
	   
	}

