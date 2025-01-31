package com.stepDefs;

import org.testng.Assert;

import com.pages.HomePage;
import com.utilities.SwipeUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {


	@Then("user should validate home page title")
	public void i_should_validate_home_page_title() {
		Assert.assertTrue(new HomePage().validateHomePageHeading(), "Heading not displayed");
	}

	@When("the user drags the line on bottom of the video to right side")
	public void user_drags_the_line_on_bottom_of_the_video_to_right_side() throws InterruptedException {
		new HomePage().clickVideo();
		//new SwipeUtils().swipeByCoordinates(229, 2306, 538, 2306);
		new SwipeUtils().swipeByPercentage(0.21, 0.96, 0.75, 0.96);
	}

	@Then("the video should move to a later timestamp")
	public void the_video_should_fast_forward() throws InterruptedException {
		new SwipeUtils().validateSwipeWithScreenshot();
	}

	@When("the user drags the line on bottom of the video to left side")
	public void the_user_drags_the_line_on_bottom_of_the_video_to_left_side() {
		//new SwipeUtils().swipeByCoordinates(538, 2306, 229, 2306);
		new SwipeUtils().swipeByPercentage(0.75, 0.96, 0.21, 0.96);
	}

	@Then("the video should move to a earlier timestamp")
	public void the_video_should_move_to_a_earlier_timestamp() throws InterruptedException {
		new SwipeUtils().validateSwipeWithScreenshot();
	}
	
	@And("click on back button")
	public void click_on_back_button() {
		 new HomePage().clickbackBtn();
	}
	
	@Then("the following icons should be present on the title bar:")
	public void the_following_icons_should_be_present_on_the_title_bar(io.cucumber.datatable.DataTable dataTable) {
	  new HomePage().validateIconsOnTheTitleBar(dataTable);
		
	}
	
	
	@Then("the following preferences option should be present on clicking settings icon")
	public void the_following_preferences_option_should_be_present_on_clicking_settings_icon(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    new HomePage().validateMoreOptionsMenu(dataTable);
	}
	
	@When("I click on the {string} option")
	public void i_click_on_the_option(String enterVideoUrl) {
	  new HomePage().clickEnterVideoUrl();
	}
	@When("I enter a valid video URL")
	public void i_enter_a_valid_video_url() {
	    new HomePage().enterUrl();
	}
	@Then("I should see the video playing when I click the {string} button")
	public void i_should_see_the_video_playing_when_i_click_the_button(String play) throws InterruptedException {
	   new HomePage().validatePlayVideo();
	}
	@Then("the video should not play when I click the {string} button")
	public void the_video_should_not_play_when_i_click_the_button(String cancel) {
		new HomePage().clickbackBtn();
		new HomePage().validateCancelOption();
		
	}
	
	@Then("the following tabs should be displayed on the top bar:")
	public void the_following_tabs_should_be_displayed_on_the_top_bar(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	  new HomePage().validateTabs(dataTable);
	}

	
	@When("I click on the more options for a video")
	public void i_click_on_the_more_option_for_a_video() {
	   new HomePage().clickVideoMoreOptions();
	}
	@When("I select the {string} option")
	public void i_select_the_option(String option) throws InterruptedException {
		if(option.equals("Bookmark")) {
		new HomePage().selectOption(option);
		}
		if(option.equals("Download")) {
			new HomePage().selectDownloadBtn();
		}
	}
	@Then("the video should appear in the {string} tab")
	public void the_video_should_appear_in_the_tab(String tab) throws InterruptedException {
		new HomePage().validateVideoInTab(tab);
	}
	
	
	@When("I click on watched video cleaner option")
	public void i_click_on_watched_video_cleaner_option() {
	  new HomePage().clickWatchedVideoUrl();
	}
	@When("I click on clean button")
	public void i_click_on_clean_button() {
	   new HomePage().clickCleanBtn();
	}
	@Then("I can see the videos removed from watched bookmarks and downloads")
	public void i_can_see_the_videos_removed_from_watched_bookmarks_and_downloads() {
	  
	}
	
	@Then("the following options should be present on clicking preferences")
	public void the_following_options_should_be_present_on_clicking_preferences(io.cucumber.datatable.DataTable dataTable) {
	 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
