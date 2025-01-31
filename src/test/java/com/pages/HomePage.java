package com.pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.datatable.DataTable;

public class HomePage extends BaseClassAppium {

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
	private WebElement allowBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button2\"]")
	private WebElement laterBtn;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"SkyTube Extra\")")
	private WebElement heading;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"free.rm.skytube.extra:id/thumbnail_image_view\"])[1]")
	private WebElement firstVideo;

	@AndroidFindBy(id = "free.rm.skytube.extra:id/nextButton")
	private WebElement nextBtn;

	@AndroidFindBy(id = "free.rm.skytube.extra:id/md_buttonDefaultPositive")
	private WebElement playVideo;

	@AndroidFindBy(xpath = "//com.github.skytubeteam.slidingdrawer.SlidingDrawer[@resource-id=\"free.rm.skytube.extra:id/des_drawer\"]")
	private WebElement slidingBar;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	private WebElement backBtn;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"free.rm.skytube.extra:id/exo_content_frame\"]/android.view.View[1]")
	private WebElement videoClick;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
	private WebElement moreOptions;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='free.rm.skytube.extra:id/content'])[1]")
	private WebElement enterVideoUrl;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"free.rm.skytube.extra:id/dialog_url_edittext\"]")
	private WebElement enterUrl;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
	private WebElement playBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button2\"]")
	private WebElement cancelBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Pause\"]")
	private WebElement pauseBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/exo_position\"]")
	private WebElement videoTiming;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[@resource-id=\"free.rm.skytube.extra:id/options_button\"])[1]")
	private WebElement videoMoreOptions;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/md_buttonDefaultPositive\"]")
	private WebElement downloadBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/title' and @text='Download']")
	private WebElement downloadOption;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='free.rm.skytube.extra:id/content'])[1]")
	private WebElement watchedVideoOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/md_buttonDefaultPositive\"]")
	private WebElement cleanBtn;
	
	@AndroidFindBy(xpath="//android.widget.Toast[@text=\"We have removed 0 video(s) from the bookmarks, and deleted 0 MB of downloaded videos.\"]")
	private WebElement toastMsg;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void welcomePage() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(allowBtn));
		allowBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(laterBtn));
		laterBtn.click();
	}

	public boolean validateHomePageHeading() {
		return heading.isDisplayed();
	}

	public void clickVideo() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(firstVideo));
			firstVideo.click();
			while (true) {
				try {
					wait.until(ExpectedConditions.visibilityOf(nextBtn));
					if (nextBtn.isDisplayed()) {
						nextBtn.click();
					}
				} catch (Exception e) {
					System.out.println("No more next buttons are found");
					break;
				}
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(playVideo));
				if (playVideo.isDisplayed()) {
					playVideo.click();
					System.out.println("Clicked on Play button.");
				}
			} catch (Exception e) {
				System.out.println("Play button not found");
			}

		} catch (Exception e) {
			System.out.println("Error in clicking the video: " + e.getMessage());
		}
	}

	public void clickbackBtn() {
		wait.until(ExpectedConditions.visibilityOf(videoClick));
		videoClick.click();
		wait.until(ExpectedConditions.visibilityOf(backBtn));
		backBtn.click();
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
				Thread.sleep(3000);

				WebElement opt = driver.findElement(By.xpath(xpath));

				Thread.sleep(5000);

				Assert.assertTrue(opt.isDisplayed(), "Option '" + expectedOptions.get(i - 1) + "' is not displayed");

			} catch (NoSuchElementException e) {
				Assert.fail("Option '" + expectedOptions.get(i - 1) + "' not found.");
			}
		}
	}

	public void clickEnterVideoUrl() {
		wait.until(ExpectedConditions.visibilityOf(enterVideoUrl));
		enterVideoUrl.click();
	}

	public void enterUrl() {
		wait.until(ExpectedConditions.visibilityOf(enterUrl));
		enterUrl.clear();
		enterUrl.sendKeys("https://youtu.be/RxvPTgHwGiY");
	}

	public void validatePlayVideo() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(playBtn));
		playBtn.click();
		try {
			wait.until(ExpectedConditions.visibilityOf(playVideo));
			if (playVideo.isDisplayed()) {
				playVideo.click();
				System.out.println("Clicked on Play button.");
			}
		} catch (Exception e) {
			System.out.println("Play button not found");
		}
		wait.until(ExpectedConditions.visibilityOf(pauseBtn));
		Assert.assertTrue(pauseBtn.isDisplayed(), "Video is playing");
		Thread.sleep(3000);
		Assert.assertNotEquals(videoTiming, "00:00", "Video did not start playing.");

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
				WebElement tabsDisplayed = driver.findElement(By.xpath(xPath));
				Thread.sleep(5000);
				Assert.assertTrue(tabsDisplayed.isDisplayed(), "Tab " + tab + " is displayed");

			} catch (NoSuchElementException e) {
				Assert.fail("Tab " + tab + " is not displayed");
			}
		}

	}

	public void clickVideoMoreOptions() {
		wait.until(ExpectedConditions.visibilityOf(videoMoreOptions));
		videoMoreOptions.click();
	}

	public void selectOption(String option) {

		WebElement selectedOption = driver.findElement(By.xpath(
				"//android.widget.TextView[@resource-id='free.rm.skytube.extra:id/title' and @text='" + option + "']"));
		System.out.println("Option is...." + selectedOption);
		wait.until(ExpectedConditions.visibilityOf(selectedOption));
		selectedOption.click();

	}

	public void selectDownloadBtn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(downloadOption));
		downloadOption.click();
		wait.until(ExpectedConditions.visibilityOf(downloadBtn));
		downloadBtn.click();
		Thread.sleep(5000);
	}

	public void validateVideoInTab(String tab) throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(allowBtn));
			allowBtn.click();
		} catch (Exception e) {
			System.out.println("Allow button is not found" + e.getMessage());
		}
		Thread.sleep(5000);
		WebElement tabElement = driver.findElement(By.xpath("//android.widget.TextView[@text='" + tab + "']"));
		wait.until(ExpectedConditions.visibilityOf(tabElement));
		tabElement.click();

		WebElement videoInTab = driver.findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"free.rm.skytube.extra:id/title_text_view\"]"));
		Assert.assertTrue(videoInTab.isDisplayed(), "Video is not present in the " + tab + " tab");
	}
	
	
	public void clickWatchedVideoUrl() {
		wait.until(ExpectedConditions.visibilityOf(watchedVideoOption));
		watchedVideoOption.click();
	}
	
	public void clickCleanBtn() {
		wait.until(ExpectedConditions.visibilityOf(cleanBtn));
		cleanBtn.click();
		wait.until(ExpectedConditions.visibilityOf(toastMsg));
			Assert.assertTrue(toastMsg.isDisplayed(),"Notifications did not come...");
		
	}

}
