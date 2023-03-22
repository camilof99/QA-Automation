package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoFiltersPage {
	public static Target txtTitle = Target.the("Texto de titulo pagina inventario").locatedBy("//span[@class='title']");
	public static Target txtSelect= Target.the("Field select filters").locatedBy("//select[@class='product_sort_container']");
}
