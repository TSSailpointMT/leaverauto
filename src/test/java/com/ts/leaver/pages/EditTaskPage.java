package com.ts.leaver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ts.commons.Validator;
import com.ts.leaver.testcases.MyProjTestCaseUtils;
import com.ts.leaver.utils.UI;

public class EditTaskPage extends TasksPage{

	@FindBy (xpath=".//*[@id='editForm:validateBeforeExecuteButton']")
	private WebElement saveAndExecuteButton;
	
	@FindBy (xpath=".//*[@id='button-1013-btnEl']")
	private WebElement acceptButtonPoPupWindow;
	
	public EditTaskPage clickSaveAndExecuteButton() {
		saveAndExecuteButton.click();
		MyProjTestCaseUtils.sleep(2);
		return this;
	}
	
	public TasksPage clickAcceptButton(UI ui) {
		MyProjTestCaseUtils.sleep(3);
		acceptButtonPoPupWindow.click();
		TasksPage page = new TasksPage();
		page = PageFactory.initElements((WebDriver) ui.getDriver(), TasksPage.class);
		page.and(ui);
		return page;
	}
	
	public Validator validateEditTaskPage() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Edit Task')]"))
							.getText().trim(), "Edit Task");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
