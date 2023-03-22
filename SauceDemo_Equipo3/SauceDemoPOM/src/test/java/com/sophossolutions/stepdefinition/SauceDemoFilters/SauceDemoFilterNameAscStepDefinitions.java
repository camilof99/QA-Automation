package com.sophossolutions.stepdefinition.SauceDemoFilters;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilter;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilterName;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoFilterNameAscStepDefinitions {
	SauceDemoFilter sauceDemoFilter;
	SauceDemoFilterName sauceDemoFilterName;

	@Managed
	WebDriver myBrowser;

	@When("Selecciona campo con el fitro Asc A - Z {string}")
	public void seleccionaCampoConElFitroAscAZ(String option) {
		System.out.println("Estoy en el When.FilterNameAsc...");
		sauceDemoFilter.filter(option);
	}

	@Then("Imprimir en consola los productos ordenados Asc")
	public void imprimirEnConsolaLosProductosOrdenadosAsc() {
		System.out.println("Estoy en el Then.FilterNameAsc...");
		sauceDemoFilterName.getInventaryAsc();
	}
}
