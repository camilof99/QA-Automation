package com.sophosolutions.interactions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sophosolutions.questions.TextOf;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;

public class SetPause implements Interaction{

	public SetPause() {
		super();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		System.out.println(110);
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static SetPause time() {
		return Tasks.instrumented(SetPause.class);
	}
}
