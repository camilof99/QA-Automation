package com.sophossolutions.ui.NewToursPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursHomePage extends PageObject{
	
	public static Target txtBienvenida = Target.the("Texto de bienvenida").locatedBy("//h3[contains(text(),'Login')]");
}
