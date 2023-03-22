package com.sophossolutions.runners.runnersHeroesRest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinitions", 
		features = "src/test/resources/com/sophossolutions/features/",
		tags = "@getHeroes",
		snippets = SnippetType.CAMELCASE)
public class GetHeroesRest {

}
