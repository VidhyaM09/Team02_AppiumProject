package com.pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.datatable.DataTable;

public class HomePage extends BaseClassAppium {

	CommonWebElement common = new CommonWebElement();

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")
	private WebElement allowBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button3\"]")
	private WebElement okBtn;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"SkyTube Extra\")")
	private WebElement heading;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"free.rm.skytube.extra:id/thumbnail_image_view\"])[1]")
	private WebElement firstVideo;

	@AndroidFindBy(id = "free.rm.skytube.extra:id/nextButton")
	private WebElement nextBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/md_buttonDefaultPositive']")
	private WebElement playVideo;

	@AndroidFindBy(xpath = "//com.github.skytubeteam.slidingdrawer.SlidingDrawer[@resource-id=\"free.rm.skytube.extra:id/des_drawer\"]")
	private WebElement slidingBar;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	private WebElement backBtn;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"free.rm.skytube.extra:id/exo_content_frame\"]")
	private WebElement videoClick;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
	private WebElement moreOptions;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/title' and @text='Enter Video URL']")
	private WebElement enterVideoUrl;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"free.rm.skytube.extra:id/dialog_url_edittext\"]")
	private WebElement enterUrl;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
	private WebElement playBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button2\"]")
	private WebElement cancelBtn;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@class='android.widget.ImageButton'])[3]")
	private WebElement pauseBtn;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"free.rm.skytube.extra:id/exo_position\")")
	private WebElement videoTiming;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@resource-id=\"free.rm.skytube.extra:id/options_button\"])[1]")
	private WebElement videoMoreOptions;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/md_buttonDefaultPositive\"]")
	private WebElement downloadBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/title' and @text='Download']")
	private WebElement downloadOption;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Watched Video Cleaner\")")
	private WebElement watchedVideoOption;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Preferences\")")
	private WebElement preferencesOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/md_buttonDefaultPositive\"]")
	private WebElement cleanBtn;

	@AndroidFindBy(xpath = "//android.widget.Toast[@text=\"We have removed 0 video(s) from the bookmarks, and deleted 0 MB of downloaded videos.\"]")
	private WebElement toastMsg;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"TRENDING (US)\"]")
	private WebElement trendingTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Search Videos\"]")
	private WebElement searchVideosBtn;

	@AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id=\"free.rm.skytube.extra:id/search_src_text\"]")
	private WebElement searchVideosText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title_text_view\" and @text=\"Numpy Ninja\"]")
	private WebElement searchvalidation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title\" and @text=\"Channel...\"]")
	private WebElement channelOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title\" and @text=\"Subscribe\"]")
	private WebElement subscribeOption;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"SkyTube Extra\"]")
	private WebElement menuButn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/sub_channel_name_text_view\"]")
	private WebElement subscribedvideo;

	@AndroidFindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id=\"free.rm.skytube.extra:id/search_src_text\"]")
	private WebElement searchChannel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/sub_channel_name_text_view\"]")
	private WebElement channelName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ABC News\"]")
	private WebElement channelSubscribed;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title\" and @text=\"View Thumbnail\"]")
	private WebElement viewthumbnail;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id=\"free.rm.skytube.extra:id/fab\"]")
	private WebElement downloadImagebtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"free.rm.skytube.extra:id/thumbnail_image_view\"]")
	private WebElement thumbnailImageView;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title\" and @text=\"Block Channel\"]")
	private WebElement blockChannel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/menu_badge\"]")
	private WebElement blocknotification;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/md_title\"]")
	private WebElement blocknotificationHeading;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/md_buttonDefaultNegative\"]")
	private WebElement blockCancelBtn;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void welcomePage() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(allowBtn));
			allowBtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(okBtn));
			okBtn.click();
		} catch (Exception e) {
			Assert.fail("No options were dispalyed ");
		}
	}

	public boolean validateHomePageHeading() {
		return heading.isDisplayed();
	}

	public void clickVideo() {

		try {
			common.clickFirstVideo();
			common.skipButton();
			wait.until(ExpectedConditions.visibilityOf(playVideo));
			playVideo.click();
			System.out.println("Clicked on Play button.");

		} catch (Exception e) {
			System.out.println("Play button not found");
		}

	}

	public void clickbackBtn() {
		try {

			try {
				wait.until(ExpectedConditions.visibilityOf(videoClick));
				videoClick.click();
			} catch (TimeoutException e) {
				System.out.println("videoClick not found, proceeding to back button.");
			}

			wait.until(ExpectedConditions.visibilityOf(backBtn));
			if (backBtn != null && backBtn.isDisplayed()) {
				backBtn.click();
			} else {
				Assert.fail("Back button is not visible or enabled");
			}
		} catch (Exception e) {
			Assert.fail("An error occurred while clicking the back button: " + e.getMessage());
		}
	}

	public void validateIconsOnTheTitleBar(DataTable dataTable) {

		List<String> expectedIcons = dataTable.asList();

		Map<String, String> iconsPath = new HashMap<>();
		iconsPath.put("Menu Icon", "//android.widget.ImageButton[@content-desc='SkyTube Extra']");
		iconsPath.put("Search Icon", "//android.widget.Button[@content-desc='Search Videos']");
		iconsPath.put("Video Blocker Icon",
				"//android.widget.ImageView[@resource-id='free.rm.skytube.extra:id/menu_badge_icon']");
		iconsPath.put("More Options Icon", "//android.widget.ImageView[@content-desc='More options']");

		for (String icon : expectedIcons) {
			String iconXpath = iconsPath.get(icon);
			if (iconXpath == null) {
				Assert.fail("No xpath matches the icons" + icon);
			}

			WebElement iconElement = driver.findElement(By.xpath(iconXpath));
			Assert.assertTrue(iconElement.isDisplayed(), "Icon not found or not visible: " + icon);
		}

	}

	public void validateMoreOptionsMenu(DataTable dataTable) throws InterruptedException {

		List<String> expectedOptions = dataTable.asList();

		wait.until(ExpectedConditions.visibilityOf(moreOptions));
		moreOptions.click();

		for (int i = 1; i <= expectedOptions.size(); i++) {
			String xpath = String
					.format("(//android.widget.LinearLayout[@resource-id='free.rm.skytube.extra:id/content'])[%d]", i);

			try {
				Thread.sleep(1000);

				WebElement opt = driver.findElement(By.xpath(xpath));

				Assert.assertTrue(opt.isDisplayed(), "Option '" + expectedOptions.get(i - 1) + "' is not displayed");

			} catch (NoSuchElementException e) {
				Assert.fail("Option '" + expectedOptions.get(i - 1) + "' not found.");
			}
		}
	}

	public void clickEnterVideoUrl() {
		try {
			wait.until(ExpectedConditions.visibilityOf(enterVideoUrl));
			enterVideoUrl.click();
		} catch (Exception e) {
			Assert.fail("Enter the video url option not found");
		}
	}

	public void enterUrl() {
		try {
			wait.until(ExpectedConditions.visibilityOf(enterUrl));
			enterUrl.clear();
			enterUrl.sendKeys("https://youtu.be/QLoGHYbXcSY");
		} catch (Exception e) {
			Assert.fail("No option found to enter the video url");
		}
	}

	public void validatePlayVideo() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(playBtn));
		playBtn.click();
		Thread.sleep(5000);
		try {
			try {
				wait.until(ExpectedConditions.visibilityOf(playVideo));
				if (playVideo != null && playVideo.isDisplayed()) {
					playVideo.click();
					System.out.println("Clicked on Play button.");
				}
			} catch (Exception e) {
				System.out.println("Play button not found");
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(videoClick));
				videoClick.click();
			} catch (TimeoutException e) {
				System.out.println("videoClick not found, proceeding to back button.");
			}
			// wait.until(ExpectedConditions.visibilityOf(pauseBtn));
			if (!videoTiming.getText().equals("00:00")) {
				Assert.assertTrue(videoTiming.isDisplayed(), "Video is playing");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			Assert.fail("Validate play video failed: " + e.getMessage());
		}

	}

	public void validateCancelOption() {
		try {
			wait.until(ExpectedConditions.visibilityOf(moreOptions));
			moreOptions.click();
			clickEnterVideoUrl();
			enterUrl();
			wait.until(ExpectedConditions.visibilityOf(cancelBtn));
			cancelBtn.click();
			validateHomePageHeading();
		} catch (Exception e) {
			Assert.fail("No such element is found" + e.getMessage());
		}
	}

	public void validateTabs(DataTable dataTable) throws InterruptedException {
		List<String> expectedTabs = dataTable.asList();

		for (String tab : expectedTabs) {
			try {
				String xPath = String.format("//android.widget.TextView[@text='%s']", tab);
				Thread.sleep(2000);
				WebElement tabsDisplayed = driver.findElement(By.xpath(xPath));
				Thread.sleep(1000);
				Assert.assertTrue(tabsDisplayed.isDisplayed(), "Tab " + tab + " is displayed");

			} catch (NoSuchElementException e) {
				Assert.fail("Tab " + tab + " is not displayed");
			}
		}

	}

	public void clickVideoMoreOptions() {
		try {
			wait.until(ExpectedConditions.visibilityOf(videoMoreOptions));
			videoMoreOptions.click();
		} catch (NoSuchElementException e) {
			Assert.fail("video more options is not displayed");
		}
	}

	public void selectOption(String option) {
		try {
			WebElement selectedOption = driver.findElement(
					By.xpath("//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/title' and @text='"
							+ option + "']"));
			System.out.println("Option is...." + selectedOption);
			wait.until(ExpectedConditions.visibilityOf(selectedOption));
			selectedOption.click();
		} catch (NoSuchElementException e) {
			Assert.fail("No options displayed to select");
		}

	}

	public void selectDownloadBtn() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOf(downloadOption));
			downloadOption.click();
		} catch (NoSuchElementException e) {
			Assert.fail("No button is available to download");
		}
//		try {
//			wait.until(ExpectedConditions.visibilityOf(downloadBtn));
//			downloadBtn.click();
//			Thread.sleep(5000);
//		} catch (NoSuchElementException e) {
//			System.out.println("No button is available to download");
//		}
	}

	public void validateVideoInTab(String tab) throws InterruptedException {
		try {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(allowBtn)).click();
			} catch (Exception e) {
				System.out.println("Allow button not identified" + e.getMessage());
			}
			Thread.sleep(5000);
			WebElement tabElement = driver.findElement(By.xpath("//android.widget.TextView[@text='" + tab + "']"));
			wait.until(ExpectedConditions.visibilityOf(tabElement));
			tabElement.click();
			WebElement videoInTab = driver.findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title_text_view\"]"));
			Assert.assertTrue(videoInTab.isDisplayed(), "Video is not present in the " + tab + " tab");
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Validation failed: " + e.getMessage());
		}
	}

	public void validateVideoNotDisplayedInTab(String tab) throws InterruptedException {
		try {

			Thread.sleep(5000);
			WebElement tabElement = driver.findElement(By.xpath("//android.widget.TextView[@text='" + tab + "']"));
			wait.until(ExpectedConditions.visibilityOf(tabElement));
			tabElement.click();
			WebElement videoInTab = driver.findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title_text_view\"]"));
			Assert.assertTrue(!videoInTab.isDisplayed(), "Video is present in the " + tab + " tab");
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Validation failed: " + e.getMessage());
		}
	}

	public void clickWatchedVideoUrl() {
		try {
			wait.until(ExpectedConditions.visibilityOf(trendingTab));
			trendingTab.click();
			wait.until(ExpectedConditions.visibilityOf(moreOptions));
			moreOptions.click();
			wait.until(ExpectedConditions.visibilityOf(watchedVideoOption));
			watchedVideoOption.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Watched video url option is not found " + e.getMessage());
		}
	}

	public void clickPreferences() {
		try {
			wait.until(ExpectedConditions.visibilityOf(trendingTab));
			trendingTab.click();
			wait.until(ExpectedConditions.visibilityOf(moreOptions));
			moreOptions.click();
			wait.until(ExpectedConditions.visibilityOf(preferencesOption));
			preferencesOption.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Watched video url option is not found " + e.getMessage());
		}
	}

	public void validatePreferencesOption(DataTable dataTable) throws InterruptedException {
		try {

			List<String> expectedTabs = dataTable.asList();
			Thread.sleep(5000);
			for (String option : expectedTabs) {
				WebElement tabElement = driver.findElement(By.xpath(
						"//android.widget.TextView[@resource-id=\"android:id/title\" and @text='" + option + "']"));
				Assert.assertTrue(tabElement.isDisplayed(), "Preferences has not having the following" + option + "");

			}
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Validation failed: " + e.getMessage());
		}
	}

	public void clickCleanBtn() {
		try {
			wait.until(ExpectedConditions.visibilityOf(cleanBtn));
			cleanBtn.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Clean button is not found " + e.getMessage());
		}

	}

	public void searchClicks(String text) throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOf(searchVideosBtn));
			searchVideosBtn.click();

			wait.until(ExpectedConditions.visibilityOf(searchVideosText));
			searchVideosText.clear();
			Thread.sleep(500);
			searchVideosText.click();
			searchVideosText.sendKeys(text);

			Thread.sleep(500);
			Map<String, Object> params = new HashMap<>();
			params.put("action", "done");
			driver.executeScript("mobile: performEditorAction", params);

			Thread.sleep(5000);
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Search option is not found " + e.getMessage());
		}
	}

	public void searchChannel(String text) throws InterruptedException {
		try {

			wait.until(ExpectedConditions.visibilityOf(searchChannel));
			searchChannel.clear();
			Thread.sleep(500);
			searchVideosText.click();
			searchVideosText.sendKeys(text);

			Thread.sleep(500);

			wait.until(ExpectedConditions.visibilityOf(channelName));
			channelName.click();

			Thread.sleep(5000);

		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Search option is not found " + e.getMessage());
		}
	}

	public boolean validateSubscribedChannel(String text) {
		return channelSubscribed != null && channelSubscribed.isDisplayed() && channelSubscribed.getText().equals(text);
	}

	public void clickChannelOptions_Subscribe() {
		try {
			wait.until(ExpectedConditions.visibilityOf(channelOption));
			channelOption.click();
			wait.until(ExpectedConditions.visibilityOf(subscribeOption));
			subscribeOption.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Channel Options is not found " + e.getMessage());
		}

	}

	public void clickSubscribeOptions() {
		try {
			clickVideoMoreOptions();
			wait.until(ExpectedConditions.visibilityOf(subscribeOption));
			subscribeOption.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Channel Options is not found " + e.getMessage());
		}

	}

	public void clickChannelOptions() {
		try {
			clickVideoMoreOptions();
			wait.until(ExpectedConditions.visibilityOf(channelOption));
			channelOption.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Channel Options is not found " + e.getMessage());
		}

	}

	public void clickViewthumbnailOption() {
		try {
			clickVideoMoreOptions();
			wait.until(ExpectedConditions.visibilityOf(viewthumbnail));
			viewthumbnail.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Channel Options is not found " + e.getMessage());
		}

	}

	public void clickBlockChannelOptions() {
		try {
			wait.until(ExpectedConditions.visibilityOf(blockChannel));
			blockChannel.click();

		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Channel Options is not found " + e.getMessage());
		}

	}

	public boolean validateThumbnailImage() {
		return thumbnailImageView.isDisplayed() && downloadImagebtn.isDisplayed();
	}

	public void clickMenuOptions() {
		try {
			wait.until(ExpectedConditions.visibilityOf(menuButn));
			menuButn.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Menu Button is not found " + e.getMessage());
		}

	}

	public boolean validateBlockedVideo() {
		if (blocknotification != null && blocknotification.isDisplayed()) {
			blocknotification.click();
			return blocknotificationHeading.isDisplayed();
		}
		return false;

	}

	public void clickCancelBlockVideo() {
		try {
			wait.until(ExpectedConditions.visibilityOf(blockCancelBtn));
			blockCancelBtn.click();
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Block channel cancel button is not found " + e.getMessage());
		}

	}

	public boolean validateSubscribedVideo() {
		return subscribedvideo.isDisplayed();
	}

	public boolean validatesearchedVideo(String text) {
		return searchvalidation != null && searchvalidation.isDisplayed() && searchvalidation.getText().equals(text);
	}

	public void validateMoreOptions(DataTable dataTable) throws InterruptedException {
		try {

			List<String> expectedOptions = dataTable.asList();
			Thread.sleep(5000);
			for (String option : expectedOptions) {
				WebElement optionElement = driver.findElement(
						By.xpath("//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/title' and @text='"
								+ option + "']"));
				Assert.assertTrue(optionElement.isDisplayed(),
						"Video More Options has not having the following" + option + "");

			}
		} catch (TimeoutException | NoSuchElementException e) {
			Assert.fail("Validation failed: " + e.getMessage());
		}

	}

	public void validateChannelDetails(Map<String, String> expectedDetails) {

		WebElement channelName = driver.findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/channel_text_view\"]"));
		WebElement viewCountElement = driver.findElement(
				By.xpath("(//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/views_text_view\"])[2]"));
		WebElement uploadedTimeElement = driver.findElement(By.id("free.rm.skytube.extra:id/publish_date_text_view"));

		String actualChannelName = channelName.getText();
		String actualViewCount = viewCountElement.getText();
		String actualUploadedTime = uploadedTimeElement.getText();

		Assert.assertEquals(actualChannelName, expectedDetails.get("Channel Name"), "Mismatch in Channel Name");

		String viewCountPattern = "^\\d{1,3}(,\\d{3})* views$";
		Assert.assertTrue(actualViewCount.matches(viewCountPattern), "View count format mismatch: " + actualViewCount);

		String expectedUploadedTimePattern = ".*(day|hour|minute|second).*ago";
		Assert.assertTrue(actualUploadedTime.matches(expectedUploadedTimePattern), "Uploaded time format mismatch");
	}

}
