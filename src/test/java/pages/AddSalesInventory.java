package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class AddSalesInventory extends BaseUtils {
	
	public AddSalesInventory() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[normalize-space()='Sales Inventory']")
	private WebElement SalesInventoryOption;
	
	@FindBy(xpath = "//button[normalize-space()='Add Inventory']")
	private WebElement AddInventoryOption;
	
	@FindBy(xpath = "//input[@placeholder='Item Name']")
	private WebElement AddItemName;
	
	@FindBy(xpath = "//input[@placeholder='Description']")
	private WebElement AddDescription;
	
	@FindBy(xpath = "(//select[@class='w-full p-2 border rounded'])[1]")
	private WebElement SelectBranchButton;
	
//	@FindBy(xpath = "//select[@class='w-full p-2 border rounded']//option[@value='6857f9149be2d16ac23c75a1'][normalize-space()='Chennai']")
//	private WebElement SelectBranchOption;
	
	@FindBy(xpath = "/html/body/div[3]/form/select[2]")
	private WebElement SelectCategoryButton;
	
//	@FindBy(xpath = "//option[@value='Hand Tools']")
//	private WebElement SelectCategoryOption;
	
	@FindBy(xpath = "//div[@class='grid grid-cols-1 md:grid-cols-5 gap-4 items-end']//select[1]")
	private WebElement SelectBrandButton;
	
	@FindBy(xpath = "//option[@value='Dewalt']")
	private WebElement SelectBrandOption;
	
	@FindBy(xpath = "//div[@class='grid grid-cols-1 md:grid-cols-5 gap-4 items-end']//select[1]")
	private WebElement SelectSizeButton;
	
	@FindBy(xpath = "//option[@value='10KG']")
	private WebElement SelectSizeOption;
	
	@FindBy(xpath = "//div[@class='grid grid-cols-1 md:grid-cols-5 gap-4 items-end']//select[1]")
	private WebElement SelectColorButton;
	
	@FindBy(xpath = "//option[@value='Blue']")
	private WebElement SelectColorOption;
	
	@FindBy(xpath = "//input[@placeholder='Sale Price (₹)']")
	private WebElement AddPrice;
	
	@FindBy(xpath = "//input[@placeholder='Stock']")
	private WebElement AddQuantity;
	
	@FindBy(xpath = "//button[normalize-space()='Save Inventory']")
	private WebElement SaveInventoryButton;
	

	
	public WebElement getSalesInventoryOption() {
		return SalesInventoryOption;
	}
	
	public WebElement getAddInventoryOption() {
		return AddInventoryOption;
	}
	
	public WebElement getAddItemName() {
		return AddItemName;
	}
	
	public WebElement getAddDescription() {
		return AddDescription;
	}
	
	public WebElement getSelectBranchButton() {
		return SelectBranchButton;
	}
	
//	public WebElement getSelectBranchOption() {
//		return SelectBranchOption;
//	}
	
	public WebElement getSelectCategoryButton() {
		return SelectCategoryButton;
	}
	
//	public WebElement getSelectCategoryOption() {
//		return SelectCategoryOption;
//	}
	
	public WebElement getSelectBrandButton() {
		return SelectBrandButton;
	}
	
	public WebElement getSelectBrandOption() {
		return SelectBrandOption;
	}
	
	public WebElement getSelectSizeButton() {
		return SelectSizeButton;
	}
	
	public WebElement getSelectSizeOption() {
		return SelectSizeOption;
	}
	
	public WebElement getSelectColorButton() {
		return SelectColorButton;
	}
	
	public WebElement getSelectColorOption() {
		return SelectColorOption;
	}
	
	public WebElement getAddPrice() {
		return AddPrice;
	}
	
	public WebElement getAddQuantity() {
		return AddQuantity;
	}
	
	public WebElement getSaveInventoryButton() {
		return SaveInventoryButton;
	}
	
	
	
}
