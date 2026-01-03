package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class AddStaffs extends BaseUtils {
	
	public AddStaffs() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Administration']")
	private WebElement AdministrationMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Profile']")
	private WebElement ProfileOption;
	
	@FindBy(xpath = "//button[normalize-space()='Add Staff']")
	private WebElement AddStaffButton;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement StaffName;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement StaffEmail;
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement StaffPhoneNumber;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "//select[@class='flex-1 p-2 border rounded']")
	private WebElement SelectBranchOption;
	
	@FindBy(xpath = "//option[@value='685117425c11c6f0f5ecaa25']")
	private WebElement SelectDistrict;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement AddButton;
	
	@FindBy(xpath = "//option[@value='6857f9149be2d16ac23c75a1']")
	private WebElement SelectSecondDistrict;
	
	@FindBy(xpath = "//button[normalize-space()='Save Staff']")
	private WebElement SaveButton;
	
	@FindBy(xpath = "//tbody/tr[12]/td[7]/button[2]")
	private WebElement DeleteButton;
	
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement ConfirmButton;
	
//	@FindBy(xpath = "//tbody/tr[10]/td[7]/button[1]")
//	private WebElement EditButton;
//	
//	@FindBy(xpath = "//input[@placeholder='Name']")
//	private WebElement EditStaffName;
//	
//	@FindBy(xpath = "//button[normalize-space()='Update Staff']")
//	private WebElement ClickUpdateStaffButton;

	

	public WebElement getAdministrationMenu() {
		return AdministrationMenu;
	}
	
	public WebElement getProfileOption() {
		return ProfileOption;
	}
	
	public WebElement getAddStaffButton() {
		return AddStaffButton;
	}
	
	public WebElement getStaffName() {
		return StaffName;
	}
	
	public WebElement getStaffEmail() {
		return StaffEmail;
	}
	
	public WebElement getStaffPhoneNumber() {
		return StaffPhoneNumber;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getSelectBranchOption() {
		return SelectBranchOption;
	}
	
	public WebElement getSelectDistrict() {
		return SelectDistrict;
	}
	
	public WebElement getAddButton() {
		return AddButton;
	}
	
	public WebElement getSelectSecondDistrict() {
		return SelectSecondDistrict;	
    }
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public WebElement getDeleteButton() {
		return DeleteButton;
	}
	
	public WebElement getConfirmButton() {
		return ConfirmButton;
	}
	
//	public WebElement getEditButton() {
//		return EditButton;
//	}
//	
//	public WebElement getEditStaffName() {
//		return EditStaffName;
//	}
//	
//	public WebElement getClickUpdateStaffButton() {
//		return ClickUpdateStaffButton;
//	}
	

	
	
}
