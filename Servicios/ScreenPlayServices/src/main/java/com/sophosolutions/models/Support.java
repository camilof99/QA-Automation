package com.sophosolutions.models;

public class Support {
	private String url;
	private String text;
	
	public Support(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}
	
	public Support() {
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
