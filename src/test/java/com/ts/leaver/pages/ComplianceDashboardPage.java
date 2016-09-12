package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ts.commons.Validator;

public class ComplianceDashboardPage extends HomePage {

	public Validator validateComplianceDashboard() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Dashboard')]"))
							.getText().trim(), "Dashboard");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
