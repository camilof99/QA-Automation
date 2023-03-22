package com.sophossolutions.stepdefinition.SauceDemoFilters;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilter;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilterPrice;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoFilterPriceAscStepDefinitions {
	SauceDemoFilterPrice sauceDemoFilterPrice;
	SauceDemoFilter sauceDemoFilter;

	@Managed
	WebDriver myBrowser;

	@When("Selecciona campo con el filtro Asc Low - High {string}")
	public void seleccionaCampoConElFitroAscLowHigh(String option) {
		System.out.println("Estoy en el When.FilterPrecioAsc...");
		sauceDemoFilter.filter(option);
	}

	@Then("Imprimir en consola los productos ordenados por precio Asc")
	public void imprimirEnConsolaLosProductosOrdenadosPorPrecioAsc() {
		System.out.println("Estoy en el Then.FilterPrecioAsc...");
		sauceDemoFilterPrice.getInventaryAsc();
	}
}
