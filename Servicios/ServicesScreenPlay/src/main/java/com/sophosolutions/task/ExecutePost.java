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
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ExecutePost implements Task{
	private String strEndpoint;
	private String strData;
	private String strToken;

	public ExecutePost(String strEndpoint, String strData, String strToken) {
		super();
		this.strEndpoint = strEndpoint;
		this.strData = strData;
		this.strToken = strToken;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String jsonData;
		try {
			jsonData = new String(Files.readAllBytes(Path.of(Constants.getData(strData))));
			
			actor.attemptsTo(Post.to(strEndpoint).with(
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

	public static ExecutePost withtokens(String strEndpoint, String strData, String strToken) {
		return Tasks.instrumented(ExecutePost.class, strEndpoint, strData, strToken);
	}
	
}
