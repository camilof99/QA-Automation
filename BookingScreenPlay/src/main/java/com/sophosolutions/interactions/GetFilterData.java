package com.sophosolutions.interactions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sophosolutions.questions.TextOf;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;

public class GetFilterData implements Interaction {

	private Target tgtButtonElement;
	private Target tgtPuntElement;
	private Target tgtComeElement;

	public GetFilterData(Target tgtButtonElement, Target tgtPuntElement, Target tgtComeElement) {
		super();
		this.tgtButtonElement = tgtButtonElement;
		this.tgtPuntElement = tgtPuntElement;
		this.tgtComeElement = tgtComeElement;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		int i = 1;
		
		do {
			
			String strPuntuacion = TextOf.field(tgtPuntElement.of(i+"")).answeredBy(actor);
			String strComentarios = TextOf.field(tgtComeElement.of(i+"")).answeredBy(actor);
			System.out.println("i " + i);
			String reg = "\\d+";
			int intNumComentarios = 0;
			
			System.out.println(strComentarios);
			
			double intNumPuntuacion = Double.parseDouble(strPuntuacion.replace(",", "."));
			System.out.println(intNumPuntuacion);
			
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(strComentarios);
			
			if(matcher.find()) {
				intNumComentarios = Integer.parseInt(matcher.group());
			}
			
			if(intNumPuntuacion > 9 && intNumComentarios > 10) {
				System.out.println("i " + i);
				actor.attemptsTo(
						Click.on(tgtButtonElement.of(i+"")),
						Switch.toNewWindow()
						);
				i = 0;
			}else {
				i++;
			}
		
		}while(i != 0);
		
		System.out.println(99);
		
	}

	public static GetFilterData dateTime(Target tgtButtonElement, 
			Target tgtPuntElement, Target tgtComeElement) {
		return Tasks.instrumented(GetFilterData.class, tgtButtonElement, tgtPuntElement, tgtComeElement);
	}
}
