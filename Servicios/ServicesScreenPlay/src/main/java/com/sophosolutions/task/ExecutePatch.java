package com.sophosolutions.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import org.apache.http.HttpHeaders;

import com.sophosolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;

public class ExecutePatch implements Task{
	
	private String strEndpoint;
	private String strId;
	private String strToken;
	private String strData;

	public ExecutePatch(String strEndpoint, String strId, String strData, String strToken) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
		this.strToken = strToken;
		this.strData = strData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String jsonData;
		try {
			jsonData = new String(Files.readAllBytes(Path.of(Constants.getData(strData))));
			
			actor.attemptsTo(Patch.to(strEndpoint.concat(strId)).with(
					requestEspecification -> 
					requestEspecification.header(
							HttpHeaders.CONTENT_TYPE, ContentType.JSON)
					.auth().oauth2(strToken)
					.body(jsonData)));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static ExecutePatch withtokens(String strEndpoint, String strId, String strData, String strToken) {
		return Tasks.instrumented(ExecutePatch.class, strEndpoint, strId, strData, strToken);
	}

}
