package com.stepDefs;



import org.testng.Assert;

import com.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {

	@Given("I open the Sky tube Application")
	public void i_open_the_sky_tube_application() {
		System.out.println("Sky tube application is opened.");
	}
	@And("I should allow pop ups")
	public void i_should_allow_pop_ups() throws InterruptedException {
		new HomePage().welcomePage();
		
	}
	@Then("I should validate home page title")
	public void i_should_validate_home_page_title() {
	   Assert.assertTrue(new HomePage().validateHeading(), "Heading not displayed");
	}
}
