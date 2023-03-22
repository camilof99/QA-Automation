package com.sophosolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {
		constantDir.put("Actor", "Camilo");
		constantDir.put("Despegar flights", "https://www.despegar.com.co/vuelos");
		
		// Go Rest Api
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("Go Endpoint", "/public/v2/users/");
		constantDir.put("Token Go Rest", "5d6fa3c551ede5ae551f165588e08d9115d2e2d32d2e40fe2063395c00393e3f");
		
		// Heroes Rest Api
		constantDir.put("Heroes Rest", "http://localhost:3000");
		constantDir.put("Heroes Endpoint", "/api/heroes/");
		constantDir.put("Token Heroes Rest", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiY2FtaWxvOTkiLCJpYXQiOjE2NzkwNjc0Mzd9.qnAvZH2BxAharDtB2CyiZ9F_B10QTUlsBXowsTHVoM4");
		constantDir.put("Heroes Data Get", "src/test/resources/com/sophossolutions/schema/data/heroes_data_get.json");
		constantDir.put("Heroes Data Post", "src/test/resources/com/sophossolutions/schema/data/heroes_data_post.json");
		
	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
