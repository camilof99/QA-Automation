package com.sophosolutions.models;

import java.util.ArrayList;

public class Prueba {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Data> data;
	private Support support;

	public Prueba(int page, int per_page, int total, int total_pages, ArrayList<Data> data, Support support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}
	
	public Prueba() {
		super();
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public ArrayList<Data> getData() {
		return data;
	}

	public void setData(ArrayList<Data> data) {
		this.data = data;
	}

	public Support getSuppport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	
}
