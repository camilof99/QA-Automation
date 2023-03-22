package com.sophossolutions.stepdefinitions;

import java.io.IOException;

import com.sophosolutions.apis.HeroesRestApi;
import com.sophosolutions.apis.ReqResApi;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PostHeroesRestStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Dado que {string} establece la base url {string} del servicio.")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strlActor, String strBaseUrl) {
		HeroesRestApi.setBaseUrl(Constants.getData(strBaseUrl));
		System.out.println("Given post heroes");
	}
	@When("Consulta el endpoint {string} por una peticion post con la data {string}")
	public void consultaElEndpointPorUnaPeticionPostConLaData(String strEndpoint, String strData) throws IOException {
		//HeroesRestApi.executePostRest(strEndpoint, strData);
	}
	@Then("Validar que el status sea {int} y que el esquema sea el correcto {string}...")
	public void validarQueElStatusSeaYQueElEsquemaSeaElCorrecto(Integer intStatus, String strSchema) {
		//HeroesRestApi.validateStatusCode(intStatus);
		//HeroesRestApi.validateJsonSchema(strSchema);
	}
}
