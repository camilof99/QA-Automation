package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoHomePage {
	public static Target txtBienvenida = Target.the("Texto de bienvenida").locatedBy("//span[@class='title']");
}
