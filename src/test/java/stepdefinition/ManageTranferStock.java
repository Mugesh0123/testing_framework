package stepdefinition;

import io.cucumber.java.en.Given;
import pageobjectmanager.PageObjectManager;
import pages.TranferStock;

public class ManageTranferStock extends TranferStock{
	
	@Given("the admin clicks on the Manage Transfers button")
	public void the_admin_clicks_on_the_manage_transfers_button() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getManageTransferButton()); 
		log.info("User able to click the Manage Transfer Button");
	}

	@Given("the admin clicks on the Select Item dropdown text box")
	public void the_admin_clicks_on_the_select_item_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSearchItemArea()); 
		log.info("User able to click the Click Search Item Area");
	}

	@Given("the admin select from the Select Item dropdown text box")
	public void the_admin_select_from_the_select_item_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectItem()); 
		log.info("User able to click the Select Item");
	}

	@Given("the admin clicks on the Brand dropdown text box")
	public void the_admin_clicks_on_the_brand_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectBrand()); 
		log.info("User able to click the Select Brand Dropdown");
	}

	@Given("the admin select from the Brand dropdown text box")
	public void the_admin_select_from_the_brand_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectBrandOption()); 
		log.info("User able to click the Select Brand Option");
	}

	@Given("the admin clicks on the size dropdown text box")
	public void the_admin_clicks_on_the_size_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectSize()); 
		log.info("User able to click the Select Size Dropdown");
	}

	@Given("the admin select from the size dropdown text box")
	public void the_admin_select_from_the_size_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectSizeOption()); 
		log.info("User able to click the Select Size 10Kg");
	}

	@Given("the admin clicks on the color dropdown text box")
	public void the_admin_clicks_on_the_color_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectColor()); 
		log.info("User able to click the Select color Dropdown");
	}

	@Given("the admin select from the color dropdown text box")
	public void the_admin_select_from_the_color_dropdown_text_box() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectColorOption()); 
		log.info("User able to click the Select color Option");
	}

//	@Given("the admin clicks on the Transfer Type dropdown text box")
//	public void the_admin_clicks_on_the_transfer_type_dropdown_text_box() {
//		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectTransferType()); 
//		log.info("User able to click the Select Transfer Type Dropdown");
//	}
//
//	@Given("the admin select from the Transfer Type dropdown text box")
//	public void the_admin_select_from_the_transfer_type_dropdown_text_box() {
//		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectTransferTypeOption()); 
//		log.info("User able to click the Select Transfer Type as Branch");
//	}

//	@Given("the admin clicks on the From Branch dropdown text box")
//	public void the_admin_clicks_on_the_from_branch_dropdown_text_box() {
//		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectFromBranch()); 
//		log.info("User able to click the From Branch Dropdown");
//	}

//	@Given("the admin select from the From Branch dropdown text box")
//	public void the_admin_select_from_the_from_branch_dropdown_text_box() {
//		selectByIndexByDropdown(PageObjectManager.getInstanceManageTranferStock().getSelectFromBranch(),1); 
//		log.info("User able to click Select from Branch of the list");
//	}

//	@Given("the admin clicks on the To Branch dropdown text box")
//	public void the_admin_clicks_on_the_to_branch_dropdown_text_box() {
//		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectToBranch()); 
//		log.info("User able to click the Select To Branch");
//	}
//
//	@Given("the admin select from the To Branch dropdown text box")
//	public void the_admin_select_from_the_to_branch_dropdown_text_box() {
//		clickElement(PageObjectManager.getInstanceManageTranferStock().getSelectToBranchOption()); 
//		log.info("User able to click the Select To Branch Option");
//	}

	@Given("the admin enters the Quantity {string}")
	public void the_admin_enters_the_quantity(String string) {
		fillTheTextBox(PageObjectManager.getInstanceManageTranferStock().getEnterQuantity(), string); 
		log.info("User able to enter a quantity");
	}

	@Given("the admin enters the Transfer Note\\(Optional) {string}")
	public void the_admin_enters_the_transfer_note_optional(String string) {
		fillTheTextBox(PageObjectManager.getInstanceManageTranferStock().getEnterRef(), string); 
		log.info("User able to enter a Ref");
	}

	@Given("the admin clicks on the Confirm Transfer button")
	public void the_admin_clicks_on_the_confirm_transfer_button() {
		clickElement(PageObjectManager.getInstanceManageTranferStock().getClickConfirmTransfer()); 
		log.info("User able to click the Confirm Tranfer Button");
	}




}
