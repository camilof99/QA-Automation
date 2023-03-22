package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import static com.sophossolutions.actions.Actions.getText;

import net.serenitybdd.core.pages.PageObject;

public class GuruHome extends PageObject{

	By text = By.xpath("//td[contains(text(), 'Manger Id : mngr480443')]");
	
	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
}
