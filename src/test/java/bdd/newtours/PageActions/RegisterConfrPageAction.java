package bdd.newtours.PageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.com.utilities.SetupDrivers;
import bdd.newtours.PageElements.HomePageLocators;
import bdd.newtours.PageElements.RegisterConfrPageLocators;

public class RegisterConfrPageAction {
	// My project 
	
	RegisterConfrPageLocators confrPageLocatorsobj= new RegisterConfrPageLocators();
	
	public RegisterConfrPageAction() {
		confrPageLocatorsobj=new RegisterConfrPageLocators();
		PageFactory.initElements(SetupDrivers.driver,confrPageLocatorsobj);	
	}
	
	public void verifyThankYouRegister() {
		
		String confirmMeg= confrPageLocatorsobj.thankYouText.getText();
		Assert.assertEquals(confirmMeg,"Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		System.out.println("Validation Completed");                             
	}

}
