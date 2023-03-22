package com.sophossolutions.models;

public class UserCredentials {

	String strUsername;
	String strPassword;

	public UserCredentials(String strUsername, String strPassword) {
		super();
		this.strUsername = strUsername;
		this.strPassword = strPassword;
	}

	public String getStrUsername() {
		return strUsername;
	}

	public void setStrUsername(String strUsername) {
		this.strUsername = strUsername;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	@Override
	public String toString() {
		return strUsername + strPassword;
	}

	
}
