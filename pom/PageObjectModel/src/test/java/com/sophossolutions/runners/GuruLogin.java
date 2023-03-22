package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) // mandamos la clase que contiene todas las instrucciones
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinition", // donde va el paquete 
		features = "src/test/resources/com/sophossolutions/features/guru_login.feature", // especificar cual es el feature
		snippets = SnippetType.CAMELCASE
		)
public class GuruLogin {

}
