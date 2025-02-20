package com.stepDefs;

import java.awt.AWTException;
import java.util.Map;

import org.testng.Assert;

import com.pages.HomePage;
import com.utilities.SwipeUtils;

import io.cucumber.datatable.DataTable;
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
		// new SwipeUtils().swipeByCoordinates(229, 2306, 538, 2306);
		new SwipeUtils().swipeByPercentage(0.21, 0.96, 0.60, 0.96);
	}

	@Then("the video should move to a later timestamp")
	public void the_video_should_fast_forward() throws InterruptedException {
		new SwipeUtils().validateSwipeWithScreenshot();
	}

	@When("the user drags the line on bottom of the video to left side")
	public void the_user_drags_the_line_on_bottom_of_the_video_to_left_side() {
		// new SwipeUtils().swipeByCoordinates(538, 2306, 229, 2306);
		new SwipeUtils().swipeByPercentage(0.60, 0.96, 0.21, 0.96);
	}

	@Then("the video should move to a earlier timestamp")
	public void the_video_should_move_to_a_earlier_timestamp() throws InterruptedException {
		new SwipeUtils().validateSwipeWithScreenshot();
	}

	@And("click on back button")
	public void click_on_back_button() {

		new SwipeUtils().tapAction(0.50, 0.50);
		System.out.println("******************TAP ACTION DONE**********************");
		new HomePage().clickbackBtn();
	}

	@Then("the following icons should be present on the title bar:")
	public void the_following_icons_should_be_present_on_the_title_bar(io.cucumber.datatable.DataTable dataTable) {
		new HomePage().validateIconsOnTheTitleBar(dataTable);

	}

	@Then("the following preferences option should be present on clicking settings icon")
	public void the_following_preferences_option_should_be_present_on_clicking_settings_icon(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
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
		new HomePage().clickbackBtn();
	}

	@Then("the video should not play when I click the {string} button")
	public void the_video_should_not_play_when_i_click_the_button(String cancel) {
		new HomePage().validateCancelOption();

	}

	@Then("the following tabs should be displayed on the top bar:")
	public void the_following_tabs_should_be_displayed_on_the_top_bar(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		new HomePage().validateTabs(dataTable);
	}

	@When("I click on the more options for a video")
	public void i_click_on_the_more_option_for_a_video() {
		new HomePage().clickVideoMoreOptions();
	}

	@When("I select the {string} option")
	public void i_select_the_option(String option) throws InterruptedException {
		if (option.equals("Bookmark")) {
			new HomePage().selectOption(option);
		}
		if (option.equals("Download")) {
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

	@Then("I can see the videos removed from {string} tab")
	public void i_can_see_the_videos_removed_from_watched_bookmarks_and_downloads(String tab)
			throws InterruptedException {
		new HomePage().validateVideoNotDisplayedInTab(tab);
	}

	@Then("the following options should be present on clicking preferences")
	public void the_following_options_should_be_present_on_clicking_preferences(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		new HomePage().clickPreferences();
		new HomePage().validatePreferencesOption(dataTable);
		new HomePage().clickbackBtn();
	}

	@When("I search for a video {string} in search bar")
	public void i_search_for_a_video_in_search_bar(String text) throws InterruptedException {
		new HomePage().searchClicks(text);
	}

	@Then("I should see the video {string} in search results")
	public void i_should_see_the_video_in_search_results(String text) {
		new HomePage().validatesearchedVideo(text);
		new HomePage().clickbackBtn();
	}

	@Then("the following options need to be present on the video settings")
	public void the_following_options_need_to_be_present_on_the_video_settings(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		new HomePage().clickVideoMoreOptions();
		new HomePage().validateMoreOptions(dataTable);
	}

	@When("I click on the channel name and the subscribe button")
	public void i_click_on_the_channel_name_and_the_subscribe_button() {
		new HomePage().clickChannelOptions_Subscribe();
	}

	@And("I click on the menu button")
	public void i_click_on_the_menu_button() {
		new HomePage().clickMenuOptions();
	}

	@Then("I should see the subscribed video on the subscription panel")
	public void i_should_see_the_subscribed_video_on_the_subscription_panel() {
		new HomePage().validateSubscribedVideo();
		new SwipeUtils().tapAction(0.75, 0.75);
	}

	@And("I click on more options to subscribe")
	public void i_click_on_more_options_to_subscribe() {
		new HomePage().clickSubscribeOptions();
		new HomePage().clickbackBtn();
	}

	@When("I click Menu icon and search for subscribed channel name {string}")
	public void i_click_menu_icon_and_search_for_subscribed_channel_name(String text) throws InterruptedException {
		new HomePage().clickMenuOptions();
		new HomePage().searchChannel(text);
	}

	@Then("I should see the vides related to the channel name {string} in search results")
	public void i_should_see_the_vides_related_to_the_channel_name_in_search_results(String text) {
		new HomePage().validateSubscribedChannel(text);
		new HomePage().clickbackBtn();
	}

	@When("I click on channel options in the video")
	public void i_click_on_channel_options_in_the_video() {
		new HomePage().clickChannelOptions();
	}

	@Then("I should see the following options")
	public void i_should_see_the_following_options(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		new HomePage().validateMoreOptions(dataTable);
	}

	@When("I click on view thumbnail option")
	public void i_click_on_view_thumbnail_option() {
		new HomePage().clickViewthumbnailOption();
	}

	@Then("I should see the thumbnail image and download image on the bottom")
	public void i_should_see_the_thumbnail_image_and_download_image_on_the_bottom() {
		new HomePage().validateThumbnailImage();
		new SwipeUtils().tapAction(0.50, 0.50);
	}

	@When("I click on the channel name and the block button")
	public void i_click_on_the_channel_name_and_the_block_button() {
		new HomePage().clickBlockChannelOptions();
		new SwipeUtils().swipeByPercentage(0.5, 0.2, 0.5, 0.8);
	}

	@Then("I should see a notification confirming the channel is blocked")
	public void i_should_see_a_notification_confirming_the_channel_is_blocked() {
		new HomePage().validateBlockedVideo();
		new HomePage().clickCancelBlockVideo();
	}

	@Then("I should see the following channel details displayed:")
	public void validateChannelDetails(DataTable dataTable) {
		Map<String, String> expectedDetails = dataTable.asMap(String.class, String.class);
		new HomePage().validateChannelDetails(expectedDetails);
	}

}
