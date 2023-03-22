package com.sophossolutions.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions {
	public static void sendData(WebDriver myBrowser, By target, String data) {
		myBrowser.findElement(target).sendKeys(data);
	}
	
	public static void selectOption(WebDriver myBrowser, By target, String option) {
		WebElement element = myBrowser.findElement(target);
		 
		Select select = new Select(element);
		select.selectByValue(option);
	}
	
	public static void clickElement(WebDriver myBrowser, By target) {
		myBrowser.findElement(target).click();
	}
	
	public static String getText(WebDriver myBrowser, By target) {
		return myBrowser.findElement(target).getText();
	}
	
	public static List<WebElement> getElements(WebDriver myBrowser, By target) {
		List<WebElement> inventary = myBrowser.findElements(target);
		return inventary;
	}
	
	public static boolean getValidate(WebDriver myBrowser, By target) {
		return myBrowser.findElement(target).isDisplayed();
	}
}
