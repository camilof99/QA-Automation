package com.sophosolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DateDaySelect implements Interaction{
	
	private String strDate;
	private Target tgtTextFecha;

	public DateDaySelect(Target tgtTextFecha, String strDate) {
		super();
		this.strDate = strDate;
		this.tgtTextFecha = tgtTextFecha;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(tgtTextFecha.of(strDate)));
		
	}

	public static DateDaySelect dateTime(Target tgtTextFecha, String strDate) {
		return Tasks.instrumented(DateDaySelect.class, tgtTextFecha, strDate);
	}

}
