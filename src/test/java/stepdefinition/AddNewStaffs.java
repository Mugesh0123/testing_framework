package stepdefinition;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;
import pages.AddStaffs;

public class AddNewStaffs extends AddStaffs{

	@When("the admin clicks on the Administration menu")
	public void the_admin_clicks_on_the_administration_menu() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getAdministrationMenu()); 
		log.info("User able to click Administration Menu");   
	}

	@When("the admin clicks on the Profile option")
	public void the_admin_clicks_on_the_profile_option() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getProfileOption()); 
		log.info("User able to click Profile Option");
	}

	@When("the admin clicks on the Add Staff button")
	public void the_admin_clicks_on_the_add_staff_button() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getAddStaffButton()); 
		log.info("User able to click Add Staff Button");   
	}

	@When("the admin enters the staff name {string}")
	public void the_admin_enters_the_staff_name(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddNewStaffs().getStaffName(), string);
		log.info("User able to enter Staff Name");
	}

	@When("the admin enters the staff email {string}")
	public void the_admin_enters_the_staff_email(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddNewStaffs().getStaffEmail(), string);
		log.info("User able to enter Staff Mail");   
	}

	@When("the admin enters the staff phone number {string}")
	public void the_admin_enters_the_staff_phone_number(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddNewStaffs().getStaffPhoneNumber(), string);
		log.info("User able to enter Staff Phone Number");  
	}

	@When("the admin enters the password {string}")
	public void the_admin_enters_the_password(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddNewStaffs().getPassword(), string);
		log.info("User able to enter the Password"); 
	}
	
	@When("the admin clicks on the Branch dropdown")
	public void the_admin_clicks_on_the_branch_dropdown() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getSelectBranchOption()); 
		log.info("User able to click DropDown Button");    
	}

	@When("the admin selects a branch from the dropdown")
	public void the_admin_selects_a_branch_from_the_dropdown() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getSelectDistrict()); 
		log.info("User able to select the branch from the DropDown Button"); 
	}
	
	@When("the admin clicks the Add button")
	public void the_admin_clicks_the_add_button() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getAddButton()); 
		log.info("User able to click the add Button"); 
	}
	
	@When("the admin opens the Branch dropdown")
	public void the_admin_opens_the_branch_dropdown() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getSelectBranchOption()); 
		log.info("User able to second click DropDown Button");
	}

	@When("the admin selects a branch from the Branch dropdown")
	public void the_admin_selects_a_branch_from_the_branch_dropdown() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getSelectSecondDistrict()); 
		log.info("User able to select the second District");
	}
	
	@When("the admin clicks on the Add button")
	public void the_admin_clicks_on_the_add_button() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getAddButton()); 
		log.info("User able to click second time of dropdown button");
	}

	@Then("the admin clicks on the Save Staff button")
	public void the_admin_clicks_on_the_save_staff_button() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getSaveButton()); 
		log.info("User able to click Save  Button");
	}
	
	@Then("the admin clicks on the delete button")
	public void the_admin_clicks_on_the_delete_button() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getDeleteButton()); 
		log.info("User able to click Delete Button");
	}

	@Then("the admin clicks on the Confirm button")
	public void the_admin_clicks_on_the_confirm_button() {
		clickElement(PageObjectManager.getInstanceAddNewStaffs().getConfirmButton()); 
		log.info("User able to click Confirm Button");
	}
	
	

	
//	@Then("the admin clicks on the Edit option button")
//	public void the_admin_clicks_on_the_edit_option_button() {
//		clickElement(PageObjectManager.getInstanceAddNewStaffs().getEditButton()); 
//		log.info("User able to click Edit Button");
//	}
//
//	@Then("the admin clears the text box in the staff name")
//	public void the_admin_clears_the_text_box_in_the_staff_name() {
//		forceClearTextBox(PageObjectManager.getInstanceAddNewStaffs().getEditStaffName());
//		log.info("User able to clear the text box");
//	}
//	@When("user edit the staff name as {string}")
//	public void user_edit_the_staff_name_as(String string) {
//		fillTheTextBox(PageObjectManager.getInstanceAddNewStaffs().getEditStaffName(), string);
//		log.info("User able to edit the name as ahamed arsath");   
//	}
//	@When("the admin clicks on the Update Staff button")
//	public void the_admin_clicks_on_the_update_staff_button() {
//		clickElement(PageObjectManager.getInstanceAddNewStaffs().getClickUpdateStaffButton()); 
//		log.info("User able to click update staff Button");  
//	}

	@When("the admin waits until {int} seconds")
	public void the_admin_waits_until_seconds(Integer int1) throws InterruptedException {
	    Thread.sleep(10000);
	}

}
