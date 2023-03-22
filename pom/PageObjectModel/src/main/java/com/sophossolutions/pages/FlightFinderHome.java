package com.sophossolutions.pages;

import static com.sophossolutions.actions.Actions.getText;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class FlightFinderHome extends PageObject{
	By text = By.xpath("//td/p[@align='left']/font/b/font[@size='4']");
	
	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
}
