package com.sophossolutions.task;

import com.sophossolutions.interactions.ConsoleMessage;
import com.sophossolutions.models.UserCredentials;
import com.sophossolutions.ui.Guru99Pages.GuruLoginPage;
import com.sophossolutions.ui.NewToursPages.NewToursLoginPage;

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
				ConsoleMessage.withMessage("Mensaje console..."),
				Click.on(txtBtn));
		
		UserCredentials strLocal = actor.recall("Mensaje");
		System.out.println(strLocal);

	}

	public static SetCredentials formNewTours(String strUsername, String strPassword) {

		return Tasks.instrumented(SetCredentials.class, NewToursLoginPage.txtUsername, NewToursLoginPage.txtPassword, NewToursLoginPage.btnSubmit, strUsername, strPassword);
	}

	public static SetCredentials formGuru(String strUsername, String strPassword) {

		return Tasks.instrumented(SetCredentials.class, GuruLoginPage.txtUser, GuruLoginPage.txtPassword, GuruLoginPage.btnSubmit, strUsername, strPassword );
	}

}
