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

public class TasksPage extends HomePage{

	@FindBy(xpath=".//descendant::td[starts-with(normalize-space(.),'MTB Ultipro HR Aggregation')]")
	private WebElement mtbUltiproHRAggregationlink;
	
	@FindBy(xpath=".//*[@id='tab-1090-btnEl']")
	private WebElement taskResultTab;
	
	@FindBy(xpath=".//*[@id='tab-1089-btnWrap']")
	private WebElement scheduledTaskTab;
	
	@FindBy(xpath=".//*[@id='schedulesSearchField-inputEl']")
	private WebElement searchByScheduleNameScheduledTasksTab;
	
	@FindBy(xpath=".//*[@id='ext-gen1232']")
	private WebElement searchButtonScheduleTab;
	
	@FindBy(xpath=".//*[@id='resultsSearchField-inputEl']")
	private WebElement searchByResultNameTaskResultTab;
	
	@FindBy(xpath=".//*[@id='ext-gen1232']")
	private WebElement searchButtonResultTab;
	
	@FindBy(xpath=".//*[@id='gridcolumn-1064-triggerEl']")
	private WebElement sortByDateDropdownButton;
	
	@FindBy(xpath=".//*[@id='menuitem-1102-itemEl']")
	private WebElement sortDescendingDateDropdownButton;
	
	@FindBy(xpath=".//*[@id='gridview-1068']/descendant::td[starts-with(normalize-space(.),'MTB Ultipro HR Aggregation')][1]")
	private WebElement lastTaskRanOfMTBUltiproHRAggregation;
	
	@FindBy(xpath=".//td[contains(.,'Daily HR Aggregation - Ultipro')]")
	private WebElement selectDailyHRAggInScheduleTab;
	
	public EditTaskPage clickMTBUltiproHRAggregationlink(UI ui){
		mtbUltiproHRAggregationlink.click();
		EditTaskPage page = new EditTaskPage();
		page = PageFactory.initElements((WebDriver) ui.getDriver(), EditTaskPage.class);
		page.and(ui);
		return page;
	}
	public TasksPage clickTaskResultTab(){
		taskResultTab.click();
		return this;
	}
	
	public TasksPage sendSearchInfoForHRAggregation(){
		searchByResultNameTaskResultTab.sendKeys("MTB Ultipro HR Aggregation");
		MyProjTestCaseUtils.sleep(1);
		return this;
	}
	
	public TasksPage clickSearchButton(){
		searchButtonResultTab.click();
		MyProjTestCaseUtils.sleep(2);
		return this;
	}
	
	public TasksPage clickSortByDateDropdown(){
		sortByDateDropdownButton.click();
		MyProjTestCaseUtils.sleep(1);
		return this;
	}
	
	public TasksPage clickSortDescendingDateDropdownButton(){
		sortDescendingDateDropdownButton.click();
		MyProjTestCaseUtils.sleep(3);
		return this;
	}
	
	public TaskResultPage clickLastTaskRanOfMTBUltiproHRAggregation(UI ui){
		lastTaskRanOfMTBUltiproHRAggregation.click();
		TaskResultPage page = new TaskResultPage();
		page = PageFactory.initElements((WebDriver) ui.getDriver(), TaskResultPage.class);
		page.and(ui);
		return page;
	}
	
	public TasksPage clickScheduledTastTab(){
		scheduledTaskTab.click();
		MyProjTestCaseUtils.sleep(1);
		return this;
	}
	
	public TasksPage clickDailyHRAggregationOptionOnScheduleTab(){
		selectDailyHRAggInScheduleTab.click();
		MyProjTestCaseUtils.sleep(3);
		return this;
	}
	
	public EditSchedulePopupPage clickScheduleTaskOfMTBUltiproHRAggregation(UI ui){
		selectDailyHRAggInScheduleTab.click();
		EditSchedulePopupPage page = new EditSchedulePopupPage();
		page = PageFactory.initElements((WebDriver) ui.getDriver(), EditSchedulePopupPage.class);
		page.and(ui);
		return page;
	}
	
	public Validator validateTasksPage() 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Tasks')]"))
							.getText().trim(), "Tasks");
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
}
