package bdd.newtours.PageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.com.utilities.NewTourExcelSheetData;
import bdd.com.utilities.SetupDrivers;
import bdd.newtours.PageElements.HomePageLocators;
import bdd.newtours.PageElements.RegisterPageLocators;

public class RegisterPageAction {
	//My project
	RegisterPageLocators newToursRegisterPageLocators=new RegisterPageLocators();
	public RegisterPageAction() {
		newToursRegisterPageLocators=new RegisterPageLocators();
		PageFactory.initElements(SetupDrivers.driver,newToursRegisterPageLocators);	
	}
	
	public void basicContactinfor() throws Exception{
        System.out.println("Print Basic Contact Information");
		newToursRegisterPageLocators.firstName.sendKeys(NewTourExcelSheetData.getMapData("FirstName"));
		//newToursRegisterPageLocators.firstName.sendKeys("Mahbub");
		newToursRegisterPageLocators.lastName.sendKeys("Rahman");
		newToursRegisterPageLocators.phone.sendKeys("6465916046");
		newToursRegisterPageLocators.email.sendKeys("teck4dummies@gmail.com");
		System.out.println(" After Print Basic Contact Information");
		
	}
	
	public void basicMailingInfo() {
		System.out.println("Print Basic mailing Information");
		newToursRegisterPageLocators.addressField1.sendKeys("123 Evans Street");
		newToursRegisterPageLocators.addressField2.sendKeys("Amherst");
		newToursRegisterPageLocators.city.sendKeys("Wlliamsville");
		newToursRegisterPageLocators.state.sendKeys("new York");
		newToursRegisterPageLocators.postalCode.sendKeys("14221");
		
		Select myDropDown=new Select(newToursRegisterPageLocators.country);
		myDropDown.selectByVisibleText("UNITED STATES");
		System.out.println("After Print Basic Mailing Information");
			
	}
	
	public void fillUpUserInformation(String UserName) {
		newToursRegisterPageLocators.userName.sendKeys(UserName);
		newToursRegisterPageLocators.password.sendKeys("test1234");
		newToursRegisterPageLocators.confirmPassword.sendKeys("test1234");
		System.out.println("Successfully entered UserName and  Password");
		
	}
	
	public void submitForm() {
		newToursRegisterPageLocators.submitButton.click();
		System.out.println("Successfully click SubmitButton");	
		
	}

}