package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class TranferStock extends BaseUtils{
	
	public TranferStock() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Manage Transfers']")
	private WebElement ManageTransferButton;
	
	@FindBy(xpath = "//input[@placeholder='Search Item...']")
	private WebElement SearchItemArea;
	
	@FindBy(xpath = "//div[@class='relative']//div[3]")
	private WebElement SelectItem;
	
	@FindBy(xpath = "//body[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	private WebElement SelectBrand;
	
	@FindBy(xpath = "//option[@value='Dewalt']")
	private WebElement SelectBrandOption;
	
	@FindBy(xpath = "//body[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[2]/select[1]")
	private WebElement SelectSize;
	
	@FindBy(xpath = "//option[@value='10KG']")
	private WebElement SelectSizeOption;
	
	@FindBy(xpath = "//body[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[3]/select[1]")
	private WebElement SelectColor;
	
	@FindBy(xpath = "//option[@value='Red']")
	private WebElement SelectColorOption;
	
//	@FindBy(xpath = "//select[@class='w-full p-2 border rounded font-medium']")
//	private WebElement SelectTransferType;
//	
//	@FindBy(xpath = "//option[@value='branch']")
//	private WebElement SelectTransferTypeOption;
	
//	@FindBy(xpath = "//body[1]/div[3]/form[1]/div[2]/div[2]/select[1]")
//	private WebElement SelectFromBranch;
	
//	@FindBy(xpath = "//div[@id='radix-«re3»']//div[1]//select[1]//option[3]")
//	private WebElement SelectFromBranchOption;
	
//	@FindBy(xpath = "//body[1]/div[3]/form[1]/div[2]/div[3]/select[1]")
//	private WebElement SelectToBranch;
//	
//	@FindBy(xpath = "//*[@id=\"radix-«re3»\"]/form/div[2]/div[3]/select/option[5]")
//	private WebElement SelectToBranchOption;
	
	
	@FindBy(xpath = "//input[@placeholder='Qty']")
	private WebElement EnterQuantity;
	
	@FindBy(xpath = "//input[@placeholder='Ref #...']")
	private WebElement EnterRef;
	
	@FindBy(xpath = "//button[normalize-space()='Confirm Transfer']")
	private WebElement ClickConfirmTransfer;
	
	
	
	public WebElement getManageTransferButton() {
		return ManageTransferButton;
	}
	
	public WebElement getSearchItemArea() {
		return SearchItemArea;
	}
	
	public WebElement getSelectItem() {
		return SelectItem;
	}

	public WebElement getSelectBrand() {
		return SelectBrand;
	}
	
	public WebElement getSelectBrandOption() {
		return SelectBrandOption;
	}
	
	public WebElement getSelectSize() {
		return SelectSize;
	}
	
	public WebElement getSelectSizeOption() {
		return SelectSizeOption;
	}
	public WebElement getSelectColor() {
		return SelectColor;
	}
	
	public WebElement getSelectColorOption() {
		return SelectColorOption;
	}
	
//	public WebElement getSelectTransferType() {
//		return SelectTransferType;
//	}
//	
//	public WebElement getSelectTransferTypeOption() {
//		return SelectTransferTypeOption;
//	}
	
//	public WebElement getSelectFromBranch() {
//		return SelectFromBranch;
//	}
	
//	public WebElement getSelectFromBranchOption() {
//		return SelectFromBranchOption;
//	}
	
//	public WebElement getSelectToBranch() {
//		return SelectToBranch;
//	}
//	
//	public WebElement getSelectToBranchOption() {
//		return SelectToBranchOption;
//	}
	
	public WebElement getEnterQuantity() {
		return EnterQuantity;
	}
	
	public WebElement getEnterRef() {
		return EnterRef;
	}
	
	public WebElement getClickConfirmTransfer() {
		return ClickConfirmTransfer;
	}
}
