package com.sophossolutions.task;

import com.sophossolutions.interactions.ConsoleMessageInformationCheckout;
import com.sophossolutions.models.InformationCheckoutOverview;
import com.sophossolutions.ui.SauceDemoCheckoutOverviewPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PrintInformationCheckout implements Task {
	Target txtPaymentInformation;
	Target txtSubTotal;
	Target txtTax;
	Target txtTotal;
	Target txtBtn;

	public PrintInformationCheckout(Target txtPaymentInformation, Target txtSubTotal, Target txtTax, Target txtTotal, Target txtBtn) {
		super();
		this.txtPaymentInformation = txtPaymentInformation;
		this.txtSubTotal = txtSubTotal;
		this.txtTax = txtTax;
		this.txtTotal = txtTotal;
		this.txtBtn = txtBtn;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String elementInfo = txtPaymentInformation.resolveFor(actor).getText();
		String elementSubtotal = txtSubTotal.resolveFor(actor).getText();
		String elementTax = txtTax.resolveFor(actor).getText();
		String elementTotal = txtTotal.resolveFor(actor).getText();
		
		actor.attemptsTo(
				ConsoleMessageInformationCheckout.withMessage(elementInfo, elementSubtotal, elementTax, elementTotal),
				Click.on(txtBtn));
		
	}

	public static PrintInformationCheckout getData() {

		return Tasks.instrumented(PrintInformationCheckout.class, SauceDemoCheckoutOverviewPage.txtInfo, 
				SauceDemoCheckoutOverviewPage.txtSubtotal, SauceDemoCheckoutOverviewPage.txtTax, 
				SauceDemoCheckoutOverviewPage.txtTotal, SauceDemoCheckoutOverviewPage.btnSubmit);
	}
	
	public static <T extends Actor> void printData(T actor) {
		InformationCheckoutOverview strLocal = actor.recall("InfoCompra");
		System.out.println(strLocal);
	}

}
