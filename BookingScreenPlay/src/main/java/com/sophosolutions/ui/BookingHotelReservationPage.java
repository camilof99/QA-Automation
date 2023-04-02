package com.sophosolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BookingHotelReservationPage {

	public static Target tgtSelectHotel = Target.the("Target select hotel").
			locatedBy("//tr[contains(@class, 'js-rt-block-row')]//select");
	
	public static Target tgtBtnDispo = Target.the("Target botón disponibilidad").
			locatedBy("//div[@class='hprt-reservation-cta']//button");
	
	public static Target tgtTextEntrada = Target.the("Target text fecha entrada").
			locatedBy("//div[@class='bui-group__item']//div[contains(text(), 'Entrada')]//following-sibling::time");
	
	public static Target tgtTextSalida = Target.the("Target text fecha salida").
			locatedBy("//div[@class='bui-group__item']//div[contains(text(), 'Salida')]//following-sibling::time");
	
	public static Target tgtDuracion = Target.the("Target duracion total").
			locatedBy("//section[@class='bui-card bp-card--booking-summary bui-u-bleed@small']//div[@class='bui-group__item bui-f-font-strong']");
	
	public static Target tgtPrecio = Target.the("Target precio total").
			locatedBy("//div[@class='bui-card__text bp-price-details__total  ']//span[@data-component='core/animate-price']");
}
