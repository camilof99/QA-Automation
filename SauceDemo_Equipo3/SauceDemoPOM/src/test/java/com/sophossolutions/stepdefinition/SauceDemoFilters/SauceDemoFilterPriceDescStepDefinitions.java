package com.sophossolutions.stepdefinition.SauceDemoFilters;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilter;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilterPrice;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoFilterPriceDescStepDefinitions {
	SauceDemoFilterPrice sauceDemoFilterPrice;
	SauceDemoFilter sauceDemoFilter;

	@Managed
	WebDriver myBrowser;

	@When("Selecciona campo con el filtro Desc Low - High {string}")
	public void seleccionaCampoConElFiltroDescLowHigh(String option) {
		System.out.println("Estoy en el When.FilterPrecioDesc...");
		sauceDemoFilter.filter(option);
	}

	@Then("Imprimir en consola los productos ordenados por precio Desc")
	public void imprimirEnConsolaLosProductosOrdenadosPorPrecioDesc() {
		System.out.println("Estoy en el Then.FilterPrecioDesc...");
		sauceDemoFilterPrice.getInventaryDesc();
	}
}
