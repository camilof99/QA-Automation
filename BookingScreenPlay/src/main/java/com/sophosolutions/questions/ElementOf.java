package com.sophosolutions.questions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementOf implements Question<WebElement>{

	private Target tgtDivElement;
	private Target tgtPuntElement;
	private Target tgtComeElement;

	

	public ElementOf(Target tgtDivElement, Target tgtPuntElement, Target tgtComeElement) {
		super();
		this.tgtDivElement = tgtDivElement;
		this.tgtPuntElement = tgtPuntElement;
		this.tgtComeElement = tgtComeElement;
	}

	@Override
	public WebElement answeredBy(Actor actor) {
		//actor.wasAbleTo(WaitUntil.the(tgtTextPage, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
		//return Text.of(tgtTextPage).answeredBy(actor);
		
		WebElementFacade cardData = tgtDivElement.resolveFor(actor);
		WebElement elementsP = cardData.findElement(By.xpath(tgtPuntElement.getCssOrXPathSelector()));
		WebElement elementsC = cardData.findElement(By.xpath(tgtComeElement.getCssOrXPathSelector()));
		
		return elementsP/*.filter(
				element -> Double.parseDouble(
						element.getText().replace(",", ".")) > 9 && 2 == 2)
				.findFirst().orElse(null)*/;
		
	}

	public static ElementOf field(Target tgtDivElement, Target tgtPuntElement, Target tgtComeElement) {

		return new ElementOf(tgtDivElement, tgtPuntElement, tgtComeElement);
	}
}
