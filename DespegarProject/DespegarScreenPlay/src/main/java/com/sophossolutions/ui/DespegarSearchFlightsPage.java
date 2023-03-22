package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarSearchFlightsPage {
	
	public static Target tgtInputOrigen = Target.the("Origen field").
			locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ingresa desde dónde viajas']");
	public static Target tgtInputDestino = Target.the("Destino field").
			locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ingresa hacia dónde viajas']");
	public static Target tgtListOptionOrigen = Target.the("Lista opciones input origen").
			locatedBy("//div[@class='ac-wrapper -desktop -show']//ul[@class='ac-group-items']");
	
	public static Target tgtListOptionDestino = Target.the("Lista opciones input destino").
			locatedBy("//div[@class='ac-wrapper -desktop -show sbox-ab-ls']//ul[@class='ac-group-items']");
	
	public static Target tgtBtnDate = Target.the("Btn date ida").
			locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::div[@class='sbox5-dates-input1']");
	
	public static Target tgtDay = Target.the("Date").locatedBy("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2023-{0}']/descendant::div[@class='sbox5-monthgrid-datenumber-number' and text()='{1}']");
	public static Target tgtDateTimeAplicar = Target.the("Btn aplicar fecha").
			locatedBy("//button[@class='sbox5-3-btn -primary -md']");
	
	public static Target banner = Target.the("Banner -_-").locatedBy("//a[@class='lgpd-banner--button eva-3-btn -white -md']");
	
	public static Target tgtBtnPasajeros = Target.the("Btn modal pasajeros").
			locatedBy("//div[@class='sbox5-segment--2_IQ3']/descendant::div[@class='sbox5-distributionPassengers']");
	
	public static Target tgtPasajerosAdultos = Target.the("Cantidad de pasajeros adultos").
			locatedBy("//div[contains(div/span/text(), 'Adultos')]/descendant::button[@class='steppers-icon-right stepper__icon']");
	public static Target tgtPasajerosMenores = Target.the("Cantidad de pasajeros menores").
			locatedBy("//div[contains(div/span/text(), 'Adultos')]/descendant::button[@class='steppers-icon-right stepper__icon']");
	
	public static Target tgtAplicarPassenger = Target.the("Btn aplicar pasajeros").
			locatedBy("//a[@class='sbox5-3-btn -md -primary']");
	
	public static Target tgtSearchFlights = Target.the("Btn buscar vuelos").
			locatedBy("//button[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn sbox5-button -secondary -icon -lg']");
	
}
