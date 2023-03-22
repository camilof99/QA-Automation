package com.sophossolutions.pages;

import static com.sophossolutions.actions.Actions.getText;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.By;

import com.sophossolutions.actions.Actions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class SauceDemoCheckout extends PageObject {

	By text = By.xpath("//span[@class='title']");
	By byButton;
	By byButtonContinue = By.id("continue");
	By byButtonFinish = By.id("finish");
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By information = By.xpath("//div[@class='summary_value_label'][1]");
	By subTotal = By.xpath("//div[@class='summary_subtotal_label']");
	By tax = By.xpath("//div[@class='summary_tax_label']");
	By total = By.xpath("//div[@class='summary_info_label summary_total_label']");
	ArrayList<String> info = new ArrayList<String>();

	public void navegate(String elm) {

		byButton = By.id(elm);

		Actions.clickElement(getDriver(), byButton);
	}
	
	public void form(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		Actions.sendData(getDriver(), this.firstName, data.get("firstName"));
		Actions.sendData(getDriver(), this.lastName, data.get("lastName"));
		Actions.sendData(getDriver(), this.zipCode, data.get("zipCode"));
		Actions.clickElement(getDriver(), byButtonContinue);
	}

	public void validateText(String text) {
		assertEquals("Falló el mensaje...", text, getText(getDriver(), this.text));
	}
	
	public void searchInformation() {
		info.add("Payment Information: " + getText(getDriver(), information));
		info.add(getText(getDriver(), subTotal));
		info.add(getText(getDriver(), tax));
		info.add(getText(getDriver(), total));
		Actions.clickElement(getDriver(), byButtonFinish);
	}
	
	public void printInformation() {
		System.out.println("Información de la compra: ");
		for (String in : info) {
			System.out.println(in);
		}
	}
}
