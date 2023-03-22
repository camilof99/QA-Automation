package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophosolutions.apis.JsonHolder;
import com.sophosolutions.apis.ReqResApi;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetJsonHolderStepDefinitions {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio...")
	public void dadoQueEstableceLaBaseUrlDelServicio(String string, String strBaseUrl) {
		// Write code here that turns the phrase above into concrete actions
		JsonHolder.setBaseUrl(Constants.getData(strBaseUrl));
	}

	@When("Consulta el endpoint {string}...")
	public void consultaElEndpoint(String strEndPoint) {
		
		JsonHolder.executeGetRest(Constants.getData(strEndPoint));
	}

	@Then("Validar que el status y que la respuesta contenga toda la información del usuario...")
	public void validarQueElStatusYQueLaRespuestaContengaTodaLaInformaciónDelUsuario(DataTable dataTable) {

		Map<String, String> mpData = dataTable.asMap(String.class, String.class);

		mpData.forEach((key, value) -> JsonHolder.validateField(key, value));
	}
}
