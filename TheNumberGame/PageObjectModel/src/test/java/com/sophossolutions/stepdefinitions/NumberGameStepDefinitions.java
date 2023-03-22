package com.sophossolutions.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.NumberGamePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class NumberGameStepDefinitions {
	NumberGamePage numberGamePage;
	
	@Managed
	WebDriver myBrowser;

	@Given("Dado que me encuentro en la pagina  {string}")
	public void dadoQueMeEncuentroEnLaPagina(String strUrl) {
		System.out.println("Estoy en el Given...");
		numberGamePage.navegar(Constants.getData(strUrl));
	}

	@When("Hago roll con cantidad {string}")
	public void hagoRollConCantidad(String strOption) {
		System.out.println("Estoy en el When...");
		numberGamePage.selectBuild(strOption);
	}

	@Then("Veo el mensaje Correct")
	public void veoElMensajeCorrect() {
		System.out.println("Estoy en el Then...");
		numberGamePage.inputNumber();
	}

	@Then("Imprimo el numero de intentos por consola")
	public void imprimoElNumeroDeIntentosPorConsola() {
		System.out.println("Estoy en el Then...");
		numberGamePage.printTurns();
	}
}
