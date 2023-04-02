package com.sophosolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BookingResultFiltersPage {

	public static Target tgtDivElement = Target.the("Target div elements hopedajes").
			locatedBy("//div[@data-testid='property-card']");
	
	public static Target tgtButtonElement = Target.the("Target div elements hopedajes").
			locatedBy("//div[@data-testid='property-card'][{0}]//div[@data-testid='availability-group']//a[@data-testid='availability-cta-btn']");
	
	public static Target tgtComeElement = Target.the("Target div comentarios hopedajes").
			locatedBy("//div[@data-testid='property-card'][{0}]//div[@data-testid='review-score']//div[@class='d8eab2cf7f c90c0a70d3 db63693c62']");
	
	public static Target tgtPuntElement = Target.the("Target div puntuacion hopedajes").
			locatedBy("//div[@data-testid='property-card'][{0}]//div[@data-testid='review-score']//div[@class='b5cd09854e d10a6220b4']");
	
	public static Target tgtConfortElement = Target.the("Target div confort hopedajes").
			locatedBy("(//div[@data-testid='property-card']//a[contains(@aria-label, 'Confort')]//span)[{0}]");
	
	public static Target tgtBtnFilterList = Target.the("Lista filtro").
			locatedBy("//button[@data-testid='sorters-dropdown-trigger']");
	
	public static Target tgtBtnFilterPunt = Target.the("Filtro por puntuación").
			locatedBy("(//div[@data-filters-group='review_score']//div[contains(text(), 'Fantástico: 9 o más')])[1]");
			//locatedBy("//input[contains(@id, ':Rhfbkq:')]//parent::div");
	
	public static Target tgtBtnFilterPrecio = Target.the("Filtro por precio").
			locatedBy("//button[@data-id='price']");
}
