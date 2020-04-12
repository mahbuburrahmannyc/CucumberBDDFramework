package bdd.com.utilities;

import cucumber.api.java.After;

public class AfterActions {
	//my project
	
@After	
public void afterAction() {
	
	SetupDrivers.tearDownDriver();
	System.out.println("==============");
	
	
}

}
