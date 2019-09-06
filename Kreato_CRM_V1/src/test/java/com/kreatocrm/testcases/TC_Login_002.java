package com.kreatocrm.testcases;

import org.testng.annotations.Test;

import com.kreatocrm.pageobjects.LoginPage;

public class TC_Login_002 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseURL);
		lp.setUserName(username);
		lp.setPassword(password);	
		lp.clicklogin();	
		lp.clickuserinfo();
		lp.clicklogout();
		
	}

}
