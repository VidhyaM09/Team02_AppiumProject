package com.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;

import com.pages.BaseClassAppium;



public class SwipeUtils extends BaseClassAppium {


	public void swipeByCoordinates(int xStart, int yStart, int xEnd, int yEnd) {
		try {

			
			// Create a PointerInput instance for touch gestures
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

			// Define the swipe sequence
			Sequence swipe = new Sequence(finger, 0);

			// Move finger to start position
			swipe.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), xStart, yStart));

			// Press down
			swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

			// Move to the end position
			swipe.addAction(finger.createPointerMove(Duration.ofMillis(5000), Origin.viewport(), xEnd, yEnd));

			// Release finger
			swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

			// Perform the swipe
			driver.perform(Arrays.asList(swipe));

			System.out.println("Swipe action performed successfully.");

		} catch (Exception e) {
			System.out.println("Error while performing swipe: " + e.getMessage());
		}
	}
	
	
	 public void swipeByPercentage(double startXPercent, double startYPercent, double endXPercent, double endYPercent) {
	        try {
	            // Get screen dimensions
	            Dimension screenSize = driver.manage().window().getSize();
	            int screenWidth = screenSize.getWidth();
	            int screenHeight = screenSize.getHeight();

	            // Calculate coordinates dynamically
	            int xStart = (int) (screenWidth * startXPercent);
	            int yStart = (int) (screenHeight * startYPercent);
	            int xEnd = (int) (screenWidth * endXPercent);
	            int yEnd = (int) (screenHeight * endYPercent);

	            // Create PointerInput for touch gesture
	            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	            Sequence swipe = new Sequence(finger, 0);

	            // Move to start position
	            swipe.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), xStart, yStart));

	            // Press down
	            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

	            // Move to end position (swipe action)
	            swipe.addAction(finger.createPointerMove(Duration.ofMillis(5000), Origin.viewport(), xEnd, yEnd));

	            // Release finger
	            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	            // Perform swipe
	            driver.perform(Arrays.asList(swipe));

	            System.out.println("Swipe performed successfully.");

	        } catch (Exception e) {
	            System.out.println("Error while performing swipe: " + e.getMessage());
	        }
	    }
	 
	  public boolean validateSwipeWithScreenshot() throws InterruptedException {
	       
            try {
	    
	        	boolean screenAction;
	        	// The screenshots are stored in memory and not saved to a file or directory if
				// we are using output type as base 64
//				 String beforeSwipeScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//				  Thread.sleep(3000); 
//			     String afterSwipeScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//			     Thread.sleep(3000); 
//
//			// Compare screenshots to validate the swipe
//	        	            if (!beforeSwipeScreenshot.equals(afterSwipeScreenshot)) {
//	        	                System.out.println("Swipe action validated successfully!");
//	        	            } else {
//	        	                Assert.fail("Swipe action did not cause any visible change.");
//	        	            }


	           
	         // Here the screenshots are stored under file path
				File beforeSwipe = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				  Thread.sleep(3000); 
				File beforeFile = new File("videobeforeSwipe.png");
				FileUtils.copyFile(beforeSwipe, beforeFile);
				System.out.println("Before swipe screenshot saved: " + beforeFile.getAbsolutePath());
				
				File afterSwipe = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				  Thread.sleep(3000);
				File afterFile = new File("videoafterSwipe.png");
				FileUtils.copyFile(afterSwipe, afterFile);
				System.out.println("After swipe screenshot saved: " + afterFile.getAbsolutePath());
				
				 if (!FileUtils.contentEquals(beforeFile, afterFile)) {
			            System.out.println("Swipe action validated successfully!");
			            screenAction=true;
			        } else {
			        	 screenAction=false;
			            Assert.fail("Swipe action did not cause any visible change.");
			        }
				 return screenAction;
				
	        } catch (IOException e) {
	            System.out.println("Error while saving screenshot: " + e.getMessage());
	          return false;
	        }
	    }
	  
	  public void doubleTapAction(double xPercent,double yPercent)
	  {
		  try {
			  Dimension screenSize = driver.manage().window().getSize();
				int screenWidth = screenSize.getWidth();
				int screenHeight = screenSize.getHeight();
				int x = (int) (screenWidth * 0.50); 
				int y = (int) (screenHeight * 0.50); 
				PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
				Sequence pressTab = new Sequence(finger, 1);
				pressTab.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y)); // Move to location
				pressTab.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); // Press down
				pressTab.addAction(new Pause(finger,Duration.ofMillis(100)));
				pressTab.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); // Release
				pressTab.addAction(new Pause(finger,Duration.ofMillis(100)));
				pressTab.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); // Press down
				pressTab.addAction(new Pause(finger,Duration.ofMillis(100)));
				pressTab.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
				
				driver.perform(Arrays.asList(pressTab));
		  }
		 catch(Exception e)
		  {
			 e.printStackTrace();
			 System.out.println("Error while performing double tap action: " + e.getMessage());
		  }
	  }
	  public void tapAction(double xPercent,double yPercent)
	  {
		  try {
			  Dimension screenSize = driver.manage().window().getSize();
				int screenWidth = screenSize.getWidth();
				int screenHeight = screenSize.getHeight();
				int x = (int) (screenWidth * 0.50); 
				int y = (int) (screenHeight * 0.50); 
				PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
				Sequence pressTab = new Sequence(finger, 1);
				pressTab.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y)); // Move to location
				pressTab.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); // Press down
				pressTab.addAction(new Pause(finger,Duration.ofMillis(100)));
				pressTab.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); // Release
				pressTab.addAction(new Pause(finger,Duration.ofMillis(100)));
				pressTab.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); // Press down
				pressTab.addAction(new Pause(finger,Duration.ofMillis(100)));
				pressTab.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
				
				driver.perform(Arrays.asList(pressTab));
		  }
		 catch(Exception e)
		  {
			 e.printStackTrace();
			 System.out.println("Error while performing double tap action: " + e.getMessage());
		  }
	  }

}
