package com.ts.leaver.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;

import com.ts.commons.ChromeDriver;
import com.ts.commons.FirefoxDriver;
import com.ts.commons.InternetExplorerDriver;
import com.ts.leaver.pages.SystemPage;

public class UI {

	private WebDriver driver;

	public UI(String browserType) {

		switch (browserType) {
		case BrowserType.CHROME:
			driver = ChromeDriver.createInstance();
			break;
		case BrowserType.FIREFOX:
			driver = new FirefoxDriver();
			break;
		case BrowserType.IE:
			driver = InternetExplorerDriver.createInstance();
			break;

		default:
			driver = null;
			break;
		}
		driver.manage().window().maximize();
	}
	
	public SystemPage getSystemPage() {
		driver.get(Constant.url);
		SystemPage systemPage = PageFactory.initElements(driver, SystemPage.class);
		return systemPage;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	
	
}
