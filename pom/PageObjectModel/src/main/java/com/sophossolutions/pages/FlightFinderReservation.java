package com.sophossolutions.pages;

import java.util.Map;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/reservation.php")
public class FlightFinderReservation extends PageObject {
	By type;
	By passengers = By.name("passCount");
	By departing = By.name("fromPort");
	By on = By.name("fromMonth");
	By dayOn = By.name("fromDay");
	By arriving = By.name("toPort");
	By returning = By.name("toMonth");
	By dayReturn = By.name("toDay");
	By serviceClass;
	By airline = By.name("airline");
	By button = By.name("findFlights");
	
	public void navegar(String url) {
		getDriver().navigate().to(url);
	}
	
	public void reservation(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		this.type = By.xpath("//input[@name='tripType' and @value='" + data.get("type") + "']");
		this.serviceClass =  By.xpath("//input[@name='servClass' and @value='" + data.get("service") + "']");
		
		Actions.clickElement(getDriver(), this.type);
		Actions.selectOption(getDriver(), this.passengers, data.get("passenger"));
		Actions.selectOption(getDriver(), this.departing, data.get("departing"));
		Actions.selectOption(getDriver(), this.on, data.get("on"));
		Actions.selectOption(getDriver(), this.dayOn, data.get("onDay"));
		Actions.selectOption(getDriver(), this.arriving, data.get("arriving"));
		Actions.selectOption(getDriver(), this.returning, data.get("return"));
		Actions.selectOption(getDriver(), this.dayReturn, data.get("dayReturn"));
		Actions.clickElement(getDriver(), this.serviceClass);
		Actions.selectOption(getDriver(), this.airline,  data.get("airline"));
		Actions.clickElement(getDriver(), button);
	}
}
