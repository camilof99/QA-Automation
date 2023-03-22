package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoCheckout;
import com.sophossolutions.pages.SauceDemoFinish;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoCheckoutStepDefinitions {

	SauceDemoCheckout sauceDemoCheckout;
	SauceDemoFinish sauceDemoFinish;

	@Managed
	WebDriver myBrowser;

	@Given("Deber dirigirse a la pagina de checkout {string}")
	public void deberDirigirseALaPaginaDeCheckout(String elm) {
		System.out.println("Estoy en el Given.Checkout...");
		sauceDemoCheckout.navegate(elm);
	}

	@Given("Validar que esté el mensaje {string}")
	public void validarQueEstéElMensaje(String txt) {
		System.out.println("Estoy en el Given.Checkout...");
		sauceDemoCheckout.validateText(txt);
	}

	@When("Llenar el formulario y completar checkout")
	public void llenarElFormularioYCompletarCheckout(DataTable dataTable) {
		System.out.println("Estoy en el When.Checkout...");
		sauceDemoCheckout.form(dataTable);
	}

	@Then("Validar que aparezca texto {string}")
	public void validarQueAparezcaTexto(String txt) {
		System.out.println("Estoy en el Then.Checkout...");
		sauceDemoCheckout.validateText(txt);
	}

	@When("Buscar información de la compra y finalizar")
	public void buscarInformaciónDeLaCompraYFinalizar() {
		System.out.println("Estoy en el When.Checkout..");
		sauceDemoCheckout.searchInformation();
	}

	@Then("Imprimir por consola información de la compra")
	public void imprimirPorConsolaInformaciónDeLaCompra() {
		System.out.println("Estoy en el Then.Checkout..");
		sauceDemoCheckout.printInformation();
	}

	@Then("Validar que aparezca texto en pantalla {string}")
	public void validarQueAparezcaTextoEnPantalla(String txt) {
		System.out.println("Estoy en el Then.Checkout..");
		sauceDemoFinish.validateText(txt);
	}

}
