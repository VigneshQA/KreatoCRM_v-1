package com.kreatocrm.testcases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.kreatocrm.pageobjects.LoginPage;
import com.kreatocrm.utilities.XLUtils;

public class TC_LoginDDT_001 extends BaseClass {

	@Test(dataProvider="LoginData")
	public void loginDDT(String username,String pass) throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.ClearUserName();
		lp.setUserName(username);
		logger.info("user name provided");
		lp.ClearPassword();
		lp.setPassword(pass);
		logger.info("password provided");
		lp.clicklogin();
				
		Thread.sleep(1000);
		
		if(lp.isMutiLogPopPresent()==true)
		lp.clickmultiloginok();
		
		Thread.sleep(5000);
		lp.clickuserinfo();
		lp.clicklogout();
	}
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/kreatocrm/testdata/LoginDetails.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
				
		}
	return logindata;
	}
	
}
