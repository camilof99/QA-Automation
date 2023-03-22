package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = {"com.sophossolutions.stepdefinition.SauceDemoCart","com.sophossolutions.stepdefinition"},
		features = "src/test/resources/com/sophossolutions/features/sauce_demo_add_cart.feature",
		snippets = SnippetType.CAMELCASE
		)
public class SauceDemoAddCart {

}
