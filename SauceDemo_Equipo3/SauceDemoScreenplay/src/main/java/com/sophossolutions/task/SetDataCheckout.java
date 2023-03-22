package com.sophossolutions.task;

import java.util.Map;

import com.sophossolutions.ui.SauceDemoCheckoutInfoPage;
import com.sophossolutions.ui.SauceDemoLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetDataCheckout implements Task{

	Target txtFirstname;
	Target txtLastname;
	Target txtZipcode;
	Target txtBtn;
	String strFirstname;
	String strLastname;
	String strZipcode;

	

	public SetDataCheckout(Target txtFirstname, Target txtLastname, Target txtZipcode, Target txtBtn,
			String strFirstname, String strLastname, String strZipcode) {
		super();
		this.txtFirstname = txtFirstname;
		this.txtLastname = txtLastname;
		this.txtZipcode = txtZipcode;
		this.txtBtn = txtBtn;
		this.strFirstname = strFirstname;
		this.strLastname = strLastname;
		this.strZipcode = strZipcode;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(strFirstname).into(txtFirstname), 
				Enter.theValue(strLastname).into(txtLastname),
				Enter.theValue(strZipcode).into(txtZipcode),
				/* ConsoleMessage.withMessage("Mensaje console..."), */
				Click.on(txtBtn));

	}

	public static SetDataCheckout formCheckout(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);

		return Tasks.instrumented(SetDataCheckout.class, SauceDemoCheckoutInfoPage.txtFirstname, 
				SauceDemoCheckoutInfoPage.txtLasname, SauceDemoCheckoutInfoPage.txtZipcode, 
				SauceDemoCheckoutInfoPage.btnSubmit, data.get("firstName"), data.get("lastName"), data.get("zipCode"));
	}

}