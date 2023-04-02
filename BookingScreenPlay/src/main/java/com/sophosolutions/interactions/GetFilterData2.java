package com.sophosolutions.interactions;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophosolutions.questions.ElementOf;
import com.sophosolutions.questions.TextOf;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;

public class GetFilterData2 implements Interaction {

	private Target tgtButtonElement;
	private Target tgtConfortElement;

	public GetFilterData2(Target tgtButtonElement, Target tgtConfortElement) {
		super();
		this.tgtButtonElement = tgtButtonElement;
		this.tgtConfortElement = tgtConfortElement;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		int i = 1;
		
		System.out.println(65);
		
		do {
			
			String strConfort = TextOf.field(tgtConfortElement.of(i+"")).answeredBy(actor);
			System.out.println("i " + i);
			String reg = "\\d+(,\\d+)?";
			double dblNumConfort = 0;
			
			System.out.println(strConfort);
			
			
			
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(strConfort);
			
			if(matcher.find()) {
				strConfort = matcher.group();
			}
	
			dblNumConfort = Double.parseDouble(strConfort.replace(",", "."));
					
			System.out.println(strConfort);
			System.out.println(dblNumConfort);
			
			
			if(dblNumConfort > 9) {
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

	public static GetFilterData2 dateTime(Target tgtButtonElement, Target tgtConfortElement) {
		return Tasks.instrumented(GetFilterData2.class, 
				tgtButtonElement, tgtConfortElement);
	}
}
