package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.ui.DespegarFiltersFlightsPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DespegarFiltersFlightsStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usuario debe estar en la pagina de lista de vuelos {string}")
	public void elUsuarioDebeEstarEnLaPaginaDeListaDeVuelos(String string) {
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(DespegarFiltersFlightsPage.tgtTextPage), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));
	}

	@When("Selecciona campo con el {string}")
	public void seleccionaCampoConEl(String string) {
		
	}

	@Then("Imprimir los vuelos mas baratos")
	public void imprimirLosVuelosMasBaratos() {
		
	}
}
