package com.sophossolutions.pages;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;
import static com.sophossolutions.actions.Actions.getText;

import net.serenitybdd.core.pages.PageObject;

public class NumberGamePage extends PageObject {
	By bySelectBuild = By.id("buildNumber");
	By byButtonRoll = By.id("rollDiceButton");
	By byInputNumber = By.id("numberGuess");
	By byButtonSubmit = By.id("submitButton");
	By byTextCorrect = By.xpath("//label[@id='feedbackLabel']//parent::i");
	By byTextTurns = By.xpath("//label[@id='turnNumber']");
	
	public void navegar(String strUrl) {
		getDriver().navigate().to(strUrl);
	}
	
	public void selectBuild(String strOption) {
		Actions.selectOption(getDriver(), bySelectBuild, strOption);
		Actions.clickElement(getDriver(), byButtonRoll);
	}

	public void inputNumber() {
		
		do {
			int intNumberRandom = (int) Math.floor(Math.random() * (13 - 1 + 1));
			
			Actions.sendData(getDriver(), byInputNumber, intNumberRandom + "");
			Actions.clickElement(getDriver(), byButtonSubmit);
			
		}while(!getText(getDriver(), byTextCorrect).contains("Correct"));
	}

	public void printTurns() {
		System.out.println("Num " + (getText(getDriver(), byTextTurns)));
	}


}
