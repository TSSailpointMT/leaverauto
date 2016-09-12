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

public class EditApplicationPage extends ApplicationDefinitionPage{

	@FindBy (xpath=".//*[@id='tab-1076-btnWrap']")
	private WebElement editAppDetailsTab;
	
	@FindBy (xpath=".//*[@id='tab-1091-btnWrap']")
	private WebElement editAppConfigurationTab;
	
	@FindBy (xpath=".//*[@id='tab-1092-btnWrap']")
	private WebElement editAppCorrelationTab;
	
	@FindBy (xpath=".//*[@id='tab-1132-btnWrap']")
	private WebElement editAppAccountsTab;
	
	@FindBy (xpath=".//*[@id='tab-1133-btnWrap']")
	private WebElement editAppRiskTab;
	
	@FindBy (xpath=".//*[@id='tab-1134-btnWrap']")
	private WebElement editAppActivityDataSourcesTab;
	
	@FindBy (xpath=".//*[@id='tab-1135-btnWrap']")
	private WebElement editAppRulesTab;
	
	@FindBy (xpath=".//*[@id='tab-1136-btnWrap']")
	private WebElement editAppPasswordPolicyTab;
	
	@FindBy (xpath=".//td[@class='certScheduleTitleCol']/div[1]/input [@type='text']")
	private WebElement configTabFilePathField;
	
	@FindBy (xpath=".//*[@id='sectionDelimitedBoolean_']/div[1]/input[@checked='checked']")
	private WebElement configTabFirstLineAsHeaderCheckbox;
	
	@FindBy (xpath=".//*[@id='sectionDelimitedBoolean_']/div[1]/input")
	private WebElement configTabFirstLineAsHeaderCheckboxNotChecked;
	
	@FindBy (xpath=".//*[@id='editForm:saveAppBtn']")
	private WebElement configTabSaveButton;
	
	@FindBy (xpath=".//*[@id='button-1013']")
	private WebElement serverErrorPopupButton;
	
	public EditApplicationPage clickConfigurationTab(){
		editAppConfigurationTab.click();
		return this;
	}
	
	
	public EditApplicationPage changeHRFilePathToAnEmptyFile(){
		configTabFilePathField.clear();
		configTabFilePathField.sendKeys("/home/caesar/sailpoint/files/HR_Empty.txt");
		return this;
	}
	
	public EditApplicationPage uncheckFirstLineAsHeaderCheckbox(){
		boolean isAlreadyChecked = !MyProjTestCaseUtils.validateXpath(".//*[@id='sectionDelimitedBoolean_']/div[1]/input[@checked='checked']");
		if (isAlreadyChecked) {
			configTabFirstLineAsHeaderCheckbox.click();
		}else{
			System.out.println("No encontro el xpath");
		}
		
		return this;
	}
	
	public EditApplicationPage checkFirstLineAsHeaderCheckbox(){
		boolean errorPopupAppear = !MyProjTestCaseUtils.validateXpath(".//*[@id='button-1013']");
		if (errorPopupAppear) {
			boolean isActuallyDisplayed = serverErrorPopupButton.isDisplayed();
			if (isActuallyDisplayed) {
				serverErrorPopupButton.click();
			}
		}
		boolean isNotChecked = MyProjTestCaseUtils.validateXpath(".//*[@id='sectionDelimitedBoolean_']/div[1]/input[@checked='checked']");
		if (isNotChecked) {
			configTabFirstLineAsHeaderCheckboxNotChecked.click();
		}else{
			System.out.println("No encontro el xpath");
		}
		
		return this;
	}
	
	public ApplicationDefinitionPage clickSaveButton(UI ui){
		boolean errorPopupAppear = !MyProjTestCaseUtils.validateXpath(".//*[@id='button-1013']");
		if (errorPopupAppear) {
			boolean isActuallyDisplayed = serverErrorPopupButton.isDisplayed();
			if (isActuallyDisplayed) {
				serverErrorPopupButton.click();
			}
		}
		configTabSaveButton.click();
		ApplicationDefinitionPage page = new ApplicationDefinitionPage();
		page = PageFactory.initElements((WebDriver) ui.getDriver(), ApplicationDefinitionPage.class);
		page.and(ui);
		MyProjTestCaseUtils.sleep(20);
		return page;
	}
	
	public Validator validateEditApplicationPage(final String application) 
	{
		return new Validator() 
		{
			@Override
			public void Validate() 
			{
				try{
					Assert.assertEquals(uiInstance.getDriver()
							.findElement(By.xpath(".//*[@id='bodyDivTitle'][contains(.,'Edit Application')]"))
							.getText().trim(), "Edit Application "+application);
				} catch (NullPointerException e){
					System.out.println("Test--  NullPointerException  ");
				}

			}
		};
	}
	
}
