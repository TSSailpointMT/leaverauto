package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ts.commons.Validator;
import com.ts.leaver.testcases.MyProjTestCaseUtils;

public class TaskResultPage extends TasksPage{

	@FindBy (xpath=".//*[@id='progress'][contains(.,'Completed')]")
	private WebElement progressFieldCompleted;

	@FindBy (xpath=".//*[@id='progress']")
	private WebElement progressField;
	
	@FindBy (xpath=".//*[@class='rBorder'][contains(.,'Fail')]")
	private WebElement statusFailTaskResult;

	public Validator validateTaskResultPage() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Task Result')]"))
							.getText().trim(), "Task Result");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
	
	public Validator validateTaskIsCompleted() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					MyProjTestCaseUtils.waitUntilWebElemenmtIsPresent(".//*[@id='progress'][contains(.,'Completed')]");
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='progress'][contains(.,'Completed')]"))
							.getText().trim(), "Completed");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
	
	public Validator validateTaskScannedAccounts() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					MyProjTestCaseUtils.waitUntilWebElemenmtIsPresent(".//*[@id='progress'][contains(.,'Completed')]");
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@class='leftAlignedColumn'][contains(.,'Accounts scanned')]"))
							.getText().trim(), "Accounts scanned");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
	
	public Validator validateTaskFailed() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					MyProjTestCaseUtils.sleep(5);
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='taskResultsDetailsDiv']/descendant::td[starts-with(normalize-space(.),'Fail')]"))
							.getText().trim(), "Fail");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
	
	public Validator validateFileFromHRIsEmpty() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					MyProjTestCaseUtils.waitUntilWebElemenmtIsPresent(".//*[@id='progress'][contains(.,'Completed')]");
					Assert.assertFalse(!MyProjTestCaseUtils.validateXpath(".//*[@class='leftAlignedColumn'][contains(.,'Accounts scanned')]"));
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
	
}
