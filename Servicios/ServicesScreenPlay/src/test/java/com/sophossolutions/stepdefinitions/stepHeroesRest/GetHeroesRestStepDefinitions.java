package com.sophossolutions.stepdefinitions.stepHeroesRest;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.hamcrest.CoreMatchers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sophosolutions.task.ExecuteGet;
import com.sophosolutions.utils.Constants;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetHeroesRestStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio.")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}

	@When("Consulta el endpoint {string} y el id {string}.")
	public void consultaElEndpointYElId(String strEndPoint, String strID) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteGet.withtokens(Constants.getData(strEndPoint), strID));
	}

	@Then("Validar que el status sea {int} y la informacion {string}.")
	public void validarQueElStatusSeaYLaInformacion(Integer intStatus, String strData) throws IOException {
		
		String strJsonData = new String(Files.readAllBytes(
				Path.of(Constants.getData(strData))));
		
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = jsonParser.parse(strJsonData).getAsJsonObject();
		
		//System.out.println(jsonObject);
		
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validateResponse -> validateResponse.statusCode(intStatus)
				.body(CoreMatchers.equalTo(jsonObject.toString()))));
	}

}
