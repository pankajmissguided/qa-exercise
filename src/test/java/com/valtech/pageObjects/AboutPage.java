package com.valtech.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {

WebDriver driver;
	
	public AboutPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
}
