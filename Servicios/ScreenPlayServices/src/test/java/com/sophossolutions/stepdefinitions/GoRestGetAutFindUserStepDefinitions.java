package com.sophossolutions.stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import static com.sophosolutions.utils.Constants.getData;

import com.sophosolutions.apis.GoRestApi;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class GoRestGetAutFindUserStepDefinitions {
	
	@When("Consulta el endpoint {string} con una peticion get usando toekn y el id {string}")
	public void consultaElEndpointConUnaPeticionGetUsandoToeknYElId(String strEndPoint, String strId) {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN));
		headers.put("Content-Type", "application/json");
		

		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN)
				.get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
		
		SerenityRest.lastResponse().prettyPeek();
		
//		SerenityRest.given()
//				.headers("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN), "Content-Type", ContentType.JSON)
//				.get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
		
//		SerenityRest.given().headers(headers).get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
//		SerenityRest.lastResponse().prettyPeek();
	}
}
