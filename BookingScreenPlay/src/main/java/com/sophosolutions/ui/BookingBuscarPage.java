package com.sophosolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BookingBuscarPage {
	
	public static Target tgtInputDestino = Target.the("Origen field").
			locatedBy("//input[@name='ss']");
	
	public static Target tgtBtnDate = Target.the("Btn date ida").
			locatedBy("//div[@data-testid='searchbox-dates-container']");
	
	public static Target tgtBtnMesNext = Target.the("Btn mes next").
			locatedBy("//div[@data-testid='searchbox-datepicker-calendar']//button[contains(@class, 'be298b15fa')]");
	
	public static Target tgtTextFechaIn = Target.the("Text fecha in").
			locatedBy("//div[@class='f261b68fe6'][1]//h3");
	
	public static Target tgtTextFechaOn = Target.the("Text fecha on").
			locatedBy("//div[@class='f261b68fe6'][2]//h3");
	
	public static Target tgtDate = Target.the("Date in").
			locatedBy("//span[@aria-label='{0}']");
	
	public static Target tgtBtnPersonas = Target.the("Btn Personas").
			locatedBy("//button[@data-testid='occupancy-config']");
	
	public static Target tgtInputAdultos = Target.the("Input Adultos").
			locatedBy("//input[@id='group_adults']");
	
	public static Target tgtBtnAdultosMenos = Target.the("Btn Adultos Disminuir").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_adults']]//button[contains(@class, 'cd7aa7c891')]");
	
	public static Target tgtBtnAdultosMas = Target.the("Btn Adultos Aumentar").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_adults']]//button[contains(@class, 'd64a4ea64d')]");
	
	public static Target tgtTextAdultos = Target.the("Text Adultos").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_adults']]//span[@class='e615eb5e43']");
	
	public static Target tgtBtnNiñosMenos = Target.the("Btn Niños Disminuir").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_children']]//button[contains(@class, 'cd7aa7c891')]");
	
	public static Target tgtBtnNiñosMas = Target.the("Btn Niños Aumentar").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_children']]//button[contains(@class, 'd64a4ea64d')]");
	
	public static Target tgtTextNiños = Target.the("Text Niños").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_children']]//span[@class='e615eb5e43']");
	
	public static Target tgtSelectCantNiños = Target.the("Selct cant Niños").
			locatedBy("//div[@class='d6bfadf8de']//div[@data-testid='kids-ages-select'][{0}]//select");
	
	public static Target tgtSelectNiños = Target.the("Selct Niños").
			locatedBy("//div[@data-testid='kids-ages-select'][{0}]");
	
	public static Target banner = Target.the("Banner -_-").locatedBy("//button[@class=\"fc63351294 a822bdf511 e3c025e003 fa565176a8 f7db01295e c334e6f658 ae1678b153\"]");

	public static Target tgtBtnHabiMenos = Target.the("Btn Habitacion Disminuir").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='no_rooms']]//button[contains(@class, 'cd7aa7c891')]");
	
	public static Target tgtBtnHabiMas = Target.the("Btn Habitacion Aumentar").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='no_rooms']]//button[contains(@class, 'd64a4ea64d')]");
	
	public static Target tgtTextHabi = Target.the("Text Habitacion").
			locatedBy("//div[@class='b2b5147b20' and .//label[@for='no_rooms']]//span[@class='e615eb5e43']");
	
	public static Target tgtBtnListoPersonas = Target.the("Btn Listo personas").
			locatedBy("//button//span[contains(text(), 'Listo')]");
	
	public static Target tgtBtnBuscar = Target.the("Btn Buscar").
			locatedBy("//button//span[contains(text(), 'Buscar')]");
}
