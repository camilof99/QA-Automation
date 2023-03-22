package com.sophosolutions.task;

import com.sophosolutions.utils.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ExecuteGet implements Task {

	private String strEndpoint;
	private String strId;

	public ExecuteGet(String strEndpoint, String strId) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Get.resource(strEndpoint.concat(strId)).with(
				requestEspecification -> requestEspecification.auth()
				.oauth2(Constants.getData("Token Heroes Rest"))));

		SerenityRest.lastResponse().prettyPeek();
	}

	public static ExecuteGet withtokens(String strEndpoint, String strId) {

		return Tasks.instrumented(ExecuteGet.class, strEndpoint, strId);
	}

}
