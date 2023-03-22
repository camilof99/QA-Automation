package com.sophossolutions.task;

import com.sophossolutions.ui.SauceDemoFiltersPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFilters implements Task {
	Target txtSelect;
	String strOption;

	public SelectFilters(Target txtSelect, String strOption) {
		super();
		this.txtSelect = txtSelect;
		this.strOption = strOption;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(SelectFromOptions.byValue(strOption).from(txtSelect));
		
	}

	public static SelectFilters selectOption(String strOption) {

		return Tasks.instrumented(SelectFilters.class, SauceDemoFiltersPage.txtSelect, strOption);
	}

}
