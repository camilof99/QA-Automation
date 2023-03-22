package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class NewToursLogin extends PageObject {
	By userName = By.name("userName");
	By password = By.name("password");
	By button = By.name("submit");

	public void navigate(String url) {
		getDriver().navigate().to(url);
	}

	public void login(String userName, String password) {
		Actions.sendData(getDriver(), this.userName, userName);
		Actions.sendData(getDriver(), this.password, password);
		Actions.clickElement(getDriver(), button);
	}
}
