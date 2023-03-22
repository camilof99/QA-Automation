package com.sophossolutions.pages.SauceDemoFilters;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class SauceDemoFilterName extends PageObject{
	SauceDemoFilter sauceDemoFilter;
	By inventary = By.xpath("//div[@class='inventory_item_name']");
	
	public void getInventaryDesc() {
		System.out.println("\nLista de productos ordenados de manera DESC, Z - A: ");
		sauceDemoFilter.getInventary(inventary);
	}
	
	public void getInventaryAsc() {
		System.out.println("\nLista de productos ordenados de manera ASC, A - Z: ");
		sauceDemoFilter.getInventary(inventary);
	}
	
	public void getInventary() {
		sauceDemoFilter.getInventary(inventary);
	}
}   
