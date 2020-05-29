package bdd.com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;
	
	//my project
	
	public static void setupDriver() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Disable-notification ::");
		System.out.println("Disable all notification from ChromeBrowser"+options);
		driver=new ChromeDriver(options);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void tearDownDriver() { 
		  driver.quit();
	  
	  }
	 

}
