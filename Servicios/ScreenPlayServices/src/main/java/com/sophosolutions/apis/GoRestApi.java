package com.sophosolutions.apis;

import static com.sophosolutions.utils.Constants.getData;

import java.io.IOException;

import com.sophosolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class GoRestApi {

	public static final String STR_TOKEN = "5d6fa3c551ede5ae551f165588e08d9115d2e2d32d2e40fe2063395c00393e3f";

	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}

	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}
	
public static void executeDeleteRest(String strEndPoint, String strID, String strToken) throws IOException {
	    
	RestInteraction.
	}

	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}

	public static void validateField(String strFieldKey, String strFieldValue) {
		RestInteraction.validateField(strFieldKey, strFieldValue);
	}

	public static void executePostRest(String strEndPoint, String strData) throws IOException {
		
		RestInteraction.executePostRest(strEndPoint, strData, STR_TOKEN);
	}

	public static void validateJsonSchema(String strSchema) {
		RestInteraction.validateJsonSchema(strSchema);
	}

}
