package com.sophosolutions.task;

import org.apache.http.HttpHeaders;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class ExecuteDelete implements Task{
	
	private String strEndpoint;
	private String strId;
	private String strToken;
	
	public ExecuteDelete(String strEndpoint, String strId, String strToken) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
		this.strToken = strToken;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Delete.from(strEndpoint.concat(strId)).with(
				requestEspecification -> 
				requestEspecification.header(
						HttpHeaders.CONTENT_TYPE, ContentType.JSON)
				.auth().oauth2(strToken)));
		
		SerenityRest.lastResponse().prettyPeek();
	}

	public static ExecuteDelete withtokens(String strEndpoint, String strId, String strToken) {
		return Tasks.instrumented(ExecuteDelete.class, strEndpoint, strId, strToken);
	}
	
}
