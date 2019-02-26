package com.valtech.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage {

WebDriver driver;
	
	public ServicesPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
}
