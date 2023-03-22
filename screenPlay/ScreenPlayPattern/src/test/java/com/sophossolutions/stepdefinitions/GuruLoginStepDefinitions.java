package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.task.SetCredentialsLoginGuru;
import com.sophossolutions.ui.Guru99Pages.GuruHomePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GuruLoginStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usuario debe estar en la pagina {string}")
	public void elUsuarioDebeEstarEnLaPagina(String string) {
		OnStage.theActorCalled("Camilo").wasAbleTo(Open.url(Constants.getData(string)));
	}

	@When("Ingresa nombre de usuario {string} y contraseña {string}")
	public void ingresaNombreDeUsuarioYContraseña(String string, String string2) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.formGuru(Constants.getData(string), Constants.getData(string2)));
	}

	@Then("Y valida el mensaje de la pantalla home {string}")
	public void yValidaElMensajeDeLaPantallaHome(String string) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(GuruHomePage.txtBienvenida), Matchers.equalTo(string)).orComplainWith(UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));
	}
}
