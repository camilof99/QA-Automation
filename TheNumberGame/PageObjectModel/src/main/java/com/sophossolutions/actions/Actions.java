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
	
	public static void clickElement(WebDriver myBrowser, By target) {
		myBrowser.findElement(target).click();
	}
	
	public static void sendData(WebDriver myBrowser, By target, String data) {
		myBrowser.findElement(target).sendKeys(data);
	}
	
	public static String getText(WebDriver myBrowser, By target) {
		return myBrowser.findElement(target).getText();
	}
}
