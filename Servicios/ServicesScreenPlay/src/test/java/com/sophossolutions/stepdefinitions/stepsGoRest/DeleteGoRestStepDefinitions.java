package com.sophossolutions.stepdefinitions.stepsGoRest;

import com.sophosolutions.task.ExecuteDelete;
import com.sophosolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DeleteGoRestStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("Consulta el endpoint {string} para delete con id {string}.")
	public void consultaElEndpointParaDeleteConId(String strEndPoint, String strID) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteDelete.withtokens(Constants.getData(strEndPoint), strID, Constants.getData("Token Heroes Rest")));
	}

}
