package com.sophosolutions.interactions;

import com.sophosolutions.questions.TextOf;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ClickDoubleButton implements Interaction{

	
	private String strAdultos;
	private Target tgtBtnAdultosMas;
	private Target tgtBtnAdultosMenos;
	private Target tgtTextAdultos;

	public ClickDoubleButton(Target tgtBtnAdultosMas, Target tgtBtnAdultosMenos, 
			Target tgtTextAdultos, String strAdultos) {
		super();
		this.strAdultos = strAdultos;
		this.tgtBtnAdultosMas = tgtBtnAdultosMas;
		this.tgtBtnAdultosMenos = tgtBtnAdultosMenos;
		this.tgtTextAdultos = tgtTextAdultos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		System.out.println(strAdultos);
		
		while(!TextOf.field(tgtTextAdultos).answeredBy(actor).equals(strAdultos)) {
		
			if(TextOf.field(tgtTextAdultos).answeredBy(actor).compareTo(strAdultos) < 0) {
				System.out.println(TextOf.field(tgtTextAdultos).answeredBy(actor));
				System.out.println(strAdultos);
				actor.attemptsTo(Click.on(tgtBtnAdultosMas));
			}else {
				actor.attemptsTo(Click.on(tgtBtnAdultosMenos));
			}
		}
	}

	public static ClickDoubleButton selectAdultos(
			Target tgtBtnAdultosMas, Target tgtBtnAdultosMenos, 
			Target tgtTextAdultos, String strAdultos) {
		
		return Tasks.instrumented(ClickDoubleButton.class, 
				tgtBtnAdultosMas, tgtBtnAdultosMenos, 
				tgtTextAdultos, strAdultos);
	}
}
