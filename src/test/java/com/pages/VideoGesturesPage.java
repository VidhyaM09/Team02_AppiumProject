package com.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.utilities.SwipeUtils;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VideoGesturesPage extends BaseClassAppium{
	
	@AndroidFindBy(id="free.rm.skytube.extra:id/exo_content_frame")
	private WebElement contentView;
	
	@AndroidFindBy(id="free.rm.skytube.extra:id/exo_subtitles")
	private WebElement subTitleContent;
	
	@AndroidFindBy(id="free.rm.skytube.extra:id/exo_play")
	private WebElement playButton;
	
	@AndroidFindBy(id="free.rm.skytube.extra:id/exo_pause")
	private WebElement pauseButton;
	
	
	
	boolean videoCondition;
	SwipeUtils sUtils;
	String titleMessage;
	
	public VideoGesturesPage()
	{
		sUtils = new SwipeUtils();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public boolean checkVideoPlay() throws InterruptedException
	{
		videoCondition=false;
		if(contentView.isDisplayed() && subTitleContent.isDisplayed())
		{
			videoCondition=sUtils.validateSwipeWithScreenshot();
		}
		return videoCondition;
	}
	
	public String checkVideoTitle()
	{
		
		if(contentView.isDisplayed() && subTitleContent.isDisplayed())
		{
			sUtils.tapAction(0.50, 0.50);
			
			
		}
		return "";
		
	}
	
	public void volumeIncreaseValidation()
	{
		sUtils.swipeByPercentage(0.20, 0.6, 0.20, 0.3);
	}
	
	
	public void volumeDecreaseValidation()
	{
		sUtils.swipeByPercentage(0.20, 0.6, 0.20, 0.9);
	}
	public void brightnessIncreaseValidation()
	{
		sUtils.swipeByPercentage(0.80, 0.6, 0.20, 0.3);
	}
	
	public void brightnessDecreaseValidation()
	{
		sUtils.swipeByPercentage(0.80, 0.6, 0.20, 0.3);
	}
	

}
