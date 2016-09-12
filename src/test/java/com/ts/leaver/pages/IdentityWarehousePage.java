package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ts.commons.Validator;

public class IdentityWarehousePage extends HomePage{

	@FindBy(xpath=".//descendant::td[starts-with(normalize-space(.),'Alexander')]")
	private WebElement randomIdentityToTest;
	
	
	public Validator validateIdentityAggregation() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//descendant::td[starts-with(normalize-space(.),'Alexander')]"))
							.getText().trim(), "Alexander");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
