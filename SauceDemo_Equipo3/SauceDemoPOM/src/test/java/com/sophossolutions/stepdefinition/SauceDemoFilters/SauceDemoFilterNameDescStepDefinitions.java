package com.sophossolutions.stepdefinition.SauceDemoFilters;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoInventary;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilter;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilterName;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoFilterNameDescStepDefinitions {

	SauceDemoFilterName sauceDemoFilterName;
	SauceDemoFilter sauceDemoFilter;
	SauceDemoInventary sauceDemoInventary;

	@Managed
	WebDriver myBrowser;

	@Given("El usario debe estar en la pagina del inventario {string}")
	public void elUsarioDebeEstarEnLaPaginaDelInventario(String text) {
		System.out.println("Estoy en el Given.FilterNameDesc...");
		// sauceDemoFilterName.navegate(Constants.getData(key));
		sauceDemoInventary.validateText(text);
	}

	@When("Selecciona campo con el filtro Desc Z - A {string}")
	public void seleccionaCampoConElFiltroDescZA(String option) {
		System.out.println("Estoy en el When.FilterNameDesc...");
		sauceDemoFilter.filter(option);
	}

	@Then("Imprimir en consola los productos ordenados Desc")
	public void imprimirEnConsolaLosProductosOrdenadosDesc() {
		System.out.println("Estoy en el Then.FilterNameDesc...");
		sauceDemoFilterName.getInventaryDesc();
	}

}
