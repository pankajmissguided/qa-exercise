package com.valtech.pageObjects;

import org.openqa.selenium.WebDriver;

public class BlogPage {

WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
}
