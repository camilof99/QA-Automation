package com.sophossolutions.stepdefinitions;

import com.sophosolutions.apis.ReqResApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostReqResStepDefinitions {

	@When("Consulta el endpoint {string} por medio de una peticion post..")
	public void consultaElEndpointPorMedioDeUnaPeticionPost(String strEndpoint, DataTable dataTable) {
		//ReqResApi.executePostRest(strEndpoint, dataTable);
	}

	@Then("Validar que el status sea {int} y que el esquema sea el correcto {string}..")
	public void validarQueElStatusSeaYQueElEsquemaSeaElCorrecto(Integer intStatus, String strSchema) {
		ReqResApi.validateStatusCode(intStatus);
		ReqResApi.validateJsonSchema(strSchema);
	}
}
