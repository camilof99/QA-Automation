package com.sophossolutions.stepdefinitions.stepHeroesRest;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.sophosolutions.task.ExecutePost;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PostHeroesRestStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@When("Consulta el endpoint {string} por post y data {string}")
	public void consultaElEndpointPorPostYData(String strEndpoint, String strData) throws IOException {
		String strJsonData = new String(Files.readAllBytes(Path.of(Constants.getData(strData))));
		
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecutePost.withtokens(Constants.getData(strEndpoint), strData, Constants.getData("Token Heroes Rest")));
	}

	@Then("Validar que el status sea {int}.")
	public void validarQueElStatusSea(Integer int1) {
		
	}

}
