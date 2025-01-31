package com.stepDefs;





import com.pages.BaseClassAppium;
import com.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class Hooks {

	private final BaseClassAppium base = new BaseClassAppium();
	 private static boolean isInitialized = false;
	 private static int scenarioCounter = 0; 
	    private static int totalScenarios = 0;
	 @Before
	public void setUp(Scenario scenario) throws InterruptedException {
		  if (!isInitialized) {
	            System.out.println("Opening SkyTube application and allowing popups...");
		 base.setUp();
		new HomePage().welcomePage();
		 isInitialized = true;
		  }
	}

	@After
	public void tearDown() {
		 scenarioCounter++; 
	        if (scenarioCounter == totalScenarios) {
	            System.out.println("All scenarios completed. Closing the driver...");
	            //base.tearDown(); 
	        }
	}
}
