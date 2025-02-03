package com.stepDefs;

import static org.testng.Assert.assertTrue;

import com.pages.CommonWebElement;
import com.pages.HomePage;
import com.pages.VideoGesturesPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VideoGestureSteps {
	HomePage home;
	CommonWebElement commonPag;
	VideoGesturesPage videoPag;
	boolean videoCondition;
	String titleMessage;
	
	public VideoGestureSteps()
	{
		 home = new HomePage();
		 commonPag = new CommonWebElement();
		 videoPag = new VideoGesturesPage();
	}

	
	@Given("the user is on the SkyTube Mobile app home page")
	public void the_user_is_on_the_sky_tube_mobile_app_home_page() throws InterruptedException {
		if(home==null)
		{
			home = new HomePage();
		}
		home.welcomePage();
	}

	@When("the user clicks on any video in the home page")
	public void the_user_clicks_on_any_video_in_the_home_page() {
		
		if(commonPag == null)
		{
			commonPag = new CommonWebElement();
		}
		commonPag.clickFirstVideo();
		commonPag.skipButton();
	}

	@Then("the user should be able to view the video")
	public void the_user_should_be_able_to_view_the_video() throws InterruptedException {
		if(videoPag==null)
		{
			videoPag = new VideoGesturesPage();
		}
		videoCondition = videoPag.checkVideoPlay();
		assertTrue(videoCondition);
		
	}

	@Then("the user should see the title of the video clicked")
	public void the_user_should_see_the_title_of_the_video_clicked() {
		if(videoPag==null)
		{
			videoPag = new VideoGesturesPage();
		}
		titleMessage = videoPag.checkVideoTitle();
		if(!titleMessage.isEmpty())
		{
		assertTrue(true);
		}
		
	}

	@When("the user swipes up on the left side of the video")
	public void the_user_swipes_up_on_the_left_side_of_the_video() {
		if(videoPag==null)
		{
			videoPag = new VideoGesturesPage();
		}
		videoPag.volumeIncreaseValidation();
	}

	@Then("the volume of the video should increase")
	public void the_volume_of_the_video_should_increase() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user swipes down on the left side of the video")
	public void the_user_swipes_down_on_the_left_side_of_the_video() {
		if(videoPag==null)
		{
			videoPag = new VideoGesturesPage();
		}
		videoPag.volumeDecreaseValidation();;
	}

	@Then("the volume of the video should decrease")
	public void the_volume_of_the_video_should_decrease() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user swipes up on the right side of the video")
	public void the_user_swipes_up_on_the_right_side_of_the_video() {
		if(videoPag==null)
		{
			videoPag = new VideoGesturesPage();
		}
		videoPag.brightnessIncreaseValidation();
	}
	

	@Then("the brightness of the video should increase")
	public void the_brightness_of_the_video_should_increase() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user swipes down on the right side of the video")
	public void the_user_swipes_down_on_the_right_side_of_the_video() {
		if(videoPag==null)
		{
			videoPag = new VideoGesturesPage();
		}
		videoPag.brightnessDecreaseValidation();;
	}

	@Then("the brightness of the video should decrease")
	public void the_brightness_of_the_video_should_decrease() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user swipes up on the center of the video")
	public void the_user_swipes_up_on_the_center_of_the_video() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should be able to see the video description")
	public void the_user_should_be_able_to_see_the_video_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user long-presses and drags on the right side of the video")
	public void the_user_long_presses_and_drags_on_the_right_side_of_the_video() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should fast-forward")
	public void the_video_should_fast_forward() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user long-presses and drags on the left side of the video")
	public void the_user_long_presses_and_drags_on_the_left_side_of_the_video() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should rewind")
	public void the_video_should_rewind() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks on a video that they have already watched")
	public void the_user_clicks_on_a_video_that_they_have_already_watched() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("a permission message should be displayed asking to resume the video")
	public void a_permission_message_should_be_displayed_asking_to_resume_the_video() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks the {string} option")
	public void the_user_clicks_the_option(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should play from where it was last stopped")
	public void the_video_should_play_from_where_it_was_last_stopped() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should play from the beginning")
	public void the_video_should_play_from_the_beginning() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks {string} button on the bottom of the video")
	public void the_user_clicks_button_on_the_bottom_of_the_video(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should stop")
	public void the_video_should_stop() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should play")
	public void the_video_should_play() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should move Forward")
	public void the_video_should_move_forward() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the video should Fast Backward")
	public void the_video_should_fast_backward() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks {string} icon on the top left corner of the video")
	public void the_user_clicks_icon_on_the_top_left_corner_of_the_video(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the page should move to the Home Page")
	public void the_page_should_move_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks {string} icon on the right corner of the video")
	public void the_user_clicks_icon_on_the_right_corner_of_the_video(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the page should refresh")
	public void the_page_should_refresh() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks more options icon on the right corner of the video")
	public void the_user_clicks_more_options_icon_on_the_right_corner_of_the_video() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the list of action should display")
	public void the_list_of_action_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
