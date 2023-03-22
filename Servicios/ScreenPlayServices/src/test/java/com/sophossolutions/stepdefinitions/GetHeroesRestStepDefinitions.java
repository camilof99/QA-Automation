package com.sophossolutions.stepdefinitions;

import com.sophosolutions.apis.HeroesRestApi;
import com.sophosolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetHeroesRestStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Dado que {string} establece la base url {string} del servicio....")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strlActor, String strBaseUrl) {
		HeroesRestApi.setBaseUrl(Constants.getData(strBaseUrl));
		System.out.println("Given get heroes");
	}

	@When("Consulta el endpoint {string}")
	public void consultaElEndpoint(String strEndPoint) {
		HeroesRestApi.executeGetRest(Constants.getData(strEndPoint));
	}

	@Then("Validar que el status sea {int} y Validar Json Schema {string}..")
	public void validarQueElStatusSeaYValidarJsonSchema(Integer intStatusCode, String strSchema) {
		HeroesRestApi.validateStatusCode(intStatusCode);
		HeroesRestApi.validateJsonSchema(strSchema);
	}
}
