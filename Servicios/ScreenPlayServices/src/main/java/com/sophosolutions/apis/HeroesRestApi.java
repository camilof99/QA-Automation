package com.sophosolutions.apis;

import java.io.IOException;

import com.sophosolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class HeroesRestApi {
	
	public static final String STR_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjoiY2FtaWxvOTkiLCJpYXQiOjE2Nzg4NDg3NDN9.mPuOqhH7VltyjzC1xKic9T4u3elGdkqz0FA7Ep0tuAk";
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}

	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}

	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}

	public static void validateField(String strFieldKey, String strFieldValue) {
		RestInteraction.validateField("data." + strFieldKey, strFieldValue);
	}

	public static void executePostRest(String strEndPoint, String strData) throws IOException {

		RestInteraction.executePostRest(strEndPoint, strData, STR_TOKEN);
	}

	public static void validateJsonSchema(String strSchema) {
		RestInteraction.validateJsonSchema(strSchema);
	}
}
