package com.sophossolutions.pages;

import static com.sophossolutions.actions.Actions.getText;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class SauceDemoFinish extends PageObject {
	
	By text = By.xpath("//h2[@class='complete-header']");
	
	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
}
