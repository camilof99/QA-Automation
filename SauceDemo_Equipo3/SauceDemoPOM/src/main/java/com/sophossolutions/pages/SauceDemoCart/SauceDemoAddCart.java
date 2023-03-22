package com.sophossolutions.pages.SauceDemoCart;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;
import static com.sophossolutions.actions.Actions.getText;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class SauceDemoAddCart extends PageObject{
	
	By byButtonProduct;
	By byGetItem = By.xpath("//span[@class='shopping_cart_badge']");
	
	public void addProduct(String product) {
		
		byButtonProduct = By.id(product);
		
		Actions.clickElement(getDriver(), byButtonProduct);
	}
	
	public void getItem(String itemNum) {
		assertEquals("Falló el mensaje...", itemNum, getText(getDriver(), byGetItem));
	}
	
}
