package bdd.google.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.com.utilities.SetupDrivers;
import bdd.google.PageElements.GoogleSearchPageLocators;

public class GoogleHomePageAction {
	//my project
	GoogleSearchPageLocators googleSearchPageLocators;
	
	public GoogleHomePageAction() {
		googleSearchPageLocators=new GoogleSearchPageLocators();
		PageFactory.initElements(SetupDrivers.driver, googleSearchPageLocators);	
	}
	
	public void launchGoogleHomepage() throws Exception{
		
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.google.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	public void searchByKeyword(String Keyword)throws Exception {
		Thread.sleep(5000);
		googleSearchPageLocators.txtBxSearch.sendKeys(Keyword);
		googleSearchPageLocators.btnSearch.sendKeys(Keys.ENTER);		
	}
		
	public void signIn() {
		googleSearchPageLocators.btnSignIn.click();
	}
	
	/*public void validation() {
		SetupDrivers.driver.getTitle();
		String getTile=SetupDrivers.driver.getTitle();
		System.out.println("Page Title is :"+getTile);
		if (SetupDrivers.driver.getTitle().equalsIgnoreCase("Car - Google Search")) {
			
			System.out.println("Test Validation Done ");
		}else
			System.out.println("Test Validation NotDone ");	
		
}*/

}
