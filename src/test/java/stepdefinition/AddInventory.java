package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;
import pages.AddSalesInventory;

public class AddInventory extends AddSalesInventory{
	
	
	@Given("the admin selects the Sales Inventory option")
	public void the_admin_selects_the_sales_inventory_option() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSalesInventoryOption()); 
		log.info("User able to click the Sales Inventory Option");
	}

	@Given("the admin clicks on the Add Inventory button")
	public void the_admin_clicks_on_the_add_inventory_button() {
		clickElement(PageObjectManager.getInstanceAddInventory().getAddInventoryOption()); 
		log.info("User able to click Add Inventory Button");
	}

	@Given("the admin enters the item name {string}")
	public void the_admin_enters_the_item_name(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddInventory().getAddItemName(), string);
		log.info("User able to enter Item name");
	}

	@Given("the admin enters the description {string}")
	public void the_admin_enters_the_description(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddInventory().getAddDescription(), string);
		log.info("User able to enter Description");
	}

//	@Given("the admin opens the Select Branch dropdown")
//	public void the_admin_opens_the_select_branch_dropdown() {
//		clickElement(PageObjectManager.getInstanceAddInventory().getSelectBranchButton()); 
//		log.info("User able to click Select Branch DropDown Button");
//	}

	@Given("the admin selects a branch from the dropdown list")
	public void the_admin_selects_a_branch_from_the_dropdown_list() {
		selectByIndexByDropdown(PageObjectManager.getInstanceAddInventory().getSelectBranchButton(),1); 
		log.info("User able to click Select Branch of the list");
	}
	
//	@Given("the admin opens the Select Category dropdown")
//	public void the_admin_opens_the_select_category_dropdown() {
//		clickElement(PageObjectManager.getInstanceAddInventory().getSelectCategoryButton()); 
//		log.info("User able to click Select Category DropDown Button");
//	}

	@Given("the admin selects a Category from the dropdown list")
	public void the_admin_selects_a_category_from_the_dropdown_list() {
		selectByIndexByDropdown(PageObjectManager.getInstanceAddInventory().getSelectCategoryButton(), 2); 
		log.info("User able to click Select Category of the list");
	}


	@Given("the admin opens the Select Brand dropdown")
	public void the_admin_opens_the_select_brand_dropdown() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSelectBrandButton()); 
		log.info("User able to click Select Brand Dropdown Button");
	}

	@Given("the admin selects a brand from the dropdown list")
	public void the_admin_selects_a_brand_from_the_dropdown_list() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSelectBrandOption()); 
		log.info("User able to click Select Brand of the list ");
	}

	@Given("the admin opens the Select Size dropdown")
	public void the_admin_opens_the_select_size_dropdown() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSelectSizeButton()); 
		log.info("User able to click Select Size Dropdown Button ");
	}

	@Given("the admin selects a size from the dropdown list")
	public void the_admin_selects_a_size_from_the_dropdown_list() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSelectSizeOption()); 
		log.info("User able to click Select Size Option ");
	}

	@Given("the admin opens the Select Color dropdown")
	public void the_admin_opens_the_select_color_dropdown() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSelectColorButton()); 
		log.info("User able to click Select color Dropdown Button  ");
	}

	@Given("the admin selects a color from the dropdown list")
	public void the_admin_selects_a_color_from_the_dropdown_list() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSelectColorOption()); 
		log.info("User able to click Select Color Option ");
	}

	@Given("the admin enters the sale price {string}")
	public void the_admin_enters_the_sale_price(String string) {
		fillTheTextBox(PageObjectManager.getInstanceAddInventory().getAddPrice(), string);
		log.info("User able to enter Sale Price");
	}

	@Given("the admin increases the stock quantity by clicking")
	public void the_admin_increases_the_stock_quantity_by_clicking() {
		fillTheTextBox(PageObjectManager.getInstanceAddInventory().getAddQuantity(),"10"); 
		log.info("User able to click Add Quantity ");
	}

	@Given("the admin clicks the Save Inventory button")
	public void the_admin_clicks_the_save_inventory_button() {
		clickElement(PageObjectManager.getInstanceAddInventory().getSaveInventoryButton()); 
		log.info("User able to click Save Inventory Button ");
	}
	
	@Given("wait for some time for {int} seconds")
	public void wait_for_some_time_for_seconds(Integer int1) throws InterruptedException {
	    Thread.sleep(10000);
	}


}
