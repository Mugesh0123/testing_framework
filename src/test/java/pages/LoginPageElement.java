package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseUtils;


public class LoginPageElement extends BaseUtils{
	
	public LoginPageElement() {
		PageFactory.initElements(driver, this);
	}
	
	//  field
	@FindBy(xpath ="//*[@id='root']/div/div/form/div[1]/div/input")
	private WebElement phoneNumber;
	
	// password 
	@FindBy(xpath ="//*[@id='root']/div/div/form/div[2]/div/input")
	private WebElement password;
	
	// sign button
	
	@FindBy(xpath ="/html/body/div/div/div/form/button")
	private WebElement signButton;
	
	
	// /html/body/div/div/div/div[2]/header/div[2]/span[2]/img

	@FindBy(id ="radix-«r2»")
	private WebElement profileIcon;
	
	
	
	// /html/body/div[2]/div/div[3]
	
	@FindBy(xpath ="/html/body/div[2]/div/div[3]")
	private WebElement logout;
	
	
	public WebElement getProfileIcon() {
		return profileIcon;
	}


	public WebElement getLogout() {
		return logout;
	}


	public WebElement getSignButton() {
		return signButton;
	}


	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	

	public WebElement getPassword() {
		return password;
	}


}
