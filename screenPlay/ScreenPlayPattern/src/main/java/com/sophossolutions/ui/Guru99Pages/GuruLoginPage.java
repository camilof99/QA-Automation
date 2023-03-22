package com.sophossolutions.ui.Guru99Pages;

import net.serenitybdd.screenplay.targets.Target;

public class GuruLoginPage {

	public static Target txtUser = Target.the("Username field").locatedBy("//input[@name='uid']");
	public static Target txtPassword = Target.the("Password field").locatedBy("//input[@type='password']");
	public static Target btnSubmit = Target.the("Submit button").locatedBy("//input[@type='submit']");
}
