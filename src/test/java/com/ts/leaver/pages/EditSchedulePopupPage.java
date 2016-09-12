package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ts.commons.Validator;
import com.ts.leaver.testcases.MyProjTestCaseUtils;

public class EditSchedulePopupPage extends TasksPage{

	public Validator validateTaskIsScheduleDaily() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					MyProjTestCaseUtils.sleep(5);
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//option[contains(.,'Daily')][@selected='selected']"))
							.getText().trim(), "Daily");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
