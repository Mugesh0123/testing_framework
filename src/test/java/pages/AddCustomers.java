package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class AddCustomers extends BaseUtils{
	
	public AddCustomers() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Management'])[1]")
	private WebElement ManagementMenu;
	
	@FindBy(xpath ="//span[normalize-space()='Customers']")
	private WebElement CustomerOption;
	
	@FindBy(xpath ="//button[normalize-space()='Add Customer']")
	private WebElement AddCustomerButton;
	
	
	@FindBy(xpath ="//input[@placeholder='Name']")
	private WebElement CustomerName;
	
	@FindBy(xpath ="//input[@placeholder='Phone']")
	private WebElement CustomerMobileNumber;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	private WebElement SaveButton;
	
	@FindBy(xpath ="//section[@aria-label='Notifications alt+T']")
	private WebElement NotificationArea;
	
	@FindBy(xpath ="(//input[@placeholder='Search by name or phone...'])[1]")
	private WebElement SearchArea;
	
	@FindBy(xpath ="//tbody/tr[1]/td[5]/button[1]")
	private WebElement DeleteButton;
	
	@FindBy(xpath ="//button[normalize-space()='Confirm']")
	private WebElement ConfirmButton;
	
	
	
	
	public WebElement getManagementMenu() {
		return ManagementMenu;
	}
	
	public WebElement getCustomerOption() {
		return CustomerOption;
	}

	public WebElement getAddCustomerButton() {
		return AddCustomerButton;
	}
	
	public WebElement getCustomerName() {
		return CustomerName;

}
	public WebElement getCustomerMobileNumber() {
		return CustomerMobileNumber;

}
	
	public WebElement getSaveButton() {
		return SaveButton;

}
	public WebElement getNotificationArea() {
		return NotificationArea;

}
	public WebElement getSearchArea() {
		return SearchArea;

}
	public WebElement getDeleteButton() {
		return DeleteButton;

}
	
	public WebElement getConfirmButton() {
		return ConfirmButton;

}
}
