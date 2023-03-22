package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoInventary;
import com.sophossolutions.pages.SauceDemoLogin;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoLoginStepDefinitions {
	SauceDemoLogin sauceDemoLogin;
	SauceDemoInventary sauceDemoInventary;
	
	@Managed
	WebDriver myBrowser;

	@Given("El usuario debe estar en la pagina {string}")
	public void elUsuarioDebeEstarEnLaPagina(String key) {
		System.out.println("Estoy en el Given.Login..");
		sauceDemoLogin.navegar(Constants.getData(key));
	}

	@When("Ingresa para autenticarse {string} y {string}")
	public void ingresaParaAutenticarseY(String userName, String password) {
		System.out.println("Estoy en el When.Login...");
		sauceDemoLogin.login(Constants.getData(userName), Constants.getData(password));
	}

	@Then("Valido que estoy en la pagina de inventario {string}")
	public void validoQueEstoyEnLaPaginaDeInventario(String txt) {
		System.out.println("Estoy en el Then.Login...");
		sauceDemoInventary.validateText(txt);
	}
}
