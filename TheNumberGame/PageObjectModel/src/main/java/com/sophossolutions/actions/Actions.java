package com.sophossolutions.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions {
	public static void selectOption(WebDriver myBrowser, By byTarget, String strOption) {
		WebElement element = myBrowser.findElement(byTarget);

		Select select = new Select(element);
		select.selectByVisibleText(strOption);
	}

	public static void clickElement(WebDriver myBrowser, By byTarget) {
		myBrowser.findElement(byTarget).click();
	}

	public static void sendData(WebDriver myBrowser, By byTarget, String strData) {
		myBrowser.findElement(byTarget).sendKeys(strData);
	}

	public static String getText(WebDriver myBrowser, By byTarget) {
		return myBrowser.findElement(byTarget).getText();
	}
}
