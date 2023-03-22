package com.sophossolutions.stepdefinitions.stepsGoRest;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.sophosolutions.task.ExecutePost;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PostGoRestStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("Consulta el endpoint {string} por medio de una peticion post")
	public void consultaElEndpointPorMedioDeUnaPeticionPost
	(String strEndPoint, DataTable dataTable) {
		
		//OnStage.theActorInTheSpotlight().attemptsTo(
				//ExecutePost.withtokens(Constants.getData(strEndPoint), dataTable));
	}
	
	@Then("Validar que el status sea {int} y que el esquema sea el correcto {string}")
	public void validarQueElStatusSeaYQueElEsquemaSeaElCorrecto(Integer intStatus, String strSchema) {
	    
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatus)));
	} 
}
