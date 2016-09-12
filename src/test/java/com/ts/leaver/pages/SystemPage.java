package com.ts.leaver.pages;

import com.ts.leaver.data.User;
import com.ts.leaver.utils.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemPage extends MyProjPage{

	@FindBy(xpath = ".//*[@id='loginForm:accountId']")
	private WebElement username_input;
	
	@FindBy(xpath = "//*[@id='loginForm:password']")
	private WebElement password_input;

	@FindBy(xpath = "//*[@id='loginForm:loginButton']")
	private WebElement submit_button;


	public SystemPage setUsername(User user){
		this.username_input.sendKeys(user.getUsername());
		return this;
	}
	
	public SystemPage setPassword(User user){
		this.password_input.sendKeys(user.getPassword());
		return this;
	}

	public HomePage signIn(UI iu){
		this.submit_button.click();
		HomePage page = new HomePage();
		page = PageFactory.initElements((WebDriver) iu.getDriver(), HomePage.class);
		page.and(iu);
		return page;
	}

	@Override
	public SystemPage and() {
		return this;
	}

	public SystemPage and(UI uiInstance) {
		this.uiInstance = uiInstance;
		return this;
	}

	@Override
	public SystemPage then() {
		return this;
	}



}
