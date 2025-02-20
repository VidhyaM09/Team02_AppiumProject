package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CommonWebElement extends BaseClassAppium{

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"free.rm.skytube.extra:id/thumbnail_image_view\"])[1]")
	private WebElement firstVideo;
	
	@AndroidFindBy(id="free.rm.skytube.extra:id/skipButton")
	private WebElement skipButton;
	
	WebDriverWait wait;
	
	public CommonWebElement() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	public void clickFirstVideo()
	{
		wait.until(ExpectedConditions.elementToBeClickable(firstVideo));
		firstVideo.click();
	}
	public void skipButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(skipButton));
		skipButton.click();
	}
	
	
}
