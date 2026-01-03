package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;
import pages.AddLocationAndBranches;

public class AddBranches extends AddLocationAndBranches {
	
	@When("the admin navigates to the Administration menu")
	public void the_admin_navigates_to_the_administration_menu() {
		clickElement(PageObjectManager.getInstanceAddBranches().getAdministrationMenu()); 
		log.info("User able to click Administration Menu");
	}

	@When("the admin selects the Branches option")
	public void the_admin_selects_the_branches_option() {
		clickElement(PageObjectManager.getInstanceAddBranches().getBranchesOption()); 
		log.info("User able to click Branches Option");
	}

	@When("the admin clicks on the Add Branch button")
	public void the_admin_clicks_on_the_add_branch_button() {
		clickElement(PageObjectManager.getInstanceAddBranches().getAddBranchButton()); 
		log.info("User able to click Add Branch Button");
	}

	@When("the admin enters the branch name {string}")
	public void the_admin_enters_the_branch_name(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddBranches().getBranchName(), string); 
		log.info("User able to click Enter Branch Name");
	}

	@When("the admin enters the location {string}")
	public void the_admin_enters_the_location(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddBranches().getBranchLocation(), string); 
		log.info("User able to click Enter Branch Location");
	}

	@When("the admin enters the contact number {string}")
	public void the_admin_enters_the_contact_number(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddBranches().getContactNumber(), string); 
		log.info("User able to click Enter Contact Number");
	}

	@When("the admin clicks on the Save Branch button")
	public void the_admin_clicks_on_the_save_branch_button() {
		clickElement(PageObjectManager.getInstanceAddBranches().getSaveBranchButton()); 
		log.info("User able to click Save Branch Button");
	}

	@When("the admin clicks the Edit button")
	public void the_admin_clicks_the_edit_button() {
		clickWhenReady(PageObjectManager.getInstanceAddBranches().getEditButton()); 
		log.info("User able to click Edit Button");
	}

	@When("the admin clears the branch name text box")
	public void the_admin_clears_the_branch_name_text_box() {
		forceClearTextBox(PageObjectManager.getInstanceAddBranches().getEditBranchName()); 
		log.info("User able to click Enter Contact Number");
	}

	@When("the admin enters the branch name as {string}")
	public void the_admin_enters_the_branch_name_as(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddBranches().getEditBranchName(), string); 
	log.info("User able to click Enter Contact Number");
	}

	@When("the admin clicks on the Save Changes button")
    public void the_admin_clicks_on_the_save_changes_button() {
		clickElement(PageObjectManager.getInstanceAddBranches().getSaveChangesButton()); 
		log.info("User able to click Save Branch Button");
	}
	@When("the admin waits until the transfer details are loaded")
	public void the_admin_waits_until_the_transfer_details_are_loaded() throws InterruptedException {
	    Thread.sleep(10000);
	}


}
