package com.sophossolutions.questions;

import java.util.List;

import com.sophossolutions.ui.SauceDemoInventaryPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElementsFiltersPrice implements Question<Boolean>{
	Target txtItem;

	public ElementsFiltersPrice(Target txtItem) {
		this.txtItem = txtItem;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		actor.wasAbleTo(WaitUntil.the(txtItem, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
		
		List<WebElementFacade> productos = txtItem.resolveAllFor(actor);
		
		for (WebElementFacade product : productos) {
			System.out.println(product.getText());
		}
		
		return true;
	}

	public static ElementsFiltersPrice field() {

		return new ElementsFiltersPrice(SauceDemoInventaryPage.txtProductsPrice);
	}
}
