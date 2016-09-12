package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ts.commons.Validator;

public class NotificationsPage extends HomePage{

	public Validator validateNotificationsPage() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Manage Work Items')]"))
							.getText().trim(), "Manage Work Items");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
