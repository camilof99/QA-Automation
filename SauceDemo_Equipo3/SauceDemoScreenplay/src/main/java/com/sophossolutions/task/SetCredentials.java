package com.sophossolutions.task;

import com.sophossolutions.ui.SauceDemoLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetCredentials implements Task {

	Target txtUsername;
	Target txtPassword;
	Target txtBtn;
	String strUsername;
	String strPassword;

	public SetCredentials(Target txtUsername, Target txtPassword, Target txtBtn, String strUsername,
			String strPassword) {
		super();
		this.txtUsername = txtUsername;
		this.txtPassword = txtPassword;
		this.txtBtn = txtBtn;
		this.strUsername = strUsername;
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(strUsername).into(txtUsername), 
				Enter.theValue(strPassword).into(txtPassword),
				/*ConsoleMessage.withMessage("Mensaje console..."),*/
				Click.on(txtBtn));

	}

	public static SetCredentials formSauceDemo(String strUsername, String strPassword) {

		return Tasks.instrumented(SetCredentials.class, SauceDemoLoginPage.txtUsername, SauceDemoLoginPage.txtPassword, SauceDemoLoginPage.btnSubmit, strUsername, strPassword);
	}

}
