package com.sophossolutions.models;

public class InformationCheckoutOverview {

	String strInfo;
	String strSubtotal;
	String strTax;
	String strTotal;

	public InformationCheckoutOverview(String strInfo, String strSubtotal, String strTax, String strTotal) {
		super();
		this.strInfo = strInfo;
		this.strSubtotal = strSubtotal;
		this.strTax = strTax;
		this.strTotal = strTotal;
	}

	public String getStrInfo() {
		return strInfo;
	}

	public void setStrInfo(String strInfo) {
		this.strInfo = strInfo;
	}

	public String getStrSubtotal() {
		return strSubtotal;
	}

	public void setStrSubtotal(String strSubtotal) {
		this.strSubtotal = strSubtotal;
	}

	public String getStrTax() {
		return strTax;
	}

	public void setStrTax(String strTax) {
		this.strTax = strTax;
	}

	public String getStrTotal() {
		return strTotal;
	}

	public void setStrTotal(String strTotal) {
		this.strTotal = strTotal;
	}

	@Override
	public String toString() {
		return "InformationCheckoutOverview [\nPayment = " + strInfo + "\n" 
				+ strSubtotal + "\n" + strTax
				+ "\n" + strTotal + "\n]";
	}

}
