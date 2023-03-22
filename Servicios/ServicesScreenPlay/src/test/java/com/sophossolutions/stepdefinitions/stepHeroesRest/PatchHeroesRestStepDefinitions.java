package com.sophossolutions.stepdefinitions.stepHeroesRest;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.util.Map;

import org.apache.http.HttpHeaders;

import com.sophosolutions.task.ExecutePatch;
import com.sophosolutions.task.ExecutePost;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PatchHeroesRestStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("Consulta el endpoint {string} por patch con id {string} y data {string}")
	public void consultaElEndpointPorPatchConIdYData(String strEndpoint, String strId, String strData) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecutePatch.withtokens(Constants.getData(strEndpoint), strId, strData, Constants.getData("Token Heroes Rest")));
	}
}
