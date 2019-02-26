package com.valtech.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	// recent blog
	By h1 = By.xpath("//*[@id='cta-intro']/div/div[1]/hgroup/h1");
	By para = By.xpath("//*[@id='cta-intro']/div/div[1]/div[1]/p");

	// header displayed
	public WebElement isHeaderDisplayed() {
		return driver.findElement(h1);
	}

	// para displayed
	public WebElement isParagraphDisplayed() {
		return driver.findElement(para);
	}

	// menu
	By menu = By.xpath("//*[@class='icon-menu']");

	public WebElement clickOnMenu() {
		return driver.findElement(menu);
	}

	By contactUs = By.xpath("/html/body/footer/nav/ul/li[5]/a");

	public ContactPage clickOnContactUs() {
		driver.findElement(contactUs).click();
		return new ContactPage(driver);
	}

	By header = By.xpath("//*[@class='site-nav__main__content-box__title']");

	public boolean getHeaderName(String headername) {

		List<WebElement> li = driver.findElements(header);

		for (WebElement webElement : li) {
			if (webElement.getText().contains(headername)) {
				return true;
			}
		}
		return false;

	}

	// List of Menu Items
	By menuDiv = By.xpath("//*[@class='site-nav__menu__primary']");

	public ServicesPage clickServiceMenu(String menu) {
		List<WebElement> li = menuDiv.findElements((SearchContext) By.tagName("button"));

		for (WebElement webElement : li) {
			if (webElement.getText().contains(menu)) {
				webElement.click();
			}
		}
		return new ServicesPage(driver);

	}

	public WorkPage clickWorkMenu(String menu) {
		List<WebElement> li = menuDiv.findElements((SearchContext) By.tagName("button"));

		for (WebElement webElement : li) {
			if (webElement.getText().contains(menu)) {
				webElement.click();
			}
		}
		return new WorkPage(driver);

	}

	public AboutPage clickAboutMenu(String menu) {
		List<WebElement> li = menuDiv.findElements((SearchContext) By.tagName("button"));

		for (WebElement webElement : li) {
			if (webElement.getText().contains(menu)) {
				webElement.click();
			}
		}
		return new AboutPage(driver);

	}

//	public void clickOnMenuOption(String menu) {
//		switch (menu) {
//		case "Services":
//			clickServiceMenu(menu);
//			break;
//		case "Work":
//			clickWorkMenu(menu);
//			break;
//		case "About":
//			clickAboutMenu(menu);
//			break;
//		default:
//			System.out.println("No such Menu Option Found");
//			break;
//		}
//	}
}
