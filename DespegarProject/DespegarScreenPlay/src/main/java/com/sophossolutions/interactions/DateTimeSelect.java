package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class DateTimeSelect implements Interaction{
	private String strDate;
	private Target tgtDateTime;

	public DateTimeSelect(Target tgtDateTime, String strDate) {
		super();
		this.strDate = strDate;
		this.tgtDateTime = tgtDateTime;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String[] date = strDate.split("/");
		
		actor.attemptsTo(Click.on(this.tgtDateTime.of(date[1], date[0])));
		
	}

	public static DateTimeSelect dateTime(Target tgtDateTime, String strDate) {
		return Tasks.instrumented(DateTimeSelect.class, tgtDateTime, strDate);
	}
	
}
