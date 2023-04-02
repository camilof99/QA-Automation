package com.sophosolutions.task;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.sophosolutions.interactions.ClickDoubleButton;
import com.sophosolutions.interactions.DateTimeSelect;
import com.sophosolutions.interactions.NiñosSelect;
import com.sophosolutions.ui.BookingBuscarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetBuscarData implements Task {

	Target tgtInputDestino;
	Target tgtBtnDate;
	Target tgtBtnMesNext;
	Target tgtTextFechaIn;
	Target tgtTextFechaOn;
	Target tgtDate;
	Target tgtBtnPersonas;
	Target tgtInputAdultos;
	Target tgtBtnAdultosMenos;
	Target tgtBtnAdultosMas;
	Target tgtTextAdultos;
	Target tgtBtnNiñosMenos;
	Target tgtBtnNiñosMas;
	Target tgtTextNiños;
	Target tgtSelectCantNiños;
	Target tgtBtnHabiMas;
	Target tgtBtnHabiMenos;
	Target tgtTextHabi;
	Target tgtBtnListoPersonas;
	Target tgtBtnBuscar;
	String strInputDestino;
	String strDateIda;
	String strDateVuelta;
	String strAdultos;
	String strNiños;
	String strHabi;

	public SetBuscarData(Map<String, Target> dataTarget, Map<String, String> data) {
		super();

		this.tgtInputDestino = dataTarget.get("tgtInputDestino");
		this.tgtBtnDate = dataTarget.get("tgtBtnDate");
		this.tgtBtnMesNext = dataTarget.get("tgtBtnMesNext");
		this.tgtTextFechaIn = dataTarget.get("tgtTextFechaIn");
		this.tgtTextFechaOn = dataTarget.get("tgtTextFechaOn");
		this.tgtDate = dataTarget.get("tgtDate");
		this.tgtBtnPersonas = dataTarget.get("tgtBtnPersonas");
		this.tgtInputAdultos = dataTarget.get("tgtInputAdultos");
		this.tgtBtnAdultosMenos = dataTarget.get("tgtBtnAdultosMenos");
		this.tgtBtnAdultosMas = dataTarget.get("tgtBtnAdultosMas");
		this.tgtTextAdultos = dataTarget.get("tgtTextAdultos");
		this.tgtBtnNiñosMenos = dataTarget.get("tgtBtnNiñosMenos");
		this.tgtBtnNiñosMas = dataTarget.get("tgtBtnNiñosMas");
		this.tgtTextNiños = dataTarget.get("tgtTextNiños");
		this.tgtSelectCantNiños = dataTarget.get("tgtSelectCantNiños");
		this.tgtBtnHabiMas = dataTarget.get("tgtBtnHabiMas");
		this.tgtBtnHabiMenos = dataTarget.get("tgtBtnHabiMenos");
		this.tgtTextHabi = dataTarget.get("tgtTextHabi");
		this.tgtBtnListoPersonas = dataTarget.get("tgtBtnListoPersonas");
		this.tgtBtnBuscar = dataTarget.get("tgtBtnBuscar");

		this.strInputDestino = data.get("destino");
		this.strDateIda = data.get("fechaIn");
		this.strDateVuelta = data.get("fechaOn");
		this.strAdultos = data.get("adultos");
		this.strNiños = data.get("niños");
		this.strHabi = data.get("habitaciones");

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
			Click.on(BookingBuscarPage.banner),
			
			Enter.theValue(strInputDestino).into(tgtInputDestino), 
			Click.on(tgtBtnDate),
			
			DateTimeSelect.dateTime(tgtBtnMesNext, tgtTextFechaIn, tgtDate, strDateIda),
			DateTimeSelect.dateTime(tgtBtnMesNext, tgtTextFechaOn, tgtDate, strDateVuelta),
			
			Click.on(tgtBtnPersonas),
			ClickDoubleButton.selectAdultos(tgtBtnAdultosMas, tgtBtnAdultosMenos,
					tgtTextAdultos, strAdultos),
			
			NiñosSelect.selectNiños(tgtBtnNiñosMas, tgtBtnNiñosMenos,
					tgtTextNiños, tgtSelectCantNiños, strNiños),
			
			ClickDoubleButton.selectAdultos(tgtBtnHabiMas, tgtBtnHabiMenos,
					tgtTextHabi, strHabi),
			
			Click.on(tgtBtnBuscar)
			
			);
	}

	public static SetBuscarData formData(Map<String, String> data)
			throws IllegalArgumentException, IllegalAccessException {

		return Tasks.instrumented(SetBuscarData.class, dataTarget(), data);
	}

	public static Map<String, Target> dataTarget() throws IllegalArgumentException, IllegalAccessException {
		Map<String, Target> data = new HashMap<String, Target>();

		Field[] fields = BookingBuscarPage.class.getDeclaredFields();

		for (Field field : fields) {
			data.put(field.getName(), (Target) field.get(null));
		}

		return data;
	}
}
