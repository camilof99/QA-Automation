package com.sophosolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {
		constantDir.put("Actor", "Camilo Faria");
		constantDir.put("Booking URL", "https://www.booking.com/");
	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
