package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoCheckoutOverviewPage {
	public static Target txtCheckout = Target.the("Titulo de la pagina checkout Overview").locatedBy("//span[@class='title']");
	public static Target txtInfo = Target.the("Text information").locatedBy("//div[@class='summary_value_label']");
	public static Target txtSubtotal = Target.the("Text Subtotal").locatedBy("//div[@class='summary_subtotal_label']");
	public static Target txtTax = Target.the("Text Tax").locatedBy("//div[@class='summary_tax_label']");
	public static Target txtTotal = Target.the("Text information").locatedBy("//div[@class='summary_info_label summary_total_label']");
	public static Target btnSubmit = Target.the("Submit button").locatedBy("//button[@id='finish']");
}
