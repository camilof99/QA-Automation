package com.sophossolutions.task;

import com.sophossolutions.ui.Guru99Pages.GuruLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetCredentialsLoginGuru implements Task{

	Target target;
	String username;
	String password;
	
	public SetCredentialsLoginGuru(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public SetCredentialsLoginGuru(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(username).into(GuruLoginPage.txtUser),
				Enter.theValue(password).into(GuruLoginPage.txtPassword),
				Click.on(GuruLoginPage.btnSubmit));
		
	}
	
	public static SetCredentialsLoginGuru with() {
		
		return Tasks.instrumented(SetCredentialsLoginGuru.class, "hola");
	}

	public static SetCredentialsLoginGuru form(String username, String password) {

		return Tasks.instrumented(SetCredentialsLoginGuru.class, username, password);
	}	
}
