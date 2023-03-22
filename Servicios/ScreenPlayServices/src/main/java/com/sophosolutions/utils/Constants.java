package com.sophosolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {
		constantDir.put("Actor", "Camilo");
		constantDir.put("Go Rest", "https://gorest.co.in");
		constantDir.put("Go Endpoint", "/public/v2/users/");
		constantDir.put("Req Rest", "https://reqres.in");
		constantDir.put("Req Endpoint List", "/api/users?page=2");
		constantDir.put("Req Endpoint", "/api/users/");
		constantDir.put("Json Rest", "https://jsonplaceholder.typicode.com");
		constantDir.put("Go Schema", "src/test/resources/com/sophossolutions/schemas/go_rest_get_schema.json");
		constantDir.put("Req Schema Get", "src/test/resources/com/sophossolutions/schemas/get_req_schema.json");
		constantDir.put("Req Schema Post", "src/test/resources/com/sophossolutions/schemas/post_req_res_schema.json");
		
		constantDir.put("Heroes Rest", "http://localhost:3000");
		constantDir.put("Heroes Endpoint", "/api/heroes/");
		constantDir.put("Heroes Data", "src/test/resources/com/sophossolutions/schemas/examples/heroes_data.json");
		constantDir.put("Heroes Schema Post", "src/test/resources/com/sophossolutions/schemas/post_heroes_schema.json");
		constantDir.put("Heroes Schema Get", "src/test/resources/com/sophossolutions/schemas/get_heroes_schema.json");
	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
