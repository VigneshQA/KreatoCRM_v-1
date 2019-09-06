package com.kreatocrm.testcases;

import org.testng.annotations.Test;

import com.kreatocrm.pageobjects.LoginPage;

public class TC_Login_003 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		
		lp.clickforgotpass();
		lp.forgotmail(forgotmail);
		lp.clicksubmitfmail();
	}

}
