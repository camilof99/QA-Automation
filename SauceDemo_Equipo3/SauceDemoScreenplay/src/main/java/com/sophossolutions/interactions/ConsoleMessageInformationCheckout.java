package com.sophossolutions.interactions;

import com.sophossolutions.models.InformationCheckoutOverview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ConsoleMessageInformationCheckout implements Interaction{
	String elementInfo;
	String elementSubtotal;
	String elementTax;
	String elementTotal;

	public ConsoleMessageInformationCheckout(String elementInfo, String elementSubtotal, String elementTax,
			String elementTotal) {
		super();
		this.elementInfo = elementInfo;
		this.elementSubtotal = elementSubtotal;
		this.elementTax = elementTax;
		this.elementTotal = elementTotal;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Información de la Compra: ");
		actor.remember("InfoCheckout", new InformationCheckoutOverview(elementInfo, elementSubtotal, elementTax, elementTotal));
	}

	public static ConsoleMessageInformationCheckout withMessage(String elementInfo, String elementSubtotal, 
			String elementTax, String elementTotal) {
		return Tasks.instrumented(ConsoleMessageInformationCheckout.class, elementInfo, elementInfo, elementTax, elementTotal );
	}

}
