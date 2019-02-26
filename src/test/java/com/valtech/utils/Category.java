package com.valtech.utils;

public @interface Category {

	String testType(); // Smoke, regression, System, etc.. 
	String DesignedBy(); // Who is designed
	String description(); // test Description
	
}
