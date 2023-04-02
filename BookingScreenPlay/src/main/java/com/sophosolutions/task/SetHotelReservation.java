package com.sophosolutions.task;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.sophosolutions.interactions.GetFilterData;
import com.sophosolutions.interactions.SaveInformation;
import com.sophosolutions.models.InformationData;
import com.sophosolutions.ui.BookingBuscarPage;
import com.sophosolutions.ui.BookingHotelReservationPage;
import com.sophosolutions.ui.BookingResultFiltersPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SetHotelReservation implements Task{

	Target tgtSelectHotel;
	Target tgtBtnDispo;
	Target tgtTextEntrada;
	Target tgtTextSalida;
	Target tgtDuracion;
	Target tgtPrecio;

	public SetHotelReservation(Map<String, Target> dataTarget) {
		super();

		this.tgtSelectHotel = dataTarget.get("tgtSelectHotel");
		this.tgtBtnDispo = dataTarget.get("tgtBtnDispo");
		this.tgtTextEntrada = dataTarget.get("tgtTextEntrada");
		this.tgtTextSalida = dataTarget.get("tgtTextSalida");
		this.tgtDuracion = dataTarget.get("tgtDuracion");
		this.tgtPrecio = dataTarget.get("tgtPrecio");

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		System.out.println(77);
		
		actor.attemptsTo(
				WaitUntil.the(tgtSelectHotel, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds(),
				Click.on(tgtSelectHotel),
				SelectFromOptions.byValue("1").from(tgtSelectHotel),
				WaitUntil.the(tgtBtnDispo, WebElementStateMatchers.isClickable()).forNoMoreThan(50).seconds(),
				Click.on(tgtBtnDispo),
				SaveInformation.withMessage(tgtTextEntrada, tgtTextSalida, tgtDuracion, tgtPrecio)
				);
		
	}

	public static SetHotelReservation formData()
			throws IllegalArgumentException, IllegalAccessException {

		return Tasks.instrumented(SetHotelReservation.class, dataTarget());
	}
	
	public static <T extends Actor> void printData(T actor) {
		InformationData strLocal = actor.recall("InfoData");
		System.out.println(strLocal);
	}

	public static Map<String, Target> dataTarget() throws IllegalArgumentException, IllegalAccessException {
		Map<String, Target> data = new HashMap<String, Target>();
		
		
		Field[] fields = BookingHotelReservationPage.class.getDeclaredFields();

		for (Field field : fields) {
			data.put(field.getName(), (Target) field.get(null));
		}

		return data;
	}

}
