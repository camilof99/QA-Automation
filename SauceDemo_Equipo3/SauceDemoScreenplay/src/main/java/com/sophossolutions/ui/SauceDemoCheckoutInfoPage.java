package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoCheckoutInfoPage {
	public static Target txtCheckout = Target.the("Titulo de la pagina checkout").locatedBy("//span[@class='title']");
	public static Target txtFirstname = Target.the("Firstname field").locatedBy("//input[@id='first-name']");
	public static Target txtLasname = Target.the("Lastname field").locatedBy("//input[@id='last-name']");
	public static Target txtZipcode = Target.the("Zipcode field").locatedBy("//input[@id='postal-code']");
	public static Target btnSubmit = Target.the("Submit button").locatedBy("//input[@id='continue']");
}
