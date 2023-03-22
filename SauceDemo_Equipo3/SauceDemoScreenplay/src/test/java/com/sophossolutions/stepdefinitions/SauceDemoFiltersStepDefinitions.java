package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.ElementOf;
import com.sophossolutions.questions.ElementsFiltersName;
import com.sophossolutions.questions.ElementsFiltersPrice;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.PrintInformationCheckout;
import com.sophossolutions.task.SelectFilters;
import com.sophossolutions.ui.SauceDemoFiltersPage;
import com.sophossolutions.ui.SauceDemoGetCart;
import com.sophossolutions.ui.SauceDemoInventaryPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SauceDemoFiltersStepDefinitions {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usario debe estar en la pagina del inventario {string}")
	public void elUsarioDebeEstarEnLaPaginaDelInventario(String string) {
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(TextOf.field(SauceDemoInventaryPage.txtBienvenida), 
						Matchers.equalTo(string)).orComplainWith(
								UnexpectedResult.class, "El titulo del elemento no coincide con el esperado..."));
	}

	@When("Selecciona campo con el filtro Desc Z - A {string}")
	public void seleccionaCampoConElFiltroDescZA(String string) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilters.selectOption(string));
	}

	@Then("Imprimir en consola los productos ordenados Desc")
	public void imprimirEnConsolaLosProductosOrdenadosDesc() {
		System.out.println("Lista de productos ordenados de manera DESC, Z - A: ");
		OnStage.theActorInTheSpotlight()
		.should(GivenWhenThen.seeThat(ElementsFiltersName.field(), Matchers.equalTo(true))
				.orComplainWith(UnexpectedResult.class,
						"El elemento no existe en la pagina..."));
	}

	@When("Selecciona campo con el fitro Asc A - Z {string}")
	public void seleccionaCampoConElFitroAscAZ(String string) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilters.selectOption(string));
	}

	@Then("Imprimir en consola los productos ordenados Asc")
	public void imprimirEnConsolaLosProductosOrdenadosAsc() {
		System.out.println("\nLista de productos ordenados de manera ASC, A - Z: ");
		OnStage.theActorInTheSpotlight()
		.should(GivenWhenThen.seeThat(ElementsFiltersName.field(), Matchers.equalTo(true))
				.orComplainWith(UnexpectedResult.class,
						"El elemento no existe en la pagina..."));
	}

	@When("Selecciona campo con el filtro Asc Low - High {string}")
	public void seleccionaCampoConElFiltroAscLowHigh(String string) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilters.selectOption(string));
	}

	@Then("Imprimir en consola los productos ordenados por precio Asc")
	public void imprimirEnConsolaLosProductosOrdenadosPorPrecioAsc() {
		System.out.println("\nLista de productos ordenados por precio  ASC, Low - High: ");
		OnStage.theActorInTheSpotlight()
		.should(GivenWhenThen.seeThat(ElementsFiltersPrice.field(), Matchers.equalTo(true))
				.orComplainWith(UnexpectedResult.class,
						"El elemento no existe en la pagina..."));
	}

	@When("Selecciona campo con el filtro Desc Low - High {string}")
	public void seleccionaCampoConElFiltroDescLowHigh(String string) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilters.selectOption(string));
	}

	@Then("Imprimir en consola los productos ordenados por precio Desc")
	public void imprimirEnConsolaLosProductosOrdenadosPorPrecioDesc() {
		System.out.println("\nLista de productos ordenados por precio DESC, High - Low: ");
		OnStage.theActorInTheSpotlight()
		.should(GivenWhenThen.seeThat(ElementsFiltersPrice.field(), Matchers.equalTo(true))
				.orComplainWith(UnexpectedResult.class,
						"El elemento no existe en la pagina..."));
	}
}
