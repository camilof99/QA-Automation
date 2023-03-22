package com.sophossolutions.stepdefinition;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.FlightFinderHome;
import com.sophossolutions.pages.FlightFinderReservation;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class FlightFinderReservationStepDefinitions {
	FlightFinderReservation flightFinder;
	FlightFinderHome flightFinderHome;

	@Managed
	WebDriver myBrowser;

	@Given("El usario debe estar en la pagina.. {string}")
	public void elUsarioDebeEstarEnLaPaginaUrl(String key) {
		System.out.println("Estoy en el Given...");
		flightFinder.navegar(Constants.getData(key));
	}

	@When("Ingresar datos para reservation:")
	public void ingresarDatosParaReservation(DataTable dataTable) {
		
		System.out.println("Estoy en el When...");
		
		flightFinder.reservation(dataTable);
	}

	@Then("Y valida que aparezca mensaje en pantalla home {string}")
	public void yValidaQueAparezcaMensajeEnPantallaHome(String text) {
		System.out.println("Estoy en el Then...");
		flightFinderHome.validateText(text);
	}

}
