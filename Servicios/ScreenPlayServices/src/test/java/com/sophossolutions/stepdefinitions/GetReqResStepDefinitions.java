package com.sophossolutions.stepdefinitions;

import com.sophosolutions.apis.GoRestApi;
import com.sophosolutions.apis.ReqResApi;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetReqResStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio..")
	public void dadoQueEstableceLaBaseUrlDelServicio(String string, String strBaseUrl) {
		
		ReqResApi.setBaseUrl(Constants.getData(strBaseUrl));
	}

	@When("Consulta el endpoint {string}..")
	public void consultaElEndpoint(String strEndPoint) {
		ReqResApi.executeGetRest(Constants.getData(strEndPoint));
	}

	@Then("Validar que el status sea {int} y que la respuesta contenga toda la información del usuario..")
	public void validarQueElStatusSeaYQueLaRespuestaContengaTodaLaInformaciónDelUsuario
	(Integer intStatusCode, DataTable dataTable) {
		
		ReqResApi.validateStatusCode(intStatusCode);
		
		//Map<String, String> mpData = dataTable.asMap(String.class, String.class);
		
		//mpData.forEach((key, value) -> ReqResApi.validateField(key, value));
	}
	
	@Then("Validar Json Schema {string}..")
	public void validarJsonSchema(String strSchema) {
		ReqResApi.validateJsonSchema(strSchema);
	}
}
