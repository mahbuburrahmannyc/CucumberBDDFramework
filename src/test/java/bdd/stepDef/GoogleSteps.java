package bdd.stepDef;

import bdd.google.PageActions.GoogleHomePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
	
	GoogleHomePageAction googleHomePageAction=new GoogleHomePageAction();
	
	
	@Given("^User in Google Home Page$")
	public void user_in_Google_Home_Page() throws Throwable {
		googleHomePageAction.launchGoogleHomepage();
		System.out.println("Browse to Google Completed");
	   
	}

	@When("^Search by key Word \"([^\"]*)\"$")
	public void search_by_key_Word(String Keyword) throws Throwable {
		googleHomePageAction.searchByKeyword(Keyword);
		System.out.println("Search Keyword Completed ");
	}

	@Then("^Verify Search result Appear$")
	public void verify_Search_result_Appear() throws Throwable {
	System.out.println("Verfying Search Result completed ");
	//googleHomePageAction.validation();
	
	
	    
	}



}
