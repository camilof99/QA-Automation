package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophosolutions.task.SetBuscarData;
import com.sophosolutions.task.SetFilters;
import com.sophosolutions.task.SetHotelReservation;
import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BookingBuscarStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usuario {string} debe estar en la pagina de booking e ir a alojamientos {string}")
	public void elUsuarioDebeEstarEnLaPaginaDeBookingEIrAAlojamientos(String strActor, String strUrl) {
		System.out.println("Estoy en el Given...");
		OnStage.theActorCalled(Constants.getData(strActor)).wasAbleTo(Open.url(Constants.getData(strUrl)));
	}

	@When("Ingresa datos de prueba para filtrar alojamientos")
	public void ingresaDatosDePruebaParaFiltrarAlojamientos(DataTable dataTable)
			throws IllegalArgumentException, IllegalAccessException {
		System.out.println("Estoy en el When...");

		Map<String, String> data = dataTable.asMap(String.class, String.class);

		OnStage.theActorInTheSpotlight().wasAbleTo(SetBuscarData.formData(data));
	}

	@When("Filtrar hospedajes por {int}")
	public void filtrarHospedajesPor(Integer intTypeFilter) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("Estoy en el When2...");
		OnStage.theActorInTheSpotlight().wasAbleTo(SetFilters.formData(intTypeFilter));
		OnStage.theActorInTheSpotlight().wasAbleTo(SetHotelReservation.formData());
	}

	@Then("Imprimir por consola los datos de la reserva")
	public void imprimirPorConsolaLosDatosDeLaReserva() {
		System.out.println("Estoy en el Then...");
		SetHotelReservation.printData(OnStage.theActorInTheSpotlight());
	}
}
