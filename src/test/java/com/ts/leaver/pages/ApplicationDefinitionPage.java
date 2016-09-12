package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ts.commons.Validator;
import com.ts.leaver.utils.UI;

public class ApplicationDefinitionPage extends HomePage{
	
	@FindBy (xpath=".//*[@id='searchfield-1024-inputEl']")
	private WebElement searchApplicationField;
	
	@FindBy (xpath=".//*[@id='ext-gen1094']")
	private WebElement searchApplicationButton;
	
	@FindBy (xpath=".//*[@id='newApplicationBtn']")
	private WebElement addNewApplicationButton;

	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'ACF2 Production')]")
	private WebElement ACF2Productionpplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'ACF2 STG1')]")
	private WebElement ACF2STG1Application;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'ATMCERT AD')]")
	private WebElement ATMCERTADApplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'ATMPROD AD')]")
	private WebElement ATMPRODADApplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'CERT AD')]")
	private WebElement CERTADApplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'DEV AD')]")
	private WebElement DEVADApplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'MGMT AD')]")
	private WebElement MGMTADApplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'PROD AD')]")
	private WebElement PRODADApplication;
	
	@FindBy (xpath=".//*[@id='gridview-1022']/descendant::td[starts-with(normalize-space(.),'Ultipro HR')]")
	private WebElement ultiproHRApplication;
	
	
	public EditApplicationPage clickUltiproHRApplicationlink(UI ui){
		ultiproHRApplication.click();
		EditApplicationPage page = new EditApplicationPage();
		page = PageFactory.initElements((WebDriver) ui.getDriver(), EditApplicationPage.class);
		page.and(ui);
		return page;
	}
	
	
	public Validator validateApplicationDefinitionPage() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Application Definition')]"))
							.getText().trim(), "Application Definition");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
