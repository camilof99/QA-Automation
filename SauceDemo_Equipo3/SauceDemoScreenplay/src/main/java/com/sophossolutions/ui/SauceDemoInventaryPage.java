package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoInventaryPage {
	public static Target txtBienvenida = Target.the("Texto de bienvenida").locatedBy("//span[@class='title']");
	public static Target txtItems = Target.the("Texto de bienvenida").locatedBy("//span[@class='shopping_cart_badge']");
	public static Target txtBtnCart = Target.the("Botón del carrito").locatedBy("//a[@class='shopping_cart_link']");
	public static Target txtProductsName = Target.the("Nombre de los productos del inventario").locatedBy("//div[@class='inventory_item_name']");
	public static Target txtProductsPrice = Target.the("Precio de los productos del inventario").locatedBy("//div[@class='inventory_item_price']");
}
