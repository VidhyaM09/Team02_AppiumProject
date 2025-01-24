package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BaseClassAppium {

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
	private WebElement allowBtn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button3\"]")
	private WebElement okayBtn;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"SkyTube Extra\")")
	private WebElement heading;
	
	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void welcomePage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(allowBtn));
		allowBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(okayBtn));
		okayBtn.click();
	}
	
	public boolean validateHeading() {
		return heading.isDisplayed();
	}
}
