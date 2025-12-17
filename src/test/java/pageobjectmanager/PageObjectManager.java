package pageobjectmanager;

import pages.LoginPageElement;

public class PageObjectManager {
	
private static LoginPageElement loginPageElement;
	

	public static LoginPageElement getInstanceLogin() {

		return (loginPageElement == null) ? loginPageElement = new LoginPageElement() : loginPageElement;
	}
}
