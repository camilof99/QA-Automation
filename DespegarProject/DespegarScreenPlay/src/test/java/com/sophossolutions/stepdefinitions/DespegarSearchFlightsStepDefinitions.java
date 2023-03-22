package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetFlightData;
import com.sophossolutions.ui.DespegarFiltersFlightsPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DespegarSearchFlightsStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usuario debe dirigirse a la pagina {string}")
	public void elUsuarioDebeDirigirseALaPagina(String string) {
		System.out.println("Estoy en el Given...");
		OnStage.theActorCalled("Camilo99").wasAbleTo(Open.url(Constants.getData(string)));
	}

	@When("Ingresa información de vuelo")
	public void ingresaInformaciónDeVuelo(DataTable dataTable) {
		System.out.println("Estoy en el When...");
		OnStage.theActorInTheSpotlight().wasAbleTo(
				SetFlightData.formData(dataTable));
	}

	@Then("Valido que aparezcan la lista de vuelo {string}")
	public void validoQueAparezcanLaListaDeVuelo(String string) {
		System.out.println("Estoy en el Then...");
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(DespegarFiltersFlightsPage.tgtTextPage), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));
	}
}
