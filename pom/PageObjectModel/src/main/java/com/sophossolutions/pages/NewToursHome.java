package com.sophossolutions.pages;

import static com.sophossolutions.actions.Actions.getText;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class NewToursHome extends PageObject {
	
	By text = By.xpath("//h3[contains(text(), 'Login Successfully')]");
	
	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
}
