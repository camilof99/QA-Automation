package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.GetCart;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.task.SetDataCheckout;
import com.sophossolutions.ui.SauceDemoCheckoutInfoPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SauceDemoCheckoutInfoStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Deber dirigirse a la pagina de checkout")
	public void deberDirigirseALaPaginaDeCheckout() {
		OnStage.theActorInTheSpotlight().wasAbleTo(GetCart.clickBtnCheckout());
	}

	@Given("Validar que esté el mensaje {string}")
	public void validarQueEstéElMensaje(String string) {
		OnStage.theActorInTheSpotlight()
		.should(GivenWhenThen.seeThat(TextOf.field(SauceDemoCheckoutInfoPage.txtCheckout), Matchers.equalTo(string))
				.orComplainWith(UnexpectedResult.class,
						"El titulo del elemento no coincide con el esperado..."));
	}

	@When("Llenar el formulario y completar checkout")
	public void llenarElFormularioYCompletarCheckout(DataTable dataTable) {
		OnStage.theActorInTheSpotlight().wasAbleTo(
				SetDataCheckout.formCheckout(dataTable));
	}

	@Then("Validar que aparezca texto {string}")
	public void validarQueAparezcaTexto(String string) {
		OnStage.theActorInTheSpotlight()
		.should(GivenWhenThen.seeThat(TextOf.field(SauceDemoCheckoutInfoPage.txtCheckout), Matchers.equalTo(string))
				.orComplainWith(UnexpectedResult.class,
						"El titulo del elemento no coincide con el esperado..."));
	}

}
