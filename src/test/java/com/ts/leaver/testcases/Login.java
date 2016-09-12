package com.ts.leaver.testcases;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

import com.ts.leaver.data.User;
import com.ts.leaver.pages.HomePage;
import com.ts.leaver.testcases.MyProjTestCaseUtils;

public class Login extends MyProjTestCaseUtils{

	public Login() {
		super(BrowserType.CHROME);
	}

	private HomePage homePage;
	private User admin = new User("spadmin", "admin");
	
	@Test
	public void loginTC(){
		using(
				homePage = uiInstance
							.getSystemPage()
							.setUsername(admin)
							.and()
							.setPassword(admin)
							.and()
							.signIn(uiInstance)
				)
		.check(homePage.validateWelcome());
		
	}
}
