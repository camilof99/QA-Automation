package com.sophossolutions.pages.SauceDemoFilters;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class SauceDemoFilterPrice extends PageObject {
	
	SauceDemoFilter sauceDemoFilter;
	By inventary = By.xpath("//div[@class='inventory_item_price']");

	public void getInventaryDesc() {
		System.out.println("\nLista de productos ordenados por precio de manera DESC, high - low: ");
		sauceDemoFilter.getInventary(inventary);
	}

	public void getInventaryAsc() {
		System.out.println("\nLista de productos ordenados por precio de manera ASC, low - high: ");
		sauceDemoFilter.getInventary(inventary);
	}
}
