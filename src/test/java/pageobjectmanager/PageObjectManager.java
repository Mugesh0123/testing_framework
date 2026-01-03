package pageobjectmanager;

import pages.LoginPageElement;
import pages.SalesBilling;
import pages.VerifyNamePagesElements;
import stepdefinition.AddBranches;
import stepdefinition.AddCustomer;
import stepdefinition.AddInventory;
import stepdefinition.AddNewStaffs;
import stepdefinition.ManageTranferStock;
import stepdefinition.VerifySalesAndBilling;

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
     
     private static AddNewStaffs addNewStaffs;

     public static AddNewStaffs getInstanceAddNewStaffs() {
    	 
	return (addNewStaffs== null) ? addNewStaffs = new AddNewStaffs() :addNewStaffs;
	
}
     private static VerifySalesAndBilling verifySalesAndBilling;

     public static VerifySalesAndBilling getInstanceVerifySalesAndBilling() {
    	 
	return (verifySalesAndBilling== null) ? verifySalesAndBilling = new VerifySalesAndBilling() :verifySalesAndBilling;
	
}
     
     private static AddInventory addInventory;

     public static AddInventory getInstanceAddInventory() {
    	 
	return (addInventory== null) ? addInventory = new AddInventory() :addInventory;
	
}
     
     private static AddBranches addBranches;

     public static AddBranches getInstanceAddBranches() {
    	 
	return (addBranches== null) ? addBranches = new AddBranches() :addBranches;
	
}
     
     private static ManageTranferStock manageTransferStock;

     public static ManageTranferStock getInstanceManageTranferStock() {
    	 
	return (manageTransferStock== null) ? manageTransferStock = new ManageTranferStock() :manageTransferStock;
	
}
	
	}
	

