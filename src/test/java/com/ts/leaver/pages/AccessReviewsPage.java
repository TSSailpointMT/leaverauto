package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ts.commons.Validator;

public class AccessReviewsPage extends HomePage {

	public Validator validateAccessReviews() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'My Access Reviews')]"))
							.getText().trim(), "My Access Reviews");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
