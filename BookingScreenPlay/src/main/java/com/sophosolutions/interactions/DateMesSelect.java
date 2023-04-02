package com.sophosolutions.interactions;

import com.sophosolutions.questions.TextOf;
import com.sophosolutions.ui.BookingBuscarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DateMesSelect implements Interaction{
	
	private String strDate;
	private Target tgtBtnMesNext;
	private Target tgtTextFechaIn;

	public DateMesSelect(Target tgtBtnMesNext, Target tgtTextFechaIn, String strDate) {
		super();
		this.strDate = strDate;
		this.tgtBtnMesNext = tgtBtnMesNext;
		this.tgtTextFechaIn = tgtTextFechaIn;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String[] date = strDate.split(" ");
		
		String ok = TextOf.field(tgtTextFechaIn).answeredBy(actor);
		
		while(!TextOf.field(tgtTextFechaIn).answeredBy(actor).contains(date[1])) {
			
			actor.attemptsTo(Click.on(tgtBtnMesNext.of(date[1])));
		}
		
	}

	public static DateMesSelect dateTime(Target tgtBtnMesNext, Target tgtTextFechaIn, String strDate) {
		return Tasks.instrumented(DateMesSelect.class, tgtBtnMesNext, tgtTextFechaIn, strDate);
	}

}
