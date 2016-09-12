package com.ts.leaver.testcases;

import com.ts.commons.TestCaseUtil;
import com.ts.leaver.utils.UI;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;


public class MyProjTestCaseUtils extends TestCaseUtil {
	protected static UI uiInstance;

	public MyProjTestCaseUtils(String browserType) {
		uiInstance = new UI(browserType);
	}

	@AfterClass
	public void after() {
		uiInstance.getDriver().quit();
	}

	public static void sleep(int seconds){
		 try {
			  Thread.sleep(seconds * 1000);
			   }catch (InterruptedException e) {}  
	 }
	
	public static void waitUntilWebElemenmtIsPresent(String xpath){
		while(validateXpath(xpath)){
			MyProjTestCaseUtils.sleep(1);
			
		}
		
	}
	
	public static boolean validateXpath(String xpath){
		boolean theXpathappear = uiInstance.getDriver()
		.findElements(By.xpath(xpath)).isEmpty();
		
		return theXpathappear;
	}
}
