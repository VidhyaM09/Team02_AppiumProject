
package com.stepDefs;

import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VideosettingSteps {

	@Given("User clicks the skytube app and home page appears")
	public void user_clicks_the_skytube_app_and_home_page_appears() throws InterruptedException {
	    new HomePage().welcomePage();
	}
	@Given("User is on home page of skytube app")
	public void user_is_on_home_page_of_skytube_app() {
	  
	}
	@When("User clicks more options menu in any video")
	public void user_clicks_more_options_menu_in_any_video() {
		new HomePage().clickVideoMoreOptions();
	}

	@When("Clicks on Open with")
	public void clicks_on_open_with() {
	    
	}

	@Then("video should directly open in a you tube app.")
	public void video_should_directly_open_in_a_you_tube_app() {
	    
	}

	@When("clicks share via to send through gmail")
	public void clicks_share_via_to_send_through_gmail() {
	  
	}

	@Then("User should be redirected to gmail loginpage")
	public void user_should_be_redirected_to_gmail_loginpage() {
	   
	}

	@When("Copies the URL and pastes it into the search field by long press , then presses Enter")
	public void copies_the_url_and_pastes_it_into_the_search_field_by_long_press_then_presses_enter() {
	   
	}

	@Then("User finds the related video in the results .")
	public void user_finds_the_related_video_in_the_results() {
	   
	}

	@When("Clicks bookmark option")
	public void clicks_bookmark_option() {
	  
	}

	@Then("a prompt should appear showing “Bookmarked”  and in the bookmarks toolbar video should present.")
	public void a_prompt_should_appear_showing_bookmarked_and_in_the_bookmarks_toolbar_video_should_present() {
	   
	}

	@When("Clicks download ,if done for the first time after app is installed")
	public void clicks_download_if_done_for_the_first_time_after_app_is_installed() {
	    
	}

	@Then("A dialogue box appears “ Allow skytube to  acess files ,audio,videos from your system “")
	public void a_dialogue_box_appears_allow_skytube_to_acess_files_audio_videos_from_your_system() {
	   
	}

	@Then("Click ok")
	public void click_ok() {
	
	}

	@Then("Downloaded videos should be in the Downloads toolbar.")
	public void downloaded_videos_should_be_in_the_downloads_toolbar() {


	}

	@When("Clicks Channel ,choose subscribe from drop down")
	public void clicks_channel_choose_subscribe_from_drop_down() {


	}

	@Then("a prompt should appear saying “subscribed”.")
	public void a_prompt_should_appear_saying_subscribed() {


	}

	@When(": Clicks Channel,choose block channel from drop down")
	public void clicks_channel_choose_block_channel_from_drop_down() {
	    
	}

	@Then(": a prompt should appear saying “Refresh to use the new channel blacklist ”")
	public void a_prompt_should_appear_saying_refresh_to_use_the_new_channel_blacklist() {
	   
	}

	@When("Clicks on “Blocked video” icon on top right")
	public void clicks_on_blocked_video_icon_on_top_right() {
	    
	}

	@When("chooses the video to unblock from the list and clicks setup button")
	public void chooses_the_video_to_unblock_from_the_list_and_clicks_setup_button() {
	   
	}

	@When("deselects the video blocker option,comes to home page")
	public void deselects_the_video_blocker_option_comes_to_home_page() {
	   
	}

	@Then("blocked video  icon should be  refreshed to check whether video is unblocked or not.")
	public void blocked_video_icon_should_be_refreshed_to_check_whether_video_is_unblocked_or_not() {
	 
	}

	@When("Clicks Channel ,choose permit  from drop down")
	public void clicks_channel_choose_permit_from_drop_down() {
	   
	}

	@Then("a prompt should appear saying “Could not remove the given channel from deny list”")
	public void a_prompt_should_appear_saying_could_not_remove_the_given_channel_from_deny_list() {
	  
	}

	@When("Clicks view thumbnail")
	public void clicks_view_thumbnail() {
	    
	}

	@Then("a reduced size version of the same video should appear.")
	public void a_reduced_size_version_of_the_same_video_should_appear() {
	    
	}

	@When("User plays any video ,clicks pause button")
	public void user_plays_any_video_clicks_pause_button() {
	  
	}

	@When("goes to home page")
	public void goes_to_home_page() {
	  // new HomePage().validateHomePageHeading();
	}

	@When("Clicks the same video on the home page.")
	public void clicks_the_same_video_on_the_home_page() {
	    
	}

	@Then("A dialogue box should appear  with No and Resume options saying “Continue from where you stopped “  .")
	public void a_dialogue_box_should_appear_with_no_and_resume_options_saying_continue_from_where_you_stopped() {
	    
	}

}

