package com.sophosolutions.interactions;

import com.sophosolutions.questions.TextOf;
import com.sophosolutions.ui.BookingBuscarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class NiñosSelect implements Interaction{

	
	private String strNiños;
	private Target tgtBtnNiñosMas;
	private Target tgtBtnNiñoMenos;
	private Target tgtTextNiños;
	private Target tgtSelectCantNiños;

	public NiñosSelect(Target tgtBtnNiñosMas, Target tgtBtnNiñoMenos, 
			Target tgtTextNiños, Target tgtSelectCantNiños, String strNiños) {
		super();
		this.strNiños = strNiños;
		this.tgtBtnNiñoMenos = tgtBtnNiñoMenos;
		this.tgtBtnNiñosMas = tgtBtnNiñosMas;
		this.tgtTextNiños = tgtTextNiños;
		this.tgtSelectCantNiños = tgtSelectCantNiños;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String[] datosNiño = strNiños.split("/");
		
		System.out.println(datosNiño[0]);
		
		while(!TextOf.field(tgtTextNiños).answeredBy(actor).equals(datosNiño[0])) {
			System.out.println("ok");
			if(TextOf.field(tgtTextNiños).answeredBy(actor).compareTo(datosNiño[0]) < 0) {
				System.out.println("ok1");
				System.out.println(tgtBtnNiñosMas);
				actor.attemptsTo(Click.on(tgtBtnNiñosMas));
			}else {
				System.out.println("ok2");
				actor.attemptsTo(Click.on(tgtBtnNiñoMenos));
			}
		}
		
		int j = Integer.parseInt(datosNiño[0]);
		
		for (int i = 0; i < j; i++) {
			System.out.println(datosNiño[(i)+1]);
			System.out.println(tgtSelectCantNiños.of((i)+1+""));
			actor.attemptsTo(
					Click.on(tgtSelectCantNiños.of((i)+1+"")),
					SelectFromOptions.byValue(datosNiño[(i)+1]).from(tgtSelectCantNiños.of((i)+1+""))
					);
		}
	}

	public static NiñosSelect selectNiños(
			Target tgtBtnNiñosMas, Target tgtBtnNiñosMenos, 
			Target tgtTextNiños, Target tgtSelectCantNiños, String strNiños) {
		
		return Tasks.instrumented(NiñosSelect.class, 
				tgtBtnNiñosMas, tgtBtnNiñosMenos, 
				tgtTextNiños, tgtSelectCantNiños, strNiños);
	}
}
