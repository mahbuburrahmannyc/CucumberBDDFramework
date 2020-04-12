package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bdd.com.utilities.NewTourExcelSheetData;
import bdd.com.utilities.SetupDrivers;
import bdd.newtours.PageElements.HomePageLocators;

public class NewToursHomePageAction {
	
	//My project
	HomePageLocators newToursHomePageLocators=new HomePageLocators();
	
	public NewToursHomePageAction() {
		newToursHomePageLocators=new HomePageLocators();
		PageFactory.initElements(SetupDrivers.driver,newToursHomePageLocators);	
	}
	
	public void openNewToursHomePage() throws Exception{
		
		System.out.println(NewTourExcelSheetData.getMapData("FirstName"));
		SetupDrivers.driver.get("http://newtours.demoaut.com/");
		System.out.println("1st  Execution Application");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void navigateToRegisterPage() throws Exception {
		System.out.println("Before Register Link");
		Thread.sleep(100);
		newToursHomePageLocators.RegisterButton.click();
		System.out.println("After Register Link");
		
	}
	

}
