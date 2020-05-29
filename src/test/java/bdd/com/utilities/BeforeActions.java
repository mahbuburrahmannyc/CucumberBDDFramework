package bdd.com.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	//my project
	
	
    @Before	
	public void beforeAction(Scenario scen) {// Import Cucumber Scenario api
		System.out.println(">> Initializing chrome driver");
		SetupDrivers.setupDriver();
		System.out.println(">> Initialized chrome driver Successfully");
		System.out.println(scen.getName());// Print Scenario
		
		
	}
	

}
