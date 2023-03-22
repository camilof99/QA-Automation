package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.AddCart;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.SauceDemoHomePage;
import com.sophossolutions.ui.SauceDemoInventaryPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SauceDemoAddCartStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Debe estar en la página del inventario {string}")
	public void debeEstarEnLaPáginaDelInventario(String string) {
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(SauceDemoInventaryPage.txtBienvenida), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));
	}

	@When("Clickea los productos a agregar {string} y {string}")
	public void clickeaLosProductosAAgregarY(String string, String string2) {
		OnStage.theActorInTheSpotlight().wasAbleTo(
				AddCart.clickBtn(string, string2));
	}

	@Then("Valido que los productos se agreguen correctamente {string}")
	public void validoQueLosProductosSeAgreguenCorrectamente(String string) {
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(SauceDemoInventaryPage.txtItems), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));
	}
}
