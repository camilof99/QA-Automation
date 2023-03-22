package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophosolutions.apis.GoRestApi;
import com.sophosolutions.utils.Constants;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetGoRestStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		// OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
		// SerenityRest.given()
		GoRestApi.setBaseUrl(Constants.getData(strBaseUrl));
	}

	@When("Consulta el endpoint {string} y el id {string}")
	public void consultaElEndpoint(String strEndPoint, String strID) {
		GoRestApi.executeGetRest(Constants.getData(strEndPoint).concat(strID));
	}

	@Then("Validar que el status sea {int} y que la respuesta contenga toda la información del usuario")
	public void validarQueElStatusSeaYQueLaRespuestaContengaTodaLaInformaciónDelUsuario(Integer intStatusCode,
			DataTable dataTable) {

		GoRestApi.validateStatusCode(intStatusCode);

		Map<String, String> mpData = dataTable.asMap(String.class, String.class);

		mpData.forEach((key, value) -> GoRestApi.validateField(key, value));
	}

	@Then("Validar Json Schema {string}")
	public void validarJsonSchema(String strSchema) {
		GoRestApi.validateJsonSchema(strSchema);
	}

}
