package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.NewToursHome;
import com.sophossolutions.pages.NewToursLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class NewToursLoginStepDefinitions {
	NewToursLogin guruToursLogin;
	NewToursHome guruToursHome;

	@Managed
	WebDriver myBrowser;

	@Given("El usuario debe estar en la pagina. {string}")
	public void elUsuarioDebeEstarEnLaPagina(String url) {
		System.out.println("Estoy en el Given...");
		guruToursLogin.navigate(url);
	}

	@When("Ingresa {string} y {string} para autenticarse")
	public void ingresaYParaAutenticarse(String user, String password) {
		System.out.println("Estoy en el When...");
		guruToursLogin.login(user, password);
	}

	@Then("Y valida el mensaje de la pantalla Home {string}")
	public void yValidaElMensajeDeLaPantallaHomeTitle(String text) {
		System.out.println("Estoy en el Given...");
		guruToursHome.validateText(text);
	}
}
