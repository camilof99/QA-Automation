package com.sophossolutions.task;

import java.util.Map;

import com.sophossolutions.interactions.DateTimeSelect;
import com.sophossolutions.interactions.PassengerButton;
import com.sophossolutions.ui.DespegarSearchFlightsPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetFlightData implements Task {
	Target tgtInputOrigen;
	Target tgtInputDestino;
	Target tgtBtnDate;
	Target tgtListOptionOrigen;
	Target tgtListOptionDestino;
	Target tgtDay;
	Target tgtDateTimeAplicar;
	Target tgtBtnPasajeros;
	Target tgtPasajerosAdultos;
	Target tgtAplicarPassenger;
	Target tgtSearchFlights;
	String strInputOrigen;
	String strInputDestino;
	String strDateIda;
	String strDateVuelta;
	int intValuePassengers;
	
	

	public SetFlightData(Target tgtInputOrigen, Target tgtInputDestino, Target tgtBtnDate, Target tgtListOptionOrigen,
			Target tgtListOptionDestino, Target tgtDay, Target tgtDateTimeAplicar, Target tgtBtnPasajeros,
			Target tgtPasajerosAdultos, Target tgtAplicarPassenger, Target tgtSearchFlights, String strInputOrigen,
			String strInputDestino, String strDateIda, String strDateVuelta, int intValuePassengers) {
		super();
		this.tgtInputOrigen = tgtInputOrigen;
		this.tgtInputDestino = tgtInputDestino;
		this.tgtBtnDate = tgtBtnDate;
		this.tgtListOptionOrigen = tgtListOptionOrigen;
		this.tgtListOptionDestino = tgtListOptionDestino;
		this.tgtDay = tgtDay;
		this.tgtDateTimeAplicar = tgtDateTimeAplicar;
		this.tgtBtnPasajeros = tgtBtnPasajeros;
		this.tgtPasajerosAdultos = tgtPasajerosAdultos;
		this.tgtAplicarPassenger = tgtAplicarPassenger;
		this.tgtSearchFlights = tgtSearchFlights;
		this.strInputOrigen = strInputOrigen;
		this.strInputDestino = strInputDestino;
		this.strDateIda = strDateIda;
		this.strDateVuelta = strDateVuelta;
		this.intValuePassengers = intValuePassengers;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Click.on(DespegarSearchFlightsPage.banner),
				
				Click.on(tgtInputOrigen),
				Enter.theValue(strInputOrigen).into(tgtInputOrigen),
				Click.on(tgtListOptionOrigen),
				
				Click.on(tgtInputDestino),
				Enter.theValue(strInputDestino).into(tgtInputDestino),
				Click.on(tgtListOptionDestino),
				
				Click.on(tgtBtnDate),
				
				DateTimeSelect.dateTime(DespegarSearchFlightsPage.tgtDay, strDateIda),
				DateTimeSelect.dateTime(DespegarSearchFlightsPage.tgtDay, strDateVuelta),
				
				Click.on(tgtDateTimeAplicar),
				
				
				Click.on(tgtBtnPasajeros),
				PassengerButton.btnInt(tgtPasajerosAdultos, intValuePassengers),
				Click.on(tgtAplicarPassenger),
				Click.on(tgtSearchFlights)
				
				);
	}

	public static SetFlightData formData(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);

		return Tasks.instrumented(SetFlightData.class, 
				DespegarSearchFlightsPage.tgtInputOrigen, 
				DespegarSearchFlightsPage.tgtInputDestino,
				DespegarSearchFlightsPage.tgtBtnDate,
				DespegarSearchFlightsPage.tgtListOptionOrigen,
				DespegarSearchFlightsPage.tgtListOptionDestino,
				DespegarSearchFlightsPage.tgtDay,
				DespegarSearchFlightsPage.tgtDateTimeAplicar,
				DespegarSearchFlightsPage.tgtBtnPasajeros,
				DespegarSearchFlightsPage.tgtPasajerosAdultos,
				DespegarSearchFlightsPage.tgtAplicarPassenger,
				DespegarSearchFlightsPage.tgtSearchFlights,
				data.get("origen"), 
				data.get("destino"),
				data.get("dateIda"),
				data.get("dateVuelta"),
				Integer.parseInt(data.get("valuePassengers")));
	}
}
