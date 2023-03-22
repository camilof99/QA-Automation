package com.sophossolutions.stepdefinitions.stepsGoRest;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import org.hamcrest.CoreMatchers;

import com.sophosolutions.task.ExecuteGet;
import com.sophosolutions.utils.Constants;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetGoRestStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled("Camilo99").wasAbleTo(Open.url(Constants.getData("Despegar flights")));
		//OnStage.theActorCalled(strActorName)
			//.whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}

	@When("Consulta el endpoint {string} y el id {string}")
	public void consultaElEndpoint(String strEndPoint, String strID) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteGet.withtokens(Constants.getData(strEndPoint), strID));
	}

	@Then("Validar que el status sea {int} y que la respuesta contenga toda la información del usuario")
	public void validarQueElStatusSeaYQueLaRespuestaContengaTodaLaInformaciónDelUsuario(Integer intStatusCode,
			DataTable dataTable) {
			
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)
				.body("name", CoreMatchers.equalTo("Charuchandra Naik"))));
		
	}

}
