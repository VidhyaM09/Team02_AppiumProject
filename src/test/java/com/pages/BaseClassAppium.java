package com.pages;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.utilities.ConfigManager;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClassAppium {

	private AppiumDriverLocalService service;
	public static AndroidDriver driver;

	public void setUp() {
		try {
			String appName = System.getProperty("appName", "skytubeapp");
			//startAppiumServer();

			// Configure UiAutomator2 options
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName(ConfigManager.getProperty("platformName"));
			options.setUdid(ConfigManager.getProperty("uuid"));
			options.setDeviceName(ConfigManager.getProperty("deviceName"));
			options.setPlatformVersion(ConfigManager.getProperty("platformVersion"));
			options.setAutomationName(ConfigManager.getProperty("automationName"));
			options.setAppPackage(ConfigManager.getProperty(appName + ".appPackage"));
			options.setAppActivity(ConfigManager.getProperty(appName + ".appActivity"));
			options.setCapability(ConfigManager.getProperty("capability1"),true);
			options.setCapability(ConfigManager.getProperty("capability2"),150000);
			options.setCapability(ConfigManager.getProperty("capability3"), 1000);


			// Initialize AndroidDriver
			URL serverURL = new URL("http://127.0.0.1:4723/");
			driver = new AndroidDriver(serverURL, options);
			System.out.println("App opened successfully.");
		} catch (Exception e) {
			System.err.println("Error occurred while initializing the driver: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void startAppiumServer() {
		try {
			Map<String, String> environment = new HashMap<>(System.getenv());

			// Set ANDROID_HOME if not present
			if (!environment.containsKey("ANDROID_HOME")) {
				environment.put("ANDROID_HOME", "/Users/vidhyamanickaraj/Library/Android/sdk/"); // Update as needed
			}

			service = new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingPort(4723)
					.usingDriverExecutable(new File("/opt/homebrew/bin/node")) // Path to Node.js binary
					.withAppiumJS(new File("/opt/homebrew/lib/node_modules/appium/build/lib/main.js")) // Path to
																										// Appium																				// main.js
					.withArgument(GeneralServerFlag.LOG_LEVEL, "error").withEnvironment(environment) // Pass environment
																										// variables
					.build();

			service.start();

			if (!service.isRunning()) {
				throw new RuntimeException("Appium server failed to start.");
			}

			System.out.println("Appium server started successfully at: " + service.getUrl());
		} catch (Exception e) {
			System.err.println("Failed to start Appium server: " + e.getMessage());
			throw e;
		}
	}

	public void tearDown() {
		try {
			if (driver != null) {
				driver.quit();
				System.out.println("Driver session closed successfully.");
			}

		} catch (Exception e) {
			System.err.println("Error occurred while closing the driver: " + e.getMessage());
		} finally {
			//stopAppiumServer();
		}
	}

	private void stopAppiumServer() {
		try {
			if (service != null && service.isRunning()) {
				service.stop();
				System.out.println("Appium server stopped successfully.");
			}
		} catch (Exception e) {
			System.err.println("Error occurred while stopping Appium server: " + e.getMessage());
		}
	}

}
