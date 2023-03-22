package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TextOf implements Question<String>{
	Target textUser;

	public TextOf(Target textUser) {
		this.textUser = textUser;
	}

	@Override
	public String answeredBy(Actor actor) {
		actor.wasAbleTo(WaitUntil.the(textUser, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
		return Text.of(textUser).answeredBy(actor);
	}

	public static TextOf field(Target txtUser) {

		return new TextOf(txtUser);
	}
}
