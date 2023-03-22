package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarFiltersFlightsPage {
	 
	public static Target tgtFlightsBaratos = Target.the("Btn vuelos baratos").
			locatedBy("//*[text()=' baratos']/parent::node()']");
	
	public static Target tgtTextPage = Target.the("Text Lista de vuelos").
			locatedBy("//li[@class='sub-nav-item -active']/label[@class='sub-nav-label eva-3-label-form -md']");
}
