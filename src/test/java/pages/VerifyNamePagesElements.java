package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;

public class VerifyNamePagesElements extends BaseUtils {
	
	public VerifyNamePagesElements() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath ="//span[@class='text-lg font-semibold']")
	private WebElement DashboardName;
	
	
	@FindBy(xpath ="//div[normalize-space()='Total Customers']")
	private WebElement ContainerHeader;
	
	
	public WebElement getDashboardName() {
		return DashboardName;
	}

    public WebElement getContainerHeader() {
		return ContainerHeader;
	}
	
	
	
}
