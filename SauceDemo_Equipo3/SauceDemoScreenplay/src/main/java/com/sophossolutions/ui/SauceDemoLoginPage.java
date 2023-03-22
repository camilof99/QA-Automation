package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoLoginPage {
	
	public static Target txtUsername = Target.the("Username field").locatedBy("//input[@id='user-name']");
	public static Target txtPassword = Target.the("Password field").locatedBy("//input[@id='password']");
	public static Target btnSubmit = Target.the("Submit button").locatedBy("//input[@id='login-button']");
}
