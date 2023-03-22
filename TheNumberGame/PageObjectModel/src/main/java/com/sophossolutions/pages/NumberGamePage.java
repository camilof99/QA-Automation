package com.sophossolutions.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import static com.sophossolutions.actions.Actions.getText;

@DefaultUrl("")
public class NumberGamePage extends PageObject {
	By bySelectBuild = By.id("buildNumber");
	By byButtonRoll = By.id("rollDiceButton");
	By byInputNumber = By.id("numberGuess");
	By byButtonSubmit = By.id("submitButton");
	By byTextCorrect = By.xpath("//label[@id='feedbackLabel']//parent::i");
	By byTextTurns = By.xpath("//label[@id='turnNumber']");
	
	public void navegar(String url) {
		getDriver().navigate().to(url);
	}
	
	public void selectBuild(String strOption) {
		Actions.selectOption(getDriver(), bySelectBuild, strOption);
		Actions.clickElement(getDriver(), byButtonRoll);
	}

	public void inputNumber() {
		
		do {
			
			//System.out.println("ok");
			
			int intNumberRandom = (int)Math.floor(Math.random() * (13 - 1 + 1));
			
			Actions.sendData(getDriver(), byInputNumber, intNumberRandom + "");
			Actions.clickElement(getDriver(), byButtonSubmit);
			
			//System.out.println((getText(getDriver(), byTextCorrect)));
			//System.out.println((getText(getDriver(), byTextCorrect).contains("Correct")));
			
		}while(!getText(getDriver(), byTextCorrect).contains("Correct"));
		
	}

	public void printTurns() {
		System.out.println("Num " + (getText(getDriver(), byTextTurns)));
	}

}
