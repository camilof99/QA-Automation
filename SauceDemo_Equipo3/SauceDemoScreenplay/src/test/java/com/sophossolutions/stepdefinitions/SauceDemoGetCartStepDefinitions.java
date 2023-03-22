package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.ElementOf;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.GetCart;
import com.sophossolutions.ui.SauceDemoGetCart;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SauceDemoGetCartStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Debe ir a la pagina del carrito")
	public void debeIrALaPaginaDelCarrito() {
		OnStage.theActorInTheSpotlight().wasAbleTo(GetCart.clickBtnCart());
	}

	@Given("Ver mensaje {string}")
	public void verMensaje(String string) {
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(TextOf.field(SauceDemoGetCart.txtGetCart), Matchers.equalTo(string))
						.orComplainWith(UnexpectedResult.class,
								"El titulo del elemento no coincide con el esperado..."));
	}

	@When("Busco los productos en el carrito")
	public void buscoLosProductosEnElCarrito() {
		OnStage.theActorInTheSpotlight()
				.should(GivenWhenThen.seeThat(ElementOf.field(SauceDemoGetCart.txtItemProduct), Matchers.equalTo(true))
						.orComplainWith(UnexpectedResult.class,
								"El elemento no existe en la pagina..."));
	}

	@Then("Muestro por consola los productos del carrito")
	public void muestroPorConsolaLosProductosDelCarrito() {
		
	}
}
