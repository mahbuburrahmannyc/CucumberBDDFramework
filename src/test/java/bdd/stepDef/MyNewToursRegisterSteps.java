package bdd.stepDef;



import bdd.newtours.PageActions.NewToursHomePageAction;
import bdd.newtours.PageActions.RegisterConfrPageAction;
import bdd.newtours.PageActions.RegisterPageAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyNewToursRegisterSteps {
	//My Project
	
	NewToursHomePageAction homePageActionObj =new NewToursHomePageAction();
	RegisterPageAction newToursRegisterPageActionObj= new RegisterPageAction();
	RegisterConfrPageAction newRegisterConfrPageActionObj=new RegisterConfrPageAction();
	

	
	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		
		homePageActionObj.openNewToursHomePage();
	    
	}

	@When("^Navigate to register page$")
	public void navigate_to_register_page() throws Throwable {
		
		homePageActionObj.navigateToRegisterPage();
	
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newToursRegisterPageActionObj.basicContactinfor();
		newToursRegisterPageActionObj.basicMailingInfo();
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String arg1) throws Throwable {
		newToursRegisterPageActionObj.fillUpUserInformation(arg1);
		newToursRegisterPageActionObj.submitForm();
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		newRegisterConfrPageActionObj.verifyThankYouRegister();
	   
	}



}
