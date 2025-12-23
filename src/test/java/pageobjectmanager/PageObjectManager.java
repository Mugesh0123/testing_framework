package pageobjectmanager;

import pages.LoginPageElement;
import pages.VerifyNamePagesElements;
import stepdefinition.AddCustomer;

public class PageObjectManager {
	
private static LoginPageElement loginPageElement;
	

	public static LoginPageElement getInstanceLogin() {

		return (loginPageElement == null) ? loginPageElement = new LoginPageElement() : loginPageElement;
	}
	
private static VerifyNamePagesElements verifyNamePagesElements;
	

	public static VerifyNamePagesElements getInstanceVerifyNames() {

		return (verifyNamePagesElements == null) ? verifyNamePagesElements = new VerifyNamePagesElements() : verifyNamePagesElements;
		
		
	}
private static AddCustomer addCustomer;

     public static AddCustomer getInstanceAddCustomerName() {
    	 
	return (addCustomer == null) ? addCustomer = new AddCustomer() :addCustomer;
	
}
	
	
	}
	

