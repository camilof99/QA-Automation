package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PassengerButton implements Interaction {
	private int intNumPassengers;
	private Target tgtBtnPlus;

	public PassengerButton(Target tgtBtnPlus, int intNumPassengers) {
		super();
		this.intNumPassengers = intNumPassengers;
		this.tgtBtnPlus = tgtBtnPlus;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		for (int i = 1; i < this.intNumPassengers; i++) {
			actor.attemptsTo(Click.on(this.tgtBtnPlus));
		}
	}

	public static PassengerButton btnInt(Target tgtBtnPlus, int intNumPassengers) {
		return Tasks.instrumented(PassengerButton.class, tgtBtnPlus, intNumPassengers);
	}
}
