package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.When;
import pageobjectmanager.PageObjectManager;
import pages.SalesBilling;

public class VerifySalesAndBilling extends SalesBilling{
	
	@When("the admin clicks on the Billing menu")
	public void the_admin_clicks_on_the_billing_menu() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getBillingMenu());	
		log.info("User able to click the Billing Menu");
	    
	}

	@When("the admin selects the Sales option")
	public void the_admin_selects_the_sales_option() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getSalesOption());	
		log.info("User able to click the Sales Option");
	}

	@When("the admin selects a product from the product list")
	public void the_admin_selects_a_product_from_the_product_list() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getDrillSet());	
		log.info("User able to click the Grill Set");
	}

	@When("the admin confirms the selected product")
	public void the_admin_confirms_the_selected_product() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getConfrimClick());	
		log.info("User able to click the Confirm Click");
	}

	@When("the admin clicks on Select Customer")
	public void the_admin_clicks_on_select_customer() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getSelectCustomerButton());	
		log.info("User able to click the Select Customer Button");
	   
	}

	@When("the admin click a customer")
	public void the_admin_click_a_customer() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getSelectCustomerVijay());	
		log.info("User able to click the Name of Arun");
	   
	}

	@When("the admin clicks a payment mode")
	public void the_admin_clicks_a_payment_mode() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getPaymentModeButton());	
		log.info("User able to click the payment Mode DropDown Button ");
	}

	@When("the admin selects a payment type")
	public void the_admin_selects_a_payment_type() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getPaymentType());	
		log.info("User able to click the UPI Payment Type");   
	}
	
	@When("the admin clicks on the All Dropdown Button")
	public void the_admin_clicks_on_the_all_dropdown_button() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getAllDropdownButton());	
		log.info("User able to click the All Dropdown Button");
	}

	@When("the admin selects a location in All Dropdown list")
	public void the_admin_selects_a_location_in_all_dropdown_list() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getSelectLocation());	
		log.info("User able to click the All Dropdown Button");
	}

	@When("the admin clicks the payment\\(Sale) button")
	public void the_admin_clicks_the_payment_sale_button() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getPaymentSaleButton());	
		log.info("User able to click the PaymentSaleBUtton"); 
	}

	@When("the admin selects the Order List option")
	public void the_admin_selects_the_order_list_option() {
		clickElementWhenOverlayGone(PageObjectManager.getInstanceVerifySalesAndBilling().getOrderListMenu());	
		log.info("User able to click the Order List Menu"); 
	}

	@When("user can able to see the {string} in the billing Orders")
	public void user_can_able_to_see_the_in_the_billing_orders(String string) {
		String billingOrders=getTextByElement(PageObjectManager.getInstanceVerifySalesAndBilling().getBillNumberView());
		log.info("User able to see both are same");
		Assert.assertEquals(billingOrders, string);
	}

}
