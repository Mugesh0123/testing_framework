package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class AddLocationAndBranches extends BaseUtils{

	public AddLocationAndBranches() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Administration']")
	private WebElement AdministrationMenu;
	
	@FindBy(xpath="//span[normalize-space()='Branches']")
	private WebElement BranchesOption;
	
	@FindBy(xpath="//button[normalize-space()='Add Branch']")
	private WebElement AddBranchButton;
	
	@FindBy(xpath="//input[@placeholder='Branch Name']")
	private WebElement BranchName;
	
	@FindBy(xpath="//input[@placeholder='Location']")
	private WebElement BranchLocation;
	
	@FindBy(xpath="//input[@placeholder='Contact Number']")
	private WebElement ContactNumber;
	
	@FindBy(xpath="//button[normalize-space()='Save Branch']")
	private WebElement SaveBranchButton;
	
	@FindBy(xpath="//tbody/tr[18]/td[4]/button[1]")
	private WebElement EditButton;
	
	@FindBy(xpath="//input[@placeholder='Branch Name']")
	private WebElement EditBranchName;
	
	@FindBy(xpath="//button[normalize-space()='Save Changes']")
	private WebElement SaveChangesButton;
	
	
	public WebElement getAdministrationMenu() {
	      return AdministrationMenu;
	}
	
	public WebElement getBranchesOption() {
	      return BranchesOption;
	}
	
	public WebElement getAddBranchButton() {
	      return AddBranchButton;
	}
	
	public WebElement getBranchName() {
	      return BranchName;
	}
	
	public WebElement getBranchLocation() {
	      return BranchLocation;
	}
	
	public WebElement getContactNumber() {
	      return ContactNumber;
	}
	
	public WebElement getSaveBranchButton() {
	      return SaveBranchButton;
	}
	
	public WebElement getEditButton() {
	      return EditButton;
	}

	public WebElement getEditBranchName() {
	      return EditBranchName;
	}
	
	public WebElement getSaveChangesButton() {
	      return SaveChangesButton;
	}
	
	
}
