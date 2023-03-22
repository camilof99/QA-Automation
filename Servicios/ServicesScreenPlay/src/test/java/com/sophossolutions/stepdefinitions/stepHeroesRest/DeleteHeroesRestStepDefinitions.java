package com.sophossolutions.stepdefinitions.stepHeroesRest;

import com.sophosolutions.task.ExecuteDelete;
import com.sophosolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DeleteHeroesRestStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	

}
