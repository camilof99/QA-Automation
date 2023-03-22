package com.sophossolutions.stepdefinitions.stepsGoRest;

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

public class PatchGoRestStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("Consulta el endpoint {string} por patch con id {string}")
	public void consultaElEndpointPorPatchConId(String strEndpoint, String strId,
			DataTable dataTable) {
		
//		OnStage.theActorInTheSpotlight().attemptsTo(
//				ExecutePatch.withtokens(Constants.getData(strEndpoint), strId, dataTable, Constants.getData("Token Go Rest")));
	}

	@Then("Validar que el status sea {int}")
	public void validarQueElStatusSea(Integer intStatus) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatus)));
	}

}
