package com.sophossolutions.stepdefinition.SauceDemoCart;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.pages.SauceDemoInventary;
import com.sophossolutions.pages.SauceDemoCart.SauceDemoAddCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class SauceDemoAddCartStepDefinitions {
	SauceDemoAddCart sauceDemoAddCart;
	SauceDemoInventary sauceDemoInventary;
	
	@Managed
	WebDriver myBrowser;

	@Given("Debe estar en la página del inventario {string}")
	public void debeEstarEnLaPáginaDelInventario(String text) {
		System.out.println("Estoy en el Given.AddCart..");
		sauceDemoInventary.validateText(text);
	}

	@When("Clickea los productos a agregar {string} y {string}")
	public void clickeaLosProductosAAgregarY(String item1, String item2) {
		System.out.println("Estoy en el When.AddCart..");
		sauceDemoAddCart.addProduct(item1);
		sauceDemoAddCart.addProduct(item2);
	}
	
	@Then("Valido que los productos se agreguen correctamente {string}")
	public void validoQueLosProductosSeAgreguenCorrectamente(String numItem) {
		System.out.println("Estoy en el Then.AddCart..");
		sauceDemoAddCart.getItem(numItem);
	}
}
