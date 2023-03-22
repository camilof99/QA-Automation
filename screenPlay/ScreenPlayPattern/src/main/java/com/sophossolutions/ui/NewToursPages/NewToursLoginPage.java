package com.sophossolutions.ui.NewToursPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("")
public class NewToursLoginPage extends PageObject{
	public static Target txtUsername = Target.the("Username field").locatedBy("//input[@name='userName']");
	public static Target txtPassword = Target.the("Password field").locatedBy("//input[@type='password']");
	public static Target btnSubmit = Target.the("Submit button").locatedBy("//input[@type='submit']");
	
	
}
