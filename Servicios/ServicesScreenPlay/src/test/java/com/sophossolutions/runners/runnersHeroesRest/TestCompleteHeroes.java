package com.sophossolutions.runners.runnersHeroesRest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/*@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinitions", 
		features = "src/test/resources/com/sophossolutions/features/", 
		tags = "@run",
		snippets = SnippetType.CAMELCASE)*/

@RunWith(Suite.class)
@SuiteClasses({
	PostHeroesRest.class , GetHeroesRest.class
})
public class TestCompleteHeroes {

}
