package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.GuruHome;
import com.sophossolutions.pages.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinitions {
	GuruLogin guruLogin;
	GuruHome guruHome;

	@Managed // redirecciona cuando pregunta por las configuraciones al archivo properties
	WebDriver myBrowser;

	@Given("El usuario debe estar en la pagina {string}")
	public void elUsuarioDebeEstarEnLaPagina(String url) {
		System.out.println("Estoy en el Given...");
		guruLogin.navegar(url);
	}

	@When("Ingresa nombre de usuario {string} y contraseña {string}")
	public void ingresaNombreDeUsuarioYContraseña(String user, String password) {
		System.out.println("Estoy en el When...");
		guruLogin.login(user, password);
	}

	@Then("Y valida el mensaje de la pantalla home {string}")
	public void yValidaElMensajeDeLaPantallaHome(String text) {
		System.out.println("Estoy en el Then...");
		guruHome.validateText(text);
	}

}
