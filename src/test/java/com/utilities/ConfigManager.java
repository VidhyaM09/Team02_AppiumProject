package com.utilities;

import java.util.ResourceBundle;

public class ConfigManager {

	 private static ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

	    
	    public static String getProperty(String key) {
	        return resourceBundle.getString(key);
	    }

	   

}
