package com.sophosolutions.restinteractions;

import static com.sophosolutions.utils.Constants.getData;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import com.google.gson.Gson;
import com.sophosolutions.apis.GoRestApi;
import com.sophosolutions.apis.HeroesRestApi;
import com.sophosolutions.models.Prueba;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;

public class RestInteraction {

	private static String strBaseUrl;

	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.strBaseUrl = strBaseUrl;
	}

	public static void executeGetRest(String strEndPoint) {
		SerenityRest.given().when().get(strBaseUrl.concat(strEndPoint));

		SerenityRest.lastResponse().prettyPeek();
	}

	public static void validateStatusCode(int intStatusCode) {
		int intResponseCode = SerenityRest.lastResponse().getStatusCode();

		assertEquals(intStatusCode, intResponseCode, "El status esperado no coincide...");
	}

	public static void validateField(String strFieldKey, String strFieldValue) {
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();

		String strFieldValueObtained = responseJSON.getString(strFieldKey);

		assertEquals(strFieldValue, strFieldValueObtained, "El valor del campo esperado no coincide...");
	}
	
	public static void executeDeleteRest(String strEndPoint, String strID, String strToken) throws IOException {
	    
		SerenityRest.given().auth().oauth2(strToken).contentType(ContentType.JSON).when()
    		.delete(strBaseUrl.concat(getData(strEndPoint).concat(strID)));
		
	    SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void executePostRest(String strEndPoint, String strData, String strToken) throws IOException {
		//Map<String, String> body = dataTable.asMap(String.class, String.class);
		String jsonData = new String(Files.readAllBytes(Path.of(Constants.getData(strData))));
		
		SerenityRest.given().auth().oauth2(strToken).contentType(ContentType.JSON).when()
		.body(jsonData).post(strBaseUrl.concat(getData(strEndPoint)));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void validateJsonSchema(String strSchema) {
		
		SerenityRest.lastResponse().then().assertThat()
			.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData(strSchema))));
	}

}
