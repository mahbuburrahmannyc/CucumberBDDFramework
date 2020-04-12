package bdd.google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPageLocators {
	
	
	// Google Search Box //*[@class='gLFyf gsfi']
	// Google Search Button (//input[@value='Google Search'])[2]
	
	// Google Search Box
	@FindBy(xpath="//*[@class='gLFyf gsfi']")
    public WebElement txtBxSearch;
	
	// Google Search Button
	@FindBy(xpath="(//*[@class='gNO89b'])[2]")
    public WebElement btnSearch;

	//SignIn Button
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
    public WebElement btnSignIn;
	

}
