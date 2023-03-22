package com.sophossolutions.pages.SauceDemoFilters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophossolutions.actions.Actions;

import net.serenitybdd.core.pages.PageObject;

public class SauceDemoFilter extends PageObject{
	
	By selectFilter = By.xpath("//select[@class='product_sort_container']");
	
	public void navegate(String url) {
		getDriver().navigate().to(url);
	}
	
	public void filter(String option) {
		Actions.selectOption(getDriver(), this.selectFilter, option);
	}
	
	public void getInventary(By inventary) {
		List<WebElement> items = Actions.getElements(getDriver(), inventary);
		
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
	}
}
