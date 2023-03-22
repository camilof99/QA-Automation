package com.sophossolutions.pages.SauceDemoCart;

import static com.sophossolutions.actions.Actions.getText;
import static com.sophossolutions.actions.Actions.getValidate;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class SauceDemoGetCart extends PageObject{
	
	By byButton;
	By itemElement;
	By text = By.xpath("//span[@class='title']");

	public void navegate(String atr) {
		byButton = By.xpath("//a[@class='"+ atr + "']");
		
		Actions.clickElement(getDriver(), byButton);
	}
	
	public void validateItem(String itemAtr) {
		itemElement = By.xpath("//div[@class='" + itemAtr + "']");
		
		Actions.getValidate(getDriver(), itemElement);

		assertEquals("Falló el mensaje...", true, getValidate(getDriver(), itemElement));
	}
	
	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
	
	public void printItems() {
		
	}
}
