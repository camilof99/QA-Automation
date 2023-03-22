package com.sophossolutions.stepdefinitions;

import com.sophosolutions.apis.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
		//GoRestApi.executePostRest(strEndPoint, dataTable);
	}
	
	@Then("Validar que el status sea {int} y que el esquema sea el correcto {string}")
	public void validarQueElStatusSeaYQueElEsquemaSeaElCorrecto(Integer intStatus, String strSchema) {
	    //GoRestApi.validateStatusCode(intStatus);
		GoRestApi.validateJsonSchema(strSchema);
	} 
}
