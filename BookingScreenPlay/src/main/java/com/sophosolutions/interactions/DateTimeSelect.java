package com.sophosolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DateTimeSelect implements Interaction{
	
	private String strDate;
	private Target tgtBtnMesNext;
	private Target tgtTextFecha;
	private Target tgtDate;

	public DateTimeSelect(Target tgtBtnMesNext, Target tgtTextFecha, Target tgtDate, String strDate) {
		super();
		this.strDate = strDate;
		this.tgtBtnMesNext = tgtBtnMesNext;
		this.tgtTextFecha = tgtTextFecha;
		this.tgtDate = tgtDate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				DateMesSelect.dateTime(tgtBtnMesNext, tgtTextFecha, strDate),
				DateDaySelect.dateTime(tgtDate, strDate)
				);
		
	}

	public static DateTimeSelect dateTime(
			Target tgtBtnMesNext, Target tgtTextFecha, 
			Target tgtDate,  String strDate) {
		
		return Tasks.instrumented(DateTimeSelect.class, 
				tgtBtnMesNext, tgtTextFecha, tgtDate, strDate);
	}

}
