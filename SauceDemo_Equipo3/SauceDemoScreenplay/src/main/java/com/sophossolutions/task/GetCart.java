package com.sophossolutions.task;

import com.sophossolutions.ui.SauceDemoGetCart;
import com.sophossolutions.ui.SauceDemoInventaryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GetCart implements Task {
	
	Target txtBtn;

	public GetCart(Target txtBtn) {
		super();
		this.txtBtn = txtBtn;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(txtBtn));

	}

	public static GetCart clickBtnCart() {

		return Tasks.instrumented(GetCart.class, SauceDemoInventaryPage.txtBtnCart);
	}
	
	public static GetCart clickBtnCheckout() {

		return Tasks.instrumented(GetCart.class, SauceDemoGetCart.txtBtnCheckout);
	}

}
