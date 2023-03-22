package com.sophossolutions.stepdefinition.SauceDemoCart;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoCart.SauceDemoGetCart;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilter;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilterName;
import com.sophossolutions.pages.SauceDemoFilters.SauceDemoFilterPrice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoGetCartStepDefinitions {

	SauceDemoGetCart sauceDemoGetCart;
	SauceDemoFilterName sauceDemoFilterName;

	@Managed
	WebDriver myBrowser;

	@Given("Debe ir a la pagina del carrito {string}")
	public void debeIrALaPaginaDelCarrito(String atr) {
		System.out.println("Estoy en el Given.GetCart..");
		sauceDemoGetCart.navegate(atr);
	}

	@Given("Ver mensaje {string}")
	public void verMensaje(String txt) {
		System.out.println("Estoy en el Given.GetCart...");
		sauceDemoGetCart.validateText(txt);
	}

	@When("Busco los productos en el carrito {string}")
	public void buscoLosProductosEnElCarrito(String itemAtr) {
		System.out.println("Estoy en el When.GetCart..");
		sauceDemoGetCart.validateItem(itemAtr);
	}

	@Then("Muestro por consola los productos del carrito")
	public void muestroPorConsolaLosProductosDelCarrito() {
		System.out.println("Estoy en el Then.GetCart..");
		System.out.println("\nProductos en el carrito: ");
		sauceDemoFilterName.getInventary();
	}
}
