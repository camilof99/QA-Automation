package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoGetCart {
	public static Target txtGetCart = Target.the("Texto titulo página del carrito").locatedBy("//span[@class='title']");
	public static Target txtItemProduct = Target.the("Texto titulo producto del carrito").locatedBy("//div[@class='cart_item']");
	public static Target txtBtnCheckout = Target.the("Botón para ir a checkout").locatedBy("//button[@id='checkout']");
}
