package com.kreatocrm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kreatocrm.pageobjects.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException{
		logger.info("URL Called");
		
		Thread.sleep(100);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);	
		logger.info("Entered Password");
		lp.clicklogin();
		logger.info("Clicked Login button");
		
		if(driver.getTitle().equals("Home - Navrita Kreato CRM QA")){
			Assert.assertTrue(true);
			logger.info("TC_Login_001 Passed");
		}
		else{
			captureScreen(driver, "TC_Login_001");
			Assert.assertTrue(false);
			logger.info("TC_Login_001 Failed");
		}
				
	}

}
