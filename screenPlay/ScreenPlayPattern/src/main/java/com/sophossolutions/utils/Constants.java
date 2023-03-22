package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;


public class Constants {
	
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();
	
	private Constants() {
		constantDir.put("New Tours Login", "https://demo.guru99.com/test/newtours/");
		constantDir.put("New Tours username", "camilo99");
		constantDir.put("New Tours password", "12345678");
		
		constantDir.put("Guru99 Login", "https://demo.guru99.com/V4/");
		constantDir.put("Guru99 username", "mngr480443");
		constantDir.put("Guru99 password", "mYnupUm");
	}
	
	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}