package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.SauceDemoHomePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SauceDemoLoginStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usuario debe estar en la pagina {string}")
	public void elUsuarioDebeEstarEnLaPagina(String string) {
		OnStage.theActorCalled("Equipo3").wasAbleTo(Open.url(Constants.getData(string)));
	}

	@When("Ingresa para autenticarse {string} y {string}")
	public void ingresaParaAutenticarseY(String string, String string2) {
		OnStage.theActorInTheSpotlight().wasAbleTo(
				SetCredentials.formSauceDemo(Constants.getData(string), Constants.getData(string2)));
	}

	@Then("Valido que estoy en la pagina de inventario {string}")
	public void validoQueEstoyEnLaPaginaDeInventario(String string) {
		
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(SauceDemoHomePage.txtBienvenida), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));		
	}
}
