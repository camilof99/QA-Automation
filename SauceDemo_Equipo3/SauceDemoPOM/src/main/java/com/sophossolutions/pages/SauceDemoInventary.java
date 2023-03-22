package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import static com.sophossolutions.actions.Actions.getText;

import net.serenitybdd.core.pages.PageObject;

public class SauceDemoInventary extends PageObject{
	
	By text = By.xpath("//span[@class='title']");
	
	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
}
