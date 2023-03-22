package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddCart implements Task{
	//Target txtBtn;
	String strBtn;
	String strBtn2;

	public AddCart( String strBtn, String strBtn2) {
		super();
		//this.txtBtn = txtBtn;
		this.strBtn = strBtn;
		this.strBtn2 = strBtn2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on("#" + strBtn), Click.on("#" + strBtn2));

	}

	public static AddCart clickBtn(String strBtn, String strBtn2) {

		return Tasks.instrumented(AddCart.class, strBtn, strBtn2);
	}

}