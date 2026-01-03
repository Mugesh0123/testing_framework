package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class SalesBilling extends BaseUtils{
	
	public SalesBilling() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Billing']")
	private WebElement BillingMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Sales']")
	private WebElement SalesOption;
	
	@FindBy(xpath = "//div[@aria-controls='radix-«rm»']")
	private WebElement DrillSet;
	
	@FindBy(xpath = "//button[@class=\"inline-flex items-center gap-2 whitespace-nowrap rounded-md text-sm font-medium transition-all disabled:pointer-events-none disabled:opacity-50 [&_svg]:pointer-events-none [&_svg:not([class*='size-'])]:size-4 shrink-0 [&_svg]:shrink-0 outline-none focus-visible:border-ring focus-visible:ring-ring/50 focus-visible:ring-[3px] aria-invalid:ring-destructive/20 dark:aria-invalid:ring-destructive/40 aria-invalid:border-destructive border bg-background shadow-xs hover:bg-accent hover:text-accent-foreground dark:bg-input/30 dark:border-input dark:hover:bg-input/50 h-9 px-4 py-2 has-[>svg]:px-3 w-full justify-between\"]")
	private WebElement ConfrimClick;
	
	@FindBy(xpath = "//button[normalize-space()='Select Customer']")
	private WebElement SelectCustomerButton;
	
	@FindBy(xpath = "//div[contains(@class,'flex-1 overflow-y-auto space-y-1')]//button[1]")
	private WebElement SelectCustomerArun;
	
	@FindBy(xpath = "//select[@class='w-full border rounded px-2 py-1 text-sm']")
	private WebElement PaymentModeButton;
	
	@FindBy(xpath = "//option[normalize-space()='UPI']")
	private WebElement PaymentType;
	
	@FindBy(xpath = "//select[contains(@class,'border px-2 py-1 rounded')]")
	private WebElement AllDropdownButton;
	
	@FindBy(xpath = "//option[@value='685117425c11c6f0f5ecaa25']")
	private WebElement SelectLocation;
	
	@FindBy(xpath = "//button[normalize-space()='Payment (Sale)']")
	private WebElement PaymentSaleButton;
	
	@FindBy(xpath = "//span[normalize-space()='Order List']")
	private WebElement OrderListMenu;
	
	@FindBy(xpath = "//td[normalize-space()='INV-2025-000078']")
	private WebElement BillNumberView;
	
	

	public WebElement getBillingMenu() {
		return BillingMenu;
	}

	public WebElement getSalesOption() {
		return SalesOption;
	}
	
	public WebElement getDrillSet() {
		return DrillSet;
	}
	
	public WebElement getConfrimClick() {
		return ConfrimClick;
	}
	
	public WebElement getSelectCustomerButton() {
		return SelectCustomerButton;
	}
	
	public WebElement getSelectCustomerVijay() {
		return SelectCustomerArun;
	}
	
	public WebElement getPaymentModeButton() {
		return PaymentModeButton;
	}
	
	public WebElement getPaymentType() {
		return PaymentType;
	}
	
	public WebElement getAllDropdownButton() {
		return AllDropdownButton;
	}
	
	public WebElement getSelectLocation() {
		return SelectLocation;
	}
	
	public WebElement getPaymentSaleButton() {
		return PaymentSaleButton;
	}
	
	public WebElement getOrderListMenu() {
		return OrderListMenu;
	}
	
	public WebElement getBillNumberView() {
		return BillNumberView;
	}
}

