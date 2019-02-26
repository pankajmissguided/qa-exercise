package com.valtech.pageObjects;

import org.openqa.selenium.WebDriver;

public class ContactPage {
WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
}
