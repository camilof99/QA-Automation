package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.runners.SauceDemoFilters;
import com.sophossolutions.task.PrintInformationCheckout;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.SauceDemoCheckoutOverviewPage;
import com.sophossolutions.ui.SauceDemoFinishPage;
import com.sophossolutions.ui.SauceDemoHomePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SauceDemoCheckoutOverviewStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@When("Buscar información de la compra y finalizar")
	public void buscarInformaciónDeLaCompraYFinalizar() {
		OnStage.theActorInTheSpotlight().wasAbleTo(
				PrintInformationCheckout.getData());
	}

	@Then("Imprimir por consola información de la compra")
	public void imprimirPorConsolaInformaciónDeLaCompra() {
		PrintInformationCheckout.printData(OnStage.theActorInTheSpotlight());
	}

	@Then("Validar que aparezca texto en pantalla {string}")
	public void validarQueAparezcaTextoEnPantalla(String string) {
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(SauceDemoFinishPage.txtFinish), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));		
	}
}
