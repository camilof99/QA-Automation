package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElementOf implements Question<Boolean>{
	Target txtItem;

	public ElementOf(Target txtItem) {
		this.txtItem = txtItem;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		actor.wasAbleTo(WaitUntil.the(txtItem, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
		return Visibility.of(txtItem).answeredBy(actor);
	}

	public static ElementOf field(Target txtItem) {

		return new ElementOf(txtItem);
	}

}
