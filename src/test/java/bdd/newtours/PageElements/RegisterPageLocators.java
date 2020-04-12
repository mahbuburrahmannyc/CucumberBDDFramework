package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	// My project
	
	// WebElement First Name 
	@FindBy(xpath="//*[@name='firstName']")
	public WebElement firstName;
	
	// WebElement Last Name 
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastName;
	
	// WebElement Phone
	@FindBy (xpath="//*[@name='phone']")
	public WebElement phone;
	
	// WebElement Email 
    @FindBy(xpath="//*[@name='userName']")
    public WebElement email;
	
	// WebElement AddressField1 
	@FindBy(xpath="//*[@name='address1']")
	public WebElement addressField1;
	
	// WebElement AddressField2
	@FindBy(xpath="//*[@name='address2']")
	public WebElement addressField2;
	
	//  WebElement City 
	@FindBy(xpath="//*[@name='city']")
	public WebElement city;
	
	//WebElement State 
	@FindBy(xpath="//*[@name='state']")
	public WebElement state;
	
	// WebElement Postal 
	@FindBy(xpath="//*[@name='postalCode']")
	public WebElement postalCode;
	
	// WebElement Country 
	@FindBy(xpath="//select[@name='country']")
	public WebElement country;
	
	//WebElement User Name 
	@FindBy(xpath="//*[@id='email']")
	public WebElement userName;
	
	// WebElement Password
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	// WebElement Confirm Password
	@FindBy (xpath="//*[@name='confirmPassword']")
	public WebElement confirmPassword;
	
	// WebElement Submit Button
	@FindBy(xpath="//input[@src='/images/forms/submit.gif']")
	public WebElement submitButton;
	
	

}
