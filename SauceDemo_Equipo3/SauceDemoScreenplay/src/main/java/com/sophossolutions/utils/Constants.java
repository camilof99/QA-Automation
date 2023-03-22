package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {
		constantDir.put("Sauce Demo Login", "https://www.saucedemo.com/");
		constantDir.put("Username Login", "standard_user");
		constantDir.put("Password Login", "secret_sauce");
	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
