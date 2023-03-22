package com.sophosolutions.restinteractions;


import java.io.File;

import com.google.gson.Gson;
import com.sophosolutions.models.Prueba;

import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

public class RestPrueba {

	public static void prueba() {
		//String data = SerenityRest.lastResponse().asString();

		//Gson gson = new Gson();
		//ObjectMapper mapper = new ObjetcMapper(); //Analizar Json-Biblioteca Jackson

		//Prueba prueba = gson.fromJson(data, Prueba.class);
		
		Prueba prueba = SerenityRest.lastResponse().as(Prueba.class);

		System.out.println(prueba.getData().get(1).getEmail());
	}
}
